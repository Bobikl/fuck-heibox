package okhttp3.internal.http;

import com.jd.jdcache.util.UrlHelper;
import dl.d;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import xh.m;

/* JADX INFO: compiled from: HttpMethod.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lokhttp3/internal/http/HttpMethod;", "", "()V", "invalidatesCache", "", "method", "", "permitsRequestBody", "redirectsToGet", "redirectsWithBody", "requiresRequestBody", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class HttpMethod {
    public static final HttpMethod INSTANCE = new HttpMethod();

    private HttpMethod() {
    }

    @m
    public static final boolean permitsRequestBody(@d String method) {
        f0.p(method, "method");
        return (f0.g(method, "GET") || f0.g(method, "HEAD")) ? false : true;
    }

    @m
    public static final boolean requiresRequestBody(@d String method) {
        f0.p(method, "method");
        return f0.g(method, "POST") || f0.g(method, "PUT") || f0.g(method, UrlHelper.METHOD_PATCH) || f0.g(method, "PROPPATCH") || f0.g(method, "REPORT");
    }

    public final boolean invalidatesCache(@d String method) {
        f0.p(method, "method");
        return f0.g(method, "POST") || f0.g(method, UrlHelper.METHOD_PATCH) || f0.g(method, "PUT") || f0.g(method, "DELETE") || f0.g(method, "MOVE");
    }

    public final boolean redirectsToGet(@d String method) {
        f0.p(method, "method");
        return !f0.g(method, "PROPFIND");
    }

    public final boolean redirectsWithBody(@d String method) {
        f0.p(method, "method");
        return f0.g(method, "PROPFIND");
    }
}
