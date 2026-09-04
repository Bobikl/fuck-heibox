package androidx.collection;

/* JADX INFO: compiled from: LongSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/LongSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,853:1\n1#2:854\n*E\n"})
public final class w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final t1 f3726a = new t1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final long[] f3727b = new long[0];

    @dl.d
    public static final v0 a() {
        return f3726a;
    }

    @dl.d
    public static final long[] b() {
        return f3727b;
    }

    public static final int c(long j10) {
        int iA = k.a(j10) * h2.f3616j;
        return iA ^ (iA << 16);
    }

    @dl.d
    public static final v0 d() {
        return f3726a;
    }

    @dl.d
    public static final v0 e(long j10) {
        return j(j10);
    }

    @dl.d
    public static final v0 f(long j10, long j11) {
        return k(j10, j11);
    }

    @dl.d
    public static final v0 g(long j10, long j11, long j12) {
        return l(j10, j11, j12);
    }

    @dl.d
    public static final v0 h(@dl.d long... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        t1 t1Var = new t1(elements.length);
        t1Var.V(elements);
        return t1Var;
    }

    @dl.d
    public static final t1 i() {
        return new t1(0, 1, null);
    }

    @dl.d
    public static final t1 j(long j10) {
        t1 t1Var = new t1(1);
        t1Var.T(j10);
        return t1Var;
    }

    @dl.d
    public static final t1 k(long j10, long j11) {
        t1 t1Var = new t1(2);
        t1Var.T(j10);
        t1Var.T(j11);
        return t1Var;
    }

    @dl.d
    public static final t1 l(long j10, long j11, long j12) {
        t1 t1Var = new t1(3);
        t1Var.T(j10);
        t1Var.T(j11);
        t1Var.T(j12);
        return t1Var;
    }

    @dl.d
    public static final t1 m(@dl.d long... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        t1 t1Var = new t1(elements.length);
        t1Var.V(elements);
        return t1Var;
    }
}
