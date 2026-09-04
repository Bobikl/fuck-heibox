package okhttp3;

import com.umeng.analytics.pro.ak;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;

/* JADX INFO: compiled from: Dns.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\t"}, d2 = {"Lokhttp3/o;", "", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "b", ak.av, "okhttp"}, k = 1, mv = {1, 4, 0})
public interface o {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final o f132626a = new Companion.C1219a();

    /* JADX INFO: renamed from: okhttp3.o$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Dns.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"Lokhttp3/o$a;", "", "Lokhttp3/o;", "SYSTEM", "Lokhttp3/o;", "<init>", "()V", ak.av, "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f132628a = null;

        /* JADX INFO: renamed from: okhttp3.o$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Dns.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lokhttp3/o$a$a;", "Lokhttp3/o;", "", "hostname", "", "Ljava/net/InetAddress;", "lookup", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class C1219a implements o {
            @Override // okhttp3.o
            @dl.d
            public List<InetAddress> lookup(@dl.d String hostname) throws UnknownHostException {
                kotlin.jvm.internal.f0.p(hostname, "hostname");
                try {
                    InetAddress[] allByName = InetAddress.getAllByName(hostname);
                    kotlin.jvm.internal.f0.o(allByName, "InetAddress.getAllByName(hostname)");
                    return ArraysKt___ArraysKt.kz(allByName);
                } catch (NullPointerException e10) {
                    UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of " + hostname);
                    unknownHostException.initCause(e10);
                    throw unknownHostException;
                }
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    @dl.d
    List<InetAddress> lookup(@dl.d String hostname) throws UnknownHostException;
}
