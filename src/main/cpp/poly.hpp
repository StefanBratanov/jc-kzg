extern "C" {
#include "c_kzg.h"
}
#include <vector>
#include "bls12_381.hpp"
#include "exception.hpp"

#ifndef ___POLY_HPP___
#define ___POLY_HPP___

class Poly {
	friend class KZG;
	friend class FFT;
	friend class FK20Single;
	friend class FK20Multi;
private:
	poly _poly;

	Poly() {}
public:

	Poly(const int length) throw(KZGException) {
		CKZG_TRY(new_poly(&_poly, length));
	}

	Poly(std::vector<Fr> coeff) throw(KZGException) {
		CKZG_TRY(new_poly_with_coeffs(&_poly, (fr_t*)&coeff[0], coeff.size()));
	}
	~Poly() {
		free_poly(&_poly);
	}

	Poly* long_div(Poly *divisor) throw(KZGException) {
		Poly* ret = new Poly();
		CKZG_TRY(::new_poly_div(&ret->_poly, &_poly, &divisor->_poly));
		return ret;
	}

	Fr eval(const Fr x) {
		Fr ret;
		eval_poly(&ret.fr, &_poly, &x.fr);
		return ret;
	}

	long long length() {
		return _poly.length;
	}
};

#endif // !___POLY_HPP___
