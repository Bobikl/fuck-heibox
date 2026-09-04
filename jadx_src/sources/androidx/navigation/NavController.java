package androidx.navigation;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.activity.OnBackPressedDispatcher;
import androidx.annotation.RestrictTo;
import androidx.core.app.q3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b1;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.Ref;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: compiled from: NavController.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n+ 2 _Sequences.kt\nkotlin/sequences/SequencesKt___SequencesKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 Uri.kt\nandroidx/core/net/UriKt\n+ 8 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,2927:1\n537#1,10:3077\n179#2,2:2928\n1313#2,2:2938\n1313#2,2:2940\n179#2,2:3075\n1#3:2930\n146#4:2931\n533#5,6:2932\n1855#5,2:2942\n1855#5,2:2944\n1855#5,2:2946\n1855#5,2:2948\n1864#5,3:2950\n1774#5,4:2953\n1855#5:2957\n766#5:2958\n857#5,2:2959\n1856#5:2961\n766#5:2962\n857#5,2:2963\n766#5:2965\n857#5,2:2966\n1855#5,2:2968\n1855#5:2970\n1789#5,3:2971\n1856#5:2974\n819#5:2982\n847#5,2:2983\n1855#5:2985\n1856#5:2993\n1238#5,4:2996\n1855#5,2:3000\n1855#5,2:3002\n378#5,7:3004\n1549#5:3011\n1620#5,3:3012\n1855#5,2:3015\n1855#5,2:3017\n819#5:3019\n847#5,2:3020\n1855#5,2:3022\n1855#5,2:3024\n533#5,6:3026\n533#5,6:3032\n533#5,6:3038\n1855#5,2:3044\n1855#5,2:3046\n1864#5,3:3049\n1855#5,2:3055\n533#5,6:3057\n533#5,6:3063\n533#5,6:3069\n372#6,7:2975\n372#6,7:2986\n453#6:2994\n403#6:2995\n29#7:3048\n13404#8,3:3052\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController\n*L\n-1#1:3077,10\n86#1:2928,2\n724#1:2938,2\n745#1:2940,2\n2810#1:3075,2\n169#1:2931\n662#1:2932,6\n902#1:2942,2\n905#1:2944,2\n911#1:2946,2\n913#1:2948,2\n992#1:2950,3\n1054#1:2953,4\n1198#1:2957\n1200#1:2958\n1200#1:2959,2\n1198#1:2961\n1208#1:2962\n1208#1:2963,2\n1211#1:2965\n1211#1:2966,2\n1282#1:2968,2\n1296#1:2970\n1300#1:2971,3\n1296#1:2974\n1359#1:2982\n1359#1:2983,2\n1360#1:2985\n1360#1:2993\n1711#1:2996,4\n1991#1:3000,2\n2054#1:3002,2\n2064#1:3004,7\n2073#1:3011\n2073#1:3012,3\n2090#1:3015,2\n2100#1:3017,2\n2167#1:3019\n2167#1:3020,2\n2171#1:3022,2\n2215#1:3024,2\n2257#1:3026,6\n2289#1:3032,6\n2318#1:3038,6\n2332#1:3044,2\n2348#1:3046,2\n2563#1:3049,3\n2604#1:3055,2\n2704#1:3057,6\n2725#1:3063,6\n2751#1:3069,6\n1346#1:2975,7\n1362#1:2986,7\n1711#1:2994\n1711#1:2995\n2441#1:3048\n2601#1:3052,3\n*E\n"})
public class NavController {

    @dl.d
    private static final String J = "NavController";

    @dl.d
    private static final String K = "android-support-nav:controller:navigatorState";

    @dl.d
    private static final String L = "android-support-nav:controller:navigatorState:names";

    @dl.d
    private static final String M = "android-support-nav:controller:backStack";

    @dl.d
    private static final String N = "android-support-nav:controller:backStackDestIds";

    @dl.d
    private static final String O = "android-support-nav:controller:backStackIds";

    @dl.d
    private static final String P = "android-support-nav:controller:backStackStates";

    @dl.d
    private static final String Q = "android-support-nav:controller:backStackStates:";

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String R = "android-support-nav:controller:deepLinkIds";

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String S = "android-support-nav:controller:deepLinkArgs";

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String T = "android-support-nav:controller:deepLinkExtras";

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static final String U = "android-support-nav:controller:deepLinkHandled";

    @dl.d
    public static final String V = "android-support-nav:controller:deepLinkIntent";

    @dl.e
    private yh.l<? super NavBackStackEntry, b2> A;

    @dl.e
    private yh.l<? super NavBackStackEntry, b2> B;

    @dl.d
    private final Map<NavBackStackEntry, Boolean> C;
    private int D;

    @dl.d
    private final List<NavBackStackEntry> E;

    @dl.d
    private final kotlin.z F;

    @dl.d
    private final kotlinx.coroutines.flow.i<NavBackStackEntry> G;

    @dl.d
    private final kotlinx.coroutines.flow.e<NavBackStackEntry> H;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f24748a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private Activity f24749b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private i0 f24750c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private NavGraph f24751d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private Bundle f24752e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private Parcelable[] f24753f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f24754g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final kotlin.collections.i<NavBackStackEntry> f24755h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.j<List<NavBackStackEntry>> f24756i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    private final kotlinx.coroutines.flow.u<List<NavBackStackEntry>> f24757j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.j<List<NavBackStackEntry>> f24758k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private final kotlinx.coroutines.flow.u<List<NavBackStackEntry>> f24759l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final Map<NavBackStackEntry, NavBackStackEntry> f24760m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final Map<NavBackStackEntry, AtomicInteger> f24761n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final Map<Integer, String> f24762o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @dl.d
    private final Map<String, kotlin.collections.i<NavBackStackEntryState>> f24763p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private androidx.lifecycle.y f24764q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.e
    private OnBackPressedDispatcher f24765r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private w f24766s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final CopyOnWriteArrayList<b> f24767t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private Lifecycle.State f24768u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    private final androidx.lifecycle.x f24769v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    private final androidx.activity.o f24770w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private boolean f24771x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @dl.d
    private q0 f24772y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @dl.d
    private final Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> f24773z;

    @dl.d
    public static final a I = new a(null);
    private static boolean W = true;

    /* JADX INFO: compiled from: NavController.kt */
    @kotlin.jvm.internal.t0({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,2927:1\n146#2:2928\n146#2:2929\n2624#3,3:2930\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavController$NavControllerNavigatorState\n*L\n297#1:2928\n330#1:2929\n360#1:2930,3\n*E\n"})
    public final class NavControllerNavigatorState extends s0 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @dl.d
        private final Navigator<? extends NavDestination> f24774g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ NavController f24775h;

        public NavControllerNavigatorState(@dl.d NavController navController, Navigator<? extends NavDestination> navigator) {
            kotlin.jvm.internal.f0.p(navigator, "navigator");
            this.f24775h = navController;
            this.f24774g = navigator;
        }

        @Override // androidx.navigation.s0
        @dl.d
        public NavBackStackEntry a(@dl.d NavDestination destination, @dl.e Bundle bundle) {
            kotlin.jvm.internal.f0.p(destination, "destination");
            return NavBackStackEntry.a.b(NavBackStackEntry.f24725p, this.f24775h.Q(), destination, bundle, this.f24775h.X(), this.f24775h.f24766s, null, null, 96, null);
        }

        @Override // androidx.navigation.s0
        public void e(@dl.d NavBackStackEntry entry) {
            w wVar;
            kotlin.jvm.internal.f0.p(entry, "entry");
            boolean zG = kotlin.jvm.internal.f0.g(this.f24775h.C.get(entry), Boolean.TRUE);
            super.e(entry);
            this.f24775h.C.remove(entry);
            if (this.f24775h.f24755h.contains(entry)) {
                if (d()) {
                    return;
                }
                this.f24775h.z1();
                this.f24775h.f24756i.d(CollectionsKt___CollectionsKt.T5(this.f24775h.f24755h));
                this.f24775h.f24758k.d(this.f24775h.h1());
                return;
            }
            this.f24775h.y1(entry);
            if (entry.getLifecycle().b().isAtLeast(Lifecycle.State.CREATED)) {
                entry.l(Lifecycle.State.DESTROYED);
            }
            kotlin.collections.i iVar = this.f24775h.f24755h;
            boolean z10 = true;
            if (!(iVar instanceof Collection) || !iVar.isEmpty()) {
                Iterator<E> it = iVar.iterator();
                while (it.hasNext()) {
                    if (kotlin.jvm.internal.f0.g(((NavBackStackEntry) it.next()).f(), entry.f())) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10 && !zG && (wVar = this.f24775h.f24766s) != null) {
                wVar.e(entry.f());
            }
            this.f24775h.z1();
            this.f24775h.f24758k.d(this.f24775h.h1());
        }

        @Override // androidx.navigation.s0
        public void h(@dl.d final NavBackStackEntry popUpTo, final boolean z10) {
            kotlin.jvm.internal.f0.p(popUpTo, "popUpTo");
            Navigator navigatorF = this.f24775h.f24772y.f(popUpTo.e().D());
            this.f24775h.C.put(popUpTo, Boolean.valueOf(z10));
            if (!kotlin.jvm.internal.f0.g(navigatorF, this.f24774g)) {
                Object obj = this.f24775h.f24773z.get(navigatorF);
                kotlin.jvm.internal.f0.m(obj);
                ((NavControllerNavigatorState) obj).h(popUpTo, z10);
            } else {
                yh.l lVar = this.f24775h.B;
                if (lVar == null) {
                    this.f24775h.X0(popUpTo, new yh.a<b2>() { // from class: androidx.navigation.NavController$NavControllerNavigatorState$pop$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            super/*androidx.navigation.s0*/.h(popUpTo, z10);
                        }
                    });
                } else {
                    lVar.invoke(popUpTo);
                    super.h(popUpTo, z10);
                }
            }
        }

        @Override // androidx.navigation.s0
        public void i(@dl.d NavBackStackEntry popUpTo, boolean z10) {
            kotlin.jvm.internal.f0.p(popUpTo, "popUpTo");
            super.i(popUpTo, z10);
        }

        @Override // androidx.navigation.s0
        public void j(@dl.d NavBackStackEntry entry) {
            kotlin.jvm.internal.f0.p(entry, "entry");
            super.j(entry);
            if (!this.f24775h.f24755h.contains(entry)) {
                throw new IllegalStateException("Cannot transition entry that is not in the back stack");
            }
            entry.l(Lifecycle.State.STARTED);
        }

        @Override // androidx.navigation.s0
        public void k(@dl.d NavBackStackEntry backStackEntry) {
            kotlin.jvm.internal.f0.p(backStackEntry, "backStackEntry");
            Navigator navigatorF = this.f24775h.f24772y.f(backStackEntry.e().D());
            if (!kotlin.jvm.internal.f0.g(navigatorF, this.f24774g)) {
                Object obj = this.f24775h.f24773z.get(navigatorF);
                if (obj != null) {
                    ((NavControllerNavigatorState) obj).k(backStackEntry);
                    return;
                }
                throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.e().D() + " should already be created").toString());
            }
            yh.l lVar = this.f24775h.A;
            if (lVar != null) {
                lVar.invoke(backStackEntry);
                o(backStackEntry);
                return;
            }
            Log.i(NavController.J, "Ignoring add of destination " + backStackEntry.e() + " outside of the call to navigate(). ");
        }

        public final void o(@dl.d NavBackStackEntry backStackEntry) {
            kotlin.jvm.internal.f0.p(backStackEntry, "backStackEntry");
            super.k(backStackEntry);
        }

