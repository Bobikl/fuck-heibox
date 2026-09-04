package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes6.dex */
public final class l implements ab {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static l f38109b;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final ThreadFactory f38110i = new n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f38111a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ThreadPoolExecutor f38112c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public b f38113d = b.a("android");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f38114e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f38115f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f38116g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f38117h;

    public l(Context context) {
        this.f38111a = context;
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(10, 11, 3L, TimeUnit.SECONDS, new ArrayBlockingQueue(20), f38110i, new ThreadPoolExecutor.CallerRunsPolicy());
        this.f38112c = threadPoolExecutor;
        try {
            threadPoolExecutor.allowCoreThreadTimeOut(true);
        } catch (Exception unused) {
        }
        CookieSyncManager.createInstance(this.f38111a);
        CookieManager.getInstance().setAcceptCookie(true);
    }

    public static final l a(Context context) {
        l lVar = f38109b;
        return lVar != null ? lVar : b(context);
    }

    public static final synchronized l b(Context context) {
        l lVar = f38109b;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(context);
        f38109b = lVar2;
        return lVar2;
    }

    public final b a() {
        return this.f38113d;
    }

    @Override // com.alipay.android.phone.mrpc.core.ab
    public final Future<u> a(t tVar) {
        if (s.a(this.f38111a)) {
            String str = com.alipay.zoloz.android.phone.mrpc.core.i.f39702h + hashCode() + ": Active Task = %d, Completed Task = %d, All Task = %d,Avarage Speed = %d KB/S, Connetct Time = %d ms, All data size = %d bytes, All enqueueConnect time = %d ms, All socket time = %d ms, All request times = %d times";
            Object[] objArr = new Object[9];
            objArr[0] = Integer.valueOf(this.f38112c.getActiveCount());
            objArr[1] = Long.valueOf(this.f38112c.getCompletedTaskCount());
            objArr[2] = Long.valueOf(this.f38112c.getTaskCount());
            long j10 = this.f38116g;
            objArr[3] = Long.valueOf(j10 == 0 ? 0L : ((this.f38114e * 1000) / j10) >> 10);
            int i10 = this.f38117h;
            objArr[4] = Long.valueOf(i10 != 0 ? this.f38115f / ((long) i10) : 0L);
            objArr[5] = Long.valueOf(this.f38114e);
            objArr[6] = Long.valueOf(this.f38115f);
            objArr[7] = Long.valueOf(this.f38116g);
            objArr[8] = Integer.valueOf(this.f38117h);
            String.format(str, objArr);
        }
        q qVar = new q(this, (o) tVar);
        m mVar = new m(this, qVar, qVar);
        this.f38112c.execute(mVar);
        return mVar;
    }

    public final void a(long j10) {
        this.f38114e += j10;
    }

    public final void b(long j10) {
        this.f38115f += j10;
        this.f38117h++;
    }

    public final void c(long j10) {
        this.f38116g += j10;
    }
}
