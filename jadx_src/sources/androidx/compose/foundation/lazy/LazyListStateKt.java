package androidx.compose.foundation.lazy;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: LazyListState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "Landroidx/compose/foundation/lazy/LazyListState;", ak.av, "(IILandroidx/compose/runtime/p;II)Landroidx/compose/foundation/lazy/LazyListState;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyListStateKt {
    @dl.d
    @androidx.compose.runtime.h
    public static final LazyListState a(final int i10, final int i11, @dl.e androidx.compose.runtime.p pVar, int i12, int i13) {
        pVar.T(1470655220);
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(1470655220, i12, -1, "androidx.compose.foundation.lazy.rememberLazyListState (LazyListState.kt:58)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.e<LazyListState, ?> eVarA = LazyListState.INSTANCE.a();
        Integer numValueOf = Integer.valueOf(i10);
        Integer numValueOf2 = Integer.valueOf(i11);
        pVar.T(511388516);
        boolean zS = pVar.s(numValueOf) | pVar.s(numValueOf2);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new yh.a<LazyListState>() { // from class: androidx.compose.foundation.lazy.LazyListStateKt$rememberLazyListState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final LazyListState invoke() {
                    return new LazyListState(i10, i11);
                }
            };
            pVar.N(objU);
        }
        pVar.c0();
        LazyListState lazyListState = (LazyListState) RememberSaveableKt.d(objArr, eVarA, null, (yh.a) objU, pVar, 72, 4);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return lazyListState;
    }
}
