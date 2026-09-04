package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import yh.l;

/* JADX INFO: compiled from: AbstractScopeAdapter.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a implements MemberScope {
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return j().a(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return j().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Collection<o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return j().c(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return j().d();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    public void e(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        j().e(name, location);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.e
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return j().f();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<k> g(@dl.d d kindFilter, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        return j().g(kindFilter, nameFilter);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.f h(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return j().h(name, location);
    }

    @dl.d
    public final MemberScope i() {
        if (!(j() instanceof a)) {
            return j();
        }
        MemberScope memberScopeJ = j();
        f0.n(memberScopeJ, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.AbstractScopeAdapter");
        return ((a) memberScopeJ).i();
    }

    @dl.d
    protected abstract MemberScope j();
}
