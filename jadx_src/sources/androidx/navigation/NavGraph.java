package androidx.navigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.collection.l2;
import androidx.collection.n2;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NoSuchElementException;
import kotlin.b2;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: NavGraph.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 6 SparseArray.kt\nandroidx/collection/SparseArrayKt\n*L\n1#1,677:1\n232#2,3:678\n1603#3,9:681\n1855#3:690\n1856#3:692\n1612#3:693\n1603#3,9:694\n1855#3:703\n1856#3:705\n1612#3:706\n1#4:691\n1#4:704\n1#4:707\n179#5,2:708\n1224#5,2:711\n22#6:710\n62#6,4:713\n*S KotlinDebug\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph\n*L\n61#1:678,3\n84#1:681,9\n84#1:690\n84#1:692\n84#1:693\n129#1:694,9\n129#1:703\n129#1:705\n129#1:706\n84#1:691\n129#1:704\n322#1:708,2\n561#1:711,2\n559#1:710\n566#1:713,4\n*E\n"})
public class NavGraph extends NavDestination implements Iterable<NavDestination>, zh.a {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    public static final Companion f24890r = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final l2<NavDestination> f24891n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f24892o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.e
    private String f24893p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private String f24894q;

    /* JADX INFO: compiled from: NavGraph.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.u uVar) {
            this();
        }

        @dl.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final kotlin.sequences.m<NavDestination> a(@dl.d NavGraph navGraph) {
            kotlin.jvm.internal.f0.p(navGraph, "<this>");
            return SequencesKt__SequencesKt.l(navGraph, new yh.l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavGraph$Companion$childHierarchy$1
                @Override // yh.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final NavDestination invoke(NavDestination it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    if (!(it instanceof NavGraph)) {
                        return null;
                    }
                    NavGraph navGraph2 = (NavGraph) it;
                    return navGraph2.r0(navGraph2.E0());
                }
            });
        }

        @dl.d
        @xh.m
        public final NavDestination b(@dl.d NavGraph navGraph) {
            kotlin.jvm.internal.f0.p(navGraph, "<this>");
            return (NavDestination) SequencesKt___SequencesKt.f1(a(navGraph));
        }
    }

    /* JADX INFO: compiled from: NavGraph.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavGraph.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraph.kt\nandroidx/navigation/NavGraph$iterator$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,677:1\n1#2:678\n*E\n"})
    public static final class a implements Iterator<NavDestination>, zh.d {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f24896b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f24897c;

        a() {
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public NavDestination next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f24897c = true;
            l2<NavDestination> l2VarA0 = NavGraph.this.A0();
            int i10 = this.f24896b + 1;
            this.f24896b = i10;
            return l2VarA0.y(i10);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f24896b + 1 < NavGraph.this.A0().x();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f24897c) {
                throw new IllegalStateException("You must call next() before you can remove an element".toString());
            }
            l2<NavDestination> l2VarA0 = NavGraph.this.A0();
            l2VarA0.y(this.f24896b).b0(null);
            l2VarA0.s(this.f24896b);
            this.f24896b--;
            this.f24897c = false;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraph(@dl.d Navigator<? extends NavGraph> navGraphNavigator) {
        super(navGraphNavigator);
        kotlin.jvm.internal.f0.p(navGraphNavigator, "navGraphNavigator");
        this.f24891n = new l2<>(0, 1, null);
    }

    private final void R0(int i10) {
        if (i10 != A()) {
            if (this.f24894q != null) {
                S0(null);
            }
            this.f24892o = i10;
            this.f24893p = null;
            return;
        }
        throw new IllegalArgumentException(("Start destination " + i10 + " cannot use the same id as the graph " + this).toString());
    }

    private final void S0(String str) {
        int iHashCode;
        if (str == null) {
            iHashCode = 0;
        } else {
            if (!(!kotlin.jvm.internal.f0.g(str, F()))) {
                throw new IllegalArgumentException(("Start destination " + str + " cannot use the same route as the graph " + this).toString());
            }
            if (!(!kotlin.text.u.V1(str))) {
                throw new IllegalArgumentException("Cannot have an empty start destination route".toString());
            }
            iHashCode = NavDestination.f24858l.a(str).hashCode();
        }
        this.f24892o = iHashCode;
        this.f24894q = str;
    }

    public static /* synthetic */ NavDestination w0(NavGraph navGraph, int i10, NavDestination navDestination, boolean z10, NavDestination navDestination2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findNodeComprehensive");
        }
        if ((i11 & 8) != 0) {
            navDestination2 = null;
        }
        return navGraph.v0(i10, navDestination, z10, navDestination2);
    }

    @dl.d
    @xh.m
    public static final NavDestination y0(@dl.d NavGraph navGraph) {
        return f24890r.b(navGraph);
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final l2<NavDestination> A0() {
        return this.f24891n;
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final String C0() {
        if (this.f24893p == null) {
            String strValueOf = this.f24894q;
            if (strValueOf == null) {
                strValueOf = String.valueOf(this.f24892o);
            }
            this.f24893p = strValueOf;
        }
        String str = this.f24893p;
        kotlin.jvm.internal.f0.m(str);
        return str;
    }

    @androidx.annotation.d0
    @kotlin.k(message = "Use getStartDestinationId instead.", replaceWith = @kotlin.s0(expression = "startDestinationId", imports = {}))
    public final int D0() {
        return E0();
    }

    @androidx.annotation.d0
    public final int E0() {
        return this.f24892o;
    }

    @dl.e
    public final String F0() {
        return this.f24894q;
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination.b G0(@dl.d z navDeepLinkRequest, boolean z10, boolean z11, @dl.d NavDestination lastVisited) {
        NavDestination.b bVar;
        kotlin.jvm.internal.f0.p(navDeepLinkRequest, "navDeepLinkRequest");
        kotlin.jvm.internal.f0.p(lastVisited, "lastVisited");
        NavDestination.b bVarN = super.N(navDeepLinkRequest);
        NavDestination.b bVarG0 = null;
        if (z10) {
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : this) {
                NavDestination.b bVarN2 = !kotlin.jvm.internal.f0.g(navDestination, lastVisited) ? navDestination.N(navDeepLinkRequest) : null;
                if (bVarN2 != null) {
                    arrayList.add(bVarN2);
                }
            }
            bVar = (NavDestination.b) CollectionsKt___CollectionsKt.K3(arrayList);
        } else {
            bVar = null;
        }
        NavGraph navGraphE = E();
        if (navGraphE != null && z11 && !kotlin.jvm.internal.f0.g(navGraphE, lastVisited)) {
            bVarG0 = navGraphE.G0(navDeepLinkRequest, z10, true, this);
        }
        return (NavDestination.b) CollectionsKt___CollectionsKt.K3(CollectionsKt__CollectionsKt.N(bVarN, bVar, bVarG0));
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination.b H0(@dl.d String route, boolean z10, boolean z11, @dl.d NavDestination lastVisited) {
        NavDestination.b bVar;
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.p(lastVisited, "lastVisited");
        NavDestination.b bVarQ = Q(route);
        NavDestination.b bVarH0 = null;
        if (z10) {
            ArrayList arrayList = new ArrayList();
            for (NavDestination navDestination : this) {
                NavDestination.b bVarH1 = kotlin.jvm.internal.f0.g(navDestination, lastVisited) ? null : navDestination instanceof NavGraph ? ((NavGraph) navDestination).H0(route, true, false, this) : navDestination.Q(route);
                if (bVarH1 != null) {
                    arrayList.add(bVarH1);
                }
            }
            bVar = (NavDestination.b) CollectionsKt___CollectionsKt.K3(arrayList);
        } else {
            bVar = null;
        }
        NavGraph navGraphE = E();
        if (navGraphE != null && z11 && !kotlin.jvm.internal.f0.g(navGraphE, lastVisited)) {
            bVarH0 = navGraphE.H0(route, z10, true, this);
        }
        return (NavDestination.b) CollectionsKt___CollectionsKt.K3(CollectionsKt__CollectionsKt.N(bVarQ, bVar, bVarH0));
    }

    public final void J0(@dl.d NavDestination node) {
        kotlin.jvm.internal.f0.p(node, "node");
        int iJ = this.f24891n.j(node.A());
        if (iJ >= 0) {
            this.f24891n.y(iJ).b0(null);
            this.f24891n.s(iJ);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final /* synthetic */ <T> void L0() {
        kotlin.jvm.internal.f0.y(6, androidx.exifinterface.media.a.f23244d5);
        kotlin.jvm.internal.k0.n("kotlinx.serialization.serializer.simple");
        Q0(kotlinx.serialization.t.i(null), new yh.l<NavDestination, String>() { // from class: androidx.navigation.NavGraph$setStartDestination$1
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(NavDestination startDestination) {
                kotlin.jvm.internal.f0.p(startDestination, "startDestination");
                String strF = startDestination.F();
                kotlin.jvm.internal.f0.m(strF);
                return strF;
            }
        });
    }

    @Override // androidx.navigation.NavDestination
    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public NavDestination.b N(@dl.d z navDeepLinkRequest) {
        kotlin.jvm.internal.f0.p(navDeepLinkRequest, "navDeepLinkRequest");
        return G0(navDeepLinkRequest, true, false, this);
    }

    public final void N0(int i10) {
        R0(i10);
    }

    public final <T> void O0(@dl.d final T startDestRoute) {
        kotlin.jvm.internal.f0.p(startDestRoute, "startDestRoute");
        Q0(kotlinx.serialization.t.g(kotlin.jvm.internal.n0.d(startDestRoute.getClass())), new yh.l<NavDestination, String>() { // from class: androidx.navigation.NavGraph$setStartDestination$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke(NavDestination startDestination) {
                kotlin.jvm.internal.f0.p(startDestination, "startDestination");
                Map<String, p> mapV = startDestination.v();
                LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.r0.j(mapV.size()));
                Iterator<T> it = mapV.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ((p) entry.getValue()).b());
                }
                return RouteSerializerKt.m(startDestRoute, linkedHashMap);
            }
        });
    }

    public final void P0(@dl.d String startDestRoute) {
        kotlin.jvm.internal.f0.p(startDestRoute, "startDestRoute");
        S0(startDestRoute);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final <T> void Q0(@dl.d kotlinx.serialization.g<T> serializer, @dl.d yh.l<? super NavDestination, String> parseRoute) {
        kotlin.jvm.internal.f0.p(serializer, "serializer");
        kotlin.jvm.internal.f0.p(parseRoute, "parseRoute");
        int iH = RouteSerializerKt.h(serializer);
        NavDestination navDestinationR0 = r0(iH);
        if (navDestinationR0 != null) {
            S0(parseRoute.invoke(navDestinationR0));
            this.f24892o = iH;
        } else {
            throw new IllegalStateException(("Cannot find startDestination " + serializer.a().j() + " from NavGraph. Ensure the starting NavDestination was added with route from KClass.").toString());
        }
    }

    @Override // androidx.navigation.NavDestination
    public void R(@dl.d Context context, @dl.d AttributeSet attrs) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(attrs, "attrs");
        super.R(context, attrs);
        TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, androidx.navigation.common.R.styleable.f24968d);
        kotlin.jvm.internal.f0.o(typedArrayObtainAttributes, "context.resources.obtain…leable.NavGraphNavigator)");
        R0(typedArrayObtainAttributes.getResourceId(androidx.navigation.common.R.styleable.NavGraphNavigator_startDestination, 0));
        this.f24893p = NavDestination.f24858l.b(context, this.f24892o);
        b2 b2Var = b2.f124493a;
        typedArrayObtainAttributes.recycle();
    }

    public final void clear() {
        Iterator<NavDestination> it = iterator();
        while (it.hasNext()) {
            it.next();
            it.remove();
        }
    }

    @Override // androidx.navigation.NavDestination
    public boolean equals(@dl.e Object obj) {
        boolean z10;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof NavGraph)) {
            return false;
        }
        if (super.equals(obj)) {
            NavGraph navGraph = (NavGraph) obj;
            if (this.f24891n.x() == navGraph.f24891n.x() && E0() == navGraph.E0()) {
                Iterator it = SequencesKt__SequencesKt.e(n2.k(this.f24891n)).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z10 = true;
                        break;
                    }
                    NavDestination navDestination = (NavDestination) it.next();
                    if (!kotlin.jvm.internal.f0.g(navDestination, navGraph.f24891n.g(navDestination.A()))) {
                        z10 = false;
                        break;
                    }
                }
                if (z10) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // androidx.navigation.NavDestination
    public int hashCode() {
        int iE0 = E0();
        l2<NavDestination> l2Var = this.f24891n;
        int iX = l2Var.x();
        for (int i10 = 0; i10 < iX; i10++) {
            iE0 = (((iE0 * 31) + l2Var.m(i10)) * 31) + l2Var.y(i10).hashCode();
        }
        return iE0;
    }

    public final void i0(@dl.d NavGraph other) {
        kotlin.jvm.internal.f0.p(other, "other");
        Iterator<NavDestination> it = other.iterator();
        while (it.hasNext()) {
            NavDestination next = it.next();
            it.remove();
            k0(next);
        }
    }

    @Override // java.lang.Iterable
    @dl.d
    public final Iterator<NavDestination> iterator() {
        return new a();
    }

    public final void k0(@dl.d NavDestination node) {
        kotlin.jvm.internal.f0.p(node, "node");
        int iA = node.A();
        String strF = node.F();
        if (!((iA == 0 && strF == null) ? false : true)) {
            throw new IllegalArgumentException("Destinations must have an id or route. Call setId(), setRoute(), or include an android:id or app:route in your navigation XML.".toString());
        }
        if (F() != null && !(!kotlin.jvm.internal.f0.g(strF, F()))) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same route as graph " + this).toString());
        }
        if (!(iA != A())) {
            throw new IllegalArgumentException(("Destination " + node + " cannot have the same id as graph " + this).toString());
        }
        NavDestination navDestinationG = this.f24891n.g(iA);
        if (navDestinationG == node) {
            return;
        }
        if (!(node.E() == null)) {
            throw new IllegalStateException("Destination already has a parent set. Call NavGraph.remove() to remove the previous parent.".toString());
        }
        if (navDestinationG != null) {
            navDestinationG.b0(null);
        }
        node.b0(this);
        this.f24891n.n(node.A(), node);
    }

    public final void l0(@dl.d Collection<? extends NavDestination> nodes) {
        kotlin.jvm.internal.f0.p(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            if (navDestination != null) {
                k0(navDestination);
            }
        }
    }

    public final void n0(@dl.d NavDestination... nodes) {
        kotlin.jvm.internal.f0.p(nodes, "nodes");
        for (NavDestination navDestination : nodes) {
            k0(navDestination);
        }
    }

    public final /* synthetic */ <T> NavDestination q0() {
        kotlin.jvm.internal.f0.y(6, androidx.exifinterface.media.a.f23244d5);
        kotlin.jvm.internal.k0.n("kotlinx.serialization.serializer.simple");
        return r0(RouteSerializerKt.h(kotlinx.serialization.t.i(null)));
    }

    @dl.e
    public final NavDestination r0(@androidx.annotation.d0 int i10) {
        return w0(this, i10, this, false, null, 8, null);
    }

    @dl.e
    public final <T> NavDestination s0(@dl.e T t10) {
        if (t10 != null) {
            return r0(RouteSerializerKt.h(kotlinx.serialization.t.g(kotlin.jvm.internal.n0.d(t10.getClass()))));
        }
        return null;
    }

    @dl.e
    public final NavDestination t0(@dl.e String str) {
        if (str == null || kotlin.text.u.V1(str)) {
            return null;
        }
        return u0(str, true);
    }

    @Override // androidx.navigation.NavDestination
    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        NavDestination navDestinationT0 = t0(this.f24894q);
        if (navDestinationT0 == null) {
            navDestinationT0 = r0(E0());
        }
        sb2.append(" startDestination=");
        if (navDestinationT0 == null) {
            String str = this.f24894q;
            if (str != null) {
                sb2.append(str);
            } else {
                String str2 = this.f24893p;
                if (str2 != null) {
                    sb2.append(str2);
                } else {
                    sb2.append("0x" + Integer.toHexString(this.f24892o));
                }
            }
        } else {
            sb2.append("{");
            sb2.append(navDestinationT0.toString());
            sb2.append(z5.g.f141884d);
        }
        String string = sb2.toString();
        kotlin.jvm.internal.f0.o(string, "sb.toString()");
        return string;
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination u0(@dl.d String route, boolean z10) {
        Object next;
        boolean z11;
        kotlin.jvm.internal.f0.p(route, "route");
        Iterator it = SequencesKt__SequencesKt.e(n2.k(this.f24891n)).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            NavDestination navDestination = (NavDestination) next;
            z11 = false;
            if (kotlin.text.u.M1(navDestination.F(), route, false, 2, null) || navDestination.Q(route) != null) {
                z11 = true;
            }
        } while (!z11);
        NavDestination navDestination2 = (NavDestination) next;
        if (navDestination2 != null) {
            return navDestination2;
        }
        if (!z10 || E() == null) {
            return null;
        }
        NavGraph navGraphE = E();
        kotlin.jvm.internal.f0.m(navGraphE);
        return navGraphE.t0(route);
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination v0(@androidx.annotation.d0 int i10, @dl.e NavDestination navDestination, boolean z10, @dl.e NavDestination navDestination2) {
        NavDestination navDestinationG = this.f24891n.g(i10);
        if (navDestination2 != null) {
            if (kotlin.jvm.internal.f0.g(navDestinationG, navDestination2) && kotlin.jvm.internal.f0.g(navDestinationG.E(), navDestination2.E())) {
                return navDestinationG;
            }
            navDestinationG = null;
        } else if (navDestinationG != null) {
            return navDestinationG;
        }
        if (z10) {
            Iterator it = SequencesKt__SequencesKt.e(n2.k(this.f24891n)).iterator();
            while (true) {
                if (!it.hasNext()) {
                    navDestinationG = null;
                    break;
                }
                NavDestination navDestination3 = (NavDestination) it.next();
                NavDestination navDestinationV0 = (!(navDestination3 instanceof NavGraph) || kotlin.jvm.internal.f0.g(navDestination3, navDestination)) ? null : ((NavGraph) navDestination3).v0(i10, this, true, navDestination2);
                if (navDestinationV0 != null) {
                    navDestinationG = navDestinationV0;
                    break;
                }
            }
        }
        if (navDestinationG != null) {
            return navDestinationG;
        }
        if (E() == null || kotlin.jvm.internal.f0.g(E(), navDestination)) {
            return null;
        }
        NavGraph navGraphE = E();
        kotlin.jvm.internal.f0.m(navGraphE);
        return navGraphE.v0(i10, this, z10, navDestination2);
    }

    @Override // androidx.navigation.NavDestination
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public String w() {
        return A() != 0 ? super.w() : "the root navigation";
    }
}
