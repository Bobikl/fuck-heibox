package androidx.collection;

/* JADX INFO: compiled from: FloatSet.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/FloatSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,853:1\n1#2:854\n*E\n"})
public final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final h1 f3716a = new h1(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final float[] f3717b = new float[0];

    @dl.d
    public static final u a() {
        return f3716a;
    }

    @dl.d
    public static final u b() {
        return f3716a;
    }

    @dl.d
    public static final u c(float f10) {
        return j(f10);
    }

    @dl.d
    public static final u d(float f10, float f11) {
        return k(f10, f11);
    }

    @dl.d
    public static final u e(float f10, float f11, float f12) {
        return l(f10, f11, f12);
    }

    @dl.d
    public static final u f(@dl.d float... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        h1 h1Var = new h1(elements.length);
        h1Var.V(elements);
        return h1Var;
    }

    @dl.d
    public static final float[] g() {
        return f3717b;
    }

    public static final int h(float f10) {
        int iFloatToIntBits = Float.floatToIntBits(f10) * h2.f3616j;
        return iFloatToIntBits ^ (iFloatToIntBits << 16);
    }

    @dl.d
    public static final h1 i() {
        return new h1(0, 1, null);
    }

    @dl.d
    public static final h1 j(float f10) {
        h1 h1Var = new h1(1);
        h1Var.T(f10);
        return h1Var;
    }

    @dl.d
    public static final h1 k(float f10, float f11) {
        h1 h1Var = new h1(2);
        h1Var.T(f10);
        h1Var.T(f11);
        return h1Var;
    }

    @dl.d
    public static final h1 l(float f10, float f11, float f12) {
        h1 h1Var = new h1(3);
        h1Var.T(f10);
        h1Var.T(f11);
        h1Var.T(f12);
        return h1Var;
    }

    @dl.d
    public static final h1 m(@dl.d float... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        h1 h1Var = new h1(elements.length);
        h1Var.V(elements);
        return h1Var;
    }
}
