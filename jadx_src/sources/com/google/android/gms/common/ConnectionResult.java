package com.google.android.gms.common;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.p0;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@SafeParcelable.a(creator = "ConnectionResultCreator")
public final class ConnectionResult extends AbstractSafeParcelable {
    public static final int A = 22;
    public static final int B = 23;
    public static final int C = 24;

    @Deprecated
    public static final int D = 1500;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @v8.a
    public static final int f52278f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f52279g = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f52280h = 1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f52281i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f52282j = 3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f52283k = 4;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f52284l = 5;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f52285m = 6;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f52286n = 7;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f52287o = 8;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f52288p = 9;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f52289q = 10;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f52290r = 11;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f52291s = 13;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f52292t = 14;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f52293u = 15;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f52294v = 16;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f52295w = 17;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public static final int f52296x = 18;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final int f52297y = 19;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f52298z = 20;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SafeParcelable.h(id = 1)
    final int f52299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SafeParcelable.c(getter = "getErrorCode", id = 2)
    private final int f52300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SafeParcelable.c(getter = "getResolution", id = 3)
    @p0
    private final PendingIntent f52301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SafeParcelable.c(getter = "getErrorMessage", id = 4)
    @p0
    private final String f52302e;

    @com.google.android.gms.common.internal.t
    @androidx.annotation.n0
    @v8.a
    public static final ConnectionResult E = new ConnectionResult(0);

    @androidx.annotation.n0
    public static final Parcelable.Creator<ConnectionResult> CREATOR = new t();

    public ConnectionResult(int i10) {
        this(i10, null, null);
    }

    @SafeParcelable.b
    ConnectionResult(@SafeParcelable.e(id = 1) int i10, @SafeParcelable.e(id = 2) int i11, @SafeParcelable.e(id = 3) @p0 PendingIntent pendingIntent, @SafeParcelable.e(id = 4) @p0 String str) {
        this.f52299b = i10;
        this.f52300c = i11;
        this.f52301d = pendingIntent;
        this.f52302e = str;
    }

    public ConnectionResult(int i10, @p0 PendingIntent pendingIntent) {
        this(i10, pendingIntent, null);
    }

    public ConnectionResult(int i10, @p0 PendingIntent pendingIntent, @p0 String str) {
        this(1, i10, pendingIntent, str);
    }

    @androidx.annotation.n0
    static String k(int i10) {
        if (i10 == 99) {
            return "UNFINISHED";
        }
        if (i10 == 1500) {
            return "DRIVE_EXTERNAL_STORAGE_REQUIRED";
        }
        switch (i10) {
            case -1:
                return "UNKNOWN";
            case 0:
                return "SUCCESS";
            case 1:
                return "SERVICE_MISSING";
            case 2:
                return "SERVICE_VERSION_UPDATE_REQUIRED";
            case 3:
                return "SERVICE_DISABLED";
            case 4:
                return "SIGN_IN_REQUIRED";
            case 5:
                return "INVALID_ACCOUNT";
            case 6:
                return "RESOLUTION_REQUIRED";
            case 7:
                return "NETWORK_ERROR";
            case 8:
                return "INTERNAL_ERROR";
            case 9:
                return "SERVICE_INVALID";
            case 10:
                return "DEVELOPER_ERROR";
            case 11:
                return "LICENSE_CHECK_FAILED";
            default:
                switch (i10) {
                    case 13:
                        return "CANCELED";
                    case 14:
                        return "TIMEOUT";
                    case 15:
                        return "INTERRUPTED";
                    case 16:
                        return "API_UNAVAILABLE";
                    case 17:
                        return "SIGN_IN_FAILED";
                    case 18:
                        return "SERVICE_UPDATING";
                    case 19:
                        return "SERVICE_MISSING_PERMISSION";
                    case 20:
                        return "RESTRICTED_PROFILE";
                    case 21:
                        return "API_VERSION_UPDATE_REQUIRED";
                    case 22:
                        return "RESOLUTION_ACTIVITY_NOT_FOUND";
                    case 23:
                        return "API_DISABLED";
                    case 24:
                        return "API_DISABLED_FOR_CONNECTION";
                    default:
                        return "UNKNOWN_ERROR_CODE(" + i10 + ")";
                }
        }
    }

    public int b() {
        return this.f52300c;
    }

    @p0
    public String c() {
        return this.f52302e;
    }

    @p0
    public PendingIntent d() {
        return this.f52301d;
    }

    public boolean equals(@p0 Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ConnectionResult)) {
            return false;
        }
        ConnectionResult connectionResult = (ConnectionResult) obj;
        return this.f52300c == connectionResult.f52300c && com.google.android.gms.common.internal.o.b(this.f52301d, connectionResult.f52301d) && com.google.android.gms.common.internal.o.b(this.f52302e, connectionResult.f52302e);
    }

    public boolean f() {
        return (this.f52300c == 0 || this.f52301d == null) ? false : true;
    }

    public boolean h() {
        return this.f52300c == 0;
    }

    public int hashCode() {
        return com.google.android.gms.common.internal.o.c(Integer.valueOf(this.f52300c), this.f52301d, this.f52302e);
    }

    public void j(@androidx.annotation.n0 Activity activity, int i10) throws IntentSender.SendIntentException {
        if (f()) {
            PendingIntent pendingIntent = this.f52301d;
            com.google.android.gms.common.internal.p.l(pendingIntent);
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), i10, null, 0, 0, 0);
        }
    }

    @androidx.annotation.n0
    public String toString() {
        com.google.android.gms.common.internal.o.a aVarD = com.google.android.gms.common.internal.o.d(this);
        aVarD.a(HiAnalyticsConstant.HaKey.BI_KEY_RESULT, k(this.f52300c));
        aVarD.a("resolution", this.f52301d);
        aVarD.a("message", this.f52302e);
        return aVarD.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.n0 Parcel parcel, int i10) {
        int iA = x8.a.a(parcel);
        x8.a.F(parcel, 1, this.f52299b);
        x8.a.F(parcel, 2, b());
        x8.a.S(parcel, 3, d(), i10, false);
        x8.a.Y(parcel, 4, c(), false);
        x8.a.b(parcel, iA);
    }
}
