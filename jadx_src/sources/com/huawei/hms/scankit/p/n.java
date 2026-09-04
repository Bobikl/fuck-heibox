package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: Base256Encoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class n implements v2 {
    n() {
    }

    private static char a(char c10, int i10) {
        int i11 = c10 + ((i10 * 149) % 255) + 1;
        return i11 <= 255 ? (char) i11 : (char) (i11 + androidx.core.view.o.f21773u);
    }

    public int a() {
        return 5;
    }

    @Override // com.huawei.hms.scankit.p.v2
    public void a(y2 y2Var) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) 0);
        while (y2Var.i()) {
            sb2.append(y2Var.c());
            y2Var.f62582f++;
            if (d4.a(y2Var.d(), y2Var.f62582f, a()) != a()) {
                y2Var.b(0);
                break;
            }
        }
        int length = sb2.length() - 1;
        int iA = y2Var.a() + length + 1;
        y2Var.c(iA);
        boolean z10 = y2Var.g().a() - iA > 0;
        if (y2Var.i() || z10) {
            if (length <= 249) {
                sb2.setCharAt(0, (char) length);
            } else {
                if (length > 1555) {
                    try {
                        throw new IllegalStateException("Message length not in valid ranges: " + length);
                    } catch (Exception e10) {
                        throw e10;
                    }
                }
                sb2.setCharAt(0, (char) ((length / 250) + bb.c.b.P1));
                sb2.insert(1, (char) (length % 250));
            }
        }
        int length2 = sb2.length();
        for (int i10 = 0; i10 < length2; i10++) {
            y2Var.a(a(sb2.charAt(i10), y2Var.a() + 1));
        }
    }
}
