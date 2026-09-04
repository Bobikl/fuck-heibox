package com.huawei.secure.android.common.util;

/* JADX INFO: loaded from: classes7.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f63104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Character f63105b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Character f63106c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f63107d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f63108e = 0;

    public b(String str) {
        this.f63104a = str;
    }

    public static boolean b(Character ch2) {
        if (ch2 == null) {
            return false;
        }
        char cCharValue = ch2.charValue();
        return (cCharValue >= '0' && cCharValue <= '9') || (cCharValue >= 'a' && cCharValue <= 'f') || (cCharValue >= 'A' && cCharValue <= 'F');
    }

    public static boolean c(Character ch2) {
        char cCharValue;
        return ch2 != null && (cCharValue = ch2.charValue()) >= '0' && cCharValue <= '7';
    }

    public void a(Character ch2) {
        this.f63105b = ch2;
    }

    public boolean a() {
        if (this.f63105b != null) {
            return true;
        }
        String str = this.f63104a;
        return (str == null || str.length() == 0 || this.f63107d >= this.f63104a.length()) ? false : true;
    }

    public boolean a(char c10) {
        Character ch2 = this.f63105b;
        if (ch2 != null && ch2.charValue() == c10) {
            return true;
        }
        String str = this.f63104a;
        return str != null && str.length() != 0 && this.f63107d < this.f63104a.length() && this.f63104a.charAt(this.f63107d) == c10;
    }

    public int b() {
        return this.f63107d;
    }

    public void c() {
        this.f63106c = this.f63105b;
        this.f63108e = this.f63107d;
    }

    public Character d() {
        Character ch2 = this.f63105b;
        if (ch2 != null) {
            this.f63105b = null;
            return ch2;
        }
        String str = this.f63104a;
        if (str == null || str.length() == 0 || this.f63107d >= this.f63104a.length()) {
            return null;
        }
        String str2 = this.f63104a;
        int i10 = this.f63107d;
        this.f63107d = i10 + 1;
        return Character.valueOf(str2.charAt(i10));
    }

    public Character e() {
        Character chD = d();
        if (chD != null && b(chD)) {
            return chD;
        }
        return null;
    }

    public Character f() {
        Character chD = d();
        if (chD != null && c(chD)) {
            return chD;
        }
        return null;
    }

    public Character g() {
        Character ch2 = this.f63105b;
        if (ch2 != null) {
            return ch2;
        }
        String str = this.f63104a;
        if (str == null || str.length() == 0 || this.f63107d >= this.f63104a.length()) {
            return null;
        }
        return Character.valueOf(this.f63104a.charAt(this.f63107d));
    }

    protected String h() {
        String strSubstring = this.f63104a.substring(this.f63107d);
        if (this.f63105b == null) {
            return strSubstring;
        }
        return this.f63105b + strSubstring;
    }

    public void i() {
        this.f63105b = this.f63106c;
        this.f63107d = this.f63108e;
    }
}
