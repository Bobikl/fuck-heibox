package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyBeyondBoundsModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0001\n\u0002\b\u0002\u001a3\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\b\u0010\f\u001a\u00020\u000bH\u0002¨\u0006\r"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/lazy/i;", "beyondBoundsInfo", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "b", "(Landroidx/compose/ui/n;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/i;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/n;", "", ak.aF, "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class e {
    @dl.d
    @androidx.compose.runtime.h
    public static final androidx.compose.ui.n b(@dl.d androidx.compose.ui.n nVar, @dl.d LazyListState state, @dl.d i beyondBoundsInfo, boolean z10, @dl.d Orientation orientation, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(nVar, "<this>");
        f0.p(state, "state");
        f0.p(beyondBoundsInfo, "beyondBoundsInfo");
        f0.p(orientation, "orientation");
        pVar.T(422980645);
        if (ComposerKt.g0()) {
            ComposerKt.w0(422980645, i10, -1, "androidx.compose.foundation.lazy.lazyListBeyondBoundsModifier (LazyBeyondBoundsModifier.kt:45)");
        }
        LayoutDirection layoutDirection = (LayoutDirection) pVar.K(CompositionLocalsKt.p());
        Object[] objArr = {state, beyondBoundsInfo, Boolean.valueOf(z10), layoutDirection, orientation};
        pVar.T(-568225417);
        boolean zS = false;
        for (int i11 = 0; i11 < 5; i11++) {
            zS |= pVar.s(objArr[i11]);
        }
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new j(state, beyondBoundsInfo, z10, layoutDirection, orientation);
            pVar.N(objU);
        }
        pVar.c0();
        androidx.compose.ui.n nVarS0 = nVar.s0((androidx.compose.ui.n) objU);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return nVarS0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void c() {
        throw new IllegalStateException("Lazy list does not support beyond bounds layout for the specified direction".toString());
    }
}
