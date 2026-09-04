package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class BuiltinMethodsWithSpecialGenericSignature extends SpecialGenericSignatures {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final BuiltinMethodsWithSpecialGenericSignature f125959n = new BuiltinMethodsWithSpecialGenericSignature();

    private BuiltinMethodsWithSpecialGenericSignature() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j(CallableMemberDescriptor callableMemberDescriptor) {
        return CollectionsKt___CollectionsKt.R1(SpecialGenericSignatures.f125985a.e(), kotlin.reflect.jvm.internal.impl.load.kotlin.t.d(callableMemberDescriptor));
    }

    @dl.e
    @xh.m
    public static final kotlin.reflect.jvm.internal.impl.descriptors.w k(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.w functionDescriptor) {
        f0.p(functionDescriptor, "functionDescriptor");
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = f125959n;
        kotlin.reflect.jvm.internal.impl.name.f name = functionDescriptor.getName();
        f0.o(name, "functionDescriptor.name");
        if (builtinMethodsWithSpecialGenericSignature.l(name)) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.w) DescriptorUtilsKt.f(functionDescriptor, false, new yh.l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getOverriddenBuiltinFunctionWithErasedValueParametersInJava$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(@dl.d CallableMemberDescriptor it) {
                    f0.p(it, "it");
                    return Boolean.valueOf(BuiltinMethodsWithSpecialGenericSignature.f125959n.j(it));
                }
            }, 1, null);
        }
        return null;
    }

    @dl.e
    @xh.m
    public static final SpecialGenericSignatures.SpecialSignatureInfo m(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
        CallableMemberDescriptor callableMemberDescriptorF;
        String strD;
        f0.p(callableMemberDescriptor, "<this>");
        SpecialGenericSignatures.a aVar = SpecialGenericSignatures.f125985a;
        if (!aVar.d().contains(callableMemberDescriptor.getName()) || (callableMemberDescriptorF = DescriptorUtilsKt.f(callableMemberDescriptor, false, new yh.l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature$getSpecialSignatureInfo$builtinSignature$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d CallableMemberDescriptor it) {
                f0.p(it, "it");
                return Boolean.valueOf((it instanceof kotlin.reflect.jvm.internal.impl.descriptors.w) && BuiltinMethodsWithSpecialGenericSignature.f125959n.j(it));
            }
        }, 1, null)) == null || (strD = kotlin.reflect.jvm.internal.impl.load.kotlin.t.d(callableMemberDescriptorF)) == null) {
            return null;
        }
        return aVar.l(strD);
    }

    public final boolean l(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar) {
        f0.p(fVar, "<this>");
        return SpecialGenericSignatures.f125985a.d().contains(fVar);
    }
}
