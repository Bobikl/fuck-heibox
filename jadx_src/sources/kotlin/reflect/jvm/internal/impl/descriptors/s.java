package kotlin.reflect.jvm.internal.impl.descriptors;

/* JADX INFO: compiled from: DescriptorVisibility.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class s {
    protected s() {
    }

    @dl.e
    public final Integer a(@dl.d s visibility) {
        kotlin.jvm.internal.f0.p(visibility, "visibility");
        return b().a(visibility.b());
    }

    @dl.d
    public abstract g1 b();

    @dl.d
    public abstract String c();

    public final boolean d() {
        return b().c();
    }

    public abstract boolean e(@dl.e kotlin.reflect.jvm.internal.impl.resolve.scopes.receivers.h hVar, @dl.d o oVar, @dl.d k kVar, boolean z10);

    @dl.d
    public abstract s f();

    @dl.d
    public final String toString() {
        return b().toString();
    }
}
