package kotlinx.serialization.internal;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
@kotlin.s
@kotlinx.serialization.d
public final class w2 extends w1<kotlin.x1, kotlin.y1, v2> implements kotlinx.serialization.g<kotlin.y1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final w2 f130780c = new w2();

    private w2() {
        super(dj.a.A(kotlin.x1.f128659c));
    }

    @Override // kotlinx.serialization.internal.w1
    public /* bridge */ /* synthetic */ void A(kotlinx.serialization.encoding.e eVar, kotlin.y1 y1Var, int i10) {
        F(eVar, y1Var.E(), i10);
    }

    protected int B(@dl.d short[] collectionSize) {
        kotlin.jvm.internal.f0.p(collectionSize, "$this$collectionSize");
        return kotlin.y1.v(collectionSize);
    }

    @dl.d
    protected short[] C() {
        return kotlin.y1.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void y(@dl.d kotlinx.serialization.encoding.d decoder, int i10, @dl.d v2 builder, boolean z10) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlin.jvm.internal.f0.p(builder, "builder");
        builder.e(kotlin.x1.h(decoder.k(a(), i10).l()));
    }

    @dl.d
    protected v2 E(@dl.d short[] toBuilder) {
        kotlin.jvm.internal.f0.p(toBuilder, "$this$toBuilder");
        return new v2(toBuilder, null);
    }

    protected void F(@dl.d kotlinx.serialization.encoding.e encoder, @dl.d short[] content, int i10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.u(a(), i11).j(kotlin.y1.s(content, i11));
        }
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return B(((kotlin.y1) obj).E());
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return E(((kotlin.y1) obj).E());
    }

    @Override // kotlinx.serialization.internal.w1
    public /* bridge */ /* synthetic */ kotlin.y1 w() {
        return kotlin.y1.b(C());
    }
}
