package com.huawei.hms.hmsscankit.api;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.scankit.p.s6;

/* JADX INFO: loaded from: classes7.dex */
public interface IRemoteFrameDecoderDelegate extends IInterface {

    public static class Default implements IRemoteFrameDecoderDelegate {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }

        @Override // com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate
        public s6[] decode(byte[] bArr, int i10, int i11, int i12, int i13, IObjectWrapper iObjectWrapper) throws RemoteException {
            return null;
        }
    }

    public static abstract class Stub extends Binder implements IRemoteFrameDecoderDelegate {
        private static final String DESCRIPTOR = "com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate";
        static final int TRANSACTION_decode = 1;

        public static class Proxy implements IRemoteFrameDecoderDelegate {
            public static IRemoteFrameDecoderDelegate sDefaultImpl;
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.huawei.hms.hmsscankit.api.IRemoteFrameDecoderDelegate
            public s6[] decode(byte[] bArr, int i10, int i11, int i12, int i13, IObjectWrapper iObjectWrapper) throws Throwable {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeByteArray(bArr);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeInt(i12);
                    parcelObtain.writeInt(i13);
                    parcelObtain.writeStrongBinder(iObjectWrapper != null ? iObjectWrapper.asBinder() : null);
                    try {
                        if (!this.mRemote.transact(1, parcelObtain, parcelObtain2, 0) && Stub.getDefaultImpl() != null) {
                            s6[] s6VarArrDecode = Stub.getDefaultImpl().decode(bArr, i10, i11, i12, i13, iObjectWrapper);
                            parcelObtain2.recycle();
                            parcelObtain.recycle();
                            return s6VarArrDecode;
                        }
                        parcelObtain2.readException();
                        s6[] s6VarArr = (s6[]) parcelObtain2.createTypedArray(s6.CREATOR);
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        return s6VarArr;
                    } catch (Throwable th2) {
                        th = th2;
                        parcelObtain2.recycle();
                        parcelObtain.recycle();
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static IRemoteFrameDecoderDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IRemoteFrameDecoderDelegate)) ? new Proxy(iBinder) : (IRemoteFrameDecoderDelegate) iInterfaceQueryLocalInterface;
        }

        public static IRemoteFrameDecoderDelegate getDefaultImpl() {
            return Proxy.sDefaultImpl;
        }

        public static boolean setDefaultImpl(IRemoteFrameDecoderDelegate iRemoteFrameDecoderDelegate) {
            if (Proxy.sDefaultImpl != null) {
                throw new IllegalStateException("setDefaultImpl() called twice");
            }
            if (iRemoteFrameDecoderDelegate == null) {
                return false;
            }
            Proxy.sDefaultImpl = iRemoteFrameDecoderDelegate;
            return true;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 1) {
                if (i10 != 1598968902) {
                    return super.onTransact(i10, parcel, parcel2, i11);
                }
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            parcel.enforceInterface(DESCRIPTOR);
            s6[] s6VarArrDecode = decode(parcel.createByteArray(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), IObjectWrapper.Stub.asInterface(parcel.readStrongBinder()));
            parcel2.writeNoException();
            parcel2.writeTypedArray(s6VarArrDecode, 1);
            return true;
        }
    }

    s6[] decode(byte[] bArr, int i10, int i11, int i12, int i13, IObjectWrapper iObjectWrapper) throws RemoteException;
}
