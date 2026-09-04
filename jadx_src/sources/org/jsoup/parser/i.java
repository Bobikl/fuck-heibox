package org.jsoup.parser;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: XmlTreeBuilder.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends h {

    /* JADX INFO: compiled from: XmlTreeBuilder.java */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f137983a;

        static {
            int[] iArr = new int[Token.TokenType.values().length];
            f137983a = iArr;
            try {
                iArr[Token.TokenType.StartTag.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f137983a[Token.TokenType.EndTag.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f137983a[Token.TokenType.Comment.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f137983a[Token.TokenType.Character.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f137983a[Token.TokenType.Doctype.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f137983a[Token.TokenType.EOF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private void k(org.jsoup.nodes.g gVar) {
        a().i0(gVar);
    }

    private void m(Token.f fVar) {
        org.jsoup.nodes.f next;
        String strX = fVar.x();
        Iterator<org.jsoup.nodes.f> itDescendingIterator = this.f137979d.descendingIterator();
        do {
            if (!itDescendingIterator.hasNext()) {
                next = null;
                break;
            }
            next = itDescendingIterator.next();
        } while (!next.y().equals(strX));
        if (next == null) {
            return;
        }
        Iterator<org.jsoup.nodes.f> itDescendingIterator2 = this.f137979d.descendingIterator();
        while (itDescendingIterator2.hasNext()) {
            if (itDescendingIterator2.next() == next) {
                itDescendingIterator2.remove();
                return;
            }
            itDescendingIterator2.remove();
        }
    }

    @Override // org.jsoup.parser.h
    protected void b(String str, String str2, ParseErrorList parseErrorList) {
        super.b(str, str2, parseErrorList);
        this.f137979d.add(this.f137978c);
    }

    @Override // org.jsoup.parser.h
    protected boolean e(Token token) {
        switch (a.f137983a[token.f137910a.ordinal()]) {
            case 1:
                g(token.e());
                break;
            case 2:
                m(token.d());
                break;
            case 3:
                i(token.b());
                break;
            case 4:
                h(token.a());
                break;
            case 5:
                j(token.c());
                break;
            case 6:
                break;
            default:
                org.jsoup.helper.d.a("Unexpected token type: " + token.f137910a);
                break;
        }
        return true;
    }

    org.jsoup.nodes.f g(Token.g gVar) {
        e eVarN = e.n(gVar.x());
        org.jsoup.nodes.f fVar = new org.jsoup.nodes.f(eVarN, this.f137980e, gVar.f137922f);
        k(fVar);
        if (gVar.w()) {
            this.f137977b.a();
            if (!eVarN.h()) {
                eVarN.m();
            }
        } else {
            this.f137979d.add(fVar);
        }
        return fVar;
    }

    void h(Token.b bVar) {
        k(new org.jsoup.nodes.h(bVar.m(), this.f137980e));
    }

    void i(Token.c cVar) {
        org.jsoup.nodes.c cVar2 = new org.jsoup.nodes.c(cVar.m(), this.f137980e);
        org.jsoup.nodes.g iVar = cVar2;
        if (cVar.f137913c) {
            String strB0 = cVar2.b0();
            if (strB0.length() > 1 && (strB0.startsWith("!") || strB0.startsWith("?"))) {
                iVar = cVar2;
                iVar = cVar2;
                iVar = cVar2;
                iVar = new org.jsoup.nodes.i(strB0.substring(1), cVar2.j(), strB0.startsWith("!"));
            }
        }
        iVar = cVar2;
        iVar = cVar2;
        iVar = cVar2;
        k(iVar);
    }

    void j(Token.d dVar) {
        k(new org.jsoup.nodes.e(dVar.m(), dVar.n(), dVar.o(), this.f137980e));
    }

    List<org.jsoup.nodes.g> l(String str, String str2, ParseErrorList parseErrorList) {
        b(str, str2, parseErrorList);
        f();
        return this.f137978c.o();
    }
}
