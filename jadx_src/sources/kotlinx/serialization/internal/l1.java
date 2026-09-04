package kotlinx.serialization.internal;

import kotlinx.serialization.SerializationException;

/* JADX INFO: compiled from: BuiltInSerializers.kt */
/* JADX INFO: loaded from: classes5.dex */
@kotlin.r0
public final class l1 implements kotlinx.serialization.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final l1 f130721a = new l1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final kotlinx.serialization.descriptors.f f130722b = k1.f130714a;

    private l1() {
    }

    @Override // kotlinx.serialization.g, kotlinx.serialization.r, kotlinx.serialization.c
    @dl.d
    public kotlinx.serialization.descriptors.f a() {
        return f130722b;
    }

    @Override // kotlinx.serialization.c
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Void d(@dl.d kotlinx.serialization.encoding.f decoder) {
        kotlin.jvm.internal.f0.p(decoder, "decoder");
        throw new SerializationException("'kotlin.Nothing' does not have instances");
    }

    @Override // kotlinx.serialization.r
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public void b(@dl.d kotlinx.serialization.encoding.h encoder, @dl.d Void value) {
        kotlin.jvm.internal.f0.p(encoder, "encoder");
        kotlin.jvm.internal.f0.p(value, "value");
        throw new SerializationException("'kotlin.Nothing' cannot be serialized");
    }
}
