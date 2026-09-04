package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* JADX INFO: compiled from: PageFetcherSnapshot.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/b1;", "Landroidx/paging/PageEvent;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1", f = "PageFetcherSnapshot.kt", i = {0, 0, 0, 0, 1, 2, 2, 2}, l = {bb.c.b.f31036x8, 160, 607}, m = "invokeSuspend", n = {"$this$cancelableChannelFlow", "it", "this_$iv", "$this$withLock$iv$iv", "$this$cancelableChannelFlow", "$this$cancelableChannelFlow", "this_$iv", "$this$withLock$iv$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$0", "L$1", "L$2"})
public final class PageFetcherSnapshot$pageEventFlow$1<Value> extends SuspendLambda implements yh.p<b1<PageEvent<Value>>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f25844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    Object f25845d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f25846e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f25847f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshot f25848g;

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: PageFetcherSnapshot.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$2", f = "PageFetcherSnapshot.kt", i = {}, l = {bb.c.b.f30904r8}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25849b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b1 f25851d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(b1 b1Var, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f25851d = b1Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            return new AnonymousClass2(this.f25851d, completion);
        }

        @Override // yh.p
        public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f25849b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                kotlinx.coroutines.flow.e eVarX = kotlinx.coroutines.flow.g.X(PageFetcherSnapshot$pageEventFlow$1.this.f25848g.pageEventCh);
                PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1 = new PageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1(this);
                this.f25849b = 1;
                if (eVarX.a(pageFetcherSnapshot$pageEventFlow$1$2$invokeSuspend$$inlined$collect$1, this) == objH) {
                    return objH;
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

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3, reason: invalid class name */
    /* JADX INFO: compiled from: PageFetcherSnapshot.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3", f = "PageFetcherSnapshot.kt", i = {}, l = {bb.c.b.f30904r8}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass3 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25856b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.k f25858d;

        /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$3$a */
        /* JADX INFO: compiled from: Collect.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006¸\u0006\u0000"}, d2 = {"kotlinx/coroutines/flow/FlowKt__CollectKt$collect$3", "Lkotlinx/coroutines/flow/f;", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 4, 2})
        public static final class a implements kotlinx.coroutines.flow.f<b2> {
            public a() {
            }

            @Override // kotlinx.coroutines.flow.f
            @dl.e
            public Object emit(b2 b2Var, @dl.d kotlin.coroutines.c cVar) {
                AnonymousClass3.this.f25858d.offer(b2Var);
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(kotlinx.coroutines.channels.k kVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f25858d = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            return new AnonymousClass3(this.f25858d, completion);
        }

        @Override // yh.p
        public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f25856b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                kotlinx.coroutines.flow.e eVar = PageFetcherSnapshot$pageEventFlow$1.this.f25848g.retryFlow;
                a aVar = new a();
                this.f25856b = 1;
                if (eVar.a(aVar, this) == objH) {
                    return objH;
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

    /* JADX INFO: renamed from: androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4, reason: invalid class name */
    /* JADX INFO: compiled from: PageFetcherSnapshot.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcherSnapshot$pageEventFlow$1$4", f = "PageFetcherSnapshot.kt", i = {}, l = {bb.c.b.f30904r8}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass4 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25860b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25861c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.k f25863e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(kotlinx.coroutines.channels.k kVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f25863e = kVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.f25863e, completion);
            anonymousClass4.f25860b = obj;
            return anonymousClass4;
        }

        @Override // yh.p
        public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass4) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f25861c;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                kotlinx.coroutines.q0 q0Var = (kotlinx.coroutines.q0) this.f25860b;
                kotlinx.coroutines.flow.e eVarX = kotlinx.coroutines.flow.g.X(this.f25863e);
                PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1 = new PageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1(this, q0Var);
                this.f25861c = 1;
                if (eVarX.a(pageFetcherSnapshot$pageEventFlow$1$4$invokeSuspend$$inlined$collect$1, this) == objH) {
                    return objH;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PageFetcherSnapshot$pageEventFlow$1(PageFetcherSnapshot pageFetcherSnapshot, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25848g = pageFetcherSnapshot;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        PageFetcherSnapshot$pageEventFlow$1 pageFetcherSnapshot$pageEventFlow$1 = new PageFetcherSnapshot$pageEventFlow$1(this.f25848g, completion);
        pageFetcherSnapshot$pageEventFlow$1.f25843b = obj;
        return pageFetcherSnapshot$pageEventFlow$1;
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((PageFetcherSnapshot$pageEventFlow$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x00e0 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00f9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:41:0x0111  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        b1 b1Var;
        z0 z0VarV;
        PagingState pagingState;
        PageFetcherSnapshotState.Holder holder;
        kotlinx.coroutines.sync.c cVar;
        b1 b1Var2;
        PageFetcherSnapshot pageFetcherSnapshot;
        PageFetcherSnapshotState.Holder holder2;
        kotlinx.coroutines.sync.c cVar2;
        b1 b1Var3;
        kotlinx.coroutines.sync.c cVar3;
        v vVarH;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25847f;
        try {
            if (i10 != 0) {
                if (i10 == 1) {
                    cVar = (kotlinx.coroutines.sync.c) this.f25846e;
                    holder = (PageFetcherSnapshotState.Holder) this.f25845d;
                    z0VarV = (z0) this.f25844c;
                    b1Var2 = (b1) this.f25843b;
                    kotlin.t0.n(obj);
                } else if (i10 == 2) {
                    b1 b1Var4 = (b1) this.f25843b;
                    kotlin.t0.n(obj);
                    b1Var = b1Var4;
                    holder2 = this.f25848g.stateHolder;
                    cVar2 = holder2.lock;
                    this.f25843b = b1Var;
                    this.f25844c = holder2;
                    this.f25845d = cVar2;
                    this.f25847f = 3;
                    if (cVar2.e(null, this) == objH) {
                        return objH;
                    }
                    b1Var3 = b1Var;
                    cVar3 = cVar2;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar3 = (kotlinx.coroutines.sync.c) this.f25845d;
                    holder2 = (PageFetcherSnapshotState.Holder) this.f25844c;
                    b1Var3 = (b1) this.f25843b;
                    kotlin.t0.n(obj);
                }
                try {
                    vVarH = holder2.state.getSourceLoadStates().h(LoadType.REFRESH);
                    cVar3.f(null);
                    if (!(vVarH instanceof v.Error)) {
                        this.f25848g.A(b1Var3);
                    }
                    return b2.f124493a;
                } catch (Throwable th2) {
                    cVar3.f(null);
                    throw th2;
                }
            }
            kotlin.t0.n(obj);
            b1Var = (b1) this.f25843b;
            if (!this.f25848g.pageEventChCollected.compareAndSet(false, true)) {
                throw new IllegalStateException("Attempt to collect twice from pageEventFlow, which is an illegal operation. Did you forget to call Flow<PagingData<*>>.cachedIn(coroutineScope)?".toString());
            }
            kotlinx.coroutines.k.f(b1Var, null, null, new AnonymousClass2(b1Var, null), 3, null);
            kotlinx.coroutines.channels.k kVarD = kotlinx.coroutines.channels.m.d(0, null, null, 6, null);
            kotlinx.coroutines.k.f(b1Var, null, null, new AnonymousClass3(kVarD, null), 3, null);
            kotlinx.coroutines.k.f(b1Var, null, null, new AnonymousClass4(kVarD, null), 3, null);
            if (this.f25848g.triggerRemoteRefresh && (z0VarV = this.f25848g.v()) != null) {
                pagingState = this.f25848g.previousPagingState;
                if (pagingState == null) {
                    PageFetcherSnapshotState.Holder holder3 = this.f25848g.stateHolder;
                    kotlinx.coroutines.sync.c cVar4 = holder3.lock;
                    this.f25843b = b1Var;
                    this.f25844c = z0VarV;
                    this.f25845d = holder3;
                    this.f25846e = cVar4;
                    this.f25847f = 1;
                    if (cVar4.e(null, this) == objH) {
                        return objH;
                    }
                    holder = holder3;
                    cVar = cVar4;
                    b1Var2 = b1Var;
                }
                z0VarV.c(LoadType.REFRESH, pagingState);
            }
            pageFetcherSnapshot = this.f25848g;
            this.f25843b = b1Var;
            this.f25844c = null;
            this.f25845d = null;
            this.f25846e = null;
            this.f25847f = 2;
            if (pageFetcherSnapshot.q(this) == objH) {
                return objH;
            }
            holder2 = this.f25848g.stateHolder;
            cVar2 = holder2.lock;
            this.f25843b = b1Var;
            this.f25844c = holder2;
            this.f25845d = cVar2;
            this.f25847f = 3;
            if (cVar2.e(null, this) == objH) {
                return objH;
            }
            b1Var3 = b1Var;
            cVar3 = cVar2;
            vVarH = holder2.state.getSourceLoadStates().h(LoadType.REFRESH);
            cVar3.f(null);
            if (!(vVarH instanceof v.Error)) {
                this.f25848g.A(b1Var3);
            }
            return b2.f124493a;
            PagingState pagingStateI = holder.state.i(null);
            cVar.f(null);
            pagingState = pagingStateI;
            b1Var = b1Var2;
            z0VarV.c(LoadType.REFRESH, pagingState);
            pageFetcherSnapshot = this.f25848g;
            this.f25843b = b1Var;
            this.f25844c = null;
            this.f25845d = null;
            this.f25846e = null;
            this.f25847f = 2;
            if (pageFetcherSnapshot.q(this) == objH) {
                return objH;
            }
            holder2 = this.f25848g.stateHolder;
            cVar2 = holder2.lock;
            this.f25843b = b1Var;
            this.f25844c = holder2;
            this.f25845d = cVar2;
            this.f25847f = 3;
            if (cVar2.e(null, this) == objH) {
                return objH;
            }
            b1Var3 = b1Var;
            cVar3 = cVar2;
            vVarH = holder2.state.getSourceLoadStates().h(LoadType.REFRESH);
            cVar3.f(null);
            if (!(vVarH instanceof v.Error)) {
                this.f25848g.A(b1Var3);
            }
            return b2.f124493a;
        } catch (Throwable th3) {
            cVar.f(null);
            throw th3;
        }
    }
}
