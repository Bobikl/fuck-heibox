package org.jsoup.nodes;

/* JADX INFO: compiled from: XmlDeclaration.java */
/* JADX INFO: loaded from: classes5.dex */
public class i extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f137905h = "declaration";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f137906g;

    public i(String str, String str2, boolean z10) {
        super(str2);
        this.f137896d.t(f137905h, str);
        this.f137906g = z10;
    }

    @Override // org.jsoup.nodes.g
    void C(StringBuilder sb2, int i10, Document.a aVar) {
        sb2.append("<");
        sb2.append(this.f137906g ? "!" : "?");
        sb2.append(b0());
        sb2.append(">");
    }

    @Override // org.jsoup.nodes.g
    void D(StringBuilder sb2, int i10, Document.a aVar) {
    }

    public String b0() {
        return this.f137896d.m(f137905h);
    }

    @Override // org.jsoup.nodes.g
    public String toString() {
        return z();
    }

    @Override // org.jsoup.nodes.g
    public String y() {
        return "#declaration";
    }
}
