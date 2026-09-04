package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.x;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: Scrollable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/g;", "Landroidx/compose/foundation/gestures/m;", "", "initialVelocity", ak.av, "(Landroidx/compose/foundation/gestures/m;FLkotlin/coroutines/c;)Ljava/lang/Object;", "Landroidx/compose/animation/core/x;", "Landroidx/compose/animation/core/x;", "flingDecay", "<init>", "(Landroidx/compose/animation/core/x;)V", "foundation_release"}, k = 1, mv = {1, 7, 1})
public final class DefaultFlingBehavior implements g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final x<Float> flingDecay;

    public DefaultFlingBehavior(@dl.d x<Float> flingDecay) {
        f0.p(flingDecay, "flingDecay");
        this.flingDecay = flingDecay;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.compose.foundation.gestures.g
    @dl.e
    public Object a(@dl.d final m mVar, float f10, @dl.d kotlin.coroutines.c<? super Float> cVar) throws Throwable {
        DefaultFlingBehavior$performFling$1 defaultFlingBehavior$performFling$1;
        float f11;
        Ref.FloatRef floatRef;
        if (cVar instanceof DefaultFlingBehavior$performFling$1) {
            defaultFlingBehavior$performFling$1 = (DefaultFlingBehavior$performFling$1) cVar;
            int i10 = defaultFlingBehavior$performFling$1.f5145e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                defaultFlingBehavior$performFling$1.f5145e = i10 - Integer.MIN_VALUE;
            } else {
                defaultFlingBehavior$performFling$1 = new DefaultFlingBehavior$performFling$1(this, cVar);
            }
        } else {
            defaultFlingBehavior$performFling$1 = new DefaultFlingBehavior$performFling$1(this, cVar);
        }
        DefaultFlingBehavior$performFling$1 defaultFlingBehavior$performFling$2 = defaultFlingBehavior$performFling$1;
        Object obj = defaultFlingBehavior$performFling$2.f5143c;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = defaultFlingBehavior$performFling$2.f5145e;
        if (i11 == 0) {
            t0.n(obj);
            if (Math.abs(f10) > 1.0f) {
                final Ref.FloatRef floatRef2 = new Ref.FloatRef();
                floatRef2.f124888b = f10;
                final Ref.FloatRef floatRef3 = new Ref.FloatRef();
                AnimationState animationStateC = androidx.compose.animation.core.k.c(0.0f, f10, 0L, 0L, false, 28, null);
                x<Float> xVar = this.flingDecay;
                yh.l<androidx.compose.animation.core.g<Float, androidx.compose.animation.core.l>, b2> lVar = new yh.l<androidx.compose.animation.core.g<Float, androidx.compose.animation.core.l>, b2>() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d androidx.compose.animation.core.g<Float, androidx.compose.animation.core.l> animateDecay) {
                        f0.p(animateDecay, "$this$animateDecay");
                        float fFloatValue = animateDecay.g().floatValue() - floatRef3.f124888b;
                        float fA = mVar.a(fFloatValue);
                        floatRef3.f124888b = animateDecay.g().floatValue();
                        floatRef2.f124888b = animateDecay.h().floatValue();
                        if (Math.abs(fFloatValue - fA) > 0.5f) {
                            animateDecay.a();
                        }
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.animation.core.g<Float, androidx.compose.animation.core.l> gVar) {
                        a(gVar);
                        return b2.f124493a;
                    }
                };
                defaultFlingBehavior$performFling$2.f5142b = floatRef2;
                defaultFlingBehavior$performFling$2.f5145e = 1;
                if (SuspendAnimationKt.k(animationStateC, xVar, false, lVar, defaultFlingBehavior$performFling$2, 2, null) == objH) {
                    return objH;
                }
                floatRef = floatRef2;
            } else {
                f11 = f10;
            }
            return kotlin.coroutines.jvm.internal.a.e(f11);
        }
        if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        floatRef = (Ref.FloatRef) defaultFlingBehavior$performFling$2.f5142b;
        t0.n(obj);
        f11 = floatRef.f124888b;
        return kotlin.coroutines.jvm.internal.a.e(f11);
    }
}
