package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: compiled from: SimpleChannelFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1", f = "SimpleChannelFlow.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
public final class SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f26302b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1 f26303c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.channels.k f26304d;

    /* JADX INFO: renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SimpleChannelFlow.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1$1", f = "SimpleChannelFlow.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f26305b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f26306c;

        AnonymousClass1(kotlin.coroutines.c cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            AnonymousClass1 anonymousClass1 = SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1.this.new AnonymousClass1(completion);
            anonymousClass1.f26305b = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f26306c;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                SimpleProducerScopeImpl simpleProducerScopeImpl = new SimpleProducerScopeImpl((kotlinx.coroutines.q0) this.f26305b, SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1.this.f26304d);
                yh.p pVar = SimpleChannelFlowKt$simpleChannelFlow$1.this.f26296d;
                this.f26306c = 1;
                if (pVar.invoke(simpleProducerScopeImpl, this) == objH) {
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
    SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1 anonymousClass1, kotlinx.coroutines.channels.k kVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f26303c = anonymousClass1;
        this.f26304d = kVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        return new SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1(this.f26303c, this.f26304d, completion);
    }

    @Override // yh.p
    public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        return ((SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26302b;
        try {
            if (i10 == 0) {
                kotlin.t0.n(obj);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.f26302b = 1;
                if (kotlinx.coroutines.r0.g(anonymousClass1, this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            kotlinx.coroutines.channels.b0.a.a(this.f26304d, null, 1, null);
        } catch (Throwable th2) {
            this.f26304d.b(th2);
        }
        return b2.f124493a;
    }
}
