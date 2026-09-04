package dev.fluttercommunity.plus.connectivity;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import androidx.annotation.n0;
import androidx.annotation.w0;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: Connectivity.java */
/* JADX INFO: loaded from: classes4.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f108207b = "none";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final String f108208c = "wifi";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final String f108209d = "mobile";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final String f108210e = "ethernet";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final String f108211f = "bluetooth";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f108212g = "vpn";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final String f108213h = "other";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConnectivityManager f108214a;

    public b(ConnectivityManager connectivityManager) {
        this.f108214a = connectivityManager;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    private List<String> e() {
        NetworkInfo activeNetworkInfo = this.f108214a.getActiveNetworkInfo();
        ArrayList arrayList = new ArrayList();
        if (activeNetworkInfo == null || !activeNetworkInfo.isConnected()) {
            arrayList.add("none");
            return arrayList;
        }
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            arrayList.add("mobile");
        } else if (type == 1) {
            arrayList.add("wifi");
        } else if (type == 4 || type == 5) {
            arrayList.add("mobile");
        } else if (type == 6) {
            arrayList.add("wifi");
        } else if (type == 7) {
            arrayList.add(f108211f);
        } else if (type == 9) {
            arrayList.add(f108210e);
        } else if (type != 17) {
            arrayList.add("other");
        } else {
            arrayList.add(f108212g);
        }
        return arrayList;
    }

    @w0(api = 21)
    List<String> a(Network network) {
        return b(this.f108214a.getNetworkCapabilities(network));
    }

    @n0
    @w0(api = 21)
    List<String> b(NetworkCapabilities networkCapabilities) {
        ArrayList arrayList = new ArrayList();
        if (networkCapabilities == null || !networkCapabilities.hasCapability(12)) {
            arrayList.add("none");
            return arrayList;
        }
        if (networkCapabilities.hasTransport(1) || networkCapabilities.hasTransport(5)) {
            arrayList.add("wifi");
        }
        if (networkCapabilities.hasTransport(3)) {
            arrayList.add(f108210e);
        }
        if (networkCapabilities.hasTransport(4)) {
            arrayList.add(f108212g);
        }
        if (networkCapabilities.hasTransport(0)) {
            arrayList.add("mobile");
        }
        if (networkCapabilities.hasTransport(2)) {
            arrayList.add(f108211f);
        }
        if (arrayList.isEmpty() && networkCapabilities.hasCapability(12)) {
            arrayList.add("other");
        }
        if (arrayList.isEmpty()) {
            arrayList.add("none");
        }
        return arrayList;
    }

    public ConnectivityManager c() {
        return this.f108214a;
    }

    List<String> d() {
        return a(this.f108214a.getActiveNetwork());
    }
}
