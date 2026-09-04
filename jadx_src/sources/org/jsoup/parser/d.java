package org.jsoup.parser;

import java.util.List;
import org.jsoup.nodes.Document;

/* JADX INFO: compiled from: Parser.java */
/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f137942d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private h f137943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f137944b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ParseErrorList f137945c;

    public d(h hVar) {
        this.f137943a = hVar;
    }

    public static d c() {
        return new d(new b());
    }

    public static Document e(String str, String str2) {
        return new b().d(str, str2, ParseErrorList.e());
    }

    public static Document f(String str, String str2) {
        Document documentT1 = Document.T1(str2);
        org.jsoup.nodes.f fVarQ1 = documentT1.Q1();
        List<org.jsoup.nodes.g> listH = h(str, fVarQ1, str2);
        for (org.jsoup.nodes.g gVar : (org.jsoup.nodes.g[]) listH.toArray(new org.jsoup.nodes.g[listH.size()])) {
            fVarQ1.i0(gVar);
        }
        return documentT1;
    }

    public static Document g(String str, String str2) {
        return e(str, str2);
    }

    public static List<org.jsoup.nodes.g> h(String str, org.jsoup.nodes.f fVar, String str2) {
        return new b().d0(str, fVar, str2, ParseErrorList.e());
    }

    public static List<org.jsoup.nodes.g> j(String str, String str2) {
        return new i().l(str, str2, ParseErrorList.e());
    }

    public static String m(String str, boolean z10) {
        return new g(new a(str), ParseErrorList.e()).y(z10);
    }

    public static d n() {
        return new d(new i());
    }

    public List<c> a() {
        return this.f137945c;
    }

    public h b() {
        return this.f137943a;
    }

    public boolean d() {
        return this.f137944b > 0;
    }

    public Document i(String str, String str2) {
        ParseErrorList parseErrorListG = d() ? ParseErrorList.g(this.f137944b) : ParseErrorList.e();
        this.f137945c = parseErrorListG;
        return this.f137943a.d(str, str2, parseErrorListG);
    }

    public d k(int i10) {
        this.f137944b = i10;
        return this;
    }

    public d l(h hVar) {
        this.f137943a = hVar;
        return this;
    }
}
