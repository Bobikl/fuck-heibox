package com.efs.sdk.base.core.config.a;

import android.text.TextUtils;
import androidx.annotation.n0;
import com.efs.sdk.base.core.controller.ControllerCenter;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f42483a = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f42484b = "https://";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f42485c = "errnewlog.umeng.com";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    long f42486d = 480;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Boolean f42489g = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, Double> f42487e = new HashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Map<String, String> f42488f = new HashMap();

    private b() {
    }

    static b a() {
        b bVar = new b();
        if (ControllerCenter.getGlobalEnvStruct().isIntl()) {
            bVar.f42485c = "errnewlogos.umeng.com";
        } else {
            bVar.f42485c = "errnewlog.umeng.com";
        }
        return bVar;
    }

    final void a(@n0 Map<String, String> map) {
        if (map.containsKey("gate_way")) {
            String str = map.get("gate_way");
            if (!TextUtils.isEmpty(str)) {
                this.f42485c = str;
            }
        }
        if (map.containsKey("gate_way_https")) {
            String str2 = map.get("gate_way_https");
            if (!TextUtils.isEmpty(str2)) {
                this.f42484b = Boolean.parseBoolean(str2) ? "https://" : "http://";
            }
        }
        try {
            if (map.containsKey("updateInteval")) {
                String str3 = map.get("updateInteval");
                if (!TextUtils.isEmpty(str3)) {
                    this.f42486d = Long.parseLong(str3);
                }
            }
        } catch (Throwable th2) {
            th2.printStackTrace();
        }
        HashMap map2 = new HashMap();
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            if (key.startsWith("data_sampling_rate_") || key.startsWith("file_sampling_rate_")) {
                String strReplace = key.replace("data_sampling_rate_", "").replace("file_sampling_rate_", "");
                double d10 = 100.0d;
                try {
                    d10 = Double.parseDouble(entry.getValue());
                } catch (Throwable unused) {
                }
                map2.put(strReplace, Double.valueOf(d10));
            }
        }
        this.f42487e = map2;
        this.f42488f = map;
    }
}
