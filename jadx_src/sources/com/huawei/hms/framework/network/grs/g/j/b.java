package com.huawei.hms.framework.network.grs.g.j;

import android.os.SystemClock;
import java.util.concurrent.Future;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Future<com.huawei.hms.framework.network.grs.g.d> f60849a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f60850b = SystemClock.elapsedRealtime();

    public b(Future<com.huawei.hms.framework.network.grs.g.d> future) {
        this.f60849a = future;
    }

    public Future<com.huawei.hms.framework.network.grs.g.d> a() {
        return this.f60849a;
    }

    public boolean b() {
        return SystemClock.elapsedRealtime() - this.f60850b <= 300000;
    }
}
