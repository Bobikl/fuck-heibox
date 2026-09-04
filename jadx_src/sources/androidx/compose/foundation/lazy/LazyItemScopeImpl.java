package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.f0;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.lzy.okgo.model.Progress;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;

/* JADX INFO: compiled from: LazyItemScopeImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002J\u0014\u0010\n\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\u000b\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016J\u0014\u0010\f\u001a\u00020\u0007*\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016J\u001d\u0010\u0010\u001a\u00020\u0007*\u00020\u00072\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0017ø\u0001\u0000R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0012R\u001c\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0012\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0017"}, d2 = {"Landroidx/compose/foundation/lazy/LazyItemScopeImpl;", "Landroidx/compose/foundation/lazy/g;", "", "width", "height", "Lkotlin/b2;", "e", "Landroidx/compose/ui/n;", "", Progress.G, "d", ak.aF, "b", "Landroidx/compose/animation/core/f0;", "Ls1/n;", "animationSpec", ak.av, "Landroidx/compose/runtime/a1;", "Landroidx/compose/runtime/a1;", "maxWidthState", "maxHeightState", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class LazyItemScopeImpl implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private a1<Integer> maxWidthState = h2.g(Integer.MAX_VALUE, null, 2, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private a1<Integer> maxHeightState = h2.g(Integer.MAX_VALUE, null, 2, null);

    @Override // androidx.compose.foundation.lazy.g
    @androidx.compose.foundation.t
    @dl.d
    public androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d final f0<s1.n> animationSpec) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(animationSpec, "animationSpec");
        return nVar.s0(new a(animationSpec, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.lazy.LazyItemScopeImpl$animateItemPlacement$$inlined$debugInspectorInfo$1
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

    @Override // androidx.compose.foundation.lazy.g
    @dl.d
    public androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, final float f10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return nVar.s0(new ParentSizeModifier(f10, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.lazy.LazyItemScopeImpl$fillParentMaxHeight$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("fillParentMaxHeight");
                x0Var.e(Float.valueOf(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), null, this.maxHeightState, 4, null));
    }

    @Override // androidx.compose.foundation.lazy.g
    @dl.d
    public androidx.compose.ui.n c(@dl.d androidx.compose.ui.n nVar, final float f10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return nVar.s0(new ParentSizeModifier(f10, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.lazy.LazyItemScopeImpl$fillParentMaxWidth$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("fillParentMaxWidth");
                x0Var.e(Float.valueOf(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), this.maxWidthState, null, 8, null));
    }

    @Override // androidx.compose.foundation.lazy.g
    @dl.d
    public androidx.compose.ui.n d(@dl.d androidx.compose.ui.n nVar, final float f10) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        return nVar.s0(new ParentSizeModifier(f10, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.lazy.LazyItemScopeImpl$fillParentMaxSize$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("fillParentMaxSize");
                x0Var.e(Float.valueOf(f10));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), this.maxWidthState, this.maxHeightState));
    }

    public final void e(int i10, int i11) {
        this.maxWidthState.setValue(Integer.valueOf(i10));
        this.maxHeightState.setValue(Integer.valueOf(i11));
    }
}
