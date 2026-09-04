package androidx.compose.foundation.gestures;

import androidx.compose.foundation.FocusableKt;
import androidx.compose.foundation.f0;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.x;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher;
import androidx.compose.ui.input.nestedscroll.NestedScrollModifierKt;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.input.pointer.m0;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aF\u0010\f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u001aR\u0010\u000f\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0007\u001aQ\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0010\u001a\u00020\u00012\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\"\u0010\u0018\u001a\u00020\u0000*\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0002\u001a\u0017\u0010\u001b\u001a\u00020\u001a*\u00020\u0019H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001e\u0010\u001f\u001a\u00020\u001e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0002\"\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"\" \u0010)\u001a\b\u0012\u0004\u0012\u00020\u00050$8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006*"}, d2 = {"Landroidx/compose/ui/n;", "Landroidx/compose/foundation/gestures/p;", "state", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "", "enabled", "reverseDirection", "Landroidx/compose/foundation/gestures/g;", "flingBehavior", "Landroidx/compose/foundation/interaction/g;", "interactionSource", "j", "Landroidx/compose/foundation/f0;", "overscrollEffect", "i", "controller", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/ui/n;Landroidx/compose/foundation/interaction/g;Landroidx/compose/foundation/gestures/Orientation;ZLandroidx/compose/foundation/gestures/p;Landroidx/compose/foundation/gestures/g;Landroidx/compose/foundation/f0;ZLandroidx/compose/runtime/p;I)Landroidx/compose/ui/n;", "Landroidx/compose/runtime/m2;", "Landroidx/compose/foundation/gestures/ScrollingLogic;", "scrollingLogicState", "Landroidx/compose/foundation/gestures/l;", "mouseWheelScrollConfig", "g", "Landroidx/compose/ui/input/pointer/d;", "Landroidx/compose/ui/input/pointer/p;", "e", "(Landroidx/compose/ui/input/pointer/d;Lkotlin/coroutines/c;)Ljava/lang/Object;", "scrollLogic", "Landroidx/compose/ui/input/nestedscroll/b;", "m", "Landroidx/compose/foundation/gestures/m;", ak.av, "Landroidx/compose/foundation/gestures/m;", "NoOpScrollScope", "Landroidx/compose/ui/modifier/p;", "b", "Landroidx/compose/ui/modifier/p;", "f", "()Landroidx/compose/ui/modifier/p;", "ModifierLocalScrollableContainer", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class ScrollableKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final m f5524a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final androidx.compose.ui.modifier.p<Boolean> f5525b = androidx.compose.ui.modifier.g.a(new yh.a<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$ModifierLocalScrollableContainer$1
        @Override // yh.a
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    });

    /* JADX INFO: compiled from: Scrollable.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0005"}, d2 = {"androidx/compose/foundation/gestures/ScrollableKt$a", "Landroidx/compose/foundation/gestures/m;", "", "pixels", ak.av, "foundation_release"}, k = 1, mv = {1, 7, 1})
    public static final class a implements m {
        a() {
        }

        @Override // androidx.compose.foundation.gestures.m
        public float a(float pixels) {
            return pixels;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0043 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0056 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0041 -> B:18:0x0044). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object e(androidx.compose.ui.input.pointer.d r5, kotlin.coroutines.c<? super androidx.compose.ui.input.pointer.p> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = (androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1) r0
            int r1 = r0.f5529d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5529d = r1
            goto L18
        L13:
            androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1 r0 = new androidx.compose.foundation.gestures.ScrollableKt$awaitScrollEvent$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f5528c
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.h()
            int r2 = r0.f5529d
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f5527b
            androidx.compose.ui.input.pointer.d r5 = (androidx.compose.ui.input.pointer.d) r5
            kotlin.t0.n(r6)
            goto L44
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.t0.n(r6)
        L38:
            r0.f5527b = r5
            r0.f5529d = r3
            r6 = 0
            java.lang.Object r6 = androidx.compose.ui.input.pointer.c.t(r5, r6, r0, r3, r6)
            if (r6 != r1) goto L44
            return r1
        L44:
            androidx.compose.ui.input.pointer.p r6 = (androidx.compose.ui.input.pointer.p) r6
            int r2 = r6.getType()
            androidx.compose.ui.input.pointer.r$a r4 = androidx.compose.ui.input.pointer.r.INSTANCE
            int r4 = r4.f()
            boolean r2 = androidx.compose.ui.input.pointer.r.k(r2, r4)
            if (r2 == 0) goto L38
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.ScrollableKt.e(androidx.compose.ui.input.pointer.d, kotlin.coroutines.c):java.lang.Object");
    }

    @dl.d
    public static final androidx.compose.ui.modifier.p<Boolean> f() {
        return f5525b;
    }

    private static final androidx.compose.ui.n g(androidx.compose.ui.n nVar, m2<ScrollingLogic> m2Var, l lVar) {
        return SuspendingPointerInputFilterKt.b(nVar, m2Var, lVar, new ScrollableKt$mouseWheelScroll$1(lVar, m2Var, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.h
    public static final androidx.compose.ui.n h(androidx.compose.ui.n nVar, androidx.compose.foundation.interaction.g gVar, Orientation orientation, boolean z10, p pVar, g gVar2, f0 f0Var, boolean z11, androidx.compose.runtime.p pVar2, int i10) {
        pVar2.T(-2012025036);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-2012025036, i10, -1, "androidx.compose.foundation.gestures.pointerScrollable (Scrollable.kt:239)");
        }
        pVar2.T(-1730186366);
        g gVarA = gVar2 == null ? n.f5788a.a(pVar2, 6) : gVar2;
        pVar2.c0();
        pVar2.T(-492369756);
        Object objU = pVar2.U();
        androidx.compose.runtime.p.Companion companion = androidx.compose.runtime.p.INSTANCE;
        if (objU == companion.a()) {
            objU = h2.g(new NestedScrollDispatcher(), null, 2, null);
            pVar2.N(objU);
        }
        pVar2.c0();
        a1 a1Var = (a1) objU;
        final m2 m2VarT = e2.t(new ScrollingLogic(orientation, z10, a1Var, pVar, gVarA, f0Var), pVar2, 0);
        Object objValueOf = Boolean.valueOf(z11);
        pVar2.T(1157296644);
        boolean zS = pVar2.s(objValueOf);
        Object objU2 = pVar2.U();
        if (zS || objU2 == companion.a()) {
            objU2 = m(m2VarT, z11);
            pVar2.N(objU2);
        }
        pVar2.c0();
        androidx.compose.ui.input.nestedscroll.b bVar = (androidx.compose.ui.input.nestedscroll.b) objU2;
        pVar2.T(-492369756);
        Object objU3 = pVar2.U();
        if (objU3 == companion.a()) {
            objU3 = new ScrollDraggableState(m2VarT);
            pVar2.N(objU3);
        }
        pVar2.c0();
        ScrollDraggableState scrollDraggableState = (ScrollDraggableState) objU3;
        l lVarA = b.a(pVar2, 0);
        ScrollableKt$pointerScrollable$1 scrollableKt$pointerScrollable$1 = new yh.l<PointerInputChange, Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d PointerInputChange down) {
                kotlin.jvm.internal.f0.p(down, "down");
                return Boolean.valueOf(!m0.i(down.getType(), m0.INSTANCE.b()));
            }
        };
        pVar2.T(1157296644);
        boolean zS2 = pVar2.s(m2VarT);
        Object objU4 = pVar2.U();
        if (zS2 || objU4 == companion.a()) {
            objU4 = new yh.a<Boolean>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$pointerScrollable$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(m2VarT.getValue().p());
                }
            };
            pVar2.N(objU4);
        }
        pVar2.c0();
        yh.a aVar = (yh.a) objU4;
        pVar2.T(511388516);
        boolean zS3 = pVar2.s(a1Var) | pVar2.s(m2VarT);
        Object objU5 = pVar2.U();
        if (zS3 || objU5 == companion.a()) {
            objU5 = new ScrollableKt$pointerScrollable$3$1(a1Var, m2VarT, null);
            pVar2.N(objU5);
        }
        pVar2.c0();
        androidx.compose.ui.n nVarA = NestedScrollModifierKt.a(g(DraggableKt.i(nVar, scrollDraggableState, scrollableKt$pointerScrollable$1, orientation, (64 & 8) != 0 ? true : z11, (64 & 16) != 0 ? null : gVar, aVar, (64 & 64) != 0 ? new DraggableKt$draggable$6(null) : null, (64 & 128) != 0 ? new DraggableKt$draggable$7(null) : (yh.q) objU5, (64 & 256) != 0 ? false : false), m2VarT, lVarA), bVar, (NestedScrollDispatcher) a1Var.getValue());
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar2.c0();
        return nVarA;
    }

    @androidx.compose.foundation.t
    @dl.d
    public static final androidx.compose.ui.n i(@dl.d androidx.compose.ui.n nVar, @dl.d final p state, @dl.d final Orientation orientation, @dl.e final f0 f0Var, final boolean z10, final boolean z11, @dl.e final g gVar, @dl.e final androidx.compose.foundation.interaction.g gVar2) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(orientation, "orientation");
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$scrollable$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d("scrollable");
                x0Var.getProperties().c("orientation", orientation);
                x0Var.getProperties().c("state", state);
                x0Var.getProperties().c("overscrollEffect", f0Var);
                x0Var.getProperties().c("enabled", Boolean.valueOf(z10));
                x0Var.getProperties().c("reverseDirection", Boolean.valueOf(z11));
                x0Var.getProperties().c("flingBehavior", gVar);
                x0Var.getProperties().c("interactionSource", gVar2);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.gestures.ScrollableKt$scrollable$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(-629830927);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-629830927, i10, -1, "androidx.compose.foundation.gestures.scrollable.<anonymous> (Scrollable.kt:153)");
                }
                pVar.T(773894976);
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    Object xVar = new x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar));
                    pVar.N(xVar);
                    objU = xVar;
                }
                pVar.c0();
                q0 coroutineScope = ((x) objU).getCoroutineScope();
                pVar.c0();
                Object[] objArr = {coroutineScope, orientation, state, Boolean.valueOf(z11)};
                Orientation orientation2 = orientation;
                p pVar2 = state;
                boolean z12 = z11;
                pVar.T(-568225417);
                boolean zS = false;
                for (int i11 = 0; i11 < 4; i11++) {
                    zS |= pVar.s(objArr[i11]);
                }
                Object objU2 = pVar.U();
                if (zS || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU2 = new ContentInViewModifier(coroutineScope, orientation2, pVar2, z12);
                    pVar.N(objU2);
                }
                pVar.c0();
                androidx.compose.ui.n nVar2 = androidx.compose.ui.n.INSTANCE;
                androidx.compose.ui.n nVarH = ScrollableKt.h(FocusableKt.b(nVar2).s0(((ContentInViewModifier) objU2).r()), gVar2, orientation, z11, state, gVar, f0Var, z10, pVar, 0);
                if (z10) {
                    nVar2 = h.f5785b;
                }
                androidx.compose.ui.n nVarS0 = nVarH.s0(nVar2);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVar.c0();
                return nVarS0;
            }

            @Override // yh.q
            public /* bridge */ /* synthetic */ androidx.compose.ui.n invoke(androidx.compose.ui.n nVar2, androidx.compose.runtime.p pVar, Integer num) {
                return a(nVar2, pVar, num.intValue());
            }
        });
    }

    @dl.d
    public static final androidx.compose.ui.n j(@dl.d androidx.compose.ui.n nVar, @dl.d p state, @dl.d Orientation orientation, boolean z10, boolean z11, @dl.e g gVar, @dl.e androidx.compose.foundation.interaction.g gVar2) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        kotlin.jvm.internal.f0.p(orientation, "orientation");
        return i(nVar, state, orientation, null, z10, z11, gVar, gVar2);
    }

    public static /* synthetic */ androidx.compose.ui.n l(androidx.compose.ui.n nVar, p pVar, Orientation orientation, boolean z10, boolean z11, g gVar, androidx.compose.foundation.interaction.g gVar2, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        boolean z12 = z10;
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return j(nVar, pVar, orientation, z12, z11, (i10 & 16) != 0 ? null : gVar, (i10 & 32) != 0 ? null : gVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.input.nestedscroll.b m(m2<ScrollingLogic> m2Var, boolean z10) {
        return new ScrollableKt$scrollableNestedScrollConnection$1(m2Var, z10);
    }
}
