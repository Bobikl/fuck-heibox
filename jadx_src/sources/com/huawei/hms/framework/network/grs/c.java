package com.huawei.hms.framework.network.grs;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.StringUtils;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.g.h;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f60754i = "c";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final ExecutorService f60755j = ExecutorsUtils.newSingleThreadExecutor("GRS_GrsClient-Init");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static long f60756k = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private GrsBaseInfo f60757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f60758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f60759c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f60760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f60761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.c f60762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.a f60763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private FutureTask<Boolean> f60764h;

    public class a implements Callable<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f60765a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ GrsBaseInfo f60766b;

        a(Context context, GrsBaseInfo grsBaseInfo) {
            this.f60765a = context;
            this.f60766b = grsBaseInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public Boolean call() {
            c.this.f60759c = new g();
            c.this.f60761e = new com.huawei.hms.framework.network.grs.e.c(this.f60765a, GrsApp.getInstance().getBrand(lg.a.f131412e) + "share_pre_grs_conf_");
            c.this.f60762f = new com.huawei.hms.framework.network.grs.e.c(this.f60765a, GrsApp.getInstance().getBrand(lg.a.f131412e) + "share_pre_grs_services_");
            c cVar = c.this;
            cVar.f60760d = new com.huawei.hms.framework.network.grs.e.a(cVar.f60761e, c.this.f60762f, c.this.f60759c);
            c cVar2 = c.this;
            cVar2.f60763g = new com.huawei.hms.framework.network.grs.a(cVar2.f60757a, c.this.f60760d, c.this.f60759c, c.this.f60762f);
            if (com.huawei.hms.framework.network.grs.f.b.a(this.f60765a.getPackageName()) == null) {
                new com.huawei.hms.framework.network.grs.f.b(this.f60765a, true);
            }
            String strC = new com.huawei.hms.framework.network.grs.g.j.c(this.f60766b, this.f60765a).c();
            Logger.v(c.f60754i, "scan serviceSet is: " + strC);
            String strA = c.this.f60762f.a("services", "");
            String strA2 = h.a(strA, strC);
            if (!TextUtils.isEmpty(strA2)) {
                c.this.f60762f.b("services", strA2);
                Logger.i(c.f60754i, "postList is:" + StringUtils.anonymizeMessage(strA2));
                Logger.d(c.f60754i, "currentServices:" + StringUtils.anonymizeMessage(strA));
                if (!strA2.equals(strA)) {
                    c.this.f60759c.a(c.this.f60757a.getGrsParasKey(true, true, this.f60765a));
                    c.this.f60759c.a(new com.huawei.hms.framework.network.grs.g.j.c(this.f60766b, this.f60765a), null, null, c.this.f60762f, c.this.f60757a.getQueryTimeout());
                }
            }
            long jElapsedRealtime = SystemClock.elapsedRealtime() - c.f60756k;
            if (c.f60756k == 0 || TimeUnit.MILLISECONDS.toHours(jElapsedRealtime) > 24) {
                Logger.i(c.f60754i, "Try to clear unUsed sp data.");
                long unused = c.f60756k = SystemClock.elapsedRealtime();
                c cVar3 = c.this;
                cVar3.a(cVar3.f60761e.a());
            }
            c.this.f60760d.b(this.f60766b, this.f60765a);
            return Boolean.TRUE;
        }
    }

    c(Context context, GrsBaseInfo grsBaseInfo) {
        this.f60764h = null;
        this.f60758b = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        a(grsBaseInfo);
        GrsBaseInfo grsBaseInfo2 = this.f60757a;
        FutureTask<Boolean> futureTask = new FutureTask<>(new a(this.f60758b, grsBaseInfo2));
        this.f60764h = futureTask;
        f60755j.execute(futureTask);
        Logger.i(f60754i, "GrsClient Instance is init, GRS SDK version: %s, GrsBaseInfoParam: app_name=%s, reg_country=%s, ser_country=%s, issue_country=%s ,queryTimeout=%d", com.huawei.hms.framework.network.grs.h.a.a(), grsBaseInfo2.getAppName(), grsBaseInfo.getRegCountry(), grsBaseInfo.getSerCountry(), grsBaseInfo.getIssueCountry(), Integer.valueOf(grsBaseInfo.getQueryTimeout()));
    }

    c(GrsBaseInfo grsBaseInfo) {
        this.f60764h = null;
        a(grsBaseInfo);
    }

    private void a(GrsBaseInfo grsBaseInfo) {
        try {
            this.f60757a = grsBaseInfo.m38clone();
        } catch (CloneNotSupportedException e10) {
            Logger.w(f60754i, "GrsClient catch CloneNotSupportedException", e10);
            this.f60757a = grsBaseInfo.copy();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(Map<String, ?> map) {
        if (map == null || map.isEmpty()) {
            Logger.v(f60754i, "sp's content is empty.");
            return;
        }
        Set<String> setKeySet = map.keySet();
        for (String str : setKeySet) {
            if (str.endsWith(this.f60758b.getPackageName() + "time")) {
                String strA = this.f60761e.a(str, "");
                long j10 = 0;
                if (!TextUtils.isEmpty(strA) && strA.matches("\\d+")) {
                    try {
                        j10 = Long.parseLong(strA);
                    } catch (NumberFormatException e10) {
                        Logger.w(f60754i, "convert expire time from String to Long catch NumberFormatException.", e10);
                    }
                }
                String strSubstring = str.substring(0, str.length() - 4);
                String str2 = strSubstring + "ETag";
                if (!b(j10) || !setKeySet.contains(strSubstring) || !setKeySet.contains(str2)) {
                    Logger.i(f60754i, "init interface auto clear some invalid sp's data: " + str);
                    this.f60761e.a(strSubstring);
                    this.f60761e.a(str);
                    this.f60761e.a(str2);
                }
            }
        }
    }

    private boolean b(long j10) {
        return System.currentTimeMillis() - j10 <= 604800000;
    }

    private boolean e() {
        String str;
        String str2;
        FutureTask<Boolean> futureTask = this.f60764h;
        if (futureTask == null) {
            return false;
        }
        try {
            return futureTask.get(8L, TimeUnit.SECONDS).booleanValue();
        } catch (InterruptedException e10) {
            e = e10;
            str = f60754i;
            str2 = "init compute task interrupted.";
            Logger.w(str, str2, e);
            return false;
        } catch (CancellationException unused) {
            Logger.i(f60754i, "init compute task canceled.");
            return false;
        } catch (ExecutionException e11) {
            e = e11;
            str = f60754i;
            str2 = "init compute task failed.";
            Logger.w(str, str2, e);
            return false;
        } catch (TimeoutException unused2) {
            Logger.w(f60754i, "init compute task timed out");
            return false;
        } catch (Exception e12) {
            e = e12;
            str = f60754i;
            str2 = "init compute task occur unknown Exception";
            Logger.w(str, str2, e);
            return false;
        }
    }

    String a(String str, String str2, int i10) {
        if (this.f60757a == null || str == null || str2 == null) {
            Logger.w(f60754i, "invalid para!");
            return null;
        }
        if (e()) {
            return this.f60763g.a(str, str2, this.f60758b, i10);
        }
        return null;
    }

    Map<String, String> a(String str, int i10) {
        if (this.f60757a != null && str != null) {
            return e() ? this.f60763g.a(str, this.f60758b, i10) : new HashMap();
        }
        Logger.w(f60754i, "invalid para!");
        return new HashMap();
    }

    void a() {
        if (e()) {
            String grsParasKey = this.f60757a.getGrsParasKey(true, true, this.f60758b);
            this.f60761e.a(grsParasKey);
            this.f60761e.a(grsParasKey + "time");
            this.f60761e.a(grsParasKey + "ETag");
            this.f60759c.a(grsParasKey);
        }
    }

    void a(String str, IQueryUrlsCallBack iQueryUrlsCallBack, int i10) {
        if (iQueryUrlsCallBack == null) {
            Logger.w(f60754i, "IQueryUrlsCallBack is must not null for process continue.");
            return;
        }
        if (this.f60757a == null || str == null) {
            iQueryUrlsCallBack.onCallBackFail(-6);
        } else if (e()) {
            this.f60763g.a(str, iQueryUrlsCallBack, this.f60758b, i10);
        } else {
            Logger.i(f60754i, "grs init task has not completed.");
            iQueryUrlsCallBack.onCallBackFail(-7);
        }
    }

    void a(String str, String str2, IQueryUrlCallBack iQueryUrlCallBack, int i10) {
        if (iQueryUrlCallBack == null) {
            Logger.w(f60754i, "IQueryUrlCallBack is must not null for process continue.");
            return;
        }
        if (this.f60757a == null || str == null || str2 == null) {
            iQueryUrlCallBack.onCallBackFail(-6);
        } else if (e()) {
            this.f60763g.a(str, str2, iQueryUrlCallBack, this.f60758b, i10);
        } else {
            Logger.i(f60754i, "grs init task has not completed.");
            iQueryUrlCallBack.onCallBackFail(-7);
        }
    }

    boolean a(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && c.class == obj.getClass() && (obj instanceof c)) {
            return this.f60757a.compare(((c) obj).f60757a);
        }
        return false;
    }

    boolean b() {
        GrsBaseInfo grsBaseInfo;
        Context context;
        if (!e() || (grsBaseInfo = this.f60757a) == null || (context = this.f60758b) == null) {
            return false;
        }
        this.f60760d.a(grsBaseInfo, context);
        return true;
    }
}
