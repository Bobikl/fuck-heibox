package com.taobao.aranger.core.ipc.channel;

import com.taobao.aranger.core.entity.Callback;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.mit.IPCMonitor;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public abstract class BaseClientChannel implements IChannel {
    abstract Reply internalSendCallback(Callback callback) throws IPCException;

    public final void recycleClient(List<String> list) throws IPCException {
        IPCMonitor.IpcState ipcState = new IPCMonitor.IpcState(5);
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            internalRecycle(list);
            ipcState.setResult(0);
            e = null;
        } catch (IPCException e10) {
            e = e10;
        }
        if (e != null) {
            ipcState.setResult(e.getErrorCode());
        }
        ipcState.setCostTime(System.currentTimeMillis() - jCurrentTimeMillis);
        ipcState.commit();
        if (e != null) {
            throw e;
        }
    }

    public final Reply sendCallback(Callback callback) throws IPCException {
        Reply replyInternalSendCallback;
        IPCMonitor.IpcState ipcState = new IPCMonitor.IpcState(3);
        long jCurrentTimeMillis = System.currentTimeMillis();
        Reply reply = null;
        IPCException iPCException = null;
        long invokeTime = 0;
        try {
            replyInternalSendCallback = internalSendCallback(callback);
            try {
                ipcState.setDataSize(callback.getDataSize());
                ipcState.setResult(replyInternalSendCallback.getErrorCode());
                invokeTime = replyInternalSendCallback.getInvokeTime();
                if (replyInternalSendCallback.isError()) {
                    iPCException = new IPCException(replyInternalSendCallback.getErrorCode(), replyInternalSendCallback.getErrorMessage());
                }
            } catch (IPCException e10) {
                e = e10;
                reply = replyInternalSendCallback;
                replyInternalSendCallback = reply;
                iPCException = e;
            }
        } catch (IPCException e11) {
            e = e11;
        }
        if (iPCException != null) {
            ipcState.setResult(iPCException.getErrorCode());
        }
        ipcState.setCostTime((System.currentTimeMillis() - jCurrentTimeMillis) - invokeTime);
        ipcState.commit();
        if (iPCException == null) {
            return replyInternalSendCallback;
        }
        throw iPCException;
    }
}
