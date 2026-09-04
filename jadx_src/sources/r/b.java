package r;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;

/* JADX INFO: compiled from: AbsHttpDnsConfig.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public SocketAddress f138696a = null;

    public abstract int a();

    public abstract String b(String str, String str2);

    public SocketAddress c(String str) {
        try {
            this.f138696a = new InetSocketAddress(InetAddress.getByName(str), a());
        } catch (Exception e10) {
            f.b.e("exception: %s", e10);
        }
        return this.f138696a;
    }
}
