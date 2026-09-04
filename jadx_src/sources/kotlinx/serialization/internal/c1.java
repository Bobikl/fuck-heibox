package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class c1 implements kotlinx.serialization.g<Long> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final c1 f130681a = new c1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130682b = new y1("kotlin.Long", kotlinx.serialization.descriptors.e.g.f130580a);

    private c1() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130682b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(kotlinx.serialization.encoding.h hVar, Object obj) {
        g(hVar, ((Number) obj).longValue());
    }

    @Override // kotlinx.serialization.c
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Long d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return Long.valueOf(decoder.g());
    }

    public void g(@dl.d kotlinx.serialization.encoding.h encoder, long j10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        encoder.z(j10);
    }
}
