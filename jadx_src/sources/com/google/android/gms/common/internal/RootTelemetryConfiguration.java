package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.a(creator = "RootTelemetryConfigurationCreator")
@v8.a
public class RootTelemetryConfiguration extends AbstractSafeParcelable {

    @androidx.annotation.n0
    @v8.a
    public static final Parcelable.Creator<RootTelemetryConfiguration> CREATOR = new f0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getVersion", id = 1)
    private final int f52464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean f52465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean f52466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getBatchPeriodMillis", id = 4)
    private final int f52467e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMaxMethodInvocationsInBatch", id = 5)
    private final int f52468f;

    @SafeParcelable.b
    public RootTelemetryConfiguration(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) boolean z11, @SafeParcelable.e(id = 4) int i11, @SafeParcelable.e(id = 5) int i12) {
        this.f52464b = i10;
        this.f52465c = z10;
        this.f52466d = z11;
        this.f52467e = i11;
        this.f52468f = i12;
    }

    @v8.a
    public int b() {
        return this.f52467e;
    }

    @v8.a
    public int c() {
        return this.f52468f;
    }

    @v8.a
    public boolean d() {
        return this.f52465c;
    }

    @v8.a
    public boolean f() {
        return this.f52466d;
    }

    @v8.a
    public int h() {
        return this.f52464b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.n0 Parcel parcel, int i10) {
        int iA = x8.a.a(parcel);
        x8.a.F(parcel, 1, h());
        x8.a.g(parcel, 2, d());
        x8.a.g(parcel, 3, f());
        x8.a.F(parcel, 4, b());
        x8.a.F(parcel, 5, c());
        x8.a.b(parcel, iA);
    }
}
