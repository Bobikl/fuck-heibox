package kotlin.collections;

/* JADX INFO: compiled from: IndexedValue.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h0<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f124616a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f124617b;

    public h0(int i10, T t10) {
        this.f124616a = i10;
        this.f124617b = t10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ h0 d(h0 h0Var, int i10, Object obj, int i11, Object obj2) {
        if ((i11 & 1) != 0) {
            i10 = h0Var.f124616a;
        }
        if ((i11 & 2) != 0) {
            obj = h0Var.f124617b;
        }
        return h0Var.c(i10, obj);
    }

    public final int a() {
        return this.f124616a;
    }

    public final T b() {
        return this.f124617b;
    }

    @dl.d
    public final h0<T> c(int i10, T t10) {
        return new h0<>(i10, t10);
    }

    public final int e() {
        return this.f124616a;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h0)) {
            return false;
        }
        h0 h0Var = (h0) obj;
        return this.f124616a == h0Var.f124616a && kotlin.jvm.internal.f0.g(this.f124617b, h0Var.f124617b);
    }

    public final T f() {
        return this.f124617b;
    }

    public int hashCode() {
        int i10 = this.f124616a * 31;
        T t10 = this.f124617b;
        return i10 + (t10 == null ? 0 : t10.hashCode());
    }

    @dl.d
    public String toString() {
        return "IndexedValue(index=" + this.f124616a + ", value=" + this.f124617b + ')';
    }
}
