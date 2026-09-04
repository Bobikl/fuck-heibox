package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.util.Log;
import com.huawei.agconnect.AGCRoutePolicy;
import com.huawei.agconnect.JsonProcessingFactory;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.agconnect.config.LazyInputStream;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public class c extends AGConnectServicesConfig {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f60133a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f60134b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LazyInputStream f60135c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile d f60136d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Object f60137e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AGCRoutePolicy f60138f = AGCRoutePolicy.UNKNOWN;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<String, String> f60139g = new HashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private volatile e f60140h;

    public c(Context context, String str) {
        this.f60133a = context;
        this.f60134b = str;
    }

    private static LazyInputStream a(Context context, final InputStream inputStream) {
        return new LazyInputStream(context) { // from class: com.huawei.agconnect.config.impl.c.1
            @Override // com.huawei.agconnect.config.LazyInputStream
            public InputStream get(Context context2) {
                return inputStream;
            }
        };
    }

    private static String a(String str) {
        int i10 = 0;
        if (str.length() > 0) {
            while (str.charAt(i10) == '/') {
                i10++;
            }
        }
        return IOUtils.DIR_SEPARATOR_UNIX + str.substring(i10);
    }

    private void a() {
        if (this.f60136d == null) {
            synchronized (this.f60137e) {
                if (this.f60136d == null) {
                    LazyInputStream lazyInputStream = this.f60135c;
                    if (lazyInputStream != null) {
                        this.f60136d = new h(lazyInputStream.loadInputStream(), "UTF-8");
                        this.f60135c.close();
                        this.f60135c = null;
                    } else {
                        this.f60136d = new k(this.f60133a, this.f60134b);
                    }
                    this.f60140h = new e(this.f60136d);
                }
                b();
            }
        }
    }

    private String b(String str) {
        JsonProcessingFactory.JsonProcessor jsonProcessor;
        Map<String, JsonProcessingFactory.JsonProcessor> processors = JsonProcessingFactory.getProcessors();
        if (processors.containsKey(str) && (jsonProcessor = processors.get(str)) != null) {
            return jsonProcessor.processOption(this);
        }
        return null;
    }

    private void b() {
        if (this.f60138f == AGCRoutePolicy.UNKNOWN) {
            if (this.f60136d != null) {
                this.f60138f = Utils.getRoutePolicyFromJson(this.f60136d.a("/region", null), this.f60136d.a("/agcgw/url", null));
            } else {
                Log.w("AGConnectServiceConfig", "get route fail , config not ready");
            }
        }
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
        return this.f60133a;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getIdentifier() {
        return Utils.DEFAULT_NAME;
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
        return this.f60134b;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public AGCRoutePolicy getRoutePolicy() {
        if (this.f60138f == null) {
            this.f60138f = AGCRoutePolicy.UNKNOWN;
        }
        AGCRoutePolicy aGCRoutePolicy = this.f60138f;
        AGCRoutePolicy aGCRoutePolicy2 = AGCRoutePolicy.UNKNOWN;
        if (aGCRoutePolicy == aGCRoutePolicy2 && this.f60136d == null) {
            a();
        }
        AGCRoutePolicy aGCRoutePolicy3 = this.f60138f;
        return aGCRoutePolicy3 == null ? aGCRoutePolicy2 : aGCRoutePolicy3;
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str) {
        return getString(str, null);
    }

    @Override // com.huawei.agconnect.AGConnectOptions
    public String getString(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("path must not be null.");
        }
        if (this.f60136d == null) {
            a();
        }
        String strA = a(str);
        String str3 = this.f60139g.get(strA);
        if (str3 != null) {
            return str3;
        }
        String strB = b(strA);
        if (strB != null) {
            return strB;
        }
        String strA2 = this.f60136d.a(strA, str2);
        return e.a(strA2) ? this.f60140h.a(strA2, str2) : strA2;
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void overlayWith(LazyInputStream lazyInputStream) {
        this.f60135c = lazyInputStream;
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void overlayWith(InputStream inputStream) {
        overlayWith(a(this.f60133a, inputStream));
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void setParam(String str, String str2) {
        this.f60139g.put(Utils.fixPath(str), str2);
    }

    @Override // com.huawei.agconnect.config.AGConnectServicesConfig
    public void setRoutePolicy(AGCRoutePolicy aGCRoutePolicy) {
        this.f60138f = aGCRoutePolicy;
    }
}
