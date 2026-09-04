package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: X12Encoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n8 extends d0 {
    n8() {
    }

    @Override // com.huawei.hms.scankit.p.d0
    public int a() {
        return 3;
    }

    @Override // com.huawei.hms.scankit.p.d0
    int a(char c10, StringBuilder sb2) throws Exception {
        if (c10 == '\r') {
            sb2.append((char) 0);
        } else if (c10 == ' ') {
            sb2.append((char) 3);
        } else if (c10 == '*') {
            sb2.append((char) 1);
        } else if (c10 == '>') {
            sb2.append((char) 2);
        } else if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) ((c10 - '0') + 4));
        } else if (c10 < 'A' || c10 > 'Z') {
            d4.a(c10);
        } else {
            sb2.append((char) ((c10 - 'A') + 14));
        }
        return 1;
    }

    @Override // com.huawei.hms.scankit.p.d0, com.huawei.hms.scankit.p.v2
    public void a(y2 y2Var) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        while (y2Var.i()) {
            char c10 = y2Var.c();
            y2Var.f62582f++;
            a(c10, sb2);
            if (sb2.length() % 3 == 0) {
                d0.b(y2Var, sb2);
                if (d4.a(y2Var.d(), y2Var.f62582f, a()) != a()) {
                    y2Var.b(0);
                    break;
                }
            }
        }
        a(y2Var, sb2);
    }

    @Override // com.huawei.hms.scankit.p.d0
    void a(y2 y2Var, StringBuilder sb2) {
        y2Var.l();
        int iA = y2Var.g().a() - y2Var.a();
        y2Var.f62582f -= sb2.length();
        if (y2Var.f() > 1 || iA > 1 || y2Var.f() != iA) {
            y2Var.a((char) 254);
        }
        if (y2Var.e() < 0) {
            y2Var.b(0);
        }
    }
}
