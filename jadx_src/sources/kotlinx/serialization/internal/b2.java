package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b2 implements kotlinx.serialization.descriptors.f, n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130672a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final String f130673b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final Set<String> f130674c;

    public b2(@dl.d kotlinx.serialization.descriptors.f original) {
        kotlin.jvm.internal.f0.p(original, "original");
        this.f130672a = original;
        this.f130673b = original.j() + '?';
        this.f130674c = q1.a(original);
    }

    @Override // kotlinx.serialization.internal.n
    @dl.d
    public Set<String> a() {
        return this.f130674c;
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public kotlinx.serialization.descriptors.h b() {
        return this.f130672a.b();
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean c() {
        return true;
    }

    @Override // kotlinx.serialization.descriptors.f
    @kotlinx.serialization.d
    public int d(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        return this.f130672a.d(name);
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    @kotlinx.serialization.d
    public kotlinx.serialization.descriptors.f e(int i10) {
        return this.f130672a.e(i10);
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b2) && kotlin.jvm.internal.f0.g(this.f130672a, ((b2) obj).f130672a);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int f() {
        return this.f130672a.f();
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean g() {
        return this.f130672a.g();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public List<Annotation> getAnnotations() {
        return this.f130672a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    @kotlinx.serialization.d
    public String h(int i10) {
        return this.f130672a.h(i10);
    }

    public int hashCode() {
        return this.f130672a.hashCode() * 31;
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    @kotlinx.serialization.d
    public List<Annotation> i(int i10) {
        return this.f130672a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public String j() {
        return this.f130673b;
    }

    @Override // kotlinx.serialization.descriptors.f
    @kotlinx.serialization.d
    public boolean k(int i10) {
        return this.f130672a.k(i10);
    }

    @dl.d
    public final kotlinx.serialization.descriptors.f l() {
        return this.f130672a;
    }

    @dl.d
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f130672a);
        sb2.append('?');
        return sb2.toString();
    }
}
