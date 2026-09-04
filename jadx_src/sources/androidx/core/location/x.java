package androidx.core.location;

import android.annotation.SuppressLint;
import android.location.GnssMeasurementsEvent$Callback;
import android.location.GnssStatus;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.location.LocationRequest;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.collection.j2;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.function.Consumer;

/* JADX INFO: compiled from: LocationManagerCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f20896a = 30000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f20897b = 10000;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f20898c = 5;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static Field f20899d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static Class<?> f20900e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static Method f20901f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static Method f20902g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.b0("sLocationListeners")
    static final WeakHashMap<k, WeakReference<l>> f20903h = new WeakHashMap<>();

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @androidx.annotation.w0(19)
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Class<?> f20904a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f20905b;

        private a() {
        }

        @androidx.annotation.u
        static boolean a(LocationManager locationManager, String str, b1 b1Var, t tVar, Looper looper) {
            try {
                if (f20904a == null) {
                    f20904a = Class.forName("android.location.LocationRequest");
                }
                if (f20905b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f20904a, LocationListener.class, Looper.class);
                    f20905b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequestI = b1Var.i(str);
                if (locationRequestI != null) {
                    f20905b.invoke(locationManager, locationRequestI, tVar, looper);
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }

        @androidx.annotation.u
        @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static boolean b(LocationManager locationManager, String str, b1 b1Var, l lVar) {
            try {
                if (f20904a == null) {
                    f20904a = Class.forName("android.location.LocationRequest");
                }
                if (f20905b == null) {
                    Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f20904a, LocationListener.class, Looper.class);
                    f20905b = declaredMethod;
                    declaredMethod.setAccessible(true);
                }
                LocationRequest locationRequestI = b1Var.i(str);
                if (locationRequestI != null) {
                    synchronized (x.f20903h) {
                        f20905b.invoke(locationManager, locationRequestI, lVar, Looper.getMainLooper());
                        x.p(locationManager, lVar);
                    }
                    return true;
                }
            } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @androidx.annotation.w0(24)
    public static class b {
        private b() {
        }

        @androidx.annotation.u
        @androidx.annotation.z0("android.permission.ACCESS_FINE_LOCATION")
        static boolean a(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback, @androidx.annotation.n0 Handler handler) {
            return locationManager.registerGnssMeasurementsCallback(gnssMeasurementsEvent$Callback, handler);
        }

        @androidx.annotation.u
        @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static boolean b(LocationManager locationManager, Handler handler, Executor executor, androidx.core.location.a.AbstractC0133a abstractC0133a) {
            androidx.core.util.o.a(handler != null);
            j2<Object, Object> j2Var = g.f20914a;
            synchronized (j2Var) {
                m mVar = (m) j2Var.get(abstractC0133a);
                if (mVar == null) {
                    mVar = new m(abstractC0133a);
                } else {
                    mVar.j();
                }
                mVar.i(executor);
                if (!locationManager.registerGnssStatusCallback(mVar, handler)) {
                    return false;
                }
                j2Var.put(abstractC0133a, mVar);
                return true;
            }
        }

        @androidx.annotation.u
        static void c(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
            locationManager.unregisterGnssMeasurementsCallback(gnssMeasurementsEvent$Callback);
        }

        @androidx.annotation.u
        static void d(LocationManager locationManager, Object obj) {
            if (obj instanceof m) {
                ((m) obj).j();
            }
            locationManager.unregisterGnssStatusCallback((GnssStatus.Callback) obj);
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @androidx.annotation.w0(28)
    public static class c {
        private c() {
        }

        @androidx.annotation.u
        static String a(LocationManager locationManager) {
            return locationManager.getGnssHardwareModelName();
        }

        @androidx.annotation.u
        static int b(LocationManager locationManager) {
            return locationManager.getGnssYearOfHardware();
        }

        @androidx.annotation.u
        static boolean c(LocationManager locationManager) {
            return locationManager.isLocationEnabled();
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @androidx.annotation.w0(30)
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Class<?> f20906a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f20907b;

        private d() {
        }

        @androidx.annotation.u
        @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static void a(LocationManager locationManager, @androidx.annotation.n0 String str, @androidx.annotation.p0 androidx.core.os.f fVar, @androidx.annotation.n0 Executor executor, @androidx.annotation.n0 final androidx.core.util.d<Location> dVar) {
            CancellationSignal cancellationSignal = fVar != null ? (CancellationSignal) fVar.b() : null;
            Objects.requireNonNull(dVar);
            locationManager.getCurrentLocation(str, cancellationSignal, executor, new Consumer() { // from class: androidx.core.location.h0
                @Override // java.util.function.Consumer
                public final void accept(Object obj) {
                    dVar.accept((Location) obj);
                }
            });
        }

        @androidx.annotation.u
        @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public static boolean b(LocationManager locationManager, Handler handler, Executor executor, androidx.core.location.a.AbstractC0133a abstractC0133a) {
            j2<Object, Object> j2Var = g.f20914a;
            synchronized (j2Var) {
                h hVar = (h) j2Var.get(abstractC0133a);
                if (hVar == null) {
                    hVar = new h(abstractC0133a);
                }
                if (!locationManager.registerGnssStatusCallback(executor, hVar)) {
                    return false;
                }
                j2Var.put(abstractC0133a, hVar);
                return true;
            }
        }

        @androidx.annotation.u
        public static boolean c(LocationManager locationManager, String str, b1 b1Var, Executor executor, t tVar) {
            if (Build.VERSION.SDK_INT >= 30) {
                try {
                    if (f20906a == null) {
                        f20906a = Class.forName("android.location.LocationRequest");
                    }
                    if (f20907b == null) {
                        Method declaredMethod = LocationManager.class.getDeclaredMethod("requestLocationUpdates", f20906a, Executor.class, LocationListener.class);
                        f20907b = declaredMethod;
                        declaredMethod.setAccessible(true);
                    }
                    LocationRequest locationRequestI = b1Var.i(str);
                    if (locationRequestI != null) {
                        f20907b.invoke(locationManager, locationRequestI, executor, tVar);
                        return true;
                    }
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | UnsupportedOperationException | InvocationTargetException unused) {
                }
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @androidx.annotation.w0(31)
    public static class e {
        private e() {
        }

        @androidx.annotation.u
        static boolean a(LocationManager locationManager, @androidx.annotation.n0 String str) {
            return locationManager.hasProvider(str);
        }

        @androidx.annotation.u
        @androidx.annotation.z0("android.permission.ACCESS_FINE_LOCATION")
        static boolean b(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 Executor executor, @androidx.annotation.n0 GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
            return locationManager.registerGnssMeasurementsCallback(executor, gnssMeasurementsEvent$Callback);
        }

        @androidx.annotation.u
        @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        static void c(LocationManager locationManager, @androidx.annotation.n0 String str, @androidx.annotation.n0 LocationRequest locationRequest, @androidx.annotation.n0 Executor executor, @androidx.annotation.n0 LocationListener locationListener) {
            locationManager.requestLocationUpdates(str, locationRequest, executor, locationListener);
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    public static final class f implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LocationManager f20908a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Executor f20909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Handler f20910c = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private androidx.core.util.d<Location> f20911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.b0("this")
        private boolean f20912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        Runnable f20913f;

        f(LocationManager locationManager, Executor executor, androidx.core.util.d<Location> dVar) {
            this.f20908a = locationManager;
            this.f20909b = executor;
            this.f20911d = dVar;
        }

        @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        private void d() {
            this.f20911d = null;
            this.f20908a.removeUpdates(this);
            Runnable runnable = this.f20913f;
            if (runnable != null) {
                this.f20910c.removeCallbacks(runnable);
                this.f20913f = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f() {
            this.f20913f = null;
            onLocationChanged((Location) null);
        }

        @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void c() {
            synchronized (this) {
                if (this.f20912e) {
                    return;
                }
                this.f20912e = true;
                d();
            }
        }

        @SuppressLint({"MissingPermission"})
        public void g(long j10) {
            synchronized (this) {
                if (this.f20912e) {
                    return;
                }
                Runnable runnable = new Runnable() { // from class: androidx.core.location.l0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20864b.f();
                    }
                };
                this.f20913f = runnable;
                this.f20910c.postDelayed(runnable, j10);
            }
        }

        @Override // android.location.LocationListener
        @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@androidx.annotation.p0 final Location location) {
            synchronized (this) {
                if (this.f20912e) {
                    return;
                }
                this.f20912e = true;
                final androidx.core.util.d<Location> dVar = this.f20911d;
                this.f20909b.execute(new Runnable() { // from class: androidx.core.location.m0
                    @Override // java.lang.Runnable
                    public final void run() {
                        dVar.accept(location);
                    }
                });
                d();
            }
        }

        @Override // android.location.LocationListener
        @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@androidx.annotation.n0 String str) {
            onLocationChanged((Location) null);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@androidx.annotation.n0 String str) {
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i10, Bundle bundle) {
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.b0("sGnssStatusListeners")
        static final j2<Object, Object> f20914a = new j2<>();

        private g() {
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @androidx.annotation.w0(30)
    public static class h extends GnssStatus.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.core.location.a.AbstractC0133a f20915a;

        h(androidx.core.location.a.AbstractC0133a abstractC0133a) {
            androidx.core.util.o.b(abstractC0133a != null, "invalid null callback");
            this.f20915a = abstractC0133a;
        }

        public void onFirstFix(int i10) {
            this.f20915a.a(i10);
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(GnssStatus gnssStatus) {
            this.f20915a.b(androidx.core.location.a.n(gnssStatus));
        }

        public void onStarted() {
            this.f20915a.c();
        }

        public void onStopped() {
            this.f20915a.d();
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    public static class i implements GpsStatus.Listener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LocationManager f20916a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final androidx.core.location.a.AbstractC0133a f20917b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        volatile Executor f20918c;

        i(LocationManager locationManager, androidx.core.location.a.AbstractC0133a abstractC0133a) {
            androidx.core.util.o.b(abstractC0133a != null, "invalid null callback");
            this.f20916a = locationManager;
            this.f20917b = abstractC0133a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Executor executor) {
            if (this.f20918c != executor) {
                return;
            }
            this.f20917b.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Executor executor) {
            if (this.f20918c != executor) {
                return;
            }
            this.f20917b.d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Executor executor, int i10) {
            if (this.f20918c != executor) {
                return;
            }
            this.f20917b.a(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Executor executor, androidx.core.location.a aVar) {
            if (this.f20918c != executor) {
                return;
            }
            this.f20917b.b(aVar);
        }

        public void i(Executor executor) {
            androidx.core.util.o.n(this.f20918c == null);
            this.f20918c = executor;
        }

        public void j() {
            this.f20918c = null;
        }

        @Override // android.location.GpsStatus.Listener
        @androidx.annotation.z0("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int i10) {
            GpsStatus gpsStatus;
            final Executor executor = this.f20918c;
            if (executor == null) {
                return;
            }
            if (i10 == 1) {
                executor.execute(new Runnable() { // from class: androidx.core.location.n0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20867b.e(executor);
                    }
                });
                return;
            }
            if (i10 == 2) {
                executor.execute(new Runnable() { // from class: androidx.core.location.o0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20869b.f(executor);
                    }
                });
                return;
            }
            if (i10 != 3) {
                if (i10 == 4 && (gpsStatus = this.f20916a.getGpsStatus(null)) != null) {
                    final androidx.core.location.a aVarO = androidx.core.location.a.o(gpsStatus);
                    executor.execute(new Runnable() { // from class: androidx.core.location.q0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f20874b.h(executor, aVarO);
                        }
                    });
                    return;
                }
                return;
            }
            GpsStatus gpsStatus2 = this.f20916a.getGpsStatus(null);
            if (gpsStatus2 != null) {
                final int timeToFirstFix = gpsStatus2.getTimeToFirstFix();
                executor.execute(new Runnable() { // from class: androidx.core.location.p0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20871b.g(executor, timeToFirstFix);
                    }
                });
            }
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    public static final class j implements Executor {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Handler f20919b;

        j(@androidx.annotation.n0 Handler handler) {
            this.f20919b = (Handler) androidx.core.util.o.l(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.n0 Runnable runnable) {
            if (Looper.myLooper() == this.f20919b.getLooper()) {
                runnable.run();
            } else {
                if (this.f20919b.post((Runnable) androidx.core.util.o.l(runnable))) {
                    return;
                }
                throw new RejectedExecutionException(this.f20919b + " is shutting down");
            }
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final String f20920a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final t f20921b;

        k(String str, t tVar) {
            this.f20920a = (String) androidx.core.util.j.e(str, "invalid null provider");
            this.f20921b = (t) androidx.core.util.j.e(tVar, "invalid null listener");
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.f20920a.equals(kVar.f20920a) && this.f20921b.equals(kVar.f20921b);
        }

        public int hashCode() {
            return androidx.core.util.j.b(this.f20920a, this.f20921b);
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    public static class l implements LocationListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @androidx.annotation.p0
        volatile k f20922a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f20923b;

        l(@androidx.annotation.p0 k kVar, Executor executor) {
            this.f20922a = kVar;
            this.f20923b = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(int i10) {
            k kVar = this.f20922a;
            if (kVar == null) {
                return;
            }
            kVar.f20921b.onFlushComplete(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void i(Location location) {
            k kVar = this.f20922a;
            if (kVar == null) {
                return;
            }
            kVar.f20921b.onLocationChanged(location);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void j(List list) {
            k kVar = this.f20922a;
            if (kVar == null) {
                return;
            }
            kVar.f20921b.onLocationChanged((List<Location>) list);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void k(String str) {
            k kVar = this.f20922a;
            if (kVar == null) {
                return;
            }
            kVar.f20921b.onProviderDisabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void l(String str) {
            k kVar = this.f20922a;
            if (kVar == null) {
                return;
            }
            kVar.f20921b.onProviderEnabled(str);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void m(String str, int i10, Bundle bundle) {
            k kVar = this.f20922a;
            if (kVar == null) {
                return;
            }
            kVar.f20921b.onStatusChanged(str, i10, bundle);
        }

        public k g() {
            return (k) androidx.core.util.j.d(this.f20922a);
        }

        public void n() {
            this.f20922a = null;
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(final int i10) {
            if (this.f20922a == null) {
                return;
            }
            this.f20923b.execute(new Runnable() { // from class: androidx.core.location.s0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20879b.h(i10);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@androidx.annotation.n0 final Location location) {
            if (this.f20922a == null) {
                return;
            }
            this.f20923b.execute(new Runnable() { // from class: androidx.core.location.v0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20889b.i(location);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@androidx.annotation.n0 final List<Location> list) {
            if (this.f20922a == null) {
                return;
            }
            this.f20923b.execute(new Runnable() { // from class: androidx.core.location.t0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20881b.j(list);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@androidx.annotation.n0 final String str) {
            if (this.f20922a == null) {
                return;
            }
            this.f20923b.execute(new Runnable() { // from class: androidx.core.location.u0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20885b.k(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@androidx.annotation.n0 final String str) {
            if (this.f20922a == null) {
                return;
            }
            this.f20923b.execute(new Runnable() { // from class: androidx.core.location.r0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20877b.l(str);
                }
            });
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(final String str, final int i10, final Bundle bundle) {
            if (this.f20922a == null) {
                return;
            }
            this.f20923b.execute(new Runnable() { // from class: androidx.core.location.w0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20892b.m(str, i10, bundle);
                }
            });
        }
    }

    /* JADX INFO: compiled from: LocationManagerCompat.java */
    @androidx.annotation.w0(24)
    public static class m extends GnssStatus.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.core.location.a.AbstractC0133a f20924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @androidx.annotation.p0
        volatile Executor f20925b;

        m(androidx.core.location.a.AbstractC0133a abstractC0133a) {
            androidx.core.util.o.b(abstractC0133a != null, "invalid null callback");
            this.f20924a = abstractC0133a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(Executor executor, int i10) {
            if (this.f20925b != executor) {
                return;
            }
            this.f20924a.a(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void f(Executor executor, GnssStatus gnssStatus) {
            if (this.f20925b != executor) {
                return;
            }
            this.f20924a.b(androidx.core.location.a.n(gnssStatus));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void g(Executor executor) {
            if (this.f20925b != executor) {
                return;
            }
            this.f20924a.c();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void h(Executor executor) {
            if (this.f20925b != executor) {
                return;
            }
            this.f20924a.d();
        }

        public void i(Executor executor) {
            androidx.core.util.o.b(executor != null, "invalid null executor");
            androidx.core.util.o.n(this.f20925b == null);
            this.f20925b = executor;
        }

        public void j() {
            this.f20925b = null;
        }

        public void onFirstFix(final int i10) {
            final Executor executor = this.f20925b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.z0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20931b.e(executor, i10);
                }
            });
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(final GnssStatus gnssStatus) {
            final Executor executor = this.f20925b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.y0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20928b.f(executor, gnssStatus);
                }
            });
        }

        public void onStarted() {
            final Executor executor = this.f20925b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.x0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20926b.g(executor);
                }
            });
        }

        public void onStopped() {
            final Executor executor = this.f20925b;
            if (executor == null) {
                return;
            }
            executor.execute(new Runnable() { // from class: androidx.core.location.a1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20812b.h(executor);
                }
            });
        }
    }

    private x() {
    }

    @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void c(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 String str, @androidx.annotation.p0 androidx.core.os.f fVar, @androidx.annotation.n0 Executor executor, @androidx.annotation.n0 final androidx.core.util.d<Location> dVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            d.a(locationManager, str, fVar, executor, dVar);
            return;
        }
        if (fVar != null) {
            fVar.e();
        }
        final Location lastKnownLocation = locationManager.getLastKnownLocation(str);
        if (lastKnownLocation != null && SystemClock.elapsedRealtime() - androidx.core.location.h.c(lastKnownLocation) < 10000) {
            executor.execute(new Runnable() { // from class: androidx.core.location.v
                @Override // java.lang.Runnable
                public final void run() {
                    dVar.accept(lastKnownLocation);
                }
            });
            return;
        }
        final f fVar2 = new f(locationManager, executor, dVar);
        locationManager.requestLocationUpdates(str, 0L, 0.0f, fVar2, Looper.getMainLooper());
        if (fVar != null) {
            fVar.d(new androidx.core.os.f.b() { // from class: androidx.core.location.w
                @Override // androidx.core.os.f.b
                public final void onCancel() {
                    fVar2.c();
                }
            });
        }
        fVar2.g(30000L);
    }

    @androidx.annotation.p0
    public static String d(@androidx.annotation.n0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.a(locationManager);
        }
        return null;
    }

    public static int e(@androidx.annotation.n0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.b(locationManager);
        }
        return 0;
    }

    public static boolean f(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 String str) {
        if (Build.VERSION.SDK_INT >= 31) {
            return e.a(locationManager, str);
        }
        if (locationManager.getAllProviders().contains(str)) {
            return true;
        }
        try {
            return locationManager.getProvider(str) != null;
        } catch (SecurityException unused) {
            return false;
        }
    }

    public static boolean g(@androidx.annotation.n0 LocationManager locationManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            return c.c(locationManager);
        }
        return locationManager.isProviderEnabled(ad.c.f1243w) || locationManager.isProviderEnabled("gps");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Boolean i(LocationManager locationManager, i iVar) throws Exception {
        return Boolean.valueOf(locationManager.addGpsStatusListener(iVar));
    }

    @androidx.annotation.z0("android.permission.ACCESS_FINE_LOCATION")
    @androidx.annotation.w0(24)
    public static boolean j(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback, @androidx.annotation.n0 Handler handler) {
        return Build.VERSION.SDK_INT != 30 ? b.a(locationManager, gnssMeasurementsEvent$Callback, handler) : l(locationManager, androidx.core.os.i.a(handler), gnssMeasurementsEvent$Callback);
    }

    @androidx.annotation.z0("android.permission.ACCESS_FINE_LOCATION")
    @androidx.annotation.w0(30)
    public static boolean k(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 Executor executor, @androidx.annotation.n0 GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
        return Build.VERSION.SDK_INT > 30 ? e.b(locationManager, executor, gnssMeasurementsEvent$Callback) : l(locationManager, executor, gnssMeasurementsEvent$Callback);
    }

    @androidx.annotation.w0(30)
    private static boolean l(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 Executor executor, @androidx.annotation.n0 GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
        if (Build.VERSION.SDK_INT != 30) {
            throw new IllegalStateException();
        }
        try {
            if (f20900e == null) {
                f20900e = Class.forName("android.location.GnssRequest$Builder");
            }
            if (f20901f == null) {
                Method declaredMethod = f20900e.getDeclaredMethod("build", new Class[0]);
                f20901f = declaredMethod;
                declaredMethod.setAccessible(true);
            }
            if (f20902g == null) {
                Method declaredMethod2 = LocationManager.class.getDeclaredMethod("registerGnssMeasurementsCallback", Class.forName("android.location.GnssRequest"), Executor.class, GnssMeasurementsEvent$Callback.class);
                f20902g = declaredMethod2;
                declaredMethod2.setAccessible(true);
            }
            Object objInvoke = f20902g.invoke(locationManager, f20901f.invoke(f20900e.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]), new Object[0]), executor, gnssMeasurementsEvent$Callback);
            return objInvoke != null && ((Boolean) objInvoke).booleanValue();
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:60:0x00c5 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:54:0x00a4, B:55:0x00ba, B:58:0x00bd, B:60:0x00c5, B:62:0x00cd, B:63:0x00d3, B:64:0x00d4, B:65:0x00d9, B:66:0x00da, B:67:0x00e0, B:44:0x0093), top: B:77:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x00cd A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:54:0x00a4, B:55:0x00ba, B:58:0x00bd, B:60:0x00c5, B:62:0x00cd, B:63:0x00d3, B:64:0x00d4, B:65:0x00d9, B:66:0x00da, B:67:0x00e0, B:44:0x0093), top: B:77:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x00d4 A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:54:0x00a4, B:55:0x00ba, B:58:0x00bd, B:60:0x00c5, B:62:0x00cd, B:63:0x00d3, B:64:0x00d4, B:65:0x00d9, B:66:0x00da, B:67:0x00e0, B:44:0x0093), top: B:77:0x0053 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x00da A[Catch: all -> 0x00e1, TryCatch #0 {all -> 0x00e1, blocks: (B:54:0x00a4, B:55:0x00ba, B:58:0x00bd, B:60:0x00c5, B:62:0x00cd, B:63:0x00d3, B:64:0x00d4, B:65:0x00d9, B:66:0x00da, B:67:0x00e0, B:44:0x0093), top: B:77:0x0053 }] */
    @androidx.annotation.z0("android.permission.ACCESS_FINE_LOCATION")
    private static boolean m(final LocationManager locationManager, Handler handler, Executor executor, androidx.core.location.a.AbstractC0133a abstractC0133a) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 30) {
            return d.b(locationManager, handler, executor, abstractC0133a);
        }
        if (i10 >= 24) {
            return b.b(locationManager, handler, executor, abstractC0133a);
        }
        boolean z10 = true;
        androidx.core.util.o.a(handler != null);
        j2<Object, Object> j2Var = g.f20914a;
        synchronized (j2Var) {
            final i iVar = (i) j2Var.get(abstractC0133a);
            if (iVar == null) {
                iVar = new i(locationManager, abstractC0133a);
            } else {
                iVar.j();
            }
            iVar.i(executor);
            FutureTask futureTask = new FutureTask(new Callable() { // from class: androidx.core.location.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return x.i(locationManager, iVar);
                }
            });
            if (Looper.myLooper() == handler.getLooper()) {
                futureTask.run();
            } else if (!handler.post(futureTask)) {
                throw new IllegalStateException(handler + " is shutting down");
            }
            try {
                try {
                    long nanos = TimeUnit.SECONDS.toNanos(5L);
                    long jNanoTime = System.nanoTime() + nanos;
                    boolean z11 = false;
                    while (((Boolean) futureTask.get(nanos, TimeUnit.NANOSECONDS)).booleanValue()) {
                        try {
                            try {
                                g.f20914a.put(abstractC0133a, iVar);
                                if (z11) {
                                    Thread.currentThread().interrupt();
                                }
                                return true;
                            } catch (ExecutionException e10) {
                                e = e10;
                                if (!(e.getCause() instanceof RuntimeException)) {
                                    throw ((RuntimeException) e.getCause());
                                }
                                if (e.getCause() instanceof Error) {
                                    throw ((Error) e.getCause());
                                }
                                throw new IllegalStateException(e);
                            } catch (TimeoutException e11) {
                                e = e11;
                                throw new IllegalStateException(handler + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", e);
                            }
                        } catch (InterruptedException unused) {
                            nanos = jNanoTime - System.nanoTime();
                            z11 = true;
                        } catch (ExecutionException e12) {
                            e = e12;
                            if (!(e.getCause() instanceof RuntimeException)) {
                                throw ((RuntimeException) e.getCause());
                            }
                            if (e.getCause() instanceof Error) {
                                throw ((Error) e.getCause());
                            }
                            throw new IllegalStateException(e);
                        } catch (TimeoutException e13) {
                            e = e13;
                            throw new IllegalStateException(handler + " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread", e);
                        } catch (Throwable th2) {
                            th = th2;
                            z10 = z11;
                            if (z10) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    }
                    if (z11) {
                        Thread.currentThread().interrupt();
                    }
                    return false;
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (ExecutionException e14) {
                e = e14;
            } catch (TimeoutException e15) {
                e = e15;
            } catch (Throwable th4) {
                th = th4;
                z10 = false;
            }
        }
    }

    @androidx.annotation.z0("android.permission.ACCESS_FINE_LOCATION")
    public static boolean n(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 androidx.core.location.a.AbstractC0133a abstractC0133a, @androidx.annotation.n0 Handler handler) {
        return Build.VERSION.SDK_INT >= 30 ? o(locationManager, androidx.core.os.i.a(handler), abstractC0133a) : o(locationManager, new j(handler), abstractC0133a);
    }

    @androidx.annotation.z0("android.permission.ACCESS_FINE_LOCATION")
    public static boolean o(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 Executor executor, @androidx.annotation.n0 androidx.core.location.a.AbstractC0133a abstractC0133a) {
        if (Build.VERSION.SDK_INT >= 30) {
            return m(locationManager, null, executor, abstractC0133a);
        }
        Looper looperMyLooper = Looper.myLooper();
        if (looperMyLooper == null) {
            looperMyLooper = Looper.getMainLooper();
        }
        return m(locationManager, new Handler(looperMyLooper), executor, abstractC0133a);
    }

    @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.b0("sLocationListeners")
    static void p(LocationManager locationManager, l lVar) {
        WeakReference<l> weakReferencePut = f20903h.put(lVar.g(), new WeakReference<>(lVar));
        l lVar2 = weakReferencePut != null ? weakReferencePut.get() : null;
        if (lVar2 != null) {
            lVar2.n();
            locationManager.removeUpdates(lVar2);
        }
    }

    @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void q(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 t tVar) {
        WeakHashMap<k, WeakReference<l>> weakHashMap = f20903h;
        synchronized (weakHashMap) {
            ArrayList arrayList = null;
            Iterator<WeakReference<l>> it = weakHashMap.values().iterator();
            while (it.hasNext()) {
                l lVar = it.next().get();
                if (lVar != null) {
                    k kVarG = lVar.g();
                    if (kVarG.f20921b == tVar) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(kVarG);
                        lVar.n();
                        locationManager.removeUpdates(lVar);
                    }
                }
            }
            if (arrayList != null) {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    f20903h.remove((k) it2.next());
                }
            }
        }
        locationManager.removeUpdates(tVar);
    }

    @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void r(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 String str, @androidx.annotation.n0 b1 b1Var, @androidx.annotation.n0 t tVar, @androidx.annotation.n0 Looper looper) {
        if (Build.VERSION.SDK_INT >= 31) {
            e.c(locationManager, str, b1Var.h(), androidx.core.os.i.a(new Handler(looper)), tVar);
        } else {
            if (a.a(locationManager, str, b1Var, tVar, looper)) {
                return;
            }
            locationManager.requestLocationUpdates(str, b1Var.b(), b1Var.e(), tVar, looper);
        }
    }

    @androidx.annotation.z0(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void s(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 String str, @androidx.annotation.n0 b1 b1Var, @androidx.annotation.n0 Executor executor, @androidx.annotation.n0 t tVar) {
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            e.c(locationManager, str, b1Var.h(), executor, tVar);
            return;
        }
        if (i10 < 30 || !d.c(locationManager, str, b1Var, executor, tVar)) {
            l lVar = new l(new k(str, tVar), executor);
            if (a.b(locationManager, str, b1Var, lVar)) {
                return;
            }
            synchronized (f20903h) {
                locationManager.requestLocationUpdates(str, b1Var.b(), b1Var.e(), lVar, Looper.getMainLooper());
                p(locationManager, lVar);
            }
        }
    }

    @androidx.annotation.w0(24)
    public static void t(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 GnssMeasurementsEvent$Callback gnssMeasurementsEvent$Callback) {
        b.c(locationManager, gnssMeasurementsEvent$Callback);
    }

    public static void u(@androidx.annotation.n0 LocationManager locationManager, @androidx.annotation.n0 androidx.core.location.a.AbstractC0133a abstractC0133a) {
        if (Build.VERSION.SDK_INT >= 24) {
            j2<Object, Object> j2Var = g.f20914a;
            synchronized (j2Var) {
                Object objRemove = j2Var.remove(abstractC0133a);
                if (objRemove != null) {
                    b.d(locationManager, objRemove);
                }
            }
            return;
        }
        j2<Object, Object> j2Var2 = g.f20914a;
        synchronized (j2Var2) {
            i iVar = (i) j2Var2.remove(abstractC0133a);
            if (iVar != null) {
                iVar.j();
                locationManager.removeGpsStatusListener(iVar);
            }
        }
    }
}
