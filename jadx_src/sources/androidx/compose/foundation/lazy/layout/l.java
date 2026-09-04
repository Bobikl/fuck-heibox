package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.j2;
import s1.u;
import s1.v;
import s1.w;

/* JADX INFO: compiled from: LazyLayoutMeasureScope.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class l {
    @j2
    public static float a(m mVar, long j10) {
        if (w.g(u.m(j10), w.f139257b.b())) {
            return s1.h.g(u.n(j10) * mVar.getF139218c());
        }
        throw new IllegalStateException("Only Sp can convert to Px".toString());
    }

    @j2
    public static float b(m mVar, float f10) {
        return s1.h.g(f10 / mVar.getF139217b());
    }

    @j2
    public static float c(m mVar, int i10) {
        return s1.h.g(i10 / mVar.getF139217b());
    }

    @j2
    public static long d(m mVar, long j10) {
        return (j10 > b1.m.f30386b.a() ? 1 : (j10 == b1.m.f30386b.a() ? 0 : -1)) != 0 ? s1.i.b(mVar.F(b1.m.t(j10)), mVar.F(b1.m.m(j10))) : s1.l.f139233b.a();
    }

    @j2
    public static long e(m mVar, long j10) {
        return (j10 > s1.l.f139233b.a() ? 1 : (j10 == s1.l.f139233b.a() ? 0 : -1)) != 0 ? b1.n.a(mVar.E1(s1.l.p(j10)), mVar.E1(s1.l.m(j10))) : b1.m.f30386b.a();
    }

    @j2
    public static long f(m mVar, float f10) {
        return v.l(f10 / mVar.getF139218c());
    }

    @j2
    public static long g(m mVar, float f10) {
        return v.l(f10 / (mVar.getF139218c() * mVar.getF139217b()));
    }

    @j2
    public static long h(m mVar, int i10) {
        return v.l(i10 / (mVar.getF139218c() * mVar.getF139217b()));
    }
}
