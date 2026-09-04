package com.huawei.hms.stats;

import android.os.Handler;
import android.os.Looper;
import com.huawei.hms.support.hianalytics.HiAnalyticsUtils;
import com.huawei.hms.support.log.HMSLog;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: AnalyticsCacheManager.java */
/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final a f62634f = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f62635a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f62636b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<Runnable> f62637c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f62638d = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Runnable f62639e = new RunnableC0512a();

    /* JADX INFO: renamed from: com.huawei.hms.stats.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AnalyticsCacheManager.java */
    public class RunnableC0512a implements Runnable {
        RunnableC0512a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            HMSLog.i("AnalyticsCacheManager", "Timeout execCacheBi.");
            if (HiAnalyticsUtils.getInstance().getInitFlag()) {
                a.this.b();
            } else {
                a.this.a();
            }
        }
    }

    private a() {
    }

    public static a c() {
        return f62634f;
    }

    public void a() {
        synchronized (this.f62635a) {
            HMSLog.i("AnalyticsCacheManager", "clear AnalyticsCache.");
            this.f62637c.clear();
        }
    }

    public void a(Runnable runnable) {
        synchronized (this.f62635a) {
            try {
                if (runnable == null) {
                    return;
                }
                if (this.f62636b) {
                    return;
                }
                if (this.f62637c.size() >= 60) {
                    return;
                }
                this.f62637c.add(runnable);
                this.f62638d.removeCallbacks(this.f62639e);
                this.f62638d.postDelayed(this.f62639e, 10000L);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void b() {
        synchronized (this.f62635a) {
            HMSLog.i("AnalyticsCacheManager", "execCacheBi: cache size: " + this.f62637c.size());
            this.f62636b = true;
            try {
                Iterator<Runnable> it = this.f62637c.iterator();
                while (it.hasNext()) {
                    it.next().run();
                    it.remove();
                }
            } catch (Throwable th2) {
                HMSLog.e("AnalyticsCacheManager", "<execCacheBi> failed. " + th2.getMessage());
                a();
            }
            this.f62636b = false;
        }
    }
}
