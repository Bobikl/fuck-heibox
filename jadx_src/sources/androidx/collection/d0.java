package androidx.collection;

/* JADX INFO: compiled from: IntList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nIntList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 IntList.kt\nandroidx/collection/MutableIntList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 IntList.kt\nandroidx/collection/IntListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final c0 f3572a = new k1(0);

    @dl.d
    public static final c0 a() {
        return f3572a;
    }

    @dl.d
    public static final c0 b() {
        return f3572a;
    }

    @dl.d
    public static final c0 c(int i10) {
        return h(i10);
    }

    @dl.d
    public static final c0 d(int i10, int i11) {
        return i(i10, i11);
    }

    @dl.d
    public static final c0 e(int i10, int i11, int i12) {
        return j(i10, i11, i12);
    }

    @dl.d
    public static final c0 f(@dl.d int... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        k1 k1Var = new k1(elements.length);
        k1Var.k0(elements);
        return k1Var;
    }

    @dl.d
    public static final k1 g() {
        return new k1(0, 1, null);
    }

    @dl.d
    public static final k1 h(int i10) {
        k1 k1Var = new k1(1);
        k1Var.X(i10);
        return k1Var;
    }

    @dl.d
    public static final k1 i(int i10, int i11) {
        k1 k1Var = new k1(2);
        k1Var.X(i10);
        k1Var.X(i11);
        return k1Var;
    }

    @dl.d
    public static final k1 j(int i10, int i11, int i12) {
        k1 k1Var = new k1(3);
        k1Var.X(i10);
        k1Var.X(i11);
        k1Var.X(i12);
        return k1Var;
    }

    @dl.d
    public static final k1 k(@dl.d int... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        k1 k1Var = new k1(elements.length);
        k1Var.k0(elements);
        return k1Var;
    }
}
