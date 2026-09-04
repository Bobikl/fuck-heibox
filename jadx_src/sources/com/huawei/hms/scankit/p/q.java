package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: BinaryShiftToken.java */
/* JADX INFO: loaded from: classes7.dex */
public final class q extends i7 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f62232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f62233d;

    q(i7 i7Var, int i10, int i11) {
        super(i7Var);
        this.f62232c = (short) i10;
        this.f62233d = (short) i11;
    }

    @Override // com.huawei.hms.scankit.p.i7
    public void a(r rVar, byte[] bArr) throws Exception {
        int i10 = 0;
        while (true) {
            short s10 = this.f62233d;
            if (i10 >= s10) {
                return;
            }
            if (i10 == 0 || (i10 == 31 && s10 <= 62)) {
                rVar.a(31, 5);
                short s11 = this.f62233d;
                if (s11 > 62) {
                    rVar.a(s11 - 31, 16);
                } else if (i10 == 0) {
                    rVar.a(Math.min((int) s11, 31), 5);
                } else {
                    rVar.a(s11 - 31, 5);
                }
            }
            rVar.a(bArr[this.f62232c + i10], 8);
            i10++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("<");
        sb2.append((int) this.f62232c);
        sb2.append("::");
        sb2.append((this.f62232c + this.f62233d) - 1);
        sb2.append(kotlin.text.y.f128597f);
        return sb2.toString();
    }
}
