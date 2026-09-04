package kotlin.random;

import kotlin.jvm.internal.f0;
import kotlin.u0;
import sh.f;
import sh.m;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c {
    @u0(version = "1.3")
    @dl.d
    public static final java.util.Random a(@dl.d Random random) {
        java.util.Random randomR;
        f0.p(random, "<this>");
        a aVar = random instanceof a ? (a) random : null;
        return (aVar == null || (randomR = aVar.r()) == null) ? new KotlinRandom(random) : randomR;
    }

    @u0(version = "1.3")
    @dl.d
    public static final Random b(@dl.d java.util.Random random) {
        Random randomA;
        f0.p(random, "<this>");
        KotlinRandom kotlinRandom = random instanceof KotlinRandom ? (KotlinRandom) random : null;
        return (kotlinRandom == null || (randomA = kotlinRandom.a()) == null) ? new PlatformRandom(random) : randomA;
    }

    @f
    private static final Random c() {
        return m.f139400a.b();
    }

    public static final double d(int i10, int i11) {
        return ((((long) i10) << 27) + ((long) i11)) / 9.007199254740992E15d;
    }
}
