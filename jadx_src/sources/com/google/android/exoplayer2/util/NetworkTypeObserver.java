package com.google.android.exoplayer2.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyDisplayInfo;
import android.telephony.TelephonyManager;
import androidx.annotation.j1;
import java.lang.ref.WeakReference;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class NetworkTypeObserver {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.p0
    private static NetworkTypeObserver f51356e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f51357a = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<WeakReference<c>> f51358b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f51359c = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.b0("networkTypeLock")
    private int f51360d = 0;

    public final class Receiver extends BroadcastReceiver {
        private Receiver() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            int iG = NetworkTypeObserver.g(context);
            int i10 = u0.f51536a;
            if (i10 >= 29 && !b.f51362a && iG == 5) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) com.google.android.exoplayer2.util.a.g((TelephonyManager) context.getSystemService(g0.a.f118921e));
                    d dVar = new d();
                    if (i10 < 31) {
                        telephonyManager.listen(dVar, 1);
                    } else {
                        telephonyManager.listen(dVar, 1048576);
                    }
                    telephonyManager.listen(dVar, 0);
                    return;
                } catch (RuntimeException unused) {
                }
            }
            NetworkTypeObserver.this.l(iG);
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static volatile boolean f51362a;

        private b() {
        }

        public static void b() {
            f51362a = true;
        }
    }

    public interface c {
        void a(int i10);
    }

    public class d extends PhoneStateListener {
        private d() {
        }

        @Override // android.telephony.PhoneStateListener
        @androidx.annotation.w0(31)
        public void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) {
            int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
            NetworkTypeObserver.this.l(overrideNetworkType == 3 || overrideNetworkType == 4 ? 10 : 5);
        }

        @Override // android.telephony.PhoneStateListener
        public void onServiceStateChanged(@androidx.annotation.p0 ServiceState serviceState) {
            String string = serviceState == null ? "" : serviceState.toString();
            NetworkTypeObserver.this.l(string.contains("nrState=CONNECTED") || string.contains("nrState=NOT_RESTRICTED") ? 10 : 5);
        }
    }

    private NetworkTypeObserver(Context context) {
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
        context.registerReceiver(new Receiver(), intentFilter);
    }

    public static synchronized NetworkTypeObserver d(Context context) {
        if (f51356e == null) {
            f51356e = new NetworkTypeObserver(context);
        }
        return f51356e;
    }

    private static int e(NetworkInfo networkInfo) {
        switch (networkInfo.getSubtype()) {
            case 1:
            case 2:
                return 3;
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 14:
            case 15:
            case 17:
                return 4;
            case 13:
                return 5;
            case 16:
            case 19:
            default:
                return 6;
            case 18:
                return 2;
            case 20:
                return u0.f51536a >= 29 ? 9 : 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int g(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
        int i10 = 0;
        if (connectivityManager == null) {
            return 0;
        }
        try {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            i10 = 1;
            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                int type = activeNetworkInfo.getType();
                if (type != 0) {
                    if (type == 1) {
                        return 2;
                    }
                    if (type != 4 && type != 5) {
                        if (type != 6) {
                            return type != 9 ? 8 : 7;
                        }
                        return 5;
                    }
                }
                return e(activeNetworkInfo);
            }
        } catch (SecurityException unused) {
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void h(c cVar) {
        cVar.a(f());
    }

    private void j() {
        for (WeakReference<c> weakReference : this.f51358b) {
            if (weakReference.get() == null) {
                this.f51358b.remove(weakReference);
            }
        }
    }

    @j1
    public static synchronized void k() {
        f51356e = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(int i10) {
        synchronized (this.f51359c) {
            if (this.f51360d == i10) {
                return;
            }
            this.f51360d = i10;
            for (WeakReference<c> weakReference : this.f51358b) {
                c cVar = weakReference.get();
                if (cVar != null) {
                    cVar.a(i10);
                } else {
                    this.f51358b.remove(weakReference);
                }
            }
        }
    }

    public int f() {
        int i10;
        synchronized (this.f51359c) {
            i10 = this.f51360d;
        }
        return i10;
    }

    public void i(final c cVar) {
        j();
        this.f51358b.add(new WeakReference<>(cVar));
        this.f51357a.post(new Runnable() { // from class: com.google.android.exoplayer2.util.a0
            @Override // java.lang.Runnable
            public final void run() {
                this.f51367b.h(cVar);
            }
        });
    }
}
