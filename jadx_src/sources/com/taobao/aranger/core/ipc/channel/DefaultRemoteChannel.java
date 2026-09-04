package com.taobao.aranger.core.ipc.channel;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.taobao.aranger.ARanger;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.logs.IPCLog;
import com.taobao.aranger.utils.IPCThreadCaller;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DefaultRemoteChannel extends BaseRemoteChannel {
    private static final String TAG = "DefaultRemoteChannel";
    private final ContentResolver mContentResolver = ARanger.getContext().getContentResolver();
    private final Uri mRemoteProviderUri;

    DefaultRemoteChannel(Uri uri) {
        this.mRemoteProviderUri = uri;
    }

    private Reply call(final String str, final Bundle bundle, boolean z10) throws IPCException {
        try {
            if (z10) {
                IPCThreadCaller.execute(new Runnable() { // from class: com.taobao.aranger.core.ipc.channel.DefaultRemoteChannel.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            DefaultRemoteChannel.this.mContentResolver.call(DefaultRemoteChannel.this.mRemoteProviderUri, str, "", bundle);
                        } catch (Exception e10) {
                            IPCLog.e(DefaultRemoteChannel.TAG, "[call]", e10, new Object[0]);
                        }
                    }
                });
                return Reply.obtain().setResult(null);
            }
            ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = this.mContentResolver.acquireUnstableContentProviderClient(this.mRemoteProviderUri);
            Bundle bundleCall = contentProviderClientAcquireUnstableContentProviderClient != null ? contentProviderClientAcquireUnstableContentProviderClient.call(str, "", bundle) : this.mContentResolver.call(this.mRemoteProviderUri, str, "", bundle);
            bundleCall.setClassLoader(getClass().getClassLoader());
            Reply reply = (Reply) bundleCall.getParcelable(Constants.PARAM_REPLY);
            return reply == null ? Reply.obtain().setResult(null) : reply;
        } catch (Exception e10) {
            if (e10 instanceof RemoteException) {
                throw new IPCException(1, e10);
            }
            throw new IPCException(9, e10);
        }
    }

    @Override // com.taobao.aranger.core.ipc.channel.BaseRemoteChannel
    public void internalConnect() throws IPCException {
        call("connect", null, true);
    }

    @Override // com.taobao.aranger.core.ipc.channel.IChannel
    public void internalRecycle(List<String> list) throws IPCException {
        Bundle bundle = new Bundle();
        bundle.putStringArrayList(Constants.PARAM_KEYS, (ArrayList) list);
        call(Constants.METHOD_RECYCLE_REMOTE, bundle, true);
    }

    @Override // com.taobao.aranger.core.ipc.channel.BaseRemoteChannel
    public Reply internalSendCall(Call call) throws IPCException {
        Bundle bundle = new Bundle();
        bundle.putParcelable("call", call);
        return call("call", bundle, call.isOneWay());
    }
}
