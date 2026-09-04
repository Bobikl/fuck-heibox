package com.xiaomi.channel.commonutils.logger;

import android.content.Context;
import android.os.Process;
import android.util.Log;
import com.meituan.robust.Constants;
import com.xiaomi.push.j;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static int f106714a = 2;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Context f79a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static boolean f85a = false;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private static boolean f86b = false;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f82a = "XMPush-" + Process.myPid();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static LoggerInterface f80a = new a();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final HashMap<Integer, Long> f83a = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final HashMap<Integer, String> f106715b = new HashMap<>();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final Integer f81a = -1;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static AtomicInteger f84a = new AtomicInteger(1);

    public static class a implements LoggerInterface {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f106716a = b.f82a;

        a() {
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str) {
            Log.v(this.f106716a, str);
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void log(String str, Throwable th2) {
            Log.v(this.f106716a, str, th2);
        }

        @Override // com.xiaomi.channel.commonutils.logger.LoggerInterface
        public void setTag(String str) {
            this.f106716a = str;
        }
    }

    public static int a() {
        return f106714a;
    }

    public static Integer a(String str) {
        if (f106714a > 1) {
            return f81a;
        }
        Integer numValueOf = Integer.valueOf(f84a.incrementAndGet());
        f83a.put(numValueOf, Long.valueOf(System.currentTimeMillis()));
        f106715b.put(numValueOf, str);
        f80a.log(str + " starts");
        return numValueOf;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static String m61a(String str) {
        return b() + str;
    }

    public static String a(String str, String str2) {
        return Constants.ARRAY_TYPE + str + "] " + str2;
    }

    private static String a(String str, Object... objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[Tid:");
        sb2.append(Thread.currentThread().getId());
        sb2.append("] ");
        sb2.append(Constants.ARRAY_TYPE);
        sb2.append(str);
        sb2.append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                sb2.append(obj);
            }
        }
        return sb2.toString();
    }

    private static String a(Object... objArr) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[Tid:");
        sb2.append(Thread.currentThread().getId());
        sb2.append("] ");
        if (objArr != null && objArr.length > 0) {
            for (Object obj : objArr) {
                sb2.append(obj);
            }
        }
        return sb2.toString();
    }

    public static void a(int i10) {
        if (i10 < 0 || i10 > 5) {
            a(2, "set log level as " + i10);
        }
        f106714a = i10;
    }

    public static void a(int i10, String str) {
        if (i10 >= f106714a) {
            f80a.log(str);
            return;
        }
        if (m66a()) {
            Log.d("MyLog", "-->log(" + i10 + "): " + str);
        }
    }

    public static void a(int i10, String str, Throwable th2) {
        if (i10 >= f106714a) {
            f80a.log(str, th2);
            return;
        }
        if (m66a()) {
            Log.w("MyLog", "-->log(" + i10 + "): " + str, th2);
        }
    }

    public static void a(int i10, Throwable th2) {
        if (i10 >= f106714a) {
            f80a.log("", th2);
            return;
        }
        if (m66a()) {
            Log.w("MyLog", "-->log(" + i10 + "): ", th2);
        }
    }

    public static void a(Context context) {
        f79a = context;
        if (j.m521a(context)) {
            f85a = true;
        }
        if (j.m520a()) {
            f86b = true;
        }
    }

    public static void a(LoggerInterface loggerInterface) {
        f80a = loggerInterface;
    }

    public static void a(Integer num) {
        if (f106714a <= 1) {
            HashMap<Integer, Long> map = f83a;
            if (map.containsKey(num)) {
                long jLongValue = map.remove(num).longValue();
                String strRemove = f106715b.remove(num);
                long jCurrentTimeMillis = System.currentTimeMillis() - jLongValue;
                f80a.log(strRemove + " ends in " + jCurrentTimeMillis + " ms");
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m62a(String str) {
        if (m67a(2)) {
            a(2, m61a(str));
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m63a(String str, String str2) {
        if (m67a(2)) {
            a(2, b(str, str2));
        }
    }

    public static void a(String str, Throwable th2) {
        if (m67a(4)) {
            a(4, m61a(str), th2);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m64a(String str, Object... objArr) {
        if (m67a(2)) {
            a(2, a(str, objArr));
        }
    }

    public static void a(Throwable th2) {
        if (m67a(4)) {
            a(4, th2);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m65a(Object... objArr) {
        if (m67a(4)) {
            a(4, a(objArr));
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m66a() {
        return false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static boolean m67a(int i10) {
        return i10 >= f106714a || m66a();
    }

    private static String b() {
        return "[Tid:" + Thread.currentThread().getId() + "] ";
    }

    private static String b(String str, String str2) {
        return b() + a(str, str2);
    }

    public static void b(String str) {
        if (m67a(0)) {
            a(0, m61a(str));
        }
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static void m68b(String str, String str2) {
        if (m67a(1)) {
            a(1, b(str, str2));
        }
    }

    public static void b(String str, Object... objArr) {
        if (m67a(1)) {
            a(1, a(str, objArr));
        }
    }

    public static void c(String str) {
        if (m67a(0)) {
            a(1, m61a(str));
        }
    }

    public static void c(String str, String str2) {
        if (f85a) {
            m63a(str, str2);
            return;
        }
        Log.w(f82a, b(str, str2));
        if (f86b) {
            return;
        }
        m63a(str, str2);
    }

    public static void d(String str) {
        if (m67a(4)) {
            a(4, m61a(str));
        }
    }

    public static void e(String str) {
        if (f85a) {
            m62a(str);
            return;
        }
        Log.w(f82a, m61a(str));
        if (f86b) {
            return;
        }
        m62a(str);
    }
}
