package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public interface j extends IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class a extends com.google.android.gms.internal.common.i implements j {
        public a() {
            super("com.google.android.gms.common.internal.ICancelToken");
        }

        @androidx.annotation.n0
        public static j N(@androidx.annotation.n0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICancelToken");
            return iInterfaceQueryLocalInterface instanceof j ? (j) iInterfaceQueryLocalInterface : new c1(iBinder);
        }

        @Override // com.google.android.gms.internal.common.i
        protected final boolean g(int i10, @androidx.annotation.n0 Parcel parcel, @androidx.annotation.n0 Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 2) {
                return false;
            }
            cancel();
            return true;
        }
    }

    void cancel() throws RemoteException;
}
