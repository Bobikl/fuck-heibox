package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.b0;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.v0;
import kotlin.reflect.jvm.internal.impl.resolve.calls.inference.CapturedTypeConstructorKt;
import kotlin.reflect.jvm.internal.impl.types.TypeSubstitutor;
import kotlin.reflect.jvm.internal.impl.types.f1;
import kotlin.z;
import yh.l;

/* JADX INFO: compiled from: SubstitutingScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class SubstitutingScope implements MemberScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final MemberScope f127594b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final z f127595c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final TypeSubstitutor f127596d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.e
    private Map<k, k> f127597e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final z f127598f;

    public SubstitutingScope(@dl.d MemberScope workerScope, @dl.d final TypeSubstitutor givenSubstitutor) {
        f0.p(workerScope, "workerScope");
        f0.p(givenSubstitutor, "givenSubstitutor");
        this.f127594b = workerScope;
        this.f127595c = b0.c(new yh.a<TypeSubstitutor>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$substitutor$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final TypeSubstitutor invoke() {
                return givenSubstitutor.j().c();
            }
        });
        f1 f1VarJ = givenSubstitutor.j();
        f0.o(f1VarJ, "givenSubstitutor.substitution");
        this.f127596d = CapturedTypeConstructorKt.f(f1VarJ, false, 1, null).c();
        this.f127598f = b0.c(new yh.a<Collection<? extends k>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.SubstitutingScope$_allDescriptors$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Collection<k> invoke() {
                SubstitutingScope substitutingScope = this.f127599b;
                return substitutingScope.l(h.a.a(substitutingScope.f127594b, null, null, 3, null));
            }
        });
    }

    private final Collection<k> k() {
        return (Collection) this.f127598f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final <D extends k> Collection<D> l(Collection<? extends D> collection) {
        if (this.f127596d.k() || collection.isEmpty()) {
            return collection;
        }
        LinkedHashSet linkedHashSetG = kotlin.reflect.jvm.internal.impl.utils.a.g(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            linkedHashSetG.add(m((k) it.next()));
        }
        return linkedHashSetG;
    }

    private final <D extends k> D m(D d10) {
        if (this.f127596d.k()) {
            return d10;
        }
        if (this.f127597e == null) {
            this.f127597e = new HashMap();
        }
        Map<k, k> map = this.f127597e;
        f0.m(map);
        k kVarD = map.get(d10);
        if (kVarD == null) {
            if (!(d10 instanceof v0)) {
                throw new IllegalStateException(("Unknown descriptor in scope: " + d10).toString());
            }
            kVarD = ((v0) d10).d(this.f127596d);
            if (kVarD == null) {
                throw new AssertionError("We expect that no conflict should happen while substitution is guaranteed to generate invariant projection, but " + d10 + " substitution fails");
            }
            map.put(d10, kVarD);
        }
        D d11 = (D) kVarD;
        f0.n(d11, "null cannot be cast to non-null type D of org.jetbrains.kotlin.resolve.scopes.SubstitutingScope.substitute");
        return d11;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<? extends s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return l(this.f127594b.a(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return this.f127594b.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Collection<? extends o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return l(this.f127594b.c(name, location));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return this.f127594b.d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    public void e(@dl.d kotlin.reflect.jvm.internal.impl.name.f fVar, @dl.d ki.b bVar) {
        MemberScope.a.a(this, fVar, bVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.e
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return this.f127594b.f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<k> g(@dl.d d kindFilter, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        return k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f h(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        kotlin.reflect.jvm.internal.impl.descriptors.f fVarH = this.f127594b.h(name, location);
        if (fVarH != null) {
            return (kotlin.reflect.jvm.internal.impl.descriptors.f) m(fVarH);
        }
        return null;
    }
}
