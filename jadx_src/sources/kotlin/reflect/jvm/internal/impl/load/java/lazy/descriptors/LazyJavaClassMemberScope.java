package kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors;

import fi.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.e1;
import kotlin.collections.r0;
import kotlin.collections.s;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.Modality;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.ValueParameterDescriptorImpl;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.a0;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.b0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.p0;
import kotlin.reflect.jvm.internal.impl.descriptors.r;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.w;
import kotlin.reflect.jvm.internal.impl.descriptors.y0;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithDifferentJvmName;
import kotlin.reflect.jvm.internal.impl.load.java.BuiltinMethodsWithSpecialGenericSignature;
import kotlin.reflect.jvm.internal.impl.load.java.ClassicBuiltinSpecialProperties;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialBuiltinMembers;
import kotlin.reflect.jvm.internal.impl.load.java.SpecialGenericSignatures;
import kotlin.reflect.jvm.internal.impl.load.java.descriptors.JavaMethodDescriptor;
import kotlin.reflect.jvm.internal.impl.load.java.j;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.ContextKt;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancement;
import kotlin.reflect.jvm.internal.impl.load.kotlin.t;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.OverridingUtil;
import kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt;
import kotlin.reflect.jvm.internal.impl.storage.h;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.i1;
import mi.g;
import mi.k;
import mi.n;
import mi.q;
import mi.y;
import yh.l;

