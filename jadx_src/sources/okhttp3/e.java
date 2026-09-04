package okhttp3;

import com.umeng.analytics.pro.ak;
import java.io.IOException;
import kotlin.Metadata;
import okio.Timeout;

/* JADX INFO: compiled from: Call.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0011J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\n\u001a\u00020\bH&J\b\u0010\f\u001a\u00020\u000bH&J\b\u0010\r\u001a\u00020\u000bH&J\b\u0010\u000f\u001a\u00020\u000eH&J\b\u0010\u0010\u001a\u00020\u0000H&¨\u0006\u0012"}, d2 = {"Lokhttp3/e;", "", "Lokhttp3/a0;", "request", "Lokhttp3/c0;", com.tekartik.sqflite.b.f98590i, "Lokhttp3/f;", "responseCallback", "Lkotlin/b2;", "enqueue", "cancel", "", "isExecuted", "isCanceled", "Lokio/Timeout;", l5.a.f130839h0, "clone", ak.av, "okhttp"}, k = 1, mv = {1, 4, 0})
public interface e extends Cloneable {

    /* JADX INFO: compiled from: Call.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\u0006"}, d2 = {"Lokhttp3/e$a;", "", "Lokhttp3/a0;", "request", "Lokhttp3/e;", ak.av, "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface a {
        @dl.d
        e a(@dl.d a0 request);
    }

    void cancel();

    @dl.d
    e clone();

    void enqueue(@dl.d f fVar);

    @dl.d
    c0 execute() throws IOException;

    /* JADX INFO: renamed from: isCanceled */
    boolean getCanceled();

    boolean isExecuted();

    @dl.d
    a0 request();

    @dl.d
    Timeout timeout();
}
