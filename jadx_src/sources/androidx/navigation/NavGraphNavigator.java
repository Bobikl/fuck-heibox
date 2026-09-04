package androidx.navigation;

import android.os.Bundle;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Ref;

/* JADX INFO: compiled from: NavGraphNavigator.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavGraphNavigator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphNavigator.kt\nandroidx/navigation/NavGraphNavigator\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1#2:129\n*E\n"})
@Navigator.b(androidx.core.app.o0.F0)
public class NavGraphNavigator extends Navigator<NavGraph> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final q0 f24908c;

    public NavGraphNavigator(@dl.d q0 navigatorProvider) {
        kotlin.jvm.internal.f0.p(navigatorProvider, "navigatorProvider");
        this.f24908c = navigatorProvider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v6, types: [T, android.os.Bundle] */
    /* JADX WARN: Type inference failed for: r7v1, types: [T, android.os.Bundle] */
    private final void n(NavBackStackEntry navBackStackEntry, j0 j0Var, Navigator.a aVar) {
        NavDestination navDestinationE = navBackStackEntry.e();
        kotlin.jvm.internal.f0.n(navDestinationE, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        NavGraph navGraph = (NavGraph) navDestinationE;
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.f124891b = navBackStackEntry.c();
        int iE0 = navGraph.E0();
        String strF0 = navGraph.F0();
        if (!((iE0 == 0 && strF0 == null) ? false : true)) {
            throw new IllegalStateException(("no start destination defined via app:startDestination for " + navGraph.w()).toString());
        }
        NavDestination navDestinationU0 = strF0 != null ? navGraph.u0(strF0, false) : navGraph.A0().g(iE0);
        if (navDestinationU0 == null) {
            throw new IllegalArgumentException("navigation destination " + navGraph.C0() + " is not a direct child of this NavGraph");
        }
        if (strF0 != null) {
            if (!kotlin.jvm.internal.f0.g(strF0, navDestinationU0.F())) {
                NavDestination.b bVarQ = navDestinationU0.Q(strF0);
                Bundle bundleC = bVarQ != null ? bVarQ.c() : null;
                if (bundleC != null && !bundleC.isEmpty()) {
                    ?? bundle = new Bundle();
                    bundle.putAll(bundleC);
                    T t10 = objectRef.f124891b;
                    if (((Bundle) t10) != null) {
                        bundle.putAll((Bundle) t10);
                    }
                    objectRef.f124891b = bundle;
                }
            }
            if (!navDestinationU0.v().isEmpty()) {
                List<String> listA = s.a(navDestinationU0.v(), new yh.l<String, Boolean>() { // from class: androidx.navigation.NavGraphNavigator$navigate$missingRequiredArgs$1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // yh.l
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Boolean invoke(String key) {
                        kotlin.jvm.internal.f0.p(key, "key");
                        Bundle bundle2 = objectRef.f124891b;
                        boolean z10 = true;
                        if (bundle2 != null && bundle2.containsKey(key)) {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    }
                });
                if (!listA.isEmpty()) {
                    throw new IllegalArgumentException(("Cannot navigate to startDestination " + navDestinationU0 + ". Missing required arguments [" + listA + ']').toString());
                }
            }
        }
        this.f24908c.f(navDestinationU0.D()).e(kotlin.collections.s.k(b().a(navDestinationU0, navDestinationU0.i((Bundle) objectRef.f124891b))), j0Var, aVar);
    }

    @Override // androidx.navigation.Navigator
    public void e(@dl.d List<NavBackStackEntry> entries, @dl.e j0 j0Var, @dl.e Navigator.a aVar) {
        kotlin.jvm.internal.f0.p(entries, "entries");
        Iterator<NavBackStackEntry> it = entries.iterator();
        while (it.hasNext()) {
            n(it.next(), j0Var, aVar);
        }
    }

    @Override // androidx.navigation.Navigator
    @dl.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public NavGraph a() {
        return new NavGraph(this);
    }

    @dl.d
    public final kotlinx.coroutines.flow.u<List<NavBackStackEntry>> m() {
        return b().b();
    }
}
