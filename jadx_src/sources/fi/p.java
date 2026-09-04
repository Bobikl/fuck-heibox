package fi;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class p implements r<Double> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f118889b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f118890c;

    public p(double d10, double d11) {
        this.f118889b = d10;
        this.f118890c = d11;
    }

    private final boolean e(double d10, double d11) {
        return d10 <= d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fi.r
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return b(((Number) comparable).doubleValue());
    }

    public boolean b(double d10) {
        return d10 >= this.f118889b && d10 < this.f118890c;
    }

    @Override // fi.r
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Double g() {
        return Double.valueOf(this.f118890c);
    }

    @Override // fi.r
    @dl.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Double D() {
        return Double.valueOf(this.f118889b);
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof p) {
            if (isEmpty() && ((p) obj).isEmpty()) {
                return true;
            }
            p pVar = (p) obj;
            if (this.f118889b == pVar.f118889b) {
                if (this.f118890c == pVar.f118890c) {
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
        return (androidx.compose.animation.core.s.a(this.f118889b) * 31) + androidx.compose.animation.core.s.a(this.f118890c);
    }

    @Override // fi.r
    public boolean isEmpty() {
        return this.f118889b >= this.f118890c;
    }

    @dl.d
    public String toString() {
        return this.f118889b + "..<" + this.f118890c;
    }
}
