package androidx.navigation.dynamicfeatures;

import androidx.annotation.d0;
import androidx.navigation.NavGraph;
import androidx.navigation.m0;
import androidx.navigation.q0;
import java.util.Map;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.r;
import kotlin.s0;

/* JADX INFO: compiled from: DynamicNavGraphBuilder.kt */
/* JADX INFO: loaded from: classes6.dex */
public final class n {
    @dl.d
    @kotlin.k(message = "Use routes to create your DynamicNavGraph instead", replaceWith = @s0(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final NavGraph a(@dl.d q0 q0Var, @d0 int i10, @d0 int i11, @dl.d yh.l<? super m, b2> builder) {
        f0.p(q0Var, "<this>");
        f0.p(builder, "builder");
        m mVar = new m(q0Var, i10, i11);
        builder.invoke(mVar);
        return mVar.d();
    }

    @dl.d
    public static final NavGraph b(@dl.d q0 q0Var, @dl.d Object startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap, @dl.d yh.l<? super m, b2> builder) {
        f0.p(q0Var, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        m mVar = new m(q0Var, startDestination, dVar, typeMap);
        builder.invoke(mVar);
        return mVar.d();
    }

    @dl.d
    public static final NavGraph c(@dl.d q0 q0Var, @dl.d String startDestination, @dl.e String str, @dl.d yh.l<? super m, b2> builder) {
        f0.p(q0Var, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(builder, "builder");
        m mVar = new m(q0Var, startDestination, str);
        builder.invoke(mVar);
        return mVar.d();
    }

    @dl.d
    public static final NavGraph d(@dl.d q0 q0Var, @dl.d kotlin.reflect.d<?> startDestination, @dl.e kotlin.reflect.d<?> dVar, @dl.d Map<r, m0<?>> typeMap, @dl.d yh.l<? super m, b2> builder) {
        f0.p(q0Var, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        m mVar = new m(q0Var, startDestination, dVar, typeMap);
        builder.invoke(mVar);
        return mVar.d();
    }

    @kotlin.k(message = "Use routes to create your DynamicNavGraph instead", replaceWith = @s0(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void e(@dl.d m mVar, @d0 int i10, @d0 int i11, @dl.d yh.l<? super m, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(builder, "builder");
        m mVar2 = new m(mVar.t(), i10, i11);
        builder.invoke(mVar2);
        mVar.s(mVar2);
    }

    public static final /* synthetic */ <T> void f(m mVar, Object startDestination, Map<r, m0<?>> typeMap, yh.l<? super m, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        q0 q0VarT = mVar.t();
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        m mVar2 = new m(q0VarT, startDestination, (kotlin.reflect.d<?>) n0.d(Object.class), typeMap);
        builder.invoke(mVar2);
        mVar.s(mVar2);
    }

    public static final void g(@dl.d m mVar, @dl.d String startDestination, @dl.d String route, @dl.d yh.l<? super m, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(route, "route");
        f0.p(builder, "builder");
        m mVar2 = new m(mVar.t(), startDestination, route);
        builder.invoke(mVar2);
        mVar.s(mVar2);
    }

    public static final /* synthetic */ <T> void h(m mVar, kotlin.reflect.d<?> startDestination, Map<r, m0<?>> typeMap, yh.l<? super m, b2> builder) {
        f0.p(mVar, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        q0 q0VarT = mVar.t();
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        m mVar2 = new m(q0VarT, startDestination, (kotlin.reflect.d<?>) n0.d(Object.class), typeMap);
        builder.invoke(mVar2);
        mVar.s(mVar2);
    }

    public static /* synthetic */ NavGraph i(q0 q0Var, int i10, int i11, yh.l builder, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        f0.p(q0Var, "<this>");
        f0.p(builder, "builder");
        m mVar = new m(q0Var, i10, i11);
        builder.invoke(mVar);
        return mVar.d();
    }

    public static /* synthetic */ NavGraph j(q0 q0Var, Object startDestination, kotlin.reflect.d dVar, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(q0Var, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        m mVar = new m(q0Var, startDestination, (kotlin.reflect.d<?>) dVar, (Map<r, m0<?>>) typeMap);
        builder.invoke(mVar);
        return mVar.d();
    }

    public static /* synthetic */ NavGraph k(q0 q0Var, String startDestination, String str, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        f0.p(q0Var, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(builder, "builder");
        m mVar = new m(q0Var, startDestination, str);
        builder.invoke(mVar);
        return mVar.d();
    }

    public static /* synthetic */ NavGraph l(q0 q0Var, kotlin.reflect.d startDestination, kotlin.reflect.d dVar, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            dVar = null;
        }
        if ((i10 & 4) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(q0Var, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        m mVar = new m(q0Var, (kotlin.reflect.d<?>) startDestination, (kotlin.reflect.d<?>) dVar, (Map<r, m0<?>>) typeMap);
        builder.invoke(mVar);
        return mVar.d();
    }

    public static /* synthetic */ void m(m mVar, Object startDestination, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(mVar, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        q0 q0VarT = mVar.t();
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        m mVar2 = new m(q0VarT, startDestination, (kotlin.reflect.d<?>) n0.d(Object.class), (Map<r, m0<?>>) typeMap);
        builder.invoke(mVar2);
        mVar.s(mVar2);
    }

    public static /* synthetic */ void n(m mVar, kotlin.reflect.d startDestination, Map typeMap, yh.l builder, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            typeMap = kotlin.collections.s0.z();
        }
        f0.p(mVar, "<this>");
        f0.p(startDestination, "startDestination");
        f0.p(typeMap, "typeMap");
        f0.p(builder, "builder");
        q0 q0VarT = mVar.t();
        f0.y(4, androidx.exifinterface.media.a.f23244d5);
        m mVar2 = new m(q0VarT, (kotlin.reflect.d<?>) startDestination, (kotlin.reflect.d<?>) n0.d(Object.class), (Map<r, m0<?>>) typeMap);
        builder.invoke(mVar2);
        mVar.s(mVar2);
    }
}
