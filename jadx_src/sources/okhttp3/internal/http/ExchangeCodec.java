package okhttp3.internal.http;

import com.alipay.zoloz.android.phone.mrpc.core.f;
import dl.d;
import dl.e;
import java.io.IOException;
import kotlin.Metadata;
import okhttp3.a0;
import okhttp3.c0;
import okhttp3.internal.connection.RealConnection;
import okhttp3.s;
import okio.Sink;
import okio.Source;

/* JADX INFO: compiled from: ExchangeCodec.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\u000b\u001a\u00020\bH&J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\fH&J\u0010\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0010H&J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u0010H&J\b\u0010\u0016\u001a\u00020\u0015H&J\b\u0010\u0017\u001a\u00020\bH&R\u0014\u0010\u001b\u001a\u00020\u00188&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec;", "", "Lokhttp3/a0;", "request", "", "contentLength", "Lokio/Sink;", "createRequestBody", "Lkotlin/b2;", "writeRequestHeaders", "flushRequest", "finishRequest", "", "expectContinue", "Lokhttp3/c0$a;", "readResponseHeaders", "Lokhttp3/c0;", "response", "reportedContentLength", "Lokio/Source;", "openResponseBodySource", "Lokhttp3/s;", "trailers", "cancel", "Lokhttp3/internal/connection/RealConnection;", "getConnection", "()Lokhttp3/internal/connection/RealConnection;", f.f39665q, "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public interface ExchangeCodec {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.$$INSTANCE;
    public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

    /* JADX INFO: compiled from: ExchangeCodec.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/http/ExchangeCodec$Companion;", "", "()V", "DISCARD_STREAM_TIMEOUT_MILLIS", "", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int DISCARD_STREAM_TIMEOUT_MILLIS = 100;

        private Companion() {
        }
    }

    void cancel();

    @d
    Sink createRequestBody(@d a0 request, long contentLength) throws IOException;

    void finishRequest() throws IOException;

    void flushRequest() throws IOException;

    @d
    RealConnection getConnection();

    @d
    Source openResponseBodySource(@d c0 response) throws IOException;

    @e
    c0.a readResponseHeaders(boolean expectContinue) throws IOException;

    long reportedContentLength(@d c0 response) throws IOException;

    @d
    s trailers() throws IOException;

    void writeRequestHeaders(@d a0 a0Var) throws IOException;
}
