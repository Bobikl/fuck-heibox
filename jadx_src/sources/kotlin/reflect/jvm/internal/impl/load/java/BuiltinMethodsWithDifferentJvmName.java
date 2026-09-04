package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Map;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;

/* JADX INFO: compiled from: specialBuiltinMembers.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class BuiltinMethodsWithDifferentJvmName extends SpecialGenericSignatures {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    public static final BuiltinMethodsWithDifferentJvmName f125957n = new BuiltinMethodsWithDifferentJvmName();

    private BuiltinMethodsWithDifferentJvmName() {
    }

    @dl.e
    public final kotlin.reflect.jvm.internal.impl.name.f i(@dl.d s0 functionDescriptor) {
        f0.p(functionDescriptor, "functionDescriptor");
        Map<String, kotlin.reflect.jvm.internal.impl.name.f> mapJ = SpecialGenericSignatures.f125985a.j();
        String strD = kotlin.reflect.jvm.internal.impl.load.kotlin.t.d(functionDescriptor);
        if (strD == null) {
            return null;
        }
        return mapJ.get(strD);
    }

    public final boolean j(@dl.d final s0 functionDescriptor) {
        f0.p(functionDescriptor, "functionDescriptor");
        return kotlin.reflect.jvm.internal.impl.builtins.g.f0(functionDescriptor) && DescriptorUtilsKt.f(functionDescriptor, false, new yh.l<CallableMemberDescriptor, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName$isBuiltinFunctionWithDifferentNameInJvm$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d CallableMemberDescriptor it) {
                f0.p(it, "it");
                return Boolean.valueOf(SpecialGenericSignatures.f125985a.j().containsKey(kotlin.reflect.jvm.internal.impl.load.kotlin.t.d(functionDescriptor)));
            }
        }, 1, null) != null;
    }

    public final boolean k(@dl.d s0 s0Var) {
        f0.p(s0Var, "<this>");
        return f0.g(s0Var.getName().b(), "removeAt") && f0.g(kotlin.reflect.jvm.internal.impl.load.kotlin.t.d(s0Var), SpecialGenericSignatures.f125985a.h().b());
    }
}
