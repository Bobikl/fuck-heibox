package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes7.dex */
public final class s {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static Map<String, l1> f61026b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static s f61027c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g1 f61028a = new g1();

    private s() {
    }

    public static s c() {
        if (f61027c == null) {
            d();
        }
        return f61027c;
    }

    private static synchronized void d() {
        if (f61027c == null) {
            f61027c = new s();
        }
    }

    public l1 a(String str) {
        return f61026b.get(str);
    }

    public Set<String> a() {
        return f61026b.keySet();
    }

    public void a(String str, l1 l1Var) {
        f61026b.put(str, l1Var);
    }

    public g1 b() {
        return this.f61028a;
    }
}
