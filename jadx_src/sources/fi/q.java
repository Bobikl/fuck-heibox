package fi;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class q implements r<Float> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f118891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f118892c;

    public q(float f10, float f11) {
        this.f118891b = f10;
        this.f118892c = f11;
    }

    private final boolean e(float f10, float f11) {
        return f10 <= f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fi.r
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return b(((Number) comparable).floatValue());
    }

    public boolean b(float f10) {
        return f10 >= this.f118891b && f10 < this.f118892c;
    }

    @Override // fi.r
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Float g() {
        return Float.valueOf(this.f118892c);
    }

    @Override // fi.r
    @dl.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float D() {
        return Float.valueOf(this.f118891b);
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof q) {
            if (isEmpty() && ((q) obj).isEmpty()) {
                return true;
            }
            q qVar = (q) obj;
            if (this.f118891b == qVar.f118891b) {
                if (this.f118892c == qVar.f118892c) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.f118891b) * 31) + Float.floatToIntBits(this.f118892c);
    }

    @Override // fi.r
    public boolean isEmpty() {
        return this.f118891b >= this.f118892c;
    }

    @dl.d
    public String toString() {
        return this.f118891b + "..<" + this.f118892c;
    }
}
