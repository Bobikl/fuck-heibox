package kotlin.reflect.jvm.internal.impl.load.kotlin;

import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.r0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: methodSignatureMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t {
    private static final void a(StringBuilder sb2, d0 d0Var) {
        sb2.append(g(d0Var));
    }

    @dl.d
    public static final String b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.w wVar, boolean z10, boolean z11) {
        String strB;
        f0.p(wVar, "<this>");
        StringBuilder sb2 = new StringBuilder();
        if (z11) {
            if (wVar instanceof kotlin.reflect.jvm.internal.impl.descriptors.j) {
                strB = "<init>";
            } else {
                strB = wVar.getName().b();
                f0.o(strB, "name.asString()");
            }
            sb2.append(strB);
        }
        sb2.append("(");
        r0 r0VarL0 = wVar.l0();
        if (r0VarL0 != null) {
            d0 type = r0VarL0.getType();
            f0.o(type, "it.type");
            a(sb2, type);
        }
        Iterator<b1> it = wVar.i().iterator();
        while (it.hasNext()) {
            d0 type2 = it.next().getType();
            f0.o(type2, "parameter.type");
            a(sb2, type2);
        }
        sb2.append(")");
        if (z10) {
            if (c.c(wVar)) {
                sb2.append(androidx.exifinterface.media.a.X4);
            } else {
                d0 returnType = wVar.getReturnType();
                f0.m(returnType);
                a(sb2, returnType);
            }
        }
        String string = sb2.toString();
        f0.o(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String c(kotlin.reflect.jvm.internal.impl.descriptors.w wVar, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        if ((i10 & 2) != 0) {
            z11 = true;
        }
        return b(wVar, z10, z11);
    }

    @dl.e
    public static final String d(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a aVar) {
        f0.p(aVar, "<this>");
        SignatureBuildingComponents signatureBuildingComponents = SignatureBuildingComponents.f126464a;
        if (kotlin.reflect.jvm.internal.impl.resolve.d.E(aVar)) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = aVar.c();
        kotlin.reflect.jvm.internal.impl.descriptors.d dVar = kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.d ? (kotlin.reflect.jvm.internal.impl.descriptors.d) kVarC : null;
        if (dVar == null || dVar.getName().g()) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.a aVarA = aVar.a();
        s0 s0Var = aVarA instanceof s0 ? (s0) aVarA : null;
        if (s0Var == null) {
            return null;
        }
        return s.a(signatureBuildingComponents, dVar, c(s0Var, false, false, 3, null));
    }

    public static final boolean e(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.a f10) {
        kotlin.reflect.jvm.internal.impl.descriptors.w wVarK;
        f0.p(f10, "f");
        if (!(f10 instanceof kotlin.reflect.jvm.internal.impl.descriptors.w)) {
            return false;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.w wVar = (kotlin.reflect.jvm.internal.impl.descriptors.w) f10;
        if (!f0.g(wVar.getName().b(), "remove") || wVar.i().size() != 1 || SpecialBuiltinMembers.h((CallableMemberDescriptor) f10)) {
            return false;
        }
        List<b1> listI = wVar.a().i();
        f0.o(listI, "f.original.valueParameters");
        d0 type = ((b1) CollectionsKt___CollectionsKt.c5(listI)).getType();
        f0.o(type, "f.original.valueParameters.single().type");
        j jVarG = g(type);
        j.d dVar = jVarG instanceof j.d ? (j.d) jVarG : null;
        if ((dVar != null ? dVar.i() : null) != JvmPrimitiveType.INT || (wVarK = BuiltinMethodsWithSpecialGenericSignature.k(wVar)) == null) {
            return false;
        }
        List<b1> listI2 = wVarK.a().i();
        f0.o(listI2, "overridden.original.valueParameters");
        d0 type2 = ((b1) CollectionsKt___CollectionsKt.c5(listI2)).getType();
        f0.o(type2, "overridden.original.valueParameters.single().type");
        j jVarG2 = g(type2);
        kotlin.reflect.jvm.internal.impl.descriptors.k kVarC = wVarK.c();
        f0.o(kVarC, "overridden.containingDeclaration");
        return f0.g(DescriptorUtilsKt.m(kVarC), kotlin.reflect.jvm.internal.impl.builtins.h.a.f125423c0.j()) && (jVarG2 instanceof j.c) && f0.g(((j.c) jVarG2).i(), "java/lang/Object");
    }

    @dl.d
    public static final String f(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        f0.p(dVar, "<this>");
        kotlin.reflect.jvm.internal.impl.builtins.jvm.c cVar = kotlin.reflect.jvm.internal.impl.builtins.jvm.c.f125524a;
        kotlin.reflect.jvm.internal.impl.name.d dVarJ = DescriptorUtilsKt.l(dVar).j();
        f0.o(dVarJ, "fqNameSafe.toUnsafe()");
        kotlin.reflect.jvm.internal.impl.name.b bVarN = cVar.n(dVarJ);
        if (bVarN == null) {
            return c.b(dVar, null, 2, null);
        }
        String strF = kotlin.reflect.jvm.internal.impl.resolve.jvm.d.b(bVarN).f();
        f0.o(strF, "byClassId(it).internalName");
        return strF;
    }

    @dl.d
    public static final j g(@dl.d d0 d0Var) {
        f0.p(d0Var, "<this>");
        return (j) c.e(d0Var, l.f126548a, x.f126566o, w.f126561a, null, null, 32, null);
    }
}
