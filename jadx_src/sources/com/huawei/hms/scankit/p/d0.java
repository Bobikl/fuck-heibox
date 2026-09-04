package com.huawei.hms.scankit.p;

/* JADX INFO: compiled from: C40Encoder.java */
/* JADX INFO: loaded from: classes7.dex */
public class d0 implements v2 {
    d0() {
    }

    private int a(y2 y2Var, StringBuilder sb2, StringBuilder sb3, int i10) {
        int length = sb2.length();
        sb2.delete(length - i10, length);
        y2Var.f62582f--;
        int iA = a(y2Var.c(), sb3);
        y2Var.k();
        return iA;
    }

    private static String a(CharSequence charSequence, int i10) {
        int iCharAt = (charSequence.charAt(i10) * 1600) + (charSequence.charAt(i10 + 1) * '(') + charSequence.charAt(i10 + 2) + 1;
        return new String(new char[]{(char) (iCharAt / 256), (char) (iCharAt % 256)});
    }

    static void b(y2 y2Var, StringBuilder sb2) {
        y2Var.a(a(sb2, 0));
        sb2.delete(0, 3);
    }

    public int a() {
        return 1;
    }

    int a(char c10, StringBuilder sb2) {
        if (c10 == ' ') {
            sb2.append((char) 3);
            return 1;
        }
        if (c10 >= '0' && c10 <= '9') {
            sb2.append((char) ((c10 - '0') + 4));
            return 1;
        }
        if (c10 >= 'A' && c10 <= 'Z') {
            sb2.append((char) ((c10 - 'A') + 14));
            return 1;
        }
        if (c10 < ' ') {
            sb2.append((char) 0);
            sb2.append(c10);
            return 2;
        }
        if (c10 >= '!' && c10 <= '/') {
            sb2.append((char) 1);
            sb2.append((char) (c10 - '!'));
            return 2;
        }
        if (c10 >= ':' && c10 <= '@') {
            sb2.append((char) 1);
            sb2.append((char) ((c10 - ':') + 15));
            return 2;
        }
        if (c10 >= '[' && c10 <= '_') {
            sb2.append((char) 1);
            sb2.append((char) ((c10 - '[') + 22));
            return 2;
        }
        if (c10 < '`' || c10 > 127) {
            sb2.append("\u0001\u001e");
            return a((char) (c10 - 128), sb2) + 2;
        }
        sb2.append((char) 2);
        sb2.append((char) (c10 - '`'));
        return 2;
    }

    @Override // com.huawei.hms.scankit.p.v2
    public void a(y2 y2Var) {
        StringBuilder sb2 = new StringBuilder();
        while (y2Var.i()) {
            char c10 = y2Var.c();
            y2Var.f62582f++;
            int iA = a(c10, sb2);
            int iA2 = y2Var.a() + ((sb2.length() / 3) * 2);
            y2Var.c(iA2);
            int iA3 = y2Var.g().a() - iA2;
            if (!y2Var.i()) {
                StringBuilder sb3 = new StringBuilder();
                if (sb2.length() % 3 == 2 && (iA3 < 2 || iA3 > 2)) {
                    iA = a(y2Var, sb2, sb3, iA);
                }
                while (sb2.length() % 3 == 1 && ((iA <= 3 && iA3 != 1) || iA > 3)) {
                    iA = a(y2Var, sb2, sb3, iA);
                }
                break;
            }
            if (sb2.length() % 3 == 0 && d4.a(y2Var.d(), y2Var.f62582f, a()) != a()) {
                y2Var.b(0);
                break;
            }
        }
        a(y2Var, sb2);
    }

    void a(y2 y2Var, StringBuilder sb2) {
        int length = (sb2.length() / 3) * 2;
        int length2 = sb2.length() % 3;
        int iA = y2Var.a() + length;
        y2Var.c(iA);
        int iA2 = y2Var.g().a() - iA;
        if (length2 == 2) {
            sb2.append((char) 0);
            while (sb2.length() >= 3) {
                b(y2Var, sb2);
            }
            if (y2Var.i()) {
                y2Var.a((char) 254);
            }
        } else if (iA2 == 1 && length2 == 1) {
            while (sb2.length() >= 3) {
                b(y2Var, sb2);
            }
            if (y2Var.i()) {
                y2Var.a((char) 254);
            }
            y2Var.f62582f--;
        } else if (length2 == 0) {
            while (sb2.length() >= 3) {
                b(y2Var, sb2);
            }
            if (iA2 > 0 || y2Var.i()) {
                y2Var.a((char) 254);
            }
        } else {
            try {
                throw new IllegalStateException("Unexpected case. Please report!");
            } catch (Exception unused) {
                o4.b("exception", "Exception");
            }
        }
        y2Var.b(0);
    }
}
