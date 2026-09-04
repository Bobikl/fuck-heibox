package kotlinx.serialization.internal;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class z extends w1<Double, double[], y> implements kotlinx.serialization.g<double[]> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final z f130791c = new z();

    private z() {
        super(dj.a.F(kotlin.jvm.internal.v.f124978a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int j(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return dArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    @dl.d
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public double[] w() {
        return new double[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void y(@dl.d kotlinx.serialization.encoding.d decoder, int i10, @dl.d y builder, boolean z10) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlin.jvm.internal.f0.p(builder, "builder");
        builder.e(decoder.D(a(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public y p(@dl.d double[] dArr) {
        kotlin.jvm.internal.f0.p(dArr, "<this>");
        return new y(dArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void A(@dl.d kotlinx.serialization.encoding.e encoder, @dl.d double[] content, int i10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.F(a(), i11, content[i11]);
        }
    }
}
