package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.InspectableValueKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: AspectRatio.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001e\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u0007¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/n;", "", "ratio", "", "matchHeightConstraintsFirst", ak.av, "foundation-layout_release"}, k = 2, mv = {1, 7, 1})
public final class AspectRatioKt {
    @j2
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, final float f10, final boolean z10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return nVar.s0(new AspectRatioModifier(f10, z10, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.AspectRatioKt$aspectRatio$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d(com.max.mediaselector.lib.config.b.f75079g);
                x0Var.getProperties().c("ratio", Float.valueOf(f10));
                x0Var.getProperties().c("matchHeightConstraintsFirst", Boolean.valueOf(z10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    public static /* synthetic */ androidx.compose.ui.n b(androidx.compose.ui.n nVar, float f10, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return a(nVar, f10, z10);
    }
}
