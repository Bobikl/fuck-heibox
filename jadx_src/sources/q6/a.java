package q6;

/* JADX INFO: compiled from: ScaledCalculator.java */
/* JADX INFO: loaded from: classes6.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f138589a;

    public a(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("scale must be positive");
        }
        this.f138589a = f10;
    }

    @Override // q6.b
    public int a(int i10) {
        return (int) (i10 / this.f138589a);
    }

    @Override // q6.b
    public int b(int i10, float f10) {
        return (int) (i10 * this.f138589a);
    }
}
