package androidx.constraintlayout.core.widgets;

/* JADX INFO: compiled from: Rectangle.java */
/* JADX INFO: loaded from: classes.dex */
public class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f18501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f18502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f18503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f18504d;

    public boolean a(int i10, int i11) {
        int i12;
        int i13 = this.f18501a;
        return i10 >= i13 && i10 < i13 + this.f18503c && i11 >= (i12 = this.f18502b) && i11 < i12 + this.f18504d;
    }

    public int b() {
        return (this.f18501a + this.f18503c) / 2;
    }

    public int c() {
        return (this.f18502b + this.f18504d) / 2;
    }

    void d(int i10, int i11) {
        this.f18501a -= i10;
        this.f18502b -= i11;
        this.f18503c += i10 * 2;
        this.f18504d += i11 * 2;
    }

    boolean e(k kVar) {
        int i10;
        int i11;
        int i12 = this.f18501a;
        int i13 = kVar.f18501a;
        return i12 >= i13 && i12 < i13 + kVar.f18503c && (i10 = this.f18502b) >= (i11 = kVar.f18502b) && i10 < i11 + kVar.f18504d;
    }

    public void f(int i10, int i11, int i12, int i13) {
        this.f18501a = i10;
        this.f18502b = i11;
        this.f18503c = i12;
        this.f18504d = i13;
    }
}
