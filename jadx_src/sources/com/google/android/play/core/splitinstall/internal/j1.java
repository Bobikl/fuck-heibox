package com.google.android.play.core.splitinstall.internal;

/* JADX INFO: compiled from: com.google.android.play:feature-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes7.dex */
public final class j1 extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f56296a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f56297b;

    j1(int i10, long j10) {
        this.f56296a = i10;
        this.f56297b = j10;
    }

    @Override // com.google.android.play.core.splitinstall.internal.k1
    public final int a() {
        return this.f56296a;
    }

    @Override // com.google.android.play.core.splitinstall.internal.k1
    public final long b() {
        return this.f56297b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (this.f56296a == k1Var.a() && this.f56297b == k1Var.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f56296a ^ 1000003;
        long j10 = this.f56297b;
        return (i10 * 1000003) ^ ((int) (j10 ^ (j10 >>> 32)));
    }

    public final String toString() {
        return "EventRecord{eventType=" + this.f56296a + ", eventTimestamp=" + this.f56297b + z5.g.f141884d;
    }
}
