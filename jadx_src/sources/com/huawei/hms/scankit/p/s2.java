package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: EdifactEncoder.java */
/* JADX INFO: loaded from: classes7.dex */
public final class s2 implements v2 {
    s2() {
    }

    private static String a(CharSequence charSequence, int i10) throws Exception {
        int length = charSequence.length() - i10;
        if (length == 0) {
            try {
                throw new IllegalStateException("StringBuilder must not be empty");
            } catch (Exception e10) {
                throw e10;
            }
        }
        int iCharAt = (charSequence.charAt(i10) << 18) + ((length >= 2 ? charSequence.charAt(i10 + 1) : (char) 0) << '\f') + ((length >= 3 ? charSequence.charAt(i10 + 2) : (char) 0) << 6) + (length >= 4 ? charSequence.charAt(i10 + 3) : (char) 0);
        char c10 = (char) ((iCharAt >> 16) & 255);
        char c11 = (char) ((iCharAt >> 8) & 255);
        char c12 = (char) (iCharAt & 255);
        StringBuilder sb2 = new StringBuilder(3);
        sb2.append(c10);
        if (length >= 2) {
            sb2.append(c11);
        }
        if (length >= 3) {
            sb2.append(c12);
        }
        return sb2.toString();
    }

    private static void a(char c10, StringBuilder sb2) throws Exception {
        if (c10 >= ' ' && c10 <= '?') {
            sb2.append(c10);
        } else if (c10 < '@' || c10 > '^') {
            d4.a(c10);
        } else {
            sb2.append((char) (c10 - '@'));
        }
    }

    private static void a(y2 y2Var, CharSequence charSequence) {
        try {
            int length = charSequence.length();
            if (length == 0) {
                y2Var.b(0);
                return;
            }
            boolean z10 = true;
            if (length == 1) {
                y2Var.l();
                int iA = y2Var.g().a() - y2Var.a();
                int iF = y2Var.f();
                if (iF > iA) {
                    y2Var.c(y2Var.a() + 1);
                    iA = y2Var.g().a() - y2Var.a();
                }
                if (iF <= iA && iA <= 2) {
                    y2Var.b(0);
                    return;
                }
            }
            if (length > 4) {
                throw new IllegalStateException("Count must not exceed 4");
            }
            int i10 = length - 1;
            String strA = a(charSequence, 0);
            if (!(!y2Var.i()) || i10 > 2) {
                z10 = false;
            }
            if (i10 <= 2) {
                y2Var.c(y2Var.a() + i10);
                if (y2Var.g().a() - y2Var.a() >= 3) {
                    y2Var.c(y2Var.a() + strA.length());
                    z10 = false;
                }
            }
            if (z10) {
                y2Var.k();
                y2Var.f62582f -= i10;
            } else {
                y2Var.a(strA);
            }
            y2Var.b(0);
        } catch (Throwable th2) {
            y2Var.b(0);
            throw th2;
        }
    }

    public int a() {
        return 4;
    }

    @Override // com.huawei.hms.scankit.p.v2
    public void a(y2 y2Var) throws Exception {
        StringBuilder sb2 = new StringBuilder();
        while (y2Var.i()) {
            a(y2Var.c(), sb2);
            y2Var.f62582f++;
            if (sb2.length() >= 4) {
                y2Var.a(a(sb2, 0));
                sb2.delete(0, 4);
                if (d4.a(y2Var.d(), y2Var.f62582f, a()) != a()) {
                    y2Var.b(0);
                    break;
                }
            }
        }
        sb2.append((char) 31);
        a(y2Var, sb2);
    }
}
