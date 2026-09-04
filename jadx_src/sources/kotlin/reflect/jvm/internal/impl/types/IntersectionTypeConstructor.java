package kotlin.reflect.jvm.internal.impl.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.TypeIntersectionScope;

/* JADX INFO: compiled from: IntersectionTypeConstructor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class IntersectionTypeConstructor implements z0, si.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private d0 f127986a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final LinkedHashSet<d0> f127987b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f127988c;

    /* JADX INFO: compiled from: Comparisons.kt */
    public static final class a<T> implements Comparator {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ yh.l f127989b;

        public a(yh.l lVar) {
            this.f127989b = lVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t10, T t11) {
            d0 it = (d0) t10;
            yh.l lVar = this.f127989b;
            kotlin.jvm.internal.f0.o(it, "it");
            String string = lVar.invoke(it).toString();
            d0 it2 = (d0) t11;
            yh.l lVar2 = this.f127989b;
            kotlin.jvm.internal.f0.o(it2, "it");
            return kotlin.comparisons.g.l(string, lVar2.invoke(it2).toString());
        }
    }

    public IntersectionTypeConstructor(@dl.d Collection<? extends d0> typesToIntersect) {
        kotlin.jvm.internal.f0.p(typesToIntersect, "typesToIntersect");
        typesToIntersect.isEmpty();
        LinkedHashSet<d0> linkedHashSet = new LinkedHashSet<>(typesToIntersect);
        this.f127987b = linkedHashSet;
        this.f127988c = linkedHashSet.hashCode();
    }

    private IntersectionTypeConstructor(Collection<? extends d0> collection, d0 d0Var) {
        this(collection);
        this.f127986a = d0Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ String j(IntersectionTypeConstructor intersectionTypeConstructor, yh.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = new yh.l<d0, String>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$1
                @Override // yh.l
                @dl.d
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final String invoke(@dl.d d0 it) {
                    kotlin.jvm.internal.f0.p(it, "it");
                    return it.toString();
                }
            };
        }
        return intersectionTypeConstructor.i(lVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f d() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    public boolean e() {
        return false;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof IntersectionTypeConstructor) {
            return kotlin.jvm.internal.f0.g(this.f127987b, ((IntersectionTypeConstructor) obj).f127987b);
        }
        return false;
    }

    @dl.d
    public final MemberScope f() {
        return TypeIntersectionScope.f127601d.a("member scope for intersection type", this.f127987b);
    }

    @dl.d
    public final j0 g() {
        return KotlinTypeFactory.n(w0.f128193c.h(), this, CollectionsKt__CollectionsKt.E(), false, f(), new yh.l<kotlin.reflect.jvm.internal.impl.types.checker.f, j0>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$createType$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final j0 invoke(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
                kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
                return this.f127990b.a(kotlinTypeRefiner).g();
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.y0> getParameters() {
        return CollectionsKt__CollectionsKt.E();
    }

    @dl.e
    public final d0 h() {
        return this.f127986a;
    }

    public int hashCode() {
        return this.f127988c;
    }

    @dl.d
    public final String i(@dl.d final yh.l<? super d0, ? extends Object> getProperTypeRelatedToStringify) {
        kotlin.jvm.internal.f0.p(getProperTypeRelatedToStringify, "getProperTypeRelatedToStringify");
        return CollectionsKt___CollectionsKt.h3(CollectionsKt___CollectionsKt.p5(this.f127987b, new a(getProperTypeRelatedToStringify)), " & ", "{", z5.g.f141884d, 0, null, new yh.l<d0, CharSequence>() { // from class: kotlin.reflect.jvm.internal.impl.types.IntersectionTypeConstructor$makeDebugNameForIntersectionType$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final CharSequence invoke(d0 it) {
                yh.l<d0, Object> lVar = getProperTypeRelatedToStringify;
                kotlin.jvm.internal.f0.o(it, "it");
                return lVar.invoke(it).toString();
            }
        }, 24, null);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public IntersectionTypeConstructor a(@dl.d kotlin.reflect.jvm.internal.impl.types.checker.f kotlinTypeRefiner) {
        kotlin.jvm.internal.f0.p(kotlinTypeRefiner, "kotlinTypeRefiner");
        Collection<d0> collectionL = l();
        ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(collectionL, 10));
        Iterator<T> it = collectionL.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            arrayList.add(((d0) it.next()).Y0(kotlinTypeRefiner));
            z10 = true;
        }
        IntersectionTypeConstructor intersectionTypeConstructorM = null;
        if (z10) {
            d0 d0VarH = h();
            intersectionTypeConstructorM = new IntersectionTypeConstructor(arrayList).m(d0VarH != null ? d0VarH.Y0(kotlinTypeRefiner) : null);
        }
        return intersectionTypeConstructorM == null ? this : intersectionTypeConstructorM;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public Collection<d0> l() {
        return this.f127987b;
    }

    @dl.d
    public final IntersectionTypeConstructor m(@dl.e d0 d0Var) {
        return new IntersectionTypeConstructor(this.f127987b, d0Var);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.z0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.builtins.g t() {
        kotlin.reflect.jvm.internal.impl.builtins.g gVarT = this.f127987b.iterator().next().O0().t();
        kotlin.jvm.internal.f0.o(gVarT, "intersectedTypes.iterato…xt().constructor.builtIns");
        return gVarT;
    }

    @dl.d
    public String toString() {
        return j(this, null, 1, null);
    }
}
