package fi;

import java.lang.Comparable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
public class h<T extends Comparable<? super T>> implements r<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final T f118865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final T f118866c;

    public h(@dl.d T start, @dl.d T endExclusive) {
        f0.p(start, "start");
        f0.p(endExclusive, "endExclusive");
        this.f118865b = start;
        this.f118866c = endExclusive;
    }

    @Override // fi.r
    @dl.d
    public T D() {
        return this.f118865b;
    }

    @Override // fi.r
    public boolean a(@dl.d T t10) {
        return r.a.a(this, t10);
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof h) {
            if (!isEmpty() || !((h) obj).isEmpty()) {
                h hVar = (h) obj;
                if (!f0.g(D(), hVar.D()) || !f0.g(g(), hVar.g())) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // fi.r
    @dl.d
    public T g() {
        return this.f118866c;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (D().hashCode() * 31) + g().hashCode();
    }

    @Override // fi.r
    public boolean isEmpty() {
        return r.a.b(this);
    }

    @dl.d
    public String toString() {
        return D() + "..<" + g();
    }
}
