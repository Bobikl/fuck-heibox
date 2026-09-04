package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsConfigurationKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: SemanticsModifierNode.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007\u001a\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0000H\u0007\u001a\f\u0010\u0006\u001a\u00020\u0005*\u00020\u0000H\u0000\"\u001e\u0010\f\u001a\u00020\u0007*\u00020\u00008@X\u0080\u0004¢\u0006\f\u0012\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\r"}, d2 = {"Landroidx/compose/ui/node/j1;", "Lkotlin/b2;", "d", "Landroidx/compose/ui/semantics/j;", ak.av, "Lb1/i;", "e", "", "b", "(Landroidx/compose/ui/node/j1;)Z", "getUseMinimumTouchTarget$annotations", "(Landroidx/compose/ui/node/j1;)V", "useMinimumTouchTarget", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class k1 {
    @androidx.compose.ui.g
    @dl.d
    public static final androidx.compose.ui.semantics.j a(@dl.d j1 j1Var) {
        kotlin.jvm.internal.f0.p(j1Var, "<this>");
        Object objD = d.d(j1Var, x0.f15398a.j());
        if (!(objD instanceof j1)) {
            objD = null;
        }
        j1 j1Var2 = (j1) objD;
        if (j1Var2 == null || j1Var.getSemanticsConfiguration().getIsClearingSemantics()) {
            return j1Var.getSemanticsConfiguration();
        }
        androidx.compose.ui.semantics.j jVarG = j1Var.getSemanticsConfiguration().g();
        jVarG.b(a(j1Var2));
        return jVarG;
    }

    public static final boolean b(@dl.d j1 j1Var) {
        kotlin.jvm.internal.f0.p(j1Var, "<this>");
        return SemanticsConfigurationKt.a(j1Var.getSemanticsConfiguration(), androidx.compose.ui.semantics.i.f16129a.h()) != null;
    }

    public static /* synthetic */ void c(j1 j1Var) {
    }

    @androidx.compose.ui.g
    public static final void d(@dl.d j1 j1Var) {
        kotlin.jvm.internal.f0.p(j1Var, "<this>");
        d.l(j1Var).A();
    }

    @dl.d
    public static final b1.i e(@dl.d j1 j1Var) {
        kotlin.jvm.internal.f0.p(j1Var, "<this>");
        if (j1Var.getNode().getIsAttached()) {
            return !b(j1Var) ? androidx.compose.ui.layout.r.b(d.j(j1Var, x0.f15398a.j())) : d.j(j1Var, x0.f15398a.j()).F3();
        }
        return b1.i.f30369e.a();
    }
}
