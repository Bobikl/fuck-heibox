package kotlin;

/* JADX INFO: compiled from: ULongArray.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class t1 {
    @u0(version = "1.3")
    @s
    @sh.f
    private static final long[] a(int i10, yh.l<? super Integer, r1> init) {
        kotlin.jvm.internal.f0.p(init, "init");
        long[] jArr = new long[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            jArr[i11] = init.invoke(Integer.valueOf(i11)).q0();
        }
        return s1.g(jArr);
    }

    @u0(version = "1.3")
    @s
    @sh.f
    private static final long[] b(long... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return elements;
    }
}
