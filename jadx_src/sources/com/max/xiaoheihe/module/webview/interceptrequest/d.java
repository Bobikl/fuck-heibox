package com.max.xiaoheihe.module.webview.interceptrequest;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.huawei.hms.framework.common.ContainerUtils;
import com.jd.jdcache.JDCache;
import com.max.hbcommon.utils.i;
import com.max.heybox.hblog.g;
import com.max.xiaoheihe.bean.webintercept.IpDirectObj;
import com.max.xiaoheihe.module.webview.y;
import com.max.xiaoheihe.utils.b0;
import com.max.xiaoheihe.utils.l0;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: WriteHandlingWebViewClient.java */
/* JADX INFO: loaded from: classes12.dex */
public class d extends WebViewClient {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f94713f = "WriteHandling";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f94714g = "AJAXINTERCEPT";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private IpDirectObj f94716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f94717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f94718d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f94715a = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f94719e = null;

    public d(WebView webView, IpDirectObj ipDirectObj, boolean z10, String str) {
        this.f94717c = z10;
        this.f94718d = str;
        if (ipDirectObj == null || ipDirectObj.getDomain_ip_list() == null || ipDirectObj.getDomain_ip_list().isEmpty() || ipDirectObj.getIntercept_request_js_list() == null || ipDirectObj.getIntercept_request_js_list().isEmpty()) {
            return;
        }
        b0.c(false);
        this.f94716b = ipDirectObj;
        webView.addJavascriptInterface(new a(this), "interception");
    }

