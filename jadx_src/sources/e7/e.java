package e7;

/* JADX INFO: loaded from: classes6.dex */
public final class e<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final A f118586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final B f118587b;

    private e(A a10, B b10) {
        this.f118586a = a10;
        this.f118587b = b10;
    }

    public static <A, B> e<A, B> a(A a10, B b10) {
        return new e<>(a10, b10);
    }

    public A b() {
        return this.f118586a;
    }

    public B c() {
        return this.f118587b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || e.class != obj.getClass()) {
            return false;
        }
        e eVar = (e) obj;
        A a10 = this.f118586a;
        if (a10 == null) {
            if (eVar.f118586a != null) {
                return false;
            }
        } else if (!a10.equals(eVar.f118586a)) {
            return false;
        }
        B b10 = this.f118587b;
        B b11 = eVar.f118587b;
        if (b10 == null) {
            if (b11 != null) {
                return false;
            }
        } else if (!b10.equals(b11)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        A a10 = this.f118586a;
        int iHashCode = ((a10 == null ? 0 : a10.hashCode()) + 31) * 31;
        B b10 = this.f118587b;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }
}
