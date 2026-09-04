package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.a(creator = "GoogleCertificatesLookupResponseCreator")
public final class zzq extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzq> CREATOR = new h0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getResult", id = 1)
    private final boolean f52662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getErrorMessage", id = 2)
    @Nullable
    private final String f52663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStatusValue", id = 3)
    private final int f52664d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getFirstPartyStatusValue", id = 4)
    private final int f52665e;

    @SafeParcelable.b
    zzq(@SafeParcelable.e(id = 1) boolean z10, @SafeParcelable.e(id = 2) String str, @SafeParcelable.e(id = 3) int i10, @SafeParcelable.e(id = 4) int i11) {
        this.f52662b = z10;
        this.f52663c = str;
        this.f52664d = n0.a(i10) - 1;
        this.f52665e = v.a(i11) - 1;
    }

    @Nullable
    public final String b() {
        return this.f52663c;
    }

    public final boolean c() {
        return this.f52662b;
    }

    public final int d() {
        return v.a(this.f52665e);
    }

    public final int f() {
        return n0.a(this.f52664d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.a.a(parcel);
        x8.a.g(parcel, 1, this.f52662b);
        x8.a.Y(parcel, 2, this.f52663c, false);
        x8.a.F(parcel, 3, this.f52664d);
        x8.a.F(parcel, 4, this.f52665e);
        x8.a.b(parcel, iA);
    }
}
