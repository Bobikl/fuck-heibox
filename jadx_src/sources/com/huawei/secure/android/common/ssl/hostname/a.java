package com.huawei.secure.android.common.ssl.hostname;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.security.auth.x500.X500Principal;

/* JADX INFO: loaded from: classes7.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f63017a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f63018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f63019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f63021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f63022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private char[] f63023g;

    public a(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f63017a = name;
        this.f63018b = name.length();
    }

    private int a(int i10) {
        int i11;
        int i12;
        int i13 = i10 + 1;
        if (i13 >= this.f63018b) {
            throw new IllegalStateException("Malformed DN: " + this.f63017a);
        }
        char[] cArr = this.f63023g;
        char c10 = cArr[i10];
        if (c10 >= '0' && c10 <= '9') {
            i11 = c10 - '0';
        } else if (c10 >= 'a' && c10 <= 'f') {
            i11 = c10 - 'W';
        } else {
            if (c10 < 'A' || c10 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f63017a);
            }
            i11 = c10 - '7';
        }
        char c11 = cArr[i13];
        if (c11 >= '0' && c11 <= '9') {
            i12 = c11 - '0';
        } else if (c11 >= 'a' && c11 <= 'f') {
            i12 = c11 - 'W';
        } else {
            if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f63017a);
            }
            i12 = c11 - '7';
        }
        return (i11 << 4) + i12;
    }

    private String a() {
        int i10;
        int i11;
        char c10;
        int i12 = this.f63019c;
        this.f63020d = i12;
        this.f63021e = i12;
        while (true) {
            int i13 = this.f63019c;
            if (i13 >= this.f63018b) {
                char[] cArr = this.f63023g;
                int i14 = this.f63020d;
                return new String(cArr, i14, this.f63021e - i14);
            }
            char[] cArr2 = this.f63023g;
            char c11 = cArr2[i13];
            if (c11 != ' ') {
                if (c11 != ';') {
                    if (c11 == '\\') {
                        int i15 = this.f63021e;
                        this.f63021e = i15 + 1;
                        cArr2[i15] = b();
                        this.f63019c++;
                    } else if (c11 != '+' && c11 != ',') {
                        int i16 = this.f63021e;
                        this.f63021e = i16 + 1;
                        cArr2[i16] = c11;
                        this.f63019c = i13 + 1;
                    }
                }
                int i17 = this.f63020d;
                return new String(cArr2, i17, this.f63021e - i17);
            }
            int i18 = this.f63021e;
            this.f63022f = i18;
            this.f63019c = i13 + 1;
            this.f63021e = i18 + 1;
            cArr2[i18] = ' ';
            while (true) {
                i10 = this.f63019c;
                i11 = this.f63018b;
                if (i10 >= i11) {
                    break;
                }
                char[] cArr3 = this.f63023g;
                if (cArr3[i10] != ' ') {
                    break;
                }
                int i19 = this.f63021e;
                this.f63021e = i19 + 1;
                cArr3[i19] = ' ';
                this.f63019c = i10 + 1;
            }
            if (i10 == i11 || (c10 = this.f63023g[i10]) == ',' || c10 == '+' || c10 == ';') {
                char[] cArr4 = this.f63023g;
                int i20 = this.f63020d;
                return new String(cArr4, i20, this.f63022f - i20);
            }
        }
    }

    private char b() {
        int i10 = this.f63019c + 1;
        this.f63019c = i10;
        if (i10 == this.f63018b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f63017a);
        }
        char c10 = this.f63023g[i10];
        if (c10 == ' ' || c10 == '%' || c10 == '\\' || c10 == '_' || c10 == '\"' || c10 == '#') {
            return c10;
        }
        switch (c10) {
            case '*':
            case '+':
            case ',':
                return c10;
            default:
                switch (c10) {
                    case ';':
                    case '<':
                    case '=':
                    case '>':
                        return c10;
                    default:
                        return c();
                }
        }
    }

    private char c() {
        int i10;
        int i11;
        int iA = a(this.f63019c);
        this.f63019c++;
        if (iA < 128) {
            return (char) iA;
        }
        if (iA < 192 || iA > 247) {
            return '?';
        }
        if (iA <= 223) {
            i11 = iA & 31;
            i10 = 1;
        } else if (iA <= 239) {
            i10 = 2;
            i11 = iA & 15;
        } else {
            i10 = 3;
            i11 = iA & 7;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = this.f63019c + 1;
            this.f63019c = i13;
            if (i13 == this.f63018b || this.f63023g[i13] != '\\') {
                return '?';
            }
            int i14 = i13 + 1;
            this.f63019c = i14;
            int iA2 = a(i14);
            this.f63019c++;
            if ((iA2 & 192) != 128) {
                return '?';
            }
            i11 = (i11 << 6) + (iA2 & 63);
        }
        return (char) i11;
    }

    private String d() {
        char[] cArr;
        char c10;
        int i10 = this.f63019c;
        if (i10 + 4 >= this.f63018b) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f63017a);
        }
        this.f63020d = i10;
        this.f63019c = i10 + 1;
        while (true) {
            int i11 = this.f63019c;
            if (i11 == this.f63018b || (c10 = (cArr = this.f63023g)[i11]) == '+' || c10 == ',' || c10 == ';') {
                this.f63021e = i11;
                break;
            }
            if (c10 == ' ') {
                this.f63021e = i11;
                this.f63019c = i11 + 1;
                while (true) {
                    int i12 = this.f63019c;
                    if (i12 >= this.f63018b || this.f63023g[i12] != ' ') {
                        break;
                    }
                    this.f63019c = i12 + 1;
                }
            } else {
                if (c10 >= 'A' && c10 <= 'F') {
                    cArr[i11] = (char) (c10 + ' ');
                }
                this.f63019c = i11 + 1;
            }
        }
        int i13 = this.f63021e;
        int i14 = this.f63020d;
        int i15 = i13 - i14;
        if (i15 < 5 || (i15 & 1) == 0) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f63017a);
        }
        int i16 = i15 / 2;
        byte[] bArr = new byte[i16];
        int i17 = i14 + 1;
        for (int i18 = 0; i18 < i16; i18++) {
            bArr[i18] = (byte) a(i17);
            i17 += 2;
        }
        return new String(this.f63023g, this.f63020d, i15);
    }

    private String e() {
        int i10;
        int i11;
        int i12;
        int i13;
        char c10;
        char c11;
        char c12;
        int i14;
        int i15;
        char c13;
        char c14;
        while (true) {
            i10 = this.f63019c;
            i11 = this.f63018b;
            if (i10 >= i11 || this.f63023g[i10] != ' ') {
                break;
            }
            this.f63019c = i10 + 1;
        }
        if (i10 == i11) {
            return null;
        }
        this.f63020d = i10;
        this.f63019c = i10 + 1;
        while (true) {
            i12 = this.f63019c;
            i13 = this.f63018b;
            if (i12 >= i13 || (c14 = this.f63023g[i12]) == '=' || c14 == ' ') {
                break;
            }
            this.f63019c = i12 + 1;
        }
        if (i12 >= i13) {
            throw new IllegalStateException("Unexpected end of DN: " + this.f63017a);
        }
        this.f63021e = i12;
        if (this.f63023g[i12] == ' ') {
            while (true) {
                i14 = this.f63019c;
                i15 = this.f63018b;
                if (i14 >= i15 || (c13 = this.f63023g[i14]) == '=' || c13 != ' ') {
                    break;
                }
                this.f63019c = i14 + 1;
            }
            if (this.f63023g[i14] != '=' || i14 == i15) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f63017a);
            }
        }
        this.f63019c++;
        while (true) {
            int i16 = this.f63019c;
            if (i16 >= this.f63018b || this.f63023g[i16] != ' ') {
                break;
            }
            this.f63019c = i16 + 1;
        }
        int i17 = this.f63021e;
        int i18 = this.f63020d;
        if (i17 - i18 > 4) {
            char[] cArr = this.f63023g;
            if (cArr[i18 + 3] == '.' && (((c10 = cArr[i18]) == 'O' || c10 == 'o') && (((c11 = cArr[i18 + 1]) == 'I' || c11 == 'i') && ((c12 = cArr[i18 + 2]) == 'D' || c12 == 'd')))) {
                this.f63020d = i18 + 4;
            }
        }
        char[] cArr2 = this.f63023g;
        int i19 = this.f63020d;
        return new String(cArr2, i19, i17 - i19);
    }

    private String f() {
        int i10 = this.f63019c + 1;
        this.f63019c = i10;
        this.f63020d = i10;
        this.f63021e = i10;
        while (true) {
            int i11 = this.f63019c;
            if (i11 == this.f63018b) {
                throw new IllegalStateException("Unexpected end of DN: " + this.f63017a);
            }
            char[] cArr = this.f63023g;
            char c10 = cArr[i11];
            if (c10 == '\"') {
                this.f63019c = i11 + 1;
                while (true) {
                    int i12 = this.f63019c;
                    if (i12 >= this.f63018b || this.f63023g[i12] != ' ') {
                        break;
                    }
                    this.f63019c = i12 + 1;
                }
                char[] cArr2 = this.f63023g;
                int i13 = this.f63020d;
                return new String(cArr2, i13, this.f63021e - i13);
            }
            if (c10 == '\\') {
                cArr[this.f63021e] = b();
            } else {
                cArr[this.f63021e] = c10;
            }
            this.f63019c++;
            this.f63021e++;
        }
    }

    public String a(String str) {
        String strF;
        this.f63019c = 0;
        this.f63020d = 0;
        this.f63021e = 0;
        this.f63022f = 0;
        this.f63023g = this.f63017a.toCharArray();
        String strE = e();
        if (strE == null) {
            return null;
        }
        do {
            int i10 = this.f63019c;
            if (i10 == this.f63018b) {
                return null;
            }
            char c10 = this.f63023g[i10];
            if (c10 == '\"') {
                strF = f();
            } else if (c10 != '#') {
                strF = (c10 == '+' || c10 == ',' || c10 == ';') ? "" : a();
            } else {
                strF = d();
            }
            if (str.equalsIgnoreCase(strE)) {
                return strF;
            }
            int i11 = this.f63019c;
            if (i11 >= this.f63018b) {
                return null;
            }
            char c11 = this.f63023g[i11];
            if (c11 != ',' && c11 != ';' && c11 != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f63017a);
            }
            this.f63019c = i11 + 1;
            strE = e();
        } while (strE != null);
        throw new IllegalStateException("Malformed DN: " + this.f63017a);
    }

    public List<String> b(String str) {
        String strF;
        this.f63019c = 0;
        this.f63020d = 0;
        this.f63021e = 0;
        this.f63022f = 0;
        this.f63023g = this.f63017a.toCharArray();
        List<String> listEmptyList = Collections.emptyList();
        String strE = e();
        if (strE == null) {
            return listEmptyList;
        }
        do {
            int i10 = this.f63019c;
            if (i10 < this.f63018b) {
                char c10 = this.f63023g[i10];
                if (c10 == '\"') {
                    strF = f();
                } else if (c10 != '#') {
                    strF = (c10 == '+' || c10 == ',' || c10 == ';') ? "" : a();
                } else {
                    strF = d();
                }
                if (str.equalsIgnoreCase(strE)) {
                    if (listEmptyList.isEmpty()) {
                        listEmptyList = new ArrayList<>();
                    }
                    listEmptyList.add(strF);
                }
                int i11 = this.f63019c;
                if (i11 < this.f63018b) {
                    char c11 = this.f63023g[i11];
                    if (c11 != ',' && c11 != ';' && c11 != '+') {
                        throw new IllegalStateException("Malformed DN: " + this.f63017a);
                    }
                    this.f63019c = i11 + 1;
                    strE = e();
                }
            }
            return listEmptyList;
        } while (strE != null);
        throw new IllegalStateException("Malformed DN: " + this.f63017a);
    }
}
