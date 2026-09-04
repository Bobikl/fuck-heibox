package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class u implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = SafeParcelReader.i0(parcel);
        String strG = null;
        int iZ = 0;
        long jC0 = -1;
        while (parcel.dataPosition() < iI0) {
            int iX = SafeParcelReader.X(parcel);
            int iO = SafeParcelReader.O(iX);
            if (iO == 1) {
                strG = SafeParcelReader.G(parcel, iX);
            } else if (iO == 2) {
                iZ = SafeParcelReader.Z(parcel, iX);
            } else if (iO != 3) {
                SafeParcelReader.h0(parcel, iX);
            } else {
                jC0 = SafeParcelReader.c0(parcel, iX);
            }
        }
        SafeParcelReader.N(parcel, iI0);
        return new Feature(strG, iZ, jC0);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new Feature[i10];
    }
}
