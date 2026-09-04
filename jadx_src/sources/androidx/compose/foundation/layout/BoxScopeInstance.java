package androidx.compose.foundation.layout;

import androidx.compose.runtime.j2;
import androidx.compose.ui.platform.InspectableValueKt;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: Box.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0014\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0017J\f\u0010\u0006\u001a\u00020\u0002*\u00020\u0002H\u0017¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/layout/BoxScopeInstance;", "Landroidx/compose/foundation/layout/k;", "Landroidx/compose/ui/n;", "Landroidx/compose/ui/c;", "alignment", "b", "f", "<init>", "()V", "foundation-layout_release"}, k = 1, mv = {1, 7, 1})
public final class BoxScopeInstance implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final BoxScopeInstance f5954a = new BoxScopeInstance();

    private BoxScopeInstance() {
    }

    @Override // androidx.compose.foundation.layout.k
    @j2
    @dl.d
    public androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d final androidx.compose.ui.c alignment) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(alignment, "alignment");
        return nVar.s0(new BoxChildData(alignment, false, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.BoxScopeInstance$align$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("align");
                x0Var.e(alignment);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }

    @Override // androidx.compose.foundation.layout.k
    @j2
    @dl.d
    public androidx.compose.ui.n f(@dl.d androidx.compose.ui.n nVar) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return nVar.s0(new BoxChildData(androidx.compose.ui.c.INSTANCE.i(), true, InspectableValueKt.e() ? new yh.l<androidx.compose.ui.platform.x0, b2>() { // from class: androidx.compose.foundation.layout.BoxScopeInstance$matchParentSize$$inlined$debugInspectorInfo$1
            public final void a(@dl.d androidx.compose.ui.platform.x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("matchParentSize");
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.platform.x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }
}
