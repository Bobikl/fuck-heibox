package androidx.work.impl.foreground;

import android.app.ForegroundServiceStartNotAllowedException;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.annotation.RestrictTo;
import androidx.annotation.k0;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import androidx.annotation.z0;
import androidx.lifecycle.LifecycleService;
import androidx.work.n;

/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class SystemForegroundService extends LifecycleService implements androidx.work.impl.foreground.b.InterfaceC0232b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f28969g = n.i("SystemFgService");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private static SystemForegroundService f28970h = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Handler f28971c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f28972d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.work.impl.foreground.b f28973e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    NotificationManager f28974f;

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28975b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Notification f28976c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f28977d;

        a(int i10, Notification notification, int i11) {
            this.f28975b = i10;
            this.f28976c = notification;
            this.f28977d = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = Build.VERSION.SDK_INT;
            if (i10 >= 31) {
                e.a(SystemForegroundService.this, this.f28975b, this.f28976c, this.f28977d);
            } else if (i10 >= 29) {
                d.a(SystemForegroundService.this, this.f28975b, this.f28976c, this.f28977d);
            } else {
                SystemForegroundService.this.startForeground(this.f28975b, this.f28976c);
            }
        }
    }

    public class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28979b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Notification f28980c;

        b(int i10, Notification notification) {
            this.f28979b = i10;
            this.f28980c = notification;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f28974f.notify(this.f28979b, this.f28980c);
        }
    }

    public class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f28982b;

        c(int i10) {
            this.f28982b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            SystemForegroundService.this.f28974f.cancel(this.f28982b);
        }
    }

    @w0(29)
    public static class d {
        private d() {
        }

        @u
        static void a(Service service, int i10, Notification notification, int i11) {
            service.startForeground(i10, notification, i11);
        }
    }

    @w0(31)
    public static class e {
        private e() {
        }

        @u
        static void a(Service service, int i10, Notification notification, int i11) {
            try {
                service.startForeground(i10, notification, i11);
            } catch (ForegroundServiceStartNotAllowedException e10) {
                n.e().m(SystemForegroundService.f28969g, "Unable to start foreground service", e10);
            }
        }
    }

    @p0
    public static SystemForegroundService f() {
        return f28970h;
    }

    @k0
    private void g() {
        this.f28971c = new Handler(Looper.getMainLooper());
        this.f28974f = (NotificationManager) getApplicationContext().getSystemService("notification");
        androidx.work.impl.foreground.b bVar = new androidx.work.impl.foreground.b(getApplicationContext());
        this.f28973e = bVar;
        bVar.o(this);
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0232b
    @z0("android.permission.POST_NOTIFICATIONS")
    public void a(int i10, @n0 Notification notification) {
        this.f28971c.post(new b(i10, notification));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0232b
    public void c(int i10, int i11, @n0 Notification notification) {
        this.f28971c.post(new a(i10, notification, i11));
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0232b
    public void d(int i10) {
        this.f28971c.post(new c(i10));
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onCreate() {
        super.onCreate();
        f28970h = this;
        g();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        this.f28973e.m();
    }

    @Override // androidx.lifecycle.LifecycleService, android.app.Service
    public int onStartCommand(@p0 Intent intent, int i10, int i11) {
        super.onStartCommand(intent, i10, i11);
        if (this.f28972d) {
            n.e().f(f28969g, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.f28973e.m();
            g();
            this.f28972d = false;
        }
        if (intent == null) {
            return 3;
        }
        this.f28973e.n(intent);
        return 3;
    }

    @Override // androidx.work.impl.foreground.b.InterfaceC0232b
    @k0
    public void stop() {
        this.f28972d = true;
        n.e().a(f28969g, "All commands completed.");
        if (Build.VERSION.SDK_INT >= 26) {
            stopForeground(true);
        }
        f28970h = null;
        stopSelf();
    }
}
