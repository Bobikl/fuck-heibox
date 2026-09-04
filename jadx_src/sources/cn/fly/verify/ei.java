package cn.fly.verify;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
public class ei {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ei f36295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private HashMap<String, Object> f36296b;

    private ei() {
        HashMap<String, Object> mapC = c();
        this.f36296b = mapC;
        if (mapC == null) {
            this.f36296b = new HashMap<>();
        }
        ArrayList<bd> arrayListB = bu.b();
        if (arrayListB == null || arrayListB.isEmpty()) {
            return;
        }
        for (bd bdVar : arrayListB) {
            if (!this.f36296b.containsKey(bdVar.a())) {
                this.f36296b.put(bdVar.a(), 0);
            }
        }
    }

    public static ei a() {
        if (f36295a == null) {
            synchronized (ei.class) {
                if (f36295a == null) {
                    f36295a = new ei();
                }
            }
        }
        return f36295a;
    }

    public static String a(String str) {
        return el.a(str, 99);
    }

    private HashMap<String, Object> c() {
        try {
            return bv.a().g();
        } catch (Throwable unused) {
            return null;
        }
    }

    public HashMap<String, Object> b() {
        return this.f36296b;
    }
}
