package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeAttributeTranslator.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m implements v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final m f128152a = new m();

    private m() {
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.v0
    @dl.d
    public w0 a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.annotations.e annotations, @dl.e z0 z0Var, @dl.e kotlin.reflect.jvm.internal.impl.descriptors.k kVar) {
        kotlin.jvm.internal.f0.p(annotations, "annotations");
        return annotations.isEmpty() ? w0.f128193c.h() : w0.f128193c.g(kotlin.collections.s.k(new h(annotations)));
    }
}
