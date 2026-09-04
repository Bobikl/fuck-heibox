package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
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
import org.apache.http.params.HttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: loaded from: classes6.dex */
public final class q implements Callable<u> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final HttpRequestRetryHandler f38133e = new ad();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public l f38134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f38135b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public o f38136c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f38137d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public HttpUriRequest f38138f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CookieManager f38141i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AbstractHttpEntity f38142j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public HttpHost f38143k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public URL f38144l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f38149q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public HttpContext f38139g = new BasicHttpContext();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public CookieStore f38140h = new BasicCookieStore();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f38145m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f38146n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f38147o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f38148p = null;

    public q(l lVar, o oVar) {
        this.f38134a = lVar;
        this.f38135b = lVar.f38111a;
        this.f38136c = oVar;
    }

    public static long a(String[] strArr) {
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

    public static HttpUrlHeader a(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.setHead(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    private u a(HttpResponse httpResponse, int i10, String str) throws Throwable {
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
                this.f38147o = false;
                this.f38134a.c(System.currentTimeMillis() - jCurrentTimeMillis);
                this.f38134a.a(byteArray.length);
                p pVar = new p(a(httpResponse), i10, str, byteArray);
                long jB = b(httpResponse);
                Header contentType = httpResponse.getEntity().getContentType();
                if (contentType != null) {
                    HashMap<String, String> mapA = a(contentType.getValue());
                    str3 = mapA.get("charset");
                    str2 = mapA.get("Content-Type");
                } else {
                    str2 = null;
                }
                pVar.b(str2);
                pVar.a(str3);
                pVar.a(System.currentTimeMillis());
                pVar.b(jB);
                try {
                    byteArrayOutputStream2.close();
                    return pVar;
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

    public static HashMap<String, String> a(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] strArrSplit = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
            map.put(strArrSplit[0], strArrSplit[1]);
        }
        return map;
    }

    private void a(HttpEntity httpEntity, OutputStream outputStream) throws IOException {
        InputStream inputStreamA = b.a(httpEntity);
        httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int i10 = inputStreamA.read(bArr);
                    if (i10 == -1 || this.f38136c.h()) {
                        break;
                    }
                    outputStream.write(bArr, 0, i10);
                    this.f38136c.f();
                }
                outputStream.flush();
                r.a(inputStreamA);
            } catch (Exception e10) {
                e10.getCause();
                throw new IOException("HttpWorker Request Error!" + e10.getLocalizedMessage());
            }
        } catch (Throwable th2) {
            r.a(inputStreamA);
            throw th2;
        }
    }

    public static long b(HttpResponse httpResponse) {
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
            return b.b(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    private URI b() {
        String strA = this.f38136c.a();
        String str = this.f38137d;
        if (str != null) {
            strA = str;
        }
        if (strA != null) {
            return new URI(strA);
        }
        throw new RuntimeException("url should not be null");
    }

    private HttpUriRequest c() {
        HttpUriRequest httpUriRequest = this.f38138f;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        if (this.f38142j == null) {
            byte[] bArrB = this.f38136c.b();
            String strB = this.f38136c.b("gzip");
            if (bArrB != null) {
                if (TextUtils.equals(strB, "true")) {
                    this.f38142j = b.a(bArrB);
                } else {
                    this.f38142j = new ByteArrayEntity(bArrB);
                }
                this.f38142j.setContentType(this.f38136c.c());
            }
        }
        AbstractHttpEntity abstractHttpEntity = this.f38142j;
        if (abstractHttpEntity != null) {
            HttpPost httpPost = new HttpPost(b());
            httpPost.setEntity(abstractHttpEntity);
            this.f38138f = httpPost;
        } else {
            this.f38138f = new HttpGet(b());
        }
        return this.f38138f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00d2  */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public u call() throws Throwable {
        boolean z10;
        HttpHost httpHost;
        while (true) {
            try {
                NetworkInfo[] allNetworkInfo = ((ConnectivityManager) this.f38135b.getSystemService("connectivity")).getAllNetworkInfo();
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
                ArrayList<Header> arrayListD = this.f38136c.d();
                if (arrayListD != null && !arrayListD.isEmpty()) {
                    Iterator<Header> it = arrayListD.iterator();
                    while (it.hasNext()) {
                        c().addHeader(it.next());
                    }
                }
                b.a((HttpRequest) c());
                b.b((HttpRequest) c());
                c().addHeader("cookie", i().getCookie(this.f38136c.a()));
                this.f38139g.setAttribute("http.cookie-store", this.f38140h);
                this.f38134a.a().a(f38133e);
                long jCurrentTimeMillis = System.currentTimeMillis();
                f();
                this.f38138f.getURI().toString();
                HttpParams params = this.f38134a.a().getParams();
                NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.f38135b.getSystemService("connectivity")).getActiveNetworkInfo();
                HttpHost httpHost2 = null;
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
                if (httpHost == null || !TextUtils.equals(httpHost.getHostName(), "127.0.0.1") || httpHost.getPort() != 8087) {
                    httpHost2 = httpHost;
                }
                params.setParameter("http.route.default-proxy", httpHost2);
                HttpHost httpHost3 = this.f38143k;
                if (httpHost3 == null) {
                    URL urlH = h();
                    HttpHost httpHost4 = new HttpHost(urlH.getHost(), g(), urlH.getProtocol());
                    this.f38143k = httpHost4;
                    httpHost3 = httpHost4;
                }
                if (g() == 80) {
                    httpHost3 = new HttpHost(h().getHost());
                }
                HttpResponse httpResponseExecute = this.f38134a.a().execute(httpHost3, this.f38138f, this.f38139g);
                this.f38134a.b(System.currentTimeMillis() - jCurrentTimeMillis);
                List<Cookie> cookies = this.f38140h.getCookies();
                if (this.f38136c.e()) {
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
                            i().setCookie(this.f38136c.a(), sb2.toString());
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
                u uVarA = a(httpResponseExecute, statusCode, reasonPhrase);
                if (((uVarA == null || uVarA.b() == null) ? -1L : uVarA.b().length) == -1 && (uVarA instanceof p)) {
                    try {
                        Long.parseLong(((p) uVarA).a().getHead("Content-Length"));
                    } catch (Exception unused) {
                    }
                }
                if (this.f38136c.a() != null && !TextUtils.isEmpty(f())) {
                    f();
                }
                return uVarA;
            } catch (HttpException e10) {
                e();
                if (this.f38136c.f() != null) {
                    e10.getCode();
                    e10.getMsg();
                }
                e10.toString();
                throw e10;
            } catch (NullPointerException e11) {
                e();
                int i11 = this.f38145m;
                if (i11 > 0) {
                    e11.toString();
                    throw new HttpException(0, String.valueOf(e11));
                }
                this.f38145m = i11 + 1;
            } catch (SocketTimeoutException e12) {
                e();
                if (this.f38136c.f() != null) {
                    e12.toString();
                }
                e12.toString();
                throw new HttpException(4, String.valueOf(e12));
            } catch (URISyntaxException e13) {
                throw new RuntimeException("Url parser error!", e13.getCause());
            } catch (UnknownHostException e14) {
                e();
                if (this.f38136c.f() != null) {
                    e14.toString();
                }
                e14.toString();
                throw new HttpException(9, String.valueOf(e14));
            } catch (SSLHandshakeException e15) {
                e();
                if (this.f38136c.f() != null) {
                    e15.toString();
                }
                e15.toString();
                throw new HttpException(2, String.valueOf(e15));
            } catch (SSLPeerUnverifiedException e16) {
                e();
                if (this.f38136c.f() != null) {
                    e16.toString();
                }
                e16.toString();
                throw new HttpException(2, String.valueOf(e16));
            } catch (SSLException e17) {
                e();
                if (this.f38136c.f() != null) {
                    e17.toString();
                }
                e17.toString();
                throw new HttpException(6, String.valueOf(e17));
            } catch (NoHttpResponseException e18) {
                e();
                if (this.f38136c.f() != null) {
                    e18.toString();
                }
                e18.toString();
                throw new HttpException(5, String.valueOf(e18));
            } catch (ConnectionPoolTimeoutException e19) {
                e();
                if (this.f38136c.f() != null) {
                    e19.toString();
                }
                e19.toString();
                throw new HttpException(3, String.valueOf(e19));
            } catch (ConnectTimeoutException e20) {
                e();
                if (this.f38136c.f() != null) {
                    e20.toString();
                }
                e20.toString();
                throw new HttpException(3, String.valueOf(e20));
            } catch (HttpHostConnectException e21) {
                e();
                if (this.f38136c.f() != null) {
                    e21.toString();
                }
                throw new HttpException(8, String.valueOf(e21));
            } catch (IOException e22) {
                e();
                if (this.f38136c.f() != null) {
                    e22.toString();
                }
                e22.toString();
                throw new HttpException(6, String.valueOf(e22));
            } catch (Exception e23) {
                e();
                if (this.f38136c.f() != null) {
                    e23.toString();
                }
                throw new HttpException(0, String.valueOf(e23));
            }
        }
    }

    private void e() {
        HttpUriRequest httpUriRequest = this.f38138f;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private String f() {
        if (!TextUtils.isEmpty(this.f38149q)) {
            return this.f38149q;
        }
        String strB = this.f38136c.b("operationType");
        this.f38149q = strB;
        return strB;
    }

    private int g() {
        URL urlH = h();
        return urlH.getPort() == -1 ? urlH.getDefaultPort() : urlH.getPort();
    }

    private URL h() {
        URL url = this.f38144l;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f38136c.a());
        this.f38144l = url2;
        return url2;
    }

    private CookieManager i() {
        CookieManager cookieManager = this.f38141i;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.f38141i = cookieManager2;
        return cookieManager2;
    }

    public final o a() {
        return this.f38136c;
    }
}
