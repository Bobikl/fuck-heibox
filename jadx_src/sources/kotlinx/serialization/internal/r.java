package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class r implements kotlinx.serialization.g<Character> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final r f130749a = new r();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130750b = new y1("kotlin.Char", kotlinx.serialization.descriptors.e.c.f130576a);

    private r() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130750b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(kotlinx.serialization.encoding.h hVar, Object obj) {
        g(hVar, ((Character) obj).charValue());
    }

    @Override // kotlinx.serialization.c
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Character d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return Character.valueOf(decoder.n());
    }

    public void g(@dl.d kotlinx.serialization.encoding.h encoder, char c10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        encoder.C(c10);
    }
}
