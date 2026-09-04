package com.huawei.hms.framework.network.grs.g;

import com.huawei.hms.framework.common.ExecutorsUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.common.NetworkUtil;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes7.dex */
public class g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ExecutorService f60832b = ExecutorsUtils.newCachedThreadPool("GRS_RequestController-Task");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Map<String, com.huawei.hms.framework.network.grs.g.j.b> f60833c = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Object f60834d = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.huawei.hms.framework.network.grs.e.a f60835a;

    public class a implements Callable<d> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.j.c f60836a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f60837b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c f60838c;

        a(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2) {
            this.f60836a = cVar;
            this.f60837b = str;
            this.f60838c = cVar2;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // java.util.concurrent.Callable
        public d call() {
            return new c(this.f60836a, g.this.f60835a).a(g.f60832b, this.f60837b, this.f60838c);
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.g.j.c f60840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f60841b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.e.c f60842c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f60843d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ com.huawei.hms.framework.network.grs.b f60844e;

        b(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i10, com.huawei.hms.framework.network.grs.b bVar) {
            this.f60840a = cVar;
            this.f60841b = str;
            this.f60842c = cVar2;
            this.f60843d = i10;
            this.f60844e = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.a(gVar.a(this.f60840a, this.f60841b, this.f60842c, this.f60843d), this.f60844e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(d dVar, com.huawei.hms.framework.network.grs.b bVar) {
        if (bVar != null) {
            if (dVar == null) {
                Logger.v("RequestController", "GrsResponse is null");
                bVar.a();
            } else {
                Logger.v("RequestController", "GrsResponse is not null");
                bVar.a(dVar);
            }
        }
    }

    public d a(com.huawei.hms.framework.network.grs.g.j.c cVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i10) {
        Future<d> futureSubmit;
        String str2;
        String str3;
        Logger.d("RequestController", "request to server with service name is: " + str);
        String grsParasKey = cVar.b().getGrsParasKey(true, true, cVar.a());
        Logger.v("RequestController", "request spUrlKey: " + grsParasKey);
        synchronized (f60834d) {
            if (!NetworkUtil.isNetworkAvailable(cVar.a())) {
                return null;
            }
            com.huawei.hms.framework.network.grs.h.d.a aVarA = com.huawei.hms.framework.network.grs.h.d.a(grsParasKey);
            Map<String, com.huawei.hms.framework.network.grs.g.j.b> map = f60833c;
            com.huawei.hms.framework.network.grs.g.j.b bVar = map.get(grsParasKey);
            if (bVar == null || !bVar.b()) {
                if (aVarA != null && aVarA.a()) {
                    return null;
                }
                Logger.d("RequestController", "hitGrsRequestBean == null or request block is released.");
                futureSubmit = f60832b.submit(new a(cVar, str, cVar2));
                map.put(grsParasKey, new com.huawei.hms.framework.network.grs.g.j.b(futureSubmit));
            } else {
                futureSubmit = bVar.a();
            }
            if (i10 == -1) {
                com.huawei.hms.framework.network.grs.g.j.d dVarA = com.huawei.hms.framework.network.grs.g.i.a.a(cVar.a());
                i10 = dVarA != null ? dVarA.c() : 10;
            }
            Logger.i("RequestController", "use grsQueryTimeout %d", Integer.valueOf(i10));
            try {
                return futureSubmit.get(i10, TimeUnit.SECONDS);
            } catch (InterruptedException e10) {
                e = e10;
                str2 = "RequestController";
                str3 = "when check result, find InterruptedException, check others";
                Logger.w(str2, str3, e);
                return null;
            } catch (CancellationException e11) {
                e = e11;
                str2 = "RequestController";
                str3 = "when check result, find CancellationException, check others";
                Logger.w(str2, str3, e);
                return null;
            } catch (ExecutionException e12) {
                e = e12;
                str2 = "RequestController";
                str3 = "when check result, find ExecutionException, check others";
                Logger.w(str2, str3, e);
                return null;
            } catch (TimeoutException e13) {
                e = e13;
                str2 = "RequestController";
                str3 = "when check result, find TimeoutException, check others";
                Logger.w(str2, str3, e);
                return null;
            } catch (Exception e14) {
                e = e14;
                str2 = "RequestController";
                str3 = "when check result, find Other Exception, check others";
                Logger.w(str2, str3, e);
                return null;
            }
        }
    }

    public void a(com.huawei.hms.framework.network.grs.e.a aVar) {
        this.f60835a = aVar;
    }

    public void a(com.huawei.hms.framework.network.grs.g.j.c cVar, com.huawei.hms.framework.network.grs.b bVar, String str, com.huawei.hms.framework.network.grs.e.c cVar2, int i10) {
        f60832b.execute(new b(cVar, str, cVar2, i10, bVar));
    }

    public void a(String str) {
        synchronized (f60834d) {
            f60833c.remove(str);
        }
    }
}
