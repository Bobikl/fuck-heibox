package androidx.compose.foundation.gestures.snapping;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.d0;
import androidx.compose.animation.core.g;
import androidx.compose.animation.core.i;
import androidx.compose.animation.core.k;
import androidx.compose.animation.core.l;
import androidx.compose.animation.core.x;
import androidx.compose.animation.w;
import androidx.compose.foundation.gestures.m;
import androidx.compose.foundation.t;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.p;
import androidx.compose.ui.platform.CompositionLocalsKt;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import fi.f;
import fi.u;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import s1.h;

/* JADX INFO: compiled from: SnapFlingBehavior.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001aK\u0010\u000f\u001a\u00020\u000e*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\fH\u0000\u001a*\u0010\u0016\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u0013*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0082\u0002¢\u0006\u0004\b\u0016\u0010\u0017\u001a*\u0010\u0018\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u00028\u00000\u0013*\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0082\u0002¢\u0006\u0004\b\u0018\u0010\u0017\u001aM\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001a*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00060\u001cH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u001e\u0010\u001f\u001aU\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001a*\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u00062\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\u001a2\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060!H\u0082@ø\u0001\u0000¢\u0006\u0004\b#\u0010$\u001a\u0014\u0010&\u001a\u00020\u0006*\u00020\u00062\u0006\u0010%\u001a\u00020\u0006H\u0002\"\u001d\u0010,\u001a\u00020'8\u0000X\u0080\u0004ø\u0001\u0000¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+\"\u0014\u0010.\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b-\u0010)\"\u0014\u00100\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b/\u0010)\u0082\u0002\u0004\n\u0002\b\u0019¨\u00061"}, d2 = {"Landroidx/compose/foundation/gestures/snapping/e;", "snapLayoutInfoProvider", "Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "p", "(Landroidx/compose/foundation/gestures/snapping/e;Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/gestures/snapping/SnapFlingBehavior;", "Landroidx/compose/foundation/gestures/m;", "", "initialTargetOffset", "initialVelocity", "Landroidx/compose/foundation/gestures/snapping/a;", "Landroidx/compose/animation/core/l;", "animation", "Ls1/e;", "density", "Landroidx/compose/foundation/gestures/snapping/b;", "i", "(Landroidx/compose/foundation/gestures/m;FFLandroidx/compose/foundation/gestures/snapping/a;Landroidx/compose/foundation/gestures/snapping/e;Ls1/e;Lkotlin/coroutines/c;)Ljava/lang/Object;", "velocity", "m", "", androidx.exifinterface.media.a.f23244d5, "Lfi/f;", "k", "(Lfi/f;)Ljava/lang/Comparable;", "l", "targetOffset", "Landroidx/compose/animation/core/j;", "animationState", "Landroidx/compose/animation/core/x;", "decayAnimationSpec", "f", "(Landroidx/compose/foundation/gestures/m;FLandroidx/compose/animation/core/j;Landroidx/compose/animation/core/x;Lkotlin/coroutines/c;)Ljava/lang/Object;", "cancelOffset", "Landroidx/compose/animation/core/h;", "snapAnimationSpec", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/foundation/gestures/m;FFLandroidx/compose/animation/core/j;Landroidx/compose/animation/core/h;Lkotlin/coroutines/c;)Ljava/lang/Object;", "target", "j", "Ls1/h;", ak.av, "F", "o", "()F", "MinFlingVelocityDp", "b", "NoDistance", ak.aF, "NoVelocity", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class SnapFlingBehaviorKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f5809a = h.g(400);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f5810b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f5811c = 0.0f;

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object f(final m mVar, final float f10, AnimationState<Float, l> animationState, x<Float> xVar, kotlin.coroutines.c<? super AnimationState<Float, l>> cVar) throws Throwable {
        SnapFlingBehaviorKt$animateDecay$1 snapFlingBehaviorKt$animateDecay$1;
        if (cVar instanceof SnapFlingBehaviorKt$animateDecay$1) {
            snapFlingBehaviorKt$animateDecay$1 = (SnapFlingBehaviorKt$animateDecay$1) cVar;
            int i10 = snapFlingBehaviorKt$animateDecay$1.f5814d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateDecay$1.f5814d = i10 - Integer.MIN_VALUE;
            } else {
                snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(cVar);
            }
        } else {
            snapFlingBehaviorKt$animateDecay$1 = new SnapFlingBehaviorKt$animateDecay$1(cVar);
        }
        Object obj = snapFlingBehaviorKt$animateDecay$1.f5813c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = snapFlingBehaviorKt$animateDecay$1.f5814d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AnimationState animationState2 = (AnimationState) snapFlingBehaviorKt$animateDecay$1.f5812b;
            t0.n(obj);
            return animationState2;
        }
        t0.n(obj);
        final Ref.FloatRef floatRef = new Ref.FloatRef();
        boolean z10 = animationState.h().floatValue() == 0.0f;
        yh.l<g<Float, l>, b2> lVar = new yh.l<g<Float, l>, b2>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateDecay$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d g<Float, l> animateDecay) {
                f0.p(animateDecay, "$this$animateDecay");
                if (Math.abs(animateDecay.g().floatValue()) >= Math.abs(f10)) {
                    SnapFlingBehaviorKt.g(animateDecay, mVar, SnapFlingBehaviorKt.j(animateDecay.g().floatValue(), f10) - floatRef.f124888b);
                    animateDecay.a();
                } else {
                    SnapFlingBehaviorKt.g(animateDecay, mVar, animateDecay.g().floatValue() - floatRef.f124888b);
                    floatRef.f124888b = animateDecay.g().floatValue();
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(g<Float, l> gVar) {
                a(gVar);
                return b2.f124493a;
            }
        };
        snapFlingBehaviorKt$animateDecay$1.f5812b = animationState;
        snapFlingBehaviorKt$animateDecay$1.f5814d = 1;
        return SuspendAnimationKt.j(animationState, xVar, z10 ^ true, lVar, snapFlingBehaviorKt$animateDecay$1) == objH ? objH : animationState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(g<Float, l> gVar, m mVar, float f10) {
        if (Math.abs(f10 - mVar.a(f10)) > 0.5f) {
            gVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(final m mVar, float f10, final float f11, AnimationState<Float, l> animationState, androidx.compose.animation.core.h<Float> hVar, kotlin.coroutines.c<? super AnimationState<Float, l>> cVar) throws Throwable {
        SnapFlingBehaviorKt$animateSnap$1 snapFlingBehaviorKt$animateSnap$1;
        AnimationState<Float, l> animationState2;
        float f12;
        if (cVar instanceof SnapFlingBehaviorKt$animateSnap$1) {
            snapFlingBehaviorKt$animateSnap$1 = (SnapFlingBehaviorKt$animateSnap$1) cVar;
            int i10 = snapFlingBehaviorKt$animateSnap$1.f5821e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$animateSnap$1.f5821e = i10 - Integer.MIN_VALUE;
            } else {
                snapFlingBehaviorKt$animateSnap$1 = new SnapFlingBehaviorKt$animateSnap$1(cVar);
            }
        } else {
            snapFlingBehaviorKt$animateSnap$1 = new SnapFlingBehaviorKt$animateSnap$1(cVar);
        }
        SnapFlingBehaviorKt$animateSnap$1 snapFlingBehaviorKt$animateSnap$2 = snapFlingBehaviorKt$animateSnap$1;
        Object obj = snapFlingBehaviorKt$animateSnap$2.f5820d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = snapFlingBehaviorKt$animateSnap$2.f5821e;
        if (i11 == 0) {
            t0.n(obj);
            final Ref.FloatRef floatRef = new Ref.FloatRef();
            float fFloatValue = animationState.h().floatValue();
            Float fE = kotlin.coroutines.jvm.internal.a.e(f10);
            boolean z10 = animationState.h().floatValue() == 0.0f;
            yh.l<g<Float, l>, b2> lVar = new yh.l<g<Float, l>, b2>() { // from class: androidx.compose.foundation.gestures.snapping.SnapFlingBehaviorKt$animateSnap$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                /* JADX WARN: Code duplicated, block: B:9:0x0040  */
                public final void a(@dl.d g<Float, l> animateTo) {
                    f0.p(animateTo, "$this$animateTo");
                    float fJ = SnapFlingBehaviorKt.j(animateTo.g().floatValue(), f11);
                    float f13 = fJ - floatRef.f124888b;
                    if (Math.abs(f13 - mVar.a(f13)) > 0.5f) {
                        animateTo.a();
                    } else {
                        if (!(fJ == animateTo.g().floatValue())) {
                            animateTo.a();
                        }
                    }
                    floatRef.f124888b += f13;
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(g<Float, l> gVar) {
                    a(gVar);
                    return b2.f124493a;
                }
            };
            snapFlingBehaviorKt$animateSnap$2.f5818b = animationState;
            snapFlingBehaviorKt$animateSnap$2.f5819c = fFloatValue;
            snapFlingBehaviorKt$animateSnap$2.f5821e = 1;
            if (SuspendAnimationKt.l(animationState, fE, hVar, !z10, lVar, snapFlingBehaviorKt$animateSnap$2) == objH) {
                return objH;
            }
            animationState2 = animationState;
            f12 = fFloatValue;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f12 = snapFlingBehaviorKt$animateSnap$2.f5819c;
            AnimationState<Float, l> animationState3 = (AnimationState) snapFlingBehaviorKt$animateSnap$2.f5818b;
            t0.n(obj);
            animationState2 = animationState3;
        }
        return k.g(animationState2, 0.0f, j(animationState2.h().floatValue(), f12), 0L, 0L, false, 29, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(m mVar, float f10, float f11, a<Float, l> aVar, e eVar, s1.e eVar2, kotlin.coroutines.c<? super ApproachStepResult> cVar) throws Throwable {
        SnapFlingBehaviorKt$approach$1 snapFlingBehaviorKt$approach$1;
        if (cVar instanceof SnapFlingBehaviorKt$approach$1) {
            snapFlingBehaviorKt$approach$1 = (SnapFlingBehaviorKt$approach$1) cVar;
            int i10 = snapFlingBehaviorKt$approach$1.f5828e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                snapFlingBehaviorKt$approach$1.f5828e = i10 - Integer.MIN_VALUE;
            } else {
                snapFlingBehaviorKt$approach$1 = new SnapFlingBehaviorKt$approach$1(cVar);
            }
        } else {
            snapFlingBehaviorKt$approach$1 = new SnapFlingBehaviorKt$approach$1(cVar);
        }
        Object objA = snapFlingBehaviorKt$approach$1.f5827d;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = snapFlingBehaviorKt$approach$1.f5828e;
        if (i11 == 0) {
            t0.n(objA);
            Float fE = kotlin.coroutines.jvm.internal.a.e(f10);
            Float fE2 = kotlin.coroutines.jvm.internal.a.e(f11);
            snapFlingBehaviorKt$approach$1.f5825b = eVar;
            snapFlingBehaviorKt$approach$1.f5826c = eVar2;
            snapFlingBehaviorKt$approach$1.f5828e = 1;
            objA = aVar.a(mVar, fE, fE2, snapFlingBehaviorKt$approach$1);
            if (objA == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar2 = (s1.e) snapFlingBehaviorKt$approach$1.f5826c;
            eVar = (e) snapFlingBehaviorKt$approach$1.f5825b;
            t0.n(objA);
        }
        AnimationState animationState = (AnimationState) objA;
        return new ApproachStepResult(m(((Number) animationState.h()).floatValue(), eVar, eVar2), animationState);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float j(float f10, float f11) {
        if (f11 == 0.0f) {
            return 0.0f;
        }
        return f11 > 0.0f ? u.A(f10, f11) : u.t(f10, f11);
    }

    private static final <T extends Comparable<? super T>> T k(f<T> fVar) {
        f0.p(fVar, "<this>");
        return fVar.D();
    }

    private static final <T extends Comparable<? super T>> T l(f<T> fVar) {
        f0.p(fVar, "<this>");
        return fVar.e();
    }

    /* JADX WARN: Code duplicated, block: B:15:0x004a  */
    public static final float m(float f10, @dl.d e snapLayoutInfoProvider, @dl.d s1.e density) {
        f0.p(snapLayoutInfoProvider, "snapLayoutInfoProvider");
        f0.p(density, "density");
        f<Float> fVarA = snapLayoutInfoProvider.a(density);
        float fFloatValue = ((Number) k(fVarA)).floatValue();
        float fFloatValue2 = ((Number) l(fVarA)).floatValue();
        float fSignum = Math.signum(f10);
        if (!(fSignum == 0.0f)) {
            if (fSignum == 1.0f) {
                fFloatValue = fFloatValue2;
            } else {
                if (!(fSignum == -1.0f)) {
                    fFloatValue = 0.0f;
                }
            }
        } else if (Math.abs(fFloatValue2) <= Math.abs(fFloatValue)) {
            fFloatValue = fFloatValue2;
        }
        if (n(fFloatValue)) {
            return fFloatValue;
        }
        return 0.0f;
    }

    private static final boolean n(float f10) {
        if (!(f10 == Float.POSITIVE_INFINITY)) {
            if (!(f10 == Float.NEGATIVE_INFINITY)) {
                return true;
            }
        }
        return false;
    }

    public static final float o() {
        return f5809a;
    }

    @t
    @dl.d
    @androidx.compose.runtime.h
    public static final SnapFlingBehavior p(@dl.d e snapLayoutInfoProvider, @dl.e p pVar, int i10) {
        f0.p(snapLayoutInfoProvider, "snapLayoutInfoProvider");
        pVar.T(-473984552);
        if (ComposerKt.g0()) {
            ComposerKt.w0(-473984552, i10, -1, "androidx.compose.foundation.gestures.snapping.rememberSnapFlingBehavior (SnapFlingBehavior.kt:182)");
        }
        s1.e eVar = (s1.e) pVar.K(CompositionLocalsKt.i());
        x xVarB = w.b(pVar, 0);
        pVar.T(1618982084);
        boolean zS = pVar.s(snapLayoutInfoProvider) | pVar.s(xVarB) | pVar.s(eVar);
        Object objU = pVar.U();
        if (zS || objU == p.INSTANCE.a()) {
            Object snapFlingBehavior = new SnapFlingBehavior(snapLayoutInfoProvider, i.q(0, 0, d0.c(), 3, null), xVarB, i.o(0.0f, 400.0f, null, 5, null), eVar, 0.0f, 32, null);
            pVar.N(snapFlingBehavior);
            objU = snapFlingBehavior;
        }
        pVar.c0();
        SnapFlingBehavior snapFlingBehavior2 = (SnapFlingBehavior) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return snapFlingBehavior2;
    }
}
