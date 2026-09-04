package fi;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class e implements f<Float> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f118863b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f118864c;

    public e(float f10, float f11) {
        this.f118863b = f10;
        this.f118864c = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fi.f, fi.g
    public /* bridge */ /* synthetic */ boolean a(Comparable comparable) {
        return c(((Number) comparable).floatValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // fi.f
    public /* bridge */ /* synthetic */ boolean b(Comparable comparable, Comparable comparable2) {
        return g(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public boolean c(float f10) {
        return f10 >= this.f118863b && f10 <= this.f118864c;
    }

    @Override // fi.g
    @dl.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Float e() {
        return Float.valueOf(this.f118864c);
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof e) {
            if (isEmpty() && ((e) obj).isEmpty()) {
                return true;
            }
            e eVar = (e) obj;
            if (this.f118863b == eVar.f118863b) {
                if (this.f118864c == eVar.f118864c) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // fi.g
    @dl.d
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Float D() {
        return Float.valueOf(this.f118863b);
    }

    public boolean g(float f10, float f11) {
        return f10 <= f11;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.floatToIntBits(this.f118863b) * 31) + Float.floatToIntBits(this.f118864c);
    }

    @Override // fi.f, fi.g
    public boolean isEmpty() {
        return this.f118863b > this.f118864c;
    }

    @dl.d
    public String toString() {
        return this.f118863b + ".." + this.f118864c;
    }
}
