package okhttp3.logging;

import com.umeng.analytics.pro.ak;
import dl.d;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.d1;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.k;
import kotlin.s0;
import okhttp3.a0;
import okhttp3.b0;
import okhttp3.c0;
import okhttp3.d0;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.platform.Platform;
import okhttp3.s;
import okhttp3.u;
import okhttp3.v;
import okio.Buffer;
import okio.BufferedSource;
import okio.GzipSource;
import xh.e;
import xh.h;
import xh.i;

/* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0002#\u0010B\u0013\b\u0007\u0012\b\b\u0002\u0010 \u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u000e\u001a\u00020\rJ\u000f\u0010\u0010\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016R\u001c\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0017R*\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\r8\u0006@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001f¨\u0006$"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor;", "Lokhttp3/u;", "Lokhttp3/s;", "headers", "", "i", "Lkotlin/b2;", "e", "", "b", "", "name", "f", "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "level", "g", ak.av, "()Lokhttp3/logging/HttpLoggingInterceptor$Level;", "Lokhttp3/u$a;", "chain", "Lokhttp3/c0;", "intercept", "", "Ljava/util/Set;", "headersToRedact", "<set-?>", ak.aF, "Lokhttp3/logging/HttpLoggingInterceptor$Level;", "d", "(Lokhttp3/logging/HttpLoggingInterceptor$Level;)V", "Lokhttp3/logging/HttpLoggingInterceptor$a;", "Lokhttp3/logging/HttpLoggingInterceptor$a;", "logger", "<init>", "(Lokhttp3/logging/HttpLoggingInterceptor$a;)V", "Level", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
public final class HttpLoggingInterceptor implements u {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private volatile Set<String> headersToRedact;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @d
    private volatile Level level;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final a logger;

    /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$Level;", "", "(Ljava/lang/String;I)V", "NONE", "BASIC", "HEADERS", "BODY", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    public enum Level {
        NONE,
        BASIC,
        HEADERS,
        BODY
    }

    /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bæ\u0080\u0001\u0018\u0000 \u00062\u00020\u0001:\u0001\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¨\u0006\b"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$a;", "", "", "message", "Lkotlin/b2;", "log", "b", ak.av, "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
    public interface a {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @d
        @e
        public static final a f132612a = new Companion.C1217a();

        /* JADX INFO: renamed from: okhttp3.logging.HttpLoggingInterceptor$a$a, reason: collision with other inner class name and from kotlin metadata */
        /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
        @Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\b"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$a$a;", "", "Lokhttp3/logging/HttpLoggingInterceptor$a;", "DEFAULT", "Lokhttp3/logging/HttpLoggingInterceptor$a;", "<init>", "()V", ak.av, "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f132614a = null;

            /* JADX INFO: renamed from: okhttp3.logging.HttpLoggingInterceptor$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: HttpLoggingInterceptor.kt */
            @Metadata(bv = {}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\b"}, d2 = {"Lokhttp3/logging/HttpLoggingInterceptor$a$a$a;", "Lokhttp3/logging/HttpLoggingInterceptor$a;", "", "message", "Lkotlin/b2;", "log", "<init>", "()V", "okhttp-logging-interceptor"}, k = 1, mv = {1, 4, 0})
            public static final class C1217a implements a {
                @Override // okhttp3.logging.HttpLoggingInterceptor.a
                public void log(@d String message) {
                    f0.p(message, "message");
                    Platform.log$default(Platform.INSTANCE.get(), message, 0, null, 6, null);
                }
            }

            private Companion() {
            }

            public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
                this();
            }
        }

        void log(@d String str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @i
    public HttpLoggingInterceptor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @i
    public HttpLoggingInterceptor(@d a logger) {
        f0.p(logger, "logger");
        this.logger = logger;
        this.headersToRedact = d1.k();
        this.level = Level.NONE;
    }

    public /* synthetic */ HttpLoggingInterceptor(a aVar, int i10, kotlin.jvm.internal.u uVar) {
        this((i10 & 1) != 0 ? a.f132612a : aVar);
    }

    private final boolean b(s headers) {
        String strE = headers.e("Content-Encoding");
        return (strE == null || kotlin.text.u.L1(strE, "identity", true) || kotlin.text.u.L1(strE, "gzip", true)) ? false : true;
    }

    private final void e(s sVar, int i10) {
        String strV = this.headersToRedact.contains(sVar.i(i10)) ? "██" : sVar.v(i10);
        this.logger.log(sVar.i(i10) + ": " + strV);
    }

    @d
    @k(level = DeprecationLevel.ERROR, message = "moved to var", replaceWith = @s0(expression = "level", imports = {}))
    @h(name = "-deprecated_level")
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Level getLevel() {
        return this.level;
    }

    @d
    public final Level c() {
        return this.level;
    }

    @h(name = "level")
    public final void d(@d Level level) {
        f0.p(level, "<set-?>");
        this.level = level;
    }

    public final void f(@d String name) {
        f0.p(name, "name");
        TreeSet treeSet = new TreeSet(kotlin.text.u.T1(v0.f124986a));
        x.n0(treeSet, this.headersToRedact);
        treeSet.add(name);
        this.headersToRedact = treeSet;
    }

    @d
    public final HttpLoggingInterceptor g(@d Level level) {
        f0.p(level, "level");
        this.level = level;
        return this;
    }

    @Override // okhttp3.u
    @d
    public c0 intercept(@d u.a chain) throws Exception {
        char c10;
        String string;
        Charset UTF_8;
        Charset UTF_9;
        f0.p(chain, "chain");
        Level level = this.level;
        a0 a0VarRequest = chain.request();
        if (level == Level.NONE) {
            return chain.proceed(a0VarRequest);
        }
        boolean z10 = level == Level.BODY;
        boolean z11 = z10 || level == Level.HEADERS;
        b0 b0VarF = a0VarRequest.f();
        okhttp3.i iVarConnection = chain.connection();
        StringBuilder sb2 = new StringBuilder();
        sb2.append("--> ");
        sb2.append(a0VarRequest.m());
        sb2.append(' ');
        sb2.append(a0VarRequest.q());
        sb2.append(iVarConnection != null ? " " + iVarConnection.protocol() : "");
        String string2 = sb2.toString();
        if (!z11 && b0VarF != null) {
            string2 = string2 + " (" + b0VarF.contentLength() + "-byte body)";
        }
        this.logger.log(string2);
        if (z11) {
            s sVarK = a0VarRequest.k();
            if (b0VarF != null) {
                v f132381b = b0VarF.getF132381b();
                if (f132381b != null && sVarK.e("Content-Type") == null) {
                    this.logger.log("Content-Type: " + f132381b);
                }
                if (b0VarF.contentLength() != -1 && sVarK.e("Content-Length") == null) {
                    this.logger.log("Content-Length: " + b0VarF.contentLength());
                }
            }
            int size = sVarK.size();
            for (int i10 = 0; i10 < size; i10++) {
                e(sVarK, i10);
            }
            if (!z10 || b0VarF == null) {
                this.logger.log("--> END " + a0VarRequest.m());
            } else if (b(a0VarRequest.k())) {
                this.logger.log("--> END " + a0VarRequest.m() + " (encoded body omitted)");
            } else if (b0VarF.isDuplex()) {
                this.logger.log("--> END " + a0VarRequest.m() + " (duplex request body omitted)");
            } else if (b0VarF.isOneShot()) {
                this.logger.log("--> END " + a0VarRequest.m() + " (one-shot body omitted)");
            } else {
                Buffer buffer = new Buffer();
                b0VarF.writeTo(buffer);
                v f132381b2 = b0VarF.getF132381b();
                if (f132381b2 == null || (UTF_9 = f132381b2.f(StandardCharsets.UTF_8)) == null) {
                    UTF_9 = StandardCharsets.UTF_8;
                    f0.o(UTF_9, "UTF_8");
                }
                this.logger.log("");
                if (b.a(buffer)) {
                    this.logger.log(buffer.readString(UTF_9));
                    this.logger.log("--> END " + a0VarRequest.m() + " (" + b0VarF.contentLength() + "-byte body)");
                } else {
                    this.logger.log("--> END " + a0VarRequest.m() + " (binary " + b0VarF.contentLength() + "-byte body omitted)");
                }
            }
        }
        long jNanoTime = System.nanoTime();
        try {
            c0 c0VarProceed = chain.proceed(a0VarRequest);
            long millis = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - jNanoTime);
            d0 d0VarQ = c0VarProceed.q();
            f0.m(d0VarQ);
            long contentLength = d0VarQ.getContentLength();
            String str = contentLength != -1 ? contentLength + "-byte" : "unknown-length";
            a aVar = this.logger;
            StringBuilder sb3 = new StringBuilder();
            sb3.append("<-- ");
            sb3.append(c0VarProceed.x());
            if (c0VarProceed.getMessage().length() == 0) {
                string = "";
                c10 = ' ';
            } else {
                String message = c0VarProceed.getMessage();
                StringBuilder sb4 = new StringBuilder();
                c10 = ' ';
                sb4.append(String.valueOf(' '));
                sb4.append(message);
                string = sb4.toString();
            }
            sb3.append(string);
            sb3.append(c10);
            sb3.append(c0VarProceed.getRequest().q());
            sb3.append(" (");
            sb3.append(millis);
            sb3.append("ms");
            sb3.append(z11 ? "" : ", " + str + " body");
            sb3.append(')');
            aVar.log(sb3.toString());
            if (z11) {
                s headers = c0VarProceed.getHeaders();
                int size2 = headers.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    e(headers, i11);
                }
                if (!z10 || !HttpHeaders.promisesBody(c0VarProceed)) {
                    this.logger.log("<-- END HTTP");
                } else if (b(c0VarProceed.getHeaders())) {
                    this.logger.log("<-- END HTTP (encoded body omitted)");
                } else {
                    BufferedSource source = d0VarQ.getSource();
                    source.request(Long.MAX_VALUE);
                    Buffer buffer2 = source.getBuffer();
                    Long l10 = null;
                    if (kotlin.text.u.L1("gzip", headers.e("Content-Encoding"), true)) {
                        Long lValueOf = Long.valueOf(buffer2.size());
                        GzipSource gzipSource = new GzipSource(buffer2.clone());
                        try {
                            buffer2 = new Buffer();
                            buffer2.writeAll(gzipSource);
                            kotlin.io.b.a(gzipSource, null);
                            l10 = lValueOf;
                        } catch (Throwable th2) {
                            try {
                                throw th2;
                            } catch (Throwable th3) {
                                kotlin.io.b.a(gzipSource, th2);
                                throw th3;
                            }
                        }
                    }
                    v f132480d = d0VarQ.getF132480d();
                    if (f132480d == null || (UTF_8 = f132480d.f(StandardCharsets.UTF_8)) == null) {
                        UTF_8 = StandardCharsets.UTF_8;
                        f0.o(UTF_8, "UTF_8");
                    }
                    if (!b.a(buffer2)) {
                        this.logger.log("");
                        this.logger.log("<-- END HTTP (binary " + buffer2.size() + "-byte body omitted)");
                        return c0VarProceed;
                    }
                    if (contentLength != 0) {
                        this.logger.log("");
                        this.logger.log(buffer2.clone().readString(UTF_8));
                    }
                    if (l10 != null) {
                        this.logger.log("<-- END HTTP (" + buffer2.size() + "-byte, " + l10 + "-gzipped-byte body)");
                    } else {
                        this.logger.log("<-- END HTTP (" + buffer2.size() + "-byte body)");
                    }
                }
            }
            return c0VarProceed;
        } catch (Exception e10) {
            this.logger.log("<-- HTTP FAILED: " + e10);
            throw e10;
        }
    }
}
