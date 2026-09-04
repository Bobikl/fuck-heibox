package com.tencent.beacon.core.info;

import android.content.Context;
import android.os.Build;
import com.tencent.beacon.a.c.b;
import com.tencent.beacon.a.c.c;
import com.tencent.beacon.a.c.e;
import com.tencent.beacon.a.c.f;
import com.tencent.beacon.a.c.j;
import com.tencent.beacon.base.net.c.d;
import lg.a;

/* JADX INFO: loaded from: classes4.dex */
public class BeaconPubParams {
    private static BeaconPubParams sParamsHolder;
    private String androidId;
    private String appFirstInstallTime;
    private String appLastUpdatedTime;
    private String appVersion;
    private String beaconId;
    private String boundleId;
    private String brand;
    private String cid;
    private Context context;
    private String dpi;
    private String dtImei2;
    private String dtMeid;
    private String dtMf;
    private String fingerprint;
    private String gpu;
    private String hardwareOs;
    private String imei;
    private String imsi;
    private String isRooted;
    private String language;
    private String mac;
    private String model;
    private String modelApn;
    private String networkType;
    private String osVersion;
    private String platform;
    private String productId;
    private String qimei;
    private String resolution;
    private String sdkId;
    private String sdkVersion;
    private String wifiMac;
    private String wifiSsid;

    private BeaconPubParams(Context context) {
        this.context = context;
        init(context);
    }

    public static synchronized BeaconPubParams getPubParams(Context context) {
        if (sParamsHolder == null) {
            synchronized (BeaconPubParams.class) {
                if (sParamsHolder == null) {
                    sParamsHolder = new BeaconPubParams(context);
                }
            }
        }
        sParamsHolder.refresh();
        return sParamsHolder;
    }

    private void init(Context context) {
        if (context != context.getApplicationContext()) {
            context = context.getApplicationContext();
        }
        c cVarD = c.d();
        cVarD.a(context);
        this.appVersion = b.a();
        this.boundleId = b.b();
        this.sdkId = cVarD.i();
        this.sdkVersion = cVarD.j();
        this.beaconId = j.g();
        this.appFirstInstallTime = b.a(context);
        e eVarL = e.l();
        this.appLastUpdatedTime = eVarL.a(context);
        this.platform = String.valueOf((int) cVarD.h());
        this.dtMf = eVarL.o();
        this.osVersion = eVarL.s();
        this.hardwareOs = eVarL.f() + a.f131412e + eVarL.e();
        this.brand = Build.BRAND;
        f fVarE = f.e();
        this.model = fVarE.h();
        this.language = eVarL.n();
        this.resolution = eVarL.u();
        this.dpi = String.valueOf(eVarL.y());
        this.gpu = "";
        this.isRooted = eVarL.m() ? "1" : "0";
        this.fingerprint = eVarL.v();
        this.qimei = j.c();
        this.mac = fVarE.f();
        this.wifiMac = fVarE.j();
        this.wifiSsid = fVarE.k();
        this.cid = eVarL.p();
    }

    private void refresh() {
        e eVarL = e.l();
        f fVarE = f.e();
        this.networkType = eVarL.q();
        this.modelApn = d.c();
        this.imei = fVarE.b();
        this.dtImei2 = fVarE.c();
        this.dtMeid = fVarE.g();
        this.imsi = fVarE.d();
        this.androidId = fVarE.a();
        this.mac = fVarE.f();
        this.wifiMac = fVarE.j();
        this.wifiSsid = fVarE.k();
    }

    public String getAndroidId() {
        return this.androidId;
    }

    public String getAppFirstInstallTime() {
        return this.appFirstInstallTime;
    }

    public String getAppLastUpdatedTime() {
        return this.appLastUpdatedTime;
    }

    public String getAppVersion() {
        return this.appVersion;
    }

    public String getBeaconId() {
        return this.beaconId;
    }

    public String getBoundleId() {
        return this.boundleId;
    }

    public String getBrand() {
        return this.brand;
    }

    public String getCid() {
        return this.cid;
    }

    public String getDpi() {
        return this.dpi;
    }

    public String getDtImei2() {
        return this.dtImei2;
    }

    public String getDtMeid() {
        return this.dtMeid;
    }

    public String getDtMf() {
        return this.dtMf;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public String getHardwareOs() {
        return this.hardwareOs;
    }

    public String getImei() {
        return this.imei;
    }

    public String getImsi() {
        return this.imsi;
    }

    public String getIsRooted() {
        return this.isRooted;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getMac() {
        return this.mac;
    }

    public String getModel() {
        return this.model;
    }

    public String getModelApn() {
        return this.modelApn;
    }

    public String getNetworkType() {
        return this.networkType;
    }

    public String getOsVersion() {
        return this.osVersion;
    }

    public String getPlatform() {
        return this.platform;
    }

    public String getProductId() {
        return this.productId;
    }

    public String getQimei() {
        return this.qimei;
    }

    public String getResolution() {
        return this.resolution;
    }

    public String getSdkId() {
        return this.sdkId;
    }

    public String getSdkVersion() {
        return this.sdkVersion;
    }

    public String getWifiMac() {
        return this.wifiMac;
    }

    public String getWifiSsid() {
        return this.wifiSsid;
    }

    public String toString() {
        return super.toString();
    }
}
