package kotlinx.serialization.encoding;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: Decoding.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface f {

    /* JADX INFO: compiled from: Decoding.kt */
    @t0({"SMAP\nDecoding.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Decoding.kt\nkotlinx/serialization/encoding/Decoder$DefaultImpls\n+ 2 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n*L\n1#1,575:1\n270#2,2:576\n*S KotlinDebug\n*F\n+ 1 Decoding.kt\nkotlinx/serialization/encoding/Decoder$DefaultImpls\n*L\n263#1:576,2\n*E\n"})
    public static final class a {
        @dl.e
        @kotlinx.serialization.d
        public static <T> T a(@dl.d f fVar, @dl.d kotlinx.serialization.c<? extends T> deserializer) {
            f0.p(deserializer, "deserializer");
            return (deserializer.a().c() || fVar.B()) ? (T) fVar.E(deserializer) : (T) fVar.f();
        }

        public static <T> T b(@dl.d f fVar, @dl.d kotlinx.serialization.c<? extends T> deserializer) {
            f0.p(deserializer, "deserializer");
            return deserializer.d(fVar);
        }
    }

    @kotlinx.serialization.d
    boolean B();

    <T> T E(@dl.d kotlinx.serialization.c<? extends T> cVar);

    byte F();

    @dl.e
    @kotlinx.serialization.d
    <T> T G(@dl.d kotlinx.serialization.c<? extends T> cVar);

    @dl.d
    kotlinx.serialization.modules.e a();

    @dl.d
    d b(@dl.d kotlinx.serialization.descriptors.f fVar);

    @dl.e
    @kotlinx.serialization.d
    Void f();

    long g();

    short l();

    double m();

    char n();

    @dl.d
    String p();

    int r(@dl.d kotlinx.serialization.descriptors.f fVar);

    int s();

    @dl.d
    f v(@dl.d kotlinx.serialization.descriptors.f fVar);

    float w();

    boolean y();
}
