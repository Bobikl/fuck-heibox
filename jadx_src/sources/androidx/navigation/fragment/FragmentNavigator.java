package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i0;
import androidx.fragment.app.p0;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b1;
import androidx.lifecycle.j0;
import androidx.lifecycle.v;
import androidx.lifecycle.w0;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import androidx.navigation.q0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.b2;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.s0;
import kotlin.collections.x;
import kotlin.jvm.internal.a0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlin.sequences.SequencesKt___SequencesKt;

/* JADX INFO: compiled from: FragmentNavigator.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n+ 2 InitializerViewModelFactory.kt\nandroidx/lifecycle/viewmodel/InitializerViewModelFactoryKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,712:1\n31#2:713\n63#2,2:714\n766#3:716\n857#3,2:717\n1855#3,2:719\n518#3,7:721\n533#3,6:728\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator\n*L\n268#1:713\n268#1:714,2\n314#1:716\n314#1:717,2\n322#1:719,2\n99#1:721,7\n148#1:728,6\n*E\n"})
@Navigator.b("fragment")
public class FragmentNavigator extends Navigator<c> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private static final b f25086j = new b(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private static final String f25087k = "FragmentNavigator";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private static final String f25088l = "androidx-nav-fragment:navigator:savedIds";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Context f25089c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final FragmentManager f25090d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f25091e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final Set<String> f25092f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final List<Pair<String, Boolean>> f25093g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final v f25094h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final yh.l<NavBackStackEntry, v> f25095i;

    /* JADX INFO: compiled from: FragmentNavigator.kt */
    public static final class a extends w0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public WeakReference<yh.a<b2>> f25096b;

        @dl.d
        public final WeakReference<yh.a<b2>> c() {
            WeakReference<yh.a<b2>> weakReference = this.f25096b;
            if (weakReference != null) {
                return weakReference;
            }
            f0.S("completeTransition");
            return null;
        }

        public final void e(@dl.d WeakReference<yh.a<b2>> weakReference) {
            f0.p(weakReference, "<set-?>");
            this.f25096b = weakReference;
        }

        @Override // androidx.lifecycle.w0
        protected void onCleared() {
            super.onCleared();
            yh.a<b2> aVar = c().get();
            if (aVar != null) {
                aVar.invoke();
            }
        }
    }

    /* JADX INFO: compiled from: FragmentNavigator.kt */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: FragmentNavigator.kt */
    @t0({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n+ 2 TypedArray.kt\nandroidx/core/content/res/TypedArrayKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,712:1\n232#2,3:713\n1#3:716\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$Destination\n*L\n570#1:713,3\n*E\n"})
    @NavDestination.a(Fragment.class)
    public static class c extends NavDestination {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @dl.e
        private String f25106n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@dl.d Navigator<? extends c> fragmentNavigator) {
            super(fragmentNavigator);
            f0.p(fragmentNavigator, "fragmentNavigator");
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public c(@dl.d q0 navigatorProvider) {
            this((Navigator<? extends c>) navigatorProvider.e(FragmentNavigator.class));
            f0.p(navigatorProvider, "navigatorProvider");
        }

        @Override // androidx.navigation.NavDestination
        @androidx.annotation.i
        public void R(@dl.d Context context, @dl.d AttributeSet attrs) {
            f0.p(context, "context");
            f0.p(attrs, "attrs");
            super.R(context, attrs);
            TypedArray typedArrayObtainAttributes = context.getResources().obtainAttributes(attrs, R.styleable.f25125b);
            f0.o(typedArrayObtainAttributes, "context.resources.obtain…leable.FragmentNavigator)");
            String string = typedArrayObtainAttributes.getString(R.styleable.FragmentNavigator_android_name);
            if (string != null) {
                k0(string);
            }
            b2 b2Var = b2.f124493a;
            typedArrayObtainAttributes.recycle();
        }

        @Override // androidx.navigation.NavDestination
        public boolean equals(@dl.e Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !(obj instanceof c)) {
                return false;
            }
            return super.equals(obj) && f0.g(this.f25106n, ((c) obj).f25106n);
        }

        @Override // androidx.navigation.NavDestination
        public int hashCode() {
            int iHashCode = super.hashCode() * 31;
            String str = this.f25106n;
            return iHashCode + (str != null ? str.hashCode() : 0);
        }

        @dl.d
        public final String i0() {
            String str = this.f25106n;
            if (str == null) {
                throw new IllegalStateException("Fragment class was not set".toString());
            }
            f0.n(str, "null cannot be cast to non-null type kotlin.String");
            return str;
        }

        @dl.d
        public final c k0(@dl.d String className) {
            f0.p(className, "className");
            this.f25106n = className;
            return this;
        }

        @Override // androidx.navigation.NavDestination
        @dl.d
        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(super.toString());
            sb2.append(" class=");
            String str = this.f25106n;
            if (str == null) {
                sb2.append("null");
            } else {
                sb2.append(str);
            }
            String string = sb2.toString();
            f0.o(string, "sb.toString()");
            return string;
        }
    }

    /* JADX INFO: compiled from: FragmentNavigator.kt */
    public static final class d implements Navigator.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final LinkedHashMap<View, String> f25107a;

        /* JADX INFO: compiled from: FragmentNavigator.kt */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            @dl.d
            private final LinkedHashMap<View, String> f25108a = new LinkedHashMap<>();

            @dl.d
            public final a a(@dl.d View sharedElement, @dl.d String name) {
                f0.p(sharedElement, "sharedElement");
                f0.p(name, "name");
                this.f25108a.put(sharedElement, name);
                return this;
            }

            @dl.d
            public final a b(@dl.d Map<View, String> sharedElements) {
                f0.p(sharedElements, "sharedElements");
                for (Map.Entry<View, String> entry : sharedElements.entrySet()) {
                    a(entry.getKey(), entry.getValue());
                }
                return this;
            }

            @dl.d
            public final d c() {
                return new d(this.f25108a);
            }
        }

        public d(@dl.d Map<View, String> sharedElements) {
            f0.p(sharedElements, "sharedElements");
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this.f25107a = linkedHashMap;
            linkedHashMap.putAll(sharedElements);
        }

        @dl.d
        public final Map<View, String> a() {
            return s0.D0(this.f25107a);
        }
    }

    /* JADX INFO: compiled from: FragmentNavigator.kt */
    @t0({"SMAP\nFragmentNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$onAttach$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,712:1\n533#2,6:713\n533#2,6:720\n288#2,2:726\n1#3:719\n*S KotlinDebug\n*F\n+ 1 FragmentNavigator.kt\nandroidx/navigation/fragment/FragmentNavigator$onAttach$2\n*L\n174#1:713,6\n188#1:720,6\n195#1:726,2\n*E\n"})
    public static final class e implements FragmentManager.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.navigation.s0 f25109a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FragmentNavigator f25110b;

        e(androidx.navigation.s0 s0Var, FragmentNavigator fragmentNavigator) {
            this.f25109a = s0Var;
            this.f25110b = fragmentNavigator;
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public void a(Fragment fragment, boolean z10) {
            NavBackStackEntry navBackStackEntryPrevious;
            f0.p(fragment, "fragment");
            if (z10) {
                List<NavBackStackEntry> value = this.f25109a.b().getValue();
                ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
                do {
                    if (!listIterator.hasPrevious()) {
                        navBackStackEntryPrevious = null;
                        break;
                    }
                    navBackStackEntryPrevious = listIterator.previous();
                } while (!f0.g(navBackStackEntryPrevious.f(), fragment.getTag()));
                NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
                if (this.f25110b.A(2)) {
                    Log.v(FragmentNavigator.f25087k, "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + navBackStackEntry);
                }
                if (navBackStackEntry != null) {
                    this.f25109a.j(navBackStackEntry);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public void b(Fragment fragment, boolean z10) {
            Object obj;
            Object objPrevious;
            f0.p(fragment, "fragment");
            List listY4 = CollectionsKt___CollectionsKt.y4(this.f25109a.b().getValue(), this.f25109a.c().getValue());
            ListIterator listIterator = listY4.listIterator(listY4.size());
            do {
                obj = null;
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!f0.g(((NavBackStackEntry) objPrevious).f(), fragment.getTag()));
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) objPrevious;
            boolean z11 = z10 && this.f25110b.y().isEmpty() && fragment.isRemoving();
            for (Object obj2 : this.f25110b.y()) {
                if (f0.g(((Pair) obj2).e(), fragment.getTag())) {
                    obj = obj2;
                    break;
                }
            }
            Pair pair = (Pair) obj;
            if (pair != null) {
                this.f25110b.y().remove(pair);
            }
            if (!z11 && this.f25110b.A(2)) {
                Log.v(FragmentNavigator.f25087k, "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + navBackStackEntry);
            }
            boolean z12 = pair != null && ((Boolean) pair.f()).booleanValue();
            if (!z10 && !z12 && navBackStackEntry == null) {
                throw new IllegalArgumentException(("The fragment " + fragment + " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager.").toString());
            }
            if (navBackStackEntry != null) {
                this.f25110b.s(fragment, navBackStackEntry, this.f25109a);
                if (z11) {
                    if (this.f25110b.A(2)) {
                        Log.v(FragmentNavigator.f25087k, "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + navBackStackEntry + " via system back");
                    }
                    this.f25109a.i(navBackStackEntry, false);
                }
            }
        }

        @Override // androidx.fragment.app.FragmentManager.o
        public void onBackStackChanged() {
        }
    }

    /* JADX INFO: compiled from: FragmentNavigator.kt */
    public static final /* synthetic */ class f implements j0, a0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ yh.l f25111a;

        f(yh.l function) {
            f0.p(function, "function");
            this.f25111a = function;
        }

        @Override // androidx.lifecycle.j0
        public final /* synthetic */ void a(Object obj) {
            this.f25111a.invoke(obj);
        }

        @Override // kotlin.jvm.internal.a0
        @dl.d
        public final kotlin.u<?> b() {
            return this.f25111a;
        }

        public final boolean equals(@dl.e Object obj) {
            if ((obj instanceof j0) && (obj instanceof a0)) {
                return f0.g(b(), ((a0) obj).b());
            }
            return false;
        }

        public final int hashCode() {
            return b().hashCode();
        }
    }

    public FragmentNavigator(@dl.d Context context, @dl.d FragmentManager fragmentManager, int i10) {
        f0.p(context, "context");
        f0.p(fragmentManager, "fragmentManager");
        this.f25089c = context;
        this.f25090d = fragmentManager;
        this.f25091e = i10;
        this.f25092f = new LinkedHashSet();
        this.f25093g = new ArrayList();
        this.f25094h = new v() { // from class: androidx.navigation.fragment.f
            @Override // androidx.lifecycle.v
            public final void d(y yVar, Lifecycle.Event event) {
                FragmentNavigator.w(this.f25135b, yVar, event);
            }
        };
        this.f25095i = new FragmentNavigator$fragmentViewObserver$1(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A(int i10) {
        return Log.isLoggable(FragmentManager.X, i10) || Log.isLoggable(f25087k, i10);
    }

    private final void B(NavBackStackEntry navBackStackEntry, androidx.navigation.j0 j0Var, Navigator.a aVar) {
        boolean zIsEmpty = b().b().getValue().isEmpty();
        if (j0Var != null && !zIsEmpty && j0Var.m() && this.f25092f.remove(navBackStackEntry.f())) {
            this.f25090d.K1(navBackStackEntry.f());
            b().l(navBackStackEntry);
            return;
        }
        p0 p0VarV = v(navBackStackEntry, j0Var);
        if (!zIsEmpty) {
            NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt___CollectionsKt.q3(b().b().getValue());
            if (navBackStackEntry2 != null) {
                r(this, navBackStackEntry2.f(), false, false, 6, null);
            }
            r(this, navBackStackEntry.f(), false, false, 6, null);
            p0VarV.k(navBackStackEntry.f());
        }
        if (aVar instanceof d) {
            for (Map.Entry<View, String> entry : ((d) aVar).a().entrySet()) {
                p0VarV.j(entry.getKey(), entry.getValue());
            }
        }
        p0VarV.m();
        if (A(2)) {
            Log.v(f25087k, "Calling pushWithTransition via navigate() on entry " + navBackStackEntry);
        }
        b().l(navBackStackEntry);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(androidx.navigation.s0 state, FragmentNavigator this$0, FragmentManager fragmentManager, Fragment fragment) {
        NavBackStackEntry navBackStackEntryPrevious;
        f0.p(state, "$state");
        f0.p(this$0, "this$0");
        f0.p(fragmentManager, "<anonymous parameter 0>");
        f0.p(fragment, "fragment");
        List<NavBackStackEntry> value = state.b().getValue();
        ListIterator<NavBackStackEntry> listIterator = value.listIterator(value.size());
        do {
            if (!listIterator.hasPrevious()) {
                navBackStackEntryPrevious = null;
                break;
            }
            navBackStackEntryPrevious = listIterator.previous();
        } while (!f0.g(navBackStackEntryPrevious.f(), fragment.getTag()));
        NavBackStackEntry navBackStackEntry = navBackStackEntryPrevious;
        if (this$0.A(2)) {
            Log.v(f25087k, "Attaching fragment " + fragment + " associated with entry " + navBackStackEntry + " to FragmentManager " + this$0.f25090d);
        }
        if (navBackStackEntry != null) {
            this$0.t(navBackStackEntry, fragment);
            this$0.s(fragment, navBackStackEntry, state);
        }
    }

    private final void q(final String str, boolean z10, boolean z11) {
        if (z11) {
            x.I0(this.f25093g, new yh.l<Pair<? extends String, ? extends Boolean>, Boolean>() { // from class: androidx.navigation.fragment.FragmentNavigator$addPendingOps$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(Pair<String, Boolean> it) {
                    f0.p(it, "it");
                    return Boolean.valueOf(f0.g(it.e(), str));
                }
            });
        }
        this.f25093g.add(c1.a(str, Boolean.valueOf(z10)));
    }

    static /* synthetic */ void r(FragmentNavigator fragmentNavigator, String str, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
        }
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = true;
        }
        fragmentNavigator.q(str, z10, z11);
    }

    private final void t(final NavBackStackEntry navBackStackEntry, final Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().k(fragment, new f(new yh.l<y, b2>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachObservers$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(y yVar) {
                List<Pair<String, Boolean>> listY = this.f25103b.y();
                Fragment fragment2 = fragment;
                boolean z10 = false;
                if (!(listY instanceof Collection) || !listY.isEmpty()) {
                    Iterator<T> it = listY.iterator();
                    while (it.hasNext()) {
                        if (f0.g(((Pair) it.next()).e(), fragment2.getTag())) {
                            z10 = true;
                            break;
                        }
                    }
                }
                if (yVar == null || z10) {
                    return;
                }
                Lifecycle lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
                if (lifecycle.b().isAtLeast(Lifecycle.State.CREATED)) {
                    lifecycle.a((androidx.lifecycle.x) this.f25103b.f25095i.invoke(navBackStackEntry));
                }
            }

            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(y yVar) {
                a(yVar);
                return b2.f124493a;
            }
        }));
        fragment.getLifecycle().a(this.f25094h);
    }

    private final p0 v(NavBackStackEntry navBackStackEntry, androidx.navigation.j0 j0Var) {
        NavDestination navDestinationE = navBackStackEntry.e();
        f0.n(navDestinationE, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle bundleC = navBackStackEntry.c();
        String strI0 = ((c) navDestinationE).i0();
        if (strI0.charAt(0) == '.') {
            strI0 = this.f25089c.getPackageName() + strI0;
        }
        Fragment fragmentA = this.f25090d.H0().a(this.f25089c.getClassLoader(), strI0);
        f0.o(fragmentA, "fragmentManager.fragment…t.classLoader, className)");
        fragmentA.setArguments(bundleC);
        p0 p0VarU = this.f25090d.u();
        f0.o(p0VarU, "fragmentManager.beginTransaction()");
        int iA = j0Var != null ? j0Var.a() : -1;
        int iB = j0Var != null ? j0Var.b() : -1;
        int iC = j0Var != null ? j0Var.c() : -1;
        int iD = j0Var != null ? j0Var.d() : -1;
        if (iA != -1 || iB != -1 || iC != -1 || iD != -1) {
            if (iA == -1) {
                iA = 0;
            }
            if (iB == -1) {
                iB = 0;
            }
            if (iC == -1) {
                iC = 0;
            }
            p0VarU.J(iA, iB, iC, iD != -1 ? iD : 0);
        }
        p0VarU.z(this.f25091e, fragmentA, navBackStackEntry.f());
        p0VarU.L(fragmentA);
        p0VarU.M(true);
        return p0VarU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void w(FragmentNavigator this$0, y source, Lifecycle.Event event) {
        f0.p(this$0, "this$0");
        f0.p(source, "source");
        f0.p(event, "event");
        if (event == Lifecycle.Event.ON_DESTROY) {
            Fragment fragment = (Fragment) source;
            Object obj = null;
            for (Object obj2 : this$0.b().c().getValue()) {
                if (f0.g(((NavBackStackEntry) obj2).f(), fragment.getTag())) {
                    obj = obj2;
                }
            }
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
            if (navBackStackEntry != null) {
                if (this$0.A(2)) {
                    Log.v(f25087k, "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + source + " lifecycle reaching DESTROYED");
                }
                this$0.b().e(navBackStackEntry);
            }
        }
    }

    @Override // androidx.navigation.Navigator
    public void e(@dl.d List<NavBackStackEntry> entries, @dl.e androidx.navigation.j0 j0Var, @dl.e Navigator.a aVar) {
        f0.p(entries, "entries");
        if (this.f25090d.e1()) {
            Log.i(f25087k, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            B(it.next(), j0Var, aVar);
        }
    }

    @Override // androidx.navigation.Navigator
    public void f(@dl.d final androidx.navigation.s0 state) {
        f0.p(state, "state");
        super.f(state);
        if (A(2)) {
            Log.v(f25087k, "onAttach");
        }
        this.f25090d.o(new i0() { // from class: androidx.navigation.fragment.g
            @Override // androidx.fragment.app.i0
            public final void a(FragmentManager fragmentManager, Fragment fragment) {
                FragmentNavigator.C(state, this, fragmentManager, fragment);
            }
        });
        this.f25090d.p(new e(state, this));
    }

    @Override // androidx.navigation.Navigator
    public void g(@dl.d NavBackStackEntry backStackEntry) {
        f0.p(backStackEntry, "backStackEntry");
        if (this.f25090d.e1()) {
            Log.i(f25087k, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        p0 p0VarV = v(backStackEntry, null);
        List<NavBackStackEntry> value = b().b().getValue();
        if (value.size() > 1) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt___CollectionsKt.R2(value, CollectionsKt__CollectionsKt.G(value) - 1);
            if (navBackStackEntry != null) {
                r(this, navBackStackEntry.f(), false, false, 6, null);
            }
            r(this, backStackEntry.f(), true, false, 4, null);
            this.f25090d.v1(backStackEntry.f(), 1);
            r(this, backStackEntry.f(), false, false, 2, null);
            p0VarV.k(backStackEntry.f());
        }
        p0VarV.m();
        b().f(backStackEntry);
    }

    @Override // androidx.navigation.Navigator
    public void h(@dl.d Bundle savedState) {
        f0.p(savedState, "savedState");
        ArrayList<String> stringArrayList = savedState.getStringArrayList(f25088l);
        if (stringArrayList != null) {
            this.f25092f.clear();
            x.n0(this.f25092f, stringArrayList);
        }
    }

    @Override // androidx.navigation.Navigator
    @dl.e
    public Bundle i() {
        if (this.f25092f.isEmpty()) {
            return null;
        }
        return androidx.core.os.e.b(c1.a(f25088l, new ArrayList(this.f25092f)));
    }

    @Override // androidx.navigation.Navigator
    public void j(@dl.d NavBackStackEntry popUpTo, boolean z10) {
        f0.p(popUpTo, "popUpTo");
        if (this.f25090d.e1()) {
            Log.i(f25087k, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List<NavBackStackEntry> value = b().b().getValue();
        int iIndexOf = value.indexOf(popUpTo);
        List<NavBackStackEntry> listSubList = value.subList(iIndexOf, value.size());
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) CollectionsKt___CollectionsKt.w2(value);
        NavBackStackEntry navBackStackEntry2 = (NavBackStackEntry) CollectionsKt___CollectionsKt.R2(value, iIndexOf - 1);
        if (navBackStackEntry2 != null) {
            r(this, navBackStackEntry2.f(), false, false, 6, null);
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj : listSubList) {
            NavBackStackEntry navBackStackEntry3 = (NavBackStackEntry) obj;
            if (SequencesKt___SequencesKt.f0(SequencesKt___SequencesKt.k1(CollectionsKt___CollectionsKt.v1(this.f25093g), new yh.l<Pair<? extends String, ? extends Boolean>, String>() { // from class: androidx.navigation.fragment.FragmentNavigator$popBackStack$1$1
                @Override // yh.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(Pair<String, Boolean> it) {
                    f0.p(it, "it");
                    return it.e();
                }
            }), navBackStackEntry3.f()) || !f0.g(navBackStackEntry3.f(), navBackStackEntry.f())) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            r(this, ((NavBackStackEntry) it.next()).f(), true, false, 4, null);
        }
        if (z10) {
            for (NavBackStackEntry navBackStackEntry4 : CollectionsKt___CollectionsKt.S4(listSubList)) {
                if (f0.g(navBackStackEntry4, navBackStackEntry)) {
                    Log.i(f25087k, "FragmentManager cannot save the state of the initial destination " + navBackStackEntry4);
                } else {
                    this.f25090d.S1(navBackStackEntry4.f());
                    this.f25092f.add(navBackStackEntry4.f());
                }
            }
        } else {
            this.f25090d.v1(popUpTo.f(), 1);
        }
        if (A(2)) {
            Log.v(f25087k, "Calling popWithTransition via popBackStack() on entry " + popUpTo + " with savedState " + z10);
        }
        b().i(popUpTo, z10);
    }

    public final void s(@dl.d final Fragment fragment, @dl.d final NavBackStackEntry entry, @dl.d final androidx.navigation.s0 state) {
        f0.p(fragment, "fragment");
        f0.p(entry, "entry");
        f0.p(state, "state");
        b1 viewModelStore = fragment.getViewModelStore();
        f0.o(viewModelStore, "fragment.viewModelStore");
        u2.c cVar = new u2.c();
        cVar.a(n0.d(a.class), new yh.l<u2.a, a>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachClearViewModel$viewModel$1$1
            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final FragmentNavigator.a invoke(u2.a initializer) {
                f0.p(initializer, "$this$initializer");
                return new FragmentNavigator.a();
            }
        });
        ((a) new y0(viewModelStore, cVar.b(), u2.a.C1270a.f140743b).a(a.class)).e(new WeakReference<>(new yh.a<b2>() { // from class: androidx.navigation.fragment.FragmentNavigator$attachClearViewModel$1
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
                androidx.navigation.s0 s0Var = state;
                FragmentNavigator fragmentNavigator = this;
                Fragment fragment2 = fragment;
                for (NavBackStackEntry navBackStackEntry : s0Var.c().getValue()) {
                    if (fragmentNavigator.A(2)) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + navBackStackEntry + " due to fragment " + fragment2 + " viewmodel being cleared");
                    }
                    s0Var.e(navBackStackEntry);
                }
            }
        }));
    }

    @Override // androidx.navigation.Navigator
    @dl.d
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public c a() {
        return new c(this);
    }

    @dl.d
    public final kotlinx.coroutines.flow.u<List<NavBackStackEntry>> x() {
        return b().b();
    }

    @dl.d
    public final List<Pair<String, Boolean>> y() {
        return this.f25093g;
    }

    @dl.d
    @kotlin.k(message = "Set a custom {@link androidx.fragment.app.FragmentFactory} via\n      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control\n      instantiation of Fragments.")
    public Fragment z(@dl.d Context context, @dl.d FragmentManager fragmentManager, @dl.d String className, @dl.e Bundle bundle) {
        f0.p(context, "context");
        f0.p(fragmentManager, "fragmentManager");
        f0.p(className, "className");
        Fragment fragmentA = fragmentManager.H0().a(context.getClassLoader(), className);
        f0.o(fragmentA, "fragmentManager.fragment…t.classLoader, className)");
        return fragmentA;
    }
}
