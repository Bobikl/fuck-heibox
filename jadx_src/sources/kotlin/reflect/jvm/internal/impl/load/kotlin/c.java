package kotlin.reflect.jvm.internal.impl.load.kotlin;

import com.tencent.qcloud.core.util.IOUtils;
import kotlin.b2;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.x0;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.z0;
import kotlin.reflect.jvm.internal.impl.utils.FunctionsKt;

/* JADX INFO: compiled from: descriptorBasedTypeSignatureMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    @dl.d
    public static final String a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d klass, @dl.d v<?> typeMappingConfiguration) {
        f0.p(klass, "klass");
        f0.p(typeMappingConfiguration, "typeMappingConfiguration");
        String strD = typeMappingConfiguration.d(klass);
        if (strD != null) {
            return strD;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = klass.c();
        f0.o(kVarC, "klass.containingDeclaration");
        String strD2 = kotlin.reflect.jvm.internal.impl.name.h.b(klass.getName()).d();
        f0.o(strD2, "safeIdentifier(klass.name).identifier");
        if (kVarC instanceof g0) {
            kotlin.reflect.jvm.internal.impl.name.c cVarE = ((g0) kVarC).e();
            if (cVarE.d()) {
                return strD2;
            }
            StringBuilder sb2 = new StringBuilder();
            String strB = cVarE.b();
            f0.o(strB, "fqName.asString()");
            sb2.append(kotlin.text.u.k2(strB, lg.a.f131414g, IOUtils.DIR_SEPARATOR_UNIX, false, 4, null));
            sb2.append(IOUtils.DIR_SEPARATOR_UNIX);
            sb2.append(strD2);
            return sb2.toString();
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC : null;
        if (dVar == null) {
            throw new IllegalArgumentException("Unexpected container: " + kVarC + " for " + klass);
        }
        String strB2 = typeMappingConfiguration.b(dVar);
        if (strB2 == null) {
            strB2 = a(dVar, typeMappingConfiguration);
        }
        return strB2 + kotlin.text.y.f128594c + strD2;
    }

    public static /* synthetic */ String b(kotlin.reflect.jvm.internal.impl.descriptors.d dVar, v vVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            vVar = w.f126561a;
        }
        return a(dVar, vVar);
    }

    public static final boolean c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a descriptor) {
        f0.p(descriptor, "descriptor");
        if (descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.j) {
            return true;
        }
        d0 returnType = descriptor.getReturnType();
        f0.m(returnType);
        if (kotlin.reflect.jvm.internal.impl.builtins.g.B0(returnType)) {
            d0 returnType2 = descriptor.getReturnType();
            f0.m(returnType2);
            if (!i1.l(returnType2) && !(descriptor instanceof p0)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [T, java.lang.Object] */
    @dl.d
    public static final <T> T d(@dl.d d0 kotlinType, @dl.d k<T> factory, @dl.d x mode, @dl.d v<? extends T> typeMappingConfiguration, @dl.e h<T> hVar, @dl.d yh.q<? super d0, ? super T, ? super x, b2> writeGenericType) {
        T t10;
        d0 d0Var;
        Object objD;
        f0.p(kotlinType, "kotlinType");
        f0.p(factory, "factory");
        f0.p(mode, "mode");
        f0.p(typeMappingConfiguration, "typeMappingConfiguration");
        f0.p(writeGenericType, "writeGenericType");
        d0 d0VarC = typeMappingConfiguration.c(kotlinType);
        if (d0VarC != null) {
            return (T) d(d0VarC, factory, mode, typeMappingConfiguration, hVar, writeGenericType);
        }
        if (kotlin.reflect.jvm.internal.impl.builtins.f.q(kotlinType)) {
            return (T) d(kotlin.reflect.jvm.internal.impl.builtins.i.a(kotlinType), factory, mode, typeMappingConfiguration, hVar, writeGenericType);
        }
        kotlin.reflect.jvm.internal.impl.types.checker.o oVar = kotlin.reflect.jvm.internal.impl.types.checker.o.f128088a;
        Object objB = y.b(oVar, kotlinType, factory, mode);
        if (objB != null) {
            ?? r10 = (Object) y.a(factory, objB, mode.d());
            writeGenericType.invoke(kotlinType, r10, mode);
            return r10;
        }
        z0 z0VarO0 = kotlinType.O0();
        if (z0VarO0 instanceof IntersectionTypeConstructor) {
            IntersectionTypeConstructor intersectionTypeConstructor = (IntersectionTypeConstructor) z0VarO0;
            d0 d0VarH = intersectionTypeConstructor.h();
            if (d0VarH == null) {
                d0VarH = typeMappingConfiguration.f(intersectionTypeConstructor.l());
            }
            return (T) d(TypeUtilsKt.w(d0VarH), factory, mode, typeMappingConfiguration, hVar, writeGenericType);
        }
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = z0VarO0.d();
        if (fVarD == null) {
            throw new UnsupportedOperationException("no descriptor for type constructor of " + kotlinType);
        }
        if (kotlin.reflect.jvm.internal.impl.types.error.h.m(fVarD)) {
            T t11 = (T) factory.f("error/NonExistentClass");
            typeMappingConfiguration.e(kotlinType, (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD);
            if (hVar != 0) {
                hVar.c(t11);
            }
            return t11;
        }
        boolean z10 = fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d;
        if (z10 && kotlin.reflect.jvm.internal.impl.builtins.g.c0(kotlinType)) {
            if (kotlinType.M0().size() != 1) {
                throw new UnsupportedOperationException("arrays must have one type argument");
            }
            c1 c1Var = kotlinType.M0().get(0);
            d0 type = c1Var.getType();
            f0.o(type, "memberProjection.type");
            if (c1Var.c() == Variance.IN_VARIANCE) {
                objD = factory.f("java/lang/Object");
                if (hVar != 0) {
                    hVar.b();
                    hVar.c(objD);
                    hVar.a();
                }
            } else {
                if (hVar != 0) {
                    hVar.b();
                }
                Variance varianceC = c1Var.c();
                f0.o(varianceC, "memberProjection.projectionKind");
                objD = d(type, factory, mode.f(varianceC, true), typeMappingConfiguration, hVar, writeGenericType);
                if (hVar != 0) {
                    hVar.a();
                }
            }
            return (T) factory.a('[' + factory.e(objD));
        }
        if (!z10) {
            if (!(fVarD instanceof y0)) {
                if ((fVarD instanceof x0) && mode.b()) {
                    return (T) d(((x0) fVarD).f0(), factory, mode, typeMappingConfiguration, hVar, writeGenericType);
                }
                throw new UnsupportedOperationException("Unknown type " + kotlinType);
            }
            d0 d0VarJ = TypeUtilsKt.j((y0) fVarD);
            if (kotlinType.P0()) {
                d0VarJ = TypeUtilsKt.u(d0VarJ);
            }
            T t12 = (T) d(d0VarJ, factory, mode, typeMappingConfiguration, null, FunctionsKt.b());
            if (hVar != 0) {
                kotlin.reflect.jvm.internal.impl.name.f name = fVarD.getName();
                f0.o(name, "descriptor.getName()");
                hVar.e(name, t12);
            }
            return t12;
        }
        if (kotlin.reflect.jvm.internal.impl.resolve.e.b(fVarD) && !mode.c() && (d0Var = (d0) kotlin.reflect.jvm.internal.impl.types.x.a(oVar, kotlinType)) != null) {
            return (T) d(d0Var, factory, mode.g(), typeMappingConfiguration, hVar, writeGenericType);
        }
        if (mode.e() && kotlin.reflect.jvm.internal.impl.builtins.g.k0((kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD)) {
            t10 = (Object) factory.b();
        } else {
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD;
            kotlin.reflect.jvm.internal.impl.descriptors.d dVarA = dVar.a();
            f0.o(dVarA, "descriptor.original");
            T tA = typeMappingConfiguration.a(dVarA);
            if (tA == null) {
                if (dVar.b() == ClassKind.ENUM_ENTRY) {
                    kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = dVar.c();
                    f0.n(kVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC;
                }
                kotlin.reflect.jvm.internal.impl.descriptors.d dVarA2 = dVar.a();
                f0.o(dVarA2, "enumClassIfEnumEntry.original");
                t10 = (Object) factory.f(a(dVarA2, typeMappingConfiguration));
            } else {
                t10 = (Object) tA;
            }
        }
        writeGenericType.invoke(kotlinType, t10, mode);
        return t10;
    }

    public static /* synthetic */ Object e(d0 d0Var, k kVar, x xVar, v vVar, h hVar, yh.q qVar, int i10, Object obj) {
        if ((i10 & 32) != 0) {
            qVar = FunctionsKt.b();
        }
        return d(d0Var, kVar, xVar, vVar, hVar, qVar);
    }
}
