package com.taobao.aranger.core.handler.reply.impl;

import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.handler.reply.BaseReplyHandler;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IObjectProxy;
import com.taobao.aranger.utils.ObjectCenter;
import com.taobao.aranger.utils.TypeCenter;
import com.taobao.aranger.utils.TypeUtils;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes4.dex */
public class NewInstanceReplyHandler extends BaseReplyHandler {
    private String mConstructorId;
    private Constructor<?> mProxyConstructor;

    public NewInstanceReplyHandler(Call call) throws IPCException {
        super(call);
        Class<?> classType = TypeCenter.getInstance().getClassType(call.getObjectWrapper());
        this.mConstructorId = TypeUtils.getMethodId(classType.getSimpleName(), call.getParameterWrappers());
        this.mProxyConstructor = TypeUtils.getConstructor(TypeCenter.getInstance().getClassType(classType.getName() + Constants.PROXY_SUFFIX), new Class[0]);
    }

    @Override // com.taobao.aranger.core.handler.reply.BaseReplyHandler
    public Object invoke(Object[] objArr) throws IPCException {
        try {
            IObjectProxy iObjectProxy = (IObjectProxy) this.mProxyConstructor.newInstance(new Object[0]);
            iObjectProxy.create(this.mConstructorId, objArr);
            ObjectCenter.getInstance().putObject(this.mCall.getObjectWrapper().getTimeStamp(), iObjectProxy);
            return null;
        } catch (Exception e10) {
            if (e10 instanceof IPCException) {
                throw ((IPCException) e10);
            }
            throw new IPCException(23, e10);
        }
    }
}
