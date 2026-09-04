package com.huawei.secure.android.common.ssl;

import android.content.Context;
import android.text.TextUtils;
import android.webkit.SslErrorHandler;
import com.huawei.secure.android.common.ssl.hostname.StrictHostnameVerifier;
import com.huawei.secure.android.common.ssl.util.d;
import java.io.IOException;
import java.io.Reader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.e;
import okhttp3.f;
import okhttp3.z;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.X509HostnameVerifier;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
import org.apache.http.params.BasicHttpParams;
import org.apache.http.params.HttpConnectionParams;

/* JADX INFO: loaded from: classes7.dex */
public class WebViewSSLCheckThread extends Thread {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f62993i = WebViewSSLCheckThread.class.getSimpleName();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private SSLSocketFactory f62994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HostnameVerifier f62995b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.apache.http.conn.ssl.SSLSocketFactory f62996c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private X509HostnameVerifier f62997d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private SslErrorHandler f62998e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f62999f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Callback f63000g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Context f63001h;

    public interface Callback {
        void onCancel(Context context, String str);

        void onProceed(Context context, String str);
    }

    public static final class a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Callback f63002a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f63003b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f63004c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ SslErrorHandler f63005d;

        a(Callback callback, Context context, String str, SslErrorHandler sslErrorHandler) {
            this.f63002a = callback;
            this.f63003b = context;
            this.f63004c = str;
            this.f63005d = sslErrorHandler;
        }

        @Override // okhttp3.f
        public void onFailure(e eVar, IOException iOException) {
            com.huawei.secure.android.common.ssl.util.e.b(WebViewSSLCheckThread.f62993i, "onFailure , IO Exception : " + iOException.getMessage());
            Callback callback = this.f63002a;
            if (callback != null) {
                callback.onCancel(this.f63003b, this.f63004c);
            } else {
                this.f63005d.cancel();
            }
        }

