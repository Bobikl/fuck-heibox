package androidx.compose.ui;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ZIndexModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/n;", "", "zIndex", ak.av, "ui_release"}, k = 2, mv = {1, 7, 1})
public final class ZIndexModifierKt {
    @j2
    @dl.d
    public static final n a(@dl.d n nVar, final float f10) {
        f0.p(nVar, "<this>");
        return nVar.s0(new ZIndexModifier(f10, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.ui.ZIndexModifierKt$zIndex$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                f0.p(x0Var, "$this$null");
                x0Var.d("zIndex");
                x0Var.e(Float.valueOf(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }
}
