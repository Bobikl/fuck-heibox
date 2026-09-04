package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: ConstraintProperties.java */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f19467c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f19468d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f19469e = 3;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f19470f = 4;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f19471g = 5;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f19472h = 6;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f19473i = 7;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f19474j = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f19475k = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f19476l = 0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f19477m = -2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f19478n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f19479o = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    ConstraintLayout.LayoutParams f19480a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    View f19481b;

    public b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ConstraintLayout.LayoutParams)) {
            throw new RuntimeException("Only children of ConstraintLayout.LayoutParams supported");
        }
        this.f19480a = (ConstraintLayout.LayoutParams) layoutParams;
        this.f19481b = view;
    }

    private String K(int i10) {
        switch (i10) {
            case 1:
                return com.google.android.exoplayer2.text.ttml.d.f49793l0;
            case 2:
                return com.google.android.exoplayer2.text.ttml.d.f49796n0;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return com.google.android.exoplayer2.text.ttml.d.f49798o0;
            case 7:
                return com.google.android.exoplayer2.text.ttml.d.f49800p0;
            default:
                return "undefined";
        }
    }

    public b A(float f10) {
        this.f19480a.K = f10;
        return this;
    }

    public b B(int i10, int i11) {
        switch (i10) {
            case 1:
                ((ViewGroup.MarginLayoutParams) this.f19480a).leftMargin = i11;
                return this;
            case 2:
                ((ViewGroup.MarginLayoutParams) this.f19480a).rightMargin = i11;
                return this;
            case 3:
                ((ViewGroup.MarginLayoutParams) this.f19480a).topMargin = i11;
                return this;
            case 4:
                ((ViewGroup.MarginLayoutParams) this.f19480a).bottomMargin = i11;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f19480a.setMarginStart(i11);
                return this;
            case 7:
                this.f19480a.setMarginEnd(i11);
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public b C(int i10) {
        switch (i10) {
            case 1:
                ConstraintLayout.LayoutParams layoutParams = this.f19480a;
                layoutParams.f19294e = -1;
                layoutParams.f19292d = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin = -1;
                layoutParams.f19328v = Integer.MIN_VALUE;
                return this;
            case 2:
                ConstraintLayout.LayoutParams layoutParams2 = this.f19480a;
                layoutParams2.f19298g = -1;
                layoutParams2.f19296f = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin = -1;
                layoutParams2.f19331x = Integer.MIN_VALUE;
                return this;
            case 3:
                ConstraintLayout.LayoutParams layoutParams3 = this.f19480a;
                layoutParams3.f19302i = -1;
                layoutParams3.f19300h = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = -1;
                layoutParams3.f19330w = Integer.MIN_VALUE;
                return this;
            case 4:
                ConstraintLayout.LayoutParams layoutParams4 = this.f19480a;
                layoutParams4.f19304j = -1;
                layoutParams4.f19306k = -1;
                ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = -1;
                layoutParams4.f19332y = Integer.MIN_VALUE;
                return this;
            case 5:
                this.f19480a.f19308l = -1;
                return this;
            case 6:
                ConstraintLayout.LayoutParams layoutParams5 = this.f19480a;
                layoutParams5.f19320r = -1;
                layoutParams5.f19322s = -1;
                layoutParams5.setMarginStart(-1);
                this.f19480a.f19333z = Integer.MIN_VALUE;
                return this;
            case 7:
                ConstraintLayout.LayoutParams layoutParams6 = this.f19480a;
                layoutParams6.f19324t = -1;
                layoutParams6.f19326u = -1;
                layoutParams6.setMarginEnd(-1);
                this.f19480a.A = Integer.MIN_VALUE;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public b D() {
        ConstraintLayout.LayoutParams layoutParams = this.f19480a;
        int i10 = layoutParams.f19294e;
        int i11 = layoutParams.f19296f;
        if (i10 == -1 && i11 == -1) {
            int i12 = layoutParams.f19320r;
            int i13 = layoutParams.f19324t;
            if (i12 != -1 || i13 != -1) {
                b bVar = new b(((ViewGroup) this.f19481b.getParent()).findViewById(i12));
                b bVar2 = new b(((ViewGroup) this.f19481b.getParent()).findViewById(i13));
                ConstraintLayout.LayoutParams layoutParams2 = this.f19480a;
                if (i12 != -1 && i13 != -1) {
                    bVar.m(7, i13, 6, 0);
                    bVar2.m(6, i10, 7, 0);
                } else if (i10 != -1 || i13 != -1) {
                    int i14 = layoutParams2.f19298g;
                    if (i14 != -1) {
                        bVar.m(7, i14, 7, 0);
                    } else {
                        int i15 = layoutParams2.f19292d;
                        if (i15 != -1) {
                            bVar2.m(6, i15, 6, 0);
                        }
                    }
                }
            }
            C(6);
            C(7);
        } else {
            b bVar3 = new b(((ViewGroup) this.f19481b.getParent()).findViewById(i10));
            b bVar4 = new b(((ViewGroup) this.f19481b.getParent()).findViewById(i11));
            ConstraintLayout.LayoutParams layoutParams3 = this.f19480a;
            if (i10 != -1 && i11 != -1) {
                bVar3.m(2, i11, 1, 0);
                bVar4.m(1, i10, 2, 0);
            } else if (i10 != -1 || i11 != -1) {
                int i16 = layoutParams3.f19298g;
                if (i16 != -1) {
                    bVar3.m(2, i16, 2, 0);
                } else {
                    int i17 = layoutParams3.f19292d;
                    if (i17 != -1) {
                        bVar4.m(1, i17, 1, 0);
                    }
                }
            }
            C(1);
            C(2);
        }
        return this;
    }

    public b E() {
        ConstraintLayout.LayoutParams layoutParams = this.f19480a;
        int i10 = layoutParams.f19302i;
        int i11 = layoutParams.f19304j;
        if (i10 != -1 || i11 != -1) {
            b bVar = new b(((ViewGroup) this.f19481b.getParent()).findViewById(i10));
            b bVar2 = new b(((ViewGroup) this.f19481b.getParent()).findViewById(i11));
            ConstraintLayout.LayoutParams layoutParams2 = this.f19480a;
            if (i10 != -1 && i11 != -1) {
                bVar.m(4, i11, 3, 0);
                bVar2.m(3, i10, 4, 0);
            } else if (i10 != -1 || i11 != -1) {
                int i12 = layoutParams2.f19306k;
                if (i12 != -1) {
                    bVar.m(4, i12, 4, 0);
                } else {
                    int i13 = layoutParams2.f19300h;
                    if (i13 != -1) {
                        bVar2.m(3, i13, 3, 0);
                    }
                }
            }
        }
        C(3);
        C(4);
        return this;
    }

    public b F(float f10) {
        this.f19481b.setRotation(f10);
        return this;
    }

    public b G(float f10) {
        this.f19481b.setRotationX(f10);
        return this;
    }

    public b H(float f10) {
        this.f19481b.setRotationY(f10);
        return this;
    }

    public b I(float f10) {
        this.f19481b.setScaleY(f10);
        return this;
    }

    public b J(float f10) {
        return this;
    }

    public b L(float f10, float f11) {
        this.f19481b.setPivotX(f10);
        this.f19481b.setPivotY(f11);
        return this;
    }

    public b M(float f10) {
        this.f19481b.setPivotX(f10);
        return this;
    }

    public b N(float f10) {
        this.f19481b.setPivotY(f10);
        return this;
    }

    public b O(float f10, float f11) {
        this.f19481b.setTranslationX(f10);
        this.f19481b.setTranslationY(f11);
        return this;
    }

    public b P(float f10) {
        this.f19481b.setTranslationX(f10);
        return this;
    }

    public b Q(float f10) {
        this.f19481b.setTranslationY(f10);
        return this;
    }

    public b R(float f10) {
        this.f19481b.setTranslationZ(f10);
        return this;
    }

    public b S(float f10) {
        this.f19480a.G = f10;
        return this;
    }

    public b T(int i10) {
        this.f19480a.N = i10;
        return this;
    }

    public b U(float f10) {
        this.f19480a.L = f10;
        return this;
    }

    public b V(int i10) {
        this.f19481b.setVisibility(i10);
        return this;
    }

    public b a(int i10, int i11) {
        m(1, i10, i10 == 0 ? 1 : 2, 0);
        m(2, i11, i11 == 0 ? 2 : 1, 0);
        if (i10 != 0) {
            new b(((ViewGroup) this.f19481b.getParent()).findViewById(i10)).m(2, this.f19481b.getId(), 1, 0);
        }
        if (i11 != 0) {
            new b(((ViewGroup) this.f19481b.getParent()).findViewById(i11)).m(1, this.f19481b.getId(), 2, 0);
        }
        return this;
    }

    public b b(int i10, int i11) {
        m(6, i10, i10 == 0 ? 6 : 7, 0);
        m(7, i11, i11 == 0 ? 7 : 6, 0);
        if (i10 != 0) {
            new b(((ViewGroup) this.f19481b.getParent()).findViewById(i10)).m(7, this.f19481b.getId(), 6, 0);
        }
        if (i11 != 0) {
            new b(((ViewGroup) this.f19481b.getParent()).findViewById(i11)).m(6, this.f19481b.getId(), 7, 0);
        }
        return this;
    }

    public b c(int i10, int i11) {
        m(3, i10, i10 == 0 ? 3 : 4, 0);
        m(4, i11, i11 == 0 ? 4 : 3, 0);
        if (i10 != 0) {
            new b(((ViewGroup) this.f19481b.getParent()).findViewById(i10)).m(4, this.f19481b.getId(), 3, 0);
        }
        if (i11 != 0) {
            new b(((ViewGroup) this.f19481b.getParent()).findViewById(i11)).m(3, this.f19481b.getId(), 4, 0);
        }
        return this;
    }

    public b d(float f10) {
        this.f19481b.setAlpha(f10);
        return this;
    }

    public void e() {
    }

    public b f(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        if (i12 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i15 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f10 <= 0.0f || f10 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i11 == 1 || i11 == 2) {
            m(1, i10, i11, i12);
            m(2, i13, i14, i15);
            this.f19480a.F = f10;
        } else if (i11 == 6 || i11 == 7) {
            m(6, i10, i11, i12);
            m(7, i13, i14, i15);
            this.f19480a.F = f10;
        } else {
            m(3, i10, i11, i12);
            m(4, i13, i14, i15);
            this.f19480a.G = f10;
        }
        return this;
    }

    public b g(int i10) {
        if (i10 == 0) {
            f(0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            f(i10, 2, 0, i10, 1, 0, 0.5f);
        }
        return this;
    }

    public b h(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        m(1, i10, i11, i12);
        m(2, i13, i14, i15);
        this.f19480a.F = f10;
        return this;
    }

    public b i(int i10) {
        if (i10 == 0) {
            f(0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            f(i10, 7, 0, i10, 6, 0, 0.5f);
        }
        return this;
    }

    public b j(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        m(6, i10, i11, i12);
        m(7, i13, i14, i15);
        this.f19480a.F = f10;
        return this;
    }

    public b k(int i10) {
        if (i10 == 0) {
            f(0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            f(i10, 4, 0, i10, 3, 0, 0.5f);
        }
        return this;
    }

    public b l(int i10, int i11, int i12, int i13, int i14, int i15, float f10) {
        m(3, i10, i11, i12);
        m(4, i13, i14, i15);
        this.f19480a.G = f10;
        return this;
    }

    public b m(int i10, int i11, int i12, int i13) {
        switch (i10) {
            case 1:
                if (i12 == 1) {
                    ConstraintLayout.LayoutParams layoutParams = this.f19480a;
                    layoutParams.f19292d = i11;
                    layoutParams.f19294e = -1;
                } else {
                    if (i12 != 2) {
                        throw new IllegalArgumentException("Left to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams2 = this.f19480a;
                    layoutParams2.f19294e = i11;
                    layoutParams2.f19292d = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f19480a).leftMargin = i13;
                return this;
            case 2:
                if (i12 == 1) {
                    ConstraintLayout.LayoutParams layoutParams3 = this.f19480a;
                    layoutParams3.f19296f = i11;
                    layoutParams3.f19298g = -1;
                } else {
                    if (i12 != 2) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams4 = this.f19480a;
                    layoutParams4.f19298g = i11;
                    layoutParams4.f19296f = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f19480a).rightMargin = i13;
                return this;
            case 3:
                if (i12 == 3) {
                    ConstraintLayout.LayoutParams layoutParams5 = this.f19480a;
                    layoutParams5.f19300h = i11;
                    layoutParams5.f19302i = -1;
                    layoutParams5.f19308l = -1;
                    layoutParams5.f19310m = -1;
                    layoutParams5.f19312n = -1;
                } else {
                    if (i12 != 4) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams6 = this.f19480a;
                    layoutParams6.f19302i = i11;
                    layoutParams6.f19300h = -1;
                    layoutParams6.f19308l = -1;
                    layoutParams6.f19310m = -1;
                    layoutParams6.f19312n = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f19480a).topMargin = i13;
                return this;
            case 4:
                if (i12 == 4) {
                    ConstraintLayout.LayoutParams layoutParams7 = this.f19480a;
                    layoutParams7.f19306k = i11;
                    layoutParams7.f19304j = -1;
                    layoutParams7.f19308l = -1;
                    layoutParams7.f19310m = -1;
                    layoutParams7.f19312n = -1;
                } else {
                    if (i12 != 3) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams8 = this.f19480a;
                    layoutParams8.f19304j = i11;
                    layoutParams8.f19306k = -1;
                    layoutParams8.f19308l = -1;
                    layoutParams8.f19310m = -1;
                    layoutParams8.f19312n = -1;
                }
                ((ViewGroup.MarginLayoutParams) this.f19480a).bottomMargin = i13;
                return this;
            case 5:
                if (i12 == 5) {
                    ConstraintLayout.LayoutParams layoutParams9 = this.f19480a;
                    layoutParams9.f19308l = i11;
                    layoutParams9.f19306k = -1;
                    layoutParams9.f19304j = -1;
                    layoutParams9.f19300h = -1;
                    layoutParams9.f19302i = -1;
                }
                if (i12 == 3) {
                    ConstraintLayout.LayoutParams layoutParams10 = this.f19480a;
                    layoutParams10.f19310m = i11;
                    layoutParams10.f19306k = -1;
                    layoutParams10.f19304j = -1;
                    layoutParams10.f19300h = -1;
                    layoutParams10.f19302i = -1;
                } else {
                    if (i12 != 4) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams11 = this.f19480a;
                    layoutParams11.f19312n = i11;
                    layoutParams11.f19306k = -1;
                    layoutParams11.f19304j = -1;
                    layoutParams11.f19300h = -1;
                    layoutParams11.f19302i = -1;
                }
                this.f19480a.C = i13;
                return this;
            case 6:
                if (i12 == 6) {
                    ConstraintLayout.LayoutParams layoutParams12 = this.f19480a;
                    layoutParams12.f19322s = i11;
                    layoutParams12.f19320r = -1;
                } else {
                    if (i12 != 7) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams13 = this.f19480a;
                    layoutParams13.f19320r = i11;
                    layoutParams13.f19322s = -1;
                }
                this.f19480a.setMarginStart(i13);
                return this;
            case 7:
                if (i12 == 7) {
                    ConstraintLayout.LayoutParams layoutParams14 = this.f19480a;
                    layoutParams14.f19326u = i11;
                    layoutParams14.f19324t = -1;
                } else {
                    if (i12 != 6) {
                        throw new IllegalArgumentException("right to " + K(i12) + " undefined");
                    }
                    ConstraintLayout.LayoutParams layoutParams15 = this.f19480a;
                    layoutParams15.f19324t = i11;
                    layoutParams15.f19326u = -1;
                }
                this.f19480a.setMarginEnd(i13);
                return this;
            default:
                throw new IllegalArgumentException(K(i10) + " to " + K(i12) + " unknown");
        }
    }

    public b n(int i10) {
        this.f19480a.P = i10;
        return this;
    }

    public b o(int i10) {
        this.f19480a.O = i10;
        return this;
    }

    public b p(int i10) {
        ((ViewGroup.MarginLayoutParams) this.f19480a).height = i10;
        return this;
    }

    public b q(int i10) {
        this.f19480a.T = i10;
        return this;
    }

    public b r(int i10) {
        this.f19480a.S = i10;
        return this;
    }

    public b s(int i10) {
        this.f19480a.R = i10;
        return this;
    }

    public b t(int i10) {
        this.f19480a.Q = i10;
        return this;
    }

    public b u(int i10) {
        ((ViewGroup.MarginLayoutParams) this.f19480a).width = i10;
        return this;
    }

    public b v(String str) {
        this.f19480a.H = str;
        return this;
    }

    public b w(float f10) {
        this.f19481b.setElevation(f10);
        return this;
    }

    public b x(int i10, int i11) {
        switch (i10) {
            case 1:
                this.f19480a.f19328v = i11;
                return this;
            case 2:
                this.f19480a.f19331x = i11;
                return this;
            case 3:
                this.f19480a.f19330w = i11;
                return this;
            case 4:
                this.f19480a.f19332y = i11;
                return this;
            case 5:
                throw new IllegalArgumentException("baseline does not support margins");
            case 6:
                this.f19480a.f19333z = i11;
                return this;
            case 7:
                this.f19480a.A = i11;
                return this;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public b y(float f10) {
        this.f19480a.F = f10;
        return this;
    }

    public b z(int i10) {
        this.f19480a.M = i10;
        return this;
    }
}
