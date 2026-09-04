package org.jsoup.nodes;

/* JADX INFO: compiled from: Comment.java */
/* JADX INFO: loaded from: classes5.dex */
public class c extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f137888g = "comment";

    public c(String str, String str2) {
        super(str2);
        this.f137896d.t("comment", str);
    }

    @Override // org.jsoup.nodes.g
    void C(StringBuilder sb2, int i10, Document.a aVar) {
        if (aVar.m()) {
            w(sb2, i10, aVar);
        }
        sb2.append("<!--");
        sb2.append(b0());
        sb2.append("-->");
    }

    @Override // org.jsoup.nodes.g
    void D(StringBuilder sb2, int i10, Document.a aVar) {
    }

    public String b0() {
        return this.f137896d.m("comment");
    }

    @Override // org.jsoup.nodes.g
    public String toString() {
        return z();
    }

    @Override // org.jsoup.nodes.g
    public String y() {
        return "#comment";
    }
}
