package com.taobao.aranger.core.ipc.proxy;

import android.os.IBinder;
import android.os.Parcel;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Call;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.core.ipc.provider.ARangerProvider;
import com.taobao.aranger.intf.IRemoteService;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class RemoteServiceProxy implements IRemoteService {
    private static volatile IRemoteService sLocalRemoteService;
    private final IBinder mRemote;

    private RemoteServiceProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public static IRemoteService getProxy(IBinder iBinder) {
        if (iBinder.queryLocalInterface(Constants.DEFAULT_CONTENT_DESCRIPTOR) == null) {
            return new RemoteServiceProxy(iBinder);
        }
        if (sLocalRemoteService == null) {
            synchronized (RemoteServiceProxy.class) {
                if (sLocalRemoteService == null) {
                    sLocalRemoteService = new ARangerProvider();
                }
            }
        }
        return sLocalRemoteService;
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public void connect() throws Exception {
        Parcel parcelObtain = Parcel.obtain();
        try {
            this.mRemote.transact(2, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public boolean isRemote() {
        return this.mRemote.queryLocalInterface(Constants.DEFAULT_CONTENT_DESCRIPTOR) == null;
    }

    @Override // com.taobao.aranger.intf.IService
    public void recycle(List<String> list) throws Exception {
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeStringList(list);
            this.mRemote.transact(1, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.taobao.aranger.intf.IRemoteService
    public Reply sendCall(Call call) throws Exception {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcel = null;
        try {
            Parcel parcelObtain2 = !call.isOneWay() ? Parcel.obtain() : null;
            try {
                call.writeToParcel(parcelObtain, 0);
                this.mRemote.transact(0, parcelObtain, parcelObtain2, call.isOneWay() ? 1 : 0);
                Reply result = (parcelObtain2 == null || parcelObtain2.dataSize() == 0) ? Reply.obtain().setResult(null) : Reply.CREATOR.createFromParcel(parcelObtain2);
                parcelObtain.recycle();
                if (parcelObtain2 != null) {
                    parcelObtain2.recycle();
                }
                return result;
            } catch (Throwable th2) {
                th = th2;
                parcel = parcelObtain2;
                parcelObtain.recycle();
                if (parcel != null) {
                    parcel.recycle();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
