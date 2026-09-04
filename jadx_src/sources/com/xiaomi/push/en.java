package com.xiaomi.push;

/* JADX INFO: loaded from: classes4.dex */
public class en {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static volatile en f107042a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private em f337a;

    public static en a() {
        if (f107042a == null) {
            synchronized (en.class) {
                if (f107042a == null) {
                    f107042a = new en();
                }
            }
        }
        return f107042a;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public em m283a() {
        return this.f337a;
    }

    public void a(em emVar) {
        this.f337a = emVar;
    }
}
