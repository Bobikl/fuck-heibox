package kotlin.time;

import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: TimeSource.kt */
/* JADX INFO: loaded from: classes5.dex */
@k
public final class c implements q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final q f128626b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final long f128627c;

    private c(q qVar, long j10) {
        this.f128626b = qVar;
        this.f128627c = j10;
    }

    public /* synthetic */ c(q qVar, long j10, u uVar) {
        this(qVar, j10);
    }

    @Override // kotlin.time.q
    public long a() {
        return e.l0(this.f128626b.a(), this.f128627c);
    }

    @Override // kotlin.time.q
    public boolean b() {
        return q.a.a(this);
    }

    @Override // kotlin.time.q
    public boolean c() {
        return q.a.b(this);
    }

    public final long d() {
        return this.f128627c;
    }

    @dl.d
    public final q e() {
        return this.f128626b;
    }

    @Override // kotlin.time.q
    @dl.d
    public q u(long j10) {
        return new c(this.f128626b, e.m0(this.f128627c, j10), null);
    }

    @Override // kotlin.time.q
    @dl.d
    public q v(long j10) {
        return q.a.c(this, j10);
    }
}
