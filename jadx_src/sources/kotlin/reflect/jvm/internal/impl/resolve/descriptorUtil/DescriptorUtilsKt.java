package kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil;

import dl.d;
import dl.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.s;
import kotlin.collections.t;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.builtins.g;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.b1;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.x;
import kotlin.reflect.jvm.internal.impl.descriptors.z0;
import kotlin.reflect.jvm.internal.impl.name.c;
import kotlin.reflect.jvm.internal.impl.name.f;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.n;
import kotlin.reflect.jvm.internal.impl.types.checker.u;
import kotlin.reflect.jvm.internal.impl.types.j0;
import kotlin.sequences.SequencesKt__SequencesKt;
import kotlin.sequences.SequencesKt___SequencesKt;
import kotlin.sequences.m;
import yh.l;

/* JADX INFO: compiled from: DescriptorUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class DescriptorUtilsKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @d
    private static final f f127547a;

    /* JADX INFO: compiled from: DescriptorUtils.kt */
    public static final class a extends kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1184b<CallableMemberDescriptor, CallableMemberDescriptor> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Ref.ObjectRef<CallableMemberDescriptor> f127548a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<CallableMemberDescriptor, Boolean> f127549b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Ref.ObjectRef<CallableMemberDescriptor> objectRef, l<? super CallableMemberDescriptor, Boolean> lVar) {
            this.f127548a = objectRef;
            this.f127549b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1184b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void b(@d CallableMemberDescriptor current) {
            f0.p(current, "current");
            if (this.f127548a.f124891b == null && this.f127549b.invoke(current).booleanValue()) {
                this.f127548a.f124891b = current;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.AbstractC1184b, kotlin.reflect.jvm.internal.impl.utils.b.e
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public boolean a(@d CallableMemberDescriptor current) {
            f0.p(current, "current");
            return this.f127548a.f124891b == null;
        }

        @Override // kotlin.reflect.jvm.internal.impl.utils.b.e
        @e
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public CallableMemberDescriptor result() {
            return this.f127548a.f124891b;
        }
    }

    static {
        f fVarF = f.f("value");
        f0.o(fVarF, "identifier(\"value\")");
        f127547a = fVarF;
    }

    public static final boolean c(@d b1 b1Var) {
        f0.p(b1Var, "<this>");
        Boolean boolE = kotlin.reflect.jvm.internal.impl.utils.b.e(s.k(b1Var), kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.a.f127552a, DescriptorUtilsKt$declaresOrInheritsDefaultValue$2.f127550d);
        f0.o(boolE, "ifAny(\n        listOf(th…eclaresDefaultValue\n    )");
        return boolE.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable d(b1 b1Var) {
        Collection<b1> collectionF = b1Var.f();
        ArrayList arrayList = new ArrayList(t.Y(collectionF, 10));
        Iterator<T> it = collectionF.iterator();
        while (it.hasNext()) {
            arrayList.add(((b1) it.next()).a());
        }
        return arrayList;
    }

    @e
    public static final CallableMemberDescriptor e(@d CallableMemberDescriptor callableMemberDescriptor, boolean z10, @d l<? super CallableMemberDescriptor, Boolean> predicate) {
        f0.p(callableMemberDescriptor, "<this>");
        f0.p(predicate, "predicate");
        return (CallableMemberDescriptor) kotlin.reflect.jvm.internal.impl.utils.b.b(s.k(callableMemberDescriptor), new b(z10), new a(new Ref.ObjectRef(), predicate));
    }

    public static /* synthetic */ CallableMemberDescriptor f(CallableMemberDescriptor callableMemberDescriptor, boolean z10, l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return e(callableMemberDescriptor, z10, lVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable g(boolean z10, CallableMemberDescriptor callableMemberDescriptor) {
        if (z10) {
            callableMemberDescriptor = callableMemberDescriptor != null ? callableMemberDescriptor.a() : null;
        }
        Collection<? extends CallableMemberDescriptor> collectionF = callableMemberDescriptor != null ? callableMemberDescriptor.f() : null;
        return collectionF == null ? CollectionsKt__CollectionsKt.E() : collectionF;
    }

    @e
    public static final c h(@d k kVar) {
        f0.p(kVar, "<this>");
        kotlin.reflect.jvm.internal.impl.name.d dVarM = m(kVar);
        if (!dVarM.f()) {
            dVarM = null;
        }
        if (dVarM != null) {
            return dVarM.l();
        }
        return null;
    }

    @e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.d i(@d kotlin.reflect.jvm.internal.impl.descriptors.annotations.c cVar) {
        f0.p(cVar, "<this>");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = cVar.getType().O0().d();
        if (fVarD instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD;
        }
        return null;
    }

    @d
    public static final g j(@d k kVar) {
        f0.p(kVar, "<this>");
        return p(kVar).t();
    }

    @e
    public static final kotlin.reflect.jvm.internal.impl.name.b k(@e kotlin.reflect.jvm.internal.impl.descriptors.f fVar) {
        k kVarC;
        kotlin.reflect.jvm.internal.impl.name.b bVarK;
        if (fVar == null || (kVarC = fVar.c()) == null) {
            return null;
        }
        if (kVarC instanceof g0) {
            return new kotlin.reflect.jvm.internal.impl.name.b(((g0) kVarC).e(), fVar.getName());
        }
        if (!(kVarC instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) || (bVarK = k((kotlin.reflect.jvm.internal.impl.descriptors.f) kVarC)) == null) {
            return null;
        }
        return bVarK.d(fVar.getName());
    }

    @d
    public static final c l(@d k kVar) {
        f0.p(kVar, "<this>");
        c cVarN = kotlin.reflect.jvm.internal.impl.resolve.d.n(kVar);
        f0.o(cVarN, "getFqNameSafe(this)");
        return cVarN;
    }

    @d
    public static final kotlin.reflect.jvm.internal.impl.name.d m(@d k kVar) {
        f0.p(kVar, "<this>");
        kotlin.reflect.jvm.internal.impl.name.d dVarM = kotlin.reflect.jvm.internal.impl.resolve.d.m(kVar);
        f0.o(dVarM, "getFqName(this)");
        return dVarM;
    }

    @e
    public static final x<j0> n(@e kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        z0<j0> z0VarM0 = dVar != null ? dVar.m0() : null;
        if (z0VarM0 instanceof x) {
            return (x) z0VarM0;
        }
        return null;
    }

    @d
    public static final kotlin.reflect.jvm.internal.impl.types.checker.f o(@d d0 d0Var) {
        f0.p(d0Var, "<this>");
        n nVar = (n) d0Var.a0(kotlin.reflect.jvm.internal.impl.types.checker.g.a());
        u uVar = nVar != null ? (u) nVar.a() : null;
        return uVar instanceof u.a ? ((u.a) uVar).b() : kotlin.reflect.jvm.internal.impl.types.checker.f.a.f128072a;
    }

    @d
    public static final d0 p(@d k kVar) {
        f0.p(kVar, "<this>");
        d0 d0VarG = kotlin.reflect.jvm.internal.impl.resolve.d.g(kVar);
        f0.o(d0VarG, "getContainingModule(this)");
        return d0VarG;
    }

    @d
    public static final m<k> q(@d k kVar) {
        f0.p(kVar, "<this>");
        return SequencesKt___SequencesKt.k0(r(kVar), 1);
    }

    @d
    public static final m<k> r(@d k kVar) {
        f0.p(kVar, "<this>");
        return SequencesKt__SequencesKt.l(kVar, new l<k, k>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.descriptorUtil.DescriptorUtilsKt$parentsWithSelf$1
            @Override // yh.l
            @e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k invoke(@d k it) {
                f0.p(it, "it");
                return it.c();
            }
        });
    }

    @d
    public static final CallableMemberDescriptor s(@d CallableMemberDescriptor callableMemberDescriptor) {
        f0.p(callableMemberDescriptor, "<this>");
        if (!(callableMemberDescriptor instanceof n0)) {
            return callableMemberDescriptor;
        }
        o0 correspondingProperty = ((n0) callableMemberDescriptor).n0();
        f0.o(correspondingProperty, "correspondingProperty");
        return correspondingProperty;
    }

    @e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.d t(@d kotlin.reflect.jvm.internal.impl.descriptors.d dVar) {
        f0.p(dVar, "<this>");
        for (kotlin.reflect.jvm.internal.impl.types.d0 d0Var : dVar.v().O0().l()) {
            if (!g.b0(d0Var)) {
                kotlin.reflect.jvm.internal.impl.descriptors.f fVarD = d0Var.O0().d();
                if (kotlin.reflect.jvm.internal.impl.resolve.d.w(fVarD)) {
                    f0.n(fVarD, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                    return (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarD;
                }
            }
        }
        return null;
    }

    public static final boolean u(@d d0 d0Var) {
        u uVar;
        f0.p(d0Var, "<this>");
        n nVar = (n) d0Var.a0(kotlin.reflect.jvm.internal.impl.types.checker.g.a());
        return (nVar == null || (uVar = (u) nVar.a()) == null || !uVar.a()) ? false : true;
    }

    @e
    public static final kotlin.reflect.jvm.internal.impl.descriptors.d v(@d d0 d0Var, @d c topLevelClassFqName, @d ki.b location) {
        f0.p(d0Var, "<this>");
        f0.p(topLevelClassFqName, "topLevelClassFqName");
        f0.p(location, "location");
        topLevelClassFqName.d();
        c cVarE = topLevelClassFqName.e();
        f0.o(cVarE, "topLevelClassFqName.parent()");
        MemberScope memberScopeU = d0Var.R(cVarE).u();
        f fVarG = topLevelClassFqName.g();
        f0.o(fVarG, "topLevelClassFqName.shortName()");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarH = memberScopeU.h(fVarG, location);
        if (fVarH instanceof kotlin.reflect.jvm.internal.impl.descriptors.d) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.d) fVarH;
        }
        return null;
    }
}
