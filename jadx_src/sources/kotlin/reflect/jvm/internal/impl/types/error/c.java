package kotlin.reflect.jvm.internal.impl.types.error;

import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.d1;
import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.descriptors.c0;
import kotlin.reflect.jvm.internal.impl.descriptors.d0;
import kotlin.reflect.jvm.internal.impl.descriptors.k;
import kotlin.reflect.jvm.internal.impl.descriptors.k0;
import kotlin.reflect.jvm.internal.impl.descriptors.m;
import yh.l;

/* JADX INFO: compiled from: ErrorModuleDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final c f128104b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.name.f f128105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final List<d0> f128106d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final List<d0> f128107e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final Set<d0> f128108f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private static final kotlin.reflect.jvm.internal.impl.builtins.g f128109g;

    static {
        kotlin.reflect.jvm.internal.impl.name.f fVarI = kotlin.reflect.jvm.internal.impl.name.f.i(ErrorEntity.ERROR_MODULE.getDebugText());
        f0.o(fVarI, "special(ErrorEntity.ERROR_MODULE.debugText)");
        f128105c = fVarI;
        f128106d = CollectionsKt__CollectionsKt.E();
        f128107e = CollectionsKt__CollectionsKt.E();
        f128108f = d1.k();
        f128109g = kotlin.reflect.jvm.internal.impl.builtins.d.f125357i.a();
    }

    private c() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    public boolean F(@dl.d d0 targetModule) {
        f0.p(targetModule, "targetModule");
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @dl.d
    public k0 R(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @dl.d
    public List<d0> V() {
        return f128107e;
    }

    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.f Z() {
        return f128105c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public k a() {
        return this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @dl.e
    public <T> T a0(@dl.d c0<T> capability) {
        f0.p(capability, "capability");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.e
    public k c() {
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.e
    public <R, D> R c0(@dl.d m<R, D> visitor, D d10) {
        f0.p(visitor, "visitor");
        return null;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e getAnnotations() {
        return kotlin.reflect.jvm.internal.impl.descriptors.annotations.e.f125601z1.b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        return Z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @dl.d
    public Collection<kotlin.reflect.jvm.internal.impl.name.c> p(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName, @dl.d l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(fqName, "fqName");
        f0.p(nameFilter, "nameFilter");
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.d0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.builtins.g t() {
        return f128109g;
    }
}
