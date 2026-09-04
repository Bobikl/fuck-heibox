package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: DescriptorVisibility.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class p extends s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final g1 f125863a;

    public p(@dl.d g1 delegate) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        this.f125863a = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
    @dl.d
    public g1 b() {
        return this.f125863a;
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
    @dl.d
    public String c() {
        return b().b();
    }

    @Override // kotlin.reflect.jvm.internal.impl.descriptors.s
    @dl.d
    public s f() {
        s sVarJ = r.j(b().d());
        kotlin.jvm.internal.f0.o(sVarJ, "toDescriptorVisibility(delegate.normalize())");
        return sVarJ;
    }
}
