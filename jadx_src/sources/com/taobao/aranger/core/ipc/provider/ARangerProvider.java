package com.taobao.aranger.core.ipc.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.IContentProvider;
import android.content.Intent;
import android.database.Cursor;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import androidx.annotation.Keep;
import androidx.annotation.n0;
import com.taobao.aranger.ARanger;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.handler.reply.ReplyHandlerFactory;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IRemoteService;
import com.taobao.aranger.logs.IPCLog;
import com.taobao.aranger.utils.IPCThreadCaller;
import com.taobao.aranger.utils.IPCUtils;
import com.taobao.aranger.utils.ObjectCenter;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public class ARangerProvider extends ContentProvider implements IRemoteService {
    private static final String TAG = ARangerProvider.class.getSimpleName();
    private static final AtomicBoolean isConnectFlag = new AtomicBoolean(false);
    private final RemoteService mRemoteService = new RemoteService();

    public class RemoteService extends Binder implements IContentProvider {
        /* JADX WARN: Multi-variable type inference failed */
        RemoteService() {
            attachInterface(this, Constants.DEFAULT_CONTENT_DESCRIPTOR);
        }

        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        protected boolean onTransact(int i10, @n0 Parcel parcel, Parcel parcel2, int i11) {
            if (i10 == 0) {
                final Call callCreateFromParcel = Call.CREATOR.createFromParcel(parcel);
                if (i11 == 1) {
                    IPCThreadCaller.execute(new Runnable() { // from class: com.taobao.aranger.core.ipc.provider.ARangerProvider.RemoteService.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                ARangerProvider.this.sendCall(callCreateFromParcel);
                            } catch (Exception e10) {
                                IPCLog.e(ARangerProvider.TAG, "[onTransact][sendCall]", e10, new Object[0]);
                            }
                        }
                    });
                } else {
                    try {
                        Reply replySendCall = ARangerProvider.this.sendCall(callCreateFromParcel);
                        if (!"void".equals(callCreateFromParcel.getMethodWrapper().getReturnType()) || replySendCall.isError() || replySendCall.getFlowParameterWrappers() != null) {
                            replySendCall.writeToParcel(parcel2, 0);
                        }
                    } catch (Exception e10) {
                        Reply.obtain().setErrorCode(10).setErrorMessage(e10.getMessage()).writeToParcel(parcel2, i11);
                    }
                }
                return true;
            }
            if (i10 == 1) {
                final ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                IPCThreadCaller.execute(new Runnable() { // from class: com.taobao.aranger.core.ipc.provider.ARangerProvider.RemoteService.2
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            ARangerProvider.this.recycle(arrayListCreateStringArrayList);
                        } catch (Exception e11) {
                            IPCLog.e(ARangerProvider.TAG, "[onTransact][recycle]", e11, new Object[0]);
                        }
                    }
                });
                return true;
            }
            if (i10 != 21) {
                return true;
            }
            parcel.enforceInterface(Constants.DEFAULT_CONTENT_DESCRIPTOR);
            int i12 = Build.VERSION.SDK_INT;
            parcel.readString();
            if (i12 >= 29) {
                parcel.readString();
            }
            Bundle bundleCall = ARangerProvider.this.call(parcel.readString(), parcel.readString(), parcel.readBundle(getClass().getClassLoader()));
            parcel2.writeNoException();
            parcel2.writeBundle(bundleCall);
            return true;
        }
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return null;
    }

    @Override // android.content.ContentProvider
    @Keep
    public Bundle call(String str, String str2, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        str.hashCode();
        if (str.equals("call")) {
            bundle.setClassLoader(ARanger.class.getClassLoader());
            try {
                bundle2.putParcelable(Constants.PARAM_REPLY, sendCall((Call) bundle.getParcelable("call")));
            } catch (Exception e10) {
                IPCLog.e(TAG, "[call][sendCall]", e10, new Object[0]);
                bundle2.putParcelable(Constants.PARAM_REPLY, Reply.obtain().setErrorCode(10).setErrorMessage(e10.getMessage()));
            }
        } else if (str.equals(Constants.METHOD_RECYCLE_REMOTE)) {
            final ArrayList<String> stringArrayList = bundle.getStringArrayList(Constants.PARAM_KEYS);
            IPCThreadCaller.execute(new Runnable() { // from class: com.taobao.aranger.core.ipc.provider.ARangerProvider.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        ARangerProvider.this.recycle(stringArrayList);
                    } catch (Exception e11) {
                        IPCLog.e(ARangerProvider.TAG, "[call][recycle]", e11, new Object[0]);
                    }
                }
            });
        }
        return bundle2;
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public void connect() {
        if (isConnectFlag.compareAndSet(false, true)) {
            IPCThreadCaller.execute(new Runnable() { // from class: com.taobao.aranger.core.ipc.provider.ARangerProvider.2
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        Intent intent = new Intent();
                        intent.setAction(Constants.ACTION_CONNECT);
                        intent.putExtra(Constants.PARAM_PROCESS_NAME, IPCUtils.getCurrentProcessName());
                        ARanger.getContext().sendBroadcast(intent);
                    } catch (Throwable th2) {
                        IPCLog.e(ARangerProvider.TAG, "[connect][sendBroadcast]", th2, new Object[0]);
                    }
                }
            });
        }
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Keep
    public IContentProvider getIContentProvider() {
        return this.mRemoteService;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public boolean isRemote() {
        return false;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        connect();
        return false;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // com.taobao.aranger.intf.IService
    public void recycle(List<String> list) {
        ObjectCenter.getInstance().deleteObjects(list);
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public Reply sendCall(Call call) {
        try {
            return ReplyHandlerFactory.createReplyHandler(call).handleReply();
        } catch (Exception e10) {
            IPCLog.e(TAG, "[sendCall][handleReply]", e10, new Object[0]);
            return e10 instanceof IPCException ? Reply.obtain().setErrorCode(((IPCException) e10).getErrorCode()).setErrorMessage(e10.getMessage()) : Reply.obtain().setErrorCode(11).setErrorMessage(e10.getMessage());
        }
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }
}
