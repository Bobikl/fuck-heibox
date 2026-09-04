package androidx.collection;

/* JADX INFO: compiled from: FloatList.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nFloatList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 FloatList.kt\nandroidx/collection/MutableFloatList\n*L\n1#1,969:1\n1#2:970\n713#3,2:971\n713#3,2:973\n713#3,2:975\n713#3,2:977\n713#3,2:979\n713#3,2:981\n*S KotlinDebug\n*F\n+ 1 FloatList.kt\nandroidx/collection/FloatListKt\n*L\n938#1:971,2\n947#1:973,2\n948#1:975,2\n958#1:977,2\n959#1:979,2\n960#1:981,2\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final o f3677a = new e1(0);

    @dl.d
    public static final o a() {
        return f3677a;
    }

    @dl.d
    public static final o b() {
        return f3677a;
    }

    @dl.d
    public static final o c(float f10) {
        return h(f10);
    }

    @dl.d
    public static final o d(float f10, float f11) {
        return i(f10, f11);
    }

    @dl.d
    public static final o e(float f10, float f11, float f12) {
        return j(f10, f11, f12);
    }

    @dl.d
    public static final o f(@dl.d float... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        e1 e1Var = new e1(elements.length);
        e1Var.k0(elements);
        return e1Var;
    }

    @dl.d
    public static final e1 g() {
        return new e1(0, 1, null);
    }

    @dl.d
    public static final e1 h(float f10) {
        e1 e1Var = new e1(1);
        e1Var.X(f10);
        return e1Var;
    }

    @dl.d
    public static final e1 i(float f10, float f11) {
        e1 e1Var = new e1(2);
        e1Var.X(f10);
        e1Var.X(f11);
        return e1Var;
    }

    @dl.d
    public static final e1 j(float f10, float f11, float f12) {
        e1 e1Var = new e1(3);
        e1Var.X(f10);
        e1Var.X(f11);
        e1Var.X(f12);
        return e1Var;
    }

    @dl.d
    public static final e1 k(@dl.d float... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        e1 e1Var = new e1(elements.length);
        e1Var.k0(elements);
        return e1Var;
    }
}
