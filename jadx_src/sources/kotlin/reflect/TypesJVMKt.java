package kotlin.reflect;

import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.g0;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.u0;

/* JADX INFO: compiled from: TypesJVM.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypesJVMKt {

    /* JADX INFO: compiled from: TypesJVM.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125048a;

        static {
            int[] iArr = new int[KVariance.values().length];
            try {
                iArr[KVariance.IN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KVariance.INVARIANT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KVariance.OUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f125048a = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @kotlin.q
    public static final Type c(r rVar, boolean z10) {
        g gVarO = rVar.o();
        if (gVarO instanceof s) {
            return new w((s) gVarO);
        }
        if (!(gVarO instanceof d)) {
            throw new UnsupportedOperationException("Unsupported type classifier: " + rVar);
        }
        d dVar = (d) gVarO;
        Class clsG = z10 ? xh.a.g(dVar) : xh.a.e(dVar);
        List<t> listD = rVar.d();
        if (listD.isEmpty()) {
            return clsG;
        }
        if (!clsG.isArray()) {
            return e(clsG, listD);
        }
        if (clsG.getComponentType().isPrimitive()) {
            return clsG;
        }
        t tVar = (t) CollectionsKt___CollectionsKt.f5(listD);
        if (tVar == null) {
            throw new IllegalArgumentException("kotlin.Array must have exactly one type argument: " + rVar);
        }
        KVariance kVarianceA = tVar.a();
        r rVarB = tVar.b();
        int i10 = kVarianceA == null ? -1 : a.f125048a[kVarianceA.ordinal()];
        if (i10 == -1 || i10 == 1) {
            return clsG;
        }
        if (i10 != 2 && i10 != 3) {
            throw new NoWhenBranchMatchedException();
        }
        f0.m(rVarB);
        Type typeD = d(rVarB, false, 1, null);
        return typeD instanceof Class ? clsG : new kotlin.reflect.a(typeD);
    }

    static /* synthetic */ Type d(r rVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return c(rVar, z10);
    }

    @kotlin.q
    private static final Type e(Class<?> cls, List<t> list) {
        Class<?> declaringClass = cls.getDeclaringClass();
        if (declaringClass == null) {
            ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(g((t) it.next()));
            }
            return new ParameterizedTypeImpl(cls, null, arrayList);
        }
        if (Modifier.isStatic(cls.getModifiers())) {
            ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(list, 10));
            Iterator<T> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList2.add(g((t) it2.next()));
            }
            return new ParameterizedTypeImpl(cls, declaringClass, arrayList2);
        }
        int length = cls.getTypeParameters().length;
        Type typeE = e(declaringClass, list.subList(length, list.size()));
        List<t> listSubList = list.subList(0, length);
        ArrayList arrayList3 = new ArrayList(kotlin.collections.t.Y(listSubList, 10));
        Iterator<T> it3 = listSubList.iterator();
        while (it3.hasNext()) {
            arrayList3.add(g((t) it3.next()));
        }
        return new ParameterizedTypeImpl(cls, typeE, arrayList3);
    }

    @dl.d
    public static final Type f(@dl.d r rVar) {
        Type typeE;
        f0.p(rVar, "<this>");
        return (!(rVar instanceof g0) || (typeE = ((g0) rVar).e()) == null) ? d(rVar, false, 1, null) : typeE;
    }

    private static final Type g(t tVar) {
        KVariance kVarianceH = tVar.h();
        if (kVarianceH == null) {
            return x.f128332d.a();
        }
        r rVarG = tVar.g();
        f0.m(rVarG);
        int i10 = a.f125048a[kVarianceH.ordinal()];
        if (i10 == 1) {
            return new x(null, c(rVarG, true));
        }
        if (i10 == 2) {
            return c(rVarG, true);
        }
        if (i10 == 3) {
            return new x(c(rVarG, true), null);
        }
        throw new NoWhenBranchMatchedException();
    }

    @u0(version = "1.4")
    @sh.h
    @kotlin.q
    public static /* synthetic */ void h(r rVar) {
    }

    @kotlin.q
    private static /* synthetic */ void i(t tVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String j(Type type) {
        String name;
        if (!(type instanceof Class)) {
            return type.toString();
        }
        Class cls = (Class) type;
        if (cls.isArray()) {
            kotlin.sequences.m mVarL = SequencesKt__SequencesKt.l(type, TypesJVMKt$typeToString$unwrap$1.f125049d);
            name = ((Class) SequencesKt___SequencesKt.f1(mVarL)).getName() + kotlin.text.u.h2(okhttp3.t.f132643o, SequencesKt___SequencesKt.g0(mVarL));
        } else {
            name = cls.getName();
        }
        f0.o(name, "{\n        if (type.isArr…   } else type.name\n    }");
        return name;
    }
}
