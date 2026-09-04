package okhttp3;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import com.umeng.analytics.pro.ak;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.s0;
import okhttp3.internal.Util;
import okio.Buffer;
import okio.BufferedSink;
import okio.ByteString;

/* JADX INFO: compiled from: MultipartBody.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 +2\u00020\u0001:\u0003\u0011\u0016\u0013B'\b\u0000\u0012\u0006\u0010\u001f\u001a\u00020\u001d\u0012\u0006\u0010!\u001a\u00020\f\u0012\f\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u0015¢\u0006\u0004\b)\u0010*J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bJ\b\u0010\r\u001a\u00020\fH\u0016J\u000f\u0010\u000e\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u0010\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001bR\u0016\u0010\u0018\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u001cR\u0014\u0010\u001f\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001eR\u0017\u0010!\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u001b\u001a\u0004\b \u0010\u000fR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0007¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0017R\u0011\u0010&\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\"\u0010\u0012R\u0011\u0010(\u001a\u00020\b8G¢\u0006\u0006\u001a\u0004\b'\u0010\u0014¨\u0006,"}, d2 = {"Lokhttp3/w;", "Lokhttp3/b0;", "Lokio/BufferedSink;", "sink", "", "countBytes", "", "j", "", UCropPlusActivity.ARG_INDEX, "Lokhttp3/w$c;", "f", "Lokhttp3/v;", "contentType", "d", "()Lokhttp3/v;", "", ak.av, "()Ljava/lang/String;", ak.aF, "()I", "", "b", "()Ljava/util/List;", "contentLength", "Lkotlin/b2;", "writeTo", "Lokhttp3/v;", "J", "Lokio/ByteString;", "Lokio/ByteString;", "boundaryByteString", "i", "type", "e", "Ljava/util/List;", "g", "parts", "boundary", RXScreenCaptureService.KEY_HEIGHT, UiKitSpanObj.TYPE_SIZE, "<init>", "(Lokio/ByteString;Lokhttp3/v;Ljava/util/List;)V", "n", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class w extends b0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final v f132684f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final v f132685g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final v f132686h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final v f132687i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final v f132688j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final byte[] f132689k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final byte[] f132690l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final byte[] f132691m;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v contentType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private long contentLength;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ByteString boundaryByteString;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final v type;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final List<c> parts;

    /* JADX INFO: compiled from: MultipartBody.kt */
    @Metadata(bv = {}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u001d\u0010\u001eJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005J\u0018\u0010\n\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0006\u001a\u00020\u0005J\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bJ \u0010\u0010\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u0005J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u0011J\u0006\u0010\u0015\u001a\u00020\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0017R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00110\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001b¨\u0006\u001f"}, d2 = {"Lokhttp3/w$a;", "", "Lokhttp3/v;", "type", "g", "Lokhttp3/b0;", "body", "e", "Lokhttp3/s;", "headers", ak.aF, "", "name", "value", ak.av, "filename", "b", "Lokhttp3/w$c;", "part", "d", "Lokhttp3/w;", "f", "Lokio/ByteString;", "Lokio/ByteString;", "boundary", "Lokhttp3/v;", "", "Ljava/util/List;", "parts", "<init>", "(Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ByteString boundary;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private v type;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final List<c> parts;

        /* JADX WARN: Multi-variable type inference failed */
        @xh.i
        public a() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        @xh.i
        public a(@dl.d String boundary) {
            kotlin.jvm.internal.f0.p(boundary, "boundary");
            this.boundary = ByteString.INSTANCE.encodeUtf8(boundary);
            this.type = w.f132684f;
            this.parts = new ArrayList();
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ a(String str, int i10, kotlin.jvm.internal.u uVar) {
            if ((i10 & 1) != 0) {
                str = UUID.randomUUID().toString();
                kotlin.jvm.internal.f0.o(str, "UUID.randomUUID().toString()");
            }
            this(str);
        }

        @dl.d
        public final a a(@dl.d String name, @dl.d String value) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(value, "value");
            d(c.INSTANCE.c(name, value));
            return this;
        }

        @dl.d
        public final a b(@dl.d String name, @dl.e String filename, @dl.d b0 body) {
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(body, "body");
            d(c.INSTANCE.d(name, filename, body));
            return this;
        }

        @dl.d
        public final a c(@dl.e s headers, @dl.d b0 body) {
            kotlin.jvm.internal.f0.p(body, "body");
            d(c.INSTANCE.a(headers, body));
            return this;
        }

        @dl.d
        public final a d(@dl.d c part) {
            kotlin.jvm.internal.f0.p(part, "part");
            this.parts.add(part);
            return this;
        }

        @dl.d
        public final a e(@dl.d b0 body) {
            kotlin.jvm.internal.f0.p(body, "body");
            d(c.INSTANCE.b(body));
            return this;
        }

        @dl.d
        public final w f() {
            if (!this.parts.isEmpty()) {
                return new w(this.boundary, this.type, Util.toImmutableList(this.parts));
            }
            throw new IllegalStateException("Multipart body must have at least one part.".toString());
        }

        @dl.d
        public final a g(@dl.d v type) {
            kotlin.jvm.internal.f0.p(type, "type");
            if (kotlin.jvm.internal.f0.g(type.l(), "multipart")) {
                this.type = type;
                return this;
            }
            throw new IllegalArgumentException(("multipart != " + type).toString());
        }
    }

    /* JADX INFO: renamed from: okhttp3.w$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MultipartBody.kt */
    @Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0007\u001a\u00020\u0006*\u00060\u0002j\u0002`\u00032\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u000b¨\u0006\u0017"}, d2 = {"Lokhttp3/w$b;", "", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "", "key", "Lkotlin/b2;", ak.av, "(Ljava/lang/StringBuilder;Ljava/lang/String;)V", "Lokhttp3/v;", "ALTERNATIVE", "Lokhttp3/v;", "", "COLONSPACE", "[B", "CRLF", "DASHDASH", "DIGEST", "FORM", "MIXED", "PARALLEL", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        public final void a(@dl.d StringBuilder appendQuotedString, @dl.d String key) {
            kotlin.jvm.internal.f0.p(appendQuotedString, "$this$appendQuotedString");
            kotlin.jvm.internal.f0.p(key, "key");
            appendQuotedString.append(kotlin.text.y.f128593b);
            int length = key.length();
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = key.charAt(i10);
                if (cCharAt == '\n') {
                    appendQuotedString.append("%0A");
                } else if (cCharAt == '\r') {
                    appendQuotedString.append("%0D");
                } else if (cCharAt != '\"') {
                    appendQuotedString.append(cCharAt);
                } else {
                    appendQuotedString.append("%22");
                }
            }
            appendQuotedString.append(kotlin.text.y.f128593b);
        }
    }

    /* JADX INFO: compiled from: MultipartBody.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 \f2\u00020\u0001:\u0001\u0006B\u001b\b\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\b\u001a\u0004\b\t\u0010\u0004R\u0017\u0010\r\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\u0007¨\u0006\u0010"}, d2 = {"Lokhttp3/w$c;", "", "Lokhttp3/s;", "b", "()Lokhttp3/s;", "Lokhttp3/b0;", ak.av, "()Lokhttp3/b0;", "Lokhttp3/s;", RXScreenCaptureService.KEY_HEIGHT, "headers", "Lokhttp3/b0;", ak.aF, "body", "<init>", "(Lokhttp3/s;Lokhttp3/b0;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class c {

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        @dl.e
        private final s headers;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        @dl.d
        private final b0 body;

        /* JADX INFO: renamed from: okhttp3.w$c$a, reason: from kotlin metadata */
        /* JADX INFO: compiled from: MultipartBody.kt */
        @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0007J\"\u0010\u000e\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\u0011"}, d2 = {"Lokhttp3/w$c$a;", "", "Lokhttp3/b0;", "body", "Lokhttp3/w$c;", "b", "Lokhttp3/s;", "headers", ak.av, "", "name", "value", ak.aF, "filename", "d", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }

            @dl.d
            @xh.m
            public final c a(@dl.e s headers, @dl.d b0 body) {
                kotlin.jvm.internal.f0.p(body, "body");
                kotlin.jvm.internal.u uVar = null;
                if (!((headers != null ? headers.e("Content-Type") : null) == null)) {
                    throw new IllegalArgumentException("Unexpected header: Content-Type".toString());
                }
                if ((headers != null ? headers.e("Content-Length") : null) == null) {
                    return new c(headers, body, uVar);
                }
                throw new IllegalArgumentException("Unexpected header: Content-Length".toString());
            }

            @dl.d
            @xh.m
            public final c b(@dl.d b0 body) {
                kotlin.jvm.internal.f0.p(body, "body");
                return a(null, body);
            }

            @dl.d
            @xh.m
            public final c c(@dl.d String name, @dl.d String value) {
                kotlin.jvm.internal.f0.p(name, "name");
                kotlin.jvm.internal.f0.p(value, "value");
                return d(name, null, b0.Companion.o(b0.INSTANCE, value, null, 1, null));
            }

            @dl.d
            @xh.m
            public final c d(@dl.d String name, @dl.e String filename, @dl.d b0 body) {
                kotlin.jvm.internal.f0.p(name, "name");
                kotlin.jvm.internal.f0.p(body, "body");
                StringBuilder sb2 = new StringBuilder();
                sb2.append("form-data; name=");
                Companion companion = w.INSTANCE;
                companion.a(sb2, name);
                if (filename != null) {
                    sb2.append("; filename=");
                    companion.a(sb2, filename);
                }
                String string = sb2.toString();
                kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
                return a(new s.a().h("Content-Disposition", string).i(), body);
            }
        }

        private c(s sVar, b0 b0Var) {
            this.headers = sVar;
            this.body = b0Var;
        }

        public /* synthetic */ c(s sVar, b0 b0Var, kotlin.jvm.internal.u uVar) {
            this(sVar, b0Var);
        }

        @dl.d
        @xh.m
        public static final c d(@dl.e s sVar, @dl.d b0 b0Var) {
            return INSTANCE.a(sVar, b0Var);
        }

        @dl.d
        @xh.m
        public static final c e(@dl.d b0 b0Var) {
            return INSTANCE.b(b0Var);
        }

        @dl.d
        @xh.m
        public static final c f(@dl.d String str, @dl.d String str2) {
            return INSTANCE.c(str, str2);
        }

        @dl.d
        @xh.m
        public static final c g(@dl.d String str, @dl.e String str2, @dl.d b0 b0Var) {
            return INSTANCE.d(str, str2, b0Var);
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "body", imports = {}))
        @xh.h(name = "-deprecated_body")
        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getBody() {
            return this.body;
        }

        @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "headers", imports = {}))
        @xh.h(name = "-deprecated_headers")
        @dl.e
        /* JADX INFO: renamed from: b, reason: from getter */
        public final s getHeaders() {
            return this.headers;
        }

        @dl.d
        @xh.h(name = "body")
        public final b0 c() {
            return this.body;
        }

        @xh.h(name = "headers")
        @dl.e
        public final s h() {
            return this.headers;
        }
    }

    static {
        v.Companion companion = v.INSTANCE;
        f132684f = companion.c("multipart/mixed");
        f132685g = companion.c("multipart/alternative");
        f132686h = companion.c("multipart/digest");
        f132687i = companion.c("multipart/parallel");
        f132688j = companion.c("multipart/form-data");
        f132689k = new byte[]{(byte) 58, (byte) 32};
        f132690l = new byte[]{(byte) 13, (byte) 10};
        byte b10 = (byte) 45;
        f132691m = new byte[]{b10, b10};
    }

    public w(@dl.d ByteString boundaryByteString, @dl.d v type, @dl.d List<c> parts) {
        kotlin.jvm.internal.f0.p(boundaryByteString, "boundaryByteString");
        kotlin.jvm.internal.f0.p(type, "type");
        kotlin.jvm.internal.f0.p(parts, "parts");
        this.boundaryByteString = boundaryByteString;
        this.type = type;
        this.parts = parts;
        this.contentType = v.INSTANCE.c(type + "; boundary=" + e());
        this.contentLength = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long j(BufferedSink sink, boolean countBytes) throws IOException {
        Buffer buffer;
        if (countBytes) {
            sink = new Buffer();
            buffer = sink;
        } else {
            buffer = 0;
        }
        int size = this.parts.size();
        long j10 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            c cVar = this.parts.get(i10);
            s sVarH = cVar.h();
            b0 b0VarC = cVar.c();
            kotlin.jvm.internal.f0.m(sink);
            sink.write(f132691m);
            sink.write(this.boundaryByteString);
            sink.write(f132690l);
            if (sVarH != null) {
                int size2 = sVarH.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    sink.writeUtf8(sVarH.i(i11)).write(f132689k).writeUtf8(sVarH.v(i11)).write(f132690l);
                }
            }
            v contentType = b0VarC.getF132381b();
            if (contentType != null) {
                sink.writeUtf8("Content-Type: ").writeUtf8(contentType.getMediaType()).write(f132690l);
            }
            long jContentLength = b0VarC.contentLength();
            if (jContentLength != -1) {
                sink.writeUtf8("Content-Length: ").writeDecimalLong(jContentLength).write(f132690l);
            } else if (countBytes) {
                kotlin.jvm.internal.f0.m(buffer);
                buffer.clear();
                return -1L;
            }
            byte[] bArr = f132690l;
            sink.write(bArr);
            if (countBytes) {
                j10 += jContentLength;
            } else {
                b0VarC.writeTo(sink);
            }
            sink.write(bArr);
        }
        kotlin.jvm.internal.f0.m(sink);
        byte[] bArr2 = f132691m;
        sink.write(bArr2);
        sink.write(this.boundaryByteString);
        sink.write(bArr2);
        sink.write(f132690l);
        if (!countBytes) {
            return j10;
        }
        kotlin.jvm.internal.f0.m(buffer);
        long size3 = j10 + buffer.size();
        buffer.clear();
        return size3;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "boundary", imports = {}))
    @xh.h(name = "-deprecated_boundary")
    public final String a() {
        return e();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "parts", imports = {}))
    @xh.h(name = "-deprecated_parts")
    public final List<c> b() {
        return this.parts;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = UiKitSpanObj.TYPE_SIZE, imports = {}))
    @xh.h(name = "-deprecated_size")
    public final int c() {
        return h();
    }

    @Override // okhttp3.b0
    public long contentLength() throws IOException {
        long j10 = this.contentLength;
        if (j10 != -1) {
            return j10;
        }
        long j11 = j(null, true);
        this.contentLength = j11;
        return j11;
    }

    @Override // okhttp3.b0
    @dl.d
    /* JADX INFO: renamed from: contentType, reason: from getter */
    public v getF132381b() {
        return this.contentType;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "type", imports = {}))
    @xh.h(name = "-deprecated_type")
    /* JADX INFO: renamed from: d, reason: from getter */
    public final v getType() {
        return this.type;
    }

    @dl.d
    @xh.h(name = "boundary")
    public final String e() {
        return this.boundaryByteString.utf8();
    }

    @dl.d
    public final c f(int index) {
        return this.parts.get(index);
    }

    @dl.d
    @xh.h(name = "parts")
    public final List<c> g() {
        return this.parts;
    }

    @xh.h(name = UiKitSpanObj.TYPE_SIZE)
    public final int h() {
        return this.parts.size();
    }

    @dl.d
    @xh.h(name = "type")
    public final v i() {
        return this.type;
    }

    @Override // okhttp3.b0
    public void writeTo(@dl.d BufferedSink sink) throws IOException {
        kotlin.jvm.internal.f0.p(sink, "sink");
        j(sink, false);
    }
}
