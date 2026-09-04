package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntegerLiteralTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor;
import kotlin.reflect.jvm.internal.impl.types.b0;
import kotlin.reflect.jvm.internal.impl.types.d0;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.reflect.jvm.internal.impl.types.l1;
import kotlin.reflect.jvm.internal.impl.types.n0;
import kotlin.reflect.jvm.internal.impl.types.q0;
import kotlin.reflect.jvm.internal.impl.types.w0;

/* JADX INFO: compiled from: IntersectionType.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TypeIntersector {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final TypeIntersector f128067a = new TypeIntersector();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: IntersectionType.kt */
    public static abstract class ResultNullability {
        public static final ResultNullability START = new START("START", 0);
        public static final ResultNullability ACCEPT_NULL = new ACCEPT_NULL("ACCEPT_NULL", 1);
        public static final ResultNullability UNKNOWN = new UNKNOWN("UNKNOWN", 2);
        public static final ResultNullability NOT_NULL = new NOT_NULL("NOT_NULL", 3);
        private static final /* synthetic */ ResultNullability[] $VALUES = $values();

        /* JADX INFO: compiled from: IntersectionType.kt */
        public static final class ACCEPT_NULL extends ResultNullability {
            ACCEPT_NULL(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            @dl.d
            public ResultNullability combine(@dl.d l1 nextType) {
                f0.p(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        /* JADX INFO: compiled from: IntersectionType.kt */
        public static final class NOT_NULL extends ResultNullability {
            NOT_NULL(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public NOT_NULL combine(@dl.d l1 nextType) {
                f0.p(nextType, "nextType");
                return this;
            }
        }

        /* JADX INFO: compiled from: IntersectionType.kt */
        public static final class START extends ResultNullability {
            START(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            @dl.d
            public ResultNullability combine(@dl.d l1 nextType) {
                f0.p(nextType, "nextType");
                return getResultNullability(nextType);
            }
        }

        /* JADX INFO: compiled from: IntersectionType.kt */
        public static final class UNKNOWN extends ResultNullability {
            UNKNOWN(String str, int i10) {
                super(str, i10, null);
            }

            @Override // kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector.ResultNullability
            @dl.d
            public ResultNullability combine(@dl.d l1 nextType) {
                f0.p(nextType, "nextType");
                ResultNullability resultNullability = getResultNullability(nextType);
                return resultNullability == ResultNullability.ACCEPT_NULL ? this : resultNullability;
            }
        }

        private static final /* synthetic */ ResultNullability[] $values() {
            return new ResultNullability[]{START, ACCEPT_NULL, UNKNOWN, NOT_NULL};
        }

        private ResultNullability(String str, int i10) {
            super(str, i10);
        }

        public /* synthetic */ ResultNullability(String str, int i10, kotlin.jvm.internal.u uVar) {
            this(str, i10);
        }

        public static ResultNullability valueOf(String str) {
            return (ResultNullability) Enum.valueOf(ResultNullability.class, str);
        }

        public static ResultNullability[] values() {
            return (ResultNullability[]) $VALUES.clone();
        }

        @dl.d
        public abstract ResultNullability combine(@dl.d l1 l1Var);

        @dl.d
        protected final ResultNullability getResultNullability(@dl.d l1 l1Var) {
            f0.p(l1Var, "<this>");
            if (l1Var.P0()) {
                return ACCEPT_NULL;
            }
            if ((l1Var instanceof kotlin.reflect.jvm.internal.impl.types.n) && (((kotlin.reflect.jvm.internal.impl.types.n) l1Var).a1() instanceof q0)) {
                return NOT_NULL;
            }
            if (!(l1Var instanceof q0) && m.f128086a.a(l1Var)) {
                return NOT_NULL;
            }
            return UNKNOWN;
        }
    }

    private TypeIntersector() {
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e  */
    private final Collection<j0> b(Collection<? extends j0> collection, yh.p<? super j0, ? super j0, Boolean> pVar) {
        boolean z10;
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        f0.o(it, "filteredTypes.iterator()");
        while (it.hasNext()) {
            j0 upper = (j0) it.next();
            boolean z11 = true;
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                do {
                    if (!it2.hasNext()) {
                        z11 = false;
                        break;
                    }
                    j0 lower = (j0) it2.next();
                    if (lower != upper) {
                        f0.o(lower, "lower");
                        f0.o(upper, "upper");
                        if (pVar.invoke(lower, upper).booleanValue()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                    } else {
                        z10 = false;
                    }
                } while (!z10);
            } else {
                z11 = false;
                break;
            }
            if (z11) {
                it.remove();
            }
        }
        return arrayList;
    }

    private final j0 d(final Set<? extends j0> set) {
        if (set.size() == 1) {
            return (j0) CollectionsKt___CollectionsKt.a5(set);
        }
        new yh.a<String>() { // from class: kotlin.reflect.jvm.internal.impl.types.checker.TypeIntersector$intersectTypesWithoutIntersectionType$errorMessage$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final String invoke() {
                return "This collections cannot be empty! input types: " + CollectionsKt___CollectionsKt.h3(set, null, null, null, 0, null, null, 63, null);
            }
        };
        Collection<j0> collectionB = b(set, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredEqualTypes$1(this));
        collectionB.isEmpty();
        j0 j0VarB = IntegerLiteralTypeConstructor.f127521f.b(collectionB);
        if (j0VarB != null) {
            return j0VarB;
        }
        Collection<j0> collectionB2 = b(collectionB, new TypeIntersector$intersectTypesWithoutIntersectionType$filteredSuperAndEqualTypes$1(j.f128080b.a()));
        collectionB2.isEmpty();
        return collectionB2.size() < 2 ? (j0) CollectionsKt___CollectionsKt.a5(collectionB2) : new IntersectionTypeConstructor(set).g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e(d0 d0Var, d0 d0Var2) {
        k kVarA = j.f128080b.a();
        return kVarA.d(d0Var, d0Var2) && !kVarA.d(d0Var2, d0Var);
    }

    @dl.d
    public final j0 c(@dl.d List<? extends j0> types) {
        f0.p(types, "types");
        types.size();
        ArrayList<j0> arrayList = new ArrayList();
        for (j0 j0Var : types) {
            if (j0Var.O0() instanceof IntersectionTypeConstructor) {
                Collection<d0> collectionL = j0Var.O0().l();
                f0.o(collectionL, "type.constructor.supertypes");
                ArrayList arrayList2 = new ArrayList(kotlin.collections.t.Y(collectionL, 10));
                for (d0 it : collectionL) {
                    f0.o(it, "it");
                    j0 j0VarD = b0.d(it);
                    if (j0Var.P0()) {
                        j0VarD = j0VarD.V0(true);
                    }
                    arrayList2.add(j0VarD);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(j0Var);
            }
        }
        ResultNullability resultNullabilityCombine = ResultNullability.START;
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            resultNullabilityCombine = resultNullabilityCombine.combine((l1) it2.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (j0 j0VarI : arrayList) {
            if (resultNullabilityCombine == ResultNullability.NOT_NULL) {
                if (j0VarI instanceof h) {
                    j0VarI = n0.k((h) j0VarI);
                }
                j0VarI = n0.i(j0VarI, false, 1, null);
            }
            linkedHashSet.add(j0VarI);
        }
        ArrayList arrayList3 = new ArrayList(kotlin.collections.t.Y(types, 10));
        Iterator<T> it3 = types.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((j0) it3.next()).N0());
        }
        Iterator it4 = arrayList3.iterator();
        if (!it4.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it4.next();
        while (it4.hasNext()) {
            next = ((w0) next).j((w0) it4.next());
        }
        return d(linkedHashSet).U0((w0) next);
    }
}
