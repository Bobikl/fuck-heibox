package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.n0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.LazyScopeAdapter;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;

/* JADX INFO: compiled from: LazyPackageViewDescriptorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public class LazyPackageViewDescriptorImpl extends i implements k0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final /* synthetic */ kotlin.reflect.n<Object>[] f125635i = {n0.u(new PropertyReference1Impl(n0.d(LazyPackageViewDescriptorImpl.class), "fragments", "getFragments()Ljava/util/List;")), n0.u(new PropertyReference1Impl(n0.d(LazyPackageViewDescriptorImpl.class), "empty", "getEmpty()Z"))};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final ModuleDescriptorImpl f125636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.c f125637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h f125638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.h f125639g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final MemberScope f125640h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LazyPackageViewDescriptorImpl(@dl.d ModuleDescriptorImpl module, @dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), fqName.h());
        kotlin.jvm.internal.f0.p(module, "module");
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        kotlin.jvm.internal.f0.p(storageManager, "storageManager");
        this.f125636d = module;
        this.f125637e = fqName;
        this.f125638f = storageManager.c(new yh.a<List<? extends kotlin.reflect.jvm.internal.impl.descriptors.g0>>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$fragments$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            public final List<? extends kotlin.reflect.jvm.internal.impl.descriptors.g0> invoke() {
                return kotlin.reflect.jvm.internal.impl.descriptors.i0.c(this.f125642b.I0().R0(), this.f125642b.e());
            }
        });
        this.f125639g = storageManager.c(new yh.a<Boolean>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$empty$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(kotlin.reflect.jvm.internal.impl.descriptors.i0.b(this.f125641b.I0().R0(), this.f125641b.e()));
            }
        });
        this.f125640h = new LazyScopeAdapter(storageManager, new yh.a<MemberScope>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.LazyPackageViewDescriptorImpl$memberScope$1
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final MemberScope invoke() {
                if (this.f125643b.isEmpty()) {
                    return MemberScope.b.f127587b;
                }
                List<kotlin.reflect.jvm.internal.impl.descriptors.g0> listQ = this.f125643b.Q();
                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listQ, 10));
                Iterator<T> it = listQ.iterator();
                while (it.hasNext()) {
                    arrayList.add(((kotlin.reflect.jvm.internal.impl.descriptors.g0) it.next()).u());
                }
                List listZ4 = CollectionsKt___CollectionsKt.z4(arrayList, new e0(this.f125643b.I0(), this.f125643b.e()));
                return kotlin.reflect.jvm.internal.impl.resolve.scopes.b.f127607d.a("package view scope for " + this.f125643b.e() + " in " + this.f125643b.I0().getName(), listZ4);
            }
        });
    }

    protected final boolean K0() {
        return ((Boolean) kotlin.reflect.jvm.internal.impl.storage.l.a(this.f125639g, this, f125635i[1])).booleanValue();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
    @dl.d
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public ModuleDescriptorImpl I0() {
        return this.f125636d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.g0> Q() {
        return (List) kotlin.reflect.jvm.internal.impl.storage.l.a(this.f125638f, this, f125635i[0]);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> visitor, D d10) {
        kotlin.jvm.internal.f0.p(visitor, "visitor");
        return visitor.b(this, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.c e() {
        return this.f125637e;
    }

    public boolean equals(@dl.e Object obj) {
        k0 k0Var = obj instanceof k0 ? (k0) obj : null;
        return k0Var != null && kotlin.jvm.internal.f0.g(e(), k0Var.e()) && kotlin.jvm.internal.f0.g(I0(), k0Var.I0());
    }

    public int hashCode() {
        return (I0().hashCode() * 31) + e().hashCode();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
    public boolean isEmpty() {
        return K0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k0
    @dl.d
    public MemberScope u() {
        return this.f125640h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.e
    /* JADX INFO: renamed from: v0, reason: merged with bridge method [inline-methods] */
    public k0 c() {
        if (e().d()) {
            return null;
        }
        ModuleDescriptorImpl moduleDescriptorImplI0 = I0();
        kotlin.reflect.jvm.internal.impl.name.c cVarE = e().e();
        kotlin.jvm.internal.f0.o(cVarE, "fqName.parent()");
        return moduleDescriptorImplI0.R(cVarE);
    }
}
