package okhttp3.internal.authenticator;

import com.google.common.net.c;
import com.taobao.accs.utl.BaseMonitor;
import dl.d;
import dl.e;
import java.io.IOException;
import java.net.Authenticator;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import java.net.SocketAddress;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import okhttp3.a;
import okhttp3.a0;
import okhttp3.b;
import okhttp3.c0;
import okhttp3.e0;
import okhttp3.g;
import okhttp3.m;
import okhttp3.o;
import okhttp3.t;

/* JADX INFO: compiled from: JavaNetAuthenticator.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012J\u001c\u0010\b\u001a\u00020\u0007*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016R\u0014\u0010\u000f\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lokhttp3/internal/authenticator/JavaNetAuthenticator;", "Lokhttp3/b;", "Ljava/net/Proxy;", "Lokhttp3/t;", "url", "Lokhttp3/o;", BaseMonitor.COUNT_POINT_DNS, "Ljava/net/InetAddress;", "connectToInetAddress", "Lokhttp3/e0;", "route", "Lokhttp3/c0;", "response", "Lokhttp3/a0;", "authenticate", "defaultDns", "Lokhttp3/o;", "<init>", "(Lokhttp3/o;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class JavaNetAuthenticator implements b {
    private final o defaultDns;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Proxy.Type.DIRECT.ordinal()] = 1;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public JavaNetAuthenticator() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public JavaNetAuthenticator(@d o defaultDns) {
        f0.p(defaultDns, "defaultDns");
        this.defaultDns = defaultDns;
    }

    public /* synthetic */ JavaNetAuthenticator(o oVar, int i10, u uVar) {
        this((i10 & 1) != 0 ? o.f132626a : oVar);
    }

    private final InetAddress connectToInetAddress(Proxy proxy, t tVar, o oVar) throws IOException {
        Proxy.Type type = proxy.type();
        if (type != null && WhenMappings.$EnumSwitchMapping$0[type.ordinal()] == 1) {
            return (InetAddress) CollectionsKt___CollectionsKt.w2(oVar.lookup(tVar.getHost()));
        }
        SocketAddress socketAddressAddress = proxy.address();
        if (socketAddressAddress == null) {
            throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
        }
        InetAddress address = ((InetSocketAddress) socketAddressAddress).getAddress();
        f0.o(address, "(address() as InetSocketAddress).address");
        return address;
    }

    @Override // okhttp3.b
    @e
    public a0 authenticate(@e e0 route, @d c0 response) throws IOException {
        Proxy proxy;
        o oVarN;
        PasswordAuthentication passwordAuthenticationRequestPasswordAuthentication;
        a aVarD;
        f0.p(response, "response");
        List<g> listT = response.t();
        a0 request = response.getRequest();
        t tVarQ = request.q();
        boolean z10 = response.x() == 407;
        if (route == null || (proxy = route.e()) == null) {
            proxy = Proxy.NO_PROXY;
        }
        for (g gVar : listT) {
            if (kotlin.text.u.L1("Basic", gVar.h(), true)) {
                if (route == null || (aVarD = route.d()) == null || (oVarN = aVarD.n()) == null) {
                    oVarN = this.defaultDns;
                }
                if (z10) {
                    SocketAddress socketAddressAddress = proxy.address();
                    if (socketAddressAddress == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.net.InetSocketAddress");
                    }
                    InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                    String hostName = inetSocketAddress.getHostName();
                    f0.o(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(hostName, connectToInetAddress(proxy, tVarQ, oVarN), inetSocketAddress.getPort(), tVarQ.getScheme(), gVar.g(), gVar.h(), tVarQ.a0(), Authenticator.RequestorType.PROXY);
                } else {
                    String host = tVarQ.getHost();
                    f0.o(proxy, "proxy");
                    passwordAuthenticationRequestPasswordAuthentication = Authenticator.requestPasswordAuthentication(host, connectToInetAddress(proxy, tVarQ, oVarN), tVarQ.getCom.max.xiaoheihe.module.voice.HeyboxMicFragment.y java.lang.String(), tVarQ.getScheme(), gVar.g(), gVar.h(), tVarQ.a0(), Authenticator.RequestorType.SERVER);
                }
                if (passwordAuthenticationRequestPasswordAuthentication != null) {
                    String str = z10 ? c.H : "Authorization";
                    String userName = passwordAuthenticationRequestPasswordAuthentication.getUserName();
                    f0.o(userName, "auth.userName");
                    char[] password = passwordAuthenticationRequestPasswordAuthentication.getPassword();
                    f0.o(password, "auth.password");
                    return request.n().n(str, m.b(userName, new String(password), gVar.f())).b();
                }
            }
        }
        return null;
    }
}
