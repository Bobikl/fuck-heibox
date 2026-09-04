package kotlinx.serialization.internal;

/* JADX INFO: compiled from: PrimitiveArraysSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class h extends w1<Boolean, boolean[], g> implements kotlinx.serialization.g<boolean[]> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    public static final h f130701c = new h();

    private h() {
        super(dj.a.C(kotlin.jvm.internal.l.f124933a));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    /* JADX INFO: renamed from: B, reason: merged with bridge method [inline-methods] */
    public int j(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return zArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    @dl.d
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public boolean[] w() {
        return new boolean[0];
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public void y(@dl.d kotlinx.serialization.encoding.d decoder, int i10, @dl.d g builder, boolean z10) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        kotlin.jvm.internal.f0.p(builder, "builder");
        builder.e(decoder.A(a(), i10));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.a
    @dl.d
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public g p(@dl.d boolean[] zArr) {
        kotlin.jvm.internal.f0.p(zArr, "<this>");
        return new g(zArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlinx.serialization.internal.w1
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public void A(@dl.d kotlinx.serialization.encoding.e encoder, @dl.d boolean[] content, int i10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.n(a(), i11, content[i11]);
        }
    }
}
