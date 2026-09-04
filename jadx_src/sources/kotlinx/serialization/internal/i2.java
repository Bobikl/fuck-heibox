package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class i2 implements kotlinx.serialization.g<String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final i2 f130706a = new i2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130707b = new y1("kotlin.String", kotlinx.serialization.descriptors.e.i.f130582a);

    private i2() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130707b;
    }

    @Override // kotlinx.serialization.c
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public String d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return decoder.p();
    }

    @Override // kotlinx.serialization.r
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(@dl.d kotlinx.serialization.encoding.h encoder, @dl.d String value) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(value, "value");
        encoder.t(value);
    }
}
