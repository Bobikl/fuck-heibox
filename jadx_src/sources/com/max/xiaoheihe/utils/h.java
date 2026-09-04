package com.max.xiaoheihe.utils;

import android.content.Context;
import android.os.Handler;
import android.provider.Settings;
import com.ishumei.smantifraud.SmAntiFraud;
import com.max.hbcommon.bean.DeviceInfoObj;
import com.max.hbutils.bean.Result;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.app.HeyBoxApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.umeng.socialize.net.utils.SocializeProtocolConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.util.UUID;

/* JADX INFO: compiled from: DeviceUuidFactory.java */
/* JADX INFO: loaded from: classes13.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected static final String f95393a = "device_id";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static volatile String f95394b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f95395c;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Boolean f95396d = Boolean.FALSE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static String f95397e;

    /* JADX INFO: compiled from: DeviceUuidFactory.java */
    public class a extends com.max.hbcommon.network.d<Result> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l0.g f95398b;

        a(l0.g gVar) {
            this.f95398b = gVar;
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public void onError(Throwable th2) {
        }

        public void onNext(Result result) {
            if (PatchProxy.proxy(new Object[]{result}, this, changeQuickRedirect, false, 48689, new Class[]{Result.class}, Void.TYPE).isSupported || result == null || result.getResult() == null) {
                return;
            }
            com.max.hbcache.c.z("sm_device_id", result.getKeyMap().get("heybox_token"));
            l0.g gVar = this.f95398b;
            if (gVar != null) {
                gVar.a();
            }
        }

        @Override // com.max.hbcommon.network.d, io.reactivex.g0
        public /* bridge */ /* synthetic */ void onNext(Object obj) {
            if (PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 48690, new Class[]{Object.class}, Void.TYPE).isSupported) {
                return;
            }
            onNext((Result) obj);
        }
    }

    /* JADX INFO: compiled from: DeviceUuidFactory.java */
    public class b implements t.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // com.max.xiaoheihe.utils.t.a
        public void a(String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 48691, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            com.max.hbcommon.utils.d.b("zzzzoaidtest", "oaid==" + str);
            if (com.max.hbcommon.utils.c.u(str) || "0".equals(str) || !"1".equals(com.max.hbcache.c.j(lb.a.f130931a1))) {
                return;
            }
            h.f95395c = str;
        }
    }

    /* JADX INFO: compiled from: DeviceUuidFactory.java */
    public class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 48692, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            DeviceInfoObj deviceInfoObjC = h.c();
            if (deviceInfoObjC.equals((DeviceInfoObj) com.max.hbutils.utils.k.a(com.max.hbcache.c.j("report_device_info"), DeviceInfoObj.class))) {
                return;
            }
            com.max.hbcache.c.z("report_device_info", com.max.hbutils.utils.k.p(deviceInfoObjC));
            com.max.hbcommon.utils.k.t(deviceInfoObjC);
        }
    }

    public h(Context context) {
        if (com.max.hbcommon.utils.c.u(f95394b)) {
            synchronized (h.class) {
                if (com.max.hbcommon.utils.c.u(f95394b)) {
                    String strO = com.max.hbcache.c.o("device_id", null);
                    if (com.max.hbcommon.utils.c.u(strO)) {
                        String string = Settings.Secure.getString(context.getContentResolver(), SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID);
                        if (i(string)) {
                            f95394b = string;
                        } else if (!i0.s() || com.max.hbcommon.utils.c.u(i0.o().getAccount_detail().getUserid())) {
                            String strReplace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
                            int length = 16;
                            if (strReplace.length() <= 16) {
                                length = strReplace.length();
                            }
                            f95394b = strReplace.substring(0, length);
                        } else {
                            f95394b = d.a1(i0.o().getAccount_detail().getUserid()).substring(0, 15);
                        }
                        com.max.hbcache.c.C("device_id", f95394b);
                    } else {
                        f95394b = strO;
                        com.max.hbcommon.utils.d.b("deviceidtest", "PREFS_DEVICE_ID");
                    }
                }
            }
        }
    }

    public static void a() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48683, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        b(null);
    }

    public static void b(l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{gVar}, null, changeQuickRedirect, true, 48684, new Class[]{l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        k(SmAntiFraud.getDeviceId(), gVar);
    }

    public static DeviceInfoObj c() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48681, new Class[0], DeviceInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (DeviceInfoObj) patchProxyResultProxy.result;
        }
        DeviceInfoObj deviceInfoObj = new DeviceInfoObj();
        deviceInfoObj.setOaid(f95395c);
        String string = Settings.Secure.getString(HeyBoxApplication.C().getContentResolver(), SocializeProtocolConstants.PROTOCOL_KEY_ANDROID_ID);
        if (!i(string)) {
            string = null;
        }
        deviceInfoObj.setAndroid_id(string);
        deviceInfoObj.setUseragent(System.getProperty("http.agent"));
        return deviceInfoObj;
    }

    public static String e() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48680, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        if (f95397e == null) {
            f95397e = String.valueOf(ViewUtils.h0(HeyBoxApplication.C(), ViewUtils.r(HeyBoxApplication.C())));
        }
        return f95397e;
    }

    public static String f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 48682, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : com.max.hbcache.c.j("sm_device_id");
    }

    public static void g(String str, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{str, gVar}, null, changeQuickRedirect, true, 48687, new Class[]{String.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.xiaoheihe.network.i.a().v6(str).I5(io.reactivex.schedulers.b.d()).a4(io.reactivex.android.schedulers.a.c()).g(new a(gVar));
    }

    public static void h(Context context) {
        if (PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 48688, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        new t(new b()).a(context);
        new Handler().postDelayed(new c(), 500L);
    }

    public static boolean i(String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48679, new Class[]{String.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return (com.max.hbcommon.utils.c.u(str) || com.max.hbcommon.utils.c.u(str.replaceAll("0", "")) || "9774d56d682e549c".equals(str)) ? false : true;
    }

    public static void j(String str) {
        if (PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 48685, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        k(str, null);
    }

    public static void k(String str, l0.g gVar) {
        if (PatchProxy.proxy(new Object[]{str, gVar}, null, changeQuickRedirect, true, 48686, new Class[]{String.class, l0.g.class}, Void.TYPE).isSupported) {
            return;
        }
        com.max.hbcommon.utils.d.b("zzzzsmid", "save id==" + str);
        if (com.max.hbcommon.utils.c.u(str) || str.length() >= 1000) {
            g(str, gVar);
            return;
        }
        com.max.hbcache.c.z("sm_device_id", str);
        if (gVar != null) {
            gVar.a();
        }
    }

    public String d() {
        return f95394b;
    }
}
