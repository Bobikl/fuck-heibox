package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.b0;
import kotlinx.coroutines.channels.ProduceKt;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.i2;
import kotlinx.coroutines.internal.ThreadContextKt;
import kotlinx.coroutines.q0;
import org.apache.tools.ant.taskdefs.p7;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: Combine.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlinx/coroutines/q0;", "Lkotlin/b2;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1", f = "Combine.kt", i = {0}, l = {129}, m = "invokeSuspend", n = {p7.a.f135567e}, s = {"L$0"})
public final class CombineKt$zipImpl$1$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f130012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f130013c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.f<R> f130014d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e<T2> f130015e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ kotlinx.coroutines.flow.e<T1> f130016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ q<T1, T2, kotlin.coroutines.c<? super R>, Object> f130017g;

    /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2, reason: invalid class name */
    /* JADX INFO: compiled from: Combine.kt */
    @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlin/b2;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
    @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2", f = "Combine.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements p<b2, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f130020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.e<T1> f130021c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f130022d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f130023e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ ReceiveChannel<Object> f130024f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.flow.f<R> f130025g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ q<T1, T2, kotlin.coroutines.c<? super R>, Object> f130026h;

        /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1, reason: invalid class name */
        /* JADX INFO: compiled from: Combine.kt */
        @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T1", "T2", "R", "value", "Lkotlin/b2;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/c;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 6, 0})
        public static final class AnonymousClass1<T> implements kotlinx.coroutines.flow.f {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ CoroutineContext f130027b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Object f130028c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ReceiveChannel<Object> f130029d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ kotlinx.coroutines.flow.f<R> f130030e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ q<T1, T2, kotlin.coroutines.c<? super R>, Object> f130031f;

            /* JADX INFO: renamed from: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1, reason: invalid class name and collision with other inner class name */
            /* JADX INFO: compiled from: Combine.kt */
            @Metadata(bv = {}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"T1", "T2", "R", "Lkotlin/b2;", "it", "<anonymous>"}, k = 3, mv = {1, 6, 0})
            @kotlin.coroutines.jvm.internal.d(c = "kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1$1", f = "Combine.kt", i = {}, l = {132, 135, 135}, m = "invokeSuspend", n = {}, s = {})
            public static final class C11911 extends SuspendLambda implements p<b2, kotlin.coroutines.c<? super b2>, Object> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Object f130032b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f130033c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ ReceiveChannel<Object> f130034d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ kotlinx.coroutines.flow.f<R> f130035e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ q<T1, T2, kotlin.coroutines.c<? super R>, Object> f130036f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ T1 f130037g;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C11911(ReceiveChannel<? extends Object> receiveChannel, kotlinx.coroutines.flow.f<? super R> fVar, q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, T1 t10, kotlin.coroutines.c<? super C11911> cVar) {
                    super(2, cVar);
                    this.f130034d = receiveChannel;
                    this.f130035e = fVar;
                    this.f130036f = qVar;
                    this.f130037g = t10;
                }

                @Override // yh.p
                @dl.e
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(@dl.d b2 b2Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    return ((C11911) create(b2Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    return new C11911(this.f130034d, this.f130035e, this.f130036f, this.f130037g, cVar);
                }

                /* JADX WARN: Code duplicated, block: B:29:0x006e A[RETURN] */
                /* JADX WARN: Type inference fix 'apply assigned field type' failed
                java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                 */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    Object objH;
                    kotlinx.coroutines.flow.f fVar;
                    Object objH2 = kotlin.coroutines.intrinsics.b.h();
                    int i10 = this.f130033c;
                    if (i10 != 0) {
                        if (i10 == 1) {
                            t0.n(obj);
                            objH = ((kotlinx.coroutines.channels.n) obj).getHolder();
                        } else if (i10 == 2) {
                            kotlinx.coroutines.flow.f fVar2 = (kotlinx.coroutines.flow.f) this.f130032b;
                            t0.n(obj);
                            fVar = fVar2;
                            this.f130032b = null;
                            this.f130033c = 3;
                            if (fVar.emit(obj, this) == objH2) {
                                return objH2;
                            }
                        } else {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            t0.n(obj);
                        }
                        return b2.f124493a;
                    }
                    t0.n(obj);
                    ReceiveChannel<Object> receiveChannel = this.f130034d;
                    this.f130033c = 1;
                    objH = receiveChannel.H(this);
                    if (objH == objH2) {
                        return objH2;
                    }
                    kotlinx.coroutines.flow.f fVar3 = this.f130035e;
                    if (objH instanceof kotlinx.coroutines.channels.n.c) {
                        Throwable thF = kotlinx.coroutines.channels.n.f(objH);
                        if (thF == null) {
                            throw new AbortFlowException(fVar3);
                        }
                        throw thF;
                    }
                    q<T1, T2, kotlin.coroutines.c<? super R>, Object> qVar = this.f130036f;
                    T1 t10 = this.f130037g;
                    if (objH == l.f130082a) {
                        objH = null;
                    }
                    this.f130032b = fVar3;
                    this.f130033c = 2;
                    obj = qVar.invoke(t10, objH, this);
                    fVar = fVar3;
                    if (obj == objH2) {
                        return objH2;
                    }
                    this.f130032b = null;
                    this.f130033c = 3;
                    if (fVar.emit(obj, this) == objH2) {
                        return objH2;
                    }
                    return b2.f124493a;
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(CoroutineContext coroutineContext, Object obj, ReceiveChannel<? extends Object> receiveChannel, kotlinx.coroutines.flow.f<? super R> fVar, q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar) {
                this.f130027b = coroutineContext;
                this.f130028c = obj;
                this.f130029d = receiveChannel;
                this.f130030e = fVar;
                this.f130031f = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.f
            @dl.e
            public final Object emit(T1 t10, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
                CombineKt$zipImpl$1$1$2$1$emit$1 combineKt$zipImpl$1$1$2$1$emit$1;
                if (cVar instanceof CombineKt$zipImpl$1$1$2$1$emit$1) {
                    combineKt$zipImpl$1$1$2$1$emit$1 = (CombineKt$zipImpl$1$1$2$1$emit$1) cVar;
                    int i10 = combineKt$zipImpl$1$1$2$1$emit$1.f130040d;
                    if ((i10 & Integer.MIN_VALUE) != 0) {
                        combineKt$zipImpl$1$1$2$1$emit$1.f130040d = i10 - Integer.MIN_VALUE;
                    } else {
                        combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, cVar);
                    }
                } else {
                    combineKt$zipImpl$1$1$2$1$emit$1 = new CombineKt$zipImpl$1$1$2$1$emit$1(this, cVar);
                }
                Object obj = combineKt$zipImpl$1$1$2$1$emit$1.f130038b;
                Object objH = kotlin.coroutines.intrinsics.b.h();
                int i11 = combineKt$zipImpl$1$1$2$1$emit$1.f130040d;
                if (i11 == 0) {
                    t0.n(obj);
                    CoroutineContext coroutineContext = this.f130027b;
                    b2 b2Var = b2.f124493a;
                    Object obj2 = this.f130028c;
                    C11911 c11911 = new C11911(this.f130029d, this.f130030e, this.f130031f, t10, null);
                    combineKt$zipImpl$1$1$2$1$emit$1.f130040d = 1;
                    if (d.c(coroutineContext, b2Var, obj2, c11911, combineKt$zipImpl$1$1$2$1$emit$1) == objH) {
                        return objH;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                }
                return b2.f124493a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(kotlinx.coroutines.flow.e<? extends T1> eVar, CoroutineContext coroutineContext, Object obj, ReceiveChannel<? extends Object> receiveChannel, kotlinx.coroutines.flow.f<? super R> fVar, q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f130021c = eVar;
            this.f130022d = coroutineContext;
            this.f130023e = obj;
            this.f130024f = receiveChannel;
            this.f130025g = fVar;
            this.f130026h = qVar;
        }

        @Override // yh.p
        @dl.e
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(@dl.d b2 b2Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass2) create(b2Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.d
        public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.f130021c, this.f130022d, this.f130023e, this.f130024f, this.f130025g, this.f130026h, cVar);
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.c to kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2 for r9v1 'this'  kotlin.coroutines.c
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @dl.e
        public final java.lang.Object invokeSuspend(@dl.d java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.h()
                int r1 = r9.f130020b
                r2 = 1
                if (r1 == 0) goto L17
                if (r1 != r2) goto Lf
                kotlin.t0.n(r10)
                goto L35
            Lf:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L17:
                kotlin.t0.n(r10)
                kotlinx.coroutines.flow.e<T1> r10 = r9.f130021c
                kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1 r1 = new kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1$2$1
                kotlin.coroutines.CoroutineContext r4 = r9.f130022d
                java.lang.Object r5 = r9.f130023e
                kotlinx.coroutines.channels.ReceiveChannel<java.lang.Object> r6 = r9.f130024f
                kotlinx.coroutines.flow.f<R> r7 = r9.f130025g
                yh.q<T1, T2, kotlin.coroutines.c<? super R>, java.lang.Object> r8 = r9.f130026h
                r3 = r1
                r3.<init>(r4, r5, r6, r7, r8)
                r9.f130020b = r2
                java.lang.Object r10 = r10.a(r1, r9)
                if (r10 != r0) goto L35
                return r0
            L35:
                kotlin.b2 r10 = kotlin.b2.f124493a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    CombineKt$zipImpl$1$1(kotlinx.coroutines.flow.f<? super R> fVar, kotlinx.coroutines.flow.e<? extends T2> eVar, kotlinx.coroutines.flow.e<? extends T1> eVar2, q<? super T1, ? super T2, ? super kotlin.coroutines.c<? super R>, ? extends Object> qVar, kotlin.coroutines.c<? super CombineKt$zipImpl$1$1> cVar) {
        super(2, cVar);
        this.f130014d = fVar;
        this.f130015e = eVar;
        this.f130016f = eVar2;
        this.f130017g = qVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        CombineKt$zipImpl$1$1 combineKt$zipImpl$1$1 = new CombineKt$zipImpl$1$1(this.f130014d, this.f130015e, this.f130016f, this.f130017g, cVar);
        combineKt$zipImpl$1$1.f130013c = obj;
        return combineKt$zipImpl$1$1;
    }

    @Override // yh.p
    @dl.e
    public final Object invoke(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        return ((CombineKt$zipImpl$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v12, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v2, types: [kotlinx.coroutines.channels.ReceiveChannel] */
    /* JADX WARN: Type inference failed for: r1v5 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        ReceiveChannel receiveChannel;
        ReceiveChannel receiveChannel2;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        ?? r10 = this.f130012b;
        try {
            if (r10 != 0) {
                if (r10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                receiveChannel2 = (ReceiveChannel) this.f130013c;
                try {
                    t0.n(obj);
                    r10 = receiveChannel2;
                } catch (AbortFlowException e10) {
                    e = e10;
                    h.b(e, this.f130014d);
                    r10 = receiveChannel2;
                }
                ReceiveChannel.DefaultImpls.b(r10, null, 1, null);
                return b2.f124493a;
            }
            t0.n(obj);
            q0 q0Var = (q0) this.f130013c;
            ReceiveChannel receiveChannelH = ProduceKt.h(q0Var, null, 0, new CombineKt$zipImpl$1$1$second$1(this.f130015e, null), 3, null);
            final b0 b0VarC = i2.c(null, 1, null);
            final kotlinx.coroutines.flow.f fVar = this.f130014d;
            ((kotlinx.coroutines.channels.b0) receiveChannelH).J(new yh.l<Throwable, b2>() { // from class: kotlinx.coroutines.flow.internal.CombineKt$zipImpl$1$1.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.e Throwable th2) {
                    if (b0VarC.isActive()) {
                        b0VarC.e(new AbortFlowException(fVar));
                    }
                }
            });
            try {
                CoroutineContext coroutineContext = q0Var.getCoroutineContext();
                Object objB = ThreadContextKt.b(coroutineContext);
                CoroutineContext coroutineContextI = q0Var.getCoroutineContext().I(b0VarC);
                b2 b2Var = b2.f124493a;
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.f130016f, coroutineContext, objB, receiveChannelH, this.f130014d, this.f130017g, null);
                this.f130013c = receiveChannelH;
                this.f130012b = 1;
                receiveChannel = receiveChannelH;
                try {
                    if (d.d(coroutineContextI, b2Var, null, anonymousClass2, this, 4, null) == objH) {
                        return objH;
                    }
                    r10 = receiveChannel;
                    ReceiveChannel.DefaultImpls.b(r10, null, 1, null);
                    return b2.f124493a;
                } catch (AbortFlowException e11) {
                    e = e11;
                    receiveChannel2 = receiveChannel;
                    h.b(e, this.f130014d);
                    r10 = receiveChannel2;
                } catch (Throwable th2) {
                    th = th2;
                    r10 = receiveChannel;
                    ReceiveChannel.DefaultImpls.b(r10, null, 1, null);
                    throw th;
                }
            } catch (AbortFlowException e12) {
                e = e12;
                receiveChannel = receiveChannelH;
            } catch (Throwable th3) {
                th = th3;
                receiveChannel = receiveChannelH;
            }
            h.b(e, this.f130014d);
            r10 = receiveChannel2;
            ReceiveChannel.DefaultImpls.b(r10, null, 1, null);
            return b2.f124493a;
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
