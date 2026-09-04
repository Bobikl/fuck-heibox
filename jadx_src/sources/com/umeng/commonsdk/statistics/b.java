package com.umeng.commonsdk.statistics;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.umeng.analytics.AnalyticsConfig;
import com.umeng.analytics.pro.ak;
import com.umeng.analytics.pro.bc;
import com.umeng.commonsdk.config.FieldManager;
import com.umeng.commonsdk.framework.UMEnvelopeBuild;
import com.umeng.commonsdk.framework.UMFrUtils;
import com.umeng.commonsdk.internal.crash.UMCrashManager;
import com.umeng.commonsdk.stateless.d;
import com.umeng.commonsdk.statistics.common.DataHelper;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import com.umeng.commonsdk.statistics.common.ULog;
import com.umeng.commonsdk.statistics.idtracking.Envelope;
import com.umeng.commonsdk.statistics.idtracking.ImprintHandler;
import com.umeng.commonsdk.statistics.idtracking.e;
import com.umeng.commonsdk.statistics.internal.PreferenceWrapper;
import com.umeng.commonsdk.utils.UMUtils;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: EnvelopeManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f105276a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f105277b = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f105278c = "EnvelopeManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f105279d = "debug.umeng.umTaskId";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f105280e = "debug.umeng.umCaseId";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f105281f = "empty";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static String f105282g = "";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f105283h = "";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f105284i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static boolean f105285k;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f105286j = 0;

    private int a(Context context, Envelope envelope, String str, String str2, String str3) {
        if (context == null || envelope == null || TextUtils.isEmpty(str)) {
            return 101;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = DeviceConfig.getAppVersionName(context);
        }
        String strB = d.b(str3);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append("&&");
        sb2.append(str2);
        sb2.append(lg.a.f131412e);
        sb2.append(System.currentTimeMillis());
        sb2.append(lg.a.f131412e);
        sb2.append(strB);
        sb2.append(".log");
        byte[] binary = envelope.toBinary();
        return (str.startsWith(ak.aD) || str.startsWith("i") || str.startsWith(ak.av) || str.startsWith("t")) ? UMFrUtils.saveEnvelopeFile(context, sb2.toString(), binary) : d.a(context, com.umeng.commonsdk.stateless.a.f105247f, sb2.toString(), binary);
    }

    public static long a(Context context) {
        long j10 = DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX - DataHelper.ENVELOPE_EXTRA_LENGTH;
        if (ULog.DEBUG) {
            Log.i(f105278c, "free size is " + j10);
        }
        return j10;
    }

    private Envelope a(Context context, byte[] bArr) {
        String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, "codex", null);
        int iIntValue = -1;
        try {
            if (!TextUtils.isEmpty(strImprintProperty)) {
                iIntValue = Integer.valueOf(strImprintProperty).intValue();
            }
        } catch (NumberFormatException e10) {
            UMCrashManager.reportCrash(context, e10);
        }
        if (iIntValue == 0) {
            return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        if (iIntValue != 1 && !f105285k) {
            return Envelope.genEnvelope(context, UMUtils.getAppkey(context), bArr);
        }
        return Envelope.genEncryptEnvelope(context, UMUtils.getAppkey(context), bArr);
    }

    private JSONObject a(int i10, JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                jSONObject.put("exception", i10);
            } catch (Exception unused) {
            }
            return jSONObject;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("exception", i10);
        } catch (Exception unused2) {
        }
        return jSONObject2;
    }

    private static JSONObject a(Context context, String str, boolean z10) {
        JSONObject jSONObject;
        try {
            SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
            if (TextUtils.isEmpty(f105284i)) {
                UMUtils.saveSDKComponent();
                jSONObject = new JSONObject();
                jSONObject.put(ak.f104456p, DeviceConfig.getAppMD5Signature(context));
                jSONObject.put(ak.f104457q, DeviceConfig.getAppSHA1Key(context));
                jSONObject.put(ak.f104458r, DeviceConfig.getAppHashKey(context));
                jSONObject.put("app_version", DeviceConfig.getAppVersionName(context));
                jSONObject.put("version_code", Integer.parseInt(DeviceConfig.getAppVersionCode(context)));
                jSONObject.put(ak.f104462v, DeviceConfig.getDeviceIdUmengMD5(context));
                jSONObject.put(ak.f104463w, DeviceConfig.getCPU());
                String mccmnc = DeviceConfig.getMCCMNC(context);
                if (TextUtils.isEmpty(mccmnc)) {
                    jSONObject.put(ak.B, "");
                } else {
                    jSONObject.put(ak.B, mccmnc);
                    f105277b = mccmnc;
                }
                String subOSName = DeviceConfig.getSubOSName(context);
                if (!TextUtils.isEmpty(subOSName)) {
                    jSONObject.put(ak.K, subOSName);
                }
                String subOSVersion = DeviceConfig.getSubOSVersion(context);
                if (!TextUtils.isEmpty(subOSVersion)) {
                    jSONObject.put(ak.L, subOSVersion);
                }
                String deviceType = DeviceConfig.getDeviceType(context);
                if (!TextUtils.isEmpty(deviceType)) {
                    jSONObject.put(ak.f104426ai, deviceType);
                }
                jSONObject.put("package_name", DeviceConfig.getPackageName(context));
                jSONObject.put("sdk_type", "Android");
                jSONObject.put("device_id", DeviceConfig.getDeviceId(context));
                jSONObject.put("device_model", Build.MODEL);
                jSONObject.put(ak.E, Build.BOARD);
                jSONObject.put(ak.F, Build.BRAND);
                jSONObject.put(ak.G, Build.TIME);
                jSONObject.put(ak.H, Build.MANUFACTURER);
                jSONObject.put(ak.I, Build.ID);
                jSONObject.put(ak.J, Build.DEVICE);
                jSONObject.put("os_version", Build.VERSION.RELEASE);
                jSONObject.put("os", "Android");
                int[] resolutionArray = DeviceConfig.getResolutionArray(context);
                if (resolutionArray != null) {
                    jSONObject.put("resolution", resolutionArray[1] + androidx.webkit.b.f28327e + resolutionArray[0]);
                }
                jSONObject.put(ak.A, DeviceConfig.getMac(context));
                jSONObject.put(ak.M, DeviceConfig.getTimeZone(context));
                String[] localeInfo = DeviceConfig.getLocaleInfo(context);
                jSONObject.put(ak.O, localeInfo[0]);
                jSONObject.put(ak.N, localeInfo[1]);
                jSONObject.put("carrier", DeviceConfig.getNetworkOperatorName(context));
                jSONObject.put("display_name", DeviceConfig.getAppName(context));
                String[] networkAccessMode = DeviceConfig.getNetworkAccessMode(context);
                if ("Wi-Fi".equals(networkAccessMode[0])) {
                    jSONObject.put(ak.Q, "wifi");
                } else if ("2G/3G".equals(networkAccessMode[0])) {
                    jSONObject.put(ak.Q, "2G/3G");
                } else {
                    jSONObject.put(ak.Q, "unknow");
                }
                if (!"".equals(networkAccessMode[1])) {
                    jSONObject.put(ak.R, networkAccessMode[1]);
                }
                if (DeviceConfig.isHarmony(context)) {
                    jSONObject.put("others_OS", "harmony");
                } else {
                    jSONObject.put("others_OS", "Android");
                }
                if (FieldManager.allow(com.umeng.commonsdk.utils.b.H)) {
                    jSONObject.put(ak.S, DeviceConfig.getIPAddress(context));
                }
                jSONObject.put("network_type", DeviceConfig.getNetworkType(context));
                jSONObject.put(ak.f104430b, "9.4.4+000");
                jSONObject.put(ak.f104443c, SdkVersion.SDK_TYPE);
                jSONObject.put(ak.f104444d, "1");
                if (!TextUtils.isEmpty(f105276a)) {
                    jSONObject.put("module", f105276a);
                }
                jSONObject.put(ak.f104427aj, Build.VERSION.SDK_INT);
                if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
                    jSONObject.put(ak.f104423af, UMUtils.VALUE_REC_VERSION_NAME);
                }
                try {
                    String uUIDForZid = UMUtils.getUUIDForZid(context);
                    if (TextUtils.isEmpty(uUIDForZid)) {
                        UMUtils.setUUIDForZid(context);
                        uUIDForZid = UMUtils.getUUIDForZid(context);
                    }
                    jSONObject.put("session_id", uUIDForZid);
                } catch (Throwable unused) {
                }
                f105284i = jSONObject.toString();
            } else {
                try {
                    jSONObject = new JSONObject(f105284i);
                } catch (Exception unused2) {
                    jSONObject = null;
                }
            }
            if (jSONObject == null) {
                return null;
            }
            try {
                jSONObject.put(ak.f104428ak, UMUtils.getOaidRequiredTime(context));
            } catch (Exception unused3) {
            }
            try {
                jSONObject.put(ak.U, sharedPreferences.getInt("successful_request", 0));
                jSONObject.put(ak.V, sharedPreferences.getInt(ak.V, 0));
                jSONObject.put(ak.W, sharedPreferences.getInt("last_request_spent_ms", 0));
                String zid = UMUtils.getZid(context);
                if (!TextUtils.isEmpty(zid)) {
                    jSONObject.put(ak.f104429al, zid);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
                    jSONObject.put(ak.am, UMUtils.VALUE_ASMS_VERSION);
                }
            } catch (Exception unused4) {
            }
            jSONObject.put("channel", UMUtils.getChannel(context));
            jSONObject.put("appkey", UMUtils.getAppkey(context));
            try {
                String deviceToken = UMUtils.getDeviceToken(context);
                if (!TextUtils.isEmpty(deviceToken)) {
                    jSONObject.put(ak.f104417a, deviceToken);
                }
            } catch (Exception e10) {
                UMCrashManager.reportCrash(context, e10);
            }
            try {
                String strImprintProperty = UMEnvelopeBuild.imprintProperty(context, "umid", null);
                if (!TextUtils.isEmpty(strImprintProperty)) {
                    jSONObject.put("umid", strImprintProperty);
                }
            } catch (Exception e11) {
                UMCrashManager.reportCrash(context, e11);
            }
            try {
                jSONObject.put("wrapper_type", a.f105273a);
                jSONObject.put("wrapper_version", a.f105274b);
            } catch (Exception unused5) {
            }
            int targetSdkVersion = UMUtils.getTargetSdkVersion(context);
            boolean zCheckPermission = UMUtils.checkPermission(context, "android.permission.READ_PHONE_STATE");
            jSONObject.put(ak.aU, targetSdkVersion);
            if (zCheckPermission) {
                jSONObject.put(ak.aV, "yes");
            } else {
                jSONObject.put(ak.aV, "no");
            }
            try {
                if (b()) {
                    jSONObject.put("umTaskId", f105282g);
                    jSONObject.put("umCaseId", f105283h);
                }
            } catch (Throwable unused6) {
            }
            if (("t".equals(str) || ak.av.equals(str)) && z10) {
                try {
                    int[] iArrB = b(context);
                    jSONObject.put(ak.bo, String.valueOf(iArrB[0]) + String.valueOf(iArrB[1]) + String.valueOf(iArrB[2]));
                } catch (Throwable unused7) {
                }
            }
            try {
                Map<String, String> moduleTags = TagHelper.getModuleTags();
                if (moduleTags != null && moduleTags.size() > 0) {
                    JSONObject jSONObject2 = new JSONObject();
                    for (Map.Entry<String, String> entry : moduleTags.entrySet()) {
                        jSONObject2.put(entry.getKey(), entry.getValue());
                    }
                    jSONObject.put(ak.ap, jSONObject2);
                }
            } catch (Throwable unused8) {
            }
            try {
                String realTimeDebugKey = AnalyticsConfig.getRealTimeDebugKey();
                if (!TextUtils.isEmpty(realTimeDebugKey)) {
                    jSONObject.put(ak.bn, realTimeDebugKey);
                }
            } catch (Throwable unused9) {
            }
            try {
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put(ak.aZ, com.umeng.commonsdk.internal.a.f105195e);
                if (!TextUtils.isEmpty(UMUtils.VALUE_ANALYTICS_VERSION)) {
                    jSONObject3.put(ak.f104431ba, UMUtils.VALUE_ANALYTICS_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_GAME_VERSION)) {
                    jSONObject3.put(ak.f104432bb, UMUtils.VALUE_GAME_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_PUSH_VERSION)) {
                    jSONObject3.put(ak.f104433bc, UMUtils.VALUE_PUSH_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_SHARE_VERSION)) {
                    jSONObject3.put(ak.f104434bd, UMUtils.VALUE_SHARE_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_APM_VERSION)) {
                    jSONObject3.put(ak.f104435be, UMUtils.VALUE_APM_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_VERIFY_VERSION)) {
                    jSONObject3.put(ak.f104436bf, UMUtils.VALUE_VERIFY_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_SMS_VERSION)) {
                    jSONObject3.put(ak.f104437bg, UMUtils.VALUE_SMS_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_REC_VERSION_NAME)) {
                    jSONObject3.put(ak.f104438bh, UMUtils.VALUE_REC_VERSION_NAME);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_VISUAL_VERSION)) {
                    jSONObject3.put(ak.f104439bi, UMUtils.VALUE_VISUAL_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_ASMS_VERSION)) {
                    jSONObject3.put(ak.f104440bj, UMUtils.VALUE_ASMS_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_LINK_VERSION)) {
                    jSONObject3.put(ak.f104441bk, UMUtils.VALUE_LINK_VERSION);
                }
                if (!TextUtils.isEmpty(UMUtils.VALUE_ABTEST_VERSION)) {
                    jSONObject3.put(ak.f104442bl, UMUtils.VALUE_ABTEST_VERSION);
                }
                jSONObject.put(ak.aY, jSONObject3);
            } catch (Throwable unused10) {
            }
            try {
                String apmFlag = UMUtils.getApmFlag();
                if (!TextUtils.isEmpty(apmFlag)) {
                    jSONObject.put(ak.bm, apmFlag);
                }
            } catch (Throwable unused11) {
            }
            byte[] bArrA = ImprintHandler.getImprintService(context).a();
            if (bArrA != null && bArrA.length > 0) {
                try {
                    jSONObject.put(ak.X, Base64.encodeToString(bArrA, 0));
                } catch (JSONException e12) {
                    UMCrashManager.reportCrash(context, e12);
                }
            }
            if (jSONObject.length() > 0) {
                return new JSONObject().put("header", jSONObject);
            }
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
        }
        return null;
    }

    private JSONObject a(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject != null && jSONObject2 != null && jSONObject.opt("header") != null && (jSONObject.opt("header") instanceof JSONObject)) {
            JSONObject jSONObject3 = (JSONObject) jSONObject.opt("header");
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                if (next != null && (next instanceof String)) {
                    String str = next;
                    if (jSONObject2.opt(str) != null) {
                        try {
                            jSONObject3.put(str, jSONObject2.opt(str));
                            if (str.equals(com.umeng.analytics.pro.d.f104702i) && (jSONObject2.opt(str) instanceof Integer)) {
                                this.f105286j = ((Integer) jSONObject2.opt(str)).intValue();
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public static void a() {
        if (f105284i != null) {
            f105284i = null;
            e.a();
        }
    }

    public static void a(boolean z10) {
        f105285k = z10;
    }

    private static boolean b() {
        f105282g = UMUtils.getSystemProperty(f105279d, "");
        f105283h = UMUtils.getSystemProperty(f105280e, "");
        return (!TextUtils.isEmpty(f105282g) && !f105281f.equals(f105282g)) && (!TextUtils.isEmpty(f105283h) && !f105281f.equals(f105283h));
    }

    private static int[] b(Context context) {
        int[] iArr = new int[3];
        try {
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(com.umeng.commonsdk.internal.c.f105220a, 0);
            if (sharedPreferences != null) {
                iArr[0] = sharedPreferences.getInt(com.umeng.commonsdk.internal.c.f105221b, 0);
                iArr[1] = sharedPreferences.getInt(com.umeng.commonsdk.internal.c.f105222c, 0);
                iArr[2] = sharedPreferences.getInt("policyGrantResult", 0);
            }
        } catch (Throwable unused) {
        }
        return iArr;
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str) {
        Envelope envelope;
        try {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("header", new JSONObject());
            try {
                if (b()) {
                    jSONObject.put("umTaskId", f105282g);
                    jSONObject.put("umCaseId", f105283h);
                }
            } catch (Throwable unused) {
            }
            if (jSONObject != null) {
                jSONObject3 = a(jSONObject3, jSONObject);
            }
            if (jSONObject3 != null && jSONObject2 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (next instanceof String)) {
                        String str2 = next;
                        if (jSONObject2.opt(str2) != null) {
                            try {
                                jSONObject3.put(str2, jSONObject2.opt(str2));
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
            if (jSONObject3 != null && DataHelper.largeThanMaxSize(jSONObject3.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return a(113, jSONObject3);
            }
            if (jSONObject3 != null) {
                Envelope envelopeA = a(context, jSONObject3.toString().getBytes());
                if (envelopeA == null) {
                    return a(111, jSONObject3);
                }
                envelope = envelopeA;
            } else {
                envelope = null;
            }
            if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject3);
            }
            int iA = a(context, envelope, "z==1.2.0", jSONObject3 != null ? jSONObject3.optJSONObject("header").optString("app_version") : null, str);
            if (iA != 0) {
                return a(iA, jSONObject3);
            }
            if (ULog.DEBUG) {
                Log.i(f105278c, "constructHeader size is " + jSONObject3.toString().getBytes().length);
            }
            return jSONObject3;
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
            return a(110, new JSONObject());
        }
    }

    public JSONObject a(Context context, JSONObject jSONObject, JSONObject jSONObject2, String str, String str2, String str3) {
        JSONObject jSONObject3;
        String str4;
        Envelope envelope;
        JSONObject jSONObjectOptJSONObject;
        if (ULog.DEBUG && jSONObject != null && jSONObject2 != null) {
            Log.i(f105278c, "headerJSONObject size is " + jSONObject.toString().getBytes().length);
            Log.i(f105278c, "bodyJSONObject size is " + jSONObject2.toString().getBytes().length);
        }
        if (context == null || jSONObject2 == null) {
            return a(110, (JSONObject) null);
        }
        try {
            JSONObject jSONObjectA = a(context, str2, jSONObject2.has("analytics") && (jSONObjectOptJSONObject = jSONObject2.optJSONObject("analytics")) != null && jSONObjectOptJSONObject.has(com.umeng.analytics.pro.d.f104707n));
            if (jSONObjectA != null && jSONObject != null) {
                jSONObjectA = a(jSONObjectA, jSONObject);
            }
            JSONObject jSONObject4 = jSONObjectA;
            if (jSONObject4 != null) {
                Iterator<String> itKeys = jSONObject2.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    if (next != null && (next instanceof String)) {
                        String str5 = next;
                        if (jSONObject2.opt(str5) != null) {
                            try {
                                jSONObject4.put(str5, jSONObject2.opt(str5));
                            } catch (Exception unused) {
                            }
                        }
                    }
                }
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = ak.aG;
            }
            String str6 = TextUtils.isEmpty(str3) ? "1.0.0" : str3;
            if (jSONObject4 != null) {
                String strSubstring = str2 + "==" + str6 + "&=";
                if (TextUtils.isEmpty(strSubstring)) {
                    return a(101, jSONObject4);
                }
                if (strSubstring.endsWith("&=")) {
                    strSubstring = strSubstring.substring(0, strSubstring.length() - 2);
                }
                str4 = strSubstring;
            } else {
                str4 = null;
            }
            if (jSONObject4 != null) {
                try {
                    e eVarA = e.a(context);
                    if (eVarA != null) {
                        eVarA.b();
                        String strEncodeToString = Base64.encodeToString(new bc().a(eVarA.c()), 0);
                        if (!TextUtils.isEmpty(strEncodeToString)) {
                            JSONObject jSONObject5 = jSONObject4.getJSONObject("header");
                            jSONObject5.put(ak.Y, strEncodeToString);
                            jSONObject4.put("header", jSONObject5);
                        }
                    }
                } catch (Exception unused2) {
                }
            }
            if (jSONObject4 != null && DataHelper.largeThanMaxSize(jSONObject4.toString().getBytes().length, DataHelper.ENVELOPE_ENTITY_RAW_LENGTH_MAX)) {
                SharedPreferences sharedPreferences = PreferenceWrapper.getDefault(context);
                if (sharedPreferences != null) {
                    sharedPreferences.edit().putInt("serial", sharedPreferences.getInt("serial", 1) + 1).commit();
                }
                return a(113, jSONObject4);
            }
            if (jSONObject4 != null) {
                Envelope envelopeA = a(context, jSONObject4.toString().getBytes());
                if (envelopeA == null) {
                    return a(111, jSONObject4);
                }
                envelope = envelopeA;
            } else {
                envelope = null;
            }
            if (envelope != null && DataHelper.largeThanMaxSize(envelope.toBinary().length, DataHelper.ENVELOPE_LENGTH_MAX)) {
                return a(114, jSONObject4);
            }
            int iA = a(context, envelope, str4, jSONObject4 != null ? jSONObject4.optJSONObject("header").optString("app_version") : null, str);
            if (iA != 0) {
                return a(iA, jSONObject4);
            }
            if (ULog.DEBUG) {
                Log.i(f105278c, "constructHeader size is " + jSONObject4.toString().getBytes().length);
            }
            if (!str4.startsWith(ak.aD) && !str4.startsWith("i") && !str4.startsWith("t") && !str4.startsWith(ak.av) && !com.umeng.commonsdk.stateless.b.a()) {
                new com.umeng.commonsdk.stateless.b(context);
                com.umeng.commonsdk.stateless.b.b();
            }
            return jSONObject4;
        } catch (Throwable th2) {
            UMCrashManager.reportCrash(context, th2);
            if (jSONObject != null) {
                try {
                    JSONObject jSONObject6 = new JSONObject();
                    try {
                        jSONObject6.put("header", jSONObject);
                    } catch (JSONException unused3) {
                    } catch (Exception e10) {
                        e = e10;
                        jSONObject3 = jSONObject6;
                        UMCrashManager.reportCrash(context, e);
                        return a(110, jSONObject3);
                    }
                    jSONObject3 = jSONObject6;
                } catch (Exception e11) {
                    e = e11;
                    jSONObject3 = null;
                }
            } else {
                jSONObject3 = null;
            }
            if (jSONObject3 == null) {
                try {
                    jSONObject3 = new JSONObject();
                } catch (Exception e12) {
                    e = e12;
                    UMCrashManager.reportCrash(context, e);
                    return a(110, jSONObject3);
                }
            }
            Iterator<String> itKeys2 = jSONObject2.keys();
            while (itKeys2.hasNext()) {
                String next2 = itKeys2.next();
                if (next2 != null && (next2 instanceof String)) {
                    String str7 = next2;
                    if (jSONObject2.opt(str7) != null) {
                        try {
                            jSONObject3.put(str7, jSONObject2.opt(str7));
                        } catch (Exception unused4) {
                        }
                    }
                }
            }
            return a(110, jSONObject3);
        }
    }
}
