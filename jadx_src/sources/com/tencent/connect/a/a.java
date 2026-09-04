package com.tencent.connect.a;

import android.content.Context;
import android.text.TextUtils;
import bb.c;
import com.tencent.connect.auth.QQToken;
import com.tencent.open.b.e;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.i;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: ProGuard */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Class<?> f99265a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Class<?> f99266b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static Method f99267c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Method f99268d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Method f99269e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f99270f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f99271g = false;

    public static void a(Context context, QQToken qQToken, String str, String... strArr) {
        if (f99271g) {
            b(context, qQToken);
            try {
                f99268d.invoke(f99266b, context, str, strArr);
            } catch (Exception e10) {
                SLog.e("OpenConfig", "trackCustomEvent exception: " + e10.toString());
            }
        }
    }

    public static boolean a(Context context, QQToken qQToken) {
        return i.a(context, qQToken.getAppId()).b("Common_ta_enable");
    }

    public static void b(Context context, QQToken qQToken) {
        try {
            if (a(context, qQToken)) {
                f99270f.invoke(f99265a, Boolean.TRUE);
            } else {
                f99270f.invoke(f99265a, Boolean.FALSE);
            }
        } catch (Exception e10) {
            SLog.e("OpenConfig", "checkStatStatus exception: " + e10.toString());
        }
    }

    public static void c(Context context, QQToken qQToken) {
        String str = "Aqc" + qQToken.getAppId();
        try {
            f99265a = Class.forName("com.tencent.stat.StatConfig");
            Class<?> cls = Class.forName("com.tencent.stat.StatService");
            f99266b = cls;
            f99267c = cls.getMethod("reportQQ", Context.class, String.class);
            f99268d = f99266b.getMethod("trackCustomEvent", Context.class, String.class, String[].class);
            Class<?> cls2 = f99266b;
            Class<?> cls3 = Integer.TYPE;
            f99269e = cls2.getMethod("commitEvents", Context.class, cls3);
            Class<?> cls4 = f99265a;
            Class<?> cls5 = Boolean.TYPE;
            f99270f = cls4.getMethod("setEnableStatService", cls5);
            b(context, qQToken);
            f99265a.getMethod("setAutoExceptionCaught", cls5).invoke(f99265a, Boolean.FALSE);
            f99265a.getMethod("setEnableSmartReporting", cls5).invoke(f99265a, Boolean.TRUE);
            f99265a.getMethod("setSendPeriodMinutes", cls3).invoke(f99265a, Integer.valueOf(c.b.Ko));
            Class<?> cls6 = Class.forName("com.tencent.stat.StatReportStrategy");
            f99265a.getMethod("setStatSendStrategy", cls6).invoke(f99265a, cls6.getField("PERIOD").get(null));
            f99266b.getMethod("startStatService", Context.class, String.class, String.class).invoke(f99266b, context, str, Class.forName("com.tencent.stat.common.StatConstants").getField("VERSION").get(null));
            f99271g = true;
        } catch (Exception e10) {
            SLog.e("OpenConfig", "start4QQConnect exception: " + e10.toString());
        }
    }

    public static void d(Context context, QQToken qQToken) {
        if (!TextUtils.isEmpty(qQToken.getOpenId())) {
            e.a().a(qQToken.getOpenId(), qQToken.getAppId(), "2", "1", "11", "0", "0", "0");
        }
        if (f99271g) {
            b(context, qQToken);
            if (qQToken.getOpenId() != null) {
                try {
                    f99267c.invoke(f99266b, context, qQToken.getOpenId());
                } catch (Exception e10) {
                    SLog.e("OpenConfig", "reportQQ exception: " + e10.toString());
                }
            }
        }
    }
}
