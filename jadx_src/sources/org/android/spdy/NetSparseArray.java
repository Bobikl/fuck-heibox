package org.android.spdy;

/* JADX INFO: loaded from: classes5.dex */
public class NetSparseArray<E> implements Cloneable {
    private static final Object DELETED = new Object();
    private boolean mGarbage;
    private int[] mKeys;
    private int mSize;
    private Object[] mValues;

    public NetSparseArray() {
        this(10);
    }

    public NetSparseArray(int i10) {
        this.mGarbage = false;
        this.mKeys = new int[i10];
        this.mValues = new Object[i10];
        this.mSize = 0;
    }

    private static int binarySearch(int[] iArr, int i10, int i11, int i12) {
        int i13 = i11 + i10;
        int i14 = i10 - 1;
        int i15 = i13;
        while (i15 - i14 > 1) {
            int i16 = (i15 + i14) / 2;
            if (iArr[i16] < i12) {
                i14 = i16;
            } else {
                i15 = i16;
            }
        }
        if (i15 == i13) {
            return ~i13;
        }
        return iArr[i15] == i12 ? i15 : ~i15;
    }

    private void gc() {
        int i10 = this.mSize;
        int[] iArr = this.mKeys;
        Object[] objArr = this.mValues;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (obj != DELETED) {
                if (i12 != i11) {
                    iArr[i11] = iArr[i12];
                    objArr[i11] = obj;
                    objArr[i12] = null;
                }
                i11++;
            }
        }
        this.mGarbage = false;
        this.mSize = i11;
    }

    public void append(int i10, E e10) {
        int i11 = this.mSize;
        if (i11 != 0 && i10 <= this.mKeys[i11 - 1]) {
            put(i10, e10);
            return;
        }
        if (this.mGarbage && i11 >= this.mKeys.length) {
            gc();
        }
        int i12 = this.mSize;
        int[] iArr = this.mKeys;
        if (i12 >= iArr.length) {
            int i13 = i12 + 1;
            int[] iArr2 = new int[i13];
            Object[] objArr = new Object[i13];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            Object[] objArr2 = this.mValues;
            System.arraycopy(objArr2, 0, objArr, 0, objArr2.length);
            this.mKeys = iArr2;
            this.mValues = objArr;
        }
        this.mKeys[i12] = i10;
        this.mValues[i12] = e10;
        this.mSize = i12 + 1;
    }

    public void clear() {
        int i10 = this.mSize;
        Object[] objArr = this.mValues;
        for (int i11 = 0; i11 < i10; i11++) {
            objArr[i11] = null;
        }
        this.mSize = 0;
        this.mGarbage = false;
    }

    public void delete(int i10) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, i10);
        if (iBinarySearch >= 0) {
            Object[] objArr = this.mValues;
            Object obj = objArr[iBinarySearch];
            Object obj2 = DELETED;
            if (obj != obj2) {
                objArr[iBinarySearch] = obj2;
                this.mGarbage = true;
            }
        }
    }

    public E get(int i10) {
        return get(i10, null);
    }

    public E get(int i10, E e10) {
        E e11;
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, i10);
        return (iBinarySearch < 0 || (e11 = (E) this.mValues[iBinarySearch]) == DELETED) ? e10 : e11;
    }

    public int indexOfKey(int i10) {
        if (this.mGarbage) {
            gc();
        }
        return binarySearch(this.mKeys, 0, this.mSize, i10);
    }

    public int indexOfValue(E e10) {
        if (this.mGarbage) {
            gc();
        }
        for (int i10 = 0; i10 < this.mSize; i10++) {
            if (this.mValues[i10] == e10) {
                return i10;
            }
        }
        return -1;
    }

    public int keyAt(int i10) {
        if (this.mGarbage) {
            gc();
        }
        return this.mKeys[i10];
    }

    public void put(int i10, E e10) {
        int iBinarySearch = binarySearch(this.mKeys, 0, this.mSize, i10);
        if (iBinarySearch >= 0) {
            this.mValues[iBinarySearch] = e10;
            return;
        }
        int i11 = ~iBinarySearch;
        int i12 = this.mSize;
        if (i11 < i12) {
            Object[] objArr = this.mValues;
            if (objArr[i11] == DELETED) {
                this.mKeys[i11] = i10;
                objArr[i11] = e10;
                return;
            }
        }
        if (this.mGarbage && i12 >= this.mKeys.length) {
            gc();
            i11 = ~binarySearch(this.mKeys, 0, this.mSize, i10);
        }
        int i13 = this.mSize;
        int[] iArr = this.mKeys;
        if (i13 >= iArr.length) {
            int i14 = i13 + 20;
            int[] iArr2 = new int[i14];
            Object[] objArr2 = new Object[i14];
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            Object[] objArr3 = this.mValues;
            System.arraycopy(objArr3, 0, objArr2, 0, objArr3.length);
            this.mKeys = iArr2;
            this.mValues = objArr2;
        }
        int i15 = this.mSize;
        if (i15 - i11 != 0) {
            int[] iArr3 = this.mKeys;
            int i16 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i16, i15 - i11);
            Object[] objArr4 = this.mValues;
            System.arraycopy(objArr4, i11, objArr4, i16, this.mSize - i11);
        }
        this.mKeys[i11] = i10;
        this.mValues[i11] = e10;
        this.mSize++;
    }

    public void remove(int i10) {
        delete(i10);
    }

    public void removeAt(int i10) {
        Object[] objArr = this.mValues;
        Object obj = objArr[i10];
        Object obj2 = DELETED;
        if (obj != obj2) {
            objArr[i10] = obj2;
            this.mGarbage = true;
        }
    }

    public void setValueAt(int i10, E e10) {
        if (this.mGarbage) {
            gc();
        }
        this.mValues[i10] = e10;
    }

    public int size() {
        if (this.mGarbage) {
            gc();
        }
        return this.mSize;
    }

    public void toArray(E[] eArr) {
        for (int i10 = 0; i10 < eArr.length; i10++) {
            eArr[i10] = this.mValues[i10];
        }
    }

    public E valueAt(int i10) {
        if (this.mGarbage) {
            gc();
        }
        return (E) this.mValues[i10];
    }
}
