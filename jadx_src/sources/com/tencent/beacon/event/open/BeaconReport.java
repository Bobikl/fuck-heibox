package com.tencent.beacon.event.open;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.tencent.beacon.a.b.g;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.f;
import com.tencent.beacon.a.c.j;
import com.tencent.beacon.base.util.BeaconLogger;
import com.tencent.beacon.base.util.c;
import com.tencent.beacon.core.info.BeaconPubParams;
import com.tencent.beacon.event.c.d;
import com.tencent.beacon.event.immediate.IBeaconImmediateReport;
import com.tencent.beacon.module.BeaconModule;
import com.tencent.beacon.module.EventModule;
import com.tencent.beacon.module.ModuleName;
import com.tencent.qimei.sdk.IAsyncQimeiListener;
import com.tencent.qimei.sdk.Qimei;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class BeaconReport {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile BeaconReport f99197a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static String f99198b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f99199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f99200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private IBeaconImmediateReport f99201e;

    private BeaconReport() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        ModuleName[] moduleNameArrValues = ModuleName.values();
        for (ModuleName moduleName : moduleNameArrValues) {
            try {
                BeaconModule.f99211a.put(moduleName, d.f(moduleName.getClassName()));
            } catch (Exception e10) {
                c.b("init Module error: " + e10.getMessage(), new Object[0]);
                c.a(e10);
            }
        }
        for (ModuleName moduleName2 : moduleNameArrValues) {
            BeaconModule beaconModule = BeaconModule.f99211a.get(moduleName2);
            if (beaconModule != null) {
                beaconModule.a(this.f99199c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(BeaconConfig beaconConfig) {
        if (beaconConfig != null) {
            c.a("BeaconReport", beaconConfig.toString(), new Object[0]);
            com.tencent.beacon.base.net.c.b.a(beaconConfig.getConfigHost(), beaconConfig.getUploadHost());
            b(beaconConfig);
            com.tencent.beacon.a.c.c.d().a(beaconConfig.isEnableQmsp());
        }
        com.tencent.beacon.base.net.d.c().a(this.f99199c, beaconConfig == null ? null : beaconConfig.getHttpAdapter());
        com.tencent.beacon.a.d.a.a().a(this.f99199c);
        com.tencent.beacon.a.c.b.f();
        e.l().C();
    }

    private void b(BeaconConfig beaconConfig) {
        HashMap map = new HashMap();
        map.put("s_e_e", Boolean.valueOf(beaconConfig.isEventReportEnable()));
        com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(7, map));
        HashMap map2 = new HashMap();
        map2.put("u_c_r_p", Long.valueOf(beaconConfig.getRealtimePollingTime()));
        map2.put("u_c_n_p", Long.valueOf(beaconConfig.getNormalPollingTIme()));
        com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(11, map2));
    }

    private void c(BeaconConfig beaconConfig) {
        if (beaconConfig != null) {
            try {
                HashMap map = new HashMap();
                map.put("u_c_a_e", Boolean.valueOf(beaconConfig.isAuditEnable()));
                map.put("u_c_b_e", Boolean.valueOf(beaconConfig.isBidEnable()));
                map.put("u_c_d_s", Integer.valueOf(beaconConfig.getMaxDBCount()));
                map.put("u_c_p_s", Boolean.valueOf(beaconConfig.isPagePathEnable()));
                com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(8, map));
            } catch (Throwable th2) {
                g.e().a("202", "sdk init error! package name: " + com.tencent.beacon.a.c.b.b() + " , msg:" + th2.getMessage(), th2);
                c.a(th2);
            }
        }
    }

    private void d(BeaconConfig beaconConfig) {
        f fVarE = f.e();
        if (!TextUtils.isEmpty(beaconConfig.getAndroidID())) {
            fVarE.a(beaconConfig.getAndroidID());
        }
        if (!TextUtils.isEmpty(beaconConfig.getImei())) {
            fVarE.b(beaconConfig.getImei());
        }
        if (!TextUtils.isEmpty(beaconConfig.getImei2())) {
            fVarE.c(beaconConfig.getImei2());
        }
        if (!TextUtils.isEmpty(beaconConfig.getImsi())) {
            fVarE.d(beaconConfig.getImsi());
        }
        if (!TextUtils.isEmpty(beaconConfig.getMeid())) {
            fVarE.f(beaconConfig.getMeid());
        }
        if (!TextUtils.isEmpty(beaconConfig.getModel())) {
            fVarE.g(beaconConfig.getModel());
        }
        if (!TextUtils.isEmpty(beaconConfig.getMac())) {
            fVarE.e(beaconConfig.getMac());
        }
        if (!TextUtils.isEmpty(beaconConfig.getWifiMacAddress())) {
            fVarE.i(beaconConfig.getWifiMacAddress());
        }
        if (!TextUtils.isEmpty(beaconConfig.getWifiSSID())) {
            fVarE.j(beaconConfig.getWifiSSID());
        }
        if (TextUtils.isEmpty(beaconConfig.getOaid())) {
            return;
        }
        fVarE.h(beaconConfig.getOaid());
    }

    public static BeaconReport getInstance() {
        if (f99197a == null) {
            synchronized (BeaconReport.class) {
                if (f99197a == null) {
                    f99197a = new BeaconReport();
                }
            }
        }
        return f99197a;
    }

    public static String getSoPath() {
        return f99198b;
    }

    public static void setSoPath(String str) {
        f99198b = str;
    }

    public BeaconPubParams getCommonParams(Context context) {
        if (context == null) {
            return null;
        }
        return BeaconPubParams.getPubParams(context);
    }

    public IBeaconImmediateReport getImmediateReport() {
        return this.f99201e;
    }

    public String getOAID() {
        return f.e().i();
    }

    @p0
    @Deprecated
    public Qimei getQimei() {
        return j.b();
    }

    @p0
    public Qimei getQimei(@n0 String str) {
        return j.b(str);
    }

    @Deprecated
    public void getQimei(IAsyncQimeiListener iAsyncQimeiListener) throws NullPointerException {
        j.a(iAsyncQimeiListener);
    }

    public void getQimei(@n0 String str, @n0 Context context, IAsyncQimeiListener iAsyncQimeiListener) {
        j.a(str, context, iAsyncQimeiListener);
    }

    @p0
    @Deprecated
    public Qimei getRtQimei(Context context) {
        return j.a(context);
    }

    @p0
    public Qimei getRtQimei(Context context, @n0 String str) {
        return j.b(context, str);
    }

    public String getSDKVersion() {
        return "4.2.57.1";
    }

    public EventResult report(BeaconEvent beaconEvent) {
        try {
            if (TextUtils.isEmpty(beaconEvent.getCode())) {
                return EventResult.a.a(106);
            }
            BeaconEvent beaconEventBuild = BeaconEvent.newBuilder(beaconEvent).build();
            EventModule eventModule = (EventModule) com.tencent.beacon.a.c.c.d().a(ModuleName.EVENT);
            if (eventModule != null && eventModule.d()) {
                return eventModule.a(beaconEventBuild);
            }
            HashMap map = new HashMap();
            map.put("b_e", beaconEventBuild);
            com.tencent.beacon.a.a.b.a().a(new com.tencent.beacon.a.a.c(6, map));
            return new EventResult(0, -1L, "Beacon SDK not init beaconEvent add to cache!");
        } catch (Throwable th2) {
            c.a(th2);
            g.e().a("598", "error while report", th2);
            return new EventResult(199, -1L, "REPORT ERROR");
        }
    }

    public void resumeReport() {
        c.a("BeaconReport", "resume report by user.", new Object[0]);
        com.tencent.beacon.a.b.a.a().b(true);
        com.tencent.beacon.a.b.a.a().d();
        com.tencent.beacon.base.net.d.c().e();
    }

    public void setAdditionalParams(String str, @n0 Map<String, String> map) {
        HashMap map2 = new HashMap();
        map2.put("i_c_ad", new HashMap(map));
        map2.put("i_c_ak", str);
        com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(3, map2));
    }

    @Deprecated
    public void setAdditionalParams(@n0 Map<String, String> map) {
        setAdditionalParams(com.tencent.beacon.a.c.c.d().f(), map);
    }

    public void setAndroidID(String str) {
        f.e().a(str);
    }

    public void setAppVersion(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        com.tencent.beacon.a.c.b.f98779a = str;
    }

    public void setChannelID(String str) {
        com.tencent.beacon.a.c.c.d().a(str);
    }

    @Deprecated
    public void setCollectAndroidID(boolean z10) {
        c.b("setCollectAndroidID has been Deprecated", new Object[0]);
    }

    @Deprecated
    public void setCollectImei(boolean z10) {
        c.b("setCollectImei has been Deprecated", new Object[0]);
    }

    @Deprecated
    public void setCollectMac(boolean z10) {
        c.b("setCollectMac has been Deprecated", new Object[0]);
    }

    @Deprecated
    public void setCollectModel(boolean z10) {
        c.b("setCollectModel has been Deprecated", new Object[0]);
    }

    @Deprecated
    public void setCollectOAID(boolean z10) {
        c.b("setCollectOAID has been Deprecated", new Object[0]);
    }

    @Deprecated
    public void setCollectPersonalInfo(boolean z10) {
        c.b("setCollectPersonalInfo has been Deprecated", new Object[0]);
    }

    public void setCollectProcessInfo(boolean z10) {
        com.tencent.beacon.e.b.a().a(z10);
    }

    public void setImei(String str) {
        f.e().b(str);
    }

    public void setImei2(String str) {
        f.e().c(str);
    }

    public void setImmediateReport(IBeaconImmediateReport iBeaconImmediateReport) {
        this.f99201e = iBeaconImmediateReport;
    }

    public void setImsi(String str) {
        f.e().d(str);
    }

    public void setLogAble(boolean z10) {
        c.a(z10);
    }

    public void setLogger(BeaconLogger beaconLogger) {
        c.a(beaconLogger);
    }

    public void setMac(String str) {
        f.e().e(str);
    }

    public void setMeid(String str) {
        f.e().f(str);
    }

    public void setModel(String str) {
        f.e().g(str);
    }

    public void setOAID(String str) {
        f.e().h(str);
    }

    @Deprecated
    public void setOaid(String str) {
        f.e().h(str);
        c.b("setOaid has been Deprecated, please use setOAID", new Object[0]);
    }

    public void setOmgID(String str) {
        com.tencent.beacon.a.c.c.d().e(str);
    }

    public void setOpenID(String str, String str2) {
        HashMap map = new HashMap();
        map.put("i_c_ak", str);
        map.put("i_c_o_i", str2);
        com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(5, map));
    }

    public void setQQ(String str) {
        com.tencent.beacon.a.c.b.a(str);
    }

    public void setStrictMode(boolean z10) {
        com.tencent.beacon.base.util.e.f98952a.set(z10);
    }

    @Deprecated
    public void setUserID(String str) {
        setUserID(com.tencent.beacon.a.c.c.d().f(), str);
    }

    public void setUserID(String str, String str2) {
        HashMap map = new HashMap();
        map.put("i_c_ak", str);
        map.put("i_c_u_i", str2);
        com.tencent.beacon.a.a.b.a().b(new com.tencent.beacon.a.a.c(4, map));
    }

    public void setWifiMacAddress(String str) {
        f.e().i(str);
    }

    public void setWifiSSID(String str) {
        f.e().j(str);
    }

    public synchronized void start(@n0 Context context, @n0 String str, @p0 BeaconConfig beaconConfig) {
        if (this.f99200d) {
            return;
        }
        Log.i("beacon", "logAble: " + c.b() + " , SDKVersion: " + getSDKVersion());
        com.tencent.beacon.base.util.e.a("Context", context);
        boolean z10 = false;
        if (context == null) {
            c.b("fail to start beacon, context is null", new Object[0]);
            return;
        }
        Context applicationContext = context.getApplicationContext();
        this.f99199c = applicationContext;
        com.tencent.beacon.base.util.e.a("ApplicationContext", applicationContext);
        if (this.f99199c == null) {
            c.b("fail to start beacon, application context is null", new Object[0]);
            return;
        }
        com.tencent.beacon.a.c.c.d().a(this.f99199c);
        com.tencent.beacon.base.util.e.a("AppKey", str);
        if (TextUtils.isEmpty(str)) {
            c.b("fail to start beacon, appkey is empty", new Object[0]);
            return;
        }
        com.tencent.beacon.a.c.c.d().d(str);
        g.e().a(beaconConfig != null && beaconConfig.isForceEnableAtta());
        com.tencent.beacon.a.b.f fVarE = com.tencent.beacon.a.b.f.e();
        if (beaconConfig != null && beaconConfig.isForceEnableAtta()) {
            z10 = true;
        }
        fVarE.a(z10);
        ((Application) this.f99199c).registerActivityLifecycleCallbacks(new com.tencent.beacon.b.a());
        c(beaconConfig);
        if (beaconConfig != null) {
            d(beaconConfig);
            j.a(beaconConfig.isNeedInitQimei());
        }
        com.tencent.beacon.a.b.a.a().a(new b(this, beaconConfig));
        this.f99200d = true;
    }

    public void stopReport(boolean z10) {
        c.a("BeaconReport", "stop report by user.", new Object[0]);
        com.tencent.beacon.a.b.a.a().b(false);
        com.tencent.beacon.a.b.a.a().a(z10);
        com.tencent.beacon.base.net.d.c().close();
    }
}
