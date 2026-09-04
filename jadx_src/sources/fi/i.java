package fi;

import java.lang.Comparable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Ranges.kt */
/* JADX INFO: loaded from: classes5.dex */
public class i<T extends Comparable<? super T>> implements g<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final T f118867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final T f118868c;

    public i(@dl.d T start, @dl.d T endInclusive) {
        f0.p(start, "start");
        f0.p(endInclusive, "endInclusive");
        this.f118867b = start;
        this.f118868c = endInclusive;
    }

    @Override // fi.g
    @dl.d
    public T D() {
        return this.f118867b;
    }

    @Override // fi.g
    public boolean a(@dl.d T t10) {
        return g.a.a(this, t10);
    }

    @Override // fi.g
    @dl.d
    public T e() {
        return this.f118868c;
    }

    public boolean equals(@dl.e Object obj) {
        if (obj instanceof i) {
            if (!isEmpty() || !((i) obj).isEmpty()) {
                i iVar = (i) obj;
                if (!f0.g(D(), iVar.D()) || !f0.g(e(), iVar.e())) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (D().hashCode() * 31) + e().hashCode();
    }

    @Override // fi.g
    public boolean isEmpty() {
        return g.a.b(this);
    }

    @dl.d
    public String toString() {
        return D() + ".." + e();
    }
}
