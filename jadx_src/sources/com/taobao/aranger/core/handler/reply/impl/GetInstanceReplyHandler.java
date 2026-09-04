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
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class GetInstanceReplyHandler extends BaseReplyHandler {
    private static final ConcurrentHashMap<String, IObjectProxy> sProxyMap = new ConcurrentHashMap<>();
    private Class<?> mObjectClass;
    private IObjectProxy mObjectProxy;
    private Constructor<?> mProxyConstructor;
    private String mSingleId;

    public GetInstanceReplyHandler(Call call) throws IPCException {
        super(call);
        Class<?> classType = TypeCenter.getInstance().getClassType(call.getObjectWrapper());
        this.mObjectClass = classType;
        IObjectProxy iObjectProxy = sProxyMap.get(classType.getName());
        this.mObjectProxy = iObjectProxy;
        if (iObjectProxy == null) {
            this.mSingleId = TypeUtils.getMethodId(call.getMethodWrapper().getName(), call.getParameterWrappers());
            this.mProxyConstructor = TypeUtils.getConstructor(TypeCenter.getInstance().getClassType(this.mObjectClass.getName() + Constants.PROXY_SUFFIX), new Class[0]);
        }
    }

    @Override // com.taobao.aranger.core.handler.reply.BaseReplyHandler
    public Object invoke(Object[] objArr) throws IPCException {
        try {
            if (this.mObjectProxy == null) {
                IObjectProxy iObjectProxy = (IObjectProxy) this.mProxyConstructor.newInstance(new Object[0]);
                this.mObjectProxy = iObjectProxy;
                iObjectProxy.create(this.mSingleId, objArr);
                sProxyMap.putIfAbsent(this.mObjectClass.getName(), this.mObjectProxy);
            }
            ObjectCenter.getInstance().putObject(this.mCall.getObjectWrapper().getTimeStamp(), this.mObjectProxy);
            return null;
        } catch (Exception e10) {
            if (e10 instanceof IPCException) {
                throw ((IPCException) e10);
            }
            throw new IPCException(24, e10);
        }
    }
}
