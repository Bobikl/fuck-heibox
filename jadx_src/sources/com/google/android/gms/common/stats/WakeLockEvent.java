package com.google.android.gms.common.stats;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.n0;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import javax.annotation.Nullable;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.a(creator = "WakeLockEventCreator")
@v8.a
@Deprecated
public final class WakeLockEvent extends StatsEvent {

    @n0
    public static final Parcelable.Creator<WakeLockEvent> CREATOR = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f52627b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTimeMillis", id = 2)
    private final long f52628c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getEventType", id = 11)
    private int f52629d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getWakeLockName", id = 4)
    private final String f52630e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getSecondaryWakeLockName", id = 10)
    private final String f52631f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCodePackage", id = 17)
    private final String f52632g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SafeParcelable.c(getter = "getWakeLockType", id = 5)
    private final int f52633h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @SafeParcelable.c(getter = "getCallingPackages", id = 6)
    @Nullable
    private final List f52634i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @SafeParcelable.c(getter = "getEventKey", id = 12)
    private final String f52635j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @SafeParcelable.c(getter = "getElapsedRealtime", id = 8)
    private final long f52636k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @SafeParcelable.c(getter = "getDeviceState", id = 14)
    private int f52637l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @SafeParcelable.c(getter = "getHostPackage", id = 13)
    private final String f52638m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @SafeParcelable.c(getter = "getBeginPowerPercentage", id = 15)
    private final float f52639n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @SafeParcelable.c(getter = "getTimeout", id = 16)
    private final long f52640o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @SafeParcelable.c(getter = "getAcquiredWithTimeout", id = 18)
    private final boolean f52641p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f52642q = -1;

    @SafeParcelable.b
    WakeLockEvent(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) long j10, @SafeParcelable.e(id = 11) int i11, @SafeParcelable.e(id = 4) String str, @SafeParcelable.e(id = 5) int i12, @SafeParcelable.e(id = 6) @Nullable List list, @SafeParcelable.e(id = 12) String str2, @SafeParcelable.e(id = 8) long j11, @SafeParcelable.e(id = 14) int i13, @SafeParcelable.e(id = 10) String str3, @SafeParcelable.e(id = 13) String str4, @SafeParcelable.e(id = 15) float f10, @SafeParcelable.e(id = 16) long j12, @SafeParcelable.e(id = 17) String str5, @SafeParcelable.e(id = 18) boolean z10) {
        this.f52627b = i10;
        this.f52628c = j10;
        this.f52629d = i11;
        this.f52630e = str;
        this.f52631f = str3;
        this.f52632g = str5;
        this.f52633h = i12;
        this.f52634i = list;
        this.f52635j = str2;
        this.f52636k = j11;
        this.f52637l = i13;
        this.f52638m = str4;
        this.f52639n = f10;
        this.f52640o = j12;
        this.f52641p = z10;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final int b() {
        return this.f52629d;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long c() {
        return this.f52642q;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    public final long d() {
        return this.f52628c;
    }

    @Override // com.google.android.gms.common.stats.StatsEvent
    @n0
    public final String f() {
        List list = this.f52634i;
        String str = this.f52630e;
        int i10 = this.f52633h;
        String strJoin = list == null ? "" : TextUtils.join(Constants.ACCEPT_TIME_SEPARATOR_SP, list);
        int i11 = this.f52637l;
        String str2 = this.f52631f;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = this.f52638m;
        if (str3 == null) {
            str3 = "";
        }
        float f10 = this.f52639n;
        String str4 = this.f52632g;
        return "\t" + str + "\t" + i10 + "\t" + strJoin + "\t" + i11 + "\t" + str2 + "\t" + str3 + "\t" + f10 + "\t" + (str4 != null ? str4 : "") + "\t" + this.f52641p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@n0 Parcel parcel, int i10) {
        int iA = x8.a.a(parcel);
        x8.a.F(parcel, 1, this.f52627b);
        x8.a.K(parcel, 2, this.f52628c);
        x8.a.Y(parcel, 4, this.f52630e, false);
        x8.a.F(parcel, 5, this.f52633h);
        x8.a.a0(parcel, 6, this.f52634i, false);
        x8.a.K(parcel, 8, this.f52636k);
        x8.a.Y(parcel, 10, this.f52631f, false);
        x8.a.F(parcel, 11, this.f52629d);
        x8.a.Y(parcel, 12, this.f52635j, false);
        x8.a.Y(parcel, 13, this.f52638m, false);
        x8.a.F(parcel, 14, this.f52637l);
        x8.a.w(parcel, 15, this.f52639n);
        x8.a.K(parcel, 16, this.f52640o);
        x8.a.Y(parcel, 17, this.f52632g, false);
        x8.a.g(parcel, 18, this.f52641p);
        x8.a.b(parcel, iA);
    }
}
