package okhttp3.internal.http2;

import com.google.common.net.c;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import dl.d;
import dl.e;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import okhttp3.Protocol;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.http.ExchangeCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealInterceptorChain;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;
import okhttp3.s;
import okhttp3.z;
import okio.Sink;
import okio.Source;
import okio.Timeout;
import qb.a;

/* JADX INFO: compiled from: Http2ExchangeCodec.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 /2\u00020\u0001:\u0001/B'\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b-\u0010.J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\n\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\bH\u0016J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0017\u001a\u00020\bH\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u00060"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec;", "Lokhttp3/internal/http/ExchangeCodec;", "Lokhttp3/a0;", "request", "", "contentLength", "Lokio/Sink;", "createRequestBody", "Lkotlin/b2;", "writeRequestHeaders", "flushRequest", "finishRequest", "", "expectContinue", "Lokhttp3/c0$a;", "readResponseHeaders", "Lokhttp3/c0;", "response", "reportedContentLength", "Lokio/Source;", "openResponseBodySource", "Lokhttp3/s;", "trailers", "cancel", "Lokhttp3/internal/http2/Http2Stream;", "stream", "Lokhttp3/internal/http2/Http2Stream;", "Lokhttp3/Protocol;", SwitchDetailActivity.P, "Lokhttp3/Protocol;", a.f138642e, "Z", "Lokhttp3/internal/connection/RealConnection;", "connection", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", "Lokhttp3/internal/http/RealInterceptorChain;", "chain", "Lokhttp3/internal/http/RealInterceptorChain;", "Lokhttp3/internal/http2/Http2Connection;", "http2Connection", "Lokhttp3/internal/http2/Http2Connection;", "Lokhttp3/z;", "client", "<init>", "(Lokhttp3/z;Lokhttp3/internal/connection/RealConnection;Lokhttp3/internal/http/RealInterceptorChain;Lokhttp3/internal/http2/Http2Connection;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Http2ExchangeCodec implements ExchangeCodec {
    private static final String CONNECTION = "connection";
    private static final String HOST = "host";
    private static final String KEEP_ALIVE = "keep-alive";
    private static final String PROXY_CONNECTION = "proxy-connection";
    private static final String TRANSFER_ENCODING = "transfer-encoding";
    private volatile boolean canceled;
    private final RealInterceptorChain chain;

    @d
    private final RealConnection connection;
    private final Http2Connection http2Connection;
    private final Protocol protocol;
    private volatile Http2Stream stream;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final String TE = "te";
    private static final String ENCODING = "encoding";
    private static final String UPGRADE = "upgrade";
    private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableListOf("connection", "host", "keep-alive", "proxy-connection", TE, "transfer-encoding", ENCODING, UPGRADE, Header.TARGET_METHOD_UTF8, Header.TARGET_PATH_UTF8, Header.TARGET_SCHEME_UTF8, Header.TARGET_AUTHORITY_UTF8);
    private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableListOf("connection", "host", "keep-alive", "proxy-connection", TE, "transfer-encoding", ENCODING, UPGRADE);

    /* JADX INFO: compiled from: Http2ExchangeCodec.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000fR\u0014\u0010\u0016\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000fR\u0014\u0010\u0017\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000fR\u0014\u0010\u0018\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000fR\u0014\u0010\u0019\u001a\u00020\r8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000f¨\u0006\u001c"}, d2 = {"Lokhttp3/internal/http2/Http2ExchangeCodec$Companion;", "", "Lokhttp3/a0;", "request", "", "Lokhttp3/internal/http2/Header;", "http2HeadersList", "Lokhttp3/s;", "headerBlock", "Lokhttp3/Protocol;", SwitchDetailActivity.P, "Lokhttp3/c0$a;", "readHttp2HeadersList", "", "CONNECTION", "Ljava/lang/String;", "ENCODING", "HOST", "HTTP_2_SKIPPED_REQUEST_HEADERS", "Ljava/util/List;", "HTTP_2_SKIPPED_RESPONSE_HEADERS", "KEEP_ALIVE", "PROXY_CONNECTION", c.M, "TRANSFER_ENCODING", "UPGRADE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }

        @d
        public final List<Header> http2HeadersList(@d a0 request) {
            f0.p(request, "request");
            s sVarK = request.k();
            ArrayList arrayList = new ArrayList(sVarK.size() + 4);
            arrayList.add(new Header(Header.TARGET_METHOD, request.m()));
            arrayList.add(new Header(Header.TARGET_PATH, RequestLine.INSTANCE.requestPath(request.q())));
            String strI = request.i("Host");
            if (strI != null) {
                arrayList.add(new Header(Header.TARGET_AUTHORITY, strI));
            }
            arrayList.add(new Header(Header.TARGET_SCHEME, request.q().getScheme()));
            int size = sVarK.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strI2 = sVarK.i(i10);
                Locale locale = Locale.US;
                f0.o(locale, "Locale.US");
                if (strI2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                String lowerCase = strI2.toLowerCase(locale);
                f0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                if (!Http2ExchangeCodec.HTTP_2_SKIPPED_REQUEST_HEADERS.contains(lowerCase) || (f0.g(lowerCase, Http2ExchangeCodec.TE) && f0.g(sVarK.v(i10), "trailers"))) {
                    arrayList.add(new Header(lowerCase, sVarK.v(i10)));
                }
            }
            return arrayList;
        }

        @d
        public final c0.a readHttp2HeadersList(@d s headerBlock, @d Protocol protocol) throws IOException {
            f0.p(headerBlock, "headerBlock");
            f0.p(protocol, "protocol");
            s.a aVar = new s.a();
            int size = headerBlock.size();
            StatusLine statusLine = null;
            for (int i10 = 0; i10 < size; i10++) {
                String strI = headerBlock.i(i10);
                String strV = headerBlock.v(i10);
                if (f0.g(strI, ":status")) {
                    statusLine = StatusLine.INSTANCE.parse("HTTP/1.1 " + strV);
                } else if (!Http2ExchangeCodec.HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(strI)) {
                    aVar.g(strI, strV);
                }
            }
            if (statusLine != null) {
                return new c0.a().B(protocol).g(statusLine.code).y(statusLine.message).w(aVar.i());
            }
            throw new ProtocolException("Expected ':status' header not present");
        }
    }

    public Http2ExchangeCodec(@d z client, @d RealConnection connection, @d RealInterceptorChain chain, @d Http2Connection http2Connection) {
        f0.p(client, "client");
        f0.p(connection, "connection");
        f0.p(chain, "chain");
        f0.p(http2Connection, "http2Connection");
        this.connection = connection;
        this.chain = chain;
        this.http2Connection = http2Connection;
        List<Protocol> listG0 = client.g0();
        Protocol protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        this.protocol = listG0.contains(protocol) ? protocol : Protocol.HTTP_2;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void cancel() {
        this.canceled = true;
        Http2Stream http2Stream = this.stream;
        if (http2Stream != null) {
            http2Stream.closeLater(ErrorCode.CANCEL);
        }
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @d
    public Sink createRequestBody(@d a0 request, long contentLength) {
        f0.p(request, "request");
        Http2Stream http2Stream = this.stream;
        f0.m(http2Stream);
        return http2Stream.getSink();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void finishRequest() throws IOException {
        Http2Stream http2Stream = this.stream;
        f0.m(http2Stream);
        http2Stream.getSink().close();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void flushRequest() throws IOException {
        this.http2Connection.flush();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @d
    public RealConnection getConnection() {
        return this.connection;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @d
    public Source openResponseBodySource(@d c0 response) {
        f0.p(response, "response");
        Http2Stream http2Stream = this.stream;
        f0.m(http2Stream);
        return http2Stream.getSource();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @e
    public c0.a readResponseHeaders(boolean expectContinue) throws IOException {
        Http2Stream http2Stream = this.stream;
        f0.m(http2Stream);
        c0.a http2HeadersList = INSTANCE.readHttp2HeadersList(http2Stream.takeHeaders(), this.protocol);
        if (expectContinue && http2HeadersList.getCode() == 100) {
            return null;
        }
        return http2HeadersList;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public long reportedContentLength(@d c0 response) {
        f0.p(response, "response");
        if (HttpHeaders.promisesBody(response)) {
            return Util.headersContentLength(response);
        }
        return 0L;
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    @d
    public s trailers() {
        Http2Stream http2Stream = this.stream;
        f0.m(http2Stream);
        return http2Stream.trailers();
    }

    @Override // okhttp3.internal.http.ExchangeCodec
    public void writeRequestHeaders(@d a0 request) throws IOException {
        f0.p(request, "request");
        if (this.stream != null) {
            return;
        }
        this.stream = this.http2Connection.newStream(INSTANCE.http2HeadersList(request), request.f() != null);
        if (this.canceled) {
            Http2Stream http2Stream = this.stream;
            f0.m(http2Stream);
            http2Stream.closeLater(ErrorCode.CANCEL);
            throw new IOException("Canceled");
        }
        Http2Stream http2Stream2 = this.stream;
        f0.m(http2Stream2);
        Timeout timeout = http2Stream2.readTimeout();
        long readTimeoutMillis = this.chain.getReadTimeoutMillis();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        timeout.timeout(readTimeoutMillis, timeUnit);
        Http2Stream http2Stream3 = this.stream;
        f0.m(http2Stream3);
        http2Stream3.writeTimeout().timeout(this.chain.getWriteTimeoutMillis(), timeUnit);
    }
}
