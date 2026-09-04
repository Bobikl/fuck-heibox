package kotlinx.serialization.descriptors;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: SerialDescriptors.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f130595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ f f130596b;

    public j(@dl.d String serialName, @dl.d f original) {
        f0.p(serialName, "serialName");
        f0.p(original, "original");
        this.f130595a = serialName;
        this.f130596b = original;
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public h b() {
        return this.f130596b.b();
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean c() {
        return this.f130596b.c();
    }

    @Override // kotlinx.serialization.descriptors.f
    @kotlinx.serialization.d
    public int d(@dl.d String name) {
        f0.p(name, "name");
        return this.f130596b.d(name);
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    @kotlinx.serialization.d
    public f e(int i10) {
        return this.f130596b.e(i10);
    }

    @Override // kotlinx.serialization.descriptors.f
    public int f() {
        return this.f130596b.f();
    }

    @Override // kotlinx.serialization.descriptors.f
    public boolean g() {
        return this.f130596b.g();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public List<Annotation> getAnnotations() {
        return this.f130596b.getAnnotations();
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    @kotlinx.serialization.d
    public String h(int i10) {
        return this.f130596b.h(i10);
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    @kotlinx.serialization.d
    public List<Annotation> i(int i10) {
        return this.f130596b.i(i10);
    }

    @Override // kotlinx.serialization.descriptors.f
    @dl.d
    public String j() {
        return this.f130595a;
    }

    @Override // kotlinx.serialization.descriptors.f
    @kotlinx.serialization.d
    public boolean k(int i10) {
        return this.f130596b.k(i10);
    }
}
