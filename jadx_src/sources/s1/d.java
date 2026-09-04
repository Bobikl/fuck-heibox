package s1;

import androidx.compose.runtime.j2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Density.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class d {
    @j2
    public static int a(e eVar, long j10) {
        return di.d.L0(eVar.k1(j10));
    }

    @j2
    public static int b(e eVar, float f10) {
        float fE1 = eVar.E1(f10);
        if (Float.isInfinite(fE1)) {
            return Integer.MAX_VALUE;
        }
        return di.d.L0(fE1);
    }

    @j2
    public static float c(e eVar, long j10) {
        if (w.g(u.m(j10), w.f139257b.b())) {
            return h.g(u.n(j10) * eVar.getF139218c());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @j2
    public static float d(e eVar, float f10) {
        return h.g(f10 / eVar.getF139217b());
    }

    @j2
    public static float e(e eVar, int i10) {
        return h.g(i10 / eVar.getF139217b());
    }

    @j2
    public static long f(e eVar, long j10) {
        return (j10 > b1.m.f30386b.a() ? 1 : (j10 == b1.m.f30386b.a() ? 0 : -1)) != 0 ? i.b(eVar.F(b1.m.t(j10)), eVar.F(b1.m.m(j10))) : l.f139233b.a();
    }

    @j2
    public static float g(e eVar, long j10) {
        if (w.g(u.m(j10), w.f139257b.b())) {
            return u.n(j10) * eVar.getF139218c() * eVar.getF139217b();
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @j2
    public static float h(e eVar, float f10) {
        return f10 * eVar.getF139217b();
    }

    @j2
    @dl.d
    public static b1.i i(e eVar, @dl.d DpRect kVar) {
        f0.p(kVar, "<this>");
        return new b1.i(eVar.E1(kVar.i()), eVar.E1(kVar.m()), eVar.E1(kVar.k()), eVar.E1(kVar.g()));
    }

    @j2
    public static long j(e eVar, long j10) {
        return (j10 > l.f139233b.a() ? 1 : (j10 == l.f139233b.a() ? 0 : -1)) != 0 ? b1.n.a(eVar.E1(l.p(j10)), eVar.E1(l.m(j10))) : b1.m.f30386b.a();
    }

    @j2
    public static long k(e eVar, float f10) {
        return v.l(f10 / eVar.getF139218c());
    }

    @j2
    public static long l(e eVar, float f10) {
        return v.l(f10 / (eVar.getF139218c() * eVar.getF139217b()));
    }

    @j2
    public static long m(e eVar, int i10) {
        return v.l(i10 / (eVar.getF139218c() * eVar.getF139217b()));
    }
}
