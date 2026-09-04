package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class l implements kotlinx.serialization.g<Byte> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final l f130718a = new l();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130719b = new y1("kotlin.Byte", kotlinx.serialization.descriptors.e.b.f130575a);

    private l() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130719b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(kotlinx.serialization.encoding.h hVar, Object obj) {
        g(hVar, ((Number) obj).byteValue());
    }

    @Override // kotlinx.serialization.c
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Byte d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return Byte.valueOf(decoder.F());
    }

    public void g(@dl.d kotlinx.serialization.encoding.h encoder, byte b10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        encoder.e(b10);
    }
}
