package uj;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import org.apache.tools.ant.BuildException;

/* JADX INFO: compiled from: ProxyDiagnostics.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f140809b = "https://ant.apache.org/";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private URI f140810a;

    public a() {
        this(f140809b);
    }

    public a(String str) {
        try {
            this.f140810a = new URI(str);
        } catch (URISyntaxException e10) {
            throw new BuildException(e10);
        }
    }

    public String toString() {
        ProxySelector proxySelector = ProxySelector.getDefault();
        StringBuilder sb2 = new StringBuilder();
        for (Proxy proxy : proxySelector.select(this.f140810a)) {
            SocketAddress socketAddressAddress = proxy.address();
            if (socketAddressAddress == null) {
                sb2.append("Direct connection\n");
            } else {
                sb2.append(proxy);
                if (socketAddressAddress instanceof InetSocketAddress) {
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    sb2.append(' ');
                    sb2.append(inetSocketAddress.getHostName());
                    sb2.append(':');
                    sb2.append(inetSocketAddress.getPort());
                    if (inetSocketAddress.isUnresolved()) {
                        sb2.append(" [unresolved]");
                    } else {
                        InetAddress address = inetSocketAddress.getAddress();
                        sb2.append(" [");
                        sb2.append(address.getHostAddress());
                        sb2.append(']');
                    }
                }
                sb2.append('\n');
            }
        }
        return sb2.toString();
    }
}
