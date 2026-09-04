package com.taobao.aranger.core.handler.reply.impl;

import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.handler.reply.BaseReplyHandler;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IObjectProxy;
import com.taobao.aranger.utils.ObjectCenter;
import com.taobao.aranger.utils.TypeUtils;

/* JADX INFO: loaded from: classes4.dex */
public class MethodInvokeReplyHandler extends BaseReplyHandler {
    private final String mMethodId;
    private final IObjectProxy mObjectProxy;

    public MethodInvokeReplyHandler(Call call) {
        super(call);
        this.mObjectProxy = ObjectCenter.getInstance().getObject(call.getObjectWrapper().getTimeStamp());
        this.mMethodId = TypeUtils.getMethodId(call.getMethodWrapper().getName(), call.getMethodWrapper().getParameterTypes());
    }

    @Override // com.taobao.aranger.core.handler.reply.BaseReplyHandler
    public Object invoke(Object[] objArr) throws IPCException {
        IObjectProxy iObjectProxy = this.mObjectProxy;
        if (iObjectProxy == null) {
            throw new IPCException(22, "can't find ipc object proxy");
        }
        try {
            return iObjectProxy.invoke(this.mMethodId, objArr);
        } catch (Exception e10) {
            if (e10 instanceof IPCException) {
                throw ((IPCException) e10);
            }
            throw new IPCException(3, e10);
        }
    }
}
