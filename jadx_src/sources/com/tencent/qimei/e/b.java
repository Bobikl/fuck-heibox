package com.tencent.qimei.e;

import com.tencent.qcloud.core.http.HttpConstants;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: compiled from: HttpClientUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {
    public static String a(HttpURLConnection httpURLConnection) throws Exception {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        InputStream inputStream = httpURLConnection.getInputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                String string = byteArrayOutputStream.toString("UTF-8");
                com.tencent.qimei.l.a.a(byteArrayOutputStream);
                com.tencent.qimei.l.a.a(inputStream);
                return string;
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }

    public static void b(String str, String str2, c cVar) {
        com.tencent.qimei.c.a.a().a(new a(str, str2, cVar));
    }

    public static void c(String str, String str2, c cVar) {
        String string;
        String str3;
        boolean z10 = true;
        int responseCode = -1;
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setConnectTimeout(30000);
            httpURLConnection.setReadTimeout(10000);
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("Content-Type", HttpConstants.ContentType.JSON);
            httpURLConnection.setDoInput(true);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            outputStreamWriter.write(str2);
            outputStreamWriter.flush();
            httpURLConnection.connect();
            responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                string = a(httpURLConnection);
                str3 = "0";
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("response status code != 2XX. msg: ");
                sb2.append(httpURLConnection.getResponseMessage());
                string = sb2.toString();
                str3 = "452";
                z10 = false;
            }
        } catch (SecurityException e10) {
            e10.printStackTrace();
            com.tencent.qimei.n.a.a("网络", "没有网络权限，请在AndroidManifest文件中添加 <uses-permission android:name=\"android.permission.INTERNET\" /> ", new Object[0]);
            string = "security error: " + e10.getMessage();
            str3 = "199";
        } catch (ConnectException e11) {
            string = "https connect timeout: " + e11.getMessage();
            str3 = "451";
        } catch (Throwable th2) {
            string = "https connect error: " + th2.getMessage();
            str3 = "499";
        }
        if (z10) {
            cVar.a(string);
        } else {
            cVar.a(str3, responseCode, string);
        }
    }
}
