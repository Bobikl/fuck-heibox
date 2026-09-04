package org.jsoup.parser;

import org.jsoup.helper.DescendableLinkedList;
import org.jsoup.nodes.Document;

/* JADX INFO: compiled from: TreeBuilder.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    a f137976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    g f137977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected Document f137978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected DescendableLinkedList<org.jsoup.nodes.f> f137979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected String f137980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected Token f137981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected ParseErrorList f137982g;

    h() {
    }

    protected org.jsoup.nodes.f a() {
        return this.f137979d.getLast();
    }

    protected void b(String str, String str2, ParseErrorList parseErrorList) {
        org.jsoup.helper.d.k(str, "String input must not be null");
        org.jsoup.helper.d.k(str2, "BaseURI must not be null");
        this.f137978c = new Document(str2);
        a aVar = new a(str);
        this.f137976a = aVar;
        this.f137982g = parseErrorList;
        this.f137977b = new g(aVar, parseErrorList);
        this.f137979d = new DescendableLinkedList<>();
        this.f137980e = str2;
    }

    Document c(String str, String str2) {
        return d(str, str2, ParseErrorList.e());
    }

    Document d(String str, String str2, ParseErrorList parseErrorList) {
        b(str, str2, parseErrorList);
        f();
        return this.f137978c;
    }

    protected abstract boolean e(Token token);

    protected void f() {
        Token tokenW;
        do {
            tokenW = this.f137977b.w();
            e(tokenW);
        } while (tokenW.f137910a != Token.TokenType.EOF);
    }
}
