package com.tencent.open.a;

import android.text.TextUtils;
import com.huawei.hms.framework.common.ContainerUtils;
import com.tencent.open.log.SLog;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.Map;
import java.util.UUID;
import kotlin.text.y;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f101006a = 15000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f101007b = 30000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f101008c;

    public b(String str) {
        this.f101008c = str;
    }

    private g a(String str, int i10) throws Throwable {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("GET");
                a(httpURLConnection);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(false);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.connect();
                if (httpURLConnection.getResponseCode() != 200) {
                    String responseMessage = httpURLConnection.getResponseMessage();
                    if (responseMessage == null) {
                        responseMessage = "请求失败 code:" + httpURLConnection.getResponseCode();
                    }
                    c cVar = new c(httpURLConnection, "", httpURLConnection.getContentLength(), i10, httpURLConnection.getResponseCode(), responseMessage);
                    a((Closeable) null);
                    a((Closeable) null);
                    b(httpURLConnection);
                    return cVar;
                }
                inputStream = httpURLConnection.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i11 = inputStream.read(bArr);
                            if (i11 == -1) {
                                c cVar2 = new c(httpURLConnection, byteArrayOutputStream2.toString(), httpURLConnection.getContentLength(), i10, httpURLConnection.getResponseCode(), "");
                                a(byteArrayOutputStream2);
                                a(inputStream);
                                b(httpURLConnection);
                                return cVar2;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i11);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        a(byteArrayOutputStream);
                        a(inputStream);
                        b(httpURLConnection);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            inputStream = null;
        }
    }

    private g a(String str, int i10, String str2) throws Throwable {
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setRequestMethod("POST");
                a(httpURLConnection);
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
                outputStreamWriter.write(str2);
                outputStreamWriter.flush();
                httpURLConnection.connect();
                int contentLength = httpURLConnection.getContentLength();
                if (httpURLConnection.getResponseCode() != 200) {
                    String responseMessage = httpURLConnection.getResponseMessage();
                    if (responseMessage == null) {
                        responseMessage = "Unknown fail: " + httpURLConnection.getResponseCode();
                    }
                    c cVar = new c(httpURLConnection, "", 0, i10, httpURLConnection.getResponseCode(), responseMessage);
                    a((Closeable) null);
                    a((Closeable) null);
                    b(httpURLConnection);
                    return cVar;
                }
                inputStream = httpURLConnection.getInputStream();
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    try {
                        byte[] bArr = new byte[1024];
                        while (true) {
                            int i11 = inputStream.read(bArr);
                            if (i11 == -1) {
                                c cVar2 = new c(httpURLConnection, byteArrayOutputStream2.toString(), contentLength, i10, httpURLConnection.getResponseCode(), "");
                                a(byteArrayOutputStream2);
                                a(inputStream);
                                b(httpURLConnection);
                                return cVar2;
                            }
                            byteArrayOutputStream2.write(bArr, 0, i11);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        byteArrayOutputStream = byteArrayOutputStream2;
                        a(byteArrayOutputStream);
                        a(inputStream);
                        b(httpURLConnection);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                inputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            httpURLConnection = null;
            inputStream = null;
        }
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    private void a(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        httpURLConnection.setRequestProperty("User-Agent", this.f101008c);
        httpURLConnection.setConnectTimeout(this.f101006a);
        httpURLConnection.setReadTimeout(this.f101007b);
        httpURLConnection.setRequestProperty("Accept-Language", "zh-CN");
        httpURLConnection.setRequestProperty("Connection", com.google.common.net.c.f58866u0);
        httpURLConnection.setRequestProperty("Charset", "UTF-8");
    }

    private static void b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection == null) {
            return;
        }
        try {
            httpURLConnection.disconnect();
        } catch (Exception unused) {
        }
    }

    @Override // com.tencent.open.a.a
    public g a(String str, String str2) throws IOException {
        SLog.i("DefaultHttpServiceImpl", "get. ");
        if (!TextUtils.isEmpty(str2)) {
            int iIndexOf = str2.indexOf("?");
            if (iIndexOf == -1) {
                str = str + "?";
            } else if (iIndexOf != str.length() - 1) {
                str = str + "&";
            }
            str = str + str2;
        }
        return a(str, str2.length());
    }

    @Override // com.tencent.open.a.a
    public g a(String str, Map<String, String> map) throws IOException {
        SLog.i("DefaultHttpServiceImpl", "post. ");
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = true;
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (z10) {
                z10 = false;
            } else {
                sb2.append(y.f128595d);
            }
            sb2.append(URLEncoder.encode(entry.getKey(), "UTF-8"));
            sb2.append(n5.a.f132013h);
            sb2.append(URLEncoder.encode(entry.getValue(), "UTF-8"));
        }
        String string = sb2.toString();
        return a(str, string.length(), string);
    }

    public g a(String str, Map<String, String> map, String str2, byte[] bArr) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        DataOutputStream dataOutputStream;
        HttpURLConnection httpURLConnection;
        InputStream inputStream;
        int i10;
        String string;
        InputStream inputStream2;
        ByteArrayOutputStream byteArrayOutputStream2;
        DataOutputStream dataOutputStream2;
        Map<String, String> map2 = map;
        SLog.i("DefaultHttpServiceImpl", "文件上传");
        String string2 = UUID.randomUUID().toString();
        try {
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            try {
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setUseCaches(false);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestProperty("Content-Type", "multipart/form-data;boundary=" + string2);
                try {
                    a(httpURLConnection);
                    httpURLConnection.connect();
                    DataOutputStream dataOutputStream3 = new DataOutputStream(httpURLConnection.getOutputStream());
                    if (map2 != null) {
                        try {
                            if (map.size() > 0) {
                                Iterator<String> it = map.keySet().iterator();
                                while (it.hasNext()) {
                                    StringBuffer stringBuffer = new StringBuffer();
                                    String strEncode = URLEncoder.encode(it.next(), "UTF-8");
                                    String strEncode2 = URLEncoder.encode(map2.get(strEncode), "UTF-8");
                                    stringBuffer.append("--");
                                    stringBuffer.append(string2);
                                    stringBuffer.append("\r\n");
                                    stringBuffer.append("Content-Disposition: form-data; name=\"");
                                    stringBuffer.append(strEncode);
                                    stringBuffer.append("\"");
                                    stringBuffer.append("\r\n");
                                    stringBuffer.append("\r\n");
                                    stringBuffer.append(strEncode2);
                                    stringBuffer.append("\r\n");
                                    String string3 = stringBuffer.toString();
                                    SLog.i("DefaultHttpServiceImpl", strEncode + ContainerUtils.KEY_VALUE_DELIMITER + string3 + "##");
                                    dataOutputStream3.write(string3.getBytes());
                                    map2 = map;
                                }
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            dataOutputStream = dataOutputStream3;
                            byteArrayOutputStream = null;
                            inputStream = null;
                            a(dataOutputStream);
                            a(inputStream);
                            a(byteArrayOutputStream);
                            b(httpURLConnection);
                            throw th;
                        }
                    }
                    if (bArr == null || bArr.length <= 0) {
                        i10 = 0;
                    } else {
                        StringBuffer stringBuffer2 = new StringBuffer();
                        stringBuffer2.append("--");
                        stringBuffer2.append(string2);
                        stringBuffer2.append("\r\n");
                        stringBuffer2.append("Content-Disposition: form-data; name=\"" + str2 + "\"; filename=\"" + str2 + "\"\r\n");
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Content-Type: application/octet-stream; charset=UTF-8");
                        sb2.append("\r\n");
                        stringBuffer2.append(sb2.toString());
                        stringBuffer2.append("\r\n");
                        dataOutputStream3.write(stringBuffer2.toString().getBytes());
                        dataOutputStream3.write(bArr, 0, bArr.length);
                        dataOutputStream3.write("\r\n".getBytes());
                        byte[] bytes = ("--" + string2 + "--\r\n").getBytes();
                        dataOutputStream3.write(bytes);
                        int length = bytes.length + 0;
                        dataOutputStream3.flush();
                        i10 = length;
                    }
                    try {
                        int responseCode = httpURLConnection.getResponseCode();
                        SLog.i("DefaultHttpServiceImpl", responseCode + "");
                        if (responseCode == 200) {
                            InputStream inputStream3 = httpURLConnection.getInputStream();
                            try {
                                byteArrayOutputStream = new ByteArrayOutputStream();
                                try {
                                    byte[] bArr2 = new byte[1024];
                                    while (true) {
                                        int i11 = inputStream3.read(bArr2);
                                        if (i11 == -1) {
                                            break;
                                        }
                                        byteArrayOutputStream.write(bArr2, 0, i11);
                                        a(dataOutputStream);
                                        a(inputStream);
                                        a(byteArrayOutputStream);
                                        b(httpURLConnection);
                                        throw th;
                                    }
                                    string = byteArrayOutputStream.toString();
                                    inputStream2 = inputStream3;
                                    byteArrayOutputStream2 = byteArrayOutputStream;
                                } catch (Throwable th3) {
                                    th = th3;
                                    inputStream = inputStream3;
                                    dataOutputStream = dataOutputStream3;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                                inputStream = inputStream3;
                                dataOutputStream = dataOutputStream3;
                                byteArrayOutputStream = null;
                            }
                        } else {
                            string = httpURLConnection.getResponseCode() + "";
                            inputStream2 = null;
                            byteArrayOutputStream2 = null;
                        }
                        try {
                            dataOutputStream2 = dataOutputStream3;
                            try {
                                c cVar = new c(httpURLConnection, string, httpURLConnection.getContentLength(), i10, httpURLConnection.getResponseCode(), "");
                                a(dataOutputStream2);
                                a(inputStream2);
                                a(byteArrayOutputStream2);
                                b(httpURLConnection);
                                return cVar;
                            } catch (Throwable th5) {
                                th = th5;
                                InputStream inputStream4 = inputStream2;
                                dataOutputStream = dataOutputStream2;
                                byteArrayOutputStream = byteArrayOutputStream2;
                                inputStream = inputStream4;
                                a(dataOutputStream);
                                a(inputStream);
                                a(byteArrayOutputStream);
                                b(httpURLConnection);
                                throw th;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            dataOutputStream2 = dataOutputStream3;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        dataOutputStream = dataOutputStream3;
                        byteArrayOutputStream = null;
                        inputStream = null;
                    }
                } catch (Throwable th8) {
                    th = th8;
                    byteArrayOutputStream = null;
                    dataOutputStream = null;
                    inputStream = null;
                    a(dataOutputStream);
                    a(inputStream);
                    a(byteArrayOutputStream);
                    b(httpURLConnection);
                    throw th;
                }
            } catch (Throwable th9) {
                th = th9;
            }
        } catch (Throwable th10) {
            th = th10;
            byteArrayOutputStream = null;
            dataOutputStream = null;
            httpURLConnection = null;
        }
    }

    @Override // com.tencent.open.a.a
    public g a(String str, Map<String, String> map, Map<String, byte[]> map2) throws IOException {
        if (map2 == null || map2.size() <= 0) {
            return a(str, map);
        }
        Iterator<Map.Entry<String, byte[]>> it = map2.entrySet().iterator();
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry<String, byte[]> next = it.next();
        return a(str, map, next.getKey(), next.getValue());
    }

    @Override // com.tencent.open.a.a
    public void a(long j10, long j11) {
        if (j10 <= 0 || j11 <= 0) {
            return;
        }
        this.f101006a = (int) j10;
        this.f101007b = (int) j11;
    }
}
