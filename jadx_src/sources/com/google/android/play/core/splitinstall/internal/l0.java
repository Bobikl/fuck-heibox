package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class l0 extends f1 implements n0 {
    l0(IBinder iBinder) {
        super(iBinder, "com.google.android.play.core.splitinstall.protocol.ISplitInstallService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.n0
    public final void I(String str, List list, Bundle bundle, p0 p0Var) throws RemoteException {
        Parcel parcelN = N();
        parcelN.writeString(str);
        parcelN.writeTypedList(list);
        h1.c(parcelN, bundle);
        parcelN.writeStrongBinder(p0Var);
        r0(14, parcelN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.n0
    public final void K(String str, List list, Bundle bundle, p0 p0Var) throws RemoteException {
        Parcel parcelN = N();
        parcelN.writeString(str);
        parcelN.writeTypedList(list);
        h1.c(parcelN, bundle);
        parcelN.writeStrongBinder(p0Var);
        r0(13, parcelN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.n0
    public final void S0(String str, List list, Bundle bundle, p0 p0Var) throws RemoteException {
        Parcel parcelN = N();
        parcelN.writeString(str);
        parcelN.writeTypedList(list);
        h1.c(parcelN, bundle);
        parcelN.writeStrongBinder(p0Var);
        r0(7, parcelN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.n0
    public final void X0(String str, List list, Bundle bundle, p0 p0Var) throws RemoteException {
        Parcel parcelN = N();
        parcelN.writeString(str);
        parcelN.writeTypedList(list);
        h1.c(parcelN, bundle);
        parcelN.writeStrongBinder(p0Var);
        r0(2, parcelN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.n0
    public final void d(String str, int i10, Bundle bundle, p0 p0Var) throws RemoteException {
        Parcel parcelN = N();
        parcelN.writeString(str);
        parcelN.writeInt(i10);
        h1.c(parcelN, bundle);
        parcelN.writeStrongBinder(p0Var);
        r0(4, parcelN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.n0
    public final void n(String str, p0 p0Var) throws RemoteException {
        Parcel parcelN = N();
        parcelN.writeString(str);
        int i10 = h1.f56288b;
        parcelN.writeStrongBinder(p0Var);
        r0(6, parcelN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.n0
    public final void p(String str, int i10, p0 p0Var) throws RemoteException {
        Parcel parcelN = N();
        parcelN.writeString(str);
        parcelN.writeInt(i10);
        int i11 = h1.f56288b;
        parcelN.writeStrongBinder(p0Var);
        r0(5, parcelN);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.play.core.splitinstall.internal.n0
    public final void v(String str, List list, Bundle bundle, p0 p0Var) throws RemoteException {
        Parcel parcelN = N();
        parcelN.writeString(str);
        parcelN.writeTypedList(list);
        h1.c(parcelN, bundle);
        parcelN.writeStrongBinder(p0Var);
        r0(8, parcelN);
    }
}
