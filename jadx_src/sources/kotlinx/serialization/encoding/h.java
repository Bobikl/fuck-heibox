package kotlinx.serialization.encoding;

import kotlin.jvm.internal.f0;
import kotlinx.serialization.r;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface h {

    /* JADX INFO: compiled from: Encoding.kt */
    public static final class a {
        @dl.d
        public static e a(@dl.d h hVar, @dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
            f0.p(descriptor, "descriptor");
            return hVar.b(descriptor);
        }

        @kotlinx.serialization.d
        public static void b(@dl.d h hVar) {
        }

        @kotlinx.serialization.d
        public static <T> void c(@dl.d h hVar, @dl.d r<? super T> serializer, @dl.e T t10) {
            f0.p(serializer, "serializer");
            if (serializer.a().c()) {
                hVar.d(serializer, t10);
            } else if (t10 == null) {
                hVar.A();
            } else {
                hVar.D();
                hVar.d(serializer, t10);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static <T> void d(@dl.d h hVar, @dl.d r<? super T> serializer, T t10) {
            f0.p(serializer, "serializer");
            serializer.b(hVar, t10);
        }
    }

    @kotlinx.serialization.d
    void A();

    void C(char c10);

    @kotlinx.serialization.d
    void D();

    @dl.d
    kotlinx.serialization.modules.e a();

    @dl.d
    e b(@dl.d kotlinx.serialization.descriptors.f fVar);

    <T> void d(@dl.d r<? super T> rVar, T t10);

    void e(byte b10);

    void f(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    @dl.d
    h g(@dl.d kotlinx.serialization.descriptors.f fVar);

    void j(short s10);

    void k(boolean z10);

    void l(float f10);

    void q(int i10);

    void t(@dl.d String str);

    void v(double d10);

    @dl.d
    e x(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    @kotlinx.serialization.d
    <T> void y(@dl.d r<? super T> rVar, @dl.e T t10);

    void z(long j10);
}
