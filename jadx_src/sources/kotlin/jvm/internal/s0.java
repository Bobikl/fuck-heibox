package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class s0 extends m0<short[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final short[] f124974d;

    public s0(int i10) {
        super(i10);
        this.f124974d = new short[i10];
    }

    public final void h(short s10) {
        short[] sArr = this.f124974d;
        int iB = b();
        e(iB + 1);
        sArr[iB] = s10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.m0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@dl.d short[] sArr) {
        f0.p(sArr, "<this>");
        return sArr.length;
    }

    @dl.d
    public final short[] j() {
        return g(this.f124974d, new short[f()]);
    }
}
