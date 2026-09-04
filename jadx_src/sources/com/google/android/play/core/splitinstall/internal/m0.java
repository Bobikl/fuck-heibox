package com.google.android.play.core.splitinstall.internal;

import android.os.IBinder;
import android.os.IInterface;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class m0 extends g1 implements n0 {
    public static n0 N(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
        return iInterfaceQueryLocalInterface instanceof n0 ? (n0) iInterfaceQueryLocalInterface : new l0(iBinder);
    }
}