    private String b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47597, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String str2 = this.f94715a.get(str);
        this.f94715a.remove(str);
        return str2;
    }

    private String c(WebResourceRequest webResourceRequest) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webResourceRequest}, this, changeQuickRedirect, false, 47595, new Class[]{WebResourceRequest.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : i(webResourceRequest, f94714g)[1];
    }

    public static String d(String str, Map<String, String> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, map}, null, changeQuickRedirect, true, 47585, new Class[]{String.class, Map.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null || "undefined".equals(str)) {
            return str;
        }
        String str2 = null;
        String strQ = map != null ? l0.q(map) : null;
        if (strQ == null || !strQ.contains("multipart/form-data")) {
            return str;
        }
        for (String str3 : strQ.split(";")) {
            if (str3.contains("boundary")) {
                String[] strArrSplit = str3.split(ContainerUtils.KEY_VALUE_DELIMITER);
                if (strArrSplit.length < 2) {
                    break;
                }
                str2 = strArrSplit[1];
                break;
            }
        }
        if (str2 == null) {
            return str;
        }
        String str4 = "";
        for (String str5 : str.split("&")) {
            str4 = str4 + e(str2, str5);
        }
        return str4 + "--" + str2 + "--";
    }

    public static String e(String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 47586, new Class[]{String.class, String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        String[] strArrSplit = str2.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
        if (strArrSplit.length < 2) {
            return str2;
        }
        return "--" + str + "\r\nContent-Disposition: form-data; name=\"" + strArrSplit[0] + "\"\r\n\r\n" + strArrSplit[1] + "\r\n";
    }

    private Uri g(WebResourceRequest webResourceRequest, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webResourceRequest, str}, this, changeQuickRedirect, false, 47596, new Class[]{WebResourceRequest.class, String.class}, Uri.class);
        return patchProxyResultProxy.isSupported ? (Uri) patchProxyResultProxy.result : Uri.parse(i(webResourceRequest, str)[0]);
    }

    private String h(WebResourceRequest webResourceRequest) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webResourceRequest}, this, changeQuickRedirect, false, 47592, new Class[]{WebResourceRequest.class}, String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : b(c(webResourceRequest));
    }

    private String[] i(WebResourceRequest webResourceRequest, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webResourceRequest, str}, this, changeQuickRedirect, false, 47594, new Class[]{WebResourceRequest.class, String.class}, String[].class);
        return patchProxyResultProxy.isSupported ? (String[]) patchProxyResultProxy.result : webResourceRequest.getUrl().toString().split(str);
    }

    private WebResourceResponse j(WebResourceResponse webResourceResponse, Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webResourceResponse, context}, this, changeQuickRedirect, false, 47598, new Class[]{WebResourceResponse.class, Context.class}, WebResourceResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebResourceResponse) patchProxyResultProxy.result;
        }
        String mimeType = webResourceResponse.getMimeType();
        String encoding = webResourceResponse.getEncoding();
        return new WebResourceResponse(mimeType, encoding, webResourceResponse.getStatusCode(), webResourceResponse.getReasonPhrase(), webResourceResponse.getResponseHeaders(), k(context, webResourceResponse.getData(), mimeType, encoding));
    }

    private InputStream k(Context context, InputStream inputStream, String str, String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, inputStream, str, str2}, this, changeQuickRedirect, false, 47599, new Class[]{Context.class, InputStream.class, String.class, String.class}, InputStream.class);
        if (patchProxyResultProxy.isSupported) {
            return (InputStream) patchProxyResultProxy.result;
        }
        try {
            byte[] bArrH = l0.h(inputStream);
            if (str.equals("text/html")) {
                bArrH = a.a(this.f94716b, bArrH).getBytes(str2);
            }
            return new ByteArrayInputStream(bArrH);
        } catch (Exception e10) {
            throw new RuntimeException(e10.getMessage());
        }
    }

    private boolean l(WebResourceRequest webResourceRequest) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webResourceRequest}, this, changeQuickRedirect, false, 47593, new Class[]{WebResourceRequest.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : webResourceRequest.getUrl().toString().contains(f94714g);
    }

    public static boolean m(int i10) {
        return i10 >= 100 && i10 <= 599;
    }

    void a(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 47591, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f94715a.put(str, str2);
    }

    public IpDirectObj f() {
        return this.f94716b;
    }

    public WebResourceResponse n(WebView webView, c cVar) {
        WebResourceResponse webResourceResponseC;
        boolean z10 = false;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, cVar}, this, changeQuickRedirect, false, 47587, new Class[]{WebView.class, c.class}, WebResourceResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebResourceResponse) patchProxyResultProxy.result;
        }
        if (this.f94717c) {
            if (y.k(cVar.getUrl()) && (webResourceResponseC = y.c(cVar.getUrl())) != null) {
                return webResourceResponseC;
            }
        } else if (this.f94716b != null && !i.d()) {
            if (this.f94716b.getDomain_ip_list() != null) {
                for (String str : this.f94716b.getDomain_ip_list().keySet()) {
                    String str2 = this.f94716b.getDomain_ip_list().get(str);
                    if (cVar.getUrl().getHost().equals(str) && !com.max.hbcommon.utils.c.u(str2)) {
                        z10 = true;
                        break;
                    }
                }
            }
            if (z10) {
                String strTrim = cVar.getUrl().getScheme().trim();
                if (!strTrim.equalsIgnoreCase("http") && !strTrim.equalsIgnoreCase("https")) {
                    return super.shouldInterceptRequest(webView, cVar);
                }
                try {
                    if (this.f94719e == null) {
                        this.f94719e = new b(this.f94716b.getDomain_ip_list());
                    }
                    return this.f94719e.c(cVar);
                } catch (Throwable th2) {
                    Log.e(f94713f, "useDns  " + th2.getClass().getSimpleName() + " " + th2.getMessage());
                }
            }
        }
        return super.shouldInterceptRequest(webView, cVar);
    }

    public boolean o(WebView webView, String str, boolean z10) {
        Object[] objArr = {webView, str, new Byte(z10 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 47590, new Class[]{WebView.class, String.class, cls}, cls);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : super.shouldOverrideUrlLoading(webView, str);
    }

    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        Uri uriG;
        String strH;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, webResourceRequest}, this, changeQuickRedirect, false, 47588, new Class[]{WebView.class, WebResourceRequest.class}, WebResourceResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebResourceResponse) patchProxyResultProxy.result;
        }
        try {
            Uri url = webResourceRequest.getUrl();
            g.W("WriteHandling shouldInterceptRequest" + url.toString());
            if (!com.max.hbcommon.utils.c.u(this.f94718d)) {
                JDCache jDCache = JDCache.INSTANCE;
                if (jDCache.getLoader(this.f94718d) != null) {
                    return jDCache.getLoader(this.f94718d).onRequest(webResourceRequest);
                }
            }
            if (this.f94716b == null) {
                return n(webView, new c(webResourceRequest, null, url));
            }
            if (l(webResourceRequest)) {
                strH = h(webResourceRequest);
                uriG = g(webResourceRequest, f94714g);
            } else {
                uriG = url;
                strH = null;
            }
            WebResourceResponse webResourceResponseN = n(webView, new c(webResourceRequest, strH, uriG));
            if (webResourceResponseN == null) {
                return null;
            }
            return ("text/html".equals(webResourceResponseN.getMimeType()) && m(webResourceResponseN.getStatusCode())) ? j(webResourceResponseN, webView.getContext()) : webResourceResponseN;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, str}, this, changeQuickRedirect, false, 47589, new Class[]{WebView.class, String.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : o(webView, str, true);
    }
}
