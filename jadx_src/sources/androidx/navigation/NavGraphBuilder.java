package androidx.navigation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.reflect.r;

/* JADX INFO: compiled from: NavGraphBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@b0
@kotlin.jvm.internal.t0({"SMAP\nNavGraphBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,305:1\n157#2:306\n157#2:307\n157#2:308\n157#2:309\n*S KotlinDebug\n*F\n+ 1 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilder\n*L\n197#1:306\n214#1:307\n235#1:308\n256#1:309\n*E\n"})
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final q0 f24901i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.d0
    private int f24902j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private String f24903k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private kotlin.reflect.d<?> f24904l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private Object f24905m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final List<NavDestination> f24906n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @kotlin.k(message = "Use routes to build your NavGraph instead", replaceWith = @kotlin.s0(expression = "NavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public NavGraphBuilder(@dl.d q0 provider, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11) {
        super(provider.e(NavGraphNavigator.class), i10);
        kotlin.jvm.internal.f0.p(provider, "provider");
        this.f24906n = new ArrayList();
        this.f24901i = provider;
        this.f24902j = i11;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(@dl.d q0 provider, @dl.d Object startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap) {
        super(provider.e(NavGraphNavigator.class), dVar, typeMap);
        kotlin.jvm.internal.f0.p(provider, "provider");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        this.f24906n = new ArrayList();
        this.f24901i = provider;
        this.f24905m = startDestination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(@dl.d q0 provider, @dl.d String startDestination, @dl.e String str) {
        super(provider.e(NavGraphNavigator.class), str);
        kotlin.jvm.internal.f0.p(provider, "provider");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        this.f24906n = new ArrayList();
        this.f24901i = provider;
        this.f24903k = startDestination;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(@dl.d q0 provider, @dl.d kotlin.reflect.d<?> startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap) {
        super(provider.e(NavGraphNavigator.class), dVar, typeMap);
        kotlin.jvm.internal.f0.p(provider, "provider");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        this.f24906n = new ArrayList();
        this.f24901i = provider;
        this.f24904l = startDestination;
    }

    public final void q(@dl.d NavDestination destination) {
        kotlin.jvm.internal.f0.p(destination, "destination");
        this.f24906n.add(destination);
    }

    @Override // androidx.navigation.NavDestinationBuilder
    @dl.d
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public NavGraph d() {
        NavGraph navGraph = (NavGraph) super.d();
        navGraph.l0(this.f24906n);
        int i10 = this.f24902j;
        if (i10 == 0 && this.f24903k == null && this.f24904l == null && this.f24905m == null) {
            if (n() != null) {
                throw new IllegalStateException("You must set a start destination route");
            }
            throw new IllegalStateException("You must set a start destination id");
        }
        String str = this.f24903k;
        if (str != null) {
            kotlin.jvm.internal.f0.m(str);
            navGraph.P0(str);
        } else {
            kotlin.reflect.d<?> dVar = this.f24904l;
            if (dVar != null) {
                kotlin.jvm.internal.f0.m(dVar);
                navGraph.Q0(kotlinx.serialization.t.g(dVar), new yh.l<NavDestination, String>() { // from class: androidx.navigation.NavGraphBuilder$build$1$1
                    @Override // yh.l
                    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final String invoke(NavDestination it) {
                        kotlin.jvm.internal.f0.p(it, "it");
                        String strF = it.F();
                        kotlin.jvm.internal.f0.m(strF);
                        return strF;
                    }
                });
            } else {
                Object obj = this.f24905m;
                if (obj != null) {
                    kotlin.jvm.internal.f0.m(obj);
                    navGraph.O0(obj);
                } else {
                    navGraph.N0(i10);
                }
            }
        }
        return navGraph;
    }

    public final <D extends NavDestination> void s(@dl.d NavDestinationBuilder<? extends D> navDestination) {
        kotlin.jvm.internal.f0.p(navDestination, "navDestination");
        this.f24906n.add(navDestination.d());
    }

    @dl.d
    public final q0 t() {
        return this.f24901i;
    }

    public final void u(@dl.d NavDestination navDestination) {
        kotlin.jvm.internal.f0.p(navDestination, "<this>");
        q(navDestination);
    }
}
