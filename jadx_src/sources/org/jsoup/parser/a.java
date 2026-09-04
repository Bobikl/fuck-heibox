package org.jsoup.parser;

import java.util.Locale;

/* JADX INFO: compiled from: CharacterReader.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final char f137923e = 65535;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final char[] f137924a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f137925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f137926c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f137927d = 0;

    a(String str) {
        org.jsoup.helper.d.j(str);
        char[] charArray = str.toCharArray();
        this.f137924a = charArray;
        this.f137925b = charArray.length;
    }

    void A() {
        this.f137926c = this.f137927d;
    }

    void B() {
        this.f137926c--;
    }

    void a() {
        this.f137926c++;
    }

    char b() {
        char c10 = n() ? (char) 65535 : this.f137924a[this.f137926c];
        this.f137926c++;
        return c10;
    }

    String c() {
        char[] cArr = this.f137924a;
        int i10 = this.f137926c;
        this.f137926c = i10 + 1;
        return new String(cArr, i10, 1);
    }

    String d() {
        int i10;
        char c10;
        int i11 = this.f137926c;
        while (true) {
            i10 = this.f137926c;
            if (i10 >= this.f137925b || (c10 = this.f137924a[i10]) < '0' || c10 > '9') {
                break;
            }
            this.f137926c = i10 + 1;
        }
        return new String(this.f137924a, i11, i10 - i11);
    }

    String e() {
        int i10;
        char c10;
        int i11 = this.f137926c;
        while (true) {
            i10 = this.f137926c;
            if (i10 >= this.f137925b || (((c10 = this.f137924a[i10]) < '0' || c10 > '9') && ((c10 < 'A' || c10 > 'F') && (c10 < 'a' || c10 > 'f')))) {
                break;
            }
            this.f137926c = i10 + 1;
        }
        return new String(this.f137924a, i11, i10 - i11);
    }

    String f() {
        int i10;
        char c10;
        int i11 = this.f137926c;
        while (true) {
            i10 = this.f137926c;
            if (i10 >= this.f137925b || (((c10 = this.f137924a[i10]) < 'A' || c10 > 'Z') && (c10 < 'a' || c10 > 'z'))) {
                break;
            }
            this.f137926c = i10 + 1;
        }
        return new String(this.f137924a, i11, i10 - i11);
    }

    String g() {
        char c10;
        int i10 = this.f137926c;
        while (true) {
            int i11 = this.f137926c;
            if (i11 >= this.f137925b || (((c10 = this.f137924a[i11]) < 'A' || c10 > 'Z') && (c10 < 'a' || c10 > 'z'))) {
                break;
            }
            this.f137926c = i11 + 1;
        }
        while (!n()) {
            char[] cArr = this.f137924a;
            int i12 = this.f137926c;
            char c11 = cArr[i12];
            if (c11 < '0' || c11 > '9') {
                break;
            }
            this.f137926c = i12 + 1;
        }
        return new String(this.f137924a, i10, this.f137926c - i10);
    }

    String h(char c10) {
        int iX = x(c10);
        if (iX == -1) {
            return k();
        }
        String str = new String(this.f137924a, this.f137926c, iX);
        this.f137926c += iX;
        return str;
    }

    String i(String str) {
        int iY = y(str);
        if (iY == -1) {
            return k();
        }
        String str2 = new String(this.f137924a, this.f137926c, iY);
        this.f137926c += iY;
        return str2;
    }

    String j(char... cArr) {
        int i10 = this.f137926c;
        loop0: while (this.f137926c < this.f137925b) {
            for (char c10 : cArr) {
                if (this.f137924a[this.f137926c] == c10) {
                    break loop0;
                }
            }
            this.f137926c++;
        }
        int i11 = this.f137926c;
        return i11 > i10 ? new String(this.f137924a, i10, i11 - i10) : "";
    }

    String k() {
        char[] cArr = this.f137924a;
        int i10 = this.f137926c;
        String str = new String(cArr, i10, this.f137925b - i10);
        this.f137926c = this.f137925b;
        return str;
    }

    boolean l(String str) {
        Locale locale = Locale.ENGLISH;
        return y(str.toLowerCase(locale)) > -1 || y(str.toUpperCase(locale)) > -1;
    }

    char m() {
        if (n()) {
            return (char) 65535;
        }
        return this.f137924a[this.f137926c];
    }

    boolean n() {
        return this.f137926c >= this.f137925b;
    }

    void o() {
        this.f137927d = this.f137926c;
    }

    boolean p(String str) {
        if (!s(str)) {
            return false;
        }
        this.f137926c += str.length();
        return true;
    }

    boolean q(String str) {
        if (!v(str)) {
            return false;
        }
        this.f137926c += str.length();
        return true;
    }

    boolean r(char c10) {
        return !n() && this.f137924a[this.f137926c] == c10;
    }

    boolean s(String str) {
        int length = str.length();
        if (length > this.f137925b - this.f137926c) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (str.charAt(i10) != this.f137924a[this.f137926c + i10]) {
                return false;
            }
        }
        return true;
    }

    boolean t(char... cArr) {
        if (n()) {
            return false;
        }
        char c10 = this.f137924a[this.f137926c];
        for (char c11 : cArr) {
            if (c11 == c10) {
                return true;
            }
        }
        return false;
    }

    public String toString() {
        char[] cArr = this.f137924a;
        int i10 = this.f137926c;
        return new String(cArr, i10, this.f137925b - i10);
    }

    boolean u() {
        char c10;
        return !n() && (c10 = this.f137924a[this.f137926c]) >= '0' && c10 <= '9';
    }

    boolean v(String str) {
        int length = str.length();
        if (length > this.f137925b - this.f137926c) {
            return false;
        }
        for (int i10 = 0; i10 < length; i10++) {
            if (Character.toUpperCase(str.charAt(i10)) != Character.toUpperCase(this.f137924a[this.f137926c + i10])) {
                return false;
            }
        }
        return true;
    }

    boolean w() {
        if (n()) {
            return false;
        }
        char c10 = this.f137924a[this.f137926c];
        return (c10 >= 'A' && c10 <= 'Z') || (c10 >= 'a' && c10 <= 'z');
    }

    int x(char c10) {
        for (int i10 = this.f137926c; i10 < this.f137925b; i10++) {
            if (c10 == this.f137924a[i10]) {
                return i10 - this.f137926c;
            }
        }
        return -1;
    }

    int y(CharSequence charSequence) {
        char cCharAt = charSequence.charAt(0);
        int i10 = this.f137926c;
        while (i10 < this.f137925b) {
            if (cCharAt != this.f137924a[i10]) {
                do {
                    i10++;
                    if (i10 >= this.f137925b) {
                        break;
                    }
                } while (cCharAt != this.f137924a[i10]);
            }
            if (i10 < this.f137925b) {
                int i11 = i10 + 1;
                int length = (charSequence.length() + i11) - 1;
                for (int i12 = 1; i11 < length && charSequence.charAt(i12) == this.f137924a[i11]; i12++) {
                    i11++;
                }
                if (i11 == length) {
                    return i10 - this.f137926c;
                }
            }
            i10++;
        }
        return -1;
    }

    int z() {
        return this.f137926c;
    }
}
