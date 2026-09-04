package com.ishumei.smantifraud.l111l11111I1l.l1111l111111Il;

import android.content.Context;
import android.os.Build;
import com.ishumei.smantifraud.SmAntiFraud;

/* JADX INFO: loaded from: classes6.dex */
public class l111l1111llIl {
    private static final long l1111l111111Il = 2000;
    private static boolean l111l11111Il = false;
    private static boolean l111l1111l1Il = false;
    private static String l111l1111lI1l = "build1";
    private static String l111l1111lIl = "android";
    private static String l111l1111llIl = "3.8.0";
    private static final String l11l1111I11l = "api-fp-retry-bj.fengkongcloud.com";
    private static final String l11l1111I1l = "fp-sa-it.fengkongcloud.com";
    private static final String l11l1111I1ll = "api-fp-retry-sa.fengkongcloud.com";
    private static final String l11l1111Il = "fp-na-it-acc.fengkongcloud.com";
    private static final String l11l1111Il1l = "api-fp-retry-na.fengkongcloud.com";
    private static final String l11l1111Ill = "/deviceprofile/v4";
    private static final String l11l1111lIIl = "fp-it.fengkongcloud.com";
    private static int l11l111l11Il = 30;
    private static final String l11l11IlIIll = "/v3/cloudconf";
    private l111l1111lI1l l111l11111I1l;
    private final Context l111l11111lIl;

    public l111l1111llIl() {
    }

    /* JADX WARN: Code duplicated, block: B:40:0x00b4  */
    public l111l1111llIl(Context context) {
        l111l1111lI1l l111l11111lil;
        this.l111l11111lIl = context;
        if (context != null) {
            String lowerCase = Build.MANUFACTURER.toLowerCase();
            if (lowerCase.contains("asus")) {
                l111l11111lil = new l1111l111111Il(context);
            } else if (lowerCase.contains("huawei") || lowerCase.contains("honor")) {
                l111l11111lil = new l111l11111lIl(context);
            } else if (lowerCase.contains("lenovo")) {
                l111l11111lil = new l111l11111I1l(context);
            } else if (lowerCase.contains("meizu")) {
                l111l11111lil = new l111l11111Il(context);
            } else if (lowerCase.contains("nubia")) {
                l111l11111lil = new l111l1111l1Il(context);
            } else if (lowerCase.contains("oneplus")) {
                l111l11111lil = new l111l1111lIl(context);
            } else if (lowerCase.contains("oppo")) {
                l111l11111lil = new l11l1111lIIl(context);
            } else if (lowerCase.contains("samsung")) {
                l111l11111lil = new l11l1111I11l(context);
            } else if (lowerCase.contains("vivo")) {
                l111l11111lil = new l11l1111I1l(context);
            } else if (lowerCase.contains("xiaomi")) {
                l111l11111lil = new l11l1111I1ll(context);
            } else if (lowerCase.contains("zte")) {
                l111l11111lil = new l11l1111Il(context);
            } else {
                l111l11111lil = null;
            }
        } else {
            l111l11111lil = null;
        }
        this.l111l11111I1l = l111l11111lil;
    }

    public static String l1111l111111Il(String str) {
        str.hashCode();
        switch (str) {
            case "bj":
                return "001";
            case "xjp":
                return "010";
            case "fjny":
                return "011";
            default:
                return str;
        }
    }

    public static String l1111l111111Il(String str, boolean z10) {
        return l1111l111111Il(z10) + l111l11111Il(str, false) + l11l1111Ill;
    }

    private static String l1111l111111Il(boolean z10) {
        return z10 ? "https://" : "http://";
    }

    public static String l111l11111I1l(String str, boolean z10) {
        return l1111l111111Il(z10) + l111l11111Il(str, false) + l11l11IlIIll;
    }

    private static String l111l11111Il(String str, boolean z10) {
        str.hashCode();
        if (str.equals(SmAntiFraud.AREA_XJP)) {
            return z10 ? l11l1111I1ll : l11l1111I1l;
        }
        if (str.equals(SmAntiFraud.AREA_FJNY)) {
            return z10 ? l11l1111Il1l : l11l1111Il;
        }
        return z10 ? l11l1111I11l : l11l1111lIIl;
    }

    private l111l1111lI1l l111l11111lIl() {
        if (this.l111l11111lIl == null) {
            return null;
        }
        String lowerCase = Build.MANUFACTURER.toLowerCase();
        if (lowerCase.contains("asus")) {
            return new l1111l111111Il(this.l111l11111lIl);
        }
        if (lowerCase.contains("huawei") || lowerCase.contains("honor")) {
            return new l111l11111lIl(this.l111l11111lIl);
        }
        if (lowerCase.contains("lenovo")) {
            return new l111l11111I1l(this.l111l11111lIl);
        }
        if (lowerCase.contains("meizu")) {
            return new l111l11111Il(this.l111l11111lIl);
        }
        if (lowerCase.contains("nubia")) {
            return new l111l1111l1Il(this.l111l11111lIl);
        }
        if (lowerCase.contains("oneplus")) {
            return new l111l1111lIl(this.l111l11111lIl);
        }
        if (lowerCase.contains("oppo")) {
            return new l11l1111lIIl(this.l111l11111lIl);
        }
        if (lowerCase.contains("samsung")) {
            return new l11l1111I11l(this.l111l11111lIl);
        }
        if (lowerCase.contains("vivo")) {
            return new l11l1111I1l(this.l111l11111lIl);
        }
        if (lowerCase.contains("xiaomi")) {
            return new l11l1111I1ll(this.l111l11111lIl);
        }
        if (lowerCase.contains("zte")) {
            return new l11l1111Il(this.l111l11111lIl);
        }
        return null;
    }

    public static String l111l11111lIl(String str, boolean z10) {
        return l1111l111111Il(z10) + l111l11111Il(str, true) + l11l1111Ill;
    }

    public final String l1111l111111Il() {
        l111l1111lI1l l111l1111li1l = this.l111l11111I1l;
        return l111l1111li1l == null ? "" : l111l1111li1l.l1111l111111Il(2000L);
    }
}
