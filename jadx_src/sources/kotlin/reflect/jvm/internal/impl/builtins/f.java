package kotlin.reflect.jvm.internal.impl.builtins;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.r0;
import kotlin.collections.s0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.functions.FunctionClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.BuiltInAnnotationDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.resolve.constants.l;
import kotlin.reflect.jvm.internal.impl.resolve.constants.t;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.KotlinTypeFactory;
import kotlin.reflect.jvm.internal.impl.types.c1;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;
import kotlin.reflect.jvm.internal.impl.types.x0;

/* JADX INFO: compiled from: functionTypes.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    public static final int a(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVarK = d0Var.getAnnotations().k(h.a.D);
        if (cVarK == null) {
            return 0;
        }
        kotlin.reflect.jvm.internal.impl.resolve.constants.g gVar = (kotlin.reflect.jvm.internal.impl.resolve.constants.g) s0.K(cVarK.a(), h.f125402k);
        f0.n(gVar, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.constants.IntValue");
        return ((l) gVar).b().intValue();
    }

    @dl.d
    @xh.i
    public static final j0 b(@dl.d g builtIns, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.e d0 d0Var, @dl.d List<? extends d0> contextReceiverTypes, @dl.d List<? extends d0> parameterTypes, @dl.e List<kotlin.reflect.jvm.internal.impl.name.f> list, @dl.d d0 returnType, boolean z10) {
        f0.p(builtIns, "builtIns");
        f0.p(annotations, "annotations");
        f0.p(contextReceiverTypes, "contextReceiverTypes");
        f0.p(parameterTypes, "parameterTypes");
        f0.p(returnType, "returnType");
        List<c1> listG = g(d0Var, contextReceiverTypes, parameterTypes, list, returnType, builtIns);
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarF = f(builtIns, parameterTypes.size() + contextReceiverTypes.size() + (d0Var == null ? 0 : 1), z10);
        if (d0Var != null) {
            annotations = t(annotations, builtIns);
        }
        if (!contextReceiverTypes.isEmpty()) {
            annotations = s(annotations, builtIns, contextReceiverTypes.size());
        }
        return KotlinTypeFactory.g(x0.b(annotations), dVarF, listG);
    }

    @dl.e
    public static final kotlin.reflect.jvm.internal.impl.name.f d(@dl.d d0 d0Var) {
        String strB;
        f0.p(d0Var, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVarK = d0Var.getAnnotations().k(h.a.E);
        if (cVarK == null) {
            return null;
        }
        Object objD5 = CollectionsKt___CollectionsKt.d5(cVarK.a().values());
        t tVar = objD5 instanceof t ? (t) objD5 : null;
        if (tVar != null && (strB = tVar.b()) != null) {
            if (!kotlin.reflect.jvm.internal.impl.name.f.h(strB)) {
                strB = null;
            }
            if (strB != null) {
                return kotlin.reflect.jvm.internal.impl.name.f.f(strB);
            }
        }
        return null;
    }

    @dl.d
    public static final List<d0> e(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        o(d0Var);
        int iA = a(d0Var);
        if (iA == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        List<c1> listSubList = d0Var.M0().subList(0, iA);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listSubList, 10));
        Iterator<T> it = listSubList.iterator();
        while (it.hasNext()) {
            d0 type = ((c1) it.next()).getType();
            f0.o(type, "it.type");
            arrayList.add(type);
        }
        return arrayList;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.d f(@dl.d g builtIns, int i10, boolean z10) {
        f0.p(builtIns, "builtIns");
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarX = z10 ? builtIns.X(i10) : builtIns.C(i10);
        f0.o(dVarX, "if (isSuspendFunction) b…tFunction(parameterCount)");
        return dVarX;
    }

    @dl.d
    public static final List<c1> g(@dl.e d0 d0Var, @dl.d List<? extends d0> contextReceiverTypes, @dl.d List<? extends d0> parameterTypes, @dl.e List<kotlin.reflect.jvm.internal.impl.name.f> list, @dl.d d0 returnType, @dl.d g builtIns) {
        kotlin.reflect.jvm.internal.impl.name.f fVar;
        f0.p(contextReceiverTypes, "contextReceiverTypes");
        f0.p(parameterTypes, "parameterTypes");
        f0.p(returnType, "returnType");
        f0.p(builtIns, "builtIns");
        int i10 = 0;
        ArrayList arrayList = new ArrayList(parameterTypes.size() + contextReceiverTypes.size() + (d0Var != null ? 1 : 0) + 1);
        ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(contextReceiverTypes, 10));
        Iterator<T> it = contextReceiverTypes.iterator();
        while (it.hasNext()) {
            arrayList2.add(TypeUtilsKt.a((d0) it.next()));
        }
        arrayList.addAll(arrayList2);
        kotlin.reflect.jvm.internal.impl.utils.a.a(arrayList, d0Var != null ? TypeUtilsKt.a(d0Var) : null);
        for (Object obj : parameterTypes) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt__CollectionsKt.W();
            }
            d0 d0VarV = (d0) obj;
            if (list == null || (fVar = list.get(i10)) == null || fVar.g()) {
                fVar = null;
            }
            if (fVar != null) {
                kotlin.reflect.jvm.internal.impl.name.c cVar = h.a.E;
                kotlin.reflect.jvm.internal.impl.name.f fVarF = kotlin.reflect.jvm.internal.impl.name.f.f("name");
                String strB = fVar.b();
                f0.o(strB, "name.asString()");
                d0VarV = TypeUtilsKt.v(d0VarV, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.a(CollectionsKt___CollectionsKt.v4(d0VarV.getAnnotations(), new BuiltInAnnotationDescriptor(builtIns, cVar, r0.k(kotlin.c1.a(fVarF, new t(strB)))))));
            }
            arrayList.add(TypeUtilsKt.a(d0VarV));
            i10 = i11;
        }
        arrayList.add(TypeUtilsKt.a(returnType));
        return arrayList;
    }

    @dl.e
    public static final FunctionClassKind h(@dl.d k kVar) {
        f0.p(kVar, "<this>");
        if ((kVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) && g.A0(kVar)) {
            return i(DescriptorUtilsKt.m(kVar));
        }
        return null;
    }

    private static final FunctionClassKind i(kotlin.reflect.jvm.internal.impl.name.d dVar) {
        if (!dVar.f() || dVar.e()) {
            return null;
        }
        FunctionClassKind.a aVar = FunctionClassKind.Companion;
        String strB = dVar.i().b();
        f0.o(strB, "shortName().asString()");
        kotlin.reflect.jvm.internal.impl.name.c cVarE = dVar.l().e();
        f0.o(cVarE, "toSafe().parent()");
        return aVar.b(strB, cVarE);
    }

    @dl.e
    public static final d0 j(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        o(d0Var);
        if (!r(d0Var)) {
            return null;
        }
        return d0Var.M0().get(a(d0Var)).getType();
    }

    @dl.d
    public static final d0 k(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        o(d0Var);
        d0 type = ((c1) CollectionsKt___CollectionsKt.k3(d0Var.M0())).getType();
        f0.o(type, "arguments.last().type");
        return type;
    }

    @dl.d
    public static final List<c1> l(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        o(d0Var);
        List<c1> listM0 = d0Var.M0();
        return listM0.subList(a(d0Var) + (m(d0Var) ? 1 : 0), listM0.size() - 1);
    }

    public static final boolean m(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        return o(d0Var) && r(d0Var);
    }

    public static final boolean n(@dl.d k kVar) {
        f0.p(kVar, "<this>");
        FunctionClassKind functionClassKindH = h(kVar);
        return functionClassKindH == FunctionClassKind.Function || functionClassKindH == FunctionClassKind.SuspendFunction;
    }

    public static final boolean o(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        return fVarD != null && n(fVarD);
    }

    public static final boolean p(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        return (fVarD != null ? h(fVarD) : null) == FunctionClassKind.Function;
    }

    public static final boolean q(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
        return (fVarD != null ? h(fVarD) : null) == FunctionClassKind.SuspendFunction;
    }

    private static final boolean r(d0 d0Var) {
        return d0Var.getAnnotations().k(h.a.C) != null;
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e s(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d g builtIns, int i10) {
        f0.p(eVar, "<this>");
        f0.p(builtIns, "builtIns");
        kotlin.reflect.jvm.internal.impl.name.c cVar = h.a.D;
        return eVar.J1(cVar) ? eVar : kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.a(CollectionsKt___CollectionsKt.v4(eVar, new BuiltInAnnotationDescriptor(builtIns, cVar, r0.k(kotlin.c1.a(h.f125402k, new l(i10))))));
    }

    @dl.d
    public static final kotlin.reflect.jvm.internal.impl.descriptors.annotations.e t(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVar, @dl.d g builtIns) {
        f0.p(eVar, "<this>");
        f0.p(builtIns, "builtIns");
        kotlin.reflect.jvm.internal.impl.name.c cVar = h.a.C;
        return eVar.J1(cVar) ? eVar : kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.a(CollectionsKt___CollectionsKt.v4(eVar, new BuiltInAnnotationDescriptor(builtIns, cVar, s0.z())));
    }
}
