package androidx.constraintlayout.core.parser;

/* JADX INFO: compiled from: CLNumber.java */
/* JADX INFO: loaded from: classes.dex */
public class e extends c {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    float f18074i;

    public e(float f10) {
        super(null);
        this.f18074i = f10;
    }

    public e(char[] cArr) {
        super(cArr);
        this.f18074i = Float.NaN;
    }

    public static c B(char[] cArr) {
        return new e(cArr);
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String A() {
        float fI = i();
        int i10 = (int) fI;
        if (i10 == fI) {
            return "" + i10;
        }
        return "" + fI;
    }

    public boolean D() {
        float fI = i();
        return ((float) ((int) fI)) == fI;
    }

    public void E(float f10) {
        this.f18074i = f10;
    }

    @Override // androidx.constraintlayout.core.parser.c
    public float i() {
        if (Float.isNaN(this.f18074i)) {
            this.f18074i = Float.parseFloat(b());
        }
        return this.f18074i;
    }

    @Override // androidx.constraintlayout.core.parser.c
    public int j() {
        if (Float.isNaN(this.f18074i)) {
            this.f18074i = Integer.parseInt(b());
        }
        return (int) this.f18074i;
    }

    @Override // androidx.constraintlayout.core.parser.c
    protected String y(int i10, int i11) {
        StringBuilder sb2 = new StringBuilder();
        a(sb2, i10);
        float fI = i();
        int i12 = (int) fI;
        if (i12 == fI) {
            sb2.append(i12);
        } else {
            sb2.append(fI);
        }
        return sb2.toString();
    }
}
