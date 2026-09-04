package okhttp3;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeSet;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.d1;
import kotlin.jvm.internal.v0;
import kotlin.s0;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.Util;
import okhttp3.internal.cache.CacheRequest;
import okhttp3.internal.cache.CacheStrategy;
import okhttp3.internal.cache.DiskLruCache;
import okhttp3.internal.concurrent.TaskRunner;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.io.FileSystem;
import okhttp3.internal.platform.Platform;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* JADX INFO: compiled from: Cache.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0004&\u0007\u0018:B!\b\u0000\u0012\u0006\u0010D\u001a\u00020%\u0012\u0006\u0010E\u001a\u00020 \u0012\u0006\u0010G\u001a\u00020F¢\u0006\u0004\bH\u0010IB\u0019\b\u0016\u0012\u0006\u0010D\u001a\u00020%\u0012\u0006\u0010E\u001a\u00020 ¢\u0006\u0004\bH\u0010JJ\u0016\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0018\u00010\u0003R\u00020\u0004H\u0002J\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\r\u001a\u00020\nH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0000¢\u0006\u0004\b\u0015\u0010\u0016J\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0006J\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0006\u0010\u001e\u001a\u00020\u001dJ\u0006\u0010\u001f\u001a\u00020\u001dJ\u0006\u0010!\u001a\u00020 J\u0006\u0010\"\u001a\u00020 J\b\u0010#\u001a\u00020\u0006H\u0016J\b\u0010$\u001a\u00020\u0006H\u0016J\u000f\u0010&\u001a\u00020%H\u0007¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u00062\u0006\u0010)\u001a\u00020(H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0006H\u0000¢\u0006\u0004\b,\u0010-J\u0006\u0010.\u001a\u00020\u001dJ\u0006\u0010/\u001a\u00020\u001dJ\u0006\u00100\u001a\u00020\u001dR\u001a\u00104\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u00101\u001a\u0004\b2\u00103R\"\u00109\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010=\u001a\u00020\u001d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b:\u0010\u0015\u001a\u0004\b;\u00106\"\u0004\b<\u00108R\u0016\u0010>\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0016\u0010?\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015R\u0016\u0010@\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u0010\u0015R\u0011\u0010B\u001a\u00020A8F¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0011\u0010D\u001a\u00020%8G¢\u0006\u0006\u001a\u0004\b:\u0010'¨\u0006L"}, d2 = {"Lokhttp3/c;", "Ljava/io/Closeable;", "Ljava/io/Flushable;", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "Lkotlin/b2;", "b", "Lokhttp3/a0;", "request", "Lokhttp3/c0;", "f", "(Lokhttp3/a0;)Lokhttp3/c0;", "response", "Lokhttp3/internal/cache/CacheRequest;", "r", "(Lokhttp3/c0;)Lokhttp3/internal/cache/CacheRequest;", ak.aB, "(Lokhttp3/a0;)V", "cached", ad.c.f1243w, "I", "(Lokhttp3/c0;Lokhttp3/c0;)V", "n", ak.aF, "e", "", "", "J", "", "K", "L", "", UiKitSpanObj.TYPE_SIZE, "p", "flush", "close", "Ljava/io/File;", ak.av, "()Ljava/io/File;", "Lokhttp3/internal/cache/CacheStrategy;", "cacheStrategy", "C", "(Lokhttp3/internal/cache/CacheStrategy;)V", androidx.exifinterface.media.a.W4, "()V", "q", "m", "t", "Lokhttp3/internal/cache/DiskLruCache;", "g", "()Lokhttp3/internal/cache/DiskLruCache;", "cache", "k", "()I", ak.aD, "(I)V", "writeSuccessCount", "d", "i", "x", "writeAbortCount", "networkCount", "hitCount", "requestCount", "", "isClosed", "()Z", org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134963d, "maxSize", "Lokhttp3/internal/io/FileSystem;", "fileSystem", "<init>", "(Ljava/io/File;JLokhttp3/internal/io/FileSystem;)V", "(Ljava/io/File;J)V", "l", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class c implements Closeable, Flushable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f132384h = 201105;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f132385i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f132386j = 1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f132387k = 2;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final DiskLruCache cache;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int writeSuccessCount;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int writeAbortCount;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int networkCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int hitCount;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int requestCount;

    /* JADX INFO: compiled from: Cache.kt */
    @Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B'\u0012\n\u0010\u0011\u001a\u00060\u000bR\u00020\f\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001b\u0010\u0011\u001a\u00060\u000bR\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014¨\u0006\u0018"}, d2 = {"Lokhttp3/c$a;", "Lokhttp3/d0;", "Lokhttp3/v;", "contentType", "", "contentLength", "Lokio/BufferedSource;", "source", ak.aF, "Lokio/BufferedSource;", "bodySource", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "d", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", ak.av, "()Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "", "e", "Ljava/lang/String;", "f", "<init>", "(Lokhttp3/internal/cache/DiskLruCache$Snapshot;Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a extends d0 {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final BufferedSource bodySource;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final DiskLruCache.Snapshot snapshot;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final String contentType;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String contentLength;

        /* JADX INFO: renamed from: okhttp3.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: Cache.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/c$a$a", "Lokio/ForwardingSource;", "Lkotlin/b2;", "close", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class C1212a extends ForwardingSource {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Source f132400c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1212a(Source source, Source source2) {
                super(source2);
                this.f132400c = source;
            }

            @Override // okio.ForwardingSource, okio.Source, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                a.this.getSnapshot().close();
                super.close();
            }
        }

        public a(@dl.d DiskLruCache.Snapshot snapshot, @dl.e String str, @dl.e String str2) {
            kotlin.jvm.internal.f0.p(snapshot, "snapshot");
            this.snapshot = snapshot;
            this.contentType = str;
            this.contentLength = str2;
            Source source = snapshot.getSource(1);
            this.bodySource = Okio.buffer(new C1212a(source, source));
        }

        @dl.d
        /* JADX INFO: renamed from: a, reason: from getter */
        public final DiskLruCache.Snapshot getSnapshot() {
            return this.snapshot;
        }

        @Override // okhttp3.d0
        /* JADX INFO: renamed from: contentLength */
        public long getContentLength() {
            String str = this.contentLength;
            if (str != null) {
                return Util.toLongOrDefault(str, -1L);
            }
            return -1L;
        }

        @Override // okhttp3.d0
        @dl.e
        /* JADX INFO: renamed from: contentType */
        public v getF132480d() {
            String str = this.contentType;
            if (str != null) {
                return v.INSTANCE.d(str);
            }
            return null;
        }

        @Override // okhttp3.d0
        @dl.d
        /* JADX INFO: renamed from: source, reason: from getter */
        public BufferedSource getSource() {
            return this.bodySource;
        }
    }

    /* JADX INFO: renamed from: okhttp3.c$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Cache.kt */
    @Metadata(bv = {}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u0002H\u0002J\u0018\u0010\b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\tH\u0007J\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001e\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u0014J\n\u0010\u0018\u001a\u00020\u0016*\u00020\u0011J\n\u0010\u0019\u001a\u00020\u0002*\u00020\u0011R\u0014\u0010\u001a\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u000e8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006!"}, d2 = {"Lokhttp3/c$b;", "", "Lokhttp3/s;", "", "", "d", "requestHeaders", "responseHeaders", "e", "Lokhttp3/t;", "url", "b", "Lokio/BufferedSource;", "source", "", ak.aF, "(Lokio/BufferedSource;)I", "Lokhttp3/c0;", "cachedResponse", "cachedRequest", "Lokhttp3/a0;", "newRequest", "", "g", ak.av, "f", "ENTRY_BODY", "I", "ENTRY_COUNT", "ENTRY_METADATA", "VERSION", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final Set<String> d(s sVar) {
            int size = sVar.size();
            TreeSet treeSet = null;
            for (int i10 = 0; i10 < size; i10++) {
                if (kotlin.text.u.L1(com.google.common.net.c.L0, sVar.i(i10), true)) {
                    String strV = sVar.v(i10);
                    if (treeSet == null) {
                        treeSet = new TreeSet(kotlin.text.u.T1(v0.f124986a));
                    }
                    for (String str : StringsKt__StringsKt.T4(strV, new char[]{','}, false, 0, 6, null)) {
                        if (str == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        treeSet.add(StringsKt__StringsKt.F5(str).toString());
                    }
                }
            }
            return treeSet != null ? treeSet : d1.k();
        }

        private final s e(s requestHeaders, s responseHeaders) {
            Set<String> setD = d(responseHeaders);
            if (setD.isEmpty()) {
                return Util.EMPTY_HEADERS;
            }
            s.a aVar = new s.a();
            int size = requestHeaders.size();
            for (int i10 = 0; i10 < size; i10++) {
                String strI = requestHeaders.i(i10);
                if (setD.contains(strI)) {
                    aVar.b(strI, requestHeaders.v(i10));
                }
            }
            return aVar.i();
        }

        public final boolean a(@dl.d c0 hasVaryAll) {
            kotlin.jvm.internal.f0.p(hasVaryAll, "$this$hasVaryAll");
            return d(hasVaryAll.getHeaders()).contains(androidx.webkit.b.f28327e);
        }

        @dl.d
        @xh.m
        public final String b(@dl.d t url) {
            kotlin.jvm.internal.f0.p(url, "url");
            return ByteString.INSTANCE.encodeUtf8(url.getUrl()).md5().hex();
        }

        public final int c(@dl.d BufferedSource source) throws IOException {
            kotlin.jvm.internal.f0.p(source, "source");
            try {
                long decimalLong = source.readDecimalLong();
                String utf8LineStrict = source.readUtf8LineStrict();
                if (decimalLong >= 0 && decimalLong <= Integer.MAX_VALUE) {
                    if (!(utf8LineStrict.length() > 0)) {
                        return (int) decimalLong;
                    }
                }
                throw new IOException("expected an int but was \"" + decimalLong + utf8LineStrict + kotlin.text.y.f128593b);
            } catch (NumberFormatException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        @dl.d
        public final s f(@dl.d c0 varyHeaders) {
            kotlin.jvm.internal.f0.p(varyHeaders, "$this$varyHeaders");
            c0 networkResponse = varyHeaders.getNetworkResponse();
            kotlin.jvm.internal.f0.m(networkResponse);
            return e(networkResponse.getRequest().k(), varyHeaders.getHeaders());
        }

        public final boolean g(@dl.d c0 cachedResponse, @dl.d s cachedRequest, @dl.d a0 newRequest) {
            kotlin.jvm.internal.f0.p(cachedResponse, "cachedResponse");
            kotlin.jvm.internal.f0.p(cachedRequest, "cachedRequest");
            kotlin.jvm.internal.f0.p(newRequest, "newRequest");
            Set<String> setD = d(cachedResponse.getHeaders());
            if ((setD instanceof Collection) && setD.isEmpty()) {
                return true;
            }
            for (String str : setD) {
                if (!kotlin.jvm.internal.f0.g(cachedRequest.w(str), newRequest.j(str))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* JADX INFO: renamed from: okhttp3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Cache.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u0000 ;2\u00020\u0001:\u0001\u001aB\u0011\b\u0016\u0012\u0006\u00107\u001a\u000206¢\u0006\u0004\b8\u00109B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b8\u0010:J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001e\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002J\u0012\u0010\u000f\u001a\u00020\n2\n\u0010\u000e\u001a\u00060\fR\u00020\rJ\u0016\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012J\u0012\u0010\u0018\u001a\u00020\u00122\n\u0010\u0017\u001a\u00060\u0016R\u00020\rR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001eR\u0014\u0010 \u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010%R\u0014\u0010'\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001bR\u0014\u0010)\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010\u001eR\u0016\u0010-\u001a\u0004\u0018\u00010*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00103\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00100R\u0014\u00105\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u00104¨\u0006<"}, d2 = {"Lokhttp3/c$c;", "", "Lokio/BufferedSource;", "source", "", "Ljava/security/cert/Certificate;", ak.aF, "Lokio/BufferedSink;", "sink", "certificates", "Lkotlin/b2;", "e", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "editor", "f", "Lokhttp3/a0;", "request", "Lokhttp3/c0;", "response", "", "b", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "snapshot", "d", "", ak.av, "Ljava/lang/String;", "url", "Lokhttp3/s;", "Lokhttp3/s;", "varyHeaders", "requestMethod", "Lokhttp3/Protocol;", "Lokhttp3/Protocol;", SwitchDetailActivity.P, "", "I", "code", "message", "g", "responseHeaders", "Lokhttp3/Handshake;", RXScreenCaptureService.KEY_HEIGHT, "Lokhttp3/Handshake;", "handshake", "", "i", "J", "sentRequestMillis", "j", "receivedResponseMillis", "()Z", "isHttps", "Lokio/Source;", "rawSource", "<init>", "(Lokio/Source;)V", "(Lokhttp3/c0;)V", "m", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class C1213c {

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final String f132401k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f132402l;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final s varyHeaders;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final String requestMethod;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final Protocol protocol;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int code;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final String message;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final s responseHeaders;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Handshake handshake;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final long sentRequestMillis;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final long receivedResponseMillis;

        static {
            StringBuilder sb2 = new StringBuilder();
            Platform.Companion companion = Platform.INSTANCE;
            sb2.append(companion.get().getPrefix());
            sb2.append("-Sent-Millis");
            f132401k = sb2.toString();
            f132402l = companion.get().getPrefix() + "-Received-Millis";
        }

        public C1213c(@dl.d c0 response) {
            kotlin.jvm.internal.f0.p(response, "response");
            this.url = response.getRequest().q().getUrl();
            this.varyHeaders = c.INSTANCE.f(response);
            this.requestMethod = response.getRequest().m();
            this.protocol = response.getCom.max.xiaoheihe.module.game.nswitch.SwitchDetailActivity.P java.lang.String();
            this.code = response.x();
            this.message = response.getMessage();
            this.responseHeaders = response.getHeaders();
            this.handshake = response.getHandshake();
            this.sentRequestMillis = response.getSentRequestAtMillis();
            this.receivedResponseMillis = response.getReceivedResponseAtMillis();
        }

        public C1213c(@dl.d Source rawSource) throws IOException {
            kotlin.jvm.internal.f0.p(rawSource, "rawSource");
            try {
                BufferedSource bufferedSourceBuffer = Okio.buffer(rawSource);
                this.url = bufferedSourceBuffer.readUtf8LineStrict();
                this.requestMethod = bufferedSourceBuffer.readUtf8LineStrict();
                s.a aVar = new s.a();
                int iC = c.INSTANCE.c(bufferedSourceBuffer);
                for (int i10 = 0; i10 < iC; i10++) {
                    aVar.f(bufferedSourceBuffer.readUtf8LineStrict());
                }
                this.varyHeaders = aVar.i();
                StatusLine statusLine = StatusLine.INSTANCE.parse(bufferedSourceBuffer.readUtf8LineStrict());
                this.protocol = statusLine.protocol;
                this.code = statusLine.code;
                this.message = statusLine.message;
                s.a aVar2 = new s.a();
                int iC2 = c.INSTANCE.c(bufferedSourceBuffer);
                for (int i11 = 0; i11 < iC2; i11++) {
                    aVar2.f(bufferedSourceBuffer.readUtf8LineStrict());
                }
                String str = f132401k;
                String strJ = aVar2.j(str);
                String str2 = f132402l;
                String strJ2 = aVar2.j(str2);
                aVar2.l(str);
                aVar2.l(str2);
                this.sentRequestMillis = strJ != null ? Long.parseLong(strJ) : 0L;
                this.receivedResponseMillis = strJ2 != null ? Long.parseLong(strJ2) : 0L;
                this.responseHeaders = aVar2.i();
                if (a()) {
                    String utf8LineStrict = bufferedSourceBuffer.readUtf8LineStrict();
                    if (utf8LineStrict.length() > 0) {
                        throw new IOException("expected \"\" but was \"" + utf8LineStrict + kotlin.text.y.f128593b);
                    }
                    this.handshake = Handshake.INSTANCE.c(!bufferedSourceBuffer.exhausted() ? TlsVersion.INSTANCE.a(bufferedSourceBuffer.readUtf8LineStrict()) : TlsVersion.SSL_3_0, h.INSTANCE.b(bufferedSourceBuffer.readUtf8LineStrict()), c(bufferedSourceBuffer), c(bufferedSourceBuffer));
                } else {
                    this.handshake = null;
                }
                rawSource.close();
            } catch (Throwable th2) {
                rawSource.close();
                throw th2;
            }
        }

        private final boolean a() {
            return kotlin.text.u.v2(this.url, "https://", false, 2, null);
        }

        private final List<Certificate> c(BufferedSource source) throws IOException {
            int iC = c.INSTANCE.c(source);
            if (iC == -1) {
                return CollectionsKt__CollectionsKt.E();
            }
            try {
                CertificateFactory certificateFactory = CertificateFactory.getInstance(com.huawei.hms.feature.dynamic.f.e.f60731b);
                ArrayList arrayList = new ArrayList(iC);
                for (int i10 = 0; i10 < iC; i10++) {
                    String utf8LineStrict = source.readUtf8LineStrict();
                    Buffer buffer = new Buffer();
                    ByteString byteStringDecodeBase64 = ByteString.INSTANCE.decodeBase64(utf8LineStrict);
                    kotlin.jvm.internal.f0.m(byteStringDecodeBase64);
                    buffer.write(byteStringDecodeBase64);
                    arrayList.add(certificateFactory.generateCertificate(buffer.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        private final void e(BufferedSink bufferedSink, List<? extends Certificate> list) throws IOException {
            try {
                bufferedSink.writeDecimalLong(list.size()).writeByte(10);
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    byte[] bytes = list.get(i10).getEncoded();
                    ByteString.Companion companion = ByteString.INSTANCE;
                    kotlin.jvm.internal.f0.o(bytes, "bytes");
                    bufferedSink.writeUtf8(ByteString.Companion.of$default(companion, bytes, 0, 0, 3, null).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e10) {
                throw new IOException(e10.getMessage());
            }
        }

        public final boolean b(@dl.d a0 request, @dl.d c0 response) {
            kotlin.jvm.internal.f0.p(request, "request");
            kotlin.jvm.internal.f0.p(response, "response");
            return kotlin.jvm.internal.f0.g(this.url, request.q().getUrl()) && kotlin.jvm.internal.f0.g(this.requestMethod, request.m()) && c.INSTANCE.g(response, this.varyHeaders, request);
        }

        @dl.d
        public final c0 d(@dl.d DiskLruCache.Snapshot snapshot) {
            kotlin.jvm.internal.f0.p(snapshot, "snapshot");
            String strE = this.responseHeaders.e("Content-Type");
            String strE2 = this.responseHeaders.e("Content-Length");
            return new c0.a().E(new a0.a().B(this.url).p(this.requestMethod, null).o(this.varyHeaders).b()).B(this.protocol).g(this.code).y(this.message).w(this.responseHeaders).b(new a(snapshot, strE, strE2)).u(this.handshake).F(this.sentRequestMillis).C(this.receivedResponseMillis).c();
        }

        public final void f(@dl.d DiskLruCache.Editor editor) throws IOException {
            kotlin.jvm.internal.f0.p(editor, "editor");
            BufferedSink bufferedSinkBuffer = Okio.buffer(editor.newSink(0));
            try {
                bufferedSinkBuffer.writeUtf8(this.url).writeByte(10);
                bufferedSinkBuffer.writeUtf8(this.requestMethod).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.varyHeaders.size()).writeByte(10);
                int size = this.varyHeaders.size();
                for (int i10 = 0; i10 < size; i10++) {
                    bufferedSinkBuffer.writeUtf8(this.varyHeaders.i(i10)).writeUtf8(": ").writeUtf8(this.varyHeaders.v(i10)).writeByte(10);
                }
                bufferedSinkBuffer.writeUtf8(new StatusLine(this.protocol, this.code, this.message).toString()).writeByte(10);
                bufferedSinkBuffer.writeDecimalLong(this.responseHeaders.size() + 2).writeByte(10);
                int size2 = this.responseHeaders.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    bufferedSinkBuffer.writeUtf8(this.responseHeaders.i(i11)).writeUtf8(": ").writeUtf8(this.responseHeaders.v(i11)).writeByte(10);
                }
                bufferedSinkBuffer.writeUtf8(f132401k).writeUtf8(": ").writeDecimalLong(this.sentRequestMillis).writeByte(10);
                bufferedSinkBuffer.writeUtf8(f132402l).writeUtf8(": ").writeDecimalLong(this.receivedResponseMillis).writeByte(10);
                if (a()) {
                    bufferedSinkBuffer.writeByte(10);
                    Handshake handshake = this.handshake;
                    kotlin.jvm.internal.f0.m(handshake);
                    bufferedSinkBuffer.writeUtf8(handshake.g().e()).writeByte(10);
                    e(bufferedSinkBuffer, this.handshake.m());
                    e(bufferedSinkBuffer, this.handshake.k());
                    bufferedSinkBuffer.writeUtf8(this.handshake.o().javaName()).writeByte(10);
                }
                b2 b2Var = b2.f124493a;
                kotlin.io.b.a(bufferedSinkBuffer, null);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    kotlin.io.b.a(bufferedSinkBuffer, th2);
                    throw th3;
                }
            }
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0014\u001a\u00060\u0010R\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007R\"\u0010\u000f\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\r\"\u0004\b\u000b\u0010\u000eR\u0018\u0010\u0014\u001a\u00060\u0010R\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lokhttp3/c$d;", "Lokhttp3/internal/cache/CacheRequest;", "Lkotlin/b2;", "abort", "Lokio/Sink;", "body", ak.av, "Lokio/Sink;", "cacheOut", "b", "", ak.aF, "Z", "()Z", "(Z)V", "done", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "Lokhttp3/internal/cache/DiskLruCache;", "d", "Lokhttp3/internal/cache/DiskLruCache$Editor;", "editor", "<init>", "(Lokhttp3/c;Lokhttp3/internal/cache/DiskLruCache$Editor;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public final class d implements CacheRequest {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Sink cacheOut;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Sink body;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean done;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final DiskLruCache.Editor editor;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c f132418e;

        /* JADX INFO: compiled from: Cache.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"okhttp3/c$d$a", "Lokio/ForwardingSink;", "Lkotlin/b2;", "close", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class a extends ForwardingSink {
            a(Sink sink) {
                super(sink);
            }

            @Override // okio.ForwardingSink, okio.Sink, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                synchronized (d.this.f132418e) {
                    if (d.this.getDone()) {
                        return;
                    }
                    d.this.c(true);
                    c cVar = d.this.f132418e;
                    cVar.z(cVar.getWriteSuccessCount() + 1);
                    super.close();
                    d.this.editor.commit();
                }
            }
        }

        public d(@dl.d c cVar, DiskLruCache.Editor editor) {
            kotlin.jvm.internal.f0.p(editor, "editor");
            this.f132418e = cVar;
            this.editor = editor;
            Sink sinkNewSink = editor.newSink(1);
            this.cacheOut = sinkNewSink;
            this.body = new a(sinkNewSink);
        }

        @Override // okhttp3.internal.cache.CacheRequest
        public void abort() {
            synchronized (this.f132418e) {
                if (this.done) {
                    return;
                }
                this.done = true;
                c cVar = this.f132418e;
                cVar.x(cVar.getWriteAbortCount() + 1);
                Util.closeQuietly(this.cacheOut);
                try {
                    this.editor.abort();
                } catch (IOException unused) {
                }
            }
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getDone() {
            return this.done;
        }

        @Override // okhttp3.internal.cache.CacheRequest
        @dl.d
        /* JADX INFO: renamed from: body, reason: from getter */
        public Sink getBody() {
            return this.body;
        }

        public final void c(boolean z10) {
            this.done = z10;
        }
    }

    /* JADX INFO: compiled from: Cache.kt */
    @Metadata(bv = {}, d1 = {"\u0000'\n\u0000\n\u0002\u0010)\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u001e\u0010\f\u001a\f\u0012\b\u0012\u00060\bR\u00020\t0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"okhttp3/c$e", "", "", "", "hasNext", ak.av, "Lkotlin/b2;", "remove", "Lokhttp3/internal/cache/DiskLruCache$Snapshot;", "Lokhttp3/internal/cache/DiskLruCache;", "b", "Ljava/util/Iterator;", "delegate", ak.aF, "Ljava/lang/String;", "nextUrl", "d", "Z", "canRemove", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class e implements Iterator<String>, zh.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Iterator<DiskLruCache.Snapshot> delegate;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private String nextUrl;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean canRemove;

        e() {
            this.delegate = c.this.getCache().snapshots();
        }

        @Override // java.util.Iterator
        @dl.d
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            String str = this.nextUrl;
            kotlin.jvm.internal.f0.m(str);
            this.nextUrl = null;
            this.canRemove = true;
            return str;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.nextUrl != null) {
                return true;
            }
            this.canRemove = false;
            while (this.delegate.hasNext()) {
                try {
                    DiskLruCache.Snapshot next = this.delegate.next();
                    try {
                        continue;
                        this.nextUrl = Okio.buffer(next.getSource(0)).readUtf8LineStrict();
                        kotlin.io.b.a(next, null);
                        return true;
                    } catch (Throwable th2) {
                        try {
                            continue;
                            throw th2;
                        } catch (Throwable th3) {
                            kotlin.io.b.a(next, th2);
                            throw th3;
                        }
                    }
                } catch (IOException unused) {
                }
            }
            return false;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.canRemove) {
                throw new IllegalStateException("remove() before next()".toString());
            }
            this.delegate.remove();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@dl.d File directory, long j10) {
        this(directory, j10, FileSystem.SYSTEM);
        kotlin.jvm.internal.f0.p(directory, "directory");
    }

    public c(@dl.d File directory, long j10, @dl.d FileSystem fileSystem) {
        kotlin.jvm.internal.f0.p(directory, "directory");
        kotlin.jvm.internal.f0.p(fileSystem, "fileSystem");
        this.cache = new DiskLruCache(fileSystem, directory, f132384h, 2, j10, TaskRunner.INSTANCE);
    }

    private final void b(DiskLruCache.Editor editor) {
        if (editor != null) {
            try {
                editor.abort();
            } catch (IOException unused) {
            }
        }
    }

    @dl.d
    @xh.m
    public static final String o(@dl.d t tVar) {
        return INSTANCE.b(tVar);
    }

    public final synchronized void A() {
        this.hitCount++;
    }

    public final synchronized void C(@dl.d CacheStrategy cacheStrategy) {
        kotlin.jvm.internal.f0.p(cacheStrategy, "cacheStrategy");
        this.requestCount++;
        if (cacheStrategy.getNetworkRequest() != null) {
            this.networkCount++;
        } else if (cacheStrategy.getCacheResponse() != null) {
            this.hitCount++;
        }
    }

    public final void I(@dl.d c0 cached, @dl.d c0 network) {
        kotlin.jvm.internal.f0.p(cached, "cached");
        kotlin.jvm.internal.f0.p(network, "network");
        C1213c c1213c = new C1213c(network);
        d0 d0VarQ = cached.q();
        if (d0VarQ == null) {
            throw new NullPointerException("null cannot be cast to non-null type okhttp3.Cache.CacheResponseBody");
        }
        DiskLruCache.Editor editorEdit = null;
        try {
            editorEdit = ((a) d0VarQ).getSnapshot().edit();
            if (editorEdit != null) {
                c1213c.f(editorEdit);
                editorEdit.commit();
            }
        } catch (IOException unused) {
            b(editorEdit);
        }
    }

    @dl.d
    public final Iterator<String> J() throws IOException {
        return new e();
    }

    public final synchronized int K() {
        return this.writeAbortCount;
    }

    public final synchronized int L() {
        return this.writeSuccessCount;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134963d, imports = {}))
    @xh.h(name = "-deprecated_directory")
    public final File a() {
        return this.cache.getDirectory();
    }

    public final void c() throws IOException {
        this.cache.delete();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.cache.close();
    }

    @dl.d
    @xh.h(name = org.apache.tools.ant.taskdefs.optional.ejb.g.d.f134963d)
    public final File d() {
        return this.cache.getDirectory();
    }

    public final void e() throws IOException {
        this.cache.evictAll();
    }

    @dl.e
    public final c0 f(@dl.d a0 request) {
        kotlin.jvm.internal.f0.p(request, "request");
        try {
            DiskLruCache.Snapshot snapshot = this.cache.get(INSTANCE.b(request.q()));
            if (snapshot != null) {
                try {
                    C1213c c1213c = new C1213c(snapshot.getSource(0));
                    c0 c0VarD = c1213c.d(snapshot);
                    if (c1213c.b(request, c0VarD)) {
                        return c0VarD;
                    }
                    d0 d0VarQ = c0VarD.q();
                    if (d0VarQ != null) {
                        Util.closeQuietly(d0VarQ);
                    }
                    return null;
                } catch (IOException unused) {
                    Util.closeQuietly(snapshot);
                }
            }
        } catch (IOException unused2) {
        }
        return null;
    }

    @Override // java.io.Flushable
    public void flush() throws IOException {
        this.cache.flush();
    }

    @dl.d
    /* JADX INFO: renamed from: g, reason: from getter */
    public final DiskLruCache getCache() {
        return this.cache;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final int getWriteAbortCount() {
        return this.writeAbortCount;
    }

    public final boolean isClosed() {
        return this.cache.isClosed();
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final int getWriteSuccessCount() {
        return this.writeSuccessCount;
    }

    public final synchronized int m() {
        return this.hitCount;
    }

    public final void n() throws IOException {
        this.cache.initialize();
    }

    public final long p() {
        return this.cache.getMaxSize();
    }

    public final synchronized int q() {
        return this.networkCount;
    }

    @dl.e
    public final CacheRequest r(@dl.d c0 response) {
        DiskLruCache.Editor editorEdit$default;
        kotlin.jvm.internal.f0.p(response, "response");
        String strM = response.getRequest().m();
        if (HttpMethod.INSTANCE.invalidatesCache(response.getRequest().m())) {
            try {
                s(response.getRequest());
            } catch (IOException unused) {
            }
            return null;
        }
        if (!kotlin.jvm.internal.f0.g(strM, "GET")) {
            return null;
        }
        Companion companion = INSTANCE;
        if (companion.a(response)) {
            return null;
        }
        C1213c c1213c = new C1213c(response);
        try {
            editorEdit$default = DiskLruCache.edit$default(this.cache, companion.b(response.getRequest().q()), 0L, 2, null);
            if (editorEdit$default == null) {
                return null;
            }
            try {
                c1213c.f(editorEdit$default);
                return new d(this, editorEdit$default);
            } catch (IOException unused2) {
                b(editorEdit$default);
                return null;
            }
        } catch (IOException unused3) {
            editorEdit$default = null;
        }
    }

    public final void s(@dl.d a0 request) throws IOException {
        kotlin.jvm.internal.f0.p(request, "request");
        this.cache.remove(INSTANCE.b(request.q()));
    }

    public final long size() throws IOException {
        return this.cache.size();
    }

    public final synchronized int t() {
        return this.requestCount;
    }

    public final void x(int i10) {
        this.writeAbortCount = i10;
    }

    public final void z(int i10) {
        this.writeSuccessCount = i10;
    }
}
