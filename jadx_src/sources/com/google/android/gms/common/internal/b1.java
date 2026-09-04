package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class b1 extends com.google.android.gms.internal.common.a implements i {
    b1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // com.google.android.gms.common.internal.i
    public final Account A() throws RemoteException {
        Parcel parcelG = g(2, f1());
        Account account = (Account) com.google.android.gms.internal.common.j.a(parcelG, Account.CREATOR);
        parcelG.recycle();
        return account;
    }
}
