package kotlinx.serialization.internal;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class p0 extends w1<Integer, int[], o0> implements kotlinx.serialization.g<int[]> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final p0 f130741c = new p0();

    private p0() {
        super(dj.a.H(kotlin.jvm.internal.d0.f124911a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int j(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return iArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    @dl.d
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public int[] w() {
        return new int[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void y(@dl.d kotlinx.serialization.encoding.d decoder, int i10, @dl.d o0 builder, boolean z10) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlin.jvm.internal.f0.p(builder, "builder");
        builder.e(decoder.e(a(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public o0 p(@dl.d int[] iArr) {
        kotlin.jvm.internal.f0.p(iArr, "<this>");
        return new o0(iArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void A(@dl.d kotlinx.serialization.encoding.e encoder, @dl.d int[] content, int i10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.m(a(), i11, content[i11]);
        }
    }
}
