package org.jsoup.nodes;

/* JADX INFO: compiled from: TextNode.java */
/* JADX INFO: loaded from: classes5.dex */
public class h extends g {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f137903h = "text";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f137904g;

    public h(String str, String str2) {
        this.f137897e = str2;
        this.f137904g = str;
    }

    public static h b0(String str, String str2) {
        return new h(Entities.k(str), str2);
    }

    private void c0() {
        if (this.f137896d == null) {
            b bVar = new b();
            this.f137896d = bVar;
            bVar.t("text", this.f137904g);
        }
    }

    static boolean f0(StringBuilder sb2) {
        return sb2.length() != 0 && sb2.charAt(sb2.length() - 1) == ' ';
    }

    static String g0(String str) {
        return org.jsoup.helper.c.g(str);
    }

    static String i0(String str) {
        return str.replaceFirst("^\\s+", "");
    }

    /* JADX WARN: Code duplicated, block: B:19:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0060  */
    @Override // org.jsoup.nodes.g
    void C(StringBuilder sb2, int i10, Document.a aVar) {
        String strE = Entities.e(d0(), aVar);
        if (aVar.m() && (F() instanceof f) && !f.z1((f) F())) {
            strE = g0(strE);
        }
        if (aVar.m()) {
            if (U() == 0) {
                g gVar = this.f137894b;
                if ((gVar instanceof f) && ((f) gVar).E1().b() && !e0()) {
                    w(sb2, i10, aVar);
                } else if (aVar.k() && V().size() > 0 && !e0()) {
                    w(sb2, i10, aVar);
                }
            } else if (aVar.k()) {
                w(sb2, i10, aVar);
            }
        }
        sb2.append(strE);
    }

    @Override // org.jsoup.nodes.g
    void D(StringBuilder sb2, int i10, Document.a aVar) {
    }

    @Override // org.jsoup.nodes.g
    public g K(String str) {
        c0();
        return super.K(str);
    }

    @Override // org.jsoup.nodes.g
    public String a(String str) {
        c0();
        return super.a(str);
    }

    public String d0() {
        b bVar = this.f137896d;
        return bVar == null ? this.f137904g : bVar.m("text");
    }

    public boolean e0() {
        return org.jsoup.helper.c.b(d0());
    }

    @Override // org.jsoup.nodes.g
    public String g(String str) {
        c0();
        return super.g(str);
    }

    @Override // org.jsoup.nodes.g
    public g h(String str, String str2) {
        c0();
        return super.h(str, str2);
    }

    public h h0(int i10) {
        org.jsoup.helper.d.e(i10 >= 0, "Split offset must be not be negative");
        org.jsoup.helper.d.e(i10 < this.f137904g.length(), "Split offset must not be greater than current text length");
        String strSubstring = d0().substring(0, i10);
        String strSubstring2 = d0().substring(i10);
        k0(strSubstring);
        h hVar = new h(strSubstring2, j());
        if (F() != null) {
            F().b(U() + 1, hVar);
        }
        return hVar;
    }

    @Override // org.jsoup.nodes.g
    public b i() {
        c0();
        return super.i();
    }

    public String j0() {
        return g0(d0());
    }

    public h k0(String str) {
        this.f137904g = str;
        b bVar = this.f137896d;
        if (bVar != null) {
            bVar.t("text", str);
        }
        return this;
    }

    @Override // org.jsoup.nodes.g
    public String toString() {
        return z();
    }

    @Override // org.jsoup.nodes.g
    public boolean v(String str) {
        c0();
        return super.v(str);
    }

    @Override // org.jsoup.nodes.g
    public String y() {
        return "#text";
    }
}
