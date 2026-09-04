package kotlin.reflect.jvm.internal.impl.descriptors.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.d1;
import kotlin.collections.s0;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;

/* JADX INFO: compiled from: ModuleDescriptorImpl.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class ModuleDescriptorImpl extends i implements kotlin.reflect.jvm.internal.impl.descriptors.d0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.m f125644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.builtins.g f125645e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private final oi.c f125646f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private final kotlin.reflect.jvm.internal.impl.name.f f125647g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    private final Map<kotlin.reflect.jvm.internal.impl.descriptors.c0<?>, Object> f125648h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @dl.d
    private final x f125649i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.e
    private t f125650j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private kotlin.reflect.jvm.internal.impl.descriptors.h0 f125651k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f125652l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.storage.f<kotlin.reflect.jvm.internal.impl.name.c, k0> f125653m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @dl.d
    private final kotlin.z f125654n;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @xh.i
    public ModuleDescriptorImpl(@dl.d kotlin.reflect.jvm.internal.impl.name.f moduleName, @dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d kotlin.reflect.jvm.internal.impl.builtins.g builtIns, @dl.e oi.c cVar) {
        this(moduleName, storageManager, builtIns, cVar, null, null, 48, null);
        kotlin.jvm.internal.f0.p(moduleName, "moduleName");
        kotlin.jvm.internal.f0.p(storageManager, "storageManager");
        kotlin.jvm.internal.f0.p(builtIns, "builtIns");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @xh.i
    public ModuleDescriptorImpl(@dl.d kotlin.reflect.jvm.internal.impl.name.f moduleName, @dl.d kotlin.reflect.jvm.internal.impl.storage.m storageManager, @dl.d kotlin.reflect.jvm.internal.impl.builtins.g builtIns, @dl.e oi.c cVar, @dl.d Map<kotlin.reflect.jvm.internal.impl.descriptors.c0<?>, ? extends Object> capabilities, @dl.e kotlin.reflect.jvm.internal.impl.name.f fVar) {
        super(kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b(), moduleName);
        kotlin.jvm.internal.f0.p(moduleName, "moduleName");
        kotlin.jvm.internal.f0.p(storageManager, "storageManager");
        kotlin.jvm.internal.f0.p(builtIns, "builtIns");
        kotlin.jvm.internal.f0.p(capabilities, "capabilities");
        this.f125644d = storageManager;
        this.f125645e = builtIns;
        this.f125646f = cVar;
        this.f125647g = fVar;
        if (!moduleName.g()) {
            throw new IllegalArgumentException("Module name must be special: " + moduleName);
        }
        this.f125648h = capabilities;
        x xVar = (x) a0(x.f125819a.a());
        this.f125649i = xVar == null ? x.b.f125822b : xVar;
        this.f125652l = true;
        this.f125653m = storageManager.a(new yh.l<kotlin.reflect.jvm.internal.impl.name.c, k0>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packages$1
            {
                super(1);
            }

            @Override // yh.l
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final k0 invoke(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
                kotlin.jvm.internal.f0.p(fqName, "fqName");
                x xVar2 = this.f125656b.f125649i;
                ModuleDescriptorImpl moduleDescriptorImpl = this.f125656b;
                return xVar2.a(moduleDescriptorImpl, fqName, moduleDescriptorImpl.f125644d);
            }
        });
        this.f125654n = kotlin.b0.c(new yh.a<h>() { // from class: kotlin.reflect.jvm.internal.impl.descriptors.impl.ModuleDescriptorImpl$packageFragmentProviderForWholeModuleWithDependencies$2
            {
                super(0);
            }

            @Override // yh.a
            @dl.d
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final h invoke() {
                t tVar = this.f125655b.f125650j;
                ModuleDescriptorImpl moduleDescriptorImpl = this.f125655b;
                if (tVar == null) {
                    throw new AssertionError("Dependencies of module " + moduleDescriptorImpl.Q0() + " were not set before querying module content");
                }
                List<ModuleDescriptorImpl> listC = tVar.c();
                this.f125655b.P0();
                listC.contains(this.f125655b);
                Iterator<T> it = listC.iterator();
                while (it.hasNext()) {
                    ((ModuleDescriptorImpl) it.next()).U0();
                }
                ArrayList arrayList = new ArrayList(kotlin.collections.t.Y(listC, 10));
                Iterator<T> it2 = listC.iterator();
                while (it2.hasNext()) {
                    kotlin.reflect.jvm.internal.impl.descriptors.h0 h0Var = ((ModuleDescriptorImpl) it2.next()).f125651k;
                    kotlin.jvm.internal.f0.m(h0Var);
                    arrayList.add(h0Var);
                }
                return new h(arrayList, "CompositeProvider@ModuleDescriptor for " + this.f125655b.getName());
            }
        });
    }

    public /* synthetic */ ModuleDescriptorImpl(kotlin.reflect.jvm.internal.impl.name.f fVar, kotlin.reflect.jvm.internal.impl.storage.m mVar, kotlin.reflect.jvm.internal.impl.builtins.g gVar, oi.c cVar, Map map, kotlin.reflect.jvm.internal.impl.name.f fVar2, int i10, kotlin.jvm.internal.u uVar) {
        this(fVar, mVar, gVar, (i10 & 8) != 0 ? null : cVar, (i10 & 16) != 0 ? s0.z() : map, (i10 & 32) != 0 ? null : fVar2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String Q0() {
        String string = getName().toString();
        kotlin.jvm.internal.f0.o(string, "name.toString()");
        return string;
    }

    private final h S0() {
        return (h) this.f125654n.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean U0() {
        return this.f125651k != null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean F(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d0 targetModule) {
        kotlin.jvm.internal.f0.p(targetModule, "targetModule");
        if (kotlin.jvm.internal.f0.g(this, targetModule)) {
            return true;
        }
        t tVar = this.f125650j;
        kotlin.jvm.internal.f0.m(tVar);
        return CollectionsKt___CollectionsKt.R1(tVar.b(), targetModule) || V().contains(targetModule) || targetModule.V().contains(this);
    }

    public void P0() {
        if (V0()) {
            return;
        }
        kotlin.reflect.jvm.internal.impl.descriptors.y.a(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @dl.d
    public k0 R(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        P0();
        return this.f125653m.invoke(fqName);
    }

    @dl.d
    public final kotlin.reflect.jvm.internal.impl.descriptors.h0 R0() {
        P0();
        return S0();
    }

    public final void T0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.h0 providerForModuleContent) {
        kotlin.jvm.internal.f0.p(providerForModuleContent, "providerForModuleContent");
        U0();
        this.f125651k = providerForModuleContent;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.descriptors.d0> V() {
        t tVar = this.f125650j;
        if (tVar != null) {
            return tVar.a();
        }
        throw new AssertionError("Dependencies of module " + Q0() + " were not set");
    }

    public boolean V0() {
        return this.f125652l;
    }

    public final void W0(@dl.d List<ModuleDescriptorImpl> descriptors) {
        kotlin.jvm.internal.f0.p(descriptors, "descriptors");
        X0(descriptors, d1.k());
    }

    public final void X0(@dl.d List<ModuleDescriptorImpl> descriptors, @dl.d Set<ModuleDescriptorImpl> friends) {
        kotlin.jvm.internal.f0.p(descriptors, "descriptors");
        kotlin.jvm.internal.f0.p(friends, "friends");
        Y0(new u(descriptors, friends, CollectionsKt__CollectionsKt.E(), d1.k()));
    }

    public final void Y0(@dl.d t dependencies) {
        kotlin.jvm.internal.f0.p(dependencies, "dependencies");
        this.f125650j = dependencies;
    }

    public final void Z0(@dl.d ModuleDescriptorImpl... descriptors) {
        kotlin.jvm.internal.f0.p(descriptors, "descriptors");
        W0(ArraysKt___ArraysKt.kz(descriptors));
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @dl.e
    public <T> T a0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.c0<T> capability) {
        kotlin.jvm.internal.f0.p(capability, "capability");
        T t10 = (T) this.f125648h.get(capability);
        if (t10 == null) {
            return null;
        }
        return t10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.e
    public kotlin.reflect.jvm.internal.impl.descriptors.k c() {
        return kotlin.reflect.jvm.internal.impl.descriptors.d0.a.b(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.e
    public <R, D> R c0(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.m<R, D> mVar, D d10) {
        return (R) kotlin.reflect.jvm.internal.impl.descriptors.d0.a.a(this, mVar, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> p(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        kotlin.jvm.internal.f0.p(fqName, "fqName");
        kotlin.jvm.internal.f0.p(nameFilter, "nameFilter");
        P0();
        return R0().p(fqName, nameFilter);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.builtins.g t() {
        return this.f125645e;
    }
}
