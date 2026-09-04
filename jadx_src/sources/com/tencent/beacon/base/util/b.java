package com.tencent.beacon.base.util;

import android.content.SharedPreferences;
import android.text.format.Time;
import com.max.hbutils.utils.w;
import com.tencent.beacon.a.b.g;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.io.StringWriter;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: CoreUtils.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Random f98945a = new Random();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final AtomicInteger f98946b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final SimpleDateFormat f98947c = new SimpleDateFormat("yyyy-MM-dd", Locale.US);

    public static int a(String str, int i10, int i11, int i12) {
        int i13;
        if (str == null) {
            return i10;
        }
        try {
            i13 = Integer.parseInt(str);
        } catch (Exception e10) {
            c.a(e10);
            i13 = i10;
        }
        return (i13 < i11 || i13 > i12) ? i10 : i13;
    }

    public static long a(String str, long j10, long j11, long j12) {
        long j13;
        if (str == null) {
            return j10;
        }
        try {
            j13 = Long.parseLong(str);
        } catch (Exception e10) {
            c.a(e10);
            j13 = j10;
        }
        return (j13 < j11 || j13 > j12) ? j10 : j13;
    }

    public static Object a(byte[] bArr) {
        Throwable th2;
        ObjectInputStream objectInputStream;
        if (bArr == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            objectInputStream = new ObjectInputStream(byteArrayInputStream);
            try {
                Object object = objectInputStream.readObject();
                a(objectInputStream);
                a(byteArrayInputStream);
                return object;
            } catch (Throwable th3) {
                th2 = th3;
                try {
                    c.a(th2);
                    c.b(th2.getMessage(), new Object[0]);
                    a(objectInputStream);
                    a(byteArrayInputStream);
                    return null;
                } catch (Throwable th4) {
                    a(objectInputStream);
                    a(byteArrayInputStream);
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            th2 = th5;
            objectInputStream = null;
        }
    }

    public static String a() {
        return a(16);
    }

    private static String a(int i10) {
        Random random = new Random();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 < i10; i11++) {
            stringBuffer.append("abcdef0123456789".charAt(random.nextInt(16)));
        }
        return stringBuffer.toString();
    }

    public static String a(Throwable th2) {
        if (th2 == null) {
            return "";
        }
        StringWriter stringWriter = new StringWriter();
        th2.printStackTrace(new PrintWriter(stringWriter));
        String strReplace = (th2.getMessage() + "\n" + stringWriter.getBuffer().toString()).replace("\t", " ").replace("\n", " ").replace("$", Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        return strReplace.length() > 10240 ? strReplace.substring(0, 10240) : strReplace;
    }

    public static ArrayList<String> a(String[] strArr) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2;
        ArrayList<String> arrayList = new ArrayList<>();
        try {
            Process processExec = Runtime.getRuntime().exec(strArr);
            bufferedReader = new BufferedReader(new InputStreamReader(processExec.getInputStream(), Charset.forName("UTF-8")));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line == null) {
                        break;
                    }
                    arrayList.add(line);
                } catch (Throwable th2) {
                    th = th2;
                    bufferedReader2 = null;
                }
                try {
                    c.a(th);
                    a(bufferedReader);
                    a(bufferedReader2);
                    return null;
                } catch (Throwable th3) {
                    a(bufferedReader);
                    a(bufferedReader2);
                    throw th3;
                }
            }
            bufferedReader2 = new BufferedReader(new InputStreamReader(processExec.getErrorStream(), Charset.forName("UTF-8")));
            while (true) {
                try {
                    String line2 = bufferedReader2.readLine();
                    if (line2 == null) {
                        a(bufferedReader);
                        a(bufferedReader2);
                        return arrayList;
                    }
                    arrayList.add(line2);
                } catch (Throwable th4) {
                    th = th4;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedReader = null;
            bufferedReader2 = null;
        }
    }

    public static HashSet<String> a(ArrayList<String> arrayList) {
        if (arrayList == null || arrayList.size() <= 0) {
            return null;
        }
        HashSet<String> hashSet = new HashSet<>(arrayList.size());
        hashSet.addAll(arrayList);
        return hashSet;
    }

    public static void a(Closeable... closeableArr) {
        for (Closeable closeable : closeableArr) {
            if (closeable != null) {
                try {
                    closeable.close();
                } catch (Exception e10) {
                    c.a(e10);
                }
            }
        }
    }

    public static boolean a(long j10, long j11) {
        Time time = new Time();
        time.set(j10);
        int i10 = time.year;
        int i11 = time.month;
        int i12 = time.monthDay;
        time.set(j11);
        return i10 == time.year && i11 == time.month && i12 == time.monthDay;
    }

    public static boolean a(SharedPreferences.Editor editor) {
        if (editor != null) {
            return true;
        }
        c.b("BeaconProperties editor is null!", new Object[0]);
        return false;
    }

    public static boolean a(String str) {
        return str.startsWith("rqd_");
    }

    public static boolean a(String str, boolean z10) {
        if (str == null) {
            return z10;
        }
        if (str.toLowerCase().equals("y")) {
            return true;
        }
        if (str.toLowerCase().equals("n")) {
            return false;
        }
        return z10;
    }

    public static byte[] a(Object obj) {
        ObjectOutputStream objectOutputStream;
        if (!(obj instanceof Serializable)) {
            c.b("not serial obj ", new Object[0]);
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            try {
                objectOutputStream.writeObject(obj);
                objectOutputStream.flush();
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                a(objectOutputStream);
                a(byteArrayOutputStream);
                return byteArray;
            } catch (Throwable th2) {
                th = th2;
                try {
                    c.a(th);
                    c.b(th.getMessage(), new Object[0]);
                    a(objectOutputStream);
                    a(byteArrayOutputStream);
                    return null;
                } catch (Throwable th3) {
                    a(objectOutputStream);
                    a(byteArrayOutputStream);
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            th = th4;
            objectOutputStream = null;
        }
    }

    public static byte[] a(byte[] bArr, int i10) {
        if (bArr == null || i10 == -1) {
            return bArr;
        }
        c.a("unzp: %s len: %s", Integer.valueOf(i10), Integer.valueOf(bArr.length));
        try {
            return com.tencent.beacon.base.net.c.a.b(i10, bArr);
        } catch (Throwable th2) {
            g.e().a("509", "unzipData length: " + bArr.length + ",type:" + i10, th2);
            c.a(th2);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("err unzp}");
            sb2.append(th2.toString());
            c.b(sb2.toString(), new Object[0]);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, int i10, int i11, String str) {
        try {
            return a(b(bArr, i11, str), i10);
        } catch (Exception e10) {
            c.a(e10);
            return null;
        }
    }

    public static byte[] a(byte[] bArr, int i10, String str) {
        if (bArr == null || i10 == -1) {
            return bArr;
        }
        c.a("CoreUtils", "encry data length:%d type: %d", Integer.valueOf(bArr.length), Integer.valueOf(i10));
        try {
            return com.tencent.beacon.base.net.c.c.b(i10, str, bArr);
        } catch (Throwable th2) {
            c.a(th2);
            g.e().a("507", "data length: " + bArr.length + ",type:" + i10 + ",key: " + str, th2);
            return null;
        }
    }

    public static String b() {
        com.tencent.beacon.a.c.c cVarD = com.tencent.beacon.a.c.c.d();
        return b((cVarD != null ? cVarD.f() : "") + lg.a.f131412e + com.tencent.beacon.a.c.e.l().d() + lg.a.f131412e + new Date().getTime() + lg.a.f131412e + (f98945a.nextInt(2147473647) + 1000));
    }

    public static String b(String str) {
        String strC = c(str);
        if (strC == null) {
            return strC;
        }
        try {
            return strC.substring(8, 24);
        } catch (Exception e10) {
            c.a(e10);
            return strC;
        }
    }

    public static byte[] b(byte[] bArr, int i10) {
        if (bArr == null || i10 == -1) {
            return bArr;
        }
        c.a("zp: %s len: %s", Integer.valueOf(i10), Integer.valueOf(bArr.length));
        try {
            return com.tencent.beacon.base.net.c.a.a(i10, bArr);
        } catch (Throwable th2) {
            g.e().a("509", "zipData length: " + bArr.length + ",type:" + i10, th2);
            c.a(th2);
            c.b("err zp : %s", th2.toString());
            return null;
        }
    }

    public static byte[] b(byte[] bArr, int i10, int i11, String str) {
        if (bArr == null) {
            return null;
        }
        try {
            return a(b(bArr, i10), i11, str);
        } catch (Throwable th2) {
            c.a(th2);
            return null;
        }
    }

    public static byte[] b(byte[] bArr, int i10, String str) {
        if (bArr == null || bArr.length <= 0 || i10 == -1) {
            return bArr;
        }
        try {
            return com.tencent.beacon.base.net.c.c.a(i10, str, bArr);
        } catch (Throwable th2) {
            c.e("data length: " + bArr.length + ",type:" + i10 + ",key: " + str + ",error: " + th2.getMessage(), new Object[0]);
            g gVarE = g.e();
            StringBuilder sb2 = new StringBuilder();
            sb2.append("data length: ");
            sb2.append(bArr.length);
            sb2.append(",type:");
            sb2.append(i10);
            sb2.append(",key: ");
            sb2.append(str);
            gVarE.a("508", sb2.toString(), th2);
            return null;
        }
    }

    public static long c() {
        return new Date().getTime() + com.tencent.beacon.a.c.c.d().k();
    }

    public static String c(String str) {
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
            c.a(e10);
            return str;
        }
    }

    public static String d() {
        try {
            return new SimpleDateFormat("yyyy-MM-dd", Locale.US).format(new Date());
        } catch (Throwable th2) {
            c.a(th2);
            return "";
        }
    }

    public static Date d(String str) {
        if (str != null && str.trim().length() > 0) {
            try {
                return new SimpleDateFormat(w.f73604k, Locale.US).parse(str);
            } catch (ParseException e10) {
                c.a(e10);
            }
        }
        return null;
    }
}
