package com.alipay.zoloz.android.phone.mrpc.core;

import java.lang.reflect.Proxy;

/* JADX INFO: compiled from: RpcFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected d f39760a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected v f39761b = new v(this);

    public t(d dVar) {
        this.f39760a = dVar;
    }

    public d a() {
        return this.f39760a;
    }

    public <T> T b(Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new u(this.f39760a, cls, this.f39761b));
    }
}
