package kotlin.reflect.jvm.internal.impl.types;

/* JADX INFO: compiled from: TypeProjectionBase.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class d1 implements c1 {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return b() == c1Var.b() && c() == c1Var.c() && getType().equals(c1Var.getType());
    }

    public int hashCode() {
        int iHashCode = c().hashCode();
        if (i1.w(getType())) {
            return (iHashCode * 31) + 19;
        }
        return (iHashCode * 31) + (b() ? 17 : getType().hashCode());
    }

    public String toString() {
        if (b()) {
            return androidx.webkit.b.f28327e;
        }
        if (c() == Variance.INVARIANT) {
            return getType().toString();
        }
        return c() + " " + getType();
    }
}
