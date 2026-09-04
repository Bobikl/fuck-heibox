package com.max.hbcommon.network;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import com.max.hbutils.core.BaseApplication;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: ConnectivityWrapper.kt */
/* JADX INFO: loaded from: classes9.dex */
@t0({"SMAP\nConnectivityWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectivityWrapper.kt\ncom/max/hbcommon/network/ConnectivityWrapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1855#2,2:132\n*S KotlinDebug\n*F\n+ 1 ConnectivityWrapper.kt\ncom/max/hbcommon/network/ConnectivityWrapper\n*L\n52#1:132,2\n*E\n"})
public final class ConnectivityWrapper {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static boolean f68012b;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static ConnectivityManager f68016f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static boolean f68017g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final ConnectivityWrapper f68011a = new ConnectivityWrapper();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final Handler f68013c = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static List<f> f68014d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static ConnectivityManager.NetworkCallback f68015e = new a();

    /* JADX INFO: compiled from: ConnectivityWrapper.kt */
    @t0({"SMAP\nConnectivityWrapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConnectivityWrapper.kt\ncom/max/hbcommon/network/ConnectivityWrapper$networkCallback$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1855#2,2:132\n*S KotlinDebug\n*F\n+ 1 ConnectivityWrapper.kt\ncom/max/hbcommon/network/ConnectivityWrapper$networkCallback$1\n*L\n43#1:132,2\n*E\n"})
    public static final class a extends ConnectivityManager.NetworkCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void b() {
            if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.Sb, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            Iterator<T> it = ConnectivityWrapper.f68011a.e().iterator();
            while (it.hasNext()) {
                ((f) it.next()).a(NetworkState.DISCONNECTED);
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(@dl.d Network network) {
            if (PatchProxy.proxy(new Object[]{network}, this, changeQuickRedirect, false, bb.c.e.Qb, new Class[]{Network.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(network, "network");
            ConnectivityWrapper connectivityWrapper = ConnectivityWrapper.f68011a;
            connectivityWrapper.m(true);
            com.max.heybox.hblog.g.f74531b.M("ConnectivityWrapper, getConnectivityManagerCallback, onAvailable, " + Thread.currentThread().getName());
            ConnectivityWrapper.c(connectivityWrapper);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(@dl.d Network network) {
            if (PatchProxy.proxy(new Object[]{network}, this, changeQuickRedirect, false, bb.c.e.Rb, new Class[]{Network.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(network, "network");
            com.max.heybox.hblog.g.f74531b.M("ConnectivityWrapper, getConnectivityManagerCallback, onLost");
            ConnectivityWrapper.f68013c.post(new Runnable() { // from class: com.max.hbcommon.network.i
                @Override // java.lang.Runnable
                public final void run() {
                    ConnectivityWrapper.a.b();
                }
            });
        }
    }

    static {
        Object systemService = BaseApplication.a().getSystemService("connectivity");
        f0.n(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        f68016f = (ConnectivityManager) systemService;
    }

    private ConnectivityWrapper() {
    }

    public static final /* synthetic */ void c(ConnectivityWrapper connectivityWrapper) {
        if (PatchProxy.proxy(new Object[]{connectivityWrapper}, null, changeQuickRedirect, true, bb.c.e.Pb, new Class[]{ConnectivityWrapper.class}, Void.TYPE).isSupported) {
            return;
        }
        connectivityWrapper.j();
    }

    private final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Nb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        try {
            f68016f.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(0).addTransportType(1).build(), f68015e);
        } catch (Exception unused) {
        }
    }

    private final void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Hb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f68013c.post(new Runnable() { // from class: com.max.hbcommon.network.h
            @Override // java.lang.Runnable
            public final void run() {
                ConnectivityWrapper.k();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void k() {
        if (PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, bb.c.e.Ob, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        Iterator<T> it = f68014d.iterator();
        while (it.hasNext()) {
            ((f) it.next()).a(NetworkState.CONNECTED);
        }
    }

    public final void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Lb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        f68014d.clear();
    }

    @dl.d
    public final List<f> e() {
        return f68014d;
    }

    public final boolean f() {
        return f68012b;
    }

    public final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Ib, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.M("ConnectivityWrapper, onActive, isActive = " + f68017g);
        if (f68017g) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            try {
                f68016f.registerDefaultNetworkCallback(f68015e);
            } catch (Exception e10) {
                com.max.heybox.hblog.g.f74531b.v("ConnectivityWrapper, registerDefault Error " + e10.getMessage());
            }
        } else {
            g();
        }
        kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new ConnectivityWrapper$onActive$1(null), 3, null);
        f68017g = true;
    }

    public final void i() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.Mb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        com.max.heybox.hblog.g.f74531b.M("ConnectivityWrapper, onInactive, isActive = " + f68017g);
        if (f68017g) {
            f68017g = false;
            try {
                f68016f.unregisterNetworkCallback(f68015e);
            } catch (Exception unused) {
            }
        }
    }

    public final void l(@dl.d f callback) {
        if (PatchProxy.proxy(new Object[]{callback}, this, changeQuickRedirect, false, bb.c.e.Jb, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "callback");
        f68014d.add(callback);
    }

    public final void m(boolean z10) {
        f68012b = z10;
    }

    public final void n(@dl.d List<f> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.e.Gb, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        f68014d = list;
    }

    public final void o(@dl.d f callback) {
        if (PatchProxy.proxy(new Object[]{callback}, this, changeQuickRedirect, false, bb.c.e.Kb, new Class[]{f.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(callback, "callback");
        f68014d.remove(callback);
    }
}
