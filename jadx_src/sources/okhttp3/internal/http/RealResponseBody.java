package okhttp3.internal.http;

import dl.d;
import dl.e;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okhttp3.d0;
import okhttp3.v;
import okio.BufferedSource;

/* JADX INFO: compiled from: RealResponseBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\n\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\f¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/d0;", "", "contentLength", "Lokhttp3/v;", "contentType", "Lokio/BufferedSource;", "source", "", "contentTypeString", "Ljava/lang/String;", "J", "Lokio/BufferedSource;", "<init>", "(Ljava/lang/String;JLokio/BufferedSource;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class RealResponseBody extends d0 {
    private final long contentLength;
    private final String contentTypeString;
    private final BufferedSource source;

    public RealResponseBody(@e String str, long j10, @d BufferedSource source) {
        f0.p(source, "source");
        this.contentTypeString = str;
        this.contentLength = j10;
        this.source = source;
    }

    @Override // okhttp3.d0
    /* JADX INFO: renamed from: contentLength, reason: from getter */
    public long getContentLength() {
        return this.contentLength;
    }

    @Override // okhttp3.d0
    @e
    /* JADX INFO: renamed from: contentType */
    public v getF132480d() {
        String str = this.contentTypeString;
        if (str != null) {
            return v.INSTANCE.d(str);
        }
        return null;
    }

    @Override // okhttp3.d0
    @d
    /* JADX INFO: renamed from: source, reason: from getter */
    public BufferedSource getSource() {
        return this.source;
    }
}
