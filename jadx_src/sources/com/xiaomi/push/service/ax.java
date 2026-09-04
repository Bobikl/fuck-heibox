package com.xiaomi.push.service;

import android.app.Notification;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import androidx.core.app.o0;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ax {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a<String, String, String> f107891a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a<String, String, String> f107892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a<String, String, String> f107893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a<String, String, String> f107894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a<String, String, String> f107895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a<String, String, String> f107896f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a<String, String, String> f107897g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a<String, String, String> f107898h;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static final String[] f1027a = {"com.mi.globalbrowser", "com.android.browser"};

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private static String f1026a = null;

    public static class a<F, S, T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        F f107899a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        S f107900b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        T f107901c;

        private a(F f10, S s10, T t10) {
            this.f107899a = f10;
            this.f107900b = s10;
            this.f107901c = t10;
        }
    }

    static {
        String str = "getNotificationSettings";
        f107891a = new a<>(str, str, str);
        String str2 = "canSound";
        f107892b = new a<>("setSound", str2, str2);
        String str3 = "canVibrate";
        f107893c = new a<>("setVibrate", str3, str3);
        String str4 = "canLights";
        f107894d = new a<>("setLights", str4, str4);
        String str5 = "canShowOnKeyguard";
        f107895e = new a<>("setShowOnKeyguard", str5, str5);
        f107896f = new a<>("setFloat", "canFloat", "canShowFloat");
        String str6 = "canShowBadge";
        f107897g = new a<>("setShowBadge", str6, str6);
        String str7 = "canShowOngoing";
        f107898h = new a<>("setShowOngoing", str7, str7);
    }

    public static int a(ContentResolver contentResolver) {
        try {
            return Settings.Global.getInt(contentResolver, "user_aggregate", 0);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("get user aggregate failed, " + e10);
            return 0;
        }
    }

    static int a(Context context, String str) {
        return com.xiaomi.push.g.b(context, str);
    }

    public static int a(Context context, String str, String str2, a<String, String, String> aVar) {
        if (aVar == null) {
            return -1;
        }
        try {
            Bundle bundleA = a(context, aVar.f107900b, str, str2, (Bundle) null);
            if (bundleA == null || !bundleA.containsKey(aVar.f107901c)) {
                return -1;
            }
            return bundleA.getBoolean(aVar.f107901c) ? 1 : 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public static Bundle a(Context context, String str, String str2) {
        try {
            return a(context, f107891a.f107900b, str, str2, (Bundle) null);
        } catch (Exception unused) {
            return null;
        }
    }

    private static Bundle a(Context context, String str, String str2, String str3, Bundle bundle) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            throw new IllegalArgumentException("call notification provider failed!");
        }
        Bundle bundle2 = new Bundle();
        bundle2.putString("package", str2);
        if (!TextUtils.isEmpty(str3)) {
            bundle2.putString("channel_id", str3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        return context.getContentResolver().call(Uri.parse("content://statusbar.notification"), str, (String) null, bundle2);
    }

    public static <T> T a(Notification notification, String str) {
        Bundle bundle = notification.extras;
        if (bundle == null) {
            return null;
        }
        try {
            return (T) bundle.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0051  */
    /* JADX WARN: Code duplicated, block: B:22:? A[RETURN, SYNTHETIC] */
    public static <T> T a(Object obj, String str, T t10) {
        Object objA;
        Object obj2 = null;
        try {
            if (obj instanceof Notification) {
                objA = a((Notification) obj, str);
            } else {
                if (!(obj instanceof Map)) {
                    if (obj instanceof Bundle) {
                        objA = ((Bundle) obj).get(str);
                    } else {
                        com.xiaomi.channel.commonutils.logger.b.m62a("not support get value from classType:" + obj);
                    }
                    if (obj2 == null) {
                        return t10;
                    }
                    return (T) obj2;
                }
                objA = ((Map) obj).get(str);
            }
            obj2 = objA;
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("get value error " + e10);
        }
        if (obj2 == null) {
            return t10;
        }
        return (T) obj2;
    }

    public static String a(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(o0.B);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(o0.C);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customTitle");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static String a(Object obj) {
        return (String) a(obj, "msg_busi_type", "");
    }

    static void a(Notification notification, int i10) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putInt("miui.messageCount", i10);
            }
            Object objA = com.xiaomi.push.bk.a(notification, "extraNotification");
            if (objA != null) {
                com.xiaomi.push.bk.a(objA, "setMessageCount", Integer.valueOf(i10));
            }
        } catch (Exception unused) {
        }
    }

    static void a(Notification notification, int i10, int i11) {
        if (notification != null) {
            if (notification.extras == null) {
                notification.extras = new Bundle();
            }
            notification.extras.putInt("is_priority", i10);
            notification.extras.putInt("mipush_class", i11);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    static void m721a(Notification notification, String str) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE, str);
            }
            Object objA = com.xiaomi.push.bk.a(notification, "extraNotification");
            if (objA != null) {
                com.xiaomi.push.bk.a(objA, "setTargetPkg", str);
            }
        } catch (Exception unused) {
        }
    }

    static void a(Notification notification, boolean z10) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableFloat", z10);
            }
            Object objA = com.xiaomi.push.bk.a(notification, "extraNotification");
            if (objA != null) {
                com.xiaomi.push.bk.a(objA, "setEnableFloat", Boolean.valueOf(z10));
            }
        } catch (Exception unused) {
        }
    }

    static void a(Context context, String str, Intent intent) {
        if (intent == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        arrayList.addAll(Arrays.asList(f1027a));
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            String str2 = (String) arrayList.get(i10);
            if (!TextUtils.isEmpty(str2)) {
                Intent intent2 = new Intent(intent);
                intent2.setPackage(str2);
                try {
                    if (context.getPackageManager().resolveActivity(intent2, 65536) != null) {
                        intent.setPackage(str2);
                        break;
                    }
                    continue;
                } catch (Exception e10) {
                    com.xiaomi.channel.commonutils.logger.b.m62a("can't match url intent. " + e10);
                }
            }
        }
        intent.setPackage(intent.getPackage());
    }

    public static void a(Map<String, String> map, Bundle bundle, String str) {
        if (map == null || bundle == null || TextUtils.isEmpty(str)) {
            com.xiaomi.channel.commonutils.logger.b.m62a("cp map to b fail:" + str);
            return;
        }
        if (TextUtils.isEmpty(map.get(str))) {
            bundle.remove(str);
        } else {
            bundle.putString(str, map.get(str));
        }
    }

    public static boolean a(Notification.Builder builder, boolean z10) {
        if (Build.VERSION.SDK_INT >= 26) {
            builder.setGroupAlertBehavior(z10 ? 2 : 1);
            return true;
        }
        com.xiaomi.channel.commonutils.logger.b.b("not support setGroupAlertBehavior");
        return false;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static boolean m722a(ContentResolver contentResolver) {
        int iA = a(contentResolver);
        return iA == 1 || iA == 2;
    }

    public static boolean a(Context context, String str, String str2, a<String, String, String> aVar, boolean z10) {
        if (aVar != null) {
            try {
                Bundle bundle = new Bundle();
                bundle.putBoolean(aVar.f107901c, z10);
                a(context, aVar.f107899a, str, str2, bundle);
                return true;
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static boolean a(Map<String, String> map) {
        return Boolean.parseBoolean((String) a(map, "not_suppress", "true"));
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static Notification.Action[] m723a(Notification notification) {
        Parcelable[] parcelableArray;
        Notification.Action[] actionArr = notification.actions;
        if (actionArr != null) {
            return actionArr;
        }
        Bundle bundle = notification.extras;
        if (bundle == null || (parcelableArray = bundle.getParcelableArray("mipush.customActions")) == null) {
            return null;
        }
        return (Notification.Action[]) Arrays.copyOf(parcelableArray, parcelableArray.length, Notification.Action[].class);
    }

    public static String b(Notification notification) {
        CharSequence charSequence;
        Bundle bundle = notification.extras;
        if (bundle != null) {
            charSequence = bundle.getCharSequence(o0.D);
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence(o0.I);
            }
            if (TextUtils.isEmpty(charSequence)) {
                charSequence = notification.extras.getCharSequence("mipush.customContent");
            }
        } else {
            charSequence = null;
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    public static void b(Notification notification, boolean z10) {
        try {
            Bundle bundle = notification.extras;
            if (bundle != null) {
                bundle.putBoolean("miui.enableKeyguard", z10);
            }
            Object objA = com.xiaomi.push.bk.a(notification, "extraNotification");
            if (objA != null) {
                com.xiaomi.push.bk.a(objA, "setEnableKeyguard", Boolean.valueOf(z10));
            }
        } catch (Exception unused) {
        }
    }

    public static String c(Notification notification) {
        Object objA;
        String string = null;
        try {
            Bundle bundle = notification.extras;
            string = bundle != null ? bundle.getString(HiAnalyticsConstant.BI_KEY_TARGET_PACKAGE) : null;
            return (!TextUtils.isEmpty(string) || (objA = com.xiaomi.push.bk.a(notification, "extraNotification")) == null) ? string : (String) com.xiaomi.push.bk.a(objA, "getTargetPkg", new Object[0]);
        } catch (Exception unused) {
            return string;
        }
    }
}
