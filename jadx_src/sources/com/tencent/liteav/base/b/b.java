package com.tencent.liteav.base.b;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f99570a = TimeUnit.SECONDS.toMillis(1);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, a> f99571b = new HashMap();

    public final synchronized a a(String str) {
        a aVar;
        aVar = this.f99571b.get(str);
        if (aVar == null) {
            aVar = new a(f99570a);
            this.f99571b.put(str, aVar);
        }
        return aVar;
    }
}
