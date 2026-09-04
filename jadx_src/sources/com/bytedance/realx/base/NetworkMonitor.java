package com.bytedance.realx.base;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import androidx.annotation.w0;

/* JADX INFO: loaded from: classes6.dex */
@w0(api = 26)
public class NetworkMonitor {
    private static final String TAG = "NetworkMonitor";
    private String cellularIfName;
    private Boolean cellularNetworkRequested;
    private ConnectivityManager connectivityManager;
    private NetworkMonitoCallback networkMonitorCallback;
    private Boolean shouldEmitAvailable;
    private Network cellularNetwork = null;
    private long cellularRequestCallback = 0;

    public class NetworkMonitoCallback extends ConnectivityManager.NetworkCallback {
        NetworkMonitoCallback() {
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onAvailable(Network network) {
            synchronized (NetworkMonitor.this) {
                RXLogging.w(NetworkMonitor.TAG, "on available, network: " + network.toString());
                if (NetworkMonitor.this.cellularNetwork == null) {
                    NetworkMonitor.this.cellularNetwork = network;
                    NetworkMonitor.this.shouldEmitAvailable = Boolean.TRUE;
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onBlockedStatusChanged(Network network, boolean z10) {
            synchronized (NetworkMonitor.this) {
                RXLogging.w(NetworkMonitor.TAG, "on network block status changed, network: " + network.toString() + ", blocked: " + z10);
                if (network.equals(NetworkMonitor.this.cellularNetwork) && NetworkMonitor.this.cellularRequestCallback != 0 && NetworkMonitor.this.cellularIfName != null) {
                    NativeNetworkFunctions.nativeOnBlockedStatusChanged(NetworkMonitor.this.cellularIfName, z10, NetworkMonitor.this.cellularRequestCallback);
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
            synchronized (NetworkMonitor.this) {
                RXLogging.w(NetworkMonitor.TAG, "on capabilities changed, network: " + network.toString() + ", capabilities: " + networkCapabilities.toString());
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
            synchronized (NetworkMonitor.this) {
                RXLogging.w(NetworkMonitor.TAG, "on link properties changed, network: " + network.toString() + ", capabilities: " + linkProperties.toString());
                if (network.equals(NetworkMonitor.this.cellularNetwork)) {
                    NetworkMonitor.this.cellularIfName = linkProperties.getInterfaceName();
                    if (NetworkMonitor.this.cellularRequestCallback != 0 && NetworkMonitor.this.shouldEmitAvailable.booleanValue() && NetworkMonitor.this.cellularIfName != null) {
                        NativeNetworkFunctions.nativeOnNetworkAvailable(NetworkMonitor.this.cellularIfName, NetworkMonitor.this.cellularRequestCallback);
                        NetworkMonitor.this.shouldEmitAvailable = Boolean.FALSE;
                    }
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onLost(Network network) {
            synchronized (NetworkMonitor.this) {
                RXLogging.w(NetworkMonitor.TAG, "on lost, network: " + network.toString());
                if (network.equals(NetworkMonitor.this.cellularNetwork)) {
                    NetworkMonitor.this.cellularNetwork = null;
                    if (NetworkMonitor.this.cellularRequestCallback != 0 && NetworkMonitor.this.cellularIfName != null) {
                        NativeNetworkFunctions.nativeOnNetworkLost(NetworkMonitor.this.cellularIfName, NetworkMonitor.this.cellularRequestCallback);
                    }
                }
            }
        }

        @Override // android.net.ConnectivityManager.NetworkCallback
        public void onUnavailable() {
            synchronized (NetworkMonitor.this) {
                RXLogging.w(NetworkMonitor.TAG, "on unavailable");
                if (NetworkMonitor.this.cellularRequestCallback != 0) {
                    NativeNetworkFunctions.nativeOnNetworkUnavailable(NetworkMonitor.this.cellularRequestCallback);
                }
            }
        }
    }

    public NetworkMonitor() {
        this.connectivityManager = null;
        Boolean bool = Boolean.FALSE;
        this.cellularNetworkRequested = bool;
        this.shouldEmitAvailable = bool;
        this.networkMonitorCallback = null;
        this.connectivityManager = (ConnectivityManager) ContextUtils.getApplicationContext().getSystemService("connectivity");
    }

    @CalledByNative
    public static NetworkMonitor create() {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        return new NetworkMonitor();
    }

    @CalledByNative
    public int bindSocketToCellularNetwork(int i10, String str) {
        int i11;
        synchronized (this) {
            i11 = -1;
            if (this.cellularNetwork != null && str.equals(this.cellularIfName)) {
                RXLogging.w(TAG, "bind socket to network, fd: " + i10);
                try {
                    ParcelFileDescriptor parcelFileDescriptorFromFd = ParcelFileDescriptor.fromFd(i10);
                    this.cellularNetwork.bindSocket(parcelFileDescriptorFromFd.getFileDescriptor());
                    parcelFileDescriptorFromFd.detachFd();
                    parcelFileDescriptorFromFd.close();
                    i11 = 0;
                } catch (Exception e10) {
                    RXLogging.w(TAG, "bind socket to network exception: " + e10.toString());
                    e10.printStackTrace();
                }
            }
        }
        return i11;
    }

    @CalledByNative
    public void cancelRequestCellularNetwork() {
        synchronized (this) {
            if (this.cellularNetworkRequested.booleanValue()) {
                try {
                    this.connectivityManager.unregisterNetworkCallback(this.networkMonitorCallback);
                    this.cellularNetwork = null;
                    this.cellularRequestCallback = 0L;
                    this.cellularNetworkRequested = Boolean.FALSE;
                } catch (Exception e10) {
                    RXLogging.w(TAG, "Cancel request cellular network exception: " + e10.toString());
                }
            }
        }
    }

    @CalledByNative
    public void requestCellularNetwork(long j10) {
        synchronized (this) {
            if (!this.cellularNetworkRequested.booleanValue()) {
                try {
                    this.cellularRequestCallback = j10;
                    NetworkRequest networkRequestBuild = new NetworkRequest.Builder().addTransportType(0).addCapability(12).build();
                    NetworkMonitoCallback networkMonitoCallback = new NetworkMonitoCallback();
                    this.networkMonitorCallback = networkMonitoCallback;
                    this.connectivityManager.requestNetwork(networkRequestBuild, networkMonitoCallback);
                    this.cellularNetworkRequested = Boolean.TRUE;
                } catch (Exception e10) {
                    RXLogging.w(TAG, "Request cellular network exception: " + e10.toString());
                }
            }
        }
    }
}
