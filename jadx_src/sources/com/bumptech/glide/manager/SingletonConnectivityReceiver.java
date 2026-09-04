package com.bumptech.glide.manager;

import android.annotation.SuppressLint;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.AsyncTask;
import android.os.Build;
import android.util.Log;
import androidx.annotation.b0;
import androidx.annotation.j1;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes6.dex */
public final class SingletonConnectivityReceiver {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile SingletonConnectivityReceiver f41734d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f41735e = "ConnectivityMonitor";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f41736a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b0("this")
    final Set<com.bumptech.glide.manager.b.a> f41737b = new HashSet();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @b0("this")
    private boolean f41738c;

    public static final class FrameworkConnectivityMonitorPreApi24 implements c {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final Executor f41739g = AsyncTask.SERIAL_EXECUTOR;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Context f41740a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.manager.b.a f41741b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.util.h.b<ConnectivityManager> f41742c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        volatile boolean f41743d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        volatile boolean f41744e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final BroadcastReceiver f41745f = new BroadcastReceiver() { // from class: com.bumptech.glide.manager.SingletonConnectivityReceiver.FrameworkConnectivityMonitorPreApi24.1
            @Override // android.content.BroadcastReceiver
            public void onReceive(@n0 Context context, Intent intent) {
                FrameworkConnectivityMonitorPreApi24.this.c();
            }
        };

        public class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                FrameworkConnectivityMonitorPreApi24 frameworkConnectivityMonitorPreApi24 = FrameworkConnectivityMonitorPreApi24.this;
                frameworkConnectivityMonitorPreApi24.f41743d = frameworkConnectivityMonitorPreApi24.a();
                try {
                    FrameworkConnectivityMonitorPreApi24 frameworkConnectivityMonitorPreApi25 = FrameworkConnectivityMonitorPreApi24.this;
                    frameworkConnectivityMonitorPreApi25.f41740a.registerReceiver(frameworkConnectivityMonitorPreApi25.f41745f, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                    FrameworkConnectivityMonitorPreApi24.this.f41744e = true;
                } catch (SecurityException e10) {
                    if (Log.isLoggable(SingletonConnectivityReceiver.f41735e, 5)) {
                        Log.w(SingletonConnectivityReceiver.f41735e, "Failed to register", e10);
                    }
                    FrameworkConnectivityMonitorPreApi24.this.f41744e = false;
                }
            }
        }

