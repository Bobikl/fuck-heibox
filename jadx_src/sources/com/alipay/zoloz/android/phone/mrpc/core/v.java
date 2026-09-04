package com.alipay.zoloz.android.phone.mrpc.core;

import com.alipay.zoloz.mobile.common.rpc.RpcException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: RpcInvoker.java */
/* JADX INFO: loaded from: classes6.dex */
public class v {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ThreadLocal<Object> f39765d = new ThreadLocal<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ThreadLocal<Map<String, Object>> f39766e = new ThreadLocal<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte f39767f = 0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f39768g = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private byte f39769a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private AtomicInteger f39770b = new AtomicInteger();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private t f39771c;

    public v(t tVar) {
        this.f39771c = tVar;
    }

    public static void a(String str, Object obj) {
        ThreadLocal<Map<String, Object>> threadLocal = f39766e;
        if (threadLocal.get() == null) {
            threadLocal.set(new HashMap());
        }
        threadLocal.get().put(str, obj);
    }

    private void d(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr, RpcException rpcException) throws RpcException {
        throw rpcException;
    }

    private void i(Object obj, byte[] bArr, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr) throws RpcException {
    }

    private void j(Object obj, Class<?> cls, Method method, Object[] objArr, Annotation[] annotationArr) throws RpcException {
    }

    private byte[] k(Method method, Object[] objArr, String str, int i10, boolean z10) throws RpcException {
        com.alipay.zoloz.android.phone.mrpc.core.gwprotocol.f fVarF = f(i10, str, objArr);
        ThreadLocal<Map<String, Object>> threadLocal = f39766e;
        if (threadLocal.get() != null) {
            fVarF.a(threadLocal.get());
        }
        byte[] bArr = (byte[]) g(method, i10, str, fVarF.b(), z10).call();
        threadLocal.set(null);
        return bArr;
    }

    public void b() {
        this.f39769a = (byte) 1;
    }

    public FutureTask<?> c() {
        this.f39769a = (byte) 0;
        return null;
    }

    public com.alipay.zoloz.android.phone.mrpc.core.gwprotocol.c e(Type type, byte[] bArr) {
        return new com.alipay.zoloz.android.phone.mrpc.core.gwprotocol.d(type, bArr);
    }

    public com.alipay.zoloz.android.phone.mrpc.core.gwprotocol.f f(int i10, String str, Object[] objArr) {
        return new com.alipay.zoloz.android.phone.mrpc.core.gwprotocol.e(i10, str, objArr);
    }

    public r g(Method method, int i10, String str, byte[] bArr, boolean z10) {
        return new g(this.f39771c.a(), method, i10, str, bArr, z10);
    }

    public Object h(Object obj, Class<?> cls, Method method, Object[] objArr) throws RpcException {
        byte[] bArr;
        if (x.a()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        m6.a aVar = (m6.a) method.getAnnotation(m6.a.class);
        boolean z10 = method.getAnnotation(m6.b.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        Annotation[] annotations = method.getAnnotations();
        ThreadLocal<Object> threadLocal = f39765d;
        byte[] bArrK = null;
        threadLocal.set(null);
        f39766e.set(null);
        if (aVar == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String strValue = aVar.value();
        int iIncrementAndGet = this.f39770b.incrementAndGet();
        j(obj, cls, method, objArr, annotations);
        try {
            if (this.f39769a == 0) {
                bArrK = k(method, objArr, strValue, iIncrementAndGet, z10);
                Object objM = e(genericReturnType, bArrK).m();
                if (genericReturnType != Void.TYPE) {
                    threadLocal.set(objM);
                }
            }
            bArr = bArrK;
        } catch (RpcException e10) {
            e10.e(strValue);
            bArr = bArrK;
            d(obj, bArr, cls, method, objArr, annotations, e10);
        }
        i(obj, bArr, cls, method, objArr, annotations);
        return f39765d.get();
    }
}
