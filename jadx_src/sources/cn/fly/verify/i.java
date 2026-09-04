package cn.fly.verify;

import android.text.TextUtils;
import anet.channel.entity.ConnType;

/* JADX INFO: loaded from: classes6.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f36861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f36862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static String f36863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static String f36864d;

    public static String a() {
        if (TextUtils.isEmpty(f36861a)) {
            f36861a = "api-auth.zztfly.com";
        }
        return f36861a;
    }

    public static String a(int i10) {
        StringBuilder sb2;
        String strA;
        String str = "api";
        if (i10 != 1) {
            if (i10 == 2) {
                strA = a("https://" + b());
                str = "conf";
            } else if (i10 == 3) {
                strA = a("https://" + c());
                str = ConnType.PK_CDN;
            } else if (i10 == 4) {
                strA = a("https://" + d());
                str = "log";
            } else {
                sb2 = new StringBuilder();
            }
            return a(strA, str, false);
        }
        sb2 = new StringBuilder();
        sb2.append("https://");
        sb2.append(a());
        strA = a(sb2.toString());
        return a(strA, str, false);
    }

    private static String a(String str) {
        if (TextUtils.isEmpty(str) || str.endsWith("/")) {
            return str;
        }
        return str + "/";
    }

    private static String a(String str, String str2, boolean z10) {
        String strA;
        try {
            strA = ax.a(FlyVerify.sdkTag, str2, str, z10);
        } catch (Throwable th2) {
            f.a().a(th2);
            strA = null;
        }
        if (TextUtils.isEmpty(strA)) {
            strA = str;
        }
        if (!strA.startsWith("https://")) {
            strA = a("https://" + strA);
        }
        try {
            return ax.a(strA);
        } catch (Throwable th3) {
            f.a().a(th3);
            return "https://" + str;
        }
    }

    public static String b() {
        if (TextUtils.isEmpty(f36862b)) {
            f36862b = "conf-auth.zztfly.com";
        }
        return f36862b;
    }

    public static String c() {
        if (TextUtils.isEmpty(f36863c)) {
            f36863c = "cdn-api-auth.zztfly.com";
        }
        return f36863c;
    }

    public static String d() {
        if (TextUtils.isEmpty(f36864d)) {
            f36864d = "log-auth.zztfly.com";
        }
        return f36864d;
    }
}
