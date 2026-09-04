package com.umeng.socialize.tracker.utils;

import android.text.TextUtils;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.SecureRandom;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLHandshakeException;
import org.apache.http.conn.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: HttpClient.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f106386a = "HttpClient";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f106387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private a f106388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<String, String> f106389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private HttpRequestListener f106390e;

    /* JADX INFO: compiled from: HttpClient.java */
    public enum a {
        POST,
        GET
    }

    public b(String str, a aVar, Map<String, String> map, HttpRequestListener httpRequestListener) {
        this.f106387b = str;
        this.f106388c = aVar;
        this.f106389d = map;
        this.f106390e = httpRequestListener;
    }

    /* JADX WARN: Not initialized variable reg: 1, insn: 0x01cb: IF  (r1 I:??[int, boolean, OBJECT, ARRAY, byte, short, char]) == (0 ??[int, boolean, OBJECT, ARRAY, byte, short, char])  -> B:84:0x01d0, block:B:82:0x01cb */
    public String a(int i10, String str) {
        HttpsURLConnection httpsURLConnection;
        HttpURLConnection httpURLConnection;
        try {
            try {
                httpsURLConnection = (HttpsURLConnection) new URL(this.f106387b).openConnection();
                try {
                    httpsURLConnection.setHostnameVerifier(SSLSocketFactory.STRICT_HOSTNAME_VERIFIER);
                    SSLContext sSLContext = SSLContext.getInstance("TLS");
                    sSLContext.init(null, null, new SecureRandom());
                    httpsURLConnection.setSSLSocketFactory(sSLContext.getSocketFactory());
                    Map<String, String> map = this.f106389d;
                    if (map != null && !map.isEmpty()) {
                        for (String str2 : this.f106389d.keySet()) {
                            if (!TextUtils.isEmpty(str2)) {
                                httpsURLConnection.setRequestProperty(str2, this.f106389d.get(str2));
                            }
                        }
                    }
                    httpsURLConnection.setConnectTimeout(i10);
                    httpsURLConnection.setReadTimeout(i10);
                    if (this.f106388c == a.POST) {
                        httpsURLConnection.setRequestMethod("POST");
                    } else {
                        httpsURLConnection.setRequestMethod("GET");
                    }
                    httpsURLConnection.setDoOutput(true);
                    httpsURLConnection.setDoInput(true);
                    httpsURLConnection.setDefaultUseCaches(false);
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpsURLConnection.getOutputStream());
                    outputStreamWriter.write(str);
                    outputStreamWriter.flush();
                    outputStreamWriter.close();
                    HttpRequestListener httpRequestListener = this.f106390e;
                    if (httpRequestListener != null) {
                        httpRequestListener.a();
                    }
                    httpsURLConnection.connect();
                    if (httpsURLConnection.getResponseCode() != 200) {
                        if (this.f106390e != null) {
                            this.f106390e.a(new Throwable(com.umeng.socialize.tracker.utils.a.HttpError.a() + "Http Response Code:" + httpsURLConnection.getResponseCode()));
                        }
                        httpsURLConnection.disconnect();
                        return null;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection.getInputStream(), "utf-8"));
                    StringBuffer stringBuffer = new StringBuffer();
                    while (true) {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        stringBuffer.append(line);
                    }
                    String string = stringBuffer.toString();
                    bufferedReader.close();
                    HttpRequestListener httpRequestListener2 = this.f106390e;
                    if (httpRequestListener2 != null) {
                        httpRequestListener2.a(string);
                    }
                    httpsURLConnection.disconnect();
                    return string;
                } catch (MalformedURLException unused) {
                    if (httpsURLConnection != null) {
                    }
                    return null;
                } catch (SocketTimeoutException e10) {
                    e = e10;
                    if (this.f106390e != null) {
                        this.f106390e.a(new Throwable(com.umeng.socialize.tracker.utils.a.Timeout.a() + e.getMessage()));
                    }
                    if (httpsURLConnection != null) {
                    }
                    return null;
                } catch (UnknownHostException e11) {
                    e = e11;
                    if (this.f106390e != null) {
                        this.f106390e.a(new Throwable(com.umeng.socialize.tracker.utils.a.UnKnownHostException.a() + e.getMessage()));
                    }
                    if (httpsURLConnection != null) {
                    }
                    return null;
                } catch (SSLHandshakeException e12) {
                    e = e12;
                    if (this.f106390e != null) {
                        this.f106390e.a(new Throwable(com.umeng.socialize.tracker.utils.a.SSLException.a() + e.getMessage()));
                    }
                    if (httpsURLConnection != null) {
                    }
                    return null;
                } catch (IOException e13) {
                    e = e13;
                    if (this.f106390e != null) {
                        this.f106390e.a(new Throwable(com.umeng.socialize.tracker.utils.a.IOException.a() + e.getMessage()));
                    }
                    if (httpsURLConnection != null) {
                    }
                    return null;
                } catch (Throwable th2) {
                    th = th2;
                    HttpRequestListener httpRequestListener3 = this.f106390e;
                    if (httpRequestListener3 != null) {
                        httpRequestListener3.a(th);
                    }
                    if (httpsURLConnection != null) {
                    }
                    return null;
                }
            } catch (Throwable th3) {
                if (httpURLConnection != null) {
                    httpURLConnection.disconnect();
                }
                throw th3;
            }
        } catch (MalformedURLException unused2) {
            httpsURLConnection = null;
        } catch (SocketTimeoutException e14) {
            e = e14;
            httpsURLConnection = null;
        } catch (UnknownHostException e15) {
            e = e15;
            httpsURLConnection = null;
        } catch (SSLHandshakeException e16) {
            e = e16;
            httpsURLConnection = null;
        } catch (IOException e17) {
            e = e17;
            httpsURLConnection = null;
        } catch (Throwable th4) {
            th = th4;
            httpsURLConnection = null;
        }
    }
}
