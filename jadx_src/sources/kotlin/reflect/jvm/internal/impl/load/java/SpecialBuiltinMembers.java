package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.j0;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes5.dex */
@xh.h(name = "SpecialBuiltinMembers")
public final class SpecialBuiltinMembers {
    public static final boolean a(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
        f0.p(callableMemberDescriptor, "<this>");
        return d(callableMemberDescriptor) != null;
    }

    @dl.e
    public static final String b(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorS;
        kotlin.reflect.jvm.internal.impl.name.f fVarI;
        f0.p(callableMemberDescriptor, "callableMemberDescriptor");
        CallableMemberDescriptor callableMemberDescriptorC = c(callableMemberDescriptor);
        if (callableMemberDescriptorC == null || (callableMemberDescriptorS = DescriptorUtilsKt.s(callableMemberDescriptorC)) == null) {
            return null;
        }
        if (callableMemberDescriptorS instanceof o0) {
            return ClassicBuiltinSpecialProperties.f125962a.a(callableMemberDescriptorS);
        }
        if (!(callableMemberDescriptorS instanceof s0) || (fVarI = BuiltinMethodsWithDifferentJvmName.f125957n.i((s0) callableMemberDescriptorS)) == null) {
            return null;
        }
        return fVarI.b();
    }

    private static final CallableMemberDescriptor c(CallableMemberDescriptor callableMemberDescriptor) {
        if (kotlin.reflect.jvm.internal.impl.builtins.g.f0(callableMemberDescriptor)) {
            return d(callableMemberDescriptor);
        }
        return null;
    }

    @dl.e
    public static final <T extends CallableMemberDescriptor> T d(@dl.d T t10) {
        f0.p(t10, "<this>");
        if (!SpecialGenericSignatures.f125985a.g().contains(t10.getName()) && !c.f126008a.d().contains(DescriptorUtilsKt.s(t10).getName())) {
            return null;
        }
        if (t10 instanceof o0 ? true : t10 instanceof n0) {
            return (T) DescriptorUtilsKt.f(t10, false, new yh.l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d CallableMemberDescriptor it) {
                    f0.p(it, "it");
                    return Boolean.valueOf(ClassicBuiltinSpecialProperties.f125962a.b(DescriptorUtilsKt.s(it)));
                }
            }, 1, null);
        }
        if (t10 instanceof s0) {
            return (T) DescriptorUtilsKt.f(t10, false, new yh.l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenBuiltinWithDifferentJvmName$2
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d CallableMemberDescriptor it) {
                    f0.p(it, "it");
                    return Boolean.valueOf(BuiltinMethodsWithDifferentJvmName.f125957n.j((s0) it));
                }
            }, 1, null);
        }
        return null;
    }

    @dl.e
    public static final <T extends CallableMemberDescriptor> T e(@dl.d T t10) {
        f0.p(t10, "<this>");
        T t11 = (T) d(t10);
        if (t11 != null) {
            return t11;
        }
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f125959n;
        kotlin.reflect.jvm.internal.impl.name.f name = t10.getName();
        f0.o(name, "name");
        if (builtinMethodsWithSpecialGenericSignature.l(name)) {
            return (T) DescriptorUtilsKt.f(t10, false, new yh.l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers$getOverriddenSpecialBuiltin$2
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d CallableMemberDescriptor it) {
                    f0.p(it, "it");
                    return Boolean.valueOf(kotlin.reflect.jvm.internal.impl.builtins.g.f0(it) && BuiltinMethodsWithSpecialGenericSignature.m(it) != null);
                }
            }, 1, null);
        }
        return null;
    }

    public static final boolean f(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a specialCallableDescriptor) {
        f0.p(dVar, "<this>");
        f0.p(specialCallableDescriptor, "specialCallableDescriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = specialCallableDescriptor.c();
        f0.n(kVarC, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
        j0 j0VarV = ((kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC).v();
        f0.o(j0VarV, "specialCallableDescripto…ssDescriptor).defaultType");
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarS = kotlin.reflect.jvm.internal.impl.resolve.d.s(dVar);
        while (true) {
            if (dVarS == null) {
                return false;
            }
            if (!(dVarS instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c)) {
                if (kotlin.reflect.jvm.internal.impl.types.checker.s.b(dVarS.v(), j0VarV) != null) {
                    return !kotlin.reflect.jvm.internal.impl.builtins.g.f0(dVarS);
                }
            }
            dVarS = kotlin.reflect.jvm.internal.impl.resolve.d.s(dVarS);
        }
    }

    public static final boolean g(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
        f0.p(callableMemberDescriptor, "<this>");
        return DescriptorUtilsKt.s(callableMemberDescriptor).c() instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c;
    }

    public static final boolean h(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
        f0.p(callableMemberDescriptor, "<this>");
        return g(callableMemberDescriptor) || kotlin.reflect.jvm.internal.impl.builtins.g.f0(callableMemberDescriptor);
    }
}
