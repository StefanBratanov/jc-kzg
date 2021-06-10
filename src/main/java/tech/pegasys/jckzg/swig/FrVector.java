/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 4.0.2
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package tech.pegasys.jckzg.swig;

public class FrVector extends java.util.AbstractList<Fr> implements java.util.RandomAccess {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected FrVector(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(FrVector obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  @SuppressWarnings("deprecation")
  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        CKzgJNI.delete_FrVector(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public FrVector(Fr[] initialElements) {
    this();
    reserve(initialElements.length);

    for (Fr element : initialElements) {
      add(element);
    }
  }

  public FrVector(Iterable<Fr> initialElements) {
    this();
    for (Fr element : initialElements) {
      add(element);
    }
  }

  public Fr get(int index) {
    return doGet(index);
  }

  public Fr set(int index, Fr e) {
    return doSet(index, e);
  }

  public boolean add(Fr e) {
    modCount++;
    doAdd(e);
    return true;
  }

  public void add(int index, Fr e) {
    modCount++;
    doAdd(index, e);
  }

  public Fr remove(int index) {
    modCount++;
    return doRemove(index);
  }

  protected void removeRange(int fromIndex, int toIndex) {
    modCount++;
    doRemoveRange(fromIndex, toIndex);
  }

  public int size() {
    return doSize();
  }

  public FrVector() {
    this(CKzgJNI.new_FrVector__SWIG_0(), true);
  }

  public FrVector(FrVector other) {
    this(CKzgJNI.new_FrVector__SWIG_1(FrVector.getCPtr(other), other), true);
  }

  public long capacity() {
    return CKzgJNI.FrVector_capacity(swigCPtr, this);
  }

  public void reserve(long n) {
    CKzgJNI.FrVector_reserve(swigCPtr, this, n);
  }

  public boolean isEmpty() {
    return CKzgJNI.FrVector_isEmpty(swigCPtr, this);
  }

  public void clear() {
    CKzgJNI.FrVector_clear(swigCPtr, this);
  }

  public FrVector(int count, Fr value) {
    this(CKzgJNI.new_FrVector__SWIG_2(count, Fr.getCPtr(value), value), true);
  }

  private int doSize() {
    return CKzgJNI.FrVector_doSize(swigCPtr, this);
  }

  private void doAdd(Fr x) {
    CKzgJNI.FrVector_doAdd__SWIG_0(swigCPtr, this, Fr.getCPtr(x), x);
  }

  private void doAdd(int index, Fr x) {
    CKzgJNI.FrVector_doAdd__SWIG_1(swigCPtr, this, index, Fr.getCPtr(x), x);
  }

  private Fr doRemove(int index) {
    return new Fr(CKzgJNI.FrVector_doRemove(swigCPtr, this, index), true);
  }

  private Fr doGet(int index) {
    return new Fr(CKzgJNI.FrVector_doGet(swigCPtr, this, index), false);
  }

  private Fr doSet(int index, Fr val) {
    return new Fr(CKzgJNI.FrVector_doSet(swigCPtr, this, index, Fr.getCPtr(val), val), true);
  }

  private void doRemoveRange(int fromIndex, int toIndex) {
    CKzgJNI.FrVector_doRemoveRange(swigCPtr, this, fromIndex, toIndex);
  }

}