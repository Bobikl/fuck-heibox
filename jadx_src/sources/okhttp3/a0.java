package okhttp3;

import com.jd.jdcache.util.UrlHelper;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s0;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

/* JADX INFO: compiled from: Request.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010$\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001:\u0001\u0018BC\b\u0000\u0012\u0006\u0010\"\u001a\u00020\u000f\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0014\u0012\b\u0010+\u001a\u0004\u0018\u00010\u0017\u0012\u0016\u00100\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010,¢\u0006\u0004\b7\u00108J\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0001J%\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\b2\u000e\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\t¢\u0006\u0004\b\u000b\u0010\fJ\u0006\u0010\u000e\u001a\u00020\rJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0007¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0002H\u0016R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010\u001eR\u0017\u0010\"\u001a\u00020\u000f8\u0007¢\u0006\f\n\u0004\b\u001b\u0010 \u001a\u0004\b!\u0010\u0011R\u0017\u0010%\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0015\u0010#\u001a\u0004\b$\u0010\u0013R\u0017\u0010(\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010\u0016R\u0019\u0010+\u001a\u0004\u0018\u00010\u00178\u0007¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010\u0019R*\u00100\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b*\u0010-\u001a\u0004\b.\u0010/R\u0011\u00104\u001a\u0002018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u0011\u00106\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\b5\u0010\u001c¨\u00069"}, d2 = {"Lokhttp3/a0;", "", "", "name", "i", "", "j", "o", androidx.exifinterface.media.a.f23244d5, "Ljava/lang/Class;", "type", "p", "(Ljava/lang/Class;)Ljava/lang/Object;", "Lokhttp3/a0$a;", "n", "Lokhttp3/t;", "e", "()Lokhttp3/t;", "d", "()Ljava/lang/String;", "Lokhttp3/s;", ak.aF, "()Lokhttp3/s;", "Lokhttp3/b0;", ak.av, "()Lokhttp3/b0;", "Lokhttp3/d;", "b", "()Lokhttp3/d;", "toString", "Lokhttp3/d;", "lazyCacheControl", "Lokhttp3/t;", "q", "url", "Ljava/lang/String;", "m", "method", "Lokhttp3/s;", "k", "headers", "Lokhttp3/b0;", "f", "body", "", "Ljava/util/Map;", RXScreenCaptureService.KEY_HEIGHT, "()Ljava/util/Map;", "tags", "", "l", "()Z", "isHttps", "g", "cacheControl", "<init>", "(Lokhttp3/t;Ljava/lang/String;Lokhttp3/s;Lokhttp3/b0;Ljava/util/Map;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private d lazyCacheControl;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final t url;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String method;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final s headers;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final b0 body;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<Class<?>, Object> tags;

    /* JADX INFO: compiled from: Request.kt */
    @Metadata(bv = {}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\bD\u0010EB\u0011\b\u0010\u0012\u0006\u0010F\u001a\u00020%¢\u0006\u0004\bD\u0010GJ\u0010\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0016J\u0010\u0010\b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0007H\u0016J\u0018\u0010\u000b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0018\u0010\f\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0005H\u0016J\u0010\u0010\u0010\u001a\u00020\u00002\u0006\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0000H\u0016J\b\u0010\u0015\u001a\u00020\u0000H\u0016J\u0010\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0014\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0017J\u0010\u0010\u001a\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u0016H\u0016J\u001a\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001c\u001a\u00020\u00052\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0016J\u0012\u0010\u001f\u001a\u00020\u00002\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0016J/\u0010#\u001a\u00020\u0000\"\u0004\b\u0000\u0010 2\u000e\u0010\"\u001a\n\u0012\u0006\b\u0000\u0012\u00028\u00000!2\b\u0010\u001e\u001a\u0004\u0018\u00018\u0000H\u0016¢\u0006\u0004\b#\u0010$J\b\u0010&\u001a\u00020%H\u0016R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\"\u0010\u001c\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b&\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\"\u0010\u000f\u001a\u0002018\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R2\u0010C\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030!\u0012\u0004\u0012\u00020\u00010=8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010B¨\u0006H"}, d2 = {"Lokhttp3/a0$a;", "", "Lokhttp3/t;", "url", "D", "", "B", "Ljava/net/URL;", "C", "name", "value", "n", ak.av, "t", "Lokhttp3/s;", "headers", "o", "Lokhttp3/d;", "cacheControl", ak.aF, "g", "m", "Lokhttp3/b0;", "body", "r", "e", ak.aB, "q", "method", "p", "tag", androidx.exifinterface.media.a.W4, androidx.exifinterface.media.a.f23244d5, "Ljava/lang/Class;", "type", ak.aD, "(Ljava/lang/Class;Ljava/lang/Object;)Lokhttp3/a0$a;", "Lokhttp3/a0;", "b", "Lokhttp3/t;", "l", "()Lokhttp3/t;", "y", "(Lokhttp3/t;)V", "Ljava/lang/String;", "j", "()Ljava/lang/String;", RXScreenCaptureService.KEY_WIDTH, "(Ljava/lang/String;)V", "Lokhttp3/s$a;", "Lokhttp3/s$a;", "i", "()Lokhttp3/s$a;", "v", "(Lokhttp3/s$a;)V", "d", "Lokhttp3/b0;", RXScreenCaptureService.KEY_HEIGHT, "()Lokhttp3/b0;", ak.aG, "(Lokhttp3/b0;)V", "", "Ljava/util/Map;", "k", "()Ljava/util/Map;", "x", "(Ljava/util/Map;)V", "tags", "<init>", "()V", "request", "(Lokhttp3/a0;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private t url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private String method;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private s.a headers;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private b0 body;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private Map<Class<?>, Object> tags;

        public a() {
            this.tags = new LinkedHashMap();
            this.method = "GET";
            this.headers = new s.a();
        }

        public a(@dl.d a0 request) {
            kotlin.jvm.internal.f0.p(request, "request");
            this.tags = new LinkedHashMap();
            this.url = request.q();
            this.method = request.m();
            this.body = request.f();
            this.tags = request.h().isEmpty() ? new LinkedHashMap<>() : s0.J0(request.h());
            this.headers = request.k().l();
        }

        public static /* synthetic */ a f(a aVar, b0 b0Var, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: delete");
            }
            if ((i10 & 1) != 0) {
                b0Var = Util.EMPTY_REQUEST;
            }
            return aVar.e(b0Var);
        }

        @dl.d
        public a A(@dl.e Object tag) {
            return z(Object.class, tag);
        }

        @dl.d
        public a B(@dl.d String url) {
            kotlin.jvm.internal.f0.p(url, "url");
            if (kotlin.text.u.t2(url, "ws:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("http:");
                String strSubstring = url.substring(3);
                kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring);
                url = sb2.toString();
            } else if (kotlin.text.u.t2(url, "wss:", true)) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append("https:");
                String strSubstring2 = url.substring(4);
                kotlin.jvm.internal.f0.o(strSubstring2, "(this as java.lang.String).substring(startIndex)");
                sb3.append(strSubstring2);
                url = sb3.toString();
            }
            return D(t.INSTANCE.h(url));
        }

        @dl.d
        public a C(@dl.d URL url) {
            kotlin.jvm.internal.f0.p(url, "url");
            t.Companion bVar = t.INSTANCE;
            String string = url.toString();
            kotlin.jvm.internal.f0.o(string, "url.toString()");
            return D(bVar.h(string));
        }

        @dl.d
        public a D(@dl.d t url) {
            kotlin.jvm.internal.f0.p(url, "url");
            this.url = url;
            return this;
        }

        @dl.d
        public a a(@dl.d String name, @dl.d String value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            this.headers.b(name, value);
            return this;
        }

        @dl.d
        public a0 b() {
            t tVar = this.url;
            if (tVar != null) {
                return new a0(tVar, this.method, this.headers.i(), this.body, Util.toImmutableMap(this.tags));
            }
            throw new IllegalStateException("url == null".toString());
        }

        @dl.d
        public a c(@dl.d d cacheControl) {
            kotlin.jvm.internal.f0.p(cacheControl, "cacheControl");
            String string = cacheControl.toString();
            return string.length() == 0 ? t("Cache-Control") : n("Cache-Control", string);
        }

        @dl.d
        @xh.i
        public final a d() {
            return f(this, null, 1, null);
        }

        @dl.d
        @xh.i
        public a e(@dl.e b0 body) {
            return p("DELETE", body);
        }

        @dl.d
        public a g() {
            return p("GET", null);
        }

        @dl.e
        /* JADX INFO: renamed from: h, reason: from getter */
        public final b0 getBody() {
            return this.body;
        }

        @dl.d
        /* JADX INFO: renamed from: i, reason: from getter */
        public final s.a getHeaders() {
            return this.headers;
        }

        @dl.d
        /* JADX INFO: renamed from: j, reason: from getter */
        public final String getMethod() {
            return this.method;
        }

        @dl.d
        public final Map<Class<?>, Object> k() {
            return this.tags;
        }

        @dl.e
        /* JADX INFO: renamed from: l, reason: from getter */
        public final t getUrl() {
            return this.url;
        }

        @dl.d
        public a m() {
            return p("HEAD", null);
        }

        @dl.d
        public a n(@dl.d String name, @dl.d String value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            this.headers.m(name, value);
            return this;
        }

        @dl.d
        public a o(@dl.d s headers) {
            kotlin.jvm.internal.f0.p(headers, "headers");
            this.headers = headers.l();
            return this;
        }

        @dl.d
        public a p(@dl.d String method, @dl.e b0 body) {
            kotlin.jvm.internal.f0.p(method, "method");
            if (!(method.length() > 0)) {
                throw new IllegalArgumentException("method.isEmpty() == true".toString());
            }
            if (body == null) {
                if (!(true ^ HttpMethod.requiresRequestBody(method))) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!HttpMethod.permitsRequestBody(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.method = method;
            this.body = body;
            return this;
        }

        @dl.d
        public a q(@dl.d b0 body) {
            kotlin.jvm.internal.f0.p(body, "body");
            return p(UrlHelper.METHOD_PATCH, body);
        }

        @dl.d
        public a r(@dl.d b0 body) {
            kotlin.jvm.internal.f0.p(body, "body");
            return p("POST", body);
        }

        @dl.d
        public a s(@dl.d b0 body) {
            kotlin.jvm.internal.f0.p(body, "body");
            return p("PUT", body);
        }

        @dl.d
        public a t(@dl.d String name) {
            kotlin.jvm.internal.f0.p(name, "name");
            this.headers.l(name);
            return this;
        }

        public final void u(@dl.e b0 b0Var) {
            this.body = b0Var;
        }

        public final void v(@dl.d s.a aVar) {
            kotlin.jvm.internal.f0.p(aVar, "<set-?>");
            this.headers = aVar;
        }

        public final void w(@dl.d String str) {
            kotlin.jvm.internal.f0.p(str, "<set-?>");
            this.method = str;
        }

        public final void x(@dl.d Map<Class<?>, Object> map) {
            kotlin.jvm.internal.f0.p(map, "<set-?>");
            this.tags = map;
        }

        public final void y(@dl.e t tVar) {
            this.url = tVar;
        }

        @dl.d
        public <T> a z(@dl.d Class<? super T> type, @dl.e T tag) {
            kotlin.jvm.internal.f0.p(type, "type");
            if (tag == null) {
                this.tags.remove(type);
            } else {
                if (this.tags.isEmpty()) {
                    this.tags = new LinkedHashMap();
                }
                Map<Class<?>, Object> map = this.tags;
                T tCast = type.cast(tag);
                kotlin.jvm.internal.f0.m(tCast);
                map.put(type, tCast);
            }
            return this;
        }
    }

    public a0(@dl.d t url, @dl.d String method, @dl.d s headers, @dl.e b0 b0Var, @dl.d Map<Class<?>, ? extends Object> tags) {
        kotlin.jvm.internal.f0.p(url, "url");
        kotlin.jvm.internal.f0.p(method, "method");
        kotlin.jvm.internal.f0.p(headers, "headers");
        kotlin.jvm.internal.f0.p(tags, "tags");
        this.url = url;
        this.method = method;
        this.headers = headers;
        this.body = b0Var;
        this.tags = tags;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.s0(expression = "body", imports = {}))
    @xh.h(name = "-deprecated_body")
    @dl.e
    /* JADX INFO: renamed from: a, reason: from getter */
    public final b0 getBody() {
        return this.body;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.s0(expression = "cacheControl", imports = {}))
    @xh.h(name = "-deprecated_cacheControl")
    public final d b() {
        return g();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.s0(expression = "headers", imports = {}))
    @xh.h(name = "-deprecated_headers")
    /* JADX INFO: renamed from: c, reason: from getter */
    public final s getHeaders() {
        return this.headers;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.s0(expression = "method", imports = {}))
    @xh.h(name = "-deprecated_method")
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getMethod() {
        return this.method;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @kotlin.s0(expression = "url", imports = {}))
    @xh.h(name = "-deprecated_url")
    /* JADX INFO: renamed from: e, reason: from getter */
    public final t getUrl() {
        return this.url;
    }

    @xh.h(name = "body")
    @dl.e
    public final b0 f() {
        return this.body;
    }

    @dl.d
    @xh.h(name = "cacheControl")
    public final d g() {
        d dVar = this.lazyCacheControl;
        if (dVar != null) {
            return dVar;
        }
        d dVarC = d.INSTANCE.c(this.headers);
        this.lazyCacheControl = dVarC;
        return dVarC;
    }

    @dl.d
    public final Map<Class<?>, Object> h() {
        return this.tags;
    }

    @dl.e
    public final String i(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        return this.headers.e(name);
    }

    @dl.d
    public final List<String> j(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        return this.headers.w(name);
    }

    @dl.d
    @xh.h(name = "headers")
    public final s k() {
        return this.headers;
    }

    public final boolean l() {
        return this.url.getIsHttps();
    }

    @dl.d
    @xh.h(name = "method")
    public final String m() {
        return this.method;
    }

    @dl.d
    public final a n() {
        return new a(this);
    }

    @dl.e
    public final Object o() {
        return p(Object.class);
    }

    @dl.e
    public final <T> T p(@dl.d Class<? extends T> type) {
        kotlin.jvm.internal.f0.p(type, "type");
        return type.cast(this.tags.get(type));
    }

    @dl.d
    @xh.h(name = "url")
    public final t q() {
        return this.url;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Request{method=");
        sb2.append(this.method);
        sb2.append(", url=");
        sb2.append(this.url);
        if (this.headers.size() != 0) {
            sb2.append(", headers=[");
            int i10 = 0;
            for (Pair<? extends String, ? extends String> pair : this.headers) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.W();
                }
                Pair<? extends String, ? extends String> pair2 = pair;
                String strA = pair2.a();
                String strB = pair2.b();
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(strA);
                sb2.append(':');
                sb2.append(strB);
                i10 = i11;
            }
            sb2.append(']');
        }
        if (!this.tags.isEmpty()) {
            sb2.append(", tags=");
            sb2.append(this.tags);
        }
        sb2.append('}');
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
