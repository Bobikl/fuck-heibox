package androidx.compose.foundation.lazy.layout;

import android.view.View;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import androidx.compose.ui.layout.SubcomposeLayoutState;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyLayoutPrefetcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/o;", "prefetchState", "Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;", "itemContentFactory", "Landroidx/compose/ui/layout/SubcomposeLayoutState;", "subcomposeLayoutState", "Lkotlin/b2;", ak.av, "(Landroidx/compose/foundation/lazy/layout/o;Landroidx/compose/foundation/lazy/layout/LazyLayoutItemContentFactory;Landroidx/compose/ui/layout/SubcomposeLayoutState;Landroidx/compose/runtime/p;I)V", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyLayoutPrefetcher_androidKt {
    @androidx.compose.foundation.t
    @androidx.compose.runtime.h
    public static final void a(@dl.d final o prefetchState, @dl.d final LazyLayoutItemContentFactory itemContentFactory, @dl.d final SubcomposeLayoutState subcomposeLayoutState, @dl.e androidx.compose.runtime.p pVar, final int i10) {
        f0.p(prefetchState, "prefetchState");
        f0.p(itemContentFactory, "itemContentFactory");
        f0.p(subcomposeLayoutState, "subcomposeLayoutState");
        androidx.compose.runtime.p pVarF = pVar.F(1113453182);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1113453182, i10, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher (LazyLayoutPrefetcher.android.kt:35)");
        }
        View view = (View) pVarF.K(AndroidCompositionLocals_androidKt.k());
        int i11 = SubcomposeLayoutState.f14963f;
        pVarF.T(1618982084);
        boolean zS = pVarF.s(subcomposeLayoutState) | pVarF.s(prefetchState) | pVarF.s(view);
        Object objU = pVarF.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            pVarF.N(new p(prefetchState, subcomposeLayoutState, itemContentFactory, view));
        }
        pVarF.c0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher_androidKt$LazyLayoutPrefetcher$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i12) {
                LazyLayoutPrefetcher_androidKt.a(prefetchState, itemContentFactory, subcomposeLayoutState, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
