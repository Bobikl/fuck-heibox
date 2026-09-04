package com.huawei.hms.framework.network.grs.g;

import android.content.Context;
import android.os.SystemClock;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f60801l = "c";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GrsBaseInfo f60802a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f60803b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.e.a f60804c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f60805d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final com.huawei.hms.framework.network.grs.g.j.c f60810i;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, Future<d>> f60806e = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final List<d> f60807f = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final JSONArray f60808g = new JSONArray();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<String> f60809h = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f60811j = "";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f60812k = 1;

    public c(com.huawei.hms.framework.network.grs.g.j.c cVar, com.huawei.hms.framework.network.grs.e.a aVar) {
        this.f60810i = cVar;
        this.f60802a = cVar.b();
        this.f60803b = cVar.a();
        this.f60804c = aVar;
        b();
        c();
    }

    /* JADX WARN: Code duplicated, block: B:33:0x0099 A[LOOP:0: B:3:0x0006->B:33:0x0099, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0091 A[SYNTHETIC] */
    private d a(ExecutorService executorService, List<String> list, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        d dVar = null;
        for (int i10 = 0; i10 < list.size(); i10++) {
            String str2 = list.get(i10);
            boolean z10 = true;
            if (!TextUtils.isEmpty(str2)) {
                Future<d> futureSubmit = executorService.submit(new a(str2, i10, this, this.f60803b, str, this.f60802a, cVar).g());
                this.f60806e.put(str2, futureSubmit);
                try {
                    d dVar2 = futureSubmit.get(this.f60812k, TimeUnit.SECONDS);
                    if (dVar2 != null) {
                        try {
                            if (dVar2.o() || dVar2.m()) {
                                Logger.i(f60801l, "grs request return body is not null and is OK.");
                                dVar = dVar2;
                            }
                        } catch (InterruptedException e10) {
                            e = e10;
                            dVar = dVar2;
                            Logger.w(f60801l, "the current thread was interrupted while waiting", e);
                        } catch (CancellationException unused) {
                            dVar = dVar2;
                            Logger.i(f60801l, "{requestServer} the computation was cancelled");
                        } catch (ExecutionException e11) {
                            e = e11;
                            dVar = dVar2;
                            Logger.w(f60801l, "the computation threw an ExecutionException", e);
                        } catch (TimeoutException unused2) {
                            dVar = dVar2;
                            Logger.w(f60801l, "the wait timed out");
                        }
                        if (z10) {
                            Logger.v(f60801l, "needBreak is true so need break current circulation");
                            break;
                        }
                    }
                    dVar = dVar2;
                } catch (InterruptedException e12) {
                    e = e12;
                } catch (CancellationException unused3) {
                } catch (ExecutionException e13) {
                    e = e13;
                } catch (TimeoutException unused4) {
                }
            }
            z10 = false;
            if (z10) {
                Logger.v(f60801l, "needBreak is true so need break current circulation");
                break;
            }
        }
        return b(dVar);
    }

    private void a(String str, String str2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str2);
        sb2.append(str);
        String grsReqParamJoint = this.f60802a.getGrsReqParamJoint(false, false, d(), this.f60803b);
        if (!TextUtils.isEmpty(grsReqParamJoint)) {
            sb2.append("?");
            sb2.append(grsReqParamJoint);
        }
        this.f60809h.add(sb2.toString());
    }

    private d b(d dVar) throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        String str2;
        for (Map.Entry<String, Future<d>> entry : this.f60806e.entrySet()) {
            if (dVar != null && (dVar.o() || dVar.m())) {
                break;
            }
            try {
                dVar = entry.getValue().get(40000L, TimeUnit.MILLISECONDS);
            } catch (InterruptedException e10) {
                e = e10;
                str = f60801l;
                str2 = "{checkResponse} when check result, find InterruptedException, check others";
                Logger.w(str, str2, e);
            } catch (CancellationException unused) {
                Logger.i(f60801l, "{checkResponse} when check result, find CancellationException, check others");
            } catch (ExecutionException e11) {
                e = e11;
                str = f60801l;
                str2 = "{checkResponse} when check result, find ExecutionException, check others";
                Logger.w(str, str2, e);
            } catch (TimeoutException unused2) {
                Logger.w(f60801l, "{checkResponse} when check result, find TimeoutException, cancel current request task");
                if (!entry.getValue().isCancelled()) {
                    entry.getValue().cancel(true);
                }
            }
        }
        return dVar;
    }

    private void b() {
        com.huawei.hms.framework.network.grs.g.j.d dVarA = com.huawei.hms.framework.network.grs.g.i.a.a(this.f60803b);
        if (dVarA == null) {
            Logger.w(f60801l, "g*s***_se****er_conf*** maybe has a big error");
            return;
        }
        a(dVarA);
        List<String> listA = dVarA.a();
        if (listA == null || listA.size() <= 0) {
            Logger.v(f60801l, "maybe grs_base_url config with [],please check.");
            return;
        }
        if (listA.size() > 10) {
            throw new IllegalArgumentException("grs_base_url's count is larger than MAX value 10");
        }
        String strB = dVarA.b();
        if (listA.size() > 0) {
            for (String str : listA) {
                if (str.startsWith("https://")) {
                    a(strB, str);
                } else {
                    Logger.w(f60801l, "grs server just support https scheme url,please check.");
                }
            }
        }
        Logger.v(f60801l, "request to GRS server url is {%s}", this.f60809h);
    }

    private void c() {
        String grsParasKey = this.f60802a.getGrsParasKey(true, true, this.f60803b);
        this.f60811j = this.f60804c.a().a(grsParasKey + "ETag", "");
    }

    private String d() {
        com.huawei.hms.framework.network.grs.f.b bVarA = com.huawei.hms.framework.network.grs.f.b.a(this.f60803b.getPackageName());
        com.huawei.hms.framework.network.grs.local.model.a aVarA = bVarA != null ? bVarA.a() : null;
        if (aVarA == null) {
            return "";
        }
        String strA = aVarA.a();
        Logger.v(f60801l, "get appName from local assets is{%s}", strA);
        return strA;
    }

    public d a(ExecutorService executorService, String str, com.huawei.hms.framework.network.grs.e.c cVar) {
        if (this.f60809h.isEmpty()) {
            return null;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        d dVarA = a(executorService, this.f60809h, str, cVar);
        Logger.i(f60801l, "use 2.0 interface return http's code is：{%d}", Integer.valueOf(dVarA == null ? 0 : dVarA.b()));
        e.a(new ArrayList(this.f60807f), SystemClock.elapsedRealtime() - jElapsedRealtime, this.f60808g, this.f60803b);
        this.f60807f.clear();
        return dVarA;
    }

    public String a() {
        return this.f60811j;
    }

    public synchronized void a(d dVar) {
        this.f60807f.add(dVar);
        d dVar2 = this.f60805d;
        if (dVar2 != null && (dVar2.o() || this.f60805d.m())) {
            Logger.v(f60801l, "grsResponseResult is ok");
            return;
        }
        if (dVar.n()) {
            Logger.i(f60801l, "GRS server open 503 limiting strategy.");
            com.huawei.hms.framework.network.grs.h.d.a(this.f60802a.getGrsParasKey(true, true, this.f60803b), new com.huawei.hms.framework.network.grs.h.d.a(dVar.k(), SystemClock.elapsedRealtime()));
            return;
        }
        if (dVar.m()) {
            Logger.i(f60801l, "GRS server open 304 Not Modified.");
        }
        if (!dVar.o() && !dVar.m()) {
            Logger.v(f60801l, "grsResponseResult has exception so need return");
            return;
        }
        this.f60805d = dVar;
        this.f60804c.a(this.f60802a, dVar, this.f60803b, this.f60810i);
        for (Map.Entry<String, Future<d>> entry : this.f60806e.entrySet()) {
            if (!entry.getKey().equals(dVar.l()) && !entry.getValue().isCancelled()) {
                Logger.i(f60801l, "future cancel");
                entry.getValue().cancel(true);
            }
        }
    }

    public void a(com.huawei.hms.framework.network.grs.g.j.d dVar) {
    }
}
