package kotlin.coroutines;

import kotlin.NotImplementedError;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlin.u0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: Continuation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: compiled from: Continuation.kt */
    public static final class a<T> implements c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ CoroutineContext f124700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Result<? extends T>, b2> f124701c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(CoroutineContext coroutineContext, l<? super Result<? extends T>, b2> lVar) {
            this.f124700b = coroutineContext;
            this.f124701c = lVar;
        }

        @Override // kotlin.coroutines.c
        @dl.d
        public CoroutineContext getContext() {
            return this.f124700b;
        }

        @Override // kotlin.coroutines.c
        public void resumeWith(@dl.d Object obj) {
            this.f124701c.invoke(Result.a(obj));
        }
    }

    @u0(version = "1.3")
    @sh.f
    private static final <T> c<T> a(CoroutineContext context, l<? super Result<? extends T>, b2> resumeWith) {
        f0.p(context, "context");
        f0.p(resumeWith, "resumeWith");
        return new a(context, resumeWith);
    }

    @u0(version = "1.3")
    @dl.d
    public static final <T> c<b2> b(@dl.d l<? super c<? super T>, ? extends Object> lVar, @dl.d c<? super T> completion) {
        f0.p(lVar, "<this>");
        f0.p(completion, "completion");
        return new h(IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.b(lVar, completion)), kotlin.coroutines.intrinsics.b.h());
    }

    @u0(version = "1.3")
    @dl.d
    public static final <R, T> c<b2> c(@dl.d p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, @dl.d c<? super T> completion) {
        f0.p(pVar, "<this>");
        f0.p(completion, "completion");
        return new h(IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.c(pVar, r10, completion)), kotlin.coroutines.intrinsics.b.h());
    }

    private static final CoroutineContext d() {
        throw new NotImplementedError("Implemented as intrinsic");
    }

    @u0(version = "1.3")
    @sh.f
    public static /* synthetic */ void e() {
    }

    @u0(version = "1.3")
    @sh.f
    private static final <T> void f(c<? super T> cVar, T t10) {
        f0.p(cVar, "<this>");
        Result.a aVar = Result.f124476c;
        cVar.resumeWith(Result.b(t10));
    }

    @u0(version = "1.3")
    @sh.f
    private static final <T> void g(c<? super T> cVar, Throwable exception) {
        f0.p(cVar, "<this>");
        f0.p(exception, "exception");
        Result.a aVar = Result.f124476c;
        cVar.resumeWith(Result.b(t0.a(exception)));
    }

    @u0(version = "1.3")
    public static final <T> void h(@dl.d l<? super c<? super T>, ? extends Object> lVar, @dl.d c<? super T> completion) {
        f0.p(lVar, "<this>");
        f0.p(completion, "completion");
        c cVarD = IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.b(lVar, completion));
        Result.a aVar = Result.f124476c;
        cVarD.resumeWith(Result.b(b2.f124493a));
    }

    @u0(version = "1.3")
    public static final <R, T> void i(@dl.d p<? super R, ? super c<? super T>, ? extends Object> pVar, R r10, @dl.d c<? super T> completion) {
        f0.p(pVar, "<this>");
        f0.p(completion, "completion");
        c cVarD = IntrinsicsKt__IntrinsicsJvmKt.d(IntrinsicsKt__IntrinsicsJvmKt.c(pVar, r10, completion));
        Result.a aVar = Result.f124476c;
        cVarD.resumeWith(Result.b(b2.f124493a));
    }

    @u0(version = "1.3")
    @sh.f
    private static final <T> Object j(l<? super c<? super T>, b2> lVar, c<? super T> cVar) throws Throwable {
        c0.e(0);
        h hVar = new h(IntrinsicsKt__IntrinsicsJvmKt.d(cVar));
        lVar.invoke(hVar);
        Object objA = hVar.a();
        if (objA == kotlin.coroutines.intrinsics.b.h()) {
            kotlin.coroutines.jvm.internal.f.c(cVar);
        }
        c0.e(1);
        return objA;
    }
}
