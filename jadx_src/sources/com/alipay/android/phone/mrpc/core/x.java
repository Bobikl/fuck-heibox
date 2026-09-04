package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* JADX INFO: loaded from: classes6.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f38155a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public z f38156b = new z(this);

    public x(g gVar) {
        this.f38155a = gVar;
    }

    public final g a() {
        return this.f38155a;
    }

    public final <T> T a(Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new y(this.f38155a, cls, this.f38156b));
    }
}
