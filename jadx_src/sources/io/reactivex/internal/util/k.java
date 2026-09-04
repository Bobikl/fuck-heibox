package io.reactivex.internal.util;

/* JADX INFO: compiled from: OpenHashSet.java */
/* JADX INFO: loaded from: classes5.dex */
public final class k<T> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f123877f = -1640531527;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final float f123878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f123879b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f123880c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f123881d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    T[] f123882e;

    public k() {
        this(16, 0.75f);
    }

    public k(int i10) {
        this(i10, 0.75f);
    }

    public k(int i10, float f10) {
        this.f123878a = f10;
        int iB = l.b(i10);
        this.f123879b = iB - 1;
        this.f123881d = (int) (f10 * iB);
        this.f123882e = (T[]) new Object[iB];
    }

    static int c(int i10) {
        int i11 = i10 * f123877f;
        return i11 ^ (i11 >>> 16);
    }

    public boolean a(T t10) {
        T t11;
        T[] tArr = this.f123882e;
        int i10 = this.f123879b;
        int iC = c(t10.hashCode()) & i10;
        T t12 = tArr[iC];
        if (t12 != null) {
            if (t12.equals(t10)) {
                return false;
            }
            do {
                iC = (iC + 1) & i10;
                t11 = tArr[iC];
                if (t11 == null) {
                }
            } while (!t11.equals(t10));
            return false;
        }
        tArr[iC] = t10;
        int i11 = this.f123880c + 1;
        this.f123880c = i11;
        if (i11 >= this.f123881d) {
            d();
        }
        return true;
    }

    public Object[] b() {
        return this.f123882e;
    }

    void d() {
        T t10;
        T[] tArr = this.f123882e;
        int length = tArr.length;
        int i10 = length << 1;
        int i11 = i10 - 1;
        T[] tArr2 = (T[]) new Object[i10];
        int i12 = this.f123880c;
        while (true) {
            int i13 = i12 - 1;
            if (i12 == 0) {
                this.f123879b = i11;
                this.f123881d = (int) (i10 * this.f123878a);
                this.f123882e = tArr2;
                return;
            }
            do {
                length--;
                t10 = tArr[length];
            } while (t10 == null);
            int iC = c(t10.hashCode()) & i11;
            if (tArr2[iC] != null) {
                do {
                    iC = (iC + 1) & i11;
                } while (tArr2[iC] != null);
            }
            tArr2[iC] = tArr[length];
            i12 = i13;
        }
    }

    public boolean e(T t10) {
        T t11;
        T[] tArr = this.f123882e;
        int i10 = this.f123879b;
        int iC = c(t10.hashCode()) & i10;
        T t12 = tArr[iC];
        if (t12 == null) {
            return false;
        }
        if (t12.equals(t10)) {
            return f(iC, tArr, i10);
        }
        do {
            iC = (iC + 1) & i10;
            t11 = tArr[iC];
            if (t11 == null) {
                return false;
            }
        } while (!t11.equals(t10));
        return f(iC, tArr, i10);
    }

    boolean f(int i10, T[] tArr, int i11) {
        int i12;
        T t10;
        this.f123880c--;
        while (true) {
            int i13 = i10 + 1;
            while (true) {
                i12 = i13 & i11;
                t10 = tArr[i12];
                if (t10 != null) {
                    int iC = c(t10.hashCode()) & i11;
                    if (i10 > i12) {
                        if (i10 >= iC && iC > i12) {
                            break;
                        }
                        i13 = i12 + 1;
                    } else {
                        if (i10 >= iC || iC > i12) {
                            break;
                        }
                        i13 = i12 + 1;
                    }
                } else {
                    tArr[i10] = null;
                    return true;
                }
            }
            tArr[i10] = t10;
            i10 = i12;
        }
    }

    public int g() {
        return this.f123880c;
    }
}
