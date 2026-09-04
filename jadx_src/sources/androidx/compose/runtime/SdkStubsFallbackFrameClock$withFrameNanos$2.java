package androidx.compose.runtime;

import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.DelayKt;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: compiled from: ActualAndroid.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, d2 = {"R", "Lkotlinx/coroutines/q0;", "<anonymous>"}, k = 3, mv = {1, 7, 1})
@kotlin.coroutines.jvm.internal.d(c = "androidx.compose.runtime.SdkStubsFallbackFrameClock$withFrameNanos$2", f = "ActualAndroid.android.kt", i = {}, l = {51}, m = "invokeSuspend", n = {}, s = {})
public final class SdkStubsFallbackFrameClock$withFrameNanos$2<R> extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super R>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f12543b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ yh.l<Long, R> f12544c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SdkStubsFallbackFrameClock$withFrameNanos$2(yh.l<? super Long, ? extends R> lVar, kotlin.coroutines.c<? super SdkStubsFallbackFrameClock$withFrameNanos$2> cVar) {
        super(2, cVar);
        this.f12544c = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<kotlin.b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        return new SdkStubsFallbackFrameClock$withFrameNanos$2(this.f12544c, cVar);
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d kotlinx.coroutines.q0 q0Var, @dl.e kotlin.coroutines.c<? super R> cVar) {
        return ((SdkStubsFallbackFrameClock$withFrameNanos$2) create(q0Var, cVar)).invokeSuspend(kotlin.b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f12543b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            this.f12543b = 1;
            if (DelayKt.b(16L, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return this.f12544c.invoke(kotlin.coroutines.jvm.internal.a.g(System.nanoTime()));
    }
}
