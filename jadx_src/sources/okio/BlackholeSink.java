package okio;

import dl.d;
import java.io.EOFException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import l5.a;

/* JADX INFO: compiled from: Okio.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\u000b\u001a\u00020\u0006H\u0016¨\u0006\u000e"}, d2 = {"Lokio/BlackholeSink;", "Lokio/Sink;", "Lokio/Buffer;", "source", "", "byteCount", "Lkotlin/b2;", "write", "flush", "Lokio/Timeout;", a.f130839h0, "close", "<init>", "()V", "okio"}, k = 1, mv = {1, 4, 0})
public final class BlackholeSink implements Sink {
    @Override // okio.Sink, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }

    @Override // okio.Sink, java.io.Flushable
    public void flush() {
    }

    @Override // okio.Sink
    @d
    /* JADX INFO: renamed from: timeout */
    public Timeout getThis$0() {
        return Timeout.NONE;
    }

    @Override // okio.Sink
    public void write(@d Buffer source, long j10) throws EOFException {
        f0.p(source, "source");
        source.skip(j10);
    }
}
