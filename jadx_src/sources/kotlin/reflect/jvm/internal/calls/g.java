package kotlin.reflect.jvm.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.d1;
import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import kotlin.reflect.jvm.internal.s;

/* JADX INFO: compiled from: InlineClassAwareCaller.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {
    @dl.e
    public static final Object a(@dl.e Object obj, @dl.d CallableMemberDescriptor descriptor) {
        d0 d0VarE;
        Class<?> clsI;
        Method methodF;
        f0.p(descriptor, "descriptor");
        return (((descriptor instanceof o0) && kotlin.reflect.jvm.internal.impl.resolve.e.d((d1) descriptor)) || (d0VarE = e(descriptor)) == null || (clsI = i(d0VarE)) == null || (methodF = f(clsI, descriptor)) == null) ? obj : methodF.invoke(obj, new Object[0]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @dl.d
    public static final <M extends Member> c<M> b(@dl.d c<? extends M> cVar, @dl.d CallableMemberDescriptor descriptor, boolean z10) {
        boolean z11;
        f0.p(cVar, "<this>");
        f0.p(descriptor, "descriptor");
        boolean z12 = true;
        if (!kotlin.reflect.jvm.internal.impl.resolve.e.a(descriptor)) {
            List<b1> listI = descriptor.i();
            f0.o(listI, "descriptor.valueParameters");
            if (!(listI instanceof Collection) || !listI.isEmpty()) {
                Iterator<T> it = listI.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z11 = false;
                        break;
                    }
                    d0 type = ((b1) it.next()).getType();
                    f0.o(type, "it.type");
                    if (kotlin.reflect.jvm.internal.impl.resolve.e.c(type)) {
                        z11 = true;
                        break;
                    }
                }
            } else {
                z11 = false;
                break;
            }
            if (!z11) {
                d0 returnType = descriptor.getReturnType();
                if (!(returnType != null && kotlin.reflect.jvm.internal.impl.resolve.e.c(returnType)) && ((cVar instanceof b) || !g(descriptor))) {
                    z12 = false;
                }
            }
        }
        return z12 ? new f(descriptor, cVar, z10) : cVar;
    }

    public static /* synthetic */ c c(c cVar, CallableMemberDescriptor callableMemberDescriptor, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        return b(cVar, callableMemberDescriptor, z10);
    }

    @dl.d
    public static final Method d(@dl.d Class<?> cls, @dl.d CallableMemberDescriptor descriptor) {
        f0.p(cls, "<this>");
        f0.p(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("box-impl", f(cls, descriptor).getReturnType());
            f0.o(declaredMethod, "{\n        getDeclaredMet…riptor).returnType)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No box method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    private static final d0 e(CallableMemberDescriptor callableMemberDescriptor) {
        r0 r0VarL0 = callableMemberDescriptor.l0();
        r0 r0VarI0 = callableMemberDescriptor.i0();
        if (r0VarL0 != null) {
            return r0VarL0.getType();
        }
        if (r0VarI0 == null) {
            return null;
        }
        if (callableMemberDescriptor instanceof j) {
            return r0VarI0.getType();
        }
        k kVarC = callableMemberDescriptor.c();
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC : null;
        if (dVar != null) {
            return dVar.v();
        }
        return null;
    }

    @dl.d
    public static final Method f(@dl.d Class<?> cls, @dl.d CallableMemberDescriptor descriptor) {
        f0.p(cls, "<this>");
        f0.p(descriptor, "descriptor");
        try {
            Method declaredMethod = cls.getDeclaredMethod("unbox-impl", new Class[0]);
            f0.o(declaredMethod, "{\n        getDeclaredMet…LINE_CLASS_MEMBERS)\n    }");
            return declaredMethod;
        } catch (NoSuchMethodException unused) {
            throw new KotlinReflectionInternalError("No unbox method found in inline class: " + cls + " (calling " + descriptor + ')');
        }
    }

    private static final boolean g(CallableMemberDescriptor callableMemberDescriptor) {
        d0 d0VarE = e(callableMemberDescriptor);
        return d0VarE != null && kotlin.reflect.jvm.internal.impl.resolve.e.c(d0VarE);
    }

    @dl.e
    public static final Class<?> h(@dl.e k kVar) {
        if (!(kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) || !kotlin.reflect.jvm.internal.impl.resolve.e.b(kVar)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = (kotlin.reflect.jvm.internal.impl.descriptors.d) kVar;
        Class<?> clsP = s.p(dVar);
        if (clsP != null) {
            return clsP;
        }
        throw new KotlinReflectionInternalError("Class object for the class " + dVar.getName() + " cannot be found (classId=" + DescriptorUtilsKt.k((kotlin.reflect.jvm.internal.impl.descriptors.f) kVar) + ')');
    }

    @dl.e
    public static final Class<?> i(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        Class<?> clsH = h(d0Var.O0().d());
        if (clsH == null) {
            return null;
        }
        if (!i1.l(d0Var)) {
            return clsH;
        }
        d0 d0VarE = kotlin.reflect.jvm.internal.impl.resolve.e.e(d0Var);
        if (d0VarE == null || i1.l(d0VarE) || kotlin.reflect.jvm.internal.impl.builtins.g.r0(d0VarE)) {
            return null;
        }
        return clsH;
    }
}
