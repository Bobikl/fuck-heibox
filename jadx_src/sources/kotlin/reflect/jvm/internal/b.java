package kotlin.reflect.jvm.internal;

import kotlin.Result;
import kotlin.jvm.internal.f0;
import kotlin.t0;

/* JADX INFO: compiled from: CacheByClass.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final boolean f125272a;

    static {
        Object objB;
        try {
            Result.a aVar = Result.f124476c;
            objB = Result.b(Class.forName("java.lang.ClassValue"));
        } catch (Throwable th2) {
            Result.a aVar2 = Result.f124476c;
            objB = Result.b(t0.a(th2));
        }
        if (Result.j(objB)) {
            Result.a aVar3 = Result.f124476c;
            objB = Boolean.TRUE;
        }
        Object objB2 = Result.b(objB);
        Boolean bool = Boolean.FALSE;
        if (Result.i(objB2)) {
            objB2 = bool;
        }
        f125272a = ((Boolean) objB2).booleanValue();
    }

    @dl.d
    public static final <V> a<V> a(@dl.d yh.l<? super Class<?>, ? extends V> compute) {
        f0.p(compute, "compute");
        return f125272a ? new c(compute) : new d(compute);
    }
}
