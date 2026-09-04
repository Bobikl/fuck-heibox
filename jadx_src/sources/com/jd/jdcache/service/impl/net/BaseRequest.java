package com.jd.jdcache.service.impl.net;

import android.net.Uri;
import android.os.Build;
import com.huawei.hms.framework.common.ContainerUtils;
import com.jd.jdcache.JDCacheConstant;
import com.jd.jdcache.service.base.NetState;
import com.jd.jdcache.util.JDCacheLog;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.GZIPInputStream;
import javax.net.ssl.HttpsURLConnection;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.text.StringsKt__StringsKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.g;

/* JADX INFO: compiled from: BaseRequest.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nBaseRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseRequest.kt\ncom/jd/jdcache/service/impl/net/BaseRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 JDCacheLog.kt\ncom/jd/jdcache/util/JDCacheLogKt\n*L\n1#1,280:1\n1#2:281\n9#3,4:282\n*S KotlinDebug\n*F\n+ 1 BaseRequest.kt\ncom/jd/jdcache/service/impl/net/BaseRequest\n*L\n174#1:282,4\n*E\n"})
public abstract class BaseRequest<T> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    public static final a f64232p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    public static final String f64233q = "Connection";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    public static final String f64234r = "keep-alive";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    public static final String f64235s = "close";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final String f64236t = "Content-Encoding";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    public static final String f64237u = "Cookie";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final String f64238v = "User-Agent";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    public static final String f64239w = "Referer";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private String f64240a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private String f64241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private String f64242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f64243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private Map<String, String> f64244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private Map<String, String> f64245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private Map<String, String> f64246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f64247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.e
    private String f64248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f64249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f64250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private HttpURLConnection f64251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private String f64252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private kotlinx.coroutines.flow.f<? super NetState<T>> f64253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final CoroutineDispatcher f64254o;

    /* JADX INFO: compiled from: BaseRequest.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public BaseRequest(@dl.d String url, @dl.d String method, @dl.e String str, @dl.e String str2, @dl.e Map<String, String> map, @dl.e Map<String, String> map2, @dl.e Map<String, String> map3, boolean z10, @dl.e String str3, int i10, int i11) {
        f0.p(url, "url");
        f0.p(method, "method");
        this.f64240a = url;
        this.f64241b = method;
        this.f64242c = str;
        this.f64243d = str2;
        this.f64244e = map;
        this.f64245f = map2;
        this.f64246g = map3;
        this.f64247h = z10;
        this.f64248i = str3;
        this.f64249j = i10;
        this.f64250k = i11;
        this.f64252m = url;
        this.f64254o = JDCacheConstant.f64122a.b();
    }

    public /* synthetic */ BaseRequest(String str, String str2, String str3, String str4, Map map, Map map2, Map map3, boolean z10, String str5, int i10, int i11, int i12, u uVar) {
        this(str, (i12 & 2) != 0 ? "GET" : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : map, (i12 & 32) != 0 ? null : map2, (i12 & 64) != 0 ? null : map3, (i12 & 128) != 0 ? true : z10, (i12 & 256) == 0 ? str5 : null, (i12 & 512) != 0 ? 5000 : i10, (i12 & 1024) == 0 ? i11 : 5000);
    }

    private final InputStream j(String str, HttpURLConnection httpURLConnection) throws IOException {
        InputStream errorStream = httpURLConnection.getErrorStream();
        f0.m(errorStream);
        return v(str, errorStream);
    }

    private final InputStream l(String str, HttpURLConnection httpURLConnection) throws IOException {
        InputStream inputStream = httpURLConnection.getInputStream();
        f0.m(inputStream);
        return v(str, inputStream);
    }

    private final InputStream r(int i10, HttpURLConnection httpURLConnection) throws IOException {
        String headerField = httpURLConnection.getHeaderField("Content-Encoding");
        return i10 >= 400 ? j(headerField, httpURLConnection) : l(headerField, httpURLConnection);
    }

    private final InputStream v(String str, InputStream inputStream) throws IOException {
        return x(str) ? new GZIPInputStream(inputStream) : inputStream;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:17:0x002e A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:18:0x0030 A[ORIG_RETURN, RETURN] */
    private final boolean w() {
        switch (this.f64241b) {
            case "PUT":
            case "POST":
            case "PATCH":
            case "DELETE":
                return true;
            default:
                return false;
        }
    }

    private final boolean x(String str) {
        return str != null && StringsKt__StringsKt.W2(str, "gzip", false, 2, null);
    }

    public final void A(boolean z10) {
        this.f64247h = z10;
    }

    public final void B(@dl.e Map<String, String> map) {
        this.f64246g = map;
    }

    public final void C(int i10) {
        this.f64249j = i10;
    }

    public final void D(@dl.e HttpURLConnection httpURLConnection) {
        this.f64251l = httpURLConnection;
    }

    public final void E(@dl.e String str) {
        this.f64243d = str;
    }

    public final void F(@dl.e Map<String, String> map) {
        this.f64244e = map;
    }

    public final void G(@dl.d String str) {
        f0.p(str, "<set-?>");
        this.f64241b = str;
    }

    public final void H(@dl.e Map<String, String> map) {
        this.f64245f = map;
    }

    public final void I(int i10) {
        this.f64250k = i10;
    }

    public final void J(@dl.e String str) {
        this.f64248i = str;
    }

    public final void K(@dl.d String str) {
        f0.p(str, "<set-?>");
        this.f64240a = str;
    }

    public final void L(@dl.e String str) {
        this.f64242c = str;
    }

    protected final void M(@dl.d HttpURLConnection connection) throws IOException {
        f0.p(connection, "connection");
        Map<String, String> map = this.f64246g;
        if (map != null && (map.isEmpty() ^ true)) {
            StringBuilder sb2 = new StringBuilder();
            for (String str : map.keySet()) {
                sb2.append("&");
                sb2.append(str);
                sb2.append(ContainerUtils.KEY_VALUE_DELIMITER);
                sb2.append(URLEncoder.encode(map.get(str), "UTF-8"));
            }
            sb2.deleteCharAt(0);
            OutputStream outputStream = connection.getOutputStream();
            String string = sb2.toString();
            f0.o(string, "toString(...)");
            byte[] bytes = string.getBytes(kotlin.text.d.f128566b);
            f0.o(bytes, "this as java.lang.String).getBytes(charset)");
            outputStream.write(bytes);
            outputStream.flush();
            outputStream.close();
        }
    }

    @dl.e
    protected final Object b(@dl.d URL url, @dl.d kotlin.coroutines.c<? super NetState<T>> cVar) throws Exception {
        URLConnection uRLConnectionOpenConnection = url.openConnection();
        f0.n(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        this.f64251l = httpURLConnection;
        httpURLConnection.setConnectTimeout(this.f64249j);
        httpURLConnection.setReadTimeout(this.f64250k);
        httpURLConnection.setInstanceFollowRedirects(this.f64247h);
        if (httpURLConnection instanceof HttpsURLConnection) {
            HttpsURLConnection httpsURLConnection = (HttpsURLConnection) httpURLConnection;
            e eVar = e.f64284a;
            httpsURLConnection.setSSLSocketFactory(eVar.b());
            httpsURLConnection.setHostnameVerifier(eVar.a(url));
        }
        httpURLConnection.setRequestMethod(this.f64241b);
        httpURLConnection.setDoInput(true);
        if (w()) {
            httpURLConnection.setDoOutput(true);
            M(httpURLConnection);
        }
        Map map = this.f64244e;
        if (map == null) {
            map = new HashMap();
        }
        map.put("Connection", "keep-alive");
        for (String str : map.keySet()) {
            httpURLConnection.setRequestProperty(str, (String) map.get(str));
        }
        String str2 = this.f64243d;
        if (str2 != null) {
            httpURLConnection.setRequestProperty("Cookie", str2);
        }
        String str3 = this.f64242c;
        if (str3 != null) {
            httpURLConnection.setRequestProperty("User-Agent", str3);
        }
        String str4 = this.f64248i;
        if (str4 != null) {
            httpURLConnection.setRequestProperty("Referer", str4);
        }
        httpURLConnection.connect();
        int responseCode = httpURLConnection.getResponseCode();
        if (responseCode == 301 || responseCode == 302 || responseCode == 303 || responseCode == 307 || responseCode == 308) {
            String headerField = httpURLConnection.getHeaderField("Location");
            InputStream inputStream = httpURLConnection.getInputStream();
            if (inputStream != null) {
                inputStream.close();
            }
            return new NetState.Redirect(responseCode, httpURLConnection.getHeaderFields(), headerField);
        }
        if (!(100 <= responseCode && responseCode < 200) && responseCode != 204 && responseCode != 205) {
            if (!(300 <= responseCode && responseCode < 400)) {
                return z(responseCode, httpURLConnection.getHeaderFields(), Build.VERSION.SDK_INT >= 24 ? httpURLConnection.getContentLengthLong() : httpURLConnection.getContentLength(), !f0.g(this.f64241b, "HEAD") ? r(responseCode, httpURLConnection) : null, cVar);
            }
        }
        return new NetState.Error(responseCode, new Exception("Http Error: " + httpURLConnection.getResponseMessage()));
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<NetState<T>> c() {
        return g.N0(g.u(g.l1(g.I0(new BaseRequest$connectFlow$1(this, null)), new BaseRequest$connectFlow$2(this, null)), new BaseRequest$connectFlow$3(this, null)), this.f64254o);
    }

    public final void d() {
        JDCacheLog jDCacheLog = JDCacheLog.INSTANCE;
        if (jDCacheLog.getCanLog()) {
            jDCacheLog.d(s(), "connection.disconnect() called");
        }
        HttpURLConnection httpURLConnection = this.f64251l;
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
        }
    }

    public final boolean e() {
        return this.f64247h;
    }

    @dl.e
    public final Map<String, String> f() {
        return this.f64246g;
    }

    public final int g() {
        return this.f64249j;
    }

    @dl.e
    public final HttpURLConnection h() {
        return this.f64251l;
    }

    @dl.e
    public final String i() {
        return this.f64243d;
    }

    @dl.e
    public final Map<String, String> k() {
        return this.f64244e;
    }

    @dl.d
    public final String m() {
        return this.f64241b;
    }

    @dl.e
    public final Map<String, String> n() {
        return this.f64245f;
    }

    public final int o() {
        return this.f64250k;
    }

    @dl.e
    public final String p() {
        return this.f64248i;
    }

    @dl.d
    public final String q() {
        Map<String, String> map = this.f64245f;
        boolean z10 = false;
        if (map != null && (!map.isEmpty())) {
            z10 = true;
        }
        if (!z10) {
            return this.f64240a;
        }
        Uri.Builder builderBuildUpon = Uri.parse(this.f64240a).buildUpon();
        for (String str : map.keySet()) {
            builderBuildUpon.appendQueryParameter(str, URLEncoder.encode(map.get(str), "UTF-8"));
        }
        String string = builderBuildUpon.build().toString();
        f0.o(string, "toString(...)");
        return string;
    }

    @dl.d
    public abstract String s();

    @dl.d
    public final String t() {
        return this.f64240a;
    }

    @dl.e
    public final String u() {
        return this.f64242c;
    }

    @dl.e
    protected final Object y(long j10, long j11, @dl.d kotlin.coroutines.c<? super b2> cVar) {
        Object objEmit;
        kotlinx.coroutines.flow.f<? super NetState<T>> fVar = this.f64253n;
        return (fVar == null || (objEmit = fVar.emit(new NetState.OnProgress(j10, j11), cVar)) != kotlin.coroutines.intrinsics.b.h()) ? b2.f124493a : objEmit;
    }

    @dl.e
    protected abstract Object z(int i10, @dl.e Map<String, ? extends List<String>> map, long j10, @dl.e InputStream inputStream, @dl.d kotlin.coroutines.c<? super NetState<T>> cVar);
}
