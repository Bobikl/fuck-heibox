package kotlin;

/* JADX INFO: compiled from: UShortArray.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z1 {
    @u0(version = "1.3")
    @s
    @sh.f
    private static final short[] a(int i10, yh.l<? super Integer, x1> init) {
        kotlin.jvm.internal.f0.p(init, "init");
        short[] sArr = new short[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            sArr[i11] = init.invoke(Integer.valueOf(i11)).o0();
        }
        return y1.g(sArr);
    }

    @u0(version = "1.3")
    @s
    @sh.f
    private static final short[] b(short... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return elements;
    }
}
