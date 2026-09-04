package kotlin.reflect.jvm.internal.impl.resolve.constants;

import kotlin.jvm.internal.f0;
import kotlin.reflect.jvm.internal.impl.types.d0;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final T f127533a;

    public g(T t10) {
        this.f127533a = t10;
    }

    @dl.d
    public abstract d0 a(@dl.d kotlin.reflect.jvm.internal.impl.descriptors.d0 d0Var);

    public T b() {
        return this.f127533a;
    }

    public boolean equals(@dl.e Object obj) {
        if (this != obj) {
            T tB = b();
            g gVar = obj instanceof g ? (g) obj : null;
            if (!f0.g(tB, gVar != null ? gVar.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        T tB = b();
        if (tB != null) {
            return tB.hashCode();
        }
        return 0;
    }

    @dl.d
    public String toString() {
        return String.valueOf(b());
    }
}
