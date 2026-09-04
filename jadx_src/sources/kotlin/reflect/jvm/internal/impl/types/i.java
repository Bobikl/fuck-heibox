package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.PropertyReference1Impl;

/* JADX INFO: compiled from: AnnotationsTypeAttribute.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f128134a = {kotlin.jvm.internal.n0.u(new PropertyReference1Impl(kotlin.jvm.internal.n0.h(i.class, "descriptors"), "annotationsAttribute", "getAnnotationsAttribute(Lorg/jetbrains/kotlin/types/TypeAttributes;)Lorg/jetbrains/kotlin/types/AnnotationsTypeAttribute;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlin.properties.e f128135b;

    static {
        kotlin.properties.e eVarC = w0.f128193c.c(kotlin.jvm.internal.n0.d(h.class));
        kotlin.jvm.internal.f0.n(eVarC, "null cannot be cast to non-null type kotlin.properties.ReadOnlyProperty<org.jetbrains.kotlin.types.TypeAttributes, T of org.jetbrains.kotlin.types.TypeAttributes.Companion.attributeAccessor?>");
        f128135b = eVarC;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e a(@dl.d w0 w0Var) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarE;
        kotlin.jvm.internal.f0.p(w0Var, "<this>");
        h hVarB = b(w0Var);
        return (hVarB == null || (eVarE = hVarB.e()) == null) ? kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b() : eVarE;
    }

    @dl.e
    public static final h b(@dl.d w0 w0Var) {
        kotlin.jvm.internal.f0.p(w0Var, "<this>");
        return (h) f128135b.a(w0Var, f128134a[0]);
    }
}
