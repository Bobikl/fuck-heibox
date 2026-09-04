package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class i implements kotlinx.serialization.g<Boolean> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final i f130704a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130705b = new y1("kotlin.Boolean", kotlinx.serialization.descriptors.e.a.f130574a);

    private i() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130705b;
    }

    @Override // kotlinx.serialization.r
    public /* bridge */ /* synthetic */ void b(kotlinx.serialization.encoding.h hVar, Object obj) {
        g(hVar, ((Boolean) obj).booleanValue());
    }

    @Override // kotlinx.serialization.c
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Boolean d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return Boolean.valueOf(decoder.y());
    }

    public void g(@dl.d kotlinx.serialization.encoding.h encoder, boolean z10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        encoder.k(z10);
    }
}
