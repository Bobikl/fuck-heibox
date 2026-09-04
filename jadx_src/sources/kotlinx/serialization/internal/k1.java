package kotlinx.serialization.internal;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: compiled from: NothingSerialDescriptor.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k1 implements kotlinx.serialization.descriptors.f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final k1 f130714a = new k1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.h f130715b = kotlinx.serialization.descriptors.i.d.f130594a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final String f130716c = "kotlin.Nothing";

    private k1() {
    }

    private final Void a() {
        throw new IllegalStateException("Descriptor for type `kotlin.Nothing` does not have elements");
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public kotlinx.serialization.descriptors.h b() {
        return f130715b;
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
        return this == obj;
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
        return f130716c;
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean k(int i10) {
        a();
        throw new KotlinNothingValueException();
    }

    @dl.d
    public String toString() {
        return "NothingSerialDescriptor";
    }
}
