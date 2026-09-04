package anet.channel.strategy;

import anet.channel.strategy.dispatch.DispatchConstants;
import anet.channel.util.ALog;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.max.xiaoheihe.module.voice.HeyboxMicFragment;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.taobao.accs.utl.BaseMonitor;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes6.dex */
public class l {

    /* JADX INFO: compiled from: Taobao */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f29944a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f29945b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f29946c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f29947d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final int f29948e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f29949f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f29950g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final String f29951h;

        public a(JSONObject jSONObject) {
            this.f29944a = jSONObject.optInt(HeyboxMicFragment.f93763y);
            this.f29945b = jSONObject.optString(SwitchDetailActivity.P);
            this.f29946c = jSONObject.optInt("cto");
            this.f29947d = jSONObject.optInt("rto");
            this.f29948e = jSONObject.optInt("retry");
            this.f29949f = jSONObject.optInt("heartbeat");
            this.f29950g = jSONObject.optString("rtt", "");
            this.f29951h = jSONObject.optString("publickey");
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29952a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f29953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f29954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f29955d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f29956e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String[] f29957f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String[] f29958g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final a[] f29959h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final e[] f29960i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final boolean f29961j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final boolean f29962k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final int f29963l;

        public b(JSONObject jSONObject) {
            this.f29952a = jSONObject.optString("host");
            this.f29953b = jSONObject.optInt(RemoteMessageConst.TTL);
            this.f29954c = jSONObject.optString("safeAisles");
            this.f29955d = jSONObject.optString("cname", null);
            this.f29956e = jSONObject.optString("unit", null);
            this.f29961j = jSONObject.optInt("clear") == 1;
            this.f29962k = jSONObject.optBoolean("effectNow");
            this.f29963l = jSONObject.optInt("version");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("ips");
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                this.f29957f = new String[length];
                for (int i10 = 0; i10 < length; i10++) {
                    this.f29957f[i10] = jSONArrayOptJSONArray.optString(i10);
                }
            } else {
                this.f29957f = null;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("sips");
            if (jSONArrayOptJSONArray2 == null || jSONArrayOptJSONArray2.length() <= 0) {
                this.f29958g = null;
            } else {
                int length2 = jSONArrayOptJSONArray2.length();
                this.f29958g = new String[length2];
                for (int i11 = 0; i11 < length2; i11++) {
                    this.f29958g[i11] = jSONArrayOptJSONArray2.optString(i11);
                }
            }
            JSONArray jSONArrayOptJSONArray3 = jSONObject.optJSONArray("aisles");
            if (jSONArrayOptJSONArray3 != null) {
                int length3 = jSONArrayOptJSONArray3.length();
                this.f29959h = new a[length3];
                for (int i12 = 0; i12 < length3; i12++) {
                    this.f29959h[i12] = new a(jSONArrayOptJSONArray3.optJSONObject(i12));
                }
            } else {
                this.f29959h = null;
            }
            JSONArray jSONArrayOptJSONArray4 = jSONObject.optJSONArray("strategies");
            if (jSONArrayOptJSONArray4 == null || jSONArrayOptJSONArray4.length() <= 0) {
                this.f29960i = null;
                return;
            }
            int length4 = jSONArrayOptJSONArray4.length();
            this.f29960i = new e[length4];
            for (int i13 = 0; i13 < length4; i13++) {
                this.f29960i[i13] = new e(jSONArrayOptJSONArray4.optJSONObject(i13));
            }
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29964a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e[] f29965b;

        public c(JSONObject jSONObject) {
            this.f29964a = jSONObject.optString("host");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("strategies");
            if (jSONArrayOptJSONArray == null) {
                this.f29965b = null;
                return;
            }
            int length = jSONArrayOptJSONArray.length();
            this.f29965b = new e[length];
            for (int i10 = 0; i10 < length; i10++) {
                this.f29965b[i10] = new e(jSONArrayOptJSONArray.optJSONObject(i10));
            }
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29966a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b[] f29967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c[] f29968c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f29969d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f29970e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final int f29971f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final int f29972g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f29973h;

        public d(JSONObject jSONObject) {
            this.f29966a = jSONObject.optString("ip");
            this.f29969d = jSONObject.optString("uid", null);
            this.f29970e = jSONObject.optString("utdid", null);
            this.f29971f = jSONObject.optInt(DispatchConstants.CONFIG_VERSION);
            this.f29972g = jSONObject.optInt("fcl");
            this.f29973h = jSONObject.optInt("fct");
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray(BaseMonitor.COUNT_POINT_DNS);
            if (jSONArrayOptJSONArray != null) {
                int length = jSONArrayOptJSONArray.length();
                this.f29967b = new b[length];
                for (int i10 = 0; i10 < length; i10++) {
                    this.f29967b[i10] = new b(jSONArrayOptJSONArray.optJSONObject(i10));
                }
            } else {
                this.f29967b = null;
            }
            JSONArray jSONArrayOptJSONArray2 = jSONObject.optJSONArray("hrTask");
            if (jSONArrayOptJSONArray2 == null) {
                this.f29968c = null;
                return;
            }
            int length2 = jSONArrayOptJSONArray2.length();
            this.f29968c = new c[length2];
            for (int i11 = 0; i11 < length2; i11++) {
                this.f29968c[i11] = new c(jSONArrayOptJSONArray2.optJSONObject(i11));
            }
        }
    }

    /* JADX INFO: compiled from: Taobao */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f29974a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f29975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f29976c;

        public e(JSONObject jSONObject) {
            this.f29974a = jSONObject.optString("ip");
            this.f29976c = jSONObject.optString(FlutterActivityLaunchConfigs.EXTRA_PATH);
            this.f29975b = new a(jSONObject);
        }
    }

    public static d a(JSONObject jSONObject) {
        try {
            return new d(jSONObject);
        } catch (Exception e10) {
            ALog.e("StrategyResultParser", "Parse HttpDns response failed.", null, e10, "JSON Content", jSONObject.toString());
            return null;
        }
    }
}
