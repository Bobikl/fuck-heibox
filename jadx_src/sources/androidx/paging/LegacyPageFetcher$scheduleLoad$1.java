package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: LegacyPageFetcher.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", androidx.exifinterface.media.a.X4, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1", f = "LegacyPageFetcher.kt", i = {0}, l = {53}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class LegacyPageFetcher$scheduleLoad$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f25608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f25609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ LegacyPageFetcher f25610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ q0.a f25611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ LoadType f25612f;

    /* JADX INFO: renamed from: androidx.paging.LegacyPageFetcher$scheduleLoad$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: LegacyPageFetcher.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00020\u0000*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "K", androidx.exifinterface.media.a.X4, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.LegacyPageFetcher$scheduleLoad$1$1", f = "LegacyPageFetcher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f25613b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ q0.b f25615d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(q0.b bVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f25615d = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            return LegacyPageFetcher$scheduleLoad$1.this.new AnonymousClass1(this.f25615d, completion);
        }

        @Override // yh.p
        public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            kotlin.coroutines.intrinsics.b.h();
            if (this.f25613b != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.t0.n(obj);
            q0.b bVar = this.f25615d;
            if (bVar instanceof q0.b.Page) {
                LegacyPageFetcher$scheduleLoad$1 legacyPageFetcher$scheduleLoad$1 = LegacyPageFetcher$scheduleLoad$1.this;
                legacyPageFetcher$scheduleLoad$1.f25610d.l(legacyPageFetcher$scheduleLoad$1.f25612f, (q0.b.Page) bVar);
            } else if (bVar instanceof q0.b.Error) {
                LegacyPageFetcher$scheduleLoad$1 legacyPageFetcher$scheduleLoad$2 = LegacyPageFetcher$scheduleLoad$1.this;
                legacyPageFetcher$scheduleLoad$2.f25610d.k(legacyPageFetcher$scheduleLoad$2.f25612f, ((q0.b.Error) bVar).d());
            }
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegacyPageFetcher$scheduleLoad$1(LegacyPageFetcher legacyPageFetcher, q0.a aVar, LoadType loadType, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f25610d = legacyPageFetcher;
        this.f25611e = aVar;
        this.f25612f = loadType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        LegacyPageFetcher$scheduleLoad$1 legacyPageFetcher$scheduleLoad$1 = new LegacyPageFetcher$scheduleLoad$1(this.f25610d, this.f25611e, this.f25612f, completion);
        legacyPageFetcher$scheduleLoad$1.f25608b = obj;
        return legacyPageFetcher$scheduleLoad$1;
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((LegacyPageFetcher$scheduleLoad$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        kotlinx.coroutines.q0 q0Var;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f25609c;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            kotlinx.coroutines.q0 q0Var2 = (kotlinx.coroutines.q0) this.f25608b;
            q0 q0VarI = this.f25610d.i();
            q0.a aVar = this.f25611e;
            this.f25608b = q0Var2;
            this.f25609c = 1;
            Object objH2 = q0VarI.h(aVar, this);
            if (objH2 == objH) {
                return objH;
            }
            q0Var = q0Var2;
            obj = objH2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q0Var = (kotlinx.coroutines.q0) this.f25608b;
            kotlin.t0.n(obj);
        }
        q0.b bVar = (q0.b) obj;
        if (this.f25610d.i().a()) {
            this.f25610d.d();
            return b2.f124493a;
        }
        kotlinx.coroutines.k.f(q0Var, this.f25610d.notifyDispatcher, null, new AnonymousClass1(bVar, null), 2, null);
        return b2.f124493a;
    }
}
