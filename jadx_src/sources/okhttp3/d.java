package okhttp3;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import io.flutter.plugin.editing.SpellCheckPlugin;
import java.util.concurrent.TimeUnit;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.s0;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.Util;

/* JADX INFO: compiled from: CacheControl.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b \u0018\u0000 $2\u00020\u0001:\u0002\u000f\u0007Bs\b\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0006\u0012\u0006\u0010%\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\b\u0010-\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b.\u0010/J\u000f\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\n\u0010\u0004J\u000f\u0010\u000b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\f\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\f\u0010\bJ\u000f\u0010\r\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\r\u0010\u0004J\u000f\u0010\u000e\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0004J\b\u0010\u0011\u001a\u00020\u0010H\u0016R\u0017\u0010\u0014\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0015\u0010\u0004R\u0017\u0010\u0019\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u0017\u0010\u001b\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001a\u0010\bR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0012\u001a\u0004\b\u001c\u0010\u0004R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u001e\u0010\u0004R\u0017\u0010!\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b \u0010\u0004R\u0017\u0010#\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\u000e\u0010\u0017\u001a\u0004\b\"\u0010\bR\u0017\u0010%\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\b\r\u0010\u0017\u001a\u0004\b$\u0010\bR\u0017\u0010'\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\u0012\u001a\u0004\b&\u0010\u0004R\u0017\u0010*\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b(\u0010\u0012\u001a\u0004\b)\u0010\u0004R\u0017\u0010+\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u001c\u0010\u0012\u001a\u0004\b(\u0010\u0004R\u0018\u0010-\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,¨\u00060"}, d2 = {"Lokhttp3/d;", "", "", "f", "()Z", "g", "", "b", "()I", "j", "e", ak.aF, "d", "i", RXScreenCaptureService.KEY_HEIGHT, ak.av, "", "toString", "Z", "r", "noCache", ak.aB, "noStore", "I", "n", "maxAgeSeconds", RXScreenCaptureService.KEY_WIDTH, "sMaxAgeSeconds", "l", "isPrivate", "m", "isPublic", "q", "mustRevalidate", "o", "maxStaleSeconds", "p", "minFreshSeconds", ak.aG, "onlyIfCached", "k", "t", "noTransform", "immutable", "Ljava/lang/String;", "headerValue", "<init>", "(ZZIIZZZIIZZZLjava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean noCache;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean noStore;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int maxAgeSeconds;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int sMaxAgeSeconds;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean isPrivate;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean isPublic;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean mustRevalidate;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxStaleSeconds;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int minFreshSeconds;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean onlyIfCached;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean noTransform;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final boolean immutable;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private String headerValue;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final d f132451n = new a().g().a();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final d f132452o = new a().j().e(Integer.MAX_VALUE, TimeUnit.SECONDS).a();

    /* JADX INFO: compiled from: CacheControl.kt */
    @Metadata(bv = {}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001f\u0010 J\f\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0002J\u0006\u0010\u0005\u001a\u00020\u0000J\u0006\u0010\u0006\u001a\u00020\u0000J\u0016\u0010\n\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\f\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u0016\u0010\u000e\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\u0000J\u0006\u0010\u0010\u001a\u00020\u0000J\u0006\u0010\u0011\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0012R\u0016\u0010\u0016\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\u0018R\u0016\u0010\u001c\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0015R\u0016\u0010\u001d\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u0015R\u0016\u0010\u001e\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0015¨\u0006!"}, d2 = {"Lokhttp3/d$a;", "", "", "", "b", "g", RXScreenCaptureService.KEY_HEIGHT, "maxAge", "Ljava/util/concurrent/TimeUnit;", "timeUnit", "d", "maxStale", "e", "minFresh", "f", "j", "i", ak.aF, "Lokhttp3/d;", ak.av, "", "Z", "noCache", "noStore", "I", "maxAgeSeconds", "maxStaleSeconds", "minFreshSeconds", "onlyIfCached", "noTransform", "immutable", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean noCache;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private boolean noStore;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int maxAgeSeconds = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int maxStaleSeconds = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private int minFreshSeconds = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean onlyIfCached;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean noTransform;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean immutable;

        private final int b(long j10) {
            if (j10 > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            return (int) j10;
        }

        @dl.d
        public final d a() {
            return new d(this.noCache, this.noStore, this.maxAgeSeconds, -1, false, false, false, this.maxStaleSeconds, this.minFreshSeconds, this.onlyIfCached, this.noTransform, this.immutable, null, null);
        }

        @dl.d
        public final a c() {
            this.immutable = true;
            return this;
        }

        @dl.d
        public final a d(int maxAge, @dl.d TimeUnit timeUnit) {
            kotlin.jvm.internal.f0.p(timeUnit, "timeUnit");
            if (maxAge >= 0) {
                this.maxAgeSeconds = b(timeUnit.toSeconds(maxAge));
                return this;
            }
            throw new IllegalArgumentException(("maxAge < 0: " + maxAge).toString());
        }

        @dl.d
        public final a e(int maxStale, @dl.d TimeUnit timeUnit) {
            kotlin.jvm.internal.f0.p(timeUnit, "timeUnit");
            if (maxStale >= 0) {
                this.maxStaleSeconds = b(timeUnit.toSeconds(maxStale));
                return this;
            }
            throw new IllegalArgumentException(("maxStale < 0: " + maxStale).toString());
        }

        @dl.d
        public final a f(int minFresh, @dl.d TimeUnit timeUnit) {
            kotlin.jvm.internal.f0.p(timeUnit, "timeUnit");
            if (minFresh >= 0) {
                this.minFreshSeconds = b(timeUnit.toSeconds(minFresh));
                return this;
            }
            throw new IllegalArgumentException(("minFresh < 0: " + minFresh).toString());
        }

        @dl.d
        public final a g() {
            this.noCache = true;
            return this;
        }

        @dl.d
        public final a h() {
            this.noStore = true;
            return this;
        }

        @dl.d
        public final a i() {
            this.noTransform = true;
            return this;
        }

        @dl.d
        public final a j() {
            this.onlyIfCached = true;
            return this;
        }
    }

    /* JADX INFO: renamed from: okhttp3.d$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: CacheControl.kt */
    @Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001e\u0010\u0006\u001a\u00020\u0004*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0002J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\f¨\u0006\u0010"}, d2 = {"Lokhttp3/d$b;", "", "", "characters", "", SpellCheckPlugin.START_INDEX_KEY, ak.av, "Lokhttp3/s;", "headers", "Lokhttp3/d;", ak.aF, "FORCE_CACHE", "Lokhttp3/d;", "FORCE_NETWORK", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final int a(String str, String str2, int i10) {
            int length = str.length();
            while (i10 < length) {
                if (StringsKt__StringsKt.V2(str2, str.charAt(i10), false, 2, null)) {
                    return i10;
                }
                i10++;
            }
            return str.length();
        }

        static /* synthetic */ int b(Companion companion, String str, String str2, int i10, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                i10 = 0;
            }
            return companion.a(str, str2, i10);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x004a  */
        /* JADX WARN: Code duplicated, block: B:17:0x005d  */
        /* JADX WARN: Code duplicated, block: B:19:0x006d  */
        /* JADX WARN: Code duplicated, block: B:34:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:40:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:42:0x00e9  */
        /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:45:0x00f3  */
        /* JADX WARN: Code duplicated, block: B:47:0x00fb  */
        /* JADX WARN: Code duplicated, block: B:49:0x0104  */
        /* JADX WARN: Code duplicated, block: B:50:0x0109  */
        /* JADX WARN: Code duplicated, block: B:52:0x0111  */
        /* JADX WARN: Code duplicated, block: B:53:0x0113  */
        /* JADX WARN: Code duplicated, block: B:55:0x011b  */
        /* JADX WARN: Code duplicated, block: B:56:0x011d  */
        /* JADX WARN: Code duplicated, block: B:58:0x0125  */
        /* JADX WARN: Code duplicated, block: B:59:0x0128  */
        /* JADX WARN: Code duplicated, block: B:61:0x0130  */
        /* JADX WARN: Code duplicated, block: B:62:0x0138  */
        /* JADX WARN: Code duplicated, block: B:64:0x0140  */
        /* JADX WARN: Code duplicated, block: B:65:0x0146  */
        /* JADX WARN: Code duplicated, block: B:67:0x014f  */
        /* JADX WARN: Code duplicated, block: B:68:0x0152  */
        /* JADX WARN: Code duplicated, block: B:70:0x015a  */
        /* JADX WARN: Code duplicated, block: B:71:0x015d  */
        /* JADX WARN: Code duplicated, block: B:73:0x0165  */
        /* JADX WARN: Code duplicated, block: B:86:0x0170 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:97:0x0167 A[SYNTHETIC] */
        @dl.d
        @xh.m
        public final d c(@dl.d s headers) {
            int i10;
            int i11;
            int iA;
            String strSubstring;
            String string;
            boolean z10;
            int iA2;
            String string2;
            byte b10;
            s headers2 = headers;
            kotlin.jvm.internal.f0.p(headers2, "headers");
            int size = headers.size();
            boolean z11 = true;
            boolean z12 = true;
            int i12 = 0;
            String str = null;
            boolean z13 = false;
            boolean z14 = false;
            int nonNegativeInt = -1;
            int nonNegativeInt2 = -1;
            boolean z15 = false;
            boolean z16 = false;
            boolean z17 = false;
            int nonNegativeInt3 = -1;
            int nonNegativeInt4 = -1;
            boolean z18 = false;
            boolean z19 = false;
            boolean z20 = false;
            while (i12 < size) {
                String strI = headers2.i(i12);
                String strV = headers2.v(i12);
                if (kotlin.text.u.L1(strI, "Cache-Control", z11)) {
                    if (str == null) {
                        str = strV;
                    }
                    i11 = 0;
                    while (i11 < strV.length()) {
                        iA = a(strV, "=,;", i11);
                        strSubstring = strV.substring(i11, iA);
                        kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                        if (strSubstring != null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                        }
                        string = StringsKt__StringsKt.F5(strSubstring).toString();
                        int i13 = size;
                        if (iA != strV.length()) {
                            z10 = z12;
                            if (strV.charAt(iA) == ',' && strV.charAt(iA) != ';') {
                                int iIndexOfNonWhitespace = Util.indexOfNonWhitespace(strV, iA + 1);
                                if (iIndexOfNonWhitespace >= strV.length() || strV.charAt(iIndexOfNonWhitespace) != '\"') {
                                    iA2 = a(strV, ",;", iIndexOfNonWhitespace);
                                    String strSubstring2 = strV.substring(iIndexOfNonWhitespace, iA2);
                                    kotlin.jvm.internal.f0.o(strSubstring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    if (strSubstring2 == null) {
                                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                                    }
                                    string2 = StringsKt__StringsKt.F5(strSubstring2).toString();
                                } else {
                                    int i14 = iIndexOfNonWhitespace + 1;
                                    int iR3 = StringsKt__StringsKt.r3(strV, kotlin.text.y.f128593b, i14, false, 4, null);
                                    string2 = strV.substring(i14, iR3);
                                    kotlin.jvm.internal.f0.o(string2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                    iA2 = iR3 + 1;
                                }
                            }
                            z11 = true;
                            if (kotlin.text.u.L1("no-cache", string, true)) {
                                z13 = true;
                            } else if (kotlin.text.u.L1("no-store", string, true)) {
                                z14 = true;
                            } else {
                                if (kotlin.text.u.L1("max-age", string, true)) {
                                    b10 = -1;
                                    nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                                } else {
                                    b10 = -1;
                                    if (kotlin.text.u.L1("s-maxage", string, true)) {
                                        nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                                    } else if (kotlin.text.u.L1("private", string, true)) {
                                        z15 = true;
                                    } else if (kotlin.text.u.L1("public", string, true)) {
                                        z16 = true;
                                    } else if (kotlin.text.u.L1("must-revalidate", string, true)) {
                                        z17 = true;
                                    } else if (kotlin.text.u.L1("max-stale", string, true)) {
                                        nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                                    } else if (kotlin.text.u.L1("min-fresh", string, true)) {
                                        nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                                    } else if (kotlin.text.u.L1("only-if-cached", string, true)) {
                                        z18 = true;
                                    } else if (kotlin.text.u.L1("no-transform", string, true)) {
                                        z19 = true;
                                    } else if (kotlin.text.u.L1("immutable", string, true)) {
                                        z20 = true;
                                    }
                                    i11 = iA2;
                                    size = i13;
                                    z12 = z10;
                                }
                                i11 = iA2;
                                size = i13;
                                z12 = z10;
                            }
                            i11 = iA2;
                            size = i13;
                            z12 = z10;
                        } else {
                            z10 = z12;
                        }
                        iA2 = iA + 1;
                        string2 = null;
                        z11 = true;
                        if (kotlin.text.u.L1("no-cache", string, true)) {
                            z13 = true;
                        } else if (kotlin.text.u.L1("no-store", string, true)) {
                            z14 = true;
                        } else {
                            if (kotlin.text.u.L1("max-age", string, true)) {
                                b10 = -1;
                                nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                            } else {
                                b10 = -1;
                                if (kotlin.text.u.L1("s-maxage", string, true)) {
                                    nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                                } else if (kotlin.text.u.L1("private", string, true)) {
                                    z15 = true;
                                } else if (kotlin.text.u.L1("public", string, true)) {
                                    z16 = true;
                                } else if (kotlin.text.u.L1("must-revalidate", string, true)) {
                                    z17 = true;
                                } else if (kotlin.text.u.L1("max-stale", string, true)) {
                                    nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                                } else if (kotlin.text.u.L1("min-fresh", string, true)) {
                                    nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                                } else if (kotlin.text.u.L1("only-if-cached", string, true)) {
                                    z18 = true;
                                } else if (kotlin.text.u.L1("no-transform", string, true)) {
                                    z19 = true;
                                } else if (kotlin.text.u.L1("immutable", string, true)) {
                                    z20 = true;
                                }
                                i11 = iA2;
                                size = i13;
                                z12 = z10;
                            }
                            i11 = iA2;
                            size = i13;
                            z12 = z10;
                        }
                        i11 = iA2;
                        size = i13;
                        z12 = z10;
                    }
                    i10 = size;
                    i12++;
                    headers2 = headers;
                    size = i10;
                } else {
                    if (!kotlin.text.u.L1(strI, "Pragma", z11)) {
                        i10 = size;
                    }
                    i12++;
                    headers2 = headers;
                    size = i10;
                }
                z12 = false;
                i11 = 0;
                while (i11 < strV.length()) {
                    iA = a(strV, "=,;", i11);
                    strSubstring = strV.substring(i11, iA);
                    kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    if (strSubstring != null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.CharSequence");
                    }
                    string = StringsKt__StringsKt.F5(strSubstring).toString();
                    int i15 = size;
                    if (iA != strV.length()) {
                        z10 = z12;
                        if (strV.charAt(iA) == ',') {
                        }
                        z11 = true;
                        if (kotlin.text.u.L1("no-cache", string, true)) {
                            z13 = true;
                        } else if (kotlin.text.u.L1("no-store", string, true)) {
                            z14 = true;
                        } else {
                            if (kotlin.text.u.L1("max-age", string, true)) {
                                b10 = -1;
                                nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                            } else {
                                b10 = -1;
                                if (kotlin.text.u.L1("s-maxage", string, true)) {
                                    nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                                } else if (kotlin.text.u.L1("private", string, true)) {
                                    z15 = true;
                                } else if (kotlin.text.u.L1("public", string, true)) {
                                    z16 = true;
                                } else if (kotlin.text.u.L1("must-revalidate", string, true)) {
                                    z17 = true;
                                } else if (kotlin.text.u.L1("max-stale", string, true)) {
                                    nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                                } else if (kotlin.text.u.L1("min-fresh", string, true)) {
                                    nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                                } else if (kotlin.text.u.L1("only-if-cached", string, true)) {
                                    z18 = true;
                                } else if (kotlin.text.u.L1("no-transform", string, true)) {
                                    z19 = true;
                                } else if (kotlin.text.u.L1("immutable", string, true)) {
                                    z20 = true;
                                }
                                i11 = iA2;
                                size = i15;
                                z12 = z10;
                            }
                            i11 = iA2;
                            size = i15;
                            z12 = z10;
                        }
                        i11 = iA2;
                        size = i15;
                        z12 = z10;
                    } else {
                        z10 = z12;
                    }
                    iA2 = iA + 1;
                    string2 = null;
                    z11 = true;
                    if (kotlin.text.u.L1("no-cache", string, true)) {
                        z13 = true;
                    } else if (kotlin.text.u.L1("no-store", string, true)) {
                        z14 = true;
                    } else {
                        if (kotlin.text.u.L1("max-age", string, true)) {
                            b10 = -1;
                            nonNegativeInt = Util.toNonNegativeInt(string2, -1);
                        } else {
                            b10 = -1;
                            if (kotlin.text.u.L1("s-maxage", string, true)) {
                                nonNegativeInt2 = Util.toNonNegativeInt(string2, -1);
                            } else if (kotlin.text.u.L1("private", string, true)) {
                                z15 = true;
                            } else if (kotlin.text.u.L1("public", string, true)) {
                                z16 = true;
                            } else if (kotlin.text.u.L1("must-revalidate", string, true)) {
                                z17 = true;
                            } else if (kotlin.text.u.L1("max-stale", string, true)) {
                                nonNegativeInt3 = Util.toNonNegativeInt(string2, Integer.MAX_VALUE);
                            } else if (kotlin.text.u.L1("min-fresh", string, true)) {
                                nonNegativeInt4 = Util.toNonNegativeInt(string2, -1);
                            } else if (kotlin.text.u.L1("only-if-cached", string, true)) {
                                z18 = true;
                            } else if (kotlin.text.u.L1("no-transform", string, true)) {
                                z19 = true;
                            } else if (kotlin.text.u.L1("immutable", string, true)) {
                                z20 = true;
                            }
                            i11 = iA2;
                            size = i15;
                            z12 = z10;
                        }
                        i11 = iA2;
                        size = i15;
                        z12 = z10;
                    }
                    i11 = iA2;
                    size = i15;
                    z12 = z10;
                }
                i10 = size;
                i12++;
                headers2 = headers;
                size = i10;
            }
            return new d(z13, z14, nonNegativeInt, nonNegativeInt2, z15, z16, z17, nonNegativeInt3, nonNegativeInt4, z18, z19, z20, !z12 ? null : str, null);
        }
    }

    private d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str) {
        this.noCache = z10;
        this.noStore = z11;
        this.maxAgeSeconds = i10;
        this.sMaxAgeSeconds = i11;
        this.isPrivate = z12;
        this.isPublic = z13;
        this.mustRevalidate = z14;
        this.maxStaleSeconds = i12;
        this.minFreshSeconds = i13;
        this.onlyIfCached = z15;
        this.noTransform = z16;
        this.immutable = z17;
        this.headerValue = str;
    }

    public /* synthetic */ d(boolean z10, boolean z11, int i10, int i11, boolean z12, boolean z13, boolean z14, int i12, int i13, boolean z15, boolean z16, boolean z17, String str, kotlin.jvm.internal.u uVar) {
        this(z10, z11, i10, i11, z12, z13, z14, i12, i13, z15, z16, z17, str);
    }

    @dl.d
    @xh.m
    public static final d v(@dl.d s sVar) {
        return INSTANCE.c(sVar);
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "immutable", imports = {}))
    @xh.h(name = "-deprecated_immutable")
    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getImmutable() {
        return this.immutable;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "maxAgeSeconds", imports = {}))
    @xh.h(name = "-deprecated_maxAgeSeconds")
    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getMaxAgeSeconds() {
        return this.maxAgeSeconds;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "maxStaleSeconds", imports = {}))
    @xh.h(name = "-deprecated_maxStaleSeconds")
    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaxStaleSeconds() {
        return this.maxStaleSeconds;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "minFreshSeconds", imports = {}))
    @xh.h(name = "-deprecated_minFreshSeconds")
    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getMinFreshSeconds() {
        return this.minFreshSeconds;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "mustRevalidate", imports = {}))
    @xh.h(name = "-deprecated_mustRevalidate")
    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getMustRevalidate() {
        return this.mustRevalidate;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "noCache", imports = {}))
    @xh.h(name = "-deprecated_noCache")
    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getNoCache() {
        return this.noCache;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "noStore", imports = {}))
    @xh.h(name = "-deprecated_noStore")
    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getNoStore() {
        return this.noStore;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "noTransform", imports = {}))
    @xh.h(name = "-deprecated_noTransform")
    /* JADX INFO: renamed from: h, reason: from getter */
    public final boolean getNoTransform() {
        return this.noTransform;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "onlyIfCached", imports = {}))
    @xh.h(name = "-deprecated_onlyIfCached")
    /* JADX INFO: renamed from: i, reason: from getter */
    public final boolean getOnlyIfCached() {
        return this.onlyIfCached;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "sMaxAgeSeconds", imports = {}))
    @xh.h(name = "-deprecated_sMaxAgeSeconds")
    /* JADX INFO: renamed from: j, reason: from getter */
    public final int getSMaxAgeSeconds() {
        return this.sMaxAgeSeconds;
    }

    @xh.h(name = "immutable")
    public final boolean k() {
        return this.immutable;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getIsPrivate() {
        return this.isPrivate;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final boolean getIsPublic() {
        return this.isPublic;
    }

    @xh.h(name = "maxAgeSeconds")
    public final int n() {
        return this.maxAgeSeconds;
    }

    @xh.h(name = "maxStaleSeconds")
    public final int o() {
        return this.maxStaleSeconds;
    }

    @xh.h(name = "minFreshSeconds")
    public final int p() {
        return this.minFreshSeconds;
    }

    @xh.h(name = "mustRevalidate")
    public final boolean q() {
        return this.mustRevalidate;
    }

    @xh.h(name = "noCache")
    public final boolean r() {
        return this.noCache;
    }

    @xh.h(name = "noStore")
    public final boolean s() {
        return this.noStore;
    }

    @xh.h(name = "noTransform")
    public final boolean t() {
        return this.noTransform;
    }

    @dl.d
    public String toString() {
        String str = this.headerValue;
        if (str != null) {
            return str;
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.noCache) {
            sb2.append("no-cache, ");
        }
        if (this.noStore) {
            sb2.append("no-store, ");
        }
        if (this.maxAgeSeconds != -1) {
            sb2.append("max-age=");
            sb2.append(this.maxAgeSeconds);
            sb2.append(", ");
        }
        if (this.sMaxAgeSeconds != -1) {
            sb2.append("s-maxage=");
            sb2.append(this.sMaxAgeSeconds);
            sb2.append(", ");
        }
        if (this.isPrivate) {
            sb2.append("private, ");
        }
        if (this.isPublic) {
            sb2.append("public, ");
        }
        if (this.mustRevalidate) {
            sb2.append("must-revalidate, ");
        }
        if (this.maxStaleSeconds != -1) {
            sb2.append("max-stale=");
            sb2.append(this.maxStaleSeconds);
            sb2.append(", ");
        }
        if (this.minFreshSeconds != -1) {
            sb2.append("min-fresh=");
            sb2.append(this.minFreshSeconds);
            sb2.append(", ");
        }
        if (this.onlyIfCached) {
            sb2.append("only-if-cached, ");
        }
        if (this.noTransform) {
            sb2.append("no-transform, ");
        }
        if (this.immutable) {
            sb2.append("immutable, ");
        }
        if (sb2.length() == 0) {
            return "";
        }
        sb2.delete(sb2.length() - 2, sb2.length());
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "StringBuilder().apply(builderAction).toString()");
        this.headerValue = string;
        return string;
    }

    @xh.h(name = "onlyIfCached")
    public final boolean u() {
        return this.onlyIfCached;
    }

    @xh.h(name = "sMaxAgeSeconds")
    public final int w() {
        return this.sMaxAgeSeconds;
    }
}
