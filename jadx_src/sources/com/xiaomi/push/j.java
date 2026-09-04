package com.xiaomi.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.igexin.assist.sdk.AssistPushConsts;
import com.tencent.thumbplayer.tcmedia.core.common.TPSystemInfo;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile int f107557a = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static Map<String, m> f653a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f107558b = -1;

    public static int a() {
        if (f107557a == 0) {
            try {
                int i10 = 1;
                if (!((TextUtils.isEmpty(m518a("ro.miui.ui.version.code")) && TextUtils.isEmpty(m518a("ro.miui.ui.version.name"))) ? false : true)) {
                    i10 = 2;
                }
                f107557a = i10;
            } catch (Throwable th2) {
                com.xiaomi.channel.commonutils.logger.b.a("get isMIUI failed", th2);
                f107557a = 0;
            }
            com.xiaomi.channel.commonutils.logger.b.b("isMIUI's value is: " + f107557a);
        }
        return f107557a;
    }

    public static int a(Context context) {
        String strM518a = m518a("ro.miui.ui.version.code");
        if (TextUtils.isEmpty(strM518a) || !TextUtils.isDigitsOnly(strM518a)) {
            return 0;
        }
        return Integer.parseInt(strM518a);
    }

    public static m a(String str) {
        m mVarB = b(str);
        return mVarB == null ? m.Global : mVarB;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m517a() {
        int iA = C1339r.a();
        if (!m520a() || iA <= 0) {
            return "";
        }
        if (iA < 2) {
            return "alpha";
        }
        return iA < 3 ? "development" : "stable";
    }

    public static String a(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.toString() + " " + a(intent.getExtras());
    }

    public static String a(Bundle bundle) {
        StringBuilder sb2 = new StringBuilder("Bundle[");
        if (bundle == null) {
            sb2.append("null");
        } else {
            boolean z10 = true;
            for (String str : bundle.keySet()) {
                if (!z10) {
                    sb2.append(", ");
                }
                sb2.append(str);
                sb2.append(n5.a.f132013h);
                Object obj = bundle.get(str);
                if (obj instanceof int[]) {
                    sb2.append(Arrays.toString((int[]) obj));
                } else if (obj instanceof byte[]) {
                    sb2.append(Arrays.toString((byte[]) obj));
                } else if (obj instanceof boolean[]) {
                    sb2.append(Arrays.toString((boolean[]) obj));
                } else if (obj instanceof short[]) {
                    sb2.append(Arrays.toString((short[]) obj));
                } else if (obj instanceof long[]) {
                    sb2.append(Arrays.toString((long[]) obj));
                } else if (obj instanceof float[]) {
                    sb2.append(Arrays.toString((float[]) obj));
                } else if (obj instanceof double[]) {
                    sb2.append(Arrays.toString((double[]) obj));
                } else if (obj instanceof String[]) {
                    sb2.append(Arrays.toString((String[]) obj));
                } else if (obj instanceof CharSequence[]) {
                    sb2.append(Arrays.toString((CharSequence[]) obj));
                } else if (obj instanceof Parcelable[]) {
                    sb2.append(Arrays.toString((Parcelable[]) obj));
                } else if (obj instanceof Bundle) {
                    sb2.append(a((Bundle) obj));
                } else {
                    sb2.append(obj);
                }
                z10 = false;
            }
        }
        sb2.append("]");
        return sb2.toString();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static String m518a(String str) {
        try {
            try {
                return (String) bk.a("android.os.SystemProperties", "get", str, "");
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.d("fail to get property. " + e10);
                return null;
            }
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    private static void m519a() {
        if (f653a != null) {
            return;
        }
        HashMap map = new HashMap();
        f653a = map;
        map.put(com.huawei.hms.feature.dynamic.f.e.f60734e, m.China);
        Map<String, m> map2 = f653a;
        m mVar = m.Europe;
        map2.put("FI", mVar);
        f653a.put("SE", mVar);
        f653a.put("NO", mVar);
        f653a.put("FO", mVar);
        f653a.put("EE", mVar);
        f653a.put("LV", mVar);
        f653a.put("LT", mVar);
        f653a.put("BY", mVar);
        f653a.put("MD", mVar);
        f653a.put("UA", mVar);
        f653a.put("PL", mVar);
        f653a.put("CZ", mVar);
        f653a.put("SK", mVar);
        f653a.put("HU", mVar);
        f653a.put("DE", mVar);
        f653a.put("AT", mVar);
        f653a.put("CH", mVar);
        f653a.put("LI", mVar);
        f653a.put("GB", mVar);
        f653a.put("IE", mVar);
        f653a.put("NL", mVar);
        f653a.put("BE", mVar);
        f653a.put("LU", mVar);
        f653a.put("FR", mVar);
        f653a.put("RO", mVar);
        f653a.put("BG", mVar);
        f653a.put("RS", mVar);
        f653a.put("MK", mVar);
        f653a.put("AL", mVar);
        f653a.put("GR", mVar);
        f653a.put("SI", mVar);
        f653a.put("HR", mVar);
        f653a.put("IT", mVar);
        f653a.put("SM", mVar);
        f653a.put("MT", mVar);
        f653a.put("ES", mVar);
        f653a.put(AssistPushConsts.MSG_VALUE_PAYLOAD, mVar);
        f653a.put("AD", mVar);
        f653a.put("CY", mVar);
        f653a.put("DK", mVar);
        f653a.put("IS", mVar);
        f653a.put("UK", mVar);
        f653a.put("EL", mVar);
        f653a.put("RU", m.Russia);
        f653a.put("IN", m.India);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m520a() {
        return a() == 1;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m521a(Context context) {
        return context != null && m522a(context.getPackageName());
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m522a(String str) {
        return "com.xiaomi.xmsf".equals(str);
    }

    public static int b(Context context) {
        try {
            return context.getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode;
        } catch (Exception unused) {
            return 0;
        }
    }

    private static m b(String str) {
        m519a();
        return f653a.get(str.toUpperCase());
    }

    public static String b() {
        String strA = q.a("ro.miui.region", "");
        if (TextUtils.isEmpty(strA)) {
            strA = q.a("persist.sys.oppo.region", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = q.a("ro.oppo.regionmark", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = q.a("ro.vendor.oplus.regionmark", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = q.a("ro.hw.country", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = q.a("ro.csc.countryiso_code", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = m523b(q.a("ro.product.country.region", ""));
        }
        if (TextUtils.isEmpty(strA)) {
            strA = q.a("gsm.vivo.countrycode", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = q.a("persist.sys.oem.region", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = q.a("ro.product.locale.region", "");
        }
        if (TextUtils.isEmpty(strA)) {
            strA = q.a("persist.sys.country", "");
        }
        if (!TextUtils.isEmpty(strA)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("get region from system, region = " + strA);
        }
        if (!TextUtils.isEmpty(strA)) {
            return strA;
        }
        String country = Locale.getDefault().getCountry();
        com.xiaomi.channel.commonutils.logger.b.m62a("locale.default.country = " + country);
        return country;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    private static String m523b(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        String[] strArrSplit = str.split(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        return strArrSplit.length > 0 ? strArrSplit[0] : str;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public static boolean m524b() {
        return a() == 2;
    }

    public static String c() {
        return m518a("ro.miui.ui.version.name");
    }

    /* JADX INFO: renamed from: c, reason: collision with other method in class */
    public static boolean m525c() {
        if (f107558b < 0) {
            f107558b = !m527e() ? 1 : 0;
        }
        return f107558b > 0;
    }

    public static String d() {
        return m518a("ro.build.characteristics");
    }

    /* JADX INFO: renamed from: d, reason: collision with other method in class */
    public static boolean m526d() {
        return !m.China.name().equalsIgnoreCase(a(b()).name());
    }

    public static String e() {
        return m518a(TPSystemInfo.KEY_PROPERTY_MANUFACTURER);
    }

    /* JADX INFO: renamed from: e, reason: collision with other method in class */
    public static boolean m527e() {
        String strA = "";
        try {
            strA = q.a("ro.miui.ui.version.code", "");
        } catch (Exception unused) {
        }
        return !TextUtils.isEmpty(strA);
    }
}
