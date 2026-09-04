package org.jsoup.parser;

/* JADX INFO: loaded from: classes5.dex */
public abstract class Token {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    TokenType f137910a;

    public enum TokenType {
        Doctype,
        StartTag,
        EndTag,
        Comment,
        Character,
        EOF
    }

    public static class b extends Token {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f137911b;

        b(String str) {
            super();
            this.f137910a = TokenType.Character;
            this.f137911b = str;
        }

        String m() {
            return this.f137911b;
        }

        public String toString() {
            return m();
        }
    }

    public static class c extends Token {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final StringBuilder f137912b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f137913c;

        c() {
            super();
            this.f137912b = new StringBuilder();
            this.f137913c = false;
            this.f137910a = TokenType.Comment;
        }

        String m() {
            return this.f137912b.toString();
        }

        public String toString() {
            return "<!--" + m() + "-->";
        }
    }

    public static class d extends Token {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final StringBuilder f137914b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final StringBuilder f137915c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final StringBuilder f137916d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f137917e;

        d() {
            super();
            this.f137914b = new StringBuilder();
            this.f137915c = new StringBuilder();
            this.f137916d = new StringBuilder();
            this.f137917e = false;
            this.f137910a = TokenType.Doctype;
        }

        String m() {
            return this.f137914b.toString();
        }

        String n() {
            return this.f137915c.toString();
        }

        public String o() {
            return this.f137916d.toString();
        }

        public boolean p() {
            return this.f137917e;
        }
    }

    public static class e extends Token {
        e() {
            super();
            this.f137910a = TokenType.EOF;
        }
    }

    public static class f extends h {
        f() {
            this.f137910a = TokenType.EndTag;
        }

        f(String str) {
            this();
            this.f137918b = str;
        }

        public String toString() {
            return "</" + x() + ">";
        }
    }

    public static class g extends h {
        g() {
            this.f137922f = new org.jsoup.nodes.b();
            this.f137910a = TokenType.StartTag;
        }

        g(String str) {
            this();
            this.f137918b = str;
        }

        g(String str, org.jsoup.nodes.b bVar) {
            this();
            this.f137918b = str;
            this.f137922f = bVar;
        }

        public String toString() {
            org.jsoup.nodes.b bVar = this.f137922f;
            if (bVar == null || bVar.size() <= 0) {
                return "<" + x() + ">";
            }
            return "<" + x() + " " + this.f137922f.toString() + ">";
        }
    }

    public static abstract class h extends Token {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected String f137918b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f137919c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private StringBuilder f137920d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f137921e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        org.jsoup.nodes.b f137922f;

        h() {
            super();
            this.f137921e = false;
        }

        private final void t() {
            if (this.f137920d == null) {
                this.f137920d = new StringBuilder();
            }
        }

        void m(char c10) {
            n(String.valueOf(c10));
        }

        void n(String str) {
            String str2 = this.f137919c;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f137919c = str;
        }

        void o(char c10) {
            t();
            this.f137920d.append(c10);
        }

        void p(String str) {
            t();
            this.f137920d.append(str);
        }

        void q(char[] cArr) {
            t();
            this.f137920d.append(cArr);
        }

        void r(char c10) {
            s(String.valueOf(c10));
        }

        void s(String str) {
            String str2 = this.f137918b;
            if (str2 != null) {
                str = str2.concat(str);
            }
            this.f137918b = str;
        }

        void u() {
            if (this.f137919c != null) {
                z();
            }
        }

        org.jsoup.nodes.b v() {
            return this.f137922f;
        }

        boolean w() {
            return this.f137921e;
        }

        String x() {
            org.jsoup.helper.d.b(this.f137918b.length() == 0);
            return this.f137918b;
        }

        h y(String str) {
            this.f137918b = str;
            return this;
        }

        void z() {
            if (this.f137922f == null) {
                this.f137922f = new org.jsoup.nodes.b();
            }
            String str = this.f137919c;
            if (str != null) {
                StringBuilder sb2 = this.f137920d;
                this.f137922f.u(sb2 == null ? new org.jsoup.nodes.a(str, "") : new org.jsoup.nodes.a(str, sb2.toString()));
            }
            this.f137919c = null;
            StringBuilder sb3 = this.f137920d;
            if (sb3 != null) {
                sb3.delete(0, sb3.length());
            }
        }
    }

    private Token() {
    }

    b a() {
        return (b) this;
    }

    c b() {
        return (c) this;
    }

    d c() {
        return (d) this;
    }

    f d() {
        return (f) this;
    }

    g e() {
        return (g) this;
    }

    boolean f() {
        return this.f137910a == TokenType.Character;
    }

    boolean g() {
        return this.f137910a == TokenType.Comment;
    }

    boolean h() {
        return this.f137910a == TokenType.Doctype;
    }

    boolean i() {
        return this.f137910a == TokenType.EOF;
    }

    boolean j() {
        return this.f137910a == TokenType.EndTag;
    }

    boolean k() {
        return this.f137910a == TokenType.StartTag;
    }

    String l() {
        return getClass().getSimpleName();
    }
}
