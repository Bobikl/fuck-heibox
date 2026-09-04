package okhttp3;

import com.alipay.zoloz.toyger.ToygerBaseService;
import com.umeng.analytics.pro.ak;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.s0;

/* JADX INFO: compiled from: MediaType.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0006\u0018\u0000 \u00072\u00020\u0001:\u0001\nB/\b\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0005\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007J\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0005J\u000f\u0010\b\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\n\u0010\tJ\b\u0010\u000b\u001a\u00020\u0005H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0012\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0011R\u0017\u0010\u0014\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\b\u0010\u0011\u001a\u0004\b\u0013\u0010\tR\u0017\u0010\u0017\u001a\u00020\u00058\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0016\u0010\tR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001e"}, d2 = {"Lokhttp3/v;", "", "Ljava/nio/charset/Charset;", "defaultValue", "f", "", "name", "i", "b", "()Ljava/lang/String;", ak.av, "toString", "other", "", "equals", "", "hashCode", "Ljava/lang/String;", "mediaType", "l", "type", ak.aF, "k", "subtype", "", "d", "[Ljava/lang/String;", "parameterNamesAndValues", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V", "okhttp"}, k = 1, mv = {1, 4, 0})
public final class v {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f132675e = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f132676f = "\"([^\"]*)\"";

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String mediaType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String type;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final String subtype;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String[] parameterNamesAndValues;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Pattern f132677g = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final Pattern f132678h = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");

    /* JADX INFO: renamed from: okhttp3.v$a, reason: from kotlin metadata */
    /* JADX INFO: compiled from: MediaType.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u0004\u001a\u00020\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0003*\u00020\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\b\u0010\u0005J\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\t\u0010\u0005R\u001c\u0010\f\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000fR\u001c\u0010\u0011\u001a\n \u000b*\u0004\u0018\u00010\n0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lokhttp3/v$a;", "", "", "Lokhttp3/v;", ak.aF, "(Ljava/lang/String;)Lokhttp3/v;", "d", "mediaType", ak.av, "b", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PARAMETER", "Ljava/util/regex/Pattern;", "QUOTED", "Ljava/lang/String;", ToygerBaseService.KEY_TOKEN, "TYPE_SUBTYPE", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "mediaType.toMediaType()", imports = {"okhttp3.MediaType.Companion.toMediaType"}))
        @xh.h(name = "-deprecated_get")
        public final v a(@dl.d String mediaType) {
            kotlin.jvm.internal.f0.p(mediaType, "mediaType");
            return c(mediaType);
        }

        @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to extension function", replaceWith = @s0(expression = "mediaType.toMediaTypeOrNull()", imports = {"okhttp3.MediaType.Companion.toMediaTypeOrNull"}))
        @xh.h(name = "-deprecated_parse")
        @dl.e
        public final v b(@dl.d String mediaType) {
            kotlin.jvm.internal.f0.p(mediaType, "mediaType");
            return d(mediaType);
        }

        @dl.d
        @xh.h(name = "get")
        @xh.m
        public final v c(@dl.d String toMediaType) {
            kotlin.jvm.internal.f0.p(toMediaType, "$this$toMediaType");
            Matcher matcher = v.f132677g.matcher(toMediaType);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + toMediaType + kotlin.text.y.f128593b).toString());
            }
            String strGroup = matcher.group(1);
            kotlin.jvm.internal.f0.o(strGroup, "typeSubtype.group(1)");
            Locale locale = Locale.US;
            kotlin.jvm.internal.f0.o(locale, "Locale.US");
            if (strGroup == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase = strGroup.toLowerCase(locale);
            kotlin.jvm.internal.f0.o(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String strGroup2 = matcher.group(2);
            kotlin.jvm.internal.f0.o(strGroup2, "typeSubtype.group(2)");
            kotlin.jvm.internal.f0.o(locale, "Locale.US");
            if (strGroup2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            String lowerCase2 = strGroup2.toLowerCase(locale);
            kotlin.jvm.internal.f0.o(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = v.f132678h.matcher(toMediaType);
            int iEnd = matcher.end();
            while (iEnd < toMediaType.length()) {
                matcher2.region(iEnd, toMediaType.length());
                if (!matcher2.lookingAt()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Parameter is not formatted correctly: \"");
                    String strSubstring = toMediaType.substring(iEnd);
                    kotlin.jvm.internal.f0.o(strSubstring, "(this as java.lang.String).substring(startIndex)");
                    sb2.append(strSubstring);
                    sb2.append("\" for: \"");
                    sb2.append(toMediaType);
                    sb2.append(kotlin.text.y.f128593b);
                    throw new IllegalArgumentException(sb2.toString().toString());
                }
                String strGroup3 = matcher2.group(1);
                if (strGroup3 == null) {
                    iEnd = matcher2.end();
                } else {
                    String strGroup4 = matcher2.group(2);
                    if (strGroup4 == null) {
                        strGroup4 = matcher2.group(3);
                    } else if (kotlin.text.u.v2(strGroup4, "'", false, 2, null) && kotlin.text.u.K1(strGroup4, "'", false, 2, null) && strGroup4.length() > 2) {
                        strGroup4 = strGroup4.substring(1, strGroup4.length() - 1);
                        kotlin.jvm.internal.f0.o(strGroup4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    }
                    arrayList.add(strGroup3);
                    arrayList.add(strGroup4);
                    iEnd = matcher2.end();
                }
            }
            Object[] array = arrayList.toArray(new String[0]);
            if (array != null) {
                return new v(toMediaType, lowerCase, lowerCase2, (String[]) array, null);
            }
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
        }

        @xh.h(name = "parse")
        @dl.e
        @xh.m
        public final v d(@dl.d String toMediaTypeOrNull) {
            kotlin.jvm.internal.f0.p(toMediaTypeOrNull, "$this$toMediaTypeOrNull");
            try {
                return c(toMediaTypeOrNull);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
    }

    private v(String str, String str2, String str3, String[] strArr) {
        this.mediaType = str;
        this.type = str2;
        this.subtype = str3;
        this.parameterNamesAndValues = strArr;
    }

    public /* synthetic */ v(String str, String str2, String str3, String[] strArr, kotlin.jvm.internal.u uVar) {
        this(str, str2, str3, strArr);
    }

    public static /* synthetic */ Charset g(v vVar, Charset charset, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            charset = null;
        }
        return vVar.f(charset);
    }

    @dl.d
    @xh.h(name = "get")
    @xh.m
    public static final v h(@dl.d String str) {
        return INSTANCE.c(str);
    }

    @xh.h(name = "parse")
    @dl.e
    @xh.m
    public static final v j(@dl.d String str) {
        return INSTANCE.d(str);
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "subtype", imports = {}))
    @xh.h(name = "-deprecated_subtype")
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getSubtype() {
        return this.subtype;
    }

    @dl.d
    @kotlin.k(level = DeprecationLevel.ERROR, message = "moved to val", replaceWith = @s0(expression = "type", imports = {}))
    @xh.h(name = "-deprecated_type")
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @dl.e
    @xh.i
    public final Charset e() {
        return g(this, null, 1, null);
    }

    public boolean equals(@dl.e Object other) {
        return (other instanceof v) && kotlin.jvm.internal.f0.g(((v) other).mediaType, this.mediaType);
    }

    @dl.e
    @xh.i
    public final Charset f(@dl.e Charset defaultValue) {
        String strI = i("charset");
        if (strI == null) {
            return defaultValue;
        }
        try {
            return Charset.forName(strI);
        } catch (IllegalArgumentException unused) {
            return defaultValue;
        }
    }

    public int hashCode() {
        return this.mediaType.hashCode();
    }

    @dl.e
    public final String i(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        fi.j jVarB1 = fi.u.B1(ArraysKt___ArraysKt.Oe(this.parameterNamesAndValues), 2);
        int iH = jVarB1.h();
        int i10 = jVarB1.i();
        int iJ = jVarB1.j();
        if (iJ >= 0) {
            if (iH > i10) {
                return null;
            }
        } else if (iH < i10) {
            return null;
        }
        while (!kotlin.text.u.L1(this.parameterNamesAndValues[iH], name, true)) {
            if (iH == i10) {
                return null;
            }
            iH += iJ;
        }
        return this.parameterNamesAndValues[iH + 1];
    }

    @dl.d
    @xh.h(name = "subtype")
    public final String k() {
        return this.subtype;
    }

    @dl.d
    @xh.h(name = "type")
    public final String l() {
        return this.type;
    }

    @dl.d
    /* JADX INFO: renamed from: toString, reason: from getter */
    public String getMediaType() {
        return this.mediaType;
    }
}
