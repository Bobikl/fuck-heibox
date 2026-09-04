package com.ishumei.smantifraud.l111l11111lIl;

import com.ishumei.smantifraud.SmAntiFraud;

/* JADX INFO: loaded from: classes6.dex */
public final class l111l1111llIl {
    private static boolean l1111l111111Il = false;
    private static String l111l11111I1l = "3.8.0";
    private static String l111l11111Il = "build1";
    private static boolean l111l11111lIl = false;
    private static String l111l1111l1Il = "android";
    private static final String l111l1111lI1l = "api-fp-retry-bj.fengkongcloud.com";
    private static final String l111l1111lIl = "fp-sa-it.fengkongcloud.com";
    private static final String l111l1111llIl = "fp-it.fengkongcloud.com";
    private static final String l11l1111I11l = "fp-na-it-acc.fengkongcloud.com";
    private static final String l11l1111I1l = "api-fp-retry-na.fengkongcloud.com";
    private static final String l11l1111I1ll = "/deviceprofile/v4";
    private static final String l11l1111Il = "/v3/cloudconf";
    private static int l11l1111Il1l = 30;
    private static final String l11l1111lIIl = "api-fp-retry-sa.fengkongcloud.com";

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
        return l1111l111111Il(z10) + l111l11111Il(str, false) + l11l1111I1ll;
    }

    private static String l1111l111111Il(boolean z10) {
        return z10 ? "https://" : "http://";
    }

    public static String l111l11111I1l(String str, boolean z10) {
        return l1111l111111Il(z10) + l111l11111Il(str, false) + l11l1111Il;
    }

    private static String l111l11111Il(String str, boolean z10) {
        str.hashCode();
        if (str.equals(SmAntiFraud.AREA_XJP)) {
            return z10 ? l11l1111lIIl : l111l1111lIl;
        }
        if (str.equals(SmAntiFraud.AREA_FJNY)) {
            return z10 ? l11l1111I1l : l11l1111I11l;
        }
        return z10 ? l111l1111lI1l : l111l1111llIl;
    }

    public static String l111l11111lIl(String str, boolean z10) {
        return l1111l111111Il(z10) + l111l11111Il(str, true) + l11l1111I1ll;
    }
}
