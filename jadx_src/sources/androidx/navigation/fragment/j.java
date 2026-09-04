package androidx.navigation.fragment;

import androidx.annotation.d0;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.m0;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.r;
import kotlin.s0;

/* JADX INFO: compiled from: FragmentNavigatorDestinationBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,186:1\n57#1,2:187\n59#1,2:190\n80#1,2:193\n82#1,2:196\n108#1,3:199\n112#1,5:203\n108#1,9:208\n157#2:189\n157#2:192\n157#2:195\n157#2:198\n157#2:202\n157#2:217\n*S KotlinDebug\n*F\n+ 1 FragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/FragmentNavigatorDestinationBuilderKt\n*L\n40#1:187,2\n40#1:190,2\n68#1:193,2\n68#1:196,2\n94#1:199,3\n94#1:203,5\n94#1:208,9\n40#1:189\n58#1:192\n68#1:195\n81#1:198\n94#1:202\n110#1:217\n*E\n"})
public final class j {
    @kotlin.k(message = "Use routes to create your FragmentDestination instead", replaceWith = @s0(expression = "fragment<F>(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void a(NavGraphBuilder navGraphBuilder, @d0 int i10) {
        f0.p(navGraphBuilder, "<this>");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.t().e(FragmentNavigator.class);
        f0.y(4, "F");
        navGraphBuilder.s(new i(fragmentNavigator, i10, (kotlin.reflect.d<? extends Fragment>) n0.d(Fragment.class)));
    }

    @kotlin.k(message = "Use routes to create your FragmentDestination instead", replaceWith = @s0(expression = "fragment<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void b(NavGraphBuilder navGraphBuilder, @d0 int i10, yh.l<? super i, b2> builder) {
        f0.p(navGraphBuilder, "<this>");
        f0.p(builder, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.t().e(FragmentNavigator.class);
        f0.y(4, "F");
        i iVar = new i(fragmentNavigator, i10, (kotlin.reflect.d<? extends Fragment>) n0.d(Fragment.class));
        builder.invoke(iVar);
        navGraphBuilder.s(iVar);
    }

    public static final /* synthetic */ <F extends Fragment> void c(NavGraphBuilder navGraphBuilder, String route) {
        f0.p(navGraphBuilder, "<this>");
        f0.p(route, "route");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.t().e(FragmentNavigator.class);
        f0.y(4, "F");
        navGraphBuilder.s(new i(fragmentNavigator, route, (kotlin.reflect.d<? extends Fragment>) n0.d(Fragment.class)));
    }

    public static final /* synthetic */ <F extends Fragment> void d(NavGraphBuilder navGraphBuilder, String route, yh.l<? super i, b2> builder) {
        f0.p(navGraphBuilder, "<this>");
        f0.p(route, "route");
        f0.p(builder, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.t().e(FragmentNavigator.class);
        f0.y(4, "F");
        i iVar = new i(fragmentNavigator, route, (kotlin.reflect.d<? extends Fragment>) n0.d(Fragment.class));
        builder.invoke(iVar);
        navGraphBuilder.s(iVar);
    }

    public static final /* synthetic */ <F extends Fragment, T> void e(NavGraphBuilder navGraphBuilder, Map<r, m0<?>> typeMap) {
        f0.p(navGraphBuilder, "<this>");
        f0.p(typeMap, "typeMap");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.t().e(FragmentNavigator.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        kotlin.reflect.d dVarD = n0.d(Object.class);
        f0.y(4, "F");
        navGraphBuilder.s(new i(fragmentNavigator, dVarD, typeMap, n0.d(Fragment.class)));
    }

    public static final /* synthetic */ <F extends Fragment, T> void f(NavGraphBuilder navGraphBuilder, Map<r, m0<?>> typeMap, yh.l<? super i, b2> builder) {
        f0.p(navGraphBuilder, "<this>");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.t().e(FragmentNavigator.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        kotlin.reflect.d dVarD = n0.d(Object.class);
        f0.y(4, "F");
        i iVar = new i(fragmentNavigator, dVarD, typeMap, n0.d(Fragment.class));
        builder.invoke(iVar);
        navGraphBuilder.s(iVar);
    }

    public static /* synthetic */ void g(NavGraphBuilder navGraphBuilder, Map typeMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(navGraphBuilder, "<this>");
        f0.p(typeMap, "typeMap");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.t().e(FragmentNavigator.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        kotlin.reflect.d dVarD = n0.d(Object.class);
        f0.y(4, "F");
        navGraphBuilder.s(new i(fragmentNavigator, dVarD, typeMap, n0.d(Fragment.class)));
    }

    public static /* synthetic */ void h(NavGraphBuilder navGraphBuilder, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(navGraphBuilder, "<this>");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        FragmentNavigator fragmentNavigator = (FragmentNavigator) navGraphBuilder.t().e(FragmentNavigator.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        kotlin.reflect.d dVarD = n0.d(Object.class);
        f0.y(4, "F");
        i iVar = new i(fragmentNavigator, dVarD, typeMap, n0.d(Fragment.class));
        builder.invoke(iVar);
        navGraphBuilder.s(iVar);
    }
}
