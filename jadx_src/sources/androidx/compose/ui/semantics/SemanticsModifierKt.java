package androidx.compose.ui.semantics;

import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SemanticsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\b\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001a#\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006¨\u0006\n"}, d2 = {"Landroidx/compose/ui/n;", "", "mergeDescendants", "Lkotlin/Function1;", "Landroidx/compose/ui/semantics/r;", "Lkotlin/b2;", "Lkotlin/t;", "properties", "b", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class SemanticsModifierKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.l<? super r, b2> properties) {
        f0.p(nVar, "<this>");
        f0.p(properties, "properties");
        return nVar.s0(new m(false, true, properties, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.semantics.SemanticsModifierKt$clearAndSetSemantics$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("clearAndSetSemantics");
                x0Var.getProperties().c("properties", properties);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, final boolean z10, @dl.d final yh.l<? super r, b2> properties) {
        f0.p(nVar, "<this>");
        f0.p(properties, "properties");
        return nVar.s0(new m(z10, false, properties, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.semantics.SemanticsModifierKt$semantics$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("semantics");
                x0Var.getProperties().c("mergeDescendants", Boolean.valueOf(z10));
                x0Var.getProperties().c("properties", properties);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    public static /* synthetic */ androidx.compose.ui.n c(androidx.compose.ui.n nVar, boolean z10, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return b(nVar, z10, lVar);
    }
}
