package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.secure.android.common.ssl.SecureSSLSocketFactory;
import com.huawei.secure.android.common.util.IOUtil;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.security.KeyManagementException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: compiled from: HttpClient.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class g {

    /* JADX INFO: compiled from: HttpClient.java */
    public enum a {
        GET("GET"),
        POST("POST");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f61152a;

        a(String str) {
            this.f61152a = str;
        }

        public String a() {
            return this.f61152a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v24 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v27 */
    /* JADX WARN: Type inference failed for: r10v3 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r7v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17, types: [java.net.HttpURLConnection, java.net.URLConnection, javax.net.ssl.HttpsURLConnection] */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v21 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v16, types: [java.io.BufferedOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v14 */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v31 */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v33 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9 */
    public static String a(Context context, String str, String str2, Map<String, String> map) throws Throwable {
        ?? r10;
        ?? errorStream;
        ?? r11;
        ?? A;
        Throwable th2;
        ?? bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        ?? r12 = 0;
         = 0;
        ?? r13 = 0;
        r12 = 0;
        if (str2 == 0 || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return null;
        }
        int responseCode = -1;
        try {
            try {
                A = a((Context) context, (String) str, (Map<String, String>) map, a.POST.a());
                if (A == 0) {
                    IOUtil.closeSecure((OutputStream) null);
                    IOUtil.closeSecure((InputStream) null);
                    IOUtil.closeSecure((InputStream) null);
                    p.a((HttpsURLConnection) A);
                    HMSLog.i("PushHttpsClient", "close connection");
                    return null;
                }
                try {
                    bufferedOutputStream = new BufferedOutputStream(A.getOutputStream());
                    try {
                        bufferedOutputStream.write(str2.getBytes("UTF-8"));
                        bufferedOutputStream.flush();
                        responseCode = A.getResponseCode();
                        HMSLog.d("PushHttpsClient", "https post response code: " + responseCode);
                        errorStream = responseCode >= 400 ? A.getErrorStream() : A.getInputStream();
                        try {
                            bufferedInputStream = new BufferedInputStream(errorStream);
                            try {
                                String strA = p.a((InputStream) bufferedInputStream);
                                IOUtil.closeSecure((OutputStream) bufferedOutputStream);
                                IOUtil.closeSecure((InputStream) errorStream);
                                IOUtil.closeSecure((InputStream) bufferedInputStream);
                                p.a((HttpsURLConnection) A);
                                HMSLog.i("PushHttpsClient", "close connection");
                                return strA;
                            } catch (IOException unused) {
                                HMSLog.w("PushHttpsClient", "https execute encounter IOException - http code:" + responseCode);
                                context = A;
                                str = bufferedOutputStream;
                                str2 = errorStream;
                                map = bufferedInputStream;
                                IOUtil.closeSecure((OutputStream) str);
                                IOUtil.closeSecure((InputStream) str2);
                                IOUtil.closeSecure((InputStream) map);
                                p.a((HttpsURLConnection) context);
                                HMSLog.i("PushHttpsClient", "close connection");
                                return null;
                            } catch (RuntimeException unused2) {
                                HMSLog.w("PushHttpsClient", "https execute encounter RuntimeException - http code:" + responseCode);
                                context = A;
                                str = bufferedOutputStream;
                                str2 = errorStream;
                                map = bufferedInputStream;
                                IOUtil.closeSecure((OutputStream) str);
                                IOUtil.closeSecure((InputStream) str2);
                                IOUtil.closeSecure((InputStream) map);
                                p.a((HttpsURLConnection) context);
                                HMSLog.i("PushHttpsClient", "close connection");
                                return null;
                            } catch (Exception unused3) {
                                HMSLog.w("PushHttpsClient", "https execute encounter unknown exception - http code:" + responseCode);
                                context = A;
                                str = bufferedOutputStream;
                                str2 = errorStream;
                                map = bufferedInputStream;
                                IOUtil.closeSecure((OutputStream) str);
                                IOUtil.closeSecure((InputStream) str2);
                                IOUtil.closeSecure((InputStream) map);
                                p.a((HttpsURLConnection) context);
                                HMSLog.i("PushHttpsClient", "close connection");
                                return null;
                            } catch (Throwable th3) {
                                r13 = bufferedInputStream;
                                th2 = th3;
                                IOUtil.closeSecure((OutputStream) bufferedOutputStream);
                                IOUtil.closeSecure((InputStream) errorStream);
                                IOUtil.closeSecure((InputStream) r13);
                                p.a((HttpsURLConnection) A);
                                HMSLog.i("PushHttpsClient", "close connection");
                                throw th2;
                            }
                        } catch (IOException unused4) {
                            bufferedInputStream = null;
                            HMSLog.w("PushHttpsClient", "https execute encounter IOException - http code:" + responseCode);
                            context = A;
                            str = bufferedOutputStream;
                            str2 = errorStream;
                            map = bufferedInputStream;
                            IOUtil.closeSecure((OutputStream) str);
                            IOUtil.closeSecure((InputStream) str2);
                            IOUtil.closeSecure((InputStream) map);
                            p.a((HttpsURLConnection) context);
                            HMSLog.i("PushHttpsClient", "close connection");
                            return null;
                        } catch (RuntimeException unused5) {
                            bufferedInputStream = null;
                            HMSLog.w("PushHttpsClient", "https execute encounter RuntimeException - http code:" + responseCode);
                            context = A;
                            str = bufferedOutputStream;
                            str2 = errorStream;
                            map = bufferedInputStream;
                            IOUtil.closeSecure((OutputStream) str);
                            IOUtil.closeSecure((InputStream) str2);
                            IOUtil.closeSecure((InputStream) map);
                            p.a((HttpsURLConnection) context);
                            HMSLog.i("PushHttpsClient", "close connection");
                            return null;
                        } catch (Exception unused6) {
                            bufferedInputStream = null;
                            HMSLog.w("PushHttpsClient", "https execute encounter unknown exception - http code:" + responseCode);
                            context = A;
                            str = bufferedOutputStream;
                            str2 = errorStream;
                            map = bufferedInputStream;
                            IOUtil.closeSecure((OutputStream) str);
                            IOUtil.closeSecure((InputStream) str2);
                            IOUtil.closeSecure((InputStream) map);
                            p.a((HttpsURLConnection) context);
                            HMSLog.i("PushHttpsClient", "close connection");
                            return null;
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    } catch (IOException unused7) {
                        errorStream = 0;
                    } catch (RuntimeException unused8) {
                        errorStream = 0;
                    } catch (Exception unused9) {
                        errorStream = 0;
                    } catch (Throwable th5) {
                        th2 = th5;
                        errorStream = 0;
                    }
                } catch (IOException unused10) {
                    bufferedOutputStream = 0;
                    errorStream = 0;
                    bufferedInputStream = null;
                    HMSLog.w("PushHttpsClient", "https execute encounter IOException - http code:" + responseCode);
                    context = A;
                    str = bufferedOutputStream;
                    str2 = errorStream;
                    map = bufferedInputStream;
                    IOUtil.closeSecure((OutputStream) str);
                    IOUtil.closeSecure((InputStream) str2);
                    IOUtil.closeSecure((InputStream) map);
                    p.a((HttpsURLConnection) context);
                    HMSLog.i("PushHttpsClient", "close connection");
                    return null;
                } catch (RuntimeException unused11) {
                    bufferedOutputStream = 0;
                    errorStream = 0;
                    bufferedInputStream = null;
                    HMSLog.w("PushHttpsClient", "https execute encounter RuntimeException - http code:" + responseCode);
                    context = A;
                    str = bufferedOutputStream;
                    str2 = errorStream;
                    map = bufferedInputStream;
                    IOUtil.closeSecure((OutputStream) str);
                    IOUtil.closeSecure((InputStream) str2);
                    IOUtil.closeSecure((InputStream) map);
                    p.a((HttpsURLConnection) context);
                    HMSLog.i("PushHttpsClient", "close connection");
                    return null;
                } catch (Exception unused12) {
                    bufferedOutputStream = 0;
                    errorStream = 0;
                    bufferedInputStream = null;
                    HMSLog.w("PushHttpsClient", "https execute encounter unknown exception - http code:" + responseCode);
                    context = A;
                    str = bufferedOutputStream;
                    str2 = errorStream;
                    map = bufferedInputStream;
                    IOUtil.closeSecure((OutputStream) str);
                    IOUtil.closeSecure((InputStream) str2);
                    IOUtil.closeSecure((InputStream) map);
                    p.a((HttpsURLConnection) context);
                    HMSLog.i("PushHttpsClient", "close connection");
                    return null;
                } catch (Throwable th6) {
                    errorStream = 0;
                    r11 = 0;
                    r10 = A;
                    th = th6;
                    ?? r14 = r11;
                    th2 = th;
                    A = r10;
                    bufferedOutputStream = r12;
                    r13 = r14;
                    IOUtil.closeSecure((OutputStream) bufferedOutputStream);
                    IOUtil.closeSecure((InputStream) errorStream);
                    IOUtil.closeSecure((InputStream) r13);
                    p.a((HttpsURLConnection) A);
                    HMSLog.i("PushHttpsClient", "close connection");
                    throw th2;
                }
            } catch (Throwable th7) {
                ?? r15 = str;
                r10 = context;
                th = th7;
                r12 = r15;
                errorStream = str2;
                r11 = map;
            }
        } catch (IOException unused13) {
            A = 0;
        } catch (RuntimeException unused14) {
            A = 0;
        } catch (Exception unused15) {
            A = 0;
        } catch (Throwable th8) {
            th = th8;
            r10 = 0;
            errorStream = 0;
            r11 = 0;
        }
    }

    private static HttpsURLConnection a(Context context, String str, Map<String, String> map, String str2) throws Exception {
        URLConnection uRLConnectionOpenConnection = new URL(str).openConnection();
        if (uRLConnectionOpenConnection == null) {
            HMSLog.e("PushHttpsClient", "urlConnection is null");
            return null;
        }
        if (!(uRLConnectionOpenConnection instanceof HttpsURLConnection)) {
            HMSLog.e("PushHttpsClient", "current request is http not allow connection");
            return null;
        }
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
        try {
            SecureSSLSocketFactory secureSSLSocketFactory = SecureSSLSocketFactory.getInstance(context);
            if (secureSSLSocketFactory == null) {
                HMSLog.e("PushHttpsClient", "No ssl socket factory set.");
                return null;
            }
            httpsURLConnection.setSSLSocketFactory(secureSSLSocketFactory);
            httpsURLConnection.setHostnameVerifier(SecureSSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
            httpsURLConnection.setRequestMethod(str2);
            httpsURLConnection.setConnectTimeout(15000);
            httpsURLConnection.setReadTimeout(15000);
            httpsURLConnection.setDoOutput(true);
            httpsURLConnection.setDoInput(true);
            httpsURLConnection.setRequestProperty("Content-type", "application/json; charset=UTF-8");
            httpsURLConnection.setRequestProperty("Connection", "close");
            if (map != null && map.size() >= 1) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    String key = entry.getKey();
                    if (!TextUtils.isEmpty(key)) {
                        httpsURLConnection.setRequestProperty(key, URLEncoder.encode(entry.getValue() == null ? "" : entry.getValue(), "UTF-8"));
                    }
                }
            }
            return httpsURLConnection;
        } catch (IOException | IllegalAccessException | IllegalArgumentException | KeyManagementException | KeyStoreException | NoSuchAlgorithmException | CertificateException e10) {
            HMSLog.e("PushHttpsClient", "Failed to new TLSSocketFactory instance." + e10.getMessage());
            throw new IOException("Failed to create SSLSocketFactory.");
        }
    }
}
