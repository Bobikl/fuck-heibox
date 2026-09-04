package okhttp3.internal.http;

import com.alipay.zoloz.android.phone.mrpc.core.f;
import com.max.hbwallet.bean.MallCouponObj;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import dl.d;
import dl.e;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import l5.a;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.i;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.u;

/* JADX INFO: compiled from: RealInterceptorChain.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0017\u001a\u00020\u001c\u0012\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 \u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b.\u0010/JM\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016J\u0018\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\t\u001a\u00020\u0002H\u0016J\u0018\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\n\u001a\u00020\u0002H\u0016J\u0018\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0017\u001a\u00020\u0016H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u001a\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u0017\u001a\u00020\u001c8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010\b\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b*\u0010+R\u001a\u0010\t\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b,\u0010+R\u001a\u0010\n\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\n\u0010\u001b\u001a\u0004\b-\u0010+¨\u00060"}, d2 = {"Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/u$a;", "", UCropPlusActivity.ARG_INDEX, "Lokhttp3/internal/connection/Exchange;", MallCouponObj.TYPE_EXCHANGE, "Lokhttp3/a0;", "request", "connectTimeoutMillis", "readTimeoutMillis", "writeTimeoutMillis", "copy$okhttp", "(ILokhttp3/internal/connection/Exchange;Lokhttp3/a0;III)Lokhttp3/internal/http/RealInterceptorChain;", "copy", "Lokhttp3/i;", f.f39665q, a.f130839h0, "Ljava/util/concurrent/TimeUnit;", "unit", "withConnectTimeout", "withReadTimeout", "withWriteTimeout", "Lokhttp3/e;", "call", "Lokhttp3/c0;", "proceed", "calls", "I", "Lokhttp3/internal/connection/RealCall;", "Lokhttp3/internal/connection/RealCall;", "getCall$okhttp", "()Lokhttp3/internal/connection/RealCall;", "", "Lokhttp3/u;", "interceptors", "Ljava/util/List;", "Lokhttp3/internal/connection/Exchange;", "getExchange$okhttp", "()Lokhttp3/internal/connection/Exchange;", "Lokhttp3/a0;", "getRequest$okhttp", "()Lokhttp3/a0;", "getConnectTimeoutMillis$okhttp", "()I", "getReadTimeoutMillis$okhttp", "getWriteTimeoutMillis$okhttp", "<init>", "(Lokhttp3/internal/connection/RealCall;Ljava/util/List;ILokhttp3/internal/connection/Exchange;Lokhttp3/a0;III)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class RealInterceptorChain implements u.a {

    @d
    private final RealCall call;
    private int calls;
    private final int connectTimeoutMillis;

    @e
    private final Exchange exchange;
    private final int index;
    private final List<u> interceptors;
    private final int readTimeoutMillis;

    @d
    private final a0 request;
    private final int writeTimeoutMillis;

    /* JADX WARN: Multi-variable type inference failed */
    public RealInterceptorChain(@d RealCall call, @d List<? extends u> interceptors, int i10, @e Exchange exchange, @d a0 request, int i11, int i12, int i13) {
        f0.p(call, "call");
        f0.p(interceptors, "interceptors");
        f0.p(request, "request");
        this.call = call;
        this.interceptors = interceptors;
        this.index = i10;
        this.exchange = exchange;
        this.request = request;
        this.connectTimeoutMillis = i11;
        this.readTimeoutMillis = i12;
        this.writeTimeoutMillis = i13;
    }

    public static /* synthetic */ RealInterceptorChain copy$okhttp$default(RealInterceptorChain realInterceptorChain, int i10, Exchange exchange, a0 a0Var, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 1) != 0) {
            i10 = realInterceptorChain.index;
        }
        if ((i14 & 2) != 0) {
            exchange = realInterceptorChain.exchange;
        }
        Exchange exchange2 = exchange;
        if ((i14 & 4) != 0) {
            a0Var = realInterceptorChain.request;
        }
        a0 a0Var2 = a0Var;
        if ((i14 & 8) != 0) {
            i11 = realInterceptorChain.connectTimeoutMillis;
        }
        int i15 = i11;
        if ((i14 & 16) != 0) {
            i12 = realInterceptorChain.readTimeoutMillis;
        }
        int i16 = i12;
        if ((i14 & 32) != 0) {
            i13 = realInterceptorChain.writeTimeoutMillis;
        }
        return realInterceptorChain.copy$okhttp(i10, exchange2, a0Var2, i15, i16, i13);
    }

    @Override // okhttp3.u.a
    @d
    public okhttp3.e call() {
        return this.call;
    }

    @Override // okhttp3.u.a
    /* JADX INFO: renamed from: connectTimeoutMillis, reason: from getter */
    public int getConnectTimeoutMillis() {
        return this.connectTimeoutMillis;
    }

    @Override // okhttp3.u.a
    @e
    public i connection() {
        Exchange exchange = this.exchange;
        if (exchange != null) {
            return exchange.getConnection();
        }
        return null;
    }

    @d
    public final RealInterceptorChain copy$okhttp(int index, @e Exchange exchange, @d a0 request, int connectTimeoutMillis, int readTimeoutMillis, int writeTimeoutMillis) {
        f0.p(request, "request");
        return new RealInterceptorChain(this.call, this.interceptors, index, exchange, request, connectTimeoutMillis, readTimeoutMillis, writeTimeoutMillis);
    }

    @d
    /* JADX INFO: renamed from: getCall$okhttp, reason: from getter */
    public final RealCall getCall() {
        return this.call;
    }

    public final int getConnectTimeoutMillis$okhttp() {
        return this.connectTimeoutMillis;
    }

    @e
    /* JADX INFO: renamed from: getExchange$okhttp, reason: from getter */
    public final Exchange getExchange() {
        return this.exchange;
    }

    /* JADX INFO: renamed from: getReadTimeoutMillis$okhttp, reason: from getter */
    public final int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @d
    /* JADX INFO: renamed from: getRequest$okhttp, reason: from getter */
    public final a0 getRequest() {
        return this.request;
    }

    /* JADX INFO: renamed from: getWriteTimeoutMillis$okhttp, reason: from getter */
    public final int getWriteTimeoutMillis() {
        return this.writeTimeoutMillis;
    }

    @Override // okhttp3.u.a
    @d
    public c0 proceed(@d a0 request) throws IOException {
        f0.p(request, "request");
        if (!(this.index < this.interceptors.size())) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.calls++;
        Exchange exchange = this.exchange;
        if (exchange != null) {
            if (!exchange.getFinder().sameHostAndPort(request.q())) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must retain the same host and port").toString());
            }
            if (!(this.calls == 1)) {
                throw new IllegalStateException(("network interceptor " + this.interceptors.get(this.index - 1) + " must call proceed() exactly once").toString());
            }
        }
        RealInterceptorChain realInterceptorChainCopy$okhttp$default = copy$okhttp$default(this, this.index + 1, null, request, 0, 0, 0, 58, null);
        u uVar = this.interceptors.get(this.index);
        c0 c0VarIntercept = uVar.intercept(realInterceptorChainCopy$okhttp$default);
        if (c0VarIntercept == null) {
            throw new NullPointerException("interceptor " + uVar + " returned null");
        }
        if (this.exchange != null) {
            if (!(this.index + 1 >= this.interceptors.size() || realInterceptorChainCopy$okhttp$default.calls == 1)) {
                throw new IllegalStateException(("network interceptor " + uVar + " must call proceed() exactly once").toString());
            }
        }
        if (c0VarIntercept.q() != null) {
            return c0VarIntercept;
        }
        throw new IllegalStateException(("interceptor " + uVar + " returned a response with no body").toString());
    }

    @Override // okhttp3.u.a
    public int readTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    @Override // okhttp3.u.a
    @d
    public a0 request() {
        return this.request;
    }

    @Override // okhttp3.u.a
    @d
    public u.a withConnectTimeout(int timeout, @d TimeUnit unit) {
        f0.p(unit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, Util.checkDuration("connectTimeout", timeout, unit), 0, 0, 55, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // okhttp3.u.a
    @d
    public u.a withReadTimeout(int timeout, @d TimeUnit unit) {
        f0.p(unit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, Util.checkDuration("readTimeout", timeout, unit), 0, 47, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // okhttp3.u.a
    @d
    public u.a withWriteTimeout(int timeout, @d TimeUnit unit) {
        f0.p(unit, "unit");
        if (this.exchange == null) {
            return copy$okhttp$default(this, 0, null, null, 0, 0, Util.checkDuration("writeTimeout", timeout, unit), 31, null);
        }
        throw new IllegalStateException("Timeouts can't be adjusted in a network interceptor".toString());
    }

    @Override // okhttp3.u.a
    public int writeTimeoutMillis() {
        return this.writeTimeoutMillis;
    }
}
