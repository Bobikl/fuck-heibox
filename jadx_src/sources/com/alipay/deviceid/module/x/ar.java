package com.alipay.deviceid.module.x;

import android.net.SSLCertificateSocketFactory;
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
import javax.net.ssl.HttpsURLConnection;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpEntityEnclosingRequest;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequest;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.HttpVersion;
import org.apache.http.client.HttpClient;
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
public final class ar implements HttpClient {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static long f38230a = 160;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String[] f38231c = {"text/", "application/xml", HttpConstants.ContentType.JSON};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HttpRequestInterceptor f38232d = new HttpRequestInterceptor() { // from class: com.alipay.deviceid.module.x.ar.1
        @Override // org.apache.http.HttpRequestInterceptor
        public final void process(HttpRequest httpRequest, HttpContext httpContext) {
            if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
                throw new RuntimeException("This thread forbids HTTP requests");
            }
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final HttpClient f38233b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private RuntimeException f38234e = new IllegalStateException("AndroidHttpClient created and never closed");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile b f38235f;

    /* JADX INFO: compiled from: AndroidHttpClient.java */
    public final class a implements HttpRequestInterceptor {
        private a() {
        }

        /* synthetic */ a(ar arVar, byte b10) {
            this();
        }

        @Override // org.apache.http.HttpRequestInterceptor
        public final void process(HttpRequest httpRequest, HttpContext httpContext) throws IOException {
            b bVar = ar.this.f38235f;
            if (bVar != null && Log.isLoggable(bVar.f38241a, bVar.f38242b) && (httpRequest instanceof HttpUriRequest)) {
                Log.println(bVar.f38242b, bVar.f38241a, ar.a((HttpUriRequest) httpRequest));
            }
        }
    }

    /* JADX INFO: compiled from: AndroidHttpClient.java */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f38241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f38242b;
    }

    private ar(ClientConnectionManager clientConnectionManager, HttpParams httpParams) {
        this.f38233b = new DefaultHttpClient(clientConnectionManager, httpParams) { // from class: com.alipay.deviceid.module.x.ar.2
            @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
            protected final ConnectionKeepAliveStrategy createConnectionKeepAliveStrategy() {
                return new ConnectionKeepAliveStrategy() { // from class: com.alipay.deviceid.module.x.ar.2.2
                    @Override // org.apache.http.conn.ConnectionKeepAliveStrategy
                    public final long getKeepAliveDuration(HttpResponse httpResponse, HttpContext httpContext) {
                        return 180000L;
                    }
                };
            }

            @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
            protected final HttpContext createHttpContext() {
                BasicHttpContext basicHttpContext = new BasicHttpContext();
                basicHttpContext.setAttribute("http.authscheme-registry", getAuthSchemes());
                basicHttpContext.setAttribute("http.cookiespec-registry", getCookieSpecs());
                basicHttpContext.setAttribute("http.auth.credentials-provider", getCredentialsProvider());
                return basicHttpContext;
            }

            @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
            protected final BasicHttpProcessor createHttpProcessor() {
                BasicHttpProcessor basicHttpProcessorCreateHttpProcessor = super.createHttpProcessor();
                basicHttpProcessorCreateHttpProcessor.addRequestInterceptor(ar.f38232d);
                basicHttpProcessorCreateHttpProcessor.addRequestInterceptor(new a(ar.this, (byte) 0));
                return basicHttpProcessorCreateHttpProcessor;
            }

            @Override // org.apache.http.impl.client.DefaultHttpClient, org.apache.http.impl.client.AbstractHttpClient
            protected final RedirectHandler createRedirectHandler() {
                return new DefaultRedirectHandler() { // from class: com.alipay.deviceid.module.x.ar.2.1

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    int f38237a;

                    @Override // org.apache.http.impl.client.DefaultRedirectHandler, org.apache.http.client.RedirectHandler
                    public final boolean isRedirectRequested(HttpResponse httpResponse, HttpContext httpContext) {
                        int statusCode;
                        this.f38237a++;
                        boolean zIsRedirectRequested = super.isRedirectRequested(httpResponse, httpContext);
                        if (zIsRedirectRequested || this.f38237a >= 5 || !((statusCode = httpResponse.getStatusLine().getStatusCode()) == 301 || statusCode == 302)) {
                            return zIsRedirectRequested;
                        }
                        return true;
                    }
                };
            }
        };
    }

