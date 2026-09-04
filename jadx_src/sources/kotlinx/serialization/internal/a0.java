package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class a0 implements kotlinx.serialization.g<Double> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final a0 f130663a = new a0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130664b = new y1("kotlin.Double", kotlinx.serialization.descriptors.e.d.f130577a);

    private a0() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130664b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(kotlinx.serialization.encoding.h hVar, Object obj) {
        g(hVar, ((Number) obj).doubleValue());
    }

    @Override // kotlinx.serialization.c
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Double d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return Double.valueOf(decoder.m());
    }

    public void g(@dl.d kotlinx.serialization.encoding.h encoder, double d10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        encoder.v(d10);
    }
}
