package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class g0 implements kotlinx.serialization.g<Float> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final g0 f130698a = new g0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130699b = new y1("kotlin.Float", kotlinx.serialization.descriptors.e.C1194e.f130578a);

    private g0() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130699b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(kotlinx.serialization.encoding.h hVar, Object obj) {
        g(hVar, ((Number) obj).floatValue());
    }

    @Override // kotlinx.serialization.c
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return Float.valueOf(decoder.w());
    }

    public void g(@dl.d kotlinx.serialization.encoding.h encoder, float f10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        encoder.l(f10);
    }
}
