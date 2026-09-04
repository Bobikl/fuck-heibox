package org.ahocorasick.interval;

/* JADX INFO: compiled from: Interval.java */
/* JADX INFO: loaded from: classes5.dex */
public class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f132784b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f132785c;

    public a(int i10, int i11) {
        this.f132784b = i10;
        this.f132785c = i11;
    }

    @Override // org.ahocorasick.interval.c
    public int D() {
        return this.f132784b;
    }

    @Override // org.ahocorasick.interval.c
    public int G() {
        return this.f132785c;
    }

    public boolean a(int i10) {
        return this.f132784b <= i10 && i10 <= this.f132785c;
    }

    public boolean b(a aVar) {
        return this.f132784b <= aVar.G() && this.f132785c >= aVar.D();
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        if (!(obj instanceof c)) {
            return -1;
        }
        c cVar = (c) obj;
        int iD = this.f132784b - cVar.D();
        return iD != 0 ? iD : this.f132785c - cVar.G();
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f132784b == cVar.D() && this.f132785c == cVar.G();
    }

    public int hashCode() {
        return (this.f132784b % 100) + (this.f132785c % 100);
    }

    @Override // org.ahocorasick.interval.c
    public int size() {
        return (this.f132785c - this.f132784b) + 1;
    }

    public String toString() {
        return this.f132784b + ":" + this.f132785c;
    }
}
