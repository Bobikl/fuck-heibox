package com.huawei.hms.scankit.p;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Log;
import android.util.SparseArray;
import com.huawei.hms.framework.common.SystemPropUtils;
import com.huawei.hms.framework.common.hianalytics.WiseOpenHianalyticsData;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.ml.scan.HmsScanBase;
import com.huawei.hms.mlsdk.common.MLApplicationSetting;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: HaLog.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class u3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static String f62401d = "FORMAT_UNKNOWN";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static String f62402e = "OTHER";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static SparseArray<String> f62403f = new a();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static SparseArray<String> f62404g = new b();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f62405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    LinkedHashMap<String, String> f62406b = new LinkedHashMap<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    volatile long f62407c;

    /* JADX INFO: compiled from: HaLog.java */
    public class a extends SparseArray<String> {
        a() {
            put(HmsScanBase.AZTEC_SCAN_TYPE, "AZTEC");
            put(HmsScanBase.CODABAR_SCAN_TYPE, "CODABAR");
            put(HmsScanBase.CODE39_SCAN_TYPE, "CODE39");
            put(HmsScanBase.CODE93_SCAN_TYPE, "CODE93");
            put(HmsScanBase.CODE128_SCAN_TYPE, "CODE128");
            put(HmsScanBase.DATAMATRIX_SCAN_TYPE, "DATAMATRIX");
            put(HmsScanBase.EAN8_SCAN_TYPE, "EAN8");
            put(HmsScanBase.EAN13_SCAN_TYPE, "EAN13");
            put(HmsScanBase.ITF14_SCAN_TYPE, "ITF14");
            put(HmsScanBase.PDF417_SCAN_TYPE, "PDF417");
            put(HmsScanBase.QRCODE_SCAN_TYPE, "QRCODE");
            put(HmsScanBase.UPCCODE_A_SCAN_TYPE, "UPCCODE_A");
            put(HmsScanBase.UPCCODE_E_SCAN_TYPE, "UPCCODE_E");
            put(HmsScanBase.FORMAT_UNKNOWN, u3.f62401d);
        }
    }

    /* JADX INFO: compiled from: HaLog.java */
    public class b extends SparseArray<String> {
        b() {
            put(HmsScan.ARTICLE_NUMBER_FORM, "ARTICLE_NUMBER");
            put(HmsScan.EMAIL_CONTENT_FORM, "EMAIL_CONTENT");
            put(HmsScan.TEL_PHONE_NUMBER_FORM, "TEL_PHONE_NUMBER");
            put(HmsScan.PURE_TEXT_FORM, "PURE_TEXT");
            put(HmsScan.SMS_FORM, "SMS");
            put(HmsScan.URL_FORM, "URL");
            put(HmsScan.WIFI_CONNECT_INFO_FORM, "WIFI_CONNECT_INFO");
            put(HmsScan.EVENT_INFO_FORM, "EVENT_INFO");
            put(HmsScan.CONTACT_DETAIL_FORM, "CONTACT_DETAIL");
            put(HmsScan.DRIVER_INFO_FORM, "DRIVER_INFO");
            put(HmsScan.LOCATION_COORDINATE_FORM, "LOCATION_COORDINATE");
            put(HmsScan.ISBN_NUMBER_FORM, "ISBN_NUMBER");
            put(-1, u3.f62402e);
        }
    }

    u3(Bundle bundle, Context context) {
        this.f62405a = context;
        b(bundle);
    }

    static String a(int i10) {
        return f62403f.get(i10, f62401d);
    }

    private String a(Bundle bundle) {
        String[] strArr = {"huawei_module_scankit_sdk_version", "com.huawei.hms.client.service.name:scan", "com.huawei.hms.client.service.name:scanplus", "com.huawei.hms.client.service.name:scankit"};
        if (bundle == null) {
            return "scankit:1.0.2.300";
        }
        for (int i10 = 0; i10 < 4; i10++) {
            String str = strArr[i10];
            if (bundle.getString(str) != null) {
                return bundle.getString(str);
            }
        }
        return "scankit:1.0.2.300";
    }

    private String b() {
        return Build.VERSION.SDK_INT == 24 ? "full-noso" : org.apache.tools.ant.taskdefs.optional.ejb.h.f134972q;
    }

    static String b(int i10) {
        return f62404g.get(i10, f62402e);
    }

    private void b(Bundle bundle) {
        try {
            String packageName = this.f62405a.getPackageName();
            this.f62406b.put("package", packageName);
            if (bundle == null || !bundle.containsKey("appid")) {
                this.f62406b.put("appid", packageName);
            } else {
                this.f62406b.put("appid", bundle.getString("appid"));
            }
            PackageManager packageManager = this.f62405a.getPackageManager();
            ApplicationInfo applicationInfo = packageManager.getApplicationInfo(packageName, 128);
            this.f62406b.put("appName", applicationInfo.loadLabel(packageManager).toString());
            this.f62406b.put("version", a(applicationInfo.metaData));
            String strD = d();
            this.f62406b.put("hmscoreVersion", strD);
            this.f62406b.put("isHMSCore", "unknown".equals(strD) ? "0" : "1");
        } catch (PackageManager.NameNotFoundException unused) {
            o4.b("HaLog", "PackageManager.NameNotFoundException");
        } catch (Exception unused2) {
            o4.b("HaLog", "initValue Exception");
        }
        try {
            this.f62406b.put("sdkName", "scankit");
            this.f62406b.put("algopt", b());
            this.f62406b.put("isFullSdk", "FULLSDK");
            this.f62406b.put(WiseOpenHianalyticsData.UNION_APP_VERSION, c());
            if (b4.f61566a) {
                this.f62406b.put("apkVersion", b4.f61567b);
            } else {
                this.f62406b.put("apkVersion", "unknown");
            }
            this.f62406b.put("service", "com.huawei.hms.scankit");
            this.f62406b.put("operator", b4.b(this.f62405a));
            this.f62406b.put("networkType", b4.a(this.f62405a));
            this.f62406b.put(MLApplicationSetting.BundleKeyConstants.AppInfo.COUNTRY_CODE, b4.a(this.f62405a, false));
            this.f62406b.put("deviceType", b4.c());
            this.f62406b.put("emuiVersion", b4.d());
            this.f62406b.put("androidVersion", b4.a());
            this.f62406b.put("deviceCategory", b4.b());
        } catch (RuntimeException unused3) {
            o4.b("HaLog", "initValue RuntimeException");
        } catch (Exception unused4) {
            o4.b("HaLog", "initValue Exception");
        }
    }

    private String c() {
        try {
            return this.f62405a.getPackageManager().getPackageInfo(this.f62405a.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return "unknown";
        }
    }

    private String d() {
        try {
            return this.f62405a.getPackageManager().getPackageInfo("com.huawei.hwid", 0).versionName;
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return "unknown";
        }
    }

    private boolean e() {
        try {
            String property = SystemPropUtils.getProperty("get", "ro.hw.country", "android.os.SystemProperties", "UNKNOWN");
            TelephonyManager telephonyManager = (TelephonyManager) this.f62405a.getApplicationContext().getSystemService(g0.a.f118921e);
            return com.huawei.hms.feature.dynamic.f.e.f60734e.equalsIgnoreCase(property) && com.huawei.hms.feature.dynamic.f.e.f60734e.equalsIgnoreCase(telephonyManager.getNetworkCountryIso()) && com.huawei.hms.feature.dynamic.f.e.f60734e.equalsIgnoreCase(telephonyManager.getSimCountryIso());
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    private boolean f() {
        return true;
    }

    boolean a() {
        if (w7.c(this.f62405a)) {
            Log.i("HaLog", "allowLog: forbidLog ");
            return false;
        }
        Log.i("HaLog", "allowLog: allowLog ");
        try {
            return f() || e() || Settings.Secure.getInt(this.f62405a.getContentResolver(), "hw_app_analytics_state", 0) == 1;
        } catch (RuntimeException | Exception unused) {
            return false;
        }
    }

    void g() {
        String str;
        o4.d("HaLog", "update HiAnalyticsLogUtils.apk_mode " + b4.f61566a + " HiAnalyticsLogUtils.apkVersion " + b4.f61567b);
        if (!b4.f61566a || (str = b4.f61567b) == null) {
            return;
        }
        this.f62406b.put("apkVersion", str);
    }
}
