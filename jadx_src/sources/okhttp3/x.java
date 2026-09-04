package okhttp3;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import okhttp3.internal.http1.HeadersReader;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;
import okio.Options;
import okio.Source;
import okio.Timeout;

/* JADX INFO: compiled from: MultipartReader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 )2\u00020\u0001:\u0003*\n\rB\u0017\u0012\u0006\u0010\u001f\u001a\u00020\u001c\u0012\u0006\u0010#\u001a\u00020 ¢\u0006\u0004\b$\u0010%B\u0011\b\u0016\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b$\u0010(J\u0010\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0018\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u001c\u0010\u001b\u001a\b\u0018\u00010\u0019R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u001aR\u0014\u0010\u001f\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0017\u0010#\u001a\u00020 8\u0007¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\u0017\u0010\"¨\u0006+"}, d2 = {"Lokhttp3/x;", "Ljava/io/Closeable;", "", "maxResult", "g", "Lokhttp3/x$b;", "i", "Lkotlin/b2;", "close", "Lokio/ByteString;", "b", "Lokio/ByteString;", "dashDashBoundary", ak.aF, "crlfDashDashBoundary", "", "d", "I", "partCount", "", "e", "Z", "closed", "f", "noMoreParts", "Lokhttp3/x$c;", "Lokhttp3/x$c;", "currentPart", "Lokio/BufferedSource;", RXScreenCaptureService.KEY_HEIGHT, "Lokio/BufferedSource;", "source", "", "Ljava/lang/String;", "()Ljava/lang/String;", "boundary", "<init>", "(Lokio/BufferedSource;Ljava/lang/String;)V", "Lokhttp3/d0;", "response", "(Lokhttp3/d0;)V", "k", ak.av, "okhttp"}, k = 1, mv = {1, 4, 0})
public final class x implements Closeable {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final Options f132704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ByteString dashDashBoundary;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ByteString crlfDashDashBoundary;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int partCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean noMoreParts;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private c currentPart;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final BufferedSource source;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String boundary;

    /* JADX INFO: renamed from: okhttp3.x$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MultipartReader.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lokhttp3/x$a;", "", "Lokio/Options;", "afterBoundaryOptions", "Lokio/Options;", ak.av, "()Lokio/Options;", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        public final Options a() {
            return x.f132704j;
        }
    }

    /* JADX INFO: compiled from: MultipartReader.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u0003\u001a\u00020\u0002H\u0096\u0001R\u0017\u0010\b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0005\u0010\u0007R\u0017\u0010\u000e\u001a\u00020\t8\u0007¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lokhttp3/x$b;", "Ljava/io/Closeable;", "Lkotlin/b2;", "close", "Lokhttp3/s;", "b", "Lokhttp3/s;", "()Lokhttp3/s;", "headers", "Lokio/BufferedSource;", ak.aF, "Lokio/BufferedSource;", ak.av, "()Lokio/BufferedSource;", "body", "<init>", "(Lokhttp3/s;Lokio/BufferedSource;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class b implements Closeable {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final s headers;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final BufferedSource body;

        public b(@dl.d s headers, @dl.d BufferedSource body) {
            kotlin.jvm.internal.f0.p(headers, "headers");
            kotlin.jvm.internal.f0.p(body, "body");
            this.headers = headers;
            this.body = body;
        }

        @dl.d
        @xh.h(name = "body")
        /* JADX INFO: renamed from: a, reason: from getter */
        public final BufferedSource getBody() {
            return this.body;
        }

        @dl.d
        @xh.h(name = "headers")
        /* JADX INFO: renamed from: b, reason: from getter */
        public final s getHeaders() {
            return this.headers;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.body.close();
        }
    }

    /* JADX INFO: compiled from: MultipartReader.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/x$c;", "Lokio/Source;", "Lkotlin/b2;", "close", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", l5.a.f130839h0, "b", "Lokio/Timeout;", "<init>", "(Lokhttp3/x;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class c implements Source {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Timeout timeout = new Timeout();

        public c() {
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (kotlin.jvm.internal.f0.g(x.this.currentPart, this)) {
                x.this.currentPart = null;
            }
        }

        @Override // okio.Source
        public long read(@dl.d Buffer sink, long byteCount) {
            kotlin.jvm.internal.f0.p(sink, "sink");
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            if (!kotlin.jvm.internal.f0.g(x.this.currentPart, this)) {
                throw new IllegalStateException("closed".toString());
            }
            Timeout timeout = x.this.source.getTimeout();
            Timeout timeout2 = this.timeout;
            long timeoutNanos = timeout.getTimeoutNanos();
            timeout.timeout(Timeout.INSTANCE.minTimeout(timeout2.getTimeoutNanos(), timeout.getTimeoutNanos()), TimeUnit.NANOSECONDS);
            if (!timeout.getHasDeadline()) {
                if (timeout2.getHasDeadline()) {
                    timeout.deadlineNanoTime(timeout2.deadlineNanoTime());
                }
                try {
                    long jG = x.this.g(byteCount);
                    return jG == 0 ? -1L : x.this.source.read(sink, jG);
                } finally {
                    timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                    if (timeout2.getHasDeadline()) {
                        timeout.clearDeadline();
                    }
                }
            }
            long jDeadlineNanoTime = timeout.deadlineNanoTime();
            if (timeout2.getHasDeadline()) {
                timeout.deadlineNanoTime(Math.min(timeout.deadlineNanoTime(), timeout2.deadlineNanoTime()));
            }
            try {
                long jG2 = x.this.g(byteCount);
                return jG2 == 0 ? -1L : x.this.source.read(sink, jG2);
            } finally {
                timeout.timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (timeout2.getHasDeadline()) {
                    timeout.deadlineNanoTime(jDeadlineNanoTime);
                }
            }
        }

        @Override // okio.Source
        @dl.d
        /* JADX INFO: renamed from: timeout, reason: from getter */
        public Timeout getTimeout() {
            return this.timeout;
        }
    }

    static {
        Options.Companion companion = Options.INSTANCE;
        ByteString.Companion companion2 = ByteString.INSTANCE;
        f132704j = companion.of(companion2.encodeUtf8("\r\n"), companion2.encodeUtf8("--"), companion2.encodeUtf8(" "), companion2.encodeUtf8("\t"));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x(@dl.d d0 response) throws IOException {
        String strI;
        kotlin.jvm.internal.f0.p(response, "response");
        BufferedSource source = response.getSource();
        v f132480d = response.getF132480d();
        if (f132480d == null || (strI = f132480d.i("boundary")) == null) {
            throw new ProtocolException("expected the Content-Type to have a boundary parameter");
        }
        this(source, strI);
    }

    public x(@dl.d BufferedSource source, @dl.d String boundary) throws IOException {
        kotlin.jvm.internal.f0.p(source, "source");
        kotlin.jvm.internal.f0.p(boundary, "boundary");
        this.source = source;
        this.boundary = boundary;
        this.dashDashBoundary = new Buffer().writeUtf8("--").writeUtf8(boundary).readByteString();
        this.crlfDashDashBoundary = new Buffer().writeUtf8("\r\n--").writeUtf8(boundary).readByteString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long g(long maxResult) throws IOException {
        this.source.require(this.crlfDashDashBoundary.size());
        long jIndexOf = this.source.getBuffer().indexOf(this.crlfDashDashBoundary);
        return jIndexOf == -1 ? Math.min(maxResult, (this.source.getBuffer().size() - ((long) this.crlfDashDashBoundary.size())) + 1) : Math.min(maxResult, jIndexOf);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.closed) {
            return;
        }
        this.closed = true;
        this.currentPart = null;
        this.source.close();
    }

    @dl.d
    @xh.h(name = "boundary")
    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getBoundary() {
        return this.boundary;
    }

    @dl.e
    public final b i() throws IOException {
        if (!(!this.closed)) {
            throw new IllegalStateException("closed".toString());
        }
        if (this.noMoreParts) {
            return null;
        }
        if (this.partCount == 0 && this.source.rangeEquals(0L, this.dashDashBoundary)) {
            this.source.skip(this.dashDashBoundary.size());
        } else {
            while (true) {
                long jG = g(8192L);
                if (jG == 0) {
                    break;
                }
                this.source.skip(jG);
            }
            this.source.skip(this.crlfDashDashBoundary.size());
        }
        boolean z10 = false;
        while (true) {
            int iSelect = this.source.select(f132704j);
            if (iSelect == -1) {
                throw new ProtocolException("unexpected characters after boundary");
            }
            if (iSelect == 0) {
                this.partCount++;
                s headers = new HeadersReader(this.source).readHeaders();
                c cVar = new c();
                this.currentPart = cVar;
                return new b(headers, Okio.buffer(cVar));
            }
            if (iSelect == 1) {
                if (z10) {
                    throw new ProtocolException("unexpected characters after boundary");
                }
                if (this.partCount == 0) {
                    throw new ProtocolException("expected at least 1 part");
                }
                this.noMoreParts = true;
                return null;
            }
            if (iSelect == 2 || iSelect == 3) {
                z10 = true;
            }
        }
    }
}
