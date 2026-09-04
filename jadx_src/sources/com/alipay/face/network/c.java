package com.alipay.face.network;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: NetworkStore.java */
/* JADX INFO: loaded from: classes6.dex */
public class c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static c f38810b = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f38811a = new HashMap();

    public static c c() {
        return f38810b;
    }

    public void a() {
        this.f38811a.clear();
    }

    public Map b() {
        return this.f38811a;
    }

    public void d(String str, String str2) {
        this.f38811a.put(str, str2);
    }
}
