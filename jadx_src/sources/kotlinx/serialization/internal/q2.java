package kotlinx.serialization.internal;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
@kotlin.s
@kotlinx.serialization.d
public final class q2 extends w1<kotlin.n1, kotlin.o1, p2> implements kotlinx.serialization.g<kotlin.o1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final q2 f130748c = new q2();

    private q2() {
        super(dj.a.y(kotlin.n1.f125008c));
    }

    @Override // kotlinx.serialization.internal.w1
    public /* bridge */ /* synthetic */ void A(kotlinx.serialization.encoding.e eVar, kotlin.o1 o1Var, int i10) {
        F(eVar, o1Var.E(), i10);
    }

    protected int B(@dl.d int[] collectionSize) {
        kotlin.jvm.internal.f0.p(collectionSize, "$this$collectionSize");
        return kotlin.o1.v(collectionSize);
    }

    @dl.d
    protected int[] C() {
        return kotlin.o1.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void y(@dl.d kotlinx.serialization.encoding.d decoder, int i10, @dl.d p2 builder, boolean z10) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlin.jvm.internal.f0.p(builder, "builder");
        builder.e(kotlin.n1.h(decoder.k(a(), i10).s()));
    }

    @dl.d
    protected p2 E(@dl.d int[] toBuilder) {
        kotlin.jvm.internal.f0.p(toBuilder, "$this$toBuilder");
        return new p2(toBuilder, null);
    }

    protected void F(@dl.d kotlinx.serialization.encoding.e encoder, @dl.d int[] content, int i10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.u(a(), i11).q(kotlin.o1.s(content, i11));
        }
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return B(((kotlin.o1) obj).E());
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return E(((kotlin.o1) obj).E());
    }

    @Override // kotlinx.serialization.internal.w1
    public /* bridge */ /* synthetic */ kotlin.o1 w() {
        return kotlin.o1.b(C());
    }
}
