package androidx.constraintlayout.core.motion;

import androidx.constraintlayout.core.motion.utils.v;
import androidx.constraintlayout.core.motion.utils.w;
import androidx.constraintlayout.core.motion.utils.z;
import androidx.constraintlayout.core.state.o;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import java.util.Set;

/* JADX INFO: compiled from: MotionWidget.java */
/* JADX INFO: loaded from: classes.dex */
public class e implements w {
    public static final int A = 0;
    public static final int B = 0;
    public static final int C = -1;
    public static final int D = -1;
    public static final int E = -2;
    public static final int F = Integer.MIN_VALUE;
    public static final int G = 1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f17502m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f17503n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f17504o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f17505p = -2;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f17506q = 0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f17507r = 4;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f17508s = -3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f17509t = -4;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f17510u = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f17511v = 1;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f17512w = 2;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f17513x = 3;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f17514y = 4;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f17515z = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    o f17516h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    a f17517i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    b f17518j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private float f17519k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    float f17520l;

    /* JADX INFO: compiled from: MotionWidget.java */
    public static class a {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f17521n = -2;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f17522o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f17523p = -3;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17524a = -1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17525b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f17526c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f17527d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f17528e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f17529f = Float.NaN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f17530g = -1;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f17531h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f17532i = Float.NaN;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f17533j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f17534k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f17535l = -3;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f17536m = -1;
    }

