package okhttp3;

import com.max.xiaoheihe.module.webview.WebviewFragment;
import com.umeng.analytics.pro.ak;
import java.net.InetSocketAddress;
import java.net.Proxy;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.s0;

/* JADX INFO: compiled from: Route.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\f\u001a\u00020\u000bJ\u0013\u0010\u000e\u001a\u00020\u000b2\b\u0010\r\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0004R\u0017\u0010\u0018\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007R\u0017\u0010\u001b\u001a\u00020\b8\u0007¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\n¨\u0006\u001e"}, d2 = {"Lokhttp3/e0;", "", "Lokhttp3/a;", ak.av, "()Lokhttp3/a;", "Ljava/net/Proxy;", "b", "()Ljava/net/Proxy;", "Ljava/net/InetSocketAddress;", ak.aF, "()Ljava/net/InetSocketAddress;", "", "f", "other", "equals", "", "hashCode", "", "toString", "Lokhttp3/a;", "d", "address", "Ljava/net/Proxy;", "e", WebviewFragment.A4, "Ljava/net/InetSocketAddress;", "g", "socketAddress", "<init>", "(Lokhttp3/a;Ljava/net/Proxy;Ljava/net/InetSocketAddress;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class e0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final a address;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Proxy proxy;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final InetSocketAddress socketAddress;

    public e0(@dl.d a address, @dl.d Proxy proxy, @dl.d InetSocketAddress socketAddress) {
        kotlin.jvm.internal.f0.p(address, "address");
        kotlin.jvm.internal.f0.p(proxy, "proxy");
        kotlin.jvm.internal.f0.p(socketAddress, "socketAddress");
        this.address = address;
        this.proxy = proxy;
        this.socketAddress = socketAddress;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "address", imports = {}))
    @xh.h(name = "-deprecated_address")
    /* JADX INFO: renamed from: a, reason: from getter */
    public final a getAddress() {
        return this.address;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = WebviewFragment.A4, imports = {}))
    @xh.h(name = "-deprecated_proxy")
    /* JADX INFO: renamed from: b, reason: from getter */
    public final Proxy getProxy() {
        return this.proxy;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "socketAddress", imports = {}))
    @xh.h(name = "-deprecated_socketAddress")
    /* JADX INFO: renamed from: c, reason: from getter */
    public final InetSocketAddress getSocketAddress() {
        return this.socketAddress;
    }

    @dl.d
    @xh.h(name = "address")
    public final a d() {
        return this.address;
    }

    @dl.d
    @xh.h(name = WebviewFragment.A4)
    public final Proxy e() {
        return this.proxy;
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof e0) {
            e0 e0Var = (e0) other;
            if (kotlin.jvm.internal.f0.g(e0Var.address, this.address) && kotlin.jvm.internal.f0.g(e0Var.proxy, this.proxy) && kotlin.jvm.internal.f0.g(e0Var.socketAddress, this.socketAddress)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f() {
        return this.address.v() != null && this.proxy.type() == Proxy.Type.HTTP;
    }

    @dl.d
    @xh.h(name = "socketAddress")
    public final InetSocketAddress g() {
        return this.socketAddress;
    }

    public int hashCode() {
        return ((((bb.c.b.f30674h7 + this.address.hashCode()) * 31) + this.proxy.hashCode()) * 31) + this.socketAddress.hashCode();
    }

    @dl.d
    public String toString() {
        return "Route{" + this.socketAddress + '}';
    }
}
