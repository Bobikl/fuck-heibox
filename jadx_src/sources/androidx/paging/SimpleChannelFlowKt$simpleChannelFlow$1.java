package androidx.paging;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: SimpleChannelFlow.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/flow/f;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
@kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1", f = "SimpleChannelFlow.kt", i = {}, l = {46}, m = "invokeSuspend", n = {}, s = {})
public final class SimpleChannelFlowKt$simpleChannelFlow$1<T> extends SuspendLambda implements yh.p<kotlinx.coroutines.flow.f<? super T>, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f26294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    int f26295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ yh.p f26296d;

    /* JADX INFO: renamed from: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1, reason: invalid class name */
    /* JADX INFO: compiled from: SimpleChannelFlow.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 4, 2})
    @kotlin.coroutines.jvm.internal.d(c = "androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1", f = "SimpleChannelFlow.kt", i = {0, 1}, l = {64, 65}, m = "invokeSuspend", n = {"producer", "producer"}, s = {"L$0", "L$0"})
    public static final class AnonymousClass1 extends SuspendLambda implements yh.p<kotlinx.coroutines.q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f26297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f26298c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f26299d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.f f26301f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(kotlinx.coroutines.flow.f fVar, kotlin.coroutines.c cVar) {
            super(2, cVar);
            this.f26301f = fVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
            kotlin.jvm.internal.f0.p(completion, "completion");
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.f26301f, completion);
            anonymousClass1.f26297b = obj;
            return anonymousClass1;
        }

        @Override // yh.p
        public final Object invoke(kotlinx.coroutines.q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        /* JADX WARN: Code duplicated, block: B:14:0x005e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:15:0x005f  */
        /* JADX WARN: Code duplicated, block: B:18:0x006c  */
        /* JADX WARN: Code duplicated, block: B:20:0x007e A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:21:0x007f  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x007f -> B:12:0x0052). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
                int r1 = r12.f26299d
                r2 = 2
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L32
                if (r1 == r3) goto L25
                if (r1 != r2) goto L1d
                java.lang.Object r1 = r12.f26298c
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r12.f26297b
                kotlinx.coroutines.d2 r5 = (kotlinx.coroutines.d2) r5
                kotlin.t0.n(r13)
                r13 = r1
                r1 = r5
                goto L51
            L1d:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L25:
                java.lang.Object r1 = r12.f26298c
                kotlinx.coroutines.channels.ChannelIterator r1 = (kotlinx.coroutines.channels.ChannelIterator) r1
                java.lang.Object r5 = r12.f26297b
                kotlinx.coroutines.d2 r5 = (kotlinx.coroutines.d2) r5
                kotlin.t0.n(r13)
                r6 = r12
                goto L64
            L32:
                kotlin.t0.n(r13)
                java.lang.Object r13 = r12.f26297b
                r5 = r13
                kotlinx.coroutines.q0 r5 = (kotlinx.coroutines.q0) r5
                r13 = 0
                r1 = 6
                kotlinx.coroutines.channels.k r13 = kotlinx.coroutines.channels.m.d(r13, r4, r4, r1, r4)
                r6 = 0
                r7 = 0
                androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1 r8 = new androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1$1$producer$1
                r8.<init>(r12, r13, r4)
                r9 = 3
                r10 = 0
                kotlinx.coroutines.d2 r1 = kotlinx.coroutines.i.e(r5, r6, r7, r8, r9, r10)
                kotlinx.coroutines.channels.ChannelIterator r13 = r13.iterator()
            L51:
                r5 = r12
            L52:
                r5.f26297b = r1
                r5.f26298c = r13
                r5.f26299d = r3
                java.lang.Object r6 = r13.b(r5)
                if (r6 != r0) goto L5f
                return r0
            L5f:
                r11 = r1
                r1 = r13
                r13 = r6
                r6 = r5
                r5 = r11
            L64:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L83
                java.lang.Object r13 = r1.next()
                kotlinx.coroutines.flow.f r7 = r6.f26301f
                r6.f26297b = r5
                r6.f26298c = r1
                r6.f26299d = r2
                java.lang.Object r13 = r7.emit(r13, r6)
                if (r13 != r0) goto L7f
                return r0
            L7f:
                r13 = r1
                r1 = r5
                r5 = r6
                goto L52
            L83:
                kotlinx.coroutines.d2.a.b(r5, r4, r3, r4)
                kotlin.b2 r13 = kotlin.b2.f124493a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.paging.SimpleChannelFlowKt$simpleChannelFlow$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleChannelFlowKt$simpleChannelFlow$1(yh.p pVar, kotlin.coroutines.c cVar) {
        super(2, cVar);
        this.f26296d = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> completion) {
        kotlin.jvm.internal.f0.p(completion, "completion");
        SimpleChannelFlowKt$simpleChannelFlow$1 simpleChannelFlowKt$simpleChannelFlow$1 = new SimpleChannelFlowKt$simpleChannelFlow$1(this.f26296d, completion);
        simpleChannelFlowKt$simpleChannelFlow$1.f26294b = obj;
        return simpleChannelFlowKt$simpleChannelFlow$1;
    }

    @Override // yh.p
    public final Object invoke(Object obj, kotlin.coroutines.c<? super b2> cVar) {
        return ((SimpleChannelFlowKt$simpleChannelFlow$1) create(obj, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f26295c;
        if (i10 == 0) {
            kotlin.t0.n(obj);
            AnonymousClass1 anonymousClass1 = new AnonymousClass1((kotlinx.coroutines.flow.f) this.f26294b, null);
            this.f26295c = 1;
            if (kotlinx.coroutines.r0.g(anonymousClass1, this) == objH) {
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
