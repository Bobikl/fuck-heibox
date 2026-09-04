package androidx.compose.animation.core;

import androidx.compose.runtime.MonotonicFrameClockKt;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: InfiniteAnimationPolicy.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0004\n\u0002\b\u0002\u0010\u0001\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000H\u008a@"}, d2 = {"R", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.animation.core.InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2", f = "InfiniteAnimationPolicy.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
public final class InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2<R> extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super R>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f4157b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.l<Long, R> f4158c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(yh.l<? super Long, ? extends R> lVar, kotlin.coroutines.c<? super InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2> cVar) {
        super(1, cVar);
        this.f4158c = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
        return new InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2(this.f4158c, cVar);
    }

    @Override // yh.l
    @dl.e
    public final Object invoke(@dl.e kotlin.coroutines.c<? super R> cVar) {
        return ((InfiniteAnimationPolicyKt$withInfiniteAnimationFrameNanos$2) create(cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f4157b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            yh.l<Long, R> lVar = this.f4158c;
            this.f4157b = 1;
            obj = MonotonicFrameClockKt.f(lVar, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return obj;
    }
}
