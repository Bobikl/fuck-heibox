package kotlin.reflect.jvm.internal.impl.load.java;

import java.util.Iterator;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.g1;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.LazyJavaAnnotations;
import mi.c0;

/* JADX INFO: compiled from: utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class x {
    @dl.e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.c a(@dl.d kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10, @dl.d c0 wildcardType) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c next;
        boolean z10;
        f0.p(c10, "c");
        f0.p(wildcardType, "wildcardType");
        if (!(wildcardType.w() != null)) {
            throw new IllegalArgumentException("Nullability annotations on unbounded wildcards aren't supported".toString());
        }
        Iterator<kotlin.reflect.jvm.internal.impl.descriptors.annotations.c> it = new LazyJavaAnnotations(c10, wildcardType, false, 4, null).iterator();
        while (it.hasNext()) {
            next = it.next();
            kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar = next;
            kotlin.reflect.jvm.internal.impl.name.c[] cVarArrF = p.f();
            int length = cVarArrF.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    z10 = false;
                    break;
                }
                if (f0.g(cVar.e(), cVarArrF[i10])) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (z10) {
                return next;
            }
        }
        next = null;
        return next;
    }

    public static final boolean b(@dl.d CallableMemberDescriptor memberDescriptor) {
        f0.p(memberDescriptor, "memberDescriptor");
        return (memberDescriptor instanceof kotlin.reflect.jvm.internal.impl.descriptors.w) && f0.g(memberDescriptor.S(JavaMethodDescriptor.I), Boolean.TRUE);
    }

    public static final boolean c(@dl.d JavaTypeEnhancementState javaTypeEnhancementState) {
        f0.p(javaTypeEnhancementState, "javaTypeEnhancementState");
        return javaTypeEnhancementState.c().invoke(p.e()) == ReportLevel.STRICT;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.s d(@dl.d g1 g1Var) {
        f0.p(g1Var, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.s sVarG = m.g(g1Var);
        f0.o(sVarG, "toDescriptorVisibility(this)");
        return sVarG;
    }
}
