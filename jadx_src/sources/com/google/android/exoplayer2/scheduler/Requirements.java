package com.google.android.exoplayer2.scheduler;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import androidx.annotation.p0;
import com.google.android.exoplayer2.util.u0;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes7.dex */
public final class Requirements implements Parcelable {
    public static final Parcelable.Creator<Requirements> CREATOR = new a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f47393c = 1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f47394d = 2;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f47395e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f47396f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f47397g = 16;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f47398b;

    public class a implements Parcelable.Creator<Requirements> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Requirements createFromParcel(Parcel parcel) {
            return new Requirements(parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Requirements[] newArray(int i10) {
            return new Requirements[i10];
        }
    }

    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    public Requirements(int i10) {
        this.f47398b = (i10 & 2) != 0 ? i10 | 1 : i10;
    }

    private int c(Context context) {
        if (!o()) {
            return 0;
        }
        ConnectivityManager connectivityManager = (ConnectivityManager) com.google.android.exoplayer2.util.a.g(context.getSystemService("connectivity"));
        NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected() && n(connectivityManager)) {
            return (u() && connectivityManager.isActiveNetworkMetered()) ? 2 : 0;
        }
        return this.f47398b & 3;
    }

    private boolean j(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return false;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", -1);
        return intExtra == 2 || intExtra == 5;
    }

    private boolean k(Context context) {
        PowerManager powerManager = (PowerManager) com.google.android.exoplayer2.util.a.g(context.getSystemService("power"));
        int i10 = u0.f51536a;
        if (i10 >= 23) {
            return powerManager.isDeviceIdleMode();
        }
        if (i10 >= 20) {
            if (!powerManager.isInteractive()) {
                return true;
            }
        } else if (!powerManager.isScreenOn()) {
            return true;
        }
        return false;
    }

    private static boolean n(ConnectivityManager connectivityManager) {
        if (u0.f51536a < 24) {
            return true;
        }
        Network activeNetwork = connectivityManager.getActiveNetwork();
        if (activeNetwork == null) {
            return false;
        }
        try {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork);
            return networkCapabilities != null && networkCapabilities.hasCapability(16);
        } catch (SecurityException unused) {
            return true;
        }
    }

    private boolean p(Context context) {
        return context.registerReceiver(null, new IntentFilter("android.intent.action.DEVICE_STORAGE_LOW")) == null;
    }

    public boolean a(Context context) {
        return d(context) == 0;
    }

    public Requirements b(int i10) {
        int i11 = this.f47398b;
        int i12 = i10 & i11;
        return i12 == i11 ? this : new Requirements(i12);
    }

    public int d(Context context) {
        int iC = c(context);
        if (h() && !j(context)) {
            iC |= 8;
        }
        if (l() && !k(context)) {
            iC |= 4;
        }
        return (!r() || p(context)) ? iC : iC | 16;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@p0 Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && Requirements.class == obj.getClass() && this.f47398b == ((Requirements) obj).f47398b;
    }

    public int f() {
        return this.f47398b;
    }

    public boolean h() {
        return (this.f47398b & 8) != 0;
    }

    public int hashCode() {
        return this.f47398b;
    }

    public boolean l() {
        return (this.f47398b & 4) != 0;
    }

    public boolean o() {
        return (this.f47398b & 1) != 0;
    }

    public boolean r() {
        return (this.f47398b & 16) != 0;
    }

    public boolean u() {
        return (this.f47398b & 2) != 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f47398b);
    }
}
