package com.max.hbcommon.network;

import android.annotation.TargetApi;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.net.NetworkRequest;
import android.os.Build;
import androidx.lifecycle.LiveData;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ConnectivityLiveData.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class ConnectivityLiveData extends LiveData<NetworkState> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final Context f68004m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private ConnectivityManager f68005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private NetworkState f68006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f68007p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private ConnectivityLiveData$networkReceiver$1 f68008q;

    /* JADX INFO: compiled from: ConnectivityLiveData.kt */
    public static final class a extends ConnectivityManager.NetworkCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@dl.d Network network) {
            if (PatchProxy.proxy(new Object[]{network}, this, changeQuickRedirect, false, bb.c.e.Db, new Class[]{Network.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(network, "network");
            com.max.heybox.hblog.g.f74531b.q("ConnectivityLiveData, getConnectivityManagerCallback, onAvailable");
            ConnectivityLiveData.t(ConnectivityLiveData.this, NetworkState.CONNECTED);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@dl.d Network network) {
            if (PatchProxy.proxy(new Object[]{network}, this, changeQuickRedirect, false, bb.c.e.Eb, new Class[]{Network.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(network, "network");
            com.max.heybox.hblog.g.f74531b.q("ConnectivityLiveData, getConnectivityManagerCallback, onLost");
            ConnectivityLiveData.t(ConnectivityLiveData.this, NetworkState.DISCONNECTED);
        }
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.max.hbcommon.network.ConnectivityLiveData$networkReceiver$1] */
    public ConnectivityLiveData(@dl.d Context context) {
        f0.p(context, "context");
        this.f68004m = context;
        Object systemService = context.getSystemService("connectivity");
        f0.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f68005n = (ConnectivityManager) systemService;
        this.f68006o = NetworkState.UNINITIALIZED;
        this.f68008q = new BroadcastReceiver() { // from class: com.max.hbcommon.network.ConnectivityLiveData$networkReceiver$1
            public static ChangeQuickRedirect changeQuickRedirect;

            @Override // android.content.BroadcastReceiver
            public void onReceive(@dl.d Context context2, @dl.d Intent intent) {
                if (PatchProxy.proxy(new Object[]{context2, intent}, this, changeQuickRedirect, false, bb.c.e.Fb, new Class[]{Context.class, Intent.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(context2, "context");
                f0.p(intent, "intent");
                ConnectivityLiveData.s(this.f68010a);
            }
        };
    }

    public static final /* synthetic */ void s(ConnectivityLiveData connectivityLiveData) {
        if (PatchProxy.proxy(new Object[]{connectivityLiveData}, null, changeQuickRedirect, true, bb.c.e.Cb, new Class[]{ConnectivityLiveData.class}, Void.TYPE).isSupported) {
            return;
        }
        connectivityLiveData.x();
    }

    public static final /* synthetic */ void t(ConnectivityLiveData connectivityLiveData, NetworkState networkState) {
        if (PatchProxy.proxy(new Object[]{connectivityLiveData, networkState}, null, changeQuickRedirect, true, bb.c.e.Bb, new Class[]{ConnectivityLiveData.class, NetworkState.class}, Void.TYPE).isSupported) {
            return;
        }
        connectivityLiveData.o(networkState);
    }

    private final ConnectivityManager.NetworkCallback u() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32128zb, new Class[0], ConnectivityManager.NetworkCallback.class);
        if (patchProxyResultProxy.isSupported) {
            return (ConnectivityManager.NetworkCallback) patchProxyResultProxy.result;
        }
        a aVar = new a();
        this.f68007p = aVar;
        return aVar;
    }

    @TargetApi(21)
    private final void w() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32111yb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f68005n.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(0).addTransportType(1).build(), u());
    }

    private final void x() {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Ab, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        NetworkInfo activeNetworkInfo = this.f68005n.getActiveNetworkInfo();
        com.max.heybox.hblog.g.f74531b.q("ConnectivityLiveData, notifyNetworkStatus " + activeNetworkInfo);
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            z10 = true;
        }
        if (z10) {
            o(NetworkState.CONNECTED);
        } else {
            o(NetworkState.DISCONNECTED);
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void m() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32077wb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.m();
        x();
        if (Build.VERSION.SDK_INT >= 24) {
            this.f68005n.registerDefaultNetworkCallback(u());
        } else {
            w();
        }
    }

    @Override // androidx.lifecycle.LiveData
    public void n() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.f32094xb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.n();
        ConnectivityManager connectivityManager = this.f68005n;
        ConnectivityManager.NetworkCallback networkCallback = this.f68007p;
        if (networkCallback == null) {
            f0.S("networkCallback");
            networkCallback = null;
        }
        connectivityManager.unregisterNetworkCallback(networkCallback);
    }

    @dl.d
    public final Context v() {
        return this.f68004m;
    }
}
