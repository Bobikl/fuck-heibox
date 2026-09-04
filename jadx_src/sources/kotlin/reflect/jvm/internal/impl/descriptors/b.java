package kotlin.reflect.jvm.internal.impl.descriptors;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.types.Variance;

/* JADX INFO: compiled from: typeParameterUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class b implements y0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final y0 f125608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final k f125609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f125610d;

    public b(@dl.d y0 originalDescriptor, @dl.d k declarationDescriptor, int i10) {
        kotlin.jvm.internal.f0.p(originalDescriptor, "originalDescriptor");
        kotlin.jvm.internal.f0.p(declarationDescriptor, "declarationDescriptor");
        this.f125608b = originalDescriptor;
        this.f125609c = declarationDescriptor;
        this.f125610d = i10;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0
    public boolean I() {
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public y0 a() {
        y0 y0VarA = this.f125608b.a();
        kotlin.jvm.internal.f0.o(y0VarA, "originalDescriptor.original");
        return y0VarA;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.l, kotlin.reflect.jvm.internal.impl.descriptors.k
    @dl.d
    public k c() {
        return this.f125609c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.k
    public <R, D> R c0(m<R, D> mVar, D d10) {
        return (R) this.f125608b.c0(mVar, d10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.annotations.a
    @dl.d
    public kotlin.reflect.jvm.internal.impl.descriptors.annotations.e getAnnotations() {
        return this.f125608b.getAnnotations();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0
    public int getIndex() {
        return this.f125610d + this.f125608b.getIndex();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.name.f getName() {
        return this.f125608b.getName();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0
    @dl.d
    public List<kotlin.reflect.jvm.internal.impl.types.d0> getUpperBounds() {
        return this.f125608b.getUpperBounds();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.n
    @dl.d
    public t0 j() {
        return this.f125608b.j();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0
    @dl.d
    public kotlin.reflect.jvm.internal.impl.storage.m j0() {
        return this.f125608b.j0();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0
    public boolean k() {
        return this.f125608b.k();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0
    @dl.d
    public Variance n() {
        return this.f125608b.n();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.y0, kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    public kotlin.reflect.jvm.internal.impl.types.z0 r() {
        return this.f125608b.r();
    }

    @dl.d
    public String toString() {
        return this.f125608b + "[inner-copy]";
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.f
    @dl.d
    public kotlin.reflect.jvm.internal.impl.types.j0 v() {
        return this.f125608b.v();
    }
}
