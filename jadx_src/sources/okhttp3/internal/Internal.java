package okhttp3.internal;

import dl.d;
import dl.e;
import javax.net.ssl.SSLSocket;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import okhttp3.Cookie;
import okhttp3.a0;
import okhttp3.c;
import okhttp3.c0;
import okhttp3.k;
import okhttp3.s;
import okhttp3.t;
import xh.h;

/* JADX INFO: compiled from: internal.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "Internal")
@Metadata(bv = {}, d1 = {"\u0000R\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a \u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004\u001a\u0016\u0010\u000b\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t\u001a\u0016\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0004\u001a\u001e\u0010\u000f\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0004\u001a\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014\u001a\u001e\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\t¨\u0006\u001f"}, d2 = {"", "currentTimeMillis", "Lokhttp3/t;", "url", "", "setCookie", "Lokhttp3/Cookie;", "parseCookie", "cookie", "", "forObsoleteRfc2965", "cookieToString", "Lokhttp3/s$a;", "builder", "line", "addHeaderLenient", "name", "value", "Lokhttp3/c;", "cache", "Lokhttp3/a0;", "request", "Lokhttp3/c0;", "cacheGet", "Lokhttp3/k;", "connectionSpec", "Ljavax/net/ssl/SSLSocket;", "sslSocket", "isFallback", "Lkotlin/b2;", "applyConnectionSpec", "okhttp"}, k = 2, mv = {1, 4, 0})
public final class Internal {
    @d
    public static final s.a addHeaderLenient(@d s.a builder, @d String line) {
        f0.p(builder, "builder");
        f0.p(line, "line");
        return builder.f(line);
    }

    @d
    public static final s.a addHeaderLenient(@d s.a builder, @d String name, @d String value) {
        f0.p(builder, "builder");
        f0.p(name, "name");
        f0.p(value, "value");
        return builder.g(name, value);
    }

    public static final void applyConnectionSpec(@d k connectionSpec, @d SSLSocket sslSocket, boolean z10) throws CloneNotSupportedException {
        f0.p(connectionSpec, "connectionSpec");
        f0.p(sslSocket, "sslSocket");
        connectionSpec.f(sslSocket, z10);
    }

    @e
    public static final c0 cacheGet(@d c cache, @d a0 request) {
        f0.p(cache, "cache");
        f0.p(request, "request");
        return cache.f(request);
    }

    @d
    public static final String cookieToString(@d Cookie cookie, boolean z10) {
        f0.p(cookie, "cookie");
        return cookie.toString$okhttp(z10);
    }

    @e
    public static final Cookie parseCookie(long j10, @d t url, @d String setCookie) {
        f0.p(url, "url");
        f0.p(setCookie, "setCookie");
        return Cookie.INSTANCE.f(j10, url, setCookie);
    }
}
