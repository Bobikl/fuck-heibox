package com.google.common.collect;

import java.util.Arrays;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ObjectCountHashMap.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true, serializable = true)
@u
public class v1<K> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f58189i = 1073741824;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final float f58190j = 1.0f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f58191k = 4294967295L;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f58192l = -4294967296L;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f58193m = 3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    static final int f58194n = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    transient Object[] f58195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    transient int[] f58196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    transient int f58197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient int f58198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient int[] f58199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @o9.d
    transient long[] f58200f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient float f58201g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int f58202h;

    /* JADX INFO: compiled from: ObjectCountHashMap.java */
    public class a extends Multisets.f<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @x1
        final K f58203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f58204c;

        a(int i10) {
            this.f58203b = (K) v1.this.f58195a[i10];
            this.f58204c = i10;
        }

        @Override // com.google.common.collect.s1.a
        @x1
        public K a() {
            return this.f58203b;
        }

        @s9.a
        public int b(int i10) {
            c();
            int i11 = this.f58204c;
            if (i11 == -1) {
                v1.this.v(this.f58203b, i10);
                return 0;
            }
            int[] iArr = v1.this.f58196b;
            int i12 = iArr[i11];
            iArr[i11] = i10;
            return i12;
        }

        void c() {
            int i10 = this.f58204c;
            if (i10 == -1 || i10 >= v1.this.D() || !com.google.common.base.s.a(this.f58203b, v1.this.f58195a[this.f58204c])) {
                this.f58204c = v1.this.n(this.f58203b);
            }
        }

        @Override // com.google.common.collect.s1.a
        public int getCount() {
            c();
            int i10 = this.f58204c;
            if (i10 == -1) {
                return 0;
            }
            return v1.this.f58196b[i10];
        }
    }

    v1() {
        o(3, 1.0f);
    }

    v1(int i10) {
        this(i10, 1.0f);
    }

    v1(int i10, float f10) {
        o(i10, f10);
    }

    v1(v1<? extends K> v1Var) {
        o(v1Var.D(), 1.0f);
        int iF = v1Var.f();
        while (iF != -1) {
            v(v1Var.j(iF), v1Var.l(iF));
            iF = v1Var.t(iF);
        }
    }

    private void A(int i10) {
        int length = this.f58200f.length;
        if (i10 > length) {
            int iMax = Math.max(1, length >>> 1) + length;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length) {
                z(iMax);
            }
        }
    }

    private void B(int i10) {
        if (this.f58199e.length >= 1073741824) {
            this.f58202h = Integer.MAX_VALUE;
            return;
        }
        int i11 = ((int) (i10 * this.f58201g)) + 1;
        int[] iArrS = s(i10);
        long[] jArr = this.f58200f;
        int length = iArrS.length - 1;
        for (int i12 = 0; i12 < this.f58197c; i12++) {
            int i13 = i(jArr[i12]);
            int i14 = i13 & length;
            int i15 = iArrS[i14];
            iArrS[i14] = i12;
            jArr[i12] = (((long) i13) << 32) | (((long) i15) & 4294967295L);
        }
        this.f58202h = i11;
        this.f58199e = iArrS;
    }

    private static long E(long j10, int i10) {
        return (j10 & f58192l) | (((long) i10) & 4294967295L);
    }

    static <K> v1<K> c() {
        return new v1<>();
    }

    static <K> v1<K> d(int i10) {
        return new v1<>(i10);
    }

    private static int i(long j10) {
        return (int) (j10 >>> 32);
    }

    private static int k(long j10) {
        return (int) j10;
    }

    private int m() {
        return this.f58199e.length - 1;
    }

    private static long[] r(int i10) {
        long[] jArr = new long[i10];
        Arrays.fill(jArr, -1L);
        return jArr;
    }

    private static int[] s(int i10) {
        int[] iArr = new int[i10];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private int x(@CheckForNull Object obj, int i10) {
        int iM = m() & i10;
        int i11 = this.f58199e[iM];
        if (i11 == -1) {
            return 0;
        }
        int i12 = -1;
        while (true) {
            if (i(this.f58200f[i11]) == i10 && com.google.common.base.s.a(obj, this.f58195a[i11])) {
                int i13 = this.f58196b[i11];
                if (i12 == -1) {
                    this.f58199e[iM] = k(this.f58200f[i11]);
                } else {
                    long[] jArr = this.f58200f;
                    jArr[i12] = E(jArr[i12], k(jArr[i11]));
                }
                q(i11);
                this.f58197c--;
                this.f58198d++;
                return i13;
            }
            int iK = k(this.f58200f[i11]);
            if (iK == -1) {
                return 0;
            }
            i12 = i11;
            i11 = iK;
        }
    }

    void C(int i10, int i11) {
        com.google.common.base.w.C(i10, this.f58197c);
        this.f58196b[i10] = i11;
    }

    int D() {
        return this.f58197c;
    }

    public void a() {
        this.f58198d++;
        Arrays.fill(this.f58195a, 0, this.f58197c, (Object) null);
        Arrays.fill(this.f58196b, 0, this.f58197c, 0);
        Arrays.fill(this.f58199e, -1);
        Arrays.fill(this.f58200f, -1L);
        this.f58197c = 0;
    }

    public boolean b(@CheckForNull Object obj) {
        return n(obj) != -1;
    }

    void e(int i10) {
        if (i10 > this.f58200f.length) {
            z(i10);
        }
        if (i10 >= this.f58202h) {
            B(Math.max(2, Integer.highestOneBit(i10 - 1) << 1));
        }
    }

    int f() {
        return this.f58197c == 0 ? -1 : 0;
    }

    public int g(@CheckForNull Object obj) {
        int iN = n(obj);
        if (iN == -1) {
            return 0;
        }
        return this.f58196b[iN];
    }

    s1.a<K> h(int i10) {
        com.google.common.base.w.C(i10, this.f58197c);
        return new a(i10);
    }

    @x1
    K j(int i10) {
        com.google.common.base.w.C(i10, this.f58197c);
        return (K) this.f58195a[i10];
    }

    int l(int i10) {
        com.google.common.base.w.C(i10, this.f58197c);
        return this.f58196b[i10];
    }

    int n(@CheckForNull Object obj) {
        int iD = i1.d(obj);
        int iK = this.f58199e[m() & iD];
        while (iK != -1) {
            long j10 = this.f58200f[iK];
            if (i(j10) == iD && com.google.common.base.s.a(obj, this.f58195a[iK])) {
                return iK;
            }
            iK = k(j10);
        }
        return -1;
    }

    void o(int i10, float f10) {
        com.google.common.base.w.e(i10 >= 0, "Initial capacity must be non-negative");
        com.google.common.base.w.e(f10 > 0.0f, "Illegal load factor");
        int iA = i1.a(i10, f10);
        this.f58199e = s(iA);
        this.f58201g = f10;
        this.f58195a = new Object[i10];
        this.f58196b = new int[i10];
        this.f58200f = r(i10);
        this.f58202h = Math.max(1, (int) (iA * f10));
    }

    void p(int i10, @x1 K k10, int i11, int i12) {
        this.f58200f[i10] = (((long) i12) << 32) | 4294967295L;
        this.f58195a[i10] = k10;
        this.f58196b[i10] = i11;
    }

    void q(int i10) {
        int iD = D() - 1;
        if (i10 >= iD) {
            this.f58195a[i10] = null;
            this.f58196b[i10] = 0;
            this.f58200f[i10] = -1;
            return;
        }
        Object[] objArr = this.f58195a;
        objArr[i10] = objArr[iD];
        int[] iArr = this.f58196b;
        iArr[i10] = iArr[iD];
        objArr[iD] = null;
        iArr[iD] = 0;
        long[] jArr = this.f58200f;
        long j10 = jArr[iD];
        jArr[i10] = j10;
        jArr[iD] = -1;
        int i11 = i(j10) & m();
        int[] iArr2 = this.f58199e;
        int i12 = iArr2[i11];
        if (i12 == iD) {
            iArr2[i11] = i10;
            return;
        }
        while (true) {
            long j11 = this.f58200f[i12];
            int iK = k(j11);
            if (iK == iD) {
                this.f58200f[i12] = E(j11, i10);
                return;
            }
            i12 = iK;
        }
    }

    int t(int i10) {
        int i11 = i10 + 1;
        if (i11 < this.f58197c) {
            return i11;
        }
        return -1;
    }

    int u(int i10, int i11) {
        return i10 - 1;
    }

    @s9.a
    public int v(@x1 K k10, int i10) {
        n.d(i10, "count");
        long[] jArr = this.f58200f;
        Object[] objArr = this.f58195a;
        int[] iArr = this.f58196b;
        int iD = i1.d(k10);
        int iM = m() & iD;
        int i11 = this.f58197c;
        int[] iArr2 = this.f58199e;
        int i12 = iArr2[iM];
        if (i12 == -1) {
            iArr2[iM] = i11;
        } else {
            while (true) {
                long j10 = jArr[i12];
                if (i(j10) == iD && com.google.common.base.s.a(k10, objArr[i12])) {
                    int i13 = iArr[i12];
                    iArr[i12] = i10;
                    return i13;
                }
                int iK = k(j10);
                if (iK == -1) {
                    jArr[i12] = E(j10, i11);
                    break;
                }
                i12 = iK;
            }
        }
        if (i11 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i14 = i11 + 1;
        A(i14);
        p(i11, k10, i10, iD);
        this.f58197c = i14;
        if (i11 >= this.f58202h) {
            B(this.f58199e.length * 2);
        }
        this.f58198d++;
        return 0;
    }

    @s9.a
    public int w(@CheckForNull Object obj) {
        return x(obj, i1.d(obj));
    }

    @s9.a
    int y(int i10) {
        return x(this.f58195a[i10], i(this.f58200f[i10]));
    }

    void z(int i10) {
        this.f58195a = Arrays.copyOf(this.f58195a, i10);
        this.f58196b = Arrays.copyOf(this.f58196b, i10);
        long[] jArr = this.f58200f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        if (i10 > length) {
            Arrays.fill(jArrCopyOf, length, i10, -1L);
        }
        this.f58200f = jArrCopyOf;
    }
}
