package okhttp3.internal.connection;

import dl.d;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okhttp3.c0;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.u;

/* JADX INFO: compiled from: ConnectInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lokhttp3/internal/connection/ConnectInterceptor;", "Lokhttp3/u;", "Lokhttp3/u$a;", "chain", "Lokhttp3/c0;", "intercept", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class ConnectInterceptor implements u {
    public static final ConnectInterceptor INSTANCE = new ConnectInterceptor();

    private ConnectInterceptor() {
    }

    @Override // okhttp3.u
    @d
    public c0 intercept(@d u.a chain) throws IOException {
        f0.p(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        return RealInterceptorChain.copy$okhttp$default(realInterceptorChain, 0, realInterceptorChain.getCall().initExchange$okhttp(realInterceptorChain), null, 0, 0, 0, 61, null).proceed(realInterceptorChain.getRequest());
    }
}
