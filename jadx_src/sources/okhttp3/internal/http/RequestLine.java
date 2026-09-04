package okhttp3.internal.http;

import dl.d;
import java.net.Proxy;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okhttp3.a0;
import okhttp3.t;

/* JADX INFO: compiled from: RequestLine.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¨\u0006\u000f"}, d2 = {"Lokhttp3/internal/http/RequestLine;", "", "Lokhttp3/a0;", "request", "Ljava/net/Proxy$Type;", "proxyType", "", "includeAuthorityInRequestLine", "", "get", "Lokhttp3/t;", "url", "requestPath", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class RequestLine {
    public static final RequestLine INSTANCE = new RequestLine();

    private RequestLine() {
    }

    private final boolean includeAuthorityInRequestLine(a0 request, Proxy.Type proxyType) {
        return !request.l() && proxyType == Proxy.Type.HTTP;
    }

    @d
    public final String get(@d a0 request, @d Proxy.Type proxyType) {
        f0.p(request, "request");
        f0.p(proxyType, "proxyType");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(request.m());
        sb2.append(' ');
        RequestLine requestLine = INSTANCE;
        if (requestLine.includeAuthorityInRequestLine(request, proxyType)) {
            sb2.append(request.q());
        } else {
            sb2.append(requestLine.requestPath(request.q()));
        }
        sb2.append(" HTTP/1.1");
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @d
    public final String requestPath(@d t url) {
        f0.p(url, "url");
        String strX = url.x();
        String strZ = url.z();
        if (strZ == null) {
            return strX;
        }
        return strX + '?' + strZ;
    }
}
