package kotlinx.serialization.internal;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
@kotlin.s
@kotlinx.serialization.d
public final class t2 extends w1<kotlin.r1, kotlin.s1, s2> implements kotlinx.serialization.g<kotlin.s1> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final t2 f130766c = new t2();

    private t2() {
        super(dj.a.z(kotlin.r1.f125022c));
    }

    @Override // kotlinx.serialization.internal.w1
    public /* bridge */ /* synthetic */ void A(kotlinx.serialization.encoding.e eVar, kotlin.s1 s1Var, int i10) {
        F(eVar, s1Var.E(), i10);
    }

    protected int B(@dl.d long[] collectionSize) {
        kotlin.jvm.internal.f0.p(collectionSize, "$this$collectionSize");
        return kotlin.s1.v(collectionSize);
    }

    @dl.d
    protected long[] C() {
        return kotlin.s1.e(0);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void y(@dl.d kotlinx.serialization.encoding.d decoder, int i10, @dl.d s2 builder, boolean z10) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlin.jvm.internal.f0.p(builder, "builder");
        builder.e(kotlin.r1.h(decoder.k(a(), i10).g()));
    }

    @dl.d
    protected s2 E(@dl.d long[] toBuilder) {
        kotlin.jvm.internal.f0.p(toBuilder, "$this$toBuilder");
        return new s2(toBuilder, null);
    }

    protected void F(@dl.d kotlinx.serialization.encoding.e encoder, @dl.d long[] content, int i10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.u(a(), i11).z(kotlin.s1.s(content, i11));
        }
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ int j(Object obj) {
        return B(((kotlin.s1) obj).E());
    }

    @Override // kotlinx.serialization.internal.a
    public /* bridge */ /* synthetic */ Object p(Object obj) {
        return E(((kotlin.s1) obj).E());
    }

    @Override // kotlinx.serialization.internal.w1
    public /* bridge */ /* synthetic */ kotlin.s1 w() {
        return kotlin.s1.b(C());
    }
}
