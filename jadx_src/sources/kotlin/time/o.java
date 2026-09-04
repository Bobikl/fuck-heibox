package kotlin.time;

import kotlin.u0;

/* JADX INFO: compiled from: MonoTimeSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@k
public final class o implements r.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    public static final o f128641b = new o();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f128642c = System.nanoTime();

    private o() {
    }

    private final long f() {
        return System.nanoTime() - f128642c;
    }

    @Override // kotlin.time.r.c, kotlin.time.r
    public /* bridge */ /* synthetic */ d a() {
        return r.b.a.d(e());
    }

    @Override // kotlin.time.r
    public /* bridge */ /* synthetic */ q a() {
        return r.b.a.d(e());
    }

    public final long b(long j10, long j11) {
        return r.b.a.g(l.c(j10, j11));
    }

    public final long c(long j10, long j11) {
        return l.g(j10, j11);
    }

    public final long d(long j10) {
        return l.e(f(), j10);
    }

    public long e() {
        return r.b.a.g(f());
    }

    @dl.d
    public String toString() {
        return "TimeSource(System.nanoTime())";
    }
}
