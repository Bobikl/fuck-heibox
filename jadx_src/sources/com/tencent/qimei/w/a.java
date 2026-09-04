package com.tencent.qimei.w;

import com.taobao.accs.common.Constants;
import com.tencent.mm.opensdk.constants.ConstantsAPI;
import com.tencent.qimei.i.e;
import com.tencent.qimei.upload.BuildConfig;
import com.tencent.qimei.v.g;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.TPDownloadProxyEnum;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: StrategyProtocol.java */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f101465a = new a();

    /* JADX INFO: renamed from: com.tencent.qimei.w.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: StrategyProtocol.java */
    public enum EnumC0982a implements com.tencent.qimei.g.a<Boolean> {
        KEY_DATA_ENABLE_QIMEI(BuildConfig.SDK_ID, com.tencent.qimei.v.d.a().h()),
        KEY_DATA_ENABLE_QIMEI36(TPDownloadProxyEnum.TAB_QIMEI36, com.tencent.qimei.v.d.a().C()),
        KEY_DATA_ENABLE_OAID("oaid", com.tencent.qimei.v.d.a().g()),
        KEY_DATA_ENABLE_USERID("userId", com.tencent.qimei.v.d.a().b()),
        KEY_DATA_ENABLE_IMEI("imei", com.tencent.qimei.v.d.a().A()),
        KEY_DATA_ENABLE_IMSI(Constants.KEY_IMSI, com.tencent.qimei.v.d.a().B()),
        KEY_DATA_ENABLE_ANDROID_ID("androidId", com.tencent.qimei.v.d.a().u()),
        KEY_DATA_ENABLE_MAC("mac", com.tencent.qimei.v.d.a().o()),
        KEY_DATA_ENABLE_CID("cid", com.tencent.qimei.v.d.a().l()),
        KEY_DATA_ENABLE_PROCESS_INFO("processInfo", com.tencent.qimei.v.d.a().v()),
        KEY_DATA_ENABLE_AUDIT("audit", com.tencent.qimei.v.d.a().t()),
        KEY_DATA_FORCE_UPDATE_QIMEI("updateQimei", com.tencent.qimei.v.d.a().j()),
        KEY_DATA_ENABLE_REPORT("report", com.tencent.qimei.v.d.a().x()),
        KEY_DATA_ENABLE_BEACON_ID("isBidEnable", com.tencent.qimei.v.d.a().r());


        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public static final com.tencent.qimei.i.c<Boolean> f101480o = new com.tencent.qimei.i.b(new com.tencent.qimei.g.a[0]);

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public final String f101482q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public final boolean f101483r;

        EnumC0982a(String str, boolean z10) {
            this.f101482q = str;
            this.f101483r = z10;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tencent.qimei.g.a
        public Boolean a() {
            return Boolean.valueOf(this.f101483r);
        }

        public Boolean a(String str) {
            return f101480o.a(this, g.a(str));
        }

        @Override // com.tencent.qimei.g.a
        public String b() {
            return this.f101482q;
        }
    }

    /* JADX INFO: compiled from: StrategyProtocol.java */
    public enum b implements com.tencent.qimei.g.a<Integer> {
        KEY_DATA_QIMEI_REPORT_RATE("reportRate", com.tencent.qimei.v.d.a().y()),
        KEY_DATA_QIMEI_JS_TIME("jsTime", com.tencent.qimei.v.d.a().c()),
        KEY_DATA_QIMEI_ARDT("ardt", com.tencent.qimei.v.d.a().q());


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final com.tencent.qimei.i.c<Integer> f101487d = new com.tencent.qimei.i.d(new com.tencent.qimei.g.a[0]);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f101489f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f101490g;

        b(String str, int i10) {
            this.f101489f = str;
            this.f101490g = i10;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tencent.qimei.g.a
        public Integer a() {
            return Integer.valueOf(this.f101490g);
        }

        public Integer a(String str) {
            return f101487d.a(this, g.a(str));
        }

        @Override // com.tencent.qimei.g.a
        public String b() {
            return this.f101489f;
        }
    }

    /* JADX INFO: compiled from: StrategyProtocol.java */
    public enum c {
        KEY_CIPHER_KEY("key"),
        KEY_PLATFORM_ID(ConstantsAPI.Token.WX_TOKEN_PLATFORMID_KEY),
        KEY_OS_VERSION("osVersion"),
        KEY_APP_VERSION("appVersion"),
        KEY_SDK_VERSION("sdkVersion"),
        KEY_AUDIT_VERSION("auditVersion"),
        KEY_APP_KEY("appKey"),
        KEY_CONFIG_VERSION("configVersion"),
        KEY_PACKAGE_NAME("packageName");


        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public String f101501k;

        c(String str) {
            this.f101501k = str;
        }

        public String a() {
            return this.f101501k;
        }
    }

    /* JADX INFO: compiled from: StrategyProtocol.java */
    public enum d implements com.tencent.qimei.g.a<String> {
        KEY_DATA_VERSION("version", ""),
        KEY_DATA_QIMEI_REQUEST_URL("url", com.tencent.qimei.v.d.a().s()),
        KEY_DATA_PEAK_TIME("peakTime", com.tencent.qimei.v.d.a().f());


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final com.tencent.qimei.i.c<String> f101505d = new e(new com.tencent.qimei.g.a[0]);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f101507f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f101508g;

        d(String str, String str2) {
            this.f101507f = str;
            this.f101508g = str2;
        }

        @Override // com.tencent.qimei.g.a
        public String a() {
            return this.f101508g;
        }

        public String a(String str) {
            return f101505d.a(this, g.a(str));
        }

        @Override // com.tencent.qimei.g.a
        public String b() {
            return this.f101507f;
        }
    }

    public static a a() {
        return f101465a;
    }

    public String a(String str) {
        if (str.isEmpty()) {
            return com.tencent.qimei.f.a.a() + "/config";
        }
        return str + "/config";
    }

    public String a(String str, String str2) {
        com.tencent.qimei.u.d dVarB = com.tencent.qimei.u.d.b();
        com.tencent.qimei.d.d dVarL = com.tencent.qimei.d.d.l();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(c.KEY_CIPHER_KEY.a(), com.tencent.qimei.a.a.b(str, com.tencent.qimei.f.a.b()));
            jSONObject.put(c.KEY_PLATFORM_ID.a(), (int) dVarL.A());
            jSONObject.put(c.KEY_OS_VERSION.a(), dVarL.y());
            jSONObject.put(c.KEY_APP_VERSION.a(), com.tencent.qimei.d.a.a());
            jSONObject.put(c.KEY_SDK_VERSION.a(), dVarB.getSdkVersion());
            jSONObject.put(c.KEY_AUDIT_VERSION.a(), dVarB.K());
            jSONObject.put(c.KEY_APP_KEY.a(), str2);
            jSONObject.put(c.KEY_CONFIG_VERSION.a(), com.tencent.qimei.v.d.a(str2).p());
            jSONObject.put(c.KEY_PACKAGE_NAME.a(), com.tencent.qimei.d.a.c());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a().b());
            sb2.append(", raw content: ");
            sb2.append(jSONObject.toString());
            com.tencent.qimei.n.a.d(sb2.toString(), new Object[0]);
            return jSONObject.toString();
        } catch (JSONException e10) {
            e10.printStackTrace();
            return "";
        }
    }

    public String b() {
        return "STRATEGY";
    }
}
