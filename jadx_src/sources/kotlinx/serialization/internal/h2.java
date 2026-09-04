package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class h2 implements kotlinx.serialization.g<Short> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final h2 f130702a = new h2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130703b = new y1("kotlin.Short", kotlinx.serialization.descriptors.e.h.f130581a);

    private h2() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130703b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(kotlinx.serialization.encoding.h hVar, Object obj) {
        g(hVar, ((Number) obj).shortValue());
    }

    @Override // kotlinx.serialization.c
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Short d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return Short.valueOf(decoder.l());
    }

    public void g(@dl.d kotlinx.serialization.encoding.h encoder, short s10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        encoder.j(s10);
    }
}
