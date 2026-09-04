package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.text.y;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final f f130569a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public final kotlin.reflect.d<?> f130570b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final String f130571c;

    public c(@dl.d f original, @dl.d kotlin.reflect.d<?> kClass) {
        f0.p(original, "original");
        f0.p(kClass, "kClass");
        this.f130569a = original;
        this.f130570b = kClass;
        this.f130571c = original.j() + y.f128596e + kClass.F() + y.f128597f;
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public h b() {
        return this.f130569a.b();
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean c() {
        return this.f130569a.c();
    }

    @Override // kotlinx.serialization.descriptors.f
    @kotlinx.serialization.d
    public int d(@dl.d String name) {
        f0.p(name, "name");
        return this.f130569a.d(name);
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    @kotlinx.serialization.d
    public f e(int i10) {
        return this.f130569a.e(i10);
    }

    public boolean equals(@dl.e Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        return cVar != null && f0.g(this.f130569a, cVar.f130569a) && f0.g(cVar.f130570b, this.f130570b);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int f() {
        return this.f130569a.f();
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean g() {
        return this.f130569a.g();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public List<Annotation> getAnnotations() {
        return this.f130569a.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    @kotlinx.serialization.d
    public String h(int i10) {
        return this.f130569a.h(i10);
    }

    public int hashCode() {
        return (this.f130570b.hashCode() * 31) + j().hashCode();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    @kotlinx.serialization.d
    public List<Annotation> i(int i10) {
        return this.f130569a.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public String j() {
        return this.f130571c;
    }

    @Override // kotlinx.serialization.descriptors.f
    @kotlinx.serialization.d
    public boolean k(int i10) {
        return this.f130569a.k(i10);
    }

    @dl.d
    public String toString() {
        return "ContextDescriptor(kClass: " + this.f130570b + ", original: " + this.f130569a + ')';
    }
}
