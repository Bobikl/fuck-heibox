package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class i0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = SafeParcelReader.i0(parcel);
        boolean zP = false;
        String strG = null;
        IBinder iBinderY = null;
        boolean zP2 = false;
        while (parcel.dataPosition() < iI0) {
            int iX = SafeParcelReader.X(parcel);
            int iO = SafeParcelReader.O(iX);
            if (iO == 1) {
                strG = SafeParcelReader.G(parcel, iX);
            } else if (iO == 2) {
                iBinderY = SafeParcelReader.Y(parcel, iX);
            } else if (iO == 3) {
                zP = SafeParcelReader.P(parcel, iX);
            } else if (iO != 4) {
                SafeParcelReader.h0(parcel, iX);
            } else {
                zP2 = SafeParcelReader.P(parcel, iX);
            }
        }
        SafeParcelReader.N(parcel, iI0);
        return new zzs(strG, iBinderY, zP, zP2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzs[i10];
    }
}
