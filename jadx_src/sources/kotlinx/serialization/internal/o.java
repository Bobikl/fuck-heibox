package kotlinx.serialization.internal;

import java.util.List;

/* JADX INFO: compiled from: Caching.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f130734a;

    static {
        boolean z10;
        try {
            Class.forName("java.lang.ClassValue");
            z10 = true;
        } catch (Throwable unused) {
            z10 = false;
        }
        f130734a = z10;
    }

    @dl.d
    public static final <T> d2<T> a(@dl.d yh.l<? super kotlin.reflect.d<?>, ? extends kotlinx.serialization.g<T>> factory) {
        kotlin.jvm.internal.f0.p(factory, "factory");
        return f130734a ? new ClassValueCache(factory) : new v(factory);
    }

    @dl.d
    public static final <T> o1<T> b(@dl.d yh.p<? super kotlin.reflect.d<Object>, ? super List<? extends kotlin.reflect.r>, ? extends kotlinx.serialization.g<T>> factory) {
        kotlin.jvm.internal.f0.p(factory, "factory");
        return f130734a ? new ClassValueParametrizedCache(factory) : new w(factory);
    }
}
