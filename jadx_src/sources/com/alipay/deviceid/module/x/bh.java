package com.alipay.deviceid.module.x;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: RpcInvocationHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public final class bh implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected as f38305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected Class<?> f38306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected bi f38307c;

    public bh(as asVar, Class<?> cls, bi biVar) {
        this.f38305a = asVar;
        this.f38306b = cls;
        this.f38307c = biVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f38307c.a(method, objArr);
    }
}
