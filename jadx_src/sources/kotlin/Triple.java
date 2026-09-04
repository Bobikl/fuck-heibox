package kotlin;

import java.io.Serializable;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Triple<A, B, C> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f124487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B f124488c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final C f124489d;

    public Triple(A a10, B b10, C c10) {
        this.f124487b = a10;
        this.f124488c = b10;
        this.f124489d = c10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Triple e(Triple triple, Object obj, Object obj2, Object obj3, int i10, Object obj4) {
        if ((i10 & 1) != 0) {
            obj = triple.f124487b;
        }
        if ((i10 & 2) != 0) {
            obj2 = triple.f124488c;
        }
        if ((i10 & 4) != 0) {
            obj3 = triple.f124489d;
        }
        return triple.d(obj, obj2, obj3);
    }

    public final A a() {
        return this.f124487b;
    }

    public final B b() {
        return this.f124488c;
    }

    public final C c() {
        return this.f124489d;
    }

    @dl.d
    public final Triple<A, B, C> d(A a10, B b10, C c10) {
        return new Triple<>(a10, b10, c10);
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Triple)) {
            return false;
        }
        Triple triple = (Triple) obj;
        return kotlin.jvm.internal.f0.g(this.f124487b, triple.f124487b) && kotlin.jvm.internal.f0.g(this.f124488c, triple.f124488c) && kotlin.jvm.internal.f0.g(this.f124489d, triple.f124489d);
    }

    public final A f() {
        return this.f124487b;
    }

    public final B g() {
        return this.f124488c;
    }

    public final C h() {
        return this.f124489d;
    }

    public int hashCode() {
        A a10 = this.f124487b;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f124488c;
        int iHashCode2 = (iHashCode + (b10 == null ? 0 : b10.hashCode())) * 31;
        C c10 = this.f124489d;
        return iHashCode2 + (c10 != null ? c10.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        return '(' + this.f124487b + ", " + this.f124488c + ", " + this.f124489d + ')';
    }
}
