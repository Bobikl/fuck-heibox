package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e0 extends m0<int[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final int[] f124918d;

    public e0(int i10) {
        super(i10);
        this.f124918d = new int[i10];
    }

    public final void h(int i10) {
        int[] iArr = this.f124918d;
        int iB = b();
        e(iB + 1);
        iArr[iB] = i10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.m0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@dl.d int[] iArr) {
        f0.p(iArr, "<this>");
        return iArr.length;
    }

    @dl.d
    public final int[] j() {
        return g(this.f124918d, new int[f()]);
    }
}
