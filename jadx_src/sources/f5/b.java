package f5;

import z5.g;

/* JADX INFO: loaded from: classes6.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static boolean f118752a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f118753b;

    public static String a() {
        com.alipay.sdk.m.j.c cVarB = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.CANCELED.b());
        return b(cVarB.b(), cVarB.a(), "");
    }

    public static String b(int i10, String str, String str2) {
        return "resultStatus={" + i10 + "};memo={" + str + "};result={" + str2 + g.f141884d;
    }

    public static void c(String str) {
        f118753b = str;
    }

    public static void d(boolean z10) {
        f118752a = z10;
    }

    public static String e() {
        com.alipay.sdk.m.j.c cVarB = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.DOUBLE_REQUEST.b());
        return b(cVarB.b(), cVarB.a(), "");
    }

    public static boolean f() {
        return f118752a;
    }

    public static String g() {
        return f118753b;
    }

    public static String h() {
        com.alipay.sdk.m.j.c cVarB = com.alipay.sdk.m.j.c.b(com.alipay.sdk.m.j.c.PARAMS_ERROR.b());
        return b(cVarB.b(), cVarB.a(), "");
    }
}
