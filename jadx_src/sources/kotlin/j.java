package kotlin;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;

/* JADX INFO: compiled from: DeepRecursive.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j<T, R> extends i<T, R> implements kotlin.coroutines.c<R> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private yh.q<? super i<?, ?>, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> f124859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private Object f124860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private kotlin.coroutines.c<Object> f124861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private Object f124862e;

    /* JADX INFO: compiled from: Continuation.kt */
    public static final class a implements kotlin.coroutines.c<Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f124863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ j f124864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ yh.q f124865d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ kotlin.coroutines.c f124866e;

        public a(CoroutineContext coroutineContext, j jVar, yh.q qVar, kotlin.coroutines.c cVar) {
            this.f124863b = coroutineContext;
            this.f124864c = jVar;
            this.f124865d = qVar;
            this.f124866e = cVar;
        }

        @Override // kotlin.coroutines.c
        @dl.d
        /* JADX INFO: renamed from: getContext */
        public CoroutineContext getCom.umeng.analytics.pro.d.R java.lang.String() {
            return this.f124863b;
        }

        @Override // kotlin.coroutines.c
        public void resumeWith(@dl.d Object obj) {
            this.f124864c.f124859b = this.f124865d;
            this.f124864c.f124861d = this.f124866e;
            this.f124864c.f124862e = obj;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j(@dl.d yh.q<? super i<T, R>, ? super T, ? super kotlin.coroutines.c<? super R>, ? extends Object> block, T t10) {
        super(null);
        kotlin.jvm.internal.f0.p(block, "block");
        this.f124859b = block;
        this.f124860c = t10;
        kotlin.jvm.internal.f0.n(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f124861d = this;
        this.f124862e = h.f124737a;
    }

    private final kotlin.coroutines.c<Object> h(yh.q<? super i<?, ?>, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar, kotlin.coroutines.c<Object> cVar) {
        return new a(EmptyCoroutineContext.f124694b, this, qVar, cVar);
    }

    @Override // kotlin.i
    @dl.e
    public Object a(T t10, @dl.d kotlin.coroutines.c<? super R> cVar) {
        kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        this.f124861d = cVar;
        this.f124860c = t10;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        if (objH == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objH;
    }

    @Override // kotlin.i
    @dl.e
    public <U, S> Object c(@dl.d g<U, S> gVar, U u10, @dl.d kotlin.coroutines.c<? super S> cVar) {
        yh.q<i<U, S>, U, kotlin.coroutines.c<? super S>, Object> qVarA = gVar.a();
        kotlin.jvm.internal.f0.n(qVarA, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<kotlin.DeepRecursiveScope<*, *>, kotlin.Any?, kotlin.Any?>{ kotlin.DeepRecursiveKt.DeepRecursiveFunctionBlock }");
        yh.q<? super i<?, ?>, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar = this.f124859b;
        if (qVarA != qVar) {
            this.f124859b = qVarA;
            kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f124861d = h(qVar, cVar);
        } else {
            kotlin.jvm.internal.f0.n(cVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
            this.f124861d = cVar;
        }
        this.f124860c = u10;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        if (objH == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        return objH;
    }

    @Override // kotlin.coroutines.c
    @dl.d
    /* JADX INFO: renamed from: getContext */
    public CoroutineContext getCom.umeng.analytics.pro.d.R java.lang.String() {
        return EmptyCoroutineContext.f124694b;
    }

    public final R i() throws Throwable {
        while (true) {
            R r10 = (R) this.f124862e;
            kotlin.coroutines.c<Object> cVar = this.f124861d;
            if (cVar == null) {
                t0.n(r10);
                return r10;
            }
            if (Result.d(h.f124737a, r10)) {
                try {
                    yh.q<? super i<?, ?>, Object, ? super kotlin.coroutines.c<Object>, ? extends Object> qVar = this.f124859b;
                    Object obj = this.f124860c;
                    kotlin.jvm.internal.f0.n(qVar, "null cannot be cast to non-null type kotlin.Function3<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, P of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.startCoroutineUninterceptedOrReturn>, kotlin.Any?>");
                    Object objInvoke = ((yh.q) kotlin.jvm.internal.w0.q(qVar, 3)).invoke(this, obj, cVar);
                    if (objInvoke != kotlin.coroutines.intrinsics.b.h()) {
                        Result.a aVar = Result.f124476c;
                        cVar.resumeWith(Result.b(objInvoke));
                    }
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.f124476c;
                    cVar.resumeWith(Result.b(t0.a(th2)));
                }
            } else {
                this.f124862e = h.f124737a;
                cVar.resumeWith(r10);
            }
        }
    }

    @Override // kotlin.coroutines.c
    public void resumeWith(@dl.d Object obj) {
        this.f124861d = null;
        this.f124862e = obj;
    }
}
