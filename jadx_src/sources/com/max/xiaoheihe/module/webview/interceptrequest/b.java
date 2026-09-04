package com.max.xiaoheihe.module.webview.interceptrequest;

import android.webkit.WebResourceResponse;
import androidx.compose.runtime.internal.o;
import anet.channel.util.HttpConstant;
import com.max.hbcommon.network.eventlistener.HBNetEventListener;
import com.max.hbutils.core.BaseApplication;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.module.game.b2;
import com.max.xiaoheihe.module.game.e2;
import com.max.xiaoheihe.module.webview.f;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.qcloud.core.util.IOUtils;
import dl.e;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.internal.http.HttpMethod;
import okhttp3.s;
import okhttp3.u;
import okhttp3.v;
import okhttp3.z;

/* JADX INFO: compiled from: WebViewDNSNetworkHandler.kt */
/* JADX INFO: loaded from: classes12.dex */
@t0({"SMAP\nWebViewDNSNetworkHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewDNSNetworkHandler.kt\ncom/max/xiaoheihe/module/webview/interceptrequest/WebViewDNSNetworkHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,134:1\n1#2:135\n*E\n"})
@o(parameters = 0)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94705c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @e
    private final HashMap<String, String> f94706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private z f94707b;

    /* JADX INFO: compiled from: WebViewDNSNetworkHandler.kt */
    public static final class a implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f94708a = new a();
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // okhttp3.u
        @dl.d
        public final c0 intercept(@dl.d u.a chain) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{chain}, this, changeQuickRedirect, false, 47578, new Class[]{u.a.class}, c0.class);
            if (patchProxyResultProxy.isSupported) {
                return (c0) patchProxyResultProxy.result;
            }
            f0.p(chain, "chain");
            a0 a0VarRequest = chain.request();
            return chain.proceed(a0VarRequest.n().n("User-Agent", "Mozilla/5.0 AppleWebKit/537.36 (KHTML, like Gecko) Chrome/41.0.2272.118 Safari/537.36 ApiMaxJia/1.0").D(a0VarRequest.q().H().h()).b());
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.webview.interceptrequest.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: WebViewDNSNetworkHandler.kt */
    public static final class C0896b implements okhttp3.o {
        public static ChangeQuickRedirect changeQuickRedirect;

        C0896b() {
        }

        @Override // okhttp3.o
        @dl.d
        public List<InetAddress> lookup(@dl.d String hostname) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{hostname}, this, changeQuickRedirect, false, 47579, new Class[]{String.class}, List.class);
            if (patchProxyResultProxy.isSupported) {
                return (List) patchProxyResultProxy.result;
            }
            f0.p(hostname, "hostname");
            try {
                HashMap<String, String> mapB = b.this.b();
                if (mapB != null) {
                    if (!mapB.containsKey(hostname)) {
                        mapB = null;
                    }
                    if (mapB != null) {
                        g.f74531b.M("WebViewDNSNetworkHandler CustomDns lookup hostname: " + hostname + "  ip: " + mapB.get(hostname));
                        InetAddress[] allByName = InetAddress.getAllByName(mapB.get(hostname));
                        f0.o(allByName, "getAllByName(get(hostname))");
                        return ArraysKt___ArraysKt.kz(allByName);
                    }
                }
            } catch (Exception e10) {
                g.f74531b.v("WebViewDNSNetworkHandler CustomDns lookup error: " + e10.getMessage());
            }
            return okhttp3.o.f132626a.lookup(hostname);
        }
    }

    public b(@e HashMap<String, String> map) {
        this.f94706a = map;
    }

    private final z a() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47576, new Class[0], z.class);
        if (patchProxyResultProxy.isSupported) {
            return (z) patchProxyResultProxy.result;
        }
        z zVar = this.f94707b;
        if (zVar != null) {
            return zVar;
        }
        z zVarD = d();
        this.f94707b = zVarD;
        return zVarD;
    }

    private final z d() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 47577, new Class[0], z.class);
        return patchProxyResultProxy.isSupported ? (z) patchProxyResultProxy.result : new z.a().g0(Proxy.NO_PROXY).o(new b2(new ka.d(BaseApplication.a()))).r(new HBNetEventListener()).Z(new e2()).t(false).c(a.f94708a).q(new C0896b()).f();
    }

    private final boolean e(int i10) {
        return 300 <= i10 && i10 < 400;
    }

    @e
    public final HashMap<String, String> b() {
        return this.f94706a;
    }

    @e
    public final WebResourceResponse c(@e c cVar) {
        s sVarI;
        a0 a0VarB;
        String str;
        b0 b0VarB;
        String body;
        Map<String, String> requestHeaders;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 47575, new Class[]{c.class}, WebResourceResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebResourceResponse) patchProxyResultProxy.result;
        }
        String strValueOf = String.valueOf(cVar != null ? cVar.getUrl() : null);
        if (cVar == null || (requestHeaders = cVar.getRequestHeaders()) == null) {
            sVarI = null;
        } else {
            requestHeaders.put("Accept-Language", "zh-CN,zh-Hans;q=0.9");
            sVarI = s.INSTANCE.i(requestHeaders);
        }
        if (sVarI != null) {
            String method = cVar.getMethod();
            f0.o(method, "webResourceRequest.method");
            if (!HttpMethod.requiresRequestBody(method) || (body = d.d(cVar.a(), cVar.getRequestHeaders())) == null) {
                b0VarB = null;
            } else {
                b0.Companion companion = b0.INSTANCE;
                f0.o(body, "body");
                b0VarB = companion.b(body, null);
            }
            a0.a aVarO = new a0.a().B(strValueOf).o(sVarI);
            String method2 = cVar.getMethod();
            f0.o(method2, "webResourceRequest.method");
            a0VarB = aVarO.p(method2, b0VarB).b();
        } else {
            a0VarB = null;
        }
        c0 c0VarExecute = a0VarB != null ? a().a(a0VarB).execute() : null;
        if (c0VarExecute == null) {
            return null;
        }
        if (e(c0VarExecute.x())) {
            String strJ = c0.J(c0VarExecute, "Location", null, 2, null);
            if (strJ == null) {
                strJ = c0.J(c0VarExecute, "location", null, 2, null);
            }
            if (strJ == null) {
                return null;
            }
            if (!kotlin.text.u.v2(strJ, "http://", false, 2, null) && !kotlin.text.u.v2(strJ, "https://", false, 2, null)) {
                URL url = new URL(strValueOf);
                strJ = url.getProtocol() + HttpConstant.SCHEME_SPLIT + url.getHost() + strJ;
            }
            return new f(strJ);
        }
        d0 d0VarQ = c0VarExecute.q();
        v f132480d = d0VarQ != null ? d0VarQ.getF132480d() : null;
        if (f132480d != null) {
            str = f132480d.l() + IOUtils.DIR_SEPARATOR_UNIX + f132480d.k();
        } else {
            str = "Unknown";
        }
        String str2 = str;
        Charset charsetG = (f132480d != null ? v.g(f132480d, null, 1, null) : null) != null ? v.g(f132480d, null, 1, null) : null;
        String strName = charsetG != null ? charsetG.name() : null;
        int iX = c0VarExecute.x();
        String message = c0VarExecute.getMessage();
        Map mapB0 = s0.B0(c0VarExecute.getHeaders());
        d0 d0VarQ2 = c0VarExecute.q();
        return new WebResourceResponse(str2, strName, iX, message, mapB0, d0VarQ2 != null ? d0VarQ2.byteStream() : null);
    }
}
