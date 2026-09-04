package b6;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import z5.e;
import z5.l;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f30399a = "CDT";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f30400b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f30401c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f30402d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f30403e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f30404f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static ConcurrentHashMap<Integer, Pair<Long, ?>> f30405g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static ExecutorService f30406h = Executors.newFixedThreadPool(16);

    /* JADX INFO: renamed from: b6.a$a, reason: collision with other inner class name */
    public interface InterfaceC0257a<T, R> {
        R a(T t10);
    }

    public static Context a(Context context) {
        if (context == null) {
            return null;
        }
        return context.getApplicationContext();
    }

    public static Pair<Boolean, ?> b(int i10, TimeUnit timeUnit, long j10) {
        Pair<Long, ?> pair;
        ConcurrentHashMap<Integer, Pair<Long, ?>> concurrentHashMap = f30405g;
        if (concurrentHashMap != null && (pair = concurrentHashMap.get(Integer.valueOf(i10))) != null) {
            Long l10 = (Long) pair.first;
            return (l10 == null || SystemClock.elapsedRealtime() - l10.longValue() > TimeUnit.MILLISECONDS.convert(j10, timeUnit)) ? new Pair<>(Boolean.FALSE, null) : new Pair<>(Boolean.TRUE, pair.second);
        }
        return new Pair<>(Boolean.FALSE, null);
    }

    public static <T> T c(int i10, long j10, TimeUnit timeUnit, InterfaceC0257a<Object, Boolean> interfaceC0257a, Callable<T> callable, boolean z10, long j11, TimeUnit timeUnit2, x5.a aVar, boolean z11) {
        T tCall;
        try {
            Pair<Boolean, ?> pairB = b(i10, timeUnit, j10);
            if (((Boolean) pairB.first).booleanValue() && interfaceC0257a.a(pairB.second).booleanValue()) {
                e.i("getC", i10 + " got " + pairB.second);
                return (T) pairB.second;
            }
            if (z11 && l.d0()) {
                h5.a.i(aVar, h5.b.f119113l, "ch_get_main", "" + i10);
                e.i("getC", i10 + " skip");
                tCall = null;
            } else {
                tCall = z10 ? f30406h.submit(callable).get(j11, timeUnit2) : callable.call();
                e(i10, tCall);
            }
            e.i("getC", i10 + " new " + tCall);
            return tCall;
        } catch (Throwable th2) {
            e.c(f30399a, "ch_get_e|" + i10, th2);
            h5.a.e(aVar, h5.b.f119113l, "ch_get_e|" + i10, th2);
            e.i("getC", i10 + " err");
            return null;
        }
    }

    public static synchronized void d() {
        f30405g = null;
    }

    public static synchronized void e(int i10, Object obj) {
        if (f30405g == null) {
            f30405g = new ConcurrentHashMap<>();
        }
        f30405g.put(Integer.valueOf(i10), new Pair<>(Long.valueOf(SystemClock.elapsedRealtime()), obj));
    }
}
