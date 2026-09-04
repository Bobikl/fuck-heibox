package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.a(creator = "ValidateAccountRequestCreator")
@Deprecated
public final class zzaj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzaj> CREATOR = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f52578b;

    @SafeParcelable.b
    zzaj(@SafeParcelable.e(id = 1) int i10) {
        this.f52578b = i10;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.a.a(parcel);
        x8.a.F(parcel, 1, this.f52578b);
        x8.a.b(parcel, iA);
    }
}
