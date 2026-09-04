package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.SuspendAnimationKt;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: ScrollExtensions.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@"}, d2 = {"Landroidx/compose/foundation/gestures/m;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2", f = "ScrollExtensions.kt", i = {}, l = {41}, m = "invokeSuspend", n = {}, s = {})
public final class ScrollExtensionsKt$animateScrollBy$2 extends SuspendLambda implements yh.p<m, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f5509b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f5510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f5511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.animation.core.h<Float> f5512e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ Ref.FloatRef f5513f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollExtensionsKt$animateScrollBy$2(float f10, androidx.compose.animation.core.h<Float> hVar, Ref.FloatRef floatRef, kotlin.coroutines.c<? super ScrollExtensionsKt$animateScrollBy$2> cVar) {
        super(2, cVar);
        this.f5511d = f10;
        this.f5512e = hVar;
        this.f5513f = floatRef;
    }

    @Override // yh.p
    @dl.e
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Object invoke(@dl.d m mVar, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ScrollExtensionsKt$animateScrollBy$2) create(mVar, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ScrollExtensionsKt$animateScrollBy$2 scrollExtensionsKt$animateScrollBy$2 = new ScrollExtensionsKt$animateScrollBy$2(this.f5511d, this.f5512e, this.f5513f, cVar);
        scrollExtensionsKt$animateScrollBy$2.f5510c = obj;
        return scrollExtensionsKt$animateScrollBy$2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f5509b;
        if (i10 == 0) {
            t0.n(obj);
            final m mVar = (m) this.f5510c;
            float f10 = this.f5511d;
            androidx.compose.animation.core.h<Float> hVar = this.f5512e;
            final Ref.FloatRef floatRef = this.f5513f;
            yh.p<Float, Float, b2> pVar = new yh.p<Float, Float, b2>() { // from class: androidx.compose.foundation.gestures.ScrollExtensionsKt$animateScrollBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                public final void a(float f11, float f12) {
                    Ref.FloatRef floatRef2 = floatRef;
                    float f13 = floatRef2.f124888b;
                    floatRef2.f124888b = f13 + mVar.a(f11 - f13);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ b2 invoke(Float f11, Float f12) {
                    a(f11.floatValue(), f12.floatValue());
                    return b2.f124493a;
                }
            };
            this.f5509b = 1;
            if (SuspendAnimationKt.f(0.0f, f10, 0.0f, hVar, pVar, this, 4, null) == objH) {
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
