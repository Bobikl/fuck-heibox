package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.x;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import yh.l;

/* JADX INFO: compiled from: ChainedMemberScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements MemberScope {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    public static final a f127607d = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f127608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final MemberScope[] f127609c;

    /* JADX INFO: compiled from: ChainedMemberScope.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @dl.d
        public final MemberScope a(@dl.d String debugName, @dl.d Iterable<? extends MemberScope> scopes) {
            f0.p(debugName, "debugName");
            f0.p(scopes, "scopes");
            kotlin.reflect.jvm.internal.impl.utils.d dVar = new kotlin.reflect.jvm.internal.impl.utils.d();
            for (MemberScope memberScope : scopes) {
                if (memberScope != MemberScope.b.f127587b) {
                    if (memberScope instanceof b) {
                        x.p0(dVar, ((b) memberScope).f127609c);
                    } else {
                        dVar.add(memberScope);
                    }
                }
            }
            return b(debugName, dVar);
        }

        @dl.d
        public final MemberScope b(@dl.d String debugName, @dl.d List<? extends MemberScope> scopes) {
            f0.p(debugName, "debugName");
            f0.p(scopes, "scopes");
            int size = scopes.size();
            if (size != 0) {
                return size != 1 ? new b(debugName, (MemberScope[]) scopes.toArray(new MemberScope[0]), null) : scopes.get(0);
            }
            return MemberScope.b.f127587b;
        }
    }

    private b(String str, MemberScope[] memberScopeArr) {
        this.f127608b = str;
        this.f127609c = memberScopeArr;
    }

    public /* synthetic */ b(String str, MemberScope[] memberScopeArr, u uVar) {
        this(str, memberScopeArr);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        MemberScope[] memberScopeArr = this.f127609c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (length == 1) {
            return memberScopeArr[0].a(name, location);
        }
        Collection<s0> collectionA = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionA = ui.a.a(collectionA, memberScope.a(name, location));
        }
        return collectionA == null ? d1.k() : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        MemberScope[] memberScopeArr = this.f127609c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            x.n0(linkedHashSet, memberScope.b());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Collection<o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        MemberScope[] memberScopeArr = this.f127609c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (length == 1) {
            return memberScopeArr[0].c(name, location);
        }
        Collection<o0> collectionA = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionA = ui.a.a(collectionA, memberScope.c(name, location));
        }
        return collectionA == null ? d1.k() : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        MemberScope[] memberScopeArr = this.f127609c;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (MemberScope memberScope : memberScopeArr) {
            x.n0(linkedHashSet, memberScope.d());
        }
        return linkedHashSet;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    public void e(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        for (MemberScope memberScope : this.f127609c) {
            memberScope.e(name, location);
        }
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.e
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return g.a(ArraysKt___ArraysKt.c6(this.f127609c));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<k> g(@dl.d d kindFilter, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        MemberScope[] memberScopeArr = this.f127609c;
        int length = memberScopeArr.length;
        if (length == 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        if (length == 1) {
            return memberScopeArr[0].g(kindFilter, nameFilter);
        }
        Collection<k> collectionA = null;
        for (MemberScope memberScope : memberScopeArr) {
            collectionA = ui.a.a(collectionA, memberScope.g(kindFilter, nameFilter));
        }
        return collectionA == null ? d1.k() : collectionA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f h(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVar = null;
        for (MemberScope memberScope : this.f127609c) {
            kotlin.reflect.jvm.internal.impl.descriptors.f fVarH = memberScope.h(name, location);
            if (fVarH != null) {
                if (!(fVarH instanceof kotlin.reflect.jvm.internal.impl.descriptors.g) || !((kotlin.reflect.jvm.internal.impl.descriptors.g) fVarH).w0()) {
                    return fVarH;
                }
                if (fVar == null) {
                    fVar = fVarH;
                }
            }
        }
        return fVar;
    }

    @dl.d
    public String toString() {
        return this.f127608b;
    }
}
