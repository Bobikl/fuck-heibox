package kotlin.reflect.jvm.internal;

import com.meituan.robust.Constants;
import java.lang.reflect.Method;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.q0;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectJavaClass;
import kotlin.reflect.jvm.internal.impl.descriptors.t0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final p f128319a = new p();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.b f128320b;

    static {
        kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(new kotlin.reflect.jvm.internal.impl.name.c(Constants.LANG_VOID));
        f0.o(bVarM, "topLevel(FqName(\"java.lang.Void\"))");
        f128320b = bVarM;
    }

    private p() {
    }

    private final PrimitiveType a(Class<?> cls) {
        if (cls.isPrimitive()) {
            return JvmPrimitiveType.get(cls.getSimpleName()).getPrimitiveType();
        }
        return null;
    }

    private final boolean b(w wVar) {
        if (kotlin.reflect.jvm.internal.impl.resolve.c.p(wVar) || kotlin.reflect.jvm.internal.impl.resolve.c.q(wVar)) {
            return true;
        }
        return f0.g(wVar.getName(), kotlin.reflect.jvm.internal.impl.builtins.jvm.a.f125520e.a()) && wVar.i().isEmpty();
    }

    private final JvmFunctionSignature.c d(w wVar) {
        return new JvmFunctionSignature.c(new kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b(e(wVar), kotlin.reflect.jvm.internal.impl.load.kotlin.t.c(wVar, false, false, 1, null)));
    }

    private final String e(CallableMemberDescriptor callableMemberDescriptor) {
        String strB = SpecialBuiltinMembers.b(callableMemberDescriptor);
        if (strB != null) {
            return strB;
        }
        if (callableMemberDescriptor instanceof p0) {
            String strB2 = DescriptorUtilsKt.s(callableMemberDescriptor).getName().b();
            f0.o(strB2, "descriptor.propertyIfAccessor.name.asString()");
            return kotlin.reflect.jvm.internal.impl.load.java.s.b(strB2);
        }
        if (callableMemberDescriptor instanceof q0) {
            String strB3 = DescriptorUtilsKt.s(callableMemberDescriptor).getName().b();
            f0.o(strB3, "descriptor.propertyIfAccessor.name.asString()");
            return kotlin.reflect.jvm.internal.impl.load.java.s.e(strB3);
        }
        String strB4 = callableMemberDescriptor.getName().b();
        f0.o(strB4, "descriptor.name.asString()");
        return strB4;
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.name.b c(@dl.d Class<?> klass) {
        f0.p(klass, "klass");
        if (klass.isArray()) {
            Class<?> componentType = klass.getComponentType();
            f0.o(componentType, "klass.componentType");
            PrimitiveType primitiveTypeA = a(componentType);
            if (primitiveTypeA != null) {
                return new kotlin.reflect.jvm.internal.impl.name.b(kotlin.reflect.jvm.internal.impl.builtins.h.f125412u, primitiveTypeA.getArrayTypeName());
            }
            kotlin.reflect.jvm.internal.impl.name.b bVarM = kotlin.reflect.jvm.internal.impl.name.b.m(kotlin.reflect.jvm.internal.impl.builtins.h.a.f125434i.l());
            f0.o(bVarM, "topLevel(StandardNames.FqNames.array.toSafe())");
            return bVarM;
        }
        if (f0.g(klass, Void.TYPE)) {
            return f128320b;
        }
        PrimitiveType primitiveTypeA2 = a(klass);
        if (primitiveTypeA2 != null) {
            return new kotlin.reflect.jvm.internal.impl.name.b(kotlin.reflect.jvm.internal.impl.builtins.h.f125412u, primitiveTypeA2.getTypeName());
        }
        kotlin.reflect.jvm.internal.impl.name.b bVarA = ReflectClassUtilKt.a(klass);
        if (!bVarA.k()) {
            kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f125524a;
            kotlin.reflect.jvm.internal.impl.name.c cVarB = bVarA.b();
            f0.o(cVarB, "classId.asSingleFqName()");
            kotlin.reflect.jvm.internal.impl.name.b bVarM2 = cVar.m(cVarB);
            if (bVarM2 != null) {
                return bVarM2;
            }
        }
        return bVarA;
    }

    @dl.d
    public final h f(@dl.d o0 possiblyOverriddenProperty) {
        f0.p(possiblyOverriddenProperty, "possiblyOverriddenProperty");
        o0 o0VarA = ((o0) kotlin.reflect.jvm.internal.impl.resolve.d.L(possiblyOverriddenProperty)).a();
        f0.o(o0VarA, "unwrapFakeOverride(possi…rriddenProperty).original");
        if (o0VarA instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.h) o0VarA;
            ProtoBuf.Property propertyH1 = hVar.P();
            GeneratedMessageLite.f<ProtoBuf.Property, JvmProtoBuf.JvmPropertySignature> propertySignature = JvmProtoBuf.f127073d;
            f0.o(propertySignature, "propertySignature");
            JvmProtoBuf.JvmPropertySignature jvmPropertySignature = (JvmProtoBuf.JvmPropertySignature) kotlin.reflect.jvm.internal.impl.metadata.deserialization.e.a(propertyH1, propertySignature);
            if (jvmPropertySignature != null) {
                return new h.c(o0VarA, propertyH1, jvmPropertySignature, hVar.g0(), hVar.E());
            }
        } else if (o0VarA instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) {
            t0 t0VarJ = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.e) o0VarA).j();
            li.a aVar = t0VarJ instanceof li.a ? (li.a) t0VarJ : null;
            mi.l lVarC = aVar != null ? aVar.c() : null;
            if (lVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.p) {
                return new h.a(((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.p) lVarC).Q());
            }
            if (lVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s) {
                Method methodS = ((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s) lVarC).Q();
                q0 setter = o0VarA.getSetter();
                t0 t0VarJ2 = setter != null ? setter.j() : null;
                li.a aVar2 = t0VarJ2 instanceof li.a ? (li.a) t0VarJ2 : null;
                mi.l lVarC2 = aVar2 != null ? aVar2.c() : null;
                kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s sVar = lVarC2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s) lVarC2 : null;
                return new h.b(methodS, sVar != null ? sVar.Q() : null);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java field " + o0VarA + " (source = " + lVarC + ')');
        }
        p0 getter = o0VarA.getGetter();
        f0.m(getter);
        JvmFunctionSignature.c cVarD = d(getter);
        q0 setter2 = o0VarA.getSetter();
        return new h.d(cVarD, setter2 != null ? d(setter2) : null);
    }

    @dl.d
    public final JvmFunctionSignature g(@dl.d w possiblySubstitutedFunction) {
        Method methodS;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b bVarB;
        kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.d.b bVarE;
        f0.p(possiblySubstitutedFunction, "possiblySubstitutedFunction");
        w wVarA = ((w) kotlin.reflect.jvm.internal.impl.resolve.d.L(possiblySubstitutedFunction)).a();
        f0.o(wVarA, "unwrapFakeOverride(possi…titutedFunction).original");
        if (wVarA instanceof kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c) {
            kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c cVar = (kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.c) wVarA;
            kotlin.reflect.jvm.internal.impl.protobuf.n nVarP = cVar.P();
            if ((nVarP instanceof ProtoBuf.Function) && (bVarE = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f127181a.e((ProtoBuf.Function) nVarP, cVar.g0(), cVar.E())) != null) {
                return new JvmFunctionSignature.c(bVarE);
            }
            if (!(nVarP instanceof ProtoBuf.Constructor) || (bVarB = kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization.i.f127181a.b((ProtoBuf.Constructor) nVarP, cVar.g0(), cVar.E())) == null) {
                return d(wVarA);
            }
            kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = possiblySubstitutedFunction.c();
            f0.o(kVarC, "possiblySubstitutedFunction.containingDeclaration");
            return kotlin.reflect.jvm.internal.impl.resolve.e.b(kVarC) ? new JvmFunctionSignature.c(bVarB) : new JvmFunctionSignature.b(bVarB);
        }
        if (wVarA instanceof JavaMethodDescriptor) {
            t0 t0VarJ = ((JavaMethodDescriptor) wVarA).j();
            li.a aVar = t0VarJ instanceof li.a ? (li.a) t0VarJ : null;
            mi.l lVarC = aVar != null ? aVar.c() : null;
            kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s sVar = lVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s ? (kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.s) lVarC : null;
            if (sVar != null && (methodS = sVar.Q()) != null) {
                return new JvmFunctionSignature.a(methodS);
            }
            throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java method " + wVarA);
        }
        if (!(wVarA instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.b)) {
            if (b(wVarA)) {
                return d(wVarA);
            }
            throw new KotlinReflectionInternalError("Unknown origin of " + wVarA + " (" + wVarA.getClass() + ')');
        }
        t0 t0VarJ2 = ((kotlin.reflect.jvm.internal.impl.load.java.descriptors.b) wVarA).j();
        li.a aVar2 = t0VarJ2 instanceof li.a ? (li.a) t0VarJ2 : null;
        mi.l lVarC2 = aVar2 != null ? aVar2.c() : null;
        if (lVarC2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.m) {
            return new JvmFunctionSignature.JavaConstructor(((kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.m) lVarC2).Q());
        }
        if (lVarC2 instanceof ReflectJavaClass) {
            ReflectJavaClass reflectJavaClass = (ReflectJavaClass) lVarC2;
            if (reflectJavaClass.s()) {
                return new JvmFunctionSignature.FakeJavaAnnotationConstructor(reflectJavaClass.a());
            }
        }
        throw new KotlinReflectionInternalError("Incorrect resolution sequence for Java constructor " + wVarA + " (" + lVarC2 + ')');
    }
}
