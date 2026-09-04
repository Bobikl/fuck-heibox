package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class m extends m0<boolean[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final boolean[] f124936d;

    public m(int i10) {
        super(i10);
        this.f124936d = new boolean[i10];
    }

    public final void h(boolean z10) {
        boolean[] zArr = this.f124936d;
        int iB = b();
        e(iB + 1);
        zArr[iB] = z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.m0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@dl.d boolean[] zArr) {
        f0.p(zArr, "<this>");
        return zArr.length;
    }

    @dl.d
    public final boolean[] j() {
        return g(this.f124936d, new boolean[f()]);
    }
}
