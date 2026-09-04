package okhttp3;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import okio.ByteString;

/* JADX INFO: compiled from: WebSocketListener.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0018\u0010\n\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016J \u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0016J \u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bH\u0016J\"\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¨\u0006\u0018"}, d2 = {"Lokhttp3/g0;", "", "Lokhttp3/f0;", "webSocket", "Lokhttp3/c0;", "response", "Lkotlin/b2;", "f", "", "text", "d", "Lokio/ByteString;", "bytes", "e", "", "code", "reason", "b", ak.av, "", "t", ak.aF, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public abstract class g0 {
    public void a(@dl.d f0 webSocket, int i10, @dl.d String reason) {
        kotlin.jvm.internal.f0.p(webSocket, "webSocket");
        kotlin.jvm.internal.f0.p(reason, "reason");
    }

    public void b(@dl.d f0 webSocket, int i10, @dl.d String reason) {
        kotlin.jvm.internal.f0.p(webSocket, "webSocket");
        kotlin.jvm.internal.f0.p(reason, "reason");
    }

    public void c(@dl.d f0 webSocket, @dl.d Throwable t10, @dl.e c0 c0Var) {
        kotlin.jvm.internal.f0.p(webSocket, "webSocket");
        kotlin.jvm.internal.f0.p(t10, "t");
    }

    public void d(@dl.d f0 webSocket, @dl.d String text) {
        kotlin.jvm.internal.f0.p(webSocket, "webSocket");
        kotlin.jvm.internal.f0.p(text, "text");
    }

    public void e(@dl.d f0 webSocket, @dl.d ByteString bytes) {
        kotlin.jvm.internal.f0.p(webSocket, "webSocket");
        kotlin.jvm.internal.f0.p(bytes, "bytes");
    }

    public void f(@dl.d f0 webSocket, @dl.d c0 response) {
        kotlin.jvm.internal.f0.p(webSocket, "webSocket");
        kotlin.jvm.internal.f0.p(response, "response");
    }
}
