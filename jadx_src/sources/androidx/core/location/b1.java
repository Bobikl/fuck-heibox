package androidx.core.location;

import android.annotation.NonNull;
import android.annotation.SuppressLint;
import android.location.LocationRequest;
import android.os.Build;
import androidx.annotation.RestrictTo;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: LocationRequestCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class b1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final long f20814h = Long.MAX_VALUE;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f20815i = 100;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f20816j = 102;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f20817k = 104;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final long f20818l = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f20819a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final long f20820b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final long f20821c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final long f20822d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final int f20823e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f20824f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final long f20825g;

    /* JADX INFO: compiled from: LocationRequestCompat.java */
    @androidx.annotation.w0(19)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Class<?> f20826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f20827b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Method f20828c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static Method f20829d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static Method f20830e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static Method f20831f;

        private a() {
        }

        public static Object a(b1 b1Var, String str) {
            try {
                if (f20826a == null) {
                    f20826a = Class.forName("android.location.LocationRequest");
                }
                if (f20827b == null) {
                    Method declaredMethod = f20826a.getDeclaredMethod("createFromDeprecatedProvider", String.class, Long.TYPE, Float.TYPE, Boolean.TYPE);
                    f20827b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                Object objInvoke = f20827b.invoke(null, str, Long.valueOf(b1Var.b()), Float.valueOf(b1Var.e()), Boolean.FALSE);
                if (objInvoke == null) {
                    return null;
                }
                if (f20828c == null) {
                    Method declaredMethod2 = f20826a.getDeclaredMethod("setQuality", Integer.TYPE);
                    f20828c = declaredMethod2;
                    declaredMethod2.setAccessible(true);
                }
                f20828c.invoke(objInvoke, Integer.valueOf(b1Var.g()));
                if (f20829d == null) {
                    Method declaredMethod3 = f20826a.getDeclaredMethod("setFastestInterval", Long.TYPE);
                    f20829d = declaredMethod3;
                    declaredMethod3.setAccessible(true);
                }
                f20829d.invoke(objInvoke, Long.valueOf(b1Var.f()));
                if (b1Var.d() < Integer.MAX_VALUE) {
                    if (f20830e == null) {
                        Method declaredMethod4 = f20826a.getDeclaredMethod("setNumUpdates", Integer.TYPE);
                        f20830e = declaredMethod4;
                        declaredMethod4.setAccessible(true);
                    }
                    f20830e.invoke(objInvoke, Integer.valueOf(b1Var.d()));
                }
                if (b1Var.a() < Long.MAX_VALUE) {
                    if (f20831f == null) {
                        Method declaredMethod5 = f20826a.getDeclaredMethod("setExpireIn", Long.TYPE);
                        f20831f = declaredMethod5;
                        declaredMethod5.setAccessible(true);
                    }
                    f20831f.invoke(objInvoke, Long.valueOf(b1Var.a()));
                }
                return objInvoke;
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                return null;
            }
        }
    }

    /* JADX INFO: compiled from: LocationRequestCompat.java */
    @androidx.annotation.w0(31)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        public static LocationRequest a(b1 b1Var) {
            return new Object(b1Var.b()) { // from class: android.location.LocationRequest.Builder
                static {
                    throw new NoClassDefFoundError();
                }

                public /* synthetic */ Builder(long j10) {
                }

                @NonNull
                public native /* synthetic */ LocationRequest build();

                @NonNull
                public native /* synthetic */ Builder setDurationMillis(long j10);

                @NonNull
                public native /* synthetic */ Builder setMaxUpdateDelayMillis(long j10);

                @NonNull
                public native /* synthetic */ Builder setMaxUpdates(int i10);

                @NonNull
                public native /* synthetic */ Builder setMinUpdateDistanceMeters(float f10);

                @NonNull
                public native /* synthetic */ Builder setMinUpdateIntervalMillis(long j10);

                @NonNull
                public native /* synthetic */ Builder setQuality(int i10);
            }.setQuality(b1Var.g()).setMinUpdateIntervalMillis(b1Var.f()).setDurationMillis(b1Var.a()).setMaxUpdates(b1Var.d()).setMinUpdateDistanceMeters(b1Var.e()).setMaxUpdateDelayMillis(b1Var.c()).build();
        }
    }

    /* JADX INFO: compiled from: LocationRequestCompat.java */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f20832a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f20833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f20834c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f20835d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f20836e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f20837f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f20838g;

        public c(long j10) {
            d(j10);
            this.f20833b = 102;
            this.f20834c = Long.MAX_VALUE;
            this.f20835d = Integer.MAX_VALUE;
            this.f20836e = -1L;
            this.f20837f = 0.0f;
            this.f20838g = 0L;
        }

        public c(@androidx.annotation.n0 b1 b1Var) {
            this.f20832a = b1Var.f20820b;
            this.f20833b = b1Var.f20819a;
            this.f20834c = b1Var.f20822d;
            this.f20835d = b1Var.f20823e;
            this.f20836e = b1Var.f20821c;
            this.f20837f = b1Var.f20824f;
            this.f20838g = b1Var.f20825g;
        }

        @androidx.annotation.n0
        public b1 a() {
            androidx.core.util.o.o((this.f20832a == Long.MAX_VALUE && this.f20836e == -1) ? false : true, "passive location requests must have an explicit minimum update interval");
            long j10 = this.f20832a;
            return new b1(j10, this.f20833b, this.f20834c, this.f20835d, Math.min(this.f20836e, j10), this.f20837f, this.f20838g);
        }

        @androidx.annotation.n0
        public c b() {
            this.f20836e = -1L;
            return this;
        }

        @androidx.annotation.n0
        public c c(@androidx.annotation.f0(from = 1) long j10) {
            this.f20834c = androidx.core.util.o.h(j10, 1L, Long.MAX_VALUE, "durationMillis");
            return this;
        }

        @androidx.annotation.n0
        public c d(@androidx.annotation.f0(from = 0) long j10) {
            this.f20832a = androidx.core.util.o.h(j10, 0L, Long.MAX_VALUE, "intervalMillis");
            return this;
        }

        @androidx.annotation.n0
        public c e(@androidx.annotation.f0(from = 0) long j10) {
            this.f20838g = j10;
            this.f20838g = androidx.core.util.o.h(j10, 0L, Long.MAX_VALUE, "maxUpdateDelayMillis");
            return this;
        }

        @androidx.annotation.n0
        public c f(@androidx.annotation.f0(from = 1, to = 2147483647L) int i10) {
            this.f20835d = androidx.core.util.o.g(i10, 1, Integer.MAX_VALUE, "maxUpdates");
            return this;
        }

        @androidx.annotation.n0
        public c g(@androidx.annotation.x(from = 0.0d, to = 3.4028234663852886E38d) float f10) {
            this.f20837f = f10;
            this.f20837f = androidx.core.util.o.f(f10, 0.0f, Float.MAX_VALUE, "minUpdateDistanceMeters");
            return this;
        }

        @androidx.annotation.n0
        public c h(@androidx.annotation.f0(from = 0) long j10) {
            this.f20836e = androidx.core.util.o.h(j10, 0L, Long.MAX_VALUE, "minUpdateIntervalMillis");
            return this;
        }

        @androidx.annotation.n0
        public c i(int i10) {
            androidx.core.util.o.c(i10 == 104 || i10 == 102 || i10 == 100, "quality must be a defined QUALITY constant, not %d", Integer.valueOf(i10));
            this.f20833b = i10;
            return this;
        }
    }

    /* JADX INFO: compiled from: LocationRequestCompat.java */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public @interface d {
    }

    b1(long j10, int i10, long j11, int i11, long j12, float f10, long j13) {
        this.f20820b = j10;
        this.f20819a = i10;
        this.f20821c = j12;
        this.f20822d = j11;
        this.f20823e = i11;
        this.f20824f = f10;
        this.f20825g = j13;
    }

    @androidx.annotation.f0(from = 1)
    public long a() {
        return this.f20822d;
    }

    @androidx.annotation.f0(from = 0)
    public long b() {
        return this.f20820b;
    }

    @androidx.annotation.f0(from = 0)
    public long c() {
        return this.f20825g;
    }

    @androidx.annotation.f0(from = 1, to = 2147483647L)
    public int d() {
        return this.f20823e;
    }

    @androidx.annotation.x(from = 0.0d, to = 3.4028234663852886E38d)
    public float e() {
        return this.f20824f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b1)) {
            return false;
        }
        b1 b1Var = (b1) obj;
        return this.f20819a == b1Var.f20819a && this.f20820b == b1Var.f20820b && this.f20821c == b1Var.f20821c && this.f20822d == b1Var.f20822d && this.f20823e == b1Var.f20823e && Float.compare(b1Var.f20824f, this.f20824f) == 0 && this.f20825g == b1Var.f20825g;
    }

    @androidx.annotation.f0(from = 0)
    public long f() {
        long j10 = this.f20821c;
        return j10 == -1 ? this.f20820b : j10;
    }

    public int g() {
        return this.f20819a;
    }

    @androidx.annotation.n0
    @androidx.annotation.w0(31)
    public LocationRequest h() {
        return b.a(this);
    }

    public int hashCode() {
        int i10 = this.f20819a * 31;
        long j10 = this.f20820b;
        int i11 = (i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31;
        long j11 = this.f20821c;
        return i11 + ((int) (j11 ^ (j11 >>> 32)));
    }

    @androidx.annotation.w0(19)
    @SuppressLint({"NewApi"})
    @androidx.annotation.p0
    public LocationRequest i(@androidx.annotation.n0 String str) {
        return Build.VERSION.SDK_INT >= 31 ? h() : (LocationRequest) a.a(this, str);
    }

    @androidx.annotation.n0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request[");
        if (this.f20820b != Long.MAX_VALUE) {
            sb2.append("@");
            androidx.core.util.g0.e(this.f20820b, sb2);
            int i10 = this.f20819a;
            if (i10 == 100) {
                sb2.append(" HIGH_ACCURACY");
            } else if (i10 == 102) {
                sb2.append(" BALANCED");
            } else if (i10 == 104) {
                sb2.append(" LOW_POWER");
            }
        } else {
            sb2.append("PASSIVE");
        }
        if (this.f20822d != Long.MAX_VALUE) {
            sb2.append(", duration=");
            androidx.core.util.g0.e(this.f20822d, sb2);
        }
        if (this.f20823e != Integer.MAX_VALUE) {
            sb2.append(", maxUpdates=");
            sb2.append(this.f20823e);
        }
        long j10 = this.f20821c;
        if (j10 != -1 && j10 < this.f20820b) {
            sb2.append(", minUpdateInterval=");
            androidx.core.util.g0.e(this.f20821c, sb2);
        }
        if (this.f20824f > 0.0d) {
            sb2.append(", minUpdateDistance=");
            sb2.append(this.f20824f);
        }
        if (this.f20825g / 2 > this.f20820b) {
            sb2.append(", maxUpdateDelay=");
            androidx.core.util.g0.e(this.f20825g, sb2);
        }
        sb2.append(']');
        return sb2.toString();
    }
}
