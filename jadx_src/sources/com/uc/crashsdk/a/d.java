package com.uc.crashsdk.a;

import android.os.Process;
import com.huawei.hms.framework.common.ContainerUtils;
import com.umeng.commonsdk.framework.UMModuleRegister;
import java.util.Locale;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ boolean f104161a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f104162b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static boolean f104164d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f104165e = "hsdk";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static String f104166f = "alid ";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f104167g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f104169i;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f104163c = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Object f104168h = new Object();

    private static StringBuilder a(StringBuilder sb2, String str, String str2) {
        if (sb2.length() > 0) {
            sb2.append("`");
        }
        sb2.append(str);
        sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
        sb2.append(str2);
        return sb2;
    }

    public static void a() {
        f.a(0, new e(500), com.uc.crashsdk.b.H() ? 900000L : 90000L);
    }

    public static void a(int i10) {
        if (i10 != 500) {
            if (!f104161a) {
                throw new AssertionError();
            }
            return;
        }
        synchronized (f104163c) {
            f104167g = null;
            a(!com.uc.crashsdk.b.F());
            if (g.b(f104167g)) {
                h.a(f104167g);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0052  */
    private static boolean a(boolean z10) throws Throwable {
        int iC;
        boolean z11;
        String str;
        if (f104164d) {
            return false;
        }
        f104164d = !z10;
        if ((com.uc.crashsdk.a.f104131b.equals(org.apache.tools.ant.taskdefs.optional.ejb.g.a.f134950d) && com.uc.crashsdk.b.c(536870912)) || !com.uc.crashsdk.b.A()) {
            return false;
        }
        String strN = com.uc.crashsdk.b.n();
        String strA = b.a(strN);
        String str2 = null;
        long jC = 0;
        if (g.b(strA)) {
            String[] strArrSplit = strA.split(" ", 4);
            if (strArrSplit.length == 3) {
                str2 = strArrSplit[0];
                jC = g.c(strArrSplit[1]);
                iC = (int) g.c(strArrSplit[2]);
            } else {
                iC = 0;
            }
        } else {
            iC = 0;
        }
        f104162b = true;
        if (System.currentTimeMillis() - jC >= 259200000) {
            z11 = true;
        } else {
            if (!"o".equals(str2)) {
                if ("2".equals(str2)) {
                    f104162b = false;
                } else {
                    if ("1".equals(str2)) {
                        f104162b = false;
                    }
                    z11 = true;
                }
            }
            z11 = false;
        }
        if (!z11 || z10) {
            return true;
        }
        if (iC == Process.myPid()) {
            return false;
        }
        f104167g = "per";
        String strG = g();
        if (strG == null || !strG.contains("retcode=")) {
            if (strG == null) {
                f104167g = "ner";
            } else {
                f104167g = "ser";
            }
            return false;
        }
        if (strG.contains("retcode=0")) {
            f104162b = true;
            str = "o";
            f104167g = "aus";
        } else {
            f104162b = false;
            if ("1".equals(str2)) {
                str = "2";
                f104167g = "auf2";
            } else {
                str = "1";
                f104167g = "auf1";
            }
        }
        b.a(strN, String.format(Locale.US, "%s %d %d", str, Long.valueOf(System.currentTimeMillis()), Integer.valueOf(Process.myPid())));
        if (g.b(strG)) {
            for (String str3 : strG.split("`", 30)) {
                String[] strArrSplit2 = str3.split(ContainerUtils.KEY_VALUE_DELIMITER, 2);
                if (strArrSplit2.length == 2) {
                    String strTrim = strArrSplit2[0].trim();
                    String strTrim2 = strArrSplit2[1].trim();
                    boolean z12 = g.b(strTrim2) && strTrim2.startsWith("http");
                    if ("logurl".equals(strTrim)) {
                        if (z12) {
                            com.uc.crashsdk.e.b(strTrim2);
                        }
                    } else if ("staturl".equals(strTrim)) {
                        if (z12) {
                            h.b(strTrim2);
                        }
                    } else if ("policyurl".equals(strTrim)) {
                        if (z12) {
                            synchronized (f104168h) {
                                f104169i = strTrim2;
                                b.a(com.uc.crashsdk.b.j(), strTrim2 + "\n");
                            }
                        } else {
                            continue;
                        }
                    } else if ("logpolicy".equals(strTrim)) {
                        com.uc.crashsdk.e.c(strTrim2);
                    }
                }
            }
        }
        return true;
    }

    public static String b() {
        try {
            return "inv" + f104166f + "cras" + f104165e;
        } catch (Throwable th2) {
            g.b(th2);
            return "";
        }
    }

    public static void c() {
        synchronized (f104168h) {
            f104169i = null;
        }
    }

    static byte[] d() {
        return new byte[]{6, 0, com.google.common.base.a.A, 8};
    }

    public static boolean e() {
        try {
            if (!com.uc.crashsdk.e.F() && !com.uc.crashsdk.b.L()) {
                a(true);
                return f104162b;
            }
            return true;
        } catch (Throwable unused) {
        }
    }

    private static String f() {
        String strA = f104169i;
        if (g.a(strA)) {
            synchronized (f104168h) {
                strA = g.a(com.uc.crashsdk.b.j(), (com.uc.crashsdk.g.R() ? "https://errlogos.umeng.com" : "https://errlog.umeng.com") + "/api/crashsdk/validate", true);
                f104169i = strA;
            }
        }
        return strA;
    }

    private static String g() {
        byte[] bArrA;
        String strF;
        byte[] bArrA2;
        byte[] bArrA3;
        StringBuilder sb2 = new StringBuilder();
        a(sb2, "platform", com.uc.crashsdk.g.e());
        a(sb2, "pkgname", com.uc.crashsdk.a.f104130a);
        a(sb2, UMModuleRegister.PROCESS, com.uc.crashsdk.e.h());
        a(sb2, "version", com.uc.crashsdk.a.a());
        a(sb2, "cver", "3.3.2.2");
        a(sb2, "ctag", "release");
        a(sb2, "inter", com.uc.crashsdk.g.R() ? "true" : "false");
        a(sb2, "os", "android");
        String string = sb2.toString();
        byte[] bArr = new byte[16];
        c.a(bArr, 0, h.j());
        c.a(bArr, 4, c.a());
        c.a(bArr, 8, d());
        c.a(bArr, 12, com.uc.crashsdk.a.f());
        try {
            bArrA = c.a(string.getBytes(), bArr, true);
        } catch (Throwable th2) {
            g.a(th2);
            bArrA = null;
        }
        if (bArrA == null || (strF = f()) == null || (bArrA2 = c.a(strF, bArrA)) == null) {
            return null;
        }
        try {
            bArrA3 = c.a(bArrA2, bArr, false);
        } catch (Throwable th3) {
            g.a(th3);
            bArrA3 = null;
        }
        if (bArrA3 != null) {
            return new String(bArrA3);
        }
        return null;
    }
}
