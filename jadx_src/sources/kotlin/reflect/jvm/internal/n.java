package kotlin.reflect.jvm.internal;

import java.lang.ref.SoftReference;

/* JADX INFO: compiled from: ReflectProperties.java */
/* JADX INFO: loaded from: classes5.dex */
public class n {

    /* JADX INFO: compiled from: ReflectProperties.java */
    public static class a<T> extends c<T> implements yh.a<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final yh.a<T> f128314c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile SoftReference<Object> f128315d;

        public a(@dl.e T t10, @dl.d yh.a<T> aVar) {
            if (aVar == null) {
                d(0);
            }
            this.f128315d = null;
            this.f128314c = aVar;
            if (t10 != null) {
                this.f128315d = new SoftReference<>(a(t10));
            }
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazySoftVal", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.n.c, yh.a
        public T invoke() {
            Object obj;
            SoftReference<Object> softReference = this.f128315d;
            if (softReference != null && (obj = softReference.get()) != null) {
                return c(obj);
            }
            T tInvoke = this.f128314c.invoke();
            this.f128315d = new SoftReference<>(a(tInvoke));
            return tInvoke;
        }
    }

    /* JADX INFO: compiled from: ReflectProperties.java */
    public static class b<T> extends c<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final yh.a<T> f128316c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile Object f128317d;

        public b(@dl.d yh.a<T> aVar) {
            if (aVar == null) {
                d(0);
            }
            this.f128317d = null;
            this.f128316c = aVar;
        }

        private static /* synthetic */ void d(int i10) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "initializer", "kotlin/reflect/jvm/internal/ReflectProperties$LazyVal", "<init>"));
        }

        @Override // kotlin.reflect.jvm.internal.n.c, yh.a
        public T invoke() {
            Object obj = this.f128317d;
            if (obj != null) {
                return c(obj);
            }
            T tInvoke = this.f128316c.invoke();
            this.f128317d = a(tInvoke);
            return tInvoke;
        }
    }

    /* JADX INFO: compiled from: ReflectProperties.java */
    public static abstract class c<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final Object f128318b = new a();

        /* JADX INFO: compiled from: ReflectProperties.java */
        public static final class a {
            a() {
            }
        }

        protected Object a(T t10) {
            return t10 == null ? f128318b : t10;
        }

        public final T b(Object obj, Object obj2) {
            return invoke();
        }

        /* JADX WARN: Multi-variable type inference failed */
        protected T c(Object obj) {
            if (obj == f128318b) {
                return null;
            }
            return obj;
        }

        public abstract T invoke();
    }

    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        objArr[0] = "initializer";
        objArr[1] = "kotlin/reflect/jvm/internal/ReflectProperties";
        if (i10 == 1 || i10 == 2) {
            objArr[2] = "lazySoft";
        } else {
            objArr[2] = "lazy";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @dl.d
    public static <T> b<T> b(@dl.d yh.a<T> aVar) {
        if (aVar == null) {
            a(0);
        }
        return new b<>(aVar);
    }

    @dl.d
    public static <T> a<T> c(@dl.e T t10, @dl.d yh.a<T> aVar) {
        if (aVar == null) {
            a(1);
        }
        return new a<>(t10, aVar);
    }

    @dl.d
    public static <T> a<T> d(@dl.d yh.a<T> aVar) {
        if (aVar == null) {
            a(2);
        }
        return c(null, aVar);
    }
}
