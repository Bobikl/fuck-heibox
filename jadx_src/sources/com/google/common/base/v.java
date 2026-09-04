package com.google.common.base;

import java.lang.ref.WeakReference;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Pattern;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: Platform.java */
/* JADX INFO: loaded from: classes7.dex */
@o9.b(emulated = true)
@g
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Logger f56759a = Logger.getLogger(v.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final u f56760b = f();

    /* JADX INFO: compiled from: Platform.java */
    public static final class b implements u {
        private b() {
        }

        @Override // com.google.common.base.u
        public boolean a() {
            return true;
        }

        @Override // com.google.common.base.u
        public e compile(String str) {
            return new JdkPattern(Pattern.compile(str));
        }
    }

    private v() {
    }

    static void a() {
    }

    static e b(String str) {
        w.E(str);
        return f56760b.compile(str);
    }

    @CheckForNull
    static String c(@CheckForNull String str) {
        if (k(str)) {
            return null;
        }
        return str;
    }

    static String d(double d10) {
        return String.format(Locale.ROOT, "%.4g", Double.valueOf(d10));
    }

    static <T extends Enum<T>> Optional<T> e(Class<T> cls, String str) {
        WeakReference<? extends Enum<?>> weakReference = Enums.a(cls).get(str);
        return weakReference == null ? Optional.a() : Optional.f(cls.cast(weakReference.get()));
    }

    private static u f() {
        return new b();
    }

    private static void g(ServiceConfigurationError serviceConfigurationError) {
        f56759a.log(Level.WARNING, "Error loading regex compiler, falling back to next option", (Throwable) serviceConfigurationError);
    }

    static String h(@CheckForNull String str) {
        return str == null ? "" : str;
    }

    static boolean i() {
        return f56760b.a();
    }

    static com.google.common.base.b j(com.google.common.base.b bVar) {
        return bVar.K();
    }

    static boolean k(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }

    static long l() {
        return System.nanoTime();
    }
}
