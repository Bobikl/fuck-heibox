package com.tencent.qimei.r;

import android.os.Build;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.tencent.connect.common.Constants;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.qimei.sdk.Qimei;
import com.tencent.qimei.upload.BuildConfig;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: QimeiProtocol.java */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f101359a = new e();

    /* JADX INFO: compiled from: QimeiProtocol.java */
    public enum a {
        KEY_ENCRYPT_KEY("key"),
        KEY_PARAMS("params"),
        KEY_TIME("time"),
        KEY_NONCE(Constants.NONCE),
        KEY_SIGN("sign"),
        KEY_EXTRA("extra"),
        KEY_PARAMS_ANDROID_ID("androidId"),
        KEY_PARAMS_PLATFORM_ID(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY),
        KEY_PARAMS_APP_KEY("appKey"),
        KEY_PARAMS_APP_VERSION("appVersion"),
        KEY_PARAMS_BEACON_ID_SRC("beaconIdSrc"),
        KEY_PARAMS_BRAND("brand"),
        KEY_PARAMS_CHANNEL_ID(RemoteMessageConst.Notification.CHANNEL_ID),
        KEY_PARAMS_CID("cid"),
        KEY_PARAMS_IMEI("imei"),
        KEY_PARAMS_IMSI(com.taobao.accs.common.Constants.KEY_IMSI),
        KEY_PARAMS_MAC("mac"),
        KEY_PARAMS_MODEL(com.taobao.accs.common.Constants.KEY_MODEL),
        KEY_PARAMS_NETWORK_TYPE("networkType"),
        KEY_PARAMS_OAID("oaid"),
        KEY_PARAMS_OS_VERSION("osVersion"),
        KEY_PARAMS_QIMEI(BuildConfig.SDK_ID),
        KEY_PARAMS_QIMEI36(TPDownloadProxyEnum.TAB_QIMEI36),
        KEY_PARAMS_RESERVED("reserved"),
        KEY_PARAMS_SDKVERSION("sdkVersion"),
        KEY_PARAMS_TARGETSDKVERSION("targetSdkVersion"),
        KEY_PARAMS_TRUSTEDENV("audit"),
        KEY_PARAMS_USERID("userId"),
        KEY_PARAMS_DEVICE_TYPE("deviceType"),
        KEY_PARAMS_PACKAGE_ID("packageId"),
        KEY_PARAMS_SKDNAME("sdkName"),
        KEY_RESERVED_HARMONY("harmony"),
        KEY_RESERVED_CLONE("clone"),
        KEY_RESERVED_CONTAINE("containe");

        public String J;

        a(String str) {
            this.J = str;
        }

        public String a() {
            return this.J;
        }
    }

    /* JADX INFO: compiled from: QimeiProtocol.java */
    public enum b {
        KEY_CODE("code"),
        KEY_DATA("data"),
        KEY_DATA_QIMEI_16("q16"),
        KEY_DATA_QIMEI_36("q36");


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public String f101391f;

        b(String str) {
            this.f101391f = str;
        }

        public static Qimei a(String str) {
            return new Qimei(KEY_DATA_QIMEI_16.a(str, new b[0]), KEY_DATA_QIMEI_36.a(str, new b[0]));
        }

        public String a() {
            return this.f101391f;
        }

        public String a(String str, b... bVarArr) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                for (b bVar : bVarArr) {
                    if (jSONObject == null) {
                        return "";
                    }
                    jSONObject = jSONObject.optJSONObject(bVar.a());
                }
                return jSONObject == null ? "" : jSONObject.optString(a());
            } catch (JSONException e10) {
                e10.printStackTrace();
                return "";
            }
        }
    }

    public static e a() {
        return f101359a;
    }

    public final String a(com.tencent.qimei.d.d dVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            String str = "1";
            jSONObject.put(a.KEY_RESERVED_HARMONY.a(), dVar.D() ? "1" : "0");
            String strA = a.KEY_RESERVED_CLONE.a();
            if (!dVar.C()) {
                str = "0";
            }
            jSONObject.put(strA, str);
            jSONObject.put(a.KEY_RESERVED_CONTAINE.a(), dVar.h());
        } catch (JSONException e10) {
            e10.printStackTrace();
        }
        return jSONObject.toString();
    }

    public final String a(String str, com.tencent.qimei.u.a aVar) {
        return !com.tencent.qimei.v.d.a(str).b() ? "" : aVar.G();
    }

    public String a(String str, String str2) {
        if (!str.isEmpty()) {
            return str + "/android";
        }
        if (str2.isEmpty()) {
            return com.tencent.qimei.f.a.a() + "/android";
        }
        return str2 + "/android";
    }

    public String a(String str, String str2, Qimei qimei, long j10, String str3) {
        com.tencent.qimei.u.d dVarB = com.tencent.qimei.u.d.b();
        com.tencent.qimei.u.a aVar = new com.tencent.qimei.u.a(str2);
        com.tencent.qimei.o.d dVarA = com.tencent.qimei.o.d.a(str2);
        com.tencent.qimei.d.d dVarL = com.tencent.qimei.d.d.l();
        com.tencent.qimei.p.b bVarA = com.tencent.qimei.p.b.a();
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put(a.KEY_PARAMS_ANDROID_ID.a(), dVarA.a());
            jSONObject2.put(a.KEY_PARAMS_PLATFORM_ID.a(), (int) dVarL.A());
            jSONObject2.put(a.KEY_PARAMS_APP_KEY.a(), str2);
            jSONObject2.put(a.KEY_PARAMS_APP_VERSION.a(), com.tencent.qimei.d.a.a());
            jSONObject2.put(a.KEY_PARAMS_BEACON_ID_SRC.a(), dVarA.b());
            jSONObject2.put(a.KEY_PARAMS_BRAND.a(), Build.BRAND);
            jSONObject2.put(a.KEY_PARAMS_CHANNEL_ID.a(), aVar.E());
            jSONObject2.put(a.KEY_PARAMS_CID.a(), dVarA.g());
            jSONObject2.put(a.KEY_PARAMS_IMEI.a(), dVarA.d());
            jSONObject2.put(a.KEY_PARAMS_IMSI.a(), dVarA.e());
            jSONObject2.put(a.KEY_PARAMS_MAC.a(), dVarA.f());
            jSONObject2.put(a.KEY_PARAMS_MODEL.a(), dVarA.c());
            jSONObject2.put(a.KEY_PARAMS_NETWORK_TYPE.a(), dVarL.u());
            jSONObject2.put(a.KEY_PARAMS_OAID.a(), dVarA.h());
            jSONObject2.put(a.KEY_PARAMS_OS_VERSION.a(), dVarL.y());
            jSONObject2.put(a.KEY_PARAMS_QIMEI.a(), qimei == null ? "" : qimei.a());
            jSONObject2.put(a.KEY_PARAMS_QIMEI36.a(), qimei == null ? "" : qimei.b());
            jSONObject2.put(a.KEY_PARAMS_SDKVERSION.a(), dVarB.getSdkVersion());
            jSONObject2.put(a.KEY_PARAMS_TARGETSDKVERSION.a(), String.valueOf(com.tencent.qimei.u.d.b().F().getApplicationInfo().targetSdkVersion));
            jSONObject2.put(a.KEY_PARAMS_TRUSTEDENV.a(), bVarA.b());
            jSONObject2.put(a.KEY_PARAMS_USERID.a(), a(str2, aVar));
            jSONObject2.put(a.KEY_PARAMS_PACKAGE_ID.a(), dVarL.z());
            jSONObject2.put(a.KEY_PARAMS_DEVICE_TYPE.a(), dVarL.i());
            jSONObject2.put(a.KEY_PARAMS_SKDNAME.a(), aVar.H());
            jSONObject2.put(a.KEY_PARAMS_RESERVED.a(), a(dVarL));
            jSONObject.put(a.KEY_ENCRYPT_KEY.a(), com.tencent.qimei.a.a.b(str, com.tencent.qimei.f.a.b()));
            jSONObject.put(a.KEY_PARAMS.a(), com.tencent.qimei.a.a.a(jSONObject2.toString(), str));
            a(jSONObject, j10, str3);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public String a(String str, String str2, Qimei qimei, String str3) {
        return a(str, str2, qimei, System.currentTimeMillis(), str3);
    }

    public void a(JSONObject jSONObject, long j10, String str) throws JSONException {
        String strA = com.tencent.qimei.l.a.a();
        Object objB = com.tencent.qimei.l.a.b(jSONObject.optString(a.KEY_ENCRYPT_KEY.a()) + jSONObject.optString(a.KEY_PARAMS.a()) + j10 + strA + com.tencent.qimei.d.d.l().B() + str);
        jSONObject.put(a.KEY_TIME.a(), String.valueOf(j10));
        jSONObject.put(a.KEY_NONCE.a(), strA);
        jSONObject.put(a.KEY_SIGN.a(), objB);
        jSONObject.put(a.KEY_EXTRA.a(), str);
    }
}
