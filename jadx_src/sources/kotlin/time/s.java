package kotlin.time;

import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.u0;

/* JADX INFO: compiled from: measureTime.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = "1.3")
@k
public final class s<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f128648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f128649b;

    private s(T t10, long j10) {
        this.f128648a = t10;
        this.f128649b = j10;
    }

    public /* synthetic */ s(Object obj, long j10, u uVar) {
        this(obj, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ s d(s sVar, Object obj, long j10, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = sVar.f128648a;
        }
        if ((i10 & 2) != 0) {
            j10 = sVar.f128649b;
        }
        return sVar.c(obj, j10);
    }

    public final T a() {
        return this.f128648a;
    }

    public final long b() {
        return this.f128649b;
    }

    @dl.d
    public final s<T> c(T t10, long j10) {
        return new s<>(t10, j10, null);
    }

    public final long e() {
        return this.f128649b;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s)) {
            return false;
        }
        s sVar = (s) obj;
        return f0.g(this.f128648a, sVar.f128648a) && e.n(this.f128649b, sVar.f128649b);
    }

    public final T f() {
        return this.f128648a;
    }

    public int hashCode() {
        T t10 = this.f128648a;
        return ((t10 == null ? 0 : t10.hashCode()) * 31) + e.e0(this.f128649b);
    }

    @dl.d
    public String toString() {
        return "TimedValue(value=" + this.f128648a + ", duration=" + ((Object) e.z0(this.f128649b)) + ')';
    }
}
