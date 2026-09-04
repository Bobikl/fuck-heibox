package androidx.compose.ui.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.InspectableValueKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LayoutId.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0014\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007\"\u0017\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/n;", "", "layoutId", "b", "Landroidx/compose/ui/layout/g0;", ak.av, "(Landroidx/compose/ui/layout/g0;)Ljava/lang/Object;", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class LayoutIdKt {
    @dl.e
    public static final Object a(@dl.d g0 g0Var) {
        kotlin.jvm.internal.f0.p(g0Var, "<this>");
        Object objB = g0Var.b();
        t tVar = objB instanceof t ? (t) objB : null;
        if (tVar != null) {
            return tVar.getLayoutId();
        }
        return null;
    }

    @j2
    @dl.d
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d final Object layoutId) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(layoutId, "layoutId");
        return nVar.s0(new LayoutId(layoutId, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.ui.layout.LayoutIdKt$layoutId$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("layoutId");
                x0Var.e(layoutId);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }
}
