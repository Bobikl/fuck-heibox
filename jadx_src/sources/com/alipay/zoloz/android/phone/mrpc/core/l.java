package com.alipay.zoloz.android.phone.mrpc.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import com.huawei.hms.framework.common.ContainerUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
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
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: compiled from: HttpWorker.java */
/* JADX INFO: loaded from: classes6.dex */
public class l implements Callable<q> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f39731r = "HttpWorker";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final HttpRequestRetryHandler f39732s = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected i f39733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Context f39734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected j f39735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HttpUriRequest f39736e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private CookieManager f39739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private AbstractHttpEntity f39740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private HttpHost f39741j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private URL f39742k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    String f39743l;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private String f39748q;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private HttpContext f39737f = new BasicHttpContext();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private CookieStore f39738g = new BasicCookieStore();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f39744m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f39745n = false;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f39746o = false;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private String f39747p = null;

    public l(i iVar, j jVar) {
        this.f39733b = iVar;
        this.f39734c = iVar.f39709a;
        this.f39735d = jVar;
    }

    private void a() {
        HttpUriRequest httpUriRequest = this.f39736e;
        if (httpUriRequest != null) {
            httpUriRequest.abort();
        }
    }

    private void b() throws Exception {
        ArrayList<Header> arrayListI = i();
        if (arrayListI != null && !arrayListI.isEmpty()) {
            Iterator<Header> it = arrayListI.iterator();
            while (it.hasNext()) {
                l().addHeader(it.next());
            }
        }
        b.l(l());
        b.m(l());
        l().addHeader("cookie", h().getCookie(this.f39735d.l()));
    }

    private HttpResponse d() throws IOException {
        Log.d(f39731r, "By Http/Https to request. operationType=" + m() + " url=" + this.f39736e.getURI().toString());
        j().getParams().setParameter("http.route.default-proxy", p());
        HttpHost httpHostK = k();
        if (r() == 80) {
            httpHostK = new HttpHost(s().getHost());
        }
        return j().execute(httpHostK, this.f39736e, this.f39737f);
    }

    private HttpResponse e() throws Exception {
        return d();
    }

    private CookieManager h() {
        CookieManager cookieManager = this.f39739h;
        if (cookieManager != null) {
            return cookieManager;
        }
        CookieManager cookieManager2 = CookieManager.getInstance();
        this.f39739h = cookieManager2;
        return cookieManager2;
    }

    private b j() {
        return this.f39733b.j();
    }

    private HttpHost k() throws MalformedURLException {
        HttpHost httpHost = this.f39741j;
        if (httpHost != null) {
            return httpHost;
        }
        URL urlS = s();
        HttpHost httpHost2 = new HttpHost(urlS.getHost(), r(), urlS.getProtocol());
        this.f39741j = httpHost2;
        return httpHost2;
    }

    private HttpUriRequest l() throws Exception {
        HttpUriRequest httpUriRequest = this.f39736e;
        if (httpUriRequest != null) {
            return httpUriRequest;
        }
        AbstractHttpEntity abstractHttpEntityO = o();
        if (abstractHttpEntityO != null) {
            HttpPost httpPost = new HttpPost(u());
            httpPost.setEntity(abstractHttpEntityO);
            this.f39736e = httpPost;
        } else {
            this.f39736e = new HttpGet(u());
        }
        return this.f39736e;
    }

    private String m() {
        if (!TextUtils.isEmpty(this.f39748q)) {
            return this.f39748q;
        }
        String strK = this.f39735d.k("operationType");
        this.f39748q = strK;
        return strK;
    }

    private HttpHost p() {
        HttpHost httpHostD = o.d(this.f39734c);
        if (httpHostD != null && TextUtils.equals(httpHostD.getHostName(), "127.0.0.1") && httpHostD.getPort() == 8087) {
            return null;
        }
        return httpHostD;
    }

    private int r() throws MalformedURLException {
        URL urlS = s();
        return urlS.getPort() == -1 ? urlS.getDefaultPort() : urlS.getPort();
    }

    private URL s() throws MalformedURLException {
        URL url = this.f39742k;
        if (url != null) {
            return url;
        }
        URL url2 = new URL(this.f39735d.l());
        this.f39742k = url2;
        return url2;
    }

    private z t() {
        return this.f39735d.b();
    }

    protected void A(HttpEntity httpEntity, long j10, OutputStream outputStream) throws IOException {
        if (outputStream == null) {
            httpEntity.consumeContent();
            throw new IllegalArgumentException("Output stream may not be null");
        }
        InputStream inputStreamJ = b.j(httpEntity);
        long contentLength = httpEntity.getContentLength();
        try {
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int i10 = inputStreamJ.read(bArr);
                    if (i10 == -1 || this.f39735d.c()) {
                        break;
                    }
                    outputStream.write(bArr, 0, i10);
                    j10 += (long) i10;
                    if (t() != null && contentLength > 0) {
                        t().a(this.f39735d, j10 / contentLength);
                    }
                }
                outputStream.flush();
                m.b(inputStreamJ);
            } catch (Exception e10) {
                Log.w(f39731r, e10.getCause());
                throw new IOException("HttpWorker Request Error!" + e10.getLocalizedMessage());
            }
        } catch (Throwable th2) {
            m.b(inputStreamJ);
            throw th2;
        }
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public q call() throws HttpException {
        try {
            if (!o.f(this.f39734c)) {
                throw new HttpException(1, "The network is not available");
            }
            if (t() != null) {
                t().b(this.f39735d);
            }
            b();
            this.f39737f.setAttribute("http.cookie-store", this.f39738g);
            j().r(f39732s);
            long jCurrentTimeMillis = System.currentTimeMillis();
            HttpResponse httpResponseE = e();
            this.f39733b.b(System.currentTimeMillis() - jCurrentTimeMillis);
            List<Cookie> cookies = this.f39738g.getCookies();
            if (this.f39735d.m()) {
                h().removeAllCookie();
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
                        h().setCookie(this.f39735d.l(), sb2.toString());
                        CookieSyncManager.getInstance().sync();
                    }
                }
            }
            q qVarY = y(httpResponseE, this.f39735d);
            if (((qVarY == null || qVarY.b() == null) ? -1L : qVarY.b().length) == -1 && (qVarY instanceof k)) {
                try {
                    Long.parseLong(((k) qVarY).h().a("Content-Length"));
                } catch (Exception unused) {
                    Log.e(f39731r, "parse Content-Length error");
                }
            }
            if (this.f39735d.l() != null && !TextUtils.isEmpty(m())) {
                m();
            }
            return qVarY;
        } catch (HttpException e10) {
            a();
            if (t() != null) {
                t().e(this.f39735d, e10.b(), e10.c());
            }
            Log.e(i.f39702h, e10 + "");
            throw e10;
        } catch (NullPointerException e11) {
            a();
            int i10 = this.f39744m;
            if (i10 < 1) {
                this.f39744m = i10 + 1;
                return call();
            }
            Log.e(i.f39702h, e11 + "");
            throw new HttpException(0, e11 + "");
        } catch (SocketTimeoutException e12) {
            a();
            if (t() != null) {
                t().e(this.f39735d, 4, e12 + "");
            }
            Log.e(i.f39702h, e12 + "");
            throw new HttpException(4, e12 + "");
        } catch (URISyntaxException e13) {
            throw new RuntimeException("Url parser error!", e13.getCause());
        } catch (UnknownHostException e14) {
            a();
            if (t() != null) {
                t().e(this.f39735d, 9, e14 + "");
            }
            Log.e(i.f39702h, e14 + "");
            throw new HttpException(9, e14 + "");
        } catch (SSLHandshakeException e15) {
            a();
            if (t() != null) {
                t().e(this.f39735d, 2, e15 + "");
            }
            Log.e(i.f39702h, e15 + "");
            throw new HttpException(2, e15 + "");
        } catch (SSLPeerUnverifiedException e16) {
            a();
            if (t() != null) {
                t().e(this.f39735d, 2, e16 + "");
            }
            Log.e(i.f39702h, e16 + "");
            throw new HttpException(2, e16 + "");
        } catch (SSLException e17) {
            a();
            if (t() != null) {
                t().e(this.f39735d, 6, e17 + "");
            }
            Log.e(i.f39702h, e17 + "");
            throw new HttpException(6, e17 + "");
        } catch (NoHttpResponseException e18) {
            a();
            if (t() != null) {
                t().e(this.f39735d, 5, e18 + "");
            }
            Log.e(i.f39702h, e18 + "");
            throw new HttpException(5, e18 + "");
        } catch (ConnectionPoolTimeoutException e19) {
            a();
            if (t() != null) {
                t().e(this.f39735d, 3, e19 + "");
            }
            Log.e(i.f39702h, e19 + "");
            throw new HttpException(3, e19 + "");
        } catch (ConnectTimeoutException e20) {
            a();
            if (t() != null) {
                t().e(this.f39735d, 3, e20 + "");
            }
            Log.e(i.f39702h, e20 + "");
            throw new HttpException(3, e20 + "");
        } catch (HttpHostConnectException e21) {
            a();
            if (t() != null) {
                t().e(this.f39735d, 8, e21 + "");
            }
            Log.e(i.f39702h, "", e21);
            throw new HttpException(8, e21 + "");
        } catch (IOException e22) {
            a();
            if (t() != null) {
                t().e(this.f39735d, 6, e22 + "");
            }
            Log.e(i.f39702h, e22 + "");
            throw new HttpException(6, e22 + "");
        } catch (Exception e23) {
            Log.e(i.f39702h, "", e23);
            a();
            if (t() != null) {
                t().e(this.f39735d, 0, e23 + "");
            }
            throw new HttpException(0, e23 + "");
        }
    }

    protected void f(k kVar, HttpResponse httpResponse) {
        String str;
        long jN = n(httpResponse);
        Header contentType = httpResponse.getEntity().getContentType();
        String str2 = null;
        if (contentType != null) {
            HashMap<String, String> mapG = g(contentType.getValue());
            String str3 = mapG.get("charset");
            str2 = mapG.get("Content-Type");
            str = str3;
        } else {
            str = null;
        }
        kVar.c(str2);
        kVar.k(str);
        kVar.l(System.currentTimeMillis());
        kVar.n(jN);
    }

    protected HashMap<String, String> g(String str) {
        HashMap<String, String> map = new HashMap<>();
        for (String str2 : str.split(";")) {
            String[] strArrSplit = str2.indexOf(61) == -1 ? new String[]{"Content-Type", str2} : str2.split(ContainerUtils.KEY_VALUE_DELIMITER);
            map.put(strArrSplit[0], strArrSplit[1]);
        }
        return map;
    }

    protected ArrayList<Header> i() {
        return this.f39735d.h();
    }

    protected long n(HttpResponse httpResponse) {
        Header firstHeader = httpResponse.getFirstHeader("Cache-Control");
        if (firstHeader != null) {
            String[] strArrSplit = firstHeader.getValue().split(ContainerUtils.KEY_VALUE_DELIMITER);
            if (strArrSplit.length >= 2) {
                try {
                    return x(strArrSplit);
                } catch (NumberFormatException e10) {
                    Log.w(f39731r, e10);
                }
            }
        }
        Header firstHeader2 = httpResponse.getFirstHeader("Expires");
        if (firstHeader2 != null) {
            return b.p(firstHeader2.getValue()) - System.currentTimeMillis();
        }
        return 0L;
    }

    protected AbstractHttpEntity o() throws IOException {
        AbstractHttpEntity abstractHttpEntity = this.f39740i;
        if (abstractHttpEntity != null) {
            return abstractHttpEntity;
        }
        byte[] bArrJ = this.f39735d.j();
        String strK = this.f39735d.k("gzip");
        if (bArrJ != null) {
            if (TextUtils.equals(strK, "true")) {
                this.f39740i = b.g(bArrJ, null);
            } else {
                this.f39740i = new ByteArrayEntity(bArrJ);
            }
            this.f39740i.setContentType(this.f39735d.g());
        }
        return this.f39740i;
    }

    public j q() {
        return this.f39735d;
    }

    protected URI u() throws URISyntaxException {
        String strL = this.f39735d.l();
        String str = this.f39743l;
        if (str != null) {
            strL = str;
        }
        if (strL != null) {
            return new URI(strL);
        }
        throw new RuntimeException("url should not be null");
    }

    protected q v(HttpResponse httpResponse, int i10, String str) throws Throwable {
        Log.d(f39731r, "开始handle，handleResponse-1," + Thread.currentThread().getId());
        HttpEntity entity = httpResponse.getEntity();
        k kVar = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        kVar = null;
        if (entity != null && httpResponse.getStatusLine().getStatusCode() == 200) {
            Log.d(f39731r, "200，开始处理，handleResponse-2,threadid = " + Thread.currentThread().getId());
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    A(entity, 0L, byteArrayOutputStream2);
                    byte[] byteArray = byteArrayOutputStream2.toByteArray();
                    this.f39746o = false;
                    this.f39733b.d(System.currentTimeMillis() - jCurrentTimeMillis);
                    this.f39733b.c(byteArray.length);
                    Log.i(f39731r, "res:" + byteArray.length);
                    kVar = new k(w(httpResponse), i10, str, byteArray);
                    f(kVar, httpResponse);
                    try {
                        byteArrayOutputStream2.close();
                        Log.d(f39731r, "finally,handleResponse");
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
                    Log.d(f39731r, "finally,handleResponse");
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } else if (entity == null) {
            httpResponse.getStatusLine().getStatusCode();
        }
        return kVar;
    }

    protected HttpUrlHeader w(HttpResponse httpResponse) {
        HttpUrlHeader httpUrlHeader = new HttpUrlHeader();
        for (Header header : httpResponse.getAllHeaders()) {
            httpUrlHeader.c(header.getName(), header.getValue());
        }
        return httpUrlHeader;
    }

    protected long x(String[] strArr) {
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

    public q y(HttpResponse httpResponse, j jVar) throws IOException, HttpException {
        int statusCode = httpResponse.getStatusLine().getStatusCode();
        String reasonPhrase = httpResponse.getStatusLine().getReasonPhrase();
        if (statusCode == 200 || z(statusCode, reasonPhrase)) {
            return v(httpResponse, statusCode, reasonPhrase);
        }
        throw new HttpException(Integer.valueOf(httpResponse.getStatusLine().getStatusCode()), httpResponse.getStatusLine().getReasonPhrase());
    }

    protected boolean z(int i10, String str) {
        return i10 == 304;
    }
}
