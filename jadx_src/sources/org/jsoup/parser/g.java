package org.jsoup.parser;

import kotlin.text.y;
import org.jsoup.nodes.Entities;

/* JADX INFO: compiled from: Tokeniser.java */
/* JADX INFO: loaded from: classes5.dex */
public class g {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final char f137963m = 65533;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f137964a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ParseErrorList f137965b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Token f137967d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    StringBuilder f137970g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    Token.h f137971h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    Token.d f137972i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Token.c f137973j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Token.g f137974k;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TokeniserState f137966c = TokeniserState.Data;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f137968e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private StringBuilder f137969f = new StringBuilder();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f137975l = true;

    g(a aVar, ParseErrorList parseErrorList) {
        this.f137964a = aVar;
        this.f137965b = parseErrorList;
    }

    private void d(String str) {
        if (this.f137965b.a()) {
            this.f137965b.add(new c(this.f137964a.z(), "Invalid character reference: %s", str));
        }
    }

    private void s(String str) {
        if (this.f137965b.a()) {
            this.f137965b.add(new c(this.f137964a.z(), str));
        }
    }

    void a() {
        this.f137975l = true;
    }

    void b(TokeniserState tokeniserState) {
        this.f137964a.a();
        this.f137966c = tokeniserState;
    }

    String c() {
        return this.f137974k.f137918b;
    }

    char[] e(Character ch2, boolean z10) {
        int iIntValue;
        if (this.f137964a.n()) {
            return null;
        }
        if ((ch2 != null && ch2.charValue() == this.f137964a.m()) || this.f137964a.t('\t', '\n', '\r', '\f', ' ', y.f128596e, y.f128595d)) {
            return null;
        }
        this.f137964a.o();
        if (!this.f137964a.p("#")) {
            String strG = this.f137964a.g();
            boolean zR = this.f137964a.r(';');
            if (!(Entities.g(strG) || (Entities.h(strG) && zR))) {
                this.f137964a.A();
                if (zR) {
                    d(String.format("invalid named referenece '%s'", strG));
                }
                return null;
            }
            if (z10 && (this.f137964a.w() || this.f137964a.u() || this.f137964a.t(n5.a.f132013h, '-', '_'))) {
                this.f137964a.A();
                return null;
            }
            if (!this.f137964a.p(";")) {
                d("missing semicolon");
            }
            return new char[]{Entities.f(strG).charValue()};
        }
        boolean zQ = this.f137964a.q("X");
        a aVar = this.f137964a;
        String strE = zQ ? aVar.e() : aVar.d();
        if (strE.length() == 0) {
            d("numeric reference with no numerals");
            this.f137964a.A();
            return null;
        }
        if (!this.f137964a.p(";")) {
            d("missing semicolon");
        }
        try {
            iIntValue = Integer.valueOf(strE, zQ ? 16 : 10).intValue();
        } catch (NumberFormatException unused) {
            iIntValue = -1;
        }
        if (iIntValue != -1 && ((iIntValue < 55296 || iIntValue > 57343) && iIntValue <= 1114111)) {
            return Character.toChars(iIntValue);
        }
        d("character outside of valid range");
        return new char[]{65533};
    }

    void f() {
        this.f137973j = new Token.c();
    }

    void g() {
        this.f137972i = new Token.d();
    }

    Token.h h(boolean z10) {
        Token.h gVar = z10 ? new Token.g() : new Token.f();
        this.f137971h = gVar;
        return gVar;
    }

    void i() {
        this.f137970g = new StringBuilder();
    }

    boolean j() {
        return true;
    }

    void k(char c10) {
        this.f137969f.append(c10);
    }

    void l(String str) {
        this.f137969f.append(str);
    }

    void m(Token token) {
        org.jsoup.helper.d.c(this.f137968e, "There is an unread token pending!");
        this.f137967d = token;
        this.f137968e = true;
        Token.TokenType tokenType = token.f137910a;
        if (tokenType != Token.TokenType.StartTag) {
            if (tokenType != Token.TokenType.EndTag || ((Token.f) token).f137922f == null) {
                return;
            }
            s("Attributes incorrectly present on end tag");
            return;
        }
        Token.g gVar = (Token.g) token;
        this.f137974k = gVar;
        if (gVar.f137921e) {
            this.f137975l = false;
        }
    }

    void n(char[] cArr) {
        this.f137969f.append(cArr);
    }

    void o() {
        m(this.f137973j);
    }

    void p() {
        m(this.f137972i);
    }

    void q() {
        this.f137971h.u();
        m(this.f137971h);
    }

    void r(TokeniserState tokeniserState) {
        if (this.f137965b.a()) {
            this.f137965b.add(new c(this.f137964a.z(), "Unexpectedly reached end of file (EOF) in input state [%s]", tokeniserState));
        }
    }

    void t(TokeniserState tokeniserState) {
        if (this.f137965b.a()) {
            this.f137965b.add(new c(this.f137964a.z(), "Unexpected character '%s' in input state [%s]", Character.valueOf(this.f137964a.m()), tokeniserState));
        }
    }

    TokeniserState u() {
        return this.f137966c;
    }

    boolean v() {
        Token.g gVar = this.f137974k;
        if (gVar == null) {
            return false;
        }
        return this.f137971h.f137918b.equals(gVar.f137918b);
    }

    Token w() {
        if (!this.f137975l) {
            s("Self closing flag not acknowledged");
            this.f137975l = true;
        }
        while (!this.f137968e) {
            this.f137966c.read(this, this.f137964a);
        }
        if (this.f137969f.length() <= 0) {
            this.f137968e = false;
            return this.f137967d;
        }
        String string = this.f137969f.toString();
        StringBuilder sb2 = this.f137969f;
        sb2.delete(0, sb2.length());
        return new Token.b(string);
    }

    void x(TokeniserState tokeniserState) {
        this.f137966c = tokeniserState;
    }

    String y(boolean z10) {
        StringBuilder sb2 = new StringBuilder();
        while (!this.f137964a.n()) {
            sb2.append(this.f137964a.h(y.f128595d));
            if (this.f137964a.r(y.f128595d)) {
                this.f137964a.b();
                char[] cArrE = e(null, z10);
                if (cArrE == null || cArrE.length == 0) {
                    sb2.append(y.f128595d);
                } else {
                    sb2.append(cArrE);
                }
            }
        }
        return sb2.toString();
    }
}
