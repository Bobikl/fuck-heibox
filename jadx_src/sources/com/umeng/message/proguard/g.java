package com.umeng.message.proguard;

import android.os.SystemClock;
import android.text.TextUtils;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import com.umeng.message.common.UPLog;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class g {
    private static String a(String str, HttpURLConnection httpURLConnection, String str2) throws Exception {
        OutputStream outputStream;
        byte[] bytes = str2.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bc.a(str.getBytes(), byteArrayOutputStream);
        byte[] bArrA = ay.a(byteArrayOutputStream.toByteArray(), bytes);
        httpURLConnection.setRequestMethod("POST");
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setConnectTimeout(30000);
        httpURLConnection.addRequestProperty("Content-Type", COSRequestHeaderKey.APPLICATION_OCTET_STREAM);
        httpURLConnection.addRequestProperty("Content-Encoding", "xgzip");
        httpURLConnection.addRequestProperty("Connection", "close");
        httpURLConnection.addRequestProperty("appkey", str2);
        httpURLConnection.setFixedLengthStreamingMode(bArrA.length);
        httpURLConnection.setDoOutput(true);
        try {
            outputStream = httpURLConnection.getOutputStream();
            try {
                outputStream.write(bArrA);
                f.a(outputStream);
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
                            f.a(inputStream);
                            throw th2;
                        }
                    }
                    f.a(inputStream);
                }
                try {
                    httpURLConnection.disconnect();
                } catch (Throwable unused) {
                }
                if (responseCode == 200 && TextUtils.equals("xgzip", httpURLConnection.getHeaderField("Content-Encoding"))) {
                    byte[] bArrA2 = ay.a(byteArrayOutputStream.toByteArray(), bytes);
                    byteArrayOutputStream.reset();
                    bc.b(bArrA2, byteArrayOutputStream);
                }
                String string = byteArrayOutputStream.toString();
                if (responseCode == 200) {
                    return string;
                }
                throw new IOException("code:" + responseCode + "msg:" + string);
            } catch (Throwable th3) {
                th = th3;
                f.a(outputStream);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            outputStream = null;
        }
    }

    public static JSONObject a(JSONObject jSONObject, String str, String str2) throws Exception {
        try {
            return a(jSONObject, str, str2, true);
        } catch (UnknownHostException unused) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            String host = new URL(str).getHost();
            String strA = au.a("174658", host);
            if (strA == null) {
                return null;
            }
            URL url = new URL(str.replaceFirst(host, strA));
            String string = jSONObject.toString();
            try {
                final HttpURLConnection httpURLConnection = (HttpURLConnection) url.openConnection();
                httpURLConnection.setRequestProperty("Host", host);
                if (httpURLConnection instanceof HttpsURLConnection) {
                    ((HttpsURLConnection) httpURLConnection).setHostnameVerifier(new HostnameVerifier() { // from class: com.umeng.message.proguard.g.1
                        @Override // javax.net.ssl.HostnameVerifier
                        public final boolean verify(String str3, SSLSession sSLSession) {
                            String requestProperty = httpURLConnection.getRequestProperty("Host");
                            if (requestProperty == null) {
                                requestProperty = httpURLConnection.getURL().getHost();
                            }
                            return HttpsURLConnection.getDefaultHostnameVerifier().verify(requestProperty, sSLSession);
                        }
                    });
                }
                JSONObject jSONObject2 = new JSONObject(a(string, httpURLConnection, str2));
                if (UPLog.isEnable()) {
                    UPLog.d("Net", "req:", url, "\n", jSONObject, "\nresp:\n", jSONObject2, "\nconsume:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                }
                return jSONObject2;
            } catch (Throwable th2) {
                if (UPLog.isEnable()) {
                    UPLog.d("Net", "req:", url, "\n", jSONObject, "\nresp:\n", null, "\nconsume:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                }
                throw th2;
            }
        }
    }

    public static JSONObject a(JSONObject jSONObject, String str, String str2, File file) throws Exception {
        Throwable th2;
        InputStream inputStream;
        OutputStream outputStream;
        HttpURLConnection httpURLConnection;
        String string = jSONObject.toString();
        byte[] bytes = str2.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bc.a(string.getBytes(), byteArrayOutputStream);
        byte[] bArrA = ay.a(byteArrayOutputStream.toByteArray(), bytes);
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        byte[] bytes2 = "--".getBytes();
        byte[] bytes3 = "\r\n".getBytes();
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setReadTimeout(60000);
                httpURLConnection.setConnectTimeout(60000);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.addRequestProperty("Content-Type", "multipart/form-data;boundary=".concat("----WebKitFormBoundary7MA4YWxkTrZu0gW"));
                httpURLConnection.addRequestProperty("appkey", str2);
                httpURLConnection.addRequestProperty("Connection", "close");
                httpURLConnection.setDoOutput(true);
                OutputStream outputStream2 = httpURLConnection.getOutputStream();
                try {
                    outputStream2.write(bytes2);
                    outputStream2.write("----WebKitFormBoundary7MA4YWxkTrZu0gW".getBytes());
                    outputStream2.write(bytes3);
                    outputStream2.write("Content-Disposition: form-data; name=\"msg\"".getBytes());
                    outputStream2.write(bytes3);
                    outputStream2.write(bytes3);
                    outputStream2.write(as.b(bArrA));
                    outputStream2.write(bytes3);
                    outputStream2.write(bytes2);
                    outputStream2.write("----WebKitFormBoundary7MA4YWxkTrZu0gW".getBytes());
                    outputStream2.write(bytes3);
                    outputStream2.write(("Content-Disposition: form-data; name=\"file\"; filename=\"" + file.getName() + "\"").getBytes());
                    outputStream2.write(bytes3);
                    outputStream2.write("Content-Type: application/octet-stream".getBytes());
                    outputStream2.write(bytes3);
                    outputStream2.write(bytes3);
                    FileInputStream fileInputStream = new FileInputStream(file);
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i10 = fileInputStream.read(bArr);
                        if (i10 == -1) {
                            break;
                        }
                        outputStream2.write(bArr, 0, i10);
                    }
                    fileInputStream.close();
                    outputStream2.write(bytes3);
                    outputStream2.write(bytes2);
                    outputStream2.write("----WebKitFormBoundary7MA4YWxkTrZu0gW".getBytes());
                    outputStream2.write(bytes2);
                    outputStream2.write(bytes3);
                    int responseCode = httpURLConnection.getResponseCode();
                    InputStream inputStream2 = responseCode < 400 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream();
                    try {
                        byteArrayOutputStream.reset();
                        if (inputStream2 != null) {
                            while (true) {
                                int i11 = inputStream2.read(bArr);
                                if (i11 == -1) {
                                    break;
                                }
                                byteArrayOutputStream.write(bArr, 0, i11);
                            }
                        }
                        f.a(outputStream2);
                        f.a(inputStream2);
                        try {
                            httpURLConnection.disconnect();
                        } catch (Throwable unused) {
                        }
                        if (responseCode == 200 && TextUtils.equals("xgzip", httpURLConnection.getHeaderField("Content-Encoding"))) {
                            byte[] bArrA2 = ay.a(byteArrayOutputStream.toByteArray(), bytes);
                            byteArrayOutputStream.reset();
                            bc.b(bArrA2, byteArrayOutputStream);
                        }
                        String string2 = byteArrayOutputStream.toString();
                        if (UPLog.isEnable()) {
                            UPLog.d("Net", "req:", str, "\n", string, "\nresp:\n", string2, "\nconsume:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
                        }
                        if (responseCode == 200) {
                            return new JSONObject(string2);
                        }
                        throw new Exception("response code:".concat(String.valueOf(responseCode)));
                    } catch (Throwable th3) {
                        th2 = th3;
                        inputStream = inputStream2;
                        outputStream = outputStream2;
                        f.a(outputStream);
                        f.a(inputStream);
                        if (httpURLConnection == null) {
                            throw th2;
                        }
                        try {
                            httpURLConnection.disconnect();
                            throw th2;
                        } catch (Throwable unused2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    outputStream = outputStream2;
                    inputStream = null;
                }
            } catch (Throwable th5) {
                th2 = th5;
                inputStream = null;
                outputStream = null;
            }
        } catch (Throwable th6) {
            th2 = th6;
            inputStream = null;
            outputStream = null;
            httpURLConnection = null;
        }
    }

    public static JSONObject a(JSONObject jSONObject, String str, String str2, boolean z10) throws Exception {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        URL url = new URL(str);
        try {
            JSONObject jSONObject2 = new JSONObject(a(jSONObject.toString(), (HttpURLConnection) url.openConnection(), str2));
            if (UPLog.isEnable() && z10) {
                UPLog.d("Net", "req:", url, "\n", jSONObject, "\nresp:\n", jSONObject2, "\nconsume:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            }
            return jSONObject2;
        } finally {
            if (UPLog.isEnable() && z10) {
                UPLog.d("Net", "req:", url, "\n", jSONObject, "\nresp:\n", null, "\nconsume:", Long.valueOf(SystemClock.elapsedRealtime() - jElapsedRealtime));
            }
        }
    }

    public static void b(JSONObject jSONObject, String str, String str2) throws Exception {
        InputStream inputStream;
        HttpURLConnection httpURLConnection;
        String string = jSONObject.toString();
        byte[] bytes = str2.getBytes();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        bc.a(string.getBytes(), byteArrayOutputStream);
        byte[] bArrA = ay.a(byteArrayOutputStream.toByteArray(), bytes);
        SystemClock.elapsedRealtime();
        InputStream inputStream2 = null;
        try {
            HttpURLConnection httpURLConnection2 = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection2.setRequestMethod("POST");
                httpURLConnection2.setReadTimeout(60000);
                httpURLConnection2.setConnectTimeout(60000);
                httpURLConnection2.addRequestProperty("Content-Type", COSRequestHeaderKey.APPLICATION_OCTET_STREAM);
                httpURLConnection2.addRequestProperty("Connection", "close");
                httpURLConnection2.addRequestProperty("appkey", str2);
                httpURLConnection2.setFixedLengthStreamingMode(bArrA.length);
                httpURLConnection2.setDoOutput(true);
                OutputStream outputStream = httpURLConnection2.getOutputStream();
                try {
                    outputStream.write(bArrA);
                    int responseCode = httpURLConnection2.getResponseCode();
                    inputStream2 = responseCode < 400 ? httpURLConnection2.getInputStream() : httpURLConnection2.getErrorStream();
                    byteArrayOutputStream.reset();
                    if (inputStream2 != null) {
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int i10 = inputStream2.read(bArr);
                            if (i10 == -1) {
                                break;
                            } else {
                                byteArrayOutputStream.write(bArr, 0, i10);
                            }
                        }
                    }
                    f.a(outputStream);
                    f.a(inputStream2);
                    try {
                        httpURLConnection2.disconnect();
                    } catch (Throwable unused) {
                    }
                    if (responseCode == 200) {
                        byte[] bArrA2 = ay.a(byteArrayOutputStream.toByteArray(), bytes);
                        byteArrayOutputStream.reset();
                        bc.b(bArrA2, byteArrayOutputStream);
                    }
                    if (responseCode != 200) {
                        throw new Exception("response code:".concat(String.valueOf(responseCode)));
                    }
                } catch (Throwable th2) {
                    th = th2;
                    httpURLConnection = httpURLConnection2;
                    inputStream = inputStream2;
                    inputStream2 = outputStream;
                    f.a(inputStream2);
                    f.a(inputStream);
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
                httpURLConnection = httpURLConnection2;
                inputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            inputStream = null;
            httpURLConnection = null;
        }
    }
}
