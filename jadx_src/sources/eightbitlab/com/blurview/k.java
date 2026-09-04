package eightbitlab.com.blurview;

/* JADX INFO: compiled from: SizeScaler.java */
/* JADX INFO: loaded from: classes4.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f118724b = 64;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f118725a;

    /* JADX INFO: compiled from: SizeScaler.java */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final int f118726a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f118727b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final float f118728c;

        a(int i10, int i11, float f10) {
            this.f118726a = i10;
            this.f118727b = i11;
            this.f118728c = f10;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f118726a == aVar.f118726a && this.f118727b == aVar.f118727b && Float.compare(aVar.f118728c, this.f118728c) == 0;
        }

        public int hashCode() {
            int i10 = ((this.f118726a * 31) + this.f118727b) * 31;
            float f10 = this.f118728c;
            return i10 + (f10 != 0.0f ? Float.floatToIntBits(f10) : 0);
        }

        public String toString() {
            return "Size{width=" + this.f118726a + ", height=" + this.f118727b + ", scaleFactor=" + this.f118728c + '}';
        }
    }

    public k(float f10) {
        this.f118725a = f10;
    }

    private int a(float f10) {
        return (int) Math.ceil(f10 / this.f118725a);
    }

    private int c(int i10) {
        int i11 = i10 % 64;
        return i11 == 0 ? i10 : (i10 - i11) + 64;
    }

    boolean b(int i10, int i11) {
        return a((float) i11) == 0 || a((float) i10) == 0;
    }

    a d(int i10, int i11) {
        float f10 = i10;
        int iC = c(a(f10));
        float f11 = f10 / iC;
        return new a(iC, (int) Math.ceil(i11 / f11), f11);
    }
}
