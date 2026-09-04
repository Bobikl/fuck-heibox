package androidx.navigation.dynamicfeatures;

import androidx.annotation.d0;
import androidx.navigation.NavController;
import androidx.navigation.NavGraph;
import androidx.navigation.m0;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.reflect.r;
import kotlin.s0;

/* JADX INFO: compiled from: NavController.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nNavController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavController.kt\nandroidx/navigation/dynamicfeatures/NavControllerKt\n+ 2 DynamicNavGraphBuilder.kt\nandroidx/navigation/dynamicfeatures/DynamicNavGraphBuilderKt\n*L\n1#1,81:1\n50#2:82\n84#2:83\n114#2:84\n131#2:85\n*S KotlinDebug\n*F\n+ 1 NavController.kt\nandroidx/navigation/dynamicfeatures/NavControllerKt\n*L\n39#1:82\n46#1:83\n63#1:84\n80#1:85\n*E\n"})
public final class o {
    @dl.d
    @kotlin.k(message = "Use routes to create your dynamic NavGraph instead", replaceWith = @s0(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final NavGraph a(@dl.d NavController navController, @d0 int i10, @d0 int i11, @dl.d yh.l<? super m, b2> builder) {
        f0.p(navController, "<this>");
        f0.p(builder, "builder");
        m mVar = new m(navController.Z(), i10, i11);
        builder.invoke(mVar);
        return mVar.d();
    }

    @dl.d
    public static final NavGraph b(@dl.d NavController navController, @dl.d Object startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap, @dl.d yh.l<? super m, b2> builder) {
        f0.p(navController, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        m mVar = new m(navController.Z(), startDestination, dVar, typeMap);
        builder.invoke(mVar);
        return mVar.d();
    }

    @dl.d
    public static final NavGraph c(@dl.d NavController navController, @dl.d String startDestination, @dl.e String str, @dl.d yh.l<? super m, b2> builder) {
        f0.p(navController, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(builder, "builder");
        m mVar = new m(navController.Z(), startDestination, str);
        builder.invoke(mVar);
        return mVar.d();
    }

    @dl.d
    public static final NavGraph d(@dl.d NavController navController, @dl.d kotlin.reflect.d<?> startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap, @dl.d yh.l<? super m, b2> builder) {
        f0.p(navController, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        m mVar = new m(navController.Z(), startDestination, dVar, typeMap);
        builder.invoke(mVar);
        return mVar.d();
    }

    public static /* synthetic */ NavGraph e(NavController navController, int i10, int i11, yh.l builder, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        f0.p(navController, "<this>");
        f0.p(builder, "builder");
        m mVar = new m(navController.Z(), i10, i11);
        builder.invoke(mVar);
        return mVar.d();
    }

    public static /* synthetic */ NavGraph f(NavController navController, Object startDestination, kotlin.reflect.d dVar, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(navController, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        m mVar = new m(navController.Z(), startDestination, (kotlin.reflect.d<?>) dVar, (Map<r, m0<?>>) typeMap);
        builder.invoke(mVar);
        return mVar.d();
    }

    public static /* synthetic */ NavGraph g(NavController navController, String startDestination, String str, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        f0.p(navController, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(builder, "builder");
        m mVar = new m(navController.Z(), startDestination, str);
        builder.invoke(mVar);
        return mVar.d();
    }

    public static /* synthetic */ NavGraph h(NavController navController, kotlin.reflect.d startDestination, kotlin.reflect.d dVar, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(navController, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        m mVar = new m(navController.Z(), (kotlin.reflect.d<?>) startDestination, (kotlin.reflect.d<?>) dVar, (Map<r, m0<?>>) typeMap);
        builder.invoke(mVar);
        return mVar.d();
    }
}
