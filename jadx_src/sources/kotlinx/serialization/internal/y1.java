package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class y1 implements kotlinx.serialization.descriptors.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f130787a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.e f130788b;

    public y1(@dl.d String serialName, @dl.d kotlinx.serialization.descriptors.e kind) {
        kotlin.jvm.internal.f0.p(serialName, "serialName");
        kotlin.jvm.internal.f0.p(kind, "kind");
        this.f130787a = serialName;
        this.f130788b = kind;
    }

    private final Void a() {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean c() {
        return kotlinx.serialization.descriptors.f.a.g(this);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int d(@dl.d String name) {
        kotlin.jvm.internal.f0.p(name, "name");
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public kotlinx.serialization.descriptors.f e(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1)) {
            return false;
        }
        y1 y1Var = (y1) obj;
        return kotlin.jvm.internal.f0.g(j(), y1Var.j()) && kotlin.jvm.internal.f0.g(b(), y1Var.b());
    }

    @Override // kotlinx.serialization.descriptors.f
    public int f() {
        return 0;
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
        a();
        throw new KotlinNothingValueException();
    }

    public int hashCode() {
        return j().hashCode() + (b().hashCode() * 31);
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public List<Annotation> i(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public String j() {
        return this.f130787a;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean k(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public kotlinx.serialization.descriptors.e b() {
        return this.f130788b;
    }

    @dl.d
    public String toString() {
        return "PrimitiveDescriptor(" + j() + ')';
    }
}
