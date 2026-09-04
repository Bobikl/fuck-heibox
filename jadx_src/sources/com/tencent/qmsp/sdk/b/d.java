package com.tencent.qmsp.sdk.b;

import com.tencent.qmsp.sdk.f.h;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static byte[][] f101728a = {new byte[]{16, 99, -74, 82, 99, com.google.common.base.a.D, 112, -8, 43, 100}, new byte[]{8, 127, -87, 73, 34, org.apache.tools.tar.c.M, 118, -78, 113, 62, -29, 0, 102, 56, org.apache.tools.tar.c.Q, -16, org.apache.tools.tar.c.K, 113, -89, 73, 44, org.apache.tools.tar.c.M, 114, -90, 101, 93, -128, 105, 11, 123, 34, -77, 117, 43, -13, 119, 39, org.apache.tools.tar.c.K, 115, -14, org.apache.tools.tar.c.H, 99, -13, 110, com.google.common.base.a.D, 96, org.apache.tools.tar.c.M, -39, 44, 119, -106, org.apache.tools.tar.c.R, 58, 114}, new byte[]{com.google.common.base.a.f56671x, 96, -3, 68, 33, 44, 121}};

    public static String a(int i10) {
        return h.a(f101728a[i10]);
    }

    public static void a(b bVar) {
        String str = bVar.f101721a;
        String str2 = bVar.f101724d;
        String str3 = bVar.f101723c;
        c cVar = new c(bVar);
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            if (!(httpURLConnection instanceof HttpURLConnection)) {
                return;
            }
            httpURLConnection.setConnectTimeout(3000);
            httpURLConnection.setRequestProperty(a(0), a(1));
            InputStream inputStream = httpURLConnection.getInputStream();
            byte[] bArrA = a(inputStream);
            File file = new File(str3);
            if (!file.exists()) {
                file.mkdir();
            }
            FileOutputStream fileOutputStream = new FileOutputStream(new File(file + File.separator + str2));
            fileOutputStream.write(bArrA);
            fileOutputStream.close();
            if (inputStream != null) {
                inputStream.close();
            }
            cVar.f101726a = 0;
            String strA = a(2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("dwl:");
            sb2.append(str);
            sb2.append("  ok");
            com.tencent.qmsp.sdk.f.g.c(strA, 0, sb2.toString());
        } catch (Exception unused) {
            cVar.f101726a = 1;
            com.tencent.qmsp.sdk.f.g.c(a(2), 0, "dwl:" + str + "  fail");
        }
        com.tencent.qmsp.sdk.c.f.i().d().a(cVar);
    }

    public static byte[] a(InputStream inputStream) throws IOException {
        byte[] bArr = new byte[1024];
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        while (true) {
            int i10 = inputStream.read(bArr);
            if (i10 == -1) {
                byteArrayOutputStream.close();
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i10);
        }
    }
}
