package com.billy.android.swipe;

import android.graphics.Canvas;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AbsSeekBar;
import com.billy.android.swipe.internal.ScrimView;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: compiled from: SwipeConsumer.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class f {
    public static int F = 150;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final int J = 4;
    public static final int K = 8;
    public static final int L = 3;
    public static final int M = 12;
    public static final int N = 15;
    public static final int O = 0;
    public static final int P = 1;
    public static final int Q = 2;
    public static final int R = 3;
    public static final int S = 4;
    public static final float T = 0.0f;
    public static final float U = 1.0f;
    protected Object A;
    protected Integer B;
    protected int D;
    protected int E;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected SmartSwipeWrapper f40407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f40408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f40409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f40410e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f40411f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f40412g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected int f40413h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected boolean f40414i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f40415j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected int f40416k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected int f40417l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected float f40418m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected volatile boolean f40419n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected com.billy.android.swipe.internal.b f40420o;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected Interpolator f40423r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected int f40424s;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected int f40428w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected q6.b f40430y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected boolean f40431z;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f40421p = 0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f40422q = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f40425t = 1.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected int f40426u = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected final List<r6.b> f40427v = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected float f40429x = 0.0f;
    protected int C = 255;

    /* JADX INFO: compiled from: SwipeConsumer.java */
    public class a extends r6.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f40432a;

        a(int i10) {
            this.f40432a = i10;
        }

        @Override // r6.a, r6.b
        public void d(SmartSwipeWrapper smartSwipeWrapper, f fVar, int i10) {
            f.this.Z1(this.f40432a);
            f.this.s1(this);
        }
    }

    /* JADX INFO: compiled from: SwipeConsumer.java */
    public class b extends r6.a {
        b() {
        }

        @Override // r6.a, r6.b
        public void e(SmartSwipeWrapper smartSwipeWrapper, f fVar, int i10) {
            f.this.Z1(i10);
            f.this.s1(this);
        }
    }

    private f H(int i10, boolean z10) {
        if (z10) {
            this.C = i10 | this.C;
        } else {
            this.C = (~i10) & this.C;
        }
        return this;
    }

    private f z(int i10, boolean z10) {
        if (z10) {
            this.C = (i10 << 4) | this.C;
        } else {
            this.C = (~(i10 << 4)) & this.C;
        }
        return this;
    }

    public f A(boolean z10) {
        return z(15, z10);
    }

    protected boolean A0(int i10, int i11) {
        return (i10 == -2 && !C0(i11)) || (i10 == -3 && !B0(i11));
    }

    public f A1() {
        return q1(false, 1);
    }

    public f B(boolean z10) {
        return z(8, z10);
    }

    public boolean B0(int i10) {
        return ((this.C >> 4) & i10) == i10;
    }

    public f B1(int i10) {
        this.B = Integer.valueOf(i10);
        com.billy.android.swipe.internal.b bVar = this.f40420o;
        if (bVar != null) {
            bVar.J(i10);
        }
        return this;
    }

    public f C(boolean z10) {
        return z(3, z10);
    }

    public boolean C0(int i10) {
        return (this.C & i10) == i10;
    }

    public f C1(int i10) {
        this.f40428w = i10;
        this.f40414i = true;
        return this;
    }

    public f D(boolean z10) {
        return z(1, z10);
    }

    public boolean D0() {
        return U() == 0 && this.f40418m >= 1.0f;
    }

    public f D1(float f10) {
        if (f10 >= 0.0f) {
            this.f40429x = f10;
        }
        return this;
    }

    public f E(boolean z10) {
        return z(2, z10);
    }

    public boolean E0() {
        return (this.f40421p & 2) != 0;
    }

    public f E1(int i10) {
        this.f40426u = i10;
        return this;
    }

    public f F(boolean z10) {
        return z(4, z10);
    }

    public boolean F0() {
        return (this.f40422q & 2) != 0;
    }

    public f F1() {
        return q1(false, 2);
    }

    public f G(boolean z10) {
        return z(12, z10);
    }

    public boolean G0() {
        return this.f40419n;
    }

    public f G1(float f10) {
        if (f10 > 0.0f) {
            this.f40425t = f10;
            com.billy.android.swipe.internal.b bVar = this.f40420o;
            if (bVar != null) {
                bVar.L(f10);
            }
        }
        return this;
    }

    public boolean H0() {
        return (this.f40421p & 4) != 0;
    }

    public f H1(q6.b bVar) {
        this.f40430y = bVar;
        return this;
    }

    public f I(boolean z10) {
        return H(15, z10);
    }

    public boolean I0() {
        return (this.f40422q & 4) != 0;
    }

    public f I1(Object obj) {
        this.A = obj;
        return this;
    }

    public f J(boolean z10) {
        return H(8, z10);
    }

    public boolean J0() {
        return (this.f40408c & 12) > 0;
    }

    public f J1() {
        return q1(false, 4);
    }

    public f K(boolean z10) {
        return H(3, z10);
    }

    public boolean K0() {
        return (this.f40421p & 12) == 12;
    }

    public f K1(int i10) {
        this.D = i10;
        return this;
    }

    public f L(boolean z10) {
        return H(1, z10);
    }

    public boolean L0() {
        return (this.f40422q & 12) == 12;
    }

    public f L1(boolean z10, float f10) {
        int iE = (int) (this.f40413h * com.billy.android.swipe.b.e(f10, 0.0f, 1.0f));
        int i10 = this.f40408c;
        int i11 = 0;
        if (i10 != 1) {
            if (i10 == 2) {
                iE = -iE;
            } else if (i10 == 4) {
                i11 = iE;
                iE = 0;
            } else if (i10 != 8) {
                iE = 0;
            } else {
                iE = -iE;
                i11 = iE;
                iE = 0;
            }
        }
        if (z10) {
            S1(iE, i11);
        } else {
            T1(iE, i11, iE, i11);
        }
        return this;
    }

    public f M(boolean z10) {
        return H(2, z10);
    }

    public boolean M0(View view, int i10, int i11) {
        return view != null && i10 >= view.getLeft() && i10 < view.getRight() && i11 >= view.getTop() && i11 < view.getBottom();
    }

    public f M1() {
        return q1(true, 8);
    }

    public f N(boolean z10) {
        return H(4, z10);
    }

    public f N0() {
        return P0(15);
    }

    public f N1() {
        return j(true);
    }

    public f O(boolean z10) {
        return H(12, z10);
    }

    public f O0() {
        return P0(8);
    }

    public f O1() {
        return q1(true, 1);
    }

    public f P() {
        return v(2);
    }

    public f P0(int i10) {
        this.f40422q = i10 | this.f40422q;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x004c  */
    protected void P1(float f10, float f11) {
        int i10 = this.f40408c;
        boolean z10 = true;
        boolean z11 = false;
        if (i10 == 1) {
            if (f10 <= 0.0f && (f10 != 0.0f || this.f40418m <= 0.5f)) {
                z10 = false;
            }
            z11 = z10;
        } else if (i10 == 2) {
            if (f10 >= 0.0f && (f10 != 0.0f || this.f40418m <= 0.5f)) {
                z10 = false;
            }
            z11 = z10;
        } else if (i10 == 4) {
            if (f11 <= 0.0f && (f11 != 0.0f || this.f40418m <= 0.5f)) {
                z10 = false;
            }
            z11 = z10;
        } else if (i10 == 8) {
            if (f11 >= 0.0f && (f11 != 0.0f || this.f40418m <= 0.5f)) {
                z10 = false;
            }
            z11 = z10;
        }
        R1(z11 ? 1.0f : 0.0f);
    }

    public f Q() {
        return v(4);
    }

    public f Q0(int i10, boolean z10) {
        return z10 ? P0(i10) : Z1(i10);
    }

    public f Q1() {
        return q1(true, 2);
    }

    public f R() {
        return v(12);
    }

    public f R0() {
        return P0(3);
    }

    public f R1(float f10) {
        L1(true, f10);
        return this;
    }

    public View S(ViewGroup viewGroup, int i10, int i11) {
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = viewGroup.getChildAt(childCount);
            if (i10 >= childAt.getLeft() && i10 < childAt.getRight() && i11 >= childAt.getTop() && i11 < childAt.getBottom() && childAt.getVisibility() == 0 && (!(childAt instanceof ScrimView) || childAt.isFocusable() || childAt.isClickable())) {
                return childAt;
            }
        }
        return null;
    }

    public f S0() {
        return P0(1);
    }

    public void S1(int i10, int i11) {
        com.billy.android.swipe.internal.b bVar = this.f40420o;
        if (bVar == null || this.f40407b == null) {
            return;
        }
        bVar.P(i10, i11);
        com.billy.android.swipe.internal.d.i(this.f40407b);
    }

    public int T() {
        return this.f40408c;
    }

    public f T0() {
        return P0(2);
    }

    public void T1(int i10, int i11, int i12, int i13) {
        com.billy.android.swipe.internal.b bVar = this.f40420o;
        if (bVar == null || this.f40407b == null) {
            return;
        }
        bVar.Q(i10, i11, i12, i13);
        com.billy.android.swipe.internal.d.i(this.f40407b);
    }

    public int U() {
        return this.f40420o.t();
    }

    public f U0() {
        return P0(4);
    }

    public f U1() {
        return q1(true, 4);
    }

    public int V() {
        return this.f40424s;
    }

    public f V0() {
        return P0(12);
    }

    public boolean V1(int i10, float f10, float f11, float f12, float f13) {
        int iE = e(i10, f10, f11, f12, f13);
        boolean z10 = iE != 0;
        if (z10) {
            this.f40408c = iE;
        }
        return z10;
    }

    public int W() {
        return this.E;
    }

    protected void W0() {
        for (r6.b bVar : this.f40427v) {
            if (bVar != null) {
                bVar.b(this.f40407b, this);
            }
        }
    }

    public boolean W1(int i10, float f10, float f11) {
        if (A0(i10, this.f40408c)) {
            return false;
        }
        return ((this.f40431z && U() == 2) || !s0(this.f40408c) || t0(this.f40408c)) ? false : true;
    }

    public int X(float f10, float f11) {
        if (this.f40411f != 0 || ((f10 > 0.0f && y0() && !z0()) || (f10 < 0.0f && E0() && !F0()))) {
            return h0();
        }
        return 0;
    }

    protected void X0() {
        for (r6.b bVar : this.f40427v) {
            if (bVar != null) {
                bVar.g(this.f40407b, this);
            }
        }
    }

    public f X1() {
        return Z1(15);
    }

    public Interpolator Y() {
        return this.f40423r;
    }

    protected void Y0() {
        for (r6.b bVar : this.f40427v) {
            if (bVar != null) {
                bVar.e(this.f40407b, this, this.f40408c);
            }
        }
    }

    public f Y1() {
        return Z1(8);
    }

    public Integer Z() {
        com.billy.android.swipe.internal.b bVar = this.f40420o;
        return bVar != null ? Integer.valueOf(bVar.u()) : this.B;
    }

    protected void Z0() {
        for (r6.b bVar : this.f40427v) {
            if (bVar != null) {
                bVar.d(this.f40407b, this, this.f40408c);
            }
        }
    }

    public f Z1(int i10) {
        this.f40422q = (~i10) & this.f40422q;
        return this;
    }

    public <T extends f> T a(T t10) {
        SmartSwipeWrapper smartSwipeWrapper = this.f40407b;
        return smartSwipeWrapper != null ? (T) smartSwipeWrapper.addConsumer(t10) : t10;
    }

    public int a0() {
        return this.f40428w;
    }

    protected void a1(boolean z10) {
        for (r6.b bVar : this.f40427v) {
            if (bVar != null) {
                bVar.a(this.f40407b, this, this.f40408c, z10, this.f40418m);
            }
        }
    }

    public f a2() {
        return Z1(3);
    }

    public f b(r6.b bVar) {
        if (bVar != null && !this.f40427v.contains(bVar)) {
            this.f40427v.add(bVar);
            SmartSwipeWrapper smartSwipeWrapper = this.f40407b;
            if (smartSwipeWrapper != null) {
                bVar.b(smartSwipeWrapper, this);
            }
        }
        return this;
    }

    public float b0() {
        return this.f40429x;
    }

    protected void b1(float f10, float f11) {
        for (r6.b bVar : this.f40427v) {
            if (bVar != null) {
                bVar.h(this.f40407b, this, this.f40408c, this.f40418m, f10, f11);
            }
        }
    }

    public f b2() {
        return Z1(1);
    }

    public f c(g gVar) {
        if (gVar != null) {
            gVar.b(this);
        }
        return this;
    }

    public float c0() {
        return this.f40418m;
    }

    protected void c1() {
        for (r6.b bVar : this.f40427v) {
            if (bVar != null) {
                bVar.f(this.f40407b, this, this.f40408c);
            }
        }
    }

    public f c2() {
        return Z1(2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T extends f> T d(Class<T> cls) {
        return this;
    }

    public int d0() {
        return this.f40426u;
    }

    protected void d1(int i10) {
        for (r6.b bVar : this.f40427v) {
            if (bVar != null) {
                bVar.c(this.f40407b, this, i10, this.f40408c, this.f40418m);
            }
        }
    }

    public f d2() {
        return Z1(4);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0084  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00df  */
    /* JADX WARN: Code duplicated, block: B:87:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:91:0x0101  */
    public int e(int i10, float f10, float f11, float f12, float f13) {
        int i11;
        int i12;
        int i13;
        int i14 = 4;
        if (this.f40408c == 0 && ((i10 == -2 && (this.C & 15) == 0) || (i10 == -3 && ((this.C >> 4) & 15) == 0))) {
            return 0;
        }
        float fAbs = Math.abs(f12);
        float fAbs2 = Math.abs(f13);
        if (this.f40411f != 0 || this.f40412g != 0) {
            if (f12 == 0.0f && f13 == 0.0f) {
                return 0;
            }
            int i15 = this.f40408c;
            if ((((i15 & 3) <= 0 || fAbs <= fAbs2) && ((i15 & 12) <= 0 || fAbs >= fAbs2)) || t0(i15) || A0(i10, this.f40408c) || f(this.f40407b, this.f40408c, i10, f10, f11, f12, f13)) {
                return 0;
            }
            return this.f40408c;
        }
        int iF = 1;
        if (fAbs == 0.0f && fAbs2 == 0.0f) {
            if (this.f40424s <= 0) {
                i14 = 0;
                iF = 0;
            } else if (y0() && f10 <= this.f40424s) {
                i14 = 1;
            } else if (E0() && f10 >= this.D - this.f40424s) {
                i14 = 2;
            } else if (!H0() || f11 > this.f40424s) {
                if (!p0() || f11 < this.E - this.f40424s) {
                    i14 = 0;
                    iF = 0;
                } else {
                    i14 = 8;
                }
            }
        } else if (fAbs > fAbs2) {
            if (f12 <= 0.0f || !y0()) {
                if (f12 < 0.0f && E0()) {
                    i11 = 2;
                    i12 = 1;
                    if (i12 == 0) {
                        iF = i12;
                    } else {
                        i13 = this.f40424s;
                        if (i13 > 0) {
                            iF = 1 ^ f(this.f40407b, i11, i10, f10, f11, f12, f13);
                        } else if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 4) {
                                    if (i11 != 8) {
                                        iF = i12;
                                    } else if (f11 < this.E - i13) {
                                        iF = 0;
                                    }
                                } else if (f11 > i13) {
                                    iF = 0;
                                }
                            } else if (f10 < this.D - i13) {
                                iF = 0;
                            }
                        } else if (f10 > i13) {
                            iF = 0;
                        }
                    }
                    i14 = i11;
                }
                i12 = 0;
            } else {
                i12 = 1;
            }
            i11 = i12;
            if (i12 == 0) {
                iF = i12;
            } else {
                i13 = this.f40424s;
                if (i13 > 0) {
                    iF = 1 ^ f(this.f40407b, i11, i10, f10, f11, f12, f13);
                } else if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 4) {
                            if (i11 != 8) {
                                iF = i12;
                            } else if (f11 < this.E - i13) {
                                iF = 0;
                            }
                        } else if (f11 > i13) {
                            iF = 0;
                        }
                    } else if (f10 < this.D - i13) {
                        iF = 0;
                    }
                } else if (f10 > i13) {
                    iF = 0;
                }
            }
            i14 = i11;
        } else {
            if (f13 <= 0.0f || !H0()) {
                if (f13 < 0.0f && p0()) {
                    i11 = 8;
                }
                i12 = 0;
                i11 = i12;
                if (i12 == 0) {
                    iF = i12;
                } else {
                    i13 = this.f40424s;
                    if (i13 > 0) {
                        iF = 1 ^ f(this.f40407b, i11, i10, f10, f11, f12, f13);
                    } else if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 != 4) {
                                if (i11 != 8) {
                                    iF = i12;
                                } else if (f11 < this.E - i13) {
                                    iF = 0;
                                }
                            } else if (f11 > i13) {
                                iF = 0;
                            }
                        } else if (f10 < this.D - i13) {
                            iF = 0;
                        }
                    } else if (f10 > i13) {
                        iF = 0;
                    }
                }
                i14 = i11;
            } else {
                i11 = 4;
            }
            i12 = 1;
            if (i12 == 0) {
                iF = i12;
            } else {
                i13 = this.f40424s;
                if (i13 > 0) {
                    iF = 1 ^ f(this.f40407b, i11, i10, f10, f11, f12, f13);
                } else if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 4) {
                            if (i11 != 8) {
                                iF = i12;
                            } else if (f11 < this.E - i13) {
                                iF = 0;
                            }
                        } else if (f11 > i13) {
                            iF = 0;
                        }
                    } else if (f10 < this.D - i13) {
                        iF = 0;
                    }
                } else if (f10 > i13) {
                    iF = 0;
                }
            }
            i14 = i11;
        }
        if (iF == 0) {
            return 0;
        }
        if (i10 == -3 && B0(i14)) {
            return i14;
        }
        if (t0(i14) || A0(i10, i14)) {
            return 0;
        }
        return i14;
    }

    public float e0() {
        return this.f40425t;
    }

    public void e1(SmartSwipeWrapper smartSwipeWrapper, com.billy.android.swipe.internal.b bVar) {
        this.f40407b = smartSwipeWrapper;
        if (this.f40428w == 0) {
            this.f40428w = com.billy.android.swipe.b.b(F, smartSwipeWrapper.getContext());
        }
        this.f40420o = bVar;
        Integer num = this.B;
        if (num != null) {
            bVar.J(num.intValue());
        }
        if (this.f40407b.isInflateFromXml()) {
            m0();
        }
        W0();
    }

    public f e2() {
        return Z1(12);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003c A[EDGE_INSN: B:12:0x003c->B:55:0x00be BREAK  A[LOOP:0: B:14:0x0047->B:64:0x0047]] */
    protected boolean f(ViewGroup viewGroup, int i10, int i11, float f10, float f11, float f12, float f13) {
        f fVarW;
        View viewS = S(viewGroup, (int) f10, (int) f11);
        boolean zCanScrollHorizontally = false;
        if (viewS instanceof SmartSwipeWrapper) {
            SmartSwipeWrapper smartSwipeWrapper = (SmartSwipeWrapper) viewS;
            com.billy.android.swipe.internal.b bVar = smartSwipeWrapper.mHelper;
            if (bVar != null && (fVarW = bVar.w()) != null) {
                if (fVarW.e(i11, f10, f11, f12, f13) != 0 && fVarW.c0() < 1.0f) {
                    zCanScrollHorizontally = true;
                    break;
                }
            } else {
                for (f fVar : smartSwipeWrapper.getAllConsumers()) {
                    if (fVar != null && fVar.e(i11, f10, f11, f12, f13) != 0) {
                        zCanScrollHorizontally = true;
                        break;
                    }
                }
            }
        } else if (viewS != null) {
            if (i10 == 1 || i10 == 2) {
                if (viewS instanceof AbsSeekBar) {
                    AbsSeekBar absSeekBar = (AbsSeekBar) viewS;
                    int progress = absSeekBar.getProgress();
                    int min = Build.VERSION.SDK_INT >= 26 ? absSeekBar.getMin() : 0;
                    int max = absSeekBar.getMax();
                    if ((f12 > 0.0f && progress < max) || (f12 < 0.0f && progress > min)) {
                        zCanScrollHorizontally = true;
                        break;
                    }
                } else {
                    zCanScrollHorizontally = viewS.canScrollHorizontally(f12 > 0.0f ? -1 : 1);
                }
            } else if (i10 == 4 || i10 == 8) {
                int i12 = f13 > 0.0f ? -1 : 1;
                zCanScrollHorizontally = viewS instanceof AbsListView ? com.billy.android.swipe.internal.d.a((AbsListView) viewS, i12) : viewS.canScrollVertically(i12);
            }
        }
        return (zCanScrollHorizontally || !(viewS instanceof ViewGroup)) ? zCanScrollHorizontally : f((ViewGroup) viewS, i10, i11, f10 - viewS.getLeft(), f11 - viewS.getTop(), f12, f13);
    }

    public q6.b f0() {
        return this.f40430y;
    }

    protected void f1() {
        Y0();
        this.f40408c = 0;
    }

    public int g(int i10, int i11) {
        int i12 = this.f40409d;
        if (i12 != 0) {
            i10 += i12;
            this.f40409d = 0;
        }
        if ((this.f40408c & 1) > 0 && y0()) {
            return com.billy.android.swipe.b.f(i10, 0, this.f40415j);
        }
        if ((this.f40408c & 2) <= 0 || !E0()) {
            return 0;
        }
        return com.billy.android.swipe.b.f(i10, -this.f40415j, 0);
    }

    public com.billy.android.swipe.internal.b g0() {
        return this.f40420o;
    }

    public void g1() {
        X0();
        t1();
    }

    public int h(int i10, int i11) {
        int i12 = this.f40410e;
        if (i12 != 0) {
            i10 += i12;
            this.f40410e = 0;
        }
        if ((this.f40408c & 4) > 0 && H0()) {
            return com.billy.android.swipe.b.f(i10, 0, this.f40415j);
        }
        if ((this.f40408c & 8) <= 0 || !p0()) {
            return 0;
        }
        return com.billy.android.swipe.b.f(i10, -this.f40415j, 0);
    }

    public int h0() {
        q6.b bVar = this.f40430y;
        return bVar != null ? bVar.a(this.f40428w) : this.f40428w;
    }

    protected abstract void h1(int i10, int i11, int i12, int i13);

    public f i() {
        return j(false);
    }

    public Object i0() {
        return this.A;
    }

    public void i1(Canvas canvas) {
    }

    public f j(boolean z10) {
        if (this.f40408c != 0 && this.f40418m != 0.0f) {
            n1(0, true, 0.0f, 0.0f);
            this.f40409d = 0;
            this.f40410e = 0;
            if (!t0(this.f40408c)) {
                P0(this.f40408c);
                b(new b());
            }
            if (z10) {
                S1(0, 0);
            } else {
                T1(0, 0, 0, 0);
            }
        }
        return this;
    }

    public int j0(float f10, float f11) {
        if (this.f40412g != 0 || ((f11 > 0.0f && H0() && !I0()) || (f11 < 0.0f && p0() && !q0()))) {
            return h0();
        }
        return 0;
    }

    public boolean j1(boolean z10, int i10, int i11, int i12, int i13) {
        return false;
    }

    public f k() {
        return m(15);
    }

    public int k0() {
        return this.D;
    }

    public void k1(int i10, int i11) {
        this.D = this.f40407b.getMeasuredWidth();
        this.E = this.f40407b.getMeasuredHeight();
    }

    public f l() {
        return m(8);
    }

    public SmartSwipeWrapper l0() {
        return this.f40407b;
    }

    protected void l1() {
        Z0();
    }

    public f m(int i10) {
        if ((this.f40408c & i10) != 0) {
            i();
        }
        this.f40421p = (~i10) & this.f40421p;
        return this;
    }

    protected void m0() {
    }

    public void m1(int i10) {
        d1(i10);
        if (i10 == 0) {
            this.f40419n = false;
            float f10 = this.f40418m;
            if (f10 >= 1.0f) {
                l1();
            } else if (f10 <= 0.0f) {
                f1();
            }
        }
    }

    public f n() {
        return m(3);
    }

    public boolean n0() {
        return (this.f40421p & 15) == 15;
    }

    public void n1(int i10, boolean z10, float f10, float f11) {
        this.f40419n = true;
        ViewParent parent = this.f40407b.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        int i11 = this.f40411f;
        if (i11 != 0 || this.f40412g != 0) {
            this.f40409d = i11;
            this.f40410e = this.f40412g;
        }
        int iH0 = h0();
        this.f40413h = iH0;
        float f12 = this.f40429x;
        if (f12 > 0.0f) {
            this.f40415j = (int) (iH0 * (f12 + 1.0f));
        } else {
            this.f40415j = iH0;
        }
        c1();
    }

    public f o() {
        return m(1);
    }

    public boolean o0() {
        return (this.f40422q & 15) == 15;
    }

    public void o1(int i10, int i11, int i12, int i13) {
        if (a0() <= 0) {
            return;
        }
        float f10 = this.f40418m;
        if (i10 != this.f40411f || i11 != this.f40412g) {
            this.f40411f = i10;
            this.f40412g = i11;
            int i14 = this.f40413h;
            if (i14 <= 0) {
                this.f40418m = 0.0f;
            } else {
                int i15 = this.f40408c;
                if (i15 == 1 || i15 == 2) {
                    this.f40418m = Math.abs(i10 / i14);
                } else if (i15 == 4 || i15 == 8) {
                    this.f40418m = Math.abs(i11 / i14);
                }
            }
            int i16 = this.f40408c;
            if ((i16 & 3) > 0) {
                q6.b bVar = this.f40430y;
                if (bVar != null) {
                    i10 = bVar.b(i10, this.f40418m);
                }
                i12 = i10 - this.f40416k;
                this.f40416k = i10;
                i13 = 0;
            } else if ((i16 & 12) > 0) {
                q6.b bVar2 = this.f40430y;
                if (bVar2 != null) {
                    i11 = bVar2.b(i11, this.f40418m);
                }
                i13 = i11 - this.f40417l;
                this.f40417l = i11;
                i12 = 0;
            }
            h1(this.f40416k, this.f40417l, i12, i13);
        }
        if (this.f40418m != f10) {
            a1(U() == 2);
        }
    }

    public f p() {
        return m(2);
    }

    public boolean p0() {
        return (this.f40421p & 8) != 0;
    }

    public void p1(float f10, float f11) {
        ViewParent parent = this.f40407b.getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        b1(f10, f11);
        float f12 = this.f40418m;
        if (f12 >= 1.0f && (this.f40426u & 4) == 4) {
            R1(1.0f);
            return;
        }
        int i10 = this.f40426u & 3;
        if (i10 == 1) {
            if (f12 >= 1.0f) {
                l1();
            }
            R1(0.0f);
        } else if (i10 == 2) {
            R1(1.0f);
        } else {
            if (i10 != 3) {
                return;
            }
            P1(f10, f11);
        }
    }

    public f q() {
        return m(4);
    }

    public boolean q0() {
        return (this.f40422q & 8) != 0;
    }

    public f q1(boolean z10, int i10) {
        int i11 = this.f40408c;
        if (i11 != 0) {
            if (i11 == i10 && this.f40418m != 1.0f) {
            }
            return this;
        }
        if (!s0(i10)) {
            return this;
        }
        this.f40408c = i10;
        n1(0, true, 0.0f, 0.0f);
        if (!t0(this.f40408c)) {
            int i12 = this.f40408c;
            P0(i12);
            b(new a(i12));
        }
        L1(z10, 1.0f);
        return this;
    }

    public f r() {
        return m(12);
    }

    public boolean r0() {
        return U() == 0 && this.f40418m <= 0.0f;
    }

    public f r1() {
        this.f40427v.clear();
        return this;
    }

    public void s(Canvas canvas) {
    }

    public boolean s0(int i10) {
        return i10 != 0 && (this.f40421p & i10) == i10;
    }

    public f s1(r6.b bVar) {
        this.f40427v.remove(bVar);
        return this;
    }

    public f t() {
        return v(15);
    }

    public boolean t0(int i10) {
        return i10 != 0 && (this.f40422q & i10) == i10;
    }

    protected void t1() {
        this.f40408c = 0;
        this.f40418m = 0.0f;
        this.f40416k = 0;
        this.f40411f = 0;
        this.f40409d = 0;
        this.f40417l = 0;
        this.f40412g = 0;
        this.f40410e = 0;
    }

    public f u() {
        return v(8);
    }

    public boolean u0() {
        return this.f40431z;
    }

    public f u1() {
        return q1(false, 8);
    }

    public f v(int i10) {
        this.f40421p = i10 | this.f40421p;
        return this;
    }

    public boolean v0() {
        return (this.f40408c & 3) > 0;
    }

    public void v1() {
        f1();
        t1();
    }

    public f w(int i10, boolean z10) {
        return z10 ? v(i10) : m(i10);
    }

    public boolean w0() {
        return (this.f40421p & 3) == 3;
    }

    public f w1(boolean z10) {
        this.f40431z = z10;
        return this;
    }

    public f x() {
        return v(3);
    }

    public boolean x0() {
        return (this.f40422q & 3) == 3;
    }

    public f x1(int i10) {
        this.f40424s = i10;
        return this;
    }

    public f y() {
        return v(1);
    }

    public boolean y0() {
        return (this.f40421p & 1) != 0;
    }

    public f y1(int i10) {
        this.E = i10;
        return this;
    }

    public boolean z0() {
        return (this.f40422q & 1) != 0;
    }

    public f z1(Interpolator interpolator) {
        SmartSwipeWrapper smartSwipeWrapper;
        this.f40423r = interpolator;
        com.billy.android.swipe.internal.b bVar = this.f40420o;
        if (bVar != null && (smartSwipeWrapper = this.f40407b) != null) {
            bVar.I(smartSwipeWrapper.getContext(), interpolator);
        }
        return this;
    }
}
