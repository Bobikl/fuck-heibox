package com.max.xiaoheihe.router.interceptors;

import android.annotation.SuppressLint;
import android.net.Uri;
import android.util.Log;
import com.max.hbutils.bean.Result;
import com.max.xiaoheihe.bean.game.steamproxy.BaseProxyParamObj;
import com.max.xiaoheihe.bean.game.steamproxy.ProxyManage;
import com.max.xiaoheihe.bean.proxy.ProxyItemObj;
import com.max.xiaoheihe.module.proxy.ProxyManager;
import com.max.xiaoheihe.module.webview.InjectJsV2Activity;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.HashMap;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: InjectJsInterceptor.kt */
/* JADX INFO: loaded from: classes13.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class h implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f94975b = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f94976a = h.class.getSimpleName();

    /* JADX INFO: compiled from: InjectJsInterceptor.kt */
    public static final class a extends com.max.hbcommon.network.d<Result<BaseProxyParamObj>> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.sankuai.waimai.router.core.f f94977b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ com.sankuai.waimai.router.core.i f94978c;

        /* JADX INFO: renamed from: com.max.xiaoheihe.router.interceptors.h$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: InjectJsInterceptor.kt */
        public static final class C0898a implements ProxyManager.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.sankuai.waimai.router.core.f f94979a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ com.sankuai.waimai.router.core.i f94980b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ProxyManager f94981c;

            C0898a(com.sankuai.waimai.router.core.f fVar, com.sankuai.waimai.router.core.i iVar, ProxyManager proxyManager) {
                this.f94979a = fVar;
                this.f94980b = iVar;
                this.f94981c = proxyManager;
            }

            @Override // com.max.xiaoheihe.module.proxy.ProxyManager.a
            public void a(@dl.e ProxyItemObj proxyItemObj) {
                if (PatchProxy.proxy(new Object[]{proxyItemObj}, this, changeQuickRedirect, false, 48123, new Class[]{ProxyItemObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                if (proxyItemObj != null) {
                    com.sankuai.waimai.router.core.i iVar = this.f94980b;
                    m.l(iVar, com.max.xiaoheihe.module.proxy.a.f91563d, this.f94981c.f());
                    m.k(iVar, InjectJsV2Activity.f94204v4.c(), proxyItemObj);
                }
                this.f94979a.a();
            }
        }

        a(com.sankuai.waimai.router.core.f fVar, com.sankuai.waimai.router.core.i iVar) {
            this.f94977b = fVar;
            this.f94978c = iVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(@dl.d Throwable e10) {
            if (PatchProxy.proxy(new Object[]{e10}, this, changeQuickRedirect, false, 48120, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(e10, "e");
            this.f94977b.a();
        }

        public void onNext(@dl.d Result<BaseProxyParamObj> result) {
            String type;
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48121, new Class[]{Result.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(result, "result");
            BaseProxyParamObj result2 = result.getResult();
            m.k(this.f94978c, InjectJsV2Activity.f94204v4.d(), result2);
            if (!ad.a.a(ad.a.f1216w, false)) {
                if ((result2 != null ? result2.getProxy_manage() : null) != null) {
                    String url = result2.getUrl();
                    if (url != null) {
                        com.sankuai.waimai.router.core.f fVar = this.f94977b;
                        com.sankuai.waimai.router.core.i iVar = this.f94978c;
                        ProxyManage proxy_manage = result2.getProxy_manage();
                        if (proxy_manage == null || (type = proxy_manage.getType()) == null) {
                            return;
                        }
                        ProxyManager proxyManager = new ProxyManager(type, url, null);
                        proxyManager.q(new C0898a(fVar, iVar, proxyManager));
                        return;
                    }
                    return;
                }
            }
            this.f94977b.a();
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48122, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result<BaseProxyParamObj>) obj);
        }
    }

    @Override // com.sankuai.waimai.router.core.h
    @SuppressLint({"CheckResult"})
    public void a(@dl.d com.sankuai.waimai.router.core.i request, @dl.d com.sankuai.waimai.router.core.f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48119, new Class[]{com.sankuai.waimai.router.core.i.class, com.sankuai.waimai.router.core.f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String path = uriM.getPath();
        Log.d(this.f94976a, "Path: " + path);
        InjectJsV2Activity.a aVar = InjectJsV2Activity.f94204v4;
        String strG = m.g(request, aVar.a());
        HashMap map = (HashMap) m.f(request, aVar.b());
        com.max.xiaoheihe.network.e eVarA = com.max.xiaoheihe.network.i.a();
        if (map == null) {
            map = new HashMap();
        }
        eVarA.s2(strG, map).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).J5(new a(callback, request));
    }

    public final String b() {
        return this.f94976a;
    }
}
