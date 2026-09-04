package androidx.compose.foundation.layout;

import kotlin.b2;

/* JADX INFO: renamed from: androidx.compose.foundation.layout.IntrinsicSizeModifier$-CC, reason: invalid class name */
/* JADX INFO: compiled from: Intrinsic.kt */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class IntrinsicSizeModifier$CC {
    public static boolean a(c0 c0Var) {
        return true;
    }

    public static int b(c0 c0Var, @dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return measurable.V(i10);
    }

    public static int c(c0 c0Var, @dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return measurable.w1(i10);
    }

    @dl.d
    public static androidx.compose.ui.layout.j0 d(c0 c0Var, @dl.d androidx.compose.ui.layout.l0 measure, @dl.d androidx.compose.ui.layout.g0 measurable, long j10) {
        kotlin.jvm.internal.f0.p(measure, "$this$measure");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        long jA1 = c0Var.A1(measure, measurable, j10);
        if (c0Var.K1()) {
            jA1 = s1.c.e(j10, jA1);
        }
        final androidx.compose.ui.layout.e1 e1VarZ1 = measurable.z1(jA1);
        return androidx.compose.ui.layout.k0.p(measure, e1VarZ1.getWidth(), e1VarZ1.getHeight(), null, new yh.l<androidx.compose.ui.layout.e1.a, b2>() { // from class: androidx.compose.foundation.layout.IntrinsicSizeModifier$measure$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.layout.e1.a layout) {
                kotlin.jvm.internal.f0.p(layout, "$this$layout");
                androidx.compose.ui.layout.e1.a.x(layout, e1VarZ1, s1.n.f139237b.a(), 0.0f, 2, null);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.layout.e1.a aVar) {
                a(aVar);
                return b2.f124493a;
            }
        }, 4, null);
    }

    public static int e(c0 c0Var, @dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return measurable.L0(i10);
    }

    public static int f(c0 c0Var, @dl.d androidx.compose.ui.layout.n nVar, @dl.d androidx.compose.ui.layout.m measurable, int i10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measurable, "measurable");
        return measurable.l1(i10);
    }
}
