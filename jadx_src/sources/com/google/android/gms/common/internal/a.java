package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public class a extends i.a {
    @v8.a
    @androidx.annotation.p0
    public static Account r0(@androidx.annotation.n0 i iVar) {
        Account accountA = null;
        if (iVar != null) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                try {
                    accountA = iVar.A();
                } catch (RemoteException unused) {
                    Log.w("AccountAccessor", "Remote account accessor probably died");
                }
            } finally {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
            }
        }
        return accountA;
    }

    @Override // com.google.android.gms.common.internal.i
    @androidx.annotation.n0
    public final Account A() {
        throw null;
    }

    public final boolean equals(@androidx.annotation.p0 Object obj) {
        throw null;
    }
}
