package androidx.navigation.dynamicfeatures;

import androidx.annotation.d0;
import androidx.navigation.NavGraph;
import androidx.navigation.f0;
import androidx.navigation.m0;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.t0;
import kotlin.reflect.r;
import kotlin.s0;

/* JADX INFO: compiled from: NavHost.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nNavHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NavHost.kt\nandroidx/navigation/dynamicfeatures/NavHostKt\n+ 2 NavController.kt\nandroidx/navigation/dynamicfeatures/NavControllerKt\n+ 3 DynamicNavGraphBuilder.kt\nandroidx/navigation/dynamicfeatures/DynamicNavGraphBuilderKt\n*L\n1#1,81:1\n39#2:82\n46#2:84\n63#2:86\n80#2:88\n50#3:83\n84#3:85\n114#3:87\n131#3:89\n*S KotlinDebug\n*F\n+ 1 NavHost.kt\nandroidx/navigation/dynamicfeatures/NavHostKt\n*L\n39#1:82\n46#1:84\n63#1:86\n80#1:88\n39#1:83\n46#1:85\n63#1:87\n80#1:89\n*E\n"})
public final class p {
    @dl.d
    @kotlin.k(message = "Use routes to create your dynamic NavGraph instead", replaceWith = @s0(expression = "createGraph(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final NavGraph a(@dl.d f0 f0Var, @d0 int i10, @d0 int i11, @dl.d yh.l<? super m, b2> builder) {
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(builder, "builder");
        m mVar = new m(f0Var.i3().Z(), i10, i11);
        builder.invoke(mVar);
        return mVar.d();
    }

    @dl.d
    public static final NavGraph b(@dl.d f0 f0Var, @dl.d Object startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap, @dl.d yh.l<? super m, b2> builder) {
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        m mVar = new m(f0Var.i3().Z(), startDestination, dVar, typeMap);
        builder.invoke(mVar);
        return mVar.d();
    }

    @dl.d
    public static final NavGraph c(@dl.d f0 f0Var, @dl.d String startDestination, @dl.e String str, @dl.d yh.l<? super m, b2> builder) {
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(builder, "builder");
        m mVar = new m(f0Var.i3().Z(), startDestination, str);
        builder.invoke(mVar);
        return mVar.d();
    }

    @dl.d
    public static final NavGraph d(@dl.d f0 f0Var, @dl.d kotlin.reflect.d<?> startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap, @dl.d yh.l<? super m, b2> builder) {
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        m mVar = new m(f0Var.i3().Z(), startDestination, dVar, typeMap);
        builder.invoke(mVar);
        return mVar.d();
    }

    public static /* synthetic */ NavGraph e(f0 f0Var, int i10, int i11, yh.l builder, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(builder, "builder");
        m mVar = new m(f0Var.i3().Z(), i10, i11);
        builder.invoke(mVar);
        return mVar.d();
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
        m mVar = new m(f0Var.i3().Z(), startDestination, (kotlin.reflect.d<?>) dVar, (Map<r, m0<?>>) typeMap);
        builder.invoke(mVar);
        return mVar.d();
    }

    public static /* synthetic */ NavGraph g(f0 f0Var, String startDestination, String str, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        kotlin.jvm.internal.f0.p(f0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(builder, "builder");
        m mVar = new m(f0Var.i3().Z(), startDestination, str);
        builder.invoke(mVar);
        return mVar.d();
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
        m mVar = new m(f0Var.i3().Z(), (kotlin.reflect.d<?>) startDestination, (kotlin.reflect.d<?>) dVar, (Map<r, m0<?>>) typeMap);
        builder.invoke(mVar);
        return mVar.d();
    }
}
