package retrofit2;

import java.io.IOException;
import java.util.regex.Pattern;
import javax.annotation.Nullable;
import okhttp3.a0;
import okhttp3.b0;
import okio.Buffer;
import okio.BufferedSink;

/* JADX INFO: compiled from: RequestBuilder.java */
/* JADX INFO: loaded from: classes5.dex */
public final class q {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f139047m = " \"<>^`{}|\\?#";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f139049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final okhttp3.t f139050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private String f139051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private okhttp3.t.a f139052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a0.a f139053e = new a0.a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final okhttp3.s.a f139054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private okhttp3.v f139055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f139056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private okhttp3.w.a f139057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private okhttp3.q.a f139058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @Nullable
    private b0 f139059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final char[] f139046l = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final Pattern f139048n = Pattern.compile("(.*/)?(\\.|%2e|%2E){1,2}(/.*)?");

    /* JADX INFO: compiled from: RequestBuilder.java */
    public static class a extends b0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b0 f139060a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final okhttp3.v f139061b;

        a(b0 b0Var, okhttp3.v vVar) {
            this.f139060a = b0Var;
            this.f139061b = vVar;
        }

        @Override // okhttp3.b0
        public long contentLength() throws IOException {
            return this.f139060a.contentLength();
        }

        @Override // okhttp3.b0
        /* JADX INFO: renamed from: contentType */
        public okhttp3.v getF132381b() {
            return this.f139061b;
        }

        @Override // okhttp3.b0
        public void writeTo(BufferedSink bufferedSink) throws IOException {
            this.f139060a.writeTo(bufferedSink);
        }
    }

    q(String str, okhttp3.t tVar, @Nullable String str2, @Nullable okhttp3.s sVar, @Nullable okhttp3.v vVar, boolean z10, boolean z11, boolean z12) {
        this.f139049a = str;
        this.f139050b = tVar;
        this.f139051c = str2;
        this.f139055g = vVar;
        this.f139056h = z10;
        if (sVar != null) {
            this.f139054f = sVar.l();
        } else {
            this.f139054f = new okhttp3.s.a();
        }
        if (z11) {
            this.f139058j = new okhttp3.q.a();
        } else if (z12) {
            okhttp3.w.a aVar = new okhttp3.w.a();
            this.f139057i = aVar;
            aVar.g(okhttp3.w.f132688j);
        }
    }

    private static String i(String str, boolean z10) {
        int length = str.length();
        int iCharCount = 0;
        while (iCharCount < length) {
            int iCodePointAt = str.codePointAt(iCharCount);
            if (iCodePointAt < 32 || iCodePointAt >= 127 || f139047m.indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                Buffer buffer = new Buffer();
                buffer.writeUtf8(str, 0, iCharCount);
                j(buffer, str, iCharCount, length, z10);
                return buffer.readUtf8();
            }
            iCharCount += Character.charCount(iCodePointAt);
        }
        return str;
    }

    private static void j(Buffer buffer, String str, int i10, int i11, boolean z10) {
        Buffer buffer2 = null;
        while (i10 < i11) {
            int iCodePointAt = str.codePointAt(i10);
            if (!z10 || (iCodePointAt != 9 && iCodePointAt != 10 && iCodePointAt != 12 && iCodePointAt != 13)) {
                if (iCodePointAt < 32 || iCodePointAt >= 127 || f139047m.indexOf(iCodePointAt) != -1 || (!z10 && (iCodePointAt == 47 || iCodePointAt == 37))) {
                    if (buffer2 == null) {
                        buffer2 = new Buffer();
                    }
                    buffer2.writeUtf8CodePoint(iCodePointAt);
                    while (!buffer2.exhausted()) {
                        int i12 = buffer2.readByte() & 255;
                        buffer.writeByte(37);
                        char[] cArr = f139046l;
                        buffer.writeByte((int) cArr[(i12 >> 4) & 15]);
                        buffer.writeByte((int) cArr[i12 & 15]);
                    }
                } else {
                    buffer.writeUtf8CodePoint(iCodePointAt);
                }
            }
            i10 += Character.charCount(iCodePointAt);
        }
    }

    void a(String str, String str2, boolean z10) {
        if (z10) {
            this.f139058j.b(str, str2);
        } else {
            this.f139058j.a(str, str2);
        }
    }

    void b(String str, String str2) {
        if (!"Content-Type".equalsIgnoreCase(str)) {
            this.f139054f.b(str, str2);
            return;
        }
        try {
            this.f139055g = okhttp3.v.h(str2);
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException("Malformed content type: " + str2, e10);
        }
    }

    void c(okhttp3.s sVar) {
        this.f139054f.e(sVar);
    }

    void d(okhttp3.s sVar, b0 b0Var) {
        this.f139057i.c(sVar, b0Var);
    }

    void e(okhttp3.w.c cVar) {
        this.f139057i.d(cVar);
    }

    void f(String str, String str2, boolean z10) {
        if (this.f139051c == null) {
            throw new AssertionError();
        }
        String strI = i(str2, z10);
        String strReplace = this.f139051c.replace("{" + str + z5.g.f141884d, strI);
        if (!f139048n.matcher(strReplace).matches()) {
            this.f139051c = strReplace;
            return;
        }
        throw new IllegalArgumentException("@Path parameters shouldn't perform path traversal ('.' or '..'): " + str2);
    }

    void g(String str, @Nullable String str2, boolean z10) {
        String str3 = this.f139051c;
        if (str3 != null) {
            okhttp3.t.a aVarI = this.f139050b.I(str3);
            this.f139052d = aVarI;
            if (aVarI == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f139050b + ", Relative: " + this.f139051c);
            }
            this.f139051c = null;
        }
        if (z10) {
            this.f139052d.c(str, str2);
        } else {
            this.f139052d.g(str, str2);
        }
    }

    <T> void h(Class<T> cls, @Nullable T t10) {
        this.f139053e.z(cls, t10);
    }

    a0.a k() {
        okhttp3.t tVarW;
        okhttp3.t.a aVar = this.f139052d;
        if (aVar != null) {
            tVarW = aVar.h();
        } else {
            tVarW = this.f139050b.W(this.f139051c);
            if (tVarW == null) {
                throw new IllegalArgumentException("Malformed URL. Base: " + this.f139050b + ", Relative: " + this.f139051c);
            }
        }
        b0 aVar2 = this.f139059k;
        if (aVar2 == null) {
            okhttp3.q.a aVar3 = this.f139058j;
            if (aVar3 != null) {
                aVar2 = aVar3.c();
            } else {
                okhttp3.w.a aVar4 = this.f139057i;
                if (aVar4 != null) {
                    aVar2 = aVar4.f();
                } else if (this.f139056h) {
                    aVar2 = b0.create((okhttp3.v) null, new byte[0]);
                }
            }
        }
        okhttp3.v vVar = this.f139055g;
        if (vVar != null) {
            if (aVar2 != null) {
                aVar2 = new a(aVar2, vVar);
            } else {
                this.f139054f.b("Content-Type", vVar.getMediaType());
            }
        }
        return this.f139053e.D(tVarW).o(this.f139054f.i()).p(this.f139049a, aVar2);
    }

    void l(b0 b0Var) {
        this.f139059k = b0Var;
    }

    void m(Object obj) {
        this.f139051c = obj.toString();
    }
}
