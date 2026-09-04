package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.p;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.t;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import z8.d0;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.a(creator = "StatusCreator")
public final class Status extends AbstractSafeParcelable implements e, ReflectedParcelable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.h(id = 1000)
    final int f52342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStatusCode", id = 1)
    private final int f52343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getStatusMessage", id = 2)
    @p0
    private final String f52344d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getPendingIntent", id = 3)
    @p0
    private final PendingIntent f52345e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SafeParcelable.c(getter = "getConnectionResult", id = 4)
    @p0
    private final ConnectionResult f52346f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @t
    @n0
    @v8.a
    @d0
    public static final Status f52334g = new Status(-1);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @t
    @n0
    @v8.a
    @d0
    public static final Status f52335h = new Status(0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @t
    @n0
    @v8.a
    public static final Status f52336i = new Status(14);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @t
    @n0
    @v8.a
    public static final Status f52337j = new Status(8);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @t
    @n0
    @v8.a
    public static final Status f52338k = new Status(15);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @t
    @n0
    @v8.a
    public static final Status f52339l = new Status(16);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @t
    @n0
    public static final Status f52341n = new Status(17);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    @v8.a
    public static final Status f52340m = new Status(18);

    @n0
    public static final Parcelable.Creator<Status> CREATOR = new i();

    public Status(int i10) {
        this(i10, (String) null);
    }

    @SafeParcelable.b
    Status(@SafeParcelable.e(id = 1000) int i10, @SafeParcelable.e(id = 1) int i11, @SafeParcelable.e(id = 2) @p0 String str, @SafeParcelable.e(id = 3) @p0 PendingIntent pendingIntent, @SafeParcelable.e(id = 4) @p0 ConnectionResult connectionResult) {
        this.f52342b = i10;
        this.f52343c = i11;
        this.f52344d = str;
        this.f52345e = pendingIntent;
        this.f52346f = connectionResult;
    }

    public Status(int i10, @p0 String str) {
        this(1, i10, str, null, null);
    }

    public Status(int i10, @p0 String str, @p0 PendingIntent pendingIntent) {
        this(1, i10, str, pendingIntent, null);
    }

    public Status(@n0 ConnectionResult connectionResult, @n0 String str) {
        this(connectionResult, str, 17);
    }

    @v8.a
    @Deprecated
    public Status(@n0 ConnectionResult connectionResult, @n0 String str, int i10) {
        this(1, i10, str, connectionResult.d(), connectionResult);
    }

    @Override // com.google.android.gms.common.api.e
    @s9.a
    @n0
    public Status a() {
        return this;
    }

    @p0
    public ConnectionResult b() {
        return this.f52346f;
    }

    @p0
    public PendingIntent c() {
        return this.f52345e;
    }

    public int d() {
        return this.f52343c;
    }

    public boolean equals(@p0 Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status status = (Status) obj;
        return this.f52342b == status.f52342b && this.f52343c == status.f52343c && o.b(this.f52344d, status.f52344d) && o.b(this.f52345e, status.f52345e) && o.b(this.f52346f, status.f52346f);
    }

    @p0
    public String f() {
        return this.f52344d;
    }

    @d0
    public boolean h() {
        return this.f52345e != null;
    }

    public int hashCode() {
        return o.c(Integer.valueOf(this.f52342b), Integer.valueOf(this.f52343c), this.f52344d, this.f52345e, this.f52346f);
    }

    public boolean j() {
        return this.f52343c == 16;
    }

    public boolean k() {
        return this.f52343c == 14;
    }

    @s9.b
    public boolean l() {
        return this.f52343c <= 0;
    }

    public void n(@n0 Activity activity, int i10) throws IntentSender.SendIntentException {
        if (h()) {
            PendingIntent pendingIntent = this.f52345e;
            p.l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
        }
    }

    @n0
    public final String o() {
        String str = this.f52344d;
        return str != null ? str : a.a(this.f52343c);
    }

    @n0
    public String toString() {
        o.a aVarD = o.d(this);
        aVarD.a(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, o());
        aVarD.a("resolution", this.f52345e);
        return aVarD.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@n0 Parcel parcel, int i10) {
        int iA = x8.a.a(parcel);
        x8.a.F(parcel, 1, d());
        x8.a.Y(parcel, 2, f(), false);
        x8.a.S(parcel, 3, this.f52345e, i10, false);
        x8.a.S(parcel, 4, b(), i10, false);
        x8.a.F(parcel, 1000, this.f52342b);
        x8.a.b(parcel, iA);
    }
}
