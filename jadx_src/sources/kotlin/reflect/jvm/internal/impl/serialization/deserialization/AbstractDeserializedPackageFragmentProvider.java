package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.g0;
import kotlin.reflect.jvm.internal.impl.descriptors.j0;

/* JADX INFO: compiled from: AbstractDeserializedPackageFragmentProvider.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractDeserializedPackageFragmentProvider implements j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.m f127652a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final p f127653b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final d0 f127654c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected h f127655d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.g<kotlin.reflect.jvm.internal.impl.name.c, g0> f127656e;

    public AbstractDeserializedPackageFragmentProvider(@dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d p finder, @dl.d d0 moduleDescriptor) {
        f0.p(storageManager, "storageManager");
        f0.p(finder, "finder");
        f0.p(moduleDescriptor, "moduleDescriptor");
        this.f127652a = storageManager;
        this.f127653b = finder;
        this.f127654c = moduleDescriptor;
        this.f127656e = storageManager.h(new yh.l<kotlin.reflect.jvm.internal.impl.name.c, g0>() { // from class: kotlin.reflect.jvm.internal.impl.serialization.deserialization.AbstractDeserializedPackageFragmentProvider$fragments$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.e
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final g0 invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
                f0.p(fqName, "fqName");
                l lVarD = this.f127657b.d(fqName);
                if (lVarD == null) {
                    return null;
                }
                lVarD.M0(this.f127657b.e());
                return lVarD;
            }
        });
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @dl.d
    @kotlin.k(message = "for usages use #packageFragments(FqName) at final point, for impl use #collectPackageFragments(FqName, MutableCollection<PackageFragmentDescriptor>)")
    public List<g0> a(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        return CollectionsKt__CollectionsKt.M(this.f127656e.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    public void b(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d Collection<g0> packageFragments) {
        f0.p(fqName, "fqName");
        f0.p(packageFragments, "packageFragments");
        kotlin.reflect.jvm.internal.impl.utils.a.a(packageFragments, this.f127656e.invoke(fqName));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.j0
    public boolean c(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        return (this.f127656e.J0(fqName) ? (g0) this.f127656e.invoke(fqName) : d(fqName)) == null;
    }

    @dl.e
    protected abstract l d(@dl.d kotlin.reflect.jvm.internal.impl.name.c cVar);

    @dl.d
    protected final h e() {
        h hVar = this.f127655d;
        if (hVar != null) {
            return hVar;
        }
        f0.S("components");
        return null;
    }

    @dl.d
    protected final p f() {
        return this.f127653b;
    }

    @dl.d
    protected final d0 g() {
        return this.f127654c;
    }

    @dl.d
    protected final kotlin.reflect.jvm.internal.impl.storage.m h() {
        return this.f127652a;
    }

    protected final void i(@dl.d h hVar) {
        f0.p(hVar, "<set-?>");
        this.f127655d = hVar;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.h0
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> p(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(fqName, "fqName");
        f0.p(nameFilter, "nameFilter");
        return d1.k();
    }
}
