package kotlin.jvm.internal;

/* JADX INFO: compiled from: PrimitiveSpreadBuilders.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q extends m0<char[]> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final char[] f124961d;

    public q(int i10) {
        super(i10);
        this.f124961d = new char[i10];
    }

    public final void h(char c10) {
        char[] cArr = this.f124961d;
        int iB = b();
        e(iB + 1);
        cArr[iB] = c10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kotlin.jvm.internal.m0
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public int c(@dl.d char[] cArr) {
        f0.p(cArr, "<this>");
        return cArr.length;
    }

    @dl.d
    public final char[] j() {
        return g(this.f124961d, new char[f()]);
    }
}
