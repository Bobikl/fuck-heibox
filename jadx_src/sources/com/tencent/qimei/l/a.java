package com.tencent.qimei.l;

import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.FileInputStream;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.util.Date;
import java.util.Random;

/* JADX INFO: compiled from: CoreUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Random f101280a = new Random();

    public static String a() {
        return a(lg.a.f131412e + com.tencent.qimei.d.a.c() + lg.a.f131412e + new Date().getTime() + lg.a.f131412e + (f101280a.nextInt(2147473647) + 1000));
    }

    public static String a(String str) {
        String strB = b(str);
        if (strB == null) {
            return strB;
        }
        try {
            return strB.substring(8, 24);
        } catch (Exception e10) {
            com.tencent.qimei.n.a.a(e10);
            return strB;
        }
    }

    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    public static String b(String str) {
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes(Charset.forName("UTF-8")));
            StringBuilder sb2 = new StringBuilder();
            for (byte b10 : bArrDigest) {
                int i10 = b10 & 255;
                if (i10 < 16) {
                    sb2.append(0);
                }
                sb2.append(Integer.toHexString(i10));
            }
            return sb2.toString();
        } catch (Exception e10) {
            com.tencent.qimei.n.a.a(e10);
            return str;
        }
    }

    public static String c(String str) throws Throwable {
        String str2 = "";
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[fileInputStream2.available()];
                    str2 = fileInputStream2.read(bArr) > 0 ? new String(bArr, "UTF-8") : "";
                    a(fileInputStream2);
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    com.tencent.qimei.n.a.b("Read file %s failed.", str);
                    a(fileInputStream);
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    a(fileInputStream);
                    throw th;
                }
            } catch (Exception unused2) {
            }
            return str2;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public static String d(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        FileInputStream fileInputStream = null;
        try {
            try {
                FileInputStream fileInputStream2 = new FileInputStream(str);
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = fileInputStream2.read(bArr);
                        if (i10 == -1) {
                            String string = byteArrayOutputStream.toString("UTF-8");
                            a(fileInputStream2);
                            a(byteArrayOutputStream);
                            return string;
                        }
                        byteArrayOutputStream.write(bArr, 0, i10);
                    }
                } catch (Exception unused) {
                    fileInputStream = fileInputStream2;
                    com.tencent.qimei.n.a.b("Read file %s failed.", str);
                    a(fileInputStream);
                    a(byteArrayOutputStream);
                    return "";
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    a(fileInputStream);
                    a(byteArrayOutputStream);
                    throw th;
                }
            } catch (Exception unused2) {
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
