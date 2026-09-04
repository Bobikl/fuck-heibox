package androidx.compose.foundation;

import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Hoverable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001c\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "", "enabled", ak.av, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class HoverableKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final androidx.compose.foundation.interaction.g interactionSource, final boolean z10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(interactionSource, "interactionSource");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.HoverableKt$hoverable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("hoverable");
                x0Var.getProperties().c("interactionSource", interactionSource);
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new HoverableKt$hoverable$2(interactionSource, z10));
    }

    public static /* synthetic */ androidx.compose.ui.n b(androidx.compose.ui.n nVar, androidx.compose.foundation.interaction.g gVar, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(nVar, gVar, z10);
    }
}
