package kotlin.reflect.full;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.TypeCastException;
import kotlin.collections.s;
import kotlin.collections.s0;
import kotlin.collections.t;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.k;
import kotlin.reflect.KParameter;
import kotlin.reflect.i;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.KClassImpl;
import kotlin.reflect.jvm.internal.KFunctionImpl;
import kotlin.reflect.jvm.internal.KTypeImpl;
import kotlin.reflect.jvm.internal.KotlinReflectionInternalError;
import kotlin.reflect.jvm.internal.impl.descriptors.j;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.o;
import kotlin.reflect.p;
import kotlin.reflect.q;
import kotlin.reflect.r;
import kotlin.u0;
import xh.h;
import yh.l;

/* JADX INFO: compiled from: KClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
@h(name = "KClasses")
public final class KClasses {

    /* JADX INFO: compiled from: KClasses.kt */
    public static final class a extends kotlin.reflect.jvm.internal.impl.utils.b.f<r, r> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1184b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean a(@dl.d r current) {
            f0.p(current, "current");
            ((LinkedList) this.f128298a).add(current);
            return true;
        }
    }

    @u0(version = "1.1")
    @k(message = "This function creates a type which rarely makes sense for generic classes. For example, such type can only be used in signatures of members of that class. Use starProjectedType or createType() for clearer semantics.")
    public static /* synthetic */ void A(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final Collection<i<?>> B(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        Collection<kotlin.reflect.c<?>> collectionV = dVar.v();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionV) {
            if (obj instanceof i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void C(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final Collection<i<?>> D(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        Collection<KCallableImpl<?>> collectionH = ((KClassImpl.Data) ((KClassImpl) dVar).f0().invoke()).h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionH) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if (T(kCallableImpl) && (kCallableImpl instanceof i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void E(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final <T> Collection<q<T, ?, ?>> F(@dl.d kotlin.reflect.d<T> dVar) {
        f0.p(dVar, "<this>");
        Collection<KCallableImpl<?>> collectionH = ((KClassImpl) dVar).f0().invoke().h();
        ArrayList arrayList = new ArrayList();
        for (T t10 : collectionH) {
            KCallableImpl kCallableImpl = (KCallableImpl) t10;
            if (T(kCallableImpl) && (kCallableImpl instanceof q)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void G(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final Collection<i<?>> H(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        Collection<KCallableImpl<?>> collectionH = ((KClassImpl.Data) ((KClassImpl) dVar).f0().invoke()).h();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionH) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if (U(kCallableImpl) && (kCallableImpl instanceof i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void I(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final <T> Collection<p<T, ?>> J(@dl.d kotlin.reflect.d<T> dVar) {
        f0.p(dVar, "<this>");
        Collection<KCallableImpl<?>> collectionH = ((KClassImpl) dVar).f0().invoke().h();
        ArrayList arrayList = new ArrayList();
        for (T t10 : collectionH) {
            KCallableImpl kCallableImpl = (KCallableImpl) t10;
            if (U(kCallableImpl) && (kCallableImpl instanceof p)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void K(kotlin.reflect.d dVar) {
    }

    @dl.e
    public static final <T> i<T> L(@dl.d kotlin.reflect.d<T> dVar) {
        T next;
        f0.p(dVar, "<this>");
        Iterator<T> it = ((KClassImpl) dVar).h().iterator();
        while (it.hasNext()) {
            next = it.next();
            i iVar = (i) next;
            f0.n(iVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KFunctionImpl");
            w wVarH = ((KFunctionImpl) iVar).H();
            f0.n(wVarH, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ConstructorDescriptor");
            if (((j) wVarH).s0()) {
                return (i) next;
            }
        }
        next = null;
        return (i) next;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void M(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final Collection<i<?>> N(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        Collection<KCallableImpl<?>> collectionI = ((KClassImpl.Data) ((KClassImpl) dVar).f0().invoke()).i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionI) {
            if (obj instanceof i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void O(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final Collection<o<?>> P(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        Collection<KCallableImpl<?>> collectionI = ((KClassImpl.Data) ((KClassImpl) dVar).f0().invoke()).i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionI) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if (U(kCallableImpl) && (kCallableImpl instanceof o)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void Q(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final List<kotlin.reflect.d<?>> R(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        List<r> listL = dVar.l();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listL.iterator();
        while (it.hasNext()) {
            kotlin.reflect.g gVarO = ((r) it.next()).o();
            kotlin.reflect.d dVar2 = gVarO instanceof kotlin.reflect.d ? (kotlin.reflect.d) gVarO : null;
            if (dVar2 != null) {
                arrayList.add(dVar2);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void S(kotlin.reflect.d dVar) {
    }

    private static final boolean T(KCallableImpl<?> kCallableImpl) {
        return kCallableImpl.H().l0() != null;
    }

    private static final boolean U(KCallableImpl<?> kCallableImpl) {
        return !T(kCallableImpl);
    }

    @u0(version = "1.1")
    public static final boolean V(@dl.d kotlin.reflect.d<?> dVar, @dl.d final kotlin.reflect.d<?> base) {
        f0.p(dVar, "<this>");
        f0.p(base, "base");
        if (!f0.g(dVar, base)) {
            Boolean boolE = kotlin.reflect.jvm.internal.impl.utils.b.e(s.k(dVar), new d(new PropertyReference1() { // from class: kotlin.reflect.full.KClasses$isSubclassOf$1
                @Override // kotlin.reflect.p
                @dl.e
                public Object get(@dl.e Object obj) {
                    return KClasses.R((kotlin.reflect.d) obj);
                }

                @Override // kotlin.jvm.internal.CallableReference, kotlin.reflect.c
                @dl.d
                public String getName() {
                    return "superclasses";
                }

                @Override // kotlin.jvm.internal.CallableReference
                @dl.d
                public kotlin.reflect.h getOwner() {
                    return n0.h(KClasses.class, "kotlin-reflection");
                }

                @Override // kotlin.jvm.internal.CallableReference
                @dl.d
                public String getSignature() {
                    return "getSuperclasses(Lkotlin/reflect/KClass;)Ljava/util/List;";
                }
            }), new l<kotlin.reflect.d<?>, Boolean>() { // from class: kotlin.reflect.full.KClasses$isSubclassOf$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // yh.l
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke(kotlin.reflect.d<?> dVar2) {
                    return Boolean.valueOf(f0.g(dVar2, base));
                }
            });
            f0.o(boolE, "base: KClass<*>): Boolea…erclasses) { it == base }");
            if (!boolE.booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable W(p tmp0, kotlin.reflect.d dVar) {
        f0.p(tmp0, "$tmp0");
        return (Iterable) tmp0.invoke(dVar);
    }

    @u0(version = "1.1")
    public static final boolean X(@dl.d kotlin.reflect.d<?> dVar, @dl.d kotlin.reflect.d<?> derived) {
        f0.p(dVar, "<this>");
        f0.p(derived, "derived");
        return V(derived, dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.1")
    @dl.e
    public static final <T> T Y(@dl.d kotlin.reflect.d<T> dVar, @dl.e Object obj) {
        f0.p(dVar, "<this>");
        if (!dVar.u(obj)) {
            return null;
        }
        f0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.full.KClasses.safeCast");
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Iterable a(r rVar) {
        kotlin.reflect.g gVarO = rVar.o();
        yh.a aVar = null;
        Object[] objArr = 0;
        kotlin.reflect.d dVar = gVarO instanceof kotlin.reflect.d ? (kotlin.reflect.d) gVarO : null;
        if (dVar == null) {
            throw new KotlinReflectionInternalError("Supertype not a class: " + rVar);
        }
        List<r> listL = dVar.l();
        if (rVar.d().isEmpty()) {
            return listL;
        }
        f0.n(rVar, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
        TypeSubstitutor typeSubstitutorF = TypeSubstitutor.f(((KTypeImpl) rVar).j());
        ArrayList arrayList = new ArrayList(t.Y(listL, 10));
        for (r rVar2 : listL) {
            f0.n(rVar2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KTypeImpl");
            d0 d0VarP = typeSubstitutorF.p(((KTypeImpl) rVar2).j(), Variance.INVARIANT);
            if (d0VarP == null) {
                throw new KotlinReflectionInternalError("Type substitution failed: " + rVar2 + " (" + rVar + ')');
            }
            f0.o(d0VarP, "substitutor.substitute((…: $supertype ($current)\")");
            arrayList.add(new KTypeImpl(d0VarP, aVar, 2, objArr == true ? 1 : 0));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @u0(version = "1.1")
    @dl.d
    public static final <T> T d(@dl.d kotlin.reflect.d<T> dVar, @dl.e Object obj) {
        f0.p(dVar, "<this>");
        if (dVar.u(obj)) {
            f0.n(obj, "null cannot be cast to non-null type T of kotlin.reflect.full.KClasses.cast");
            return obj;
        }
        throw new TypeCastException("Value cannot be cast to " + dVar.A());
    }

    @u0(version = "1.1")
    @dl.d
    public static final <T> T e(@dl.d kotlin.reflect.d<T> dVar) {
        boolean z10;
        f0.p(dVar, "<this>");
        Iterator<T> it = dVar.h().iterator();
        T t10 = null;
        boolean z11 = false;
        T t11 = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z11) {
                    break;
                }
                t10 = t11;
                break;
            }
            T next = it.next();
            List<KParameter> parameters = ((i) next).getParameters();
            if (!(parameters instanceof Collection) || !parameters.isEmpty()) {
                Iterator<T> it2 = parameters.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z10 = true;
                        break;
                    }
                    if (!((KParameter) it2.next()).f()) {
                        z10 = false;
                        break;
                    }
                }
            } else {
                z10 = true;
                break;
            }
            if (z10) {
                if (z11) {
                    break;
                }
                z11 = true;
                t11 = next;
            }
        }
        i iVar = (i) t10;
        if (iVar != null) {
            return (T) iVar.callBy(s0.z());
        }
        throw new IllegalArgumentException("Class should have a single no-arg constructor: " + dVar);
    }

    @dl.d
    public static final Collection<kotlin.reflect.d<?>> f(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        Collection<r> collectionH = h(dVar);
        ArrayList arrayList = new ArrayList(t.Y(collectionH, 10));
        for (r rVar : collectionH) {
            kotlin.reflect.g gVarO = rVar.o();
            kotlin.reflect.d dVar2 = gVarO instanceof kotlin.reflect.d ? (kotlin.reflect.d) gVarO : null;
            if (dVar2 == null) {
                throw new KotlinReflectionInternalError("Supertype not a class: " + rVar);
            }
            arrayList.add(dVar2);
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void g(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final Collection<r> h(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        Object objC = kotlin.reflect.jvm.internal.impl.utils.b.c(dVar.l(), c.f125067a, new kotlin.reflect.jvm.internal.impl.utils.b.h(), new a());
        f0.o(objC, "dfs(\n        supertypes,…        }\n        }\n    )");
        return (Collection) objC;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void i(kotlin.reflect.d dVar) {
    }

    @dl.e
    public static final kotlin.reflect.d<?> j(@dl.d kotlin.reflect.d<?> dVar) {
        Object next;
        f0.p(dVar, "<this>");
        Iterator<T> it = dVar.C().iterator();
        while (it.hasNext()) {
            next = it.next();
            kotlin.reflect.d dVar2 = (kotlin.reflect.d) next;
            f0.n(dVar2, "null cannot be cast to non-null type kotlin.reflect.jvm.internal.KClassImpl<*>");
            if (((KClassImpl) dVar2).a().r0()) {
                return (kotlin.reflect.d) next;
            }
        }
        next = null;
        return (kotlin.reflect.d) next;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void k(kotlin.reflect.d dVar) {
    }

    @dl.e
    public static final Object l(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        kotlin.reflect.d<?> dVarJ = j(dVar);
        if (dVarJ != null) {
            return dVarJ.D();
        }
        return null;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void m(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final Collection<i<?>> n(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        Collection<KCallableImpl<?>> collectionL = ((KClassImpl.Data) ((KClassImpl) dVar).f0().invoke()).l();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionL) {
            if (obj instanceof i) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void o(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final Collection<i<?>> p(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        Collection<KCallableImpl<?>> collectionM = ((KClassImpl.Data) ((KClassImpl) dVar).f0().invoke()).m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionM) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if (T(kCallableImpl) && (kCallableImpl instanceof i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void q(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final <T> Collection<q<T, ?, ?>> r(@dl.d kotlin.reflect.d<T> dVar) {
        f0.p(dVar, "<this>");
        Collection<KCallableImpl<?>> collectionM = ((KClassImpl) dVar).f0().invoke().m();
        ArrayList arrayList = new ArrayList();
        for (T t10 : collectionM) {
            KCallableImpl kCallableImpl = (KCallableImpl) t10;
            if (T(kCallableImpl) && (kCallableImpl instanceof q)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void s(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final Collection<i<?>> t(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        Collection<KCallableImpl<?>> collectionM = ((KClassImpl.Data) ((KClassImpl) dVar).f0().invoke()).m();
        ArrayList arrayList = new ArrayList();
        for (Object obj : collectionM) {
            KCallableImpl kCallableImpl = (KCallableImpl) obj;
            if (U(kCallableImpl) && (kCallableImpl instanceof i)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void u(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final <T> Collection<p<T, ?>> v(@dl.d kotlin.reflect.d<T> dVar) {
        f0.p(dVar, "<this>");
        Collection<KCallableImpl<?>> collectionM = ((KClassImpl) dVar).f0().invoke().m();
        ArrayList arrayList = new ArrayList();
        for (T t10 : collectionM) {
            KCallableImpl kCallableImpl = (KCallableImpl) t10;
            if (U(kCallableImpl) && (kCallableImpl instanceof p)) {
                arrayList.add(t10);
            }
        }
        return arrayList;
    }

    @u0(version = "1.1")
    public static /* synthetic */ void w(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final Collection<kotlin.reflect.c<?>> x(@dl.d kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        return ((KClassImpl.Data) ((KClassImpl) dVar).f0().invoke()).l();
    }

    @u0(version = "1.1")
    public static /* synthetic */ void y(kotlin.reflect.d dVar) {
    }

    @dl.d
    public static final r z(@dl.d final kotlin.reflect.d<?> dVar) {
        f0.p(dVar, "<this>");
        j0 j0VarV = ((KClassImpl) dVar).a().v();
        f0.o(j0VarV, "this as KClassImpl<*>).descriptor.defaultType");
        return new KTypeImpl(j0VarV, new yh.a<Type>() { // from class: kotlin.reflect.full.KClasses$defaultType$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Type invoke() {
                return ((KClassImpl) dVar).i();
            }
        });
    }
}
