package androidx.core.util;

import androidx.annotation.n0;

/* JADX INFO: compiled from: Pair.java */
/* JADX INFO: loaded from: classes.dex */
public class k<F, S> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final F f21263a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S f21264b;

    public k(F f10, S s10) {
        this.f21263a = f10;
        this.f21264b = s10;
    }

    @n0
    public static <A, B> k<A, B> a(A a10, B b10) {
        return new k<>(a10, b10);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return j.a(kVar.f21263a, this.f21263a) && j.a(kVar.f21264b, this.f21264b);
    }

    public int hashCode() {
        F f10 = this.f21263a;
        int iHashCode = f10 == null ? 0 : f10.hashCode();
        S s10 = this.f21264b;
        return iHashCode ^ (s10 != null ? s10.hashCode() : 0);
    }

    @n0
    public String toString() {
        return "Pair{" + this.f21263a + " " + this.f21264b + z5.g.f141884d;
    }
}
