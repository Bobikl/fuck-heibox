package okhttp3;

import com.max.xiaoheihe.bean.bbs.TopicHashtagWrapper;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.s0;
import okhttp3.internal.Util;
import okio.BufferedSink;
import okio.ByteString;
import okio.Okio;
import okio.Source;

/* JADX INFO: compiled from: RequestBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b&\u0018\u0000 \u000f2\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H&J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\f\u001a\u00020\nH\u0016¨\u0006\u0011"}, d2 = {"Lokhttp3/b0;", "", "Lokhttp3/v;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "Lkotlin/b2;", "writeTo", "", "isDuplex", "isOneShot", "<init>", "()V", "Companion", ak.av, "okhttp"}, k = 1, mv = {1, 4, 0})
public abstract class b0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: okhttp3.b0$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: RequestBody.kt */
    @Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\t\u001a\u00020\u0005*\u00020\b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\t\u0010\nJ3\u0010\u000f\u001a\u00020\u0005*\u00020\u000b2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\u00020\u0005*\u00020\u00112\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0002H\u0007J\u001a\u0010\u0016\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\bH\u0007J.\u0010\u0017\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\fH\u0007J\u001a\u0010\u0019\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0018\u001a\u00020\u0011H\u0007¨\u0006\u001c"}, d2 = {"Lokhttp3/b0$a;", "", "", "Lokhttp3/v;", "contentType", "Lokhttp3/b0;", "b", "(Ljava/lang/String;Lokhttp3/v;)Lokhttp3/b0;", "Lokio/ByteString;", "i", "(Lokio/ByteString;Lokhttp3/v;)Lokhttp3/b0;", "", "", androidx.constraintlayout.core.motion.utils.w.c.R, "byteCount", "m", "([BLokhttp3/v;II)Lokhttp3/b0;", "Ljava/io/File;", ak.av, "(Ljava/io/File;Lokhttp3/v;)Lokhttp3/b0;", "content", "d", "e", RXScreenCaptureService.KEY_HEIGHT, "file", ak.aF, "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {

        /* JADX INFO: renamed from: okhttp3.b0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RequestBody.kt */
        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"okhttp3/b0$a$a", "Lokhttp3/b0;", "Lokhttp3/v;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "Lkotlin/b2;", "writeTo", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class C1211a extends b0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ File f132376a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f132377b;

            C1211a(File file, v vVar) {
                this.f132376a = file;
                this.f132377b = vVar;
            }

            @Override // okhttp3.b0
            public long contentLength() {
                return this.f132376a.length();
            }

            @Override // okhttp3.b0
            @dl.e
            /* JADX INFO: renamed from: contentType, reason: from getter */
            public v getContentType() {
                return this.f132377b;
            }

            @Override // okhttp3.b0
            public void writeTo(@dl.d BufferedSink sink) throws FileNotFoundException {
                kotlin.jvm.internal.f0.p(sink, "sink");
                Source source = Okio.source(this.f132376a);
                try {
                    sink.writeAll(source);
                    kotlin.io.b.a(source, null);
                } catch (Throwable th2) {
                    try {
                        throw th2;
                    } catch (Throwable th3) {
                        kotlin.io.b.a(source, th2);
                        throw th3;
                    }
                }
            }
        }

        /* JADX INFO: renamed from: okhttp3.b0$a$b */
        /* JADX INFO: compiled from: RequestBody.kt */
        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"okhttp3/b0$a$b", "Lokhttp3/b0;", "Lokhttp3/v;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "Lkotlin/b2;", "writeTo", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class b extends b0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ByteString f132378a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f132379b;

            b(ByteString byteString, v vVar) {
                this.f132378a = byteString;
                this.f132379b = vVar;
            }

            @Override // okhttp3.b0
            public long contentLength() {
                return this.f132378a.size();
            }

            @Override // okhttp3.b0
            @dl.e
            /* JADX INFO: renamed from: contentType, reason: from getter */
            public v getContentType() {
                return this.f132379b;
            }

            @Override // okhttp3.b0
            public void writeTo(@dl.d BufferedSink sink) throws IOException {
                kotlin.jvm.internal.f0.p(sink, "sink");
                sink.write(this.f132378a);
            }
        }

        /* JADX INFO: renamed from: okhttp3.b0$a$c */
        /* JADX INFO: compiled from: RequestBody.kt */
        @Metadata(bv = {}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\n"}, d2 = {"okhttp3/b0$a$c", "Lokhttp3/b0;", "Lokhttp3/v;", "contentType", "", "contentLength", "Lokio/BufferedSink;", "sink", "Lkotlin/b2;", "writeTo", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class c extends b0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ byte[] f132380a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f132381b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f132382c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f132383d;

            c(byte[] bArr, v vVar, int i10, int i11) {
                this.f132380a = bArr;
                this.f132381b = vVar;
                this.f132382c = i10;
                this.f132383d = i11;
            }

            @Override // okhttp3.b0
            public long contentLength() {
                return this.f132382c;
            }

            @Override // okhttp3.b0
            @dl.e
            /* JADX INFO: renamed from: contentType, reason: from getter */
            public v getContentType() {
                return this.f132381b;
            }

            @Override // okhttp3.b0
            public void writeTo(@dl.d BufferedSink sink) throws IOException {
                kotlin.jvm.internal.f0.p(sink, "sink");
                sink.write(this.f132380a, this.f132383d, this.f132382c);
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ b0 n(Companion companion, File file, v vVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vVar = null;
            }
            return companion.a(file, vVar);
        }

        public static /* synthetic */ b0 o(Companion companion, String str, v vVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vVar = null;
            }
            return companion.b(str, vVar);
        }

        public static /* synthetic */ b0 p(Companion companion, v vVar, byte[] bArr, int i10, int i11, int i12, Object obj) {
            if ((i12 & 4) != 0) {
                i10 = 0;
            }
            if ((i12 & 8) != 0) {
                i11 = bArr.length;
            }
            return companion.h(vVar, bArr, i10, i11);
        }

        public static /* synthetic */ b0 q(Companion companion, ByteString byteString, v vVar, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                vVar = null;
            }
            return companion.i(byteString, vVar);
        }

        public static /* synthetic */ b0 r(Companion companion, byte[] bArr, v vVar, int i10, int i11, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                vVar = null;
            }
            if ((i12 & 2) != 0) {
                i10 = 0;
            }
            if ((i12 & 4) != 0) {
                i11 = bArr.length;
            }
            return companion.m(bArr, vVar, i10, i11);
        }

        @dl.d
        @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
        @xh.m
        public final b0 a(@dl.d File asRequestBody, @dl.e v vVar) {
            kotlin.jvm.internal.f0.p(asRequestBody, "$this$asRequestBody");
            return new C1211a(asRequestBody, vVar);
        }

        @dl.d
        @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
        @xh.m
        public final b0 b(@dl.d String toRequestBody, @dl.e v vVar) {
            kotlin.jvm.internal.f0.p(toRequestBody, "$this$toRequestBody");
            Charset charset = kotlin.text.d.f128566b;
            if (vVar != null) {
                Charset charsetG = v.g(vVar, null, 1, null);
                if (charsetG == null) {
                    vVar = v.INSTANCE.d(vVar + "; charset=utf-8");
                } else {
                    charset = charsetG;
                }
            }
            byte[] bytes = toRequestBody.getBytes(charset);
            kotlin.jvm.internal.f0.o(bytes, "(this as java.lang.String).getBytes(charset)");
            return m(bytes, vVar, 0, bytes.length);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @s0(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
        @xh.m
        public final b0 c(@dl.e v contentType, @dl.d File file) {
            kotlin.jvm.internal.f0.p(file, "file");
            return a(file, contentType);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @s0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @xh.m
        public final b0 d(@dl.e v contentType, @dl.d String content) {
            kotlin.jvm.internal.f0.p(content, "content");
            return b(content, contentType);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @s0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @xh.m
        public final b0 e(@dl.e v contentType, @dl.d ByteString content) {
            kotlin.jvm.internal.f0.p(content, "content");
            return i(content, contentType);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @s0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @xh.m
        @xh.i
        public final b0 f(@dl.e v vVar, @dl.d byte[] bArr) {
            return p(this, vVar, bArr, 0, 0, 12, null);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @s0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @xh.m
        @xh.i
        public final b0 g(@dl.e v vVar, @dl.d byte[] bArr, int i10) {
            return p(this, vVar, bArr, i10, 0, 8, null);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @s0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
        @xh.m
        @xh.i
        public final b0 h(@dl.e v contentType, @dl.d byte[] content, int offset, int byteCount) {
            kotlin.jvm.internal.f0.p(content, "content");
            return m(content, contentType, offset, byteCount);
        }

        @dl.d
        @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
        @xh.m
        public final b0 i(@dl.d ByteString toRequestBody, @dl.e v vVar) {
            kotlin.jvm.internal.f0.p(toRequestBody, "$this$toRequestBody");
            return new b(toRequestBody, vVar);
        }

        @dl.d
        @xh.m
        @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
        @xh.i
        public final b0 j(@dl.d byte[] bArr) {
            return r(this, bArr, null, 0, 0, 7, null);
        }

        @dl.d
        @xh.m
        @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
        @xh.i
        public final b0 k(@dl.d byte[] bArr, @dl.e v vVar) {
            return r(this, bArr, vVar, 0, 0, 6, null);
        }

        @dl.d
        @xh.m
        @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
        @xh.i
        public final b0 l(@dl.d byte[] bArr, @dl.e v vVar, int i10) {
            return r(this, bArr, vVar, i10, 0, 4, null);
        }

        @dl.d
        @xh.m
        @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
        @xh.i
        public final b0 m(@dl.d byte[] toRequestBody, @dl.e v vVar, int i10, int i11) {
            kotlin.jvm.internal.f0.p(toRequestBody, "$this$toRequestBody");
            Util.checkOffsetAndCount(toRequestBody.length, i10, i11);
            return new c(toRequestBody, vVar, i11, i10);
        }
    }

    @dl.d
    @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
    @xh.m
    public static final b0 create(@dl.d File file, @dl.e v vVar) {
        return INSTANCE.a(file, vVar);
    }

    @dl.d
    @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
    @xh.m
    public static final b0 create(@dl.d String str, @dl.e v vVar) {
        return INSTANCE.b(str, vVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'file' argument first to fix Java", replaceWith = @s0(expression = "file.asRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.asRequestBody"}))
    @xh.m
    public static final b0 create(@dl.e v vVar, @dl.d File file) {
        return INSTANCE.c(vVar, file);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @s0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @xh.m
    public static final b0 create(@dl.e v vVar, @dl.d String str) {
        return INSTANCE.d(vVar, str);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @s0(expression = "content.toRequestBody(contentType)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @xh.m
    public static final b0 create(@dl.e v vVar, @dl.d ByteString byteString) {
        return INSTANCE.e(vVar, byteString);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @s0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @xh.m
    @xh.i
    public static final b0 create(@dl.e v vVar, @dl.d byte[] bArr) {
        return Companion.p(INSTANCE, vVar, bArr, 0, 0, 12, null);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @s0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @xh.m
    @xh.i
    public static final b0 create(@dl.e v vVar, @dl.d byte[] bArr, int i10) {
        return Companion.p(INSTANCE, vVar, bArr, i10, 0, 8, null);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.WARNING, message = "Moved to extension function. Put the 'content' argument first to fix Java", replaceWith = @s0(expression = "content.toRequestBody(contentType, offset, byteCount)", imports = {"okhttp3.RequestBody.Companion.toRequestBody"}))
    @xh.m
    @xh.i
    public static final b0 create(@dl.e v vVar, @dl.d byte[] bArr, int i10, int i11) {
        return INSTANCE.h(vVar, bArr, i10, i11);
    }

    @dl.d
    @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
    @xh.m
    public static final b0 create(@dl.d ByteString byteString, @dl.e v vVar) {
        return INSTANCE.i(byteString, vVar);
    }

    @dl.d
    @xh.m
    @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
    @xh.i
    public static final b0 create(@dl.d byte[] bArr) {
        return Companion.r(INSTANCE, bArr, null, 0, 0, 7, null);
    }

    @dl.d
    @xh.m
    @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
    @xh.i
    public static final b0 create(@dl.d byte[] bArr, @dl.e v vVar) {
        return Companion.r(INSTANCE, bArr, vVar, 0, 0, 6, null);
    }

    @dl.d
    @xh.m
    @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
    @xh.i
    public static final b0 create(@dl.d byte[] bArr, @dl.e v vVar, int i10) {
        return Companion.r(INSTANCE, bArr, vVar, i10, 0, 4, null);
    }

    @dl.d
    @xh.m
    @xh.h(name = TopicHashtagWrapper.TYPE_CREATE)
    @xh.i
    public static final b0 create(@dl.d byte[] bArr, @dl.e v vVar, int i10, int i11) {
        return INSTANCE.m(bArr, vVar, i10, i11);
    }

    public long contentLength() throws IOException {
        return -1L;
    }

    @dl.e
    /* JADX INFO: renamed from: contentType */
    public abstract v getContentType();

    public boolean isDuplex() {
        return false;
    }

    public boolean isOneShot() {
        return false;
    }

    public abstract void writeTo(@dl.d BufferedSink bufferedSink) throws IOException;
}
