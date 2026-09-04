package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: ASCIIEncoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class b implements v2 {
    b() {
    }

    private static char a(char c10, char c11) throws Exception {
        if (d4.b(c10) && d4.b(c11)) {
            return (char) (((c10 - '0') * 10) + (c11 - '0') + 130);
        }
        try {
            throw new IllegalArgumentException("not digits: " + c10 + c11);
        } catch (Exception e10) {
            throw e10;
        }
    }

    public int a() {
        return 0;
    }

    @Override // com.huawei.hms.scankit.p.v2
    public void a(y2 y2Var) throws Exception {
        if (d4.a(y2Var.d(), y2Var.f62582f) >= 2) {
            y2Var.a(a(y2Var.d().charAt(y2Var.f62582f), y2Var.d().charAt(y2Var.f62582f + 1)));
            y2Var.f62582f += 2;
            return;
        }
        char c10 = y2Var.c();
        int iA = d4.a(y2Var.d(), y2Var.f62582f, a());
        if (iA == a()) {
            if (!d4.c(c10)) {
                y2Var.a((char) (c10 + 1));
                y2Var.f62582f++;
                return;
            } else {
                y2Var.a((char) 235);
                y2Var.a((char) ((c10 - 128) + 1));
                y2Var.f62582f++;
                return;
            }
        }
        if (iA == 1) {
            y2Var.a((char) 230);
            y2Var.b(1);
            return;
        }
        if (iA == 2) {
            y2Var.a((char) 239);
            y2Var.b(2);
            return;
        }
        if (iA == 3) {
            y2Var.a((char) 238);
            y2Var.b(3);
            return;
        }
        if (iA == 4) {
            y2Var.a((char) 240);
            y2Var.b(4);
        } else {
            if (iA == 5) {
                y2Var.a((char) 231);
                y2Var.b(5);
                return;
            }
            try {
                throw new IllegalStateException("Illegal mode: " + iA);
            } catch (Exception e10) {
                throw e10;
            }
        }
    }
}
