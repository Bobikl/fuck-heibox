package kotlinx.serialization.internal;

/* JADX INFO: compiled from: NullableSerializer.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class m1<T> implements kotlinx.serialization.g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.g<T> f130727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final kotlinx.serialization.descriptors.f f130728b;

    public m1(@dl.d kotlinx.serialization.g<T> serializer) {
        kotlin.jvm.internal.f0.p(serializer, "serializer");
        this.f130727a = serializer;
        this.f130728b = new b2(serializer.a());
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return this.f130728b;
    }

    @Override // kotlinx.serialization.r
    public void b(@dl.d kotlinx.serialization.encoding.h encoder, @dl.e T t10) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        if (t10 == null) {
            encoder.A();
        } else {
            encoder.D();
            encoder.d(this.f130727a, t10);
        }
    }

    @Override // kotlinx.serialization.c
    @dl.e
    public T d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        return decoder.B() ? (T) decoder.E(this.f130727a) : (T) decoder.f();
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && m1.class == obj.getClass() && kotlin.jvm.internal.f0.g(this.f130727a, ((m1) obj).f130727a);
    }

    public int hashCode() {
        return this.f130727a.hashCode();
    }
}
