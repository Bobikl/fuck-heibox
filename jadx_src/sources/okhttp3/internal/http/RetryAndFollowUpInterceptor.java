package okhttp3.internal.http;

import com.google.common.net.c;
import com.max.hbwallet.bean.MallCouponObj;
import dl.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.text.Regex;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.e0;
import okhttp3.internal.Util;
import okhttp3.internal.connection.Exchange;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.http2.ConnectionShutdownException;
import okhttp3.t;
import okhttp3.u;
import okhttp3.z;

/* JADX INFO: compiled from: RetryAndFollowUpInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000  2\u00020\u0001:\u0001 B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001e\u0010\u001fJ(\u0010\n\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002J\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0002J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0002J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002J\u0018\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002J\u0010\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!"}, d2 = {"Lokhttp3/internal/http/RetryAndFollowUpInterceptor;", "Lokhttp3/u;", "Ljava/io/IOException;", "e", "Lokhttp3/internal/connection/RealCall;", "call", "Lokhttp3/a0;", "userRequest", "", "requestSendStarted", "recover", "requestIsOneShot", "isRecoverable", "Lokhttp3/c0;", "userResponse", "Lokhttp3/internal/connection/Exchange;", MallCouponObj.TYPE_EXCHANGE, "followUpRequest", "", "method", "buildRedirectRequest", "", "defaultDelay", "retryAfter", "Lokhttp3/u$a;", "chain", "intercept", "Lokhttp3/z;", "client", "Lokhttp3/z;", "<init>", "(Lokhttp3/z;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class RetryAndFollowUpInterceptor implements u {
    private static final int MAX_FOLLOW_UPS = 20;
    private final z client;

    public RetryAndFollowUpInterceptor(@d z client) {
        f0.p(client, "client");
        this.client = client;
    }

    private final a0 buildRedirectRequest(c0 userResponse, String method) {
        String strJ;
        t tVarW;
        if (!this.client.getFollowRedirects() || (strJ = c0.J(userResponse, "Location", null, 2, null)) == null || (tVarW = userResponse.getRequest().q().W(strJ)) == null) {
            return null;
        }
        if (!f0.g(tVarW.getScheme(), userResponse.getRequest().q().getScheme()) && !this.client.getFollowSslRedirects()) {
            return null;
        }
        a0.a aVarN = userResponse.getRequest().n();
        if (HttpMethod.permitsRequestBody(method)) {
            int iX = userResponse.x();
            HttpMethod httpMethod = HttpMethod.INSTANCE;
            boolean z10 = httpMethod.redirectsWithBody(method) || iX == 308 || iX == 307;
            if (!httpMethod.redirectsToGet(method) || iX == 308 || iX == 307) {
                aVarN.p(method, z10 ? userResponse.getRequest().f() : null);
            } else {
                aVarN.p("GET", null);
            }
            if (!z10) {
                aVarN.t("Transfer-Encoding");
                aVarN.t("Content-Length");
                aVarN.t("Content-Type");
            }
        }
        if (!Util.canReuseConnectionFor(userResponse.getRequest().q(), tVarW)) {
            aVarN.t("Authorization");
        }
        return aVarN.D(tVarW).b();
    }

    private final a0 followUpRequest(c0 userResponse, Exchange exchange) throws IOException {
        RealConnection connection;
        e0 route = (exchange == null || (connection = exchange.getConnection()) == null) ? null : connection.getRoute();
        int iX = userResponse.x();
        String strM = userResponse.getRequest().m();
        if (iX != 307 && iX != 308) {
            if (iX == 401) {
                return this.client.getAuthenticator().authenticate(route, userResponse);
            }
            if (iX == 421) {
                b0 b0VarF = userResponse.getRequest().f();
                if ((b0VarF != null && b0VarF.isOneShot()) || exchange == null || !exchange.isCoalescedConnection$okhttp()) {
                    return null;
                }
                exchange.getConnection().noCoalescedConnections$okhttp();
                return userResponse.getRequest();
            }
            if (iX == 503) {
                c0 priorResponse = userResponse.getPriorResponse();
                if ((priorResponse == null || priorResponse.x() != 503) && retryAfter(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            if (iX == 407) {
                f0.m(route);
                if (route.e().type() == Proxy.Type.HTTP) {
                    return this.client.getProxyAuthenticator().authenticate(route, userResponse);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (iX == 408) {
                if (!this.client.getRetryOnConnectionFailure()) {
                    return null;
                }
                b0 b0VarF2 = userResponse.getRequest().f();
                if (b0VarF2 != null && b0VarF2.isOneShot()) {
                    return null;
                }
                c0 priorResponse2 = userResponse.getPriorResponse();
                if ((priorResponse2 == null || priorResponse2.x() != 408) && retryAfter(userResponse, 0) <= 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            switch (iX) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return buildRedirectRequest(userResponse, strM);
    }

    private final boolean isRecoverable(IOException e10, boolean requestSendStarted) {
        if (e10 instanceof ProtocolException) {
            return false;
        }
        if (e10 instanceof InterruptedIOException) {
            return (e10 instanceof SocketTimeoutException) && !requestSendStarted;
        }
        return (((e10 instanceof SSLHandshakeException) && (e10.getCause() instanceof CertificateException)) || (e10 instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean recover(IOException e10, RealCall call, a0 userRequest, boolean requestSendStarted) {
        if (this.client.getRetryOnConnectionFailure()) {
            return !(requestSendStarted && requestIsOneShot(e10, userRequest)) && isRecoverable(e10, requestSendStarted) && call.retryAfterFailure();
        }
        return false;
    }

    private final boolean requestIsOneShot(IOException e10, a0 userRequest) {
        b0 b0VarF = userRequest.f();
        return (b0VarF != null && b0VarF.isOneShot()) || (e10 instanceof FileNotFoundException);
    }

    private final int retryAfter(c0 userResponse, int defaultDelay) {
        String strJ = c0.J(userResponse, c.A0, null, 2, null);
        if (strJ == null) {
            return defaultDelay;
        }
        if (!new Regex("\\d+").k(strJ)) {
            return Integer.MAX_VALUE;
        }
        Integer numValueOf = Integer.valueOf(strJ);
        f0.o(numValueOf, "Integer.valueOf(header)");
        return numValueOf.intValue();
    }

    @Override // okhttp3.u
    @d
    public c0 intercept(@d u.a chain) throws IOException {
        f0.p(chain, "chain");
        RealInterceptorChain realInterceptorChain = (RealInterceptorChain) chain;
        a0 request = realInterceptorChain.getRequest();
        RealCall call = realInterceptorChain.getCall();
        List listE = CollectionsKt__CollectionsKt.E();
        c0 c0Var = null;
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            call.enterNetworkInterceptorExchange(request, z10);
            try {
                if (call.getCanceled()) {
                    throw new IOException("Canceled");
                }
                try {
                    c0 c0VarProceed = realInterceptorChain.proceed(request);
                    if (c0Var != null) {
                        c0VarProceed = c0VarProceed.P().A(c0Var.P().b(null).c()).c();
                    }
                    c0Var = c0VarProceed;
                    Exchange interceptorScopedExchange = call.getInterceptorScopedExchange();
                    a0 a0VarFollowUpRequest = followUpRequest(c0Var, interceptorScopedExchange);
                    if (a0VarFollowUpRequest == null) {
                        if (interceptorScopedExchange != null && interceptorScopedExchange.getIsDuplex()) {
                            call.timeoutEarlyExit();
                        }
                        call.exitNetworkInterceptorExchange$okhttp(false);
                        return c0Var;
                    }
                    b0 b0VarF = a0VarFollowUpRequest.f();
                    if (b0VarF != null && b0VarF.isOneShot()) {
                        call.exitNetworkInterceptorExchange$okhttp(false);
                        return c0Var;
                    }
                    d0 d0VarQ = c0Var.q();
                    if (d0VarQ != null) {
                        Util.closeQuietly(d0VarQ);
                    }
                    i10++;
                    if (i10 > 20) {
                        throw new ProtocolException("Too many follow-up requests: " + i10);
                    }
                    call.exitNetworkInterceptorExchange$okhttp(true);
                    request = a0VarFollowUpRequest;
                    z10 = true;
                } catch (IOException e10) {
                    if (!recover(e10, call, request, !(e10 instanceof ConnectionShutdownException))) {
                        throw Util.withSuppressed(e10, listE);
                    }
                    listE = CollectionsKt___CollectionsKt.z4(listE, e10);
                    call.exitNetworkInterceptorExchange$okhttp(true);
                    z10 = false;
                } catch (RouteException e11) {
                    if (!recover(e11.getLastConnectException(), call, request, false)) {
                        throw Util.withSuppressed(e11.getFirstConnectException(), listE);
                    }
                    listE = CollectionsKt___CollectionsKt.z4(listE, e11.getFirstConnectException());
                    call.exitNetworkInterceptorExchange$okhttp(true);
                    z10 = false;
                }
            } catch (Throwable th2) {
                call.exitNetworkInterceptorExchange$okhttp(true);
                throw th2;
            }
        }
    }
}
