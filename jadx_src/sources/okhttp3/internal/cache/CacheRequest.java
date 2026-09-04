package okhttp3.internal.cache;

import dl.d;
import java.io.IOException;
import kotlin.Metadata;
import okio.Sink;

/* JADX INFO: compiled from: CacheRequest.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/cache/CacheRequest;", "", "Lokio/Sink;", "body", "Lkotlin/b2;", "abort", "okhttp"}, k = 1, mv = {1, 4, 0})
public interface CacheRequest {
    void abort();

    @d
    Sink body() throws IOException;
}
