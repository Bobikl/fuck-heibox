package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.f0;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LazyGridItemScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u0006\u001a\u00020\u0002*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0017ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridItemScopeImpl;", "Landroidx/compose/foundation/lazy/grid/l;", "Landroidx/compose/ui/n;", "Landroidx/compose/animation/core/f0;", "Ls1/n;", "animationSpec", ak.av, "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyGridItemScopeImpl implements l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final LazyGridItemScopeImpl f6756a = new LazyGridItemScopeImpl();

    private LazyGridItemScopeImpl() {
    }

    @Override // androidx.compose.foundation.lazy.grid.l
    @androidx.compose.foundation.t
    @dl.d
    public androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final f0<s1.n> animationSpec) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        return nVar.s0(new a(animationSpec, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl$animateItemPlacement$$inlined$debugInspectorInfo$1
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("animateItemPlacement");
                x0Var.e(animationSpec);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b()));
    }
}
