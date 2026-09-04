package okhttp3;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlinx.coroutines.s0;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSource;
import okio.ByteString;

/* JADX INFO: compiled from: ResponseBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000 \"2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b \u0010!JB\u0010\t\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00028\u00000\u00042\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0004H\u0082\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\f\u001a\u00020\u000bH\u0002J\n\u0010\u000e\u001a\u0004\u0018\u00010\rH&J\b\u0010\u0010\u001a\u00020\u000fH&J\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u0005H&J\u0006\u0010\u0015\u001a\u00020\u0014J\u0006\u0010\u0017\u001a\u00020\u0016J\u0006\u0010\u0019\u001a\u00020\u0018J\u0006\u0010\u001b\u001a\u00020\u001aJ\b\u0010\u001d\u001a\u00020\u001cH\u0016R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lokhttp3/d0;", "Ljava/io/Closeable;", "", androidx.exifinterface.media.a.f23244d5, "Lkotlin/Function1;", "Lokio/BufferedSource;", "consumer", "", "sizeMapper", "consumeSource", "(Lyh/l;Lyh/l;)Ljava/lang/Object;", "Ljava/nio/charset/Charset;", "charset", "Lokhttp3/v;", "contentType", "", "contentLength", "Ljava/io/InputStream;", "byteStream", "source", "", "bytes", "Lokio/ByteString;", "byteString", "Ljava/io/Reader;", "charStream", "", androidx.constraintlayout.core.motion.utils.w.b.f17895e, "Lkotlin/b2;", "close", "reader", "Ljava/io/Reader;", "<init>", "()V", "Companion", ak.av, "b", "okhttp"}, k = 1, mv = {1, 4, 0})
public abstract class d0 implements Closeable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Reader reader;

    /* JADX INFO: compiled from: ResponseBody.kt */
    @Metadata(bv = {}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0018\u001a\u00020\u0015¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\r\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lokhttp3/d0$a;", "Ljava/io/Reader;", "", "cbuf", "", s0.f130317e, "len", "read", "Lkotlin/b2;", "close", "", "b", "Z", "closed", ak.aF, "Ljava/io/Reader;", "delegate", "Lokio/BufferedSource;", "d", "Lokio/BufferedSource;", "source", "Ljava/nio/charset/Charset;", "e", "Ljava/nio/charset/Charset;", "charset", "<init>", "(Lokio/BufferedSource;Ljava/nio/charset/Charset;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a extends Reader {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean closed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private Reader delegate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final BufferedSource source;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Charset charset;

        public a(@dl.d BufferedSource source, @dl.d Charset charset) {
            kotlin.jvm.internal.f0.p(source, "source");
            kotlin.jvm.internal.f0.p(charset, "charset");
            this.source = source;
            this.charset = charset;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.closed = true;
            Reader reader = this.delegate;
            if (reader != null) {
                reader.close();
            } else {
                this.source.close();
            }
        }

        @Override // java.io.Reader
        public int read(@dl.d char[] cbuf, int off, int len) throws IOException {
            kotlin.jvm.internal.f0.p(cbuf, "cbuf");
            if (this.closed) {
                throw new IOException("Stream closed");
            }
            Reader inputStreamReader = this.delegate;
            if (inputStreamReader == null) {
                inputStreamReader = new InputStreamReader(this.source.inputStream(), Util.readBomAsCharset(this.source, this.charset));
                this.delegate = inputStreamReader;
            }
            return inputStreamReader.read(cbuf, off, len);
        }
    }

    /* JADX INFO: renamed from: okhttp3.d0$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: ResponseBody.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0011\u001a\u00020\u0005*\u00020\u000e2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0007J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\bH\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u000bH\u0007J\"\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000eH\u0007¨\u0006\u001a"}, d2 = {"Lokhttp3/d0$b;", "", "", "Lokhttp3/v;", "contentType", "Lokhttp3/d0;", ak.av, "(Ljava/lang/String;Lokhttp3/v;)Lokhttp3/d0;", "", RXScreenCaptureService.KEY_HEIGHT, "([BLokhttp3/v;)Lokhttp3/d0;", "Lokio/ByteString;", "g", "(Lokio/ByteString;Lokhttp3/v;)Lokhttp3/d0;", "Lokio/BufferedSource;", "", "contentLength", "f", "(Lokio/BufferedSource;Lokhttp3/v;J)Lokhttp3/d0;", "content", ak.aF, "e", "d", "b", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: okhttp3.d0$b$a */
        /* JADX INFO: compiled from: ResponseBody.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"okhttp3/d0$b$a", "Lokhttp3/d0;", "Lokhttp3/v;", "contentType", "", "contentLength", "Lokio/BufferedSource;", "source", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class a extends d0 {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ BufferedSource f132479c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ v f132480d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ long f132481e;

            a(BufferedSource bufferedSource, v vVar, long j10) {
                this.f132479c = bufferedSource;
                this.f132480d = vVar;
                this.f132481e = j10;
            }

            @Override // okhttp3.d0
            /* JADX INFO: renamed from: contentLength, reason: from getter */
            public long getF132481e() {
                return this.f132481e;
            }

            @Override // okhttp3.d0
            @dl.e
            /* JADX INFO: renamed from: contentType, reason: from getter */
            public v getF132480d() {
                return this.f132480d;
            }

            @Override // okhttp3.d0
            @dl.d
            /* JADX INFO: renamed from: source, reason: from getter */
            public BufferedSource getF132479c() {
                return this.f132479c;
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ d0 i(Companion companion, String str, v vVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vVar = null;
            }
            return companion.a(str, vVar);
        }

        public static /* synthetic */ d0 j(Companion companion, BufferedSource bufferedSource, v vVar, long j10, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vVar = null;
            }
            if ((i10 & 2) != 0) {
                j10 = -1;
            }
            return companion.f(bufferedSource, vVar, j10);
        }

        public static /* synthetic */ d0 k(Companion companion, ByteString byteString, v vVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vVar = null;
            }
            return companion.g(byteString, vVar);
        }

        public static /* synthetic */ d0 l(Companion companion, byte[] bArr, v vVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vVar = null;
            }
            return companion.h(bArr, vVar);
        }

        @dl.d
        @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
        @xh.m
        public final d0 a(@dl.d String toResponseBody, @dl.e v vVar) {
            kotlin.jvm.internal.f0.p(toResponseBody, "$this$toResponseBody");
            Charset charset = kotlin.text.d.f128566b;
            if (vVar != null) {
                Charset charsetG = v.g(vVar, null, 1, null);
                if (charsetG == null) {
                    vVar = v.INSTANCE.d(vVar + "; charset=utf-8");
                } else {
                    charset = charsetG;
                }
            }
            Buffer bufferWriteString = new Buffer().writeString(toResponseBody, charset);
            return f(bufferWriteString, vVar, bufferWriteString.size());
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.s0(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
        @xh.m
        public final d0 b(@dl.e v contentType, long contentLength, @dl.d BufferedSource content) {
            kotlin.jvm.internal.f0.p(content, "content");
            return f(content, contentType, contentLength);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.s0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @xh.m
        public final d0 c(@dl.e v contentType, @dl.d String content) {
            kotlin.jvm.internal.f0.p(content, "content");
            return a(content, contentType);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.s0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @xh.m
        public final d0 d(@dl.e v contentType, @dl.d ByteString content) {
            kotlin.jvm.internal.f0.p(content, "content");
            return g(content, contentType);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.s0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
        @xh.m
        public final d0 e(@dl.e v contentType, @dl.d byte[] content) {
            kotlin.jvm.internal.f0.p(content, "content");
            return h(content, contentType);
        }

        @dl.d
        @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
        @xh.m
        public final d0 f(@dl.d BufferedSource asResponseBody, @dl.e v vVar, long j10) {
            kotlin.jvm.internal.f0.p(asResponseBody, "$this$asResponseBody");
            return new a(asResponseBody, vVar, j10);
        }

        @dl.d
        @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
        @xh.m
        public final d0 g(@dl.d ByteString toResponseBody, @dl.e v vVar) {
            kotlin.jvm.internal.f0.p(toResponseBody, "$this$toResponseBody");
            return f(new Buffer().write(toResponseBody), vVar, toResponseBody.size());
        }

        @dl.d
        @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
        @xh.m
        public final d0 h(@dl.d byte[] toResponseBody, @dl.e v vVar) {
            kotlin.jvm.internal.f0.p(toResponseBody, "$this$toResponseBody");
            return f(new Buffer().write(toResponseBody), vVar, toResponseBody.length);
        }
    }

    private final Charset charset() {
        Charset charsetF;
        v f132480d = getF132480d();
        return (f132480d == null || (charsetF = f132480d.f(kotlin.text.d.f128566b)) == null) ? kotlin.text.d.f128566b : charsetF;
    }

    /* JADX WARN: Type inference failed for: r6v3, types: [T, java.lang.Object] */
    private final <T> T consumeSource(yh.l<? super BufferedSource, ? extends T> consumer, yh.l<? super T, Integer> sizeMapper) throws IOException {
        long f132481e = getF132481e();
        if (f132481e > Integer.MAX_VALUE) {
            throw new IOException("Cannot buffer entire body for content length: " + f132481e);
        }
        BufferedSource f132479c = getF132479c();
        try {
            T tInvoke = consumer.invoke(f132479c);
            kotlin.jvm.internal.c0.d(1);
            kotlin.io.b.a(f132479c, null);
            kotlin.jvm.internal.c0.c(1);
            int iIntValue = sizeMapper.invoke(tInvoke).intValue();
            if (f132481e == -1 || f132481e == iIntValue) {
                return tInvoke;
            }
            throw new IOException("Content-Length (" + f132481e + ") and stream length (" + iIntValue + ") disagree");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.jvm.internal.c0.d(1);
                kotlin.io.b.a(f132479c, th2);
                kotlin.jvm.internal.c0.c(1);
                throw th3;
            }
        }
    }

    @dl.d
    @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
    @xh.m
    public static final d0 create(@dl.d String str, @dl.e v vVar) {
        return INSTANCE.a(str, vVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.s0(expression = "content.asResponseBody(contentType, contentLength)", imports = {"okhttp3.ResponseBody.Companion.asResponseBody"}))
    @xh.m
    public static final d0 create(@dl.e v vVar, long j10, @dl.d BufferedSource bufferedSource) {
        return INSTANCE.b(vVar, j10, bufferedSource);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.s0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @xh.m
    public static final d0 create(@dl.e v vVar, @dl.d String str) {
        return INSTANCE.c(vVar, str);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.s0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @xh.m
    public static final d0 create(@dl.e v vVar, @dl.d ByteString byteString) {
        return INSTANCE.d(vVar, byteString);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @kotlin.s0(expression = "content.toResponseBody(contentType)", imports = {"okhttp3.ResponseBody.Companion.toResponseBody"}))
    @xh.m
    public static final d0 create(@dl.e v vVar, @dl.d byte[] bArr) {
        return INSTANCE.e(vVar, bArr);
    }

    @dl.d
    @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
    @xh.m
    public static final d0 create(@dl.d BufferedSource bufferedSource, @dl.e v vVar, long j10) {
        return INSTANCE.f(bufferedSource, vVar, j10);
    }

    @dl.d
    @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
    @xh.m
    public static final d0 create(@dl.d ByteString byteString, @dl.e v vVar) {
        return INSTANCE.g(byteString, vVar);
    }

    @dl.d
    @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
    @xh.m
    public static final d0 create(@dl.d byte[] bArr, @dl.e v vVar) {
        return INSTANCE.h(bArr, vVar);
    }

    @dl.d
    public final InputStream byteStream() {
        return getF132479c().inputStream();
    }

    @dl.d
    public final ByteString byteString() throws IOException {
        long f132481e = getF132481e();
        if (f132481e > Integer.MAX_VALUE) {
            throw new IOException("Cannot buffer entire body for content length: " + f132481e);
        }
        BufferedSource f132479c = getF132479c();
        try {
            ByteString byteString = f132479c.readByteString();
            kotlin.io.b.a(f132479c, null);
            int size = byteString.size();
            if (f132481e == -1 || f132481e == size) {
                return byteString;
            }
            throw new IOException("Content-Length (" + f132481e + ") and stream length (" + size + ") disagree");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(f132479c, th2);
                throw th3;
            }
        }
    }

    @dl.d
    public final byte[] bytes() throws IOException {
        long f132481e = getF132481e();
        if (f132481e > Integer.MAX_VALUE) {
            throw new IOException("Cannot buffer entire body for content length: " + f132481e);
        }
        BufferedSource f132479c = getF132479c();
        try {
            byte[] byteArray = f132479c.readByteArray();
            kotlin.io.b.a(f132479c, null);
            int length = byteArray.length;
            if (f132481e == -1 || f132481e == length) {
                return byteArray;
            }
            throw new IOException("Content-Length (" + f132481e + ") and stream length (" + length + ") disagree");
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(f132479c, th2);
                throw th3;
            }
        }
    }

    @dl.d
    public final Reader charStream() {
        Reader reader = this.reader;
        if (reader != null) {
            return reader;
        }
        a aVar = new a(getF132479c(), charset());
        this.reader = aVar;
        return aVar;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Util.closeQuietly(getF132479c());
    }

    /* JADX INFO: renamed from: contentLength */
    public abstract long getF132481e();

    @dl.e
    /* JADX INFO: renamed from: contentType */
    public abstract v getF132480d();

    @dl.d
    /* JADX INFO: renamed from: source */
    public abstract BufferedSource getF132479c();

    @dl.d
    public final String string() throws IOException {
        BufferedSource f132479c = getF132479c();
        try {
            String string = f132479c.readString(Util.readBomAsCharset(f132479c, charset()));
            kotlin.io.b.a(f132479c, null);
            return string;
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(f132479c, th2);
                throw th3;
            }
        }
    }
}
