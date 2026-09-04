package com.igexin.push.config;

/* JADX INFO: loaded from: classes.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static j f63421a;

    private j() {
    }

    public static synchronized j a() {
        if (f63421a == null) {
            f63421a = new j();
        }
        return f63421a;
    }

    public boolean b() throws Throwable {
        m.a();
        m.a(com.igexin.push.core.d.f63671e);
        return true;
    }
}
