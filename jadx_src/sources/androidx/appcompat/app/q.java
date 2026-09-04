package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.z0;
import androidx.core.content.t0;
import java.util.Calendar;

/* JADX INFO: compiled from: TwilightManager.java */
/* JADX INFO: loaded from: classes.dex */
public class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f1856d = "TwilightManager";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f1857e = 6;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f1858f = 22;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static q f1859g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f1860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final LocationManager f1861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f1862c = new a();

    /* JADX INFO: compiled from: TwilightManager.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f1863a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        long f1864b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f1865c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        long f1866d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        long f1867e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        long f1868f;

        a() {
        }
    }

    @j1
    q(@n0 Context context, @n0 LocationManager locationManager) {
        this.f1860a = context;
        this.f1861b = locationManager;
    }

    static q a(@n0 Context context) {
        if (f1859g == null) {
            Context applicationContext = context.getApplicationContext();
            f1859g = new q(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return f1859g;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationC = t0.d(this.f1860a, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c(ad.c.f1243w) : null;
        Location locationC2 = t0.d(this.f1860a, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        if (locationC2 == null || locationC == null) {
            return locationC2 != null ? locationC2 : locationC;
        }
        return locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    @z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    private Location c(String str) {
        try {
            if (this.f1861b.isProviderEnabled(str)) {
                return this.f1861b.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e10) {
            Log.d(f1856d, "Failed to get last known location", e10);
            return null;
        }
    }

    private boolean e() {
        return this.f1862c.f1868f > System.currentTimeMillis();
    }

    @j1
    static void f(q qVar) {
        f1859g = qVar;
    }

    private void g(@n0 Location location) {
        long j10;
        long j11;
        a aVar = this.f1862c;
        long jCurrentTimeMillis = System.currentTimeMillis();
        p pVarB = p.b();
        pVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j12 = pVarB.f1853a;
        pVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z10 = pVarB.f1855c == 1;
        long j13 = pVarB.f1854b;
        long j14 = pVarB.f1853a;
        pVarB.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j15 = pVarB.f1854b;
        if (j13 == -1 || j14 == -1) {
            j10 = x9.a.f141105g + jCurrentTimeMillis;
        } else {
            if (jCurrentTimeMillis > j14) {
                j11 = 0 + j15;
            } else {
                j11 = jCurrentTimeMillis > j13 ? 0 + j14 : 0 + j13;
            }
            j10 = j11 + 60000;
        }
        aVar.f1863a = z10;
        aVar.f1864b = j12;
        aVar.f1865c = j13;
        aVar.f1866d = j14;
        aVar.f1867e = j15;
        aVar.f1868f = j10;
    }

    boolean d() {
        a aVar = this.f1862c;
        if (e()) {
            return aVar.f1863a;
        }
        Location locationB = b();
        if (locationB != null) {
            g(locationB);
            return aVar.f1863a;
        }
        Log.i(f1856d, "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i10 = Calendar.getInstance().get(11);
        return i10 < 6 || i10 >= 22;
    }
}
