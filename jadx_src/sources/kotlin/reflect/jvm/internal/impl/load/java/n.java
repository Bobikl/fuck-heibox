package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class n implements ExternalOverridabilityCondition {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a f126290a = new a(null);

    /* JADX INFO: compiled from: JavaIncompatibilityRulesOverridabilityCondition.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        private final boolean b(kotlin.reflect.jvm.internal.impl.descriptors.w wVar) {
            if (wVar.i().size() != 1) {
                return false;
            }
            kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = wVar.c();
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar = kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC : null;
            if (dVar == null) {
                return false;
            }
            List<b1> listI = wVar.i();
            f0.o(listI, "f.valueParameters");
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = ((b1) CollectionsKt___CollectionsKt.c5(listI)).getType().O0().d();
            kotlin.reflect.jvm.internal.impl.descriptors.d dVar2 = fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD : null;
            if (dVar2 == null) {
                return false;
            }
            return kotlin.reflect.jvm.internal.impl.builtins.g.q0(dVar) && f0.g(DescriptorUtilsKt.l(dVar), DescriptorUtilsKt.l(dVar2));
        }

        private final kotlin.reflect.jvm.internal.impl.load.kotlin.j c(kotlin.reflect.jvm.internal.impl.descriptors.w wVar, b1 b1Var) {
            if (kotlin.reflect.jvm.internal.impl.load.kotlin.t.e(wVar) || b(wVar)) {
                d0 type = b1Var.getType();
                f0.o(type, "valueParameterDescriptor.type");
                return kotlin.reflect.jvm.internal.impl.load.kotlin.t.g(TypeUtilsKt.u(type));
            }
            d0 type2 = b1Var.getType();
            f0.o(type2, "valueParameterDescriptor.type");
            return kotlin.reflect.jvm.internal.impl.load.kotlin.t.g(type2);
        }

        public final boolean a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a superDescriptor, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a subDescriptor) {
            f0.p(superDescriptor, "superDescriptor");
            f0.p(subDescriptor, "subDescriptor");
            if ((subDescriptor instanceof JavaMethodDescriptor) && (superDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.w)) {
                JavaMethodDescriptor javaMethodDescriptor = (JavaMethodDescriptor) subDescriptor;
                javaMethodDescriptor.i().size();
                kotlin.reflect.jvm.internal.impl.descriptors.w wVar = (kotlin.reflect.jvm.internal.impl.descriptors.w) superDescriptor;
                wVar.i().size();
                List<b1> listI = javaMethodDescriptor.a().i();
                f0.o(listI, "subDescriptor.original.valueParameters");
                List<b1> listI2 = wVar.a().i();
                f0.o(listI2, "superDescriptor.original.valueParameters");
                for (Pair pair : CollectionsKt___CollectionsKt.d6(listI, listI2)) {
                    b1 subParameter = (b1) pair.a();
                    b1 superParameter = (b1) pair.b();
                    f0.o(subParameter, "subParameter");
                    boolean z10 = c((kotlin.reflect.jvm.internal.impl.descriptors.w) subDescriptor, subParameter) instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.j.d;
                    f0.o(superParameter, "superParameter");
                    if (z10 != (c(wVar, superParameter) instanceof kotlin.reflect.jvm.internal.impl.load.kotlin.j.d)) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    private final boolean c(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2, kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if ((aVar instanceof CallableMemberDescriptor) && (aVar2 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w) && !kotlin.reflect.jvm.internal.impl.builtins.g.f0(aVar2)) {
            BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f125959n;
            kotlin.reflect.jvm.internal.impl.descriptors.w wVar = (kotlin.reflect.jvm.internal.impl.descriptors.w) aVar2;
            kotlin.reflect.jvm.internal.impl.name.f name = wVar.getName();
            f0.o(name, "subDescriptor.name");
            if (!builtinMethodsWithSpecialGenericSignature.l(name)) {
                SpecialGenericSignatures.a aVar3 = SpecialGenericSignatures.f125985a;
                kotlin.reflect.jvm.internal.impl.name.f name2 = wVar.getName();
                f0.o(name2, "subDescriptor.name");
                if (!aVar3.k(name2)) {
                    return false;
                }
            }
            CallableMemberDescriptor callableMemberDescriptorE = SpecialBuiltinMembers.e((CallableMemberDescriptor) aVar);
            boolean z10 = aVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.w;
            kotlin.reflect.jvm.internal.impl.descriptors.w wVar2 = z10 ? (kotlin.reflect.jvm.internal.impl.descriptors.w) aVar : null;
            if ((!(wVar2 != null && wVar.J0() == wVar2.J0())) && (callableMemberDescriptorE == null || !wVar.J0())) {
                return true;
            }
            if ((dVar instanceof kotlin.reflect.jvm.internal.impl.load.java.descriptors.c) && wVar.D0() == null && callableMemberDescriptorE != null && !SpecialBuiltinMembers.f(dVar, callableMemberDescriptorE)) {
                if ((callableMemberDescriptorE instanceof kotlin.reflect.jvm.internal.impl.descriptors.w) && z10 && BuiltinMethodsWithSpecialGenericSignature.k((kotlin.reflect.jvm.internal.impl.descriptors.w) callableMemberDescriptorE) != null) {
                    String strC = kotlin.reflect.jvm.internal.impl.load.kotlin.t.c(wVar, false, false, 2, null);
                    kotlin.reflect.jvm.internal.impl.descriptors.w wVarA = ((kotlin.reflect.jvm.internal.impl.descriptors.w) aVar).a();
                    f0.o(wVarA, "superDescriptor.original");
                    if (f0.g(strC, kotlin.reflect.jvm.internal.impl.load.kotlin.t.c(wVarA, false, false, 2, null))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @dl.d
    public ExternalOverridabilityCondition.Contract a() {
        return ExternalOverridabilityCondition.Contract.CONFLICTS_ONLY;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.ExternalOverridabilityCondition
    @dl.d
    public ExternalOverridabilityCondition.Result b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a superDescriptor, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.a subDescriptor, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        f0.p(superDescriptor, "superDescriptor");
        f0.p(subDescriptor, "subDescriptor");
        if (!c(superDescriptor, subDescriptor, dVar) && !f126290a.a(superDescriptor, subDescriptor)) {
            return ExternalOverridabilityCondition.Result.UNKNOWN;
        }
        return ExternalOverridabilityCondition.Result.INCOMPATIBLE;
    }
}
