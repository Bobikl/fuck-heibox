package kotlin.text;

import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Regex.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final String f128585a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final fi.l f128586b;

    public h(@dl.d String value, @dl.d fi.l range) {
        f0.p(value, "value");
        f0.p(range, "range");
        this.f128585a = value;
        this.f128586b = range;
    }

    public static /* synthetic */ h d(h hVar, String str, fi.l lVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = hVar.f128585a;
        }
        if ((i10 & 2) != 0) {
            lVar = hVar.f128586b;
        }
        return hVar.c(str, lVar);
    }

    @dl.d
    public final String a() {
        return this.f128585a;
    }

    @dl.d
    public final fi.l b() {
        return this.f128586b;
    }

    @dl.d
    public final h c(@dl.d String value, @dl.d fi.l range) {
        f0.p(value, "value");
        f0.p(range, "range");
        return new h(value, range);
    }

    @dl.d
    public final fi.l e() {
        return this.f128586b;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return f0.g(this.f128585a, hVar.f128585a) && f0.g(this.f128586b, hVar.f128586b);
    }

    @dl.d
    public final String f() {
        return this.f128585a;
    }

    public int hashCode() {
        return (this.f128585a.hashCode() * 31) + this.f128586b.hashCode();
    }

    @dl.d
    public String toString() {
        return "MatchGroup(value=" + this.f128585a + ", range=" + this.f128586b + ')';
    }
}
