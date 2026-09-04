package com.umeng.ut.a.b;

import android.content.Context;
import android.text.TextUtils;
import com.umeng.commonsdk.utils.UMUtils;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.net.URLEncoder;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static d f106418a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static e f71a;

    static {
        System.setProperty("http.keepAlive", "true");
        f71a = null;
        f106418a = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v33 */
    public static a a(String str, String str2, boolean z10) throws Throwable {
        DataOutputStream dataOutputStream;
        Throwable th2;
        a aVar = new a();
        if (TextUtils.isEmpty(str)) {
            return aVar;
        }
        Context contextM53a = com.umeng.ut.a.a.a().m53a();
        String appkey = UMUtils.getAppkey(contextM53a);
        if (TextUtils.isEmpty(appkey)) {
            return aVar;
        }
        try {
            URL url = new URL(str);
            if (TextUtils.isEmpty(url.getHost())) {
                return aVar;
            }
            HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
            if (httpURLConnection instanceof HttpsURLConnection) {
                if (f71a == null) {
                    f71a = new e(url.getHost());
                }
                if (f106418a == null) {
                    f106418a = new d(url.getHost());
                }
                ((HttpsURLConnection) httpURLConnection).setSSLSocketFactory(f71a);
                ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(f106418a);
            }
            if (httpURLConnection != null) {
                httpURLConnection.setDoInput(true);
                if (z10) {
                    httpURLConnection.setDoOutput(true);
                    try {
                        httpURLConnection.setRequestMethod("POST");
                    } catch (ProtocolException e10) {
                        com.umeng.ut.a.c.e.a("", e10, new Object[0]);
                        return aVar;
                    }
                } else {
                    try {
                        httpURLConnection.setRequestMethod("GET");
                    } catch (ProtocolException e11) {
                        com.umeng.ut.a.c.e.a("", e11, new Object[0]);
                    }
                }
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setConnectTimeout(10000);
                httpURLConnection.setReadTimeout(10000);
                httpURLConnection.setInstanceFollowRedirects(true);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                httpURLConnection.setRequestProperty("Charset", "UTF-8");
                StringBuilder sb2 = new StringBuilder();
                httpURLConnection.setRequestProperty("x-audid-appkey", appkey);
                sb2.append(appkey);
                String packageName = contextM53a.getPackageName();
                if (!TextUtils.isEmpty(packageName)) {
                    try {
                        httpURLConnection.setRequestProperty("x-audid-appname", URLEncoder.encode(packageName, "UTF-8"));
                        sb2.append(packageName);
                    } catch (Exception unused) {
                    }
                }
                httpURLConnection.setRequestProperty("x-audid-sdk", "1.0.0");
                sb2.append("1.0.0");
                String strM54a = com.umeng.ut.a.a.a().m54a();
                httpURLConnection.setRequestProperty("x-audid-timestamp", strM54a);
                String str3 = "timestamp:" + strM54a;
                com.umeng.ut.a.c.e.m56a("", str3);
                sb2.append(strM54a);
                sb2.append(str2);
                httpURLConnection.setRequestProperty("signature", com.umeng.ut.b.a.a.a.a(com.umeng.ut.a.c.b.c(sb2.toString()).getBytes(), 2));
                long jCurrentTimeMillis = System.currentTimeMillis();
                DataOutputStream dataOutputStream2 = null;
                DataInputStream dataInputStream = null;
                ?? r10 = 0;
                try {
                    httpURLConnection.connect();
                    if (str2 == null || str2.length() <= 0) {
                        dataOutputStream = null;
                    } else {
                        dataOutputStream = new DataOutputStream(httpURLConnection.getOutputStream());
                        try {
                            dataOutputStream.writeBytes(str2);
                            dataOutputStream.flush();
                        } catch (Throwable th3) {
                            th = th3;
                            dataOutputStream2 = dataOutputStream;
                            try {
                                com.umeng.ut.a.c.e.m56a("", th);
                                aVar.f106417b = System.currentTimeMillis() - jCurrentTimeMillis;
                                if (dataOutputStream2 != null) {
                                    try {
                                    } catch (IOException e12) {
                                        com.umeng.ut.a.c.e.m56a("", e12);
                                    }
                                }
                                return aVar;
                            } finally {
                                if (dataOutputStream2 != null) {
                                    try {
                                        dataOutputStream2.close();
                                    } catch (IOException e13) {
                                        com.umeng.ut.a.c.e.m56a("", e13);
                                    }
                                }
                            }
                        }
                    }
                    if (dataOutputStream != null) {
                        try {
                            dataOutputStream.close();
                        } catch (IOException e14) {
                            com.umeng.ut.a.c.e.m56a("", e14);
                        }
                    }
                    try {
                        aVar.f106416a = httpURLConnection.getResponseCode();
                        aVar.signature = httpURLConnection.getHeaderField("signature");
                    } catch (Exception e15) {
                        com.umeng.ut.a.c.e.m56a("", e15);
                    }
                    try {
                        aVar.timestamp = Long.parseLong(httpURLConnection.getHeaderField("x-audid-timestamp"));
                        com.umeng.ut.a.c.e.m56a("", "repsonse.timestamp:" + aVar.timestamp);
                        long jM52a = com.umeng.ut.a.a.a().m52a();
                        long j10 = aVar.timestamp;
                        if (j10 > 0 && (j10 > jM52a + 1800000 || j10 < jM52a - 1800000)) {
                            com.umeng.ut.a.a.a().a(aVar.timestamp);
                        }
                    } catch (Exception unused2) {
                    }
                    aVar.f106417b = System.currentTimeMillis() - jCurrentTimeMillis;
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        try {
                            try {
                                DataInputStream dataInputStream2 = new DataInputStream(httpURLConnection.getInputStream());
                                try {
                                    byte[] bArr = new byte[2048];
                                    while (true) {
                                        int i10 = dataInputStream2.read(bArr, 0, 2048);
                                        if (i10 != -1) {
                                            byteArrayOutputStream.write(bArr, 0, i10);
                                        } else {
                                            try {
                                                break;
                                            } catch (Exception e16) {
                                                com.umeng.ut.a.c.e.m56a("", e16);
                                            }
                                        }
                                    }
                                    dataInputStream2.close();
                                } catch (IOException e17) {
                                    e = e17;
                                    dataInputStream = dataInputStream2;
                                    com.umeng.ut.a.c.e.m56a("", e);
                                    try {
                                        DataInputStream dataInputStream3 = new DataInputStream(httpURLConnection.getErrorStream());
                                        try {
                                            byte[] bArr2 = new byte[2048];
                                            while (true) {
                                                int i11 = dataInputStream3.read(bArr2, 0, 2048);
                                                if (i11 != -1) {
                                                    byteArrayOutputStream.write(bArr2, 0, i11);
                                                } else {
                                                    try {
                                                        break;
                                                    } catch (Exception e18) {
                                                        com.umeng.ut.a.c.e.m56a("", e18);
                                                    }
                                                }
                                            }
                                            dataInputStream3.close();
                                        } catch (Exception e19) {
                                            e = e19;
                                            dataInputStream = dataInputStream3;
                                            com.umeng.ut.a.c.e.m56a("", e);
                                            if (dataInputStream != null) {
                                                try {
                                                    dataInputStream.close();
                                                } catch (Exception e20) {
                                                    com.umeng.ut.a.c.e.m56a("", e20);
                                                }
                                            }
                                            return aVar;
                                        }
                                    } catch (Exception e21) {
                                        e = e21;
                                    }
                                }
                            } catch (Throwable th4) {
                                th2 = th4;
                                r10 = str3;
                                if (r10 == 0) {
                                    throw th2;
                                }
                                try {
                                    r10.close();
                                    throw th2;
                                } catch (Exception e22) {
                                    com.umeng.ut.a.c.e.m56a("", e22);
                                    throw th2;
                                }
                            }
                        } catch (IOException e23) {
                            e = e23;
                        }
                        if (byteArrayOutputStream.size() > 0) {
                            aVar.data = byteArrayOutputStream.toByteArray();
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                    }
                } catch (Throwable th6) {
                    th = th6;
                }
            }
            return aVar;
        } catch (MalformedURLException e24) {
            com.umeng.ut.a.c.e.a("", e24, new Object[0]);
            return aVar;
        } catch (IOException e25) {
            com.umeng.ut.a.c.e.a("", e25, new Object[0]);
            return aVar;
        } catch (Throwable th7) {
            com.umeng.ut.a.c.e.a("", th7, new Object[0]);
            return aVar;
        }
    }
}
