package com.alipay.deviceid.module.x;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.alipay.deviceid.module.rpc.mrpc.core.HttpException;
import com.alipay.deviceid.module.rpc.mrpc.core.HttpUrlHeader;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpResponse;
import org.apache.http.NoHttpResponseException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.conn.ConnectTimeoutException;
import org.apache.http.conn.ConnectionPoolTimeoutException;
import org.apache.http.conn.HttpHostConnectException;
import org.apache.http.cookie.Cookie;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.BasicCookieStore;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: compiled from: HttpWorker.java */
/* JADX INFO: loaded from: classes6.dex */
public final class az implements Callable<bd> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final HttpRequestRetryHandler f38276e = new bm();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected aw f38277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Context f38278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected ax f38279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f38280d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HttpUriRequest f38281f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private CookieManager f38284i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private AbstractHttpEntity f38285j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private HttpHost f38286k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private URL f38287l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f38292q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private HttpContext f38282g = new BasicHttpContext();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CookieStore f38283h = new BasicCookieStore();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f38288m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f38289n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f38290o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f38291p = null;

    public az(aw awVar, ax axVar) {
        this.f38277a = awVar;
        this.f38278b = awVar.f38254a;
        this.f38279c = axVar;
    }

    private static long a(String[] strArr) {
        String str;
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if ("max-age".equalsIgnoreCase(strArr[i10]) && (str = strArr[i10 + 1]) != null) {
                try {
                    return Long.parseLong(str);
                } catch (Exception unused) {
                    continue;
                }
            }
        }
        return 0L;
    }

    private static HttpUrlHeader a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    private bd a(HttpResponse httpResponse, int i10, String str) throws Throwable {
        String str2;
        Thread.currentThread().getId();
        HttpEntity entity = httpResponse.getEntity();
        ByteArrayOutputStream byteArrayOutputStream = null;
        String str3 = null;
        if (entity == null || httpResponse.getStatusLine().getStatusCode() != 200) {
            if (entity != null) {
                return null;
            }
            httpResponse.getStatusLine().getStatusCode();
            return null;
        }
        Thread.currentThread().getId();
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                long jCurrentTimeMillis = System.currentTimeMillis();
                a(entity, byteArrayOutputStream2);
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                this.f38290o = false;
                this.f38277a.f38258e += System.currentTimeMillis() - jCurrentTimeMillis;
                this.f38277a.f38256c += (long) byteArray.length;
                ay ayVar = new ay(a(httpResponse), i10, str, byteArray);
                long jB = b(httpResponse);
                Header contentType = httpResponse.getEntity().getContentType();
                if (contentType != null) {
                    HashMap<String, String> mapA = a(contentType.getValue());
                    String str4 = mapA.get("charset");
                    str3 = mapA.get("Content-Type");
                    str2 = str4;
                } else {
                    str2 = null;
                }
                ayVar.a(str3);
                ayVar.f38272c = str2;
                ayVar.f38270a = System.currentTimeMillis();
                ayVar.f38271b = jB;
                try {
                    byteArrayOutputStream2.close();
                    return ayVar;
                } catch (IOException e10) {
                    throw new RuntimeException("ArrayOutputStream close error!", e10.getCause());
                }
            } catch (Throwable th2) {
                th = th2;
                byteArrayOutputStream = byteArrayOutputStream2;
                if (byteArrayOutputStream != null) {
                    try {
                        byteArrayOutputStream.close();
                    } catch (IOException e11) {
                        throw new RuntimeException("ArrayOutputStream close error!", e11.getCause());
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    private static HashMap<String, String> a(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] strArrSplit = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
            map.put(strArrSplit[0], strArrSplit[1]);
        }
        return map;
    }

    private void a(HttpEntity httpEntity, OutputStream outputStream) throws IOException {
        InputStream inputStreamA = ar.a(httpEntity);
        httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int i10 = inputStreamA.read(bArr);
                    if (i10 == -1 || this.f38279c.f38299f) {
                        break;
                    }
                    outputStream.write(bArr, 0, i10);
                    this.f38279c.a();
                }
                outputStream.flush();
                ba.a(inputStreamA);
            } catch (Exception e10) {
                e10.getCause();
                throw new IOException("HttpWorker Request Error!" + e10.getLocalizedMessage());
            }
        } catch (Throwable th2) {
            ba.a(inputStreamA);
            throw th2;
        }
    }

    private static long b(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] strArrSplit = firstHeader.getValue().split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (strArrSplit.length >= 2) {
                try {
                    return a(strArrSplit);
                } catch (NumberFormatException unused) {
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return ar.b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    private URI b() {
        String str = this.f38279c.f38264a;
        String str2 = this.f38280d;
        if (str2 != null) {
            str = str2;
        }
        if (str != null) {
            return new URI(str);
        }
        throw new RuntimeException("url should not be null");
    }

    private HttpUriRequest c() {
        HttpUriRequest httpUriRequest = this.f38281f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.f38285j == null) {
            ax axVar = this.f38279c;
            byte[] bArr = axVar.f38265b;
            String strA = axVar.a("gzip");
            if (bArr != null) {
                if (TextUtils.equals(strA, "true")) {
                    this.f38285j = ar.a(bArr);
                } else {
                    this.f38285j = new ByteArrayEntity(bArr);
                }
                this.f38285j.setContentType(this.f38279c.f38266c);
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.f38285j;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(b());
            httpPost.setEntity(abstractHttpEntity);
            this.f38281f = httpPost;
        } else {
            this.f38281f = new HttpGet(b());
        }
        return this.f38281f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00d2  */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public bd call() throws Throwable {
        boolean z10;
        HttpHost httpHost;
        while (true) {
            try {
                NetworkInfo[] allNetworkInfo = ((ConnectivityManager) this.f38278b.getSystemService("connectivity")).getAllNetworkInfo();
                boolean z11 = true;
                if (allNetworkInfo == null) {
                    z10 = false;
                    break;
                }
                int length = allNetworkInfo.length;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        z10 = false;
                        break;
                    }
                    NetworkInfo networkInfo = allNetworkInfo[i10];
                    if (networkInfo != null && networkInfo.isAvailable() && networkInfo.isConnectedOrConnecting()) {
                        z10 = true;
                        break;
                    }
                    i10++;
                }
                if (!z10) {
                    throw new HttpException(1, "The network is not available");
                }
                ArrayList<Header> arrayList = this.f38279c.f38267d;
                if (arrayList != null && !arrayList.isEmpty()) {
                    Iterator<Header> it = arrayList.iterator();
                    while (it.hasNext()) {
                        c().addHeader(it.next());
                    }
                }
                ar.a((HttpRequest) c());
                ar.b((HttpRequest) c());
                c().addHeader("cookie", i().getCookie(this.f38279c.f38264a));
                this.f38282g.setAttribute("http.cookie-store", this.f38283h);
                ((DefaultHttpClient) this.f38277a.f38255b.f38233b).setHttpRequestRetryHandler(f38276e);
                long jCurrentTimeMillis = System.currentTimeMillis();
                f();
                this.f38281f.getURI().toString();
                HttpParams params = this.f38277a.f38255b.getParams();
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f38278b.getSystemService("connectivity")).getActiveNetworkInfo();
                if (activeNetworkInfo == null || !activeNetworkInfo.isAvailable()) {
                    httpHost = null;
                } else {
                    String defaultHost = Proxy.getDefaultHost();
                    int defaultPort = Proxy.getDefaultPort();
                    if (defaultHost != null) {
                        httpHost = new HttpHost(defaultHost, defaultPort);
                    } else {
                        httpHost = null;
                    }
                }
                params.setParameter("http.route.default-proxy", (httpHost != null && TextUtils.equals(httpHost.getHostName(), "127.0.0.1") && httpHost.getPort() == 8087) ? null : httpHost);
                HttpHost httpHost2 = this.f38286k;
                if (httpHost2 == null) {
                    URL urlH = h();
                    HttpHost httpHost3 = new HttpHost(urlH.getHost(), g(), urlH.getProtocol());
                    this.f38286k = httpHost3;
                    httpHost2 = httpHost3;
                }
                if (g() == 80) {
                    httpHost2 = new HttpHost(h().getHost());
                }
                HttpResponse httpResponseExecute = this.f38277a.f38255b.execute(httpHost2, this.f38281f, this.f38282g);
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                aw awVar = this.f38277a;
                awVar.f38257d += jCurrentTimeMillis2 - jCurrentTimeMillis;
                awVar.f38259f++;
                List<Cookie> cookies = this.f38283h.getCookies();
                if (this.f38279c.f38268e) {
                    i().removeAllCookie();
                }
                if (!cookies.isEmpty()) {
                    for (Cookie cookie : cookies) {
                        if (cookie.getDomain() != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(cookie.getName());
                            sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                            sb2.append(cookie.getValue());
                            sb2.append("; domain=");
                            sb2.append(cookie.getDomain());
                            sb2.append(cookie.isSecure() ? "; Secure" : "");
                            i().setCookie(this.f38279c.f38264a, sb2.toString());
                            CookieSyncManager.getInstance().sync();
                        }
                    }
                }
                int statusCode = httpResponseExecute.getStatusLine().getStatusCode();
                String reasonPhrase = httpResponseExecute.getStatusLine().getReasonPhrase();
                if (statusCode != 200) {
                    if (statusCode != 304) {
                        z11 = false;
                    }
                    if (!z11) {
                        throw new HttpException(Integer.valueOf(httpResponseExecute.getStatusLine().getStatusCode()), httpResponseExecute.getStatusLine().getReasonPhrase());
                    }
                }
                bd bdVarA = a(httpResponseExecute, statusCode, reasonPhrase);
                if (((bdVarA == null || bdVarA.a() == null) ? -1L : bdVarA.a().length) == -1 && (bdVarA instanceof ay)) {
                    try {
                        Long.parseLong(((ay) bdVarA).f38273d.getHead("Content-Length"));
                    } catch (Exception unused) {
                        Log.e("HttpWorker", "parse Content-Length error");
                    }
                }
                if (this.f38279c.f38264a != null && !TextUtils.isEmpty(f())) {
                    f();
                }
                return bdVarA;
            } catch (HttpException e10) {
                e();
                if (this.f38279c.a() != null) {
                    e10.getCode();
                    e10.getMsg();
                }
                Log.e(com.alipay.zoloz.android.phone.mrpc.core.i.f39702h, String.valueOf(e10));
                throw e10;
            } catch (NullPointerException e11) {
                e();
                int i11 = this.f38288m;
                if (i11 > 0) {
                    Log.e(com.alipay.zoloz.android.phone.mrpc.core.i.f39702h, String.valueOf(e11));
                    throw new HttpException(0, String.valueOf(e11));
                }
                this.f38288m = i11 + 1;
            } catch (SocketTimeoutException e12) {
                e();
                if (this.f38279c.a() != null) {
                    e12.toString();
                }
                Log.e(com.alipay.zoloz.android.phone.mrpc.core.i.f39702h, String.valueOf(e12));
                throw new HttpException(4, String.valueOf(e12));
            } catch (URISyntaxException e13) {
                throw new RuntimeException("Url parser error!", e13.getCause());
            } catch (UnknownHostException e14) {
                e();
                if (this.f38279c.a() != null) {
                    e14.toString();
                }
                Log.e(com.alipay.zoloz.android.phone.mrpc.core.i.f39702h, String.valueOf(e14));
                throw new HttpException(9, String.valueOf(e14));
            } catch (SSLHandshakeException e15) {
                e();
                if (this.f38279c.a() != null) {
                    e15.toString();
                }
                Log.e(com.alipay.zoloz.android.phone.mrpc.core.i.f39702h, String.valueOf(e15));
                throw new HttpException(2, String.valueOf(e15));
            } catch (SSLPeerUnverifiedException e16) {
                e();
                if (this.f38279c.a() != null) {
                    e16.toString();
                }
                Log.e(com.alipay.zoloz.android.phone.mrpc.core.i.f39702h, String.valueOf(e16));
                throw new HttpException(2, String.valueOf(e16));
            } catch (SSLException e17) {
                e();
                if (this.f38279c.a() != null) {
                    e17.toString();
                }
                Log.e(com.alipay.zoloz.android.phone.mrpc.core.i.f39702h, String.valueOf(e17));
                throw new HttpException(6, String.valueOf(e17));
            } catch (NoHttpResponseException e18) {
                e();
                if (this.f38279c.a() != null) {
                    e18.toString();
                }
                Log.e(com.alipay.zoloz.android.phone.mrpc.core.i.f39702h, String.valueOf(e18));
                throw new HttpException(5, String.valueOf(e18));
            } catch (ConnectionPoolTimeoutException e19) {
                e();
                if (this.f38279c.a() != null) {
                    e19.toString();
                }
                Log.e(com.alipay.zoloz.android.phone.mrpc.core.i.f39702h, String.valueOf(e19));
                throw new HttpException(3, String.valueOf(e19));
            } catch (ConnectTimeoutException e20) {
                e();
                if (this.f38279c.a() != null) {
                    e20.toString();
                }
                Log.e(com.alipay.zoloz.android.phone.mrpc.core.i.f39702h, String.valueOf(e20));
                throw new HttpException(3, String.valueOf(e20));
            } catch (HttpHostConnectException e21) {
                e();
                if (this.f38279c.a() != null) {
                    e21.toString();
                }
                Log.e(com.alipay.zoloz.android.phone.mrpc.core.i.f39702h, "", e21);
                throw new HttpException(8, String.valueOf(e21));
            } catch (IOException e22) {
                e();
                if (this.f38279c.a() != null) {
                    e22.toString();
                }
                Log.e(com.alipay.zoloz.android.phone.mrpc.core.i.f39702h, String.valueOf(e22));
                throw new HttpException(6, String.valueOf(e22));
            } catch (Exception e23) {
                Log.e(com.alipay.zoloz.android.phone.mrpc.core.i.f39702h, "", e23);
                e();
                if (this.f38279c.a() != null) {
                    e23.toString();
                }
                throw new HttpException(0, String.valueOf(e23));
            }
        }
    }

    private void e() {
        HttpUriRequest httpUriRequest = this.f38281f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private String f() {
        if (!TextUtils.isEmpty(this.f38292q)) {
            return this.f38292q;
        }
        String strA = this.f38279c.a("operationType");
        this.f38292q = strA;
        return strA;
    }

    private int g() {
        URL urlH = h();
        return urlH.getPort() == -1 ? urlH.getDefaultPort() : urlH.getPort();
    }

    private URL h() {
        URL url = this.f38287l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f38279c.f38264a);
        this.f38287l = url2;
        return url2;
    }

    private CookieManager i() {
        CookieManager cookieManager = this.f38284i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.f38284i = cookieManager2;
        return cookieManager2;
    }

    public final ax a() {
        return this.f38279c;
    }
}