        public class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (FrameworkConnectivityMonitorPreApi24.this.f41744e) {
                    FrameworkConnectivityMonitorPreApi24.this.f41744e = false;
                    FrameworkConnectivityMonitorPreApi24 frameworkConnectivityMonitorPreApi24 = FrameworkConnectivityMonitorPreApi24.this;
                    frameworkConnectivityMonitorPreApi24.f41740a.unregisterReceiver(frameworkConnectivityMonitorPreApi24.f41745f);
                }
            }
        }

        public class c implements Runnable {
            c() {
            }

            @Override // java.lang.Runnable
            public void run() {
                boolean z10 = FrameworkConnectivityMonitorPreApi24.this.f41743d;
                FrameworkConnectivityMonitorPreApi24 frameworkConnectivityMonitorPreApi24 = FrameworkConnectivityMonitorPreApi24.this;
                frameworkConnectivityMonitorPreApi24.f41743d = frameworkConnectivityMonitorPreApi24.a();
                if (z10 != FrameworkConnectivityMonitorPreApi24.this.f41743d) {
                    if (Log.isLoggable(SingletonConnectivityReceiver.f41735e, 3)) {
                        Log.d(SingletonConnectivityReceiver.f41735e, "connectivity changed, isConnected: " + FrameworkConnectivityMonitorPreApi24.this.f41743d);
                    }
                    FrameworkConnectivityMonitorPreApi24 frameworkConnectivityMonitorPreApi25 = FrameworkConnectivityMonitorPreApi24.this;
                    frameworkConnectivityMonitorPreApi25.b(frameworkConnectivityMonitorPreApi25.f41743d);
                }
            }
        }

        public class d implements Runnable {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ boolean f41750b;

            d(boolean z10) {
                this.f41750b = z10;
            }

            @Override // java.lang.Runnable
            public void run() {
                FrameworkConnectivityMonitorPreApi24.this.f41741b.a(this.f41750b);
            }
        }

        FrameworkConnectivityMonitorPreApi24(Context context, com.bumptech.glide.util.h.b<ConnectivityManager> bVar, com.bumptech.glide.manager.b.a aVar) {
            this.f41740a = context.getApplicationContext();
            this.f41742c = bVar;
            this.f41741b = aVar;
        }

        @SuppressLint({"MissingPermission"})
        boolean a() {
            try {
                NetworkInfo activeNetworkInfo = this.f41742c.get().getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isConnected();
            } catch (RuntimeException e10) {
                if (Log.isLoggable(SingletonConnectivityReceiver.f41735e, 5)) {
                    Log.w(SingletonConnectivityReceiver.f41735e, "Failed to determine connectivity status when connectivity changed", e10);
                }
                return true;
            }
        }

        void b(boolean z10) {
            com.bumptech.glide.util.o.y(new d(z10));
        }

        void c() {
            f41739g.execute(new c());
        }

        @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver.c
        public boolean register() {
            f41739g.execute(new a());
            return true;
        }

        @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver.c
        public void unregister() {
            f41739g.execute(new b());
        }
    }

    public class a implements com.bumptech.glide.util.h.b<ConnectivityManager> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Context f41752a;

        a(Context context) {
            this.f41752a = context;
        }

        @Override // com.bumptech.glide.util.h.b
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public ConnectivityManager get() {
            return (ConnectivityManager) this.f41752a.getSystemService("connectivity");
        }
    }

    public class b implements com.bumptech.glide.manager.b.a {
        b() {
        }

        @Override // com.bumptech.glide.manager.b.a
        public void a(boolean z10) {
            ArrayList arrayList;
            com.bumptech.glide.util.o.b();
            synchronized (SingletonConnectivityReceiver.this) {
                arrayList = new ArrayList(SingletonConnectivityReceiver.this.f41737b);
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((com.bumptech.glide.manager.b.a) it.next()).a(z10);
            }
        }
    }

    public interface c {
        boolean register();

        void unregister();
    }

    @w0(24)
    public static final class d implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        boolean f41755a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final com.bumptech.glide.manager.b.a f41756b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final com.bumptech.glide.util.h.b<ConnectivityManager> f41757c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ConnectivityManager.NetworkCallback f41758d = new a();

        public class a extends ConnectivityManager.NetworkCallback {

            /* JADX INFO: renamed from: com.bumptech.glide.manager.SingletonConnectivityReceiver$d$a$a, reason: collision with other inner class name */
            public class RunnableC0342a implements Runnable {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ boolean f41760b;

                RunnableC0342a(boolean z10) {
                    this.f41760b = z10;
                }

                @Override // java.lang.Runnable
                public void run() {
                    a.this.a(this.f41760b);
                }
            }

            a() {
            }

            private void b(boolean z10) {
                com.bumptech.glide.util.o.y(new RunnableC0342a(z10));
            }

            void a(boolean z10) {
                com.bumptech.glide.util.o.b();
                d dVar = d.this;
                boolean z11 = dVar.f41755a;
                dVar.f41755a = z10;
                if (z11 != z10) {
                    dVar.f41756b.a(z10);
                }
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onAvailable(@n0 Network network) {
                b(true);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public void onLost(@n0 Network network) {
                b(false);
            }
        }

        d(com.bumptech.glide.util.h.b<ConnectivityManager> bVar, com.bumptech.glide.manager.b.a aVar) {
            this.f41757c = bVar;
            this.f41756b = aVar;
        }

        @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver.c
        @SuppressLint({"MissingPermission"})
        public boolean register() {
            this.f41755a = this.f41757c.get().getActiveNetwork() != null;
            try {
                this.f41757c.get().registerDefaultNetworkCallback(this.f41758d);
                return true;
            } catch (RuntimeException e10) {
                if (Log.isLoggable(SingletonConnectivityReceiver.f41735e, 5)) {
                    Log.w(SingletonConnectivityReceiver.f41735e, "Failed to register callback", e10);
                }
                return false;
            }
        }

        @Override // com.bumptech.glide.manager.SingletonConnectivityReceiver.c
        public void unregister() {
            this.f41757c.get().unregisterNetworkCallback(this.f41758d);
        }
    }

    private SingletonConnectivityReceiver(@n0 Context context) {
        com.bumptech.glide.util.h.b bVarA = com.bumptech.glide.util.h.a(new a(context));
        b bVar = new b();
        this.f41736a = Build.VERSION.SDK_INT >= 24 ? new d(bVarA, bVar) : new FrameworkConnectivityMonitorPreApi24(context, bVarA, bVar);
    }

    static SingletonConnectivityReceiver a(@n0 Context context) {
        if (f41734d == null) {
            synchronized (SingletonConnectivityReceiver.class) {
                if (f41734d == null) {
                    f41734d = new SingletonConnectivityReceiver(context.getApplicationContext());
                }
            }
        }
        return f41734d;
    }

    @b0("this")
    private void b() {
        if (this.f41738c || this.f41737b.isEmpty()) {
            return;
        }
        this.f41738c = this.f41736a.register();
    }

    @b0("this")
    private void c() {
        if (this.f41738c && this.f41737b.isEmpty()) {
            this.f41736a.unregister();
            this.f41738c = false;
        }
    }

    @j1
    static void e() {
        f41734d = null;
    }

    synchronized void d(com.bumptech.glide.manager.b.a aVar) {
        this.f41737b.add(aVar);
        b();
    }

    synchronized void f(com.bumptech.glide.manager.b.a aVar) {
        this.f41737b.remove(aVar);
        c();
    }
}