        @Override // okhttp3.f
        public void onResponse(e eVar, c0 c0Var) throws IOException {
            com.huawei.secure.android.common.ssl.util.e.b(WebViewSSLCheckThread.f62993i, "onResponse . proceed");
            Callback callback = this.f63002a;
            if (callback != null) {
                callback.onProceed(this.f63003b, this.f63004c);
            } else {
                this.f63005d.proceed();
            }
        }
    }

    public WebViewSSLCheckThread() {
    }

    public WebViewSSLCheckThread(SslErrorHandler sslErrorHandler, String str, Context context) throws IllegalAccessException, NoSuchAlgorithmException, IOException, CertificateException, KeyManagementException, KeyStoreException {
        setSslErrorHandler(sslErrorHandler);
        setUrl(str);
        setContext(context);
        setSslSocketFactory(new SecureSSLSocketFactoryNew(new c(context)));
        setHostnameVerifier(new StrictHostnameVerifier());
        try {
            setApacheSSLSocketFactory(new SecureApacheSSLSocketFactory(null, new c(context)));
        } catch (UnrecoverableKeyException e10) {
            com.huawei.secure.android.common.ssl.util.e.b(f62993i, "WebViewSSLCheckThread: UnrecoverableKeyException : " + e10.getMessage());
        }
        setApacheHostnameVerifier(SecureApacheSSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
    }

    @Deprecated
    public WebViewSSLCheckThread(SslErrorHandler sslErrorHandler, String str, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier) {
        setSslErrorHandler(sslErrorHandler);
        setUrl(str);
        setSslSocketFactory(sSLSocketFactory);
        setHostnameVerifier(hostnameVerifier);
    }

    @Deprecated
    public WebViewSSLCheckThread(SslErrorHandler sslErrorHandler, String str, org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier) {
        setSslErrorHandler(sslErrorHandler);
        setUrl(str);
        setApacheSSLSocketFactory(sSLSocketFactory);
        setApacheHostnameVerifier(x509HostnameVerifier);
    }

    @Deprecated
    public WebViewSSLCheckThread(SslErrorHandler sslErrorHandler, String str, org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory, X509HostnameVerifier x509HostnameVerifier, Callback callback, Context context) {
        this.f62998e = sslErrorHandler;
        this.f62999f = str;
        this.f62996c = sSLSocketFactory;
        this.f62997d = x509HostnameVerifier;
        this.f63000g = callback;
        this.f63001h = context;
    }

    private void b() {
        String str = f62993i;
        com.huawei.secure.android.common.ssl.util.e.c(str, "callbackCancel: ");
        Callback callback = this.f63000g;
        if (callback != null) {
            callback.onCancel(this.f63001h, this.f62999f);
        } else if (this.f62998e != null) {
            com.huawei.secure.android.common.ssl.util.e.c(str, "callbackCancel 2: ");
            this.f62998e.cancel();
        }
    }

    private void c() {
        com.huawei.secure.android.common.ssl.util.e.c(f62993i, "callbackProceed: ");
        Callback callback = this.f63000g;
        if (callback != null) {
            callback.onProceed(this.f63001h, this.f62999f);
            return;
        }
        SslErrorHandler sslErrorHandler = this.f62998e;
        if (sslErrorHandler != null) {
            sslErrorHandler.proceed();
        }
    }

    public static void checkServerCertificateWithOK(SslErrorHandler sslErrorHandler, String str, Context context) {
        checkServerCertificateWithOK(sslErrorHandler, str, context, null);
    }

    public static void checkServerCertificateWithOK(SslErrorHandler sslErrorHandler, String str, Context context, Callback callback) {
        if (sslErrorHandler == null || TextUtils.isEmpty(str) || context == null) {
            com.huawei.secure.android.common.ssl.util.e.b(f62993i, "checkServerCertificateWithOK: handler or url or context is null");
            return;
        }
        z.a aVar = new z.a();
        try {
            SecureSSLSocketFactoryNew secureSSLSocketFactoryNew = new SecureSSLSocketFactoryNew(new c(context));
            secureSSLSocketFactoryNew.setContext(context);
            aVar.Q0(secureSSLSocketFactoryNew, new c(context));
            aVar.Z(new StrictHostnameVerifier());
            aVar.f().a(new a0.a().B(str).b()).enqueue(new a(callback, context, str, sslErrorHandler));
        } catch (Exception e10) {
            com.huawei.secure.android.common.ssl.util.e.b(f62993i, "checkServerCertificateWithOK: exception : " + e10.getMessage());
            sslErrorHandler.cancel();
        }
    }

    public X509HostnameVerifier getApacheHostnameVerifier() {
        return this.f62997d;
    }

    public org.apache.http.conn.ssl.SSLSocketFactory getApacheSSLSocketFactory() {
        return this.f62996c;
    }

    public Callback getCallback() {
        return this.f63000g;
    }

    public Context getContext() {
        return this.f63001h;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.f62995b;
    }

    public SslErrorHandler getSslErrorHandler() {
        return this.f62998e;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.f62994a;
    }

    public String getUrl() {
        return this.f62999f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [javax.net.ssl.HostnameVerifier] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r0v5 */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() throws Throwable {
        Exception e10;
        HttpsURLConnection httpsURLConnection;
        super.run();
        HttpsURLConnection httpsURLConnection2 = null;
        if (this.f62996c != null && this.f62997d != null) {
            if (this.f62998e != null) {
                try {
                    if (!TextUtils.isEmpty(this.f62999f)) {
                        try {
                            this.f62996c.setHostnameVerifier(this.f62997d);
                            org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory = this.f62996c;
                            if (sSLSocketFactory instanceof SecureApacheSSLSocketFactory) {
                                ((SecureApacheSSLSocketFactory) sSLSocketFactory).setContext(this.f63001h);
                            }
                            BasicHttpParams basicHttpParams = new BasicHttpParams();
                            HttpConnectionParams.setConnectionTimeout(basicHttpParams, 30000);
                            HttpConnectionParams.setSoTimeout(basicHttpParams, 30000);
                            SchemeRegistry schemeRegistry = new SchemeRegistry();
                            schemeRegistry.register(new Scheme("https", this.f62996c, 443));
                            schemeRegistry.register(new Scheme("http", PlainSocketFactory.getSocketFactory(), 80));
                            DefaultHttpClient defaultHttpClient = new DefaultHttpClient(new ThreadSafeClientConnManager(basicHttpParams, schemeRegistry), basicHttpParams);
                            HttpGet httpGet = new HttpGet();
                            httpGet.setURI(new URI(this.f62999f));
                            HttpResponse httpResponseExecute = defaultHttpClient.execute(httpGet);
                            com.huawei.secure.android.common.ssl.util.e.c(f62993i, "status code is : " + httpResponseExecute.getStatusLine().getStatusCode());
                            d.a((Reader) null);
                            c();
                            return;
                        } catch (Exception e11) {
                            com.huawei.secure.android.common.ssl.util.e.b(f62993i, "run: exception : " + e11.getMessage());
                            b();
                            d.a((Reader) null);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    d.a((Reader) null);
                    throw th2;
                }
            }
            com.huawei.secure.android.common.ssl.util.e.b(f62993i, "sslErrorHandler or url is null");
            b();
            return;
        }
        if (this.f62994a != null) {
            ?? r10 = this.f62995b;
            try {
                if (r10 != 0) {
                    try {
                        URLConnection uRLConnectionOpenConnection = new URL(this.f62999f).openConnection();
                        if (uRLConnectionOpenConnection instanceof HttpsURLConnection) {
                            httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                            try {
                                httpsURLConnection.setSSLSocketFactory(this.f62994a);
                                httpsURLConnection.setHostnameVerifier(this.f62995b);
                                httpsURLConnection.setRequestMethod("GET");
                                httpsURLConnection.setConnectTimeout(10000);
                                httpsURLConnection.setReadTimeout(20000);
                                httpsURLConnection.connect();
                                httpsURLConnection2 = httpsURLConnection;
                            } catch (Exception e12) {
                                e10 = e12;
                                com.huawei.secure.android.common.ssl.util.e.b(f62993i, "exception : " + e10.getMessage());
                                b();
                                if (httpsURLConnection != null) {
                                    httpsURLConnection.disconnect();
                                    return;
                                }
                                return;
                            }
                        }
                        if (httpsURLConnection2 != null) {
                            httpsURLConnection2.disconnect();
                        }
                        c();
                        return;
                    } catch (Exception e13) {
                        e10 = e13;
                        httpsURLConnection = null;
                    } catch (Throwable th3) {
                        th = th3;
                        r10 = 0;
                        if (r10 != 0) {
                            r10.disconnect();
                        }
                        throw th;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        b();
    }

    public void setApacheHostnameVerifier(X509HostnameVerifier x509HostnameVerifier) {
        this.f62997d = x509HostnameVerifier;
    }

    public void setApacheSSLSocketFactory(org.apache.http.conn.ssl.SSLSocketFactory sSLSocketFactory) {
        this.f62996c = sSLSocketFactory;
    }

    public void setCallback(Callback callback) {
        this.f63000g = callback;
    }

    public void setContext(Context context) {
        this.f63001h = context;
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.f62995b = hostnameVerifier;
    }

    public void setSslErrorHandler(SslErrorHandler sslErrorHandler) {
        this.f62998e = sslErrorHandler;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.f62994a = sSLSocketFactory;
    }

    public void setUrl(String str) {
        this.f62999f = str;
    }
}
