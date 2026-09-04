package com.taobao.aranger.core.handler.reply;

import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.wrapper.ParameterWrapper;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.utils.ParameterTransformer;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseReplyHandler implements IReplyHandler {
    protected final Call mCall;

    protected BaseReplyHandler(Call call) {
        this.mCall = call;
    }

    @Override // com.taobao.aranger.core.handler.reply.IReplyHandler
    public Reply handleReply() throws Exception {
        ArrayList arrayList = new ArrayList();
        Object[] objArrUnWrapperParameters = ParameterTransformer.unWrapperParameters(this.mCall.getParameterWrappers(), arrayList);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Object objInvoke = invoke(objArrUnWrapperParameters);
        Reply invokeTime = Reply.obtain().setResult(objInvoke).setInvokeTime(System.currentTimeMillis() - jCurrentTimeMillis);
        if (!arrayList.isEmpty()) {
            ParameterWrapper[] parameterWrapperArr = new ParameterWrapper[arrayList.size()];
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                int iIntValue = ((Integer) it.next()).intValue();
                parameterWrapperArr[iIntValue] = ParameterWrapper.obtain().setData(objArrUnWrapperParameters[((Integer) arrayList.get(iIntValue)).intValue()]);
            }
            invokeTime.setFlowParameterWrappers(parameterWrapperArr);
        }
        return invokeTime;
    }

    protected abstract Object invoke(Object[] objArr) throws IPCException;
}
