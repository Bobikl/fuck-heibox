package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.t0;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.q0;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
public final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f129967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f129968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ChannelFlowTransformLatest<T, R> f129969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.f<R> f129970e;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1, reason: invalid class name */
    /* JADX INFO: compiled from: Merge.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.f {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<d2> f129971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ q0 f129972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ChannelFlowTransformLatest<T, R> f129973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.f<R> f129974e;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2, reason: invalid class name */
        /* JADX INFO: compiled from: Merge.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u0002H\u008a@"}, d2 = {androidx.exifinterface.media.a.f23244d5, "R", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2", f = "Merge.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
        public static final class AnonymousClass2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f129975b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ChannelFlowTransformLatest<T, R> f129976c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.f<R> f129977d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ T f129978e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, kotlinx.coroutines.flow.f<? super R> fVar, T t10, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                super(2, cVar);
                this.f129976c = channelFlowTransformLatest;
                this.f129977d = fVar;
                this.f129978e = t10;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.d
            public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                return new AnonymousClass2(this.f129976c, this.f129977d, this.f129978e, cVar);
            }

            @Override // yh.p
            @dl.e
            public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i10 = this.f129975b;
                if (i10 == 0) {
                    t0.n(obj);
                    q qVar = ((ChannelFlowTransformLatest) this.f129976c).f129966f;
                    Object obj2 = this.f129977d;
                    T t10 = this.f129978e;
                    this.f129975b = 1;
                    if (qVar.invoke(obj2, t10, this) == objH) {
                        return objH;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                return b2.f124493a;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(Ref.ObjectRef<d2> objectRef, q0 q0Var, ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, kotlinx.coroutines.flow.f<? super R> fVar) {
            this.f129971b = objectRef;
            this.f129972c = q0Var;
            this.f129973d = channelFlowTransformLatest;
            this.f129974e = fVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.f
        @dl.e
        public final Object emit(T t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
            ChannelFlowTransformLatest$flowCollect$3$1$emit$1 channelFlowTransformLatest$flowCollect$3$1$emit$1;
            AnonymousClass1<T> anonymousClass1;
            if (cVar instanceof ChannelFlowTransformLatest$flowCollect$3$1$emit$1) {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = (ChannelFlowTransformLatest$flowCollect$3$1$emit$1) cVar;
                int i10 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f129984g;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.f129984g = i10 - Integer.MIN_VALUE;
                } else {
                    channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, cVar);
                }
            } else {
                channelFlowTransformLatest$flowCollect$3$1$emit$1 = new ChannelFlowTransformLatest$flowCollect$3$1$emit$1(this, cVar);
            }
            Object obj = channelFlowTransformLatest$flowCollect$3$1$emit$1.f129982e;
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i11 = channelFlowTransformLatest$flowCollect$3$1$emit$1.f129984g;
            if (i11 == 0) {
                t0.n(obj);
                d2 d2Var = this.f129971b.f124891b;
                if (d2Var != null) {
                    d2Var.e(new ChildCancelledException());
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.f129979b = this;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.f129980c = t10;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.f129981d = d2Var;
                    channelFlowTransformLatest$flowCollect$3$1$emit$1.f129984g = 1;
                    if (d2Var.g0(channelFlowTransformLatest$flowCollect$3$1$emit$1) == objH) {
                        return objH;
                    }
                }
                anonymousClass1 = this;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                t10 = (T) channelFlowTransformLatest$flowCollect$3$1$emit$1.f129980c;
                anonymousClass1 = (AnonymousClass1) channelFlowTransformLatest$flowCollect$3$1$emit$1.f129979b;
                t0.n(obj);
            }
            anonymousClass1.f129971b.f124891b = (T) kotlinx.coroutines.k.f(anonymousClass1.f129972c, null, CoroutineStart.UNDISPATCHED, new AnonymousClass2(anonymousClass1.f129973d, anonymousClass1.f129974e, t10, null), 1, null);
            return b2.f124493a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, kotlinx.coroutines.flow.f<? super R> fVar, kotlin.coroutines.c<? super ChannelFlowTransformLatest$flowCollect$3> cVar) {
        super(2, cVar);
        this.f129969d = channelFlowTransformLatest;
        this.f129970e = fVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.f129969d, this.f129970e, cVar);
        channelFlowTransformLatest$flowCollect$3.f129968c = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3 for r7v1 'this'  kotlin.coroutines.c
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
            int r1 = r7.f129967b
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.t0.n(r8)
            goto L37
        Lf:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L17:
            kotlin.t0.n(r8)
            java.lang.Object r8 = r7.f129968c
            kotlinx.coroutines.q0 r8 = (kotlinx.coroutines.q0) r8
            kotlin.jvm.internal.Ref$ObjectRef r1 = new kotlin.jvm.internal.Ref$ObjectRef
            r1.<init>()
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r3 = r7.f129969d
            kotlinx.coroutines.flow.e<S> r4 = r3.flow
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r5 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1
            kotlinx.coroutines.flow.f<R> r6 = r7.f129970e
            r5.<init>(r1, r8, r3, r6)
            r7.f129967b = r2
            java.lang.Object r8 = r4.a(r5, r7)
            if (r8 != r0) goto L37
            return r0
        L37:
            kotlin.b2 r8 = kotlin.b2.f124493a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
