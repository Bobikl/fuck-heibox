package com.huawei.agconnect.config.impl;

import android.content.Context;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.AGConnectOptions;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.core.Service;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class b implements AGConnectOptions {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f60124a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f60125b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f60126c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AGCRoutePolicy f60127d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final d f60128e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final e f60129f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f60130g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final List<Service> f60131h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Map<String, String> f60132i = new HashMap();

    public b(Context context, String str, AGCRoutePolicy aGCRoutePolicy, InputStream inputStream, Map<String, String> map, List<Service> list, String str2) {
        context = context.getApplicationContext() != null ? context.getApplicationContext() : context;
        this.f60125b = context;
        str = str == null ? context.getPackageName() : str;
        this.f60126c = str;
        if (inputStream != null) {
            this.f60128e = new h(inputStream, str);
            Utils.closeQuietly(inputStream);
        } else {
            this.f60128e = new k(context, str);
        }
        this.f60129f = new e(this.f60128e);
        AGCRoutePolicy aGCRoutePolicy2 = AGCRoutePolicy.UNKNOWN;
        if (aGCRoutePolicy != aGCRoutePolicy2 && "1.0".equals(this.f60128e.a("/configuration_version", null))) {
            throw new RuntimeException("The file version does not match,please download the latest agconnect-services.json from the AGC website.");
        }
        this.f60127d = (aGCRoutePolicy == null || aGCRoutePolicy == aGCRoutePolicy2) ? Utils.getRoutePolicyFromJson(this.f60128e.a("/region", null), this.f60128e.a("/agcgw/url", null)) : aGCRoutePolicy;
        this.f60130g = Utils.fixKeyPathMap(map);
        this.f60131h = list;
        this.f60124a = str2 == null ? b() : str2;
    }

    private String a(String str) {
        Map<String, JsonProcessingFactory.JsonProcessor> processors = JsonProcessingFactory.getProcessors();
        if (!processors.containsKey(str)) {
            return null;
        }
        if (this.f60132i.containsKey(str)) {
            return this.f60132i.get(str);
        }
        JsonProcessingFactory.JsonProcessor jsonProcessor = processors.get(str);
        if (jsonProcessor == null) {
            return null;
        }
        String strProcessOption = jsonProcessor.processOption(this);
        this.f60132i.put(str, strProcessOption);
        return strProcessOption;
    }

    private String b() {
        return String.valueOf(("{packageName='" + this.f60126c + "', routePolicy=" + this.f60127d + ", reader=" + this.f60128e.toString().hashCode() + ", customConfigMap=" + new JSONObject(this.f60130g).toString().hashCode() + '}').hashCode());
    }

    public List<Service> a() {
        return this.f60131h;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public boolean getBoolean(String str, boolean z10) {
        return Boolean.parseBoolean(getString(str, String.valueOf(z10)));
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public Context getContext() {
        return this.f60125b;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getIdentifier() {
        return this.f60124a;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public int getInt(String str) {
        return getInt(str, 0);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public int getInt(String str, int i10) {
        try {
            return Integer.parseInt(getString(str, String.valueOf(i10)));
        } catch (NumberFormatException unused) {
            return i10;
        }
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getPackageName() {
        return this.f60126c;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public AGCRoutePolicy getRoutePolicy() {
        AGCRoutePolicy aGCRoutePolicy = this.f60127d;
        return aGCRoutePolicy == null ? AGCRoutePolicy.UNKNOWN : aGCRoutePolicy;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str) {
        return getString(str, null);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str, String str2) {
        if (str == null) {
            return str2;
        }
        String strFixPath = Utils.fixPath(str);
        String str3 = this.f60130g.get(strFixPath);
        if (str3 != null) {
            return str3;
        }
        String strA = a(strFixPath);
        if (strA != null) {
            return strA;
        }
        String strA2 = this.f60128e.a(strFixPath, str2);
        return e.a(strA2) ? this.f60129f.a(strA2, str2) : strA2;
    }
}
