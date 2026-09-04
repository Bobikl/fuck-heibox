package com.taobao.aranger.core.ipc.channel;

import android.app.ActivityThread;
import android.content.ContentResolver;
import android.content.IContentProvider;
import android.content.Intent;
import android.net.Uri;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import com.taobao.aranger.ARanger;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.ipc.proxy.RemoteServiceProxy;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IRemoteService;
import com.taobao.aranger.logs.IPCLog;
import com.taobao.aranger.utils.IPCUtils;
import com.taobao.aranger.utils.ReflectUtils;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes4.dex */
public class QuickRemoteChannel extends BaseRemoteChannel {
    private static final String TAG = "QuickRemoteChannel";
    private static final Set<String> sProcessDeathSet = new CopyOnWriteArraySet();
    private Method acquireMethod;
    private final ActivityThread mActivityThread = ActivityThread.currentActivityThread();
    private final ContentResolver mContentResolver = ARanger.getContext().getContentResolver();
    private final String mProcessName;
    private final Uri mRemoteProviderUri;
    private IRemoteService remoteService;

    QuickRemoteChannel(Uri uri) {
        this.mRemoteProviderUri = uri;
        this.mProcessName = IPCUtils.getProcessNameFromUri(uri);
    }

    private IRemoteService getRemoteService(Uri uri) throws Exception {
        IContentProvider iContentProviderAcquireProvider;
        IRemoteService iRemoteService = this.remoteService;
        if (iRemoteService == null || (iRemoteService.isRemote() && !this.remoteService.asBinder().isBinderAlive())) {
            try {
                try {
                    if (this.acquireMethod == null) {
                        this.acquireMethod = ReflectUtils.getHideMethod(ContentResolver.class, Constants.ACQUIRE_UNSTABLE_PROVIDER, Uri.class);
                    }
                    iContentProviderAcquireProvider = (IContentProvider) this.acquireMethod.invoke(this.mContentResolver, uri);
                } catch (IllegalAccessException | IllegalArgumentException | NullPointerException | InvocationTargetException unused) {
                    iContentProviderAcquireProvider = this.mActivityThread.acquireProvider(ARanger.getContext(), IPCUtils.getAuthorityWithoutUserId(uri.getAuthority()), IPCUtils.getUserIdFromAuthority(uri.getAuthority(), Process.myUserHandle().hashCode()), false);
                }
                if (iContentProviderAcquireProvider == null) {
                    throw new IPCException(19, "can't get content provider");
                }
                this.remoteService = RemoteServiceProxy.getProxy(iContentProviderAcquireProvider.asBinder());
            } catch (Exception e10) {
                throw new IPCException(19, e10);
            }
        }
        if (this.remoteService.isRemote()) {
            Set<String> set = sProcessDeathSet;
            if (!set.contains(this.mProcessName)) {
                set.add(this.mProcessName);
                final IBinder iBinderAsBinder = this.remoteService.asBinder();
                try {
                    iBinderAsBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.taobao.aranger.core.ipc.channel.QuickRemoteChannel.1
                        @Override // android.os.IBinder.DeathRecipient
                        public void binderDied() {
                            iBinderAsBinder.unlinkToDeath(this, 0);
                            synchronized (QuickRemoteChannel.class) {
                                if (!TextUtils.isEmpty(QuickRemoteChannel.this.mProcessName) && QuickRemoteChannel.sProcessDeathSet.contains(QuickRemoteChannel.this.mProcessName)) {
                                    Intent intent = new Intent();
                                    intent.setAction(Constants.ACTION_DISCONNECT);
                                    intent.putExtra(Constants.PARAM_PROCESS_NAME, QuickRemoteChannel.this.mProcessName);
                                    ARanger.getContext().sendBroadcast(intent);
                                    QuickRemoteChannel.sProcessDeathSet.remove(QuickRemoteChannel.this.mProcessName);
                                }
                            }
                        }
                    }, 0);
                } catch (RemoteException e11) {
                    IPCLog.e(TAG, "[getRemoteService][linkToDeath]", e11, new Object[0]);
                }
            }
        }
        return this.remoteService;
    }

    @Override // com.taobao.aranger.core.ipc.channel.BaseRemoteChannel
    public void internalConnect() throws IPCException {
        try {
            getRemoteService(this.mRemoteProviderUri).connect();
        } catch (Exception e10) {
            if (e10 instanceof IPCException) {
                throw ((IPCException) e10);
            }
            if (!(e10 instanceof RemoteException)) {
                throw new IPCException(9, e10);
            }
            throw new IPCException(1, e10);
        }
    }

    @Override // com.taobao.aranger.core.ipc.channel.IChannel
    public void internalRecycle(List<String> list) throws IPCException {
        try {
            getRemoteService(this.mRemoteProviderUri).recycle(list);
        } catch (Exception e10) {
            if (e10 instanceof IPCException) {
                throw ((IPCException) e10);
            }
            if (!(e10 instanceof RemoteException)) {
                throw new IPCException(9, e10);
            }
            throw new IPCException(1, e10);
        }
    }

    @Override // com.taobao.aranger.core.ipc.channel.BaseRemoteChannel
    public Reply internalSendCall(Call call) throws IPCException {
        try {
            return getRemoteService(this.mRemoteProviderUri).sendCall(call);
        } catch (Exception e10) {
            if (e10 instanceof IPCException) {
                throw ((IPCException) e10);
            }
            if (e10 instanceof RemoteException) {
                throw new IPCException(1, e10);
            }
            throw new IPCException(9, e10);
        }
    }
}
