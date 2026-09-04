package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: CachedPagingData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u0006\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u008a@¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "Landroidx/paging/PageEvent;", "", "it", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.MulticastedPagingData$accumulated$2", f = "CachedPagingData.kt", i = {}, l = {40}, m = "invokeSuspend", n = {}, s = {})
public final class MulticastedPagingData$accumulated$2<T> extends SuspendLambda implements yh.q<kotlinx.coroutines.flow.f<? super PageEvent<T>>, Throwable, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25652b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ MulticastedPagingData f25653c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MulticastedPagingData$accumulated$2(MulticastedPagingData multicastedPagingData, kotlin.coroutines.c cVar) {
        super(3, cVar);
        this.f25653c = multicastedPagingData;
    }

    @dl.d
    public final kotlin.coroutines.c<b2> a(@dl.d kotlinx.coroutines.flow.f<? super PageEvent<T>> create, @dl.e Throwable th2, @dl.d kotlin.coroutines.c<? super b2> continuation) {
        kotlin.jvm.internal.f0.p(create, "$this$create");
        kotlin.jvm.internal.f0.p(continuation, "continuation");
        return new MulticastedPagingData$accumulated$2(this.f25653c, continuation);
    }

    @Override // yh.q
    public final Object invoke(Object obj, Throwable th2, kotlin.coroutines.c<? super b2> cVar) {
        return ((MulticastedPagingData$accumulated$2) a((kotlinx.coroutines.flow.f) obj, th2, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25652b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            ActiveFlowTracker activeFlowTrackerE = this.f25653c.getTracker();
            if (activeFlowTrackerE != null) {
                ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGE_EVENT_FLOW;
                this.f25652b = 1;
                if (activeFlowTrackerE.a(flowType, this) == objH) {
                    return objH;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
        }
        return b2.f124493a;
    }
}
