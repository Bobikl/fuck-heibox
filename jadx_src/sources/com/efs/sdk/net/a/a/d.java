package com.efs.sdk.net.a.a;

/* JADX INFO: loaded from: classes6.dex */
public final class d {
    public static <T extends Throwable> void a(Throwable th2, Class<T> cls) throws Throwable {
        if (cls.isInstance(th2)) {
            throw th2;
        }
    }
}
