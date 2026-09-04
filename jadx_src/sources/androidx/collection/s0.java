package androidx.collection;

/* JADX INFO: compiled from: LongLongPair.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f3698a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f3699b;

    public s0(long j10, long j11) {
        this.f3698a = j10;
        this.f3699b = j11;
    }

    public final long a() {
        return c();
    }

    public final long b() {
        return d();
    }

    public final long c() {
        return this.f3698a;
    }

    public final long d() {
        return this.f3699b;
    }

    public boolean equals(@dl.e Object obj) {
        if (!(obj instanceof s0)) {
            return false;
        }
        s0 s0Var = (s0) obj;
        return s0Var.f3698a == this.f3698a && s0Var.f3699b == this.f3699b;
    }

    public int hashCode() {
        return k.a(this.f3698a) ^ k.a(this.f3699b);
    }

    @dl.d
    public String toString() {
        return '(' + this.f3698a + ", " + this.f3699b + ')';
    }
}
