package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: TransformableState.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/r;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", i = {}, l = {182}, m = "invokeSuspend", n = {}, s = {})
public final class TransformableStateKt$animatePanBy$2 extends SuspendLambda implements yh.p<r, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Ref.LongRef f5746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ long f5747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.core.h<b1.f> f5748f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animatePanBy$2(Ref.LongRef longRef, long j10, androidx.compose.animation.core.h<b1.f> hVar, kotlin.coroutines.c<? super TransformableStateKt$animatePanBy$2> cVar) {
        super(2, cVar);
        this.f5746d = longRef;
        this.f5747e = j10;
        this.f5748f = hVar;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d r rVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((TransformableStateKt$animatePanBy$2) create(rVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.f5746d, this.f5747e, this.f5748f, cVar);
        transformableStateKt$animatePanBy$2.f5745c = obj;
        return transformableStateKt$animatePanBy$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5744b;
        if (i10 == 0) {
            t0.n(obj);
            final r rVar = (r) this.f5745c;
            AnimationState animationState = new AnimationState(VectorConvertersKt.b(b1.f.f30364b), b1.f.d(this.f5746d.f124890b), null, 0L, 0L, false, 60, null);
            b1.f fVarD = b1.f.d(this.f5747e);
            androidx.compose.animation.core.h<b1.f> hVar = this.f5748f;
            final Ref.LongRef longRef = this.f5746d;
            yh.l<androidx.compose.animation.core.g<b1.f, androidx.compose.animation.core.m>, b2> lVar = new yh.l<androidx.compose.animation.core.g<b1.f, androidx.compose.animation.core.m>, b2>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(@dl.d androidx.compose.animation.core.g<b1.f, androidx.compose.animation.core.m> animateTo) {
                    f0.p(animateTo, "$this$animateTo");
                    q.a(rVar, 0.0f, b1.f.u(animateTo.g().getF30368a(), longRef.f124890b), 0.0f, 5, null);
                    longRef.f124890b = animateTo.g().getF30368a();
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(androidx.compose.animation.core.g<b1.f, androidx.compose.animation.core.m> gVar) {
                    a(gVar);
                    return b2.f124493a;
                }
            };
            this.f5744b = 1;
            if (SuspendAnimationKt.m(animationState, fVarD, hVar, false, lVar, this, 4, null) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
