package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ReflectJavaPackage.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class u extends n implements mi.u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlin.reflect.jvm.internal.impl.name.c f125930a;

    public u(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        this.f125930a = fqName;
    }

    @Override // mi.d
    public boolean A() {
        return false;
    }

    @Override // mi.u
    @dl.d
    public Collection<mi.g> G(@dl.d yh.l<? super kotlin.reflect.jvm.internal.impl.name.f, Boolean> nameFilter) {
        f0.p(nameFilter, "nameFilter");
        return CollectionsKt__CollectionsKt.E();
    }

    @Override // mi.u
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.c e() {
        return this.f125930a;
    }

    public boolean equals(@dl.e Object obj) {
        return (obj instanceof u) && f0.g(e(), ((u) obj).e());
    }

    @Override // mi.d
    @dl.d
    public List<mi.a> getAnnotations() {
        return CollectionsKt__CollectionsKt.E();
    }

    public int hashCode() {
        return e().hashCode();
    }

    @Override // mi.d
    @dl.e
    public mi.a k(@dl.d kotlin.reflect.jvm.internal.impl.name.c fqName) {
        f0.p(fqName, "fqName");
        return null;
    }

    @dl.d
    public String toString() {
        return u.class.getName() + ": " + e();
    }

    @Override // mi.u
    @dl.d
    public Collection<mi.u> v() {
        return CollectionsKt__CollectionsKt.E();
    }
}
