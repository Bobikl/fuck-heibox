package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static y f61062b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Map<String, p0> f61063a = new HashMap();

    private y() {
    }

    private p0 a(String str) {
        if (!this.f61063a.containsKey(str)) {
            this.f61063a.put(str, new p0());
        }
        return this.f61063a.get(str);
    }

    public static y a() {
        if (f61062b == null) {
            b();
        }
        return f61062b;
    }

    private static synchronized void b() {
        if (f61062b == null) {
            f61062b = new y();
        }
    }

    public p0 a(String str, long j10) {
        p0 p0VarA = a(str);
        p0VarA.a(j10);
        return p0VarA;
    }
}
