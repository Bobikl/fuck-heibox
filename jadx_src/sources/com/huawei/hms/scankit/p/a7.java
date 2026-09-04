package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: SimpleToken.java */
/* JADX INFO: loaded from: classes7.dex */
public final class a7 extends i7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f61537c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f61538d;

    a7(i7 i7Var, int i10, int i11) {
        super(i7Var);
        this.f61537c = (short) i10;
        this.f61538d = (short) i11;
    }

    @Override // com.huawei.hms.scankit.p.i7
    void a(r rVar, byte[] bArr) throws Exception {
        rVar.a(this.f61537c, this.f61538d);
    }

    public String toString() {
        short s10 = this.f61537c;
        int i10 = 1 << this.f61538d;
        return kotlin.text.y.f128596e + Integer.toBinaryString((s10 & (i10 - 1)) | i10 | (1 << this.f61538d)).substring(1) + kotlin.text.y.f128597f;
    }
}
