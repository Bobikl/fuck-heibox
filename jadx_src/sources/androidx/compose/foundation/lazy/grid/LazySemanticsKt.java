package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazySemantics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/lazy/grid/LazyGridState;", "state", "Landroidx/compose/foundation/lazy/layout/i;", "itemProvider", "", "reverseScrolling", "Landroidx/compose/foundation/lazy/layout/q;", ak.av, "(Landroidx/compose/foundation/lazy/grid/LazyGridState;Landroidx/compose/foundation/lazy/layout/i;ZLandroidx/compose/runtime/p;I)Landroidx/compose/foundation/lazy/layout/q;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazySemanticsKt {
    @dl.d
    @androidx.compose.runtime.h
    public static final androidx.compose.foundation.lazy.layout.q a(@dl.d final LazyGridState state, @dl.d final androidx.compose.foundation.lazy.layout.i itemProvider, final boolean z10, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(state, "state");
        f0.p(itemProvider, "itemProvider");
        pVar.T(-1950437665);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1950437665, i10, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridSemanticState (LazySemantics.kt:30)");
        }
        Boolean boolValueOf = Boolean.valueOf(z10);
        pVar.T(1618982084);
        boolean zS = pVar.s(boolValueOf) | pVar.s(state) | pVar.s(itemProvider);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new androidx.compose.foundation.lazy.layout.q() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1
                @Override // androidx.compose.foundation.lazy.layout.q
                @dl.e
                public Object a(int i11, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    Object objE = LazyGridState.E(state, i11, 0, cVar, 2, null);
                    return objE == kotlin.coroutines.intrinsics.b.h() ? objE : b2.f124493a;
                }

                @Override // androidx.compose.foundation.lazy.layout.q
                @dl.d
                public ScrollAxisRange b() {
                    final LazyGridState lazyGridState = state;
                    yh.a<Float> aVar = new yh.a<Float>() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1$scrollAxisRange$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Float invoke() {
                            return Float.valueOf(lazyGridState.m() + (lazyGridState.n() / 100000.0f));
                        }
                    };
                    final LazyGridState lazyGridState2 = state;
                    final androidx.compose.foundation.lazy.layout.i iVar = itemProvider;
                    return new ScrollAxisRange(aVar, new yh.a<Float>() { // from class: androidx.compose.foundation.lazy.grid.LazySemanticsKt$rememberLazyGridSemanticState$1$1$scrollAxisRange$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Float invoke() {
                            float fM;
                            float fN;
                            if (lazyGridState2.getCanScrollForward()) {
                                fM = iVar.a();
                                fN = 1.0f;
                            } else {
                                fM = lazyGridState2.m();
                                fN = lazyGridState2.n() / 100000.0f;
                            }
                            return Float.valueOf(fM + fN);
                        }
                    }, z10);
                }

                @Override // androidx.compose.foundation.lazy.layout.q
                @dl.e
                public Object c(float f10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    Object objB = ScrollExtensionsKt.b(state, f10, null, cVar, 2, null);
                    return objB == kotlin.coroutines.intrinsics.b.h() ? objB : b2.f124493a;
                }

                @Override // androidx.compose.foundation.lazy.layout.q
                @dl.d
                public androidx.compose.ui.semantics.b d() {
                    return new androidx.compose.ui.semantics.b(-1, -1);
                }
            };
            pVar.N(objU);
        }
        pVar.c0();
        LazySemanticsKt$rememberLazyGridSemanticState$1$1 lazySemanticsKt$rememberLazyGridSemanticState$1$1 = (LazySemanticsKt$rememberLazyGridSemanticState$1$1) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return lazySemanticsKt$rememberLazyGridSemanticState$1$1;
    }
}
