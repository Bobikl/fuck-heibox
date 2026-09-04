package kotlin.reflect.jvm.internal.impl.resolve;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: inlineClassesUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.c f127554a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f127555b;

    static {
        kotlin.reflect.jvm.internal.impl.name.c cVar = new kotlin.reflect.jvm.internal.impl.name.c("kotlin.jvm.JvmInline");
        f127554a = cVar;
        kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(cVar);
        f0.o(bVarM, "topLevel(JVM_INLINE_ANNOTATION_FQ_NAME)");
        f127555b = bVarM;
    }

    public static final boolean a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        f0.p(aVar, "<this>");
        if (aVar instanceof p0) {
            o0 correspondingProperty = ((p0) aVar).n0();
            f0.o(correspondingProperty, "correspondingProperty");
            if (d(correspondingProperty)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        f0.p(kVar, "<this>");
        return (kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && (((kotlin.reflect.jvm.internal.impl.descriptors.d) kVar).m0() instanceof x);
    }

    public static final boolean c(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        if (fVarD != null) {
            return b(fVarD);
        }
        return false;
    }

    public static final boolean d(@dl.d d1 d1Var) {
        x<j0> xVarN;
        f0.p(d1Var, "<this>");
        if (d1Var.l0() == null) {
            kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = d1Var.c();
            kotlin.reflect.jvm.internal.impl.name.f fVarC = null;
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC : null;
            if (dVar != null && (xVarN = DescriptorUtilsKt.n(dVar)) != null) {
                fVarC = xVarN.c();
            }
            if (f0.g(fVarC, d1Var.getName())) {
                return true;
            }
        }
        return false;
    }

    @dl.e
    public static final d0 e(@dl.d d0 d0Var) {
        x<j0> xVarN;
        f0.p(d0Var, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        if (!(fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            fVarD = null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD;
        if (dVar == null || (xVarN = DescriptorUtilsKt.n(dVar)) == null) {
            return null;
        }
        return (j0) xVarN.d();
    }
}
