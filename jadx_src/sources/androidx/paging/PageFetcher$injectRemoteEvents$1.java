package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;

/* JADX INFO: Add missing generic type declarations: [Value] */
/* JADX INFO: compiled from: PageFetcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0003H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Key", "Value", "Landroidx/paging/b1;", "Landroidx/paging/PageEvent;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcher$injectRemoteEvents$1", f = "PageFetcher.kt", i = {}, l = {253}, m = "invokeSuspend", n = {}, s = {})
public final class PageFetcher$injectRemoteEvents$1<Value> extends SuspendLambda implements yh.p<b1<PageEvent<Value>>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25751b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25752c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PageFetcherSnapshot f25753d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ x0 f25754e;

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: PageFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u008a@¢\u0006\u0004\b\b\u0010\t"}, d2 = {"", "Key", "Value", "Landroidx/paging/LoadType;", "type", "Landroidx/paging/v;", "state", "Lkotlin/b2;", "f", "(Landroidx/paging/LoadType;Landroidx/paging/v;Lkotlin/coroutines/c;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$1", f = "PageFetcher.kt", i = {}, l = {140}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.q<LoadType, v, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f25755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f25756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f25757d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ b1 f25758e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(b1 b1Var, kotlin.coroutines.c cVar) {
            super(3, cVar);
            this.f25758e = b1Var;
        }

        @dl.d
        public final kotlin.coroutines.c<b2> a(@dl.d LoadType type, @dl.d v state, @dl.d kotlin.coroutines.c<? super b2> continuation) {
            kotlin.jvm.internal.f0.p(type, "type");
            kotlin.jvm.internal.f0.p(state, "state");
            kotlin.jvm.internal.f0.p(continuation, "continuation");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f25758e, continuation);
            anonymousClass1.f25755b = type;
            anonymousClass1.f25756c = state;
            return anonymousClass1;
        }

        @Override // yh.q
        @dl.e
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d LoadType loadType, @dl.d v vVar, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) a(loadType, vVar, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f25757d;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                LoadType loadType = (LoadType) this.f25755b;
                v vVar = (v) this.f25756c;
                if (PageEvent.LoadStateUpdate.INSTANCE.a(vVar, true)) {
                    b1 b1Var = this.f25758e;
                    PageEvent.LoadStateUpdate loadStateUpdate = new PageEvent.LoadStateUpdate(loadType, true, vVar);
                    this.f25755b = null;
                    this.f25757d = 1;
                    if (b1Var.X(loadStateUpdate, this) == objH) {
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

    /* JADX INFO: renamed from: androidx.paging.PageFetcher$injectRemoteEvents$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: PageFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Key", "Value", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.PageFetcher$injectRemoteEvents$1$2", f = "PageFetcher.kt", i = {}, l = {253}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25759b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ z f25761d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ AnonymousClass1 f25762e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(z zVar, AnonymousClass1 anonymousClass1, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f25761d = zVar;
            this.f25762e = anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            return new AnonymousClass2(this.f25761d, this.f25762e, completion);
        }

        @Override // yh.p
        public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Type inference failed for: r1v2, types: [T, androidx.paging.x] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f25759b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.f124891b = LoadStates.INSTANCE.a();
                kotlinx.coroutines.flow.u<LoadStates> state = PageFetcher$injectRemoteEvents$1.this.f25754e.getState();
                PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1 = new PageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1(this, objectRef);
                this.f25759b = 1;
                if (state.a(pageFetcher$injectRemoteEvents$1$2$invokeSuspend$$inlined$collect$1, this) == objH) {
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
    PageFetcher$injectRemoteEvents$1(PageFetcherSnapshot pageFetcherSnapshot, x0 x0Var, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25753d = pageFetcherSnapshot;
        this.f25754e = x0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        PageFetcher$injectRemoteEvents$1 pageFetcher$injectRemoteEvents$1 = new PageFetcher$injectRemoteEvents$1(this.f25753d, this.f25754e, completion);
        pageFetcher$injectRemoteEvents$1.f25751b = obj;
        return pageFetcher$injectRemoteEvents$1;
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((PageFetcher$injectRemoteEvents$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25752c;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            b1 b1Var = (b1) this.f25751b;
            z zVar = new z();
            kotlinx.coroutines.k.f(b1Var, null, null, new AnonymousClass2(zVar, new AnonymousClass1(b1Var, null), null), 3, null);
            kotlinx.coroutines.flow.e<PageEvent<Value>> eVarT = this.f25753d.t();
            PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1 pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1 = new PageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1(this, b1Var, zVar);
            this.f25752c = 1;
            if (eVarT.a(pageFetcher$injectRemoteEvents$1$invokeSuspend$$inlined$collect$1, this) == objH) {
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
