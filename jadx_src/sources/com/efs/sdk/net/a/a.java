package com.efs.sdk.net.a;

import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static a f42695c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap<String, b> f42696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, c> f42697b;

    private a() {
        b();
    }

    public static a a() {
        if (f42695c == null) {
            f42695c = new a();
        }
        return f42695c;
    }

    private void b() {
        if (this.f42696a == null) {
            this.f42696a = new HashMap<>();
        }
        this.f42696a.clear();
    }

    public final b a(String str) {
        if (this.f42696a == null) {
            b();
        }
        b bVar = this.f42696a.get(str);
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b();
        bVar2.f42715a = str;
        bVar2.f42716b = System.currentTimeMillis();
        this.f42696a.put(str, bVar2);
        return bVar2;
    }

    public final void b(String str) {
        HashMap<String, b> map = this.f42696a;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        this.f42696a.remove(str);
    }

    public final c c(String str) {
        if (this.f42697b == null) {
            this.f42697b = new HashMap<>();
        }
        if (this.f42697b.containsKey(str)) {
            return this.f42697b.get(str);
        }
        c cVar = new c();
        cVar.A = str;
        cVar.D = System.currentTimeMillis();
        this.f42697b.put(str, cVar);
        return cVar;
    }

    public final void d(String str) {
        HashMap<String, c> map = this.f42697b;
        if (map == null || !map.containsKey(str)) {
            return;
        }
        this.f42697b.remove(str);
    }
}
