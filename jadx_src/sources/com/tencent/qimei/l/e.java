package com.tencent.qimei.l;

import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: StrictMode.java */
/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static AtomicBoolean f101282a = new AtomicBoolean(false);

    public static void a(String str) {
        com.tencent.qimei.n.a.b("[strict]  " + str, new Object[0]);
        if (f101282a.get()) {
            throw new IllegalStateException("[strict] " + str);
        }
    }
}
