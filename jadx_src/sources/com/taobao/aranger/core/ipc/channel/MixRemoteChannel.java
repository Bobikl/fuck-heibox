package com.taobao.aranger.core.ipc.channel;

import android.net.Uri;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class MixRemoteChannel extends BaseRemoteChannel {
    static volatile boolean isDegrade = false;
    private final BaseRemoteChannel mDefaultRemoteChannel;
    private final BaseRemoteChannel mQuickRemoteChannel;

    public MixRemoteChannel(Uri uri) {
        this.mDefaultRemoteChannel = new DefaultRemoteChannel(uri);
        this.mQuickRemoteChannel = new QuickRemoteChannel(uri);
    }

    @Override // com.taobao.aranger.core.ipc.channel.BaseRemoteChannel
    public void internalConnect() throws IPCException {
        if (isDegrade) {
            this.mDefaultRemoteChannel.internalConnect();
            return;
        }
        try {
            this.mQuickRemoteChannel.internalConnect();
        } catch (IPCException e10) {
            int errorCode = e10.getErrorCode();
            if (errorCode != 1) {
                if (errorCode != 19) {
                    throw e10;
                }
                isDegrade = true;
            }
            this.mDefaultRemoteChannel.internalConnect();
        }
    }

    @Override // com.taobao.aranger.core.ipc.channel.IChannel
    public void internalRecycle(List<String> list) throws IPCException {
        if (isDegrade) {
            this.mDefaultRemoteChannel.internalRecycle(list);
            return;
        }
        try {
            this.mQuickRemoteChannel.internalRecycle(list);
        } catch (IPCException e10) {
            int errorCode = e10.getErrorCode();
            if (errorCode != 1) {
                if (errorCode != 19) {
                    throw e10;
                }
                isDegrade = true;
            }
            this.mDefaultRemoteChannel.internalRecycle(list);
        }
    }

    @Override // com.taobao.aranger.core.ipc.channel.BaseRemoteChannel
    public Reply internalSendCall(Call call) throws IPCException {
        if (isDegrade) {
            return this.mDefaultRemoteChannel.internalSendCall(call);
        }
        try {
            return this.mQuickRemoteChannel.internalSendCall(call);
        } catch (IPCException e10) {
            int errorCode = e10.getErrorCode();
            if (errorCode != 1) {
                if (errorCode != 19) {
                    throw e10;
                }
                isDegrade = true;
            }
            return this.mDefaultRemoteChannel.internalSendCall(call);
        }
    }
}
