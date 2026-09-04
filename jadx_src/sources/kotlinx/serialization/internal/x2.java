package kotlinx.serialization.internal;

/* JADX INFO: compiled from: ValueClasses.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class x2 implements kotlinx.serialization.g<kotlin.x1> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final x2 f130782a = new x2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130783b = n0.a("kotlin.UShort", dj.a.J(kotlin.jvm.internal.r0.f124962a));

    private x2() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130783b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(kotlinx.serialization.encoding.h hVar, Object obj) {
        g(hVar, ((kotlin.x1) obj).o0());
    }

    @Override // kotlinx.serialization.c
    public /* bridge */ /* synthetic */ Object d(kotlinx.serialization.encoding.f fVar) {
        return kotlin.x1.b(f(fVar));
    }

    public short f(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return kotlin.x1.h(decoder.v(a()).l());
    }

    public void g(@dl.d kotlinx.serialization.encoding.h encoder, short s10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        encoder.g(a()).j(s10);
    }
}
