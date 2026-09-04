package okhttp3;

import com.max.xiaoheihe.module.littleprogram.fragment.pubg.PUBGCommonContainerFragment;
import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.qcloud.core.util.IOUtils;
import com.umeng.analytics.pro.ak;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.s0;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;
import okhttp3.internal.HostnamesKt;
import okhttp3.internal.Util;
import okhttp3.internal.http.DatesKt;
import okhttp3.internal.publicsuffix.PublicSuffixDatabase;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;

/* JADX INFO: compiled from: Cookie.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0019\u0018\u0000 *2\u00020\u0001:\u0002+,BQ\b\u0002\u0012\u0006\u0010\u000e\u001a\u00020\n\u0012\u0006\u0010\u0010\u001a\u00020\n\u0012\u0006\u0010\u0017\u001a\u00020\u0014\u0012\u0006\u0010\u001b\u001a\u00020\n\u0012\u0006\u0010\u001d\u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020\u0004\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\u0006\u0010\u0013\u001a\u00020\u0004\u0012\u0006\u0010\u0019\u001a\u00020\u0004¢\u0006\u0004\b(\u0010)J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0013\u0010\u0007\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\t\u001a\u00020\bH\u0017J\b\u0010\u000b\u001a\u00020\nH\u0016J\u000f\u0010\u000e\u001a\u00020\nH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\nH\u0007¢\u0006\u0004\b\u000f\u0010\rJ\u000f\u0010\u0013\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0012J\u000f\u0010\u001b\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001a\u0010\rJ\u000f\u0010\u001d\u001a\u00020\nH\u0007¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u0012J\u000f\u0010!\u001a\u00020\u0004H\u0007¢\u0006\u0004\b \u0010\u0012J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\"\u001a\u00020\u0004H\u0000¢\u0006\u0004\b#\u0010$R\u0017\u0010\u000e\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u000e\u0010%\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0010\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0017\u001a\u00020\u00148\u0007¢\u0006\f\n\u0004\b\u0017\u0010&\u001a\u0004\b\u0017\u0010\u0016R\u0017\u0010\u001b\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u001b\u0010%\u001a\u0004\b\u001b\u0010\rR\u0017\u0010\u001d\u001a\u00020\n8\u0007¢\u0006\f\n\u0004\b\u001d\u0010%\u001a\u0004\b\u001d\u0010\rR\u0017\u0010!\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b!\u0010\u0012R\u0017\u0010\u001f\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u001f\u0010'\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\u0013\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0013\u0010'\u001a\u0004\b\u0013\u0010\u0012R\u0017\u0010\u0019\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0019\u0010'\u001a\u0004\b\u0019\u0010\u0012¨\u0006-"}, d2 = {"Lokhttp3/Cookie;", "", "Lokhttp3/t;", "url", "", PUBGCommonContainerFragment.f89169x, "other", "equals", "", "hashCode", "", "toString", "-deprecated_name", "()Ljava/lang/String;", "name", "-deprecated_value", "value", "-deprecated_persistent", "()Z", "persistent", "", "-deprecated_expiresAt", "()J", "expiresAt", "-deprecated_hostOnly", "hostOnly", "-deprecated_domain", "domain", "-deprecated_path", FlutterActivityLaunchConfigs.EXTRA_PATH, "-deprecated_httpOnly", "httpOnly", "-deprecated_secure", "secure", "forObsoleteRfc2965", "toString$okhttp", "(Z)Ljava/lang/String;", "Ljava/lang/String;", "J", "Z", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;ZZZZ)V", "Companion", ak.av, "b", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class Cookie {

    @dl.d
    private final String domain;
    private final long expiresAt;
    private final boolean hostOnly;
    private final boolean httpOnly;

    @dl.d
    private final String name;

    @dl.d
    private final String path;
    private final boolean persistent;
    private final boolean secure;

    @dl.d
    private final String value;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Pattern YEAR_PATTERN = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern MONTH_PATTERN = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern DAY_OF_MONTH_PATTERN = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern TIME_PATTERN = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* JADX INFO: compiled from: Cookie.kt */
    @Metadata(bv = {}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u001c\u0010\u001dJ\u0018\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u000e\u0010\b\u001a\u00020\u00002\u0006\u0010\u0007\u001a\u00020\u0002J\u000e\u0010\n\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0002J\u000e\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u000f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000e\u0010\u0011\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0002J\u0006\u0010\u0012\u001a\u00020\u0000J\u0006\u0010\u0013\u001a\u00020\u0000J\u0006\u0010\u0015\u001a\u00020\u0014R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0016R\u0016\u0010\u0019\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0018R\u0016\u0010\u001a\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018¨\u0006\u001e"}, d2 = {"Lokhttp3/Cookie$a;", "", "", "domain", "", "hostOnly", ak.aF, "name", "g", "value", "j", "", "expiresAt", "d", "b", "e", FlutterActivityLaunchConfigs.EXTRA_PATH, RXScreenCaptureService.KEY_HEIGHT, "i", "f", "Lokhttp3/Cookie;", ak.av, "Ljava/lang/String;", "J", "Z", "secure", "httpOnly", "persistent", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private String value;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private String domain;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private boolean secure;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private boolean httpOnly;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean persistent;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean hostOnly;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private long expiresAt = DatesKt.MAX_DATE;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private String path = "/";

        private final a c(String domain, boolean hostOnly) {
            String canonicalHost = HostnamesKt.toCanonicalHost(domain);
            if (canonicalHost != null) {
                this.domain = canonicalHost;
                this.hostOnly = hostOnly;
                return this;
            }
            throw new IllegalArgumentException("unexpected domain: " + domain);
        }

        @dl.d
        public final Cookie a() {
            String str = this.name;
            if (str == null) {
                throw new NullPointerException("builder.name == null");
            }
            String str2 = this.value;
            if (str2 == null) {
                throw new NullPointerException("builder.value == null");
            }
            long j10 = this.expiresAt;
            String str3 = this.domain;
            if (str3 != null) {
                return new Cookie(str, str2, j10, str3, this.path, this.secure, this.httpOnly, this.persistent, this.hostOnly, null);
            }
            throw new NullPointerException("builder.domain == null");
        }

        @dl.d
        public final a b(@dl.d String domain) {
            kotlin.jvm.internal.f0.p(domain, "domain");
            return c(domain, false);
        }

        @dl.d
        public final a d(long expiresAt) {
            if (expiresAt <= 0) {
                expiresAt = Long.MIN_VALUE;
            }
            if (expiresAt > DatesKt.MAX_DATE) {
                expiresAt = 253402300799999L;
            }
            this.expiresAt = expiresAt;
            this.persistent = true;
            return this;
        }

        @dl.d
        public final a e(@dl.d String domain) {
            kotlin.jvm.internal.f0.p(domain, "domain");
            return c(domain, true);
        }

        @dl.d
        public final a f() {
            this.httpOnly = true;
            return this;
        }

        @dl.d
        public final a g(@dl.d String name) {
            kotlin.jvm.internal.f0.p(name, "name");
            if (!kotlin.jvm.internal.f0.g(StringsKt__StringsKt.F5(name).toString(), name)) {
                throw new IllegalArgumentException("name is not trimmed".toString());
            }
            this.name = name;
            return this;
        }

        @dl.d
        public final a h(@dl.d String path) {
            kotlin.jvm.internal.f0.p(path, "path");
            if (!kotlin.text.u.v2(path, "/", false, 2, null)) {
                throw new IllegalArgumentException("path must start with '/'".toString());
            }
            this.path = path;
            return this;
        }

        @dl.d
        public final a i() {
            this.secure = true;
            return this;
        }

        @dl.d
        public final a j(@dl.d String value) {
            kotlin.jvm.internal.f0.p(value, "value");
            if (!kotlin.jvm.internal.f0.g(StringsKt__StringsKt.F5(value).toString(), value)) {
                throw new IllegalArgumentException("value is not trimmed".toString());
            }
            this.value = value;
            return this;
        }
    }

    /* JADX INFO: renamed from: okhttp3.Cookie$b, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Cookie.kt */
    @Metadata(bv = {}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b'\u0010(J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\n\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0002H\u0002J \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\fH\u0002J(\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0005H\u0002J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u0010\u0010\u0015\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0002J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0007J)\u0010\u001a\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ\u001e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u001d\u001a\u00020\u001cH\u0007R\u001c\u0010\"\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010$\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u001c\u0010%\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010#R\u001c\u0010&\u001a\n !*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010#¨\u0006)"}, d2 = {"Lokhttp3/Cookie$b;", "", "", "urlHost", "domain", "", "d", "Lokhttp3/t;", "url", FlutterActivityLaunchConfigs.EXTRA_PATH, "k", ak.aB, "", "pos", "limit", "", "i", "input", "invert", ak.aF, "j", RXScreenCaptureService.KEY_HEIGHT, "setCookie", "Lokhttp3/Cookie;", "e", "currentTimeMillis", "f", "(JLokhttp3/t;Ljava/lang/String;)Lokhttp3/Cookie;", "Lokhttp3/s;", "headers", "", "g", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "DAY_OF_MONTH_PATTERN", "Ljava/util/regex/Pattern;", "MONTH_PATTERN", "TIME_PATTERN", "YEAR_PATTERN", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final int c(String input, int pos, int limit, boolean invert) {
            while (pos < limit) {
                char cCharAt = input.charAt(pos);
                if (((cCharAt < ' ' && cCharAt != '\t') || cCharAt >= 127 || ('0' <= cCharAt && '9' >= cCharAt) || (('a' <= cCharAt && 'z' >= cCharAt) || (('A' <= cCharAt && 'Z' >= cCharAt) || cCharAt == ':'))) == (!invert)) {
                    return pos;
                }
                pos++;
            }
            return limit;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean d(String urlHost, String domain) {
            if (kotlin.jvm.internal.f0.g(urlHost, domain)) {
                return true;
            }
            return kotlin.text.u.K1(urlHost, domain, false, 2, null) && urlHost.charAt((urlHost.length() - domain.length()) - 1) == '.' && !Util.canParseAsIpAddress(urlHost);
        }

        private final String h(String s10) {
            if (!(!kotlin.text.u.K1(s10, ".", false, 2, null))) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            String canonicalHost = HostnamesKt.toCanonicalHost(StringsKt__StringsKt.d4(s10, "."));
            if (canonicalHost != null) {
                return canonicalHost;
            }
            throw new IllegalArgumentException();
        }

        private final long i(String s10, int pos, int limit) {
            int iC = c(s10, pos, limit, false);
            Matcher matcher = Cookie.TIME_PATTERN.matcher(s10);
            int i10 = -1;
            int i11 = -1;
            int i12 = -1;
            int iS3 = -1;
            int i13 = -1;
            int i14 = -1;
            while (iC < limit) {
                int iC2 = c(s10, iC + 1, limit, true);
                matcher.region(iC, iC2);
                if (i11 == -1 && matcher.usePattern(Cookie.TIME_PATTERN).matches()) {
                    String strGroup = matcher.group(1);
                    kotlin.jvm.internal.f0.o(strGroup, "matcher.group(1)");
                    i11 = Integer.parseInt(strGroup);
                    String strGroup2 = matcher.group(2);
                    kotlin.jvm.internal.f0.o(strGroup2, "matcher.group(2)");
                    i13 = Integer.parseInt(strGroup2);
                    String strGroup3 = matcher.group(3);
                    kotlin.jvm.internal.f0.o(strGroup3, "matcher.group(3)");
                    i14 = Integer.parseInt(strGroup3);
                } else if (i12 == -1 && matcher.usePattern(Cookie.DAY_OF_MONTH_PATTERN).matches()) {
                    String strGroup4 = matcher.group(1);
                    kotlin.jvm.internal.f0.o(strGroup4, "matcher.group(1)");
                    i12 = Integer.parseInt(strGroup4);
                } else if (iS3 == -1 && matcher.usePattern(Cookie.MONTH_PATTERN).matches()) {
                    String strGroup5 = matcher.group(1);
                    kotlin.jvm.internal.f0.o(strGroup5, "matcher.group(1)");
                    Locale locale = Locale.US;
                    kotlin.jvm.internal.f0.o(locale, "Locale.US");
                    if (strGroup5 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = strGroup5.toLowerCase(locale);
                    kotlin.jvm.internal.f0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
                    String strPattern = Cookie.MONTH_PATTERN.pattern();
                    kotlin.jvm.internal.f0.o(strPattern, "MONTH_PATTERN.pattern()");
                    iS3 = StringsKt__StringsKt.s3(strPattern, lowerCase, 0, false, 6, null) / 4;
                } else if (i10 == -1 && matcher.usePattern(Cookie.YEAR_PATTERN).matches()) {
                    String strGroup6 = matcher.group(1);
                    kotlin.jvm.internal.f0.o(strGroup6, "matcher.group(1)");
                    i10 = Integer.parseInt(strGroup6);
                }
                iC = c(s10, iC2 + 1, limit, false);
            }
            if (70 <= i10 && 99 >= i10) {
                i10 += bb.c.b.Dx;
            }
            if (i10 >= 0 && 69 >= i10) {
                i10 += 2000;
            }
            if (!(i10 >= 1601)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(iS3 != -1)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(1 <= i12 && 31 >= i12)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i11 >= 0 && 23 >= i11)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i13 >= 0 && 59 >= i13)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            if (!(i14 >= 0 && 59 >= i14)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            GregorianCalendar gregorianCalendar = new GregorianCalendar(Util.UTC);
            gregorianCalendar.setLenient(false);
            gregorianCalendar.set(1, i10);
            gregorianCalendar.set(2, iS3 - 1);
            gregorianCalendar.set(5, i12);
            gregorianCalendar.set(11, i11);
            gregorianCalendar.set(12, i13);
            gregorianCalendar.set(13, i14);
            gregorianCalendar.set(14, 0);
            return gregorianCalendar.getTimeInMillis();
        }

        private final long j(String s10) {
            try {
                long j10 = Long.parseLong(s10);
                if (j10 <= 0) {
                    return Long.MIN_VALUE;
                }
                return j10;
            } catch (NumberFormatException e10) {
                if (new Regex("-?\\d+").k(s10)) {
                    return kotlin.text.u.v2(s10, Constants.ACCEPT_TIME_SEPARATOR_SERVER, false, 2, null) ? Long.MIN_VALUE : Long.MAX_VALUE;
                }
                throw e10;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final boolean k(t url, String path) {
            String strX = url.x();
            if (kotlin.jvm.internal.f0.g(strX, path)) {
                return true;
            }
            return kotlin.text.u.v2(strX, path, false, 2, null) && (kotlin.text.u.K1(path, "/", false, 2, null) || strX.charAt(path.length()) == '/');
        }

        @dl.e
        @xh.m
        public final Cookie e(@dl.d t url, @dl.d String setCookie) {
            kotlin.jvm.internal.f0.p(url, "url");
            kotlin.jvm.internal.f0.p(setCookie, "setCookie");
            return f(System.currentTimeMillis(), url, setCookie);
        }

        /* JADX WARN: Code duplicated, block: B:46:0x00dc A[PHI: r1
  0x00dc: PHI (r1v25 long) = (r1v8 long), (r1v12 long) binds: [B:45:0x00da, B:56:0x0102] A[DONT_GENERATE, DONT_INLINE]] */
        @dl.e
        public final Cookie f(long currentTimeMillis, @dl.d t url, @dl.d String setCookie) {
            long j10;
            long j11;
            Cookie cookie;
            String str;
            String str2;
            kotlin.jvm.internal.f0.p(url, "url");
            kotlin.jvm.internal.f0.p(setCookie, "setCookie");
            int iDelimiterOffset$default = Util.delimiterOffset$default(setCookie, ';', 0, 0, 6, (Object) null);
            int iDelimiterOffset$default2 = Util.delimiterOffset$default(setCookie, n5.a.f132013h, 0, iDelimiterOffset$default, 2, (Object) null);
            if (iDelimiterOffset$default2 == iDelimiterOffset$default) {
                return null;
            }
            String strTrimSubstring$default = Util.trimSubstring$default(setCookie, 0, iDelimiterOffset$default2, 1, null);
            if ((strTrimSubstring$default.length() == 0) || Util.indexOfControlOrNonAscii(strTrimSubstring$default) != -1) {
                return null;
            }
            String strTrimSubstring = Util.trimSubstring(setCookie, iDelimiterOffset$default2 + 1, iDelimiterOffset$default);
            if (Util.indexOfControlOrNonAscii(strTrimSubstring) != -1) {
                return null;
            }
            int i10 = iDelimiterOffset$default + 1;
            int length = setCookie.length();
            String strH = null;
            String str3 = null;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = true;
            long j12 = -1;
            long jI = DatesKt.MAX_DATE;
            while (i10 < length) {
                int iDelimiterOffset = Util.delimiterOffset(setCookie, ';', i10, length);
                int iDelimiterOffset2 = Util.delimiterOffset(setCookie, n5.a.f132013h, i10, iDelimiterOffset);
                String strTrimSubstring2 = Util.trimSubstring(setCookie, i10, iDelimiterOffset2);
                String strTrimSubstring3 = iDelimiterOffset2 < iDelimiterOffset ? Util.trimSubstring(setCookie, iDelimiterOffset2 + 1, iDelimiterOffset) : "";
                if (kotlin.text.u.L1(strTrimSubstring2, com.alipay.zoloz.android.phone.mrpc.core.f.f39675x, true)) {
                    try {
                        jI = i(strTrimSubstring3, 0, strTrimSubstring3.length());
                        z12 = true;
                    } catch (NumberFormatException | IllegalArgumentException unused) {
                    }
                } else if (kotlin.text.u.L1(strTrimSubstring2, "max-age", true)) {
                    j12 = j(strTrimSubstring3);
                    z12 = true;
                } else if (kotlin.text.u.L1(strTrimSubstring2, "domain", true)) {
                    strH = h(strTrimSubstring3);
                    z13 = false;
                } else if (kotlin.text.u.L1(strTrimSubstring2, FlutterActivityLaunchConfigs.EXTRA_PATH, true)) {
                    str3 = strTrimSubstring3;
                } else if (kotlin.text.u.L1(strTrimSubstring2, "secure", true)) {
                    z10 = true;
                } else if (kotlin.text.u.L1(strTrimSubstring2, "httponly", true)) {
                    z11 = true;
                }
                i10 = iDelimiterOffset + 1;
            }
            long j13 = Long.MIN_VALUE;
            if (j12 == Long.MIN_VALUE) {
                j10 = j13;
            } else if (j12 != -1) {
                j13 = currentTimeMillis + (j12 <= 9223372036854775L ? j12 * ((long) 1000) : Long.MAX_VALUE);
                if (j13 >= currentTimeMillis) {
                    j11 = DatesKt.MAX_DATE;
                    if (j13 <= DatesKt.MAX_DATE) {
                        j10 = j13;
                    }
                } else {
                    j11 = DatesKt.MAX_DATE;
                }
                j10 = j11;
            } else {
                j10 = jI;
            }
            String host = url.getHost();
            if (strH == null) {
                str = host;
                cookie = null;
            } else {
                if (!d(host, strH)) {
                    return null;
                }
                cookie = null;
                str = strH;
            }
            if (host.length() != str.length() && PublicSuffixDatabase.INSTANCE.get().getEffectiveTldPlusOne(str) == null) {
                return cookie;
            }
            String strSubstring = "/";
            String str4 = str3;
            if (str4 == null || !kotlin.text.u.v2(str4, "/", false, 2, cookie)) {
                String strX = url.x();
                int iF3 = StringsKt__StringsKt.F3(strX, IOUtils.DIR_SEPARATOR_UNIX, 0, false, 6, null);
                if (iF3 != 0) {
                    if (strX == null) {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    strSubstring = strX.substring(0, iF3);
                    kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                }
                str2 = strSubstring;
            } else {
                str2 = str4;
            }
            return new Cookie(strTrimSubstring$default, strTrimSubstring, j10, str, str2, z10, z11, z12, z13, null);
        }

        @dl.d
        @xh.m
        public final List<Cookie> g(@dl.d t url, @dl.d s headers) {
            kotlin.jvm.internal.f0.p(url, "url");
            kotlin.jvm.internal.f0.p(headers, "headers");
            List<String> listW = headers.w("Set-Cookie");
            int size = listW.size();
            ArrayList arrayList = null;
            for (int i10 = 0; i10 < size; i10++) {
                Cookie cookieE = e(url, listW.get(i10));
                if (cookieE != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(cookieE);
                }
            }
            if (arrayList == null) {
                return CollectionsKt__CollectionsKt.E();
            }
            List<Cookie> listUnmodifiableList = Collections.unmodifiableList(arrayList);
            kotlin.jvm.internal.f0.o(listUnmodifiableList, "Collections.unmodifiableList(cookies)");
            return listUnmodifiableList;
        }
    }

    private Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.name = str;
        this.value = str2;
        this.expiresAt = j10;
        this.domain = str3;
        this.path = str4;
        this.secure = z10;
        this.httpOnly = z11;
        this.persistent = z12;
        this.hostOnly = z13;
    }

    public /* synthetic */ Cookie(String str, String str2, long j10, String str3, String str4, boolean z10, boolean z11, boolean z12, boolean z13, kotlin.jvm.internal.u uVar) {
        this(str, str2, j10, str3, str4, z10, z11, z12, z13);
    }

    @dl.e
    @xh.m
    public static final Cookie parse(@dl.d t tVar, @dl.d String str) {
        return INSTANCE.e(tVar, str);
    }

    @dl.d
    @xh.m
    public static final List<Cookie> parseAll(@dl.d t tVar, @dl.d s sVar) {
        return INSTANCE.g(tVar, sVar);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "domain", imports = {}))
    @xh.h(name = "-deprecated_domain")
    /* JADX INFO: renamed from: -deprecated_domain, reason: not valid java name and from getter */
    public final String getDomain() {
        return this.domain;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "expiresAt", imports = {}))
    @xh.h(name = "-deprecated_expiresAt")
    /* JADX INFO: renamed from: -deprecated_expiresAt, reason: not valid java name and from getter */
    public final long getExpiresAt() {
        return this.expiresAt;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "hostOnly", imports = {}))
    @xh.h(name = "-deprecated_hostOnly")
    /* JADX INFO: renamed from: -deprecated_hostOnly, reason: not valid java name and from getter */
    public final boolean getHostOnly() {
        return this.hostOnly;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "httpOnly", imports = {}))
    @xh.h(name = "-deprecated_httpOnly")
    /* JADX INFO: renamed from: -deprecated_httpOnly, reason: not valid java name and from getter */
    public final boolean getHttpOnly() {
        return this.httpOnly;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "name", imports = {}))
    @xh.h(name = "-deprecated_name")
    /* JADX INFO: renamed from: -deprecated_name, reason: not valid java name and from getter */
    public final String getName() {
        return this.name;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = FlutterActivityLaunchConfigs.EXTRA_PATH, imports = {}))
    @xh.h(name = "-deprecated_path")
    /* JADX INFO: renamed from: -deprecated_path, reason: not valid java name and from getter */
    public final String getPath() {
        return this.path;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "persistent", imports = {}))
    @xh.h(name = "-deprecated_persistent")
    /* JADX INFO: renamed from: -deprecated_persistent, reason: not valid java name and from getter */
    public final boolean getPersistent() {
        return this.persistent;
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "secure", imports = {}))
    @xh.h(name = "-deprecated_secure")
    /* JADX INFO: renamed from: -deprecated_secure, reason: not valid java name and from getter */
    public final boolean getSecure() {
        return this.secure;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "value", imports = {}))
    @xh.h(name = "-deprecated_value")
    /* JADX INFO: renamed from: -deprecated_value, reason: not valid java name and from getter */
    public final String getValue() {
        return this.value;
    }

    @dl.d
    @xh.h(name = "domain")
    public final String domain() {
        return this.domain;
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof Cookie) {
            Cookie cookie = (Cookie) other;
            if (kotlin.jvm.internal.f0.g(cookie.name, this.name) && kotlin.jvm.internal.f0.g(cookie.value, this.value) && cookie.expiresAt == this.expiresAt && kotlin.jvm.internal.f0.g(cookie.domain, this.domain) && kotlin.jvm.internal.f0.g(cookie.path, this.path) && cookie.secure == this.secure && cookie.httpOnly == this.httpOnly && cookie.persistent == this.persistent && cookie.hostOnly == this.hostOnly) {
                return true;
            }
        }
        return false;
    }

    @xh.h(name = "expiresAt")
    public final long expiresAt() {
        return this.expiresAt;
    }

    @IgnoreJRERequirement
    public int hashCode() {
        return ((((((((((((((((bb.c.b.f30674h7 + this.name.hashCode()) * 31) + this.value.hashCode()) * 31) + androidx.collection.k.a(this.expiresAt)) * 31) + this.domain.hashCode()) * 31) + this.path.hashCode()) * 31) + androidx.compose.foundation.b0.a(this.secure)) * 31) + androidx.compose.foundation.b0.a(this.httpOnly)) * 31) + androidx.compose.foundation.b0.a(this.persistent)) * 31) + androidx.compose.foundation.b0.a(this.hostOnly);
    }

    @xh.h(name = "hostOnly")
    public final boolean hostOnly() {
        return this.hostOnly;
    }

    @xh.h(name = "httpOnly")
    public final boolean httpOnly() {
        return this.httpOnly;
    }

    public final boolean matches(@dl.d t url) {
        kotlin.jvm.internal.f0.p(url, "url");
        if ((this.hostOnly ? kotlin.jvm.internal.f0.g(url.getHost(), this.domain) : INSTANCE.d(url.getHost(), this.domain)) && INSTANCE.k(url, this.path)) {
            return !this.secure || url.getIsHttps();
        }
        return false;
    }

    @dl.d
    @xh.h(name = "name")
    public final String name() {
        return this.name;
    }

    @dl.d
    @xh.h(name = FlutterActivityLaunchConfigs.EXTRA_PATH)
    public final String path() {
        return this.path;
    }

    @xh.h(name = "persistent")
    public final boolean persistent() {
        return this.persistent;
    }

    @xh.h(name = "secure")
    public final boolean secure() {
        return this.secure;
    }

    @dl.d
    public String toString() {
        return toString$okhttp(false);
    }

    @dl.d
    public final String toString$okhttp(boolean forObsoleteRfc2965) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.name);
        sb2.append(n5.a.f132013h);
        sb2.append(this.value);
        if (this.persistent) {
            if (this.expiresAt == Long.MIN_VALUE) {
                sb2.append("; max-age=0");
            } else {
                sb2.append("; expires=");
                sb2.append(DatesKt.toHttpDateString(new Date(this.expiresAt)));
            }
        }
        if (!this.hostOnly) {
            sb2.append("; domain=");
            if (forObsoleteRfc2965) {
                sb2.append(".");
            }
            sb2.append(this.domain);
        }
        sb2.append("; path=");
        sb2.append(this.path);
        if (this.secure) {
            sb2.append("; secure");
        }
        if (this.httpOnly) {
            sb2.append("; httponly");
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "toString()");
        return string;
    }

    @dl.d
    @xh.h(name = "value")
    public final String value() {
        return this.value;
    }
}
