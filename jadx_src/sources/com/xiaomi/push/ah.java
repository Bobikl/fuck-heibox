package com.xiaomi.push;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class ah {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile ah f106811a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private SharedPreferences f166a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ScheduledThreadPoolExecutor f169a = new ScheduledThreadPoolExecutor(1);

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Map<String, ScheduledFuture> f168a = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Object f167a = new Object();

    public static abstract class a implements Runnable {
        /* JADX INFO: renamed from: a */
        public abstract String mo195a();
    }

    public static class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        a f106812a;

        public b(a aVar) {
            this.f106812a = aVar;
        }

        void a() {
        }

        void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a();
            this.f106812a.run();
            b();
        }
    }

    private ah(Context context) {
        this.f166a = context.getSharedPreferences("mipush_extra", 0);
    }

    public static ah a(Context context) {
        if (f106811a == null) {
            synchronized (ah.class) {
                if (f106811a == null) {
                    f106811a = new ah(context);
                }
            }
        }
        return f106811a;
    }

    private static String a(String str) {
        return "last_job_time" + str;
    }

    private ScheduledFuture a(a aVar) {
        ScheduledFuture scheduledFuture;
        synchronized (this.f167a) {
            scheduledFuture = this.f168a.get(aVar.mo195a());
        }
        return scheduledFuture;
    }

    public void a(Runnable runnable) {
        a(runnable, 0);
    }

    public void a(Runnable runnable, int i10) {
        this.f169a.schedule(runnable, i10, TimeUnit.SECONDS);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m144a(a aVar) {
        return b(aVar, 0);
    }

    public boolean a(a aVar, int i10) {
        return a(aVar, i10, 0);
    }

    public boolean a(a aVar, int i10, int i11) {
        return a(aVar, i10, i11, false);
    }

    public boolean a(a aVar, int i10, int i11, boolean z10) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        String strA = a(aVar.mo195a());
        ai aiVar = new ai(this, aVar, z10, strA);
        if (!z10) {
            long jAbs = Math.abs(System.currentTimeMillis() - this.f166a.getLong(strA, 0L)) / 1000;
            if (jAbs < i10 - i11) {
                i11 = (int) (((long) i10) - jAbs);
            }
        }
        try {
            ScheduledFuture<?> scheduledFutureScheduleAtFixedRate = this.f169a.scheduleAtFixedRate(aiVar, i11, i10, TimeUnit.SECONDS);
            synchronized (this.f167a) {
                try {
                    this.f168a.put(aVar.mo195a(), scheduledFutureScheduleAtFixedRate);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.a(e10);
            return true;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m145a(String str) {
        synchronized (this.f167a) {
            ScheduledFuture scheduledFuture = this.f168a.get(str);
            if (scheduledFuture == null) {
                return false;
            }
            this.f168a.remove(str);
            return scheduledFuture.cancel(false);
        }
    }

    public boolean b(a aVar, int i10) {
        if (aVar == null || a(aVar) != null) {
            return false;
        }
        ScheduledFuture<?> scheduledFutureSchedule = this.f169a.schedule(new aj(this, aVar), i10, TimeUnit.SECONDS);
        synchronized (this.f167a) {
            this.f168a.put(aVar.mo195a(), scheduledFutureSchedule);
        }
        return true;
    }
}
