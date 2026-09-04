package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public interface i extends IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
    public static abstract class a extends com.google.android.gms.internal.common.i implements i {
        public a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        @androidx.annotation.n0
        public static i N(@androidx.annotation.n0 IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return iInterfaceQueryLocalInterface instanceof i ? (i) iInterfaceQueryLocalInterface : new b1(iBinder);
        }

        @Override // com.google.android.gms.internal.common.i
        protected final boolean g(int i10, @androidx.annotation.n0 Parcel parcel, @androidx.annotation.n0 Parcel parcel2, int i11) throws RemoteException {
            if (i10 != 2) {
                return false;
            }
            Account accountA = A();
            parcel2.writeNoException();
            com.google.android.gms.internal.common.j.e(parcel2, accountA);
            return true;
        }
    }

    @androidx.annotation.n0
    Account A() throws RemoteException;
}
