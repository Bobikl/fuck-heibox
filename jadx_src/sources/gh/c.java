package gh;

import android.net.ConnectivityManager;
import android.net.DhcpInfo;
import android.net.LinkAddress;
import android.net.LinkProperties;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: NetworkInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004J\b\u0010\f\u001a\u0004\u0018\u00010\u0004J\b\u0010\r\u001a\u0004\u0018\u00010\u0004J\u0006\u0010\u000e\u001a\u00020\u0004J\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004J\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004R\u001a\u0010\u0017\u001a\u00020\u00128BX\u0082\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u001e"}, d2 = {"Lgh/c;", "", "", "intIP", "", ak.av, "Ljava/net/InetAddress;", "inetAddress", "d", "netPrefixLength", "e", "k", "g", RXScreenCaptureService.KEY_HEIGHT, "l", "b", "f", ak.aF, "Landroid/net/wifi/WifiInfo;", "i", "()Landroid/net/wifi/WifiInfo;", "getWifiInfo$annotations", "()V", "wifiInfo", "Landroid/net/wifi/WifiManager;", "wifiManager", "Landroid/net/ConnectivityManager;", "connectivityManager", "<init>", "(Landroid/net/wifi/WifiManager;Landroid/net/ConnectivityManager;)V", "network_info_plus_release"}, k = 1, mv = {1, 7, 1})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final WifiManager f119057a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final ConnectivityManager f119058b;

    public c(@dl.d WifiManager wifiManager, @dl.e ConnectivityManager connectivityManager) {
        f0.p(wifiManager, "wifiManager");
        this.f119057a = wifiManager;
        this.f119058b = connectivityManager;
    }

    public /* synthetic */ c(WifiManager wifiManager, ConnectivityManager connectivityManager, int i10, u uVar) {
        this(wifiManager, (i10 & 2) != 0 ? null : connectivityManager);
    }

    private final String a(int intIP) {
        v0 v0Var = v0.f124986a;
        String str = String.format("%d.%d.%d.%d", Arrays.copyOf(new Object[]{Integer.valueOf(intIP & 255), Integer.valueOf((intIP >> 8) & 255), Integer.valueOf((intIP >> 16) & 255), Integer.valueOf((intIP >> 24) & 255)}, 4));
        f0.o(str, "format(format, *args)");
        return str;
    }

    private final String d(InetAddress inetAddress) {
        InetAddress inetAddressE;
        try {
            for (InterfaceAddress interfaceAddress : NetworkInterface.getByInetAddress(inetAddress).getInterfaceAddresses()) {
                if (!interfaceAddress.getAddress().isLoopbackAddress() && (interfaceAddress.getAddress() instanceof Inet4Address) && (inetAddressE = e(interfaceAddress.getNetworkPrefixLength())) != null) {
                    String hostAddress = inetAddressE.getHostAddress();
                    f0.m(hostAddress);
                    return hostAddress;
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    private final InetAddress e(int netPrefixLength) {
        int i10 = Integer.MIN_VALUE;
        for (int i11 = netPrefixLength - 1; i11 > 0; i11--) {
            i10 >>= 1;
        }
        try {
            return InetAddress.getByName(((i10 >> 24) & 255) + "." + ((i10 >> 16) & 255) + "." + ((i10 >> 8) & 255) + "." + (i10 & 255));
        } catch (Exception unused) {
            return null;
        }
    }

    private final WifiInfo i() {
        WifiInfo connectionInfo = this.f119057a.getConnectionInfo();
        f0.o(connectionInfo, "wifiManager.connectionInfo");
        return connectionInfo;
    }

    private static /* synthetic */ void j() {
    }

    @dl.e
    public final String b() {
        String hostAddress = null;
        try {
            List<InterfaceAddress> interfaceAddresses = NetworkInterface.getByInetAddress(InetAddress.getByName(h())).getInterfaceAddresses();
            f0.o(interfaceAddresses, "networkInterface.interfaceAddresses");
            for (InterfaceAddress interfaceAddress : interfaceAddresses) {
                if (!interfaceAddress.getAddress().isLoopbackAddress() && interfaceAddress.getBroadcast() != null) {
                    hostAddress = interfaceAddress.getBroadcast().getHostAddress();
                }
            }
        } catch (Exception unused) {
        }
        return hostAddress;
    }

    @dl.e
    public final String c() {
        Inet4Address dhcpServerAddress;
        if (Build.VERSION.SDK_INT < 31) {
            DhcpInfo dhcpInfo = this.f119057a.getDhcpInfo();
            Integer numValueOf = dhcpInfo != null ? Integer.valueOf(dhcpInfo.gateway) : null;
            if (numValueOf != null) {
                return a(numValueOf.intValue());
            }
            return null;
        }
        ConnectivityManager connectivityManager = this.f119058b;
        LinkProperties linkProperties = connectivityManager != null ? connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork()) : null;
        if (linkProperties == null || (dhcpServerAddress = linkProperties.getDhcpServerAddress()) == null) {
            return null;
        }
        return dhcpServerAddress.getHostAddress();
    }

    @dl.e
    public final String f() {
        String hostAddress;
        try {
            Iterator<InterfaceAddress> it = NetworkInterface.getByInetAddress(InetAddress.getByName(h())).getInterfaceAddresses().iterator();
            while (it.hasNext()) {
                InetAddress address = it.next().getAddress();
                if (!address.isLoopbackAddress() && (address instanceof Inet6Address) && (hostAddress = address.getHostAddress()) != null) {
                    return ((String[]) StringsKt__StringsKt.U4(hostAddress, new String[]{"%"}, false, 0, 6, null).toArray(new String[0]))[0];
                }
            }
            return null;
        } catch (SocketException unused) {
            return null;
        }
    }

    @dl.e
    public final String g() {
        return i().getBSSID();
    }

    @dl.e
    public final String h() {
        Object next;
        InetAddress address;
        boolean zV2;
        LinkProperties linkProperties;
        if (Build.VERSION.SDK_INT < 31) {
            WifiInfo wifiInfoI = i();
            f0.m(wifiInfoI);
            int ipAddress = wifiInfoI.getIpAddress();
            if (ipAddress != 0) {
                return a(ipAddress);
            }
            return null;
        }
        ConnectivityManager connectivityManager = this.f119058b;
        List<LinkAddress> linkAddresses = (connectivityManager == null || (linkProperties = connectivityManager.getLinkProperties(connectivityManager.getActiveNetwork())) == null) ? null : linkProperties.getLinkAddresses();
        if (linkAddresses == null) {
            return null;
        }
        Iterator<T> it = linkAddresses.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            String hostAddress = ((LinkAddress) next).getAddress().getHostAddress();
            zV2 = false;
            if (hostAddress != null) {
                f0.o(hostAddress, "hostAddress");
                zV2 = StringsKt__StringsKt.V2(hostAddress, lg.a.f131414g, false, 2, null);
            }
        } while (!zV2);
        LinkAddress linkAddress = (LinkAddress) next;
        if (linkAddress == null || (address = linkAddress.getAddress()) == null) {
            return null;
        }
        return address.getHostAddress();
    }

    @dl.e
    public final String k() {
        return i().getSSID();
    }

    @dl.d
    public final String l() {
        try {
            InetAddress inetAddress = InetAddress.getByName(h());
            f0.o(inetAddress, "inetAddress");
            return d(inetAddress);
        } catch (Exception unused) {
            return "";
        }
    }
}
