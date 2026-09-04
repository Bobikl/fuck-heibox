package com.taobao.aranger.core.ipc.proxy;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.taobao.aranger.constant.Constants;
import com.taobao.aranger.core.entity.Callback;
import com.taobao.aranger.core.entity.Reply;
import com.taobao.aranger.exception.IPCException;
import com.taobao.aranger.intf.IClientService;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ClientServiceProxy extends Binder implements IClientService {
    private final IBinder mRemote;

    private ClientServiceProxy(IBinder iBinder) {
        this.mRemote = iBinder;
    }

    public static IClientService getProxy(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(Constants.CLIENT_SERVICE_DESCRIPTOR);
        return iInterfaceQueryLocalInterface instanceof IClientService ? (IClientService) iInterfaceQueryLocalInterface : new ClientServiceProxy(iBinder);
    }

    @Override // android.os.IInterface
    public IBinder asBinder() {
        return this.mRemote;
    }

    @Override // com.taobao.aranger.intf.IService
    public void recycle(List<String> list) throws Exception {
        if (!this.mRemote.isBinderAlive()) {
            throw new IPCException(5, "the remote binder is not alive");
        }
        Parcel parcelObtain = Parcel.obtain();
        try {
            parcelObtain.writeStringList(list);
            this.mRemote.transact(4, parcelObtain, null, 1);
        } finally {
            parcelObtain.recycle();
        }
    }

    @Override // com.taobao.aranger.intf.IClientService
    public Reply sendCallback(Callback callback) throws Exception {
        if (!this.mRemote.isBinderAlive()) {
            throw new IPCException(5, "the remote binder is not alive");
        }
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcel = null;
        try {
            Parcel parcelObtain2 = !callback.isOneWay() ? Parcel.obtain() : null;
            try {
                callback.writeToParcel(parcelObtain, 0);
                this.mRemote.transact(3, parcelObtain, parcelObtain2, callback.isOneWay() ? 1 : 0);
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
