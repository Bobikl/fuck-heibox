package kotlinx.serialization.internal;

/* JADX INFO: compiled from: BuiltInSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class b0 implements kotlinx.serialization.g<kotlin.time.e> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b0 f130669a = new b0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130670b = new y1("kotlin.time.Duration", kotlinx.serialization.descriptors.e.i.f130582a);

    private b0() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130670b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(kotlinx.serialization.encoding.h hVar, Object obj) {
        g(hVar, ((kotlin.time.e) obj).D0());
    }

    @Override // kotlinx.serialization.c
    public /* bridge */ /* synthetic */ Object d(kotlinx.serialization.encoding.f fVar) {
        return kotlin.time.e.f(f(fVar));
    }

    public long f(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return kotlin.time.e.f128628c.n0(decoder.p());
    }

    public void g(@dl.d kotlinx.serialization.encoding.h encoder, long j10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        encoder.t(kotlin.time.e.v0(j10));
    }
}
