package okhttp3.internal.http1;

import dl.d;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okhttp3.s;
import okio.BufferedSource;

/* JADX INFO: compiled from: HeadersReader.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00102\u00020\u0001:\u0001\u0010B\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0005\u001a\u00020\u0004R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/http1/HeadersReader;", "", "", "readLine", "Lokhttp3/s;", "readHeaders", "", "headerLimit", "J", "Lokio/BufferedSource;", "source", "Lokio/BufferedSource;", "getSource", "()Lokio/BufferedSource;", "<init>", "(Lokio/BufferedSource;)V", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class HeadersReader {
    private static final int HEADER_LIMIT = 262144;
    private long headerLimit;

    @d
    private final BufferedSource source;

    public HeadersReader(@d BufferedSource source) {
        f0.p(source, "source");
        this.source = source;
        this.headerLimit = 262144;
    }

    @d
    public final BufferedSource getSource() {
        return this.source;
    }

    @d
    public final s readHeaders() throws IOException {
        s.a aVar = new s.a();
        while (true) {
            String line = readLine();
            if (line.length() == 0) {
                return aVar.i();
            }
            aVar.f(line);
        }
    }

    @d
    public final String readLine() throws IOException {
        String utf8LineStrict = this.source.readUtf8LineStrict(this.headerLimit);
        this.headerLimit -= (long) utf8LineStrict.length();
        return utf8LineStrict;
    }
}
