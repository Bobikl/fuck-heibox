package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j0 extends m0<long[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final long[] f124930d;

    public j0(int i10) {
        super(i10);
        this.f124930d = new long[i10];
    }

    public final void h(long j10) {
        long[] jArr = this.f124930d;
        int iB = b();
        e(iB + 1);
        jArr[iB] = j10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.m0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@dl.d long[] jArr) {
        f0.p(jArr, "<this>");
        return jArr.length;
    }

    @dl.d
    public final long[] j() {
        return g(this.f124930d, new long[f()]);
    }
}
