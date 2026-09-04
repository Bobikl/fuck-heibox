package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes6.dex */
public final class y implements InvocationHandler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f38157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Class<?> f38158b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public z f38159c;

    public y(g gVar, Class<?> cls, z zVar) {
        this.f38157a = gVar;
        this.f38158b = cls;
        this.f38159c = zVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f38159c.a(method, objArr);
    }
}
