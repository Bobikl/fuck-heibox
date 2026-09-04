package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import kotlin.text.y;

/* JADX INFO: compiled from: BidiFormatter.java */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final q f21097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char f21098e = 8234;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final char f21099f = 8235;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final char f21100g = 8236;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final char f21101h = 8206;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final char f21102i = 8207;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f21103j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f21104k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f21105l = "";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f21106m = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f21107n = 2;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final a f21108o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final a f21109p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f21110q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f21111r = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f21112s = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f21113a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f21114b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q f21115c;

    /* JADX INFO: renamed from: androidx.core.text.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BidiFormatter.java */
    public static final class C0141a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f21116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f21117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private q f21118c;

        public C0141a() {
            c(a.j(Locale.getDefault()));
        }

        public C0141a(Locale locale) {
            c(a.j(locale));
        }

        public C0141a(boolean z10) {
            c(z10);
        }

        private static a b(boolean z10) {
            return z10 ? a.f21109p : a.f21108o;
        }

        private void c(boolean z10) {
            this.f21116a = z10;
            this.f21118c = a.f21097d;
            this.f21117b = 2;
        }

        public a a() {
            return (this.f21117b == 2 && this.f21118c == a.f21097d) ? b(this.f21116a) : new a(this.f21116a, this.f21117b, this.f21118c);
        }

        public C0141a d(q qVar) {
            this.f21118c = qVar;
            return this;
        }

        public C0141a e(boolean z10) {
            if (z10) {
                this.f21117b |= 2;
            } else {
                this.f21117b &= -3;
            }
            return this;
        }
    }

    /* JADX INFO: compiled from: BidiFormatter.java */
    public static class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f21119f = 1792;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final byte[] f21120g = new byte[1792];

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CharSequence f21121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f21122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f21123c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f21124d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private char f21125e;

        static {
            for (int i10 = 0; i10 < 1792; i10++) {
                f21120g[i10] = Character.getDirectionality(i10);
            }
        }

        b(CharSequence charSequence, boolean z10) {
            this.f21121a = charSequence;
            this.f21122b = z10;
            this.f21123c = charSequence.length();
        }

        private static byte c(char c10) {
            return c10 < 1792 ? f21120g[c10] : Character.getDirectionality(c10);
        }

        private byte f() {
            char cCharAt;
            int i10 = this.f21124d;
            do {
                int i11 = this.f21124d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f21121a;
                int i12 = i11 - 1;
                this.f21124d = i12;
                cCharAt = charSequence.charAt(i12);
                this.f21125e = cCharAt;
                if (cCharAt == '&') {
                    return (byte) 12;
                }
            } while (cCharAt != ';');
            this.f21124d = i10;
            this.f21125e = ';';
            return (byte) 13;
        }

        private byte g() {
            char cCharAt;
            do {
                int i10 = this.f21124d;
                if (i10 >= this.f21123c) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.f21121a;
                this.f21124d = i10 + 1;
                cCharAt = charSequence.charAt(i10);
                this.f21125e = cCharAt;
            } while (cCharAt != ';');
            return (byte) 12;
        }

        private byte h() {
            char cCharAt;
            int i10 = this.f21124d;
            while (true) {
                int i11 = this.f21124d;
                if (i11 <= 0) {
                    break;
                }
                CharSequence charSequence = this.f21121a;
                int i12 = i11 - 1;
                this.f21124d = i12;
                char cCharAt2 = charSequence.charAt(i12);
                this.f21125e = cCharAt2;
                if (cCharAt2 == '<') {
                    return (byte) 12;
                }
                if (cCharAt2 == '>') {
                    break;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i13 = this.f21124d;
                        if (i13 <= 0) {
                            break;
                        }
                        CharSequence charSequence2 = this.f21121a;
                        int i14 = i13 - 1;
                        this.f21124d = i14;
                        cCharAt = charSequence2.charAt(i14);
                        this.f21125e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
            this.f21124d = i10;
            this.f21125e = y.f128597f;
            return (byte) 13;
        }

        private byte i() {
            char cCharAt;
            int i10 = this.f21124d;
            while (true) {
                int i11 = this.f21124d;
                if (i11 >= this.f21123c) {
                    this.f21124d = i10;
                    this.f21125e = y.f128596e;
                    return (byte) 13;
                }
                CharSequence charSequence = this.f21121a;
                this.f21124d = i11 + 1;
                char cCharAt2 = charSequence.charAt(i11);
                this.f21125e = cCharAt2;
                if (cCharAt2 == '>') {
                    return (byte) 12;
                }
                if (cCharAt2 == '\"' || cCharAt2 == '\'') {
                    do {
                        int i12 = this.f21124d;
                        if (i12 >= this.f21123c) {
                            break;
                        }
                        CharSequence charSequence2 = this.f21121a;
                        this.f21124d = i12 + 1;
                        cCharAt = charSequence2.charAt(i12);
                        this.f21125e = cCharAt;
                    } while (cCharAt != cCharAt2);
                }
            }
        }

        byte a() {
            char cCharAt = this.f21121a.charAt(this.f21124d - 1);
            this.f21125e = cCharAt;
            if (Character.isLowSurrogate(cCharAt)) {
                int iCodePointBefore = Character.codePointBefore(this.f21121a, this.f21124d);
                this.f21124d -= Character.charCount(iCodePointBefore);
                return Character.getDirectionality(iCodePointBefore);
            }
            this.f21124d--;
            byte bC = c(this.f21125e);
            if (!this.f21122b) {
                return bC;
            }
            char c10 = this.f21125e;
            if (c10 == '>') {
                return h();
            }
            return c10 == ';' ? f() : bC;
        }

        byte b() {
            char cCharAt = this.f21121a.charAt(this.f21124d);
            this.f21125e = cCharAt;
            if (Character.isHighSurrogate(cCharAt)) {
                int iCodePointAt = Character.codePointAt(this.f21121a, this.f21124d);
                this.f21124d += Character.charCount(iCodePointAt);
                return Character.getDirectionality(iCodePointAt);
            }
            this.f21124d++;
            byte bC = c(this.f21125e);
            if (!this.f21122b) {
                return bC;
            }
            char c10 = this.f21125e;
            if (c10 == '<') {
                return i();
            }
            return c10 == '&' ? g() : bC;
        }

        int d() {
            this.f21124d = 0;
            int i10 = 0;
            int i11 = 0;
            int i12 = 0;
            while (this.f21124d < this.f21123c && i10 == 0) {
                byte b10 = b();
                if (b10 != 0) {
                    if (b10 == 1 || b10 == 2) {
                        if (i12 == 0) {
                            return 1;
                        }
                    } else if (b10 != 9) {
                        switch (b10) {
                            case 14:
                            case 15:
                                i12++;
                                i11 = -1;
                                continue;
                            case 16:
                            case 17:
                                i12++;
                                i11 = 1;
                                continue;
                            case 18:
                                i12--;
                                i11 = 0;
                                continue;
                        }
                    }
                } else if (i12 == 0) {
                    return -1;
                }
                i10 = i12;
            }
            if (i10 == 0) {
                return 0;
            }
            if (i11 != 0) {
                return i11;
            }
            while (this.f21124d > 0) {
                switch (a()) {
                    case 14:
                    case 15:
                        if (i10 == i12) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i10 == i12) {
                            return 1;
                        }
                        break;
                    case 18:
                        i12++;
                        continue;
                    default:
                        continue;
                }
                i12--;
            }
            return 0;
        }

        int e() {
            this.f21124d = this.f21123c;
            int i10 = 0;
            while (true) {
                int i11 = i10;
                while (this.f21124d > 0) {
                    byte bA = a();
                    if (bA == 0) {
                        if (i10 == 0) {
                            return -1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA == 1 || bA == 2) {
                        if (i10 == 0) {
                            return 1;
                        }
                        if (i11 == 0) {
                        }
                    } else if (bA != 9) {
                        switch (bA) {
                            case 14:
                            case 15:
                                if (i11 == i10) {
                                    return -1;
                                }
                                i10--;
                                break;
                            case 16:
                            case 17:
                                if (i11 == i10) {
                                    return 1;
                                }
                                i10--;
                                break;
                            case 18:
                                i10++;
                                break;
                            default:
                                if (i11 != 0) {
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                }
                return 0;
            }
        }
    }

    static {
        q qVar = r.f21160c;
        f21097d = qVar;
        f21103j = Character.toString(f21101h);
        f21104k = Character.toString(f21102i);
        f21108o = new a(false, 2, qVar);
        f21109p = new a(true, 2, qVar);
    }

    a(boolean z10, int i10, q qVar) {
        this.f21113a = z10;
        this.f21114b = i10;
        this.f21115c = qVar;
    }

    private static int a(CharSequence charSequence) {
        return new b(charSequence, false).d();
    }

    private static int b(CharSequence charSequence) {
        return new b(charSequence, false).e();
    }

    public static a c() {
        return new C0141a().a();
    }

    public static a d(Locale locale) {
        return new C0141a(locale).a();
    }

    public static a e(boolean z10) {
        return new C0141a(z10).a();
    }

    static boolean j(Locale locale) {
        return s.b(locale) == 1;
    }

    private String k(CharSequence charSequence, q qVar) {
        boolean zIsRtl = qVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f21113a && (zIsRtl || b(charSequence) == 1)) {
            return f21103j;
        }
        if (this.f21113a) {
            return (!zIsRtl || b(charSequence) == -1) ? f21104k : "";
        }
        return "";
    }

    private String l(CharSequence charSequence, q qVar) {
        boolean zIsRtl = qVar.isRtl(charSequence, 0, charSequence.length());
        if (!this.f21113a && (zIsRtl || a(charSequence) == 1)) {
            return f21103j;
        }
        if (this.f21113a) {
            return (!zIsRtl || a(charSequence) == -1) ? f21104k : "";
        }
        return "";
    }

    public boolean f() {
        return (this.f21114b & 2) != 0;
    }

    public boolean g(CharSequence charSequence) {
        return this.f21115c.isRtl(charSequence, 0, charSequence.length());
    }

    public boolean h(String str) {
        return g(str);
    }

    public boolean i() {
        return this.f21113a;
    }

    public CharSequence m(CharSequence charSequence) {
        return o(charSequence, this.f21115c, true);
    }

    public CharSequence n(CharSequence charSequence, q qVar) {
        return o(charSequence, qVar, true);
    }

    public CharSequence o(CharSequence charSequence, q qVar, boolean z10) {
        if (charSequence == null) {
            return null;
        }
        boolean zIsRtl = qVar.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (f() && z10) {
            spannableStringBuilder.append((CharSequence) l(charSequence, zIsRtl ? r.f21159b : r.f21158a));
        }
        if (zIsRtl != this.f21113a) {
            spannableStringBuilder.append(zIsRtl ? f21099f : f21098e);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(f21100g);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z10) {
            spannableStringBuilder.append((CharSequence) k(charSequence, zIsRtl ? r.f21159b : r.f21158a));
        }
        return spannableStringBuilder;
    }

    public CharSequence p(CharSequence charSequence, boolean z10) {
        return o(charSequence, this.f21115c, z10);
    }

    public String q(String str) {
        return s(str, this.f21115c, true);
    }

    public String r(String str, q qVar) {
        return s(str, qVar, true);
    }

    public String s(String str, q qVar, boolean z10) {
        if (str == null) {
            return null;
        }
        return o(str, qVar, z10).toString();
    }

    public String t(String str, boolean z10) {
        return s(str, this.f21115c, z10);
    }
}
