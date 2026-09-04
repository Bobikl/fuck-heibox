package kotlin;

import java.io.Serializable;

/* JADX INFO: compiled from: Tuples.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class Pair<A, B> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final A f124474b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final B f124475c;

    public Pair(A a10, B b10) {
        this.f124474b = a10;
        this.f124475c = b10;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Pair d(Pair pair, Object obj, Object obj2, int i10, Object obj3) {
        if ((i10 & 1) != 0) {
            obj = pair.f124474b;
        }
        if ((i10 & 2) != 0) {
            obj2 = pair.f124475c;
        }
        return pair.c(obj, obj2);
    }

    public final A a() {
        return this.f124474b;
    }

    public final B b() {
        return this.f124475c;
    }

    @dl.d
    public final Pair<A, B> c(A a10, B b10) {
        return new Pair<>(a10, b10);
    }

    public final A e() {
        return this.f124474b;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return kotlin.jvm.internal.f0.g(this.f124474b, pair.f124474b) && kotlin.jvm.internal.f0.g(this.f124475c, pair.f124475c);
    }

    public final B f() {
        return this.f124475c;
    }

    public int hashCode() {
        A a10 = this.f124474b;
        int iHashCode = (a10 == null ? 0 : a10.hashCode()) * 31;
        B b10 = this.f124475c;
        return iHashCode + (b10 != null ? b10.hashCode() : 0);
    }

    @dl.d
    public String toString() {
        return '(' + this.f124474b + ", " + this.f124475c + ')';
    }
}
