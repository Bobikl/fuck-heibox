package org.jsoup.nodes;

/* JADX INFO: compiled from: DataNode.java */
/* JADX INFO: loaded from: classes5.dex */
public class d extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f137889g = "data";

    public d(String str, String str2) {
        super(str2);
        this.f137896d.t("data", str);
    }

    public static d b0(String str, String str2) {
        return new d(Entities.k(str), str2);
    }

    @Override // org.jsoup.nodes.g
    void C(StringBuilder sb2, int i10, Document.a aVar) {
        sb2.append(c0());
    }

    @Override // org.jsoup.nodes.g
    void D(StringBuilder sb2, int i10, Document.a aVar) {
    }

    public String c0() {
        return this.f137896d.m("data");
    }

    public d d0(String str) {
        this.f137896d.t("data", str);
        return this;
    }

    @Override // org.jsoup.nodes.g
    public String toString() {
        return z();
    }

    @Override // org.jsoup.nodes.g
    public String y() {
        return "#data";
    }
}
