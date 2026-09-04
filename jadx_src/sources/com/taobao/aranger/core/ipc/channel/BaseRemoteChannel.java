package com.taobao.aranger.core.ipc.channel;

import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.mit.IPCMonitor;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseRemoteChannel implements IChannel {
    private void commitIPCState(IPCMonitor.IpcState ipcState, IPCException iPCException, long j10, long j11) throws IPCException {
        ipcState.setResult(iPCException != null ? iPCException.getErrorCode() : 0);
        ipcState.setDegrade(MixRemoteChannel.isDegrade);
        ipcState.setCostTime(System.currentTimeMillis() - (j10 + j11));
        ipcState.setInvokeTime(j11);
        ipcState.commit();
        if (iPCException != null) {
            throw iPCException;
        }
    }

    public final void connect() throws IPCException {
        IPCMonitor.IpcState ipcState = new IPCMonitor.IpcState(6);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            internalConnect();
            e = null;
        } catch (IPCException e10) {
            e = e10;
        }
        commitIPCState(ipcState, e, jCurrentTimeMillis, 0L);
    }

    abstract void internalConnect() throws IPCException;

    abstract Reply internalSendCall(Call call) throws IPCException;

    public final void recycleRemote(List<String> list) throws IPCException {
        IPCMonitor.IpcState ipcState = new IPCMonitor.IpcState(4);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            internalRecycle(list);
            e = null;
        } catch (IPCException e10) {
            e = e10;
        }
        commitIPCState(ipcState, e, jCurrentTimeMillis, 0L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Reply sendCall(Call call) throws IPCException {
        IPCMonitor.IpcState ipcState;
        IPCException iPCException;
        long j10;
        Reply reply;
        int type = call.getObjectWrapper().getType();
        if (type == 0) {
            ipcState = new IPCMonitor.IpcState(0);
        } else if (type != 1) {
            ipcState = new IPCMonitor.IpcState(2);
            ipcState.setMethodName(call.getMethodWrapper().getName());
        } else {
            ipcState = new IPCMonitor.IpcState(1);
            ipcState.setMethodName(call.getMethodWrapper().getName());
        }
        IPCMonitor.IpcState ipcState2 = ipcState;
        ipcState2.setServiceName(call.getObjectWrapper().getName());
        long jCurrentTimeMillis = System.currentTimeMillis();
        long invokeTime = 0;
        IPCException iPCException2 = null;
        try {
            Reply replyInternalSendCall = internalSendCall(call);
            try {
                ipcState2.setDataSize(call.getDataSize());
                invokeTime = replyInternalSendCall.getInvokeTime();
                j10 = invokeTime;
                reply = replyInternalSendCall;
                iPCException = replyInternalSendCall.isError() ? new IPCException(replyInternalSendCall.getErrorCode(), replyInternalSendCall.getErrorMessage()) : null;
            } catch (IPCException e10) {
                e = e10;
                iPCException2 = replyInternalSendCall;
                iPCException = e;
                j10 = invokeTime;
                reply = iPCException2;
            }
        } catch (IPCException e11) {
            e = e11;
        }
        commitIPCState(ipcState2, iPCException, jCurrentTimeMillis, j10);
        return reply;
    }
}
