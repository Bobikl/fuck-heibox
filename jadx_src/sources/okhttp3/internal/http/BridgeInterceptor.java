package okhttp3.internal.http;

import com.google.common.net.c;
import dl.d;
import java.io.IOException;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;
import n5.a;
import okhttp3.Cookie;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.internal.Util;
import okhttp3.l;
import okhttp3.u;
import okhttp3.v;
import okio.GzipSource;
import okio.Okio;

/* JADX INFO: compiled from: BridgeInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lokhttp3/internal/http/BridgeInterceptor;", "Lokhttp3/u;", "", "Lokhttp3/Cookie;", "cookies", "", "cookieHeader", "Lokhttp3/u$a;", "chain", "Lokhttp3/c0;", "intercept", "Lokhttp3/l;", "cookieJar", "Lokhttp3/l;", "<init>", "(Lokhttp3/l;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class BridgeInterceptor implements u {
    private final l cookieJar;

    public BridgeInterceptor(@d l cookieJar) {
        f0.p(cookieJar, "cookieJar");
        this.cookieJar = cookieJar;
    }

    private final String cookieHeader(List<Cookie> cookies) {
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        for (Object obj : cookies) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            Cookie cookie = (Cookie) obj;
            if (i10 > 0) {
                sb2.append("; ");
            }
            sb2.append(cookie.name());
            sb2.append(a.f132013h);
            sb2.append(cookie.value());
            i10 = i11;
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    @Override // okhttp3.u
    @d
    public c0 intercept(@d u.a chain) throws IOException {
        d0 d0VarQ;
        f0.p(chain, "chain");
        a0 a0VarRequest = chain.request();
        a0.a aVarN = a0VarRequest.n();
        b0 b0VarF = a0VarRequest.f();
        if (b0VarF != null) {
            v contentType = b0VarF.getContentType();
            if (contentType != null) {
                aVarN.n("Content-Type", contentType.getMediaType());
            }
            long jContentLength = b0VarF.contentLength();
            if (jContentLength != -1) {
                aVarN.n("Content-Length", String.valueOf(jContentLength));
                aVarN.t("Transfer-Encoding");
            } else {
                aVarN.n("Transfer-Encoding", "chunked");
                aVarN.t("Content-Length");
            }
        }
        boolean z10 = false;
        if (a0VarRequest.i("Host") == null) {
            aVarN.n("Host", Util.toHostHeader$default(a0VarRequest.q(), false, 1, null));
        }
        if (a0VarRequest.i("Connection") == null) {
            aVarN.n("Connection", c.f58866u0);
        }
        if (a0VarRequest.i("Accept-Encoding") == null && a0VarRequest.i("Range") == null) {
            aVarN.n("Accept-Encoding", "gzip");
            z10 = true;
        }
        List<Cookie> listA = this.cookieJar.a(a0VarRequest.q());
        if (!listA.isEmpty()) {
            aVarN.n("Cookie", cookieHeader(listA));
        }
        if (a0VarRequest.i("User-Agent") == null) {
            aVarN.n("User-Agent", Util.userAgent);
        }
        c0 c0VarProceed = chain.proceed(aVarN.b());
        HttpHeaders.receiveHeaders(this.cookieJar, a0VarRequest.q(), c0VarProceed.getHeaders());
        c0.a aVarE = c0VarProceed.P().E(a0VarRequest);
        if (z10 && kotlin.text.u.L1("gzip", c0.J(c0VarProceed, "Content-Encoding", null, 2, null), true) && HttpHeaders.promisesBody(c0VarProceed) && (d0VarQ = c0VarProceed.q()) != null) {
            GzipSource gzipSource = new GzipSource(d0VarQ.getBodySource());
            aVarE.w(c0VarProceed.getHeaders().l().l("Content-Encoding").l("Content-Length").i());
            aVarE.b(new RealResponseBody(c0.J(c0VarProceed, "Content-Type", null, 2, null), -1L, Okio.buffer(gzipSource)));
        }
        return aVarE.c();
    }
}
