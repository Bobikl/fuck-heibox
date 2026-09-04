package androidx.compose.ui.graphics;

/* JADX INFO: compiled from: Canvas.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class c0 {
    public static void a(d0 d0Var, @dl.d b1.i rect, int i10) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        d0Var.a(rect.t(), rect.getF30372b(), rect.x(), rect.j(), i10);
    }

    public static void b(d0 d0Var, @dl.d b1.i rect, float f10, float f11, boolean z10, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        kotlin.jvm.internal.f0.p(paint, "paint");
        d0Var.m(rect.t(), rect.getF30372b(), rect.x(), rect.j(), f10, f11, z10, paint);
    }

    public static void c(d0 d0Var, @dl.d b1.i rect, float f10, float f11, boolean z10, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        kotlin.jvm.internal.f0.p(paint, "paint");
        d0Var.g(rect, p0.a(f10), p0.a(f11), z10, paint);
    }

    public static void d(d0 d0Var, @dl.d b1.i rect, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        kotlin.jvm.internal.f0.p(paint, "paint");
        d0Var.s(rect.t(), rect.getF30372b(), rect.x(), rect.j(), paint);
    }

    public static void e(d0 d0Var, @dl.d b1.i rect, @dl.d h1 paint) {
        kotlin.jvm.internal.f0.p(rect, "rect");
        kotlin.jvm.internal.f0.p(paint, "paint");
        d0Var.r(rect.t(), rect.getF30372b(), rect.x(), rect.j(), paint);
    }

    public static void f(d0 d0Var, float f10, float f11) {
        d0Var.B(p0.a(f10), p0.a(f11));
    }

    public static /* synthetic */ void m(d0 d0Var, l1 l1Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipPath-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = k0.INSTANCE.b();
        }
        d0Var.e(l1Var, i10);
    }

    public static /* synthetic */ void n(d0 d0Var, float f10, float f11, float f12, float f13, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-N_I0leg");
        }
        if ((i11 & 16) != 0) {
            i10 = k0.INSTANCE.b();
        }
        d0Var.a(f10, f11, f12, f13, i10);
    }

    public static /* synthetic */ void o(d0 d0Var, b1.i iVar, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clipRect-mtrdD-E");
        }
        if ((i11 & 2) != 0) {
            i10 = k0.INSTANCE.b();
        }
        d0Var.p(iVar, i10);
    }

    public static /* synthetic */ void p(d0 d0Var, y0 y0Var, long j10, long j11, long j12, long j13, h1 h1Var, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImageRect-HPBpro0");
        }
        long jA = (i10 & 2) != 0 ? s1.n.f139237b.a() : j10;
        long jA2 = (i10 & 4) != 0 ? s1.s.a(y0Var.getWidth(), y0Var.getHeight()) : j11;
        d0Var.i(y0Var, jA, jA2, (i10 & 8) != 0 ? s1.n.f139237b.a() : j12, (i10 & 16) != 0 ? jA2 : j13, h1Var);
    }

    public static /* synthetic */ void q(d0 d0Var, float f10, float f11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scale");
        }
        if ((i10 & 2) != 0) {
            f11 = f10;
        }
        d0Var.q(f10, f11);
    }
}
