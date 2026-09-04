package androidx.compose.foundation;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.ScrollExtensionsKt;
import androidx.compose.foundation.gestures.ScrollableKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.RememberSaveableKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.InspectableValueKt;
import androidx.compose.ui.platform.x0;
import androidx.compose.ui.semantics.ScrollAxisRange;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.unit.LayoutDirection;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: Scroll.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a2\u0010\f\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u001a2\u0010\r\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u0007\u001a6\u0010\u0010\u001a\u00020\u0005*\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¨\u0006\u0011"}, d2 = {"", "initial", "Landroidx/compose/foundation/ScrollState;", ak.aF, "(ILandroidx/compose/runtime/p;II)Landroidx/compose/foundation/ScrollState;", "Landroidx/compose/ui/n;", "state", "", "enabled", "Landroidx/compose/foundation/gestures/g;", "flingBehavior", "reverseScrolling", "e", ak.av, "isScrollable", "isVertical", "d", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class ScrollKt {
    @dl.d
    public static final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n nVar, @dl.d ScrollState state, boolean z10, @dl.e androidx.compose.foundation.gestures.g gVar, boolean z11) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        return d(nVar, state, z11, gVar, z10, false);
    }

    public static /* synthetic */ androidx.compose.ui.n b(androidx.compose.ui.n nVar, ScrollState scrollState, boolean z10, androidx.compose.foundation.gestures.g gVar, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            gVar = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return a(nVar, scrollState, z10, gVar, z11);
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final ScrollState c(final int i10, @dl.e androidx.compose.runtime.p pVar, int i11, int i12) {
        pVar.T(-1464256199);
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if (ComposerKt.g0()) {
            ComposerKt.w0(-1464256199, i11, -1, "androidx.compose.foundation.rememberScrollState (Scroll.kt:69)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.e<ScrollState, ?> eVarA = ScrollState.INSTANCE.a();
        Integer numValueOf = Integer.valueOf(i10);
        pVar.T(1157296644);
        boolean zS = pVar.s(numValueOf);
        Object objU = pVar.U();
        if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = new yh.a<ScrollState>() { // from class: androidx.compose.foundation.ScrollKt$rememberScrollState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final ScrollState invoke() {
                    return new ScrollState(i10);
                }
            };
            pVar.N(objU);
        }
        pVar.c0();
        ScrollState scrollState = (ScrollState) RememberSaveableKt.d(objArr, eVarA, null, (yh.a) objU, pVar, 72, 4);
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return scrollState;
    }

    private static final androidx.compose.ui.n d(androidx.compose.ui.n nVar, final ScrollState scrollState, final boolean z10, final androidx.compose.foundation.gestures.g gVar, final boolean z11, final boolean z12) {
        return ComposedModifierKt.g(nVar, InspectableValueKt.e() ? new yh.l<x0, b2>() { // from class: androidx.compose.foundation.ScrollKt$scroll$$inlined$debugInspectorInfo$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d x0 x0Var) {
                kotlin.jvm.internal.f0.p(x0Var, "$this$null");
                x0Var.d(sd.b.f139393k);
                x0Var.getProperties().c("state", scrollState);
                x0Var.getProperties().c("reverseScrolling", Boolean.valueOf(z10));
                x0Var.getProperties().c("flingBehavior", gVar);
                x0Var.getProperties().c("isScrollable", Boolean.valueOf(z11));
                x0Var.getProperties().c("isVertical", Boolean.valueOf(z12));
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(x0 x0Var) {
                a(x0Var);
                return b2.f124493a;
            }
        } : InspectableValueKt.b(), new yh.q<androidx.compose.ui.n, androidx.compose.runtime.p, Integer, androidx.compose.ui.n>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(3);
            }

            @dl.d
            @androidx.compose.runtime.h
            public final androidx.compose.ui.n a(@dl.d androidx.compose.ui.n composed, @dl.e androidx.compose.runtime.p pVar, int i10) {
                kotlin.jvm.internal.f0.p(composed, "$this$composed");
                pVar.T(1478351300);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1478351300, i10, -1, "androidx.compose.foundation.scroll.<anonymous> (Scroll.kt:254)");
                }
                androidx.compose.foundation.gestures.n nVar2 = androidx.compose.foundation.gestures.n.f5788a;
                f0 f0VarB = nVar2.b(pVar, 6);
                pVar.T(773894976);
                pVar.T(-492369756);
                Object objU = pVar.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    androidx.compose.runtime.x xVar = new androidx.compose.runtime.x(EffectsKt.m(EmptyCoroutineContext.f124694b, pVar));
                    pVar.N(xVar);
                    objU = xVar;
                }
                pVar.c0();
                final q0 coroutineScope = ((androidx.compose.runtime.x) objU).getCoroutineScope();
                pVar.c0();
                androidx.compose.ui.n.Companion companion = androidx.compose.ui.n.INSTANCE;
                final boolean z13 = z10;
                final boolean z14 = z12;
                final boolean z15 = z11;
                final ScrollState scrollState2 = scrollState;
                androidx.compose.ui.n nVarC = SemanticsModifierKt.c(companion, false, new yh.l<androidx.compose.ui.semantics.r, b2>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.ui.semantics.r semantics) {
                        kotlin.jvm.internal.f0.p(semantics, "$this$semantics");
                        final ScrollState scrollState3 = scrollState2;
                        yh.a<Float> aVar = new yh.a<Float>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$1
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Float invoke() {
                                return Float.valueOf(scrollState3.m());
                            }
                        };
                        final ScrollState scrollState4 = scrollState2;
                        ScrollAxisRange scrollAxisRange = new ScrollAxisRange(aVar, new yh.a<Float>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$accessibilityScrollState$2
                            {
                                super(0);
                            }

                            @Override // yh.a
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Float invoke() {
                                return Float.valueOf(scrollState4.l());
                            }
                        }, z13);
                        if (z14) {
                            SemanticsPropertiesKt.A0(semantics, scrollAxisRange);
                        } else {
                            SemanticsPropertiesKt.i0(semantics, scrollAxisRange);
                        }
                        if (z15) {
                            final q0 q0Var = coroutineScope;
                            final boolean z16 = z14;
                            final ScrollState scrollState5 = scrollState2;
                            SemanticsPropertiesKt.Y(semantics, null, new yh.p<Float, Float, Boolean>() { // from class: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1.1

                                /* JADX INFO: renamed from: androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1, reason: invalid class name and collision with other inner class name */
                                /* JADX INFO: compiled from: Scroll.kt */
                                @Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
                                @kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.ScrollKt$scroll$2$semantics$1$1$1", f = "Scroll.kt", i = {}, l = {bb.c.b.f30853p2, bb.c.b.f30898r2}, m = "invokeSuspend", n = {}, s = {})
                                public static final class C00351 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {

                                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                                    int f5055b;

                                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                                    final /* synthetic */ boolean f5056c;

                                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                                    final /* synthetic */ ScrollState f5057d;

                                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                                    final /* synthetic */ float f5058e;

                                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                                    final /* synthetic */ float f5059f;

                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    C00351(boolean z10, ScrollState scrollState, float f10, float f11, kotlin.coroutines.c<? super C00351> cVar) {
                                        super(2, cVar);
                                        this.f5056c = z10;
                                        this.f5057d = scrollState;
                                        this.f5058e = f10;
                                        this.f5059f = f11;
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @dl.d
                                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                                        return new C00351(this.f5056c, this.f5057d, this.f5058e, this.f5059f, cVar);
                                    }

                                    @Override // yh.p
                                    @dl.e
                                    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                                        return ((C00351) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                                    }

                                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                                    @dl.e
                                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                                        Object objH = kotlin.coroutines.intrinsics.b.h();
                                        int i10 = this.f5055b;
                                        if (i10 == 0) {
                                            t0.n(obj);
                                            if (this.f5056c) {
                                                ScrollState scrollState = this.f5057d;
                                                kotlin.jvm.internal.f0.n(scrollState, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                                float f10 = this.f5058e;
                                                this.f5055b = 1;
                                                if (ScrollExtensionsKt.b(scrollState, f10, null, this, 2, null) == objH) {
                                                    return objH;
                                                }
                                            } else {
                                                ScrollState scrollState2 = this.f5057d;
                                                kotlin.jvm.internal.f0.n(scrollState2, "null cannot be cast to non-null type androidx.compose.foundation.gestures.ScrollableState");
                                                float f11 = this.f5059f;
                                                this.f5055b = 2;
                                                if (ScrollExtensionsKt.b(scrollState2, f11, null, this, 2, null) == objH) {
                                                    return objH;
                                                }
                                            }
                                        } else {
                                            if (i10 != 1 && i10 != 2) {
                                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                            }
                                            t0.n(obj);
                                        }
                                        return b2.f124493a;
                                    }
                                }

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(2);
                                }

                                @dl.d
                                public final Boolean a(float f10, float f11) {
                                    kotlinx.coroutines.k.f(q0Var, null, null, new C00351(z16, scrollState5, f11, f10, null), 3, null);
                                    return Boolean.TRUE;
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ Boolean invoke(Float f10, Float f11) {
                                    return a(f10.floatValue(), f11.floatValue());
                                }
                            }, 1, null);
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.ui.semantics.r rVar) {
                        a(rVar);
                        return b2.f124493a;
                    }
                }, 1, null);
                Orientation orientation = z12 ? Orientation.Vertical : Orientation.Horizontal;
                androidx.compose.ui.n nVarS0 = g0.a(j.a(nVarC, orientation), f0VarB).s0(ScrollableKt.i(companion, scrollState, orientation, f0VarB, z11, nVar2.c((LayoutDirection) pVar.K(CompositionLocalsKt.p()), orientation, z10), gVar, scrollState.getInternalInteractionSource())).s0(new ScrollingLayoutModifier(scrollState, z10, z12, f0VarB));
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
    public static final androidx.compose.ui.n e(@dl.d androidx.compose.ui.n nVar, @dl.d ScrollState state, boolean z10, @dl.e androidx.compose.foundation.gestures.g gVar, boolean z11) {
        kotlin.jvm.internal.f0.p(nVar, "<this>");
        kotlin.jvm.internal.f0.p(state, "state");
        return d(nVar, state, z11, gVar, z10, true);
    }

    public static /* synthetic */ androidx.compose.ui.n f(androidx.compose.ui.n nVar, ScrollState scrollState, boolean z10, androidx.compose.foundation.gestures.g gVar, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        if ((i10 & 4) != 0) {
            gVar = null;
        }
        if ((i10 & 8) != 0) {
            z11 = false;
        }
        return e(nVar, scrollState, z10, gVar, z11);
    }
}
