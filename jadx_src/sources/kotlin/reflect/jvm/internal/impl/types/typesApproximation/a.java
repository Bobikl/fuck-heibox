package kotlin.reflect.jvm.internal.impl.types.typesApproximation;

import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CapturedTypeApproximation.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f128185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T f128186b;

    public a(T t10, T t11) {
        this.f128185a = t10;
        this.f128186b = t11;
    }

    public final T a() {
        return this.f128185a;
    }

    public final T b() {
        return this.f128186b;
    }

    public final T c() {
        return this.f128185a;
    }

    public final T d() {
        return this.f128186b;
    }

    public boolean equals(@e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return f0.g(this.f128185a, aVar.f128185a) && f0.g(this.f128186b, aVar.f128186b);
    }

    public int hashCode() {
        T t10 = this.f128185a;
        int iHashCode = (t10 == null ? 0 : t10.hashCode()) * 31;
        T t11 = this.f128186b;
        return iHashCode + (t11 != null ? t11.hashCode() : 0);
    }

    @d
    public String toString() {
        return "ApproximationBounds(lower=" + this.f128185a + ", upper=" + this.f128186b + ')';
    }
}
