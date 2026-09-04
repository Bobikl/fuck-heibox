package okhttp3.dnsoverhttps;

import com.umeng.analytics.pro.ak;
import dl.d;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okhttp3.o;

/* JADX INFO: compiled from: BootstrapDns.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lokhttp3/dnsoverhttps/a;", "Lokhttp3/o;", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", ak.aF, "Ljava/lang/String;", "dnsHostname", "d", "Ljava/util/List;", "dnsServers", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "okhttp-dnsoverhttps"}, k = 1, mv = {1, 4, 0})
public final class a implements o {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final String dnsHostname;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<InetAddress> dnsServers;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@d String dnsHostname, @d List<? extends InetAddress> dnsServers) {
        f0.p(dnsHostname, "dnsHostname");
        f0.p(dnsServers, "dnsServers");
        this.dnsHostname = dnsHostname;
        this.dnsServers = dnsServers;
    }

    @Override // okhttp3.o
    @d
    public List<InetAddress> lookup(@d String hostname) throws UnknownHostException {
        f0.p(hostname, "hostname");
        if (!(!f0.g(this.dnsHostname, hostname))) {
            return this.dnsServers;
        }
        throw new UnknownHostException("BootstrapDns called for " + hostname + " instead of " + this.dnsHostname);
    }
}
