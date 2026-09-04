package androidx.navigation;

import java.util.Map;
import kotlin.b2;
import kotlin.reflect.r;

/* JADX INFO: compiled from: NavGraphBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class d0 {
    @dl.d
    @kotlin.k(message = "Use routes to build your NavGraph instead", replaceWith = @kotlin.s0(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final NavGraph a(@dl.d q0 q0Var, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(q0Var, i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    @dl.d
    public static final NavGraph b(@dl.d q0 q0Var, @dl.d Object startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(q0Var, startDestination, dVar, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    @dl.d
    public static final NavGraph c(@dl.d q0 q0Var, @dl.d String startDestination, @dl.e String str, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(q0Var, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    @dl.d
    public static final NavGraph d(@dl.d q0 q0Var, @dl.d kotlin.reflect.d<?> startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(q0Var, startDestination, dVar, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    @kotlin.k(message = "Use routes to build your nested NavGraph instead", replaceWith = @kotlin.s0(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void e(@dl.d NavGraphBuilder navGraphBuilder, @androidx.annotation.d0 int i10, @androidx.annotation.d0 int i11, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(navGraphBuilder, "<this>");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.t(), i10, i11);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.s(navGraphBuilder2);
    }

    public static final /* synthetic */ <T> void f(NavGraphBuilder navGraphBuilder, Object startDestination, Map<r, m0<?>> typeMap, yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(navGraphBuilder, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        q0 q0VarT = navGraphBuilder.t();
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(q0VarT, startDestination, (kotlin.reflect.d<?>) kotlin.jvm.internal.n0.d(Object.class), typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.s(navGraphBuilder2);
    }

    public static final void g(@dl.d NavGraphBuilder navGraphBuilder, @dl.d String startDestination, @dl.d String route, @dl.d yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(navGraphBuilder, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(route, "route");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(navGraphBuilder.t(), startDestination, route);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.s(navGraphBuilder2);
    }

    public static final /* synthetic */ <T> void h(NavGraphBuilder navGraphBuilder, kotlin.reflect.d<?> startDestination, Map<r, m0<?>> typeMap, yh.l<? super NavGraphBuilder, b2> builder) {
        kotlin.jvm.internal.f0.p(navGraphBuilder, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        q0 q0VarT = navGraphBuilder.t();
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(q0VarT, startDestination, (kotlin.reflect.d<?>) kotlin.jvm.internal.n0.d(Object.class), typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.s(navGraphBuilder2);
    }

    public static /* synthetic */ NavGraph i(q0 q0Var, int i10, int i11, yh.l builder, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(q0Var, i10, i11);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    public static /* synthetic */ NavGraph j(q0 q0Var, Object startDestination, kotlin.reflect.d dVar, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(q0Var, startDestination, (kotlin.reflect.d<?>) dVar, (Map<r, m0<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    public static /* synthetic */ NavGraph k(q0 q0Var, String startDestination, String str, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(q0Var, startDestination, str);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    public static /* synthetic */ NavGraph l(q0 q0Var, kotlin.reflect.d startDestination, kotlin.reflect.d dVar, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        kotlin.jvm.internal.f0.p(q0Var, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(q0Var, (kotlin.reflect.d<?>) startDestination, (kotlin.reflect.d<?>) dVar, (Map<r, m0<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.d();
    }

    public static /* synthetic */ void m(NavGraphBuilder navGraphBuilder, Object startDestination, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        kotlin.jvm.internal.f0.p(navGraphBuilder, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        q0 q0VarT = navGraphBuilder.t();
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(q0VarT, startDestination, (kotlin.reflect.d<?>) kotlin.jvm.internal.n0.d(Object.class), (Map<r, m0<?>>) typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.s(navGraphBuilder2);
    }

    public static /* synthetic */ void n(NavGraphBuilder navGraphBuilder, kotlin.reflect.d startDestination, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        kotlin.jvm.internal.f0.p(navGraphBuilder, "<this>");
        kotlin.jvm.internal.f0.p(startDestination, "startDestination");
        kotlin.jvm.internal.f0.p(typeMap, "typeMap");
        kotlin.jvm.internal.f0.p(builder, "builder");
        q0 q0VarT = navGraphBuilder.t();
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        NavGraphBuilder navGraphBuilder2 = new NavGraphBuilder(q0VarT, (kotlin.reflect.d<?>) startDestination, (kotlin.reflect.d<?>) kotlin.jvm.internal.n0.d(Object.class), (Map<r, m0<?>>) typeMap);
        builder.invoke(navGraphBuilder2);
        navGraphBuilder.s(navGraphBuilder2);
    }
}
