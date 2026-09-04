package androidx.core.os;

import android.os.Build;
import android.os.Trace;
import android.util.Log;
import androidx.annotation.w0;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: TraceCompat.java */
/* JADX INFO: loaded from: classes.dex */
@Deprecated
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f20964a = "TraceCompat";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f20965b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f20966c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f20967d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f20968e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f20969f;

    /* JADX INFO: compiled from: TraceCompat.java */
    @w0(18)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(String str) {
            Trace.beginSection(str);
        }

        @androidx.annotation.u
        static void b() {
            Trace.endSection();
        }
    }

    /* JADX INFO: compiled from: TraceCompat.java */
    @w0(29)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static void a(String str, int i10) {
            Trace.beginAsyncSection(str, i10);
        }

        @androidx.annotation.u
        static void b(String str, int i10) {
            Trace.endAsyncSection(str, i10);
        }

        @androidx.annotation.u
        static boolean c() {
            return Trace.isEnabled();
        }

        @androidx.annotation.u
        static void d(String str, long j10) {
            Trace.setCounter(str, j10);
        }
    }

    static {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                f20965b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                Class cls = Long.TYPE;
                f20966c = Trace.class.getMethod("isTagEnabled", cls);
                Class cls2 = Integer.TYPE;
                f20967d = Trace.class.getMethod("asyncTraceBegin", cls, String.class, cls2);
                f20968e = Trace.class.getMethod("asyncTraceEnd", cls, String.class, cls2);
                f20969f = Trace.class.getMethod("traceCounter", cls, String.class, cls2);
            } catch (Exception e10) {
                Log.i(f20964a, "Unable to initialize via reflection.", e10);
            }
        }
    }

    private e0() {
    }

    public static void a(@androidx.annotation.n0 String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(str, i10);
            return;
        }
        try {
            f20967d.invoke(null, Long.valueOf(f20965b), str, Integer.valueOf(i10));
        } catch (Exception unused) {
            Log.v(f20964a, "Unable to invoke asyncTraceBegin() via reflection.");
        }
    }

    public static void b(@androidx.annotation.n0 String str) {
        a.a(str);
    }

    public static void c(@androidx.annotation.n0 String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.b(str, i10);
            return;
        }
        try {
            f20968e.invoke(null, Long.valueOf(f20965b), str, Integer.valueOf(i10));
        } catch (Exception unused) {
            Log.v(f20964a, "Unable to invoke endAsyncSection() via reflection.");
        }
    }

    public static void d() {
        a.b();
    }

    public static boolean e() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b.c();
        }
        try {
            return ((Boolean) f20966c.invoke(null, Long.valueOf(f20965b))).booleanValue();
        } catch (Exception unused) {
            Log.v(f20964a, "Unable to invoke isTagEnabled() via reflection.");
            return false;
        }
    }

    public static void f(@androidx.annotation.n0 String str, int i10) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.d(str, i10);
            return;
        }
        try {
            f20969f.invoke(null, Long.valueOf(f20965b), str, Integer.valueOf(i10));
        } catch (Exception unused) {
            Log.v(f20964a, "Unable to invoke traceCounter() via reflection.");
        }
    }
}
