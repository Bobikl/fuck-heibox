package kotlin.jvm.internal;

import java.util.Arrays;
import java.util.Collections;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.reflect.KVariance;

/* JADX INFO: compiled from: Reflection.java */
/* JADX INFO: loaded from: classes5.dex */
public class n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final o0 f124945a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f124946b = " (Kotlin reflection is not available)";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final kotlin.reflect.d[] f124947c;

    static {
        o0 o0Var = null;
        try {
            o0Var = (o0) kotlin.reflect.jvm.internal.o.class.newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (o0Var == null) {
            o0Var = new o0();
        }
        f124945a = o0Var;
        f124947c = new kotlin.reflect.d[0];
    }

    @kotlin.u0(version = "1.4")
    public static kotlin.reflect.r A(Class cls) {
        return f124945a.s(d(cls), Collections.emptyList(), false);
    }

    @kotlin.u0(version = "1.4")
    public static kotlin.reflect.r B(Class cls, kotlin.reflect.t tVar) {
        return f124945a.s(d(cls), Collections.singletonList(tVar), false);
    }

    @kotlin.u0(version = "1.4")
    public static kotlin.reflect.r C(Class cls, kotlin.reflect.t tVar, kotlin.reflect.t tVar2) {
        return f124945a.s(d(cls), Arrays.asList(tVar, tVar2), false);
    }

    @kotlin.u0(version = "1.4")
    public static kotlin.reflect.r D(Class cls, kotlin.reflect.t... tVarArr) {
        return f124945a.s(d(cls), ArraysKt___ArraysKt.kz(tVarArr), false);
    }

    @kotlin.u0(version = "1.4")
    public static kotlin.reflect.r E(kotlin.reflect.g gVar) {
        return f124945a.s(gVar, Collections.emptyList(), false);
    }

    @kotlin.u0(version = "1.4")
    public static kotlin.reflect.s F(Object obj, String str, KVariance kVariance, boolean z10) {
        return f124945a.t(obj, str, kVariance, z10);
    }

    public static kotlin.reflect.d a(Class cls) {
        return f124945a.a(cls);
    }

    public static kotlin.reflect.d b(Class cls, String str) {
        return f124945a.b(cls, str);
    }

    public static kotlin.reflect.i c(FunctionReference functionReference) {
        return f124945a.c(functionReference);
    }

    public static kotlin.reflect.d d(Class cls) {
        return f124945a.d(cls);
    }

    public static kotlin.reflect.d e(Class cls, String str) {
        return f124945a.e(cls, str);
    }

    public static kotlin.reflect.d[] f(Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return f124947c;
        }
        kotlin.reflect.d[] dVarArr = new kotlin.reflect.d[length];
        for (int i10 = 0; i10 < length; i10++) {
            dVarArr[i10] = d(clsArr[i10]);
        }
        return dVarArr;
    }

    @kotlin.u0(version = "1.4")
    public static kotlin.reflect.h g(Class cls) {
        return f124945a.f(cls, "");
    }

    public static kotlin.reflect.h h(Class cls, String str) {
        return f124945a.f(cls, str);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
    public static kotlin.reflect.r i(kotlin.reflect.r rVar) {
        return f124945a.g(rVar);
    }

    public static kotlin.reflect.k j(MutablePropertyReference0 mutablePropertyReference0) {
        return f124945a.h(mutablePropertyReference0);
    }

    public static kotlin.reflect.l k(MutablePropertyReference1 mutablePropertyReference1) {
        return f124945a.i(mutablePropertyReference1);
    }

    public static kotlin.reflect.m l(MutablePropertyReference2 mutablePropertyReference2) {
        return f124945a.j(mutablePropertyReference2);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
    public static kotlin.reflect.r m(kotlin.reflect.r rVar) {
        return f124945a.k(rVar);
    }

    @kotlin.u0(version = "1.4")
    public static kotlin.reflect.r n(Class cls) {
        return f124945a.s(d(cls), Collections.emptyList(), true);
    }

    @kotlin.u0(version = "1.4")
    public static kotlin.reflect.r o(Class cls, kotlin.reflect.t tVar) {
        return f124945a.s(d(cls), Collections.singletonList(tVar), true);
    }

    @kotlin.u0(version = "1.4")
    public static kotlin.reflect.r p(Class cls, kotlin.reflect.t tVar, kotlin.reflect.t tVar2) {
        return f124945a.s(d(cls), Arrays.asList(tVar, tVar2), true);
    }

    @kotlin.u0(version = "1.4")
    public static kotlin.reflect.r q(Class cls, kotlin.reflect.t... tVarArr) {
        return f124945a.s(d(cls), ArraysKt___ArraysKt.kz(tVarArr), true);
    }

    @kotlin.u0(version = "1.4")
    public static kotlin.reflect.r r(kotlin.reflect.g gVar) {
        return f124945a.s(gVar, Collections.emptyList(), true);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
    public static kotlin.reflect.r s(kotlin.reflect.r rVar, kotlin.reflect.r rVar2) {
        return f124945a.l(rVar, rVar2);
    }

    public static kotlin.reflect.o t(PropertyReference0 propertyReference0) {
        return f124945a.m(propertyReference0);
    }

    public static kotlin.reflect.p u(PropertyReference1 propertyReference1) {
        return f124945a.n(propertyReference1);
    }

    public static kotlin.reflect.q v(PropertyReference2 propertyReference2) {
        return f124945a.o(propertyReference2);
    }

    @kotlin.u0(version = "1.3")
    public static String w(b0 b0Var) {
        return f124945a.p(b0Var);
    }

    @kotlin.u0(version = "1.1")
    public static String x(Lambda lambda) {
        return f124945a.q(lambda);
    }

    @kotlin.u0(version = "1.4")
    public static void y(kotlin.reflect.s sVar, kotlin.reflect.r rVar) {
        f124945a.r(sVar, Collections.singletonList(rVar));
    }

    @kotlin.u0(version = "1.4")
    public static void z(kotlin.reflect.s sVar, kotlin.reflect.r... rVarArr) {
        f124945a.r(sVar, ArraysKt___ArraysKt.kz(rVarArr));
    }
}
