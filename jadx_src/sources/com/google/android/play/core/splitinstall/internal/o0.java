package com.google.android.play.core.splitinstall.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public abstract class o0 extends g1 implements p0 {
    public o0() {
        super("com.google.android.play.core.splitinstall.protocol.ISplitInstallServiceCallback");
    }

    @Override // com.google.android.play.core.splitinstall.internal.g1
    protected final boolean g(int i10, Parcel parcel, Parcel parcel2, int i11) throws RemoteException {
        switch (i10) {
            case 2:
                int i12 = parcel.readInt();
                Bundle bundle = (Bundle) h1.a(parcel, Bundle.CREATOR);
                h1.b(parcel);
                J0(i12, bundle);
                return true;
            case 3:
                int i13 = parcel.readInt();
                Bundle bundle2 = (Bundle) h1.a(parcel, Bundle.CREATOR);
                h1.b(parcel);
                D0(i13, bundle2);
                return true;
            case 4:
                int i14 = parcel.readInt();
                Bundle bundle3 = (Bundle) h1.a(parcel, Bundle.CREATOR);
                h1.b(parcel);
                b(i14, bundle3);
                return true;
            case 5:
                int i15 = parcel.readInt();
                Bundle bundle4 = (Bundle) h1.a(parcel, Bundle.CREATOR);
                h1.b(parcel);
                Q0(i15, bundle4);
                return true;
            case 6:
                Bundle bundle5 = (Bundle) h1.a(parcel, Bundle.CREATOR);
                h1.b(parcel);
                H0(bundle5);
                return true;
            case 7:
                ArrayList arrayListCreateTypedArrayList = parcel.createTypedArrayList(Bundle.CREATOR);
                h1.b(parcel);
                s0(arrayListCreateTypedArrayList);
                return true;
            case 8:
                Bundle bundle6 = (Bundle) h1.a(parcel, Bundle.CREATOR);
                h1.b(parcel);
                R(bundle6);
                return true;
            case 9:
                Bundle bundle7 = (Bundle) h1.a(parcel, Bundle.CREATOR);
                h1.b(parcel);
                c0(bundle7);
                return true;
            case 10:
                Bundle bundle8 = (Bundle) h1.a(parcel, Bundle.CREATOR);
                h1.b(parcel);
                E0(bundle8);
                return true;
            case 11:
                Bundle bundle9 = (Bundle) h1.a(parcel, Bundle.CREATOR);
                h1.b(parcel);
                O0(bundle9);
                return true;
            case 12:
                Bundle bundle10 = (Bundle) h1.a(parcel, Bundle.CREATOR);
                h1.b(parcel);
                Y(bundle10);
                return true;
            case 13:
                Bundle bundle11 = (Bundle) h1.a(parcel, Bundle.CREATOR);
                h1.b(parcel);
                V(bundle11);
                return true;
            default:
                return false;
        }
    }
}
