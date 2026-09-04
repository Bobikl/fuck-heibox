package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: Dimension.java */
/* JADX INFO: loaded from: classes7.dex */
public final class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f62061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62062b;

    public int a() {
        return this.f62062b;
    }

    public int b() {
        return this.f62061a;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof l2)) {
            return false;
        }
        l2 l2Var = (l2) obj;
        return this.f62061a == l2Var.f62061a && this.f62062b == l2Var.f62062b;
    }

    public int hashCode() {
        return (this.f62061a * 32713) + this.f62062b;
    }

    public String toString() {
        return this.f62061a + "x" + this.f62062b;
    }
}
