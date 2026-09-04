package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class b0 extends com.google.android.gms.internal.common.i implements c0 {
    public static c0 N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return iInterfaceQueryLocalInterface instanceof c0 ? (c0) iInterfaceQueryLocalInterface : new a0(iBinder);
    }
}
