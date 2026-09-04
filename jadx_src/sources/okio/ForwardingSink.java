package okio;

import dl.d;
import java.io.IOException;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.k;
import kotlin.s0;
import l5.a;
import xh.h;

/* JADX INFO: compiled from: ForwardingSink.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016J\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u0010\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0010\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0014"}, d2 = {"Lokio/ForwardingSink;", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "Lkotlin/b2;", "write", "flush", "Lokio/Timeout;", a.f130839h0, "close", "", "toString", "-deprecated_delegate", "()Lokio/Sink;", "delegate", "Lokio/Sink;", "<init>", "(Lokio/Sink;)V", "okio"}, k = 1, mv = {1, 4, 0})
public abstract class ForwardingSink implements Sink {

    @d
    private final Sink delegate;

    public ForwardingSink(@d Sink delegate) {
        f0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "delegate", imports = {}))
    @h(name = "-deprecated_delegate")
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final Sink getDelegate() {
        return this.delegate;
    }

    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @d
    @h(name = "delegate")
    public final Sink delegate() {
        return this.delegate;
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() throws IOException {
        this.delegate.flush();
    }

    @Override // okio.Sink
    @d
    public Timeout timeout() {
        return this.delegate.timeout();
    }

    @d
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }

    @Override // okio.Sink
    public void write(@d Buffer source, long j10) throws IOException {
        f0.p(source, "source");
        this.delegate.write(source, j10);
    }
}
