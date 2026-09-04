package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: KotlinTypeFactory.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l0 extends q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final w0 f128151d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@dl.d j0 delegate, @dl.d w0 attributes) {
        super(delegate);
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        kotlin.jvm.internal.f0.p(attributes, "attributes");
        this.f128151d = attributes;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p, kotlin.reflect.jvm.internal.impl.types.d0
    @dl.d
    public w0 N0() {
        return this.f128151d;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.p
    @dl.d
    /* JADX INFO: renamed from: a1, reason: merged with bridge method [inline-methods] */
    public l0 Z0(@dl.d j0 delegate) {
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        return new l0(delegate, N0());
    }
}
