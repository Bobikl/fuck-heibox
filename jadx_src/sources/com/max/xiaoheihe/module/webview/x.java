package com.max.xiaoheihe.module.webview;

import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import anet.channel.util.HttpConstant;
import com.huawei.hms.framework.common.ContainerUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: WebRequestInterceptor.java */
/* JADX INFO: loaded from: classes12.dex */
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f94818a = "WebRequestInterceptor";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static x f94819b;
    public static ChangeQuickRedirect changeQuickRedirect;

    private x() {
    }

    private boolean a(Map<String, String> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{map}, this, changeQuickRedirect, false, 47152, new Class[]{Map.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        Iterator<Map.Entry<String, String>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().contains("Cookie")) {
                return true;
            }
        }
        return false;
    }

    private String b(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 47153, new Class[]{String.class}, String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (str == null) {
            return null;
        }
        String[] strArrSplit = str.split(";");
        if (strArrSplit.length <= 1) {
            return null;
        }
        String str2 = strArrSplit[1];
        if (str2.contains(ContainerUtils.KEY_VALUE_DELIMITER)) {
            return str2.substring(str2.indexOf(ContainerUtils.KEY_VALUE_DELIMITER) + 1);
        }
        return null;
    }

    public static x c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 47149, new Class[0], x.class);
        if (patchProxyResultProxy.isSupported) {
            return (x) patchProxyResultProxy.result;
        }
        if (f94819b == null) {
            synchronized (x.class) {
                if (f94819b == null) {
                    f94819b = new x();
                }
            }
        }
        return f94819b;
    }

    private boolean d(int i10) {
        return i10 >= 300 && i10 < 400;
    }

    private HttpURLConnection e(String str, Map<String, String> map) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, map}, this, changeQuickRedirect, false, 47151, new Class[]{String.class, Map.class}, HttpURLConnection.class);
        if (patchProxyResultProxy.isSupported) {
            return (HttpURLConnection) patchProxyResultProxy.result;
        }
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setInstanceFollowRedirects(false);
            for (Map.Entry<String, String> entry : map.entrySet()) {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
            httpURLConnection.setRequestProperty("Accept-Language", "zh-CN,zh-Hans;q=0.9");
            String cookie = CookieManager.getInstance().getCookie(str);
            if (cookie != null) {
                httpURLConnection.setRequestProperty("Cookie", cookie);
            }
            return httpURLConnection;
        } catch (MalformedURLException unused) {
            Log.w(f94818a, "recursiveRequest MalformedURLException");
            return null;
        } catch (IOException unused2) {
            Log.w(f94818a, "recursiveRequest IOException");
            return null;
        } catch (Exception unused3) {
            Log.w(f94818a, "unknow exception");
            return null;
        }
    }

    public WebResourceResponse f(WebView webView, WebResourceRequest webResourceRequest) {
        boolean z10;
        boolean zEquals;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{webView, webResourceRequest}, this, changeQuickRedirect, false, 47150, new Class[]{WebView.class, WebResourceRequest.class}, WebResourceResponse.class);
        if (patchProxyResultProxy.isSupported) {
            return (WebResourceResponse) patchProxyResultProxy.result;
        }
        if (webResourceRequest.getMethod().equalsIgnoreCase("get")) {
            if (webResourceRequest.getUrl().getHost() != null) {
                z10 = webResourceRequest.getUrl().getPath() != null && webResourceRequest.getUrl().getHost().equals("accounts.nintendo.com") && webResourceRequest.getUrl().getPath().equals("/login");
                zEquals = webResourceRequest.getUrl().getHost().equals("www.google.com");
            } else {
                z10 = false;
                zEquals = false;
            }
            if (z10 || zEquals) {
                String string = webResourceRequest.getUrl().toString();
                Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
                if (zEquals) {
                    try {
                        string = string.replace("www.google.com", "www.recaptcha.net");
                    } catch (MalformedURLException e10) {
                        e10.printStackTrace();
                    } catch (IOException e11) {
                        e11.printStackTrace();
                    }
                }
                HttpURLConnection httpURLConnectionE = e(string, requestHeaders);
                if (httpURLConnectionE == null) {
                    return null;
                }
                if (!d(httpURLConnectionE.getResponseCode())) {
                    String contentType = httpURLConnectionE.getContentType();
                    String str = contentType.split(";")[0];
                    String strB = b(contentType);
                    int responseCode = httpURLConnectionE.getResponseCode();
                    String responseMessage = httpURLConnectionE.getResponseMessage();
                    Map<String, List<String>> headerFields = httpURLConnectionE.getHeaderFields();
                    Set<String> setKeySet = headerFields.keySet();
                    WebResourceResponse webResourceResponse = new WebResourceResponse(str, strB, httpURLConnectionE.getInputStream());
                    webResourceResponse.setStatusCodeAndReasonPhrase(responseCode, responseMessage);
                    HashMap map = new HashMap();
                    for (String str2 : setKeySet) {
                        List<String> list = headerFields.get(str2);
                        String strJoin = TextUtils.join(";", list);
                        if (z10 && str2 != null && (str2.equals(com.google.common.net.c.f58830i0) || str2.equals(com.google.common.net.c.f58824g0))) {
                            strJoin = strJoin.replace("https://www.google.com/recaptcha/", "https://www.google.com/recaptcha/ https://www.recaptcha.net/recaptcha/").replace("https://www.gstatic.com/recaptcha/", " https://www.gstatic.com/recaptcha/ https://www.gstatic.cn/recaptcha/");
                        }
                        map.put(str2, strJoin);
                        if (str2 != null && str2.equals("Set-Cookie")) {
                            CookieManager cookieManager = CookieManager.getInstance();
                            cookieManager.acceptCookie();
                            Iterator<String> it = list.iterator();
                            while (it.hasNext()) {
                                cookieManager.setCookie(string, it.next());
                            }
                        }
                    }
                    webResourceResponse.setResponseHeaders(map);
                    return webResourceResponse;
                }
                if (a(requestHeaders)) {
                    return null;
                }
                String headerField = httpURLConnectionE.getHeaderField("Location");
                if (headerField == null) {
                    headerField = httpURLConnectionE.getHeaderField("location");
                }
                if (headerField == null) {
                    return null;
                }
                if (!headerField.startsWith("http://") && !headerField.startsWith("https://")) {
                    URL url = new URL(string);
                    headerField = url.getProtocol() + HttpConstant.SCHEME_SPLIT + url.getHost() + headerField;
                }
                f fVar = new f(headerField);
                Map<String, List<String>> headerFields2 = httpURLConnectionE.getHeaderFields();
                Set<String> setKeySet2 = headerFields2.keySet();
                CookieManager cookieManager2 = CookieManager.getInstance();
                for (String str3 : setKeySet2) {
                    List<String> list2 = headerFields2.get(str3);
                    if (str3 != null && str3.equals("Set-Cookie")) {
                        cookieManager2.acceptCookie();
                        Iterator<String> it2 = list2.iterator();
                        while (it2.hasNext()) {
                            cookieManager2.setCookie(string, it2.next());
                        }
                    }
                }
                return fVar;
            }
        }
        return null;
    }
}
