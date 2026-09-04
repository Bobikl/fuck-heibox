package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.a(creator = "ConnectionTelemetryConfigurationCreator")
@v8.a
public class ConnectionTelemetryConfiguration extends AbstractSafeParcelable {

    @androidx.annotation.n0
    @v8.a
    public static final Parcelable.Creator<ConnectionTelemetryConfiguration> CREATOR = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getRootTelemetryConfiguration", id = 1)
    private final RootTelemetryConfiguration f52440b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMethodInvocationTelemetryEnabled", id = 2)
    private final boolean f52441c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMethodTimingTelemetryEnabled", id = 3)
    private final boolean f52442d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMethodInvocationMethodKeyAllowlist", id = 4)
    @androidx.annotation.p0
    private final int[] f52443e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMaxMethodInvocationsLogged", id = 5)
    private final int f52444f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getMethodInvocationMethodKeyDisallowlist", id = 6)
    @androidx.annotation.p0
    private final int[] f52445g;

    @SafeParcelable.b
    public ConnectionTelemetryConfiguration(@SafeParcelable.e(id = 1) @androidx.annotation.n0 RootTelemetryConfiguration rootTelemetryConfiguration, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) boolean z11, @SafeParcelable.e(id = 4) @androidx.annotation.p0 int[] iArr, @SafeParcelable.e(id = 5) int i10, @SafeParcelable.e(id = 6) @androidx.annotation.p0 int[] iArr2) {
        this.f52440b = rootTelemetryConfiguration;
        this.f52441c = z10;
        this.f52442d = z11;
        this.f52443e = iArr;
        this.f52444f = i10;
        this.f52445g = iArr2;
    }

    @v8.a
    public int b() {
        return this.f52444f;
    }

    @v8.a
    @androidx.annotation.p0
    public int[] c() {
        return this.f52443e;
    }

    @v8.a
    @androidx.annotation.p0
    public int[] d() {
        return this.f52445g;
    }

    @v8.a
    public boolean f() {
        return this.f52441c;
    }

    @v8.a
    public boolean h() {
        return this.f52442d;
    }

    @androidx.annotation.n0
    public final RootTelemetryConfiguration j() {
        return this.f52440b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.n0 Parcel parcel, int i10) {
        int iA = x8.a.a(parcel);
        x8.a.S(parcel, 1, this.f52440b, i10, false);
        x8.a.g(parcel, 2, f());
        x8.a.g(parcel, 3, h());
        x8.a.G(parcel, 4, c(), false);
        x8.a.F(parcel, 5, b());
        x8.a.G(parcel, 6, d(), false);
        x8.a.b(parcel, iA);
    }
}
