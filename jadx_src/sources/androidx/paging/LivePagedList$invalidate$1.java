package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineDispatcher;

/* JADX INFO: compiled from: LivePagedList.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.LivePagedList$invalidate$1", f = "LivePagedList.kt", i = {0, 1, 1}, l = {78, 85}, m = "invokeSuspend", n = {"pagingSource", "pagingSource", "lastKey"}, s = {"L$0", "L$0", "L$1"})
public final class LivePagedList$invalidate$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f25640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f25641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f25642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ LivePagedList f25643e;

    /* JADX INFO: renamed from: androidx.paging.LivePagedList$invalidate$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: LivePagedList.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.LivePagedList$invalidate$1$1", f = "LivePagedList.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25644b;

        AnonymousClass1(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            return LivePagedList$invalidate$1.this.new AnonymousClass1(completion);
        }

        @Override // yh.p
        public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f25644b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            LivePagedList$invalidate$1.this.f25643e.currentData.d0(LoadType.REFRESH, v.Loading.f26654b);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LivePagedList$invalidate$1(LivePagedList livePagedList, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25643e = livePagedList;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new LivePagedList$invalidate$1(this.f25643e, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((LivePagedList$invalidate$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0096  */
    /* JADX WARN: Code duplicated, block: B:21:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:23:0x00b1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        q0 q0Var;
        Object obj2;
        q0.b bVar;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25642d;
        if (i10 != 0) {
            if (i10 == 1) {
                q0Var = (q0) this.f25640b;
                kotlin.t0.n(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Object obj3 = this.f25641c;
                q0Var = (q0) this.f25640b;
                kotlin.t0.n(obj);
                obj2 = obj3;
            }
            bVar = (q0.b) obj;
            if (bVar instanceof q0.b.Error) {
                this.f25643e.currentData.d0(LoadType.REFRESH, new v.Error(((q0.b.Error) bVar).d()));
            } else if (bVar instanceof q0.b.Page) {
                PagedList pagedListA = PagedList.INSTANCE.a(q0Var, (q0.b.Page) bVar, this.f25643e.coroutineScope, this.f25643e.notifyDispatcher, this.f25643e.fetchDispatcher, this.f25643e.boundaryCallback, this.f25643e.config, obj2);
                LivePagedList livePagedList = this.f25643e;
                livePagedList.F(livePagedList.currentData, pagedListA);
                this.f25643e.currentData = pagedListA;
                this.f25643e.o(pagedListA);
            }
            return b2.f124493a;
        }
        kotlin.t0.n(obj);
        this.f25643e.currentData.G().j(this.f25643e.f25630o);
        q0 q0Var2 = (q0) this.f25643e.f25635t.invoke();
        q0Var2.i(this.f25643e.f25630o);
        CoroutineDispatcher coroutineDispatcher = this.f25643e.notifyDispatcher;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
        this.f25640b = q0Var2;
        this.f25642d = 1;
        if (kotlinx.coroutines.i.h(coroutineDispatcher, anonymousClass1, this) == objH) {
            return objH;
        }
        q0Var = q0Var2;
        Object objB = this.f25643e.currentData.B();
        q0.a aVarA = s0.a(this.f25643e.config, objB);
        this.f25640b = q0Var;
        this.f25641c = objB;
        this.f25642d = 2;
        Object objH2 = q0Var.h(aVarA, this);
        if (objH2 == objH) {
            return objH;
        }
        obj2 = objB;
        obj = objH2;
        bVar = (q0.b) obj;
        if (bVar instanceof q0.b.Error) {
            this.f25643e.currentData.d0(LoadType.REFRESH, new v.Error(((q0.b.Error) bVar).d()));
        } else if (bVar instanceof q0.b.Page) {
            PagedList pagedListA2 = PagedList.INSTANCE.a(q0Var, (q0.b.Page) bVar, this.f25643e.coroutineScope, this.f25643e.notifyDispatcher, this.f25643e.fetchDispatcher, this.f25643e.boundaryCallback, this.f25643e.config, obj2);
            LivePagedList livePagedList2 = this.f25643e;
            livePagedList2.F(livePagedList2.currentData, pagedListA2);
            this.f25643e.currentData = pagedListA2;
            this.f25643e.o(pagedListA2);
        }
        return b2.f124493a;
    }
}
