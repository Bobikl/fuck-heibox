package androidx.tracing;

import android.annotation.SuppressLint;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.n0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: Trace.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final String f27609a = "Trace";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f27610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f27611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f27612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f27613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f27614f;

    private b() {
    }

    @SuppressLint({"NewApi"})
    public static void a(@n0 String str, int i10) {
        try {
            if (f27612d == null) {
                d.a(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        b(str, i10);
    }

    private static void b(@n0 String str, int i10) {
        try {
            if (f27612d == null) {
                f27612d = Trace.class.getMethod("asyncTraceBegin", Long.TYPE, String.class, Integer.TYPE);
            }
            f27612d.invoke(null, Long.valueOf(f27610b), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceBegin", e10);
        }
    }

    public static void c(@n0 String str) {
        c.a(str);
    }

    @SuppressLint({"NewApi"})
    public static void d(@n0 String str, int i10) {
        try {
            if (f27613e == null) {
                d.b(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        e(str, i10);
    }

    private static void e(@n0 String str, int i10) {
        try {
            if (f27613e == null) {
                f27613e = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
            }
            f27613e.invoke(null, Long.valueOf(f27610b), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("asyncTraceEnd", e10);
        }
    }

    public static void f() {
        c.b();
    }

    private static void g(@n0 String str, @n0 Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (!(cause instanceof RuntimeException)) {
                throw new RuntimeException(cause);
            }
            throw ((RuntimeException) cause);
        }
        Log.v(f27609a, "Unable to call " + str + " via reflection", exc);
    }

    @SuppressLint({"NewApi"})
    public static boolean h() {
        try {
            if (f27611c == null) {
                return Trace.isEnabled();
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        return i();
    }

    private static boolean i() {
        try {
            if (f27611c == null) {
                f27610b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f27611c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f27611c.invoke(null, Long.valueOf(f27610b))).booleanValue();
        } catch (Exception e10) {
            g("isTagEnabled", e10);
            return false;
        }
    }

    @SuppressLint({"NewApi"})
    public static void j(@n0 String str, int i10) {
        try {
            if (f27614f == null) {
                d.c(str, i10);
                return;
            }
        } catch (NoClassDefFoundError | NoSuchMethodError unused) {
        }
        k(str, i10);
    }

    private static void k(@n0 String str, int i10) {
        try {
            if (f27614f == null) {
                f27614f = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f27614f.invoke(null, Long.valueOf(f27610b), str, Integer.valueOf(i10));
        } catch (Exception e10) {
            g("traceCounter", e10);
        }
    }
}
