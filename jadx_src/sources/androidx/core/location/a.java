package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssStatus;
import android.location.GpsStatus;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: GnssStatusCompat.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f20804a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f20805b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f20806c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f20807d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f20808e = 4;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f20809f = 5;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f20810g = 6;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @SuppressLint({"InlinedApi"})
    public static final int f20811h = 7;

    /* JADX INFO: renamed from: androidx.core.location.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: GnssStatusCompat.java */
    public static abstract class AbstractC0133a {
        public void a(@androidx.annotation.f0(from = 0) int i10) {
        }

        public void b(@androidx.annotation.n0 a aVar) {
        }

        public void c() {
        }

        public void d() {
        }
    }

    /* JADX INFO: compiled from: GnssStatusCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface b {
    }

    a() {
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(24)
    public static a n(@androidx.annotation.n0 GnssStatus gnssStatus) {
        return new d(gnssStatus);
    }

    @androidx.annotation.n0
    @SuppressLint({"ReferencesDeprecated"})
    public static a o(@androidx.annotation.n0 GpsStatus gpsStatus) {
        return new g(gpsStatus);
    }

    @androidx.annotation.x(from = 0.0d, to = 360.0d)
    public abstract float a(@androidx.annotation.f0(from = 0) int i10);

    @androidx.annotation.x(from = 0.0d, to = 63.0d)
    public abstract float b(@androidx.annotation.f0(from = 0) int i10);

    @androidx.annotation.x(from = 0.0d)
    public abstract float c(@androidx.annotation.f0(from = 0) int i10);

    @androidx.annotation.x(from = 0.0d, to = 63.0d)
    public abstract float d(@androidx.annotation.f0(from = 0) int i10);

    public abstract int e(@androidx.annotation.f0(from = 0) int i10);

    @androidx.annotation.x(from = -90.0d, to = 90.0d)
    public abstract float f(@androidx.annotation.f0(from = 0) int i10);

    @androidx.annotation.f0(from = 0)
    public abstract int g();

    @androidx.annotation.f0(from = 1, to = 200)
    public abstract int h(@androidx.annotation.f0(from = 0) int i10);

    public abstract boolean i(@androidx.annotation.f0(from = 0) int i10);

    public abstract boolean j(@androidx.annotation.f0(from = 0) int i10);

    public abstract boolean k(@androidx.annotation.f0(from = 0) int i10);

    public abstract boolean l(@androidx.annotation.f0(from = 0) int i10);

    public abstract boolean m(@androidx.annotation.f0(from = 0) int i10);
}
