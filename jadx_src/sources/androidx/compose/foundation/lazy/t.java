package androidx.compose.foundation.lazy;

import androidx.compose.runtime.ComposerKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyListPinningModifier.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/lazy/i;", "beyondBoundsInfo", ak.av, "(Landroidx/compose/ui/n;Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/i;Landroidx/compose/runtime/p;I)Landroidx/compose/ui/n;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class t {
    @dl.d
    @androidx.compose.runtime.h
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d LazyListState state, @dl.d i beyondBoundsInfo, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(nVar, "<this>");
        f0.p(state, "state");
        f0.p(beyondBoundsInfo, "beyondBoundsInfo");
        pVar.T(854917725);
        if (ComposerKt.g0()) {
            ComposerKt.w0(854917725, i10, -1, "androidx.compose.foundation.lazy.lazyListPinningModifier (LazyListPinningModifier.kt:34)");
        }
        int i11 = androidx.compose.runtime.collection.e.f12643e;
        pVar.T(511388516);
        boolean zS = pVar.s(state) | pVar.s(beyondBoundsInfo);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new s(state, beyondBoundsInfo);
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
}
