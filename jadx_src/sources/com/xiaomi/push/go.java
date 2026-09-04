package com.xiaomi.push;

import android.os.SystemClock;
import com.xiaomi.push.service.XMPushService;
import java.util.Hashtable;

/* JADX INFO: loaded from: classes4.dex */
public class go {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f107224a = ge.PING_RTT.a();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static long f485a = 0;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static Hashtable<Integer, Long> f107225a = new Hashtable<>();
    }

    public static void a() {
        if (f485a == 0 || SystemClock.elapsedRealtime() - f485a > 7200000) {
            f485a = SystemClock.elapsedRealtime();
            a(0, f107224a);
        }
    }

    public static void a(int i10) {
        gf gfVarM409a = gm.m407a().m409a();
        gfVarM409a.a(ge.CHANNEL_STATS_COUNTER.a());
        gfVarM409a.c(i10);
        gm.m407a().a(gfVarM409a);
    }

    public static synchronized void a(int i10, int i11) {
        try {
            if (i11 < 16777215) {
                a.f107225a.put(Integer.valueOf((i10 << 24) | i11), Long.valueOf(System.currentTimeMillis()));
            } else {
                com.xiaomi.channel.commonutils.logger.b.d("stats key should less than 16777215");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static void a(int i10, int i11, int i12, String str, int i13) {
        gf gfVarM409a = gm.m407a().m409a();
        gfVarM409a.a((byte) i10);
        gfVarM409a.a(i11);
        gfVarM409a.b(i12);
        gfVarM409a.b(str);
        gfVarM409a.c(i13);
        gm.m407a().a(gfVarM409a);
    }

    public static synchronized void a(int i10, int i11, String str, int i12) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i13 = (i10 << 24) | i11;
        if (a.f107225a.containsKey(Integer.valueOf(i13))) {
            gf gfVarM409a = gm.m407a().m409a();
            gfVarM409a.a(i11);
            gfVarM409a.b((int) (jCurrentTimeMillis - a.f107225a.get(Integer.valueOf(i13)).longValue()));
            gfVarM409a.b(str);
            if (i12 > -1) {
                gfVarM409a.c(i12);
            }
            gm.m407a().a(gfVarM409a);
            a.f107225a.remove(Integer.valueOf(i11));
        } else {
            com.xiaomi.channel.commonutils.logger.b.d("stats key not found");
        }
    }

    public static void a(XMPushService xMPushService, com.xiaomi.push.service.bf.b bVar) {
        new gh(xMPushService, bVar).a();
    }

    public static void a(String str, int i10, Exception exc) {
        gf gfVarM409a = gm.m407a().m409a();
        if (gm.a() != null && gm.a().f477a != null) {
            gfVarM409a.c(bg.c(gm.a().f477a) ? 1 : 0);
        }
        if (i10 > 0) {
            gfVarM409a.a(ge.GSLB_REQUEST_SUCCESS.a());
            gfVarM409a.b(str);
            gfVarM409a.b(i10);
            gm.m407a().a(gfVarM409a);
            return;
        }
        try {
            gk.a aVarA = gk.a(exc);
            gfVarM409a.a(aVarA.f107214a.a());
            gfVarM409a.c(aVarA.f474a);
            gfVarM409a.b(str);
            gm.m407a().a(gfVarM409a);
        } catch (NullPointerException unused) {
        }
    }

    public static void a(String str, Exception exc) {
        try {
            gk.a aVarB = gk.b(exc);
            gf gfVarM409a = gm.m407a().m409a();
            gfVarM409a.a(aVarB.f107214a.a());
            gfVarM409a.c(aVarB.f474a);
            gfVarM409a.b(str);
            if (gm.a() != null && gm.a().f477a != null) {
                gfVarM409a.c(bg.c(gm.a().f477a) ? 1 : 0);
            }
            gm.m407a().a(gfVarM409a);
        } catch (NullPointerException unused) {
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static byte[] m413a() {
        gg ggVarM410a = gm.m407a().m410a();
        if (ggVarM410a != null) {
            return jx.a(ggVarM410a);
        }
        return null;
    }

    public static void b() {
        a(0, f107224a, null, -1);
    }

    public static void b(String str, Exception exc) {
        try {
            gk.a aVarD = gk.d(exc);
            gf gfVarM409a = gm.m407a().m409a();
            gfVarM409a.a(aVarD.f107214a.a());
            gfVarM409a.c(aVarD.f474a);
            gfVarM409a.b(str);
            if (gm.a() != null && gm.a().f477a != null) {
                gfVarM409a.c(bg.c(gm.a().f477a) ? 1 : 0);
            }
            gm.m407a().a(gfVarM409a);
        } catch (NullPointerException unused) {
        }
    }
}
