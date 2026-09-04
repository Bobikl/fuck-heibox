package androidx.navigation;

import java.util.Map;
import kotlin.b2;
import kotlin.reflect.r;

/* JADX INFO: compiled from: NavController.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 2 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n*L\n1#1,2927:1\n45#2:2928\n59#2:2929\n77#2:2930\n95#2:2931\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/NavControllerKt\n*L\n2879#1:2928\n2892#1:2929\n2909#1:2930\n2926#1:2931\n*E\n"})
public final class v {
    @dl.d
    @kotlin.k(message = "Use routes to create your NavGraph instead", replaceWith = @kotlin.s0(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final NavGraph a(@dl.d NavController navController, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(navController, "<this>");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.Z(), i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    @dl.d
    public static final NavGraph b(@dl.d NavController navController, @dl.d Object startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(navController, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.Z(), startDestination, dVar, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    @dl.d
    public static final NavGraph c(@dl.d NavController navController, @dl.d String startDestination, @dl.e String str, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(navController, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.Z(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    @dl.d
    public static final NavGraph d(@dl.d NavController navController, @dl.d kotlin.reflect.d<?> startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(navController, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.Z(), startDestination, dVar, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    public static /* synthetic */ NavGraph e(NavController navController, int i10, int i11, yh.l builder, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        kotlin.jvm.internal.f0.p(navController, "<this>");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.Z(), i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    public static /* synthetic */ NavGraph f(NavController navController, Object startDestination, kotlin.reflect.d dVar, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        kotlin.jvm.internal.f0.p(navController, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.Z(), startDestination, (kotlin.reflect.d<?>) dVar, (Map<r, m0<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    public static /* synthetic */ NavGraph g(NavController navController, String startDestination, String str, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        kotlin.jvm.internal.f0.p(navController, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.Z(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    public static /* synthetic */ NavGraph h(NavController navController, kotlin.reflect.d startDestination, kotlin.reflect.d dVar, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        kotlin.jvm.internal.f0.p(navController, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(navController.Z(), (kotlin.reflect.d<?>) startDestination, (kotlin.reflect.d<?>) dVar, (Map<r, m0<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }
}
