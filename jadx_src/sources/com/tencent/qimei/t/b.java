package com.tencent.qimei.t;

import com.tencent.qimei.shellapi.IDependency;
import java.util.HashMap;

/* JADX INFO: compiled from: DependencyManager.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final HashMap<String, IDependency> f101440a = new HashMap<>();

    /* JADX INFO: compiled from: DependencyManager.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f101441a = new b();
    }

    public b() {
    }

    public static b a() {
        return a.f101441a;
    }

    public IDependency a(String str) {
        return f101440a.get(str);
    }

    public void a(String str, IDependency iDependency) {
        f101440a.put(str, iDependency);
    }
}
