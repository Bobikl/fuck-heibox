package com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public interface ITPPlayListenerAidl extends IInterface {

    public static abstract class Stub extends Binder implements ITPPlayListenerAidl {
        private static final String DESCRIPTOR = "com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl";
        static final int TRANSACTION_getAdvRemainTime = 14;
        static final int TRANSACTION_getContentType = 21;
        static final int TRANSACTION_getCurrentPlayClipNo = 13;
        static final int TRANSACTION_getCurrentPlayOffset = 12;
        static final int TRANSACTION_getCurrentPosition = 11;
        static final int TRANSACTION_getDataFilePath = 20;
        static final int TRANSACTION_getDataTotalSize = 19;
        static final int TRANSACTION_getPlayInfo = 15;
        static final int TRANSACTION_getPlayerBufferLength = 10;
        static final int TRANSACTION_onDownloadCdnUrlExpired = 7;
        static final int TRANSACTION_onDownloadCdnUrlInfoUpdate = 6;
        static final int TRANSACTION_onDownloadCdnUrlUpdate = 5;
        static final int TRANSACTION_onDownloadError = 3;
        static final int TRANSACTION_onDownloadFinish = 2;
        static final int TRANSACTION_onDownloadProgressUpdate = 1;
        static final int TRANSACTION_onDownloadProtocolUpdate = 9;
        static final int TRANSACTION_onDownloadStatusUpdate = 8;
        static final int TRANSACTION_onPlayCallback = 4;
        static final int TRANSACTION_onReadData = 17;
        static final int TRANSACTION_onStartReadData = 16;
        static final int TRANSACTION_onStopReadData = 18;

        public static class Proxy implements ITPPlayListenerAidl {
            private IBinder mRemote;

            Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getAdvRemainTime() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(14, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public String getContentType(int i10, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(21, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public int getCurrentPlayClipNo() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(13, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long[] getCurrentPlayOffset() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(12, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.createLongArray();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getCurrentPosition() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(11, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public String getDataFilePath(int i10, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(20, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getDataTotalSize(int i10, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(19, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            public String getInterfaceDescriptor() {
                return Stub.DESCRIPTOR;
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public String getPlayInfo(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(15, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readString();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public long getPlayerBufferLength() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(10, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readLong();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadCdnUrlExpired(Map map) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeMap(map);
                    this.mRemote.transact(7, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    parcelObtain.writeString(str3);
                    parcelObtain.writeString(str4);
                    this.mRemote.transact(6, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadCdnUrlUpdate(String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(5, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadError(int i10, int i11, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(3, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadFinish() throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    this.mRemote.transact(2, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeInt(i11);
                    parcelObtain.writeLong(j10);
                    parcelObtain.writeLong(j11);
                    parcelObtain.writeString(str);
                    this.mRemote.transact(1, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadProtocolUpdate(String str, String str2) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeString(str);
                    parcelObtain.writeString(str2);
                    this.mRemote.transact(9, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public void onDownloadStatusUpdate(int i10) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    this.mRemote.transact(8, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public int onPlayCallback(int i10, List list) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeList(list);
                    this.mRemote.transact(4, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public int onReadData(int i10, String str, long j10, long j11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j10);
                    parcelObtain.writeLong(j11);
                    this.mRemote.transact(17, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public int onStartReadData(int i10, String str, long j10, long j11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeLong(j10);
                    parcelObtain.writeLong(j11);
                    this.mRemote.transact(16, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }

            @Override // com.tencent.thumbplayer.tcmedia.core.downloadproxy.aidl.ITPPlayListenerAidl
            public int onStopReadData(int i10, String str, int i11) throws RemoteException {
                Parcel parcelObtain = Parcel.obtain();
                Parcel parcelObtain2 = Parcel.obtain();
                try {
                    parcelObtain.writeInterfaceToken(Stub.DESCRIPTOR);
                    parcelObtain.writeInt(i10);
                    parcelObtain.writeString(str);
                    parcelObtain.writeInt(i11);
                    this.mRemote.transact(18, parcelObtain, parcelObtain2, 0);
                    parcelObtain2.readException();
                    return parcelObtain2.readInt();
                } finally {
                    parcelObtain2.recycle();
                    parcelObtain.recycle();
                }
            }
        }

        public Stub() {
            attachInterface(this, DESCRIPTOR);
        }

        public static ITPPlayListenerAidl asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(DESCRIPTOR);
            return (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ITPPlayListenerAidl)) ? new Proxy(iBinder) : (ITPPlayListenerAidl) iInterfaceQueryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
            if (i10 == 1598968902) {
                parcel2.writeString(DESCRIPTOR);
                return true;
            }
            switch (i10) {
                case 1:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadProgressUpdate(parcel.readInt(), parcel.readInt(), parcel.readLong(), parcel.readLong(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadFinish();
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadError(parcel.readInt(), parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iOnPlayCallback = onPlayCallback(parcel.readInt(), parcel.readArrayList(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnPlayCallback);
                    return true;
                case 5:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadCdnUrlUpdate(parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 6:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadCdnUrlInfoUpdate(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 7:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadCdnUrlExpired(parcel.readHashMap(getClass().getClassLoader()));
                    parcel2.writeNoException();
                    return true;
                case 8:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadStatusUpdate(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 9:
                    parcel.enforceInterface(DESCRIPTOR);
                    onDownloadProtocolUpdate(parcel.readString(), parcel.readString());
                    parcel2.writeNoException();
                    return true;
                case 10:
                    parcel.enforceInterface(DESCRIPTOR);
                    long playerBufferLength = getPlayerBufferLength();
                    parcel2.writeNoException();
                    parcel2.writeLong(playerBufferLength);
                    return true;
                case 11:
                    parcel.enforceInterface(DESCRIPTOR);
                    long currentPosition = getCurrentPosition();
                    parcel2.writeNoException();
                    parcel2.writeLong(currentPosition);
                    return true;
                case 12:
                    parcel.enforceInterface(DESCRIPTOR);
                    long[] currentPlayOffset = getCurrentPlayOffset();
                    parcel2.writeNoException();
                    parcel2.writeLongArray(currentPlayOffset);
                    return true;
                case 13:
                    parcel.enforceInterface(DESCRIPTOR);
                    int currentPlayClipNo = getCurrentPlayClipNo();
                    parcel2.writeNoException();
                    parcel2.writeInt(currentPlayClipNo);
                    return true;
                case 14:
                    parcel.enforceInterface(DESCRIPTOR);
                    long advRemainTime = getAdvRemainTime();
                    parcel2.writeNoException();
                    parcel2.writeLong(advRemainTime);
                    return true;
                case 15:
                    parcel.enforceInterface(DESCRIPTOR);
                    String playInfo = getPlayInfo(parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(playInfo);
                    return true;
                case 16:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iOnStartReadData = onStartReadData(parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnStartReadData);
                    return true;
                case 17:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iOnReadData = onReadData(parcel.readInt(), parcel.readString(), parcel.readLong(), parcel.readLong());
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnReadData);
                    return true;
                case 18:
                    parcel.enforceInterface(DESCRIPTOR);
                    int iOnStopReadData = onStopReadData(parcel.readInt(), parcel.readString(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(iOnStopReadData);
                    return true;
                case 19:
                    parcel.enforceInterface(DESCRIPTOR);
                    long dataTotalSize = getDataTotalSize(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeLong(dataTotalSize);
                    return true;
                case 20:
                    parcel.enforceInterface(DESCRIPTOR);
                    String dataFilePath = getDataFilePath(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(dataFilePath);
                    return true;
                case 21:
                    parcel.enforceInterface(DESCRIPTOR);
                    String contentType = getContentType(parcel.readInt(), parcel.readString());
                    parcel2.writeNoException();
                    parcel2.writeString(contentType);
                    return true;
                default:
                    return super.onTransact(i10, parcel, parcel2, i11);
            }
        }
    }

    long getAdvRemainTime() throws RemoteException;

    String getContentType(int i10, String str) throws RemoteException;

    int getCurrentPlayClipNo() throws RemoteException;

    long[] getCurrentPlayOffset() throws RemoteException;

    long getCurrentPosition() throws RemoteException;

    String getDataFilePath(int i10, String str) throws RemoteException;

    long getDataTotalSize(int i10, String str) throws RemoteException;

    String getPlayInfo(String str) throws RemoteException;

    long getPlayerBufferLength() throws RemoteException;

    void onDownloadCdnUrlExpired(Map map) throws RemoteException;

    void onDownloadCdnUrlInfoUpdate(String str, String str2, String str3, String str4) throws RemoteException;

    void onDownloadCdnUrlUpdate(String str) throws RemoteException;

    void onDownloadError(int i10, int i11, String str) throws RemoteException;

    void onDownloadFinish() throws RemoteException;

    void onDownloadProgressUpdate(int i10, int i11, long j10, long j11, String str) throws RemoteException;

    void onDownloadProtocolUpdate(String str, String str2) throws RemoteException;

    void onDownloadStatusUpdate(int i10) throws RemoteException;

    int onPlayCallback(int i10, List list) throws RemoteException;

    int onReadData(int i10, String str, long j10, long j11) throws RemoteException;

    int onStartReadData(int i10, String str, long j10, long j11) throws RemoteException;

    int onStopReadData(int i10, String str, int i11) throws RemoteException;
}
