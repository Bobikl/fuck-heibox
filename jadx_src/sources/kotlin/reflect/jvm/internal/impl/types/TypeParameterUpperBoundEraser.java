package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.storage.LockBasedStorageManager;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import kotlin.reflect.jvm.internal.impl.types.typeUtil.TypeUtilsKt;

/* JADX INFO: compiled from: TypeParameterUpperBoundEraser.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeParameterUpperBoundEraser {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    public static final a f128029f = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final v f128030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final b1 f128031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final LockBasedStorageManager f128032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlin.z f128033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.f<b, d0> f128034e;

    /* JADX INFO: compiled from: TypeParameterUpperBoundEraser.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0089  */
        /* JADX WARN: Code duplicated, block: B:23:0x008d  */
        /* JADX WARN: Code duplicated, block: B:27:0x0097  */
        /* JADX WARN: Code duplicated, block: B:32:0x00ad  */
        /* JADX WARN: Code duplicated, block: B:51:0x0125  */
        /* JADX WARN: Code duplicated, block: B:54:0x0129  */
        /* JADX WARN: Code duplicated, block: B:58:0x0133  */
        /* JADX WARN: Code duplicated, block: B:63:0x0149  */
        /* JADX WARN: Code duplicated, block: B:85:0x01c7  */
        /* JADX WARN: Code duplicated, block: B:88:0x01cb  */
        /* JADX WARN: Code duplicated, block: B:92:0x01d5  */
        /* JADX WARN: Code duplicated, block: B:97:0x01eb  */
        @dl.d
        public final d0 a(@dl.d d0 d0Var, @dl.d TypeSubstitutor substitutor, @dl.e Set<? extends kotlin.reflect.jvm.internal.impl.descriptors.y0> set, boolean z10) {
            l1 l1VarF;
            boolean z11;
            boolean z12;
            d0 type;
            boolean z13;
            boolean z14;
            d0 type2;
            boolean z15;
            boolean z16;
            d0 type3;
            kotlin.jvm.internal.f0.p(d0Var, "<this>");
            kotlin.jvm.internal.f0.p(substitutor, "substitutor");
            l1 l1VarR0 = d0Var.R0();
            if (l1VarR0 instanceof y) {
                y yVar = (y) l1VarR0;
                j0 j0VarW0 = yVar.W0();
                if (!j0VarW0.O0().getParameters().isEmpty() && j0VarW0.O0().d() != null) {
                    List<kotlin.reflect.jvm.internal.impl.descriptors.y0> parameters = j0VarW0.O0().getParameters();
                    kotlin.jvm.internal.f0.o(parameters, "constructor.parameters");
                    ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(parameters, 10));
                    for (kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var : parameters) {
                        c1 starProjectionImpl = (c1) CollectionsKt___CollectionsKt.R2(d0Var.M0(), y0Var.getIndex());
                        if (z10) {
                            if (starProjectionImpl == null || (type3 = starProjectionImpl.getType()) == null) {
                                z16 = false;
                            } else {
                                kotlin.jvm.internal.f0.o(type3, "type");
                                if (TypeUtilsKt.e(type3)) {
                                    z16 = false;
                                } else {
                                    z16 = true;
                                }
                            }
                            if (!z16) {
                                if (set == null) {
                                    z15 = false;
                                } else {
                                    z15 = false;
                                }
                                if (starProjectionImpl != null) {
                                    starProjectionImpl = new StarProjectionImpl(y0Var);
                                } else {
                                    starProjectionImpl = new StarProjectionImpl(y0Var);
                                }
                            }
                        } else {
                            if (set == null && set.contains(y0Var)) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            if (starProjectionImpl != null || z15) {
                                starProjectionImpl = new StarProjectionImpl(y0Var);
                            } else {
                                f1 f1VarJ = substitutor.j();
                                d0 type4 = starProjectionImpl.getType();
                                kotlin.jvm.internal.f0.o(type4, "argument.type");
                                if (f1VarJ.e(type4) == null) {
                                    starProjectionImpl = new StarProjectionImpl(y0Var);
                                }
                            }
                        }
                        arrayList.add(starProjectionImpl);
                    }
                    j0VarW0 = g1.f(j0VarW0, arrayList, null, 2, null);
                }
                j0 j0VarX0 = yVar.X0();
                if (!j0VarX0.O0().getParameters().isEmpty() && j0VarX0.O0().d() != null) {
                    List<kotlin.reflect.jvm.internal.impl.descriptors.y0> parameters2 = j0VarX0.O0().getParameters();
                    kotlin.jvm.internal.f0.o(parameters2, "constructor.parameters");
                    ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(parameters2, 10));
                    for (kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var2 : parameters2) {
                        c1 starProjectionImpl2 = (c1) CollectionsKt___CollectionsKt.R2(d0Var.M0(), y0Var2.getIndex());
                        if (z10) {
                            if (starProjectionImpl2 == null || (type2 = starProjectionImpl2.getType()) == null) {
                                z14 = false;
                            } else {
                                kotlin.jvm.internal.f0.o(type2, "type");
                                if (TypeUtilsKt.e(type2)) {
                                    z14 = false;
                                } else {
                                    z14 = true;
                                }
                            }
                            if (!z14) {
                                if (set == null) {
                                    z13 = false;
                                } else {
                                    z13 = false;
                                }
                                if (starProjectionImpl2 != null) {
                                    starProjectionImpl2 = new StarProjectionImpl(y0Var2);
                                } else {
                                    starProjectionImpl2 = new StarProjectionImpl(y0Var2);
                                }
                            }
                        } else {
                            if (set == null && set.contains(y0Var2)) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (starProjectionImpl2 != null || z13) {
                                starProjectionImpl2 = new StarProjectionImpl(y0Var2);
                            } else {
                                f1 f1VarJ2 = substitutor.j();
                                d0 type5 = starProjectionImpl2.getType();
                                kotlin.jvm.internal.f0.o(type5, "argument.type");
                                if (f1VarJ2.e(type5) == null) {
                                    starProjectionImpl2 = new StarProjectionImpl(y0Var2);
                                }
                            }
                        }
                        arrayList2.add(starProjectionImpl2);
                    }
                    j0VarX0 = g1.f(j0VarX0, arrayList2, null, 2, null);
                }
                l1VarF = KotlinTypeFactory.d(j0VarW0, j0VarX0);
            } else {
                if (!(l1VarR0 instanceof j0)) {
                    throw new NoWhenBranchMatchedException();
                }
                j0 j0Var = (j0) l1VarR0;
                if (j0Var.O0().getParameters().isEmpty() || j0Var.O0().d() == null) {
                    l1VarF = j0Var;
                } else {
                    List<kotlin.reflect.jvm.internal.impl.descriptors.y0> parameters3 = j0Var.O0().getParameters();
                    kotlin.jvm.internal.f0.o(parameters3, "constructor.parameters");
                    ArrayList arrayList3 = new ArrayList(kotlin.collections.t.Y(parameters3, 10));
                    for (kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var3 : parameters3) {
                        c1 starProjectionImpl3 = (c1) CollectionsKt___CollectionsKt.R2(d0Var.M0(), y0Var3.getIndex());
                        if (z10) {
                            if (starProjectionImpl3 == null || (type = starProjectionImpl3.getType()) == null) {
                                z12 = false;
                            } else {
                                kotlin.jvm.internal.f0.o(type, "type");
                                if (TypeUtilsKt.e(type)) {
                                    z12 = false;
                                } else {
                                    z12 = true;
                                }
                            }
                            if (!z12) {
                                if (set == null) {
                                    z11 = false;
                                } else {
                                    z11 = false;
                                }
                                if (starProjectionImpl3 != null) {
                                    starProjectionImpl3 = new StarProjectionImpl(y0Var3);
                                } else {
                                    starProjectionImpl3 = new StarProjectionImpl(y0Var3);
                                }
                            }
                        } else {
                            if (set == null && set.contains(y0Var3)) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            if (starProjectionImpl3 != null || z11) {
                                starProjectionImpl3 = new StarProjectionImpl(y0Var3);
                            } else {
                                f1 f1VarJ3 = substitutor.j();
                                d0 type6 = starProjectionImpl3.getType();
                                kotlin.jvm.internal.f0.o(type6, "argument.type");
                                if (f1VarJ3.e(type6) == null) {
                                    starProjectionImpl3 = new StarProjectionImpl(y0Var3);
                                }
                            }
                        }
                        arrayList3.add(starProjectionImpl3);
                    }
                    l1VarF = g1.f(j0Var, arrayList3, null, 2, null);
                }
            }
            d0 d0VarN = substitutor.n(k1.b(l1VarF, l1VarR0), Variance.OUT_VARIANCE);
            kotlin.jvm.internal.f0.o(d0VarN, "substitutor.safeSubstitu…s, Variance.OUT_VARIANCE)");
            return d0VarN;
        }
    }

    /* JADX INFO: compiled from: TypeParameterUpperBoundEraser.kt */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private final kotlin.reflect.jvm.internal.impl.descriptors.y0 f128035a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @dl.d
        private final w f128036b;

        public b(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.y0 typeParameter, @dl.d w typeAttr) {
            kotlin.jvm.internal.f0.p(typeParameter, "typeParameter");
            kotlin.jvm.internal.f0.p(typeAttr, "typeAttr");
            this.f128035a = typeParameter;
            this.f128036b = typeAttr;
        }

        @dl.d
        public final w a() {
            return this.f128036b;
        }

        @dl.d
        public final kotlin.reflect.jvm.internal.impl.descriptors.y0 b() {
            return this.f128035a;
        }

        public boolean equals(@dl.e Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.f0.g(bVar.f128035a, this.f128035a) && kotlin.jvm.internal.f0.g(bVar.f128036b, this.f128036b);
        }

        public int hashCode() {
            int iHashCode = this.f128035a.hashCode();
            return iHashCode + (iHashCode * 31) + this.f128036b.hashCode();
        }

        @dl.d
        public String toString() {
            return "DataToEraseUpperBound(typeParameter=" + this.f128035a + ", typeAttr=" + this.f128036b + ')';
        }
    }

    public TypeParameterUpperBoundEraser(@dl.d v projectionComputer, @dl.d b1 options) {
        kotlin.jvm.internal.f0.p(projectionComputer, "projectionComputer");
        kotlin.jvm.internal.f0.p(options, "options");
        this.f128030a = projectionComputer;
        this.f128031b = options;
        LockBasedStorageManager lockBasedStorageManager = new LockBasedStorageManager("Type parameter upper bound erasure results");
        this.f128032c = lockBasedStorageManager;
        this.f128033d = kotlin.b0.c(new yh.a<kotlin.reflect.jvm.internal.impl.types.error.f>() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$erroneousErasedBound$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final kotlin.reflect.jvm.internal.impl.types.error.f invoke() {
                return kotlin.reflect.jvm.internal.impl.types.error.h.d(ErrorTypeKind.CANNOT_COMPUTE_ERASED_BOUND, this.f128037b.toString());
            }
        });
        kotlin.reflect.jvm.internal.impl.storage.f<b, d0> fVarA = lockBasedStorageManager.a(new yh.l<b, d0>() { // from class: kotlin.reflect.jvm.internal.impl.types.TypeParameterUpperBoundEraser$getErasedUpperBound$1
            {
                super(1);
            }

            @Override // yh.l
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final d0 invoke(TypeParameterUpperBoundEraser.b bVar) {
                return this.f128038b.d(bVar.b(), bVar.a());
            }
        });
        kotlin.jvm.internal.f0.o(fVarA, "storage.createMemoizedFu…ameter, typeAttr) }\n    }");
        this.f128034e = fVarA;
    }

    public /* synthetic */ TypeParameterUpperBoundEraser(v vVar, b1 b1Var, int i10, kotlin.jvm.internal.u uVar) {
        this(vVar, (i10 & 2) != 0 ? new b1(false, false) : b1Var);
    }

    private final d0 b(w wVar) {
        d0 d0VarW;
        j0 j0VarA = wVar.a();
        return (j0VarA == null || (d0VarW = TypeUtilsKt.w(j0VarA)) == null) ? e() : d0VarW;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d0 d(kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var, w wVar) {
        c1 c1VarA;
        Set<kotlin.reflect.jvm.internal.impl.descriptors.y0> setC = wVar.c();
        if (setC != null && setC.contains(y0Var.a())) {
            return b(wVar);
        }
        j0 j0VarV = y0Var.v();
        kotlin.jvm.internal.f0.o(j0VarV, "typeParameter.defaultType");
        Set<kotlin.reflect.jvm.internal.impl.descriptors.y0> setG = TypeUtilsKt.g(j0VarV, setC);
        LinkedHashMap linkedHashMap = new LinkedHashMap(fi.u.u(kotlin.collections.r0.j(kotlin.collections.t.Y(setG, 10)), 16));
        for (kotlin.reflect.jvm.internal.impl.descriptors.y0 y0Var2 : setG) {
            if (setC == null || !setC.contains(y0Var2)) {
                c1VarA = this.f128030a.a(y0Var2, wVar, this, c(y0Var2, wVar.d(y0Var)));
            } else {
                c1VarA = i1.t(y0Var2, wVar);
                kotlin.jvm.internal.f0.o(c1VarA, "makeStarProjection(it, typeAttr)");
            }
            Pair pairA = kotlin.c1.a(y0Var2.r(), c1VarA);
            linkedHashMap.put(pairA.e(), pairA.f());
        }
        TypeSubstitutor typeSubstitutorG = TypeSubstitutor.g(a1.a.e(a1.f128047c, linkedHashMap, false, 2, null));
        kotlin.jvm.internal.f0.o(typeSubstitutorG, "create(TypeConstructorSu…ap(erasedTypeParameters))");
        List<d0> upperBounds = y0Var.getUpperBounds();
        kotlin.jvm.internal.f0.o(upperBounds, "typeParameter.upperBounds");
        Set<d0> setF = f(typeSubstitutorG, upperBounds, wVar);
        if (!(!setF.isEmpty())) {
            return b(wVar);
        }
        if (!this.f128031b.a()) {
            if (setF.size() == 1) {
                return (d0) CollectionsKt___CollectionsKt.a5(setF);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds".toString());
        }
        List listQ5 = CollectionsKt___CollectionsKt.Q5(setF);
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listQ5, 10));
        Iterator it = listQ5.iterator();
        while (it.hasNext()) {
            arrayList.add(((d0) it.next()).R0());
        }
        return kotlin.reflect.jvm.internal.impl.types.checker.d.a(arrayList);
    }

    private final kotlin.reflect.jvm.internal.impl.types.error.f e() {
        return (kotlin.reflect.jvm.internal.impl.types.error.f) this.f128033d.getValue();
    }

    private final Set<d0> f(TypeSubstitutor typeSubstitutor, List<? extends d0> list, w wVar) {
        Set setD = kotlin.collections.c1.d();
        for (d0 d0Var : list) {
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
            if (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
                setD.add(f128029f.a(d0Var, typeSubstitutor, wVar.c(), this.f128031b.b()));
            } else if (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.y0) {
                Set<kotlin.reflect.jvm.internal.impl.descriptors.y0> setC = wVar.c();
                if (setC != null && setC.contains(fVarD)) {
                    setD.add(b(wVar));
                } else {
                    List<d0> upperBounds = ((kotlin.reflect.jvm.internal.impl.descriptors.y0) fVarD).getUpperBounds();
                    kotlin.jvm.internal.f0.o(upperBounds, "declaration.upperBounds");
                    setD.addAll(f(typeSubstitutor, upperBounds, wVar));
                }
            }
            if (!this.f128031b.a()) {
                break;
            }
        }
        return kotlin.collections.c1.a(setD);
    }

    @dl.d
    public final d0 c(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.y0 typeParameter, @dl.d w typeAttr) {
        kotlin.jvm.internal.f0.p(typeParameter, "typeParameter");
        kotlin.jvm.internal.f0.p(typeAttr, "typeAttr");
        d0 d0VarInvoke = this.f128034e.invoke(new b(typeParameter, typeAttr));
        kotlin.jvm.internal.f0.o(d0VarInvoke, "getErasedUpperBound(Data…typeParameter, typeAttr))");
        return d0VarInvoke;
    }
}
