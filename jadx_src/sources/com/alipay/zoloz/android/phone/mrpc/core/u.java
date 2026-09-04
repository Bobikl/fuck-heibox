package com.alipay.zoloz.android.phone.mrpc.core;

import com.alipay.zoloz.mobile.common.rpc.RpcException;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: RpcInvocationHandler.java */
/* JADX INFO: loaded from: classes6.dex */
public class u implements InvocationHandler {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected d f39762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Class<?> f39763c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected v f39764d;

    public u(d dVar, Class<?> cls, v vVar) {
        this.f39762b = dVar;
        this.f39763c = cls;
        this.f39764d = vVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public Object invoke(Object obj, Method method, Object[] objArr) throws RpcException {
        return this.f39764d.h(obj, this.f39763c, method, objArr);
    }
}
