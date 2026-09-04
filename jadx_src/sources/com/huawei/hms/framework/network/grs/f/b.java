package com.huawei.hms.framework.network.grs.f;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.AssetsUtil;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsApp;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Map<String, b> f60785b = new ConcurrentHashMap(16);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Object f60786c = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f60787a;

    public b(Context context, boolean z10) {
        a(context, z10);
        f60785b.put(context.getPackageName(), this);
    }

    public static b a(String str) {
        return f60785b.get(str);
    }

    private void a(Context context, boolean z10) {
        String[] strArrSplit;
        long jCurrentTimeMillis = System.currentTimeMillis();
        String strA = com.huawei.hms.framework.network.grs.h.c.a("grs_route_config_files_list.txt", context);
        Logger.i("LocalManagerProxy", "initLocalManager configFileListContent TimeCost:%d  Content:%s", Long.valueOf(System.currentTimeMillis() - jCurrentTimeMillis), strA);
        if (TextUtils.isEmpty(strA)) {
            long jCurrentTimeMillis2 = System.currentTimeMillis();
            strArrSplit = AssetsUtil.list(context, GrsApp.getInstance().getBrand(""));
            Logger.i("LocalManagerProxy", "list by AssetsManager, timeCost:" + (System.currentTimeMillis() - jCurrentTimeMillis2));
        } else {
            strArrSplit = strA.split("#");
        }
        List<String> arrayList = strArrSplit == null ? new ArrayList<>() : Arrays.asList(strArrSplit);
        String appConfigName = GrsApp.getInstance().getAppConfigName();
        Logger.i("LocalManagerProxy", "appConfigName is: " + appConfigName);
        this.f60787a = new d(false, z10);
        if (arrayList.contains("grs_app_global_route_config.json") || !TextUtils.isEmpty(appConfigName)) {
            this.f60787a = new d(context, appConfigName, z10);
        }
        if (!this.f60787a.c() && arrayList.contains("grs_sdk_global_route_config.json")) {
            this.f60787a = new c(context, z10);
        }
        this.f60787a.a(context, arrayList);
        StringBuilder sb2 = new StringBuilder();
        sb2.append("on initLocalManager finish, check appGrs: ");
        sb2.append(this.f60787a.f60780a == null);
        Logger.i("LocalManagerProxy", sb2.toString());
    }

    public com.huawei.hms.framework.network.grs.local.model.a a() {
        return this.f60787a.a();
    }

    public String a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, String str2, boolean z10) {
        String strA;
        synchronized (f60786c) {
            strA = this.f60787a.a(context, aVar, grsBaseInfo, str, str2, z10);
        }
        return strA;
    }

    public Map<String, String> a(Context context, com.huawei.hms.framework.network.grs.e.a aVar, GrsBaseInfo grsBaseInfo, String str, boolean z10) {
        Map<String, String> mapA;
        synchronized (f60786c) {
            mapA = this.f60787a.a(context, aVar, grsBaseInfo, str, z10);
        }
        return mapA;
    }

    public Set<String> b() {
        return this.f60787a.b();
    }
}
