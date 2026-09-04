package com.tencent.beacon.base.net.c;

import android.text.TextUtils;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: Constant.java */
/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f98919a = "https://otheve.beacon.qq.com/analytics/upload";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f98920b = "https://othstr.beacon.qq.com/analytics/upload";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f98921c = "oth.eve.mdt.qq.com";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static String f98922d = "oth.str.mdt.qq.com";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static boolean f98923e = false;

    public static String a(String str) {
        if (str == null || "".equals(str)) {
            return "";
        }
        String str2 = str.contains("https") ? "https://" : "http://";
        int iIndexOf = str.indexOf(str2);
        if (iIndexOf == -1) {
            return str;
        }
        String strSubstring = str.substring(iIndexOf + str2.length(), str.indexOf("/", str2.length()));
        int iIndexOf2 = strSubstring.indexOf(":");
        return iIndexOf2 != -1 ? strSubstring.substring(0, iIndexOf2) : strSubstring;
    }

    public static String a(boolean z10) {
        return z10 ? f98921c : f98919a;
    }

    public static void a(String str, String str2) {
        if (!TextUtils.isEmpty(str)) {
            f98922d = str;
            f98920b = f98920b.replace("othstr.beacon.qq.com", str);
            f98923e = true;
        }
        if (TextUtils.isEmpty(str2)) {
            return;
        }
        f98921c = str2;
        f98919a = f98919a.replace("otheve.beacon.qq.com", str2);
        f98923e = true;
    }

    public static String b(boolean z10) {
        return z10 ? f98922d : f98920b;
    }

    public static void b(String str) {
        if (TextUtils.isEmpty(str) || f98923e) {
            return;
        }
        f98921c = str;
    }

    public static void b(String str, String str2) {
        Pattern patternCompile = Pattern.compile("((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})(\\.((2(5[0-5]|[0-4]\\d))|[0-1]?\\d{1,2})){3}");
        Matcher matcher = patternCompile.matcher(str);
        Matcher matcher2 = patternCompile.matcher(str2);
        if (!matcher.matches() || !matcher2.matches()) {
            com.tencent.beacon.base.util.e.a("[event url] set report ip is not valid IP address!");
            return;
        }
        f98922d = str;
        f98920b = f98920b.replace("othstr.beacon.qq.com", str);
        f98921c = str2;
        String strReplace = f98919a.replace("otheve.beacon.qq.com", str2);
        f98919a = strReplace;
        com.tencent.beacon.base.util.c.a("[event url] ip modified by api, socketStrategyHost: %s, httpsStrategyUrl: %s, socketLogHost: %s ,httpsLogUrl: %s", f98922d, f98920b, f98921c, strReplace);
    }

    public static void c(String str) {
        if (TextUtils.isEmpty(str) || f98923e) {
            return;
        }
        f98919a = str;
    }

    public static void d(String str) {
        if (TextUtils.isEmpty(str) || f98923e) {
            return;
        }
        f98922d = str;
    }

    public static void e(String str) {
        if (TextUtils.isEmpty(str) || f98923e) {
            return;
        }
        f98920b = str;
    }
}
