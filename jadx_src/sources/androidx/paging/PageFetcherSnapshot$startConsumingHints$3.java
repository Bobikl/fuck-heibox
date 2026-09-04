package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot$startConsumingHints$3", f = "PageFetcherSnapshot.kt", i = {0, 0}, l = {bb.c.b.f31036x8, bb.c.b.f30852p1}, m = "invokeSuspend", n = {"this_$iv", "$this$withLock$iv$iv"}, s = {"L$0", "L$1"})
public final class PageFetcherSnapshot$startConsumingHints$3 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f25897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f25898c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f25899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f25900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshot f25901f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$startConsumingHints$3(PageFetcherSnapshot pageFetcherSnapshot, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25901f = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new PageFetcherSnapshot$startConsumingHints$3(this.f25901f, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((PageFetcherSnapshot$startConsumingHints$3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PageFetcherSnapshot pageFetcherSnapshot;
        PageFetcherSnapshotState.Holder holder;
        kotlinx.coroutines.sync.c cVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25900e;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    pageFetcherSnapshot = (PageFetcherSnapshot) this.f25899d;
                    cVar = (kotlinx.coroutines.sync.c) this.f25898c;
                    holder = (PageFetcherSnapshotState.Holder) this.f25897b;
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
            pageFetcherSnapshot = this.f25901f;
            holder = pageFetcherSnapshot.stateHolder;
            kotlinx.coroutines.sync.c cVar2 = holder.lock;
            this.f25897b = holder;
            this.f25898c = cVar2;
            this.f25899d = pageFetcherSnapshot;
            this.f25900e = 1;
            if (cVar2.e(null, this) == objH) {
                return objH;
            }
            cVar = cVar2;
            kotlinx.coroutines.flow.e<Integer> eVarG = holder.state.g();
            cVar.f(null);
            LoadType loadType = LoadType.APPEND;
            this.f25897b = null;
            this.f25898c = null;
            this.f25899d = null;
            this.f25900e = 2;
            if (pageFetcherSnapshot.o(eVarG, loadType, this) == objH) {
                return objH;
            }
            return b2.f124493a;
        } catch (Throwable th2) {
            cVar.f(null);
            throw th2;
        }
    }
}
