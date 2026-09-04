package kotlinx.serialization.internal;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class f0 extends w1<Float, float[], e0> implements kotlinx.serialization.g<float[]> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final f0 f130692c = new f0();

    private f0() {
        super(dj.a.G(kotlin.jvm.internal.y.f124996a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int j(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return fArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    @dl.d
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public float[] w() {
        return new float[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void y(@dl.d kotlinx.serialization.encoding.d decoder, int i10, @dl.d e0 builder, boolean z10) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlin.jvm.internal.f0.p(builder, "builder");
        builder.e(decoder.x(a(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public e0 p(@dl.d float[] fArr) {
        kotlin.jvm.internal.f0.p(fArr, "<this>");
        return new e0(fArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void A(@dl.d kotlinx.serialization.encoding.e encoder, @dl.d float[] content, int i10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.B(a(), i11, content[i11]);
        }
    }
}
