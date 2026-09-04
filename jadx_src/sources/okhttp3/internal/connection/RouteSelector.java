package okhttp3.internal.connection;

import com.max.xiaoheihe.module.webview.WebviewFragment;
import dl.d;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import okhttp3.a;
import okhttp3.e;
import okhttp3.e0;
import okhttp3.internal.Util;
import okhttp3.p;
import okhttp3.t;

/* JADX INFO: compiled from: RouteSelector.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 (2\u00020\u0001:\u0002()B'\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\b\u0010\t\u001a\u00020\bH\u0002J\b\u0010\n\u001a\u00020\u0004H\u0002J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\t\u0010\f\u001a\u00020\bH\u0086\u0002J\t\u0010\u000e\u001a\u00020\rH\u0086\u0002R\u001c\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0011R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0011R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%¨\u0006*"}, d2 = {"Lokhttp3/internal/connection/RouteSelector;", "", "Lokhttp3/t;", "url", "Ljava/net/Proxy;", WebviewFragment.A4, "Lkotlin/b2;", "resetNextProxy", "", "hasNextProxy", "nextProxy", "resetNextInetSocketAddress", "hasNext", "Lokhttp3/internal/connection/RouteSelector$Selection;", "next", "", "proxies", "Ljava/util/List;", "", "nextProxyIndex", "I", "Ljava/net/InetSocketAddress;", "inetSocketAddresses", "", "Lokhttp3/e0;", "postponedRoutes", "Lokhttp3/a;", "address", "Lokhttp3/a;", "Lokhttp3/internal/connection/RouteDatabase;", "routeDatabase", "Lokhttp3/internal/connection/RouteDatabase;", "Lokhttp3/e;", "call", "Lokhttp3/e;", "Lokhttp3/p;", "eventListener", "Lokhttp3/p;", "<init>", "(Lokhttp3/a;Lokhttp3/internal/connection/RouteDatabase;Lokhttp3/e;Lokhttp3/p;)V", "Companion", "Selection", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class RouteSelector {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final a address;
    private final e call;
    private final p eventListener;
    private List<? extends InetSocketAddress> inetSocketAddresses;
    private int nextProxyIndex;
    private final List<e0> postponedRoutes;
    private List<? extends Proxy> proxies;
    private final RouteDatabase routeDatabase;

    /* JADX INFO: compiled from: RouteSelector.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0015\u0010\u0003\u001a\u00020\u0004*\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Companion;", "", "()V", "socketHost", "", "Ljava/net/InetSocketAddress;", "getSocketHost", "(Ljava/net/InetSocketAddress;)Ljava/lang/String;", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @d
        public final String getSocketHost(@d InetSocketAddress socketHost) {
            f0.p(socketHost, "$this$socketHost");
            InetAddress address = socketHost.getAddress();
            if (address != null) {
                String hostAddress = address.getHostAddress();
                f0.o(hostAddress, "address.hostAddress");
                return hostAddress;
            }
            String hostName = socketHost.getHostName();
            f0.o(hostName, "hostName");
            return hostName;
        }
    }

    /* JADX INFO: compiled from: RouteSelector.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u0003\u001a\u00020\u0002H\u0086\u0002J\t\u0010\u0005\u001a\u00020\u0004H\u0086\u0002R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/connection/RouteSelector$Selection;", "", "", "hasNext", "Lokhttp3/e0;", "next", "", "nextRouteIndex", "I", "", "routes", "Ljava/util/List;", "getRoutes", "()Ljava/util/List;", "<init>", "(Ljava/util/List;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Selection {
        private int nextRouteIndex;

        @d
        private final List<e0> routes;

        public Selection(@d List<e0> routes) {
            f0.p(routes, "routes");
            this.routes = routes;
        }

        @d
        public final List<e0> getRoutes() {
            return this.routes;
        }

        public final boolean hasNext() {
            return this.nextRouteIndex < this.routes.size();
        }

        @d
        public final e0 next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            List<e0> list = this.routes;
            int i10 = this.nextRouteIndex;
            this.nextRouteIndex = i10 + 1;
            return list.get(i10);
        }
    }

    public RouteSelector(@d a address, @d RouteDatabase routeDatabase, @d e call, @d p eventListener) {
        f0.p(address, "address");
        f0.p(routeDatabase, "routeDatabase");
        f0.p(call, "call");
        f0.p(eventListener, "eventListener");
        this.address = address;
        this.routeDatabase = routeDatabase;
        this.call = call;
        this.eventListener = eventListener;
        this.proxies = CollectionsKt__CollectionsKt.E();
        this.inetSocketAddresses = CollectionsKt__CollectionsKt.E();
        this.postponedRoutes = new ArrayList();
        resetNextProxy(address.w(), address.r());
    }

    private final boolean hasNextProxy() {
        return this.nextProxyIndex < this.proxies.size();
    }

    private final Proxy nextProxy() throws IOException {
        if (hasNextProxy()) {
            List<? extends Proxy> list = this.proxies;
            int i10 = this.nextProxyIndex;
            this.nextProxyIndex = i10 + 1;
            Proxy proxy = list.get(i10);
            resetNextInetSocketAddress(proxy);
            return proxy;
        }
        throw new SocketException("No route to " + this.address.w().getHost() + "; exhausted proxy configurations: " + this.proxies);
    }

    private final void resetNextInetSocketAddress(Proxy proxy) throws IOException {
        String host;
        int port;
        ArrayList arrayList = new ArrayList();
        this.inetSocketAddresses = arrayList;
        if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
            host = this.address.w().getHost();
            port = this.address.w().getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String();
        } else {
            SocketAddress socketAddressAddress = proxy.address();
            if (!(socketAddressAddress instanceof InetSocketAddress)) {
                throw new IllegalArgumentException(("Proxy.address() is not an InetSocketAddress: " + socketAddressAddress.getClass()).toString());
            }
            InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
            host = INSTANCE.getSocketHost(inetSocketAddress);
            port = inetSocketAddress.getPort();
        }
        if (1 > port || 65535 < port) {
            throw new SocketException("No route to " + host + ':' + port + "; port is out of range");
        }
        if (proxy.type() == Proxy.Type.SOCKS) {
            arrayList.add(InetSocketAddress.createUnresolved(host, port));
            return;
        }
        this.eventListener.dnsStart(this.call, host);
        List<InetAddress> listLookup = this.address.n().lookup(host);
        if (listLookup.isEmpty()) {
            throw new UnknownHostException(this.address.n() + " returned no addresses for " + host);
        }
        this.eventListener.dnsEnd(this.call, host, listLookup);
        Iterator<InetAddress> it = listLookup.iterator();
        while (it.hasNext()) {
            arrayList.add(new InetSocketAddress(it.next(), port));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void resetNextProxy(final t tVar, final Proxy proxy) {
        yh.a<List<? extends Proxy>> aVar = new yh.a<List<? extends Proxy>>() { // from class: okhttp3.internal.connection.RouteSelector.resetNextProxy.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @d
            public final List<? extends Proxy> invoke() {
                Proxy proxy2 = proxy;
                if (proxy2 != null) {
                    return s.k(proxy2);
                }
                URI uriZ = tVar.Z();
                if (uriZ.getHost() == null) {
                    return Util.immutableListOf(Proxy.NO_PROXY);
                }
                List<Proxy> listSelect = RouteSelector.this.address.t().select(uriZ);
                return listSelect == null || listSelect.isEmpty() ? Util.immutableListOf(Proxy.NO_PROXY) : Util.toImmutableList(listSelect);
            }
        };
        this.eventListener.proxySelectStart(this.call, tVar);
        List<? extends Proxy> listInvoke = aVar.invoke();
        this.proxies = listInvoke;
        this.nextProxyIndex = 0;
        this.eventListener.proxySelectEnd(this.call, tVar, listInvoke);
    }

    public final boolean hasNext() {
        return hasNextProxy() || (this.postponedRoutes.isEmpty() ^ true);
    }

    @d
    public final Selection next() throws IOException {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ArrayList arrayList = new ArrayList();
        while (hasNextProxy()) {
            Proxy proxyNextProxy = nextProxy();
            Iterator<? extends InetSocketAddress> it = this.inetSocketAddresses.iterator();
            while (it.hasNext()) {
                e0 e0Var = new e0(this.address, proxyNextProxy, it.next());
                if (this.routeDatabase.shouldPostpone(e0Var)) {
                    this.postponedRoutes.add(e0Var);
                } else {
                    arrayList.add(e0Var);
                }
            }
            if (!arrayList.isEmpty()) {
                break;
            }
        }
        if (arrayList.isEmpty()) {
            x.n0(arrayList, this.postponedRoutes);
            this.postponedRoutes.clear();
        }
        return new Selection(arrayList);
    }
}
