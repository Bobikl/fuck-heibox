package kotlin.random;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class a extends Random {
    @Override // kotlin.random.Random
    public int b(int i10) {
        return d.j(r().nextInt(), i10);
    }

    @Override // kotlin.random.Random
    public boolean c() {
        return r().nextBoolean();
    }

    @Override // kotlin.random.Random
    @dl.d
    public byte[] e(@dl.d byte[] array) {
        f0.p(array, "array");
        r().nextBytes(array);
        return array;
    }

    @Override // kotlin.random.Random
    public double h() {
        return r().nextDouble();
    }

    @Override // kotlin.random.Random
    public float k() {
        return r().nextFloat();
    }

    @Override // kotlin.random.Random
    public int l() {
        return r().nextInt();
    }

    @Override // kotlin.random.Random
    public int m(int i10) {
        return r().nextInt(i10);
    }

    @Override // kotlin.random.Random
    public long o() {
        return r().nextLong();
    }

    @dl.d
    public abstract java.util.Random r();
}
