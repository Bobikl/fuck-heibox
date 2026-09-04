package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class p0 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        int iI0 = SafeParcelReader.i0(parcel);
        Bundle bundleG = null;
        ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
        int iZ = 0;
        Feature[] featureArr = null;
        while (parcel.dataPosition() < iI0) {
            int iX = SafeParcelReader.X(parcel);
            int iO = SafeParcelReader.O(iX);
            if (iO == 1) {
                bundleG = SafeParcelReader.g(parcel, iX);
            } else if (iO == 2) {
                featureArr = (Feature[]) SafeParcelReader.K(parcel, iX, Feature.CREATOR);
            } else if (iO == 3) {
                iZ = SafeParcelReader.Z(parcel, iX);
            } else if (iO != 4) {
                SafeParcelReader.h0(parcel, iX);
            } else {
                connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) SafeParcelReader.C(parcel, iX, ConnectionTelemetryConfiguration.CREATOR);
            }
        }
        SafeParcelReader.N(parcel, iI0);
        return new zzj(bundleG, featureArr, iZ, connectionTelemetryConfiguration);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        return new zzj[i10];
    }
}