        @dl.d
        public final Navigator<? extends NavDestination> p() {
            return this.f24774g;
        }
    }

    /* JADX INFO: compiled from: NavController.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ void b() {
        }

        @xh.m
        @a0
        public final void a(boolean z10) {
            NavController.W = z10;
        }
    }

    /* JADX INFO: compiled from: NavController.kt */
    public interface b {
        void a(@dl.d NavController navController, @dl.d NavDestination navDestination, @dl.e Bundle bundle);
    }

    /* JADX INFO: compiled from: NavController.kt */
    public static final class c extends androidx.activity.o {
        c() {
            super(false);
        }

        @Override // androidx.activity.o
        public void handleOnBackPressed() {
            NavController.this.L0();
        }
    }

    public NavController(@dl.d Context context) {
        kotlin.jvm.internal.f0.p(context, "context");
        this.f24748a = context;
        for (Object obj : SequencesKt__SequencesKt.l(context, new yh.l<Context, Context>() { // from class: androidx.navigation.NavController$activity$1
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Context invoke(Context it) {
                kotlin.jvm.internal.f0.p(it, "it");
                if (it instanceof ContextWrapper) {
                    return ((ContextWrapper) it).getBaseContext();
                }
                return null;
            }
        })) {
            if (((Context) obj) instanceof Activity) {
                this.f24749b = (Activity) obj;
                this.f24755h = new kotlin.collections.i<>();
                kotlinx.coroutines.flow.j<List<NavBackStackEntry>> jVarA = kotlinx.coroutines.flow.v.a(CollectionsKt__CollectionsKt.E());
                this.f24756i = jVarA;
                this.f24757j = kotlinx.coroutines.flow.g.m(jVarA);
                kotlinx.coroutines.flow.j<List<NavBackStackEntry>> jVarA2 = kotlinx.coroutines.flow.v.a(CollectionsKt__CollectionsKt.E());
                this.f24758k = jVarA2;
                this.f24759l = kotlinx.coroutines.flow.g.m(jVarA2);
                this.f24760m = new LinkedHashMap();
                this.f24761n = new LinkedHashMap();
                this.f24762o = new LinkedHashMap();
                this.f24763p = new LinkedHashMap();
                this.f24767t = new CopyOnWriteArrayList<>();
                this.f24768u = Lifecycle.State.INITIALIZED;
                this.f24769v = new androidx.lifecycle.v() { // from class: androidx.navigation.u
                    @Override // androidx.lifecycle.v
                    public final void d(androidx.lifecycle.y yVar, Lifecycle.Event event) {
                        NavController.h0(this.f25284b, yVar, event);
                    }
                };
                this.f24770w = new c();
                this.f24771x = true;
                this.f24772y = new q0();
                this.f24773z = new LinkedHashMap();
                this.C = new LinkedHashMap();
                q0 q0Var = this.f24772y;
                q0Var.b(new NavGraphNavigator(q0Var));
                this.f24772y.b(new ActivityNavigator(this.f24748a));
                this.E = new ArrayList();
                this.F = kotlin.b0.c(new yh.a<i0>() { // from class: androidx.navigation.NavController$navInflater$2
                    {
                        super(0);
                    }

                    @Override // yh.a
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final i0 invoke() {
                        i0 i0Var = this.f24801b.f24750c;
                        return i0Var == null ? new i0(this.f24801b.Q(), this.f24801b.f24772y) : i0Var;
                    }
                });
                kotlinx.coroutines.flow.i<NavBackStackEntry> iVarB = kotlinx.coroutines.flow.o.b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
                this.G = iVarB;
                this.H = kotlinx.coroutines.flow.g.l(iVarB);
            }
        }
        obj = null;
        this.f24749b = (Activity) obj;
        this.f24755h = new kotlin.collections.i<>();
        kotlinx.coroutines.flow.j<List<NavBackStackEntry>> jVarA3 = kotlinx.coroutines.flow.v.a(CollectionsKt__CollectionsKt.E());
        this.f24756i = jVarA3;
        this.f24757j = kotlinx.coroutines.flow.g.m(jVarA3);
        kotlinx.coroutines.flow.j<List<NavBackStackEntry>> jVarA4 = kotlinx.coroutines.flow.v.a(CollectionsKt__CollectionsKt.E());
        this.f24758k = jVarA4;
        this.f24759l = kotlinx.coroutines.flow.g.m(jVarA4);
        this.f24760m = new LinkedHashMap();
        this.f24761n = new LinkedHashMap();
        this.f24762o = new LinkedHashMap();
        this.f24763p = new LinkedHashMap();
        this.f24767t = new CopyOnWriteArrayList<>();
        this.f24768u = Lifecycle.State.INITIALIZED;
        this.f24769v = new androidx.lifecycle.v() { // from class: androidx.navigation.u
            @Override // androidx.lifecycle.v
            public final void d(androidx.lifecycle.y yVar, Lifecycle.Event event) {
                NavController.h0(this.f25284b, yVar, event);
            }
        };
        this.f24770w = new c();
        this.f24771x = true;
        this.f24772y = new q0();
        this.f24773z = new LinkedHashMap();
        this.C = new LinkedHashMap();
        q0 q0Var2 = this.f24772y;
        q0Var2.b(new NavGraphNavigator(q0Var2));
        this.f24772y.b(new ActivityNavigator(this.f24748a));
        this.E = new ArrayList();
        this.F = kotlin.b0.c(new yh.a<i0>() { // from class: androidx.navigation.NavController$navInflater$2
            {
                super(0);
            }

            @Override // yh.a
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final i0 invoke() {
                i0 i0Var = this.f24801b.f24750c;
                return i0Var == null ? new i0(this.f24801b.Q(), this.f24801b.f24772y) : i0Var;
            }
        });
        kotlinx.coroutines.flow.i<NavBackStackEntry> iVarB2 = kotlinx.coroutines.flow.o.b(1, 0, BufferOverflow.DROP_OLDEST, 2, null);
        this.G = iVarB2;
        this.H = kotlinx.coroutines.flow.g.l(iVarB2);
    }

    private final boolean A() {
        while (!this.f24755h.isEmpty() && (this.f24755h.last().e() instanceof NavGraph)) {
            g1(this, this.f24755h.last(), false, null, 6, null);
        }
        NavBackStackEntry navBackStackEntryW = this.f24755h.w();
        if (navBackStackEntryW != null) {
            this.E.add(navBackStackEntryW);
        }
        this.D++;
        z1();
        int i10 = this.D - 1;
        this.D = i10;
        if (i10 == 0) {
            List<NavBackStackEntry> listT5 = CollectionsKt___CollectionsKt.T5(this.E);
            this.E.clear();
            for (NavBackStackEntry navBackStackEntry : listT5) {
                Iterator<b> it = this.f24767t.iterator();
                while (it.hasNext()) {
                    it.next().a(this, navBackStackEntry.e(), navBackStackEntry.c());
                }
                this.G.d(navBackStackEntry);
            }
            this.f24756i.d(CollectionsKt___CollectionsKt.T5(this.f24755h));
            this.f24758k.d(h1());
        }
        return navBackStackEntryW != null;
    }

    private final void A1() {
        this.f24770w.setEnabled(this.f24771x && V() > 1);
    }

    @xh.m
    @a0
    public static final void B(boolean z10) {
        I.a(z10);
    }

    private final boolean D(List<? extends Navigator<?>> list, NavDestination navDestination, boolean z10, final boolean z11) {
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        final kotlin.collections.i<NavBackStackEntryState> iVar = new kotlin.collections.i<>();
        Iterator<? extends Navigator<?>> it = list.iterator();
        while (it.hasNext()) {
            Navigator<? extends NavDestination> navigator = (Navigator) it.next();
            final Ref.BooleanRef booleanRef2 = new Ref.BooleanRef();
            Y0(navigator, this.f24755h.last(), z11, new yh.l<NavBackStackEntry, b2>() { // from class: androidx.navigation.NavController$executePopOperations$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(NavBackStackEntry entry) {
                    kotlin.jvm.internal.f0.p(entry, "entry");
                    booleanRef2.f124884b = true;
                    booleanRef.f124884b = true;
                    this.f1(entry, z11, iVar);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(NavBackStackEntry navBackStackEntry) {
                    a(navBackStackEntry);
                    return b2.f124493a;
                }
            });
            if (!booleanRef2.f124884b) {
                break;
            }
        }
        if (z11) {
            if (!z10) {
                for (NavDestination navDestination2 : SequencesKt___SequencesKt.Z2(SequencesKt__SequencesKt.l(navDestination, new yh.l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController$executePopOperations$2
                    @Override // yh.l
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final NavDestination invoke(NavDestination destination) {
                        kotlin.jvm.internal.f0.p(destination, "destination");
                        NavGraph navGraphE = destination.E();
                        boolean z12 = false;
                        if (navGraphE != null && navGraphE.E0() == destination.A()) {
                            z12 = true;
                        }
                        if (z12) {
                            return destination.E();
                        }
                        return null;
                    }
                }), new yh.l<NavDestination, Boolean>() { // from class: androidx.navigation.NavController$executePopOperations$3
                    {
                        super(1);
                    }

                    @Override // yh.l
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(NavDestination destination) {
                        kotlin.jvm.internal.f0.p(destination, "destination");
                        return Boolean.valueOf(!this.f24788b.f24762o.containsKey(Integer.valueOf(destination.A())));
                    }
                })) {
                    Map<Integer, String> map = this.f24762o;
                    Integer numValueOf = Integer.valueOf(navDestination2.A());
                    NavBackStackEntryState navBackStackEntryStateL = iVar.l();
                    map.put(numValueOf, navBackStackEntryStateL != null ? navBackStackEntryStateL.c() : null);
                }
            }
            if (!iVar.isEmpty()) {
                NavBackStackEntryState navBackStackEntryStateFirst = iVar.first();
                Iterator it2 = SequencesKt___SequencesKt.Z2(SequencesKt__SequencesKt.l(H(this, navBackStackEntryStateFirst.b(), null, 2, null), new yh.l<NavDestination, NavDestination>() { // from class: androidx.navigation.NavController$executePopOperations$5
                    @Override // yh.l
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final NavDestination invoke(NavDestination destination) {
                        kotlin.jvm.internal.f0.p(destination, "destination");
                        NavGraph navGraphE = destination.E();
                        boolean z12 = false;
                        if (navGraphE != null && navGraphE.E0() == destination.A()) {
                            z12 = true;
                        }
                        if (z12) {
                            return destination.E();
                        }
                        return null;
                    }
                }), new yh.l<NavDestination, Boolean>() { // from class: androidx.navigation.NavController$executePopOperations$6
                    {
                        super(1);
                    }

                    @Override // yh.l
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(NavDestination destination) {
                        kotlin.jvm.internal.f0.p(destination, "destination");
                        return Boolean.valueOf(!this.f24790b.f24762o.containsKey(Integer.valueOf(destination.A())));
                    }
                }).iterator();
                while (it2.hasNext()) {
                    this.f24762o.put(Integer.valueOf(((NavDestination) it2.next()).A()), navBackStackEntryStateFirst.c());
                }
                if (this.f24762o.values().contains(navBackStackEntryStateFirst.c())) {
                    this.f24763p.put(navBackStackEntryStateFirst.c(), iVar);
                }
            }
        }
        A1();
        return booleanRef.f124884b;
    }

    private final boolean E(final List<NavBackStackEntry> list, final Bundle bundle, j0 j0Var, Navigator.a aVar) {
        NavBackStackEntry navBackStackEntry;
        NavDestination navDestinationE;
        ArrayList<List<NavBackStackEntry>> arrayList = new ArrayList();
        ArrayList<NavBackStackEntry> arrayList2 = new ArrayList();
        for (Object obj : list) {
            if (!(((NavBackStackEntry) obj).e() instanceof NavGraph)) {
                arrayList2.add(obj);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : arrayList2) {
            List list2 = (List) CollectionsKt___CollectionsKt.q3(arrayList);
            if (kotlin.jvm.internal.f0.g((list2 == null || (navBackStackEntry = (NavBackStackEntry) CollectionsKt___CollectionsKt.k3(list2)) == null || (navDestinationE = navBackStackEntry.e()) == null) ? null : navDestinationE.D(), navBackStackEntry2.e().D())) {
                list2.add(navBackStackEntry2);
            } else {
                arrayList.add(CollectionsKt__CollectionsKt.P(navBackStackEntry2));
            }
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        for (List<NavBackStackEntry> list3 : arrayList) {
            Navigator<? extends NavDestination> navigatorF = this.f24772y.f(((NavBackStackEntry) CollectionsKt___CollectionsKt.w2(list3)).e().D());
            final Ref.IntRef intRef = new Ref.IntRef();
            H0(navigatorF, list3, j0Var, aVar, new yh.l<NavBackStackEntry, b2>() { // from class: androidx.navigation.NavController$executeRestoreState$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public final void a(NavBackStackEntry entry) {
                    List<NavBackStackEntry> listE;
                    kotlin.jvm.internal.f0.p(entry, "entry");
                    booleanRef.f124884b = true;
                    int iIndexOf = list.indexOf(entry);
                    if (iIndexOf != -1) {
                        int i10 = iIndexOf + 1;
                        listE = list.subList(intRef.f124889b, i10);
                        intRef.f124889b = i10;
                    } else {
                        listE = CollectionsKt__CollectionsKt.E();
                    }
                    this.q(entry.e(), bundle, entry, listE);
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(NavBackStackEntry navBackStackEntry3) {
                    a(navBackStackEntry3);
                    return b2.f124493a;
                }
            });
        }
        return booleanRef.f124884b;
    }

    public static /* synthetic */ void F0(NavController navController, Object obj, j0 j0Var, Navigator.a aVar, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i10 & 2) != 0) {
            j0Var = null;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        navController.z0(obj, j0Var, aVar);
    }

    public static /* synthetic */ void G0(NavController navController, String str, j0 j0Var, Navigator.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigate");
        }
        if ((i10 & 2) != 0) {
            j0Var = null;
        }
        if ((i10 & 4) != 0) {
            aVar = null;
        }
        navController.D0(str, j0Var, aVar);
    }

    public static /* synthetic */ NavDestination H(NavController navController, int i10, NavDestination navDestination, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestination");
        }
        if ((i11 & 2) != 0) {
            navDestination = null;
        }
        return navController.F(i10, navDestination);
    }

    private final void H0(Navigator<? extends NavDestination> navigator, List<NavBackStackEntry> list, j0 j0Var, Navigator.a aVar, yh.l<? super NavBackStackEntry, b2> lVar) {
        this.A = lVar;
        navigator.e(list, j0Var, aVar);
        this.A = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void I0(NavController navController, Navigator navigator, List list, j0 j0Var, Navigator.a aVar, yh.l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: navigateInternal");
        }
        if ((i10 & 8) != 0) {
            lVar = new yh.l<NavBackStackEntry, b2>() { // from class: androidx.navigation.NavController$navigateInternal$1
                public final void a(NavBackStackEntry it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(NavBackStackEntry navBackStackEntry) {
                    a(navBackStackEntry);
                    return b2.f124493a;
                }
            };
        }
        navController.H0(navigator, list, j0Var, aVar, lVar);
    }

    public static /* synthetic */ NavDestination J(NavController navController, NavDestination navDestination, int i10, boolean z10, NavDestination navDestination2, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: findDestinationComprehensive");
        }
        if ((i11 & 4) != 0) {
            navDestination2 = null;
        }
        return navController.I(navDestination, i10, z10, navDestination2);
    }

    private final String K(int[] iArr) {
        NavGraph navGraph;
        NavGraph navGraph2 = this.f24751d;
        int length = iArr.length;
        int i10 = 0;
        while (true) {
            NavDestination navDestinationR0 = null;
            if (i10 >= length) {
                return null;
            }
            int i11 = iArr[i10];
            if (i10 == 0) {
                NavGraph navGraph3 = this.f24751d;
                kotlin.jvm.internal.f0.m(navGraph3);
                if (navGraph3.A() == i11) {
                    navDestinationR0 = this.f24751d;
                }
            } else {
                kotlin.jvm.internal.f0.m(navGraph2);
                navDestinationR0 = navGraph2.r0(i11);
            }
            if (navDestinationR0 == null) {
                return NavDestination.f24858l.b(this.f24748a, i11);
            }
            if (i10 != iArr.length - 1 && (navDestinationR0 instanceof NavGraph)) {
                while (true) {
                    navGraph = (NavGraph) navDestinationR0;
                    kotlin.jvm.internal.f0.m(navGraph);
                    if (!(navGraph.r0(navGraph.E0()) instanceof NavGraph)) {
                        break;
                    }
                    navDestinationR0 = navGraph.r0(navGraph.E0());
                }
                navGraph2 = navGraph;
            }
            i10++;
        }
    }

    @androidx.annotation.k0
    private final void K0(Bundle bundle) {
        Activity activity;
        ArrayList<String> stringArrayList;
        Bundle bundle2 = this.f24752e;
        if (bundle2 != null && (stringArrayList = bundle2.getStringArrayList(L)) != null) {
            for (String name : stringArrayList) {
                q0 q0Var = this.f24772y;
                kotlin.jvm.internal.f0.o(name, "name");
                Navigator navigatorF = q0Var.f(name);
                Bundle bundle3 = bundle2.getBundle(name);
                if (bundle3 != null) {
                    navigatorF.h(bundle3);
                }
            }
        }
        Parcelable[] parcelableArr = this.f24753f;
        boolean z10 = false;
        if (parcelableArr != null) {
            for (Parcelable parcelable : parcelableArr) {
                kotlin.jvm.internal.f0.n(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                NavBackStackEntryState navBackStackEntryState = (NavBackStackEntryState) parcelable;
                NavDestination navDestinationH = H(this, navBackStackEntryState.b(), null, 2, null);
                if (navDestinationH == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + NavDestination.f24858l.b(this.f24748a, navBackStackEntryState.b()) + " cannot be found from the current destination " + U());
                }
                NavBackStackEntry navBackStackEntryF = navBackStackEntryState.f(this.f24748a, navDestinationH, X(), this.f24766s);
                Navigator<? extends NavDestination> navigatorF2 = this.f24772y.f(navDestinationH.D());
                Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map = this.f24773z;
                NavControllerNavigatorState navControllerNavigatorState = map.get(navigatorF2);
                if (navControllerNavigatorState == null) {
                    navControllerNavigatorState = new NavControllerNavigatorState(this, navigatorF2);
                    map.put(navigatorF2, navControllerNavigatorState);
                }
                this.f24755h.add(navBackStackEntryF);
                navControllerNavigatorState.o(navBackStackEntryF);
                NavGraph navGraphE = navBackStackEntryF.e().E();
                if (navGraphE != null) {
                    i0(navBackStackEntryF, N(navGraphE.A()));
                }
            }
            A1();
            this.f24753f = null;
        }
        Collection<Navigator<? extends NavDestination>> collectionValues = this.f24772y.g().values();
        ArrayList<Navigator<? extends NavDestination>> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((Navigator) obj).c()) {
                arrayList.add(obj);
            }
        }
        for (Navigator<? extends NavDestination> navigator : arrayList) {
            Map<Navigator<? extends NavDestination>, NavControllerNavigatorState> map2 = this.f24773z;
            NavControllerNavigatorState navControllerNavigatorState2 = map2.get(navigator);
            if (navControllerNavigatorState2 == null) {
                navControllerNavigatorState2 = new NavControllerNavigatorState(this, navigator);
                map2.put(navigator, navControllerNavigatorState2);
            }
            navigator.f(navControllerNavigatorState2);
        }
        if (this.f24751d == null || !this.f24755h.isEmpty()) {
            A();
            return;
        }
        if (!this.f24754g && (activity = this.f24749b) != null) {
            kotlin.jvm.internal.f0.m(activity);
            if (e0(activity.getIntent())) {
                z10 = true;
            }
        }
        if (z10) {
            return;
        }
        NavGraph navGraph = this.f24751d;
        kotlin.jvm.internal.f0.m(navGraph);
        t0(navGraph, bundle, null, null);
    }

    private final <T> String L(T t10) {
        NavDestination navDestinationJ = J(this, W(), RouteSerializerKt.h(kotlinx.serialization.t.g(kotlin.jvm.internal.n0.d(t10.getClass()))), true, null, 4, null);
        if (navDestinationJ == null) {
            throw new IllegalArgumentException(("Destination with route " + kotlin.jvm.internal.n0.d(t10.getClass()).F() + " cannot be found in navigation graph " + this.f24751d).toString());
        }
        Map<String, p> mapV = navDestinationJ.v();
        LinkedHashMap linkedHashMap = new LinkedHashMap(kotlin.collections.r0.j(mapV.size()));
        Iterator<T> it = mapV.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((p) entry.getValue()).b());
        }
        return RouteSerializerKt.m(t10, linkedHashMap);
    }

    public static /* synthetic */ boolean U0(NavController navController, Object obj, boolean z10, boolean z11, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return navController.P0(obj, z10, z11);
    }

    private final int V() {
        kotlin.collections.i<NavBackStackEntry> iVar = this.f24755h;
        int i10 = 0;
        if (!(iVar instanceof Collection) || !iVar.isEmpty()) {
            Iterator<NavBackStackEntry> it = iVar.iterator();
            while (it.hasNext()) {
                if ((!(it.next().e() instanceof NavGraph)) && (i10 = i10 + 1) < 0) {
                    CollectionsKt__CollectionsKt.V();
                }
            }
        }
        return i10;
    }

    public static /* synthetic */ boolean V0(NavController navController, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return navController.R0(str, z10, z11);
    }

    public static /* synthetic */ boolean W0(NavController navController, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStack");
        }
        if ((i10 & 2) != 0) {
            z11 = false;
        }
        kotlin.jvm.internal.f0.y(6, androidx.exifinterface.media.a.f23244d5);
        kotlin.jvm.internal.k0.n("kotlinx.serialization.serializer.simple");
        int iH = RouteSerializerKt.h(kotlinx.serialization.t.i(null));
        if (J(navController, navController.W(), iH, true, null, 4, null) != null) {
            return navController.N0(iH, z10, z11);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Destination with route ");
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        sb2.append(kotlin.jvm.internal.n0.d(Object.class).F());
        sb2.append(" cannot be found in navigation graph ");
        sb2.append(navController.W());
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    private final void Y0(Navigator<? extends NavDestination> navigator, NavBackStackEntry navBackStackEntry, boolean z10, yh.l<? super NavBackStackEntry, b2> lVar) {
        this.B = lVar;
        navigator.j(navBackStackEntry, z10);
        this.B = null;
    }

    @androidx.annotation.k0
    private final boolean Z0(@androidx.annotation.d0 int i10, boolean z10, boolean z11) {
        if (this.f24755h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CollectionsKt___CollectionsKt.S4(this.f24755h).iterator();
        NavDestination navDestination = null;
        while (it.hasNext()) {
            NavDestination navDestinationE = ((NavBackStackEntry) it.next()).e();
            Navigator navigatorF = this.f24772y.f(navDestinationE.D());
            if (z10 || navDestinationE.A() != i10) {
                arrayList.add(navigatorF);
            }
            if (navDestinationE.A() == i10) {
                navDestination = navDestinationE;
                break;
            }
        }
        if (navDestination != null) {
            return D(arrayList, navDestination, z10, z11);
        }
        Log.i(J, "Ignoring popBackStack to destination " + NavDestination.f24858l.b(this.f24748a, i10) + " as it was not found on the current back stack");
        return false;
    }

    private final <T> boolean a1(T t10, boolean z10, boolean z11) {
        return b1(L(t10), z10, z11);
    }

    private final NavGraph b0(kotlin.collections.i<NavBackStackEntry> iVar) {
        NavDestination navDestinationE;
        NavBackStackEntry navBackStackEntryW = iVar.w();
        if (navBackStackEntryW == null || (navDestinationE = navBackStackEntryW.e()) == null) {
            navDestinationE = this.f24751d;
            kotlin.jvm.internal.f0.m(navDestinationE);
        }
        if (navDestinationE instanceof NavGraph) {
            return (NavGraph) navDestinationE;
        }
        NavGraph navGraphE = navDestinationE.E();
        kotlin.jvm.internal.f0.m(navGraphE);
        return navGraphE;
    }

    private final boolean b1(String str, boolean z10, boolean z11) {
        NavBackStackEntry navBackStackEntryPrevious;
        boolean zL;
        if (this.f24755h.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        kotlin.collections.i<NavBackStackEntry> iVar = this.f24755h;
        ListIterator<NavBackStackEntry> listIterator = iVar.listIterator(iVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
            NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
            zL = navBackStackEntry.e().L(str, navBackStackEntry.c());
            if (z10 || !zL) {
                arrayList.add(this.f24772y.f(navBackStackEntry.e().D()));
            }
        } while (!zL);
        NavBackStackEntry navBackStackEntry2 = navBackStackEntryPrevious;
        NavDestination navDestinationE = navBackStackEntry2 != null ? navBackStackEntry2.e() : null;
        if (navDestinationE != null) {
            return D(arrayList, navDestinationE, z10, z11);
        }
        Log.i(J, "Ignoring popBackStack to route " + str + " as it was not found on the current back stack");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void c1(NavController navController, Navigator navigator, NavBackStackEntry navBackStackEntry, boolean z10, yh.l lVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i10 & 4) != 0) {
            lVar = new yh.l<NavBackStackEntry, b2>() { // from class: androidx.navigation.NavController$popBackStackInternal$1
                public final void a(NavBackStackEntry it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                }

                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(NavBackStackEntry navBackStackEntry2) {
                    a(navBackStackEntry2);
                    return b2.f124493a;
                }
            };
        }
        navController.Y0(navigator, navBackStackEntry, z10, lVar);
    }

    static /* synthetic */ boolean d1(NavController navController, int i10, boolean z10, boolean z11, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return navController.Z0(i10, z10, z11);
    }

    static /* synthetic */ boolean e1(NavController navController, Object obj, boolean z10, boolean z11, int i10, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popBackStackInternal");
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        return navController.a1(obj, z10, z11);
    }

    private final List<NavBackStackEntry> f0(kotlin.collections.i<NavBackStackEntryState> iVar) {
        NavDestination navDestinationW;
        ArrayList arrayList = new ArrayList();
        NavBackStackEntry navBackStackEntryW = this.f24755h.w();
        if (navBackStackEntryW == null || (navDestinationW = navBackStackEntryW.e()) == null) {
            navDestinationW = W();
        }
        if (iVar != null) {
            for (NavBackStackEntryState navBackStackEntryState : iVar) {
                NavDestination navDestinationJ = J(this, navDestinationW, navBackStackEntryState.b(), true, null, 4, null);
                if (navDestinationJ == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + NavDestination.f24858l.b(this.f24748a, navBackStackEntryState.b()) + " cannot be found from the current destination " + navDestinationW).toString());
                }
                arrayList.add(navBackStackEntryState.f(this.f24748a, navDestinationJ, X(), this.f24766s));
                navDestinationW = navDestinationJ;
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f1(NavBackStackEntry navBackStackEntry, boolean z10, kotlin.collections.i<NavBackStackEntryState> iVar) {
        w wVar;
        kotlinx.coroutines.flow.u<Set<NavBackStackEntry>> uVarC;
        Set<NavBackStackEntry> value;
        NavBackStackEntry navBackStackEntryLast = this.f24755h.last();
        if (!kotlin.jvm.internal.f0.g(navBackStackEntryLast, navBackStackEntry)) {
            throw new IllegalStateException(("Attempted to pop " + navBackStackEntry.e() + ", which is not the top of the back stack (" + navBackStackEntryLast.e() + ')').toString());
        }
        kotlin.collections.x.L0(this.f24755h);
        NavControllerNavigatorState navControllerNavigatorState = this.f24773z.get(Z().f(navBackStackEntryLast.e().D()));
        boolean z11 = true;
        if (!((navControllerNavigatorState == null || (uVarC = navControllerNavigatorState.c()) == null || (value = uVarC.getValue()) == null || !value.contains(navBackStackEntryLast)) ? false : true) && !this.f24761n.containsKey(navBackStackEntryLast)) {
            z11 = false;
        }
        Lifecycle.State stateB = navBackStackEntryLast.getLifecycle().b();
        Lifecycle.State state = Lifecycle.State.CREATED;
        if (stateB.isAtLeast(state)) {
            if (z10) {
                navBackStackEntryLast.l(state);
                iVar.addFirst(new NavBackStackEntryState(navBackStackEntryLast));
            }
            if (z11) {
                navBackStackEntryLast.l(state);
            } else {
                navBackStackEntryLast.l(Lifecycle.State.DESTROYED);
                y1(navBackStackEntryLast);
            }
        }
        if (z10 || z11 || (wVar = this.f24766s) == null) {
            return;
        }
        wVar.e(navBackStackEntryLast.f());
    }

    private final boolean g0(NavDestination navDestination, Bundle bundle) {
        int iNextIndex;
        NavDestination navDestinationE;
        NavBackStackEntry navBackStackEntryS = S();
        kotlin.collections.i<NavBackStackEntry> iVar = this.f24755h;
        ListIterator<NavBackStackEntry> listIterator = iVar.listIterator(iVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (listIterator.previous().e() == navDestination) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        if (navDestination instanceof NavGraph) {
            List listC3 = SequencesKt___SequencesKt.c3(SequencesKt___SequencesKt.k1(NavGraph.f24890r.a((NavGraph) navDestination), new yh.l<NavDestination, Integer>() { // from class: androidx.navigation.NavController$launchSingleTopInternal$childHierarchyId$1
                @Override // yh.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Integer invoke(NavDestination it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    return Integer.valueOf(it.A());
                }
            }));
            if (this.f24755h.size() - iNextIndex != listC3.size()) {
                return false;
            }
            kotlin.collections.i<NavBackStackEntry> iVar2 = this.f24755h;
            List<NavBackStackEntry> listSubList = iVar2.subList(iNextIndex, iVar2.size());
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listSubList, 10));
            Iterator<T> it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((NavBackStackEntry) it.next()).e().A()));
            }
            if (!kotlin.jvm.internal.f0.g(arrayList, listC3)) {
                return false;
            }
        } else if (!((navBackStackEntryS == null || (navDestinationE = navBackStackEntryS.e()) == null || navDestination.A() != navDestinationE.A()) ? false : true)) {
            return false;
        }
        kotlin.collections.i<NavBackStackEntry> iVar3 = new kotlin.collections.i();
        while (CollectionsKt__CollectionsKt.G(this.f24755h) >= iNextIndex) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) kotlin.collections.x.L0(this.f24755h);
            y1(navBackStackEntry);
            iVar3.addFirst(new NavBackStackEntry(navBackStackEntry, navBackStackEntry.e().i(bundle)));
        }
        for (NavBackStackEntry navBackStackEntry2 : iVar3) {
            NavGraph navGraphE = navBackStackEntry2.e().E();
            if (navGraphE != null) {
                i0(navBackStackEntry2, N(navGraphE.A()));
            }
            this.f24755h.add(navBackStackEntry2);
        }
        for (NavBackStackEntry navBackStackEntry3 : iVar3) {
            this.f24772y.f(navBackStackEntry3.e().D()).g(navBackStackEntry3);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void g1(NavController navController, NavBackStackEntry navBackStackEntry, boolean z10, kotlin.collections.i iVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntryFromBackStack");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            iVar = new kotlin.collections.i();
        }
        navController.f1(navBackStackEntry, z10, iVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h0(NavController this$0, androidx.lifecycle.y yVar, Lifecycle.Event event) {
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        kotlin.jvm.internal.f0.p(yVar, "<anonymous parameter 0>");
        kotlin.jvm.internal.f0.p(event, "event");
        this$0.f24768u = event.getTargetState();
        if (this$0.f24751d != null) {
            Iterator it = CollectionsKt___CollectionsKt.T5(this$0.f24755h).iterator();
            while (it.hasNext()) {
                ((NavBackStackEntry) it.next()).i(event);
            }
        }
    }

    private final void i0(NavBackStackEntry navBackStackEntry, NavBackStackEntry navBackStackEntry2) {
        this.f24760m.put(navBackStackEntry, navBackStackEntry2);
        if (this.f24761n.get(navBackStackEntry2) == null) {
            this.f24761n.put(navBackStackEntry2, new AtomicInteger(0));
        }
        AtomicInteger atomicInteger = this.f24761n.get(navBackStackEntry2);
        kotlin.jvm.internal.f0.m(atomicInteger);
        atomicInteger.incrementAndGet();
    }

    private final boolean k1(int i10, Bundle bundle, j0 j0Var, Navigator.a aVar) {
        if (!this.f24762o.containsKey(Integer.valueOf(i10))) {
            return false;
        }
        final String str = this.f24762o.get(Integer.valueOf(i10));
        kotlin.collections.x.D0(this.f24762o.values(), new yh.l<String, Boolean>() { // from class: androidx.navigation.NavController$restoreStateInternal$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String str2) {
                return Boolean.valueOf(kotlin.jvm.internal.f0.g(str2, str));
            }
        });
        return E(f0((kotlin.collections.i) kotlin.jvm.internal.w0.k(this.f24763p).remove(str)), bundle, j0Var, aVar);
    }

    private final boolean l1(String str) {
        NavBackStackEntryState navBackStackEntryStateL;
        int iHashCode = NavDestination.f24858l.a(str).hashCode();
        if (this.f24762o.containsKey(Integer.valueOf(iHashCode))) {
            return k1(iHashCode, null, null, null);
        }
        NavDestination navDestinationG = G(str);
        if (!(navDestinationG != null)) {
            throw new IllegalStateException(("Restore State failed: route " + str + " cannot be found from the current destination " + U()).toString());
        }
        final String str2 = this.f24762o.get(Integer.valueOf(navDestinationG.A()));
        kotlin.collections.x.D0(this.f24762o.values(), new yh.l<String, Boolean>() { // from class: androidx.navigation.NavController$restoreStateInternal$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(String str3) {
                return Boolean.valueOf(kotlin.jvm.internal.f0.g(str3, str2));
            }
        });
        kotlin.collections.i<NavBackStackEntryState> iVar = (kotlin.collections.i) kotlin.jvm.internal.w0.k(this.f24763p).remove(str2);
        NavDestination.b bVarQ = navDestinationG.Q(str);
        kotlin.jvm.internal.f0.m(bVarQ);
        if (bVarQ.d((iVar == null || (navBackStackEntryStateL = iVar.l()) == null) ? null : navBackStackEntryStateL.a())) {
            return E(f0(iVar), null, null, null);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q(NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List<NavBackStackEntry> list) {
        NavBackStackEntry navBackStackEntry2;
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntryPrevious2;
        Bundle bundle2 = bundle;
        NavBackStackEntry navBackStackEntry3 = navBackStackEntry;
        List<NavBackStackEntry> list2 = list;
        NavDestination navDestinationE = navBackStackEntry.e();
        if (!(navDestinationE instanceof h)) {
            while (!this.f24755h.isEmpty() && (this.f24755h.last().e() instanceof h) && d1(this, this.f24755h.last().e().A(), true, false, 4, null)) {
            }
        }
        kotlin.collections.i<NavBackStackEntry> iVar = new kotlin.collections.i();
        boolean z10 = true;
        NavBackStackEntry navBackStackEntry4 = null;
        if (navDestination instanceof NavGraph) {
            NavDestination navDestination2 = navDestinationE;
            while (true) {
                kotlin.jvm.internal.f0.m(navDestination2);
                NavGraph navGraphE = navDestination2.E();
                if (navGraphE != null) {
                    ListIterator<NavBackStackEntry> listIterator = list2.listIterator(list.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            navBackStackEntryPrevious2 = null;
                            break;
                        }
                        navBackStackEntryPrevious2 = listIterator.previous();
                    } while (!kotlin.jvm.internal.f0.g(navBackStackEntryPrevious2.e(), navGraphE));
                    NavBackStackEntry navBackStackEntryB = navBackStackEntryPrevious2;
                    if (navBackStackEntryB == null) {
                        navBackStackEntry2 = navBackStackEntry3;
                        navBackStackEntryB = NavBackStackEntry.a.b(NavBackStackEntry.f24725p, this.f24748a, navGraphE, bundle, X(), this.f24766s, null, null, 96, null);
                    } else {
                        navBackStackEntry2 = navBackStackEntry3;
                    }
                    iVar.addFirst(navBackStackEntryB);
                    if ((this.f24755h.isEmpty() ^ z10) && this.f24755h.last().e() == navGraphE) {
                        g1(this, this.f24755h.last(), false, null, 6, null);
                    } else {
                        list2 = list2;
                    }
                } else {
                    navDestinationE = navDestinationE;
                    navBackStackEntry2 = navBackStackEntry3;
                }
                if (navGraphE == 0) {
                    list2 = list2;
                    break;
                }
                if (navGraphE == navDestination) {
                    break;
                }
                navDestination2 = navGraphE;
                z10 = z10;
                iVar = iVar;
                bundle2 = bundle2;
                navDestinationE = navDestinationE;
                navBackStackEntry3 = navBackStackEntry2;
            }
        } else {
            z10 = true;
            iVar = iVar;
            navDestinationE = navDestinationE;
            navBackStackEntry2 = navBackStackEntry3;
            bundle2 = bundle2;
        }
        NavDestination navDestinationE2 = iVar.isEmpty() ? navDestinationE : ((NavBackStackEntry) iVar.first()).e();
        while (navDestinationE2 != null && F(navDestinationE2.A(), navDestinationE2) != navDestinationE2) {
            navDestinationE2 = navDestinationE2.E();
            if (navDestinationE2 != null) {
                boolean z11 = false;
                if (bundle2 != null && bundle.isEmpty() == z10) {
                    z11 = z10;
                }
                Bundle bundle3 = z11 ? null : bundle2;
                ListIterator<NavBackStackEntry> listIterator2 = list2.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        navBackStackEntryPrevious = null;
                        break;
                    }
                    navBackStackEntryPrevious = listIterator2.previous();
                } while (!kotlin.jvm.internal.f0.g(navBackStackEntryPrevious.e(), navDestinationE2));
                NavBackStackEntry navBackStackEntryB2 = navBackStackEntryPrevious;
                if (navBackStackEntryB2 == null) {
                    navBackStackEntryB2 = NavBackStackEntry.a.b(NavBackStackEntry.f24725p, this.f24748a, navDestinationE2, navDestinationE2.i(bundle3), X(), this.f24766s, null, null, 96, null);
                }
                iVar.addFirst(navBackStackEntryB2);
            }
        }
        NavDestination navDestinationE3 = iVar.isEmpty() ? navDestinationE : ((NavBackStackEntry) iVar.first()).e();
        while (!this.f24755h.isEmpty() && (this.f24755h.last().e() instanceof NavGraph)) {
            NavDestination navDestinationE4 = this.f24755h.last().e();
            kotlin.jvm.internal.f0.n(navDestinationE4, "null cannot be cast to non-null type androidx.navigation.NavGraph");
            if (((NavGraph) navDestinationE4).A0().g(navDestinationE3.A()) != null) {
                break;
            } else {
                g1(this, this.f24755h.last(), false, null, 6, null);
            }
        }
        NavBackStackEntry navBackStackEntryL = this.f24755h.l();
        if (navBackStackEntryL == null) {
            navBackStackEntryL = (NavBackStackEntry) iVar.l();
        }
        if (!kotlin.jvm.internal.f0.g(navBackStackEntryL != null ? navBackStackEntryL.e() : null, this.f24751d)) {
            ListIterator<NavBackStackEntry> listIterator3 = list2.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                NavBackStackEntry navBackStackEntryPrevious3 = listIterator3.previous();
                NavDestination navDestinationE5 = navBackStackEntryPrevious3.e();
                NavGraph navGraph = this.f24751d;
                kotlin.jvm.internal.f0.m(navGraph);
                if (kotlin.jvm.internal.f0.g(navDestinationE5, navGraph)) {
                    navBackStackEntry4 = navBackStackEntryPrevious3;
                    break;
                }
            }
            NavBackStackEntry navBackStackEntryB3 = navBackStackEntry4;
            if (navBackStackEntryB3 == null) {
                NavBackStackEntry.a aVar = NavBackStackEntry.f24725p;
                Context context = this.f24748a;
                NavGraph navGraph2 = this.f24751d;
                kotlin.jvm.internal.f0.m(navGraph2);
                NavGraph navGraph3 = this.f24751d;
                kotlin.jvm.internal.f0.m(navGraph3);
                navBackStackEntryB3 = NavBackStackEntry.a.b(aVar, context, navGraph2, navGraph3.i(bundle2), X(), this.f24766s, null, null, 96, null);
            }
            iVar.addFirst(navBackStackEntryB3);
        }
        for (NavBackStackEntry navBackStackEntry5 : iVar) {
            NavControllerNavigatorState navControllerNavigatorState = this.f24773z.get(this.f24772y.f(navBackStackEntry5.e().D()));
            if (navControllerNavigatorState == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + navDestination.D() + " should already be created").toString());
            }
            navControllerNavigatorState.o(navBackStackEntry5);
        }
        this.f24755h.addAll(iVar);
        this.f24755h.add(navBackStackEntry2);
        for (NavBackStackEntry navBackStackEntry6 : CollectionsKt___CollectionsKt.z4(iVar, navBackStackEntry2)) {
            NavGraph navGraphE2 = navBackStackEntry6.e().E();
            if (navGraphE2 != null) {
                i0(navBackStackEntry6, N(navGraphE2.A()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void r(NavController navController, NavDestination navDestination, Bundle bundle, NavBackStackEntry navBackStackEntry, List list, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEntryToBackStack");
        }
        if ((i10 & 8) != 0) {
            list = CollectionsKt__CollectionsKt.E();
        }
        navController.q(navDestination, bundle, navBackStackEntry, list);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0096  */
    @androidx.annotation.k0
    private final void t0(final NavDestination navDestination, Bundle bundle, j0 j0Var, Navigator.a aVar) {
        boolean z10;
        boolean z11;
        boolean zZ0;
        Iterator<T> it = this.f24773z.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).m(true);
        }
        final Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        if (j0Var == null) {
            z10 = false;
        } else {
            if (j0Var.g() != null) {
                String strG = j0Var.g();
                kotlin.jvm.internal.f0.m(strG);
                zZ0 = b1(strG, j0Var.j(), j0Var.l());
            } else if (j0Var.h() != null) {
                kotlin.reflect.d<?> dVarH = j0Var.h();
                kotlin.jvm.internal.f0.m(dVarH);
                zZ0 = Z0(RouteSerializerKt.h(kotlinx.serialization.t.g(dVarH)), j0Var.j(), j0Var.l());
            } else if (j0Var.i() != null) {
                Object objI = j0Var.i();
                kotlin.jvm.internal.f0.m(objI);
                zZ0 = a1(objI, j0Var.j(), j0Var.l());
            } else if (j0Var.f() != -1) {
                zZ0 = Z0(j0Var.f(), j0Var.j(), j0Var.l());
            } else {
                z10 = false;
            }
            z10 = zZ0;
        }
        final Bundle bundleI = navDestination.i(bundle);
        if ((j0Var != null && j0Var.m()) && this.f24762o.containsKey(Integer.valueOf(navDestination.A()))) {
            booleanRef.f124884b = k1(navDestination.A(), bundleI, j0Var, aVar);
            z11 = false;
        } else {
            z11 = (j0Var != null && j0Var.k()) && g0(navDestination, bundle);
            if (!z11) {
                H0(this.f24772y.f(navDestination.D()), kotlin.collections.s.k(NavBackStackEntry.a.b(NavBackStackEntry.f24725p, this.f24748a, navDestination, bundleI, X(), this.f24766s, null, null, 96, null)), j0Var, aVar, new yh.l<NavBackStackEntry, b2>() { // from class: androidx.navigation.NavController$navigate$5
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    public final void a(NavBackStackEntry it2) {
                        kotlin.jvm.internal.f0.p(it2, "it");
                        booleanRef.f124884b = true;
                        NavController.r(this, navDestination, bundleI, it2, null, 8, null);
                    }

                    @Override // yh.l
                    public /* bridge */ /* synthetic */ b2 invoke(NavBackStackEntry navBackStackEntry) {
                        a(navBackStackEntry);
                        return b2.f124493a;
                    }
                });
            }
        }
        A1();
        Iterator<T> it2 = this.f24773z.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).m(false);
        }
        if (z10 || booleanRef.f124884b || z11) {
            A();
        } else {
            z1();
        }
    }

    private final boolean w1() {
        int i10 = 0;
        if (!this.f24754g) {
            return false;
        }
        Activity activity = this.f24749b;
        kotlin.jvm.internal.f0.m(activity);
        Intent intent = activity.getIntent();
        Bundle extras = intent.getExtras();
        kotlin.jvm.internal.f0.m(extras);
        int[] intArray = extras.getIntArray(R);
        kotlin.jvm.internal.f0.m(intArray);
        List<Integer> listSz = ArraysKt___ArraysKt.sz(intArray);
        ArrayList parcelableArrayList = extras.getParcelableArrayList(S);
        int iIntValue = ((Number) kotlin.collections.x.L0(listSz)).intValue();
        if (parcelableArrayList != null) {
        }
        if (listSz.isEmpty()) {
            return false;
        }
        NavDestination navDestinationJ = J(this, W(), iIntValue, false, null, 4, null);
        if (navDestinationJ instanceof NavGraph) {
            iIntValue = NavGraph.f24890r.b((NavGraph) navDestinationJ).A();
        }
        NavDestination navDestinationU = U();
        if (!(navDestinationU != null && iIntValue == navDestinationU.A())) {
            return false;
        }
        NavDeepLinkBuilder navDeepLinkBuilderZ = z();
        Bundle bundleB = androidx.core.os.e.b(c1.a(V, intent));
        Bundle bundle = extras.getBundle(T);
        if (bundle != null) {
            bundleB.putAll(bundle);
        }
        navDeepLinkBuilderZ.k(bundleB);
        for (Object obj : listSz) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            navDeepLinkBuilderZ.b(((Number) obj).intValue(), parcelableArrayList != null ? (Bundle) parcelableArrayList.get(i10) : null);
            i10 = i11;
        }
        navDeepLinkBuilderZ.h().u();
        Activity activity2 = this.f24749b;
        if (activity2 != null) {
            activity2.finish();
        }
        return true;
    }

    @androidx.annotation.k0
    private final boolean x(@androidx.annotation.d0 int i10) {
        Iterator<T> it = this.f24773z.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).m(true);
        }
        boolean zK1 = k1(i10, null, k0.a(new yh.l<NavOptionsBuilder, b2>() { // from class: androidx.navigation.NavController$clearBackStackInternal$restored$1
            public final void a(NavOptionsBuilder navOptions) {
                kotlin.jvm.internal.f0.p(navOptions, "$this$navOptions");
                navOptions.z(true);
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(NavOptionsBuilder navOptionsBuilder) {
                a(navOptionsBuilder);
                return b2.f124493a;
            }
        }), null);
        Iterator<T> it2 = this.f24773z.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).m(false);
        }
        return zK1 && Z0(i10, true, false);
    }

    private final boolean x1() {
        NavDestination navDestinationU = U();
        kotlin.jvm.internal.f0.m(navDestinationU);
        int iA = navDestinationU.A();
        for (NavGraph navGraphE = navDestinationU.E(); navGraphE != null; navGraphE = navGraphE.E()) {
            if (navGraphE.E0() != iA) {
                Bundle bundle = new Bundle();
                Activity activity = this.f24749b;
                if (activity != null) {
                    kotlin.jvm.internal.f0.m(activity);
                    if (activity.getIntent() != null) {
                        Activity activity2 = this.f24749b;
                        kotlin.jvm.internal.f0.m(activity2);
                        if (activity2.getIntent().getData() != null) {
                            Activity activity3 = this.f24749b;
                            kotlin.jvm.internal.f0.m(activity3);
                            bundle.putParcelable(V, activity3.getIntent());
                            NavGraph navGraphB0 = b0(this.f24755h);
                            Activity activity4 = this.f24749b;
                            kotlin.jvm.internal.f0.m(activity4);
                            Intent intent = activity4.getIntent();
                            kotlin.jvm.internal.f0.o(intent, "activity!!.intent");
                            NavDestination.b bVarG0 = navGraphB0.G0(new z(intent), true, true, navGraphB0);
                            if ((bVarG0 != null ? bVarG0.c() : null) != null) {
                                bundle.putAll(bVarG0.b().i(bVarG0.c()));
                            }
                        }
                    }
                }
                NavDeepLinkBuilder.r(new NavDeepLinkBuilder(this), navGraphE.A(), null, 2, null).k(bundle).h().u();
                Activity activity5 = this.f24749b;
                if (activity5 != null) {
                    activity5.finish();
                }
                return true;
            }
            iA = navGraphE.A();
        }
        return false;
    }

    @androidx.annotation.k0
    private final boolean y(String str) {
        Iterator<T> it = this.f24773z.values().iterator();
        while (it.hasNext()) {
            ((NavControllerNavigatorState) it.next()).m(true);
        }
        boolean zL1 = l1(str);
        Iterator<T> it2 = this.f24773z.values().iterator();
        while (it2.hasNext()) {
            ((NavControllerNavigatorState) it2.next()).m(false);
        }
        return zL1 && b1(str, true, false);
    }

    @androidx.annotation.k0
    public final <T> void A0(@dl.d T route, @dl.d yh.l<? super NavOptionsBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.p(builder, "builder");
        F0(this, route, k0.a(builder), null, 4, null);
    }

    @androidx.annotation.k0
    @xh.i
    public final void B0(@dl.d String route) {
        kotlin.jvm.internal.f0.p(route, "route");
        G0(this, route, null, null, 6, null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void C(boolean z10) {
        this.f24771x = z10;
        A1();
    }

    @androidx.annotation.k0
    @xh.i
    public final void C0(@dl.d String route, @dl.e j0 j0Var) {
        kotlin.jvm.internal.f0.p(route, "route");
        G0(this, route, j0Var, null, 4, null);
    }

    @androidx.annotation.k0
    @xh.i
    public final void D0(@dl.d String route, @dl.e j0 j0Var, @dl.e Navigator.a aVar) {
        kotlin.jvm.internal.f0.p(route, "route");
        if (this.f24751d == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + lg.a.f131414g).toString());
        }
        NavGraph navGraphB0 = b0(this.f24755h);
        NavDestination.b bVarH0 = navGraphB0.H0(route, true, true, navGraphB0);
        if (bVarH0 == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + route + " cannot be found in the navigation graph " + this.f24751d);
        }
        NavDestination navDestinationB = bVarH0.b();
        Bundle bundleI = navDestinationB.i(bVarH0.c());
        if (bundleI == null) {
            bundleI = new Bundle();
        }
        NavDestination navDestinationB2 = bVarH0.b();
        Intent intent = new Intent();
        Uri uri = Uri.parse(NavDestination.f24858l.a(navDestinationB.F()));
        kotlin.jvm.internal.f0.h(uri, "Uri.parse(this)");
        intent.setDataAndType(uri, null);
        intent.setAction(null);
        bundleI.putParcelable(V, intent);
        t0(navDestinationB2, bundleI, j0Var, aVar);
    }

    @androidx.annotation.k0
    public final void E0(@dl.d String route, @dl.d yh.l<? super NavOptionsBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.p(builder, "builder");
        G0(this, route, k0.a(builder), null, 4, null);
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination F(@androidx.annotation.d0 int i10, @dl.e NavDestination navDestination) {
        NavDestination navDestinationE;
        NavGraph navGraph = this.f24751d;
        if (navGraph == null) {
            return null;
        }
        kotlin.jvm.internal.f0.m(navGraph);
        if (navGraph.A() == i10) {
            if (navDestination == null) {
                return this.f24751d;
            }
            if (kotlin.jvm.internal.f0.g(this.f24751d, navDestination) && navDestination.E() == null) {
                return this.f24751d;
            }
        }
        NavBackStackEntry navBackStackEntryW = this.f24755h.w();
        if (navBackStackEntryW == null || (navDestinationE = navBackStackEntryW.e()) == null) {
            navDestinationE = this.f24751d;
            kotlin.jvm.internal.f0.m(navDestinationE);
        }
        return I(navDestinationE, i10, false, navDestination);
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination G(@dl.d String route) {
        kotlin.jvm.internal.f0.p(route, "route");
        NavGraph navGraph = this.f24751d;
        if (navGraph == null) {
            return null;
        }
        kotlin.jvm.internal.f0.m(navGraph);
        if (!kotlin.jvm.internal.f0.g(navGraph.F(), route)) {
            NavGraph navGraph2 = this.f24751d;
            kotlin.jvm.internal.f0.m(navGraph2);
            if (navGraph2.Q(route) == null) {
                return b0(this.f24755h).t0(route);
            }
        }
        return this.f24751d;
    }

    @dl.e
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final NavDestination I(@dl.d NavDestination navDestination, @androidx.annotation.d0 int i10, boolean z10, @dl.e NavDestination navDestination2) {
        NavGraph navGraph;
        kotlin.jvm.internal.f0.p(navDestination, "<this>");
        if (navDestination.A() == i10 && (navDestination2 == null || (kotlin.jvm.internal.f0.g(navDestination, navDestination2) && kotlin.jvm.internal.f0.g(navDestination.E(), navDestination2.E())))) {
            return navDestination;
        }
        if (navDestination instanceof NavGraph) {
            navGraph = (NavGraph) navDestination;
        } else {
            NavGraph navGraphE = navDestination.E();
            kotlin.jvm.internal.f0.m(navGraphE);
            navGraph = navGraphE;
        }
        return navGraph.v0(i10, navGraph, z10, navDestination2);
    }

    @androidx.annotation.k0
    public boolean J0() {
        Intent intent;
        if (V() != 1) {
            return L0();
        }
        Activity activity = this.f24749b;
        Bundle extras = (activity == null || (intent = activity.getIntent()) == null) ? null : intent.getExtras();
        return (extras != null ? extras.getIntArray(R) : null) != null ? w1() : x1();
    }

    @androidx.annotation.k0
    public boolean L0() {
        if (this.f24755h.isEmpty()) {
            return false;
        }
        NavDestination navDestinationU = U();
        kotlin.jvm.internal.f0.m(navDestinationU);
        return M0(navDestinationU.A(), true);
    }

    public final /* synthetic */ <T> NavBackStackEntry M() {
        kotlin.jvm.internal.f0.y(6, androidx.exifinterface.media.a.f23244d5);
        kotlin.jvm.internal.k0.n("kotlinx.serialization.serializer.simple");
        NavBackStackEntry navBackStackEntry = null;
        int iH = RouteSerializerKt.h(kotlinx.serialization.t.i(null));
        if (J(this, W(), iH, true, null, 4, null) == null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Destination with route ");
            kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
            sb2.append(kotlin.jvm.internal.n0.d(Object.class).F());
            sb2.append(" cannot be found in navigation graph ");
            sb2.append(W());
            throw new IllegalArgumentException(sb2.toString().toString());
        }
        List<NavBackStackEntry> value = R().getValue();
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        while (listIterator.hasPrevious()) {
            NavBackStackEntry navBackStackEntryPrevious = listIterator.previous();
            if (navBackStackEntryPrevious.e().A() == iH) {
                navBackStackEntry = navBackStackEntryPrevious;
                break;
            }
        }
        NavBackStackEntry navBackStackEntry2 = navBackStackEntry;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append("No destination with route ");
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        sb3.append(kotlin.jvm.internal.n0.d(Object.class).F());
        sb3.append(" is on the NavController's back stack. The current destination is ");
        sb3.append(U());
        throw new IllegalArgumentException(sb3.toString().toString());
    }

    @androidx.annotation.k0
    public boolean M0(@androidx.annotation.d0 int i10, boolean z10) {
        return N0(i10, z10, false);
    }

    @dl.d
    public NavBackStackEntry N(@androidx.annotation.d0 int i10) {
        NavBackStackEntry navBackStackEntryPrevious;
        kotlin.collections.i<NavBackStackEntry> iVar = this.f24755h;
        ListIterator<NavBackStackEntry> listIterator = iVar.listIterator(iVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
        } while (!(navBackStackEntryPrevious.e().A() == i10));
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (navBackStackEntry != null) {
            return navBackStackEntry;
        }
        throw new IllegalArgumentException(("No destination with ID " + i10 + " is on the NavController's back stack. The current destination is " + U()).toString());
    }

    @androidx.annotation.k0
    public boolean N0(@androidx.annotation.d0 int i10, boolean z10, boolean z11) {
        return Z0(i10, z10, z11) && A();
    }

    @dl.d
    public final <T> NavBackStackEntry O(@dl.d T route) {
        kotlin.jvm.internal.f0.p(route, "route");
        return P(L(route));
    }

    @androidx.annotation.k0
    @xh.i
    public final <T> boolean O0(@dl.d T route, boolean z10) {
        kotlin.jvm.internal.f0.p(route, "route");
        return U0(this, route, z10, false, 4, null);
    }

    @dl.d
    public final NavBackStackEntry P(@dl.d String route) {
        NavBackStackEntry navBackStackEntryPrevious;
        NavBackStackEntry navBackStackEntry;
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.collections.i<NavBackStackEntry> iVar = this.f24755h;
        ListIterator<NavBackStackEntry> listIterator = iVar.listIterator(iVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
            navBackStackEntry = navBackStackEntryPrevious;
        } while (!navBackStackEntry.e().L(route, navBackStackEntry.c()));
        NavBackStackEntry navBackStackEntry2 = navBackStackEntryPrevious;
        if (navBackStackEntry2 != null) {
            return navBackStackEntry2;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + U()).toString());
    }

    @androidx.annotation.k0
    @xh.i
    public final <T> boolean P0(@dl.d T route, boolean z10, boolean z11) {
        kotlin.jvm.internal.f0.p(route, "route");
        return a1(route, z10, z11) && A();
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final Context Q() {
        return this.f24748a;
    }

    @androidx.annotation.k0
    @xh.i
    public final boolean Q0(@dl.d String route, boolean z10) {
        kotlin.jvm.internal.f0.p(route, "route");
        return V0(this, route, z10, false, 4, null);
    }

    @dl.d
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final kotlinx.coroutines.flow.u<List<NavBackStackEntry>> R() {
        return this.f24757j;
    }

    @androidx.annotation.k0
    @xh.i
    public final boolean R0(@dl.d String route, boolean z10, boolean z11) {
        kotlin.jvm.internal.f0.p(route, "route");
        return b1(route, z10, z11) && A();
    }

    @dl.e
    public NavBackStackEntry S() {
        return this.f24755h.w();
    }

    @androidx.annotation.k0
    @xh.i
    public final /* synthetic */ <T> boolean S0(boolean z10) {
        kotlin.jvm.internal.f0.y(6, androidx.exifinterface.media.a.f23244d5);
        kotlin.jvm.internal.k0.n("kotlinx.serialization.serializer.simple");
        int iH = RouteSerializerKt.h(kotlinx.serialization.t.i(null));
        if (J(this, W(), iH, true, null, 4, null) != null) {
            return N0(iH, z10, false);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Destination with route ");
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        sb2.append(kotlin.jvm.internal.n0.d(Object.class).F());
        sb2.append(" cannot be found in navigation graph ");
        sb2.append(W());
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    @dl.d
    public final kotlinx.coroutines.flow.e<NavBackStackEntry> T() {
        return this.H;
    }

    @androidx.annotation.k0
    @xh.i
    public final /* synthetic */ <T> boolean T0(boolean z10, boolean z11) {
        kotlin.jvm.internal.f0.y(6, androidx.exifinterface.media.a.f23244d5);
        kotlin.jvm.internal.k0.n("kotlinx.serialization.serializer.simple");
        int iH = RouteSerializerKt.h(kotlinx.serialization.t.i(null));
        if (J(this, W(), iH, true, null, 4, null) != null) {
            return N0(iH, z10, z11);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Destination with route ");
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        sb2.append(kotlin.jvm.internal.n0.d(Object.class).F());
        sb2.append(" cannot be found in navigation graph ");
        sb2.append(W());
        throw new IllegalArgumentException(sb2.toString().toString());
    }

    @dl.e
    public NavDestination U() {
        NavBackStackEntry navBackStackEntryS = S();
        if (navBackStackEntryS != null) {
            return navBackStackEntryS.e();
        }
        return null;
    }

    @dl.d
    @androidx.annotation.k0
    public NavGraph W() {
        NavGraph navGraph = this.f24751d;
        if (navGraph == null) {
            throw new IllegalStateException("You must call setGraph() before calling getGraph()".toString());
        }
        kotlin.jvm.internal.f0.n(navGraph, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        return navGraph;
    }

    @dl.d
    public final Lifecycle.State X() {
        return this.f24764q == null ? Lifecycle.State.CREATED : this.f24768u;
    }

    public final void X0(@dl.d NavBackStackEntry popUpTo, @dl.d yh.a<b2> onComplete) {
        kotlin.jvm.internal.f0.p(popUpTo, "popUpTo");
        kotlin.jvm.internal.f0.p(onComplete, "onComplete");
        int iIndexOf = this.f24755h.indexOf(popUpTo);
        if (iIndexOf < 0) {
            Log.i(J, "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i10 = iIndexOf + 1;
        if (i10 != this.f24755h.size()) {
            Z0(this.f24755h.get(i10).e().A(), true, false);
        }
        g1(this, popUpTo, false, null, 6, null);
        onComplete.invoke();
        A1();
        A();
    }

    @dl.d
    public i0 Y() {
        return (i0) this.F.getValue();
    }

    @dl.d
    public q0 Z() {
        return this.f24772y;
    }

    @dl.e
    public NavBackStackEntry a0() {
        Object next;
        Iterator it = CollectionsKt___CollectionsKt.S4(this.f24755h).iterator();
        if (it.hasNext()) {
            it.next();
        }
        Iterator it2 = SequencesKt__SequencesKt.e(it).iterator();
        while (it2.hasNext()) {
            next = it2.next();
            if (!(((NavBackStackEntry) next).e() instanceof NavGraph)) {
                return (NavBackStackEntry) next;
            }
        }
        next = null;
        return (NavBackStackEntry) next;
    }

    @dl.d
    public androidx.lifecycle.c1 c0(@androidx.annotation.d0 int i10) {
        if (this.f24766s == null) {
            throw new IllegalStateException("You must call setViewModelStore() before calling getViewModelStoreOwner().".toString());
        }
        NavBackStackEntry navBackStackEntryN = N(i10);
        if (navBackStackEntryN.e() instanceof NavGraph) {
            return navBackStackEntryN;
        }
        throw new IllegalArgumentException(("No NavGraph with ID " + i10 + " is on the NavController's back stack").toString());
    }

    @dl.d
    public final kotlinx.coroutines.flow.u<List<NavBackStackEntry>> d0() {
        return this.f24759l;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x0068  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    @androidx.annotation.k0
    public boolean e0(@dl.e Intent intent) {
        int[] intArray;
        NavDestination.b bVarG0;
        Bundle bundleI;
        NavDestination navDestinationR0;
        NavGraph navGraph;
        Bundle bundle;
        int i10 = 0;
        if (intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras != null) {
            try {
                intArray = extras.getIntArray(R);
            } catch (Exception e10) {
                Log.e(J, "handleDeepLink() could not extract deepLink from " + intent, e10);
                intArray = null;
            }
        } else {
            intArray = null;
        }
        ArrayList parcelableArrayList = extras != null ? extras.getParcelableArrayList(S) : null;
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = extras != null ? extras.getBundle(T) : null;
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (intArray == null) {
            NavGraph navGraphB0 = b0(this.f24755h);
            bVarG0 = navGraphB0.G0(new z(intent), true, true, navGraphB0);
            if (bVarG0 != null) {
                NavDestination navDestinationB = bVarG0.b();
                int[] iArrO = NavDestination.o(navDestinationB, null, 1, null);
                bundleI = navDestinationB.i(bVarG0.c());
                if (bundleI != null) {
                    bundle2.putAll(bundleI);
                }
                intArray = iArrO;
                parcelableArrayList = null;
            }
        } else if (intArray.length == 0) {
            NavGraph navGraphB1 = b0(this.f24755h);
            bVarG0 = navGraphB1.G0(new z(intent), true, true, navGraphB1);
            if (bVarG0 != null) {
                NavDestination navDestinationB2 = bVarG0.b();
                int[] iArrO2 = NavDestination.o(navDestinationB2, null, 1, null);
                bundleI = navDestinationB2.i(bVarG0.c());
                if (bundleI != null) {
                    bundle2.putAll(bundleI);
                }
                intArray = iArrO2;
                parcelableArrayList = null;
            }
        }
        if (intArray != null) {
            if (!(intArray.length == 0)) {
                String strK = K(intArray);
                if (strK != null) {
                    Log.i(J, "Could not find destination " + strK + " in the navigation graph, ignoring the deep link from " + intent);
                    return false;
                }
                bundle2.putParcelable(V, intent);
                int length = intArray.length;
                Bundle[] bundleArr = new Bundle[length];
                for (int i11 = 0; i11 < length; i11++) {
                    Bundle bundle4 = new Bundle();
                    bundle4.putAll(bundle2);
                    if (parcelableArrayList != null && (bundle = (Bundle) parcelableArrayList.get(i11)) != null) {
                        bundle4.putAll(bundle);
                    }
                    bundleArr[i11] = bundle4;
                }
                int flags = intent.getFlags();
                int i12 = 268435456 & flags;
                if (i12 != 0 && (flags & 32768) == 0) {
                    intent.addFlags(32768);
                    q3 q3VarB = q3.i(this.f24748a).b(intent);
                    kotlin.jvm.internal.f0.o(q3VarB, "create(context).addNextI…ntWithParentStack(intent)");
                    q3VarB.u();
                    Activity activity = this.f24749b;
                    if (activity != null) {
                        activity.finish();
                        activity.overridePendingTransition(0, 0);
                    }
                    return true;
                }
                if (i12 != 0) {
                    if (!this.f24755h.isEmpty()) {
                        NavGraph navGraph2 = this.f24751d;
                        kotlin.jvm.internal.f0.m(navGraph2);
                        d1(this, navGraph2.A(), true, false, 4, null);
                    }
                    while (i10 < intArray.length) {
                        int i13 = intArray[i10];
                        int i14 = i10 + 1;
                        Bundle bundle5 = bundleArr[i10];
                        final NavDestination navDestinationH = H(this, i13, null, 2, null);
                        if (navDestinationH == null) {
                            throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.f24858l.b(this.f24748a, i13) + " cannot be found from the current destination " + U());
                        }
                        t0(navDestinationH, bundle5, k0.a(new yh.l<NavOptionsBuilder, b2>() { // from class: androidx.navigation.NavController$handleDeepLink$2
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            /* JADX WARN: Code duplicated, block: B:17:0x0042  */
                            public final void a(NavOptionsBuilder navOptions) {
                                boolean z10;
                                boolean z11;
                                kotlin.jvm.internal.f0.p(navOptions, "$this$navOptions");
                                navOptions.a(new yh.l<f, b2>() { // from class: androidx.navigation.NavController$handleDeepLink$2.1
                                    public final void a(f anim) {
                                        kotlin.jvm.internal.f0.p(anim, "$this$anim");
                                        anim.e(0);
                                        anim.f(0);
                                    }

                                    @Override // yh.l
                                    public /* bridge */ /* synthetic */ b2 invoke(f fVar) {
                                        a(fVar);
                                        return b2.f124493a;
                                    }
                                });
                                NavDestination navDestination = navDestinationH;
                                if (navDestination instanceof NavGraph) {
                                    kotlin.sequences.m<NavDestination> mVarC = NavDestination.f24858l.c(navDestination);
                                    NavController navController = this;
                                    Iterator<NavDestination> it = mVarC.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            z11 = true;
                                            break;
                                        }
                                        NavDestination next = it.next();
                                        NavDestination navDestinationU = navController.U();
                                        if (kotlin.jvm.internal.f0.g(next, navDestinationU != null ? navDestinationU.E() : null)) {
                                            z11 = false;
                                            break;
                                        }
                                    }
                                    z10 = z11;
                                }
                                if (z10 && NavController.W) {
                                    navOptions.k(NavGraph.f24890r.b(this.W()).A(), new yh.l<u0, b2>() { // from class: androidx.navigation.NavController$handleDeepLink$2.2
                                        public final void a(u0 popUpTo) {
                                            kotlin.jvm.internal.f0.p(popUpTo, "$this$popUpTo");
                                            popUpTo.d(true);
                                        }

                                        @Override // yh.l
                                        public /* bridge */ /* synthetic */ b2 invoke(u0 u0Var) {
                                            a(u0Var);
                                            return b2.f124493a;
                                        }
                                    });
                                }
                            }

                            @Override // yh.l
                            public /* bridge */ /* synthetic */ b2 invoke(NavOptionsBuilder navOptionsBuilder) {
                                a(navOptionsBuilder);
                                return b2.f124493a;
                            }
                        }), null);
                        i10 = i14;
                    }
                    this.f24754g = true;
                    return true;
                }
                NavGraph navGraph3 = this.f24751d;
                int length2 = intArray.length;
                for (int i15 = 0; i15 < length2; i15++) {
                    int i16 = intArray[i15];
                    Bundle bundle6 = bundleArr[i15];
                    if (i15 == 0) {
                        navDestinationR0 = this.f24751d;
                    } else {
                        kotlin.jvm.internal.f0.m(navGraph3);
                        navDestinationR0 = navGraph3.r0(i16);
                    }
                    if (navDestinationR0 == null) {
                        throw new IllegalStateException("Deep Linking failed: destination " + NavDestination.f24858l.b(this.f24748a, i16) + " cannot be found in graph " + navGraph3);
                    }
                    if (i15 == intArray.length - 1) {
                        j0.a aVar = new j0.a();
                        NavGraph navGraph4 = this.f24751d;
                        kotlin.jvm.internal.f0.m(navGraph4);
                        t0(navDestinationR0, bundle6, j0.a.p(aVar, navGraph4.A(), true, false, 4, null).b(0).c(0).a(), null);
                    } else if (navDestinationR0 instanceof NavGraph) {
                        while (true) {
                            navGraph = (NavGraph) navDestinationR0;
                            kotlin.jvm.internal.f0.m(navGraph);
                            if (!(navGraph.r0(navGraph.E0()) instanceof NavGraph)) {
                                break;
                            }
                            navDestinationR0 = navGraph.r0(navGraph.E0());
                        }
                        navGraph3 = navGraph;
                    }
                }
                this.f24754g = true;
                return true;
            }
        }
        return false;
    }

    @dl.d
    public final List<NavBackStackEntry> h1() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.f24773z.values().iterator();
        while (it.hasNext()) {
            Set<NavBackStackEntry> value = ((NavControllerNavigatorState) it.next()).c().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
                if ((arrayList.contains(navBackStackEntry) || navBackStackEntry.g().isAtLeast(Lifecycle.State.STARTED)) ? false : true) {
                    arrayList2.add(obj);
                }
            }
            kotlin.collections.x.n0(arrayList, arrayList2);
        }
        kotlin.collections.i<NavBackStackEntry> iVar = this.f24755h;
        ArrayList arrayList3 = new ArrayList();
        for (NavBackStackEntry navBackStackEntry2 : iVar) {
            NavBackStackEntry navBackStackEntry3 = navBackStackEntry2;
            if (!arrayList.contains(navBackStackEntry3) && navBackStackEntry3.g().isAtLeast(Lifecycle.State.STARTED)) {
                arrayList3.add(navBackStackEntry2);
            }
        }
        kotlin.collections.x.n0(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((NavBackStackEntry) obj2).e() instanceof NavGraph)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public void i1(@dl.d b listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.f24767t.remove(listener);
    }

    @androidx.annotation.k0
    public void j0(@androidx.annotation.d0 int i10) {
        k0(i10, null);
    }

    @androidx.annotation.i
    public void j1(@dl.e Bundle bundle) {
        if (bundle == null) {
            return;
        }
        bundle.setClassLoader(this.f24748a.getClassLoader());
        this.f24752e = bundle.getBundle(K);
        this.f24753f = bundle.getParcelableArray(M);
        this.f24763p.clear();
        int[] intArray = bundle.getIntArray(N);
        ArrayList<String> stringArrayList = bundle.getStringArrayList(O);
        if (intArray != null && stringArrayList != null) {
            int length = intArray.length;
            int i10 = 0;
            int i11 = 0;
            while (i10 < length) {
                this.f24762o.put(Integer.valueOf(intArray[i10]), stringArrayList.get(i11));
                i10++;
                i11++;
            }
        }
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList(P);
        if (stringArrayList2 != null) {
            for (String id2 : stringArrayList2) {
                Parcelable[] parcelableArray = bundle.getParcelableArray(Q + id2);
                if (parcelableArray != null) {
                    Map<String, kotlin.collections.i<NavBackStackEntryState>> map = this.f24763p;
                    kotlin.jvm.internal.f0.o(id2, "id");
                    kotlin.collections.i<NavBackStackEntryState> iVar = new kotlin.collections.i<>(parcelableArray.length);
                    Iterator itA = kotlin.jvm.internal.h.a(parcelableArray);
                    while (itA.hasNext()) {
                        Parcelable parcelable = (Parcelable) itA.next();
                        kotlin.jvm.internal.f0.n(parcelable, "null cannot be cast to non-null type androidx.navigation.NavBackStackEntryState");
                        iVar.add((NavBackStackEntryState) parcelable);
                    }
                    map.put(id2, iVar);
                }
            }
        }
        this.f24754g = bundle.getBoolean(U);
    }

    @androidx.annotation.k0
    public void k0(@androidx.annotation.d0 int i10, @dl.e Bundle bundle) {
        l0(i10, bundle, null);
    }

    @androidx.annotation.k0
    public void l0(@androidx.annotation.d0 int i10, @dl.e Bundle bundle, @dl.e j0 j0Var) {
        m0(i10, bundle, j0Var, null);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x003d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:41:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:55:0x0113  */
    /* JADX WARN: Code duplicated, block: B:57:0x0117  */
    /* JADX WARN: Instruction removed from duplicated block: B:51:0x00c7, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:53:0x00f6, please report this as an issue */
    @androidx.annotation.k0
    public void m0(@androidx.annotation.d0 int i10, @dl.e Bundle bundle, @dl.e j0 j0Var, @dl.e Navigator.a aVar) {
        int iB;
        Bundle bundle2;
        boolean z10;
        NavDestination navDestinationH;
        NavDestination.Companion companion;
        String strB;
        NavDestination navDestinationE = this.f24755h.isEmpty() ? this.f24751d : this.f24755h.last().e();
        if (navDestinationE == null) {
            throw new IllegalStateException("No current destination found. Ensure a navigation graph has been set for NavController " + this + lg.a.f131414g);
        }
        k kVarU = navDestinationE.u(i10);
        if (kVarU != null) {
            if (j0Var == null) {
                j0Var = kVarU.c();
            }
            iB = kVarU.b();
            Bundle bundleA = kVarU.a();
            if (bundleA != null) {
                bundle2 = new Bundle();
                bundle2.putAll(bundleA);
            }
            if (bundle != null) {
                if (bundle2 == null) {
                    bundle2 = new Bundle();
                }
                bundle2.putAll(bundle);
            }
            if (iB != 0 && j0Var != null && (j0Var.f() != -1 || j0Var.g() != null || j0Var.h() != null)) {
                if (j0Var.g() != null) {
                    String strG = j0Var.g();
                    kotlin.jvm.internal.f0.m(strG);
                    V0(this, strG, j0Var.j(), false, 4, null);
                    return;
                } else if (j0Var.h() != null) {
                    kotlin.reflect.d<?> dVarH = j0Var.h();
                    kotlin.jvm.internal.f0.m(dVarH);
                    M0(RouteSerializerKt.h(kotlinx.serialization.t.g(dVarH)), j0Var.j());
                    return;
                } else {
                    if (j0Var.f() != -1) {
                        M0(j0Var.f(), j0Var.j());
                        return;
                    }
                    return;
                }
            }
            if (iB != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
            }
            navDestinationH = H(this, iB, null, 2, null);
            if (navDestinationH == null) {
                t0(navDestinationH, bundle2, j0Var, aVar);
                return;
            }
            companion = NavDestination.f24858l;
            strB = companion.b(this.f24748a, iB);
            if (!(kVarU == null)) {
                throw new IllegalArgumentException("Navigation action/destination " + strB + " cannot be found from the current destination " + navDestinationE);
            }
            throw new IllegalArgumentException(("Navigation destination " + strB + " referenced from action " + companion.b(this.f24748a, i10) + " cannot be found from the current destination " + navDestinationE).toString());
        }
        iB = i10;
        bundle2 = null;
        if (bundle != null) {
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            bundle2.putAll(bundle);
        }
        if (iB != 0) {
        }
        if (iB != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            throw new IllegalArgumentException("Destination id == 0 can only be used in conjunction with a valid navOptions.popUpTo".toString());
        }
        navDestinationH = H(this, iB, null, 2, null);
        if (navDestinationH == null) {
            t0(navDestinationH, bundle2, j0Var, aVar);
            return;
        }
        companion = NavDestination.f24858l;
        strB = companion.b(this.f24748a, iB);
        if (!(kVarU == null)) {
            throw new IllegalArgumentException("Navigation action/destination " + strB + " cannot be found from the current destination " + navDestinationE);
        }
        throw new IllegalArgumentException(("Navigation destination " + strB + " referenced from action " + companion.b(this.f24748a, i10) + " cannot be found from the current destination " + navDestinationE).toString());
    }

    @androidx.annotation.i
    @dl.e
    public Bundle m1() {
        Bundle bundle;
        ArrayList<String> arrayList = new ArrayList<>();
        Bundle bundle2 = new Bundle();
        for (Map.Entry<String, Navigator<? extends NavDestination>> entry : this.f24772y.g().entrySet()) {
            String key = entry.getKey();
            Bundle bundleI = entry.getValue().i();
            if (bundleI != null) {
                arrayList.add(key);
                bundle2.putBundle(key, bundleI);
            }
        }
        if (!arrayList.isEmpty()) {
            bundle = new Bundle();
            bundle2.putStringArrayList(L, arrayList);
            bundle.putBundle(K, bundle2);
        } else {
            bundle = null;
        }
        if (!this.f24755h.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            Parcelable[] parcelableArr = new Parcelable[this.f24755h.size()];
            Iterator<NavBackStackEntry> it = this.f24755h.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                parcelableArr[i10] = new NavBackStackEntryState(it.next());
                i10++;
            }
            bundle.putParcelableArray(M, parcelableArr);
        }
        if (!this.f24762o.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            int[] iArr = new int[this.f24762o.size()];
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i11 = 0;
            for (Map.Entry<Integer, String> entry2 : this.f24762o.entrySet()) {
                int iIntValue = entry2.getKey().intValue();
                String value = entry2.getValue();
                iArr[i11] = iIntValue;
                arrayList2.add(value);
                i11++;
            }
            bundle.putIntArray(N, iArr);
            bundle.putStringArrayList(O, arrayList2);
        }
        if (!this.f24763p.isEmpty()) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            ArrayList<String> arrayList3 = new ArrayList<>();
            for (Map.Entry<String, kotlin.collections.i<NavBackStackEntryState>> entry3 : this.f24763p.entrySet()) {
                String key2 = entry3.getKey();
                kotlin.collections.i<NavBackStackEntryState> value2 = entry3.getValue();
                arrayList3.add(key2);
                Parcelable[] parcelableArr2 = new Parcelable[value2.size()];
                int i12 = 0;
                for (NavBackStackEntryState navBackStackEntryState : value2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        CollectionsKt__CollectionsKt.W();
                    }
                    parcelableArr2[i12] = navBackStackEntryState;
                    i12 = i13;
                }
                bundle.putParcelableArray(Q + key2, parcelableArr2);
            }
            bundle.putStringArrayList(P, arrayList3);
        }
        if (this.f24754g) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putBoolean(U, this.f24754g);
        }
        return bundle;
    }

    @androidx.annotation.k0
    public void n0(@dl.d Uri deepLink) {
        kotlin.jvm.internal.f0.p(deepLink, "deepLink");
        q0(new z(deepLink, null, null));
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void n1(@androidx.annotation.m0 int i10) {
        q1(Y().b(i10), null);
    }

    @androidx.annotation.k0
    public void o0(@dl.d Uri deepLink, @dl.e j0 j0Var) {
        kotlin.jvm.internal.f0.p(deepLink, "deepLink");
        s0(new z(deepLink, null, null), j0Var, null);
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void o1(@androidx.annotation.m0 int i10, @dl.e Bundle bundle) {
        q1(Y().b(i10), bundle);
    }

    @androidx.annotation.k0
    public void p0(@dl.d Uri deepLink, @dl.e j0 j0Var, @dl.e Navigator.a aVar) {
        kotlin.jvm.internal.f0.p(deepLink, "deepLink");
        s0(new z(deepLink, null, null), j0Var, aVar);
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void p1(@dl.d NavGraph graph) {
        kotlin.jvm.internal.f0.p(graph, "graph");
        q1(graph, null);
    }

    @androidx.annotation.k0
    public void q0(@dl.d z request) {
        kotlin.jvm.internal.f0.p(request, "request");
        r0(request, null);
    }

    @androidx.annotation.i
    @androidx.annotation.k0
    public void q1(@dl.d NavGraph graph, @dl.e Bundle bundle) {
        kotlin.jvm.internal.f0.p(graph, "graph");
        if (!(this.f24755h.isEmpty() || X() != Lifecycle.State.DESTROYED)) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.".toString());
        }
        if (!kotlin.jvm.internal.f0.g(this.f24751d, graph)) {
            NavGraph navGraph = this.f24751d;
            if (navGraph != null) {
                for (Integer id2 : new ArrayList(this.f24762o.keySet())) {
                    kotlin.jvm.internal.f0.o(id2, "id");
                    x(id2.intValue());
                }
                d1(this, navGraph.A(), true, false, 4, null);
            }
            this.f24751d = graph;
            K0(bundle);
            return;
        }
        int iX = graph.A0().x();
        for (int i10 = 0; i10 < iX; i10++) {
            NavDestination navDestinationY = graph.A0().y(i10);
            NavGraph navGraph2 = this.f24751d;
            kotlin.jvm.internal.f0.m(navGraph2);
            int iM = navGraph2.A0().m(i10);
            NavGraph navGraph3 = this.f24751d;
            kotlin.jvm.internal.f0.m(navGraph3);
            navGraph3.A0().u(iM, navDestinationY);
        }
        for (NavBackStackEntry navBackStackEntry : this.f24755h) {
            List<NavDestination> listW0 = kotlin.collections.y.W0(SequencesKt___SequencesKt.c3(NavDestination.f24858l.c(navBackStackEntry.e())));
            NavDestination navDestinationR0 = this.f24751d;
            kotlin.jvm.internal.f0.m(navDestinationR0);
            for (NavDestination navDestination : listW0) {
                if (!kotlin.jvm.internal.f0.g(navDestination, this.f24751d) || !kotlin.jvm.internal.f0.g(navDestinationR0, graph)) {
                    if (navDestinationR0 instanceof NavGraph) {
                        navDestinationR0 = ((NavGraph) navDestinationR0).r0(navDestination.A());
                        kotlin.jvm.internal.f0.m(navDestinationR0);
                    }
                }
            }
            navBackStackEntry.k(navDestinationR0);
        }
    }

    @androidx.annotation.k0
    public void r0(@dl.d z request, @dl.e j0 j0Var) {
        kotlin.jvm.internal.f0.p(request, "request");
        s0(request, j0Var, null);
    }

    public final void r1(@dl.d Lifecycle.State state) {
        kotlin.jvm.internal.f0.p(state, "<set-?>");
        this.f24768u = state;
    }

    public void s(@dl.d b listener) {
        kotlin.jvm.internal.f0.p(listener, "listener");
        this.f24767t.add(listener);
        if (!this.f24755h.isEmpty()) {
            NavBackStackEntry navBackStackEntryLast = this.f24755h.last();
            listener.a(this, navBackStackEntryLast.e(), navBackStackEntryLast.c());
        }
    }

    @androidx.annotation.k0
    public void s0(@dl.d z request, @dl.e j0 j0Var, @dl.e Navigator.a aVar) {
        kotlin.jvm.internal.f0.p(request, "request");
        if (this.f24751d == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this + lg.a.f131414g).toString());
        }
        NavGraph navGraphB0 = b0(this.f24755h);
        NavDestination.b bVarG0 = navGraphB0.G0(request, true, true, navGraphB0);
        if (bVarG0 == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this.f24751d);
        }
        Bundle bundleI = bVarG0.b().i(bVarG0.c());
        if (bundleI == null) {
            bundleI = new Bundle();
        }
        NavDestination navDestinationB = bVarG0.b();
        Intent intent = new Intent();
        intent.setDataAndType(request.c(), request.b());
        intent.setAction(request.a());
        bundleI.putParcelable(V, intent);
        t0(navDestinationB, bundleI, j0Var, aVar);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void s1(@dl.d androidx.lifecycle.y owner) {
        Lifecycle lifecycle;
        kotlin.jvm.internal.f0.p(owner, "owner");
        if (kotlin.jvm.internal.f0.g(owner, this.f24764q)) {
            return;
        }
        androidx.lifecycle.y yVar = this.f24764q;
        if (yVar != null && (lifecycle = yVar.getLifecycle()) != null) {
            lifecycle.d(this.f24769v);
        }
        this.f24764q = owner;
        owner.getLifecycle().a(this.f24769v);
    }

    @androidx.annotation.k0
    public final /* synthetic */ <T> boolean t() {
        kotlin.jvm.internal.f0.y(6, androidx.exifinterface.media.a.f23244d5);
        kotlin.jvm.internal.k0.n("kotlinx.serialization.serializer.simple");
        return u(RouteSerializerKt.h(kotlinx.serialization.t.i(null)));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void t1(@dl.d q0 navigatorProvider) {
        kotlin.jvm.internal.f0.p(navigatorProvider, "navigatorProvider");
        if (!this.f24755h.isEmpty()) {
            throw new IllegalStateException("NavigatorProvider must be set before setGraph call".toString());
        }
        this.f24772y = navigatorProvider;
    }

    @androidx.annotation.k0
    public final boolean u(@androidx.annotation.d0 int i10) {
        return x(i10) && A();
    }

    @androidx.annotation.k0
    public void u0(@dl.d c0 directions) {
        kotlin.jvm.internal.f0.p(directions, "directions");
        l0(directions.e(), directions.d(), null);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void u1(@dl.d OnBackPressedDispatcher dispatcher) {
        kotlin.jvm.internal.f0.p(dispatcher, "dispatcher");
        if (kotlin.jvm.internal.f0.g(dispatcher, this.f24765r)) {
            return;
        }
        androidx.lifecycle.y yVar = this.f24764q;
        if (yVar == null) {
            throw new IllegalStateException("You must call setLifecycleOwner() before calling setOnBackPressedDispatcher()".toString());
        }
        this.f24770w.remove();
        this.f24765r = dispatcher;
        dispatcher.c(yVar, this.f24770w);
        Lifecycle lifecycle = yVar.getLifecycle();
        lifecycle.d(this.f24769v);
        lifecycle.a(this.f24769v);
    }

    @androidx.annotation.k0
    public final <T> boolean v(@dl.d T route) {
        kotlin.jvm.internal.f0.p(route, "route");
        return y(L(route)) && A();
    }

    @androidx.annotation.k0
    public void v0(@dl.d c0 directions, @dl.e j0 j0Var) {
        kotlin.jvm.internal.f0.p(directions, "directions");
        l0(directions.e(), directions.d(), j0Var);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void v1(@dl.d b1 viewModelStore) {
        kotlin.jvm.internal.f0.p(viewModelStore, "viewModelStore");
        w wVar = this.f24766s;
        w.b bVar = w.f25328c;
        if (kotlin.jvm.internal.f0.g(wVar, bVar.a(viewModelStore))) {
            return;
        }
        if (!this.f24755h.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call".toString());
        }
        this.f24766s = bVar.a(viewModelStore);
    }

    @androidx.annotation.k0
    public final boolean w(@dl.d String route) {
        kotlin.jvm.internal.f0.p(route, "route");
        return y(route) && A();
    }

    @androidx.annotation.k0
    public void w0(@dl.d c0 directions, @dl.d Navigator.a navigatorExtras) {
        kotlin.jvm.internal.f0.p(directions, "directions");
        kotlin.jvm.internal.f0.p(navigatorExtras, "navigatorExtras");
        m0(directions.e(), directions.d(), null, navigatorExtras);
    }

    @androidx.annotation.k0
    @xh.i
    public final <T> void x0(@dl.d T route) {
        kotlin.jvm.internal.f0.p(route, "route");
        F0(this, route, null, null, 6, null);
    }

    @androidx.annotation.k0
    @xh.i
    public final <T> void y0(@dl.d T route, @dl.e j0 j0Var) {
        kotlin.jvm.internal.f0.p(route, "route");
        F0(this, route, j0Var, null, 4, null);
    }

    @dl.e
    public final NavBackStackEntry y1(@dl.d NavBackStackEntry child) {
        kotlin.jvm.internal.f0.p(child, "child");
        NavBackStackEntry navBackStackEntryRemove = this.f24760m.remove(child);
        if (navBackStackEntryRemove == null) {
            return null;
        }
        AtomicInteger atomicInteger = this.f24761n.get(navBackStackEntryRemove);
        Integer numValueOf = atomicInteger != null ? Integer.valueOf(atomicInteger.decrementAndGet()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            NavControllerNavigatorState navControllerNavigatorState = this.f24773z.get(this.f24772y.f(navBackStackEntryRemove.e().D()));
            if (navControllerNavigatorState != null) {
                navControllerNavigatorState.e(navBackStackEntryRemove);
            }
            this.f24761n.remove(navBackStackEntryRemove);
        }
        return navBackStackEntryRemove;
    }

    @dl.d
    public NavDeepLinkBuilder z() {
        return new NavDeepLinkBuilder(this);
    }

    @androidx.annotation.k0
    @xh.i
    public final <T> void z0(@dl.d T route, @dl.e j0 j0Var, @dl.e Navigator.a aVar) {
        kotlin.jvm.internal.f0.p(route, "route");
        D0(L(route), j0Var, aVar);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00c9  */
    public final void z1() {
        kotlinx.coroutines.flow.u<Set<NavBackStackEntry>> uVarC;
        Set<NavBackStackEntry> value;
        List<NavBackStackEntry> listT5 = CollectionsKt___CollectionsKt.T5(this.f24755h);
        if (listT5.isEmpty()) {
            return;
        }
        NavDestination navDestinationE = ((NavBackStackEntry) CollectionsKt___CollectionsKt.k3(listT5)).e();
        ArrayList arrayList = new ArrayList();
        if (navDestinationE instanceof h) {
            Iterator it = CollectionsKt___CollectionsKt.S4(listT5).iterator();
            while (it.hasNext()) {
                NavDestination navDestinationE2 = ((NavBackStackEntry) it.next()).e();
                arrayList.add(navDestinationE2);
                if (!(navDestinationE2 instanceof h) && !(navDestinationE2 instanceof NavGraph)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (NavBackStackEntry navBackStackEntry : CollectionsKt___CollectionsKt.S4(listT5)) {
            Lifecycle.State stateG = navBackStackEntry.g();
            NavDestination navDestinationE3 = navBackStackEntry.e();
            if (navDestinationE != null && navDestinationE3.A() == navDestinationE.A()) {
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (stateG != state) {
                    NavControllerNavigatorState navControllerNavigatorState = this.f24773z.get(Z().f(navBackStackEntry.e().D()));
                    if (kotlin.jvm.internal.f0.g((navControllerNavigatorState == null || (uVarC = navControllerNavigatorState.c()) == null || (value = uVarC.getValue()) == null) ? null : Boolean.valueOf(value.contains(navBackStackEntry)), Boolean.TRUE)) {
                        map.put(navBackStackEntry, Lifecycle.State.STARTED);
                    } else {
                        AtomicInteger atomicInteger = this.f24761n.get(navBackStackEntry);
                        if (atomicInteger != null && atomicInteger.get() == 0) {
                            map.put(navBackStackEntry, Lifecycle.State.STARTED);
                        } else {
                            map.put(navBackStackEntry, state);
                        }
                    }
                }
                NavDestination navDestination = (NavDestination) CollectionsKt___CollectionsKt.B2(arrayList);
                if (navDestination != null && navDestination.A() == navDestinationE3.A()) {
                    kotlin.collections.x.J0(arrayList);
                }
                navDestinationE = navDestinationE.E();
            } else if ((true ^ arrayList.isEmpty()) && navDestinationE3.A() == ((NavDestination) CollectionsKt___CollectionsKt.w2(arrayList)).A()) {
                NavDestination navDestination2 = (NavDestination) kotlin.collections.x.J0(arrayList);
                if (stateG == Lifecycle.State.RESUMED) {
                    navBackStackEntry.l(Lifecycle.State.STARTED);
                } else {
                    Lifecycle.State state2 = Lifecycle.State.STARTED;
                    if (stateG != state2) {
                        map.put(navBackStackEntry, state2);
                    }
                }
                NavGraph navGraphE = navDestination2.E();
                if (navGraphE != null && !arrayList.contains(navGraphE)) {
                    arrayList.add(navGraphE);
                }
            } else {
                navBackStackEntry.l(Lifecycle.State.CREATED);
            }
        }
        for (NavBackStackEntry navBackStackEntry2 : listT5) {
            Lifecycle.State state3 = (Lifecycle.State) map.get(navBackStackEntry2);
            if (state3 != null) {
                navBackStackEntry2.l(state3);
            } else {
                navBackStackEntry2.m();
            }
        }
    }
}
