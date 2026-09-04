package kotlin.reflect.jvm.internal.impl.load.java;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;

/* JADX INFO: compiled from: DescriptorsJvmAbiUtil.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    private static /* synthetic */ void a(int i10) {
        Object[] objArr = new Object[3];
        if (i10 == 1 || i10 == 2) {
            objArr[0] = "companionObject";
        } else if (i10 != 3) {
            objArr[0] = "propertyDescriptor";
        } else {
            objArr[0] = "memberDescriptor";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/DescriptorsJvmAbiUtil";
        if (i10 == 1) {
            objArr[2] = "isClassCompanionObjectWithBackingFieldsInOuter";
        } else if (i10 == 2) {
            objArr[2] = "isMappedIntrinsicCompanionObject";
        } else if (i10 != 3) {
            objArr[2] = "isPropertyWithBackingFieldInOuterClass";
        } else {
            objArr[2] = "hasJvmFieldAnnotation";
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static boolean b(@dl.d CallableMemberDescriptor callableMemberDescriptor) {
        kotlin.reflect.jvm.internal.impl.descriptors.v vVarT;
        if (callableMemberDescriptor == null) {
            a(3);
        }
        if ((callableMemberDescriptor instanceof o0) && (vVarT = ((o0) callableMemberDescriptor).T()) != null && vVarT.getAnnotations().J1(s.f126305b)) {
            return true;
        }
        return callableMemberDescriptor.getAnnotations().J1(s.f126305b);
    }

    public static boolean c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        if (kVar == null) {
            a(1);
        }
        return kotlin.reflect.jvm.internal.impl.resolve.d.x(kVar) && kotlin.reflect.jvm.internal.impl.resolve.d.w(kVar.c()) && !d((kotlin.reflect.jvm.internal.impl.descriptors.d) kVar);
    }

    public static boolean d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        if (dVar == null) {
            a(2);
        }
        return kotlin.reflect.jvm.internal.impl.builtins.c.a(kotlin.reflect.jvm.internal.impl.builtins.b.f125355a, dVar);
    }

    public static boolean e(@dl.d o0 o0Var) {
        if (o0Var == null) {
            a(0);
        }
        if (o0Var.b() == CallableMemberDescriptor.Kind.FAKE_OVERRIDE) {
            return false;
        }
        if (c(o0Var.c())) {
            return true;
        }
        return kotlin.reflect.jvm.internal.impl.resolve.d.x(o0Var.c()) && b(o0Var);
    }
}