/* JADX INFO: compiled from: LazyJavaClassMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class LazyJavaClassMemberScope extends LazyJavaScope {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.d f126161n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final g f126162o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f126163p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.d
    private final h<List<kotlin.reflect.jvm.internal.impl.descriptors.c>> f126164q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @dl.d
    private final h<Set<f>> f126165r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.d
    private final h<Set<f>> f126166s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    private final h<Map<f, n>> f126167t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.g<f, kotlin.reflect.jvm.internal.impl.descriptors.d> f126168u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyJavaClassMemberScope(@dl.d final kotlin.reflect.jvm.internal.impl.load.java.lazy.d c10, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d ownerDescriptor, @dl.d g jClass, boolean z10, @dl.e LazyJavaClassMemberScope lazyJavaClassMemberScope) {
        super(c10, lazyJavaClassMemberScope);
        f0.p(c10, "c");
        f0.p(ownerDescriptor, "ownerDescriptor");
        f0.p(jClass, "jClass");
        this.f126161n = ownerDescriptor;
        this.f126162o = jClass;
        this.f126163p = z10;
        this.f126164q = c10.e().c(new yh.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.c>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$constructors$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.c> invoke() {
                Collection<k> collectionH = this.f126172b.f126162o.h();
                ArrayList arrayList = new ArrayList(collectionH.size());
                Iterator<k> it = collectionH.iterator();
                while (it.hasNext()) {
                    arrayList.add(this.f126172b.H0(it.next()));
                }
                if (this.f126172b.f126162o.J()) {
                    kotlin.reflect.jvm.internal.impl.descriptors.c cVarG0 = this.f126172b.g0();
                    boolean z11 = false;
                    String strC = t.c(cVarG0, false, false, 2, null);
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        do {
                            if (!it2.hasNext()) {
                                z11 = true;
                                break;
                            }
                        } while (!f0.g(t.c((kotlin.reflect.jvm.internal.impl.descriptors.c) it2.next(), false, false, 2, null), strC));
                    } else {
                        z11 = true;
                        break;
                    }
                    if (z11) {
                        arrayList.add(cVarG0);
                        c10.a().h().e(this.f126172b.f126162o, cVarG0);
                    }
                }
                kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar = c10;
                dVar.a().w().a(dVar, this.f126172b.D(), arrayList);
                SignatureEnhancement signatureEnhancementR = c10.a().r();
                kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar2 = c10;
                LazyJavaClassMemberScope lazyJavaClassMemberScope2 = this.f126172b;
                boolean zIsEmpty = arrayList.isEmpty();
                List listM = arrayList;
                if (zIsEmpty) {
                    listM = CollectionsKt__CollectionsKt.M(lazyJavaClassMemberScope2.f0());
                }
                return CollectionsKt___CollectionsKt.Q5(signatureEnhancementR.g(dVar2, listM));
            }
        });
        this.f126165r = c10.e().c(new yh.a<Set<? extends f>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClassIndex$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<f> invoke() {
                return CollectionsKt___CollectionsKt.V5(this.f126179b.f126162o.y());
            }
        });
        this.f126166s = c10.e().c(new yh.a<Set<? extends f>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$generatedNestedClassNames$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Set<f> invoke() {
                kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar = c10;
                return CollectionsKt___CollectionsKt.V5(dVar.a().w().g(dVar, this.D()));
            }
        });
        this.f126167t = c10.e().c(new yh.a<Map<f, ? extends n>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$enumEntryIndex$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Map<f, n> invoke() {
                Collection<n> collectionJ = this.f126174b.f126162o.j();
                ArrayList arrayList = new ArrayList();
                for (Object obj : collectionJ) {
                    if (((n) obj).N()) {
                        arrayList.add(obj);
                    }
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(r0.j(kotlin.collections.t.Y(arrayList, 10)), 16));
                for (Object obj2 : arrayList) {
                    linkedHashMap.put(((n) obj2).getName(), obj2);
                }
                return linkedHashMap;
            }
        });
        this.f126168u = c10.e().h(new l<f, kotlin.reflect.jvm.internal.impl.descriptors.d>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.descriptors.d invoke(@dl.d f name) {
                f0.p(name, "name");
                if (((Set) this.f126180b.f126165r.invoke()).contains(name)) {
                    j jVarD = c10.a().d();
                    kotlin.reflect.jvm.internal.impl.name.b bVarK = DescriptorUtilsKt.k(this.f126180b.D());
                    f0.m(bVarK);
                    kotlin.reflect.jvm.internal.impl.name.b bVarD = bVarK.d(name);
                    f0.o(bVarD, "ownerDescriptor.classId!…createNestedClassId(name)");
                    g gVarB = jVarD.b(new j.a(bVarD, null, this.f126180b.f126162o, 2, null));
                    if (gVarB == null) {
                        return null;
                    }
                    kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar = c10;
                    LazyJavaClassDescriptor lazyJavaClassDescriptor = new LazyJavaClassDescriptor(dVar, this.f126180b.D(), gVarB, null, 8, null);
                    dVar.a().e().a(lazyJavaClassDescriptor);
                    return lazyJavaClassDescriptor;
                }
                if (!((Set) this.f126180b.f126166s.invoke()).contains(name)) {
                    n nVar = (n) ((Map) this.f126180b.f126167t.invoke()).get(name);
                    if (nVar == null) {
                        return null;
                    }
                    m mVarE = c10.e();
                    final LazyJavaClassMemberScope lazyJavaClassMemberScope2 = this.f126180b;
                    return kotlin.reflect.jvm.internal.impl.descriptors.impl.m.M0(c10.e(), this.f126180b.D(), name, mVarE.c(new yh.a<Set<? extends f>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$nestedClasses$1$enumMemberNames$1
                        {
                            super(0);
                        }

                        @Override // yh.a
                        @dl.d
                        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final Set<f> invoke() {
                            return e1.C(lazyJavaClassMemberScope2.b(), lazyJavaClassMemberScope2.d());
                        }
                    }), kotlin.reflect.jvm.internal.impl.load.java.lazy.c.a(c10, nVar), c10.a().t().a(nVar));
                }
                kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar2 = c10;
                LazyJavaClassMemberScope lazyJavaClassMemberScope3 = this.f126180b;
                List<kotlin.reflect.jvm.internal.impl.descriptors.d> listI = s.i();
                dVar2.a().w().f(dVar2, lazyJavaClassMemberScope3.D(), name, listI);
                List listA = s.a(listI);
                int size = listA.size();
                if (size == 0) {
                    return null;
                }
                if (size == 1) {
                    return (kotlin.reflect.jvm.internal.impl.descriptors.d) CollectionsKt___CollectionsKt.c5(listA);
                }
                throw new IllegalStateException(("Multiple classes with same name are generated: " + listA).toString());
            }
        });
    }

    public /* synthetic */ LazyJavaClassMemberScope(kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVar, kotlin.reflect.jvm.internal.impl.descriptors.d dVar2, g gVar, boolean z10, LazyJavaClassMemberScope lazyJavaClassMemberScope, int i10, kotlin.jvm.internal.u uVar) {
        this(dVar, dVar2, gVar, z10, (i10 & 16) != 0 ? null : lazyJavaClassMemberScope);
    }

    private final Set<o0> B0(f fVar) {
        Collection<d0> collectionD0 = d0();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionD0.iterator();
        while (it.hasNext()) {
            Collection<? extends o0> collectionC = ((d0) it.next()).u().c(fVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(collectionC, 10));
            Iterator<T> it2 = collectionC.iterator();
            while (it2.hasNext()) {
                arrayList2.add((o0) it2.next());
            }
            x.n0(arrayList, arrayList2);
        }
        return CollectionsKt___CollectionsKt.V5(arrayList);
    }

    private final boolean C0(s0 s0Var, w wVar) {
        String strC = t.c(s0Var, false, false, 2, null);
        w wVarA = wVar.a();
        f0.o(wVarA, "builtinWithErasedParameters.original");
        return f0.g(strC, t.c(wVarA, false, false, 2, null)) && !q0(s0Var, wVar);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0071  */
    private final boolean D0(final s0 s0Var) {
        boolean z10;
        boolean z11;
        boolean z12;
        f name = s0Var.getName();
        f0.o(name, "function.name");
        List<f> listA = kotlin.reflect.jvm.internal.impl.load.java.w.a(name);
        if (!(listA instanceof Collection) || !listA.isEmpty()) {
            Iterator<T> it = listA.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z12 = false;
                    break;
                }
                Set<o0> setB0 = B0((f) it.next());
                if (!(setB0 instanceof Collection) || !setB0.isEmpty()) {
                    Iterator<T> it2 = setB0.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            z11 = false;
                            break;
                        }
                        o0 o0Var = (o0) it2.next();
                        if (p0(o0Var, new l<f, Collection<? extends s0>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$isVisibleAsFunctionInCurrentClass$1$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(1);
                            }

                            @Override // yh.l
                            @dl.d
                            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                            public final Collection<s0> invoke(@dl.d f accessorName) {
                                f0.p(accessorName, "accessorName");
                                return f0.g(s0Var.getName(), accessorName) ? s.k(s0Var) : CollectionsKt___CollectionsKt.y4(this.J0(accessorName), this.K0(accessorName));
                            }
                        })) {
                            if (!o0Var.G()) {
                                String strB = s0Var.getName().b();
                                f0.o(strB, "function.name.asString()");
                                if (kotlin.reflect.jvm.internal.impl.load.java.s.d(strB)) {
                                    z10 = false;
                                }
                            }
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (z10) {
                            z11 = true;
                            break;
                        }
                    }
                } else {
                    z11 = false;
                    break;
                    break;
                }
                if (z11) {
                    z12 = true;
                    break;
                }
            }
        } else {
            z12 = false;
            break;
        }
        if (z12) {
            return false;
        }
        return (r0(s0Var) || L0(s0Var) || t0(s0Var)) ? false : true;
    }

    private final s0 E0(s0 s0Var, l<? super f, ? extends Collection<? extends s0>> lVar, Collection<? extends s0> collection) {
        s0 s0VarI0;
        w wVarK = BuiltinMethodsWithSpecialGenericSignature.k(s0Var);
        if (wVarK == null || (s0VarI0 = i0(wVarK, lVar)) == null) {
            return null;
        }
        if (!D0(s0VarI0)) {
            s0VarI0 = null;
        }
        if (s0VarI0 != null) {
            return h0(s0VarI0, wVarK, collection);
        }
        return null;
    }

    private final s0 F0(s0 s0Var, l<? super f, ? extends Collection<? extends s0>> lVar, f fVar, Collection<? extends s0> collection) {
        s0 s0Var2 = (s0) SpecialBuiltinMembers.d(s0Var);
        if (s0Var2 == null) {
            return null;
        }
        String strB = SpecialBuiltinMembers.b(s0Var2);
        f0.m(strB);
        f fVarF = f.f(strB);
        f0.o(fVarF, "identifier(nameInJava)");
        Iterator<? extends s0> it = lVar.invoke(fVarF).iterator();
        while (it.hasNext()) {
            s0 s0VarN0 = n0(it.next(), fVar);
            if (s0(s0Var2, s0VarN0)) {
                return h0(s0VarN0, s0Var2, collection);
            }
        }
        return null;
    }

    private final s0 G0(s0 s0Var, l<? super f, ? extends Collection<? extends s0>> lVar) {
        if (!s0Var.isSuspend()) {
            return null;
        }
        f name = s0Var.getName();
        f0.o(name, "descriptor.name");
        Iterator<T> it = lVar.invoke(name).iterator();
        while (it.hasNext()) {
            s0 s0VarO0 = o0((s0) it.next());
            if (s0VarO0 == null || !q0(s0VarO0, s0Var)) {
                s0VarO0 = null;
            }
            if (s0VarO0 != null) {
                return s0VarO0;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.load.java.descriptors.b H0(k kVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarD = D();
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.b bVarU1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.u1(dVarD, kotlin.reflect.jvm.internal.impl.load.java.lazy.c.a(x(), kVar), false, x().a().t().a(kVar));
        f0.o(bVarU1, "createJavaConstructor(\n …ce(constructor)\n        )");
        kotlin.reflect.jvm.internal.impl.load.java.lazy.d dVarE = ContextKt.e(x(), bVarU1, kVar, dVarD.w().size());
        LazyJavaScope.b bVarL = L(dVarE, bVarU1, kVar.i());
        List<y0> listW = dVarD.w();
        f0.o(listW, "classDescriptor.declaredTypeParameters");
        List<y> typeParameters = kVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            y0 y0VarA = dVarE.f().a((y) it.next());
            f0.m(y0VarA);
            arrayList.add(y0VarA);
        }
        bVarU1.s1(bVarL.a(), kotlin.reflect.jvm.internal.impl.load.java.x.d(kVar.getVisibility()), CollectionsKt___CollectionsKt.y4(listW, arrayList));
        bVarU1.Z0(false);
        bVarU1.a1(bVarL.b());
        bVarU1.h1(dVarD.v());
        dVarE.a().h().e(kVar, bVarU1);
        return bVarU1;
    }

    private final JavaMethodDescriptor I0(mi.w wVar) {
        JavaMethodDescriptor javaMethodDescriptorQ1 = JavaMethodDescriptor.q1(D(), kotlin.reflect.jvm.internal.impl.load.java.lazy.c.a(x(), wVar), wVar.getName(), x().a().t().a(wVar), true);
        f0.o(javaMethodDescriptorQ1, "createJavaMethod(\n      …omponent), true\n        )");
        javaMethodDescriptorQ1.p1(null, A(), CollectionsKt__CollectionsKt.E(), CollectionsKt__CollectionsKt.E(), CollectionsKt__CollectionsKt.E(), x().g().o(wVar.getType(), kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(TypeUsage.COMMON, false, false, null, 6, null)), Modality.Companion.a(false, false, true), r.f125868e, null);
        javaMethodDescriptorQ1.t1(false, false);
        x().a().h().c(wVar, javaMethodDescriptorQ1);
        return javaMethodDescriptorQ1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<s0> J0(f fVar) {
        Collection<mi.r> collectionE = z().invoke().e(fVar);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(collectionE, 10));
        Iterator<T> it = collectionE.iterator();
        while (it.hasNext()) {
            arrayList.add(J((mi.r) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<s0> K0(f fVar) {
        Set<s0> setZ0 = z0(fVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setZ0) {
            s0 s0Var = (s0) obj;
            if (!(SpecialBuiltinMembers.a(s0Var) || BuiltinMethodsWithSpecialGenericSignature.k(s0Var) != null)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean L0(s0 s0Var) {
        BuiltinMethodsWithSpecialGenericSignature builtinMethodsWithSpecialGenericSignature = BuiltinMethodsWithSpecialGenericSignature.f125959n;
        f name = s0Var.getName();
        f0.o(name, "name");
        if (!builtinMethodsWithSpecialGenericSignature.l(name)) {
            return false;
        }
        f name2 = s0Var.getName();
        f0.o(name2, "name");
        Set<s0> setZ0 = z0(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setZ0.iterator();
        while (it.hasNext()) {
            w wVarK = BuiltinMethodsWithSpecialGenericSignature.k((s0) it.next());
            if (wVarK != null) {
                arrayList.add(wVarK);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (C0(s0Var, (w) it2.next())) {
                return true;
            }
        }
        return false;
    }

    private final void W(List<b1> list, kotlin.reflect.jvm.internal.impl.descriptors.j jVar, int i10, mi.r rVar, d0 d0Var, d0 d0Var2) {
        kotlin.reflect.jvm.internal.impl.descriptors.annotations.e eVarB = kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b();
        f name = rVar.getName();
        d0 d0VarN = i1.n(d0Var);
        f0.o(d0VarN, "makeNotNullable(returnType)");
        list.add(new ValueParameterDescriptorImpl(jVar, null, i10, eVarB, name, d0VarN, rVar.O(), false, false, d0Var2 != null ? i1.n(d0Var2) : null, x().a().t().a(rVar)));
    }

    private final void X(Collection<s0> collection, f fVar, Collection<? extends s0> collection2, boolean z10) {
        Collection<? extends s0> collectionD = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(fVar, collection2, collection, D(), x().a().c(), x().a().k().b());
        f0.o(collectionD, "resolveOverridesForNonSt….overridingUtil\n        )");
        if (!z10) {
            collection.addAll(collectionD);
            return;
        }
        List listY4 = CollectionsKt___CollectionsKt.y4(collection, collectionD);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(collectionD, 10));
        for (s0 resolvedOverride : collectionD) {
            s0 s0Var = (s0) SpecialBuiltinMembers.e(resolvedOverride);
            if (s0Var == null) {
                f0.o(resolvedOverride, "resolvedOverride");
            } else {
                f0.o(resolvedOverride, "resolvedOverride");
                resolvedOverride = h0(resolvedOverride, s0Var, listY4);
            }
            arrayList.add(resolvedOverride);
        }
        collection.addAll(arrayList);
    }

    private final void Y(f fVar, Collection<? extends s0> collection, Collection<? extends s0> collection2, Collection<s0> collection3, l<? super f, ? extends Collection<? extends s0>> lVar) {
        for (s0 s0Var : collection2) {
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, F0(s0Var, lVar, fVar, collection));
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, E0(s0Var, lVar, collection));
            kotlin.reflect.jvm.internal.impl.utils.a.a(collection3, G0(s0Var, lVar));
        }
    }

    private final void Z(Set<? extends o0> set, Collection<o0> collection, Set<o0> set2, l<? super f, ? extends Collection<? extends s0>> lVar) {
        for (o0 o0Var : set) {
            kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVarJ0 = j0(o0Var, lVar);
            if (eVarJ0 != null) {
                collection.add(eVarJ0);
                if (set2 != null) {
                    set2.add(o0Var);
                    return;
                }
                return;
            }
        }
    }

    private final void a0(f fVar, Collection<o0> collection) {
        mi.r rVar = (mi.r) CollectionsKt___CollectionsKt.d5(z().invoke().e(fVar));
        if (rVar == null) {
            return;
        }
        collection.add(l0(this, rVar, null, Modality.FINAL, 2, null));
    }

    private final Collection<d0> d0() {
        if (!this.f126163p) {
            return x().a().k().c().g(D());
        }
        Collection<d0> collectionL = D().r().l();
        f0.o(collectionL, "ownerDescriptor.typeConstructor.supertypes");
        return collectionL;
    }

    private final List<b1> e0(kotlin.reflect.jvm.internal.impl.descriptors.impl.e eVar) {
        Pair pair;
        Collection<mi.r> collectionB = this.f126162o.b();
        ArrayList arrayList = new ArrayList(collectionB.size());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVarB = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(TypeUsage.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : collectionB) {
            if (f0.g(((mi.r) obj).getName(), kotlin.reflect.jvm.internal.impl.load.java.t.f126311c)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        Pair pair2 = new Pair(arrayList2, arrayList3);
        List list = (List) pair2.a();
        List<mi.r> list2 = (List) pair2.b();
        list.size();
        mi.r rVar = (mi.r) CollectionsKt___CollectionsKt.B2(list);
        if (rVar != null) {
            mi.x returnType = rVar.getReturnType();
            if (returnType instanceof mi.f) {
                mi.f fVar = (mi.f) returnType;
                pair = new Pair(x().g().k(fVar, aVarB, true), x().g().o(fVar.r(), aVarB));
            } else {
                pair = new Pair(x().g().o(returnType, aVarB), null);
            }
            W(arrayList, eVar, 0, rVar, (d0) pair.a(), (d0) pair.b());
        }
        int i10 = 0;
        int i11 = rVar == null ? 0 : 1;
        for (mi.r rVar2 : list2) {
            W(arrayList, eVar, i10 + i11, rVar2, x().g().o(rVar2.getReturnType(), aVarB), null);
            i10++;
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.c f0() {
        boolean zS = this.f126162o.s();
        if ((this.f126162o.n() || !this.f126162o.K()) && !zS) {
            return null;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarD = D();
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.b bVarU1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.u1(dVarD, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), true, x().a().t().a(this.f126162o));
        f0.o(bVarU1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<b1> listE0 = zS ? e0(bVarU1) : Collections.emptyList();
        bVarU1.a1(false);
        bVarU1.r1(listE0, x0(dVarD));
        bVarU1.Z0(true);
        bVarU1.h1(dVarD.v());
        x().a().h().e(this.f126162o, bVarU1);
        return bVarU1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final kotlin.reflect.jvm.internal.impl.descriptors.c g0() {
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarD = D();
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.b bVarU1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.b.u1(dVarD, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), true, x().a().t().a(this.f126162o));
        f0.o(bVarU1, "createJavaConstructor(\n ….source(jClass)\n        )");
        List<b1> listM0 = m0(bVarU1);
        bVarU1.a1(false);
        bVarU1.r1(listM0, x0(dVarD));
        bVarU1.Z0(false);
        bVarU1.h1(dVarD.v());
        return bVarU1;
    }

    private final s0 h0(s0 s0Var, kotlin.reflect.jvm.internal.impl.descriptors.a aVar, Collection<? extends s0> collection) {
        s0 s0Var2;
        boolean z10 = false;
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            Iterator<T> it = collection.iterator();
            do {
                if (!it.hasNext()) {
                    z10 = true;
                    break;
                }
                s0Var2 = (s0) it.next();
            } while (!(!f0.g(s0Var, s0Var2) && s0Var2.D0() == null && q0(s0Var2, aVar)));
        } else {
            z10 = true;
            break;
        }
        if (z10) {
            return s0Var;
        }
        w wVarBuild = s0Var.q().e().build();
        f0.m(wVarBuild);
        return (s0) wVarBuild;
    }

    private final s0 i0(w wVar, l<? super f, ? extends Collection<? extends s0>> lVar) {
        Object next;
        f name = wVar.getName();
        f0.o(name, "overridden.name");
        Iterator<T> it = lVar.invoke(name).iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!C0((s0) next, wVar));
        s0 s0Var = (s0) next;
        if (s0Var == null) {
            return null;
        }
        w.a<? extends s0> aVarQ = s0Var.q();
        List<b1> listI = wVar.i();
        f0.o(listI, "overridden.valueParameters");
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listI, 10));
        Iterator<T> it2 = listI.iterator();
        while (it2.hasNext()) {
            arrayList.add(((b1) it2.next()).getType());
        }
        List<b1> listI2 = s0Var.i();
        f0.o(listI2, "override.valueParameters");
        aVarQ.n(kotlin.reflect.jvm.internal.impl.load.java.descriptors.g.a(arrayList, listI2, wVar));
        aVarQ.t();
        aVarQ.g();
        aVarQ.d(JavaMethodDescriptor.I, Boolean.TRUE);
        return (s0) aVarQ.build();
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e j0(o0 o0Var, l<? super f, ? extends Collection<? extends s0>> lVar) {
        s0 s0VarW0;
        b0 b0VarM = null;
        if (!p0(o0Var, lVar)) {
            return null;
        }
        s0 s0VarV0 = v0(o0Var, lVar);
        f0.m(s0VarV0);
        if (o0Var.G()) {
            s0VarW0 = w0(o0Var, lVar);
            f0.m(s0VarW0);
        } else {
            s0VarW0 = null;
        }
        if (s0VarW0 != null) {
            s0VarW0.l();
            s0VarV0.l();
        }
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.d dVar = new kotlin.reflect.jvm.internal.impl.load.java.descriptors.d(D(), s0VarV0, s0VarW0, o0Var);
        d0 returnType = s0VarV0.getReturnType();
        f0.m(returnType);
        dVar.d1(returnType, CollectionsKt__CollectionsKt.E(), A(), null, CollectionsKt__CollectionsKt.E());
        a0 a0VarK = kotlin.reflect.jvm.internal.impl.resolve.c.k(dVar, s0VarV0.getAnnotations(), false, false, false, s0VarV0.j());
        a0VarK.O0(s0VarV0);
        a0VarK.R0(dVar.getType());
        f0.o(a0VarK, "createGetter(\n          …escriptor.type)\n        }");
        if (s0VarW0 != null) {
            List<b1> listI = s0VarW0.i();
            f0.o(listI, "setterMethod.valueParameters");
            b1 b1Var = (b1) CollectionsKt___CollectionsKt.B2(listI);
            if (b1Var == null) {
                throw new AssertionError("No parameter found for " + s0VarW0);
            }
            b0VarM = kotlin.reflect.jvm.internal.impl.resolve.c.m(dVar, s0VarW0.getAnnotations(), b1Var.getAnnotations(), false, false, false, s0VarW0.getVisibility(), s0VarW0.j());
            b0VarM.O0(s0VarW0);
        }
        dVar.W0(a0VarK, b0VarM);
        return dVar;
    }

    private final kotlin.reflect.jvm.internal.impl.load.java.descriptors.e k0(mi.r rVar, d0 d0Var, Modality modality) {
        kotlin.reflect.jvm.internal.impl.load.java.descriptors.e eVarH1 = kotlin.reflect.jvm.internal.impl.load.java.descriptors.e.h1(D(), kotlin.reflect.jvm.internal.impl.load.java.lazy.c.a(x(), rVar), modality, kotlin.reflect.jvm.internal.impl.load.java.x.d(rVar.getVisibility()), false, rVar.getName(), x().a().t().a(rVar), false);
        f0.o(eVarH1, "create(\n            owne…inal = */ false\n        )");
        a0 a0VarD = kotlin.reflect.jvm.internal.impl.resolve.c.d(eVarH1, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b());
        f0.o(a0VarD, "createDefaultGetter(prop…iptor, Annotations.EMPTY)");
        eVarH1.W0(a0VarD, null);
        d0 d0VarR = d0Var == null ? r(rVar, ContextKt.f(x(), eVarH1, rVar, 0, 4, null)) : d0Var;
        eVarH1.d1(d0VarR, CollectionsKt__CollectionsKt.E(), A(), null, CollectionsKt__CollectionsKt.E());
        a0VarD.R0(d0VarR);
        return eVarH1;
    }

    static /* synthetic */ kotlin.reflect.jvm.internal.impl.load.java.descriptors.e l0(LazyJavaClassMemberScope lazyJavaClassMemberScope, mi.r rVar, d0 d0Var, Modality modality, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            d0Var = null;
        }
        return lazyJavaClassMemberScope.k0(rVar, d0Var, modality);
    }

    private final List<b1> m0(kotlin.reflect.jvm.internal.impl.descriptors.impl.e eVar) {
        Collection<mi.w> collectionI = this.f126162o.I();
        ArrayList arrayList = new ArrayList(collectionI.size());
        kotlin.reflect.jvm.internal.impl.load.java.lazy.types.a aVarB = kotlin.reflect.jvm.internal.impl.load.java.lazy.types.b.b(TypeUsage.COMMON, false, false, null, 6, null);
        Iterator<mi.w> it = collectionI.iterator();
        int i10 = 0;
        while (true) {
            int i11 = i10;
            if (!it.hasNext()) {
                return arrayList;
            }
            i10 = i11 + 1;
            mi.w next = it.next();
            d0 d0VarO = x().g().o(next.getType(), aVarB);
            arrayList.add(new ValueParameterDescriptorImpl(eVar, null, i11, kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), next.getName(), d0VarO, false, false, false, next.c() ? x().a().m().t().k(d0VarO) : null, x().a().t().a(next)));
        }
    }

    private final s0 n0(s0 s0Var, f fVar) {
        w.a<? extends s0> aVarQ = s0Var.q();
        aVarQ.f(fVar);
        aVarQ.t();
        aVarQ.g();
        w wVarBuild = aVarQ.build();
        f0.m(wVarBuild);
        return (s0) wVarBuild;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0035  */
    private final s0 o0(s0 s0Var) {
        kotlin.reflect.jvm.internal.impl.name.c cVarL;
        kotlin.reflect.jvm.internal.impl.name.d dVarM;
        List<b1> valueParameters = s0Var.i();
        f0.o(valueParameters, "valueParameters");
        b1 b1Var = (b1) CollectionsKt___CollectionsKt.q3(valueParameters);
        if (b1Var != null) {
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = b1Var.getType().O0().d();
            if (fVarD == null || (dVarM = DescriptorUtilsKt.m(fVarD)) == null) {
                cVarL = null;
            } else {
                if (!dVarM.f()) {
                    dVarM = null;
                }
                if (dVarM != null) {
                    cVarL = dVarM.l();
                } else {
                    cVarL = null;
                }
            }
            if (!f0.g(cVarL, kotlin.reflect.jvm.internal.impl.builtins.h.f125407p)) {
                b1Var = null;
            }
            if (b1Var != null) {
                w.a<? extends s0> aVarQ = s0Var.q();
                List<b1> valueParameters2 = s0Var.i();
                f0.o(valueParameters2, "valueParameters");
                s0 s0Var2 = (s0) aVarQ.n(CollectionsKt___CollectionsKt.Y1(valueParameters2, 1)).h(b1Var.getType().M0().get(0).getType()).build();
                kotlin.reflect.jvm.internal.impl.descriptors.impl.d0 d0Var = (kotlin.reflect.jvm.internal.impl.descriptors.impl.d0) s0Var2;
                if (d0Var != null) {
                    d0Var.i1(true);
                }
                return s0Var2;
            }
        }
        return null;
    }

    private final boolean p0(o0 o0Var, l<? super f, ? extends Collection<? extends s0>> lVar) {
        if (b.a(o0Var)) {
            return false;
        }
        s0 s0VarV0 = v0(o0Var, lVar);
        s0 s0VarW0 = w0(o0Var, lVar);
        if (s0VarV0 == null) {
            return false;
        }
        if (o0Var.G()) {
            return s0VarW0 != null && s0VarW0.l() == s0VarV0.l();
        }
        return true;
    }

    private final boolean q0(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        OverridingUtil.OverrideCompatibilityInfo.Result resultC = OverridingUtil.f127488f.F(aVar2, aVar, true).c();
        f0.o(resultC, "DEFAULT.isOverridableByW…iptor, this, true).result");
        return resultC == OverridingUtil.OverrideCompatibilityInfo.Result.OVERRIDABLE && !kotlin.reflect.jvm.internal.impl.load.java.n.f126290a.a(aVar2, aVar);
    }

    private final boolean r0(s0 s0Var) {
        SpecialGenericSignatures.a aVar = SpecialGenericSignatures.f125985a;
        f name = s0Var.getName();
        f0.o(name, "name");
        f fVarB = aVar.b(name);
        if (fVarB == null) {
            return false;
        }
        Set<s0> setZ0 = z0(fVarB);
        ArrayList arrayList = new ArrayList();
        for (Object obj : setZ0) {
            if (SpecialBuiltinMembers.a((s0) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        s0 s0VarN0 = n0(s0Var, fVarB);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (s0((s0) it.next(), s0VarN0)) {
                return true;
            }
        }
        return false;
    }

    private final boolean s0(s0 s0Var, w wVar) {
        if (BuiltinMethodsWithDifferentJvmName.f125957n.k(s0Var)) {
            wVar = wVar.a();
        }
        f0.o(wVar, "if (superDescriptor.isRe…iginal else subDescriptor");
        return q0(wVar, s0Var);
    }

    private final boolean t0(s0 s0Var) {
        s0 s0VarO0 = o0(s0Var);
        if (s0VarO0 == null) {
            return false;
        }
        f name = s0Var.getName();
        f0.o(name, "name");
        Set<s0> setZ0 = z0(name);
        if ((setZ0 instanceof Collection) && setZ0.isEmpty()) {
            return false;
        }
        for (s0 s0Var2 : setZ0) {
            if (s0Var2.isSuspend() && q0(s0VarO0, s0Var2)) {
                return true;
            }
        }
        return false;
    }

    private final s0 u0(o0 o0Var, String str, l<? super f, ? extends Collection<? extends s0>> lVar) {
        s0 s0Var;
        f fVarF = f.f(str);
        f0.o(fVarF, "identifier(getterName)");
        Iterator<T> it = lVar.invoke(fVarF).iterator();
        do {
            s0Var = null;
            if (!it.hasNext()) {
                break;
            }
            s0 s0Var2 = (s0) it.next();
            if (s0Var2.i().size() == 0) {
                kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f128071a;
                d0 returnType = s0Var2.getReturnType();
                if (returnType == null ? false : eVar.d(returnType, o0Var.getType())) {
                    s0Var = s0Var2;
                }
            }
        } while (s0Var == null);
        return s0Var;
    }

    private final s0 v0(o0 o0Var, l<? super f, ? extends Collection<? extends s0>> lVar) {
        p0 getter = o0Var.getGetter();
        p0 p0Var = getter != null ? (p0) SpecialBuiltinMembers.d(getter) : null;
        String strA = p0Var != null ? ClassicBuiltinSpecialProperties.f125962a.a(p0Var) : null;
        if (strA != null && !SpecialBuiltinMembers.f(D(), p0Var)) {
            return u0(o0Var, strA, lVar);
        }
        String strB = o0Var.getName().b();
        f0.o(strB, "name.asString()");
        return u0(o0Var, kotlin.reflect.jvm.internal.impl.load.java.s.b(strB), lVar);
    }

    private final s0 w0(o0 o0Var, l<? super f, ? extends Collection<? extends s0>> lVar) {
        s0 s0Var;
        d0 returnType;
        String strB = o0Var.getName().b();
        f0.o(strB, "name.asString()");
        f fVarF = f.f(kotlin.reflect.jvm.internal.impl.load.java.s.e(strB));
        f0.o(fVarF, "identifier(JvmAbi.setterName(name.asString()))");
        Iterator<T> it = lVar.invoke(fVarF).iterator();
        do {
            s0Var = null;
            if (!it.hasNext()) {
                break;
            }
            s0 s0Var2 = (s0) it.next();
            if (s0Var2.i().size() == 1 && (returnType = s0Var2.getReturnType()) != null && kotlin.reflect.jvm.internal.impl.builtins.g.B0(returnType)) {
                kotlin.reflect.jvm.internal.impl.types.checker.e eVar = kotlin.reflect.jvm.internal.impl.types.checker.e.f128071a;
                List<b1> listI = s0Var2.i();
                f0.o(listI, "descriptor.valueParameters");
                if (eVar.a(((b1) CollectionsKt___CollectionsKt.c5(listI)).getType(), o0Var.getType())) {
                    s0Var = s0Var2;
                }
            }
        } while (s0Var == null);
        return s0Var;
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.s x0(kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        kotlin.reflect.jvm.internal.impl.descriptors.s visibility = dVar.getVisibility();
        f0.o(visibility, "classDescriptor.visibility");
        if (!f0.g(visibility, kotlin.reflect.jvm.internal.impl.load.java.m.f126287b)) {
            return visibility;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.s PROTECTED_AND_PACKAGE = kotlin.reflect.jvm.internal.impl.load.java.m.f126288c;
        f0.o(PROTECTED_AND_PACKAGE, "PROTECTED_AND_PACKAGE");
        return PROTECTED_AND_PACKAGE;
    }

    private final Set<s0> z0(f fVar) {
        Collection<d0> collectionD0 = d0();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionD0.iterator();
        while (it.hasNext()) {
            x.n0(linkedHashSet, ((d0) it.next()).u().a(fVar, NoLookupLocation.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.e
    protected kotlin.reflect.jvm.internal.impl.descriptors.r0 A() {
        return kotlin.reflect.jvm.internal.impl.resolve.d.l(D());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    /* JADX INFO: renamed from: A0, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.descriptors.d D() {
        return this.f126161n;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected boolean H(@dl.d JavaMethodDescriptor javaMethodDescriptor) {
        f0.p(javaMethodDescriptor, "<this>");
        if (this.f126162o.s()) {
            return false;
        }
        return D0(javaMethodDescriptor);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    protected LazyJavaScope.a I(@dl.d mi.r method, @dl.d List<? extends y0> methodTypeParameters, @dl.d d0 returnType, @dl.d List<? extends b1> valueParameters) {
        f0.p(method, "method");
        f0.p(methodTypeParameters, "methodTypeParameters");
        f0.p(returnType, "returnType");
        f0.p(valueParameters, "valueParameters");
        kotlin.reflect.jvm.internal.impl.load.java.components.e.b bVarB = x().a().s().b(method, D(), returnType, null, valueParameters, methodTypeParameters);
        f0.o(bVarB, "c.components.signaturePr…dTypeParameters\n        )");
        d0 d0VarD = bVarB.d();
        f0.o(d0VarD, "propagated.returnType");
        d0 d0VarC = bVarB.c();
        List<b1> listF = bVarB.f();
        f0.o(listF, "propagated.valueParameters");
        List<y0> listE = bVarB.e();
        f0.o(listE, "propagated.typeParameters");
        boolean zG = bVarB.g();
        List<String> listB = bVarB.b();
        f0.o(listB, "propagated.errors");
        return new LazyJavaScope.a(d0VarD, d0VarC, listF, listE, zG, listB);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<s0> a(@dl.d f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        e(name, location);
        return super.a(name, location);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    /* JADX INFO: renamed from: b0, reason: merged with bridge method [inline-methods] */
    public LinkedHashSet<f> o(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.e l<? super f, Boolean> lVar) {
        f0.p(kindFilter, "kindFilter");
        Collection<d0> collectionL = D().r().l();
        f0.o(collectionL, "ownerDescriptor.typeConstructor.supertypes");
        LinkedHashSet<f> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = collectionL.iterator();
        while (it.hasNext()) {
            x.n0(linkedHashSet, ((d0) it.next()).u().b());
        }
        linkedHashSet.addAll(z().invoke().a());
        linkedHashSet.addAll(z().invoke().b());
        linkedHashSet.addAll(m(kindFilter, lVar));
        linkedHashSet.addAll(x().a().w().c(x(), D()));
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Collection<o0> c(@dl.d f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        e(name, location);
        return super.c(name, location);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    /* JADX INFO: renamed from: c0, reason: merged with bridge method [inline-methods] */
    public ClassDeclaredMemberIndex q() {
        return new ClassDeclaredMemberIndex(this.f126162o, new l<q, Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeMemberIndex$1
            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(@dl.d q it) {
                f0.p(it, "it");
                return Boolean.valueOf(!it.p());
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    public void e(@dl.d f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        ji.a.a(x().a().l(), location, D(), name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f h(@dl.d f name, @dl.d ki.b location) {
        kotlin.reflect.jvm.internal.impl.storage.g<f, kotlin.reflect.jvm.internal.impl.descriptors.d> gVar;
        kotlin.reflect.jvm.internal.impl.descriptors.d dVarInvoke;
        f0.p(name, "name");
        f0.p(location, "location");
        e(name, location);
        LazyJavaClassMemberScope lazyJavaClassMemberScope = (LazyJavaClassMemberScope) C();
        return (lazyJavaClassMemberScope == null || (gVar = lazyJavaClassMemberScope.f126168u) == null || (dVarInvoke = gVar.invoke(name)) == null) ? this.f126168u.invoke(name) : dVarInvoke;
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    protected Set<f> m(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.e l<? super f, Boolean> lVar) {
        f0.p(kindFilter, "kindFilter");
        return e1.C(this.f126165r.invoke(), this.f126167t.invoke().keySet());
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void p(@dl.d Collection<s0> result, @dl.d f name) {
        f0.p(result, "result");
        f0.p(name, "name");
        if (this.f126162o.J() && z().invoke().f(name) != null) {
            boolean z10 = true;
            if (!result.isEmpty()) {
                Iterator<T> it = result.iterator();
                while (it.hasNext()) {
                    if (((s0) it.next()).i().isEmpty()) {
                        z10 = false;
                        break;
                    }
                }
            }
            if (z10) {
                mi.w wVarF = z().invoke().f(name);
                f0.m(wVarF);
                result.add(I0(wVarF));
            }
        }
        x().a().w().b(x(), D(), name, result);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void s(@dl.d Collection<s0> result, @dl.d f name) {
        boolean z10;
        f0.p(result, "result");
        f0.p(name, "name");
        Set<s0> setZ0 = z0(name);
        if (!SpecialGenericSignatures.f125985a.k(name) && !BuiltinMethodsWithSpecialGenericSignature.f125959n.l(name)) {
            if (!(setZ0 instanceof Collection) || !setZ0.isEmpty()) {
                Iterator<T> it = setZ0.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((w) it.next()).isSuspend()) {
                            z10 = false;
                            break;
                        }
                    } else {
                        z10 = true;
                        break;
                    }
                }
            } else {
                z10 = true;
                break;
            }
            if (z10) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : setZ0) {
                    if (D0((s0) obj)) {
                        arrayList.add(obj);
                    }
                }
                X(result, name, arrayList, false);
                return;
            }
        }
        kotlin.reflect.jvm.internal.impl.utils.e eVarA = kotlin.reflect.jvm.internal.impl.utils.e.f128306d.a();
        Collection<? extends s0> collectionD = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(name, setZ0, CollectionsKt__CollectionsKt.E(), D(), kotlin.reflect.jvm.internal.impl.serialization.deserialization.m.f127887a, x().a().k().b());
        f0.o(collectionD, "resolveOverridesForNonSt….overridingUtil\n        )");
        Y(name, result, collectionD, result, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$3(this));
        Y(name, result, collectionD, eVarA, new LazyJavaClassMemberScope$computeNonDeclaredFunctions$4(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : setZ0) {
            if (D0((s0) obj2)) {
                arrayList2.add(obj2);
            }
        }
        X(result, name, CollectionsKt___CollectionsKt.y4(arrayList2, eVarA), true);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    protected void t(@dl.d f name, @dl.d Collection<o0> result) {
        f0.p(name, "name");
        f0.p(result, "result");
        if (this.f126162o.s()) {
            a0(name, result);
        }
        Set<o0> setB0 = B0(name);
        if (setB0.isEmpty()) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.utils.e.b bVar = kotlin.reflect.jvm.internal.impl.utils.e.f128306d;
        kotlin.reflect.jvm.internal.impl.utils.e eVarA = bVar.a();
        kotlin.reflect.jvm.internal.impl.utils.e eVarA2 = bVar.a();
        Z(setB0, result, eVarA, new l<f, Collection<? extends s0>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredProperties$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<s0> invoke(@dl.d f it) {
                f0.p(it, "it");
                return this.f126170b.J0(it);
            }
        });
        Z(e1.x(setB0, eVarA), eVarA2, null, new l<f, Collection<? extends s0>>() { // from class: kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaClassMemberScope$computeNonDeclaredProperties$2
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<s0> invoke(@dl.d f it) {
                f0.p(it, "it");
                return this.f126171b.K0(it);
            }
        });
        Collection<? extends o0> collectionD = kotlin.reflect.jvm.internal.impl.load.java.components.a.d(name, e1.C(setB0, eVarA2), result, D(), x().a().c(), x().a().k().b());
        f0.o(collectionD, "resolveOverridesForNonSt…rridingUtil\n            )");
        result.addAll(collectionD);
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    public String toString() {
        return "Lazy Java member scope for " + this.f126162o.e();
    }

    @Override // kotlin.reflect.jvm.internal.impl.load.java.lazy.descriptors.LazyJavaScope
    @dl.d
    protected Set<f> u(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.e l<? super f, Boolean> lVar) {
        f0.p(kindFilter, "kindFilter");
        if (this.f126162o.s()) {
            return b();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(z().invoke().d());
        Collection<d0> collectionL = D().r().l();
        f0.o(collectionL, "ownerDescriptor.typeConstructor.supertypes");
        Iterator<T> it = collectionL.iterator();
        while (it.hasNext()) {
            x.n0(linkedHashSet, ((d0) it.next()).u().d());
        }
        return linkedHashSet;
    }

    @dl.d
    public final h<List<kotlin.reflect.jvm.internal.impl.descriptors.c>> y0() {
        return this.f126164q;
    }
}
