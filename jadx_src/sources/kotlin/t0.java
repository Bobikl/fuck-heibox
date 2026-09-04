package kotlin;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t0 {
    @u0(version = "1.3")
    @dl.d
    @r0
    public static final Object a(@dl.d Throwable exception) {
        kotlin.jvm.internal.f0.p(exception, "exception");
        return new Result.Failure(exception);
    }

    @u0(version = "1.3")
    @sh.f
    private static final <R, T> R b(Object obj, yh.l<? super T, ? extends R> onSuccess, yh.l<? super Throwable, ? extends R> onFailure) {
        kotlin.jvm.internal.f0.p(onSuccess, "onSuccess");
        kotlin.jvm.internal.f0.p(onFailure, "onFailure");
        Throwable thE = Result.e(obj);
        return thE == null ? onSuccess.invoke(obj) : onFailure.invoke(thE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @sh.f
    private static final <R, T extends R> R c(Object obj, R r10) {
        return Result.i(obj) ? r10 : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @sh.f
    private static final <R, T extends R> R d(Object obj, yh.l<? super Throwable, ? extends R> onFailure) {
        kotlin.jvm.internal.f0.p(onFailure, "onFailure");
        Throwable thE = Result.e(obj);
        return thE == null ? obj : onFailure.invoke(thE);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.3")
    @sh.f
    private static final <T> T e(Object obj) throws Throwable {
        n(obj);
        return obj;
    }

    @u0(version = "1.3")
    @sh.f
    private static final <R, T> Object f(Object obj, yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(transform, "transform");
        if (!Result.j(obj)) {
            return Result.b(obj);
        }
        Result.a aVar = Result.f124476c;
        return Result.b(transform.invoke(obj));
    }

    @u0(version = "1.3")
    @sh.f
    private static final <R, T> Object g(Object obj, yh.l<? super T, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(transform, "transform");
        if (!Result.j(obj)) {
            return Result.b(obj);
        }
        try {
            Result.a aVar = Result.f124476c;
            return Result.b(transform.invoke(obj));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            return Result.b(a(th2));
        }
    }

    @u0(version = "1.3")
    @sh.f
    private static final <T> Object h(Object obj, yh.l<? super Throwable, b2> action) {
        kotlin.jvm.internal.f0.p(action, "action");
        Throwable thE = Result.e(obj);
        if (thE != null) {
            action.invoke(thE);
        }
        return obj;
    }

    @u0(version = "1.3")
    @sh.f
    private static final <T> Object i(Object obj, yh.l<? super T, b2> action) {
        kotlin.jvm.internal.f0.p(action, "action");
        if (Result.j(obj)) {
            action.invoke(obj);
        }
        return obj;
    }

    @u0(version = "1.3")
    @sh.f
    private static final <R, T extends R> Object j(Object obj, yh.l<? super Throwable, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(transform, "transform");
        Throwable thE = Result.e(obj);
        if (thE == null) {
            return obj;
        }
        Result.a aVar = Result.f124476c;
        return Result.b(transform.invoke(thE));
    }

    @u0(version = "1.3")
    @sh.f
    private static final <R, T extends R> Object k(Object obj, yh.l<? super Throwable, ? extends R> transform) {
        kotlin.jvm.internal.f0.p(transform, "transform");
        Throwable thE = Result.e(obj);
        if (thE == null) {
            return obj;
        }
        try {
            Result.a aVar = Result.f124476c;
            return Result.b(transform.invoke(thE));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            return Result.b(a(th2));
        }
    }

    @u0(version = "1.3")
    @sh.f
    private static final <T, R> Object l(T t10, yh.l<? super T, ? extends R> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        try {
            Result.a aVar = Result.f124476c;
            return Result.b(block.invoke(t10));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            return Result.b(a(th2));
        }
    }

    @u0(version = "1.3")
    @sh.f
    private static final <R> Object m(yh.a<? extends R> block) {
        kotlin.jvm.internal.f0.p(block, "block");
        try {
            Result.a aVar = Result.f124476c;
            return Result.b(block.invoke());
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            return Result.b(a(th2));
        }
    }

    @u0(version = "1.3")
    @r0
    public static final void n(@dl.d Object obj) throws Throwable {
        if (obj instanceof Result.Failure) {
            throw ((Result.Failure) obj).f124478b;
        }
    }
}
