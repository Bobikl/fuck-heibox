package h9;

/* JADX INFO: compiled from: MathUtils.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f119157a = 1.0E-4f;

    private a() {
    }

    public static float a(float f10, float f11, float f12, float f13) {
        return (float) Math.hypot(f12 - f10, f13 - f11);
    }

    public static float b(float f10, float f11, float f12, float f13, float f14, float f15) {
        return g(a(f10, f11, f12, f13), a(f10, f11, f14, f13), a(f10, f11, f14, f15), a(f10, f11, f12, f15));
    }

    public static float c(float f10, int i10) {
        float f11 = i10;
        int i11 = (int) (f10 / f11);
        if (Math.signum(f10) * f11 < 0.0f && i11 * i10 != f10) {
            i11--;
        }
        return f10 - (i11 * i10);
    }

    public static int d(int i10, int i11) {
        int i12 = i10 / i11;
        if ((i10 ^ i11) < 0 && i12 * i11 != i10) {
            i12--;
        }
        return i10 - (i12 * i11);
    }

    public static boolean e(float f10, float f11, float f12) {
        return f10 + f12 >= f11;
    }

    public static float f(float f10, float f11, float f12) {
        return ((1.0f - f12) * f10) + (f12 * f11);
    }

    private static float g(float f10, float f11, float f12, float f13) {
        if (f10 > f11 && f10 > f12 && f10 > f13) {
            return f10;
        }
        if (f11 <= f12 || f11 <= f13) {
            return f12 > f13 ? f12 : f13;
        }
        return f11;
    }
}
