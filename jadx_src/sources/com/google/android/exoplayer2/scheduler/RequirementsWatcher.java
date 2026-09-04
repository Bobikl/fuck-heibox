package com.google.android.exoplayer2.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Handler;
import androidx.annotation.p0;
import androidx.annotation.w0;
import com.google.android.exoplayer2.util.u0;

/* JADX INFO: loaded from: classes7.dex */
public final class RequirementsWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f47399a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final b f47400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Requirements f47401c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f47402d = u0.A();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private DeviceStatusChangeReceiver f47403e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47404f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @p0
    private c f47405g;

    public class DeviceStatusChangeReceiver extends BroadcastReceiver {
        private DeviceStatusChangeReceiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (isInitialStickyBroadcast()) {
                return;
            }
            RequirementsWatcher.this.e();
        }
    }

    public interface b {
        void a(RequirementsWatcher requirementsWatcher, int i10);
    }

    @w0(24)
    public final class c extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f47407a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f47408b;

        private c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            if (RequirementsWatcher.this.f47405g != null) {
                RequirementsWatcher.this.e();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d() {
            if (RequirementsWatcher.this.f47405g != null) {
                RequirementsWatcher.this.g();
            }
        }

        private void e() {
            RequirementsWatcher.this.f47402d.post(new Runnable() { // from class: com.google.android.exoplayer2.scheduler.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47411b.c();
                }
            });
        }

        private void f() {
            RequirementsWatcher.this.f47402d.post(new Runnable() { // from class: com.google.android.exoplayer2.scheduler.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f47410b.d();
                }
            });
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            e();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z10) {
            if (z10) {
                return;
            }
            f();
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            boolean zHasCapability = networkCapabilities.hasCapability(16);
            if (this.f47407a && this.f47408b == zHasCapability) {
                if (zHasCapability) {
                    f();
                }
            } else {
                this.f47407a = true;
                this.f47408b = zHasCapability;
                e();
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            e();
        }
    }

    public RequirementsWatcher(Context context, b bVar, Requirements requirements) {
        this.f47399a = context.getApplicationContext();
        this.f47400b = bVar;
        this.f47401c = requirements;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        int iD = this.f47401c.d(this.f47399a);
        if (this.f47404f != iD) {
            this.f47404f = iD;
            this.f47400b.a(this, iD);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g() {
        if ((this.f47404f & 3) == 0) {
            return;
        }
        e();
    }

    @w0(24)
    private void h() {
        ConnectivityManager connectivityManager = (ConnectivityManager) com.google.android.exoplayer2.util.a.g((ConnectivityManager) this.f47399a.getSystemService("connectivity"));
        c cVar = new c();
        this.f47405g = cVar;
        connectivityManager.registerDefaultNetworkCallback(cVar);
    }

    @w0(24)
    private void k() {
        ((ConnectivityManager) com.google.android.exoplayer2.util.a.g((ConnectivityManager) this.f47399a.getSystemService("connectivity"))).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) com.google.android.exoplayer2.util.a.g(this.f47405g));
        this.f47405g = null;
    }

    public Requirements f() {
        return this.f47401c;
    }

    public int i() {
        this.f47404f = this.f47401c.d(this.f47399a);
        IntentFilter intentFilter = new IntentFilter();
        if (this.f47401c.o()) {
            if (u0.f51536a >= 24) {
                h();
            } else {
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            }
        }
        if (this.f47401c.h()) {
            intentFilter.addAction("android.intent.action.ACTION_POWER_CONNECTED");
            intentFilter.addAction("android.intent.action.ACTION_POWER_DISCONNECTED");
        }
        if (this.f47401c.l()) {
            if (u0.f51536a >= 23) {
                intentFilter.addAction("android.os.action.DEVICE_IDLE_MODE_CHANGED");
            } else {
                intentFilter.addAction("android.intent.action.SCREEN_ON");
                intentFilter.addAction("android.intent.action.SCREEN_OFF");
            }
        }
        if (this.f47401c.r()) {
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_LOW");
            intentFilter.addAction("android.intent.action.DEVICE_STORAGE_OK");
        }
        DeviceStatusChangeReceiver deviceStatusChangeReceiver = new DeviceStatusChangeReceiver();
        this.f47403e = deviceStatusChangeReceiver;
        this.f47399a.registerReceiver(deviceStatusChangeReceiver, intentFilter, null, this.f47402d);
        return this.f47404f;
    }

    public void j() {
        this.f47399a.unregisterReceiver((BroadcastReceiver) com.google.android.exoplayer2.util.a.g(this.f47403e));
        this.f47403e = null;
        if (u0.f51536a < 24 || this.f47405g == null) {
            return;
        }
        k();
    }
}
