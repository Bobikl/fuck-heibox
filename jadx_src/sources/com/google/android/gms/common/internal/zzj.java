package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.a(creator = "ConnectionInfoCreator")
public final class zzj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzj> CREATOR = new p0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(id = 1)
    Bundle f52579b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    Feature[] f52580c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "0", id = 3)
    int f52581d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(id = 4)
    @androidx.annotation.p0
    ConnectionTelemetryConfiguration f52582e;

    public zzj() {
    }

    @SafeParcelable.b
    zzj(@SafeParcelable.e(id = 1) Bundle bundle, @SafeParcelable.e(id = 2) Feature[] featureArr, @SafeParcelable.e(id = 3) int i10, @SafeParcelable.e(id = 4) @androidx.annotation.p0 ConnectionTelemetryConfiguration connectionTelemetryConfiguration) {
        this.f52579b = bundle;
        this.f52580c = featureArr;
        this.f52581d = i10;
        this.f52582e = connectionTelemetryConfiguration;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.a.a(parcel);
        x8.a.k(parcel, 1, this.f52579b, false);
        x8.a.c0(parcel, 2, this.f52580c, i10, false);
        x8.a.F(parcel, 3, this.f52581d);
        x8.a.S(parcel, 4, this.f52582e, i10, false);
        x8.a.b(parcel, iA);
    }
}
