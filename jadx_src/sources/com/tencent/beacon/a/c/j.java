package com.tencent.beacon.a.c;

import android.content.Context;
import androidx.annotation.p0;
import com.tencent.beacon.base.util.BeaconLogger;
import com.tencent.connect.common.Constants;
import com.tencent.qimei.sdk.IAsyncQimeiListener;
import com.tencent.qimei.sdk.Qimei;
import com.tencent.qimei.sdk.QimeiSDK;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: QimeiWrapper.java */
/* JADX INFO: loaded from: classes4.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static boolean f98826a = true;

    @p0
    @Deprecated
    public static Qimei a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return null;
        }
        String strF = c.d().f();
        com.tencent.beacon.base.util.c.a("QimeiWrapper", "getRtQimei  appkey is %s", strF);
        c(context, strF);
        return QimeiSDK.getInstance(strF).getQimei();
    }

    public static void a() {
        if (f98826a) {
            try {
                String strF = c.d().f();
                c(strF);
                a(strF);
                d(strF);
            } catch (Throwable th2) {
                com.tencent.beacon.a.b.g.e().a("203", "sdk init error! package name: " + b.b() + " , msg:" + th2.getMessage(), th2);
                com.tencent.beacon.base.util.c.a(th2);
            }
        }
    }

    @Deprecated
    public static void a(IAsyncQimeiListener iAsyncQimeiListener) throws NullPointerException {
        Context contextC = c.d().c();
        com.tencent.beacon.base.util.e.a("should call start() first to init beaconsdk! old async getQimei context", contextC);
        String strF = c.d().f();
        com.tencent.beacon.base.util.c.a("QimeiWrapper", "async getQimei  appkey is %s", strF);
        c(contextC, strF);
        QimeiSDK.getInstance(c.d().f()).getQimei(iAsyncQimeiListener);
    }

    public static void a(String str) {
        QimeiSDK.getInstance(str).getStrategy().enableProcessInfo(com.tencent.beacon.e.b.a().h());
    }

    public static void a(String str, Context context, IAsyncQimeiListener iAsyncQimeiListener) {
        com.tencent.beacon.base.util.e.a(com.umeng.analytics.pro.d.R, context);
        com.tencent.beacon.base.util.e.a("ApplicationContext", context.getApplicationContext());
        com.tencent.beacon.a.b.a.a().a(new i(str, context, iAsyncQimeiListener));
    }

    public static void a(boolean z10) {
        f98826a = z10;
    }

    @p0
    @Deprecated
    public static Qimei b() {
        Context contextC = c.d().c();
        if (contextC == null) {
            return null;
        }
        String strF = c.d().f();
        c(contextC, strF);
        com.tencent.beacon.base.util.c.a("QimeiWrapper", "getQimei  appkey is %s", strF);
        return QimeiSDK.getInstance(strF).getQimei();
    }

    @p0
    public static Qimei b(Context context, String str) {
        if (context == null || context.getApplicationContext() == null) {
            return null;
        }
        c(context.getApplicationContext(), str);
        return QimeiSDK.getInstance(str).getQimei();
    }

    @p0
    public static Qimei b(String str) {
        Context contextC = c.d().c();
        if (contextC == null) {
            return null;
        }
        com.tencent.beacon.base.util.c.a("QimeiWrapper", "getQimeiWithAppkey  appkey is %s", str);
        c(contextC, str);
        return QimeiSDK.getInstance(str).getQimei();
    }

    public static String c() {
        Qimei qimei = QimeiSDK.getInstance(c.d().f()).getQimei();
        return qimei == null ? "" : qimei.getQimei16();
    }

    private static void c(String str) {
        QimeiSDK.getInstance(str).setAppVersion(b.a()).setChannelID(c.d().a()).setLogAble(com.tencent.beacon.base.util.c.b()).addUserId(Constants.SOURCE_QQ, b.c()).addUserId("OMGID", c.d().g());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean c(Context context, String str) {
        if (!f98826a) {
            return false;
        }
        QimeiSDK.getInstance(str).setSdkName("beacon");
        return QimeiSDK.getInstance(str).init(context);
    }

    public static String d() {
        Qimei qimei = QimeiSDK.getInstance(c.d().f()).getQimei();
        return qimei == null ? "" : qimei.getQimei36();
    }

    private static void d(String str) {
        BeaconLogger beaconLoggerA = com.tencent.beacon.base.util.c.a();
        if (beaconLoggerA != null) {
            QimeiSDK.getInstance(str).setLogObserver(new h(beaconLoggerA));
        }
    }

    public static Map<String, String> e() {
        HashMap map = new HashMap(2);
        map.put("A3", c());
        map.put("A153", d());
        return map;
    }

    public static String f() {
        return QimeiSDK.getInstance(c.d().f()).getSdkVersion();
    }

    public static String g() {
        String beaconTicket;
        return (com.tencent.beacon.e.b.a().e() && (beaconTicket = QimeiSDK.getInstance(c.d().f()).getBeaconTicket()) != null) ? beaconTicket : "";
    }

    public static void h() {
        String strF = c.d().f();
        com.tencent.beacon.base.util.c.a("QimeiWrapper", "initQimei: appkey is %s , qimei init %s", strF, Boolean.valueOf(c(c.d().c(), strF)));
        QimeiSDK.getInstance(strF).getQimei(new g());
    }
}
