package com.umeng.socialize.a;

import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONObject;

/* JADX INFO: compiled from: NetClient.java */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f106079a = "NetClient";

    private static String a(String str, HttpURLConnection httpURLConnection, String str2) throws Exception {
        OutputStream outputStream;
        byte[] bytes = str2.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        l.a(str.getBytes(), byteArrayOutputStream);
        byte[] bArrA = i.a(byteArrayOutputStream.toByteArray(), bytes);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.addRequestProperty("Content-Type", COSRequestHeaderKey.APPLICATION_OCTET_STREAM);
        httpURLConnection.addRequestProperty("Content-Encoding", "xgzip");
        httpURLConnection.addRequestProperty("appkey", str2);
        httpURLConnection.setFixedLengthStreamingMode(bArrA.length);
        httpURLConnection.setDoOutput(true);
        try {
            outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(bArrA);
                c.a(outputStream);
                int responseCode = httpURLConnection.getResponseCode();
                InputStream inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                byteArrayOutputStream.reset();
                if (inputStream != null) {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        try {
                            int i10 = inputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i10);
                        } catch (Throwable th2) {
                            c.a(inputStream);
                            throw th2;
                        }
                    }
                    c.a(inputStream);
                }
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable unused) {
                }
                if (responseCode == 200 && TextUtils.equals("xgzip", httpURLConnection.getHeaderField("Content-Encoding"))) {
                    byte[] bArrA2 = i.a(byteArrayOutputStream.toByteArray(), bytes);
                    byteArrayOutputStream.reset();
                    l.b(bArrA2, byteArrayOutputStream);
                }
                String string = byteArrayOutputStream.toString();
                if (responseCode == 200) {
                    return string;
                }
                throw new IOException("code:" + responseCode + " msg:" + string);
            } catch (Throwable th3) {
                th = th3;
                c.a(outputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0041  */
    public static JSONObject a(JSONObject jSONObject, String str, String str2, boolean z10) throws Exception {
        boolean z11;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        URL url = new URL(str);
        try {
            JSONObject jSONObject2 = new JSONObject(a(jSONObject.toString(), (HttpURLConnection) url.openConnection(), str2));
            if (m.a()) {
                if (z10) {
                    m.a(f106079a, "req: ", url, "\n", jSONObject, "\nresp:\n", jSONObject2, "\nconsume:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                } else if (z11) {
                    m.a(f106079a, "req: ", url, "\n", jSONObject, "\nresp:\n", jSONObject2, "\nconsume:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                }
            }
            return jSONObject2;
        } finally {
            if (m.a() && (z10 || a.f106070c)) {
                m.a(f106079a, "req: ", url, "\n", jSONObject, "\nresp:\n", null, "\nconsume:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0155 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public static void a(JSONObject jSONObject, String str, String str2) throws Exception {
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        String string = jSONObject.toString();
        byte[] bytes = str2.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        l.a(string.getBytes(), byteArrayOutputStream);
        byte[] bArrA = i.a(byteArrayOutputStream.toByteArray(), bytes);
        if (a.f106070c && string.length() > 0) {
            m.a(f106079a, "src:", Integer.valueOf(string.length()), ", gzip:", Integer.valueOf(bArrA.length), ", ratio:", Integer.valueOf((bArrA.length * 100) / string.length()), "%");
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setReadTimeout(60000);
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.addRequestProperty("Content-Type", COSRequestHeaderKey.APPLICATION_OCTET_STREAM);
                httpURLConnection.addRequestProperty("appkey", str2);
                httpURLConnection.setFixedLengthStreamingMode(bArrA.length);
                httpURLConnection.setDoOutput(true);
                outputStream = httpURLConnection.getOutputStream();
                try {
                    outputStream.write(bArrA);
                    int responseCode = httpURLConnection.getResponseCode();
                    inputStream = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    try {
                        byteArrayOutputStream.reset();
                        if (inputStream != null) {
                            byte[] bArr = new byte[8192];
                            while (true) {
                                int i10 = inputStream.read(bArr);
                                if (i10 == -1) {
                                    break;
                                } else {
                                    byteArrayOutputStream.write(bArr, 0, i10);
                                }
                            }
                        }
                        c.a(outputStream);
                        c.a(inputStream);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused) {
                        }
                        if (responseCode == 200) {
                            byte[] bArrA2 = i.a(byteArrayOutputStream.toByteArray(), bytes);
                            byteArrayOutputStream.reset();
                            l.b(bArrA2, byteArrayOutputStream);
                        }
                        String string2 = byteArrayOutputStream.toString();
                        if (a.f106070c) {
                            m.a(f106079a, "req: ", str, "\n", string);
                            if (responseCode == 200) {
                                string2 = new JSONObject(string2).toString();
                            }
                            m.a(f106079a, "resp:\n", string2, "\nconsume:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        }
                        if (responseCode == 200) {
                            return;
                        }
                        throw new Exception("response code " + responseCode);
                    } catch (Throwable th2) {
                        th = th2;
                        c.a(outputStream);
                        c.a(inputStream);
                        if (httpURLConnection != null) {
                            try {
                                httpURLConnection.disconnect();
                            } catch (Throwable unused2) {
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    inputStream = null;
                    c.a(outputStream);
                    c.a(inputStream);
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Throwable th4) {
                th = th4;
                outputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            outputStream = null;
            httpURLConnection = null;
        }
    }
}
