package com.taobao.aranger.core.handler.invoc;

import android.os.IBinder;
import com.taobao.aranger.annotation.method.oneway;
import com.taobao.aranger.core.entity.Callback;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.ipc.ChannelManager;
import com.taobao.aranger.core.ipc.channel.BaseClientChannel;
import com.taobao.aranger.core.wrapper.MethodWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.utils.ParameterTransformer;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes4.dex */
public class CallbackInvocationHandler extends IPCInvocationHandler {
    private final BaseClientChannel mBaseClientChannel;
    private final int mHashCode;
    private final String mTimeStamp;

    public CallbackInvocationHandler(IBinder iBinder, String str, int i10) {
        this.mTimeStamp = str;
        this.mHashCode = i10;
        this.mBaseClientChannel = ChannelManager.getClientChannel(iBinder);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && hashCode() == obj.hashCode();
    }

    public int hashCode() {
        return this.mHashCode;
    }

    @Override // com.taobao.aranger.core.handler.invoc.IPCInvocationHandler
    public Reply internalInvoke(Method method, Object[] objArr) throws IPCException {
        return this.mBaseClientChannel.sendCallback(Callback.obtain().setParameterWrappers(ParameterTransformer.wrapperParameters(method, objArr)).setMethodWrapper(MethodWrapper.obtain().setMethodName(method.getName()).setParameterTypes(TypeUtils.convertParameterTypes(method.getParameterTypes())).setReturnType(TypeUtils.getClassId(method.getReturnType()))).setKey(this.mTimeStamp).setOneWay(method.getAnnotation(oneway.class) != null && "void".equals(method.getReturnType().getName())));
    }

    @Override // com.taobao.aranger.core.handler.invoc.IPCInvocationHandler, java.lang.reflect.InvocationHandler
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Method method, Object[] objArr) throws IPCException {
        return super.invoke(obj, method, objArr);
    }
}
