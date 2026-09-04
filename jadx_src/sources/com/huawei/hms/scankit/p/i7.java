package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: Token.java */
/* JADX INFO: loaded from: classes7.dex */
public abstract class i7 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final i7 f61956b = new a7(null, 0, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final i7 f61957a;

    i7(i7 i7Var) {
        this.f61957a = i7Var;
    }

    final i7 a() {
        return this.f61957a;
    }

    final i7 a(int i10, int i11) {
        return new a7(this, i10, i11);
    }

    abstract void a(r rVar, byte[] bArr);

    final i7 b(int i10, int i11) {
        return new q(this, i10, i11);
    }
}
