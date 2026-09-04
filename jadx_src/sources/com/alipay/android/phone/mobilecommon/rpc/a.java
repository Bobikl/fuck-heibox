package com.alipay.android.phone.mobilecommon.rpc;

import com.alipay.zoloz.android.phone.mrpc.core.d;
import com.alipay.zoloz.android.phone.mrpc.core.t;
import com.alipay.zoloz.android.phone.mrpc.core.u;
import com.alipay.zoloz.android.phone.mrpc.core.v;
import com.alipay.zoloz.mobile.common.rpc.RpcException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/* JADX INFO: compiled from: AlipayRpcFactory.java */
/* JADX INFO: loaded from: classes6.dex */
public class a extends t {

    /* JADX INFO: renamed from: com.alipay.android.phone.mobilecommon.rpc.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: AlipayRpcFactory.java */
    public class C0291a extends u {
        C0291a(d dVar, Class cls, v vVar) {
            super(dVar, cls, vVar);
        }

        @Override // com.alipay.zoloz.android.phone.mrpc.core.u, java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws RpcException {
            try {
                return super.invoke(obj, method, objArr);
            } catch (RpcException e10) {
                throw new BioRpcException(e10);
            }
        }
    }

    public a(d dVar) {
        super(dVar);
    }

    @Override // com.alipay.zoloz.android.phone.mrpc.core.t
    public <T> T b(Class<T> cls) {
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new C0291a(this.f39760a, cls, this.f39761b));
    }
}
