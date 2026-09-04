package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: classes7.dex */
public class BksUtil {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f63026a = "BksUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f63027b = "com.huawei.hwid";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f63028c = "com.huawei.hwid";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f63029d = "com.huawei.hms";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f63030e = "com.huawei.hwid.tv";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f63032g = "files/hmsrootcas.bks";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f63033h = "4.0.2.300";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f63034i = "aegis";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f63035j = "hmsrootcas.bks";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final long f63036k = 604800000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f63037l = "last_update_time";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f63038m = "B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f63039n = "3517262215D8D3008CBF888750B6418EDC4D562AC33ED6874E0D73ABA667BC3C";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final String f63042q = "";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final String f63043r = "bks_hash";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Uri f63031f = Uri.parse("content://com.huawei.hwid");

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f63040o = "E49D5C2C0E11B3B1B96CA56C6DE2A14EC7DAB5CCC3B5F300D03E5B4DBA44F539";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final String[] f63041p = {"B92825C2BD5D6D6D1E7F39EECD17843B7D9016F611136B75441BC6F4D3F00F05", f63040o};

    private BksUtil() {
    }

    private static int a(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        File file = new File(str);
        if (file.exists()) {
            e.e(f63026a, "The directory  has already exists");
            return 1;
        }
        if (file.mkdirs()) {
            e.a(f63026a, "create directory  success");
            return 0;
        }
        e.b(f63026a, "create directory  failed");
        return -1;
    }

