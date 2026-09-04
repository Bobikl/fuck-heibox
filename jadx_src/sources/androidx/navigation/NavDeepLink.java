package androidx.navigation;

import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.RestrictTo;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.r;
import kotlin.text.Regex;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: compiled from: NavDeepLink.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n1360#2:762\n1446#2,5:763\n1559#2:768\n1590#2,4:769\n1559#2:773\n1590#2,4:774\n1855#2,2:780\n1855#2:782\n1559#2:783\n1590#2,4:784\n1856#2:788\n215#3,2:778\n1#4:789\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink\n*L\n86#1:762\n86#1:763,5\n232#1:768\n232#1:769,4\n249#1:773\n249#1:774,4\n310#1:780,2\n319#1:782\n331#1:783\n331#1:784,4\n319#1:788\n271#1:778,2\n*E\n"})
public final class NavDeepLink {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private static final b f24810q = new b(null);

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final Pattern f24811r = Pattern.compile("^[a-zA-Z]+[+\\w\\-.]*:");

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Pattern f24812s = Pattern.compile("\\{(.+?)\\}");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final String f24813a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final String f24814b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final String f24815c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final List<String> f24816d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private String f24817e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final kotlin.z f24818f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final kotlin.z f24819g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final kotlin.z f24820h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f24821i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private final kotlin.z f24822j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final kotlin.z f24823k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final kotlin.z f24824l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final kotlin.z f24825m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.e
    private String f24826n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final kotlin.z f24827o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f24828p;

