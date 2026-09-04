package org.android.netutil;

/* JADX INFO: loaded from: classes5.dex */
public class UdpConnectType {
    private static native int nativeTestUdpConnectIpv4();

    private static native int nativeTestUdpConnectIpv6();

    public static boolean testUdpConnectIpv4() {
        return nativeTestUdpConnectIpv4() != 0;
    }

    public static boolean testUdpConnectIpv6() {
        return nativeTestUdpConnectIpv6() != 0;
    }
}
