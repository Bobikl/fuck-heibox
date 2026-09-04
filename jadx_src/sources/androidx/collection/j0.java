package androidx.collection;

/* JADX INFO: compiled from: IntSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nIntSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntSet.kt\nandroidx/collection/IntSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,853:1\n1#2:854\n*E\n"})
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final n1 f3631a = new n1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final int[] f3632b = new int[0];

    @dl.d
    public static final i0 a() {
        return f3631a;
    }

    @dl.d
    public static final int[] b() {
        return f3632b;
    }

    public static final int c(int i10) {
        int i11 = i10 * h2.f3616j;
        return i11 ^ (i11 << 16);
    }

    @dl.d
    public static final i0 d() {
        return f3631a;
    }

    @dl.d
    public static final i0 e(int i10) {
        return j(i10);
    }

    @dl.d
    public static final i0 f(int i10, int i11) {
        return k(i10, i11);
    }

    @dl.d
    public static final i0 g(int i10, int i11, int i12) {
        return l(i10, i11, i12);
    }

    @dl.d
    public static final i0 h(@dl.d int... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        n1 n1Var = new n1(elements.length);
        n1Var.V(elements);
        return n1Var;
    }

    @dl.d
    public static final n1 i() {
        return new n1(0, 1, null);
    }

    @dl.d
    public static final n1 j(int i10) {
        n1 n1Var = new n1(1);
        n1Var.T(i10);
        return n1Var;
    }

    @dl.d
    public static final n1 k(int i10, int i11) {
        n1 n1Var = new n1(2);
        n1Var.T(i10);
        n1Var.T(i11);
        return n1Var;
    }

    @dl.d
    public static final n1 l(int i10, int i11, int i12) {
        n1 n1Var = new n1(3);
        n1Var.T(i10);
        n1Var.T(i11);
        n1Var.T(i12);
        return n1Var;
    }

    @dl.d
    public static final n1 m(@dl.d int... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        n1 n1Var = new n1(elements.length);
        n1Var.V(elements);
        return n1Var;
    }
}
