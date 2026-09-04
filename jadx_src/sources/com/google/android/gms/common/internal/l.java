package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public interface l extends IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class a extends Binder implements l {
        public a() {
            attachInterface(this, "com.google.android.gms.common.internal.IGmsServiceBroker");
        }

        @Override // android.os.IInterface
        @s9.a
        @androidx.annotation.n0
        @v8.a
        public IBinder asBinder() {
            return this;
        }

        /* JADX WARN: Code duplicated, block: B:61:0x00d2  */
        /* JADX WARN: Code duplicated, block: B:63:0x00de  */
        /* JADX WARN: Code duplicated, block: B:64:0x00e7  */
        /* JADX WARN: Code duplicated, block: B:66:0x00ed  */
        @Override // android.os.Binder
        public final boolean onTransact(int i10, @androidx.annotation.n0 Parcel parcel, @androidx.annotation.p0 Parcel parcel2, int i11) throws RemoteException {
            k xVar;
            if (i10 > 16777215) {
                return super.onTransact(i10, parcel, parcel2, i11);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                xVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                xVar = iInterfaceQueryLocalInterface instanceof k ? (k) iInterfaceQueryLocalInterface : new x(strongBinder);
            }
            if (i10 == 46) {
                S(xVar, parcel.readInt() != 0 ? GetServiceRequest.CREATOR.createFromParcel(parcel) : null);
                p.l(parcel2);
                parcel2.writeNoException();
                return true;
            }
            if (i10 == 47) {
                if (parcel.readInt() != 0) {
                    zzaj.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            }
            parcel.readInt();
            if (i10 != 4) {
                parcel.readString();
                if (i10 == 1) {
                    parcel.readString();
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                } else if (i10 == 2 || i10 == 23 || i10 == 25 || i10 == 27) {
                    if (parcel.readInt() != 0) {
                    }
                } else if (i10 == 30) {
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                    }
                } else if (i10 == 34) {
                    parcel.readString();
                } else if (i10 != 41 && i10 != 43 && i10 != 37 && i10 != 38) {
                    switch (i10) {
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                            if (parcel.readInt() != 0) {
                            }
                            break;
                        case 9:
                            parcel.readString();
                            parcel.createStringArray();
                            parcel.readString();
                            parcel.readStrongBinder();
                            parcel.readString();
                            if (parcel.readInt() != 0) {
                            }
                            break;
                        case 10:
                            parcel.readString();
                            parcel.createStringArray();
                            break;
                        case 19:
                            parcel.readStrongBinder();
                            if (parcel.readInt() != 0) {
                            }
                            break;
                        case 20:
                            parcel.createStringArray();
                            parcel.readString();
                            if (parcel.readInt() != 0) {
                            }
                            break;
                    }
                } else if (parcel.readInt() != 0) {
                }
            }
            throw new UnsupportedOperationException();
        }
    }

    @v8.a
    void S(@androidx.annotation.n0 k kVar, @androidx.annotation.p0 GetServiceRequest getServiceRequest) throws RemoteException;
}
