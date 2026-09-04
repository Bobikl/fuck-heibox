package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import kotlin.reflect.jvm.internal.impl.descriptors.ClassKind;
import kotlin.reflect.jvm.internal.impl.descriptors.o0;
import kotlin.reflect.jvm.internal.impl.descriptors.s0;
import kotlin.reflect.jvm.internal.impl.storage.l;
import kotlin.reflect.jvm.internal.impl.storage.m;
import kotlin.reflect.n;

/* JADX INFO: compiled from: StaticScopeForKotlinEnum.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class StaticScopeForKotlinEnum extends f {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f127588e = {n0.u(new PropertyReference1Impl(n0.d(StaticScopeForKotlinEnum.class), "functions", "getFunctions()Ljava/util/List;")), n0.u(new PropertyReference1Impl(n0.d(StaticScopeForKotlinEnum.class), "properties", "getProperties()Ljava/util/List;"))};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.descriptors.d f127589b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h f127590c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h f127591d;

    public StaticScopeForKotlinEnum(@dl.d m storageManager, @dl.d kotlin.reflect.jvm.internal.impl.descriptors.d containingClass) {
        f0.p(storageManager, "storageManager");
        f0.p(containingClass, "containingClass");
        this.f127589b = containingClass;
        containingClass.b();
        ClassKind classKind = ClassKind.ENUM_CLASS;
        this.f127590c = storageManager.c(new yh.a<List<? extends s0>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$functions$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends s0> invoke() {
                return CollectionsKt__CollectionsKt.L(kotlin.reflect.jvm.internal.impl.resolve.c.g(this.f127592b.f127589b), kotlin.reflect.jvm.internal.impl.resolve.c.h(this.f127592b.f127589b));
            }
        });
        this.f127591d = storageManager.c(new yh.a<List<? extends o0>>() { // from class: kotlin.reflect.jvm.internal.impl.resolve.scopes.StaticScopeForKotlinEnum$properties$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends o0> invoke() {
                return CollectionsKt__CollectionsKt.M(kotlin.reflect.jvm.internal.impl.resolve.c.f(this.f127593b.f127589b));
            }
        });
    }

    private final List<s0> m() {
        return (List) l.a(this.f127590c, this, f127588e[0]);
    }

    private final List<o0> n() {
        return (List) l.a(this.f127591d, this, f127588e[1]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope
    @dl.d
    public Collection<o0> c(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        List<o0> listN = n();
        kotlin.reflect.jvm.internal.impl.utils.d dVar = new kotlin.reflect.jvm.internal.impl.utils.d();
        for (Object obj : listN) {
            if (f0.g(((o0) obj).getName(), name)) {
                dVar.add(obj);
            }
        }
        return dVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    public /* bridge */ /* synthetic */ kotlin.reflect.jvm.internal.impl.descriptors.f h(kotlin.reflect.jvm.internal.impl.name.f fVar, ki.b bVar) {
        return (kotlin.reflect.jvm.internal.impl.descriptors.f) j(fVar, bVar);
    }

    @dl.e
    public Void j(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public List<CallableMemberDescriptor> g(@dl.d d kindFilter, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(kindFilter, "kindFilter");
        f0.p(nameFilter, "nameFilter");
        return CollectionsKt___CollectionsKt.y4(m(), n());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.reflect.jvm.internal.impl.resolve.scopes.f, kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope, kotlin.reflect.jvm.internal.impl.resolve.scopes.h
    @dl.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public kotlin.reflect.jvm.internal.impl.utils.d<s0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.f name, @dl.d ki.b location) {
        f0.p(name, "name");
        f0.p(location, "location");
        List<s0> listM = m();
        kotlin.reflect.jvm.internal.impl.utils.d<s0> dVar = new kotlin.reflect.jvm.internal.impl.utils.d<>();
        for (Object obj : listM) {
            if (f0.g(((s0) obj).getName(), name)) {
                dVar.add(obj);
            }
        }
        return dVar;
    }
}