    /* JADX INFO: compiled from: NavDeepLink.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n1#2:762\n*E\n"})
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        public static final C0188a f24829d = new C0188a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private String f24830a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private String f24831b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private String f24832c;

        /* JADX INFO: renamed from: androidx.navigation.NavDeepLink$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: NavDeepLink.kt */
        @kotlin.jvm.internal.t0({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$Builder$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,761:1\n1#2:762\n*E\n"})
        public static final class C0188a {
            private C0188a() {
            }

            public /* synthetic */ C0188a(kotlin.jvm.internal.u uVar) {
                this();
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ a e(C0188a c0188a, String basePath, Map typeMap, int i10, Object obj) {
                if ((i10 & 2) != 0) {
                    typeMap = kotlin.collections.s0.z();
                }
                kotlin.jvm.internal.f0.p(basePath, "basePath");
                kotlin.jvm.internal.f0.p(typeMap, "typeMap");
                a aVar = new a();
                kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
                aVar.i(basePath, kotlin.jvm.internal.n0.d(Object.class), typeMap);
                return aVar;
            }

            @dl.d
            @xh.m
            public final a a(@dl.d String action) {
                kotlin.jvm.internal.f0.p(action, "action");
                if (!(action.length() > 0)) {
                    throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
                }
                a aVar = new a();
                aVar.e(action);
                return aVar;
            }

            @dl.d
            @xh.m
            public final a b(@dl.d String mimeType) {
                kotlin.jvm.internal.f0.p(mimeType, "mimeType");
                a aVar = new a();
                aVar.f(mimeType);
                return aVar;
            }

            @dl.d
            @xh.m
            public final a c(@dl.d String uriPattern) {
                kotlin.jvm.internal.f0.p(uriPattern, "uriPattern");
                a aVar = new a();
                aVar.g(uriPattern);
                return aVar;
            }

            @xh.m
            public final /* synthetic */ <T> a d(String basePath, Map<r, m0<?>> typeMap) {
                kotlin.jvm.internal.f0.p(basePath, "basePath");
                kotlin.jvm.internal.f0.p(typeMap, "typeMap");
                a aVar = new a();
                kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
                aVar.i(basePath, kotlin.jvm.internal.n0.d(Object.class), typeMap);
                return aVar;
            }
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public a() {
        }

        @dl.d
        @xh.m
        public static final a b(@dl.d String str) {
            return f24829d.a(str);
        }

        @dl.d
        @xh.m
        public static final a c(@dl.d String str) {
            return f24829d.b(str);
        }

        @dl.d
        @xh.m
        public static final a d(@dl.d String str) {
            return f24829d.c(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a j(a aVar, String basePath, Map typeMap, int i10, Object obj) {
            if ((i10 & 2) != 0) {
                typeMap = kotlin.collections.s0.z();
            }
            kotlin.jvm.internal.f0.p(basePath, "basePath");
            kotlin.jvm.internal.f0.p(typeMap, "typeMap");
            kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
            return aVar.i(basePath, kotlin.jvm.internal.n0.d(Object.class), typeMap);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ a k(a aVar, String str, kotlin.reflect.d dVar, Map map, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                map = kotlin.collections.s0.z();
            }
            return aVar.i(str, dVar, map);
        }

        @dl.d
        public final NavDeepLink a() {
            return new NavDeepLink(this.f24830a, this.f24831b, this.f24832c);
        }

        @dl.d
        public final a e(@dl.d String action) {
            kotlin.jvm.internal.f0.p(action, "action");
            if (!(action.length() > 0)) {
                throw new IllegalArgumentException("The NavDeepLink cannot have an empty action.".toString());
            }
            this.f24831b = action;
            return this;
        }

        @dl.d
        public final a f(@dl.d String mimeType) {
            kotlin.jvm.internal.f0.p(mimeType, "mimeType");
            this.f24832c = mimeType;
            return this;
        }

        @dl.d
        public final a g(@dl.d String uriPattern) {
            kotlin.jvm.internal.f0.p(uriPattern, "uriPattern");
            this.f24830a = uriPattern;
            return this;
        }

        public final /* synthetic */ <T> a h(String basePath, Map<r, m0<?>> typeMap) {
            kotlin.jvm.internal.f0.p(basePath, "basePath");
            kotlin.jvm.internal.f0.p(typeMap, "typeMap");
            kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
            return i(basePath, kotlin.jvm.internal.n0.d(Object.class), typeMap);
        }

        @dl.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final <T> a i(@dl.d String basePath, @dl.d kotlin.reflect.d<T> route, @dl.d Map<r, ? extends m0<?>> typeMap) {
            kotlin.jvm.internal.f0.p(basePath, "basePath");
            kotlin.jvm.internal.f0.p(route, "route");
            kotlin.jvm.internal.f0.p(typeMap, "typeMap");
            this.f24830a = RouteSerializerKt.k(kotlinx.serialization.t.g(route), typeMap, basePath);
            return this;
        }
    }

    /* JADX INFO: compiled from: NavDeepLink.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: NavDeepLink.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavDeepLink.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,761:1\n731#2,9:762\n*S KotlinDebug\n*F\n+ 1 NavDeepLink.kt\nandroidx/navigation/NavDeepLink$MimeType\n*L\n448#1:762,9\n*E\n"})
    public static final class c implements Comparable<c> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private String f24833b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.d
        private String f24834c;

        public c(@dl.d String mimeType) {
            List listE;
            kotlin.jvm.internal.f0.p(mimeType, "mimeType");
            List<String> listP = new Regex("/").p(mimeType, 0);
            if (listP.isEmpty()) {
                listE = CollectionsKt__CollectionsKt.E();
            } else {
                ListIterator<String> listIterator = listP.listIterator(listP.size());
                while (listIterator.hasPrevious()) {
                    if (!(listIterator.previous().length() == 0)) {
                        listE = CollectionsKt___CollectionsKt.E5(listP, listIterator.nextIndex() + 1);
                    }
                }
                listE = CollectionsKt__CollectionsKt.E();
            }
            this.f24833b = (String) listE.get(0);
            this.f24834c = (String) listE.get(1);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@dl.d c other) {
            kotlin.jvm.internal.f0.p(other, "other");
            int i10 = kotlin.jvm.internal.f0.g(this.f24833b, other.f24833b) ? 2 : 0;
            return kotlin.jvm.internal.f0.g(this.f24834c, other.f24834c) ? i10 + 1 : i10;
        }

        @dl.d
        public final String b() {
            return this.f24834c;
        }

        @dl.d
        public final String c() {
            return this.f24833b;
        }

        public final void d(@dl.d String str) {
            kotlin.jvm.internal.f0.p(str, "<set-?>");
            this.f24834c = str;
        }

        public final void e(@dl.d String str) {
            kotlin.jvm.internal.f0.p(str, "<set-?>");
            this.f24833b = str;
        }
    }

    /* JADX INFO: compiled from: NavDeepLink.kt */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private String f24835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final List<String> f24836b = new ArrayList();

        public final void a(@dl.d String name) {
            kotlin.jvm.internal.f0.p(name, "name");
            this.f24836b.add(name);
        }

        @dl.d
        public final String b(int i10) {
            return this.f24836b.get(i10);
        }

        @dl.d
        public final List<String> c() {
            return this.f24836b;
        }

        @dl.e
        public final String d() {
            return this.f24835a;
        }

        public final void e(@dl.e String str) {
            this.f24835a = str;
        }

        public final int f() {
            return this.f24836b.size();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDeepLink(@dl.d String uri) {
        this(uri, null, null);
        kotlin.jvm.internal.f0.p(uri, "uri");
    }

    public NavDeepLink(@dl.e String str, @dl.e String str2, @dl.e String str3) {
        this.f24813a = str;
        this.f24814b = str2;
        this.f24815c = str3;
        this.f24816d = new ArrayList();
        this.f24818f = kotlin.b0.c(new yh.a<Pattern>() { // from class: androidx.navigation.NavDeepLink$pathPattern$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pattern invoke() {
                String str4 = this.f24844b.f24817e;
                if (str4 != null) {
                    return Pattern.compile(str4, 2);
                }
                return null;
            }
        });
        this.f24819g = kotlin.b0.c(new yh.a<Boolean>() { // from class: androidx.navigation.NavDeepLink$isParameterizedQuery$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf((this.f24842b.y() == null || Uri.parse(this.f24842b.y()).getQuery() == null) ? false : true);
            }
        });
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f24820h = kotlin.b0.b(lazyThreadSafetyMode, new yh.a<Map<String, d>>() { // from class: androidx.navigation.NavDeepLink$queryArgsMap$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<String, NavDeepLink.d> invoke() {
                return this.f24845b.M();
            }
        });
        this.f24822j = kotlin.b0.b(lazyThreadSafetyMode, new yh.a<Pair<? extends List<String>, ? extends String>>() { // from class: androidx.navigation.NavDeepLink$fragArgsAndRegex$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pair<List<String>, String> invoke() {
                return this.f24838b.I();
            }
        });
        this.f24823k = kotlin.b0.b(lazyThreadSafetyMode, new yh.a<List<String>>() { // from class: androidx.navigation.NavDeepLink$fragArgs$2
            {
                super(0);
            }

            @Override // yh.a
            public final List<String> invoke() {
                List<String> list;
                Pair pairL = this.f24837b.l();
                return (pairL == null || (list = (List) pairL.e()) == null) ? new ArrayList() : list;
            }
        });
        this.f24824l = kotlin.b0.b(lazyThreadSafetyMode, new yh.a<String>() { // from class: androidx.navigation.NavDeepLink$fragRegex$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                Pair pairL = this.f24840b.l();
                if (pairL != null) {
                    return (String) pairL.f();
                }
                return null;
            }
        });
        this.f24825m = kotlin.b0.c(new yh.a<Pattern>() { // from class: androidx.navigation.NavDeepLink$fragPattern$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pattern invoke() {
                String strN = this.f24839b.n();
                if (strN != null) {
                    return Pattern.compile(strN, 2);
                }
                return null;
            }
        });
        this.f24827o = kotlin.b0.c(new yh.a<Pattern>() { // from class: androidx.navigation.NavDeepLink$mimeTypePattern$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Pattern invoke() {
                String str4 = this.f24843b.f24826n;
                if (str4 != null) {
                    return Pattern.compile(str4);
                }
                return null;
            }
        });
        L();
        K();
    }

    private final boolean A() {
        return ((Boolean) this.f24819g.getValue()).booleanValue();
    }

    private final boolean B(String str) {
        boolean z10 = str == null;
        String str2 = this.f24814b;
        return z10 != (str2 != null) && (str == null || kotlin.jvm.internal.f0.g(str2, str));
    }

    private final boolean C(String str) {
        if ((str == null) != (this.f24815c != null)) {
            if (str == null) {
                return true;
            }
            Pattern patternV = v();
            kotlin.jvm.internal.f0.m(patternV);
            if (patternV.matcher(str).matches()) {
                return true;
            }
        }
        return false;
    }

    private final boolean D(Uri uri) {
        if ((uri == null) != (w() != null)) {
            if (uri == null) {
                return true;
            }
            Pattern patternW = w();
            kotlin.jvm.internal.f0.m(patternW);
            if (patternW.matcher(uri.toString()).matches()) {
                return true;
            }
        }
        return false;
    }

    private final void G(Bundle bundle, String str, String str2, p pVar) {
        if (pVar != null) {
            pVar.b().g(bundle, str, str2);
        } else {
            bundle.putString(str, str2);
        }
    }

    private final boolean H(Bundle bundle, String str, String str2, p pVar) {
        if (!bundle.containsKey(str)) {
            return true;
        }
        if (pVar == null) {
            return false;
        }
        m0<Object> m0VarB = pVar.b();
        m0VarB.h(bundle, str, str2, m0VarB.b(bundle, str));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<List<String>, String> I() {
        String str = this.f24813a;
        if (str == null || Uri.parse(str).getFragment() == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        String fragment = Uri.parse(this.f24813a).getFragment();
        StringBuilder sb2 = new StringBuilder();
        kotlin.jvm.internal.f0.m(fragment);
        g(fragment, arrayList, sb2);
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "fragRegex.toString()");
        return c1.a(arrayList, string);
    }

    private final boolean J(List<String> list, d dVar, Bundle bundle, Map<String, p> map) {
        Object objValueOf;
        Bundle bundleB = androidx.core.os.e.b(new Pair[0]);
        Iterator<T> it = dVar.c().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            String str = (String) it.next();
            p pVar = map.get(str);
            m0<Object> m0VarB = pVar != null ? pVar.b() : null;
            if ((m0VarB instanceof g) && !pVar.c()) {
                m0VarB.k(bundleB, str, ((g) m0VarB).n());
            }
        }
        for (String str2 : list) {
            String strD = dVar.d();
            Matcher matcher = strD != null ? Pattern.compile(strD, 32).matcher(str2) : null;
            if (matcher == null || !matcher.matches()) {
                return false;
            }
            List<String> listC = dVar.c();
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listC, 10));
            int i10 = 0;
            for (Object obj : listC) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.W();
                }
                String str3 = (String) obj;
                String strGroup = matcher.group(i11);
                if (strGroup == null) {
                    strGroup = "";
                } else {
                    kotlin.jvm.internal.f0.o(strGroup, "argMatcher.group(index + 1) ?: \"\"");
                }
                p pVar2 = map.get(str3);
                try {
                    if (bundleB.containsKey(str3)) {
                        objValueOf = Boolean.valueOf(H(bundleB, str3, strGroup, pVar2));
                    } else {
                        G(bundleB, str3, strGroup, pVar2);
                        objValueOf = b2.f124493a;
                    }
                } catch (IllegalArgumentException unused) {
                    objValueOf = b2.f124493a;
                }
                arrayList.add(objValueOf);
                i10 = i11;
            }
        }
        bundle.putAll(bundleB);
        return true;
    }

    private final void K() {
        if (this.f24815c == null) {
            return;
        }
        if (!Pattern.compile("^[\\s\\S]+/[\\s\\S]+$").matcher(this.f24815c).matches()) {
            throw new IllegalArgumentException(("The given mimeType " + this.f24815c + " does not match to required \"type/subtype\" format").toString());
        }
        c cVar = new c(this.f24815c);
        this.f24826n = kotlin.text.u.l2("^(" + cVar.c() + "|[*]+)/(" + cVar.b() + "|[*]+)$", "*|[*]", "[\\s\\S]", false, 4, null);
    }

    private final void L() {
        if (this.f24813a == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder("^");
        if (!f24811r.matcher(this.f24813a).find()) {
            sb2.append("http[s]?://");
        }
        Matcher matcher = Pattern.compile("(\\?|\\#|$)").matcher(this.f24813a);
        matcher.find();
        boolean z10 = false;
        String strSubstring = this.f24813a.substring(0, matcher.start());
        kotlin.jvm.internal.f0.o(strSubstring, "substring(...)");
        g(strSubstring, this.f24816d, sb2);
        if (!StringsKt__StringsKt.W2(sb2, ".*", false, 2, null) && !StringsKt__StringsKt.W2(sb2, "([^/]+?)", false, 2, null)) {
            z10 = true;
        }
        this.f24828p = z10;
        sb2.append("($|(\\?(.)*)|(\\#(.)*))");
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "uriRegex.toString()");
        this.f24817e = kotlin.text.u.l2(string, ".*", "\\E.*\\Q", false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, d> M() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!A()) {
            return linkedHashMap;
        }
        Uri uri = Uri.parse(this.f24813a);
        for (String paramName : uri.getQueryParameterNames()) {
            StringBuilder sb2 = new StringBuilder();
            List<String> queryParams = uri.getQueryParameters(paramName);
            int iEnd = 0;
            if (!(queryParams.size() <= 1)) {
                throw new IllegalArgumentException(("Query parameter " + paramName + " must only be present once in " + this.f24813a + ". To support repeated query parameters, use an array type for your argument and the pattern provided in your URI will be used to parse each query parameter instance.").toString());
            }
            kotlin.jvm.internal.f0.o(queryParams, "queryParams");
            String queryParam = (String) CollectionsKt___CollectionsKt.B2(queryParams);
            if (queryParam == null) {
                this.f24821i = true;
                queryParam = paramName;
            }
            Matcher matcher = f24812s.matcher(queryParam);
            d dVar = new d();
            while (matcher.find()) {
                String strGroup = matcher.group(1);
                kotlin.jvm.internal.f0.n(strGroup, "null cannot be cast to non-null type kotlin.String");
                dVar.a(strGroup);
                kotlin.jvm.internal.f0.o(queryParam, "queryParam");
                String strSubstring = queryParam.substring(iEnd, matcher.start());
                kotlin.jvm.internal.f0.o(strSubstring, "substring(...)");
                sb2.append(Pattern.quote(strSubstring));
                sb2.append("(.+?)?");
                iEnd = matcher.end();
            }
            if (iEnd < queryParam.length()) {
                kotlin.jvm.internal.f0.o(queryParam, "queryParam");
                String strSubstring2 = queryParam.substring(iEnd);
                kotlin.jvm.internal.f0.o(strSubstring2, "substring(...)");
                sb2.append(Pattern.quote(strSubstring2));
            }
            String string = sb2.toString();
            kotlin.jvm.internal.f0.o(string, "argRegex.toString()");
            dVar.e(kotlin.text.u.l2(string, ".*", "\\E.*\\Q", false, 4, null));
            kotlin.jvm.internal.f0.o(paramName, "paramName");
            linkedHashMap.put(paramName, dVar);
        }
        return linkedHashMap;
    }

    private final void g(String str, List<String> list, StringBuilder sb2) {
        Matcher matcher = f24812s.matcher(str);
        int iEnd = 0;
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            kotlin.jvm.internal.f0.n(strGroup, "null cannot be cast to non-null type kotlin.String");
            list.add(strGroup);
            if (matcher.start() > iEnd) {
                String strSubstring = str.substring(iEnd, matcher.start());
                kotlin.jvm.internal.f0.o(strSubstring, "substring(...)");
                sb2.append(Pattern.quote(strSubstring));
            }
            sb2.append("([^/]*?|)");
            iEnd = matcher.end();
        }
        if (iEnd < str.length()) {
            String strSubstring2 = str.substring(iEnd);
            kotlin.jvm.internal.f0.o(strSubstring2, "substring(...)");
            sb2.append(Pattern.quote(strSubstring2));
        }
    }

    private final List<String> k() {
        return (List) this.f24823k.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Pair<List<String>, String> l() {
        return (Pair) this.f24822j.getValue();
    }

    private final Pattern m() {
        return (Pattern) this.f24825m.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String n() {
        return (String) this.f24824l.getValue();
    }

    private final boolean q(Matcher matcher, Bundle bundle, Map<String, p> map) {
        List<String> list = this.f24816d;
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
        int i10 = 0;
        for (Object obj : list) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            String str = (String) obj;
            String value = Uri.decode(matcher.group(i11));
            p pVar = map.get(str);
            try {
                kotlin.jvm.internal.f0.o(value, "value");
                G(bundle, str, value, pVar);
                arrayList.add(b2.f124493a);
                i10 = i11;
            } catch (IllegalArgumentException unused) {
                return false;
            }
        }
        return true;
    }

    private final boolean r(Uri uri, Bundle bundle, Map<String, p> map) {
        String query;
        for (Map.Entry<String, d> entry : x().entrySet()) {
            String key = entry.getKey();
            d value = entry.getValue();
            List<String> inputParams = uri.getQueryParameters(key);
            if (this.f24821i && (query = uri.getQuery()) != null && !kotlin.jvm.internal.f0.g(query, uri.toString())) {
                inputParams = kotlin.collections.s.k(query);
            }
            kotlin.jvm.internal.f0.o(inputParams, "inputParams");
            if (!J(inputParams, value, bundle, map)) {
                return false;
            }
        }
        return true;
    }

    private final void s(String str, Bundle bundle, Map<String, p> map) {
        Pattern patternM = m();
        Matcher matcher = patternM != null ? patternM.matcher(String.valueOf(str)) : null;
        if (matcher != null && matcher.matches()) {
            List<String> listK = k();
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listK, 10));
            int i10 = 0;
            for (Object obj : listK) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt__CollectionsKt.W();
                }
                String str2 = (String) obj;
                String value = Uri.decode(matcher.group(i11));
                p pVar = map.get(str2);
                try {
                    kotlin.jvm.internal.f0.o(value, "value");
                    G(bundle, str2, value, pVar);
                    arrayList.add(b2.f124493a);
                    i10 = i11;
                } catch (IllegalArgumentException unused) {
                    return;
                }
            }
        }
    }

    private final Pattern v() {
        return (Pattern) this.f24827o.getValue();
    }

    private final Pattern w() {
        return (Pattern) this.f24818f.getValue();
    }

    private final Map<String, d> x() {
        return (Map) this.f24820h.getValue();
    }

    public final boolean E(@dl.d Uri uri) {
        kotlin.jvm.internal.f0.p(uri, "uri");
        return F(new z(uri, null, null));
    }

    public final boolean F(@dl.d z deepLinkRequest) {
        kotlin.jvm.internal.f0.p(deepLinkRequest, "deepLinkRequest");
        if (D(deepLinkRequest.c()) && B(deepLinkRequest.a())) {
            return C(deepLinkRequest.b());
        }
        return false;
    }

    public final void N(boolean z10) {
        this.f24828p = z10;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj == null || !(obj instanceof NavDeepLink)) {
            return false;
        }
        NavDeepLink navDeepLink = (NavDeepLink) obj;
        return kotlin.jvm.internal.f0.g(this.f24813a, navDeepLink.f24813a) && kotlin.jvm.internal.f0.g(this.f24814b, navDeepLink.f24814b) && kotlin.jvm.internal.f0.g(this.f24815c, navDeepLink.f24815c);
    }

    public final int h(@dl.e Uri uri) {
        if (uri == null || this.f24813a == null) {
            return 0;
        }
        List<String> requestedPathSegments = uri.getPathSegments();
        List<String> uriPathSegments = Uri.parse(this.f24813a).getPathSegments();
        kotlin.jvm.internal.f0.o(requestedPathSegments, "requestedPathSegments");
        kotlin.jvm.internal.f0.o(uriPathSegments, "uriPathSegments");
        return CollectionsKt___CollectionsKt.d3(requestedPathSegments, uriPathSegments).size();
    }

    public int hashCode() {
        String str = this.f24813a;
        int iHashCode = ((str != null ? str.hashCode() : 0) + 0) * 31;
        String str2 = this.f24814b;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f24815c;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @dl.e
    public final String i() {
        return this.f24814b;
    }

    @dl.d
    public final List<String> j() {
        List<String> list = this.f24816d;
        Collection<d> collectionValues = x().values();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionValues.iterator();
        while (it.hasNext()) {
            kotlin.collections.x.n0(arrayList, ((d) it.next()).c());
        }
        return CollectionsKt___CollectionsKt.y4(CollectionsKt___CollectionsKt.y4(list, arrayList), k());
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle o(@dl.d Uri deepLink, @dl.d Map<String, p> arguments) {
        kotlin.jvm.internal.f0.p(deepLink, "deepLink");
        kotlin.jvm.internal.f0.p(arguments, "arguments");
        Pattern patternW = w();
        Matcher matcher = patternW != null ? patternW.matcher(deepLink.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return null;
        }
        final Bundle bundle = new Bundle();
        if (!q(matcher, bundle, arguments)) {
            return null;
        }
        if (A() && !r(deepLink, bundle, arguments)) {
            return null;
        }
        s(deepLink.getFragment(), bundle, arguments);
        if (!s.a(arguments, new yh.l<String, Boolean>() { // from class: androidx.navigation.NavDeepLink$getMatchingArguments$missingRequiredArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String argName) {
                kotlin.jvm.internal.f0.p(argName, "argName");
                return Boolean.valueOf(!bundle.containsKey(argName));
            }
        }).isEmpty()) {
            return null;
        }
        return bundle;
    }

    @dl.d
    public final Bundle p(@dl.e Uri uri, @dl.d Map<String, p> arguments) {
        kotlin.jvm.internal.f0.p(arguments, "arguments");
        Bundle bundle = new Bundle();
        if (uri == null) {
            return bundle;
        }
        Pattern patternW = w();
        Matcher matcher = patternW != null ? patternW.matcher(uri.toString()) : null;
        if (matcher == null || !matcher.matches()) {
            return bundle;
        }
        q(matcher, bundle, arguments);
        if (A()) {
            r(uri, bundle, arguments);
        }
        return bundle;
    }

    @dl.e
    public final String t() {
        return this.f24815c;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int u(@dl.d String mimeType) {
        kotlin.jvm.internal.f0.p(mimeType, "mimeType");
        if (this.f24815c != null) {
            Pattern patternV = v();
            kotlin.jvm.internal.f0.m(patternV);
            if (patternV.matcher(mimeType).matches()) {
                return new c(this.f24815c).compareTo(new c(mimeType));
            }
        }
        return -1;
    }

    @dl.e
    public final String y() {
        return this.f24813a;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean z() {
        return this.f24828p;
    }
}
