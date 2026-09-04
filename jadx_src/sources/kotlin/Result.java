package kotlin;

import java.io.Serializable;

/* JADX INFO: compiled from: Result.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@xh.f
public final class Result<T> implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final a f124476c = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final Object f124477b;

    /* JADX INFO: compiled from: Result.kt */
    public static final class Failure implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        @xh.e
        public final Throwable f124478b;

        public Failure(@dl.d Throwable exception) {
            kotlin.jvm.internal.f0.p(exception, "exception");
            this.f124478b = exception;
        }

        public boolean equals(@dl.e Object obj) {
            return (obj instanceof Failure) && kotlin.jvm.internal.f0.g(this.f124478b, ((Failure) obj).f124478b);
        }

        public int hashCode() {
            return this.f124478b.hashCode();
        }

        @dl.d
        public String toString() {
            return "Failure(" + this.f124478b + ')';
        }
    }

    /* JADX INFO: compiled from: Result.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.h(name = "failure")
        @sh.f
        private final <T> Object a(Throwable exception) {
            kotlin.jvm.internal.f0.p(exception, "exception");
            return Result.b(t0.a(exception));
        }

        @xh.h(name = "success")
        @sh.f
        private final <T> Object b(T t10) {
            return Result.b(t10);
        }
    }

    @r0
    private /* synthetic */ Result(Object obj) {
        this.f124477b = obj;
    }

    public static final /* synthetic */ Result a(Object obj) {
        return new Result(obj);
    }

    @dl.d
    @r0
    public static <T> Object b(@dl.e Object obj) {
        return obj;
    }

    public static boolean c(Object obj, Object obj2) {
        return (obj2 instanceof Result) && kotlin.jvm.internal.f0.g(obj, ((Result) obj2).l());
    }

    public static final boolean d(Object obj, Object obj2) {
        return kotlin.jvm.internal.f0.g(obj, obj2);
    }

    @dl.e
    public static final Throwable e(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).f124478b;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @sh.f
    private static final T f(Object obj) {
        if (i(obj)) {
            return null;
        }
        return obj;
    }

    @r0
    public static /* synthetic */ void g() {
    }

    public static int h(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public static final boolean i(Object obj) {
        return obj instanceof Failure;
    }

    public static final boolean j(Object obj) {
        return !(obj instanceof Failure);
    }

    @dl.d
    public static String k(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).toString();
        }
        return "Success(" + obj + ')';
    }

    public boolean equals(Object obj) {
        return c(this.f124477b, obj);
    }

    public int hashCode() {
        return h(this.f124477b);
    }

    public final /* synthetic */ Object l() {
        return this.f124477b;
    }

    @dl.d
    public String toString() {
        return k(this.f124477b);
    }
}
