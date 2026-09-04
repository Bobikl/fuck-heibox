package kotlin;

/* JADX INFO: compiled from: UByteArray.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l1 {
    @u0(version = "1.3")
    @s
    @sh.f
    private static final byte[] a(int i10, yh.l<? super Integer, j1> init) {
        kotlin.jvm.internal.f0.p(init, "init");
        byte[] bArr = new byte[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            bArr[i11] = init.invoke(Integer.valueOf(i11)).o0();
        }
        return k1.g(bArr);
    }

    @u0(version = "1.3")
    @s
    @sh.f
    private static final byte[] b(byte... elements) {
        kotlin.jvm.internal.f0.p(elements, "elements");
        return elements;
    }
}
