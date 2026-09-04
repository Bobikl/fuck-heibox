package kotlin.reflect.jvm.internal;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.z0;

/* JADX INFO: compiled from: typeOfImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q {
    @dl.d
    public static final kotlin.reflect.r a(@dl.d kotlin.reflect.r type) {
        f0.p(type, "type");
        d0 d0VarJ = ((KTypeImpl) type).j();
        if (!(d0VarJ instanceof j0)) {
            throw new IllegalArgumentException(("Non-simple type cannot be a mutable collection type: " + type).toString());
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0VarJ.O0().d();
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD : null;
        if (dVar != null) {
            j0 j0Var = (j0) d0VarJ;
            z0 z0VarR = d(dVar).r();
            f0.o(z0VarR, "classifier.readOnlyToMutable().typeConstructor");
            return new KTypeImpl(KotlinTypeFactory.k(j0Var, null, z0VarR, null, false, 26, null), null, 2, null);
        }
        throw new IllegalArgumentException("Non-class type cannot be a mutable collection type: " + type);
    }

    @dl.d
    public static final kotlin.reflect.r b(@dl.d kotlin.reflect.r type) {
        f0.p(type, "type");
        d0 d0VarJ = ((KTypeImpl) type).j();
        if (d0VarJ instanceof j0) {
            j0 j0Var = (j0) d0VarJ;
            z0 z0VarR = TypeUtilsKt.i(d0VarJ).G().r();
            f0.o(z0VarR, "kotlinType.builtIns.nothing.typeConstructor");
            return new KTypeImpl(KotlinTypeFactory.k(j0Var, null, z0VarR, null, false, 26, null), null, 2, null);
        }
        throw new IllegalArgumentException(("Non-simple type cannot be a Nothing type: " + type).toString());
    }

    @dl.d
    public static final kotlin.reflect.r c(@dl.d kotlin.reflect.r lowerBound, @dl.d kotlin.reflect.r upperBound) {
        f0.p(lowerBound, "lowerBound");
        f0.p(upperBound, "upperBound");
        d0 d0VarJ = ((KTypeImpl) lowerBound).j();
        f0.n(d0VarJ, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        d0 d0VarJ2 = ((KTypeImpl) upperBound).j();
        f0.n(d0VarJ2, "null cannot be cast to non-null type org.jetbrains.kotlin.types.SimpleType");
        return new KTypeImpl(KotlinTypeFactory.d((j0) d0VarJ, (j0) d0VarJ2), null, 2, null);
    }

    private static final kotlin.reflect.jvm.internal.impl.descriptors.d d(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        kotlin.reflect.jvm.internal.impl.name.c cVarP = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f125524a.p(DescriptorUtilsKt.m(dVar));
        if (cVarP != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = DescriptorUtilsKt.j(dVar).o(cVarP);
            f0.o(dVarO, "builtIns.getBuiltInClassByFqName(fqName)");
            return dVarO;
        }
        throw new IllegalArgumentException("Not a readonly collection: " + dVar);
    }
}
