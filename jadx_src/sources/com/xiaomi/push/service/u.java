package com.xiaomi.push.service;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.push.BuildConfig;
import com.xiaomi.push.C1339r;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f108037a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final String f1114a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f108038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f108039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f108040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f108041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f108042f;

    public u(String str, String str2, String str3, String str4, String str5, String str6, int i10) {
        this.f1114a = str;
        this.f108038b = str2;
        this.f108039c = str3;
        this.f108040d = str4;
        this.f108041e = str5;
        this.f108042f = str6;
        this.f108037a = i10;
    }

    private static String a(Context context) {
        if (!"com.xiaomi.xmsf".equals(context)) {
            return com.xiaomi.push.j.b();
        }
        if (!TextUtils.isEmpty(null)) {
            return null;
        }
        String strM518a = com.xiaomi.push.j.m518a("ro.miui.region");
        return TextUtils.isEmpty(strM518a) ? com.xiaomi.push.j.m518a("ro.product.locale.region") : strM518a;
    }

    public static boolean a() {
        try {
            return C1339r.a(null, "miui.os.Build").getField("IS_ALPHA_BUILD").getBoolean(null);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m772a(Context context) {
        return "com.xiaomi.xmsf".equals(context.getPackageName()) && a();
    }

    private static boolean b(Context context) {
        return context.getPackageName().equals("com.xiaomi.xmsf");
    }

    public bf.b a(XMPushService xMPushService) {
        bf.b bVar = new bf.b(xMPushService);
        a(bVar, xMPushService, xMPushService.m684b(), com.umeng.analytics.pro.ak.aF);
        return bVar;
    }

    public bf.b a(bf.b bVar, Context context, k kVar, String str) {
        bVar.f1043a = context.getPackageName();
        bVar.f1046b = this.f1114a;
        bVar.f107918h = this.f108039c;
        bVar.f107913c = this.f108038b;
        bVar.f107917g = "5";
        bVar.f107914d = "XMPUSH-PASS";
        bVar.f1045a = false;
        com.xiaomi.push.s.a aVar = new com.xiaomi.push.s.a();
        aVar.a("sdk_ver", 48).a("cpvn", BuildConfig.VERSION_NAME).a("cpvc", Integer.valueOf(BuildConfig.VERSION_CODE)).a("country_code", a.a(context).b()).a("region", a.a(context).a()).a("miui_vn", com.xiaomi.push.j.c()).a("miui_vc", Integer.valueOf(com.xiaomi.push.j.a(context))).a("xmsf_vc", Integer.valueOf(com.xiaomi.push.g.a(context, "com.xiaomi.xmsf"))).a("android_ver", Integer.valueOf(Build.VERSION.SDK_INT)).a("n_belong_to_app", Boolean.valueOf(aw.m712a(context))).a("systemui_vc", Integer.valueOf(com.xiaomi.push.g.a(context)));
        String strA = a(context);
        if (!TextUtils.isEmpty(strA)) {
            aVar.a("latest_country_code", strA);
        }
        String strD = com.xiaomi.push.j.d();
        if (!TextUtils.isEmpty(strD)) {
            aVar.a("device_ch", strD);
        }
        String strE = com.xiaomi.push.j.e();
        if (!TextUtils.isEmpty(strE)) {
            aVar.a("device_mfr", strE);
        }
        bVar.f107915e = aVar.toString();
        String str2 = b(context) ? "1000271" : this.f108040d;
        com.xiaomi.push.s.a aVar2 = new com.xiaomi.push.s.a();
        aVar2.a("appid", str2).a("locale", Locale.getDefault().toString()).a("sync", 1);
        if (m772a(context)) {
            aVar2.a("ab", str);
        }
        bVar.f107916f = aVar2.toString();
        bVar.f1042a = kVar;
        return bVar;
    }
}
