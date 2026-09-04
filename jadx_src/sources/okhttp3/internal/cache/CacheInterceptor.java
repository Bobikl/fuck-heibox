package okhttp3.internal.cache;

import dl.d;
import dl.e;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.c;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealCall;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.p;
import okhttp3.s;
import okhttp3.u;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: compiled from: CacheInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0006\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor;", "Lokhttp3/u;", "Lokhttp3/internal/cache/CacheRequest;", "cacheRequest", "Lokhttp3/c0;", "response", "cacheWritingResponse", "Lokhttp3/u$a;", "chain", "intercept", "Lokhttp3/c;", "cache", "Lokhttp3/c;", "getCache$okhttp", "()Lokhttp3/c;", "<init>", "(Lokhttp3/c;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class CacheInterceptor implements u {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @e
    private final c cache;

    /* JADX INFO: compiled from: CacheInterceptor.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0014\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/cache/CacheInterceptor$Companion;", "", "Lokhttp3/c0;", "response", "stripBody", "Lokhttp3/s;", "cachedHeaders", "networkHeaders", "combine", "", "fieldName", "", "isEndToEnd", "isContentSpecificHeader", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final s combine(s cachedHeaders, s networkHeaders) {
            s.a aVar = new s.a();
            int size = cachedHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strI = cachedHeaders.i(i10);
                String strV = cachedHeaders.v(i10);
                if ((!kotlin.text.u.L1(com.google.common.net.c.f58823g, strI, true) || !kotlin.text.u.v2(strV, "1", false, 2, null)) && (isContentSpecificHeader(strI) || !isEndToEnd(strI) || networkHeaders.e(strI) == null)) {
                    aVar.g(strI, strV);
                }
            }
            int size2 = networkHeaders.size();
            for (int i11 = 0; i11 < size2; i11++) {
                String strI2 = networkHeaders.i(i11);
                if (!isContentSpecificHeader(strI2) && isEndToEnd(strI2)) {
                    aVar.g(strI2, networkHeaders.v(i11));
                }
            }
            return aVar.i();
        }

        private final boolean isContentSpecificHeader(String fieldName) {
            return kotlin.text.u.L1("Content-Length", fieldName, true) || kotlin.text.u.L1("Content-Encoding", fieldName, true) || kotlin.text.u.L1("Content-Type", fieldName, true);
        }

        private final boolean isEndToEnd(String fieldName) {
            return (kotlin.text.u.L1("Connection", fieldName, true) || kotlin.text.u.L1(com.google.common.net.c.f58866u0, fieldName, true) || kotlin.text.u.L1("Proxy-Authenticate", fieldName, true) || kotlin.text.u.L1(com.google.common.net.c.H, fieldName, true) || kotlin.text.u.L1(com.google.common.net.c.M, fieldName, true) || kotlin.text.u.L1("Trailers", fieldName, true) || kotlin.text.u.L1("Transfer-Encoding", fieldName, true) || kotlin.text.u.L1(com.google.common.net.c.N, fieldName, true)) ? false : true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c0 stripBody(c0 response) {
            return (response != null ? response.q() : null) != null ? response.P().b(null).c() : response;
        }
    }

    public CacheInterceptor(@e c cVar) {
        this.cache = cVar;
    }

    private final c0 cacheWritingResponse(final CacheRequest cacheRequest, c0 response) throws IOException {
        if (cacheRequest == null) {
            return response;
        }
        Sink body = cacheRequest.getBody();
        d0 d0VarQ = response.q();
        f0.m(d0VarQ);
        final BufferedSource source = d0VarQ.getBodySource();
        final BufferedSink bufferedSinkBuffer = Okio.buffer(body);
        Source source2 = new Source() { // from class: okhttp3.internal.cache.CacheInterceptor$cacheWritingResponse$cacheWritingSource$1
            private boolean cacheRequestClosed;

            @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
                    this.cacheRequestClosed = true;
                    cacheRequest.abort();
                }
                source.close();
            }

            @Override // okio.Source
            public long read(@d Buffer sink, long byteCount) throws IOException {
                f0.p(sink, "sink");
                try {
                    long j10 = source.read(sink, byteCount);
                    if (j10 != -1) {
                        sink.copyTo(bufferedSinkBuffer.getBuffer(), sink.size() - j10, j10);
                        bufferedSinkBuffer.emitCompleteSegments();
                        return j10;
                    }
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        bufferedSinkBuffer.close();
                    }
                    return -1L;
                } catch (IOException e10) {
                    if (!this.cacheRequestClosed) {
                        this.cacheRequestClosed = true;
                        cacheRequest.abort();
                    }
                    throw e10;
                }
            }

            @Override // okio.Source
            @d
            /* JADX INFO: renamed from: timeout */
            public Timeout getTimeout() {
                return source.getTimeout();
            }
        };
        return response.P().b(new RealResponseBody(c0.J(response, "Content-Type", null, 2, null), response.q().getContentLength(), Okio.buffer(source2))).c();
    }

    @e
    /* JADX INFO: renamed from: getCache$okhttp, reason: from getter */
    public final c getCache() {
        return this.cache;
    }

    @Override // okhttp3.u
    @d
    public c0 intercept(@d u.a chain) throws IOException {
        p eventListener;
        d0 d0VarQ;
        d0 d0VarQ2;
        d0 d0VarQ3;
        f0.p(chain, "chain");
        okhttp3.e eVarCall = chain.call();
        c cVar = this.cache;
        c0 c0VarF = cVar != null ? cVar.f(chain.request()) : null;
        CacheStrategy cacheStrategyCompute = new CacheStrategy.Factory(System.currentTimeMillis(), chain.request(), c0VarF).compute();
        a0 networkRequest = cacheStrategyCompute.getNetworkRequest();
        c0 cacheResponse = cacheStrategyCompute.getCacheResponse();
        c cVar2 = this.cache;
        if (cVar2 != null) {
            cVar2.C(cacheStrategyCompute);
        }
        RealCall realCall = (RealCall) (eVarCall instanceof RealCall ? eVarCall : null);
        if (realCall == null || (eventListener = realCall.getEventListener()) == null) {
            eventListener = p.NONE;
        }
        if (c0VarF != null && cacheResponse == null && (d0VarQ3 = c0VarF.q()) != null) {
            Util.closeQuietly(d0VarQ3);
        }
        if (networkRequest == null && cacheResponse == null) {
            c0 c0VarC = new c0.a().E(chain.request()).B(Protocol.HTTP_1_1).g(504).y("Unsatisfiable Request (only-if-cached)").b(Util.EMPTY_RESPONSE).F(-1L).C(System.currentTimeMillis()).c();
            eventListener.satisfactionFailure(eVarCall, c0VarC);
            return c0VarC;
        }
        if (networkRequest == null) {
            f0.m(cacheResponse);
            c0 c0VarC2 = cacheResponse.P().d(INSTANCE.stripBody(cacheResponse)).c();
            eventListener.cacheHit(eVarCall, c0VarC2);
            return c0VarC2;
        }
        if (cacheResponse != null) {
            eventListener.cacheConditionalHit(eVarCall, cacheResponse);
        } else if (this.cache != null) {
            eventListener.cacheMiss(eVarCall);
        }
        try {
            c0 c0VarProceed = chain.proceed(networkRequest);
            if (c0VarProceed == null && c0VarF != null && (d0VarQ2 = c0VarF.q()) != null) {
                Util.closeQuietly(d0VarQ2);
            }
            if (cacheResponse != null) {
                if (c0VarProceed != null && c0VarProceed.x() == 304) {
                    c0.a aVarP = cacheResponse.P();
                    Companion companion = INSTANCE;
                    c0 c0VarC3 = aVarP.w(companion.combine(cacheResponse.getHeaders(), c0VarProceed.getHeaders())).F(c0VarProceed.getSentRequestAtMillis()).C(c0VarProceed.getReceivedResponseAtMillis()).d(companion.stripBody(cacheResponse)).z(companion.stripBody(c0VarProceed)).c();
                    d0 d0VarQ4 = c0VarProceed.q();
                    f0.m(d0VarQ4);
                    d0VarQ4.close();
                    c cVar3 = this.cache;
                    f0.m(cVar3);
                    cVar3.A();
                    this.cache.I(cacheResponse, c0VarC3);
                    eventListener.cacheHit(eVarCall, c0VarC3);
                    return c0VarC3;
                }
                d0 d0VarQ5 = cacheResponse.q();
                if (d0VarQ5 != null) {
                    Util.closeQuietly(d0VarQ5);
                }
            }
            f0.m(c0VarProceed);
            c0.a aVarP2 = c0VarProceed.P();
            Companion companion2 = INSTANCE;
            c0 c0VarC4 = aVarP2.d(companion2.stripBody(cacheResponse)).z(companion2.stripBody(c0VarProceed)).c();
            if (this.cache != null) {
                if (HttpHeaders.promisesBody(c0VarC4) && CacheStrategy.INSTANCE.isCacheable(c0VarC4, networkRequest)) {
                    c0 c0VarCacheWritingResponse = cacheWritingResponse(this.cache.r(c0VarC4), c0VarC4);
                    if (cacheResponse != null) {
                        eventListener.cacheMiss(eVarCall);
                    }
                    return c0VarCacheWritingResponse;
                }
                if (HttpMethod.INSTANCE.invalidatesCache(networkRequest.m())) {
                    try {
                        this.cache.s(networkRequest);
                    } catch (IOException unused) {
                    }
                }
            }
            return c0VarC4;
        } catch (Throwable th2) {
            if (c0VarF != null && (d0VarQ = c0VarF.q()) != null) {
                Util.closeQuietly(d0VarQ);
            }
            throw th2;
        }
    }
}
