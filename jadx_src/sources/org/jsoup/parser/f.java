package org.jsoup.parser;

/* JADX INFO: compiled from: TokenQueue.java */
/* JADX INFO: loaded from: classes5.dex */
public class f {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final char f137960c = '\\';

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f137961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137962b = 0;

    public f(String str) {
        org.jsoup.helper.d.j(str);
        this.f137961a = str;
    }

    private int C() {
        return this.f137961a.length() - this.f137962b;
    }

    public static String D(String str) {
        StringBuilder sb2 = new StringBuilder();
        char[] charArray = str.toCharArray();
        int length = charArray.length;
        int i10 = 0;
        char c10 = 0;
        while (i10 < length) {
            char c11 = charArray[i10];
            if (c11 != '\\') {
                sb2.append(c11);
            } else if (c10 != 0 && c10 == '\\') {
                sb2.append(c11);
            }
            i10++;
            c10 = c11;
        }
        return sb2.toString();
    }

    public char A() {
        if (r()) {
            return (char) 0;
        }
        return this.f137961a.charAt(this.f137962b);
    }

    public String B() {
        StringBuilder sb2 = new StringBuilder();
        while (!r()) {
            sb2.append(g());
        }
        return sb2.toString();
    }

    public void a(Character ch2) {
        b(ch2.toString());
    }

    public void b(String str) {
        this.f137961a = str + this.f137961a.substring(this.f137962b);
        this.f137962b = 0;
    }

    public void c() {
        if (r()) {
            return;
        }
        this.f137962b++;
    }

    public String d(char c10, char c11) {
        StringBuilder sb2 = new StringBuilder();
        char cCharValue = 0;
        int i10 = 0;
        while (!r()) {
            Character chValueOf = Character.valueOf(g());
            if (cCharValue == 0 || cCharValue != '\\') {
                if (chValueOf.equals(Character.valueOf(c10))) {
                    i10++;
                } else if (chValueOf.equals(Character.valueOf(c11))) {
                    i10--;
                }
            }
            if (i10 > 0 && cCharValue != 0) {
                sb2.append(chValueOf);
            }
            cCharValue = chValueOf.charValue();
            if (i10 <= 0) {
                break;
            }
        }
        return sb2.toString();
    }

    public String e(String str) {
        String strM = m(str);
        s(str);
        return strM;
    }

    public String f(String str) {
        String strO = o(str);
        s(str);
        return strO;
    }

    public char g() {
        String str = this.f137961a;
        int i10 = this.f137962b;
        this.f137962b = i10 + 1;
        return str.charAt(i10);
    }

    public void h(String str) {
        if (!t(str)) {
            throw new IllegalStateException("Queue did not match expected sequence");
        }
        int length = str.length();
        if (length > C()) {
            throw new IllegalStateException("Queue not long enough to consume sequence");
        }
        this.f137962b += length;
    }

    public String i() {
        int i10 = this.f137962b;
        while (!r() && (z() || u('-', '_', ':'))) {
            this.f137962b++;
        }
        return this.f137961a.substring(i10, this.f137962b);
    }

    public String j() {
        int i10 = this.f137962b;
        while (!r() && (z() || u('-', '_'))) {
            this.f137962b++;
        }
        return this.f137961a.substring(i10, this.f137962b);
    }

    public String k() {
        int i10 = this.f137962b;
        while (!r() && (z() || u('|', '_', '-'))) {
            this.f137962b++;
        }
        return this.f137961a.substring(i10, this.f137962b);
    }

    public String l() {
        int i10 = this.f137962b;
        while (!r() && (z() || u(':', '_', '-'))) {
            this.f137962b++;
        }
        return this.f137961a.substring(i10, this.f137962b);
    }

    public String m(String str) {
        int iIndexOf = this.f137961a.indexOf(str, this.f137962b);
        if (iIndexOf == -1) {
            return B();
        }
        String strSubstring = this.f137961a.substring(this.f137962b, iIndexOf);
        this.f137962b += strSubstring.length();
        return strSubstring;
    }

    public String n(String... strArr) {
        int i10 = this.f137962b;
        while (!r() && !v(strArr)) {
            this.f137962b++;
        }
        return this.f137961a.substring(i10, this.f137962b);
    }

    public String o(String str) {
        int i10 = this.f137962b;
        String strSubstring = str.substring(0, 1);
        boolean zEquals = strSubstring.toLowerCase().equals(strSubstring.toUpperCase());
        while (!r() && !t(str)) {
            if (zEquals) {
                int iIndexOf = this.f137961a.indexOf(strSubstring, this.f137962b);
                int i11 = this.f137962b;
                int i12 = iIndexOf - i11;
                if (i12 == 0) {
                    this.f137962b = i11 + 1;
                } else if (i12 < 0) {
                    this.f137962b = this.f137961a.length();
                } else {
                    this.f137962b = i11 + i12;
                }
            } else {
                this.f137962b++;
            }
        }
        return this.f137961a.substring(i10, this.f137962b);
    }

    public boolean p() {
        boolean z10 = false;
        while (y()) {
            this.f137962b++;
            z10 = true;
        }
        return z10;
    }

    public String q() {
        int i10 = this.f137962b;
        while (z()) {
            this.f137962b++;
        }
        return this.f137961a.substring(i10, this.f137962b);
    }

    public boolean r() {
        return C() == 0;
    }

    public boolean s(String str) {
        if (!t(str)) {
            return false;
        }
        this.f137962b += str.length();
        return true;
    }

    public boolean t(String str) {
        return this.f137961a.regionMatches(true, this.f137962b, str, 0, str.length());
    }

    public String toString() {
        return this.f137961a.substring(this.f137962b);
    }

    public boolean u(char... cArr) {
        if (r()) {
            return false;
        }
        for (char c10 : cArr) {
            if (this.f137961a.charAt(this.f137962b) == c10) {
                return true;
            }
        }
        return false;
    }

    public boolean v(String... strArr) {
        for (String str : strArr) {
            if (t(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean w(String str) {
        return this.f137961a.startsWith(str, this.f137962b);
    }

    public boolean x() {
        return C() >= 2 && this.f137961a.charAt(this.f137962b) == '<' && Character.isLetter(this.f137961a.charAt(this.f137962b + 1));
    }

    public boolean y() {
        return !r() && org.jsoup.helper.c.d(this.f137961a.charAt(this.f137962b));
    }

    public boolean z() {
        return !r() && Character.isLetterOrDigit(this.f137961a.charAt(this.f137962b));
    }
}
