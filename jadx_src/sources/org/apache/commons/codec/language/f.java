package org.apache.commons.codec.language;

import com.meituan.robust.Constants;
import java.util.Locale;
import org.apache.commons.codec.EncoderException;

/* JADX INFO: compiled from: DoubleMetaphone.java */
/* JADX INFO: loaded from: classes5.dex */
public class f implements mj.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f132986b = "AEIOUY";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String[] f132987c = {"GN", "KN", "PN", "WR", "PS"};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String[] f132988d = {"L", "R", "N", "M", "B", "H", "F", androidx.exifinterface.media.a.X4, androidx.exifinterface.media.a.T4, " "};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String[] f132989e = {"ES", "EP", "EB", "EL", "EY", "IB", "IL", "IN", "IE", "EI", "ER"};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String[] f132990f = {"L", androidx.exifinterface.media.a.f23244d5, "K", androidx.exifinterface.media.a.R4, "N", "M", "B", "Z"};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f132991a = 4;

    /* JADX INFO: compiled from: DoubleMetaphone.java */
    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final StringBuffer f132992a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final StringBuffer f132993b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f132994c;

        public a(int i10) {
            this.f132992a = new StringBuffer(f.this.r());
            this.f132993b = new StringBuffer(f.this.r());
            this.f132994c = i10;
        }

        public void a(char c10) {
            g(c10);
            e(c10);
        }

        public void b(char c10, char c11) {
            g(c10);
            e(c11);
        }

        public void c(String str) {
            h(str);
            f(str);
        }

        public void d(String str, String str2) {
            h(str);
            f(str2);
        }

        public void e(char c10) {
            if (this.f132993b.length() < this.f132994c) {
                this.f132993b.append(c10);
            }
        }

        public void f(String str) {
            int length = this.f132994c - this.f132993b.length();
            if (str.length() <= length) {
                this.f132993b.append(str);
            } else {
                this.f132993b.append(str.substring(0, length));
            }
        }

        public void g(char c10) {
            if (this.f132992a.length() < this.f132994c) {
                this.f132992a.append(c10);
            }
        }

        public void h(String str) {
            int length = this.f132994c - this.f132992a.length();
            if (str.length() <= length) {
                this.f132992a.append(str);
            } else {
                this.f132992a.append(str.substring(0, length));
            }
        }

        public String i() {
            return this.f132993b.toString();
        }

        public String j() {
            return this.f132992a.toString();
        }

        public boolean k() {
            return this.f132992a.length() >= this.f132994c && this.f132993b.length() >= this.f132994c;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x004f  */
    /* JADX WARN: Code duplicated, block: B:22:0x0056  */
    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    private int A(String str, a aVar, int i10, boolean z10) {
        if (i(str, i10, 4, "JOSE") || i(str, 0, 4, "SAN ")) {
            if ((i10 == 0 && b(str, i10 + 4) == ' ') || str.length() == 4 || i(str, 0, 4, "SAN ")) {
                aVar.a('H');
            } else {
                aVar.b('J', 'H');
            }
            return i10 + 1;
        }
        if (i10 != 0 || i(str, i10, 4, "JOSE")) {
            int i11 = i10 - 1;
            if (O(b(str, i11)) && !z10) {
                int i12 = i10 + 1;
                if (b(str, i12) == 'A' || b(str, i12) == 'O') {
                    aVar.b('J', 'H');
                } else if (i10 == str.length() - 1) {
                    aVar.b('J', ' ');
                } else if (!o(str, i10 + 1, 1, f132990f)) {
                    aVar.a('J');
                }
            } else if (i10 == str.length() - 1) {
                aVar.b('J', ' ');
            } else if (!o(str, i10 + 1, 1, f132990f) && !k(str, i11, 1, androidx.exifinterface.media.a.R4, "K", "L")) {
                aVar.a('J');
            }
        } else {
            aVar.b('J', 'A');
        }
        int i13 = i10 + 1;
        return b(str, i13) == 'J' ? i10 + 2 : i13;
    }

    private int B(String str, a aVar, int i10) {
        int i11 = i10 + 1;
        if (b(str, i11) != 'L') {
            aVar.a(Constants.OBJECT_TYPE);
            return i11;
        }
        if (g(str, i10)) {
            aVar.g(Constants.OBJECT_TYPE);
        } else {
            aVar.a(Constants.OBJECT_TYPE);
        }
        return i10 + 2;
    }

    private int C(String str, a aVar, int i10) {
        int i11 = i10 + 1;
        if (b(str, i11) == 'H') {
            aVar.a('F');
            return i10 + 2;
        }
        aVar.a('P');
        if (j(str, i11, 1, "P", "B")) {
            i11 = i10 + 2;
        }
        return i11;
    }

    private int D(String str, a aVar, int i10, boolean z10) {
        if (i10 != str.length() - 1 || z10 || !i(str, i10 - 2, 2, "IE") || j(str, i10 - 4, 2, "ME", "MA")) {
            aVar.a('R');
        } else {
            aVar.e('R');
        }
        int i11 = i10 + 1;
        return b(str, i11) == 'R' ? i10 + 2 : i11;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:? A[RETURN, SYNTHETIC] */
    private int E(String str, a aVar, int i10, boolean z10) {
        int i11;
        if (!j(str, i10 - 1, 3, "ISL", "YSL")) {
            if (i10 != 0 || !i(str, i10, 5, "SUGAR")) {
                if (i(str, i10, 2, "SH")) {
                    if (l(str, i10 + 1, 4, "HEIM", "HOEK", "HOLM", "HOLZ")) {
                        aVar.a('S');
                    } else {
                        aVar.a('X');
                    }
                } else {
                    if (j(str, i10, 3, "SIO", "SIA") || i(str, i10, 4, "SIAN")) {
                        if (z10) {
                            aVar.a('S');
                        } else {
                            aVar.b('S', 'X');
                        }
                        return i10 + 3;
                    }
                    if (i10 == 0 && l(str, i10 + 1, 1, "M", "N", "L", androidx.exifinterface.media.a.T4)) {
                        aVar.b('S', 'X');
                        i11 = i10 + 1;
                        if (!i(str, i11, 1, "Z")) {
                            return i11;
                        }
                    } else {
                        int i12 = i10 + 1;
                        if (i(str, i12, 1, "Z")) {
                            aVar.b('S', 'X');
                            i11 = i10 + 1;
                            if (!i(str, i11, 1, "Z")) {
                                return i11;
                            }
                        } else {
                            if (i(str, i10, 2, "SC")) {
                                return F(str, aVar, i10);
                            }
                            if (i10 == str.length() - 1 && j(str, i10 - 2, 2, "AI", "OI")) {
                                aVar.e('S');
                            } else {
                                aVar.a('S');
                            }
                            if (!j(str, i12, 1, androidx.exifinterface.media.a.R4, "Z")) {
                                return i12;
                            }
                        }
                    }
                }
                return i10 + 2;
            }
            aVar.b('X', 'S');
        }
        return i10 + 1;
    }

    private int F(String str, a aVar, int i10) {
        int i11 = i10 + 2;
        if (b(str, i11) == 'H') {
            int i12 = i10 + 3;
            if (n(str, i12, 2, "OO", "ER", "EN", "UY", "ED", "EM")) {
                if (j(str, i12, 2, "ER", "EN")) {
                    aVar.d("X", "SK");
                } else {
                    aVar.c("SK");
                }
            } else if (i10 != 0 || O(b(str, 3)) || b(str, 3) == 'W') {
                aVar.a('X');
            } else {
                aVar.b('X', 'S');
            }
        } else if (k(str, i11, 1, "I", androidx.exifinterface.media.a.S4, "Y")) {
            aVar.a('S');
        } else {
            aVar.c("SK");
        }
        return i10 + 3;
    }

    private int G(String str, a aVar, int i10) {
        if (i(str, i10, 4, "TION") || j(str, i10, 3, "TIA", "TCH")) {
            aVar.a('X');
            return i10 + 3;
        }
        if (!i(str, i10, 2, "TH") && !i(str, i10, 3, "TTH")) {
            aVar.a('T');
            int i11 = i10 + 1;
            return j(str, i11, 1, androidx.exifinterface.media.a.f23244d5, "D") ? i10 + 2 : i11;
        }
        int i12 = i10 + 2;
        if (j(str, i12, 2, "OM", "AM") || j(str, 0, 4, "VAN ", "VON ") || i(str, 0, 3, "SCH")) {
            aVar.a('T');
            return i12;
        }
        aVar.b('0', 'T');
        return i12;
    }

    private int H(String str, a aVar, int i10) {
        int i11 = 2;
        if (!i(str, i10, 2, "WR")) {
            if (i10 == 0) {
                int i12 = i10 + 1;
                if (O(b(str, i12)) || i(str, i10, 2, "WH")) {
                    if (O(b(str, i12))) {
                        aVar.b('A', 'F');
                    } else {
                        aVar.a('A');
                    }
                    return i12;
                }
            }
            if ((i10 == str.length() - 1 && O(b(str, i10 - 1))) || l(str, i10 - 1, 5, "EWSKI", "EWSKY", "OWSKI", "OWSKY") || i(str, 0, 3, "SCH")) {
                aVar.e('F');
            } else {
                i11 = 4;
                if (j(str, i10, 4, "WICZ", "WITZ")) {
                    aVar.d("TS", "FX");
                }
            }
            return i10 + 1;
        }
        aVar.a('R');
        return i10 + i11;
    }

    private int I(String str, a aVar, int i10) {
        if (i10 == 0) {
            aVar.a('S');
            return i10 + 1;
        }
        if (i10 != str.length() - 1 || (!j(str, i10 - 3, 3, "IAU", "EAU") && !j(str, i10 - 2, 2, "AU", com.huawei.hms.feature.dynamic.f.e.f60733d))) {
            aVar.c("KS");
        }
        int i11 = i10 + 1;
        return j(str, i11, 1, "C", "X") ? i10 + 2 : i11;
    }

    private int J(String str, a aVar, int i10, boolean z10) {
        int i11 = i10 + 1;
        if (b(str, i11) == 'H') {
            aVar.a('J');
            return i10 + 2;
        }
        if (k(str, i11, 2, "ZO", "ZI", "ZA") || (z10 && i10 > 0 && b(str, i10 - 1) != 'T')) {
            aVar.d(androidx.exifinterface.media.a.R4, "TS");
        } else {
            aVar.a('S');
        }
        if (b(str, i11) == 'Z') {
            i11 = i10 + 2;
        }
        return i11;
    }

    private boolean M(String str) {
        for (String str2 : f132987c) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    private boolean N(String str) {
        return str.indexOf(87) > -1 || str.indexOf(75) > -1 || str.indexOf("CZ") > -1 || str.indexOf("WITZ") > -1;
    }

    private boolean O(char c10) {
        return f132986b.indexOf(c10) != -1;
    }

    private String c(String str) {
        if (str == null) {
            return null;
        }
        String strTrim = str.trim();
        if (strTrim.length() == 0) {
            return null;
        }
        return strTrim.toUpperCase(Locale.ENGLISH);
    }

    private boolean d(String str, int i10) {
        if (i(str, i10, 4, "CHIA")) {
            return true;
        }
        if (i10 <= 1) {
            return false;
        }
        int i11 = i10 - 2;
        if (O(b(str, i11)) || !i(str, i10 - 1, 3, "ACH")) {
            return false;
        }
        char cB = b(str, i10 + 2);
        return !(cB == 'I' || cB == 'E') || j(str, i11, 6, "BACHER", "MACHER");
    }

    private boolean e(String str, int i10) {
        if (i10 != 0) {
            return false;
        }
        int i11 = i10 + 1;
        return (j(str, i11, 5, "HARAC", "HARIS") || l(str, i11, 3, "HOR", "HYM", "HIA", "HEM")) && !i(str, 0, 5, "CHORE");
    }

    private boolean f(String str, int i10) {
        if (!j(str, 0, 4, "VAN ", "VON ") && !i(str, 0, 3, "SCH") && !k(str, i10 - 2, 6, "ORCHES", "ARCHIT", "ORCHID")) {
            int i11 = i10 + 2;
            if (!j(str, i11, 1, androidx.exifinterface.media.a.f23244d5, androidx.exifinterface.media.a.R4)) {
                if (!l(str, i10 - 1, 1, androidx.exifinterface.media.a.W4, "O", "U", androidx.exifinterface.media.a.S4) && i10 != 0) {
                    return false;
                }
                if (!o(str, i11, 1, f132988d) && i10 + 1 != str.length() - 1) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean g(String str, int i10) {
        if (i10 == str.length() - 3 && k(str, i10 - 1, 4, "ILLO", "ILLA", "ALLE")) {
            return true;
        }
        return (j(str, str.length() - 2, 2, "AS", "OS") || j(str, str.length() - 1, 1, androidx.exifinterface.media.a.W4, "O")) && i(str, i10 - 1, 4, "ALLE");
    }

    private boolean h(String str, int i10) {
        int i11 = i10 + 1;
        if (b(str, i11) == 'M') {
            return true;
        }
        return i(str, i10 + (-1), 3, "UMB") && (i11 == str.length() - 1 || i(str, i10 + 2, 2, "ER"));
    }

    private static boolean i(String str, int i10, int i11, String str2) {
        return o(str, i10, i11, new String[]{str2});
    }

    private static boolean j(String str, int i10, int i11, String str2, String str3) {
        return o(str, i10, i11, new String[]{str2, str3});
    }

    private static boolean k(String str, int i10, int i11, String str2, String str3, String str4) {
        return o(str, i10, i11, new String[]{str2, str3, str4});
    }

    private static boolean l(String str, int i10, int i11, String str2, String str3, String str4, String str5) {
        return o(str, i10, i11, new String[]{str2, str3, str4, str5});
    }

    private static boolean m(String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6) {
        return o(str, i10, i11, new String[]{str2, str3, str4, str5, str6});
    }

    private static boolean n(String str, int i10, int i11, String str2, String str3, String str4, String str5, String str6, String str7) {
        return o(str, i10, i11, new String[]{str2, str3, str4, str5, str6, str7});
    }

    protected static boolean o(String str, int i10, int i11, String[] strArr) {
        int i12;
        if (i10 < 0 || (i12 = i11 + i10) > str.length()) {
            return false;
        }
        String strSubstring = str.substring(i10, i12);
        for (String str2 : strArr) {
            if (strSubstring.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    private int s(a aVar, int i10) {
        if (i10 == 0) {
            aVar.a('A');
        }
        return i10 + 1;
    }

    private int t(String str, a aVar, int i10) {
        if (d(str, i10)) {
            aVar.a('K');
        } else if (i10 == 0 && i(str, i10, 6, "CAESAR")) {
            aVar.a('S');
        } else {
            if (i(str, i10, 2, "CH")) {
                return v(str, aVar, i10);
            }
            if (!i(str, i10, 2, "CZ") || i(str, i10 - 2, 4, "WICZ")) {
                int i11 = i10 + 1;
                if (i(str, i11, 3, "CIA")) {
                    aVar.a('X');
                } else {
                    if (i(str, i10, 2, "CC") && (i10 != 1 || b(str, 0) != 'M')) {
                        return u(str, aVar, i10);
                    }
                    if (k(str, i10, 2, "CK", "CG", "CQ")) {
                        aVar.a('K');
                    } else if (!k(str, i10, 2, "CI", "CE", "CY")) {
                        aVar.a('K');
                        if (!k(str, i11, 2, " C", " Q", " G")) {
                            if (!k(str, i11, 1, "C", "K", "Q") || j(str, i11, 2, "CE", "CI")) {
                                return i11;
                            }
                        }
                    } else if (k(str, i10, 3, "CIO", "CIE", "CIA")) {
                        aVar.b('S', 'X');
                    } else {
                        aVar.a('S');
                    }
                }
                return i10 + 3;
            }
            aVar.b('S', 'X');
        }
        return i10 + 2;
    }

    private int u(String str, a aVar, int i10) {
        int i11 = i10 + 2;
        if (!k(str, i11, 1, "I", androidx.exifinterface.media.a.S4, "H") || i(str, i11, 2, "HU")) {
            aVar.a('K');
            return i11;
        }
        if ((i10 == 1 && b(str, i10 - 1) == 'A') || j(str, i10 - 1, 5, "UCCEE", "UCCES")) {
            aVar.c("KS");
        } else {
            aVar.a('X');
        }
        return i10 + 3;
    }

    private int v(String str, a aVar, int i10) {
        if (i10 > 0 && i(str, i10, 4, "CHAE")) {
            aVar.b('K', 'X');
        } else {
            if (!e(str, i10) && !f(str, i10)) {
                if (i10 <= 0) {
                    aVar.a('X');
                } else if (i(str, 0, 2, "MC")) {
                    aVar.a('K');
                } else {
                    aVar.b('X', 'K');
                }
                return i10 + 2;
            }
            aVar.a('K');
        }
        return i10 + 2;
    }

    private int w(String str, a aVar, int i10) {
        if (!i(str, i10, 2, "DG")) {
            if (j(str, i10, 2, "DT", "DD")) {
                aVar.a('T');
                return 2 + i10;
            }
            aVar.a('T');
            return i10 + 1;
        }
        int i11 = i10 + 2;
        if (k(str, i11, 1, "I", androidx.exifinterface.media.a.S4, "Y")) {
            aVar.a('J');
            return i10 + 3;
        }
        aVar.c("TK");
        return i11;
    }

    private int x(String str, a aVar, int i10, boolean z10) {
        int i11;
        int i12 = i10 + 1;
        if (b(str, i12) == 'H') {
            return y(str, aVar, i10);
        }
        if (b(str, i12) == 'N') {
            if (i10 == 1 && O(b(str, 0)) && !z10) {
                aVar.d("KN", "N");
            } else if (i(str, i10 + 2, 2, "EY") || b(str, i12) == 'Y' || z10) {
                aVar.c("KN");
            } else {
                aVar.d("N", "KN");
            }
        } else if (i(str, i12, 2, "LI") && !z10) {
            aVar.d("KL", "L");
        } else if (i10 == 0 && (b(str, i12) == 'Y' || o(str, i12, 2, f132989e))) {
            aVar.b('K', 'J');
        } else {
            if (i(str, i12, 2, "ER") || b(str, i12) == 'Y') {
                i11 = 3;
                if (!k(str, 0, 6, "DANGER", "RANGER", "MANGER")) {
                    int i13 = i10 - 1;
                    if (!j(str, i13, 1, androidx.exifinterface.media.a.S4, "I") && !j(str, i13, 3, "RGY", "OGY")) {
                        aVar.b('K', 'J');
                    }
                }
            } else {
                i11 = 3;
            }
            if (!k(str, i12, 1, androidx.exifinterface.media.a.S4, "I", "Y") && !j(str, i10 - 1, 4, "AGGI", "OGGI")) {
                if (b(str, i12) != 'G') {
                    aVar.a('K');
                    return i12;
                }
                int i14 = i10 + 2;
                aVar.a('K');
                return i14;
            }
            if (j(str, 0, 4, "VAN ", "VON ") || i(str, 0, i11, "SCH") || i(str, i12, 2, "ET")) {
                aVar.a('K');
            } else if (i(str, i12, i11, "IER")) {
                aVar.a('J');
            } else {
                aVar.b('J', 'K');
            }
        }
        return i10 + 2;
    }

    private int y(String str, a aVar, int i10) {
        if (i10 > 0 && !O(b(str, i10 - 1))) {
            aVar.a('K');
        } else {
            if (i10 == 0) {
                int i11 = i10 + 2;
                if (b(str, i11) == 'I') {
                    aVar.a('J');
                    return i11;
                }
                aVar.a('K');
                return i11;
            }
            if ((i10 <= 1 || !k(str, i10 - 2, 1, "B", "H", "D")) && ((i10 <= 2 || !k(str, i10 - 3, 1, "B", "H", "D")) && (i10 <= 3 || !j(str, i10 - 4, 1, "B", "H")))) {
                if (i10 > 2 && b(str, i10 - 1) == 'U' && m(str, i10 - 3, 1, "C", "G", "L", "R", androidx.exifinterface.media.a.f23244d5)) {
                    aVar.a('F');
                } else if (i10 > 0 && b(str, i10 - 1) != 'I') {
                    aVar.a('K');
                }
            }
        }
        return i10 + 2;
    }

    private int z(String str, a aVar, int i10) {
        if ((i10 != 0 && !O(b(str, i10 - 1))) || !O(b(str, i10 + 1))) {
            return i10 + 1;
        }
        aVar.a('H');
        return i10 + 2;
    }

    public boolean K(String str, String str2) {
        return L(str, str2, false);
    }

    public boolean L(String str, String str2, boolean z10) {
        return q(str, z10).equals(q(str2, z10));
    }

    public void P(int i10) {
        this.f132991a = i10;
    }

    @Override // mj.g
    public String a(String str) {
        return p(str);
    }

    protected char b(String str, int i10) {
        if (i10 < 0 || i10 >= str.length()) {
            return (char) 0;
        }
        return str.charAt(i10);
    }

    @Override // mj.e
    public Object encode(Object obj) throws EncoderException {
        if (obj instanceof String) {
            return p((String) obj);
        }
        throw new EncoderException("DoubleMetaphone encode parameter is not of type String");
    }

    public String p(String str) {
        return q(str, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10, types: [int] */
    /* JADX WARN: Type inference failed for: r1v11, types: [int] */
    /* JADX WARN: Type inference failed for: r1v12, types: [int] */
    /* JADX WARN: Type inference failed for: r1v13, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14, types: [int] */
    /* JADX WARN: Type inference failed for: r1v15, types: [int] */
    /* JADX WARN: Type inference failed for: r1v16, types: [int] */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18, types: [int] */
    /* JADX WARN: Type inference failed for: r1v19, types: [int] */
    /* JADX WARN: Type inference failed for: r1v2, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [int] */
    /* JADX WARN: Type inference failed for: r1v5, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6, types: [int] */
    /* JADX WARN: Type inference failed for: r1v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v8, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9, types: [int] */
    /* JADX WARN: Type inference failed for: r7v0, types: [org.apache.commons.codec.language.f] */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    public String q(String str, boolean z10) {
        int i10;
        ?? C = c(str);
        if (C == 0) {
            return null;
        }
        boolean zN = N(C);
        ?? M = M(C);
        a aVar = new a(r());
        while (!aVar.k() && M <= C.length() - 1) {
            char cCharAt = C.charAt(M);
            if (cCharAt == 199) {
                aVar.a('S');
            } else if (cCharAt != 209) {
                switch (cCharAt) {
                    case 'A':
                    case 'E':
                    case 'I':
                    case 'O':
                    case 'U':
                    case 'Y':
                        M = s(aVar, M);
                        break;
                    case 'B':
                        aVar.a('P');
                        i10 = M + 1;
                        M = b(C, i10) != 'B' ? i10 : M + 2;
                        break;
                    case 'C':
                        M = t(C, aVar, M);
                        break;
                    case 'D':
                        M = w(C, aVar, M);
                        break;
                    case 'F':
                        aVar.a('F');
                        i10 = M + 1;
                        if (b(C, i10) != 'F') {
                        }
                        break;
                    case 'G':
                        M = x(C, aVar, M, zN);
                        break;
                    case 'H':
                        M = z(C, aVar, M);
                        break;
                    case 'J':
                        M = A(C, aVar, M, zN);
                        break;
                    case 'K':
                        aVar.a('K');
                        i10 = M + 1;
                        if (b(C, i10) != 'K') {
                        }
                        break;
                    case 'L':
                        M = B(C, aVar, M);
                        break;
                    case 'M':
                        aVar.a('M');
                        if (!h(C, M)) {
                        }
                        break;
                    case 'N':
                        aVar.a('N');
                        i10 = M + 1;
                        if (b(C, i10) != 'N') {
                        }
                        break;
                    case 'P':
                        M = C(C, aVar, M);
                        break;
                    case 'Q':
                        aVar.a('K');
                        i10 = M + 1;
                        if (b(C, i10) != 'Q') {
                        }
                        break;
                    case 'R':
                        M = D(C, aVar, M, zN);
                        break;
                    case 'S':
                        M = E(C, aVar, M, zN);
                        break;
                    case 'T':
                        M = G(C, aVar, M);
                        break;
                    case 'V':
                        aVar.a('F');
                        i10 = M + 1;
                        if (b(C, i10) != 'V') {
                        }
                        break;
                    case 'W':
                        M = H(C, aVar, M);
                        break;
                    case 'X':
                        M = I(C, aVar, M);
                        break;
                    case 'Z':
                        M = J(C, aVar, M, zN);
                        break;
                    default:
                        break;
                }
            } else {
                aVar.a('N');
            }
            M++;
        }
        return z10 ? aVar.i() : aVar.j();
    }

    public int r() {
        return this.f132991a;
    }
}
