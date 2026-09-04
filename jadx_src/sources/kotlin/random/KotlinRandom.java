package kotlin.random;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PlatformRandom.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class KotlinRandom extends java.util.Random {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final a f125028d = new a(null);

    @Deprecated
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final Random f125029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f125030c;

    /* JADX INFO: compiled from: PlatformRandom.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    public KotlinRandom(@dl.d Random impl) {
        f0.p(impl, "impl");
        this.f125029b = impl;
    }

    @dl.d
    public final Random a() {
        return this.f125029b;
    }

    @Override // java.util.Random
    protected int next(int i10) {
        return this.f125029b.b(i10);
    }

    @Override // java.util.Random
    public boolean nextBoolean() {
        return this.f125029b.c();
    }

    @Override // java.util.Random
    public void nextBytes(@dl.d byte[] bytes) {
        f0.p(bytes, "bytes");
        this.f125029b.e(bytes);
    }

    @Override // java.util.Random
    public double nextDouble() {
        return this.f125029b.h();
    }

    @Override // java.util.Random
    public float nextFloat() {
        return this.f125029b.k();
    }

    @Override // java.util.Random
    public int nextInt() {
        return this.f125029b.l();
    }

    @Override // java.util.Random
    public int nextInt(int i10) {
        return this.f125029b.m(i10);
    }

    @Override // java.util.Random
    public long nextLong() {
        return this.f125029b.o();
    }

    @Override // java.util.Random
    public void setSeed(long j10) {
        if (this.f125030c) {
            throw new UnsupportedOperationException("Setting seed is not supported.");
        }
        this.f125030c = true;
    }
}
