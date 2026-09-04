package com.alibaba.sdk.android.httpdns.a;

import android.content.Context;
import android.util.Log;
import com.alibaba.sdk.android.beacon.Beacon;
import com.alibaba.sdk.android.httpdns.d.b;
import com.alibaba.sdk.android.httpdns.i;
import java.util.HashMap;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile a f37893a;
    private Context mContext = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private b f16a = null;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Beacon f15a = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f37894m = true;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Beacon.OnUpdateListener f14a = new Beacon.OnUpdateListener() { // from class: com.alibaba.sdk.android.httpdns.a.a.1
        @Override // com.alibaba.sdk.android.beacon.Beacon.OnUpdateListener
        public void onUpdate(List<Beacon.Config> list) {
            try {
                a.this.b(list);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final Beacon.OnServiceErrListener f13a = new Beacon.OnServiceErrListener() { // from class: com.alibaba.sdk.android.httpdns.a.a.2
        @Override // com.alibaba.sdk.android.beacon.Beacon.OnServiceErrListener
        public void onErr(Beacon.Error error) {
            Log.e("HTTPDNS:BeaconManager", "beacon error. errorCode:" + error.errCode + ", errorMsg:" + error.errMsg);
        }
    };

    private a() {
    }

    public static a a() {
        if (f37893a == null) {
            synchronized (a.class) {
                if (f37893a == null) {
                    f37893a = new a();
                }
            }
        }
        return f37893a;
    }

    private boolean a(Beacon.Config config) {
        if (config == null || !config.key.equalsIgnoreCase("___httpdns_service___")) {
            return false;
        }
        String str = config.value;
        if (str != null) {
            Log.d("HTTPDNS:BeaconManager", "httpdns configs:" + str);
            try {
                JSONObject jSONObject = new JSONObject(str);
                if (jSONObject.has("ut")) {
                    f(jSONObject.getString("ut"));
                }
                if (jSONObject.has("ip-ranking")) {
                    i(jSONObject.getString("ip-ranking"));
                }
                if (jSONObject.has("status")) {
                    j(jSONObject.getString("status"));
                }
            } catch (Exception e10) {
                Log.e("HTTPDNS:BeaconManager", "parse push configs failed.", e10);
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(List<Beacon.Config> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        for (Beacon.Config config : list) {
            if (config.key.equalsIgnoreCase("___httpdns_service___")) {
                a(config);
            }
        }
    }

    private boolean f(String str) {
        if (str == null || this.f16a == null) {
            return false;
        }
        Log.d("HTTPDNS:BeaconManager", "is report enabled:" + str);
        if (str.equalsIgnoreCase("disabled")) {
            this.f16a.e(false);
        } else {
            this.f16a.e(true);
        }
        return true;
    }

    private void i(String str) {
        if (str != null) {
            Log.d("HTTPDNS:BeaconManager", "is IP probe enabled:" + str);
            this.f37894m = !str.equalsIgnoreCase("disabled");
        }
    }

    private void j(String str) {
        if (str != null) {
            com.alibaba.sdk.android.httpdns.b.a(!"disabled".equals(str));
            i.e("[beacon] httpdns enable: " + com.alibaba.sdk.android.httpdns.b.a());
        }
    }

    public void a(b bVar) {
        this.f16a = bVar;
    }

    public void c(Context context, String str) {
        this.mContext = context;
        if (context != null) {
            HashMap map = new HashMap();
            map.put("sdkId", "httpdns");
            map.put("accountId", str);
            Beacon beaconBuild = new Beacon.Builder().appKey("24657847").appSecret("f30fc0937f2b1e9e50a1b7134f1ddb10").loopInterval(7200000L).extras(map).build();
            this.f15a = beaconBuild;
            beaconBuild.addUpdateListener(this.f14a);
            this.f15a.addServiceErrListener(this.f13a);
            this.f15a.start(this.mContext.getApplicationContext());
        }
    }

    public boolean f() {
        return this.f37894m;
    }
}
