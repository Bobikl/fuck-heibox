package okhttp3;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: compiled from: WebSocket.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\b\u0010\u0003\u001a\u00020\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH&J\u001a\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006H&J\b\u0010\u0011\u001a\u00020\u0010H&¨\u0006\u0013"}, d2 = {"Lokhttp3/f0;", "", "Lokhttp3/a0;", "request", "", "queueSize", "", "text", "", "send", "Lokio/ByteString;", "bytes", "", "code", "reason", "close", "Lkotlin/b2;", "cancel", ak.av, "okhttp"}, k = 1, mv = {1, 4, 0})
public interface f0 {

    /* JADX INFO: compiled from: WebSocket.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¨\u0006\b"}, d2 = {"Lokhttp3/f0$a;", "", "Lokhttp3/a0;", "request", "Lokhttp3/g0;", com.google.android.gms.common.internal.s.a.f52543a, "Lokhttp3/f0;", "b", "okhttp"}, k = 1, mv = {1, 4, 0})
    public interface a {
        @dl.d
        f0 b(@dl.d a0 request, @dl.d g0 listener);
    }

    void cancel();

    boolean close(int code, @dl.e String reason);

    long queueSize();

    @dl.d
    /* JADX INFO: renamed from: request */
    a0 getOriginalRequest();

    boolean send(@dl.d String text);

    boolean send(@dl.d ByteString bytes);
}
