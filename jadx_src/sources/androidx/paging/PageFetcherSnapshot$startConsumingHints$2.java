package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$2", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {bb.c.b.f31036x8, 218}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock$iv$iv"}, s = {"L$0", "L$1"})
public final class PageFetcherSnapshot$startConsumingHints$2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f25892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f25893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f25894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f25895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshot f25896f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$startConsumingHints$2(PageFetcherSnapshot pageFetcherSnapshot, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25896f = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new PageFetcherSnapshot$startConsumingHints$2(this.f25896f, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((PageFetcherSnapshot$startConsumingHints$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PageFetcherSnapshot pageFetcherSnapshot;
        PageFetcherSnapshotState.Holder holder;
        kotlinx.coroutines.sync.c cVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25895e;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    pageFetcherSnapshot = (PageFetcherSnapshot) this.f25894d;
                    cVar = (kotlinx.coroutines.sync.c) this.f25893c;
                    holder = (PageFetcherSnapshotState.Holder) this.f25892b;
                    kotlin.t0.n(obj);
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                }
                return b2.f124493a;
            }
            kotlin.t0.n(obj);
            pageFetcherSnapshot = this.f25896f;
            holder = pageFetcherSnapshot.stateHolder;
            kotlinx.coroutines.sync.c cVar2 = holder.lock;
            this.f25892b = holder;
            this.f25893c = cVar2;
            this.f25894d = pageFetcherSnapshot;
            this.f25895e = 1;
            if (cVar2.e(null, this) == objH) {
                return objH;
            }
            cVar = cVar2;
            kotlinx.coroutines.flow.e<Integer> eVarH = holder.state.h();
            cVar.f(null);
            LoadType loadType = LoadType.PREPEND;
            this.f25892b = null;
            this.f25893c = null;
            this.f25894d = null;
            this.f25895e = 2;
            if (pageFetcherSnapshot.o(eVarH, loadType, this) == objH) {
                return objH;
            }
            return b2.f124493a;
        } catch (Throwable th2) {
            cVar.f(null);
            throw th2;
        }
    }
}
