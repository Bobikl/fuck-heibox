package kotlinx.serialization.internal;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
@kotlin.s
@kotlinx.serialization.d
public final class n2 extends w1<kotlin.j1, kotlin.k1, m2> implements kotlinx.serialization.g<kotlin.k1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final n2 f130733c = new n2();

    private n2() {
        super(dj.a.x(kotlin.j1.f124867c));
    }

    @Override // kotlinx.serialization.internal.w1
    public /* bridge */ /* synthetic */ void A(kotlinx.serialization.encoding.e eVar, kotlin.k1 k1Var, int i10) {
        F(eVar, k1Var.E(), i10);
    }

    protected int B(@dl.d byte[] collectionSize) {
        kotlin.jvm.internal.f0.p(collectionSize, "$this$collectionSize");
        return kotlin.k1.v(collectionSize);
    }

    @dl.d
    protected byte[] C() {
        return kotlin.k1.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void y(@dl.d kotlinx.serialization.encoding.d decoder, int i10, @dl.d m2 builder, boolean z10) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlin.jvm.internal.f0.p(builder, "builder");
        builder.e(kotlin.j1.h(decoder.k(a(), i10).F()));
    }

    @dl.d
    protected m2 E(@dl.d byte[] toBuilder) {
        kotlin.jvm.internal.f0.p(toBuilder, "$this$toBuilder");
        return new m2(toBuilder, null);
    }

    protected void F(@dl.d kotlinx.serialization.encoding.e encoder, @dl.d byte[] content, int i10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.u(a(), i11).e(kotlin.k1.s(content, i11));
        }
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return B(((kotlin.k1) obj).E());
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return E(((kotlin.k1) obj).E());
    }

    @Override // kotlinx.serialization.internal.w1
    public /* bridge */ /* synthetic */ kotlin.k1 w() {
        return kotlin.k1.b(C());
    }
}
