package kotlin.reflect.jvm;

import ii.f;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.jvm.internal.f0;
import kotlin.reflect.TypesJVMKt;
import kotlin.reflect.full.KClasses;
import kotlin.reflect.i;
import kotlin.reflect.j;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;
import kotlin.reflect.jvm.internal.KPropertyImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader;
import kotlin.reflect.jvm.internal.s;
import kotlin.reflect.n;
import kotlin.reflect.p;
import kotlin.reflect.r;
import xh.h;

/* JADX INFO: compiled from: ReflectJvmMapping.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "ReflectJvmMapping")
public final class e {

    /* JADX INFO: compiled from: ReflectJvmMapping.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f125071a;

        static {
            int[] iArr = new int[KotlinClassHeader.Kind.values().length];
            try {
                iArr[KotlinClassHeader.Kind.FILE_FACADE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[KotlinClassHeader.Kind.MULTIFILE_CLASS_PART.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f125071a = iArr;
        }
    }

    @dl.e
    public static final <T> Constructor<T> a(@dl.d i<? extends T> iVar) {
        kotlin.reflect.jvm.internal.calls.c<?> cVarR;
        f0.p(iVar, "<this>");
        KCallableImpl<?> kCallableImplB = s.b(iVar);
        Member memberD = (kCallableImplB == null || (cVarR = kCallableImplB.r()) == null) ? null : cVarR.d();
        if (memberD instanceof Constructor) {
            return (Constructor) memberD;
        }
        return null;
    }

    public static /* synthetic */ void b(i iVar) {
    }

    @dl.e
    public static final Field c(@dl.d n<?> nVar) {
        f0.p(nVar, "<this>");
        KPropertyImpl<?> kPropertyImplD = s.d(nVar);
        if (kPropertyImplD != null) {
            return kPropertyImplD.R();
        }
        return null;
    }

    @dl.e
    public static final Method d(@dl.d n<?> nVar) {
        f0.p(nVar, "<this>");
        return e(nVar.getGetter());
    }

    @dl.e
    public static final Method e(@dl.d i<?> iVar) {
        kotlin.reflect.jvm.internal.calls.c<?> cVarR;
        f0.p(iVar, "<this>");
        KCallableImpl<?> kCallableImplB = s.b(iVar);
        Member memberD = (kCallableImplB == null || (cVarR = kCallableImplB.r()) == null) ? null : cVarR.d();
        if (memberD instanceof Method) {
            return (Method) memberD;
        }
        return null;
    }

    @dl.e
    public static final Method f(@dl.d j<?> jVar) {
        f0.p(jVar, "<this>");
        return e(jVar.getSetter());
    }

    @dl.d
    public static final Type g(@dl.d r rVar) {
        f0.p(rVar, "<this>");
        Type typeE = ((KTypeImpl) rVar).e();
        return typeE == null ? TypesJVMKt.f(rVar) : typeE;
    }

    private static final kotlin.reflect.h h(Member member) {
        KotlinClassHeader kotlinClassHeaderH;
        f.a aVar = f.f119377c;
        Class<?> declaringClass = member.getDeclaringClass();
        f0.o(declaringClass, "declaringClass");
        f fVarA = aVar.a(declaringClass);
        KotlinClassHeader.Kind kindC = (fVarA == null || (kotlinClassHeaderH = fVarA.h()) == null) ? null : kotlinClassHeaderH.c();
        int i10 = kindC == null ? -1 : a.f125071a[kindC.ordinal()];
        if (i10 != 1 && i10 != 2 && i10 != 3) {
            return null;
        }
        Class<?> declaringClass2 = member.getDeclaringClass();
        f0.o(declaringClass2, "declaringClass");
        return new KPackageImpl(declaringClass2);
    }

    @dl.e
    public static final <T> i<T> i(@dl.d Constructor<T> constructor) {
        T next;
        f0.p(constructor, "<this>");
        Class<T> declaringClass = constructor.getDeclaringClass();
        f0.o(declaringClass, "declaringClass");
        Iterator<T> it = xh.a.i(declaringClass).h().iterator();
        while (it.hasNext()) {
            next = it.next();
            if (f0.g(a((i) next), constructor)) {
                return (i) next;
            }
        }
        next = null;
        return (i) next;
    }

    @dl.e
    public static final i<?> j(@dl.d Method method) {
        Object next;
        Method methodE;
        f0.p(method, "<this>");
        Object obj = null;
        if (Modifier.isStatic(method.getModifiers())) {
            kotlin.reflect.h hVarH = h(method);
            if (hVarH != null) {
                Collection<kotlin.reflect.c<?>> collectionV = hVarH.v();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : collectionV) {
                    if (obj2 instanceof i) {
                        arrayList.add(obj2);
                    }
                }
                for (Object obj3 : arrayList) {
                    if (f0.g(e((i) obj3), method)) {
                        obj = obj3;
                        break;
                    }
                }
                return (i) obj;
            }
            Class<?> declaringClass = method.getDeclaringClass();
            f0.o(declaringClass, "declaringClass");
            kotlin.reflect.d<?> dVarJ = KClasses.j(xh.a.i(declaringClass));
            if (dVarJ != null) {
                Iterator<T> it = KClasses.B(dVarJ).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    methodE = e((i) next);
                } while (!(methodE != null && f0.g(methodE.getName(), method.getName()) && Arrays.equals(methodE.getParameterTypes(), method.getParameterTypes()) && f0.g(methodE.getReturnType(), method.getReturnType())));
                i<?> iVar = (i) next;
                if (iVar != null) {
                    return iVar;
                }
            }
        }
        Class<?> declaringClass2 = method.getDeclaringClass();
        f0.o(declaringClass2, "declaringClass");
        for (Object obj4 : KClasses.B(xh.a.i(declaringClass2))) {
            if (f0.g(e((i) obj4), method)) {
                obj = obj4;
                break;
            }
        }
        return (i) obj;
    }

    @dl.e
    public static final n<?> k(@dl.d Field field) {
        f0.p(field, "<this>");
        Object obj = null;
        if (field.isSynthetic()) {
            return null;
        }
        kotlin.reflect.h hVarH = h(field);
        if (hVarH == null) {
            Class<?> declaringClass = field.getDeclaringClass();
            f0.o(declaringClass, "declaringClass");
            for (Object obj2 : KClasses.J(xh.a.i(declaringClass))) {
                if (f0.g(c((p) obj2), field)) {
                    obj = obj2;
                    break;
                }
            }
            return (n) obj;
        }
        Collection<kotlin.reflect.c<?>> collectionV = hVarH.v();
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : collectionV) {
            if (obj3 instanceof n) {
                arrayList.add(obj3);
            }
        }
        for (Object obj4 : arrayList) {
            if (f0.g(c((n) obj4), field)) {
                obj = obj4;
                break;
            }
        }
        return (n) obj;
    }
}
