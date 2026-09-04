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

/* JADX INFO: compiled from: ForwardingSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\u000f\u0010\u000f\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u000f\u001a\u00020\u00018\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0013"}, d2 = {"Lokio/ForwardingSource;", "Lokio/Source;", "Lokio/Buffer;", "sink", "", "byteCount", "read", "Lokio/Timeout;", a.f130839h0, "Lkotlin/b2;", "close", "", "toString", "-deprecated_delegate", "()Lokio/Source;", "delegate", "Lokio/Source;", "<init>", "(Lokio/Source;)V", "okio"}, k = 1, mv = {1, 4, 0})
public abstract class ForwardingSource implements Source {

    @d
    private final Source delegate;

    public ForwardingSource(@d Source delegate) {
        f0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "delegate", imports = {}))
    @h(name = "-deprecated_delegate")
    /* JADX INFO: renamed from: -deprecated_delegate, reason: not valid java name and from getter */
    public final Source getDelegate() {
        return this.delegate;
    }

    @Override // okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.delegate.close();
    }

    @d
    @h(name = "delegate")
    public final Source delegate() {
        return this.delegate;
    }

    @Override // okio.Source
    public long read(@d Buffer sink, long byteCount) throws IOException {
        f0.p(sink, "sink");
        return this.delegate.read(sink, byteCount);
    }

    @Override // okio.Source
    @d
    /* JADX INFO: renamed from: timeout */
    public Timeout getThis$0() {
        return this.delegate.getThis$0();
    }

    @d
    public String toString() {
        return getClass().getSimpleName() + '(' + this.delegate + ')';
    }
}
