package androidx.compose.material3;

import androidx.compose.animation.core.Animatable;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: Swipeable.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Landroidx/compose/foundation/gestures/d;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.material3.SwipeableState$animateInternalToOffset$2", f = "Swipeable.kt", i = {}, l = {bb.c.b.f30852p1}, m = "invokeSuspend", n = {}, s = {})
public final class SwipeableState$animateInternalToOffset$2 extends SuspendLambda implements yh.p<androidx.compose.foundation.gestures.d, kotlin.coroutines.c<? super kotlin.b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f11082b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f11083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SwipeableState<T> f11084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f11085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.core.h<Float> f11086f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$animateInternalToOffset$2(SwipeableState<T> swipeableState, float f10, androidx.compose.animation.core.h<Float> hVar, kotlin.coroutines.c<? super SwipeableState$animateInternalToOffset$2> cVar) {
        super(2, cVar);
        this.f11084d = swipeableState;
        this.f11085e = f10;
        this.f11086f = hVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d androidx.compose.foundation.gestures.d dVar, @dl.e kotlin.coroutines.c<? super kotlin.b2> cVar) {
        return ((SwipeableState$animateInternalToOffset$2) create(dVar, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        SwipeableState$animateInternalToOffset$2 swipeableState$animateInternalToOffset$2 = new SwipeableState$animateInternalToOffset$2(this.f11084d, this.f11085e, this.f11086f, cVar);
        swipeableState$animateInternalToOffset$2.f11083c = obj;
        return swipeableState$animateInternalToOffset$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f11082b;
        try {
            if (i10 == 0) {
                kotlin.t0.n(obj);
                final androidx.compose.foundation.gestures.d dVar = (androidx.compose.foundation.gestures.d) this.f11083c;
                final Ref.FloatRef floatRef = new Ref.FloatRef();
                floatRef.f124888b = ((Number) ((SwipeableState) this.f11084d).absoluteOffset.getValue()).floatValue();
                ((SwipeableState) this.f11084d).animationTarget.setValue(kotlin.coroutines.jvm.internal.a.e(this.f11085e));
                this.f11084d.J(true);
                Animatable animatableB = androidx.compose.animation.core.b.b(floatRef.f124888b, 0.0f, 2, null);
                Float fE = kotlin.coroutines.jvm.internal.a.e(this.f11085e);
                androidx.compose.animation.core.h<Float> hVar = this.f11086f;
                yh.l<Animatable<Float, androidx.compose.animation.core.l>, kotlin.b2> lVar = new yh.l<Animatable<Float, androidx.compose.animation.core.l>, kotlin.b2>() { // from class: androidx.compose.material3.SwipeableState$animateInternalToOffset$2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(@dl.d Animatable<Float, androidx.compose.animation.core.l> animateTo) {
                        kotlin.jvm.internal.f0.p(animateTo, "$this$animateTo");
                        dVar.c(animateTo.u().floatValue() - floatRef.f124888b);
                        floatRef.f124888b = animateTo.u().floatValue();
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ kotlin.b2 invoke(Animatable<Float, androidx.compose.animation.core.l> animatable) {
                        a(animatable);
                        return kotlin.b2.f124493a;
                    }
                };
                this.f11082b = 1;
                if (Animatable.i(animatableB, fE, hVar, null, lVar, this, 4, null) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            ((SwipeableState) this.f11084d).animationTarget.setValue(null);
            this.f11084d.J(false);
            return kotlin.b2.f124493a;
        } catch (Throwable th2) {
            ((SwipeableState) this.f11084d).animationTarget.setValue(null);
            this.f11084d.J(false);
            throw th2;
        }
    }
}
