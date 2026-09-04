package androidx.navigation.dynamicfeatures;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.core.app.o0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavGraphNavigator;
import androidx.navigation.Navigator;
import androidx.navigation.j0;
import androidx.navigation.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.s;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: DynamicGraphNavigator.kt */
/* JADX INFO: loaded from: classes6.dex */
@Navigator.b(o0.F0)
public final class f extends NavGraphNavigator {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final q0 f24999d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final DynamicInstallManager f25000e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private yh.a<? extends NavDestination> f25001f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final List<a> f25002g;

    /* JADX INFO: compiled from: DynamicGraphNavigator.kt */
    @t0({"SMAP\nDynamicGraphNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DynamicGraphNavigator.kt\nandroidx/navigation/dynamicfeatures/DynamicGraphNavigator$DynamicNavGraph\n+ 2 Context.kt\nandroidx/core/content/ContextKt\n*L\n1#1,244:1\n55#2,6:245\n*S KotlinDebug\n*F\n+ 1 DynamicGraphNavigator.kt\nandroidx/navigation/dynamicfeatures/DynamicGraphNavigator$DynamicNavGraph\n*L\n216#1:245,6\n*E\n"})
    public static final class a extends NavGraph {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @dl.d
        public static final C0189a f25003w = new C0189a(null);

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @dl.d
        private final f f25004s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @dl.d
        private final q0 f25005t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @dl.e
        private String f25006u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private int f25007v;

        /* JADX INFO: renamed from: androidx.navigation.dynamicfeatures.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DynamicGraphNavigator.kt */
        public static final class C0189a {
            private C0189a() {
            }

            public /* synthetic */ C0189a(u uVar) {
                this();
            }

            @dl.d
            public final a a(@dl.d NavDestination destination) {
                f0.p(destination, "destination");
                NavGraph navGraphE = destination.E();
                a aVar = navGraphE instanceof a ? (a) navGraphE : null;
                if (aVar != null) {
                    return aVar;
                }
                throw new IllegalStateException("Dynamic destinations must be part of a DynamicNavGraph.\nYou can use DynamicNavHostFragment, which will take care of setting up the NavController for Dynamic destinations.\nIf you're not using Fragments, you must set up the NavigatorProvider manually.");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@dl.d f navGraphNavigator, @dl.d q0 navigatorProvider) {
            super(navGraphNavigator);
            f0.p(navGraphNavigator, "navGraphNavigator");
            f0.p(navigatorProvider, "navigatorProvider");
            this.f25004s = navGraphNavigator;
            this.f25005t = navigatorProvider;
        }

        @Override // androidx.navigation.NavGraph, androidx.navigation.NavDestination
        public void R(@dl.d Context context, @dl.d AttributeSet attrs) {
            f0.p(context, "context");
            f0.p(attrs, "attrs");
            super.R(context, attrs);
            int[] DynamicGraphNavigator = R.styleable.f24981b;
            f0.o(DynamicGraphNavigator, "DynamicGraphNavigator");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, DynamicGraphNavigator, 0, 0);
            this.f25006u = typedArrayObtainStyledAttributes.getString(R.styleable.DynamicGraphNavigator_moduleName);
            int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.DynamicGraphNavigator_progressDestination, 0);
            this.f25007v = resourceId;
            if (resourceId == 0) {
                this.f25004s.q().add(this);
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        @dl.e
        public final String T0() {
            return this.f25006u;
        }

        @dl.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final f U0() {
            return this.f25004s;
        }

        @dl.d
        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
        public final q0 V0() {
            return this.f25005t;
        }

        public final int W0() {
            return this.f25007v;
        }

        public final void X0(@dl.e String str) {
            this.f25006u = str;
        }

        public final void Z0(int i10) {
            this.f25007v = i10;
        }

        @Override // androidx.navigation.NavGraph, androidx.navigation.NavDestination
        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            if (super.equals(obj)) {
                a aVar = (a) obj;
                if (f0.g(this.f25006u, aVar.f25006u) && this.f25007v == aVar.f25007v) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.navigation.NavGraph, androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f25006u;
            return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f25007v;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@dl.d q0 navigatorProvider, @dl.d DynamicInstallManager installManager) {
        super(navigatorProvider);
        f0.p(navigatorProvider, "navigatorProvider");
        f0.p(installManager, "installManager");
        this.f24999d = navigatorProvider;
        this.f25000e = installManager;
        this.f25002g = new ArrayList();
    }

    private final void n(NavBackStackEntry navBackStackEntry, j0 j0Var, Navigator.a aVar) {
        String strT0;
        NavDestination navDestinationE = navBackStackEntry.e();
        e eVar = aVar instanceof e ? (e) aVar : null;
        if ((navDestinationE instanceof a) && (strT0 = ((a) navDestinationE).T0()) != null && this.f25000e.e(strT0)) {
            this.f25000e.f(navBackStackEntry, eVar, strT0);
            return;
        }
        List<NavBackStackEntry> listK = s.k(navBackStackEntry);
        if (eVar != null) {
            aVar = eVar.a();
        }
        super.e(listK, j0Var, aVar);
    }

    private final int r(a aVar) {
        yh.a<? extends NavDestination> aVar2 = this.f25001f;
        if (aVar2 == null) {
            throw new IllegalStateException("You must set a default progress destination using DynamicNavGraphNavigator.installDefaultProgressDestination or pass in an DynamicInstallMonitor in the DynamicExtras.\nAlternatively, when using NavHostFragment make sure to swap it with DynamicNavHostFragment. This will take care of setting the default progress destination for you.".toString());
        }
        NavDestination navDestinationInvoke = aVar2.invoke();
        aVar.k0(navDestinationInvoke);
        aVar.Z0(navDestinationInvoke.A());
        return navDestinationInvoke.A();
    }

    @Override // androidx.navigation.NavGraphNavigator, androidx.navigation.Navigator
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
        Iterator<a> it = this.f25002g.iterator();
        while (it.hasNext()) {
            r(it.next());
            it.remove();
        }
    }

    @Override // androidx.navigation.Navigator
    @dl.e
    public Bundle i() {
        return Bundle.EMPTY;
    }

    @Override // androidx.navigation.NavGraphNavigator
    @dl.d
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public a a() {
        return new a(this, this.f24999d);
    }

    @dl.e
    public final yh.a<NavDestination> p() {
        return this.f25001f;
    }

    @dl.d
    public final List<a> q() {
        return this.f25002g;
    }

    public final void s(@dl.d yh.a<? extends NavDestination> progressDestinationSupplier) {
        f0.p(progressDestinationSupplier, "progressDestinationSupplier");
        this.f25001f = progressDestinationSupplier;
    }

    public final void t(@dl.d a dynamicNavGraph, @dl.e Bundle bundle) {
        f0.p(dynamicNavGraph, "dynamicNavGraph");
        int iW0 = dynamicNavGraph.W0();
        if (iW0 == 0) {
            iW0 = r(dynamicNavGraph);
        }
        NavDestination navDestinationR0 = dynamicNavGraph.r0(iW0);
        if (navDestinationR0 == null) {
            throw new IllegalStateException("The progress destination id must be set and accessible to the module of this navigator.");
        }
        this.f24999d.f(navDestinationR0.D()).e(s.k(b().a(navDestinationR0, bundle)), null, null);
    }
}
