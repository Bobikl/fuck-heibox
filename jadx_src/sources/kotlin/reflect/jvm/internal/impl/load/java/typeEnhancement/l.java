package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.CompositeAnnotations;
import kotlin.reflect.jvm.internal.impl.load.java.t;
import kotlin.reflect.jvm.internal.impl.types.checker.o;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: typeEnhancement.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e f126415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final b f126416b;

    /* JADX INFO: compiled from: typeEnhancement.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f126417a;

        static {
            int[] iArr = new int[NullabilityQualifier.values().length];
            try {
                iArr[NullabilityQualifier.NULLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[NullabilityQualifier.NOT_NULL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f126417a = iArr;
        }
    }

    static {
        kotlin.reflect.jvm.internal.impl.name.c ENHANCED_NULLABILITY_ANNOTATION = t.f126329u;
        f0.o(ENHANCED_NULLABILITY_ANNOTATION, "ENHANCED_NULLABILITY_ANNOTATION");
        f126415a = new b(ENHANCED_NULLABILITY_ANNOTATION);
        kotlin.reflect.jvm.internal.impl.name.c ENHANCED_MUTABILITY_ANNOTATION = t.f126330v;
        f0.o(ENHANCED_MUTABILITY_ANNOTATION, "ENHANCED_MUTABILITY_ANNOTATION");
        f126416b = new b(ENHANCED_MUTABILITY_ANNOTATION);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e e(List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.e> list) {
        int size = list.size();
        if (size != 0) {
            return size != 1 ? new CompositeAnnotations((List<? extends kotlin.reflect.jvm.internal.impl.descriptors.annotations.e>) CollectionsKt___CollectionsKt.Q5(list)) : (kotlin.reflect.jvm.internal.impl.descriptors.annotations.e) CollectionsKt___CollectionsKt.c5(list);
        }
        throw new IllegalStateException("At least one Annotations object expected".toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.reflect.jvm.internal.impl.descriptors.f f(kotlin.reflect.jvm.internal.impl.descriptors.f fVar, d dVar, TypeComponentPosition typeComponentPosition) {
        kotlin.reflect.jvm.internal.impl.builtins.jvm.d dVar2 = kotlin.reflect.jvm.internal.impl.builtins.jvm.d.f125544a;
        if (!j.a(typeComponentPosition) || !(fVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d)) {
            return null;
        }
        if (dVar.c() == MutabilityQualifier.READ_ONLY && typeComponentPosition == TypeComponentPosition.FLEXIBLE_LOWER) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar3 = (kotlin.reflect.jvm.internal.impl.descriptors.d) fVar;
            if (dVar2.c(dVar3)) {
                return dVar2.a(dVar3);
            }
        }
        if (dVar.c() != MutabilityQualifier.MUTABLE || typeComponentPosition != TypeComponentPosition.FLEXIBLE_UPPER) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar4 = (kotlin.reflect.jvm.internal.impl.descriptors.d) fVar;
        if (dVar2.d(dVar4)) {
            return dVar2.b(dVar4);
        }
        return null;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e g() {
        return f126415a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean h(d dVar, TypeComponentPosition typeComponentPosition) {
        if (!j.a(typeComponentPosition)) {
            return null;
        }
        NullabilityQualifier nullabilityQualifierD = dVar.d();
        int i10 = nullabilityQualifierD == null ? -1 : a.f126417a[nullabilityQualifierD.ordinal()];
        if (i10 == 1) {
            return Boolean.TRUE;
        }
        if (i10 != 2) {
            return null;
        }
        return Boolean.FALSE;
    }

    public static final boolean i(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        return m.c(o.f128088a, d0Var);
    }
}
