package kotlin.coroutines.intrinsics;

import dl.d;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.BaseContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.RestrictedContinuationImpl;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.w0;
import kotlin.t0;
import kotlin.u0;
import yh.l;
import yh.p;
import yh.q;

/* JADX INFO: compiled from: IntrinsicsJvm.kt */
/* JADX INFO: loaded from: classes5.dex */
public class IntrinsicsKt__IntrinsicsJvmKt {
    @u0(version = "1.3")
    private static final <T> c<b2> a(final c<? super T> cVar, final l<? super c<? super T>, ? extends Object> lVar) {
        final CoroutineContext context = cVar.getContext();
        return context == EmptyCoroutineContext.f124694b ? new RestrictedContinuationImpl(cVar, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f124705b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l<c<? super T>, Object> f124706c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(cVar);
                this.f124706c = lVar;
                f0.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1 for r2v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            protected java.lang.Object invokeSuspend(@dl.d java.lang.Object r3) {
                /*
                    r2 = this;
                    int r0 = r2.f124705b
                    r1 = 1
                    if (r0 == 0) goto L1a
                    if (r0 != r1) goto Le
                    r0 = 2
                    r2.f124705b = r0
                    kotlin.t0.n(r3)
                    goto L25
                Le:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.String r0 = "This coroutine had already completed"
                    java.lang.String r0 = r0.toString()
                    r3.<init>(r0)
                    throw r3
                L1a:
                    r2.f124705b = r1
                    kotlin.t0.n(r3)
                    yh.l<kotlin.coroutines.c<? super T>, java.lang.Object> r3 = r2.f124706c
                    java.lang.Object r3 = r3.invoke(r2)
                L25:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$1.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        } : new ContinuationImpl(cVar, context, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f124707b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l<c<? super T>, Object> f124708c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(cVar, context);
                this.f124708c = lVar;
                f0.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            /* JADX WARN: Type inference incomplete: some casts might be missing */
            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2 for r2v1 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @dl.e
            protected java.lang.Object invokeSuspend(@dl.d java.lang.Object r3) {
                /*
                    r2 = this;
                    int r0 = r2.f124707b
                    r1 = 1
                    if (r0 == 0) goto L1a
                    if (r0 != r1) goto Le
                    r0 = 2
                    r2.f124707b = r0
                    kotlin.t0.n(r3)
                    goto L25
                Le:
                    java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
                    java.lang.String r0 = "This coroutine had already completed"
                    java.lang.String r0 = r0.toString()
                    r3.<init>(r0)
                    throw r3
                L1a:
                    r2.f124707b = r1
                    kotlin.t0.n(r3)
                    yh.l<kotlin.coroutines.c<? super T>, java.lang.Object> r3 = r2.f124708c
                    java.lang.Object r3 = r3.invoke(r2)
                L25:
                    return r3
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineFromSuspendFunction$2.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @d
    public static final <T> c<b2> b(@d final l<? super c<? super T>, ? extends Object> lVar, @d c<? super T> completion) {
        f0.p(lVar, "<this>");
        f0.p(completion, "completion");
        final c<?> cVarA = f.a(completion);
        if (lVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) lVar).create(cVarA);
        }
        final CoroutineContext context = cVarA.getContext();
        return context == EmptyCoroutineContext.f124694b ? new RestrictedContinuationImpl(cVarA, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f124709b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l f124710c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVarA);
                this.f124710c = lVar;
                f0.n(cVarA, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            protected Object invokeSuspend(@d Object obj) throws Throwable {
                int i10 = this.f124709b;
                if (i10 == 0) {
                    this.f124709b = 1;
                    t0.n(obj);
                    f0.n(this.f124710c, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                    return ((l) w0.q(this.f124710c, 1)).invoke(this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f124709b = 2;
                t0.n(obj);
                return obj;
            }
        } : new ContinuationImpl(cVarA, context, lVar) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f124711b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ l f124712c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVarA, context);
                this.f124712c = lVar;
                f0.n(cVarA, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            protected Object invokeSuspend(@d Object obj) throws Throwable {
                int i10 = this.f124711b;
                if (i10 == 0) {
                    this.f124711b = 1;
                    t0.n(obj);
                    f0.n(this.f124712c, "null cannot be cast to non-null type kotlin.Function1<kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$0>, kotlin.Any?>");
                    return ((l) w0.q(this.f124712c, 1)).invoke(this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f124711b = 2;
                t0.n(obj);
                return obj;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @d
    public static final <R, T> c<b2> c(@d final p<? super R, ? super c<? super T>, ? extends Object> pVar, final R r10, @d c<? super T> completion) {
        f0.p(pVar, "<this>");
        f0.p(completion, "completion");
        final c<?> cVarA = f.a(completion);
        if (pVar instanceof BaseContinuationImpl) {
            return ((BaseContinuationImpl) pVar).create(r10, cVarA);
        }
        final CoroutineContext context = cVarA.getContext();
        return context == EmptyCoroutineContext.f124694b ? new RestrictedContinuationImpl(cVarA, pVar, r10) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f124713b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p f124714c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f124715d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVarA);
                this.f124714c = pVar;
                this.f124715d = r10;
                f0.n(cVarA, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            protected Object invokeSuspend(@d Object obj) throws Throwable {
                int i10 = this.f124713b;
                if (i10 == 0) {
                    this.f124713b = 1;
                    t0.n(obj);
                    f0.n(this.f124714c, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                    return ((p) w0.q(this.f124714c, 2)).invoke(this.f124715d, this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f124713b = 2;
                t0.n(obj);
                return obj;
            }
        } : new ContinuationImpl(cVarA, context, pVar, r10) { // from class: kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt$createCoroutineUnintercepted$$inlined$createCoroutineFromSuspendFunction$IntrinsicsKt__IntrinsicsJvmKt$4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f124716b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ p f124717c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f124718d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(cVarA, context);
                this.f124717c = pVar;
                this.f124718d = r10;
                f0.n(cVarA, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @e
            protected Object invokeSuspend(@d Object obj) throws Throwable {
                int i10 = this.f124716b;
                if (i10 == 0) {
                    this.f124716b = 1;
                    t0.n(obj);
                    f0.n(this.f124717c, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted$lambda$1>, kotlin.Any?>");
                    return ((p) w0.q(this.f124717c, 2)).invoke(this.f124718d, this);
                }
                if (i10 != 1) {
                    throw new IllegalStateException("This coroutine had already completed".toString());
                }
                this.f124716b = 2;
                t0.n(obj);
                return obj;
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @d
    public static final <T> c<T> d(@d c<? super T> cVar) {
        c<T> cVar2;
        f0.p(cVar, "<this>");
        ContinuationImpl continuationImpl = cVar instanceof ContinuationImpl ? (ContinuationImpl) cVar : null;
        return (continuationImpl == null || (cVar2 = (c<T>) continuationImpl.intercepted()) == null) ? cVar : cVar2;
    }

    @u0(version = "1.3")
    @sh.f
    private static final <T> Object e(l<? super c<? super T>, ? extends Object> lVar, c<? super T> completion) {
        f0.p(lVar, "<this>");
        f0.p(completion, "completion");
        return ((l) w0.q(lVar, 1)).invoke(completion);
    }

    @u0(version = "1.3")
    @sh.f
    private static final <R, T> Object f(p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, c<? super T> completion) {
        f0.p(pVar, "<this>");
        f0.p(completion, "completion");
        return ((p) w0.q(pVar, 2)).invoke(r10, completion);
    }

    @sh.f
    private static final <R, P, T> Object g(q<? super R, ? super P, ? super c<? super T>, ? extends Object> qVar, R r10, P p10, c<? super T> completion) {
        f0.p(qVar, "<this>");
        f0.p(completion, "completion");
        return ((q) w0.q(qVar, 3)).invoke(r10, p10, completion);
    }
}
