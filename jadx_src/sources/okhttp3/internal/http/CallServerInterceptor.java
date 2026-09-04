package okhttp3.internal.http;

import dl.d;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.u;
import okio.BufferedSink;
import okio.Okio;

/* JADX INFO: compiled from: CallServerInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/CallServerInterceptor;", "Lokhttp3/u;", "Lokhttp3/u$a;", "chain", "Lokhttp3/c0;", "intercept", "", "forWebSocket", "Z", "<init>", "(Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class CallServerInterceptor implements u {
    private final boolean forWebSocket;

    public CallServerInterceptor(boolean z10) {
        this.forWebSocket = z10;
    }

    @Override // okhttp3.u
    @d
    public c0 intercept(@d u.a chain) throws IOException {
        c0.a responseHeaders;
        boolean z10;
        f0.p(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        Exchange exchange = realInterceptorChain.getExchange();
        f0.m(exchange);
        a0 request = realInterceptorChain.getRequest();
        b0 b0VarF = request.f();
        long jCurrentTimeMillis = System.currentTimeMillis();
        exchange.writeRequestHeaders(request);
        if (!HttpMethod.permitsRequestBody(request.m()) || b0VarF == null) {
            exchange.noRequestBody();
            responseHeaders = null;
            z10 = true;
        } else {
            if (kotlin.text.u.L1("100-continue", request.i("Expect"), true)) {
                exchange.flushRequest();
                responseHeaders = exchange.readResponseHeaders(true);
                exchange.responseHeadersStart();
                z10 = false;
            } else {
                responseHeaders = null;
                z10 = true;
            }
            if (responseHeaders != null) {
                exchange.noRequestBody();
                if (!exchange.getConnection().isMultiplexed$okhttp()) {
                    exchange.noNewExchangesOnConnection();
                }
            } else if (b0VarF.isDuplex()) {
                exchange.flushRequest();
                b0VarF.writeTo(Okio.buffer(exchange.createRequestBody(request, true)));
            } else {
                BufferedSink bufferedSinkBuffer = Okio.buffer(exchange.createRequestBody(request, false));
                b0VarF.writeTo(bufferedSinkBuffer);
                bufferedSinkBuffer.close();
            }
        }
        if (b0VarF == null || !b0VarF.isDuplex()) {
            exchange.finishRequest();
        }
        if (responseHeaders == null) {
            responseHeaders = exchange.readResponseHeaders(false);
            f0.m(responseHeaders);
            if (z10) {
                exchange.responseHeadersStart();
                z10 = false;
            }
        }
        c0 c0VarC = responseHeaders.E(request).u(exchange.getConnection().getHandshake()).F(jCurrentTimeMillis).C(System.currentTimeMillis()).c();
        int iX = c0VarC.x();
        if (iX == 100) {
            c0.a responseHeaders2 = exchange.readResponseHeaders(false);
            f0.m(responseHeaders2);
            if (z10) {
                exchange.responseHeadersStart();
            }
            c0VarC = responseHeaders2.E(request).u(exchange.getConnection().getHandshake()).F(jCurrentTimeMillis).C(System.currentTimeMillis()).c();
            iX = c0VarC.x();
        }
        exchange.responseHeadersEnd(c0VarC);
        c0 c0VarC2 = (this.forWebSocket && iX == 101) ? c0VarC.P().b(Util.EMPTY_RESPONSE).c() : c0VarC.P().b(exchange.openResponseBody(c0VarC)).c();
        if (kotlin.text.u.L1("close", c0VarC2.getRequest().i("Connection"), true) || kotlin.text.u.L1("close", c0.J(c0VarC2, "Connection", null, 2, null), true)) {
            exchange.noNewExchangesOnConnection();
        }
        if (iX == 204 || iX == 205) {
            d0 d0VarQ = c0VarC2.q();
            if ((d0VarQ != null ? d0VarQ.getContentLength() : -1L) > 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("HTTP ");
                sb2.append(iX);
                sb2.append(" had non-zero Content-Length: ");
                d0 d0VarQ2 = c0VarC2.q();
                sb2.append(d0VarQ2 != null ? Long.valueOf(d0VarQ2.getContentLength()) : null);
                throw new ProtocolException(sb2.toString());
            }
        }
        return c0VarC2;
    }
}
