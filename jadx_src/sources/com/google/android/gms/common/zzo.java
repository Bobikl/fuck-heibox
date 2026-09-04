package com.google.android.gms.common;

import android.content.Context;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.a(creator = "GoogleCertificatesLookupQueryCreator")
public final class zzo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzo> CREATOR = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCallingPackage", id = 1)
    private final String f52657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAllowTestKeys", id = 2)
    private final boolean f52658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "false", getter = "getIgnoreTestKeysOverride", id = 3)
    private final boolean f52659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCallingContextBinder", id = 4, type = "android.os.IBinder")
    private final Context f52660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getIsChimeraPackage", id = 5)
    private final boolean f52661f;

    @SafeParcelable.b
    zzo(@SafeParcelable.e(id = 1) String str, @SafeParcelable.e(id = 2) boolean z10, @SafeParcelable.e(id = 3) boolean z11, @SafeParcelable.e(id = 4) IBinder iBinder, @SafeParcelable.e(id = 5) boolean z12) {
        this.f52657b = str;
        this.f52658c = z10;
        this.f52659d = z11;
        this.f52660e = (Context) com.google.android.gms.dynamic.e.r0(com.google.android.gms.dynamic.c.a.N(iBinder));
        this.f52661f = z12;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [android.os.IBinder, com.google.android.gms.dynamic.c] */
    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iA = x8.a.a(parcel);
        x8.a.Y(parcel, 1, this.f52657b, false);
        x8.a.g(parcel, 2, this.f52658c);
        x8.a.g(parcel, 3, this.f52659d);
        x8.a.B(parcel, 4, com.google.android.gms.dynamic.e.f1(this.f52660e), false);
        x8.a.g(parcel, 5, this.f52661f);
        x8.a.b(parcel, iA);
    }
}
