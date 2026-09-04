package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import com.umeng.analytics.pro.ak;
import fi.u;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyNearestItemsRange.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a?\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a \u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0001H\u0002¨\u0006\u000b"}, d2 = {"Lkotlin/Function0;", "", "firstVisibleItemIndex", "slidingWindowSize", "extraItemCount", "Landroidx/compose/runtime/m2;", "Lfi/l;", ak.aF, "(Lyh/a;Lyh/a;Lyh/a;Landroidx/compose/runtime/p;I)Landroidx/compose/runtime/m2;", "firstVisibleItem", "b", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyNearestItemsRangeKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final fi.l b(int i10, int i11, int i12) {
        int i13 = (i10 / i11) * i11;
        return u.W1(Math.max(i13 - i12, 0), i13 + i11 + i12);
    }

    @androidx.compose.foundation.t
    @dl.d
    @androidx.compose.runtime.h
    public static final m2<fi.l> c(@dl.d yh.a<Integer> firstVisibleItemIndex, @dl.d yh.a<Integer> slidingWindowSize, @dl.d yh.a<Integer> extraItemCount, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(firstVisibleItemIndex, "firstVisibleItemIndex");
        f0.p(slidingWindowSize, "slidingWindowSize");
        f0.p(extraItemCount, "extraItemCount");
        pVar.T(429733345);
        if (ComposerKt.g0()) {
            ComposerKt.w0(429733345, i10, -1, "androidx.compose.foundation.lazy.layout.rememberLazyNearestItemsRangeState (LazyNearestItemsRange.kt:41)");
        }
        pVar.T(1618982084);
        boolean zS = pVar.s(firstVisibleItemIndex) | pVar.s(slidingWindowSize) | pVar.s(extraItemCount);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            androidx.compose.runtime.snapshots.f fVarA = androidx.compose.runtime.snapshots.f.INSTANCE.a();
            try {
                androidx.compose.runtime.snapshots.f fVarP = fVarA.p();
                try {
                    Object objG = h2.g(b(firstVisibleItemIndex.invoke().intValue(), slidingWindowSize.invoke().intValue(), extraItemCount.invoke().intValue()), null, 2, null);
                    fVarA.w(fVarP);
                    fVarA.d();
                    pVar.N(objG);
                    objU = objG;
                } catch (Throwable th2) {
                    fVarA.w(fVarP);
                    throw th2;
                }
            } catch (Throwable th3) {
                fVarA.d();
                throw th3;
            }
        }
        pVar.c0();
        a1 a1Var = (a1) objU;
        Object[] objArr = {firstVisibleItemIndex, slidingWindowSize, extraItemCount, a1Var};
        pVar.T(-568225417);
        boolean zS2 = false;
        for (int i11 = 0; i11 < 4; i11++) {
            zS2 |= pVar.s(objArr[i11]);
        }
        Object objU2 = pVar.U();
        if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
            objU2 = new LazyNearestItemsRangeKt$rememberLazyNearestItemsRangeState$1$1(firstVisibleItemIndex, slidingWindowSize, extraItemCount, a1Var, null);
            pVar.N(objU2);
        }
        pVar.c0();
        EffectsKt.h(a1Var, (yh.p) objU2, pVar, 64);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return a1Var;
    }
}