    public static ar a(String str) {
        BasicHttpParams basicHttpParams = new BasicHttpParams();
        HttpProtocolParams.setVersion(basicHttpParams, HttpVersion.HTTP_1_1);
        HttpProtocolParams.setUseExpectContinue(basicHttpParams, false);
        HttpConnectionParams.setStaleCheckingEnabled(basicHttpParams, true);
        HttpConnectionParams.setConnectionTimeout(basicHttpParams, 20000);
        HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
        HttpConnectionParams.setSocketBufferSize(basicHttpParams, 8192);
        HttpClientParams.setRedirecting(basicHttpParams, true);
        HttpClientParams.setAuthenticating(basicHttpParams, false);
        HttpProtocolParams.setUserAgent(basicHttpParams, str);
        SchemeRegistry schemeRegistry = new SchemeRegistry();
        schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
        schemeRegistry.register(new Scheme("https", SSLCertificateSocketFactory.getHttpSocketFactory(30000, null), 443));
        ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry);
        ConnManagerParams.setTimeout(basicHttpParams, 60000L);
        ConnManagerParams.setMaxConnectionsPerRoute(basicHttpParams, new ConnPerRouteBean(10));
        ConnManagerParams.setMaxTotalConnections(basicHttpParams, 50);
        Security.setProperty("networkaddress.cache.ttl", "-1");
        HttpsURLConnection.setDefaultHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
        return new ar(threadSafeClientConnManager, basicHttpParams);
    }

    public static InputStream a(HttpEntity httpEntity) throws IOException {
        Header contentEncoding;
        String value;
        InputStream content = httpEntity.getContent();
        return (content == null || (contentEncoding = httpEntity.getContentEncoding()) == null || (value = contentEncoding.getValue()) == null || !value.contains("gzip")) ? content : new GZIPInputStream(content);
    }

    static /* synthetic */ String a(HttpUriRequest httpUriRequest) throws IOException {
        HttpEntity entity;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("curl ");
        for (Header header : httpUriRequest.getAllHeaders()) {
            if (!header.getName().equals("Authorization") && !header.getName().equals("Cookie")) {
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
                if (b(httpUriRequest)) {
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

    public static AbstractHttpEntity a(byte[] bArr) throws IOException {
        if (bArr.length < f38230a) {
            return new ByteArrayEntity(bArr);
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
        gZIPOutputStream.write(bArr);
        gZIPOutputStream.close();
        ByteArrayEntity byteArrayEntity = new ByteArrayEntity(byteArrayOutputStream.toByteArray());
        byteArrayEntity.setContentEncoding("gzip");
        byteArrayEntity.getContentLength();
        return byteArrayEntity;
    }

    public static void a(HttpRequest httpRequest) {
        httpRequest.addHeader("Accept-Encoding", "gzip");
    }

    public static long b(String str) {
        return av.a(str);
    }

    public static void b(HttpRequest httpRequest) {
        httpRequest.addHeader("Connection", com.google.common.net.c.f58866u0);
    }

    private static boolean b(HttpUriRequest httpUriRequest) {
        Header[] headers = httpUriRequest.getHeaders(com.alipay.zoloz.android.phone.mrpc.core.f.f39663p);
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
                for (String str : f38231c) {
                    if (header2.getValue().startsWith(str)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.f38233b.execute(httpHost, httpRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpHost httpHost, HttpRequest httpRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.f38233b.execute(httpHost, httpRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler) {
        return (T) this.f38233b.execute(httpUriRequest, responseHandler);
    }

    @Override // org.apache.http.client.HttpClient
    public final <T> T execute(HttpUriRequest httpUriRequest, ResponseHandler<? extends T> responseHandler, HttpContext httpContext) {
        return (T) this.f38233b.execute(httpUriRequest, responseHandler, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest) {
        return this.f38233b.execute(httpHost, httpRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpHost httpHost, HttpRequest httpRequest, HttpContext httpContext) {
        return this.f38233b.execute(httpHost, httpRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest) {
        return this.f38233b.execute(httpUriRequest);
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpResponse execute(HttpUriRequest httpUriRequest, HttpContext httpContext) {
        return this.f38233b.execute(httpUriRequest, httpContext);
    }

    @Override // org.apache.http.client.HttpClient
    public final ClientConnectionManager getConnectionManager() {
        return this.f38233b.getConnectionManager();
    }

    @Override // org.apache.http.client.HttpClient
    public final HttpParams getParams() {
        return this.f38233b.getParams();
    }
}
