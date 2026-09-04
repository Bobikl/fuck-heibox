package androidx.navigation;

import java.util.Map;
import kotlin.b2;
import kotlin.reflect.r;

/* JADX INFO: compiled from: NavHost.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.jvm.internal.t0({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/NavHostKt\n+ 2 NavController.kt\nandroidx/navigation/NavControllerKt\n+ 3 NavGraphBuilder.kt\nandroidx/navigation/NavGraphBuilderKt\n*L\n1#1,105:1\n2879#2:106\n2892#2:108\n2909#2:110\n2926#2:112\n45#3:107\n59#3:109\n77#3:111\n95#3:113\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/NavHostKt\n*L\n63#1:106\n70#1:108\n87#1:110\n104#1:112\n63#1:107\n70#1:109\n87#1:111\n104#1:113\n*E\n"})
public final class h0 {
    @dl.d
    @kotlin.k(message = "Use routes to create your NavGraph instead", replaceWith = @kotlin.s0(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final NavGraph a(@dl.d f0 f0Var, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(f0Var.i3().Z(), i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    @dl.d
    public static final NavGraph b(@dl.d f0 f0Var, @dl.d Object startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(f0Var.i3().Z(), startDestination, dVar, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    @dl.d
    public static final NavGraph c(@dl.d f0 f0Var, @dl.d String startDestination, @dl.e String str, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(f0Var.i3().Z(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    @dl.d
    public static final NavGraph d(@dl.d f0 f0Var, @dl.d kotlin.reflect.d<?> startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(f0Var.i3().Z(), startDestination, dVar, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    public static /* synthetic */ NavGraph e(f0 f0Var, int i10, int i11, yh.l builder, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(f0Var.i3().Z(), i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    public static /* synthetic */ NavGraph f(f0 f0Var, Object startDestination, kotlin.reflect.d dVar, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(f0Var.i3().Z(), startDestination, (kotlin.reflect.d<?>) dVar, (Map<r, m0<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    public static /* synthetic */ NavGraph g(f0 f0Var, String startDestination, String str, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(f0Var.i3().Z(), startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    public static /* synthetic */ NavGraph h(f0 f0Var, kotlin.reflect.d startDestination, kotlin.reflect.d dVar, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(f0Var.i3().Z(), (kotlin.reflect.d<?>) startDestination, (kotlin.reflect.d<?>) dVar, (Map<r, m0<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }
}
