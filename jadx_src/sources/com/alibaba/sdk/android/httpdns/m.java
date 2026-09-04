package com.alibaba.sdk.android.httpdns;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* JADX INFO: loaded from: classes6.dex */
public class m implements Callable<String[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static m f37968a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f37969d;

    /* JADX INFO: renamed from: d, reason: collision with other field name */
    private long f36d = 0;

    public static m a() {
        if (f37968a == null) {
            f37968a = new m();
        }
        return f37968a;
    }

    public void a(int i10) {
        this.f37969d = i10;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0160 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:50:0x0108 A[Catch: IOException -> 0x0104, all -> 0x0170, TRY_LEAVE, TryCatch #7 {, blocks: (B:3:0x0001, B:81:0x015b, B:83:0x0160, B:87:0x0168, B:90:0x016f, B:89:0x016c, B:68:0x0143, B:70:0x0148, B:74:0x0150, B:76:0x0154, B:52:0x010c, B:44:0x00fb, B:46:0x0100, B:50:0x0108), top: B:96:0x0001, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0127 A[Catch: all -> 0x0158, TRY_LEAVE, TryCatch #13 {all -> 0x0158, blocks: (B:60:0x0119, B:62:0x0127, B:63:0x012b, B:66:0x013e), top: B:103:0x0119, inners: #8 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0143 A[Catch: all -> 0x0170, TRY_ENTER, TRY_LEAVE, TryCatch #7 {, blocks: (B:3:0x0001, B:81:0x015b, B:83:0x0160, B:87:0x0168, B:90:0x016f, B:89:0x016c, B:68:0x0143, B:70:0x0148, B:74:0x0150, B:76:0x0154, B:52:0x010c, B:44:0x00fb, B:46:0x0100, B:50:0x0108), top: B:96:0x0001, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:73:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:74:0x0150 A[Catch: IOException -> 0x014c, all -> 0x0170, TRY_LEAVE, TryCatch #4 {IOException -> 0x014c, blocks: (B:70:0x0148, B:74:0x0150), top: B:94:0x0148 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x015b A[Catch: all -> 0x0170, TRY_ENTER, TRY_LEAVE, TryCatch #7 {, blocks: (B:3:0x0001, B:81:0x015b, B:83:0x0160, B:87:0x0168, B:90:0x016f, B:89:0x016c, B:68:0x0143, B:70:0x0148, B:74:0x0150, B:76:0x0154, B:52:0x010c, B:44:0x00fb, B:46:0x0100, B:50:0x0108), top: B:96:0x0001, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:87:0x0168 A[Catch: IOException -> 0x0164, all -> 0x0170, TRY_LEAVE, TryCatch #11 {IOException -> 0x0164, blocks: (B:83:0x0160, B:87:0x0168), top: B:101:0x0160, outer: #7 }] */
    /* JADX WARN: Code duplicated, block: B:94:0x0148 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.io.BufferedReader] */
    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: collision with other method in class and merged with bridge method [inline-methods] */
    public synchronized String[] call() {
        Throwable th2;
        ?? responseCode;
        Exception exc;
        int i10;
        InputStream inputStream;
        BufferedReader bufferedReader;
        this.f36d = System.currentTimeMillis();
        HttpURLConnection httpURLConnection = null;
         = 0;
        ?? r10 = 0;
        HttpURLConnection httpURLConnection2 = null;
        httpURLConnection = null;
        try {
            final String strM28d = n.a().m28d();
            if (strM28d != null) {
                i.d("StartIp call start");
                HttpURLConnection httpURLConnection3 = (HttpURLConnection) new URL(strM28d).openConnection();
                try {
                    httpURLConnection3.setConnectTimeout(15000);
                    httpURLConnection3.setReadTimeout(15000);
                    if (httpURLConnection3 instanceof HttpsURLConnection) {
                        ((HttpsURLConnection) httpURLConnection3).setHostnameVerifier(new HostnameVerifier() { // from class: com.alibaba.sdk.android.httpdns.m.1
                            @Override // javax.net.ssl.HostnameVerifier
                            public boolean verify(String str, SSLSession sSLSession) {
                                i.d("StartIp Https request, set hostnameVerifier. StartIp url：" + strM28d);
                                return HttpsURLConnection.getDefaultHostnameVerifier().verify("203.107.1.1", sSLSession);
                            }
                        });
                    }
                    responseCode = httpURLConnection3.getResponseCode();
                    r10 = 200;
                    r10 = 200;
                    try {
                        try {
                            if (responseCode != 200) {
                                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpURLConnection3.getErrorStream(), "UTF-8"));
                                StringBuilder sb2 = new StringBuilder();
                                while (true) {
                                    String line = bufferedReader2.readLine();
                                    if (line == null) {
                                        i.f("StartIp response code is " + httpURLConnection3.getResponseCode() + " expect 200. response body is " + sb2.toString());
                                        g gVar = new g(httpURLConnection3.getResponseCode(), sb2.toString());
                                        throw new h(gVar.getErrorCode(), gVar.b());
                                    }
                                    sb2.append(line);
                                }
                            } else {
                                inputStream = httpURLConnection3.getInputStream();
                                bufferedReader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                                StringBuilder sb3 = new StringBuilder();
                                while (true) {
                                    String line2 = bufferedReader.readLine();
                                    if (line2 == null) {
                                        break;
                                    }
                                    sb3.append(line2);
                                }
                                n.a().a(new o(sb3.toString()), System.currentTimeMillis() - this.f36d);
                                httpURLConnection2 = httpURLConnection3;
                            }
                        } catch (Exception e10) {
                            r10 = 0;
                            httpURLConnection = httpURLConnection3;
                            exc = e10;
                            responseCode = responseCode;
                            try {
                                i.a(exc);
                                n.a().c(exc);
                                i10 = this.f37969d;
                                if (i10 > 0) {
                                    this.f37969d = i10 - 1;
                                    try {
                                        j.a().schedule(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.m.2
                                            @Override // java.lang.Runnable
                                            public void run() {
                                                try {
                                                    if (n.f37h) {
                                                        return;
                                                    }
                                                    m.this.call();
                                                } catch (Exception e11) {
                                                    i.a(e11);
                                                }
                                            }
                                        }, 300000L, TimeUnit.MILLISECONDS);
                                    } catch (Exception e11) {
                                        i.a(e11);
                                    }
                                }
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (responseCode != 0) {
                                    try {
                                        responseCode.close();
                                        if (r10 != 0) {
                                            r10.close();
                                        }
                                    } catch (IOException e12) {
                                        e = e12;
                                        i.a(e);
                                    }
                                } else if (r10 != 0) {
                                    r10.close();
                                }
                                return new String[0];
                            } catch (Throwable th3) {
                                th2 = th3;
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                }
                                if (responseCode != 0) {
                                    try {
                                        responseCode.close();
                                    } catch (IOException e13) {
                                        i.a(e13);
                                        throw th2;
                                    }
                                }
                                if (r10 != 0) {
                                    r10.close();
                                }
                                throw th2;
                            }
                        } catch (Throwable th4) {
                            r10 = 0;
                            httpURLConnection = httpURLConnection3;
                            th2 = th4;
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                            if (responseCode != 0) {
                                responseCode.close();
                            }
                            if (r10 != 0) {
                                r10.close();
                            }
                            throw th2;
                        }
                    } catch (Exception e14) {
                        exc = e14;
                        httpURLConnection = httpURLConnection3;
                        responseCode = responseCode;
                        i.a(exc);
                        n.a().c(exc);
                        i10 = this.f37969d;
                        if (i10 > 0) {
                            this.f37969d = i10 - 1;
                            j.a().schedule(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.m.2
                                @Override // java.lang.Runnable
                                public void run() {
                                    try {
                                        if (n.f37h) {
                                            return;
                                        }
                                        m.this.call();
                                    } catch (Exception e15) {
                                        i.a(e15);
                                    }
                                }
                            }, 300000L, TimeUnit.MILLISECONDS);
                        }
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (responseCode != 0) {
                            responseCode.close();
                            if (r10 != 0) {
                                r10.close();
                            }
                        } else if (r10 != 0) {
                            r10.close();
                        }
                        return new String[0];
                    } catch (Throwable th5) {
                        th2 = th5;
                        httpURLConnection = httpURLConnection3;
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                        if (responseCode != 0) {
                            responseCode.close();
                        }
                        if (r10 != 0) {
                            r10.close();
                        }
                        throw th2;
                    }
                } catch (Exception e15) {
                    e = e15;
                    httpURLConnection = httpURLConnection3;
                    exc = e;
                    responseCode = httpURLConnection;
                    i.a(exc);
                    n.a().c(exc);
                    i10 = this.f37969d;
                    if (i10 > 0) {
                        this.f37969d = i10 - 1;
                        j.a().schedule(new Runnable() { // from class: com.alibaba.sdk.android.httpdns.m.2
                            @Override // java.lang.Runnable
                            public void run() {
                                try {
                                    if (n.f37h) {
                                        return;
                                    }
                                    m.this.call();
                                } catch (Exception e16) {
                                    i.a(e16);
                                }
                            }
                        }, 300000L, TimeUnit.MILLISECONDS);
                    }
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (responseCode != 0) {
                        responseCode.close();
                        if (r10 != 0) {
                            r10.close();
                        }
                    } else if (r10 != 0) {
                        r10.close();
                    }
                    return new String[0];
                } catch (Throwable th6) {
                    th = th6;
                    httpURLConnection = httpURLConnection3;
                    th2 = th;
                    responseCode = httpURLConnection;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    if (responseCode != 0) {
                        responseCode.close();
                    }
                    if (r10 != 0) {
                        r10.close();
                    }
                    throw th2;
                }
            } else {
                inputStream = null;
                bufferedReader = null;
            }
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                    if (bufferedReader != null) {
                        bufferedReader.close();
                    }
                } catch (IOException e16) {
                    e = e16;
                    i.a(e);
                }
            } else if (bufferedReader != null) {
                bufferedReader.close();
            }
        } catch (Exception e17) {
            e = e17;
        } catch (Throwable th7) {
            th = th7;
        }
        return new String[0];
    }
}
