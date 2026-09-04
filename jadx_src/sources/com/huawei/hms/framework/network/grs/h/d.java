package com.huawei.hms.framework.network.grs.h;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes7.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Map<String, a> f60860a = new ConcurrentHashMap(16);

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f60861a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f60862b;

        public a(long j10, long j11) {
            this.f60861a = j10;
            this.f60862b = j11;
        }

        public boolean a() {
            return SystemClock.elapsedRealtime() - this.f60862b <= this.f60861a;
        }
    }

    public static a a(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("map size of get is before: ");
        Map<String, a> map = f60860a;
        sb2.append(map.size());
        Logger.v("RequestUtil", sb2.toString());
        a aVar = map.get(str);
        Logger.v("RequestUtil", "map size of get is after: " + map.size());
        return aVar;
    }

    public static void a(String str, a aVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("map size of put is before: ");
        Map<String, a> map = f60860a;
        sb2.append(map.size());
        Logger.v("RequestUtil", sb2.toString());
        map.put(str, aVar);
        Logger.v("RequestUtil", "map size of put is after: " + map.size());
    }
}
