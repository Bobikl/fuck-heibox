package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsKt;

/* JADX INFO: compiled from: CollectionDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.jvm.internal.t0({"SMAP\nCollectionDescriptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionDescriptors.kt\nkotlinx/serialization/internal/MapLikeDescriptor\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,138:1\n1#2:139\n*E\n"})
public abstract class d1 implements kotlinx.serialization.descriptors.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f130683a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130684b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130685c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f130686d;

    private d1(String str, kotlinx.serialization.descriptors.f fVar, kotlinx.serialization.descriptors.f fVar2) {
        this.f130683a = str;
        this.f130684b = fVar;
        this.f130685c = fVar2;
        this.f130686d = 2;
    }

    public /* synthetic */ d1(String str, kotlinx.serialization.descriptors.f fVar, kotlinx.serialization.descriptors.f fVar2, kotlin.jvm.internal.u uVar) {
        this(str, fVar, fVar2);
    }

    @dl.d
    public final kotlinx.serialization.descriptors.f a() {
        return this.f130684b;
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public kotlinx.serialization.descriptors.h b() {
        return kotlinx.serialization.descriptors.i.c.f130593a;
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
        throw new IllegalArgumentException(name + " is not a valid map index");
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public kotlinx.serialization.descriptors.f e(int i10) {
        if (i10 >= 0) {
            int i11 = i10 % 2;
            if (i11 == 0) {
                return this.f130684b;
            }
            if (i11 == 1) {
                return this.f130685c;
            }
            throw new IllegalStateException("Unreached".toString());
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + j() + " expects only non-negative indices").toString());
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) obj;
        return kotlin.jvm.internal.f0.g(j(), d1Var.j()) && kotlin.jvm.internal.f0.g(this.f130684b, d1Var.f130684b) && kotlin.jvm.internal.f0.g(this.f130685c, d1Var.f130685c);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int f() {
        return this.f130686d;
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
        return (((j().hashCode() * 31) + this.f130684b.hashCode()) * 31) + this.f130685c.hashCode();
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
    @dl.d
    public String j() {
        return this.f130683a;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean k(int i10) {
        if (i10 >= 0) {
            return false;
        }
        throw new IllegalArgumentException(("Illegal index " + i10 + ", " + j() + " expects only non-negative indices").toString());
    }

    @dl.d
    public final kotlinx.serialization.descriptors.f l() {
        return this.f130685c;
    }

    @dl.d
    public String toString() {
        return j() + '(' + this.f130684b + ", " + this.f130685c + ')';
    }
}
