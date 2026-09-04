package kotlinx.serialization.internal;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class u2 implements kotlinx.serialization.g<kotlin.r1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final u2 f130769a = new u2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130770b = n0.a("kotlin.ULong", dj.a.I(kotlin.jvm.internal.i0.f124923a));

    private u2() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130770b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(kotlinx.serialization.encoding.h hVar, Object obj) {
        g(hVar, ((kotlin.r1) obj).q0());
    }

    @Override // kotlinx.serialization.c
    public /* bridge */ /* synthetic */ Object d(kotlinx.serialization.encoding.f fVar) {
        return kotlin.r1.b(f(fVar));
    }

    public long f(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return kotlin.r1.h(decoder.v(a()).g());
    }

    public void g(@dl.d kotlinx.serialization.encoding.h encoder, long j10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        encoder.g(a()).z(j10);
    }
}
