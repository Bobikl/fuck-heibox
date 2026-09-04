package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class q extends p {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final j0 f128161c;

    public q(@dl.d j0 delegate) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        this.f128161c = delegate;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    public j0 V0(boolean z10) {
        return z10 == P0() ? this : X0().V0(z10).U0(N0());
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.l1
    @dl.d
    /* JADX INFO: renamed from: W0 */
    public j0 U0(@dl.d w0 newAttributes) {
        kotlin.jvm.internal.f0.p(newAttributes, "newAttributes");
        return newAttributes != N0() ? new l0(this, newAttributes) : this;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    @dl.d
    protected j0 X0() {
        return this.f128161c;
    }
}
