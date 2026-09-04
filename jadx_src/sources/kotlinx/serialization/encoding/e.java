package kotlinx.serialization.encoding;

import kotlin.jvm.internal.f0;
import kotlinx.serialization.r;

/* JADX INFO: compiled from: Encoding.kt */
/* JADX INFO: loaded from: classes5.dex */
public interface e {

    /* JADX INFO: compiled from: Encoding.kt */
    public static final class a {
        @kotlinx.serialization.d
        public static boolean a(@dl.d e eVar, @dl.d kotlinx.serialization.descriptors.f descriptor, int i10) {
            f0.p(descriptor, "descriptor");
            return true;
        }
    }

    void B(@dl.d kotlinx.serialization.descriptors.f fVar, int i10, float f10);

    <T> void E(@dl.d kotlinx.serialization.descriptors.f fVar, int i10, @dl.d r<? super T> rVar, T t10);

    void F(@dl.d kotlinx.serialization.descriptors.f fVar, int i10, double d10);

    @dl.d
    kotlinx.serialization.modules.e a();

    void c(@dl.d kotlinx.serialization.descriptors.f fVar);

    void h(@dl.d kotlinx.serialization.descriptors.f fVar, int i10, char c10);

    void i(@dl.d kotlinx.serialization.descriptors.f fVar, int i10, byte b10);

    void m(@dl.d kotlinx.serialization.descriptors.f fVar, int i10, int i11);

    void n(@dl.d kotlinx.serialization.descriptors.f fVar, int i10, boolean z10);

    void o(@dl.d kotlinx.serialization.descriptors.f fVar, int i10, @dl.d String str);

    @kotlinx.serialization.d
    boolean p(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    void r(@dl.d kotlinx.serialization.descriptors.f fVar, int i10, short s10);

    void s(@dl.d kotlinx.serialization.descriptors.f fVar, int i10, long j10);

    @dl.d
    h u(@dl.d kotlinx.serialization.descriptors.f fVar, int i10);

    @kotlinx.serialization.d
    <T> void w(@dl.d kotlinx.serialization.descriptors.f fVar, int i10, @dl.d r<? super T> rVar, @dl.e T t10);
}
