package com.max.xiaoheihe.router;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.webview.t;
import com.max.xiaoheihe.router.interceptors.m;
import com.max.xiaoheihe.router.protocol.HeyboxWebProtocolHandler;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.sankuai.waimai.router.components.h;
import com.sankuai.waimai.router.core.f;
import com.sankuai.waimai.router.core.g;
import com.sankuai.waimai.router.core.i;
import dl.d;
import java.util.HashMap;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: WebViewUriHandler.kt */
/* JADX INFO: loaded from: classes13.dex */
@o(parameters = 0)
public final class c extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    public static final a f94896b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f94897c = 0;
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @d
    public static final String f94898d = "http";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    public static final String f94899e = "https";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    public static final String f94900f = "heybox";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    public static final String f94901g = "heyboxchat";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @d
    public static final String f94902h = "maxjia";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @d
    public static final String f94903i = "file";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @d
    public static final String f94904j = "alipayconnect";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    public static final String f94905k = "WebActionHelper";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @d
    public static final String f94906l = "ComeFromWelcome";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @d
    public static final String f94907m = "WebView";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @d
    public static final String f94908n = "WebActionResult";

    /* JADX INFO: compiled from: WebViewUriHandler.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    @Override // com.sankuai.waimai.router.core.g
    public void d(@d i request, @d f callback) {
        if (PatchProxy.proxy(new Object[]{request, callback}, this, changeQuickRedirect, false, 48109, new Class[]{i.class, f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(request, "request");
        f0.p(callback, "callback");
        Uri uriM = request.m();
        f0.o(uriM, "request.uri");
        String string = uriM.toString();
        f0.o(string, "uri.toString()");
        String scheme = uriM.getScheme();
        Context contextB = request.b();
        f0.o(contextB, "request.context");
        WebView webView = (WebView) request.d(WebView.class, f94907m);
        t tVar = (t) request.d(t.class, f94905k);
        String str = (String) request.d(String.class, f94906l);
        Set<String> setM = com.max.hbcache.c.m("schemes_white_list");
        if (f0.g(scheme, lb.a.f130989k)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            if (com.max.xiaoheihe.utils.d.H0(request.b(), lb.a.f130983j)) {
                intent.setData(uriM);
                m.x(request, 268435456);
            } else {
                intent.setData(Uri.parse("https://acc.xiaoheihe.cn"));
            }
            f(callback, h.f(request, intent));
            return;
        }
        if (f0.g(scheme, f94902h)) {
            new com.max.xiaoheihe.router.protocol.a().a(request, callback);
            callback.onComplete(200);
            return;
        }
        if (f0.g(scheme, "heybox") || f0.g(scheme, f94901g)) {
            new HeyboxWebProtocolHandler().a(request, callback);
            callback.onComplete(200);
            return;
        }
        if (setM != null && CollectionsKt___CollectionsKt.R1(setM, scheme)) {
            try {
                Intent uri = Intent.parseUri(uriM.toString(), 1);
                uri.addCategory("android.intent.category.BROWSABLE");
                uri.setComponent(null);
                uri.addFlags(268435456);
                f(callback, h.f(request, uri));
                return;
            } catch (Exception e10) {
                callback.onComplete(500);
                e10.printStackTrace();
                return;
            }
        }
        if (!f0.g(scheme, "http") && !f0.g(scheme, "https")) {
            if (!f0.g(scheme, "file")) {
                if (f0.g(scheme, hg.b.f119169a)) {
                    callback.a();
                    return;
                } else if (!f0.g(scheme, f94904j)) {
                    callback.onComplete(200);
                    return;
                } else {
                    com.max.xiaoheihe.utils.d.G1(contextB, new Intent("android.intent.action.VIEW", Uri.parse(string)));
                    callback.onComplete(200);
                    return;
                }
            }
            if (webView != null) {
                webView.stopLoading();
                webView.loadUrl(string);
                callback.onComplete(200);
                return;
            } else {
                Integer num = (Integer) request.d(Integer.class, com.sankuai.waimai.router.components.a.f96453c);
                Intent intentC0 = l0.c0(contextB);
                intentC0.putExtra("pageurl", string);
                intentC0.putExtra("title", contextB.getResources().getString(R.string.app_name));
                l0.x0(contextB, intentC0, num != null ? num.intValue() : -1);
                callback.onComplete(200);
                return;
            }
        }
        String string2 = uriM.toString();
        f0.o(string2, "uri.toString()");
        if (kotlin.text.u.K1(string2, ".apk", false, 2, null)) {
            l0.y0(contextB, uriM.toString());
            callback.onComplete(200);
            return;
        }
        if (!com.max.hbcommon.utils.c.u(str) && f0.g(str, "yes")) {
            try {
                Intent intent2 = new Intent("android.intent.action.VIEW");
                intent2.setData(Uri.parse(string));
                f(callback, h.f(request, intent2));
                return;
            } catch (Exception e11) {
                callback.onComplete(500);
                e11.printStackTrace();
                return;
            }
        }
        if (tVar != null) {
            string = tVar.M0(string);
            f0.o(string, "webActionHelper.AddCookie(url)");
        }
        if (webView == null) {
            if (!l0.n0(contextB, string)) {
                Integer num2 = (Integer) request.d(Integer.class, com.sankuai.waimai.router.components.a.f96453c);
                Intent intentC1 = l0.c0(contextB);
                intentC1.putExtra("pageurl", string);
                intentC1.putExtra("title", contextB.getResources().getString(R.string.app_name));
                l0.x0(contextB, intentC1, num2 != null ? num2.intValue() : -1);
            }
            callback.onComplete(200);
            return;
        }
        webView.stopLoading();
        if (!l0.n0(contextB, string)) {
            if (tVar == null || com.max.hbcommon.utils.c.u(tVar.l3())) {
                webView.loadUrl(string);
            } else {
                HashMap map = new HashMap();
                String strL3 = tVar.l3();
                f0.o(strL3, "webActionHelper.getReferer()");
                map.put("Referer", strL3);
                webView.loadUrl(string, map);
            }
        }
        callback.onComplete(200);
    }

    @Override // com.sankuai.waimai.router.core.g
    public boolean e(@d i request) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{request}, this, changeQuickRedirect, false, 48108, new Class[]{i.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.p(request, "request");
        return true;
    }

    public final void f(@d f callback, int i10) {
        if (PatchProxy.proxy(new Object[]{callback, new Integer(i10)}, this, changeQuickRedirect, false, 48110, new Class[]{f.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "callback");
        if (i10 == 200) {
            callback.onComplete(i10);
        } else {
            callback.a();
        }
    }

    public final boolean g() {
        return false;
    }

    @Override // com.sankuai.waimai.router.core.g
    @d
    public String toString() {
        return "WebViewUriHandler";
    }
}
