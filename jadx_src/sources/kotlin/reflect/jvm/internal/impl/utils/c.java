package kotlin.reflect.jvm.internal.impl.utils;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: exceptionUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    public static final boolean a(@dl.d Throwable th2) {
        f0.p(th2, "<this>");
        Class<?> superclass = th2.getClass();
        while (!f0.g(superclass.getCanonicalName(), "com.intellij.openapi.progress.ProcessCanceledException")) {
            superclass = superclass.getSuperclass();
            if (superclass == null) {
                return false;
            }
        }
        return true;
    }

    @dl.d
    public static final RuntimeException b(@dl.d Throwable e10) throws Throwable {
        f0.p(e10, "e");
        throw e10;
    }
}
