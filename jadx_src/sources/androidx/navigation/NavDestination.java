package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.collection.l2;
import androidx.collection.n2;
import androidx.navigation.serialization.RouteSerializerKt;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.b2;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt__SequencesKt;

/* JADX INFO: compiled from: NavDestination.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Uri.kt\nandroidx/core/net/UriKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 7 Iterators.kt\nkotlin/collections/CollectionsKt__IteratorsKt\n*L\n1#1,859:1\n232#2,3:860\n1#3:863\n29#4:864\n1549#5:865\n1620#5,3:866\n1855#5,2:873\n1855#5,2:876\n1855#5,2:879\n1224#6,2:869\n1224#6,2:871\n32#7:875\n33#7:878\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination\n*L\n188#1:860,3\n380#1:864\n482#1:865\n482#1:866,3\n722#1:873,2\n730#1:876,2\n734#1:879,2\n703#1:869,2\n707#1:871,2\n727#1:875\n727#1:878\n*E\n"})
public class NavDestination {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    public static final Companion f24858l = new Companion(null);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private static final Map<String, Class<?>> f24859m = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f24860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private NavGraph f24861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private String f24862d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private CharSequence f24863e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final List<NavDeepLink> f24864f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final l2<k> f24865g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private Map<String, p> f24866h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f24867i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private String f24868j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private kotlin.z<NavDeepLink> f24869k;

    /* JADX INFO: compiled from: NavDestination.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @xh.m
        public static /* synthetic */ void d(NavDestination navDestination) {
        }

        @dl.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String a(@dl.e String str) {
            if (str == null) {
                return "";
            }
            return "android-app://androidx.navigation/" + str;
        }

        @dl.d
        @xh.m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final String b(@dl.d Context context, int i10) {
            String strValueOf;
            kotlin.jvm.internal.f0.p(context, "context");
            if (i10 <= 16777215) {
                return String.valueOf(i10);
            }
            try {
                strValueOf = context.getResources().getResourceName(i10);
            } catch (Resources.NotFoundException unused) {
                strValueOf = String.valueOf(i10);
            }
            kotlin.jvm.internal.f0.o(strValueOf, "try {\n                  …tring()\n                }");
            return strValueOf;
        }

        @dl.d
        public final kotlin.sequences.m<NavDestination> c(@dl.d NavDestination navDestination) {
            kotlin.jvm.internal.f0.p(navDestination, "<this>");
            return SequencesKt__SequencesKt.l(navDestination, new yh.l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavDestination$Companion$hierarchy$1
                @Override // yh.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final NavDestination invoke(NavDestination it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    return it.E();
                }
            });
        }

        @xh.m
        public final /* synthetic */ <T> boolean e(NavDestination navDestination) {
            kotlin.jvm.internal.f0.p(navDestination, "<this>");
            kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
            return f(navDestination, kotlin.jvm.internal.n0.d(Object.class));
        }

        @xh.m
        public final <T> boolean f(@dl.d NavDestination navDestination, @dl.d kotlin.reflect.d<T> route) {
            kotlin.jvm.internal.f0.p(navDestination, "<this>");
            kotlin.jvm.internal.f0.p(route, "route");
            return RouteSerializerKt.h(kotlinx.serialization.t.g(route)) == navDestination.A();
        }

        @dl.d
        @xh.m
        protected final <C> Class<? extends C> g(@dl.d Context context, @dl.d String name, @dl.d Class<? extends C> expectedClassType) {
            String str;
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(expectedClassType, "expectedClassType");
            if (name.charAt(0) == '.') {
                str = context.getPackageName() + name;
            } else {
                str = name;
            }
            Class<? extends C> cls = (Class) NavDestination.f24859m.get(str);
            if (cls == null) {
                try {
                    cls = (Class<? extends C>) Class.forName(str, true, context.getClassLoader());
                    NavDestination.f24859m.put(name, cls);
                } catch (ClassNotFoundException e10) {
                    throw new IllegalArgumentException(e10);
                }
            }
            kotlin.jvm.internal.f0.m(cls);
            if (expectedClassType.isAssignableFrom(cls)) {
                return cls;
            }
            throw new IllegalArgumentException((str + " must be a subclass of " + expectedClassType).toString());
        }

        @dl.d
        @xh.m
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final <C> Class<? extends C> h(@dl.d Context context, @dl.d String name, @dl.d Class<? extends C> expectedClassType) {
            kotlin.jvm.internal.f0.p(context, "context");
            kotlin.jvm.internal.f0.p(name, "name");
            kotlin.jvm.internal.f0.p(expectedClassType, "expectedClassType");
            return NavDestination.T(context, name, expectedClassType);
        }
    }

    /* JADX INFO: compiled from: NavDestination.kt */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @mh.c(AnnotationRetention.BINARY)
    @Retention(RetentionPolicy.CLASS)
    @mh.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    public @interface a {
        Class<?> value();
    }

    /* JADX INFO: compiled from: NavDestination.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavDestination.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,859:1\n1855#2,2:860\n*S KotlinDebug\n*F\n+ 1 NavDestination.kt\nandroidx/navigation/NavDestination$DeepLinkMatch\n*L\n128#1:860,2\n*E\n"})
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final class b implements Comparable<b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final NavDestination f24872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @dl.e
        private final Bundle f24873c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f24874d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f24875e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final boolean f24876f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f24877g;

        public b(@dl.d NavDestination destination, @dl.e Bundle bundle, boolean z10, int i10, boolean z11, int i11) {
            kotlin.jvm.internal.f0.p(destination, "destination");
            this.f24872b = destination;
            this.f24873c = bundle;
            this.f24874d = z10;
            this.f24875e = i10;
            this.f24876f = z11;
            this.f24877g = i11;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(@dl.d b other) {
            kotlin.jvm.internal.f0.p(other, "other");
            boolean z10 = this.f24874d;
            if (z10 && !other.f24874d) {
                return 1;
            }
            if (!z10 && other.f24874d) {
                return -1;
            }
            int i10 = this.f24875e - other.f24875e;
            if (i10 > 0) {
                return 1;
            }
            if (i10 < 0) {
                return -1;
            }
            Bundle bundle = this.f24873c;
            if (bundle != null && other.f24873c == null) {
                return 1;
            }
            if (bundle == null && other.f24873c != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size();
                Bundle bundle2 = other.f24873c;
                kotlin.jvm.internal.f0.m(bundle2);
                int size2 = size - bundle2.size();
                if (size2 > 0) {
                    return 1;
                }
                if (size2 < 0) {
                    return -1;
                }
            }
            boolean z11 = this.f24876f;
            if (z11 && !other.f24876f) {
                return 1;
            }
            if (z11 || !other.f24876f) {
                return this.f24877g - other.f24877g;
            }
            return -1;
        }

        @dl.d
        public final NavDestination b() {
            return this.f24872b;
        }

        @dl.e
        public final Bundle c() {
            return this.f24873c;
        }

        public final boolean d(@dl.e Bundle bundle) {
            Bundle bundle2;
            boolean z10;
            Object objB;
            if (bundle == null || (bundle2 = this.f24873c) == null) {
                return false;
            }
            Set<String> setKeySet = bundle2.keySet();
            kotlin.jvm.internal.f0.o(setKeySet, "matchingArgs.keySet()");
            Iterator<T> it = setKeySet.iterator();
            do {
                z10 = true;
                if (!it.hasNext()) {
                    return true;
                }
                String key = (String) it.next();
                if (!bundle.containsKey(key)) {
                    return false;
                }
                p pVar = (p) this.f24872b.f24866h.get(key);
                Object objB2 = null;
                m0<Object> m0VarB = pVar != null ? pVar.b() : null;
                if (m0VarB != null) {
                    Bundle bundle3 = this.f24873c;
                    kotlin.jvm.internal.f0.o(key, "key");
                    objB = m0VarB.b(bundle3, key);
                } else {
                    objB = null;
                }
                if (m0VarB != null) {
                    kotlin.jvm.internal.f0.o(key, "key");
                    objB2 = m0VarB.b(bundle, key);
                }
                if (m0VarB == null || m0VarB.m(objB, objB2)) {
                    z10 = false;
                }
            } while (!z10);
            return false;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public NavDestination(@dl.d Navigator<? extends NavDestination> navigator) {
        this(q0.f25231b.a(navigator.getClass()));
        kotlin.jvm.internal.f0.p(navigator, "navigator");
    }

    public NavDestination(@dl.d String navigatorName) {
        kotlin.jvm.internal.f0.p(navigatorName, "navigatorName");
        this.f24860b = navigatorName;
        this.f24864f = new ArrayList();
        this.f24865g = new l2<>(0, 1, null);
        this.f24866h = new LinkedHashMap();
    }

    private final boolean I(NavDeepLink navDeepLink, Uri uri, Map<String, p> map) {
        final Bundle bundleP = navDeepLink.p(uri, map);
        return s.a(map, new yh.l<String, Boolean>() { // from class: androidx.navigation.NavDestination$hasRequiredArguments$missingRequiredArguments$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String key) {
                kotlin.jvm.internal.f0.p(key, "key");
                return Boolean.valueOf(!bundleP.containsKey(key));
            }
        }).isEmpty();
    }

    @xh.m
    public static final <T> boolean J(@dl.d NavDestination navDestination, @dl.d kotlin.reflect.d<T> dVar) {
        return f24858l.f(navDestination, dVar);
    }

    @dl.d
    @xh.m
    protected static final <C> Class<? extends C> T(@dl.d Context context, @dl.d String str, @dl.d Class<? extends C> cls) {
        return f24858l.g(context, str, cls);
    }

    @dl.d
    @xh.m
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final <C> Class<? extends C> U(@dl.d Context context, @dl.d String str, @dl.d Class<? extends C> cls) {
        return f24858l.h(context, str, cls);
    }

    public static /* synthetic */ int[] o(NavDestination navDestination, NavDestination navDestination2, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: buildDeepLinkIds");
        }
        if ((i10 & 1) != 0) {
            navDestination2 = null;
        }
        return navDestination.l(navDestination2);
    }

    @dl.d
    @xh.m
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String x(@dl.d Context context, int i10) {
        return f24858l.b(context, i10);
    }

    @dl.d
    public static final kotlin.sequences.m<NavDestination> y(@dl.d NavDestination navDestination) {
        return f24858l.c(navDestination);
    }

    @androidx.annotation.d0
    public final int A() {
        return this.f24867i;
    }

    @dl.e
    public final CharSequence B() {
        return this.f24863e;
    }

    @dl.d
    public final String D() {
        return this.f24860b;
    }

    @dl.e
    public final NavGraph E() {
        return this.f24861c;
    }

    @dl.e
    public final String F() {
        return this.f24868j;
    }

    public boolean G(@dl.d Uri deepLink) {
        kotlin.jvm.internal.f0.p(deepLink, "deepLink");
        return H(new z(deepLink, null, null));
    }

    public boolean H(@dl.d z deepLinkRequest) {
        kotlin.jvm.internal.f0.p(deepLinkRequest, "deepLinkRequest");
        return N(deepLinkRequest) != null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final boolean L(@dl.d String route, @dl.e Bundle bundle) {
        kotlin.jvm.internal.f0.p(route, "route");
        if (kotlin.jvm.internal.f0.g(this.f24868j, route)) {
            return true;
        }
        b bVarQ = Q(route);
        if (kotlin.jvm.internal.f0.g(this, bVarQ != null ? bVarQ.b() : null)) {
            return bVarQ.d(bundle);
        }
        return false;
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public b N(@dl.d z navDeepLinkRequest) {
        kotlin.jvm.internal.f0.p(navDeepLinkRequest, "navDeepLinkRequest");
        if (this.f24864f.isEmpty()) {
            return null;
        }
        b bVar = null;
        for (NavDeepLink navDeepLink : this.f24864f) {
            Uri uriC = navDeepLinkRequest.c();
            Bundle bundleO = uriC != null ? navDeepLink.o(uriC, this.f24866h) : null;
            int iH = navDeepLink.h(uriC);
            String strA = navDeepLinkRequest.a();
            boolean z10 = strA != null && kotlin.jvm.internal.f0.g(strA, navDeepLink.i());
            String strB = navDeepLinkRequest.b();
            int iU = strB != null ? navDeepLink.u(strB) : -1;
            if (bundleO == null) {
                if (z10 || iU > -1) {
                    if (I(navDeepLink, uriC, this.f24866h)) {
                    }
                }
            }
            b bVar2 = new b(this, bundleO, navDeepLink.z(), iH, z10, iU);
            if (bVar == null || bVar2.compareTo(bVar) > 0) {
                bVar = bVar2;
            }
        }
        return bVar;
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final b Q(@dl.d String route) {
        NavDeepLink value;
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.z<NavDeepLink> zVar = this.f24869k;
        if (zVar == null || (value = zVar.getValue()) == null) {
            return null;
        }
        Uri uri = Uri.parse(f24858l.a(route));
        kotlin.jvm.internal.f0.h(uri, "Uri.parse(this)");
        Bundle bundleO = value.o(uri, this.f24866h);
        if (bundleO == null) {
            return null;
        }
        return new b(this, bundleO, value.z(), value.h(uri), false, -1);
    }

    @androidx.annotation.i
    public void R(@dl.d Context context, @dl.d AttributeSet attrs) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(attrs, "attrs");
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R.styleable.f24969e);
        kotlin.jvm.internal.f0.o(typedArrayObtainAttributes, "context.resources.obtain…s, R.styleable.Navigator)");
        d0(typedArrayObtainAttributes.getString(androidx.navigation.common.R.styleable.Navigator_route));
        int i10 = androidx.navigation.common.R.styleable.Navigator_android_id;
        if (typedArrayObtainAttributes.hasValue(i10)) {
            Z(typedArrayObtainAttributes.getResourceId(i10, 0));
            this.f24862d = f24858l.b(context, this.f24867i);
        }
        this.f24863e = typedArrayObtainAttributes.getText(androidx.navigation.common.R.styleable.Navigator_android_label);
        b2 b2Var = b2.f124493a;
        typedArrayObtainAttributes.recycle();
    }

    public final void V(@androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11) {
        W(i10, new k(i11, null, null, 6, null));
    }

    public final void W(@androidx.annotation.d0 int i10, @dl.d k action) {
        kotlin.jvm.internal.f0.p(action, "action");
        if (h0()) {
            if (!(i10 != 0)) {
                throw new IllegalArgumentException("Cannot have an action with actionId 0".toString());
            }
            this.f24865g.n(i10, action);
        } else {
            throw new UnsupportedOperationException("Cannot add action " + i10 + " to " + this + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
        }
    }

    public final void X(@androidx.annotation.d0 int i10) {
        this.f24865g.q(i10);
    }

    public final void Y(@dl.d String argumentName) {
        kotlin.jvm.internal.f0.p(argumentName, "argumentName");
        this.f24866h.remove(argumentName);
    }

    public final void Z(@androidx.annotation.d0 int i10) {
        this.f24867i = i10;
        this.f24862d = null;
    }

    public final void a0(@dl.e CharSequence charSequence) {
        this.f24863e = charSequence;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void b0(@dl.e NavGraph navGraph) {
        this.f24861c = navGraph;
    }

    public final void d0(@dl.e String str) {
        if (str == null) {
            Z(0);
        } else {
            if (!(!kotlin.text.u.V1(str))) {
                throw new IllegalArgumentException("Cannot have an empty route".toString());
            }
            final String strA = f24858l.a(str);
            final NavDeepLink navDeepLinkA = new NavDeepLink.a().g(strA).a();
            List<String> listA = s.a(this.f24866h, new yh.l<String, Boolean>() { // from class: androidx.navigation.NavDestination$route$missingRequiredArguments$1
                {
                    super(1);
                }

                @Override // yh.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(String key) {
                    kotlin.jvm.internal.f0.p(key, "key");
                    return Boolean.valueOf(!navDeepLinkA.j().contains(key));
                }
            });
            if (!listA.isEmpty()) {
                throw new IllegalArgumentException(("Cannot set route \"" + str + "\" for destination " + this + ". Following required arguments are missing: " + listA).toString());
            }
            this.f24869k = kotlin.b0.c(new yh.a<NavDeepLink>() { // from class: androidx.navigation.NavDestination$route$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // yh.a
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final NavDeepLink invoke() {
                    return new NavDeepLink.a().g(strA).a();
                }
            });
            Z(strA.hashCode());
        }
        this.f24868j = str;
    }

    public final void e(@dl.d String argumentName, @dl.d p argument) {
        kotlin.jvm.internal.f0.p(argumentName, "argumentName");
        kotlin.jvm.internal.f0.p(argument, "argument");
        this.f24866h.put(argumentName, argument);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ad  */
    public boolean equals(@dl.e Object obj) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavDestination)) {
            return false;
        }
        NavDestination navDestination = (NavDestination) obj;
        boolean zG = kotlin.jvm.internal.f0.g(this.f24864f, navDestination.f24864f);
        if (this.f24865g.x() == navDestination.f24865g.x()) {
            Iterator it = SequencesKt__SequencesKt.e(n2.g(this.f24865g)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    z13 = true;
                    break;
                }
                int iIntValue = ((Number) it.next()).intValue();
                if (!kotlin.jvm.internal.f0.g(this.f24865g.g(iIntValue), navDestination.f24865g.g(iIntValue))) {
                    z13 = false;
                    break;
                }
            }
            if (z13) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        if (this.f24866h.size() == navDestination.f24866h.size()) {
            Iterator it2 = kotlin.collections.u0.T0(this.f24866h).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    z12 = true;
                    break;
                }
                Map.Entry entry = (Map.Entry) it2.next();
                if (!(navDestination.f24866h.containsKey(entry.getKey()) && kotlin.jvm.internal.f0.g(navDestination.f24866h.get(entry.getKey()), entry.getValue()))) {
                    z12 = false;
                    break;
                }
            }
            if (z12) {
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        return this.f24867i == navDestination.f24867i && kotlin.jvm.internal.f0.g(this.f24868j, navDestination.f24868j) && zG && z10 && z11;
    }

    public final void g(@dl.d final NavDeepLink navDeepLink) {
        kotlin.jvm.internal.f0.p(navDeepLink, "navDeepLink");
        List<String> listA = s.a(this.f24866h, new yh.l<String, Boolean>() { // from class: androidx.navigation.NavDestination$addDeepLink$missingRequiredArguments$1
            {
                super(1);
            }

            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String key) {
                kotlin.jvm.internal.f0.p(key, "key");
                return Boolean.valueOf(!navDeepLink.j().contains(key));
            }
        });
        if (listA.isEmpty()) {
            this.f24864f.add(navDeepLink);
            return;
        }
        throw new IllegalArgumentException(("Deep link " + navDeepLink.y() + " can't be used to open destination " + this + ".\nFollowing required arguments are missing: " + listA).toString());
    }

    public final void h(@dl.d String uriPattern) {
        kotlin.jvm.internal.f0.p(uriPattern, "uriPattern");
        g(new NavDeepLink.a().g(uriPattern).a());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean h0() {
        return true;
    }

    public int hashCode() {
        Set<String> setKeySet;
        int i10 = this.f24867i * 31;
        String str = this.f24868j;
        int iHashCode = i10 + (str != null ? str.hashCode() : 0);
        for (NavDeepLink navDeepLink : this.f24864f) {
            int i11 = iHashCode * 31;
            String strY = navDeepLink.y();
            int iHashCode2 = (i11 + (strY != null ? strY.hashCode() : 0)) * 31;
            String strI = navDeepLink.i();
            int iHashCode3 = (iHashCode2 + (strI != null ? strI.hashCode() : 0)) * 31;
            String strT = navDeepLink.t();
            iHashCode = iHashCode3 + (strT != null ? strT.hashCode() : 0);
        }
        Iterator itK = n2.k(this.f24865g);
        while (itK.hasNext()) {
            k kVar = (k) itK.next();
            int iB = ((iHashCode * 31) + kVar.b()) * 31;
            j0 j0VarC = kVar.c();
            iHashCode = iB + (j0VarC != null ? j0VarC.hashCode() : 0);
            Bundle bundleA = kVar.a();
            if (bundleA != null && (setKeySet = bundleA.keySet()) != null) {
                kotlin.jvm.internal.f0.o(setKeySet, "keySet()");
                for (String str2 : setKeySet) {
                    int i12 = iHashCode * 31;
                    Bundle bundleA2 = kVar.a();
                    kotlin.jvm.internal.f0.m(bundleA2);
                    Object obj = bundleA2.get(str2);
                    iHashCode = i12 + (obj != null ? obj.hashCode() : 0);
                }
            }
        }
        for (String str3 : this.f24866h.keySet()) {
            int iHashCode4 = ((iHashCode * 31) + str3.hashCode()) * 31;
            p pVar = this.f24866h.get(str3);
            iHashCode = iHashCode4 + (pVar != null ? pVar.hashCode() : 0);
        }
        return iHashCode;
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Bundle i(@dl.e Bundle bundle) {
        if (bundle == null && this.f24866h.isEmpty()) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, p> entry : this.f24866h.entrySet()) {
            entry.getValue().f(entry.getKey(), bundle2);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            for (Map.Entry<String, p> entry2 : this.f24866h.entrySet()) {
                String key = entry2.getKey();
                p value = entry2.getValue();
                if (!value.d() && !value.g(key, bundle2)) {
                    throw new IllegalArgumentException(("Wrong argument type for '" + key + "' in argument bundle. " + value.b().c() + " expected.").toString());
                }
            }
        }
        return bundle2;
    }

    @dl.d
    @xh.i
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int[] j() {
        return o(this, null, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    @dl.d
    @xh.i
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final int[] l(@dl.e NavDestination navDestination) {
        kotlin.collections.i iVar = new kotlin.collections.i();
        NavDestination navDestination2 = this;
        while (true) {
            kotlin.jvm.internal.f0.m(navDestination2);
            NavGraph navGraph = navDestination2.f24861c;
            if ((navDestination != null ? navDestination.f24861c : null) != null) {
                NavGraph navGraph2 = navDestination.f24861c;
                kotlin.jvm.internal.f0.m(navGraph2);
                if (navGraph2.r0(navDestination2.f24867i) != navDestination2) {
                    if (navGraph != null || navGraph.E0() != navDestination2.f24867i) {
                        iVar.addFirst(navDestination2);
                    }
                    if (!kotlin.jvm.internal.f0.g(navGraph, navDestination) || navGraph == null) {
                        break;
                    }
                    navDestination2 = navGraph;
                } else {
                    iVar.addFirst(navDestination2);
                    break;
                }
            } else {
                if (navGraph != null) {
                    iVar.addFirst(navDestination2);
                } else {
                    iVar.addFirst(navDestination2);
                }
                if (!kotlin.jvm.internal.f0.g(navGraph, navDestination)) {
                    break;
                }
                navDestination2 = navGraph;
            }
        }
        List listQ5 = CollectionsKt___CollectionsKt.Q5(iVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listQ5, 10));
        Iterator it = listQ5.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(((NavDestination) it.next()).f24867i));
        }
        return CollectionsKt___CollectionsKt.P5(arrayList);
    }

    @dl.e
    public final String s(@dl.d Context context, @dl.e Bundle bundle) {
        p pVar;
        kotlin.jvm.internal.f0.p(context, "context");
        CharSequence charSequence = this.f24863e;
        if (charSequence == null) {
            return null;
        }
        Matcher matcher = Pattern.compile("\\{(.+?)\\}").matcher(charSequence);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String strGroup = matcher.group(1);
            if (bundle == null || !bundle.containsKey(strGroup)) {
                throw new IllegalArgumentException("Could not find \"" + strGroup + "\" in " + bundle + " to fill label \"" + ((Object) charSequence) + kotlin.text.y.f128593b);
            }
            matcher.appendReplacement(stringBuffer, "");
            if (kotlin.jvm.internal.f0.g((strGroup == null || (pVar = this.f24866h.get(strGroup)) == null) ? null : pVar.b(), m0.f25186e)) {
                String string = context.getString(bundle.getInt(strGroup));
                kotlin.jvm.internal.f0.o(string, "context.getString(bundle.getInt(argName))");
                stringBuffer.append(string);
            } else {
                stringBuffer.append(String.valueOf(bundle.get(strGroup)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append("(");
        String str = this.f24862d;
        if (str == null) {
            sb2.append("0x");
            sb2.append(Integer.toHexString(this.f24867i));
        } else {
            sb2.append(str);
        }
        sb2.append(")");
        String str2 = this.f24868j;
        if (!(str2 == null || kotlin.text.u.V1(str2))) {
            sb2.append(" route=");
            sb2.append(this.f24868j);
        }
        if (this.f24863e != null) {
            sb2.append(" label=");
            sb2.append(this.f24863e);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "sb.toString()");
        return string;
    }

    @dl.e
    public final k u(@androidx.annotation.d0 int i10) {
        k kVarG = this.f24865g.i() ? null : this.f24865g.g(i10);
        if (kVarG != null) {
            return kVarG;
        }
        NavGraph navGraph = this.f24861c;
        if (navGraph != null) {
            return navGraph.u(i10);
        }
        return null;
    }

    @dl.d
    public final Map<String, p> v() {
        return kotlin.collections.s0.D0(this.f24866h);
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String w() {
        String str = this.f24862d;
        return str == null ? String.valueOf(this.f24867i) : str;
    }
}
