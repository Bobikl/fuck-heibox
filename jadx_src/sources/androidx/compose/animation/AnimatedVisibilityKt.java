package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.r0;
import androidx.compose.foundation.layout.x0;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.a1;
import androidx.compose.runtime.h2;
import androidx.compose.runtime.u1;
import androidx.compose.runtime.v1;
import androidx.compose.ui.layout.LayoutKt;
import androidx.compose.ui.layout.i0;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.d2;
import androidx.compose.ui.unit.LayoutDirection;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.s0;

/* JADX INFO: compiled from: AnimatedVisibility.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a]\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001aa\u0010\u0013\u001a\u00020\f*\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001aa\u0010\u0016\u001a\u00020\f*\u00020\u00152\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001ac\u0010\u001a\u001a\u00020\f2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001ag\u0010\u001c\u001a\u00020\f*\u00020\u00122\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001ag\u0010\u001e\u001a\u00020\f*\u00020\u00152\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00000\u00182\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001ao\u0010\"\u001a\u00020\f\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0007¢\u0006\u0004\b\"\u0010#\u001aL\u0010&\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u00002\u0011\u0010\u000f\u001a\r\u0012\u0004\u0012\u00020\f0%¢\u0006\u0002\b\rH\u0007¢\u0006\u0004\b&\u0010'\u001am\u0010)\u001a\u00020\f\"\u0004\b\u0000\u0010 2\f\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0003¢\u0006\u0004\b)\u0010*\u001aT\u0010,\u001a\u00020\f2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020+0!2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u001c\u0010\u000f\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0002\b\r¢\u0006\u0002\b\u000eH\u0083\b¢\u0006\u0004\b,\u0010-\u001a;\u0010/\u001a\u00020+\"\u0004\b\u0000\u0010 *\b\u0012\u0004\u0012\u00028\u00000!2\u0012\u0010\u0001\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00000\n2\u0006\u0010.\u001a\u00028\u0000H\u0003¢\u0006\u0004\b/\u00100¨\u00061"}, d2 = {"", "visible", "Landroidx/compose/ui/n;", "modifier", "Landroidx/compose/animation/f;", "enter", "Landroidx/compose/animation/h;", com.alipay.sdk.m.x.d.A, "", BasePuzzleInfo.PUZZLE_TYPE_LABEL, "Lkotlin/Function1;", "Landroidx/compose/animation/c;", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "Lkotlin/t;", "content", "i", "(ZLandroidx/compose/ui/n;Landroidx/compose/animation/f;Landroidx/compose/animation/h;Ljava/lang/String;Lyh/q;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/foundation/layout/x0;", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/foundation/layout/x0;ZLandroidx/compose/ui/n;Landroidx/compose/animation/f;Landroidx/compose/animation/h;Ljava/lang/String;Lyh/q;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/foundation/layout/o;", "f", "(Landroidx/compose/foundation/layout/o;ZLandroidx/compose/ui/n;Landroidx/compose/animation/f;Landroidx/compose/animation/h;Ljava/lang/String;Lyh/q;Landroidx/compose/runtime/p;II)V", "Landroidx/compose/animation/core/r0;", "visibleState", ak.aF, "(Landroidx/compose/animation/core/r0;Landroidx/compose/ui/n;Landroidx/compose/animation/f;Landroidx/compose/animation/h;Ljava/lang/String;Lyh/q;Landroidx/compose/runtime/p;II)V", "g", "(Landroidx/compose/foundation/layout/x0;Landroidx/compose/animation/core/r0;Landroidx/compose/ui/n;Landroidx/compose/animation/f;Landroidx/compose/animation/h;Ljava/lang/String;Lyh/q;Landroidx/compose/runtime/p;II)V", "e", "(Landroidx/compose/foundation/layout/o;Landroidx/compose/animation/core/r0;Landroidx/compose/ui/n;Landroidx/compose/animation/f;Landroidx/compose/animation/h;Ljava/lang/String;Lyh/q;Landroidx/compose/runtime/p;II)V", androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/animation/core/Transition;", "d", "(Landroidx/compose/animation/core/Transition;Lyh/l;Landroidx/compose/ui/n;Landroidx/compose/animation/f;Landroidx/compose/animation/h;Lyh/q;Landroidx/compose/runtime/p;II)V", "initiallyVisible", "Lkotlin/Function0;", "j", "(ZLandroidx/compose/ui/n;Landroidx/compose/animation/f;Landroidx/compose/animation/h;ZLyh/p;Landroidx/compose/runtime/p;II)V", "transition", "b", "(Landroidx/compose/animation/core/Transition;Lyh/l;Landroidx/compose/ui/n;Landroidx/compose/animation/f;Landroidx/compose/animation/h;Lyh/q;Landroidx/compose/runtime/p;I)V", "Landroidx/compose/animation/EnterExitState;", ak.av, "(Landroidx/compose/animation/core/Transition;Landroidx/compose/ui/n;Landroidx/compose/animation/f;Landroidx/compose/animation/h;Lyh/q;Landroidx/compose/runtime/p;I)V", "targetState", "l", "(Landroidx/compose/animation/core/Transition;Lyh/l;Ljava/lang/Object;Landroidx/compose/runtime/p;I)Landroidx/compose/animation/EnterExitState;", "animation_release"}, k = 2, mv = {1, 7, 1})
public final class AnimatedVisibilityKt {
    @j
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    private static final void a(Transition<EnterExitState> transition, androidx.compose.ui.n nVar, f fVar, h hVar, yh.q<? super c, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar, androidx.compose.runtime.p pVar, int i10) {
        pVar.T(-1967270694);
        EnterExitState enterExitStateH = transition.h();
        EnterExitState enterExitState = EnterExitState.Visible;
        if (enterExitStateH == enterExitState || transition.o() == enterExitState) {
            int i11 = i10 & 14;
            pVar.T(1157296644);
            boolean zS = pVar.s(transition);
            Object objU = pVar.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new d(transition);
                pVar.N(objU);
            }
            pVar.c0();
            d dVar = (d) objU;
            int i12 = i10 >> 3;
            androidx.compose.ui.n nVarS0 = nVar.s0(EnterExitTransitionKt.g(transition, fVar, hVar, "Built-in", pVar, i11 | bb.c.d.f31193dj | (i12 & 112) | (i12 & bb.c.b.f30796me)));
            pVar.T(-492369756);
            Object objU2 = pVar.U();
            if (objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                objU2 = new AnimatedEnterExitMeasurePolicy(dVar);
                pVar.N(objU2);
            }
            pVar.c0();
            i0 i0Var = (i0) objU2;
            pVar.T(-1323940314);
            s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
            LayoutDirection layoutDirection = (LayoutDirection) pVar.K(CompositionLocalsKt.p());
            d2 d2Var = (d2) pVar.K(CompositionLocalsKt.u());
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            yh.a<ComposeUiNode> aVarA = companion.a();
            yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVarS0);
            if (!(pVar.G() instanceof androidx.compose.runtime.e)) {
                ComposablesKt.n();
            }
            pVar.h();
            if (pVar.getInserting()) {
                pVar.L(aVarA);
            } else {
                pVar.d();
            }
            pVar.Y();
            androidx.compose.runtime.p pVarB = Updater.b(pVar);
            Updater.j(pVarB, i0Var, companion.d());
            Updater.j(pVarB, eVar, companion.b());
            Updater.j(pVarB, layoutDirection, companion.c());
            Updater.j(pVarB, d2Var, companion.f());
            pVar.x();
            qVarF.invoke(v1.a(v1.b(pVar)), pVar, 0);
            pVar.T(2058660585);
            pVar.T(1797450476);
            qVar.invoke(dVar, pVar, Integer.valueOf(((i10 >> 9) & 112) | 8));
            pVar.c0();
            pVar.c0();
            pVar.f();
            pVar.c0();
        }
        pVar.c0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.i(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    @androidx.compose.runtime.h
    public static final <T> void b(final Transition<T> transition, final yh.l<? super T, Boolean> lVar, final androidx.compose.ui.n nVar, final f fVar, final h hVar, final yh.q<? super c, ? super androidx.compose.runtime.p, ? super Integer, b2> qVar, androidx.compose.runtime.p pVar, final int i10) {
        int i11;
        androidx.compose.runtime.p pVar2;
        androidx.compose.runtime.p pVarF = pVar.F(808253933);
        if ((i10 & 14) == 0) {
            i11 = (pVarF.s(transition) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 112) == 0) {
            i11 |= pVarF.s(lVar) ? 32 : 16;
        }
        if ((i10 & bb.c.b.f30796me) == 0) {
            i11 |= pVarF.s(nVar) ? 256 : 128;
        }
        if ((i10 & bb.c.g.f32954lc) == 0) {
            i11 |= pVarF.s(fVar) ? 2048 : 1024;
        }
        if ((i10 & 57344) == 0) {
            i11 |= pVarF.s(hVar) ? 16384 : 8192;
        }
        if ((458752 & i10) == 0) {
            i11 |= pVarF.s(qVar) ? 131072 : 65536;
        }
        int i12 = i11;
        if ((374491 & i12) == 74898 && pVarF.b()) {
            pVarF.l();
            pVar2 = pVarF;
        } else {
            if (ComposerKt.g0()) {
                ComposerKt.w0(808253933, i12, -1, "androidx.compose.animation.AnimatedEnterExitImpl (AnimatedVisibility.kt:726)");
            }
            int i13 = i12 & 14;
            pVarF.T(1157296644);
            boolean zS = pVarF.s(transition);
            Object objU = pVarF.U();
            if (zS || objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = h2.g(lVar.invoke(transition.h()), null, 2, null);
                pVarF.N(objU);
            }
            pVarF.c0();
            a1 a1Var = (a1) objU;
            if (lVar.invoke(transition.o()).booleanValue() || ((Boolean) a1Var.getValue()).booleanValue() || transition.t()) {
                int i14 = i13 | 48;
                pVarF.T(1215497572);
                int i15 = i14 & 14;
                pVarF.T(1157296644);
                boolean zS2 = pVarF.s(transition);
                Object objU2 = pVarF.U();
                if (zS2 || objU2 == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU2 = transition.h();
                    pVarF.N(objU2);
                }
                pVarF.c0();
                if (transition.t()) {
                    objU2 = transition.h();
                }
                int i16 = (i14 >> 3) & 112;
                pVarF.T(-1220581778);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1220581778, i16, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                int i17 = i13 | (i12 & 112) | ((i16 << 6) & bb.c.b.f30796me);
                EnterExitState enterExitStateL = l(transition, lVar, objU2, pVarF, i17);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                T tO = transition.o();
                pVarF.T(-1220581778);
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1220581778, i16, -1, "androidx.compose.animation.AnimatedEnterExitImpl.<anonymous> (AnimatedVisibility.kt:739)");
                }
                EnterExitState enterExitStateL2 = l(transition, lVar, tO, pVarF, i17);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                pVarF.c0();
                Transition transitionK = androidx.compose.animation.core.TransitionKt.k(transition, enterExitStateL, enterExitStateL2, "EnterExitTransition", pVarF, i15 | ((i14 << 6) & bb.c.g.f32954lc));
                pVarF.c0();
                pVarF.T(511388516);
                boolean zS3 = pVarF.s(transitionK) | pVarF.s(a1Var);
                Object objU3 = pVarF.U();
                if (zS3 || objU3 == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU3 = new AnimatedVisibilityKt$AnimatedEnterExitImpl$1$1(transitionK, a1Var, null);
                    pVarF.N(objU3);
                }
                pVarF.c0();
                EffectsKt.h(transitionK, (yh.p) objU3, pVarF, 64);
                int i18 = i12 >> 3;
                int i19 = (i18 & 57344) | (i18 & 112) | (i18 & bb.c.b.f30796me) | (i18 & bb.c.g.f32954lc);
                pVarF.T(-1967270694);
                Object objH = transitionK.h();
                EnterExitState enterExitState = EnterExitState.Visible;
                if (objH == enterExitState || transitionK.o() == enterExitState) {
                    int i20 = i19 & 14;
                    pVarF.T(1157296644);
                    boolean zS4 = pVarF.s(transitionK);
                    Object objU4 = pVarF.U();
                    if (zS4 || objU4 == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU4 = new d(transitionK);
                        pVarF.N(objU4);
                    }
                    pVarF.c0();
                    d dVar = (d) objU4;
                    int i21 = i19 >> 3;
                    pVar2 = pVarF;
                    androidx.compose.ui.n nVarS0 = nVar.s0(EnterExitTransitionKt.g(transitionK, fVar, hVar, "Built-in", pVarF, i20 | bb.c.d.f31193dj | (i21 & 112) | (i21 & bb.c.b.f30796me)));
                    pVar2.T(-492369756);
                    Object objU5 = pVar2.U();
                    if (objU5 == androidx.compose.runtime.p.INSTANCE.a()) {
                        objU5 = new AnimatedEnterExitMeasurePolicy(dVar);
                        pVar2.N(objU5);
                    }
                    pVar2.c0();
                    i0 i0Var = (i0) objU5;
                    pVar2.T(-1323940314);
                    s1.e eVar = (s1.e) pVar2.K(CompositionLocalsKt.i());
                    LayoutDirection layoutDirection = (LayoutDirection) pVar2.K(CompositionLocalsKt.p());
                    d2 d2Var = (d2) pVar2.K(CompositionLocalsKt.u());
                    ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                    yh.a<ComposeUiNode> aVarA = companion.a();
                    yh.q<v1<ComposeUiNode>, androidx.compose.runtime.p, Integer, b2> qVarF = LayoutKt.f(nVarS0);
                    if (!(pVar2.G() instanceof androidx.compose.runtime.e)) {
                        ComposablesKt.n();
                    }
                    pVar2.h();
                    if (pVar2.getInserting()) {
                        pVar2.L(aVarA);
                    } else {
                        pVar2.d();
                    }
                    pVar2.Y();
                    androidx.compose.runtime.p pVarB = Updater.b(pVar2);
                    Updater.j(pVarB, i0Var, companion.d());
                    Updater.j(pVarB, eVar, companion.b());
                    Updater.j(pVarB, layoutDirection, companion.c());
                    Updater.j(pVarB, d2Var, companion.f());
                    pVar2.x();
                    qVarF.invoke(v1.a(v1.b(pVar2)), pVar2, 0);
                    pVar2.T(2058660585);
                    pVar2.T(1797450476);
                    qVar.invoke(dVar, pVar2, Integer.valueOf(((i19 >> 9) & 112) | 8));
                    pVar2.c0();
                    pVar2.c0();
                    pVar2.f();
                    pVar2.c0();
                } else {
                    pVar2 = pVarF;
                }
                pVar2.c0();
            } else {
                pVar2 = pVarF;
            }
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
        }
        u1 u1VarH = pVar2.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedEnterExitImpl$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar3, int i22) {
                AnimatedVisibilityKt.b(transition, lVar, nVar, fVar, hVar, qVar, pVar3, i10 | 1);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar3, Integer num) {
                a(pVar3, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:29:0x0057  */
    /* JADX WARN: Code duplicated, block: B:31:0x005f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x006c  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:49:0x008e  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:81:0x0101  */
    /* JADX WARN: Code duplicated, block: B:82:0x011b  */
    /* JADX WARN: Code duplicated, block: B:84:0x011e  */
    /* JADX WARN: Code duplicated, block: B:87:0x0127  */
    /* JADX WARN: Code duplicated, block: B:90:0x0161  */
    /* JADX WARN: Code duplicated, block: B:95:0x0170  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void c(@dl.d final r0<Boolean> visibleState, @dl.e androidx.compose.ui.n nVar, @dl.e f fVar, @dl.e h hVar, @dl.e String str, @dl.d final yh.q<? super c, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        f fVar2;
        int i14;
        int i15;
        h hVar2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        androidx.compose.ui.n nVar3;
        f fVarC;
        h hVarC;
        final androidx.compose.ui.n nVar4;
        final String str3;
        final h hVar3;
        final f fVar3;
        u1 u1VarH;
        f0.p(visibleState, "visibleState");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-222898426);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(visibleState) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.b.f30796me) == 0) {
                    fVar2 = fVar;
                    if (pVarF.s(fVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & bb.c.g.f32954lc) == 0) {
                        hVar2 = hVar;
                        if (pVarF.s(hVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 57344) == 0) {
                            str2 = str;
                            if (pVarF.s(str2)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            if ((i10 & 458752) == 0) {
                                if (pVarF.s(content)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                            }
                            if ((374491 & i12) == 74898 || !pVarF.b()) {
                                if (i20 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i13 != 0) {
                                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                                } else {
                                    fVarC = fVar2;
                                }
                                if (i15 != 0) {
                                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                                } else {
                                    hVarC = hVar2;
                                }
                                if (i17 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                                }
                                int i21 = i12 << 3;
                                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                    @dl.d
                                    public final Boolean a(boolean z10) {
                                        return Boolean.valueOf(z10);
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                        return a(bool.booleanValue());
                                    }
                                }, nVar3, fVarC, hVarC, content, pVarF, (i21 & 57344) | (i21 & bb.c.b.f30796me) | 48 | (i21 & bb.c.g.f32954lc) | (i12 & 458752));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                                nVar4 = nVar3;
                                str3 = str2;
                                hVar3 = hVarC;
                                fVar3 = fVarC;
                            } else {
                                pVarF.l();
                                nVar4 = nVar2;
                                fVar3 = fVar2;
                                hVar3 = hVar2;
                                str3 = str2;
                            }
                            u1VarH = pVarF.H();
                            if (u1VarH == null) {
                                return;
                            }
                            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                                    AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                    a(pVar2, num.intValue());
                                    return b2.f124493a;
                                }
                            });
                        }
                        i19 = androidx.profileinstaller.o.c.f26824k;
                        i12 |= i19;
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i22 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                @dl.d
                                public final Boolean a(boolean z10) {
                                    return Boolean.valueOf(z10);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i22 & 57344) | (i22 & bb.c.b.f30796me) | 48 | (i22 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        } else {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i23 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                @dl.d
                                public final Boolean a(boolean z10) {
                                    return Boolean.valueOf(z10);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i23 & 57344) | (i23 & bb.c.b.f30796me) | 48 | (i23 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                                AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i12 |= 24576;
                    str2 = str;
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i24 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                @dl.d
                                public final Boolean a(boolean z10) {
                                    return Boolean.valueOf(z10);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i24 & 57344) | (i24 & bb.c.b.f30796me) | 48 | (i24 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        } else {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i25 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                @dl.d
                                public final Boolean a(boolean z10) {
                                    return Boolean.valueOf(z10);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i25 & 57344) | (i25 & bb.c.b.f30796me) | 48 | (i25 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                                AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = androidx.profileinstaller.o.c.f26824k;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i26 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i26 & 57344) | (i26 & bb.c.b.f30796me) | 48 | (i26 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i27 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i27 & 57344) | (i27 & bb.c.b.f30796me) | 48 | (i27 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i28) {
                            AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= bb.c.d.f31193dj;
                hVar2 = hVar;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (pVarF.s(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i28 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                @dl.d
                                public final Boolean a(boolean z10) {
                                    return Boolean.valueOf(z10);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i28 & 57344) | (i28 & bb.c.b.f30796me) | 48 | (i28 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        } else {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i29 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                @dl.d
                                public final Boolean a(boolean z10) {
                                    return Boolean.valueOf(z10);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i29 & 57344) | (i29 & bb.c.b.f30796me) | 48 | (i29 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                                AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = androidx.profileinstaller.o.c.f26824k;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i210 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i210 & 57344) | (i210 & bb.c.b.f30796me) | 48 | (i210 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i211 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i211 & 57344) | (i211 & bb.c.b.f30796me) | 48 | (i211 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i212) {
                            AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i212 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i212 & 57344) | (i212 & bb.c.b.f30796me) | 48 | (i212 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i213 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i213 & 57344) | (i213 & bb.c.b.f30796me) | 48 | (i213 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i214) {
                            AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i214 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i214 & 57344) | (i214 & bb.c.b.f30796me) | 48 | (i214 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i215 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i215 & 57344) | (i215 & bb.c.b.f30796me) | 48 | (i215 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i216) {
                        AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.b.f30966u4;
            fVar2 = fVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    hVar2 = hVar;
                    if (pVarF.s(hVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (pVarF.s(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i216 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                @dl.d
                                public final Boolean a(boolean z10) {
                                    return Boolean.valueOf(z10);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i216 & 57344) | (i216 & bb.c.b.f30796me) | 48 | (i216 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        } else {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i217 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                @dl.d
                                public final Boolean a(boolean z10) {
                                    return Boolean.valueOf(z10);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i217 & 57344) | (i217 & bb.c.b.f30796me) | 48 | (i217 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i218) {
                                AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = androidx.profileinstaller.o.c.f26824k;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i218 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i218 & 57344) | (i218 & bb.c.b.f30796me) | 48 | (i218 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i219 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i219 & 57344) | (i219 & bb.c.b.f30796me) | 48 | (i219 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2110) {
                            AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i2110 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i2110 & 57344) | (i2110 & bb.c.b.f30796me) | 48 | (i2110 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i2111 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i2111 & 57344) | (i2111 & bb.c.b.f30796me) | 48 | (i2111 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2112) {
                            AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2112 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2112 & 57344) | (i2112 & bb.c.b.f30796me) | 48 | (i2112 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2113 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2113 & 57344) | (i2113 & bb.c.b.f30796me) | 48 | (i2113 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2114) {
                        AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            hVar2 = hVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (pVarF.s(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i2114 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i2114 & 57344) | (i2114 & bb.c.b.f30796me) | 48 | (i2114 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i2115 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i2115 & 57344) | (i2115 & bb.c.b.f30796me) | 48 | (i2115 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2116) {
                            AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2116 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2116 & 57344) | (i2116 & bb.c.b.f30796me) | 48 | (i2116 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2117 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2117 & 57344) | (i2117 & bb.c.b.f30796me) | 48 | (i2117 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2118) {
                        AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2118 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2118 & 57344) | (i2118 & bb.c.b.f30796me) | 48 | (i2118 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2119 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2119 & 57344) | (i2119 & bb.c.b.f30796me) | 48 | (i2119 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21110) {
                        AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = androidx.profileinstaller.o.c.f26824k;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i21110 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i21110 & 57344) | (i21110 & bb.c.b.f30796me) | 48 | (i21110 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i21111 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i21111 & 57344) | (i21111 & bb.c.b.f30796me) | 48 | (i21111 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21112) {
                    AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                fVar2 = fVar;
                if (pVarF.s(fVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    hVar2 = hVar;
                    if (pVarF.s(hVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (pVarF.s(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i21112 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                @dl.d
                                public final Boolean a(boolean z10) {
                                    return Boolean.valueOf(z10);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i21112 & 57344) | (i21112 & bb.c.b.f30796me) | 48 | (i21112 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        } else {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                            }
                            int i21113 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                                @dl.d
                                public final Boolean a(boolean z10) {
                                    return Boolean.valueOf(z10);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i21113 & 57344) | (i21113 & bb.c.b.f30796me) | 48 | (i21113 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21114) {
                                AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = androidx.profileinstaller.o.c.f26824k;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i21114 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i21114 & 57344) | (i21114 & bb.c.b.f30796me) | 48 | (i21114 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i21115 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i21115 & 57344) | (i21115 & bb.c.b.f30796me) | 48 | (i21115 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21116) {
                            AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i21116 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i21116 & 57344) | (i21116 & bb.c.b.f30796me) | 48 | (i21116 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i21117 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i21117 & 57344) | (i21117 & bb.c.b.f30796me) | 48 | (i21117 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21118) {
                            AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i21118 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i21118 & 57344) | (i21118 & bb.c.b.f30796me) | 48 | (i21118 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i21119 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i21119 & 57344) | (i21119 & bb.c.b.f30796me) | 48 | (i21119 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211110) {
                        AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            hVar2 = hVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (pVarF.s(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i211110 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i211110 & 57344) | (i211110 & bb.c.b.f30796me) | 48 | (i211110 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i211111 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i211111 & 57344) | (i211111 & bb.c.b.f30796me) | 48 | (i211111 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211112) {
                            AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i211112 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i211112 & 57344) | (i211112 & bb.c.b.f30796me) | 48 | (i211112 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i211113 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i211113 & 57344) | (i211113 & bb.c.b.f30796me) | 48 | (i211113 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211114) {
                        AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i211114 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i211114 & 57344) | (i211114 & bb.c.b.f30796me) | 48 | (i211114 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i211115 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i211115 & 57344) | (i211115 & bb.c.b.f30796me) | 48 | (i211115 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211116) {
                        AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = androidx.profileinstaller.o.c.f26824k;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i211116 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i211116 & 57344) | (i211116 & bb.c.b.f30796me) | 48 | (i211116 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i211117 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i211117 & 57344) | (i211117 & bb.c.b.f30796me) | 48 | (i211117 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211118) {
                    AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        fVar2 = fVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                hVar2 = hVar;
                if (pVarF.s(hVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (pVarF.s(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i211118 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i211118 & 57344) | (i211118 & bb.c.b.f30796me) | 48 | (i211118 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                        }
                        int i211119 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i211119 & 57344) | (i211119 & bb.c.b.f30796me) | 48 | (i211119 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111110) {
                            AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2111110 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2111110 & 57344) | (i2111110 & bb.c.b.f30796me) | 48 | (i2111110 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2111111 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2111111 & 57344) | (i2111111 & bb.c.b.f30796me) | 48 | (i2111111 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111112) {
                        AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2111112 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2111112 & 57344) | (i2111112 & bb.c.b.f30796me) | 48 | (i2111112 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2111113 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2111113 & 57344) | (i2111113 & bb.c.b.f30796me) | 48 | (i2111113 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111114) {
                        AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = androidx.profileinstaller.o.c.f26824k;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i2111114 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i2111114 & 57344) | (i2111114 & bb.c.b.f30796me) | 48 | (i2111114 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i2111115 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i2111115 & 57344) | (i2111115 & bb.c.b.f30796me) | 48 | (i2111115 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111116) {
                    AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        hVar2 = hVar;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 57344) == 0) {
                str2 = str;
                if (pVarF.s(str2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2111116 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2111116 & 57344) | (i2111116 & bb.c.b.f30796me) | 48 | (i2111116 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                    }
                    int i2111117 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2111117 & 57344) | (i2111117 & bb.c.b.f30796me) | 48 | (i2111117 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111118) {
                        AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = androidx.profileinstaller.o.c.f26824k;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i2111118 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i2111118 & 57344) | (i2111118 & bb.c.b.f30796me) | 48 | (i2111118 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i2111119 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i2111119 & 57344) | (i2111119 & bb.c.b.f30796me) | 48 | (i2111119 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21111110) {
                    AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        str2 = str;
        if ((i11 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (pVarF.s(content)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i21111110 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i21111110 & 57344) | (i21111110 & bb.c.b.f30796me) | 48 | (i21111110 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
                }
                int i21111111 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i21111111 & 57344) | (i21111111 & bb.c.b.f30796me) | 48 | (i21111111 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21111112) {
                    AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i19 = androidx.profileinstaller.o.c.f26824k;
        i12 |= i19;
        if ((374491 & i12) == 74898) {
            if (i20 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
            } else {
                hVarC = hVar2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
            }
            int i21111112 = i12 << 3;
            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                @dl.d
                public final Boolean a(boolean z10) {
                    return Boolean.valueOf(z10);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return a(bool.booleanValue());
                }
            }, nVar3, fVarC, hVarC, content, pVarF, (i21111112 & 57344) | (i21111112 & bb.c.b.f30796me) | 48 | (i21111112 & bb.c.g.f32954lc) | (i12 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            str3 = str2;
            hVar3 = hVarC;
            fVar3 = fVarC;
        } else {
            if (i20 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.G(null, null, false, null, 15, null));
            } else {
                hVarC = hVar2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-222898426, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:373)");
            }
            int i21111113 = i12 << 3;
            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$7
                @dl.d
                public final Boolean a(boolean z10) {
                    return Boolean.valueOf(z10);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return a(bool.booleanValue());
                }
            }, nVar3, fVarC, hVarC, content, pVarF, (i21111113 & 57344) | (i21111113 & bb.c.b.f30796me) | 48 | (i21111113 & bb.c.g.f32954lc) | (i12 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            str3 = str2;
            hVar3 = hVarC;
            fVar3 = fVarC;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$8
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21111114) {
                AnimatedVisibilityKt.c(visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0070  */
    /* JADX WARN: Code duplicated, block: B:37:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x0077  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    /* JADX WARN: Code duplicated, block: B:50:0x0096  */
    /* JADX WARN: Code duplicated, block: B:52:0x009e  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:58:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00da  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:80:0x0103  */
    /* JADX WARN: Code duplicated, block: B:83:0x0122  */
    /* JADX WARN: Code duplicated, block: B:86:0x014f  */
    /* JADX WARN: Code duplicated, block: B:91:0x015d  */
    /* JADX WARN: Code duplicated, block: B:93:? A[RETURN, SYNTHETIC] */
    @j
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final <T> void d(@dl.d final Transition<T> transition, @dl.d final yh.l<? super T, Boolean> visible, @dl.e androidx.compose.ui.n nVar, @dl.e f fVar, @dl.e h hVar, @dl.d final yh.q<? super c, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.n nVar2;
        int i13;
        f fVar2;
        int i14;
        int i15;
        h hVarC;
        int i16;
        int i17;
        androidx.compose.ui.n nVar3;
        f fVarC;
        final h hVar2;
        final f fVar3;
        u1 u1VarH;
        f0.p(transition, "<this>");
        f0.p(visible, "visible");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(1031950689);
        if ((i11 & Integer.MIN_VALUE) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.s(transition) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 1) != 0) {
            i12 |= 48;
        } else if ((i10 & 112) == 0) {
            i12 |= pVarF.s(visible) ? 32 : 16;
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    fVar2 = fVar;
                    if (pVarF.s(fVar2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        hVarC = hVar;
                        if (pVarF.s(hVarC)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(content)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898 || !pVarF.b()) {
                            if (i18 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                            }
                            b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            hVar2 = hVarC;
                            nVar2 = nVar3;
                            fVar3 = fVarC;
                        } else {
                            pVarF.l();
                            fVar3 = fVar2;
                            hVar2 = hVarC;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                                AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i17 = androidx.profileinstaller.o.c.f26824k;
                    i12 |= i17;
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    } else {
                        if (i18 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                            AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                hVarC = hVar;
                if ((i11 & 16) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    } else {
                        if (i18 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                            AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i17 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                        AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            fVar2 = fVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    hVarC = hVar;
                    if (pVarF.s(hVarC)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    } else {
                        if (i18 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                            AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i17 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                        AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            hVarC = hVar;
            if ((i11 & 16) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                        AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i17 = androidx.profileinstaller.o.c.f26824k;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                nVar2 = nVar3;
                fVar3 = fVarC;
            } else {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                nVar2 = nVar3;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                    AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                fVar2 = fVar;
                if (pVarF.s(fVar2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    hVarC = hVar;
                    if (pVarF.s(hVarC)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i18 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    } else {
                        if (i18 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                        }
                        b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                            AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i17 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i17;
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                        AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            hVarC = hVar;
            if ((i11 & 16) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                        AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i17 = androidx.profileinstaller.o.c.f26824k;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                nVar2 = nVar3;
                fVar3 = fVarC;
            } else {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                nVar2 = nVar3;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                    AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        fVar2 = fVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                hVarC = hVar;
                if (pVarF.s(hVarC)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(content)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i18 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                    }
                    b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                        AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i17 = androidx.profileinstaller.o.c.f26824k;
            i12 |= i17;
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                nVar2 = nVar3;
                fVar3 = fVarC;
            } else {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                nVar2 = nVar3;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                    AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        hVarC = hVar;
        if ((i11 & 16) != 0) {
            if ((i10 & 458752) == 0) {
                if (pVarF.s(content)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                nVar2 = nVar3;
                fVar3 = fVarC;
            } else {
                if (i18 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
                }
                b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                nVar2 = nVar3;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                    AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i17 = androidx.profileinstaller.o.c.f26824k;
        i12 |= i17;
        if ((374491 & i12) == 74898) {
            if (i18 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
            }
            b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            hVar2 = hVarC;
            nVar2 = nVar3;
            fVar3 = fVarC;
        } else {
            if (i18 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1031950689, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:600)");
            }
            b(transition, visible, nVar3, fVarC, hVarC, content, pVarF, (i12 & 14) | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc) | (i12 & 57344) | (i12 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            hVar2 = hVarC;
            nVar2 = nVar3;
            fVar3 = fVarC;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$13
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i19) {
                AnimatedVisibilityKt.d(transition, visible, nVar2, fVar3, hVar2, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x010b  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f  */
    /* JADX WARN: Code duplicated, block: B:81:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x012e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177  */
    /* JADX WARN: Code duplicated, block: B:94:0x0187  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void e(@dl.d final androidx.compose.foundation.layout.o oVar, @dl.d final r0<Boolean> visibleState, @dl.e androidx.compose.ui.n nVar, @dl.e f fVar, @dl.e h hVar, @dl.e String str, @dl.d final yh.q<? super c, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        f fVar2;
        int i14;
        int i15;
        h hVar2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        androidx.compose.ui.n nVar3;
        f fVarC;
        h hVarC;
        final androidx.compose.ui.n nVar4;
        final String str3;
        final f fVar3;
        final h hVar3;
        u1 u1VarH;
        f0.p(oVar, "<this>");
        f0.p(visibleState, "visibleState");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-850656618);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            i12 = (pVarF.s(visibleState) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    fVar2 = fVar;
                    if (pVarF.s(fVar2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        hVar2 = hVar;
                        if (pVarF.s(hVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        i12 |= androidx.profileinstaller.o.c.f26824k;
                        str2 = str;
                    } else {
                        str2 = str;
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(str2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (pVarF.s(content)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                        }
                        if ((i12 & 2995921) == 599184 || !pVarF.b()) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                            }
                            int i21 = i12 >> 3;
                            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i21 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                                @dl.d
                                public final Boolean a(boolean z10) {
                                    return Boolean.valueOf(z10);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i21 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            fVar3 = fVarC;
                            hVar3 = hVarC;
                        } else {
                            pVarF.l();
                            nVar4 = nVar2;
                            fVar3 = fVar2;
                            hVar3 = hVar2;
                            str3 = str2;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                                AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = 1572864;
                    i12 |= i19;
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i22 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i22 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i22 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i23 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i23 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i23 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                            AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                hVar2 = hVar;
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i24 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i24 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i24 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i25 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i25 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i25 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                            AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i26 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i26 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i26 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i27 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i27 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i27 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i28) {
                        AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            fVar2 = fVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    hVar2 = hVar;
                    if (pVarF.s(hVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i28 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i28 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i28 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i29 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i29 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i29 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                            AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i210 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i210 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i210 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i211 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i211 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i211 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i212) {
                        AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            hVar2 = hVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i212 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i212 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i212 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i213 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i213 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i213 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i214) {
                        AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i214 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i214 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i214 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i215 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i215 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i215 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i216) {
                    AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                fVar2 = fVar;
                if (pVarF.s(fVar2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    hVar2 = hVar;
                    if (pVarF.s(hVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i216 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i216 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i216 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                        }
                        int i217 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i217 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i217 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i218) {
                            AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i218 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i218 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i218 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i219 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i219 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i219 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2110) {
                        AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            hVar2 = hVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i2110 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2110 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2110 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i2111 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2111 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2111 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2112) {
                        AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i2112 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2112 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2112 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i2113 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2113 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2113 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2114) {
                    AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        fVar2 = fVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                hVar2 = hVar;
                if (pVarF.s(hVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i2114 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2114 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2114 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                    }
                    int i2115 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2115 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2115 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2116) {
                        AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i2116 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2116 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2116 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i2117 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2117 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2117 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2118) {
                    AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        hVar2 = hVar;
        i17 = i11 & 16;
        if (i17 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            str2 = str;
        } else {
            str2 = str;
            if ((i10 & 458752) == 0) {
                if (pVarF.s(str2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
        }
        if ((i11 & 32) != 0) {
            if ((i10 & 3670016) == 0) {
                if (pVarF.s(content)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
            }
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i2118 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2118 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2118 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
                }
                int i2119 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2119 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2119 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21110) {
                    AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i19 = 1572864;
        i12 |= i19;
        if ((i12 & 2995921) == 599184) {
            if (i20 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
            } else {
                hVarC = hVar2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
            }
            int i21110 = i12 >> 3;
            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i21110 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                @dl.d
                public final Boolean a(boolean z10) {
                    return Boolean.valueOf(z10);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return a(bool.booleanValue());
                }
            }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i21110 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            str3 = str2;
            fVar3 = fVarC;
            hVar3 = hVarC;
        } else {
            if (i20 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.t(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.I(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
            } else {
                hVarC = hVar2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-850656618, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:524)");
            }
            int i21111 = i12 >> 3;
            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i21111 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$11
                @dl.d
                public final Boolean a(boolean z10) {
                    return Boolean.valueOf(z10);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return a(bool.booleanValue());
                }
            }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i21111 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            str3 = str2;
            fVar3 = fVarC;
            hVar3 = hVarC;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$12
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21112) {
                AnimatedVisibilityKt.e(oVar, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x010a  */
    /* JADX WARN: Code duplicated, block: B:80:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:93:0x017d  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void f(@dl.d final androidx.compose.foundation.layout.o oVar, final boolean z10, @dl.e androidx.compose.ui.n nVar, @dl.e f fVar, @dl.e h hVar, @dl.e String str, @dl.d final yh.q<? super c, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.n nVar2;
        int i13;
        f fVar2;
        int i14;
        int i15;
        h hVarC;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        androidx.compose.ui.n nVar3;
        f fVarC;
        final h hVar2;
        final String str3;
        final f fVar3;
        u1 u1VarH;
        f0.p(oVar, "<this>");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(1766503102);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            i12 = (pVarF.u(z10) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    fVar2 = fVar;
                    if (pVarF.s(fVar2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        hVarC = hVar;
                        if (pVarF.s(hVarC)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        i12 |= androidx.profileinstaller.o.c.f26824k;
                        str2 = str;
                    } else {
                        str2 = str;
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(str2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (pVarF.s(content)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                        }
                        if ((i12 & 2995921) == 599184 || !pVarF.b()) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                            }
                            int i21 = i12 >> 3;
                            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i21 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                                @dl.d
                                public final Boolean a(boolean z11) {
                                    return Boolean.valueOf(z11);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i21 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            hVar2 = hVarC;
                            str3 = str2;
                            nVar2 = nVar3;
                            fVar3 = fVarC;
                        } else {
                            pVarF.l();
                            fVar3 = fVar2;
                            hVar2 = hVarC;
                            str3 = str2;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                                AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = 1572864;
                    i12 |= i19;
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i22 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i22 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i22 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i23 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i23 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i23 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                            AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                hVarC = hVar;
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i24 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i24 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i24 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i25 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i25 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i25 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                            AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i26 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i26 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i26 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i27 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i27 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i27 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i28) {
                        AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            fVar2 = fVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    hVarC = hVar;
                    if (pVarF.s(hVarC)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i28 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i28 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i28 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i29 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i29 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i29 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                            AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i210 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i210 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i210 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i211 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i211 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i211 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i212) {
                        AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            hVarC = hVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i212 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i212 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i212 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i213 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i213 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i213 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i214) {
                        AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i214 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i214 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i214 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i215 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i215 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i215 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i216) {
                    AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                fVar2 = fVar;
                if (pVarF.s(fVar2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    hVarC = hVar;
                    if (pVarF.s(hVarC)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i216 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i216 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i216 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                        }
                        int i217 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i217 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i217 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i218) {
                            AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i218 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i218 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i218 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i219 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i219 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i219 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2110) {
                        AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            hVarC = hVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i2110 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2110 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2110 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i2111 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2111 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2111 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2112) {
                        AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i2112 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2112 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2112 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i2113 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2113 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2113 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2114) {
                    AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        fVar2 = fVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                hVarC = hVar;
                if (pVarF.s(hVarC)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i2114 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2114 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2114 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                    }
                    int i2115 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2115 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2115 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2116) {
                        AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i2116 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2116 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2116 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i2117 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2117 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2117 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2118) {
                    AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        hVarC = hVar;
        i17 = i11 & 16;
        if (i17 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            str2 = str;
        } else {
            str2 = str;
            if ((i10 & 458752) == 0) {
                if (pVarF.s(str2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
        }
        if ((i11 & 32) != 0) {
            if ((i10 & 3670016) == 0) {
                if (pVarF.s(content)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
            }
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i2118 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2118 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2118 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
                }
                int i2119 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2119 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2119 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21110) {
                    AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i19 = 1572864;
        i12 |= i19;
        if ((i12 & 2995921) == 599184) {
            if (i20 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
            }
            int i21110 = i12 >> 3;
            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i21110 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                @dl.d
                public final Boolean a(boolean z11) {
                    return Boolean.valueOf(z11);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return a(bool.booleanValue());
                }
            }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i21110 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            hVar2 = hVarC;
            str3 = str2;
            nVar2 = nVar3;
            fVar3 = fVarC;
        } else {
            if (i20 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.t(null, null, false, null, 15, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.I(null, null, false, null, 15, null));
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1766503102, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:267)");
            }
            int i21111 = i12 >> 3;
            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i21111 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$5
                @dl.d
                public final Boolean a(boolean z11) {
                    return Boolean.valueOf(z11);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return a(bool.booleanValue());
                }
            }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i21111 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            hVar2 = hVarC;
            str3 = str2;
            nVar2 = nVar3;
            fVar3 = fVarC;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$6
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21112) {
                AnimatedVisibilityKt.f(oVar, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0059  */
    /* JADX WARN: Code duplicated, block: B:27:0x005c  */
    /* JADX WARN: Code duplicated, block: B:29:0x0060  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0078  */
    /* JADX WARN: Code duplicated, block: B:38:0x007b  */
    /* JADX WARN: Code duplicated, block: B:40:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:43:0x008a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    /* JADX WARN: Code duplicated, block: B:49:0x009d  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:78:0x010b  */
    /* JADX WARN: Code duplicated, block: B:80:0x010f  */
    /* JADX WARN: Code duplicated, block: B:81:0x012a  */
    /* JADX WARN: Code duplicated, block: B:83:0x012e  */
    /* JADX WARN: Code duplicated, block: B:86:0x0137  */
    /* JADX WARN: Code duplicated, block: B:89:0x0177  */
    /* JADX WARN: Code duplicated, block: B:94:0x0187  */
    /* JADX WARN: Code duplicated, block: B:96:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void g(@dl.d final x0 x0Var, @dl.d final r0<Boolean> visibleState, @dl.e androidx.compose.ui.n nVar, @dl.e f fVar, @dl.e h hVar, @dl.e String str, @dl.d final yh.q<? super c, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        f fVar2;
        int i14;
        int i15;
        h hVar2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        androidx.compose.ui.n nVar3;
        f fVarC;
        h hVarC;
        final androidx.compose.ui.n nVar4;
        final String str3;
        final f fVar3;
        final h hVar3;
        u1 u1VarH;
        f0.p(x0Var, "<this>");
        f0.p(visibleState, "visibleState");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(836509870);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            i12 = (pVarF.s(visibleState) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    fVar2 = fVar;
                    if (pVarF.s(fVar2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        hVar2 = hVar;
                        if (pVarF.s(hVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        i12 |= androidx.profileinstaller.o.c.f26824k;
                        str2 = str;
                    } else {
                        str2 = str;
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(str2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (pVarF.s(content)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                        }
                        if ((i12 & 2995921) == 599184 || !pVarF.b()) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                            }
                            int i21 = i12 >> 3;
                            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i21 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                                @dl.d
                                public final Boolean a(boolean z10) {
                                    return Boolean.valueOf(z10);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i21 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            fVar3 = fVarC;
                            hVar3 = hVarC;
                        } else {
                            pVarF.l();
                            nVar4 = nVar2;
                            fVar3 = fVar2;
                            hVar3 = hVar2;
                            str3 = str2;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                                AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = 1572864;
                    i12 |= i19;
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i22 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i22 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i22 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i23 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i23 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i23 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                            AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                hVar2 = hVar;
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i24 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i24 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i24 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i25 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i25 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i25 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                            AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i26 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i26 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i26 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i27 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i27 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i27 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i28) {
                        AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            fVar2 = fVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    hVar2 = hVar;
                    if (pVarF.s(hVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i28 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i28 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i28 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i29 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i29 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i29 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                            AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i210 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i210 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i210 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i211 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i211 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i211 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i212) {
                        AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            hVar2 = hVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i212 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i212 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i212 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i213 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i213 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i213 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i214) {
                        AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i214 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i214 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i214 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i215 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i215 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i215 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i216) {
                    AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                fVar2 = fVar;
                if (pVarF.s(fVar2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    hVar2 = hVar;
                    if (pVarF.s(hVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i216 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i216 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i216 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                        }
                        int i217 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i217 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                            @dl.d
                            public final Boolean a(boolean z10) {
                                return Boolean.valueOf(z10);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i217 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        fVar3 = fVarC;
                        hVar3 = hVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i218) {
                            AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i218 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i218 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i218 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i219 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i219 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i219 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2110) {
                        AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            hVar2 = hVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i2110 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2110 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2110 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i2111 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2111 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2111 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2112) {
                        AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i2112 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2112 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2112 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i2113 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2113 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2113 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2114) {
                    AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        fVar2 = fVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                hVar2 = hVar;
                if (pVarF.s(hVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i2114 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2114 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2114 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                    }
                    int i2115 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2115 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                        @dl.d
                        public final Boolean a(boolean z10) {
                            return Boolean.valueOf(z10);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2115 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    fVar3 = fVarC;
                    hVar3 = hVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2116) {
                        AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i2116 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2116 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2116 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i2117 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2117 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2117 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2118) {
                    AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        hVar2 = hVar;
        i17 = i11 & 16;
        if (i17 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            str2 = str;
        } else {
            str2 = str;
            if ((i10 & 458752) == 0) {
                if (pVarF.s(str2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
        }
        if ((i11 & 32) != 0) {
            if ((i10 & 3670016) == 0) {
                if (pVarF.s(content)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
            }
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i2118 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2118 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2118 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
                }
                int i2119 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i2119 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                    @dl.d
                    public final Boolean a(boolean z10) {
                        return Boolean.valueOf(z10);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2119 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                fVar3 = fVarC;
                hVar3 = hVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21110) {
                    AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i19 = 1572864;
        i12 |= i19;
        if ((i12 & 2995921) == 599184) {
            if (i20 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
            } else {
                hVarC = hVar2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
            }
            int i21110 = i12 >> 3;
            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i21110 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                @dl.d
                public final Boolean a(boolean z10) {
                    return Boolean.valueOf(z10);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return a(bool.booleanValue());
                }
            }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i21110 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            str3 = str2;
            fVar3 = fVarC;
            hVar3 = hVarC;
        } else {
            if (i20 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.p(null, null, false, null, 15, null).c(EnterExitTransitionKt.v(null, 0.0f, 3, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.E(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
            } else {
                hVarC = hVar2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(836509870, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:448)");
            }
            int i21111 = i12 >> 3;
            b(androidx.compose.animation.core.TransitionKt.n(visibleState, str2, pVarF, r0.f4499d | (i21111 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$9
                @dl.d
                public final Boolean a(boolean z10) {
                    return Boolean.valueOf(z10);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return a(bool.booleanValue());
                }
            }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i21111 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            str3 = str2;
            fVar3 = fVarC;
            hVar3 = hVarC;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$10
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21112) {
                AnimatedVisibilityKt.g(x0Var, visibleState, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0056  */
    /* JADX WARN: Code duplicated, block: B:27:0x0059  */
    /* JADX WARN: Code duplicated, block: B:29:0x005d  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:38:0x0078  */
    /* JADX WARN: Code duplicated, block: B:40:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0084  */
    /* JADX WARN: Code duplicated, block: B:43:0x0087  */
    /* JADX WARN: Code duplicated, block: B:48:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x009a  */
    /* JADX WARN: Code duplicated, block: B:51:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:68:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:78:0x010a  */
    /* JADX WARN: Code duplicated, block: B:80:0x010e  */
    /* JADX WARN: Code duplicated, block: B:82:0x0124  */
    /* JADX WARN: Code duplicated, block: B:85:0x012d  */
    /* JADX WARN: Code duplicated, block: B:88:0x016d  */
    /* JADX WARN: Code duplicated, block: B:93:0x017d  */
    /* JADX WARN: Code duplicated, block: B:95:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void h(@dl.d final x0 x0Var, final boolean z10, @dl.e androidx.compose.ui.n nVar, @dl.e f fVar, @dl.e h hVar, @dl.e String str, @dl.d final yh.q<? super c, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.n nVar2;
        int i13;
        f fVar2;
        int i14;
        int i15;
        h hVarC;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        androidx.compose.ui.n nVar3;
        f fVarC;
        final h hVar2;
        final String str3;
        final f fVar3;
        u1 u1VarH;
        f0.p(x0Var, "<this>");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(-1741346906);
        if ((i11 & 1) != 0) {
            i12 = i10 | 48;
        } else if ((i10 & 112) == 0) {
            i12 = (pVarF.u(z10) ? 32 : 16) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 256 : 128;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    fVar2 = fVar;
                    if (pVarF.s(fVar2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 57344) == 0) {
                        hVarC = hVar;
                        if (pVarF.s(hVarC)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        i12 |= androidx.profileinstaller.o.c.f26824k;
                        str2 = str;
                    } else {
                        str2 = str;
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(str2)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 3670016) == 0) {
                            if (pVarF.s(content)) {
                                i19 = 1048576;
                            } else {
                                i19 = 524288;
                            }
                        }
                        if ((i12 & 2995921) == 599184 || !pVarF.b()) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                            }
                            int i21 = i12 >> 3;
                            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i21 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                                @dl.d
                                public final Boolean a(boolean z11) {
                                    return Boolean.valueOf(z11);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i21 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            hVar2 = hVarC;
                            str3 = str2;
                            nVar2 = nVar3;
                            fVar3 = fVarC;
                        } else {
                            pVarF.l();
                            fVar3 = fVar2;
                            hVar2 = hVarC;
                            str3 = str2;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                                AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = 1572864;
                    i12 |= i19;
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i22 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i22 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i22 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i23 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i23 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i23 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                            AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                hVarC = hVar;
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i24 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i24 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i24 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i25 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i25 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i25 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                            AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i26 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i26 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i26 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i27 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i27 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i27 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i28) {
                        AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            fVar2 = fVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    hVarC = hVar;
                    if (pVarF.s(hVarC)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i28 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i28 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i28 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i29 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i29 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i29 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                            AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i210 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i210 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i210 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i211 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i211 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i211 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i212) {
                        AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            hVarC = hVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i212 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i212 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i212 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i213 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i213 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i213 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i214) {
                        AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i214 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i214 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i214 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i215 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i215 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i215 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i216) {
                    AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                fVar2 = fVar;
                if (pVarF.s(fVar2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 57344) == 0) {
                    hVarC = hVar;
                    if (pVarF.s(hVarC)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    i12 |= androidx.profileinstaller.o.c.f26824k;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(str2)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 3670016) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                    }
                    if ((i12 & 2995921) == 599184) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i216 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i216 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i216 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                        }
                        int i217 = i12 >> 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i217 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i217 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        hVar2 = hVarC;
                        str3 = str2;
                        nVar2 = nVar3;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i218) {
                            AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = 1572864;
                i12 |= i19;
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i218 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i218 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i218 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i219 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i219 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i219 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2110) {
                        AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            hVarC = hVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i2110 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2110 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2110 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i2111 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2111 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2111 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2112) {
                        AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i2112 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2112 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2112 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i2113 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2113 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2113 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2114) {
                    AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        fVar2 = fVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 57344) == 0) {
                hVarC = hVar;
                if (pVarF.s(hVarC)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
                str2 = str;
            } else {
                str2 = str;
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(str2)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 3670016) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                }
                if ((i12 & 2995921) == 599184) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i2114 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2114 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2114 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                    }
                    int i2115 = i12 >> 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2115 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2115 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    hVar2 = hVarC;
                    str3 = str2;
                    nVar2 = nVar3;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2116) {
                        AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = 1572864;
            i12 |= i19;
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i2116 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2116 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2116 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i2117 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2117 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2117 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2118) {
                    AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        hVarC = hVar;
        i17 = i11 & 16;
        if (i17 != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
            str2 = str;
        } else {
            str2 = str;
            if ((i10 & 458752) == 0) {
                if (pVarF.s(str2)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
        }
        if ((i11 & 32) != 0) {
            if ((i10 & 3670016) == 0) {
                if (pVarF.s(content)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
            }
            if ((i12 & 2995921) == 599184) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i2118 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2118 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2118 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
                }
                int i2119 = i12 >> 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i2119 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i2119 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                hVar2 = hVarC;
                str3 = str2;
                nVar2 = nVar3;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21110) {
                    AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i19 = 1572864;
        i12 |= i19;
        if ((i12 & 2995921) == 599184) {
            if (i20 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
            }
            int i21110 = i12 >> 3;
            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i21110 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                @dl.d
                public final Boolean a(boolean z11) {
                    return Boolean.valueOf(z11);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return a(bool.booleanValue());
                }
            }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i21110 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            hVar2 = hVarC;
            str3 = str2;
            nVar2 = nVar3;
            fVar3 = fVarC;
        } else {
            if (i20 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.p(null, null, false, null, 15, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.x(null, 0.0f, 3, null).c(EnterExitTransitionKt.E(null, null, false, null, 15, null));
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(-1741346906, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:194)");
            }
            int i21111 = i12 >> 3;
            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i21111 & 14) | ((i12 >> 12) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$3
                @dl.d
                public final Boolean a(boolean z11) {
                    return Boolean.valueOf(z11);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return a(bool.booleanValue());
                }
            }, nVar3, fVarC, hVarC, content, pVarF, (i12 & 57344) | (i12 & bb.c.b.f30796me) | 48 | (i12 & bb.c.g.f32954lc) | (i21111 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            hVar2 = hVarC;
            str3 = str2;
            nVar2 = nVar3;
            fVar3 = fVarC;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21112) {
                AnimatedVisibilityKt.h(x0Var, z10, nVar2, fVar3, hVar2, str3, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0050  */
    /* JADX WARN: Code duplicated, block: B:29:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0097  */
    /* JADX WARN: Code duplicated, block: B:54:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:78:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x0118  */
    /* JADX WARN: Code duplicated, block: B:84:0x011b  */
    /* JADX WARN: Code duplicated, block: B:87:0x0124  */
    /* JADX WARN: Code duplicated, block: B:90:0x015f  */
    /* JADX WARN: Code duplicated, block: B:95:0x016e  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void i(final boolean z10, @dl.e androidx.compose.ui.n nVar, @dl.e f fVar, @dl.e h hVar, @dl.e String str, @dl.d final yh.q<? super c, ? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        f fVar2;
        int i14;
        int i15;
        h hVar2;
        int i16;
        int i17;
        String str2;
        int i18;
        int i19;
        androidx.compose.ui.n nVar3;
        f fVarC;
        h hVarC;
        final androidx.compose.ui.n nVar4;
        final String str3;
        final h hVar3;
        final f fVar3;
        u1 u1VarH;
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(2088733774);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.u(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i20 = i11 & 2;
        if (i20 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & bb.c.b.f30796me) == 0) {
                    fVar2 = fVar;
                    if (pVarF.s(fVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & bb.c.g.f32954lc) == 0) {
                        hVar2 = hVar;
                        if (pVarF.s(hVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 16;
                    if (i17 != 0) {
                        if ((i10 & 57344) == 0) {
                            str2 = str;
                            if (pVarF.s(str2)) {
                                i18 = 16384;
                            } else {
                                i18 = 8192;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 32) != 0) {
                            if ((i10 & 458752) == 0) {
                                if (pVarF.s(content)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                            }
                            if ((374491 & i12) == 74898 || !pVarF.b()) {
                                if (i20 != 0) {
                                    nVar3 = androidx.compose.ui.n.INSTANCE;
                                } else {
                                    nVar3 = nVar2;
                                }
                                if (i13 != 0) {
                                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                                } else {
                                    fVarC = fVar2;
                                }
                                if (i15 != 0) {
                                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                                } else {
                                    hVarC = hVar2;
                                }
                                if (i17 != 0) {
                                    str2 = "AnimatedVisibility";
                                }
                                if (ComposerKt.g0()) {
                                    ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                                }
                                int i21 = i12 << 3;
                                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                    @dl.d
                                    public final Boolean a(boolean z11) {
                                        return Boolean.valueOf(z11);
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                        return a(bool.booleanValue());
                                    }
                                }, nVar3, fVarC, hVarC, content, pVarF, (i21 & 57344) | (i21 & bb.c.b.f30796me) | 48 | (i21 & bb.c.g.f32954lc) | (i12 & 458752));
                                if (ComposerKt.g0()) {
                                    ComposerKt.v0();
                                }
                                nVar4 = nVar3;
                                str3 = str2;
                                hVar3 = hVarC;
                                fVar3 = fVarC;
                            } else {
                                pVarF.l();
                                nVar4 = nVar2;
                                fVar3 = fVar2;
                                hVar3 = hVar2;
                                str3 = str2;
                            }
                            u1VarH = pVarF.H();
                            if (u1VarH == null) {
                                return;
                            }
                            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                /* JADX WARN: Multi-variable type inference failed */
                                {
                                    super(2);
                                }

                                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i22) {
                                    AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                                }

                                @Override // yh.p
                                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                    a(pVar2, num.intValue());
                                    return b2.f124493a;
                                }
                            });
                        }
                        i19 = androidx.profileinstaller.o.c.f26824k;
                        i12 |= i19;
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i22 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @dl.d
                                public final Boolean a(boolean z11) {
                                    return Boolean.valueOf(z11);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i22 & 57344) | (i22 & bb.c.b.f30796me) | 48 | (i22 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        } else {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i23 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @dl.d
                                public final Boolean a(boolean z11) {
                                    return Boolean.valueOf(z11);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i23 & 57344) | (i23 & bb.c.b.f30796me) | 48 | (i23 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i24) {
                                AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i12 |= 24576;
                    str2 = str;
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i24 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @dl.d
                                public final Boolean a(boolean z11) {
                                    return Boolean.valueOf(z11);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i24 & 57344) | (i24 & bb.c.b.f30796me) | 48 | (i24 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        } else {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i25 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @dl.d
                                public final Boolean a(boolean z11) {
                                    return Boolean.valueOf(z11);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i25 & 57344) | (i25 & bb.c.b.f30796me) | 48 | (i25 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i26) {
                                AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = androidx.profileinstaller.o.c.f26824k;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i26 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i26 & 57344) | (i26 & bb.c.b.f30796me) | 48 | (i26 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i27 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i27 & 57344) | (i27 & bb.c.b.f30796me) | 48 | (i27 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i28) {
                            AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= bb.c.d.f31193dj;
                hVar2 = hVar;
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (pVarF.s(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i28 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @dl.d
                                public final Boolean a(boolean z11) {
                                    return Boolean.valueOf(z11);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i28 & 57344) | (i28 & bb.c.b.f30796me) | 48 | (i28 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        } else {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i29 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @dl.d
                                public final Boolean a(boolean z11) {
                                    return Boolean.valueOf(z11);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i29 & 57344) | (i29 & bb.c.b.f30796me) | 48 | (i29 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i210) {
                                AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = androidx.profileinstaller.o.c.f26824k;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i210 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i210 & 57344) | (i210 & bb.c.b.f30796me) | 48 | (i210 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i211 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i211 & 57344) | (i211 & bb.c.b.f30796me) | 48 | (i211 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i212) {
                            AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i212 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i212 & 57344) | (i212 & bb.c.b.f30796me) | 48 | (i212 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i213 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i213 & 57344) | (i213 & bb.c.b.f30796me) | 48 | (i213 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i214) {
                            AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i214 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i214 & 57344) | (i214 & bb.c.b.f30796me) | 48 | (i214 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i215 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i215 & 57344) | (i215 & bb.c.b.f30796me) | 48 | (i215 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i216) {
                        AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.b.f30966u4;
            fVar2 = fVar;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    hVar2 = hVar;
                    if (pVarF.s(hVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (pVarF.s(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i216 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @dl.d
                                public final Boolean a(boolean z11) {
                                    return Boolean.valueOf(z11);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i216 & 57344) | (i216 & bb.c.b.f30796me) | 48 | (i216 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        } else {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i217 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @dl.d
                                public final Boolean a(boolean z11) {
                                    return Boolean.valueOf(z11);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i217 & 57344) | (i217 & bb.c.b.f30796me) | 48 | (i217 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i218) {
                                AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = androidx.profileinstaller.o.c.f26824k;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i218 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i218 & 57344) | (i218 & bb.c.b.f30796me) | 48 | (i218 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i219 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i219 & 57344) | (i219 & bb.c.b.f30796me) | 48 | (i219 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2110) {
                            AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i2110 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i2110 & 57344) | (i2110 & bb.c.b.f30796me) | 48 | (i2110 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i2111 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i2111 & 57344) | (i2111 & bb.c.b.f30796me) | 48 | (i2111 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2112) {
                            AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2112 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2112 & 57344) | (i2112 & bb.c.b.f30796me) | 48 | (i2112 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2113 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2113 & 57344) | (i2113 & bb.c.b.f30796me) | 48 | (i2113 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2114) {
                        AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            hVar2 = hVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (pVarF.s(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i2114 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i2114 & 57344) | (i2114 & bb.c.b.f30796me) | 48 | (i2114 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i2115 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i2115 & 57344) | (i2115 & bb.c.b.f30796me) | 48 | (i2115 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2116) {
                            AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2116 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2116 & 57344) | (i2116 & bb.c.b.f30796me) | 48 | (i2116 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2117 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2117 & 57344) | (i2117 & bb.c.b.f30796me) | 48 | (i2117 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2118) {
                        AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2118 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2118 & 57344) | (i2118 & bb.c.b.f30796me) | 48 | (i2118 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2119 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2119 & 57344) | (i2119 & bb.c.b.f30796me) | 48 | (i2119 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21110) {
                        AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = androidx.profileinstaller.o.c.f26824k;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i21110 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i21110 & 57344) | (i21110 & bb.c.b.f30796me) | 48 | (i21110 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i21111 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i21111 & 57344) | (i21111 & bb.c.b.f30796me) | 48 | (i21111 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21112) {
                    AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        nVar2 = nVar;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & bb.c.b.f30796me) == 0) {
                fVar2 = fVar;
                if (pVarF.s(fVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & bb.c.g.f32954lc) == 0) {
                    hVar2 = hVar;
                    if (pVarF.s(hVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 16;
                if (i17 != 0) {
                    if ((i10 & 57344) == 0) {
                        str2 = str;
                        if (pVarF.s(str2)) {
                            i18 = 16384;
                        } else {
                            i18 = 8192;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 32) != 0) {
                        if ((i10 & 458752) == 0) {
                            if (pVarF.s(content)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                        }
                        if ((374491 & i12) == 74898) {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i21112 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @dl.d
                                public final Boolean a(boolean z11) {
                                    return Boolean.valueOf(z11);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i21112 & 57344) | (i21112 & bb.c.b.f30796me) | 48 | (i21112 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        } else {
                            if (i20 != 0) {
                                nVar3 = androidx.compose.ui.n.INSTANCE;
                            } else {
                                nVar3 = nVar2;
                            }
                            if (i13 != 0) {
                                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                            } else {
                                fVarC = fVar2;
                            }
                            if (i15 != 0) {
                                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                            } else {
                                hVarC = hVar2;
                            }
                            if (i17 != 0) {
                                str2 = "AnimatedVisibility";
                            }
                            if (ComposerKt.g0()) {
                                ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                            }
                            int i21113 = i12 << 3;
                            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                                @dl.d
                                public final Boolean a(boolean z11) {
                                    return Boolean.valueOf(z11);
                                }

                                @Override // yh.l
                                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                    return a(bool.booleanValue());
                                }
                            }, nVar3, fVarC, hVarC, content, pVarF, (i21113 & 57344) | (i21113 & bb.c.b.f30796me) | 48 | (i21113 & bb.c.g.f32954lc) | (i12 & 458752));
                            if (ComposerKt.g0()) {
                                ComposerKt.v0();
                            }
                            nVar4 = nVar3;
                            str3 = str2;
                            hVar3 = hVarC;
                            fVar3 = fVarC;
                        }
                        u1VarH = pVarF.H();
                        if (u1VarH == null) {
                            return;
                        }
                        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(2);
                            }

                            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21114) {
                                AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                            }

                            @Override // yh.p
                            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                                a(pVar2, num.intValue());
                                return b2.f124493a;
                            }
                        });
                    }
                    i19 = androidx.profileinstaller.o.c.f26824k;
                    i12 |= i19;
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i21114 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i21114 & 57344) | (i21114 & bb.c.b.f30796me) | 48 | (i21114 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i21115 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i21115 & 57344) | (i21115 & bb.c.b.f30796me) | 48 | (i21115 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21116) {
                            AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i12 |= 24576;
                str2 = str;
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i21116 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i21116 & 57344) | (i21116 & bb.c.b.f30796me) | 48 | (i21116 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i21117 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i21117 & 57344) | (i21117 & bb.c.b.f30796me) | 48 | (i21117 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21118) {
                            AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i21118 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i21118 & 57344) | (i21118 & bb.c.b.f30796me) | 48 | (i21118 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i21119 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i21119 & 57344) | (i21119 & bb.c.b.f30796me) | 48 | (i21119 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211110) {
                        AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= bb.c.d.f31193dj;
            hVar2 = hVar;
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (pVarF.s(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i211110 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i211110 & 57344) | (i211110 & bb.c.b.f30796me) | 48 | (i211110 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i211111 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i211111 & 57344) | (i211111 & bb.c.b.f30796me) | 48 | (i211111 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211112) {
                            AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i211112 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i211112 & 57344) | (i211112 & bb.c.b.f30796me) | 48 | (i211112 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i211113 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i211113 & 57344) | (i211113 & bb.c.b.f30796me) | 48 | (i211113 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211114) {
                        AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i211114 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i211114 & 57344) | (i211114 & bb.c.b.f30796me) | 48 | (i211114 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i211115 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i211115 & 57344) | (i211115 & bb.c.b.f30796me) | 48 | (i211115 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211116) {
                        AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = androidx.profileinstaller.o.c.f26824k;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i211116 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i211116 & 57344) | (i211116 & bb.c.b.f30796me) | 48 | (i211116 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i211117 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i211117 & 57344) | (i211117 & bb.c.b.f30796me) | 48 | (i211117 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i211118) {
                    AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.b.f30966u4;
        fVar2 = fVar;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & bb.c.g.f32954lc) == 0) {
                hVar2 = hVar;
                if (pVarF.s(hVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            i17 = i11 & 16;
            if (i17 != 0) {
                if ((i10 & 57344) == 0) {
                    str2 = str;
                    if (pVarF.s(str2)) {
                        i18 = 16384;
                    } else {
                        i18 = 8192;
                    }
                    i12 |= i18;
                }
                if ((i11 & 32) != 0) {
                    if ((i10 & 458752) == 0) {
                        if (pVarF.s(content)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                    }
                    if ((374491 & i12) == 74898) {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i211118 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i211118 & 57344) | (i211118 & bb.c.b.f30796me) | 48 | (i211118 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    } else {
                        if (i20 != 0) {
                            nVar3 = androidx.compose.ui.n.INSTANCE;
                        } else {
                            nVar3 = nVar2;
                        }
                        if (i13 != 0) {
                            fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                        } else {
                            fVarC = fVar2;
                        }
                        if (i15 != 0) {
                            hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                        } else {
                            hVarC = hVar2;
                        }
                        if (i17 != 0) {
                            str2 = "AnimatedVisibility";
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                        }
                        int i211119 = i12 << 3;
                        b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                            @dl.d
                            public final Boolean a(boolean z11) {
                                return Boolean.valueOf(z11);
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                                return a(bool.booleanValue());
                            }
                        }, nVar3, fVarC, hVarC, content, pVarF, (i211119 & 57344) | (i211119 & bb.c.b.f30796me) | 48 | (i211119 & bb.c.g.f32954lc) | (i12 & 458752));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                        nVar4 = nVar3;
                        str3 = str2;
                        hVar3 = hVarC;
                        fVar3 = fVarC;
                    }
                    u1VarH = pVarF.H();
                    if (u1VarH == null) {
                        return;
                    }
                    u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111110) {
                            AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                        }

                        @Override // yh.p
                        public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                            a(pVar2, num.intValue());
                            return b2.f124493a;
                        }
                    });
                }
                i19 = androidx.profileinstaller.o.c.f26824k;
                i12 |= i19;
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2111110 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2111110 & 57344) | (i2111110 & bb.c.b.f30796me) | 48 | (i2111110 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2111111 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2111111 & 57344) | (i2111111 & bb.c.b.f30796me) | 48 | (i2111111 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111112) {
                        AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i12 |= 24576;
            str2 = str;
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2111112 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2111112 & 57344) | (i2111112 & bb.c.b.f30796me) | 48 | (i2111112 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2111113 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2111113 & 57344) | (i2111113 & bb.c.b.f30796me) | 48 | (i2111113 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111114) {
                        AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = androidx.profileinstaller.o.c.f26824k;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i2111114 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i2111114 & 57344) | (i2111114 & bb.c.b.f30796me) | 48 | (i2111114 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i2111115 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i2111115 & 57344) | (i2111115 & bb.c.b.f30796me) | 48 | (i2111115 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111116) {
                    AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= bb.c.d.f31193dj;
        hVar2 = hVar;
        i17 = i11 & 16;
        if (i17 != 0) {
            if ((i10 & 57344) == 0) {
                str2 = str;
                if (pVarF.s(str2)) {
                    i18 = 16384;
                } else {
                    i18 = 8192;
                }
                i12 |= i18;
            }
            if ((i11 & 32) != 0) {
                if ((i10 & 458752) == 0) {
                    if (pVarF.s(content)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                }
                if ((374491 & i12) == 74898) {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2111116 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2111116 & 57344) | (i2111116 & bb.c.b.f30796me) | 48 | (i2111116 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                } else {
                    if (i20 != 0) {
                        nVar3 = androidx.compose.ui.n.INSTANCE;
                    } else {
                        nVar3 = nVar2;
                    }
                    if (i13 != 0) {
                        fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                    } else {
                        fVarC = fVar2;
                    }
                    if (i15 != 0) {
                        hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                    } else {
                        hVarC = hVar2;
                    }
                    if (i17 != 0) {
                        str2 = "AnimatedVisibility";
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                    }
                    int i2111117 = i12 << 3;
                    b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                        @dl.d
                        public final Boolean a(boolean z11) {
                            return Boolean.valueOf(z11);
                        }

                        @Override // yh.l
                        public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                            return a(bool.booleanValue());
                        }
                    }, nVar3, fVarC, hVarC, content, pVarF, (i2111117 & 57344) | (i2111117 & bb.c.b.f30796me) | 48 | (i2111117 & bb.c.g.f32954lc) | (i12 & 458752));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                    nVar4 = nVar3;
                    str3 = str2;
                    hVar3 = hVarC;
                    fVar3 = fVarC;
                }
                u1VarH = pVarF.H();
                if (u1VarH == null) {
                    return;
                }
                u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(2);
                    }

                    public final void a(@dl.e androidx.compose.runtime.p pVar2, int i2111118) {
                        AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                        a(pVar2, num.intValue());
                        return b2.f124493a;
                    }
                });
            }
            i19 = androidx.profileinstaller.o.c.f26824k;
            i12 |= i19;
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i2111118 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i2111118 & 57344) | (i2111118 & bb.c.b.f30796me) | 48 | (i2111118 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i2111119 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i2111119 & 57344) | (i2111119 & bb.c.b.f30796me) | 48 | (i2111119 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21111110) {
                    AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 24576;
        str2 = str;
        if ((i11 & 32) != 0) {
            if ((i10 & 458752) == 0) {
                if (pVarF.s(content)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
            }
            if ((374491 & i12) == 74898) {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i21111110 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i21111110 & 57344) | (i21111110 & bb.c.b.f30796me) | 48 | (i21111110 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            } else {
                if (i20 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (i13 != 0) {
                    fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
                } else {
                    fVarC = fVar2;
                }
                if (i15 != 0) {
                    hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
                } else {
                    hVarC = hVar2;
                }
                if (i17 != 0) {
                    str2 = "AnimatedVisibility";
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
                }
                int i21111111 = i12 << 3;
                b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                    @dl.d
                    public final Boolean a(boolean z11) {
                        return Boolean.valueOf(z11);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                        return a(bool.booleanValue());
                    }
                }, nVar3, fVarC, hVarC, content, pVarF, (i21111111 & 57344) | (i21111111 & bb.c.b.f30796me) | 48 | (i21111111 & bb.c.g.f32954lc) | (i12 & 458752));
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
                str3 = str2;
                hVar3 = hVarC;
                fVar3 = fVarC;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21111112) {
                    AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i19 = androidx.profileinstaller.o.c.f26824k;
        i12 |= i19;
        if ((374491 & i12) == 74898) {
            if (i20 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
            } else {
                hVarC = hVar2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
            }
            int i21111112 = i12 << 3;
            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                @dl.d
                public final Boolean a(boolean z11) {
                    return Boolean.valueOf(z11);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return a(bool.booleanValue());
                }
            }, nVar3, fVarC, hVarC, content, pVarF, (i21111112 & 57344) | (i21111112 & bb.c.b.f30796me) | 48 | (i21111112 & bb.c.g.f32954lc) | (i12 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            str3 = str2;
            hVar3 = hVarC;
            fVar3 = fVarC;
        } else {
            if (i20 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (i13 != 0) {
                fVarC = EnterExitTransitionKt.v(null, 0.0f, 3, null).c(EnterExitTransitionKt.r(null, null, false, null, 15, null));
            } else {
                fVarC = fVar2;
            }
            if (i15 != 0) {
                hVarC = EnterExitTransitionKt.G(null, null, false, null, 15, null).c(EnterExitTransitionKt.x(null, 0.0f, 3, null));
            } else {
                hVarC = hVar2;
            }
            if (i17 != 0) {
                str2 = "AnimatedVisibility";
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(2088733774, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:119)");
            }
            int i21111113 = i12 << 3;
            b(androidx.compose.animation.core.TransitionKt.o(Boolean.valueOf(z10), str2, pVarF, (i12 & 14) | ((i12 >> 9) & 112), 0), new yh.l<Boolean, Boolean>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$1
                @dl.d
                public final Boolean a(boolean z11) {
                    return Boolean.valueOf(z11);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ Boolean invoke(Boolean bool) {
                    return a(bool.booleanValue());
                }
            }, nVar3, fVarC, hVarC, content, pVarF, (i21111113 & 57344) | (i21111113 & bb.c.b.f30796me) | 48 | (i21111113 & bb.c.g.f32954lc) | (i12 & 458752));
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
            str3 = str2;
            hVar3 = hVarC;
            fVar3 = fVarC;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i21111114) {
                AnimatedVisibilityKt.i(z10, nVar4, fVar3, hVar3, str3, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Code duplicated, block: B:26:0x005b  */
    /* JADX WARN: Code duplicated, block: B:27:0x005e  */
    /* JADX WARN: Code duplicated, block: B:29:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x006b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0072  */
    /* JADX WARN: Code duplicated, block: B:37:0x0075  */
    /* JADX WARN: Code duplicated, block: B:39:0x0079  */
    /* JADX WARN: Code duplicated, block: B:41:0x007f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0082  */
    /* JADX WARN: Code duplicated, block: B:46:0x0089  */
    /* JADX WARN: Code duplicated, block: B:47:0x008e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0096  */
    /* JADX WARN: Code duplicated, block: B:51:0x009c  */
    /* JADX WARN: Code duplicated, block: B:52:0x009f  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:57:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:59:0x00af  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:71:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:81:0x013e  */
    /* JADX WARN: Code duplicated, block: B:86:0x014a  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    @kotlin.k(message = "AnimatedVisibility no longer accepts initiallyVisible as a parameter, please use AnimatedVisibility(MutableTransitionState, Modifier, ...) API instead", replaceWith = @s0(expression = "AnimatedVisibility(transitionState = remember { MutableTransitionState(initiallyVisible) }\n.apply { targetState = visible },\nmodifier = modifier,\nenter = enter,\nexit = exit) {\ncontent() \n}", imports = {"androidx.compose.animation.core.MutableTransitionState"}))
    @j
    @androidx.compose.runtime.i(scheme = "[0[0]]")
    @androidx.compose.runtime.h
    public static final void j(final boolean z10, @dl.e androidx.compose.ui.n nVar, @dl.d final f enter, @dl.d final h exit, final boolean z11, @dl.d final yh.p<? super androidx.compose.runtime.p, ? super Integer, b2> content, @dl.e androidx.compose.runtime.p pVar, final int i10, final int i11) {
        final int i12;
        androidx.compose.ui.n nVar2;
        int i13;
        int i14;
        int i15;
        int i16;
        androidx.compose.ui.n nVar3;
        Object objU;
        final androidx.compose.ui.n nVar4;
        u1 u1VarH;
        f0.p(enter, "enter");
        f0.p(exit, "exit");
        f0.p(content, "content");
        androidx.compose.runtime.p pVarF = pVar.F(1121582420);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 14) == 0) {
            i12 = (pVarF.u(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 112) == 0) {
                nVar2 = nVar;
                i12 |= pVarF.s(nVar2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= bb.c.b.f30966u4;
            } else if ((i10 & bb.c.b.f30796me) == 0) {
                if (pVarF.s(enter)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i11 & 8) != 0) {
                i12 |= bb.c.d.f31193dj;
            } else if ((i10 & bb.c.g.f32954lc) == 0) {
                if (pVarF.s(exit)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (pVarF.u(z11)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.o.c.f26824k;
            } else if ((458752 & i10) == 0) {
                if (pVarF.s(content)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((374491 & i12) == 74898 || !pVarF.b()) {
                if (i17 != 0) {
                    nVar3 = androidx.compose.ui.n.INSTANCE;
                } else {
                    nVar3 = nVar2;
                }
                if (ComposerKt.g0()) {
                    ComposerKt.w0(1121582420, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:701)");
                }
                pVarF.T(-492369756);
                objU = pVarF.U();
                if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                    objU = new r0(Boolean.valueOf(z11));
                    pVarF.N(objU);
                }
                pVarF.c0();
                r0 r0Var = (r0) objU;
                r0Var.g(Boolean.valueOf(z10));
                c(r0Var, nVar3, enter, exit, null, androidx.compose.runtime.internal.b.b(pVarF, 1996320812, true, new yh.q<c, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(3);
                    }

                    @androidx.compose.runtime.h
                    public final void a(@dl.d c AnimatedVisibility, @dl.e androidx.compose.runtime.p pVar2, int i18) {
                        f0.p(AnimatedVisibility, "$this$AnimatedVisibility");
                        if ((i18 & 81) == 16 && pVar2.b()) {
                            pVar2.l();
                            return;
                        }
                        if (ComposerKt.g0()) {
                            ComposerKt.w0(1996320812, i18, -1, "androidx.compose.animation.AnimatedVisibility.<anonymous> (AnimatedVisibility.kt:714)");
                        }
                        content.invoke(pVar2, Integer.valueOf((i12 >> 15) & 14));
                        if (ComposerKt.g0()) {
                            ComposerKt.v0();
                        }
                    }

                    @Override // yh.q
                    public /* bridge */ /* synthetic */ b2 invoke(c cVar, androidx.compose.runtime.p pVar2, Integer num) {
                        a(cVar, pVar2, num.intValue());
                        return b2.f124493a;
                    }
                }), pVarF, r0.f4499d | androidx.profileinstaller.o.c.f26824k | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 16);
                if (ComposerKt.g0()) {
                    ComposerKt.v0();
                }
                nVar4 = nVar3;
            } else {
                pVarF.l();
                nVar4 = nVar2;
            }
            u1VarH = pVarF.H();
            if (u1VarH == null) {
                return;
            }
            u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$17
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                    AnimatedVisibilityKt.j(z10, nVar4, enter, exit, z11, content, pVar2, i10 | 1, i11);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                    a(pVar2, num.intValue());
                    return b2.f124493a;
                }
            });
        }
        i12 |= 48;
        nVar2 = nVar;
        if ((i11 & 4) != 0) {
            i12 |= bb.c.b.f30966u4;
        } else if ((i10 & bb.c.b.f30796me) == 0) {
            if (pVarF.s(enter)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i11 & 8) != 0) {
            i12 |= bb.c.d.f31193dj;
        } else if ((i10 & bb.c.g.f32954lc) == 0) {
            if (pVarF.s(exit)) {
                i14 = 2048;
            } else {
                i14 = 1024;
            }
            i12 |= i14;
        }
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (pVarF.u(z11)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.o.c.f26824k;
        } else if ((458752 & i10) == 0) {
            if (pVarF.s(content)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((374491 & i12) == 74898) {
            if (i17 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1121582420, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:701)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new r0(Boolean.valueOf(z11));
                pVarF.N(objU);
            }
            pVarF.c0();
            r0 r0Var2 = (r0) objU;
            r0Var2.g(Boolean.valueOf(z10));
            c(r0Var2, nVar3, enter, exit, null, androidx.compose.runtime.internal.b.b(pVarF, 1996320812, true, new yh.q<c, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @androidx.compose.runtime.h
                public final void a(@dl.d c AnimatedVisibility, @dl.e androidx.compose.runtime.p pVar2, int i18) {
                    f0.p(AnimatedVisibility, "$this$AnimatedVisibility");
                    if ((i18 & 81) == 16 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1996320812, i18, -1, "androidx.compose.animation.AnimatedVisibility.<anonymous> (AnimatedVisibility.kt:714)");
                    }
                    content.invoke(pVar2, Integer.valueOf((i12 >> 15) & 14));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ b2 invoke(c cVar, androidx.compose.runtime.p pVar2, Integer num) {
                    a(cVar, pVar2, num.intValue());
                    return b2.f124493a;
                }
            }), pVarF, r0.f4499d | androidx.profileinstaller.o.c.f26824k | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 16);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
        } else {
            if (i17 != 0) {
                nVar3 = androidx.compose.ui.n.INSTANCE;
            } else {
                nVar3 = nVar2;
            }
            if (ComposerKt.g0()) {
                ComposerKt.w0(1121582420, i12, -1, "androidx.compose.animation.AnimatedVisibility (AnimatedVisibility.kt:701)");
            }
            pVarF.T(-492369756);
            objU = pVarF.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = new r0(Boolean.valueOf(z11));
                pVarF.N(objU);
            }
            pVarF.c0();
            r0 r0Var3 = (r0) objU;
            r0Var3.g(Boolean.valueOf(z10));
            c(r0Var3, nVar3, enter, exit, null, androidx.compose.runtime.internal.b.b(pVarF, 1996320812, true, new yh.q<c, androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$16
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                @androidx.compose.runtime.h
                public final void a(@dl.d c AnimatedVisibility, @dl.e androidx.compose.runtime.p pVar2, int i18) {
                    f0.p(AnimatedVisibility, "$this$AnimatedVisibility");
                    if ((i18 & 81) == 16 && pVar2.b()) {
                        pVar2.l();
                        return;
                    }
                    if (ComposerKt.g0()) {
                        ComposerKt.w0(1996320812, i18, -1, "androidx.compose.animation.AnimatedVisibility.<anonymous> (AnimatedVisibility.kt:714)");
                    }
                    content.invoke(pVar2, Integer.valueOf((i12 >> 15) & 14));
                    if (ComposerKt.g0()) {
                        ComposerKt.v0();
                    }
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ b2 invoke(c cVar, androidx.compose.runtime.p pVar2, Integer num) {
                    a(cVar, pVar2, num.intValue());
                    return b2.f124493a;
                }
            }), pVarF, r0.f4499d | androidx.profileinstaller.o.c.f26824k | (i12 & 112) | (i12 & bb.c.b.f30796me) | (i12 & bb.c.g.f32954lc), 16);
            if (ComposerKt.g0()) {
                ComposerKt.v0();
            }
            nVar4 = nVar3;
        }
        u1VarH = pVarF.H();
        if (u1VarH == null) {
            return;
        }
        u1VarH.a(new yh.p<androidx.compose.runtime.p, Integer, b2>() { // from class: androidx.compose.animation.AnimatedVisibilityKt$AnimatedVisibility$17
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            public final void a(@dl.e androidx.compose.runtime.p pVar2, int i18) {
                AnimatedVisibilityKt.j(z10, nVar4, enter, exit, z11, content, pVar2, i10 | 1, i11);
            }

            @Override // yh.p
            public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.runtime.p pVar2, Integer num) {
                a(pVar2, num.intValue());
                return b2.f124493a;
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    @androidx.compose.runtime.h
    private static final <T> EnterExitState l(Transition<T> transition, yh.l<? super T, Boolean> lVar, T t10, androidx.compose.runtime.p pVar, int i10) {
        EnterExitState enterExitState;
        pVar.T(361571134);
        if (ComposerKt.g0()) {
            ComposerKt.w0(361571134, i10, -1, "androidx.compose.animation.targetEnterExit (AnimatedVisibility.kt:830)");
        }
        pVar.X(-721837504, transition);
        if (!transition.t()) {
            pVar.T(-492369756);
            Object objU = pVar.U();
            if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
                objU = h2.g(Boolean.FALSE, null, 2, null);
                pVar.N(objU);
            }
            pVar.c0();
            a1 a1Var = (a1) objU;
            if (lVar.invoke(transition.h()).booleanValue()) {
                a1Var.setValue(Boolean.TRUE);
            }
            if (lVar.invoke(t10).booleanValue()) {
                enterExitState = EnterExitState.Visible;
            } else {
                enterExitState = ((Boolean) a1Var.getValue()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
            }
        } else if (lVar.invoke(t10).booleanValue()) {
            enterExitState = EnterExitState.Visible;
        } else {
            enterExitState = lVar.invoke(transition.h()).booleanValue() ? EnterExitState.PostExit : EnterExitState.PreEnter;
        }
        pVar.b0();
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return enterExitState;
    }
}
