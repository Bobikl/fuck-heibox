package kotlinx.serialization.internal;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class b1 extends w1<Long, long[], a1> implements kotlinx.serialization.g<long[]> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final b1 f130671c = new b1();

    private b1() {
        super(dj.a.I(kotlin.jvm.internal.i0.f124923a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int j(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return jArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    @dl.d
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public long[] w() {
        return new long[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void y(@dl.d kotlinx.serialization.encoding.d decoder, int i10, @dl.d a1 builder, boolean z10) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlin.jvm.internal.f0.p(builder, "builder");
        builder.e(decoder.d(a(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public a1 p(@dl.d long[] jArr) {
        kotlin.jvm.internal.f0.p(jArr, "<this>");
        return new a1(jArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void A(@dl.d kotlinx.serialization.encoding.e encoder, @dl.d long[] content, int i10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.s(a(), i11, content[i11]);
        }
    }
}
