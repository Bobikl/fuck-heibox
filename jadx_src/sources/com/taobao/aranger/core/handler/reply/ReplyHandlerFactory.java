package com.taobao.aranger.core.handler.reply;

import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.handler.reply.impl.GetInstanceReplyHandler;
import com.taobao.aranger.core.handler.reply.impl.MethodInvokeReplyHandler;
import com.taobao.aranger.core.handler.reply.impl.NewInstanceReplyHandler;
import com.taobao.aranger.exception.IPCException;

/* JADX INFO: loaded from: classes4.dex */
public class ReplyHandlerFactory {
    public static IReplyHandler createReplyHandler(Call call) throws IPCException {
        int type = call.getObjectWrapper().getType();
        if (type == 0) {
            return new NewInstanceReplyHandler(call);
        }
        if (type == 1) {
            return new GetInstanceReplyHandler(call);
        }
        if (type == 3) {
            return new MethodInvokeReplyHandler(call);
        }
        throw new IPCException(13, "Type " + call.getObjectWrapper().getType() + " is not supported.");
    }
}
