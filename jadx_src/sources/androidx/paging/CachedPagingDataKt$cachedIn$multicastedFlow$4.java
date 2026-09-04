package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: CachedPagingData.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "Landroidx/paging/o0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.CachedPagingDataKt$cachedIn$multicastedFlow$4", f = "CachedPagingData.kt", i = {}, l = {98}, m = "invokeSuspend", n = {}, s = {})
public final class CachedPagingDataKt$cachedIn$multicastedFlow$4<T> extends SuspendLambda implements yh.p<kotlinx.coroutines.flow.f<? super o0<T>>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f25452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ ActiveFlowTracker f25453c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CachedPagingDataKt$cachedIn$multicastedFlow$4(ActiveFlowTracker activeFlowTracker, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25453c = activeFlowTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new CachedPagingDataKt$cachedIn$multicastedFlow$4(this.f25453c, completion);
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((CachedPagingDataKt$cachedIn$multicastedFlow$4) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25452b;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            ActiveFlowTracker activeFlowTracker = this.f25453c;
            if (activeFlowTracker != null) {
                ActiveFlowTracker.FlowType flowType = ActiveFlowTracker.FlowType.PAGED_DATA_FLOW;
                this.f25452b = 1;
                if (activeFlowTracker.b(flowType, this) == objH) {
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
