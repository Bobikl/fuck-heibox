package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.g0;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.m0;
import androidx.compose.foundation.lazy.layout.LazyLayoutKt;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemanticsKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.u1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: LazyStaggeredGrid.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0001\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u001d\u0010\t\u001a\u0019\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004¢\u0006\u0002\b\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\u0017\u0010\u001a\u001a\u0013\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00190\u0017¢\u0006\u0002\b\bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u001f\u001a\u00020\u00192\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Lkotlin/Function2;", "Ls1/e;", "Ls1/b;", "", "Lkotlin/t;", "slotSizesSums", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/foundation/layout/m0;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/g;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/layout/Arrangement$l;", "verticalArrangement", "Landroidx/compose/foundation/layout/Arrangement$d;", "horizontalArrangement", "Lkotlin/Function1;", "Landroidx/compose/foundation/lazy/staggeredgrid/o;", "Lkotlin/b2;", "content", ak.av, "(Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/foundation/gestures/Orientation;Lyh/p;Landroidx/compose/ui/n;Landroidx/compose/foundation/layout/m0;ZLandroidx/compose/foundation/gestures/g;ZLandroidx/compose/foundation/layout/Arrangement$l;Landroidx/compose/foundation/layout/Arrangement$d;Lyh/l;Landroidx/compose/runtime/p;III)V", "Landroidx/compose/foundation/lazy/layout/i;", "itemProvider", "b", "(Landroidx/compose/foundation/lazy/layout/i;Landroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridState;Landroidx/compose/runtime/p;I)V", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class LazyStaggeredGridKt {
    @androidx.compose.foundation.t
    @androidx.compose.runtime.k(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.h
    public static final void a(@dl.d final LazyStaggeredGridState state, @dl.d final Orientation orientation, @dl.d final yh.p<? super s1.e, ? super s1.b, int[]> slotSizesSums, @dl.e androidx.compose.ui.n nVar, @dl.e m0 m0Var, boolean z10, @dl.e androidx.compose.foundation.gestures.g gVar, boolean z11, @dl.e Arrangement.l lVar, @dl.e Arrangement.d dVar, @dl.d final yh.l<? super o, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11, final int i12) {
        androidx.compose.foundation.gestures.g gVarA;
        int i13;
        f0.p(state, "state");
        f0.p(orientation, "orientation");
        f0.p(slotSizesSums, "slotSizesSums");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(845690866);
        androidx.compose.ui.n nVar2 = (i12 & 8) != 0 ? androidx.compose.ui.n.INSTANCE : nVar;
        m0 m0VarA = (i12 & 16) != 0 ? PaddingKt.a(s1.h.g(0)) : m0Var;
        boolean z12 = (i12 & 32) != 0 ? false : z10;
        if ((i12 & 64) != 0) {
            gVarA = androidx.compose.foundation.gestures.n.f5788a.a(pVarF, 6);
            i13 = i10 & (-3670017);
        } else {
            gVarA = gVar;
            i13 = i10;
        }
        boolean z13 = (i12 & 128) != 0 ? true : z11;
        Arrangement.l lVarR = (i12 & 256) != 0 ? Arrangement.f5896a.r() : lVar;
        Arrangement.d dVarP = (i12 & 512) != 0 ? Arrangement.f5896a.p() : dVar;
        if (ComposerKt.g0()) {
            ComposerKt.w0(845690866, i13, i11, "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGrid (LazyStaggeredGrid.kt:39)");
        }
        androidx.compose.foundation.gestures.n nVar3 = androidx.compose.foundation.gestures.n.f5788a;
        androidx.compose.foundation.f0 f0VarB = nVar3.b(pVarF, 6);
        androidx.compose.foundation.lazy.layout.i iVarA = LazyStaggeredGridItemProviderKt.a(state, content, pVarF, ((i11 << 3) & 112) | 8);
        int i14 = i13 >> 6;
        int i15 = i13 >> 9;
        final boolean z14 = z12;
        final androidx.compose.ui.n nVar4 = nVar2;
        yh.p<androidx.compose.foundation.lazy.layout.m, s1.b, k> pVarF2 = LazyStaggeredGridMeasurePolicyKt.f(state, iVarA, m0VarA, z12, orientation, lVarR, dVarP, slotSizesSums, f0VarB, pVarF, (i14 & bb.c.g.f32954lc) | (i14 & bb.c.b.f30796me) | 8 | ((i13 << 9) & 57344) | (458752 & i15) | (3670016 & i15) | ((i13 << 15) & 29360128));
        androidx.compose.foundation.lazy.layout.q qVarA = LazyStaggeredGridSemanticsKt.a(state, iVarA, z14, pVarF, (i15 & bb.c.b.f30796me) | 8);
        b(iVarA, state, pVarF, 64);
        LazyLayoutKt.a(iVarA, LazyLayoutSemanticsKt.a(ScrollableKt.i(g0.a(androidx.compose.foundation.j.a(nVar4.s0(state.getRemeasurementModifier()), orientation), f0VarB), state, orientation, f0VarB, z13, nVar3.c((LayoutDirection) pVarF.K(CompositionLocalsKt.p()), orientation, z14), gVarA, state.getMutableInteractionSource()), iVarA, qVarA, orientation, z13, pVarF, ((i13 << 6) & bb.c.g.f32954lc) | (i15 & 57344)), state.getPrefetchState(), pVarF2, pVarF, 0, 0);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        final m0 m0Var2 = m0VarA;
        final androidx.compose.foundation.gestures.g gVar2 = gVarA;
        final boolean z15 = z13;
        final Arrangement.l lVar2 = lVarR;
        final Arrangement.d dVar2 = dVarP;
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$LazyStaggeredGrid$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i16) {
                LazyStaggeredGridKt.a(state, orientation, slotSizesSums, nVar4, m0Var2, z14, gVar2, z15, lVar2, dVar2, content, pVar2, i10 | 1, i11, i12);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.h
    public static final void b(final androidx.compose.foundation.lazy.layout.i iVar, final LazyStaggeredGridState lazyStaggeredGridState, androidx.compose.runtime.p pVar, final int i10) {
        androidx.compose.runtime.p pVarF = pVar.F(231106410);
        if (ComposerKt.g0()) {
            ComposerKt.w0(231106410, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.ScrollPositionUpdater (LazyStaggeredGrid.kt:114)");
        }
        if (iVar.a() > 0) {
            lazyStaggeredGridState.N(iVar);
        }
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        u1 u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridKt$ScrollPositionUpdater$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i11) {
                LazyStaggeredGridKt.b(iVar, lazyStaggeredGridState, pVar2, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }
}
