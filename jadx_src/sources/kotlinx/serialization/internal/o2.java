package kotlinx.serialization.internal;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class o2 implements kotlinx.serialization.g<kotlin.j1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final o2 f130737a = new o2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130738b = n0.a("kotlin.UByte", dj.a.D(kotlin.jvm.internal.n.f124940a));

    private o2() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130738b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(kotlinx.serialization.encoding.h hVar, Object obj) {
        g(hVar, ((kotlin.j1) obj).o0());
    }

    @Override // kotlinx.serialization.c
    public /* bridge */ /* synthetic */ Object d(kotlinx.serialization.encoding.f fVar) {
        return kotlin.j1.b(f(fVar));
    }

    public byte f(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return kotlin.j1.h(decoder.v(a()).F());
    }

    public void g(@dl.d kotlinx.serialization.encoding.h encoder, byte b10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        encoder.g(a()).e(b10);
    }
}
