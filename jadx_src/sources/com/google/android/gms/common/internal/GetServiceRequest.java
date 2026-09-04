package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.a(creator = "GetServiceRequestCreator")
@SafeParcelable.g({9})
@v8.a
public class GetServiceRequest extends AbstractSafeParcelable {

    @androidx.annotation.n0
    public static final Parcelable.Creator<GetServiceRequest> CREATOR = new r0();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final Scope[] f52448p = new Scope[0];

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final Feature[] f52449q = new Feature[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f52450b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(id = 2)
    final int f52451c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(id = 3)
    int f52452d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(id = 4)
    String f52453e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(id = 5)
    @androidx.annotation.p0
    IBinder f52454f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "GetServiceRequest.EMPTY_SCOPES", id = 6)
    Scope[] f52455g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "new android.os.Bundle()", id = 7)
    Bundle f52456h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(id = 8)
    @androidx.annotation.p0
    Account f52457i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 10)
    Feature[] f52458j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SafeParcelable.c(defaultValueUnchecked = "GetServiceRequest.EMPTY_FEATURES", id = 11)
    Feature[] f52459k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SafeParcelable.c(id = 12)
    boolean f52460l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SafeParcelable.c(defaultValue = "0", id = 13)
    int f52461m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SafeParcelable.c(getter = "isRequestingTelemetryConfiguration", id = 14)
    boolean f52462n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAttributionTag", id = 15)
    @androidx.annotation.p0
    private String f52463o;

    @SafeParcelable.b
    GetServiceRequest(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) int i12, @SafeParcelable.e(id = 4) String str, @SafeParcelable.e(id = 5) @androidx.annotation.p0 IBinder iBinder, @SafeParcelable.e(id = 6) Scope[] scopeArr, @SafeParcelable.e(id = 7) Bundle bundle, @SafeParcelable.e(id = 8) @androidx.annotation.p0 Account account, @SafeParcelable.e(id = 10) Feature[] featureArr, @SafeParcelable.e(id = 11) Feature[] featureArr2, @SafeParcelable.e(id = 12) boolean z10, @SafeParcelable.e(id = 13) int i13, @SafeParcelable.e(id = 14) boolean z11, @SafeParcelable.e(id = 15) @androidx.annotation.p0 String str2) {
        scopeArr = scopeArr == null ? f52448p : scopeArr;
        bundle = bundle == null ? new Bundle() : bundle;
        featureArr = featureArr == null ? f52449q : featureArr;
        featureArr2 = featureArr2 == null ? f52449q : featureArr2;
        this.f52450b = i10;
        this.f52451c = i11;
        this.f52452d = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f52453e = "com.google.android.gms";
        } else {
            this.f52453e = str;
        }
        if (i10 < 2) {
            this.f52457i = iBinder != null ? a.r0(i.a.N(iBinder)) : null;
        } else {
            this.f52454f = iBinder;
            this.f52457i = account;
        }
        this.f52455g = scopeArr;
        this.f52456h = bundle;
        this.f52458j = featureArr;
        this.f52459k = featureArr2;
        this.f52460l = z10;
        this.f52461m = i13;
        this.f52462n = z11;
        this.f52463o = str2;
    }

    @androidx.annotation.n0
    @v8.a
    public Bundle b() {
        return this.f52456h;
    }

    @androidx.annotation.p0
    public final String c() {
        return this.f52463o;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@androidx.annotation.n0 Parcel parcel, int i10) {
        r0.a(this, parcel, i10);
    }
}
