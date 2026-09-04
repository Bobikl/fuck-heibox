package org.jsoup.nodes;

import kotlin.text.y;

/* JADX INFO: compiled from: DocumentType.java */
/* JADX INFO: loaded from: classes5.dex */
public class e extends g {
    public e(String str, String str2, String str3, String str4) {
        super(str4);
        org.jsoup.helper.d.h(str);
        h("name", str);
        h("publicId", str2);
        h("systemId", str3);
    }

    @Override // org.jsoup.nodes.g
    void C(StringBuilder sb2, int i10, Document.a aVar) {
        sb2.append("<!DOCTYPE ");
        sb2.append(g("name"));
        if (!org.jsoup.helper.c.b(g("publicId"))) {
            sb2.append(" PUBLIC \"");
            sb2.append(g("publicId"));
            sb2.append("\"");
        }
        if (!org.jsoup.helper.c.b(g("systemId"))) {
            sb2.append(" \"");
            sb2.append(g("systemId"));
            sb2.append("\"");
        }
        sb2.append(y.f128597f);
    }

    @Override // org.jsoup.nodes.g
    void D(StringBuilder sb2, int i10, Document.a aVar) {
    }

    @Override // org.jsoup.nodes.g
    public String y() {
        return "#doctype";
    }
}
