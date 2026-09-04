package kotlinx.serialization.internal;

/* JADX INFO: compiled from: Primitives.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class y2 implements kotlinx.serialization.g<kotlin.b2> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final y2 f130789b = new y2();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final /* synthetic */ ObjectSerializer<kotlin.b2> f130790a = new ObjectSerializer<>("kotlin.Unit", kotlin.b2.f124493a);

    private y2() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return this.f130790a.a();
    }

    @Override // kotlinx.serialization.c
    public /* bridge */ /* synthetic */ Object d(kotlinx.serialization.encoding.f fVar) {
        f(fVar);
        return kotlin.b2.f124493a;
    }

    public void f(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        this.f130790a.d(decoder);
    }

    @Override // kotlinx.serialization.r
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(@dl.d kotlinx.serialization.encoding.h encoder, @dl.d kotlin.b2 value) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(value, "value");
        this.f130790a.b(encoder, value);
    }
}
