package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/ListLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
@kotlinx.serialization.d
public abstract class z0 implements kotlinx.serialization.descriptors.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130792a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f130793b;

    private z0(kotlinx.serialization.descriptors.f fVar) {
        this.f130792a = fVar;
        this.f130793b = 1;
    }

    public /* synthetic */ z0(kotlinx.serialization.descriptors.f fVar, kotlin.jvm.internal.u uVar) {
        this(fVar);
    }

    @dl.d
    public final kotlinx.serialization.descriptors.f a() {
        return this.f130792a;
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public kotlinx.serialization.descriptors.h b() {
        return kotlinx.serialization.descriptors.i.b.f130592a;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean c() {
        return kotlinx.serialization.descriptors.f.a.g(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int d(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        Integer numY0 = kotlin.text.t.Y0(name);
        if (numY0 != null) {
            return numY0.intValue();
        }
        throw new IllegalArgumentException(name + " is not a valid list index");
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public kotlinx.serialization.descriptors.f e(int i10) {
        if (i10 >= 0) {
            return this.f130792a;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + j() + " expects only non-negative indices").toString());
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return kotlin.jvm.internal.f0.g(this.f130792a, z0Var.f130792a) && kotlin.jvm.internal.f0.g(j(), z0Var.j());
    }

    @Override // kotlinx.serialization.descriptors.f
    public int f() {
        return this.f130793b;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean g() {
        return kotlinx.serialization.descriptors.f.a.f(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public List<Annotation> getAnnotations() {
        return kotlinx.serialization.descriptors.f.a.a(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public String h(int i10) {
        return String.valueOf(i10);
    }

    public int hashCode() {
        return (this.f130792a.hashCode() * 31) + j().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public List<Annotation> i(int i10) {
        if (i10 >= 0) {
            return CollectionsKt__CollectionsKt.E();
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + j() + " expects only non-negative indices").toString());
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean k(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + j() + " expects only non-negative indices").toString());
    }

    @dl.d
    public String toString() {
        return j() + '(' + this.f130792a + ')';
    }
}
