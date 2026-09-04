package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.a(creator = "FeatureCreator")
@v8.a
public class Feature extends AbstractSafeParcelable {

    @androidx.annotation.n0
    public static final Parcelable.Creator<Feature> CREATOR = new u();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getName", id = 1)
    private final String f52303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getOldVersion", id = 2)
    @Deprecated
    private final int f52304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "-1", getter = "getVersion", id = 3)
    private final long f52305d;

    @SafeParcelable.b
    public Feature(@SafeParcelable.e(id = 1) @androidx.annotation.n0 String str, @SafeParcelable.e(id = 2) int i10, @SafeParcelable.e(id = 3) long j10) {
        this.f52303b = str;
        this.f52304c = i10;
        this.f52305d = j10;
    }

    @v8.a
    public Feature(@androidx.annotation.n0 String str, long j10) {
        this.f52303b = str;
        this.f52305d = j10;
        this.f52304c = -1;
    }

    @androidx.annotation.n0
    @v8.a
    public String b() {
        return this.f52303b;
    }

    @v8.a
    public long c() {
        long j10 = this.f52305d;
        return j10 == -1 ? this.f52304c : j10;
    }

    public final boolean equals(@p0 Object obj) {
        if (obj instanceof Feature) {
            Feature feature = (Feature) obj;
            if (((b() != null && b().equals(feature.b())) || (b() == null && feature.b() == null)) && c() == feature.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.o.c(b(), Long.valueOf(c()));
    }

    @androidx.annotation.n0
    public final String toString() {
        com.google.android.gms.common.internal.o.a aVarD = com.google.android.gms.common.internal.o.d(this);
        aVarD.a("name", b());
        aVarD.a("version", Long.valueOf(c()));
        return aVarD.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.n0 Parcel parcel, int i10) {
        int iA = x8.a.a(parcel);
        x8.a.Y(parcel, 1, b(), false);
        x8.a.F(parcel, 2, this.f52304c);
        x8.a.K(parcel, 3, c());
        x8.a.b(parcel, iA);
    }
}
