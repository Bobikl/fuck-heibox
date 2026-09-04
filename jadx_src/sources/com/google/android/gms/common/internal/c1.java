package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.RemoteException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class c1 extends com.google.android.gms.internal.common.a implements j {
    c1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICancelToken");
    }

    @Override // com.google.android.gms.common.internal.j
    public final void cancel() throws RemoteException {
        r0(2, f1());
    }
}
