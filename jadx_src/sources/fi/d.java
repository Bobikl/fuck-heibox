package fi;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d implements f<Double> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final double f118861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final double f118862c;

    public d(double d10, double d11) {
        this.f118861b = d10;
        this.f118862c = d11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fi.f, fi.g
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return c(((Number) comparable).doubleValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fi.f
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable, Comparable comparable2) {
        return g(((Number) comparable).doubleValue(), ((Number) comparable2).doubleValue());
    }

    public boolean c(double d10) {
        return d10 >= this.f118861b && d10 <= this.f118862c;
    }

    @Override // fi.g
    @dl.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Double e() {
        return Double.valueOf(this.f118862c);
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof d) {
            if (isEmpty() && ((d) obj).isEmpty()) {
                return true;
            }
            d dVar = (d) obj;
            if (this.f118861b == dVar.f118861b) {
                if (this.f118862c == dVar.f118862c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // fi.g
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Double D() {
        return Double.valueOf(this.f118861b);
    }

    public boolean g(double d10, double d11) {
        return d10 <= d11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (androidx.compose.animation.core.s.a(this.f118861b) * 31) + androidx.compose.animation.core.s.a(this.f118862c);
    }

    @Override // fi.f, fi.g
    public boolean isEmpty() {
        return this.f118861b > this.f118862c;
    }

    @dl.d
    public String toString() {
        return this.f118861b + ".." + this.f118862c;
    }
}
