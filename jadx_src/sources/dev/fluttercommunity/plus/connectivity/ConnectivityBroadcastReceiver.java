package dev.fluttercommunity.plus.connectivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import io.flutter.plugin.common.EventChannel;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class ConnectivityBroadcastReceiver extends BroadcastReceiver implements EventChannel.StreamHandler {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f108186g = "android.net.conn.CONNECTIVITY_CHANGE";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Context f108187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f108188c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private EventChannel.EventSink f108189d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Handler f108190e = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f108191f;

    public class a extends ConnectivityManager.NetworkCallback {
        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            ConnectivityBroadcastReceiver connectivityBroadcastReceiver = ConnectivityBroadcastReceiver.this;
            connectivityBroadcastReceiver.i(connectivityBroadcastReceiver.f108188c.a(network));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            ConnectivityBroadcastReceiver connectivityBroadcastReceiver = ConnectivityBroadcastReceiver.this;
            connectivityBroadcastReceiver.i(connectivityBroadcastReceiver.f108188c.b(networkCapabilities));
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            ConnectivityBroadcastReceiver.this.h();
        }
    }

    public ConnectivityBroadcastReceiver(Context context, b bVar) {
        this.f108187b = context;
        this.f108188c = bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void f() {
        this.f108189d.success(this.f108188c.d());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(List list) {
        this.f108189d.success(list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() {
        this.f108190e.postDelayed(new Runnable() { // from class: dev.fluttercommunity.plus.connectivity.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f108215b.f();
            }
        }, 500L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(final List<String> list) {
        this.f108190e.post(new Runnable() { // from class: dev.fluttercommunity.plus.connectivity.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f108216b.g(list);
            }
        });
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onCancel(Object obj) {
        try {
            if (Build.VERSION.SDK_INT < 24) {
                this.f108187b.unregisterReceiver(this);
            } else if (this.f108191f != null) {
                this.f108188c.c().unregisterNetworkCallback(this.f108191f);
                this.f108191f = null;
            }
        } catch (Exception unused) {
        }
    }

    @Override // io.flutter.plugin.common.EventChannel.StreamHandler
    public void onListen(Object obj, EventChannel.EventSink eventSink) {
        this.f108189d = eventSink;
        if (Build.VERSION.SDK_INT >= 24) {
            this.f108191f = new a();
            this.f108188c.c().registerDefaultNetworkCallback(this.f108191f);
        } else {
            this.f108187b.registerReceiver(this, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        i(this.f108188c.d());
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        EventChannel.EventSink eventSink = this.f108189d;
        if (eventSink != null) {
            eventSink.success(this.f108188c.d());
        }
    }
}
