package cn.fly.verify;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkRequest;
import android.os.SystemClock;
import cn.fly.verify.common.exception.VerifyErr;
import cn.fly.verify.common.exception.VerifyException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class aj {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static List<Network> f35728d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static List<ConnectivityManager.NetworkCallback> f35729e = new ArrayList();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static HashMap<String, Network> f35730g = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Network f35732b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ConnectivityManager.NetworkCallback f35733c;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f35734f = 3000;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ConnectivityManager f35731a = (ConnectivityManager) fz.d.a("connectivity");

    public static void b() {
        if (f35729e.size() > 0) {
            try {
                ConnectivityManager connectivityManager = (ConnectivityManager) fz.d.a("connectivity");
                Iterator<ConnectivityManager.NetworkCallback> it = f35729e.iterator();
                while (it.hasNext()) {
                    connectivityManager.unregisterNetworkCallback(it.next());
                }
                f35729e.clear();
                if (f35728d.size() > 0) {
                    f35728d.clear();
                }
            } catch (Throwable th2) {
                f.a().b(th2);
            }
            f.a().b("[FlyVerify] ==>%s", "release");
        }
    }

    public void a() {
        new ar() { // from class: cn.fly.verify.aj.1
            @Override // cn.fly.verify.ar
            public void a() {
                synchronized (aj.f35730g) {
                    String strD = al.d();
                    try {
                        if (!aj.f35730g.containsKey(strD)) {
                            long jUptimeMillis = SystemClock.uptimeMillis();
                            f.a().a("switchNetworkAsync ");
                            Network networkC = aj.this.c();
                            if (networkC != null) {
                                aj.f35730g.put(strD, networkC);
                            }
                            f.a().a("switchNetworkAsync complete " + (SystemClock.uptimeMillis() - jUptimeMillis));
                        }
                    } catch (VerifyException unused) {
                    }
                }
            }
        }.b();
    }

    public Network c() throws VerifyException {
        try {
            f.a().b("[FlyVerify] ==>%s", "Force switch network");
            if (!fz.d.b("android.permission.CHANGE_NETWORK_STATE")) {
                VerifyException verifyException = new VerifyException(VerifyErr.INNER_NO_SWITCH_PERMISSION_ERR);
                f.a().c("[FlyVerify] ==>%s", "switch no permission");
                throw verifyException;
            }
            this.f35732b = null;
            NetworkRequest.Builder builder = new NetworkRequest.Builder();
            builder.addCapability(12);
            builder.addTransportType(0);
            NetworkRequest networkRequestBuild = builder.build();
            ConnectivityManager.NetworkCallback networkCallback = new ConnectivityManager.NetworkCallback() { // from class: cn.fly.verify.aj.2
                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onAvailable(Network network) {
                    aj.this.f35732b = network;
                    aj.f35728d.add(network);
                }

                @Override // android.net.ConnectivityManager.NetworkCallback
                public void onLost(Network network) {
                }
            };
            this.f35733c = networkCallback;
            this.f35731a.requestNetwork(networkRequestBuild, networkCallback);
            f35729e.add(this.f35733c);
            long j10 = 0;
            do {
                Network network = this.f35732b;
                if (network != null) {
                    return network;
                }
                j10++;
                SystemClock.sleep(50L);
            } while (j10 <= this.f35734f / 50);
            f.a().c("[FlyVerify] ==>%s", "switch timeout");
            throw new VerifyException(VerifyErr.INNER_SWITCH_EXCEPTION_ERR.getCode(), "switch_timeout");
        } catch (Throwable th2) {
            f.a().c("[FlyVerify] ==>%s", "switch failure " + th2);
            if (th2 instanceof VerifyException) {
                throw th2;
            }
            throw new VerifyException(VerifyErr.INNER_SWITCH_EXCEPTION_ERR.getCode(), as.a(th2));
        }
    }
}
