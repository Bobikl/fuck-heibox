package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.c1;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.r0;
import kotlin.collections.s0;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* JADX INFO: compiled from: AnnotationQualifiersFqNames.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126000a = new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.meta.TypeQualifierNickname");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126001b = new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.meta.TypeQualifier");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126002c = new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.meta.TypeQualifierDefault");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f126003d = new kotlin.reflect.jvm.internal.impl.name.c("kotlin.annotations.jvm.UnderMigration");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final List<AnnotationQualifierApplicabilityType> f126004e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, l> f126005f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final Map<kotlin.reflect.jvm.internal.impl.name.c, l> f126006g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private static final Set<kotlin.reflect.jvm.internal.impl.name.c> f126007h;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List<AnnotationQualifierApplicabilityType> listL = CollectionsKt__CollectionsKt.L(AnnotationQualifierApplicabilityType.FIELD, AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE, annotationQualifierApplicabilityType, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        f126004e = listL;
        kotlin.reflect.jvm.internal.impl.name.c cVarI = u.i();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map<kotlin.reflect.jvm.internal.impl.name.c, l> mapK = r0.k(c1.a(cVarI, new l(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f(nullabilityQualifier, false, 2, null), listL, false)));
        f126005f = mapK;
        f126006g = s0.n0(s0.W(c1.a(new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.ParametersAreNullableByDefault"), new l(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f(NullabilityQualifier.NULLABLE, false, 2, null), kotlin.collections.s.k(annotationQualifierApplicabilityType), false, 4, null)), c1.a(new kotlin.reflect.jvm.internal.impl.name.c("javax.annotation.ParametersAreNonnullByDefault"), new l(new kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.f(nullabilityQualifier, false, 2, null), kotlin.collections.s.k(annotationQualifierApplicabilityType), false, 4, null))), mapK);
        f126007h = d1.u(u.f(), u.e());
    }

    @dl.d
    public static final Map<kotlin.reflect.jvm.internal.impl.name.c, l> a() {
        return f126006g;
    }

    @dl.d
    public static final Set<kotlin.reflect.jvm.internal.impl.name.c> b() {
        return f126007h;
    }

    @dl.d
    public static final Map<kotlin.reflect.jvm.internal.impl.name.c, l> c() {
        return f126005f;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c d() {
        return f126003d;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c e() {
        return f126002c;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c f() {
        return f126001b;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.name.c g() {
        return f126000a;
    }
}
