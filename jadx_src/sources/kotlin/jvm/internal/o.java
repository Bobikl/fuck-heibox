package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class o extends m0<byte[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final byte[] f124948d;

    public o(int i10) {
        super(i10);
        this.f124948d = new byte[i10];
    }

    public final void h(byte b10) {
        byte[] bArr = this.f124948d;
        int iB = b();
        e(iB + 1);
        bArr[iB] = b10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.m0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@dl.d byte[] bArr) {
        f0.p(bArr, "<this>");
        return bArr.length;
    }

    @dl.d
    public final byte[] j() {
        return g(this.f124948d, new byte[f()]);
    }
}
