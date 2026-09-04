package androidx.paging;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1", f = "RemoteMediatorAccessor.kt", i = {0}, l = {bb.c.b.f30623f2}, m = "invokeSuspend", n = {"launchAppendPrepend"}, s = {"L$0"})
public final class RemoteMediatorAccessImpl$launchRefresh$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f26229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ RemoteMediatorAccessImpl f26231d;

    /* JADX INFO: renamed from: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: RemoteMediatorAccessor.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Key", "Value", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1", f = "RemoteMediatorAccessor.kt", i = {}, l = {270}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f26232b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Ref.BooleanRef f26234d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Ref.BooleanRef booleanRef, kotlin.coroutines.c cVar) {
            super(1, cVar);
            this.f26234d = booleanRef;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            return RemoteMediatorAccessImpl$launchRefresh$1.this.new AnonymousClass1(this.f26234d, completion);
        }

        @Override // yh.l
        public final Object invoke(kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            boolean zBooleanValue;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f26232b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                PagingState pagingState = (PagingState) RemoteMediatorAccessImpl$launchRefresh$1.this.f26231d.accessorState.b(new yh.l<AccessorState<Key, Value>, PagingState<Key, Value>>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$pendingPagingState$1
                    @Override // yh.l
                    @dl.e
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final PagingState<Key, Value> invoke(@dl.d AccessorState<Key, Value> it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        return it.h();
                    }
                });
                if (pagingState != null) {
                    RemoteMediator remoteMediator = RemoteMediatorAccessImpl$launchRefresh$1.this.f26231d.remoteMediator;
                    LoadType loadType = LoadType.REFRESH;
                    this.f26232b = 1;
                    obj = remoteMediator.c(loadType, pagingState, this);
                    if (obj == objH) {
                        return objH;
                    }
                }
                return b2.f124493a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            final RemoteMediator.a aVar = (RemoteMediator.a) obj;
            Ref.BooleanRef booleanRef = this.f26234d;
            if (aVar instanceof RemoteMediator.a.b) {
                zBooleanValue = ((Boolean) RemoteMediatorAccessImpl$launchRefresh$1.this.f26231d.accessorState.b(new yh.l<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$1$1
                    {
                        super(1);
                    }

                    public final boolean a(@dl.d AccessorState<Key, Value> it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        LoadType loadType2 = LoadType.REFRESH;
                        it.c(loadType2);
                        if (((RemoteMediator.a.b) aVar).getEndOfPaginationReached()) {
                            AccessorState.BlockState blockState = AccessorState.BlockState.COMPLETED;
                            it.i(loadType2, blockState);
                            it.i(LoadType.PREPEND, blockState);
                            it.i(LoadType.APPEND, blockState);
                            it.d();
                        } else {
                            LoadType loadType3 = LoadType.PREPEND;
                            AccessorState.BlockState blockState2 = AccessorState.BlockState.UNBLOCKED;
                            it.i(loadType3, blockState2);
                            it.i(LoadType.APPEND, blockState2);
                        }
                        it.j(LoadType.PREPEND, null);
                        it.j(LoadType.APPEND, null);
                        return it.g() != null;
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                        return Boolean.valueOf(a((AccessorState) obj2));
                    }
                })).booleanValue();
            } else {
                if (!(aVar instanceof RemoteMediator.a.C0197a)) {
                    throw new NoWhenBranchMatchedException();
                }
                zBooleanValue = ((Boolean) RemoteMediatorAccessImpl$launchRefresh$1.this.f26231d.accessorState.b(new yh.l<AccessorState<Key, Value>, Boolean>() { // from class: androidx.paging.RemoteMediatorAccessImpl$launchRefresh$1$1$1$2
                    {
                        super(1);
                    }

                    public final boolean a(@dl.d AccessorState<Key, Value> it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        LoadType loadType2 = LoadType.REFRESH;
                        it.c(loadType2);
                        it.j(loadType2, new v.Error(((RemoteMediator.a.C0197a) aVar).getThrowable()));
                        return it.g() != null;
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ Boolean invoke(Object obj2) {
                        return Boolean.valueOf(a((AccessorState) obj2));
                    }
                })).booleanValue();
            }
            booleanRef.f124884b = zBooleanValue;
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RemoteMediatorAccessImpl$launchRefresh$1(RemoteMediatorAccessImpl remoteMediatorAccessImpl, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f26231d = remoteMediatorAccessImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new RemoteMediatorAccessImpl$launchRefresh$1(this.f26231d, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((RemoteMediatorAccessImpl$launchRefresh$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Ref.BooleanRef booleanRef;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26230c;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            booleanRef2.f124884b = false;
            SingleRunner singleRunner = this.f26231d.isolationRunner;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(booleanRef2, null);
            this.f26229b = booleanRef2;
            this.f26230c = 1;
            if (singleRunner.b(2, anonymousClass1, this) == objH) {
                return objH;
            }
            booleanRef = booleanRef2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            booleanRef = (Ref.BooleanRef) this.f26229b;
            kotlin.t0.n(obj);
        }
        if (booleanRef.f124884b) {
            this.f26231d.h();
        }
        return b2.f124493a;
    }
}
