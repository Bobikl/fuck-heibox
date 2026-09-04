package androidx.fragment.app;

import kotlin.b2;

/* JADX INFO: compiled from: FragmentManager.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class f0 {
    public static final void a(@dl.d FragmentManager fragmentManager, boolean z10, @dl.d yh.l<? super p0, b2> body) {
        kotlin.jvm.internal.f0.p(fragmentManager, "<this>");
        kotlin.jvm.internal.f0.p(body, "body");
        p0 p0VarU = fragmentManager.u();
        kotlin.jvm.internal.f0.o(p0VarU, "beginTransaction()");
        body.invoke(p0VarU);
        if (z10) {
            p0VarU.n();
        } else {
            p0VarU.m();
        }
    }

    public static /* synthetic */ void b(FragmentManager fragmentManager, boolean z10, yh.l body, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        kotlin.jvm.internal.f0.p(fragmentManager, "<this>");
        kotlin.jvm.internal.f0.p(body, "body");
        p0 p0VarU = fragmentManager.u();
        kotlin.jvm.internal.f0.o(p0VarU, "beginTransaction()");
        body.invoke(p0VarU);
        if (z10) {
            p0VarU.n();
        } else {
            p0VarU.m();
        }
    }

    @androidx.annotation.k0
    public static final void c(@dl.d FragmentManager fragmentManager, boolean z10, @dl.d yh.l<? super p0, b2> body) {
        kotlin.jvm.internal.f0.p(fragmentManager, "<this>");
        kotlin.jvm.internal.f0.p(body, "body");
        p0 p0VarU = fragmentManager.u();
        kotlin.jvm.internal.f0.o(p0VarU, "beginTransaction()");
        body.invoke(p0VarU);
        if (z10) {
            p0VarU.p();
        } else {
            p0VarU.o();
        }
    }

    public static /* synthetic */ void d(FragmentManager fragmentManager, boolean z10, yh.l body, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        kotlin.jvm.internal.f0.p(fragmentManager, "<this>");
        kotlin.jvm.internal.f0.p(body, "body");
        p0 p0VarU = fragmentManager.u();
        kotlin.jvm.internal.f0.o(p0VarU, "beginTransaction()");
        body.invoke(p0VarU);
        if (z10) {
            p0VarU.p();
        } else {
            p0VarU.o();
        }
    }

    @kotlin.k(message = "Use commit { .. } or commitNow { .. } extensions")
    public static final void e(@dl.d FragmentManager fragmentManager, boolean z10, boolean z11, @dl.d yh.l<? super p0, b2> body) {
        kotlin.jvm.internal.f0.p(fragmentManager, "<this>");
        kotlin.jvm.internal.f0.p(body, "body");
        p0 p0VarU = fragmentManager.u();
        kotlin.jvm.internal.f0.o(p0VarU, "beginTransaction()");
        body.invoke(p0VarU);
        if (z10) {
            if (z11) {
                p0VarU.p();
                return;
            } else {
                p0VarU.o();
                return;
            }
        }
        if (z11) {
            p0VarU.n();
        } else {
            p0VarU.m();
        }
    }

    public static /* synthetic */ void f(FragmentManager fragmentManager, boolean z10, boolean z11, yh.l body, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        kotlin.jvm.internal.f0.p(fragmentManager, "<this>");
        kotlin.jvm.internal.f0.p(body, "body");
        p0 p0VarU = fragmentManager.u();
        kotlin.jvm.internal.f0.o(p0VarU, "beginTransaction()");
        body.invoke(p0VarU);
        if (z10) {
            if (z11) {
                p0VarU.p();
                return;
            } else {
                p0VarU.o();
                return;
            }
        }
        if (z11) {
            p0VarU.n();
        } else {
            p0VarU.m();
        }
    }
}
