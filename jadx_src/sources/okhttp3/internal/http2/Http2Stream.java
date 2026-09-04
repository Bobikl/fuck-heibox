package okhttp3.internal.http2;

import com.alipay.zoloz.android.phone.mrpc.core.f;
import com.google.android.exoplayer2.source.rtsp.k0;
import com.taobao.accs.common.Constants;
import dl.d;
import dl.e;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.List;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import l5.a;
import okhttp3.internal.Util;
import okhttp3.s;
import okio.AsyncTimeout;
import okio.Buffer;
import okio.BufferedSource;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* JADX INFO: compiled from: Http2Stream.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 k2\u00020\u0001:\u0004klmnB3\b\u0000\u0012\u0006\u0010]\u001a\u00020\u001f\u0012\u0006\u0010b\u001a\u00020a\u0012\u0006\u0010\u000e\u001a\u00020\u0006\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\b\u0010\"\u001a\u0004\u0018\u00010\b¢\u0006\u0004\bi\u0010jJ\u001a\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\n\u001a\u00020\bJ$\u0010\u0011\u001a\u00020\u00102\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006J\u000e\u0010\u0012\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\bJ\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0018\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004J\u000e\u0010\u001c\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010!\u001a\u00020\u00102\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001fJ\u0016\u0010$\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\u0006J\u000e\u0010%\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010(\u001a\u00020\u0010H\u0000¢\u0006\u0004\b&\u0010'J\u000e\u0010+\u001a\u00020\u00102\u0006\u0010*\u001a\u00020)J\u000f\u0010-\u001a\u00020\u0010H\u0000¢\u0006\u0004\b,\u0010'J\u000f\u0010/\u001a\u00020\u0010H\u0000¢\u0006\u0004\b.\u0010'R*\u00101\u001a\u00020)2\u0006\u00100\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R*\u00107\u001a\u00020)2\u0006\u00100\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R*\u0010:\u001a\u00020)2\u0006\u00100\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R*\u0010=\u001a\u00020)2\u0006\u00100\u001a\u00020)8\u0006@@X\u0086\u000e¢\u0006\u0012\n\u0004\b=\u00102\u001a\u0004\b>\u00104\"\u0004\b?\u00106R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\b0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0016\u0010C\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u001e\u0010\u001e\u001a\u00060ER\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010F\u001a\u0004\bG\u0010HR\u001e\u0010J\u001a\u00060IR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010MR\u001e\u0010\u0014\u001a\u00060NR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010O\u001a\u0004\bP\u0010QR\u001e\u0010\u0015\u001a\u00060NR\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0015\u0010O\u001a\u0004\bR\u0010QR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028@@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R\u0017\u0010]\u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u0017\u0010b\u001a\u00020a8\u0006¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010eR\u0011\u0010f\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0011\u0010h\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\bh\u0010g¨\u0006o"}, d2 = {"Lokhttp3/internal/http2/Http2Stream;", "", "Lokhttp3/internal/http2/ErrorCode;", Constants.KEY_ERROR_CODE, "Ljava/io/IOException;", "errorException", "", "closeInternal", "Lokhttp3/s;", "takeHeaders", "trailers", "", "Lokhttp3/internal/http2/Header;", "responseHeaders", "outFinished", "flushHeaders", "Lkotlin/b2;", "writeHeaders", "enqueueTrailers", "Lokio/Timeout;", "readTimeout", "writeTimeout", "Lokio/Source;", "getSource", "Lokio/Sink;", "getSink", "rstStatusCode", "close", "closeLater", "Lokio/BufferedSource;", "source", "", k0.f48801p, "receiveData", "headers", "inFinished", "receiveHeaders", "receiveRstStream", "cancelStreamIfNecessary$okhttp", "()V", "cancelStreamIfNecessary", "", "delta", "addBytesToWriteWindow", "checkOutNotClosed$okhttp", "checkOutNotClosed", "waitForIo$okhttp", "waitForIo", "<set-?>", "readBytesTotal", "J", "getReadBytesTotal", "()J", "setReadBytesTotal$okhttp", "(J)V", "readBytesAcknowledged", "getReadBytesAcknowledged", "setReadBytesAcknowledged$okhttp", "writeBytesTotal", "getWriteBytesTotal", "setWriteBytesTotal$okhttp", "writeBytesMaximum", "getWriteBytesMaximum", "setWriteBytesMaximum$okhttp", "Ljava/util/ArrayDeque;", "headersQueue", "Ljava/util/ArrayDeque;", "hasResponseHeaders", "Z", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSource;", "getSource$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "sink", "Lokhttp3/internal/http2/Http2Stream$FramingSink;", "getSink$okhttp", "()Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getReadTimeout$okhttp", "()Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "getWriteTimeout$okhttp", "Lokhttp3/internal/http2/ErrorCode;", "getErrorCode$okhttp", "()Lokhttp3/internal/http2/ErrorCode;", "setErrorCode$okhttp", "(Lokhttp3/internal/http2/ErrorCode;)V", "Ljava/io/IOException;", "getErrorException$okhttp", "()Ljava/io/IOException;", "setErrorException$okhttp", "(Ljava/io/IOException;)V", "id", "I", "getId", "()I", "Lokhttp3/internal/http2/Http2Connection;", f.f39665q, "Lokhttp3/internal/http2/Http2Connection;", "getConnection", "()Lokhttp3/internal/http2/Http2Connection;", "isOpen", "()Z", "isLocallyInitiated", "<init>", "(ILokhttp3/internal/http2/Http2Connection;ZZLokhttp3/s;)V", "Companion", "FramingSink", "FramingSource", "StreamTimeout", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Http2Stream {
    public static final long EMIT_BUFFER_SIZE = 16384;

    @d
    private final Http2Connection connection;

    @e
    private ErrorCode errorCode;

    @e
    private IOException errorException;
    private boolean hasResponseHeaders;
    private final ArrayDeque<s> headersQueue;
    private final int id;
    private long readBytesAcknowledged;
    private long readBytesTotal;

    @d
    private final StreamTimeout readTimeout;

    @d
    private final FramingSink sink;

    @d
    private final FramingSource source;
    private long writeBytesMaximum;
    private long writeBytesTotal;

    @d
    private final StreamTimeout writeTimeout;

    /* JADX INFO: compiled from: Http2Stream.kt */
    @Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\b\u0010\u000e\u001a\u00020\u0004H\u0016R\u0014\u0010\u000f\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R$\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001e\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006#"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSink;", "Lokio/Sink;", "", "outFinishedOnLastFrame", "Lkotlin/b2;", "emitFrame", "Lokio/Buffer;", "source", "", "byteCount", "write", "flush", "Lokio/Timeout;", a.f130839h0, "close", "sendBuffer", "Lokio/Buffer;", "Lokhttp3/s;", "trailers", "Lokhttp3/s;", "getTrailers", "()Lokhttp3/s;", "setTrailers", "(Lokhttp3/s;)V", "closed", "Z", "getClosed", "()Z", "setClosed", "(Z)V", "finished", "getFinished", "setFinished", "<init>", "(Lokhttp3/internal/http2/Http2Stream;Z)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class FramingSink implements Sink {
        private boolean closed;
        private boolean finished;
        private final Buffer sendBuffer;

        @e
        private s trailers;

        public FramingSink(boolean z10) {
            this.finished = z10;
            this.sendBuffer = new Buffer();
        }

        public /* synthetic */ FramingSink(Http2Stream http2Stream, boolean z10, int i10, u uVar) {
            this((i10 & 1) != 0 ? false : z10);
        }

        private final void emitFrame(boolean z10) throws IOException {
            long jMin;
            boolean z11;
            synchronized (Http2Stream.this) {
                Http2Stream.this.getWriteTimeout().enter();
                while (Http2Stream.this.getWriteBytesTotal() >= Http2Stream.this.getWriteBytesMaximum() && !this.finished && !this.closed && Http2Stream.this.getErrorCode$okhttp() == null) {
                    try {
                        Http2Stream.this.waitForIo$okhttp();
                    } catch (Throwable th2) {
                        Http2Stream.this.getWriteTimeout().exitAndThrowIfTimedOut();
                        throw th2;
                    }
                }
                Http2Stream.this.getWriteTimeout().exitAndThrowIfTimedOut();
                Http2Stream.this.checkOutNotClosed$okhttp();
                jMin = Math.min(Http2Stream.this.getWriteBytesMaximum() - Http2Stream.this.getWriteBytesTotal(), this.sendBuffer.size());
                Http2Stream http2Stream = Http2Stream.this;
                http2Stream.setWriteBytesTotal$okhttp(http2Stream.getWriteBytesTotal() + jMin);
                z11 = z10 && jMin == this.sendBuffer.size() && Http2Stream.this.getErrorCode$okhttp() == null;
                b2 b2Var = b2.f124493a;
            }
            Http2Stream.this.getWriteTimeout().enter();
            try {
                Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), z11, this.sendBuffer, jMin);
            } finally {
                Http2Stream.this.getWriteTimeout().exitAndThrowIfTimedOut();
            }
        }

        @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                f0.o(threadCurrentThread, "Thread.currentThread()");
                sb2.append(threadCurrentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(http2Stream);
                throw new AssertionError(sb2.toString());
            }
            synchronized (Http2Stream.this) {
                if (this.closed) {
                    return;
                }
                boolean z10 = Http2Stream.this.getErrorCode$okhttp() == null;
                b2 b2Var = b2.f124493a;
                if (!Http2Stream.this.getSink().finished) {
                    boolean z11 = this.sendBuffer.size() > 0;
                    if (this.trailers != null) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(false);
                        }
                        Http2Connection connection = Http2Stream.this.getConnection();
                        int id2 = Http2Stream.this.getId();
                        s sVar = this.trailers;
                        f0.m(sVar);
                        connection.writeHeaders$okhttp(id2, z10, Util.toHeaderList(sVar));
                    } else if (z11) {
                        while (this.sendBuffer.size() > 0) {
                            emitFrame(true);
                        }
                    } else if (z10) {
                        Http2Stream.this.getConnection().writeData(Http2Stream.this.getId(), true, null, 0L);
                    }
                }
                synchronized (Http2Stream.this) {
                    this.closed = true;
                    b2 b2Var2 = b2.f124493a;
                }
                Http2Stream.this.getConnection().flush();
                Http2Stream.this.cancelStreamIfNecessary$okhttp();
            }
        }

        @Override // okio.Sink, java.io.Flushable
        public void flush() throws IOException {
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                f0.o(threadCurrentThread, "Thread.currentThread()");
                sb2.append(threadCurrentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(http2Stream);
                throw new AssertionError(sb2.toString());
            }
            synchronized (Http2Stream.this) {
                Http2Stream.this.checkOutNotClosed$okhttp();
                b2 b2Var = b2.f124493a;
            }
            while (this.sendBuffer.size() > 0) {
                emitFrame(false);
                Http2Stream.this.getConnection().flush();
            }
        }

        public final boolean getClosed() {
            return this.closed;
        }

        public final boolean getFinished() {
            return this.finished;
        }

        @e
        public final s getTrailers() {
            return this.trailers;
        }

        public final void setClosed(boolean z10) {
            this.closed = z10;
        }

        public final void setFinished(boolean z10) {
            this.finished = z10;
        }

        public final void setTrailers(@e s sVar) {
            this.trailers = sVar;
        }

        @Override // okio.Sink
        @d
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return Http2Stream.this.getWriteTimeout();
        }

        @Override // okio.Sink
        public void write(@d Buffer source, long j10) throws IOException {
            f0.p(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                this.sendBuffer.write(source, j10);
                while (this.sendBuffer.size() >= 16384) {
                    emitFrame(false);
                }
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(http2Stream);
            throw new AssertionError(sb2.toString());
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @Metadata(bv = {}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u001e¢\u0006\u0004\b*\u0010+J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016J\u001f\u0010\r\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u000eH\u0016J\b\u0010\u0010\u001a\u00020\u0004H\u0016R\u0017\u0010\u0011\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0015\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0014R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\"\u0010\u001f\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\"\u0010'\u001a\u00020\u001e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"\"\u0004\b)\u0010$¨\u0006,"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$FramingSource;", "Lokio/Source;", "", "read", "Lkotlin/b2;", "updateConnectionFlowControl", "Lokio/Buffer;", "sink", "byteCount", "Lokio/BufferedSource;", "source", "receive$okhttp", "(Lokio/BufferedSource;J)V", "receive", "Lokio/Timeout;", a.f130839h0, "close", "receiveBuffer", "Lokio/Buffer;", "getReceiveBuffer", "()Lokio/Buffer;", "readBuffer", "getReadBuffer", "Lokhttp3/s;", "trailers", "Lokhttp3/s;", "getTrailers", "()Lokhttp3/s;", "setTrailers", "(Lokhttp3/s;)V", "", "closed", "Z", "getClosed$okhttp", "()Z", "setClosed$okhttp", "(Z)V", "maxByteCount", "J", "finished", "getFinished$okhttp", "setFinished$okhttp", "<init>", "(Lokhttp3/internal/http2/Http2Stream;JZ)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class FramingSource implements Source {
        private boolean closed;
        private boolean finished;
        private final long maxByteCount;

        @e
        private s trailers;

        @d
        private final Buffer receiveBuffer = new Buffer();

        @d
        private final Buffer readBuffer = new Buffer();

        public FramingSource(long j10, boolean z10) {
            this.maxByteCount = j10;
            this.finished = z10;
        }

        private final void updateConnectionFlowControl(long j10) {
            Http2Stream http2Stream = Http2Stream.this;
            if (!Util.assertionsEnabled || !Thread.holdsLock(http2Stream)) {
                Http2Stream.this.getConnection().updateConnectionFlowControl$okhttp(j10);
                return;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(http2Stream);
            throw new AssertionError(sb2.toString());
        }

        @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            long size;
            synchronized (Http2Stream.this) {
                this.closed = true;
                size = this.readBuffer.size();
                this.readBuffer.clear();
                Http2Stream http2Stream = Http2Stream.this;
                if (http2Stream == null) {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                }
                http2Stream.notifyAll();
                b2 b2Var = b2.f124493a;
            }
            if (size > 0) {
                updateConnectionFlowControl(size);
            }
            Http2Stream.this.cancelStreamIfNecessary$okhttp();
        }

        /* JADX INFO: renamed from: getClosed$okhttp, reason: from getter */
        public final boolean getClosed() {
            return this.closed;
        }

        /* JADX INFO: renamed from: getFinished$okhttp, reason: from getter */
        public final boolean getFinished() {
            return this.finished;
        }

        @d
        public final Buffer getReadBuffer() {
            return this.readBuffer;
        }

        @d
        public final Buffer getReceiveBuffer() {
            return this.receiveBuffer;
        }

        @e
        public final s getTrailers() {
            return this.trailers;
        }

        @Override // okio.Source
        public long read(@d Buffer sink, long byteCount) throws IOException {
            long j10;
            boolean z10;
            f0.p(sink, "sink");
            long j11 = 0;
            if (!(byteCount >= 0)) {
                throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
            }
            while (true) {
                IOException errorException = null;
                synchronized (Http2Stream.this) {
                    Http2Stream.this.getReadTimeout().enter();
                    try {
                        if (Http2Stream.this.getErrorCode$okhttp() != null && (errorException = Http2Stream.this.getErrorException()) == null) {
                            ErrorCode errorCode$okhttp = Http2Stream.this.getErrorCode$okhttp();
                            f0.m(errorCode$okhttp);
                            errorException = new StreamResetException(errorCode$okhttp);
                        }
                        if (this.closed) {
                            throw new IOException("stream closed");
                        }
                        if (this.readBuffer.size() > j11) {
                            Buffer buffer = this.readBuffer;
                            j10 = buffer.read(sink, Math.min(byteCount, buffer.size()));
                            Http2Stream http2Stream = Http2Stream.this;
                            http2Stream.setReadBytesTotal$okhttp(http2Stream.getReadBytesTotal() + j10);
                            long readBytesTotal = Http2Stream.this.getReadBytesTotal() - Http2Stream.this.getReadBytesAcknowledged();
                            if (errorException == null && readBytesTotal >= Http2Stream.this.getConnection().getOkHttpSettings().getInitialWindowSize() / 2) {
                                Http2Stream.this.getConnection().writeWindowUpdateLater$okhttp(Http2Stream.this.getId(), readBytesTotal);
                                Http2Stream http2Stream2 = Http2Stream.this;
                                http2Stream2.setReadBytesAcknowledged$okhttp(http2Stream2.getReadBytesTotal());
                            }
                        } else {
                            if (this.finished || errorException != null) {
                                j10 = -1;
                            } else {
                                Http2Stream.this.waitForIo$okhttp();
                                j10 = -1;
                                z10 = true;
                            }
                            Http2Stream.this.getReadTimeout().exitAndThrowIfTimedOut();
                            b2 b2Var = b2.f124493a;
                        }
                        z10 = false;
                        Http2Stream.this.getReadTimeout().exitAndThrowIfTimedOut();
                        b2 b2Var2 = b2.f124493a;
                    } catch (Throwable th2) {
                        Http2Stream.this.getReadTimeout().exitAndThrowIfTimedOut();
                        throw th2;
                    }
                    throw th;
                }
                if (!z10) {
                    if (j10 != -1) {
                        updateConnectionFlowControl(j10);
                        return j10;
                    }
                    if (errorException == null) {
                        return -1L;
                    }
                    f0.m(errorException);
                    throw errorException;
                }
                j11 = 0;
            }
        }

        public final void receive$okhttp(@d BufferedSource source, long byteCount) throws IOException {
            boolean z10;
            boolean z11;
            boolean z12;
            long size;
            f0.p(source, "source");
            Http2Stream http2Stream = Http2Stream.this;
            if (Util.assertionsEnabled && Thread.holdsLock(http2Stream)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Thread ");
                Thread threadCurrentThread = Thread.currentThread();
                f0.o(threadCurrentThread, "Thread.currentThread()");
                sb2.append(threadCurrentThread.getName());
                sb2.append(" MUST NOT hold lock on ");
                sb2.append(http2Stream);
                throw new AssertionError(sb2.toString());
            }
            while (byteCount > 0) {
                synchronized (Http2Stream.this) {
                    z10 = this.finished;
                    z11 = true;
                    z12 = this.readBuffer.size() + byteCount > this.maxByteCount;
                    b2 b2Var = b2.f124493a;
                }
                if (z12) {
                    source.skip(byteCount);
                    Http2Stream.this.closeLater(ErrorCode.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z10) {
                    source.skip(byteCount);
                    return;
                }
                long j10 = source.read(this.receiveBuffer, byteCount);
                if (j10 == -1) {
                    throw new EOFException();
                }
                byteCount -= j10;
                synchronized (Http2Stream.this) {
                    if (this.closed) {
                        size = this.receiveBuffer.size();
                        this.receiveBuffer.clear();
                    } else {
                        if (this.readBuffer.size() != 0) {
                            z11 = false;
                        }
                        this.readBuffer.writeAll(this.receiveBuffer);
                        if (z11) {
                            Http2Stream http2Stream2 = Http2Stream.this;
                            if (http2Stream2 == null) {
                                throw new NullPointerException("null cannot be cast to non-null type java.lang.Object");
                            }
                            http2Stream2.notifyAll();
                        }
                        size = 0;
                    }
                }
                if (size > 0) {
                    updateConnectionFlowControl(size);
                }
            }
        }

        public final void setClosed$okhttp(boolean z10) {
            this.closed = z10;
        }

        public final void setFinished$okhttp(boolean z10) {
            this.finished = z10;
        }

        public final void setTrailers(@e s sVar) {
            this.trailers = sVar;
        }

        @Override // okio.Source
        @d
        /* JADX INFO: renamed from: timeout */
        public Timeout getTimeout() {
            return Http2Stream.this.getReadTimeout();
        }
    }

    /* JADX INFO: compiled from: Http2Stream.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0014J\u0012\u0010\u0006\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014J\u0006\u0010\u0007\u001a\u00020\u0002¨\u0006\n"}, d2 = {"Lokhttp3/internal/http2/Http2Stream$StreamTimeout;", "Lokio/AsyncTimeout;", "Lkotlin/b2;", "timedOut", "Ljava/io/IOException;", "cause", "newTimeoutException", "exitAndThrowIfTimedOut", "<init>", "(Lokhttp3/internal/http2/Http2Stream;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class StreamTimeout extends AsyncTimeout {
        public StreamTimeout() {
        }

        public final void exitAndThrowIfTimedOut() throws IOException {
            if (exit()) {
                throw newTimeoutException(null);
            }
        }

        @Override // okio.AsyncTimeout
        @d
        protected IOException newTimeoutException(@e IOException cause) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException(a.f130839h0);
            if (cause != null) {
                socketTimeoutException.initCause(cause);
            }
            return socketTimeoutException;
        }

        @Override // okio.AsyncTimeout
        protected void timedOut() {
            Http2Stream.this.closeLater(ErrorCode.CANCEL);
            Http2Stream.this.getConnection().sendDegradedPingLater$okhttp();
        }
    }

    public Http2Stream(int i10, @d Http2Connection connection, boolean z10, boolean z11, @e s sVar) {
        f0.p(connection, "connection");
        this.id = i10;
        this.connection = connection;
        this.writeBytesMaximum = connection.getPeerSettings().getInitialWindowSize();
        ArrayDeque<s> arrayDeque = new ArrayDeque<>();
        this.headersQueue = arrayDeque;
        this.source = new FramingSource(connection.getOkHttpSettings().getInitialWindowSize(), z11);
        this.sink = new FramingSink(z10);
        this.readTimeout = new StreamTimeout();
        this.writeTimeout = new StreamTimeout();
        if (sVar == null) {
            if (!isLocallyInitiated()) {
                throw new IllegalStateException("remotely-initiated streams should have headers".toString());
            }
        } else {
            if (!(!isLocallyInitiated())) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet".toString());
            }
            arrayDeque.add(sVar);
        }
    }

    private final boolean closeInternal(ErrorCode errorCode, IOException errorException) {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        synchronized (this) {
            if (this.errorCode != null) {
                return false;
            }
            if (this.source.getFinished() && this.sink.getFinished()) {
                return false;
            }
            this.errorCode = errorCode;
            this.errorException = errorException;
            notifyAll();
            b2 b2Var = b2.f124493a;
            this.connection.removeStream$okhttp(this.id);
            return true;
        }
    }

    public final void addBytesToWriteWindow(long j10) {
        this.writeBytesMaximum += j10;
        if (j10 > 0) {
            notifyAll();
        }
    }

    public final void cancelStreamIfNecessary$okhttp() throws IOException {
        boolean z10;
        boolean zIsOpen;
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        synchronized (this) {
            z10 = !this.source.getFinished() && this.source.getClosed() && (this.sink.getFinished() || this.sink.getClosed());
            zIsOpen = isOpen();
            b2 b2Var = b2.f124493a;
        }
        if (z10) {
            close(ErrorCode.CANCEL, null);
        } else {
            if (zIsOpen) {
                return;
            }
            this.connection.removeStream$okhttp(this.id);
        }
    }

    public final void checkOutNotClosed$okhttp() throws IOException {
        if (this.sink.getClosed()) {
            throw new IOException("stream closed");
        }
        if (this.sink.getFinished()) {
            throw new IOException("stream finished");
        }
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            f0.m(errorCode);
            throw new StreamResetException(errorCode);
        }
    }

    public final void close(@d ErrorCode rstStatusCode, @e IOException iOException) throws IOException {
        f0.p(rstStatusCode, "rstStatusCode");
        if (closeInternal(rstStatusCode, iOException)) {
            this.connection.writeSynReset$okhttp(this.id, rstStatusCode);
        }
    }

    public final void closeLater(@d ErrorCode errorCode) {
        f0.p(errorCode, "errorCode");
        if (closeInternal(errorCode, null)) {
            this.connection.writeSynResetLater$okhttp(this.id, errorCode);
        }
    }

    public final void enqueueTrailers(@d s trailers) {
        f0.p(trailers, "trailers");
        synchronized (this) {
            boolean z10 = true;
            if (!(!this.sink.getFinished())) {
                throw new IllegalStateException("already finished".toString());
            }
            if (trailers.size() == 0) {
                z10 = false;
            }
            if (!z10) {
                throw new IllegalArgumentException("trailers.size() == 0".toString());
            }
            this.sink.setTrailers(trailers);
            b2 b2Var = b2.f124493a;
        }
    }

    @d
    public final Http2Connection getConnection() {
        return this.connection;
    }

    @e
    public final synchronized ErrorCode getErrorCode$okhttp() {
        return this.errorCode;
    }

    @e
    /* JADX INFO: renamed from: getErrorException$okhttp, reason: from getter */
    public final IOException getErrorException() {
        return this.errorException;
    }

    public final int getId() {
        return this.id;
    }

    public final long getReadBytesAcknowledged() {
        return this.readBytesAcknowledged;
    }

    public final long getReadBytesTotal() {
        return this.readBytesTotal;
    }

    @d
    /* JADX INFO: renamed from: getReadTimeout$okhttp, reason: from getter */
    public final StreamTimeout getReadTimeout() {
        return this.readTimeout;
    }

    @d
    public final Sink getSink() {
        synchronized (this) {
            if (!(this.hasResponseHeaders || isLocallyInitiated())) {
                throw new IllegalStateException("reply before requesting the sink".toString());
            }
            b2 b2Var = b2.f124493a;
        }
        return this.sink;
    }

    @d
    /* JADX INFO: renamed from: getSink$okhttp, reason: from getter */
    public final FramingSink getSink() {
        return this.sink;
    }

    @d
    public final Source getSource() {
        return this.source;
    }

    @d
    /* JADX INFO: renamed from: getSource$okhttp, reason: from getter */
    public final FramingSource getSource() {
        return this.source;
    }

    public final long getWriteBytesMaximum() {
        return this.writeBytesMaximum;
    }

    public final long getWriteBytesTotal() {
        return this.writeBytesTotal;
    }

    @d
    /* JADX INFO: renamed from: getWriteTimeout$okhttp, reason: from getter */
    public final StreamTimeout getWriteTimeout() {
        return this.writeTimeout;
    }

    public final boolean isLocallyInitiated() {
        return this.connection.getClient() == ((this.id & 1) == 1);
    }

    public final synchronized boolean isOpen() {
        if (this.errorCode != null) {
            return false;
        }
        return ((this.source.getFinished() || this.source.getClosed()) && (this.sink.getFinished() || this.sink.getClosed()) && this.hasResponseHeaders) ? false : true;
    }

    @d
    public final Timeout readTimeout() {
        return this.readTimeout;
    }

    public final void receiveData(@d BufferedSource source, int i10) throws IOException {
        f0.p(source, "source");
        if (!Util.assertionsEnabled || !Thread.holdsLock(this)) {
            this.source.receive$okhttp(source, i10);
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Thread ");
        Thread threadCurrentThread = Thread.currentThread();
        f0.o(threadCurrentThread, "Thread.currentThread()");
        sb2.append(threadCurrentThread.getName());
        sb2.append(" MUST NOT hold lock on ");
        sb2.append(this);
        throw new AssertionError(sb2.toString());
    }

    public final void receiveHeaders(@d s headers, boolean z10) {
        boolean zIsOpen;
        f0.p(headers, "headers");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        synchronized (this) {
            if (this.hasResponseHeaders && z10) {
                this.source.setTrailers(headers);
            } else {
                this.hasResponseHeaders = true;
                this.headersQueue.add(headers);
            }
            if (z10) {
                this.source.setFinished$okhttp(true);
            }
            zIsOpen = isOpen();
            notifyAll();
            b2 b2Var = b2.f124493a;
        }
        if (zIsOpen) {
            return;
        }
        this.connection.removeStream$okhttp(this.id);
    }

    public final synchronized void receiveRstStream(@d ErrorCode errorCode) {
        f0.p(errorCode, "errorCode");
        if (this.errorCode == null) {
            this.errorCode = errorCode;
            notifyAll();
        }
    }

    public final void setErrorCode$okhttp(@e ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public final void setErrorException$okhttp(@e IOException iOException) {
        this.errorException = iOException;
    }

    public final void setReadBytesAcknowledged$okhttp(long j10) {
        this.readBytesAcknowledged = j10;
    }

    public final void setReadBytesTotal$okhttp(long j10) {
        this.readBytesTotal = j10;
    }

    public final void setWriteBytesMaximum$okhttp(long j10) {
        this.writeBytesMaximum = j10;
    }

    public final void setWriteBytesTotal$okhttp(long j10) {
        this.writeBytesTotal = j10;
    }

    @d
    public final synchronized s takeHeaders() throws IOException {
        s sVarRemoveFirst;
        this.readTimeout.enter();
        while (this.headersQueue.isEmpty() && this.errorCode == null) {
            try {
                waitForIo$okhttp();
            } catch (Throwable th2) {
                this.readTimeout.exitAndThrowIfTimedOut();
                throw th2;
            }
        }
        this.readTimeout.exitAndThrowIfTimedOut();
        if (!(!this.headersQueue.isEmpty())) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            f0.m(errorCode);
            throw new StreamResetException(errorCode);
        }
        sVarRemoveFirst = this.headersQueue.removeFirst();
        f0.o(sVarRemoveFirst, "headersQueue.removeFirst()");
        return sVarRemoveFirst;
    }

    @d
    public final synchronized s trailers() throws IOException {
        s trailers;
        if (this.errorCode != null) {
            IOException iOException = this.errorException;
            if (iOException != null) {
                throw iOException;
            }
            ErrorCode errorCode = this.errorCode;
            f0.m(errorCode);
            throw new StreamResetException(errorCode);
        }
        if (!(this.source.getFinished() && this.source.getReceiveBuffer().exhausted() && this.source.getReadBuffer().exhausted())) {
            throw new IllegalStateException("too early; can't read the trailers yet".toString());
        }
        trailers = this.source.getTrailers();
        if (trailers == null) {
            trailers = Util.EMPTY_HEADERS;
        }
        return trailers;
    }

    public final void waitForIo$okhttp() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final void writeHeaders(@d List<Header> responseHeaders, boolean z10, boolean z11) throws IOException {
        boolean z12;
        f0.p(responseHeaders, "responseHeaders");
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Thread ");
            Thread threadCurrentThread = Thread.currentThread();
            f0.o(threadCurrentThread, "Thread.currentThread()");
            sb2.append(threadCurrentThread.getName());
            sb2.append(" MUST NOT hold lock on ");
            sb2.append(this);
            throw new AssertionError(sb2.toString());
        }
        synchronized (this) {
            this.hasResponseHeaders = true;
            if (z10) {
                this.sink.setFinished(true);
            }
            b2 b2Var = b2.f124493a;
        }
        if (!z11) {
            synchronized (this.connection) {
                z12 = this.connection.getWriteBytesTotal() >= this.connection.getWriteBytesMaximum();
            }
            z11 = z12;
        }
        this.connection.writeHeaders$okhttp(this.id, z10, responseHeaders);
        if (z11) {
            this.connection.flush();
        }
    }

    @d
    public final Timeout writeTimeout() {
        return this.writeTimeout;
    }
}
