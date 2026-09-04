package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import yh.l;

/* JADX INFO: compiled from: ThrowingScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i extends e {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(@dl.d ErrorScopeKind kind, @dl.d String... formatParams) {
        super(kind, (String[]) Arrays.copyOf(formatParams, formatParams.length));
        f0.p(kind, "kind");
        f0.p(formatParams, "formatParams");
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<k> g(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        throw new IllegalStateException(k());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.f h(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        throw new IllegalStateException(k() + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    /* JADX INFO: renamed from: i */
    public Set<s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        throw new IllegalStateException(k() + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    /* JADX INFO: renamed from: j */
    public Set<o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        throw new IllegalStateException(k() + ", required name: " + name);
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Void e(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        throw new IllegalStateException();
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.error.e
    @dl.d
    public String toString() {
        return "ThrowingScope{" + k() + '}';
    }
}
