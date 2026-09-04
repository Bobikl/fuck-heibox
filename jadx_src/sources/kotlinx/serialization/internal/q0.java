package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class q0 implements kotlinx.serialization.g<Integer> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final q0 f130745a = new q0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130746b = new y1("kotlin.Int", kotlinx.serialization.descriptors.e.f.f130579a);

    private q0() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130746b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(kotlinx.serialization.encoding.h hVar, Object obj) {
        g(hVar, ((Number) obj).intValue());
    }

    @Override // kotlinx.serialization.c
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Integer d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return Integer.valueOf(decoder.s());
    }

    public void g(@dl.d kotlinx.serialization.encoding.h encoder, int i10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        encoder.q(i10);
    }
}
