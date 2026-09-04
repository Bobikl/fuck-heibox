package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: Codeword.java */
/* JADX INFO: loaded from: classes7.dex */
public final class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f62541a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f62542b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f62543c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f62544d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f62545e = -1;

    x0(int i10, int i11, int i12, int i13) {
        this.f62541a = i10;
        this.f62542b = i11;
        this.f62543c = i12;
        this.f62544d = i13;
    }

    int a() {
        return this.f62543c;
    }

    boolean a(int i10) {
        return i10 != -1 && this.f62543c == (i10 % 3) * 3;
    }

    int b() {
        return this.f62542b;
    }

    void b(int i10) {
        this.f62545e = i10;
    }

    int c() {
        return this.f62545e;
    }

    int d() {
        return this.f62541a;
    }

    int e() {
        return this.f62544d;
    }

    int f() {
        return this.f62542b - this.f62541a;
    }

    boolean g() {
        return a(this.f62545e);
    }

    void h() {
        this.f62545e = ((this.f62544d / 30) * 3) + (this.f62543c / 3);
    }

    public String toString() {
        return this.f62545e + "|" + this.f62544d;
    }
}
