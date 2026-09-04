package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.z0;
import androidx.compose.foundation.MutatePriority;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.e2;
import androidx.compose.runtime.m2;
import androidx.constraintlayout.core.motion.utils.w;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aV\u0010\u000b\u001a\u00020\n2K\u0010\t\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0000ø\u0001\u0000\u001a_\u0010\f\u001a\u00020\n2K\u0010\t\u001aG\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0004\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0006\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0002\u0012\b\b\u0003\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0000H\u0007ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\u0011\u001a\u00020\b*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a/\u0010\u0014\u001a\u00020\b*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\u000fH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0012\u001a5\u0010\u0016\u001a\u00020\b*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00052\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001f\u0010\u0018\u001a\u00020\b*\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00020\b*\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0001H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u0019\u001a%\u0010\u001b\u001a\u00020\b*\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0005H\u0086@ø\u0001\u0001ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a!\u0010\u001f\u001a\u00020\b*\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\u001dH\u0086@ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 \u0082\u0002\u000b\n\u0002\b\u0019\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"Lkotlin/Function3;", "", "Lkotlin/m0;", "name", "zoomChange", "Lb1/f;", "panChange", "rotationChange", "Lkotlin/b2;", "onTransformation", "Landroidx/compose/foundation/gestures/t;", ak.av, "i", "(Lyh/q;Landroidx/compose/runtime/p;I)Landroidx/compose/foundation/gestures/t;", "zoomFactor", "Landroidx/compose/animation/core/h;", "animationSpec", "f", "(Landroidx/compose/foundation/gestures/t;FLandroidx/compose/animation/core/h;Lkotlin/coroutines/c;)Ljava/lang/Object;", "degrees", "d", w.c.R, "b", "(Landroidx/compose/foundation/gestures/t;JLandroidx/compose/animation/core/h;Lkotlin/coroutines/c;)Ljava/lang/Object;", "m", "(Landroidx/compose/foundation/gestures/t;FLkotlin/coroutines/c;)Ljava/lang/Object;", "j", RXScreenCaptureService.KEY_HEIGHT, "(Landroidx/compose/foundation/gestures/t;JLkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/foundation/MutatePriority;", "terminationPriority", "k", "(Landroidx/compose/foundation/gestures/t;Landroidx/compose/foundation/MutatePriority;Lkotlin/coroutines/c;)Ljava/lang/Object;", "foundation_release"}, k = 2, mv = {1, 7, 1})
public final class TransformableStateKt {
    @dl.d
    public static final t a(@dl.d yh.q<? super Float, ? super b1.f, ? super Float, b2> onTransformation) {
        f0.p(onTransformation, "onTransformation");
        return new DefaultTransformableState(onTransformation);
    }

    @dl.e
    public static final Object b(@dl.d t tVar, long j10, @dl.d androidx.compose.animation.core.h<b1.f> hVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Ref.LongRef longRef = new Ref.LongRef();
        longRef.f124890b = b1.f.f30364b.e();
        Object objA = s.a(tVar, null, new TransformableStateKt$animatePanBy$2(longRef, j10, hVar, null), cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    public static /* synthetic */ Object c(t tVar, long j10, androidx.compose.animation.core.h hVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            hVar = new z0(0.0f, 200.0f, null, 5, null);
        }
        return b(tVar, j10, hVar, cVar);
    }

    @dl.e
    public static final Object d(@dl.d t tVar, float f10, @dl.d androidx.compose.animation.core.h<Float> hVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = s.a(tVar, null, new TransformableStateKt$animateRotateBy$2(new Ref.FloatRef(), f10, hVar, null), cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    public static /* synthetic */ Object e(t tVar, float f10, androidx.compose.animation.core.h hVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            hVar = new z0(0.0f, 200.0f, null, 5, null);
        }
        return d(tVar, f10, hVar, cVar);
    }

    @dl.e
    public static final Object f(@dl.d t tVar, float f10, @dl.d androidx.compose.animation.core.h<Float> hVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        if (!(f10 > 0.0f)) {
            throw new IllegalArgumentException("zoom value should be greater than 0".toString());
        }
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.f124888b = 1.0f;
        Object objA = s.a(tVar, null, new TransformableStateKt$animateZoomBy$3(floatRef, f10, hVar, null), cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    public static /* synthetic */ Object g(t tVar, float f10, androidx.compose.animation.core.h hVar, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            hVar = new z0(0.0f, 200.0f, null, 5, null);
        }
        return f(tVar, f10, hVar, cVar);
    }

    @dl.e
    public static final Object h(@dl.d t tVar, long j10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = s.a(tVar, null, new TransformableStateKt$panBy$2(j10, null), cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @dl.d
    @androidx.compose.runtime.h
    public static final t i(@dl.d yh.q<? super Float, ? super b1.f, ? super Float, b2> onTransformation, @dl.e androidx.compose.runtime.p pVar, int i10) {
        f0.p(onTransformation, "onTransformation");
        pVar.T(1681419281);
        if (ComposerKt.g0()) {
            ComposerKt.w0(1681419281, i10, -1, "androidx.compose.foundation.gestures.rememberTransformableState (TransformableState.kt:114)");
        }
        final m2 m2VarT = e2.t(onTransformation, pVar, i10 & 14);
        pVar.T(-492369756);
        Object objU = pVar.U();
        if (objU == androidx.compose.runtime.p.INSTANCE.a()) {
            objU = a(new yh.q<Float, b1.f, Float, b2>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$rememberTransformableState$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(3);
                }

                public final void a(float f10, long j10, float f11) {
                    m2VarT.getValue().invoke(Float.valueOf(f10), b1.f.d(j10), Float.valueOf(f11));
                }

                @Override // yh.q
                public /* bridge */ /* synthetic */ b2 invoke(Float f10, b1.f fVar, Float f11) {
                    a(f10.floatValue(), fVar.getF30368a(), f11.floatValue());
                    return b2.f124493a;
                }
            });
            pVar.N(objU);
        }
        pVar.c0();
        t tVar = (t) objU;
        if (ComposerKt.g0()) {
            ComposerKt.v0();
        }
        pVar.c0();
        return tVar;
    }

    @dl.e
    public static final Object j(@dl.d t tVar, float f10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = s.a(tVar, null, new TransformableStateKt$rotateBy$2(f10, null), cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    @dl.e
    public static final Object k(@dl.d t tVar, @dl.d MutatePriority mutatePriority, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = tVar.a(mutatePriority, new TransformableStateKt$stopTransformation$2(null), cVar);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }

    public static /* synthetic */ Object l(t tVar, MutatePriority mutatePriority, kotlin.coroutines.c cVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            mutatePriority = MutatePriority.Default;
        }
        return k(tVar, mutatePriority, cVar);
    }

    @dl.e
    public static final Object m(@dl.d t tVar, float f10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objA = s.a(tVar, null, new TransformableStateKt$zoomBy$2(f10, null), cVar, 1, null);
        return objA == kotlin.coroutines.intrinsics.b.h() ? objA : b2.f124493a;
    }
}
