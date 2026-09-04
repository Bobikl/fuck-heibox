package kotlin.jvm.internal;

import java.util.List;
import kotlin.reflect.KVariance;

/* JADX INFO: compiled from: ReflectionFactory.java */
/* JADX INFO: loaded from: classes5.dex */
public class o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f124949a = "kotlin.jvm.functions.";

    public kotlin.reflect.d a(Class cls) {
        return new s(cls);
    }

    public kotlin.reflect.d b(Class cls, String str) {
        return new s(cls);
    }

    public kotlin.reflect.i c(FunctionReference functionReference) {
        return functionReference;
    }

    public kotlin.reflect.d d(Class cls) {
        return new s(cls);
    }

    public kotlin.reflect.d e(Class cls, String str) {
        return new s(cls);
    }

    public kotlin.reflect.h f(Class cls, String str) {
        return new l0(cls, str);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
    public kotlin.reflect.r g(kotlin.reflect.r rVar) {
        TypeReference typeReference = (TypeReference) rVar;
        return new TypeReference(rVar.o(), rVar.d(), typeReference.r(), typeReference.n() | 2);
    }

    public kotlin.reflect.k h(MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public kotlin.reflect.l i(MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public kotlin.reflect.m j(MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
    public kotlin.reflect.r k(kotlin.reflect.r rVar) {
        TypeReference typeReference = (TypeReference) rVar;
        return new TypeReference(rVar.o(), rVar.d(), typeReference.r(), typeReference.n() | 4);
    }

    @kotlin.u0(version = org.apache.tools.ant.util.s0.f136930u)
    public kotlin.reflect.r l(kotlin.reflect.r rVar, kotlin.reflect.r rVar2) {
        return new TypeReference(rVar.o(), rVar.d(), rVar2, ((TypeReference) rVar).n());
    }

    public kotlin.reflect.o m(PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public kotlin.reflect.p n(PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public kotlin.reflect.q o(PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    @kotlin.u0(version = "1.3")
    public String p(b0 b0Var) {
        String string = b0Var.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith(f124949a) ? string.substring(21) : string;
    }

    @kotlin.u0(version = "1.1")
    public String q(Lambda lambda) {
        return p(lambda);
    }

    @kotlin.u0(version = "1.4")
    public void r(kotlin.reflect.s sVar, List<kotlin.reflect.r> list) {
        ((x0) sVar).b(list);
    }

    @kotlin.u0(version = "1.4")
    public kotlin.reflect.r s(kotlin.reflect.g gVar, List<kotlin.reflect.t> list, boolean z10) {
        return new TypeReference(gVar, list, z10);
    }

    @kotlin.u0(version = "1.4")
    public kotlin.reflect.s t(Object obj, String str, KVariance kVariance, boolean z10) {
        return new x0(obj, str, kVariance, z10);
    }
}
