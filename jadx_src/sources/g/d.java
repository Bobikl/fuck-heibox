package g;

import android.annotation.TargetApi;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;

/* JADX INFO: compiled from: NetworkChangeObservableV21Impl.java */
/* JADX INFO: loaded from: classes.dex */
public final class d extends g.a {

    /* JADX INFO: compiled from: NetworkChangeObservableV21Impl.java */
    public class a extends ConnectivityManager.NetworkCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f118915a;

        public a(Context context) {
            this.f118915a = context;
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            super.onAvailable(network);
            f.b.b("Network onAvailable(%s)", network);
            d.this.a(this.f118915a);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            super.onCapabilitiesChanged(network, networkCapabilities);
            f.b.b("Network onCapabilitiesChanged(%s)", network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            super.onLinkPropertiesChanged(network, linkProperties);
            f.b.b("Network onLinkPropertiesChanged(%s)", network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLosing(Network network, int i10) {
            super.onLosing(network, i10);
            f.b.b("Network onLosing(%s)", network);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            super.onLost(network);
            f.b.b("Network onLost(%s)", network);
            d.this.a(this.f118915a);
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            super.onUnavailable();
            f.b.b("Network onUnavailable", new Object[0]);
        }
    }

    @TargetApi(21)
    public d(Context context) {
        if (context == null) {
            return;
        }
        Context applicationContext = context.getApplicationContext();
        ConnectivityManager connectivityManager = (ConnectivityManager) applicationContext.getSystemService("connectivity");
        if (connectivityManager == null) {
            return;
        }
        try {
            connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addTransportType(0).addTransportType(1).addTransportType(2).addTransportType(3).build(), new a(applicationContext));
        } catch (Exception e10) {
            f.b.g("network register failed " + e10, new Object[0]);
        }
    }
}
