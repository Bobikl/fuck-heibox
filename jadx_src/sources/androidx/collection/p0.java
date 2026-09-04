package androidx.collection;

/* JADX INFO: compiled from: LongList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nLongList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 LongList.kt\nandroidx/collection/MutableLongList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 LongList.kt\nandroidx/collection/LongListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final o0 f3678a = new q1(0);

    @dl.d
    public static final o0 a() {
        return f3678a;
    }

    @dl.d
    public static final o0 b() {
        return f3678a;
    }

    @dl.d
    public static final o0 c(long j10) {
        return h(j10);
    }

    @dl.d
    public static final o0 d(long j10, long j11) {
        return i(j10, j11);
    }

    @dl.d
    public static final o0 e(long j10, long j11, long j12) {
        return j(j10, j11, j12);
    }

    @dl.d
    public static final o0 f(@dl.d long... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        q1 q1Var = new q1(elements.length);
        q1Var.k0(elements);
        return q1Var;
    }

    @dl.d
    public static final q1 g() {
        return new q1(0, 1, null);
    }

    @dl.d
    public static final q1 h(long j10) {
        q1 q1Var = new q1(1);
        q1Var.X(j10);
        return q1Var;
    }

    @dl.d
    public static final q1 i(long j10, long j11) {
        q1 q1Var = new q1(2);
        q1Var.X(j10);
        q1Var.X(j11);
        return q1Var;
    }

    @dl.d
    public static final q1 j(long j10, long j11, long j12) {
        q1 q1Var = new q1(3);
        q1Var.X(j10);
        q1Var.X(j11);
        q1Var.X(j12);
        return q1Var;
    }

    @dl.d
    public static final q1 k(@dl.d long... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        q1 q1Var = new q1(elements.length);
        q1Var.k0(elements);
        return q1Var;
    }
}
