package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Arrays;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.c1;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import yh.l;

/* JADX INFO: compiled from: ErrorScope.kt */
/* JADX INFO: loaded from: classes5.dex */
public class e implements MemberScope {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final ErrorScopeKind f128111b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final String f128112c;

    public e(@dl.d ErrorScopeKind kind, @dl.d String... formatParams) {
        f0.p(kind, "kind");
        f0.p(formatParams, "formatParams");
        this.f128111b = kind;
        String debugMessage = kind.getDebugMessage();
        Object[] objArrCopyOf = Arrays.copyOf(formatParams, formatParams.length);
        String str = String.format(debugMessage, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        f0.o(str, "format(this, *args)");
        this.f128112c = str;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> b() {
        return d1.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> d() {
        return d1.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    public void e(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Set<kotlin.reflect.jvm.internal.impl.name.f> f() {
        return d1.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public Collection<k> g(@dl.d kotlin.reflect.jvm.internal.impl.resolve.scopes.d kindFilter, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.f h(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        String str = String.format(ErrorEntity.ERROR_CLASS.getDebugText(), Arrays.copyOf(new Object[]{name}, 1));
        f0.o(str, "format(this, *args)");
        kotlin.reflect.jvm.internal.impl.name.f fVarI = kotlin.reflect.jvm.internal.impl.name.f.i(str);
        f0.o(fVarI, "special(ErrorEntity.ERRO…S.debugText.format(name))");
        return new a(fVarI);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Set<s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return c1.f(new b(h.f128123a.h()));
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public Set<o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return h.f128123a.j();
    }

    @dl.d
    protected final String k() {
        return this.f128112c;
    }

    @dl.d
    public String toString() {
        return "ErrorScope{" + this.f128112c + '}';
    }
}