    /* JADX INFO: compiled from: MotionWidget.java */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f17537a = 4;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f17538b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f17539c = 1.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f17540d = Float.NaN;
    }

    public e() {
        this.f17516h = new o();
        this.f17517i = new a();
        this.f17518j = new b();
    }

    public e(o oVar) {
        this.f17516h = new o();
        this.f17517i = new a();
        this.f17518j = new b();
        this.f17516h = oVar;
    }

    public float A(int i10) {
        switch (i10) {
            case 303:
                return this.f17516h.f18210p;
            case 304:
                return this.f17516h.f18205k;
            case 305:
                return this.f17516h.f18206l;
            case 306:
                return this.f17516h.f18207m;
            case 307:
            default:
                return Float.NaN;
            case 308:
                return this.f17516h.f18202h;
            case 309:
                return this.f17516h.f18203i;
            case 310:
                return this.f17516h.f18204j;
            case 311:
                return this.f17516h.f18208n;
            case 312:
                return this.f17516h.f18209o;
            case 313:
                return this.f17516h.f18200f;
            case 314:
                return this.f17516h.f18201g;
            case 315:
                return this.f17519k;
            case 316:
                return this.f17520l;
        }
    }

    public int B() {
        return this.f17518j.f17537a;
    }

    public o C() {
        return this.f17516h;
    }

    public int D() {
        o oVar = this.f17516h;
        return oVar.f18198d - oVar.f18196b;
    }

    public int E() {
        return this.f17516h.f18196b;
    }

    public int F() {
        return this.f17516h.f18197c;
    }

    public void G(int i10, int i11, int i12, int i13) {
        H(i10, i11, i12, i13);
    }

    public void H(int i10, int i11, int i12, int i13) {
        if (this.f17516h == null) {
            this.f17516h = new o((ConstraintWidget) null);
        }
        o oVar = this.f17516h;
        oVar.f18197c = i11;
        oVar.f18196b = i10;
        oVar.f18198d = i12;
        oVar.f18199e = i13;
    }

    public void I(String str, int i10, float f10) {
        this.f17516h.u(str, i10, f10);
    }

    public void J(String str, int i10, int i11) {
        this.f17516h.v(str, i10, i11);
    }

    public void K(String str, int i10, String str2) {
        this.f17516h.w(str, i10, str2);
    }

    public void L(String str, int i10, boolean z10) {
        this.f17516h.x(str, i10, z10);
    }

    public void M(float f10) {
        this.f17516h.f18200f = f10;
    }

    public void N(float f10) {
        this.f17516h.f18201g = f10;
    }

    public void O(float f10) {
        this.f17516h.f18202h = f10;
    }

    public void P(float f10) {
        this.f17516h.f18203i = f10;
    }

    public void Q(float f10) {
        this.f17516h.f18204j = f10;
    }

    public void R(float f10) {
        this.f17516h.f18208n = f10;
    }

    public void S(float f10) {
        this.f17516h.f18209o = f10;
    }

    public void T(float f10) {
        this.f17516h.f18205k = f10;
    }

    public void U(float f10) {
        this.f17516h.f18206l = f10;
    }

    public void V(float f10) {
        this.f17516h.f18207m = f10;
    }

    public boolean W(int i10, float f10) {
        switch (i10) {
            case 303:
                this.f17516h.f18210p = f10;
                return true;
            case 304:
                this.f17516h.f18205k = f10;
                return true;
            case 305:
                this.f17516h.f18206l = f10;
                return true;
            case 306:
                this.f17516h.f18207m = f10;
                return true;
            case 307:
            default:
                return false;
            case 308:
                this.f17516h.f18202h = f10;
                return true;
            case 309:
                this.f17516h.f18203i = f10;
                return true;
            case 310:
                this.f17516h.f18204j = f10;
                return true;
            case 311:
                this.f17516h.f18208n = f10;
                return true;
            case 312:
                this.f17516h.f18209o = f10;
                return true;
            case 313:
                this.f17516h.f18200f = f10;
                return true;
            case 314:
                this.f17516h.f18201g = f10;
                return true;
            case 315:
                this.f17519k = f10;
                return true;
            case 316:
                this.f17520l = f10;
                return true;
        }
    }

    public boolean X(int i10, float f10) {
        switch (i10) {
            case 600:
                this.f17517i.f17529f = f10;
                return true;
            case 601:
                this.f17517i.f17531h = f10;
                return true;
            case 602:
                this.f17517i.f17532i = f10;
                return true;
            default:
                return false;
        }
    }

    public boolean Y(int i10, int i11) {
        switch (i10) {
            case 605:
                this.f17517i.f17524a = i11;
                return true;
            case 606:
                this.f17517i.f17525b = i11;
                return true;
            case 607:
                this.f17517i.f17527d = i11;
                return true;
            case 608:
                this.f17517i.f17528e = i11;
                return true;
            case 609:
                this.f17517i.f17530g = i11;
                return true;
            case 610:
                this.f17517i.f17533j = i11;
                return true;
            case 611:
                this.f17517i.f17535l = i11;
                return true;
            case 612:
                this.f17517i.f17536m = i11;
                return true;
            default:
                return false;
        }
    }

    public boolean Z(int i10, String str) {
        if (i10 == 603) {
            this.f17517i.f17526c = str;
            return true;
        }
        if (i10 != 604) {
            return false;
        }
        this.f17517i.f17534k = str;
        return true;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean a(int i10, int i11) {
        return W(i10, i11);
    }

    public void a0(int i10) {
        this.f17518j.f17537a = i10;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean b(int i10, float f10) {
        if (W(i10, f10)) {
            return true;
        }
        return X(i10, f10);
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean c(int i10, boolean z10) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public boolean d(int i10, String str) {
        return Z(i10, str);
    }

    @Override // androidx.constraintlayout.core.motion.utils.w
    public int e(String str) {
        int iA = v.a(str);
        return iA != -1 ? iA : z.a(str);
    }

    public e f(int i10) {
        return null;
    }

    public float g() {
        return this.f17518j.f17539c;
    }

    public int h() {
        return this.f17516h.f18199e;
    }

    public androidx.constraintlayout.core.motion.a i(String str) {
        return this.f17516h.g(str);
    }

    public Set<String> j() {
        return this.f17516h.h();
    }

    public int k() {
        o oVar = this.f17516h;
        return oVar.f18199e - oVar.f18197c;
    }

    public int l() {
        return this.f17516h.f18196b;
    }

    public String m() {
        return getClass().getSimpleName();
    }

    public e n() {
        return null;
    }

    public float o() {
        return this.f17516h.f18200f;
    }

    public float p() {
        return this.f17516h.f18201g;
    }

    public int q() {
        return this.f17516h.f18198d;
    }

    public float r() {
        return this.f17516h.f18202h;
    }

    public float s() {
        return this.f17516h.f18203i;
    }

    public float t() {
        return this.f17516h.f18204j;
    }

    public String toString() {
        return this.f17516h.f18196b + ", " + this.f17516h.f18197c + ", " + this.f17516h.f18198d + ", " + this.f17516h.f18199e;
    }

    public float u() {
        return this.f17516h.f18208n;
    }

    public float v() {
        return this.f17516h.f18209o;
    }

    public int w() {
        return this.f17516h.f18197c;
    }

    public float x() {
        return this.f17516h.f18205k;
    }

    public float y() {
        return this.f17516h.f18206l;
    }

    public float z() {
        return this.f17516h.f18207m;
    }
}
