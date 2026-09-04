package okhttp3;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.s0;

/* JADX INFO: compiled from: Challenge.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0014\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\u001d\u0010\u001eB\u0019\b\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001fJ\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u000f\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\t\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\bH\u0007¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0007¢\u0006\u0004\b\u000b\u0010\u0007J\u000f\u0010\f\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R%\u0010\u0016\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\u00050\b8G¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\nR\u0017\u0010\u0019\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u0018\u0010\u0007R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u00058G¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u00028G¢\u0006\u0006\u001a\u0004\b\u001c\u0010\r¨\u0006 "}, d2 = {"Lokhttp3/g;", "", "Ljava/nio/charset/Charset;", "charset", "i", "", "d", "()Ljava/lang/String;", "", ak.av, "()Ljava/util/Map;", ak.aF, "b", "()Ljava/nio/charset/Charset;", "other", "", "equals", "", "hashCode", "toString", "Ljava/util/Map;", "e", "authParams", "Ljava/lang/String;", RXScreenCaptureService.KEY_HEIGHT, "scheme", "g", "realm", "f", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Map<String, String> authParams;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String scheme;

    /* JADX WARN: Illegal instructions before constructor call */
    public g(@dl.d String scheme, @dl.d String realm) {
        kotlin.jvm.internal.f0.p(scheme, "scheme");
        kotlin.jvm.internal.f0.p(realm, "realm");
        Map mapSingletonMap = Collections.singletonMap("realm", realm);
        kotlin.jvm.internal.f0.o(mapSingletonMap, "singletonMap(\"realm\", realm)");
        this(scheme, (Map<String, String>) mapSingletonMap);
    }

    public g(@dl.d String scheme, @dl.d Map<String, String> authParams) {
        String lowerCase;
        kotlin.jvm.internal.f0.p(scheme, "scheme");
        kotlin.jvm.internal.f0.p(authParams, "authParams");
        this.scheme = scheme;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, String> entry : authParams.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (key != null) {
                Locale US = Locale.US;
                kotlin.jvm.internal.f0.o(US, "US");
                lowerCase = key.toLowerCase(US);
                kotlin.jvm.internal.f0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            } else {
                lowerCase = null;
            }
            linkedHashMap.put(lowerCase, value);
        }
        Map<String, String> mapUnmodifiableMap = Collections.unmodifiableMap(linkedHashMap);
        kotlin.jvm.internal.f0.o(mapUnmodifiableMap, "unmodifiableMap<String?, String>(newAuthParams)");
        this.authParams = mapUnmodifiableMap;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "authParams", imports = {}))
    @xh.h(name = "-deprecated_authParams")
    public final Map<String, String> a() {
        return this.authParams;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "charset", imports = {}))
    @xh.h(name = "-deprecated_charset")
    public final Charset b() {
        return f();
    }

    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "realm", imports = {}))
    @xh.h(name = "-deprecated_realm")
    @dl.e
    public final String c() {
        return g();
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "scheme", imports = {}))
    @xh.h(name = "-deprecated_scheme")
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getScheme() {
        return this.scheme;
    }

    @dl.d
    @xh.h(name = "authParams")
    public final Map<String, String> e() {
        return this.authParams;
    }

    public boolean equals(@dl.e Object other) {
        if (other instanceof g) {
            g gVar = (g) other;
            if (kotlin.jvm.internal.f0.g(gVar.scheme, this.scheme) && kotlin.jvm.internal.f0.g(gVar.authParams, this.authParams)) {
                return true;
            }
        }
        return false;
    }

    @dl.d
    @xh.h(name = "charset")
    public final Charset f() {
        String str = this.authParams.get("charset");
        if (str != null) {
            try {
                Charset charsetForName = Charset.forName(str);
                kotlin.jvm.internal.f0.o(charsetForName, "Charset.forName(charset)");
                return charsetForName;
            } catch (Exception unused) {
            }
        }
        Charset ISO_8859_1 = StandardCharsets.ISO_8859_1;
        kotlin.jvm.internal.f0.o(ISO_8859_1, "ISO_8859_1");
        return ISO_8859_1;
    }

    @xh.h(name = "realm")
    @dl.e
    public final String g() {
        return this.authParams.get("realm");
    }

    @dl.d
    @xh.h(name = "scheme")
    public final String h() {
        return this.scheme;
    }

    public int hashCode() {
        return ((bb.c.b.f30865pe + this.scheme.hashCode()) * 31) + this.authParams.hashCode();
    }

    @dl.d
    public final g i(@dl.d Charset charset) {
        kotlin.jvm.internal.f0.p(charset, "charset");
        Map mapJ0 = kotlin.collections.s0.J0(this.authParams);
        String strName = charset.name();
        kotlin.jvm.internal.f0.o(strName, "charset.name()");
        mapJ0.put("charset", strName);
        return new g(this.scheme, (Map<String, String>) mapJ0);
    }

    @dl.d
    public String toString() {
        return this.scheme + " authParams=" + this.authParams;
    }
}