    private static String a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return context.createDeviceProtectedStorageContext().getFilesDir() + File.separator + f63034i;
        }
        return context.getApplicationContext().getFilesDir() + File.separator + f63034i;
    }

    private static String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        StringBuilder sb2 = new StringBuilder();
        for (byte b10 : bArr) {
            String hexString = Integer.toHexString(b10 & 255);
            if (hexString.length() == 1) {
                sb2.append('0');
            }
            sb2.append(hexString);
        }
        return sb2.toString();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    private static void a(InputStream inputStream, Context context) throws Throwable {
        if (inputStream == null || context == null) {
            return;
        }
        String strA = a(context);
        if (!new File(strA).exists()) {
            a(strA);
        }
        File file = new File(strA, "hmsrootcas.bks");
        if (file.exists()) {
            file.delete();
        }
        ?? r10 = 0;
        FileOutputStream fileOutputStream = null;
        try {
            try {
                e.c(f63026a, "write output stream ");
                FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                r10 = 2048;
                try {
                    byte[] bArr = new byte[2048];
                    while (true) {
                        int i10 = inputStream.read(bArr, 0, 2048);
                        if (i10 == -1) {
                            break;
                        } else {
                            fileOutputStream2.write(bArr, 0, i10);
                        }
                    }
                    d.a((OutputStream) fileOutputStream2);
                } catch (IOException unused) {
                    fileOutputStream = fileOutputStream2;
                    e.b(f63026a, " IOException");
                    d.a((OutputStream) fileOutputStream);
                    r10 = fileOutputStream;
                } catch (Throwable th2) {
                    th = th2;
                    r10 = fileOutputStream2;
                    d.a((OutputStream) r10);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException unused2) {
        }
    }

    private static boolean a(int i10) {
        return i10 >= 40002300;
    }

    private static byte[] a(Context context, String str) {
        PackageInfo packageInfo;
        if (context == null || TextUtils.isEmpty(str)) {
            Log.e(f63026a, "packageName is null or context is null");
            return new byte[0];
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(str, 64)) != null) {
                return packageInfo.signatures[0].toByteArray();
            }
        } catch (PackageManager.NameNotFoundException e10) {
            Log.e(f63026a, "PackageManager.NameNotFoundException : " + e10.getMessage());
        } catch (Exception e11) {
            Log.e(f63026a, "get pm exception : " + e11.getMessage());
        }
        return new byte[0];
    }

    private static String b(Context context) {
        return a(context) + File.separator + "hmsrootcas.bks";
    }

    private static String b(byte[] bArr) {
        if (bArr == null) {
            return "";
        }
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bArr);
            return a(messageDigest.digest());
        } catch (NoSuchAlgorithmException unused) {
            e.b(f63026a, "inputstraem exception");
            return "";
        }
    }

    private static boolean b(Context context, String str) {
        return f63040o.equalsIgnoreCase(c(a(context, str)));
    }

    private static boolean b(String str) {
        int i10;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        e.c(f63026a, "hms version code is : " + str);
        String[] strArrSplit = str.split("\\.");
        String[] strArrSplit2 = f63033h.split("\\.");
        int length = strArrSplit.length;
        int length2 = strArrSplit2.length;
        int iMax = Math.max(length, length2);
        int i11 = 0;
        while (i11 < iMax) {
            if (i11 < length) {
                try {
                    i10 = Integer.parseInt(strArrSplit[i11]);
                } catch (Exception e10) {
                    e.b(f63026a, " exception : " + e10.getMessage());
                    return i11 >= length2;
                }
            } else {
                i10 = 0;
            }
            int i12 = i11 < length2 ? Integer.parseInt(strArrSplit2[i11]) : 0;
            if (i10 < i12) {
                return false;
            }
            if (i10 > i12) {
                return true;
            }
            i11++;
        }
        return true;
    }

    private static String c(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return "";
        }
        try {
            return a(MessageDigest.getInstance("SHA-256").digest(bArr));
        } catch (NoSuchAlgorithmException e10) {
            Log.e(f63026a, "NoSuchAlgorithmException" + e10.getMessage());
            return "";
        }
    }

    private static boolean c(Context context) {
        return new File(a(context) + File.separator + "hmsrootcas.bks").exists();
    }

    private static boolean c(Context context, String str) {
        byte[] bArrA = a(context, str);
        for (String str2 : f63041p) {
            if (str2.equalsIgnoreCase(c(bArrA))) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0115: MOVE (r8 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]), block:B:59:0x0115 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.io.OutputStream] */
    public static synchronized InputStream getBksFromTss(Context context) {
        ByteArrayInputStream byteArrayInputStream;
        ?? r10;
        ByteArrayInputStream byteArrayInputStream2;
        InputStream inputStreamOpenInputStream;
        ?? r11;
        boolean zB;
        e.c(f63026a, "get bks from tss begin");
        if (context != null) {
            ContextUtil.setContext(context);
        }
        Context contextUtil = ContextUtil.getInstance();
        ByteArrayInputStream byteArrayInputStream3 = null;
        if (contextUtil == null) {
            e.b(f63026a, "context is null");
            return null;
        }
        if (!b(f.a("com.huawei.hwid")) && !b(f.a("com.huawei.hms"))) {
            e.b(f63026a, "hms version code is too low : " + f.a("com.huawei.hwid"));
            return null;
        }
        boolean zC = c(contextUtil, "com.huawei.hwid");
        boolean z10 = zC;
        if (!zC && !(zB = b(contextUtil, "com.huawei.hms"))) {
            z10 = zB;
            e.b(f63026a, "hms sign error");
            return null;
        }
        try {
            z10 = zB;
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                inputStreamOpenInputStream = contextUtil.getContentResolver().openInputStream(Uri.withAppendedPath(f63031f, f63032g));
                try {
                    byte[] bArr = new byte[1024];
                    try {
                        while (true) {
                            int i10 = inputStreamOpenInputStream.read(bArr);
                            if (i10 <= -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i10);
                            e.b(f63026a, "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
                            d.a(inputStreamOpenInputStream);
                            d.a((OutputStream) byteArrayOutputStream);
                            d.a((InputStream) byteArrayInputStream3);
                            return getFilesBksIS(contextUtil);
                        }
                        String strA = g.a(f63043r, "", contextUtil);
                        String strB = b(byteArrayOutputStream.toByteArray());
                        if (c(contextUtil) && strA.equals(strB)) {
                            e.c(f63026a, "bks not update");
                        } else {
                            e.c(f63026a, "update bks and sp");
                            a(byteArrayInputStream2, contextUtil);
                            g.b(f63043r, strB, contextUtil);
                        }
                        d.a(inputStreamOpenInputStream);
                        d.a((OutputStream) byteArrayOutputStream);
                        d.a((InputStream) byteArrayInputStream2);
                    } catch (Exception e10) {
                        e = e10;
                        byteArrayInputStream3 = byteArrayInputStream2;
                        e.b(f63026a, "Get bks from HMS_VERSION_CODE exception : No content provider" + e.getMessage());
                        d.a(inputStreamOpenInputStream);
                        d.a((OutputStream) byteArrayOutputStream);
                        d.a((InputStream) byteArrayInputStream3);
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = byteArrayOutputStream;
                        d.a(inputStreamOpenInputStream);
                        d.a((OutputStream) r11);
                        d.a((InputStream) byteArrayInputStream2);
                        throw th;
                    }
                    byteArrayOutputStream.flush();
                    byteArrayInputStream2 = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
                } catch (Exception e11) {
                    e = e11;
                }
            } catch (Exception e12) {
                e = e12;
                inputStreamOpenInputStream = null;
            } catch (Throwable th3) {
                th = th3;
                r10 = byteArrayOutputStream;
                byteArrayInputStream2 = null;
                inputStreamOpenInputStream = byteArrayInputStream3;
                r11 = r10;
                d.a(inputStreamOpenInputStream);
                d.a((OutputStream) r11);
                d.a((InputStream) byteArrayInputStream2);
                throw th;
            }
            return getFilesBksIS(contextUtil);
        } catch (Throwable th4) {
            th = th4;
            byteArrayInputStream3 = byteArrayInputStream;
            r10 = z10;
        }
    }

    public static InputStream getFilesBksIS(Context context) {
        if (!c(context)) {
            return null;
        }
        e.c(f63026a, "getFilesBksIS ");
        try {
            return new FileInputStream(b(context));
        } catch (FileNotFoundException unused) {
            e.b(f63026a, "FileNotFoundExceptio: ");
            return null;
        }
    }
}
