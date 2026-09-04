package kotlin;

/* JADX INFO: compiled from: UIntArray.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p1 {
    @u0(version = "1.3")
    @s
    @sh.f
    private static final int[] a(int i10, yh.l<? super Integer, n1> init) {
        kotlin.jvm.internal.f0.p(init, "init");
        int[] iArr = new int[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = init.invoke(Integer.valueOf(i11)).q0();
        }
        return o1.g(iArr);
    }

    @u0(version = "1.3")
    @s
    @sh.f
    private static final int[] b(int... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return elements;
    }
}
