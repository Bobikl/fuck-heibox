package kotlin.reflect.jvm.internal.impl.resolve.jvm;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.h;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.f;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: inlineClassManglingRules.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b {
    private static final boolean a(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        return f0.g(DescriptorUtilsKt.l(dVar), h.f125408q);
    }

    public static final boolean b(@dl.d k kVar) {
        f0.p(kVar, "<this>");
        return kotlin.reflect.jvm.internal.impl.resolve.e.b(kVar) && !a((kotlin.reflect.jvm.internal.impl.descriptors.d) kVar);
    }

    public static final boolean c(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        f fVarD = d0Var.O0().d();
        return fVarD != null && b(fVarD);
    }

    private static final boolean d(d0 d0Var) {
        f fVarD = d0Var.O0().d();
        y0 y0Var = fVarD instanceof y0 ? (y0) fVarD : null;
        if (y0Var == null) {
            return false;
        }
        return e(TypeUtilsKt.j(y0Var));
    }

    private static final boolean e(d0 d0Var) {
        return c(d0Var) || d(d0Var);
    }

    public static final boolean f(@dl.d CallableMemberDescriptor descriptor) {
        f0.p(descriptor, "descriptor");
        kotlin.reflect.jvm.internal.impl.descriptors.c cVar = descriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.c ? (kotlin.reflect.jvm.internal.impl.descriptors.c) descriptor : null;
        if (cVar == null || r.g(cVar.getVisibility())) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarO = cVar.O();
        f0.o(dVarO, "constructorDescriptor.constructedClass");
        if (kotlin.reflect.jvm.internal.impl.resolve.e.b(dVarO) || kotlin.reflect.jvm.internal.impl.resolve.d.G(cVar.O())) {
            return false;
        }
        List<b1> listI = cVar.i();
        f0.o(listI, "constructorDescriptor.valueParameters");
        if ((listI instanceof Collection) && listI.isEmpty()) {
            return false;
        }
        Iterator<T> it = listI.iterator();
        while (it.hasNext()) {
            d0 type = ((b1) it.next()).getType();
            f0.o(type, "it.type");
            if (e(type)) {
                return true;
            }
        }
        return false;
    }
}
