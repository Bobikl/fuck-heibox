package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class w extends m0<double[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final double[] f124987d;

    public w(int i10) {
        super(i10);
        this.f124987d = new double[i10];
    }

    public final void h(double d10) {
        double[] dArr = this.f124987d;
        int iB = b();
        e(iB + 1);
        dArr[iB] = d10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.m0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@dl.d double[] dArr) {
        f0.p(dArr, "<this>");
        return dArr.length;
    }

    @dl.d
    public final double[] j() {
        return g(this.f124987d, new double[f()]);
    }
}
