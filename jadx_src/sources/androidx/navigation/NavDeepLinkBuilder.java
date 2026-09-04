package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.core.app.q3;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: NavDeepLinkBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavDeepLinkBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavDeepLinkBuilder.kt\nandroidx/navigation/NavDeepLinkBuilder\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n1#2:399\n*E\n"})
public final class NavDeepLinkBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f24846a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final Activity f24847b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Intent f24848c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private NavGraph f24849d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final List<a> f24850e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private Bundle f24851f;

    /* JADX INFO: compiled from: NavDeepLinkBuilder.kt */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f24852a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.e
        private final Bundle f24853b;

        public a(int i10, @dl.e Bundle bundle) {
            this.f24852a = i10;
            this.f24853b = bundle;
        }

        @dl.e
        public final Bundle a() {
            return this.f24853b;
        }

        public final int b() {
            return this.f24852a;
        }
    }

    /* JADX INFO: compiled from: NavDeepLinkBuilder.kt */
    public static final class b extends q0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @dl.d
        private final Navigator<NavDestination> f24856d = new a();

        /* JADX INFO: compiled from: NavDeepLinkBuilder.kt */
        public static final class a extends Navigator<NavDestination> {
            a() {
            }

            @Override // androidx.navigation.Navigator
            public NavDestination a() {
                return new NavDestination("permissive");
            }

            @Override // androidx.navigation.Navigator
            public NavDestination d(NavDestination destination, Bundle bundle, j0 j0Var, Navigator.a aVar) {
                kotlin.jvm.internal.f0.p(destination, "destination");
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.navigation.Navigator
            public boolean k() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        }

        public b() {
            b(new NavGraphNavigator(this));
        }

        @Override // androidx.navigation.q0
        @dl.d
        public <T extends Navigator<? extends NavDestination>> T f(@dl.d String name) {
            kotlin.jvm.internal.f0.p(name, "name");
            try {
                return (T) super.f(name);
            } catch (IllegalStateException unused) {
                Navigator<NavDestination> navigator = this.f24856d;
                kotlin.jvm.internal.f0.n(navigator, "null cannot be cast to non-null type T of androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.getNavigator");
                return navigator;
            }
        }
    }

    public NavDeepLinkBuilder(@dl.d Context context) {
        Intent launchIntentForPackage;
        kotlin.jvm.internal.f0.p(context, "context");
        this.f24846a = context;
        Activity activity = (Activity) SequencesKt___SequencesKt.F0(SequencesKt___SequencesKt.p1(SequencesKt__SequencesKt.l(context, new yh.l<Context, Context>() { // from class: androidx.navigation.NavDeepLinkBuilder$activity$1
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Context invoke(Context it) {
                kotlin.jvm.internal.f0.p(it, "it");
                ContextWrapper contextWrapper = it instanceof ContextWrapper ? (ContextWrapper) it : null;
                if (contextWrapper != null) {
                    return contextWrapper.getBaseContext();
                }
                return null;
            }
        }), new yh.l<Context, Activity>() { // from class: androidx.navigation.NavDeepLinkBuilder$activity$2
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Activity invoke(Context it) {
                kotlin.jvm.internal.f0.p(it, "it");
                if (it instanceof Activity) {
                    return (Activity) it;
                }
                return null;
            }
        }));
        this.f24847b = activity;
        if (activity != null) {
            launchIntentForPackage = new Intent(context, activity.getClass());
        } else {
            launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
            if (launchIntentForPackage == null) {
                launchIntentForPackage = new Intent();
            }
        }
        launchIntentForPackage.addFlags(268468224);
        this.f24848c = launchIntentForPackage;
        this.f24850e = new ArrayList();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NavDeepLinkBuilder(@dl.d NavController navController) {
        this(navController.Q());
        kotlin.jvm.internal.f0.p(navController, "navController");
        this.f24849d = navController.W();
    }

    public static /* synthetic */ NavDeepLinkBuilder e(NavDeepLinkBuilder navDeepLinkBuilder, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.b(i10, bundle);
    }

    public static /* synthetic */ NavDeepLinkBuilder f(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.d(str, bundle);
    }

    private final void i() {
        ArrayList arrayList = new ArrayList();
        ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
        NavDestination navDestination = null;
        for (a aVar : this.f24850e) {
            int iB = aVar.b();
            Bundle bundleA = aVar.a();
            NavDestination navDestinationJ = j(iB);
            if (navDestinationJ == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.f24858l.b(this.f24846a, iB) + " cannot be found in the navigation graph " + this.f24849d);
            }
            for (int i10 : navDestinationJ.l(navDestination)) {
                arrayList.add(Integer.valueOf(i10));
                arrayList2.add(bundleA);
            }
            navDestination = navDestinationJ;
        }
        this.f24848c.putExtra(NavController.R, CollectionsKt___CollectionsKt.P5(arrayList));
        this.f24848c.putParcelableArrayListExtra(NavController.S, arrayList2);
    }

    private final NavDestination j(@androidx.annotation.d0 int i10) {
        kotlin.collections.i iVar = new kotlin.collections.i();
        NavGraph navGraph = this.f24849d;
        kotlin.jvm.internal.f0.m(navGraph);
        iVar.add(navGraph);
        while (!iVar.isEmpty()) {
            NavDestination navDestination = (NavDestination) iVar.removeFirst();
            if (navDestination.A() == i10) {
                return navDestination;
            }
            if (navDestination instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination).iterator();
                while (it.hasNext()) {
                    iVar.add(it.next());
                }
            }
        }
        return null;
    }

    public static /* synthetic */ NavDeepLinkBuilder r(NavDeepLinkBuilder navDeepLinkBuilder, int i10, Bundle bundle, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.o(i10, bundle);
    }

    public static /* synthetic */ NavDeepLinkBuilder s(NavDeepLinkBuilder navDeepLinkBuilder, String str, Bundle bundle, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bundle = null;
        }
        return navDeepLinkBuilder.q(str, bundle);
    }

    private final void v() {
        Iterator<a> it = this.f24850e.iterator();
        while (it.hasNext()) {
            int iB = it.next().b();
            if (j(iB) == null) {
                throw new IllegalArgumentException("Navigation destination " + NavDestination.f24858l.b(this.f24846a, iB) + " cannot be found in the navigation graph " + this.f24849d);
            }
        }
    }

    @dl.d
    @xh.i
    public final NavDeepLinkBuilder a(@androidx.annotation.d0 int i10) {
        return e(this, i10, null, 2, null);
    }

    @dl.d
    @xh.i
    public final NavDeepLinkBuilder b(@androidx.annotation.d0 int i10, @dl.e Bundle bundle) {
        this.f24850e.add(new a(i10, bundle));
        if (this.f24849d != null) {
            v();
        }
        return this;
    }

    @dl.d
    @xh.i
    public final NavDeepLinkBuilder c(@dl.d String route) {
        kotlin.jvm.internal.f0.p(route, "route");
        return f(this, route, null, 2, null);
    }

    @dl.d
    @xh.i
    public final NavDeepLinkBuilder d(@dl.d String route, @dl.e Bundle bundle) {
        kotlin.jvm.internal.f0.p(route, "route");
        this.f24850e.add(new a(NavDestination.f24858l.a(route).hashCode(), bundle));
        if (this.f24849d != null) {
            v();
        }
        return this;
    }

    @dl.d
    public final PendingIntent g() {
        int iB;
        Bundle bundle = this.f24851f;
        if (bundle != null) {
            Iterator<String> it = bundle.keySet().iterator();
            iB = 0;
            while (it.hasNext()) {
                Object obj = bundle.get(it.next());
                iB = (iB * 31) + (obj != null ? obj.hashCode() : 0);
            }
        } else {
            iB = 0;
        }
        for (a aVar : this.f24850e) {
            iB = (iB * 31) + aVar.b();
            Bundle bundleA = aVar.a();
            if (bundleA != null) {
                Iterator<String> it2 = bundleA.keySet().iterator();
                while (it2.hasNext()) {
                    Object obj2 = bundleA.get(it2.next());
                    iB = (iB * 31) + (obj2 != null ? obj2.hashCode() : 0);
                }
            }
        }
        PendingIntent pendingIntentS = h().s(iB, 201326592);
        kotlin.jvm.internal.f0.m(pendingIntentS);
        return pendingIntentS;
    }

    @dl.d
    public final q3 h() {
        if (this.f24849d == null) {
            throw new IllegalStateException("You must call setGraph() before constructing the deep link".toString());
        }
        if (!(!this.f24850e.isEmpty())) {
            throw new IllegalStateException("You must call setDestination() or addDestination() before constructing the deep link".toString());
        }
        i();
        q3 q3VarB = q3.i(this.f24846a).b(new Intent(this.f24848c));
        kotlin.jvm.internal.f0.o(q3VarB, "create(context).addNextI…rentStack(Intent(intent))");
        int iO = q3VarB.o();
        for (int i10 = 0; i10 < iO; i10++) {
            Intent intentJ = q3VarB.j(i10);
            if (intentJ != null) {
                intentJ.putExtra(NavController.V, this.f24848c);
            }
        }
        return q3VarB;
    }

    @dl.d
    public final NavDeepLinkBuilder k(@dl.e Bundle bundle) {
        this.f24851f = bundle;
        this.f24848c.putExtra(NavController.T, bundle);
        return this;
    }

    @dl.d
    public final NavDeepLinkBuilder l(@dl.d ComponentName componentName) {
        kotlin.jvm.internal.f0.p(componentName, "componentName");
        this.f24848c.setComponent(componentName);
        return this;
    }

    @dl.d
    public final NavDeepLinkBuilder m(@dl.d Class<? extends Activity> activityClass) {
        kotlin.jvm.internal.f0.p(activityClass, "activityClass");
        return l(new ComponentName(this.f24846a, activityClass));
    }

    @dl.d
    @xh.i
    public final NavDeepLinkBuilder n(@androidx.annotation.d0 int i10) {
        return r(this, i10, null, 2, null);
    }

    @dl.d
    @xh.i
    public final NavDeepLinkBuilder o(@androidx.annotation.d0 int i10, @dl.e Bundle bundle) {
        this.f24850e.clear();
        this.f24850e.add(new a(i10, bundle));
        if (this.f24849d != null) {
            v();
        }
        return this;
    }

    @dl.d
    @xh.i
    public final NavDeepLinkBuilder p(@dl.d String destRoute) {
        kotlin.jvm.internal.f0.p(destRoute, "destRoute");
        return s(this, destRoute, null, 2, null);
    }

    @dl.d
    @xh.i
    public final NavDeepLinkBuilder q(@dl.d String destRoute, @dl.e Bundle bundle) {
        kotlin.jvm.internal.f0.p(destRoute, "destRoute");
        this.f24850e.clear();
        this.f24850e.add(new a(NavDestination.f24858l.a(destRoute).hashCode(), bundle));
        if (this.f24849d != null) {
            v();
        }
        return this;
    }

    @dl.d
    public final NavDeepLinkBuilder t(@androidx.annotation.m0 int i10) {
        return u(new i0(this.f24846a, new b()).b(i10));
    }

    @dl.d
    public final NavDeepLinkBuilder u(@dl.d NavGraph navGraph) {
        kotlin.jvm.internal.f0.p(navGraph, "navGraph");
        this.f24849d = navGraph;
        v();
        return this;
    }
}
