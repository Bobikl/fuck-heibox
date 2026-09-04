package androidx.navigation.dynamicfeatures;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.core.app.o0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.Navigator;
import androidx.navigation.i0;
import androidx.navigation.j0;
import androidx.navigation.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;

/* JADX INFO: compiled from: DynamicIncludeGraphNavigator.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nDynamicIncludeGraphNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicIncludeGraphNavigator.kt\nandroidx/navigation/dynamicfeatures/DynamicIncludeGraphNavigator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,233:1\n1#2:234\n146#3:235\n*S KotlinDebug\n*F\n+ 1 DynamicIncludeGraphNavigator.kt\nandroidx/navigation/dynamicfeatures/DynamicIncludeGraphNavigator\n*L\n95#1:235\n*E\n"})
@Navigator.b("include-dynamic")
public final class g extends Navigator<a> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Context f25043c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final q0 f25044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final i0 f25045e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final DynamicInstallManager f25046f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final String f25047g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final List<a> f25048h;

    /* JADX INFO: compiled from: DynamicIncludeGraphNavigator.kt */
    @t0({"SMAP\nDynamicIncludeGraphNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicIncludeGraphNavigator.kt\nandroidx/navigation/dynamicfeatures/DynamicIncludeGraphNavigator$DynamicIncludeNavGraph\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,233:1\n55#2,6:234\n*S KotlinDebug\n*F\n+ 1 DynamicIncludeGraphNavigator.kt\nandroidx/navigation/dynamicfeatures/DynamicIncludeGraphNavigator$DynamicIncludeNavGraph\n*L\n185#1:234,6\n*E\n"})
    public static final class a extends NavDestination {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @dl.e
        private String f25049n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @dl.e
        private String f25050o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @dl.e
        private String f25051p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d Navigator<? extends NavDestination> navGraphNavigator) {
            super(navGraphNavigator);
            f0.p(navGraphNavigator, "navGraphNavigator");
        }

        @Override // androidx.navigation.NavDestination
        public void R(@dl.d Context context, @dl.d AttributeSet attrs) {
            f0.p(context, "context");
            f0.p(attrs, "attrs");
            super.R(context, attrs);
            int[] DynamicIncludeGraphNavigator = R.styleable.f24982c;
            f0.o(DynamicIncludeGraphNavigator, "DynamicIncludeGraphNavigator");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, DynamicIncludeGraphNavigator, 0, 0);
            String string = typedArrayObtainStyledAttributes.getString(R.styleable.DynamicIncludeGraphNavigator_moduleName);
            this.f25051p = string;
            if (!(!(string == null || string.length() == 0))) {
                throw new IllegalArgumentException("`moduleName` must be set for <include-dynamic>".toString());
            }
            String string2 = typedArrayObtainStyledAttributes.getString(R.styleable.DynamicIncludeGraphNavigator_graphPackage);
            if (string2 != null) {
                if (!(string2.length() > 0)) {
                    throw new IllegalArgumentException(("`graphPackage` cannot be empty for <include-dynamic>. You can omit the `graphPackage` attribute entirely to use the default of " + context.getPackageName() + lg.a.f131414g + this.f25051p + lg.a.f131414g).toString());
                }
            }
            this.f25050o = n0(context, string2);
            String string3 = typedArrayObtainStyledAttributes.getString(R.styleable.DynamicIncludeGraphNavigator_graphResName);
            this.f25049n = string3;
            if (!(!(string3 == null || string3.length() == 0))) {
                throw new IllegalArgumentException("`graphResName` must be set for <include-dynamic>".toString());
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            if (super.equals(obj)) {
                a aVar = (a) obj;
                if (f0.g(this.f25049n, aVar.f25049n) && f0.g(this.f25050o, aVar.f25050o) && f0.g(this.f25051p, aVar.f25051p)) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f25049n;
            int iHashCode2 = (iHashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f25050o;
            int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.f25051p;
            return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        @dl.e
        public final String i0() {
            return this.f25050o;
        }

        @dl.e
        public final String k0() {
            return this.f25049n;
        }

        @dl.e
        public final String l0() {
            return this.f25051p;
        }

        @dl.d
        public final String n0(@dl.d Context context, @dl.e String str) {
            f0.p(context, "context");
            if (str != null) {
                String packageName = context.getPackageName();
                f0.o(packageName, "context.packageName");
                String strL2 = u.l2(str, i0.f25150h, packageName, false, 4, null);
                if (strL2 != null) {
                    return strL2;
                }
            }
            return context.getPackageName() + lg.a.f131414g + this.f25051p;
        }

        public final void q0(@dl.e String str) {
            this.f25050o = str;
        }

        public final void r0(@dl.e String str) {
            this.f25049n = str;
        }

        public final void s0(@dl.e String str) {
            this.f25051p = str;
        }
    }

    public g(@dl.d Context context, @dl.d q0 navigatorProvider, @dl.d i0 navInflater, @dl.d DynamicInstallManager installManager) {
        f0.p(context, "context");
        f0.p(navigatorProvider, "navigatorProvider");
        f0.p(navInflater, "navInflater");
        f0.p(installManager, "installManager");
        this.f25043c = context;
        this.f25044d = navigatorProvider;
        this.f25045e = navInflater;
        this.f25046f = installManager;
        String packageName = context.getPackageName();
        f0.o(packageName, "context.packageName");
        this.f25047g = packageName;
        this.f25048h = new ArrayList();
    }

    private final void n(NavBackStackEntry navBackStackEntry, j0 j0Var, Navigator.a aVar) {
        NavDestination navDestinationE = navBackStackEntry.e();
        f0.n(navDestinationE, "null cannot be cast to non-null type androidx.navigation.dynamicfeatures.DynamicIncludeGraphNavigator.DynamicIncludeNavGraph");
        a aVar2 = (a) navDestinationE;
        e eVar = aVar instanceof e ? (e) aVar : null;
        String strL0 = aVar2.l0();
        if (strL0 != null && this.f25046f.e(strL0)) {
            this.f25046f.f(navBackStackEntry, eVar, strL0);
        } else {
            NavGraph navGraphO = o(aVar2);
            this.f25044d.f(navGraphO.D()).e(s.k(b().a(navGraphO, navBackStackEntry.c())), j0Var, aVar);
        }
    }

    private final NavGraph o(a aVar) {
        int identifier = this.f25043c.getResources().getIdentifier(aVar.k0(), o0.F0, aVar.i0());
        if (identifier == 0) {
            throw new Resources.NotFoundException(aVar.i0() + ":navigation/" + aVar.k0());
        }
        NavGraph navGraphB = this.f25045e.b(identifier);
        if (!(navGraphB.A() == 0 || navGraphB.A() == aVar.A())) {
            throw new IllegalStateException(("The included <navigation>'s id " + navGraphB.w() + " is different from the destination id " + aVar.w() + ". Either remove the <navigation> id or make them match.").toString());
        }
        navGraphB.Z(aVar.A());
        NavGraph navGraphE = aVar.E();
        if (navGraphE != null) {
            navGraphE.k0(navGraphB);
            this.f25048h.remove(aVar);
            return navGraphB;
        }
        throw new IllegalStateException("The include-dynamic destination with id " + aVar.w() + " does not have a parent. Make sure it is attached to a NavGraph.");
    }

    @Override // androidx.navigation.Navigator
    public void e(@dl.d List<NavBackStackEntry> entries, @dl.e j0 j0Var, @dl.e Navigator.a aVar) {
        f0.p(entries, "entries");
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            n(it.next(), j0Var, aVar);
        }
    }

    @Override // androidx.navigation.Navigator
    public void h(@dl.d Bundle savedState) {
        f0.p(savedState, "savedState");
        super.h(savedState);
        while (!this.f25048h.isEmpty()) {
            Iterator it = new ArrayList(this.f25048h).iterator();
            f0.o(it, "ArrayList(createdDestinations).iterator()");
            this.f25048h.clear();
            while (it.hasNext()) {
                a dynamicNavGraph = (a) it.next();
                String strL0 = dynamicNavGraph.l0();
                if (strL0 == null || !this.f25046f.e(strL0)) {
                    f0.o(dynamicNavGraph, "dynamicNavGraph");
                    o(dynamicNavGraph);
                }
            }
        }
    }

    @Override // androidx.navigation.Navigator
    @dl.e
    public Bundle i() {
        return Bundle.EMPTY;
    }

    @Override // androidx.navigation.Navigator
    @dl.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public a a() {
        a aVar = new a(this);
        this.f25048h.add(aVar);
        return aVar;
    }

    @dl.d
    public final String m() {
        return this.f25047g;
    }
}
