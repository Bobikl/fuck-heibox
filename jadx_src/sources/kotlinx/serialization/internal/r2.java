package kotlinx.serialization.internal;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class r2 implements kotlinx.serialization.g<kotlin.n1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final r2 f130753a = new r2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130754b = n0.a("kotlin.UInt", dj.a.H(kotlin.jvm.internal.d0.f124911a));

    private r2() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130754b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(kotlinx.serialization.encoding.h hVar, Object obj) {
        g(hVar, ((kotlin.n1) obj).q0());
    }

    @Override // kotlinx.serialization.c
    public /* bridge */ /* synthetic */ Object d(kotlinx.serialization.encoding.f fVar) {
        return kotlin.n1.b(f(fVar));
    }

    public int f(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return kotlin.n1.h(decoder.v(a()).s());
    }

    public void g(@dl.d kotlinx.serialization.encoding.h encoder, int i10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        encoder.g(a()).q(i10);
    }
}
