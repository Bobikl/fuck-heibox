package androidx.core.location;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: LocationCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f20856a = "mockLocation";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f20857b = "verticalAccuracy";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f20858c = "speedAccuracy";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f20859d = "bearingAccuracy";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f20860e = "androidx.core.location.extra.MSL_ALTITUDE";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f20861f = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.p0
    private static Method f20862g;

    /* JADX INFO: compiled from: LocationCompat.java */
    @androidx.annotation.w0(17)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static long a(Location location) {
            return location.getElapsedRealtimeNanos();
        }
    }

    /* JADX INFO: compiled from: LocationCompat.java */
    @androidx.annotation.w0(18)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        static boolean a(Location location) {
            return location.isFromMockProvider();
        }
    }

    /* JADX INFO: compiled from: LocationCompat.java */
    @androidx.annotation.w0(26)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static float a(Location location) {
            return location.getBearingAccuracyDegrees();
        }

        @androidx.annotation.u
        static float b(Location location) {
            return location.getSpeedAccuracyMetersPerSecond();
        }

        @androidx.annotation.u
        static float c(Location location) {
            return location.getVerticalAccuracyMeters();
        }

        @androidx.annotation.u
        static boolean d(Location location) {
            return location.hasBearingAccuracy();
        }

        @androidx.annotation.u
        static boolean e(Location location) {
            return location.hasSpeedAccuracy();
        }

        @androidx.annotation.u
        static boolean f(Location location) {
            return location.hasVerticalAccuracy();
        }

        @androidx.annotation.u
        static void g(Location location, float f10) {
            location.setBearingAccuracyDegrees(f10);
        }

        @androidx.annotation.u
        static void h(Location location, float f10) {
            location.setSpeedAccuracyMetersPerSecond(f10);
        }

        @androidx.annotation.u
        static void i(Location location, float f10) {
            location.setVerticalAccuracyMeters(f10);
        }
    }

    private h() {
    }

    private static boolean a(@androidx.annotation.n0 Location location, String str) {
        Bundle extras = location.getExtras();
        return extras != null && extras.containsKey(str);
    }

    public static float b(@androidx.annotation.n0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.a(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(f20859d, 0.0f);
    }

    public static long c(@androidx.annotation.n0 Location location) {
        return TimeUnit.NANOSECONDS.toMillis(a.a(location));
    }

    public static long d(@androidx.annotation.n0 Location location) {
        return a.a(location);
    }

    @androidx.annotation.x(from = 0.0d)
    public static float e(@androidx.annotation.n0 Location location) {
        androidx.core.util.o.o(m(location), "The Mean Sea Level altitude accuracy of the location is not set.");
        return g(location).getFloat(f20861f);
    }

    public static double f(@androidx.annotation.n0 Location location) {
        androidx.core.util.o.o(l(location), "The Mean Sea Level altitude of the location is not set.");
        return g(location).getDouble(f20860e);
    }

    private static Bundle g(@androidx.annotation.n0 Location location) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            return extras;
        }
        location.setExtras(new Bundle());
        return location.getExtras();
    }

    private static Method h() throws NoSuchMethodException {
        if (f20862g == null) {
            Method declaredMethod = Location.class.getDeclaredMethod("setIsFromMockProvider", Boolean.TYPE);
            f20862g = declaredMethod;
            declaredMethod.setAccessible(true);
        }
        return f20862g;
    }

    public static float i(@androidx.annotation.n0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.b(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(f20858c, 0.0f);
    }

    public static float j(@androidx.annotation.n0 Location location) {
        if (Build.VERSION.SDK_INT >= 26) {
            return c.c(location);
        }
        Bundle extras = location.getExtras();
        if (extras == null) {
            return 0.0f;
        }
        return extras.getFloat(f20857b, 0.0f);
    }

    public static boolean k(@androidx.annotation.n0 Location location) {
        return Build.VERSION.SDK_INT >= 26 ? c.d(location) : a(location, f20859d);
    }

    public static boolean l(@androidx.annotation.n0 Location location) {
        return a(location, f20860e);
    }

    public static boolean m(@androidx.annotation.n0 Location location) {
        return a(location, f20861f);
    }

    public static boolean n(@androidx.annotation.n0 Location location) {
        return Build.VERSION.SDK_INT >= 26 ? c.e(location) : a(location, f20858c);
    }

    public static boolean o(@androidx.annotation.n0 Location location) {
        return Build.VERSION.SDK_INT >= 26 ? c.f(location) : a(location, f20857b);
    }

    public static boolean p(@androidx.annotation.n0 Location location) {
        return b.a(location);
    }

    private static void q(@androidx.annotation.n0 Location location, String str) {
        Bundle extras = location.getExtras();
        if (extras != null) {
            extras.remove(str);
            if (extras.isEmpty()) {
                location.setExtras(null);
            }
        }
    }

    public static void r(@androidx.annotation.n0 Location location) {
        q(location, f20860e);
    }

    public static void s(@androidx.annotation.n0 Location location) {
        q(location, f20861f);
    }

    public static void t(@androidx.annotation.n0 Location location, float f10) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.g(location, f10);
        } else {
            g(location).putFloat(f20859d, f10);
        }
    }

    public static void u(@androidx.annotation.n0 Location location, boolean z10) {
        try {
            h().invoke(location, Boolean.valueOf(z10));
        } catch (IllegalAccessException e10) {
            IllegalAccessError illegalAccessError = new IllegalAccessError();
            illegalAccessError.initCause(e10);
            throw illegalAccessError;
        } catch (NoSuchMethodException e11) {
            NoSuchMethodError noSuchMethodError = new NoSuchMethodError();
            noSuchMethodError.initCause(e11);
            throw noSuchMethodError;
        } catch (InvocationTargetException e12) {
            throw new RuntimeException(e12);
        }
    }

    public static void v(@androidx.annotation.n0 Location location, @androidx.annotation.x(from = 0.0d) float f10) {
        g(location).putFloat(f20861f, f10);
    }

    public static void w(@androidx.annotation.n0 Location location, double d10) {
        g(location).putDouble(f20860e, d10);
    }

    public static void x(@androidx.annotation.n0 Location location, float f10) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.h(location, f10);
        } else {
            g(location).putFloat(f20858c, f10);
        }
    }

    public static void y(@androidx.annotation.n0 Location location, float f10) {
        if (Build.VERSION.SDK_INT >= 26) {
            c.i(location, f10);
        } else {
            g(location).putFloat(f20857b, f10);
        }
    }
}
