package com.alipay.deviceid.module.x;

import android.os.Looper;
import com.alipay.deviceid.module.rpc.mrpc.core.RpcException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: RpcInvoker.java */
/* JADX INFO: loaded from: classes6.dex */
public final class bi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<Object> f38308a = new ThreadLocal<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Map<String, Object>> f38309b = new ThreadLocal<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private byte f38310c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AtomicInteger f38311d = new AtomicInteger();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private bg f38312e;

    public bi(bg bgVar) {
        this.f38312e = bgVar;
    }

    public final Object a(Method method, Object[] objArr) {
        if (Looper.myLooper() != null && Looper.myLooper() == Looper.getMainLooper()) {
            throw new IllegalThreadStateException("can't in main thread call rpc .");
        }
        ao aoVar = (ao) method.getAnnotation(ao.class);
        boolean z10 = method.getAnnotation(ap.class) != null;
        Type genericReturnType = method.getGenericReturnType();
        method.getAnnotations();
        ThreadLocal<Object> threadLocal = f38308a;
        threadLocal.set(null);
        ThreadLocal<Map<String, Object>> threadLocal2 = f38309b;
        threadLocal2.set(null);
        if (aoVar == null) {
            throw new IllegalStateException("OperationType must be set.");
        }
        String strA = aoVar.a();
        int iIncrementAndGet = this.f38311d.incrementAndGet();
        try {
            if (this.f38310c == 0) {
                br brVar = new br(iIncrementAndGet, strA, objArr);
                if (threadLocal2.get() != null) {
                    brVar.a(threadLocal2.get());
                }
                byte[] bArr = (byte[]) new au(this.f38312e.f38303a, method, iIncrementAndGet, strA, brVar.a(), z10).a();
                threadLocal2.set(null);
                Object objA = new bq(genericReturnType, bArr).a();
                if (genericReturnType != Void.TYPE) {
                    threadLocal.set(objA);
                }
            }
            return threadLocal.get();
        } catch (RpcException e10) {
            e10.setOperationType(strA);
            throw e10;
        }
    }
}
