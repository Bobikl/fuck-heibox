package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class z extends m0<float[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final float[] f125004d;

    public z(int i10) {
        super(i10);
        this.f125004d = new float[i10];
    }

    public final void h(float f10) {
        float[] fArr = this.f125004d;
        int iB = b();
        e(iB + 1);
        fArr[iB] = f10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.m0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@dl.d float[] fArr) {
        f0.p(fArr, "<this>");
        return fArr.length;
    }

    @dl.d
    public final float[] j() {
        return g(this.f125004d, new float[f()]);
    }
}
