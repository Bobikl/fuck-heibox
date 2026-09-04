package com.alipay.zoloz.android.phone.mrpc.core;

import android.content.ContentResolver;
import android.content.Context;
import android.net.SSLSessionCache;
import android.os.Looper;
import android.util.Base64;
import android.util.Log;
import com.tencent.qcloud.core.http.HttpConstants;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.security.Security;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
import org.apache.http.client.HttpRequestRetryHandler;
import org.apache.http.client.RedirectHandler;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.client.params.HttpClientParams;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.ConnectionKeepAliveStrategy;
import org.apache.http.conn.params.ConnManagerParams;
import org.apache.http.conn.params.ConnPerRouteBean;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.impl.client.RequestWrapper;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;
import org.apache.http.params.HttpParams;
import org.apache.http.params.HttpProtocolParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.BasicHttpProcessor;
import org.apache.http.protocol.HttpContext;

/* JADX INFO: compiled from: AndroidHttpClient.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements HttpClient {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static long f39618d = 160;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f39619e = 5000;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f39620f = 15000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f39621g = 60000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f39622h = 50;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f39623i = "AndroidHttpClient";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String[] f39624j = {"text/", "application/xml", HttpConstants.ContentType.JSON};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final HttpRequestInterceptor f39625k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HttpClient f39626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private RuntimeException f39627b = new IllegalStateException("AndroidHttpClient created and never closed");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile e f39628c;

    /* JADX INFO: compiled from: AndroidHttpClient.java */
    public static final class a implements HttpRequestInterceptor {
        a() {
        }

        @Override // org.apache.http.HttpRequestInterceptor
        public void process(HttpRequest httpRequest, HttpContext httpContext) {
            if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
                throw new RuntimeException("This thread forbids HTTP requests");
            }
        }
    }

    /* JADX INFO: renamed from: com.alipay.zoloz.android.phone.mrpc.core.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AndroidHttpClient.java */
    public class C0303b extends DefaultHttpClient {

        /* JADX INFO: renamed from: com.alipay.zoloz.android.phone.mrpc.core.b$b$a */
        /* JADX INFO: compiled from: AndroidHttpClient.java */
        public class a extends DefaultRedirectHandler {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f39630a;

            a() {
            }

            @Override // org.apache.http.impl.client.DefaultRedirectHandler, org.apache.http.client.RedirectHandler
            public boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
                int statusCode;
                this.f39630a++;
                boolean zIsRedirectRequested = super.isRedirectRequested(httpResponse, httpContext);
                if (zIsRedirectRequested || this.f39630a >= 5 || !((statusCode = httpResponse.getStatusLine().getStatusCode()) == 301 || statusCode == 302)) {
                    return zIsRedirectRequested;
                }
                return true;
            }
        }

        /* JADX INFO: renamed from: com.alipay.zoloz.android.phone.mrpc.core.b$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AndroidHttpClient.java */
        public class C0304b implements ConnectionKeepAliveStrategy {
            C0304b() {
            }

            @Override // org.apache.http.conn.ConnectionKeepAliveStrategy
            public long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
                return 180000L;
            }
        }

        C0303b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
            super(clientConnectionManager, httpParams);
        }

        @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
        protected ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
            return new C0304b();
        }

        @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
        protected HttpContext createHttpContext() {
            BasicHttpContext basicHttpContext = new BasicHttpContext();
            basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
            basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
            basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
            return basicHttpContext;
        }

        @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
        protected BasicHttpProcessor createHttpProcessor() {
            BasicHttpProcessor basicHttpProcessorCreateHttpProcessor = super.createHttpProcessor();
            basicHttpProcessorCreateHttpProcessor.addRequestInterceptor(b.f39625k);
            basicHttpProcessorCreateHttpProcessor.addRequestInterceptor(new d(b.this, null));
            return basicHttpProcessorCreateHttpProcessor;
        }

        @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
        protected RedirectHandler createRedirectHandler() {
            return new a();
        }
    }

    /* JADX INFO: compiled from: AndroidHttpClient.java */
    public static final class c implements HostnameVerifier {
        c() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return str.endsWith(".alipay.com");
        }
    }

    /* JADX INFO: compiled from: AndroidHttpClient.java */
    public class d implements HttpRequestInterceptor {
        private d() {
        }

        /* synthetic */ d(b bVar, a aVar) {
            this();
        }

        @Override // org.apache.http.HttpRequestInterceptor
        public void process(HttpRequest httpRequest, HttpContext httpContext) throws IOException {
            e eVar = b.this.f39628c;
            if (eVar != null && eVar.c() && (httpRequest instanceof HttpUriRequest)) {
                eVar.d(b.s((HttpUriRequest) httpRequest, false));
            }
        }
    }

    /* JADX INFO: compiled from: AndroidHttpClient.java */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f39634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f39635b;

        private e(String str, int i10) {
            this.f39634a = str;
            this.f39635b = i10;
        }

        /* synthetic */ e(String str, int i10, a aVar) {
            this(str, i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c() {
            return Log.isLoggable(this.f39634a, this.f39635b);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(String str) {
            Log.println(this.f39635b, this.f39634a, str);
        }
    }

    private b(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f39626a = new C0303b(clientConnectionManager, httpParams);
    }

    public static AbstractHttpEntity g(byte[] bArr, ContentResolver contentResolver) throws IOException {
        Log.i("RPC_PERF", "gzip...");
        if (bArr.length < h(contentResolver)) {
            return new ByteArrayEntity(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding("gzip");
        Log.i("RPC_PERF", "gzip size:" + bArr.length + "->" + byteArrayEntity.getContentLength());
        return byteArrayEntity;
    }

    public static long h(ContentResolver contentResolver) {
        return f39618d;
    }

    private static SSLSocketFactory i(Context context) {
        Class[] clsArr = {Integer.TYPE, SSLSessionCache.class};
        Object[] objArr = new Object[2];
        objArr[0] = Integer.valueOf(f39620f);
        objArr[1] = context == null ? null : new SSLSessionCache(context);
        return (SSLSocketFactory) com.alipay.zoloz.mobile.common.rpc.a.f("android.net.SSLCertificateSocketFactory", "getHttpSocketFactory", clsArr, objArr);
    }

    public static InputStream j(HttpEntity httpEntity) throws IOException {
        Header contentEncoding;
        String value;
        InputStream content = httpEntity.getContent();
        return (content == null || (contentEncoding = httpEntity.getContentEncoding()) == null || (value = contentEncoding.getValue()) == null || !value.contains("gzip")) ? content : new GZIPInputStream(content);
    }

    private static boolean k(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders(f.f39663p);
        if (headers != null) {
            for (Header header : headers) {
                if ("gzip".equalsIgnoreCase(header.getValue())) {
                    return true;
                }
            }
        }
        Header[] headers2 = httpUriRequest.getHeaders("content-type");
        if (headers2 != null) {
            for (Header header2 : headers2) {
                for (String str : f39624j) {
                    if (header2.getValue().startsWith(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static void l(HttpRequest httpRequest) {
        httpRequest.addHeader("Accept-Encoding", "gzip");
    }

    public static void m(HttpRequest httpRequest) {
        httpRequest.addHeader("Connection", com.google.common.net.c.f58866u0);
    }

    public static b n(String str) {
        return o(str, null);
    }

    public static b o(String str, Context context) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 5000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, f39620f);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", i(context), 443));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, 60000L);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", String.valueOf(-1));
        q();
        return new b(threadSafeClientConnManager, basicHttpParams);
    }

    public static long p(String str) {
        return h.e(str);
    }

    private static void q() {
        HttpsURLConnection.setDefaultHostnameVerifier(new c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String s(HttpUriRequest httpUriRequest, boolean z10) throws IOException {
        HttpEntity entity;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (z10 || (!header.getName().equals("Authorization") && !header.getName().equals("Cookie"))) {
                sb2.append("--header \"");
                sb2.append(header.toString().trim());
                sb2.append("\" ");
            }
        }
        URI uri = httpUriRequest.getURI();
        if (httpUriRequest instanceof RequestWrapper) {
            HttpRequest original = ((RequestWrapper) httpUriRequest).getOriginal();
            if (original instanceof HttpUriRequest) {
                uri = ((HttpUriRequest) original).getURI();
            }
        }
        sb2.append("\"");
        sb2.append(uri);
        sb2.append("\"");
        if ((httpUriRequest instanceof HttpEntityEnclosingRequest) && (entity = ((HttpEntityEnclosingRequest) httpUriRequest).getEntity()) != null && entity.isRepeatable()) {
            if (entity.getContentLength() < 1024) {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                entity.writeTo(byteArrayOutputStream);
                if (k(httpUriRequest)) {
                    sb2.insert(0, "echo '" + Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2) + "' | base64 -d > /tmp/$$.bin; ");
                    sb2.append(" --data-binary @/tmp/$$.bin");
                } else {
                    String string = byteArrayOutputStream.toString();
                    sb2.append(" --data-ascii \"");
                    sb2.append(string);
                    sb2.append("\"");
                }
            } else {
                sb2.append(" [TOO MUCH DATA TO INCLUDE]");
            }
        }
        return sb2.toString();
    }

    public void d() {
        if (this.f39627b != null) {
            getConnectionManager().shutdown();
            this.f39627b = null;
        }
    }

    public void e() {
        this.f39628c = null;
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) this.f39626a.execute(httpHost, httpRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) this.f39626a.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) throws IOException {
        return (T) this.f39626a.execute(httpUriRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) throws IOException {
        return (T) this.f39626a.execute(httpUriRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) throws IOException {
        return this.f39626a.execute(httpHost, httpRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) throws IOException {
        return this.f39626a.execute(httpHost, httpRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest) throws IOException {
        return this.f39626a.execute(httpUriRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) throws IOException {
        return this.f39626a.execute(httpUriRequest, httpContext);
    }

    public void f(String str, int i10) {
        if (str == null) {
            throw new NullPointerException("name");
        }
        if (i10 < 2 || i10 > 7) {
            throw new IllegalArgumentException("Level is out of range [2src/main7]");
        }
        this.f39628c = new e(str, i10, null);
    }

    @Override // org.apache.http.client.HttpClient
    public ClientConnectionManager getConnectionManager() {
        return this.f39626a.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public HttpParams getParams() {
        return this.f39626a.getParams();
    }

    public void r(HttpRequestRetryHandler httpRequestRetryHandler) {
        ((DefaultHttpClient) this.f39626a).setHttpRequestRetryHandler(httpRequestRetryHandler);
    }
}
