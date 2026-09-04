package com.huawei.hms.opendevice;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.android.HwBuildEx;
import com.huawei.hms.android.SystemUtils;
import com.huawei.hms.mlsdk.common.AgConnectInfo;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.PackageManagerHelper;
import com.huawei.hms.utils.Util;
import com.umeng.analytics.pro.ak;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: ReportAaidToken.java */
/* JADX INFO: loaded from: classes7.dex */
public class m {

    /* JADX INFO: compiled from: ReportAaidToken.java */
    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f61160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f61161b;

        a(Context context, String str) {
            this.f61160a = context;
            this.f61161b = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() throws Throwable {
            if (!d.b()) {
                HMSLog.d("ReportAaidToken", "Not HW Phone.");
                return;
            }
            if (m.b(this.f61160a)) {
                return;
            }
            String strA = com.huawei.hms.opendevice.b.a(this.f61160a);
            if (TextUtils.isEmpty(strA)) {
                HMSLog.w("ReportAaidToken", "AAID is empty.");
                return;
            }
            if (!m.d(this.f61160a, strA, this.f61161b)) {
                HMSLog.d("ReportAaidToken", "This time need not report.");
                return;
            }
            String string = AGConnectServicesConfig.fromContext(this.f61160a).getString("region");
            if (TextUtils.isEmpty(string)) {
                HMSLog.i("ReportAaidToken", "The data storage region is empty.");
                return;
            }
            String strA2 = k.a(this.f61160a, "com.huawei.hms.opendevicesdk", "ROOT", null, string);
            if (TextUtils.isEmpty(strA2)) {
                return;
            }
            String strC = m.c(this.f61160a, strA, this.f61161b);
            m.b(this.f61160a, g.a(this.f61160a, strA2 + "/rest/appdata/v1/aaid/report", strC, (Map<String, String>) null), strA, this.f61161b);
        }
    }

    /* JADX INFO: compiled from: ReportAaidToken.java */
    public enum b {
        MOBILE("1"),
        PC("2"),
        TABLET("3"),
        TV("4"),
        SOUNDBOX("5"),
        GLASS("6"),
        WATCH("7"),
        VEHICLE("8"),
        OFFICE_DEVICE("9"),
        IOT_DEVICES("10"),
        HEALTHY("11"),
        ENTERTAINMENT("12"),
        TRANSPORT_DEVICES("13");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f61176a;

        b(String str) {
            this.f61176a = str;
        }

        public String a() {
            return this.f61176a;
        }
    }

    /* JADX INFO: compiled from: ReportAaidToken.java */
    public enum c {
        IOS("ios"),
        ANDROID("android"),
        HARMONY("harmony"),
        WINDOWS("windows"),
        EMBED("embed"),
        OTHERS("others");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f61184a;

        c(String str) {
            this.f61184a = str;
        }

        public String a() {
            return this.f61184a;
        }
    }

    public static void a(Context context, String str) {
        new a(context, str).start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str)) {
            HMSLog.e("ReportAaidToken", "Https response is empty.");
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            int iOptInt = jSONObject.optInt("ret", 256);
            if (iOptInt != 0) {
                HMSLog.e("ReportAaidToken", "Https response body's ret code: " + iOptInt + ", error message: " + jSONObject.optString("msg"));
                return;
            }
            boolean zSaveString = i.a(context).saveString("reportAaidAndToken", n.a(str3 + str2, "SHA-256"));
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Report success ");
            sb2.append(zSaveString ? "and save success." : "but save failure.");
            HMSLog.d("ReportAaidToken", sb2.toString());
        } catch (JSONException unused) {
            HMSLog.e("ReportAaidToken", "Has JSONException.");
        } catch (Exception unused2) {
            HMSLog.e("ReportAaidToken", "Exception occur.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean b(Context context) {
        int packageVersionCode = new PackageManagerHelper(context).getPackageVersionCode("com.huawei.android.pushagent");
        HMSLog.d("ReportAaidToken", "NC version code: " + packageVersionCode);
        return (90101400 <= packageVersionCode && packageVersionCode < 100000000) || packageVersionCode >= 100001301;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String c(Context context, String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(ak.M, TimeZone.getDefault().getID());
            jSONObject2.put(ak.O, SystemUtils.getLocalCountry());
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("agent_version", new PackageManagerHelper(context).getPackageVersionName("com.huawei.android.pushagent"));
            jSONObject3.put("hms_version", String.valueOf(Util.getHmsVersion(context)));
            JSONObject jSONObject4 = new JSONObject();
            jSONObject4.put("dev_type", b.MOBILE.a());
            jSONObject4.put("dev_sub_type", g0.a.f118921e);
            jSONObject4.put("os_type", c.ANDROID.a());
            jSONObject4.put("os_version", String.valueOf(HwBuildEx.VERSION.EMUI_SDK_INT));
            jSONObject.put("id", UUID.randomUUID().toString());
            jSONObject.put("global", jSONObject2);
            jSONObject.put("push_agent", jSONObject3);
            jSONObject.put("hardware", jSONObject4);
            jSONObject.put("aaid", str);
            jSONObject.put("token", str2);
            jSONObject.put("app_id", AGConnectServicesConfig.fromContext(context).getString(AgConnectInfo.AgConnectKey.APPLICATION_ID));
            jSONObject.put("region", AGConnectServicesConfig.fromContext(context).getString("region"));
            return jSONObject.toString();
        } catch (JSONException unused) {
            HMSLog.e("ReportAaidToken", "Catch JSONException.");
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(Context context, String str, String str2) {
        i iVarA = i.a(context);
        if (!iVarA.containsKey("reportAaidAndToken")) {
            HMSLog.d("ReportAaidToken", "It hasn't been reported, this time needs report.");
            return true;
        }
        String string = iVarA.getString("reportAaidAndToken");
        if (TextUtils.isEmpty(string)) {
            HMSLog.w("ReportAaidToken", "It has been reported, but report value is empty, this time needs report.");
            return true;
        }
        return !string.equals(n.a(str2 + str, "SHA-256"));
    }
}
