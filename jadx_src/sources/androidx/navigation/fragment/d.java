package androidx.navigation.fragment;

import androidx.annotation.d0;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.m0;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.r;
import kotlin.s0;

/* JADX INFO: compiled from: DialogFragmentNavigatorDestinationBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nDialogFragmentNavigatorDestinationBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DialogFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilderKt\n+ 2 NavigatorProvider.kt\nandroidx/navigation/NavigatorProviderKt\n*L\n1#1,197:1\n57#1,3:198\n60#1,5:202\n84#1,3:208\n87#1,5:212\n116#1,3:218\n120#1,5:222\n116#1,9:227\n157#2:201\n157#2:207\n157#2:211\n157#2:217\n157#2:221\n157#2:236\n*S KotlinDebug\n*F\n+ 1 DialogFragmentNavigatorDestinationBuilder.kt\nandroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilderKt\n*L\n40#1:198,3\n40#1:202,5\n72#1:208,3\n72#1:212,5\n102#1:218,3\n102#1:222,5\n102#1:227,9\n40#1:201\n59#1:207\n72#1:211\n86#1:217\n102#1:221\n118#1:236\n*E\n"})
public final class d {
    @kotlin.k(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @s0(expression = "dialog<F>(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends androidx.fragment.app.j> void a(NavGraphBuilder navGraphBuilder, @d0 int i10) {
        f0.p(navGraphBuilder, "<this>");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.t().e(DialogFragmentNavigator.class);
        f0.y(4, "F");
        navGraphBuilder.s(new c(dialogFragmentNavigator, i10, (kotlin.reflect.d<? extends androidx.fragment.app.j>) n0.d(androidx.fragment.app.j.class)));
    }

    @kotlin.k(message = "Use routes to create your DialogFragmentDestination instead", replaceWith = @s0(expression = "dialog<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends androidx.fragment.app.j> void b(NavGraphBuilder navGraphBuilder, @d0 int i10, yh.l<? super c, b2> builder) {
        f0.p(navGraphBuilder, "<this>");
        f0.p(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.t().e(DialogFragmentNavigator.class);
        f0.y(4, "F");
        c cVar = new c(dialogFragmentNavigator, i10, (kotlin.reflect.d<? extends androidx.fragment.app.j>) n0.d(androidx.fragment.app.j.class));
        builder.invoke(cVar);
        navGraphBuilder.s(cVar);
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.j> void c(NavGraphBuilder navGraphBuilder, String route) {
        f0.p(navGraphBuilder, "<this>");
        f0.p(route, "route");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.t().e(DialogFragmentNavigator.class);
        f0.y(4, "F");
        navGraphBuilder.s(new c(dialogFragmentNavigator, route, (kotlin.reflect.d<? extends androidx.fragment.app.j>) n0.d(androidx.fragment.app.j.class)));
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.j> void d(NavGraphBuilder navGraphBuilder, String route, yh.l<? super c, b2> builder) {
        f0.p(navGraphBuilder, "<this>");
        f0.p(route, "route");
        f0.p(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.t().e(DialogFragmentNavigator.class);
        f0.y(4, "F");
        c cVar = new c(dialogFragmentNavigator, route, (kotlin.reflect.d<? extends androidx.fragment.app.j>) n0.d(androidx.fragment.app.j.class));
        builder.invoke(cVar);
        navGraphBuilder.s(cVar);
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.j, T> void e(NavGraphBuilder navGraphBuilder, Map<r, m0<?>> typeMap) {
        f0.p(navGraphBuilder, "<this>");
        f0.p(typeMap, "typeMap");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.t().e(DialogFragmentNavigator.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        kotlin.reflect.d dVarD = n0.d(Object.class);
        f0.y(4, "F");
        navGraphBuilder.s(new c(dialogFragmentNavigator, dVarD, typeMap, n0.d(androidx.fragment.app.j.class)));
    }

    public static final /* synthetic */ <F extends androidx.fragment.app.j, T> void f(NavGraphBuilder navGraphBuilder, Map<r, m0<?>> typeMap, yh.l<? super c, b2> builder) {
        f0.p(navGraphBuilder, "<this>");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.t().e(DialogFragmentNavigator.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        kotlin.reflect.d dVarD = n0.d(Object.class);
        f0.y(4, "F");
        c cVar = new c(dialogFragmentNavigator, dVarD, typeMap, n0.d(androidx.fragment.app.j.class));
        builder.invoke(cVar);
        navGraphBuilder.s(cVar);
    }

    public static /* synthetic */ void g(NavGraphBuilder navGraphBuilder, Map typeMap, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(navGraphBuilder, "<this>");
        f0.p(typeMap, "typeMap");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.t().e(DialogFragmentNavigator.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        kotlin.reflect.d dVarD = n0.d(Object.class);
        f0.y(4, "F");
        navGraphBuilder.s(new c(dialogFragmentNavigator, dVarD, typeMap, n0.d(androidx.fragment.app.j.class)));
    }

    public static /* synthetic */ void h(NavGraphBuilder navGraphBuilder, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(navGraphBuilder, "<this>");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        DialogFragmentNavigator dialogFragmentNavigator = (DialogFragmentNavigator) navGraphBuilder.t().e(DialogFragmentNavigator.class);
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        kotlin.reflect.d dVarD = n0.d(Object.class);
        f0.y(4, "F");
        c cVar = new c(dialogFragmentNavigator, dVarD, typeMap, n0.d(androidx.fragment.app.j.class));
        builder.invoke(cVar);
        navGraphBuilder.s(cVar);
    }
}
