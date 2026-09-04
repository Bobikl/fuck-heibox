package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.semantics.ScrollAxisRange;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazySemantics.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Landroidx/compose/foundation/lazy/LazyListState;", "state", "Landroidx/compose/foundation/lazy/layout/i;", "itemProvider", "", "reverseScrolling", "isVertical", "Landroidx/compose/foundation/lazy/layout/q;", ak.av, "(Landroidx/compose/foundation/lazy/LazyListState;Landroidx/compose/foundation/lazy/layout/i;ZZLandroidx/compose/runtime/p;I)Landroidx/compose/foundation/lazy/layout/q;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazySemanticsKt {
    @dl.d
    @androidx.compose.runtime.h
    public static final androidx.compose.foundation.lazy.layout.q a(@dl.d final LazyListState state, @dl.d final androidx.compose.foundation.lazy.layout.i itemProvider, final boolean z10, final boolean z11, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(state, "state");
        f0.p(itemProvider, "itemProvider");
        pVar.T(1624527721);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1624527721, i10, -1, "androidx.compose.foundation.lazy.rememberLazyListSemanticState (LazySemantics.kt:30)");
        }
        Object[] objArr = {state, itemProvider, Boolean.valueOf(z10), Boolean.valueOf(z11)};
        pVar.T(-568225417);
        boolean zS = false;
        for (int i11 = 0; i11 < 4; i11++) {
            zS |= pVar.s(objArr[i11]);
        }
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new androidx.compose.foundation.lazy.layout.q() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt$rememberLazyListSemanticState$1$1
                @Override // androidx.compose.foundation.lazy.layout.q
                @dl.e
                public Object a(int i12, @dl.d kotlin.coroutines.c<? super b2> cVar) {
                    Object objC = LazyListState.C(state, i12, 0, cVar, 2, null);
                    return objC == kotlin.coroutines.intrinsics.b.h() ? objC : b2.f124493a;
                }

                @Override // androidx.compose.foundation.lazy.layout.q
                @dl.d
                public ScrollAxisRange b() {
                    final LazyListState lazyListState = state;
                    yh.a<Float> aVar = new yh.a<Float>() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt$rememberLazyListSemanticState$1$1$scrollAxisRange$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Float invoke() {
                            return Float.valueOf(lazyListState.m() + (lazyListState.n() / 100000.0f));
                        }
                    };
                    final LazyListState lazyListState2 = state;
                    final androidx.compose.foundation.lazy.layout.i iVar = itemProvider;
                    return new ScrollAxisRange(aVar, new yh.a<Float>() { // from class: androidx.compose.foundation.lazy.LazySemanticsKt$rememberLazyListSemanticState$1$1$scrollAxisRange$2
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
                            if (lazyListState2.getCanScrollForward()) {
                                fM = iVar.a();
                                fN = 1.0f;
                            } else {
                                fM = lazyListState2.m();
                                fN = lazyListState2.n() / 100000.0f;
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
                    return z11 ? new androidx.compose.ui.semantics.b(-1, 1) : new androidx.compose.ui.semantics.b(1, -1);
                }
            };
            pVar.N(objU);
        }
        pVar.c0();
        LazySemanticsKt$rememberLazyListSemanticState$1$1 lazySemanticsKt$rememberLazyListSemanticState$1$1 = (LazySemanticsKt$rememberLazyListSemanticState$1$1) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return lazySemanticsKt$rememberLazyListSemanticState$1$1;
    }
}
