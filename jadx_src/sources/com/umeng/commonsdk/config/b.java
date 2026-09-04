package com.umeng.commonsdk.config;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: CollectController.java */
/* JADX INFO: loaded from: classes4.dex */
public class b implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, Boolean> f105065a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static Object f105066b = new Object();

    /* JADX INFO: compiled from: CollectController.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final b f105067a = new b();

        private a() {
        }
    }

    private b() {
    }

    public static boolean a(String str) {
        if (!d.a(str)) {
            return false;
        }
        synchronized (f105066b) {
            if (!f105065a.containsKey(str)) {
                return true;
            }
            return f105065a.get(str).booleanValue();
        }
    }

    public static b b() {
        return a.f105067a;
    }

    public void a() {
        synchronized (f105066b) {
            f105065a.clear();
        }
    }

    @Override // com.umeng.commonsdk.config.f
    public void a(String str, Boolean bool) {
        if (d.a(str)) {
            synchronized (f105066b) {
                Map<String, Boolean> map = f105065a;
                if (map != null) {
                    map.put(str, bool);
                }
            }
        }
    }
}
