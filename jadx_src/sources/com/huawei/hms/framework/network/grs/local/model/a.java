package com.huawei.hms.framework.network.grs.local.model;

import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f60865a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, c> f60866b = new ConcurrentHashMap(16);

    public c a(String str) {
        if (!TextUtils.isEmpty(str)) {
            return this.f60866b.get(str);
        }
        Logger.w("ApplicationBean", "In getServing(String serviceName), the serviceName is Empty or null");
        return null;
    }

    public String a() {
        return this.f60865a;
    }

    public void a(long j10) {
    }

    public void a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        this.f60866b.put(str, cVar);
    }

    public void b(String str) {
        this.f60865a = str;
    }
}
