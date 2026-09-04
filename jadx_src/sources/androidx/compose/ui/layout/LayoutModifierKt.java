package androidx.compose.ui.layout;

import androidx.compose.ui.platform.InspectableValueKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LayoutModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a2\u0010\b\u001a\u00020\u0000*\u00020\u00002#\u0010\u0007\u001a\u001f\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0001¢\u0006\u0002\b\u0006ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/ui/n;", "Lkotlin/Function3;", "Landroidx/compose/ui/layout/l0;", "Landroidx/compose/ui/layout/g0;", "Ls1/b;", "Landroidx/compose/ui/layout/j0;", "Lkotlin/t;", "measure", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class LayoutModifierKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final yh.q<? super l0, ? super g0, ? super s1.b, ? extends j0> measure) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(measure, "measure");
        return nVar.s0(new LayoutModifierImpl(measure, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.ui.layout.LayoutModifierKt$layout$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d(com.google.android.exoplayer2.text.ttml.d.f49813w);
                x0Var.getProperties().c("measure", measure);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }
}
