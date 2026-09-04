package androidx.compose.ui.graphics.drawscope;

import androidx.compose.ui.graphics.a0;
import androidx.compose.ui.graphics.j2;
import androidx.compose.ui.graphics.l1;
import androidx.compose.ui.graphics.m0;
import androidx.compose.ui.graphics.m1;
import androidx.compose.ui.graphics.y0;
import java.util.List;
import kotlin.jvm.internal.f0;
import s1.s;

/* JADX INFO: compiled from: DrawScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class f {
    static {
        g.Companion companion = g.INSTANCE;
    }

    public static /* synthetic */ void A(g gVar, y0 y0Var, long j10, float f10, j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-gbVJVH8");
        }
        gVar.t0(y0Var, (i11 & 2) != 0 ? b1.f.f30364b.e() : j10, (i11 & 4) != 0 ? 1.0f : f10, (i11 & 8) != 0 ? o.f13826a : jVar, (i11 & 16) != 0 ? null : m0Var, (i11 & 32) != 0 ? g.INSTANCE.a() : i10);
    }

    public static /* synthetic */ void B(g gVar, a0 a0Var, long j10, long j11, float f10, int i10, m1 m1Var, float f11, m0 m0Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-1RTmtNc");
        }
        gVar.I1(a0Var, j10, j11, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? Stroke.INSTANCE.a() : i10, (i12 & 32) != 0 ? null : m1Var, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : m0Var, (i12 & 256) != 0 ? g.INSTANCE.a() : i11);
    }

    public static /* synthetic */ void C(g gVar, long j10, long j11, long j12, float f10, int i10, m1 m1Var, float f11, m0 m0Var, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawLine-NGM6Ib0");
        }
        gVar.x0(j10, j11, j12, (i12 & 8) != 0 ? 0.0f : f10, (i12 & 16) != 0 ? Stroke.INSTANCE.a() : i10, (i12 & 32) != 0 ? null : m1Var, (i12 & 64) != 0 ? 1.0f : f11, (i12 & 128) != 0 ? null : m0Var, (i12 & 256) != 0 ? g.INSTANCE.a() : i11);
    }

    public static /* synthetic */ void D(g gVar, a0 a0Var, long j10, long j11, float f10, j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-AsUm42w");
        }
        long jE = (i11 & 2) != 0 ? b1.f.f30364b.e() : j10;
        gVar.D1(a0Var, jE, (i11 & 4) != 0 ? d(gVar, gVar.c(), jE) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? o.f13826a : jVar, (i11 & 32) != 0 ? null : m0Var, (i11 & 64) != 0 ? g.INSTANCE.a() : i10);
    }

    public static /* synthetic */ void E(g gVar, long j10, long j11, long j12, float f10, j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawOval-n-J9OG0");
        }
        long jE = (i11 & 2) != 0 ? b1.f.f30364b.e() : j11;
        gVar.E0(j10, jE, (i11 & 4) != 0 ? d(gVar, gVar.c(), jE) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? o.f13826a : jVar, (i11 & 32) != 0 ? null : m0Var, (i11 & 64) != 0 ? g.INSTANCE.a() : i10);
    }

    public static /* synthetic */ void F(g gVar, l1 l1Var, a0 a0Var, float f10, j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-GBMwjPU");
        }
        if ((i11 & 4) != 0) {
            f10 = 1.0f;
        }
        float f11 = f10;
        if ((i11 & 8) != 0) {
            jVar = o.f13826a;
        }
        j jVar2 = jVar;
        if ((i11 & 16) != 0) {
            m0Var = null;
        }
        m0 m0Var2 = m0Var;
        if ((i11 & 32) != 0) {
            i10 = g.INSTANCE.a();
        }
        gVar.m0(l1Var, a0Var, f11, jVar2, m0Var2, i10);
    }

    public static /* synthetic */ void G(g gVar, l1 l1Var, long j10, float f10, j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPath-LG529CI");
        }
        gVar.z0(l1Var, j10, (i11 & 4) != 0 ? 1.0f : f10, (i11 & 8) != 0 ? o.f13826a : jVar, (i11 & 16) != 0 ? null : m0Var, (i11 & 32) != 0 ? g.INSTANCE.a() : i10);
    }

    public static /* synthetic */ void H(g gVar, List list, int i10, long j10, float f10, int i11, m1 m1Var, float f11, m0 m0Var, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-F8ZwMP8");
        }
        gVar.G1(list, i10, j10, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? j2.INSTANCE.a() : i11, (i13 & 32) != 0 ? null : m1Var, (i13 & 64) != 0 ? 1.0f : f11, (i13 & 128) != 0 ? null : m0Var, (i13 & 256) != 0 ? g.INSTANCE.a() : i12);
    }

    public static /* synthetic */ void I(g gVar, List list, int i10, a0 a0Var, float f10, int i11, m1 m1Var, float f11, m0 m0Var, int i12, int i13, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawPoints-Gsft0Ws");
        }
        gVar.j0(list, i10, a0Var, (i13 & 8) != 0 ? 0.0f : f10, (i13 & 16) != 0 ? j2.INSTANCE.a() : i11, (i13 & 32) != 0 ? null : m1Var, (i13 & 64) != 0 ? 1.0f : f11, (i13 & 128) != 0 ? null : m0Var, (i13 & 256) != 0 ? g.INSTANCE.a() : i12);
    }

    public static /* synthetic */ void J(g gVar, a0 a0Var, long j10, long j11, float f10, j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-AsUm42w");
        }
        long jE = (i11 & 2) != 0 ? b1.f.f30364b.e() : j10;
        gVar.w0(a0Var, jE, (i11 & 4) != 0 ? d(gVar, gVar.c(), jE) : j11, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? o.f13826a : jVar, (i11 & 32) != 0 ? null : m0Var, (i11 & 64) != 0 ? g.INSTANCE.a() : i10);
    }

    public static /* synthetic */ void K(g gVar, long j10, long j11, long j12, float f10, j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRect-n-J9OG0");
        }
        long jE = (i11 & 2) != 0 ? b1.f.f30364b.e() : j11;
        gVar.u1(j10, jE, (i11 & 4) != 0 ? d(gVar, gVar.c(), jE) : j12, (i11 & 8) != 0 ? 1.0f : f10, (i11 & 16) != 0 ? o.f13826a : jVar, (i11 & 32) != 0 ? null : m0Var, (i11 & 64) != 0 ? g.INSTANCE.a() : i10);
    }

    public static /* synthetic */ void L(g gVar, a0 a0Var, long j10, long j11, long j12, float f10, j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-ZuiqVtQ");
        }
        long jE = (i11 & 2) != 0 ? b1.f.f30364b.e() : j10;
        gVar.B1(a0Var, jE, (i11 & 4) != 0 ? d(gVar, gVar.c(), jE) : j11, (i11 & 8) != 0 ? b1.a.f30356b.a() : j12, (i11 & 16) != 0 ? 1.0f : f10, (i11 & 32) != 0 ? o.f13826a : jVar, (i11 & 64) != 0 ? null : m0Var, (i11 & 128) != 0 ? g.INSTANCE.a() : i10);
    }

    public static /* synthetic */ void M(g gVar, long j10, long j11, long j12, long j13, j jVar, float f10, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawRoundRect-u-Aw5IA");
        }
        long jE = (i11 & 2) != 0 ? b1.f.f30364b.e() : j11;
        gVar.i1(j10, jE, (i11 & 4) != 0 ? d(gVar, gVar.c(), jE) : j12, (i11 & 8) != 0 ? b1.a.f30356b.a() : j13, (i11 & 16) != 0 ? o.f13826a : jVar, (i11 & 32) != 0 ? 1.0f : f10, (i11 & 64) != 0 ? null : m0Var, (i11 & 128) != 0 ? g.INSTANCE.a() : i10);
    }

    public static void a(g gVar, @dl.d y0 image, long j10, long j11, long j12, long j13, float f10, @dl.d j style, @dl.e m0 m0Var, int i10, int i11) {
        f0.p(image, "image");
        f0.p(style, "style");
        z(gVar, image, j10, j11, j12, j13, f10, style, m0Var, i10, 0, 512, null);
    }

    public static long b(g gVar) {
        return b1.n.b(gVar.getDrawContext().c());
    }

    public static long c(g gVar) {
        return gVar.getDrawContext().c();
    }

    public static long d(g gVar, long j10, long j11) {
        return b1.n.a(b1.m.t(j10) - b1.f.p(j11), b1.m.m(j10) - b1.f.r(j11));
    }

    public static /* synthetic */ void u(g gVar, a0 a0Var, float f10, float f11, boolean z10, long j10, long j11, float f12, j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-illE91I");
        }
        long jE = (i11 & 16) != 0 ? b1.f.f30364b.e() : j10;
        gVar.y0(a0Var, f10, f11, z10, jE, (i11 & 32) != 0 ? d(gVar, gVar.c(), jE) : j11, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? o.f13826a : jVar, (i11 & 256) != 0 ? null : m0Var, (i11 & 512) != 0 ? g.INSTANCE.a() : i10);
    }

    public static /* synthetic */ void v(g gVar, long j10, float f10, float f11, boolean z10, long j11, long j12, float f12, j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawArc-yD3GUKo");
        }
        long jE = (i11 & 16) != 0 ? b1.f.f30364b.e() : j11;
        gVar.G0(j10, f10, f11, z10, jE, (i11 & 32) != 0 ? d(gVar, gVar.c(), jE) : j12, (i11 & 64) != 0 ? 1.0f : f12, (i11 & 128) != 0 ? o.f13826a : jVar, (i11 & 256) != 0 ? null : m0Var, (i11 & 512) != 0 ? g.INSTANCE.a() : i10);
    }

    public static /* synthetic */ void w(g gVar, a0 a0Var, float f10, long j10, float f11, j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-V9BoPsw");
        }
        gVar.M1(a0Var, (i11 & 2) != 0 ? b1.m.q(gVar.c()) / 2.0f : f10, (i11 & 4) != 0 ? gVar.I() : j10, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? o.f13826a : jVar, (i11 & 32) != 0 ? null : m0Var, (i11 & 64) != 0 ? g.INSTANCE.a() : i10);
    }

    public static /* synthetic */ void x(g gVar, long j10, float f10, long j11, float f11, j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawCircle-VaOC9Bg");
        }
        gVar.D0(j10, (i11 & 2) != 0 ? b1.m.q(gVar.c()) / 2.0f : f10, (i11 & 4) != 0 ? gVar.I() : j11, (i11 & 8) != 0 ? 1.0f : f11, (i11 & 16) != 0 ? o.f13826a : jVar, (i11 & 32) != 0 ? null : m0Var, (i11 & 64) != 0 ? g.INSTANCE.a() : i10);
    }

    public static /* synthetic */ void y(g gVar, y0 y0Var, long j10, long j11, long j12, long j13, float f10, j jVar, m0 m0Var, int i10, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-9jGpkUE");
        }
        long jA = (i11 & 2) != 0 ? s1.n.f139237b.a() : j10;
        long jA2 = (i11 & 4) != 0 ? s.a(y0Var.getWidth(), y0Var.getHeight()) : j11;
        gVar.q1(y0Var, jA, jA2, (i11 & 8) != 0 ? s1.n.f139237b.a() : j12, (i11 & 16) != 0 ? jA2 : j13, (i11 & 32) != 0 ? 1.0f : f10, (i11 & 64) != 0 ? o.f13826a : jVar, (i11 & 128) != 0 ? null : m0Var, (i11 & 256) != 0 ? g.INSTANCE.a() : i10);
    }

    public static /* synthetic */ void z(g gVar, y0 y0Var, long j10, long j11, long j12, long j13, float f10, j jVar, m0 m0Var, int i10, int i11, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: drawImage-AZ2fEMs");
        }
        long jA = (i12 & 2) != 0 ? s1.n.f139237b.a() : j10;
        long jA2 = (i12 & 4) != 0 ? s.a(y0Var.getWidth(), y0Var.getHeight()) : j11;
        gVar.N1(y0Var, jA, jA2, (i12 & 8) != 0 ? s1.n.f139237b.a() : j12, (i12 & 16) != 0 ? jA2 : j13, (i12 & 32) != 0 ? 1.0f : f10, (i12 & 64) != 0 ? o.f13826a : jVar, (i12 & 128) != 0 ? null : m0Var, (i12 & 256) != 0 ? g.INSTANCE.a() : i10, (i12 & 512) != 0 ? g.INSTANCE.b() : i11);
    }
}
