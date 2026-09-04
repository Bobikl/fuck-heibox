package org.jsoup.nodes;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: Node.java */
/* JADX INFO: loaded from: classes5.dex */
public abstract class g implements Cloneable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    g f137894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    List<g> f137895c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    org.jsoup.nodes.b f137896d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f137897e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f137898f;

    /* JADX INFO: compiled from: Node.java */
    public class a implements org.jsoup.select.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f137899a;

        a(String str) {
            this.f137899a = str;
        }

        @Override // org.jsoup.select.f
        public void a(g gVar, int i10) {
        }

        @Override // org.jsoup.select.f
        public void b(g gVar, int i10) {
            gVar.f137897e = this.f137899a;
        }
    }

    /* JADX INFO: compiled from: Node.java */
    public static class b implements org.jsoup.select.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private StringBuilder f137901a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Document.a f137902b;

        b(StringBuilder sb2, Document.a aVar) {
            this.f137901a = sb2;
            this.f137902b = aVar;
        }

        @Override // org.jsoup.select.f
        public void a(g gVar, int i10) {
            if (gVar.y().equals("#text")) {
                return;
            }
            gVar.D(this.f137901a, i10, this.f137902b);
        }

        @Override // org.jsoup.select.f
        public void b(g gVar, int i10) {
            gVar.C(this.f137901a, i10, this.f137902b);
        }
    }

    protected g() {
        this.f137895c = Collections.emptyList();
        this.f137896d = null;
    }

    protected g(String str) {
        this(str, new org.jsoup.nodes.b());
    }

    protected g(String str, org.jsoup.nodes.b bVar) {
        org.jsoup.helper.d.j(str);
        org.jsoup.helper.d.j(bVar);
        this.f137895c = new ArrayList(4);
        this.f137897e = str.trim();
        this.f137896d = bVar;
    }

    private void H() {
        for (int i10 = 0; i10 < this.f137895c.size(); i10++) {
            this.f137895c.get(i10).T(i10);
        }
    }

    private void O(g gVar) {
        g gVar2 = gVar.f137894b;
        if (gVar2 != null) {
            gVar2.M(gVar);
        }
        gVar.S(this);
    }

    private void d(int i10, String str) {
        org.jsoup.helper.d.j(str);
        org.jsoup.helper.d.j(this.f137894b);
        List<g> listH = org.jsoup.parser.d.h(str, F() instanceof f ? (f) F() : null, j());
        this.f137894b.b(i10, (g[]) listH.toArray(new g[listH.size()]));
    }

    private f t(f fVar) {
        org.jsoup.select.c cVarR0 = fVar.r0();
        return cVarR0.size() > 0 ? t(cVarR0.get(0)) : fVar;
    }

    private Document.a u() {
        return (E() != null ? E() : new Document("")).Z1();
    }

    protected void B(StringBuilder sb2) {
        new org.jsoup.select.e(new b(sb2, u())).a(this);
    }

    abstract void C(StringBuilder sb2, int i10, Document.a aVar);

    abstract void D(StringBuilder sb2, int i10, Document.a aVar);

    public Document E() {
        if (this instanceof Document) {
            return (Document) this;
        }
        g gVar = this.f137894b;
        if (gVar == null) {
            return null;
        }
        return gVar.E();
    }

    public g F() {
        return this.f137894b;
    }

    public g G() {
        g gVar = this.f137894b;
        if (gVar == null) {
            return null;
        }
        List<g> list = gVar.f137895c;
        Integer numValueOf = Integer.valueOf(U());
        org.jsoup.helper.d.j(numValueOf);
        if (numValueOf.intValue() > 0) {
            return list.get(numValueOf.intValue() - 1);
        }
        return null;
    }

    public void J() {
        org.jsoup.helper.d.j(this.f137894b);
        this.f137894b.M(this);
    }

    public g K(String str) {
        org.jsoup.helper.d.j(str);
        this.f137896d.v(str);
        return this;
    }

    protected void M(g gVar) {
        org.jsoup.helper.d.d(gVar.f137894b == this);
        this.f137895c.remove(gVar.U());
        H();
        gVar.f137894b = null;
    }

    protected void P(g gVar, g gVar2) {
        org.jsoup.helper.d.d(gVar.f137894b == this);
        org.jsoup.helper.d.j(gVar2);
        g gVar3 = gVar2.f137894b;
        if (gVar3 != null) {
            gVar3.M(gVar2);
        }
        Integer numValueOf = Integer.valueOf(gVar.U());
        this.f137895c.set(numValueOf.intValue(), gVar2);
        gVar2.f137894b = this;
        gVar2.T(numValueOf.intValue());
        gVar.f137894b = null;
    }

    public void Q(g gVar) {
        org.jsoup.helper.d.j(gVar);
        org.jsoup.helper.d.j(this.f137894b);
        this.f137894b.P(this, gVar);
    }

    public void R(String str) {
        org.jsoup.helper.d.j(str);
        X(new a(str));
    }

    protected void S(g gVar) {
        g gVar2 = this.f137894b;
        if (gVar2 != null) {
            gVar2.M(this);
        }
        this.f137894b = gVar;
    }

    protected void T(int i10) {
        this.f137898f = i10;
    }

    public int U() {
        return this.f137898f;
    }

    public List<g> V() {
        g gVar = this.f137894b;
        if (gVar == null) {
            return Collections.emptyList();
        }
        List<g> list = gVar.f137895c;
        ArrayList arrayList = new ArrayList(list.size() - 1);
        for (g gVar2 : list) {
            if (gVar2 != this) {
                arrayList.add(gVar2);
            }
        }
        return arrayList;
    }

    public g X(org.jsoup.select.f fVar) {
        org.jsoup.helper.d.j(fVar);
        new org.jsoup.select.e(fVar).a(this);
        return this;
    }

    public g Y() {
        org.jsoup.helper.d.j(this.f137894b);
        int i10 = this.f137898f;
        g gVar = this.f137895c.size() > 0 ? this.f137895c.get(0) : null;
        this.f137894b.b(i10, p());
        J();
        return gVar;
    }

    public g Z(String str) {
        org.jsoup.helper.d.h(str);
        List<g> listH = org.jsoup.parser.d.h(str, F() instanceof f ? (f) F() : null, j());
        g gVar = listH.get(0);
        if (gVar == null || !(gVar instanceof f)) {
            return null;
        }
        f fVar = (f) gVar;
        f fVarT = t(fVar);
        this.f137894b.P(this, fVar);
        fVarT.c(this);
        if (listH.size() > 0) {
            for (int i10 = 0; i10 < listH.size(); i10++) {
                g gVar2 = listH.get(i10);
                gVar2.f137894b.M(gVar2);
                fVar.i0(gVar2);
            }
        }
        return this;
    }

    public String a(String str) {
        org.jsoup.helper.d.h(str);
        String strG = g(str);
        try {
            if (!v(str)) {
                return "";
            }
            try {
                URL url = new URL(this.f137897e);
                if (strG.startsWith("?")) {
                    strG = url.getPath() + strG;
                }
                return new URL(url, strG).toExternalForm();
            } catch (MalformedURLException unused) {
                return new URL(strG).toExternalForm();
            }
        } catch (MalformedURLException unused2) {
            return "";
        }
    }

    protected void b(int i10, g... gVarArr) {
        org.jsoup.helper.d.f(gVarArr);
        for (int length = gVarArr.length - 1; length >= 0; length--) {
            g gVar = gVarArr[length];
            O(gVar);
            this.f137895c.add(i10, gVar);
        }
        H();
    }

    protected void c(g... gVarArr) {
        for (g gVar : gVarArr) {
            O(gVar);
            this.f137895c.add(gVar);
            gVar.T(this.f137895c.size() - 1);
        }
    }

    public g e(String str) {
        d(U() + 1, str);
        return this;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public g f(g gVar) {
        org.jsoup.helper.d.j(gVar);
        org.jsoup.helper.d.j(this.f137894b);
        this.f137894b.b(U() + 1, gVar);
        return this;
    }

    public String g(String str) {
        org.jsoup.helper.d.j(str);
        if (this.f137896d.o(str)) {
            return this.f137896d.m(str);
        }
        return str.toLowerCase().startsWith("abs:") ? a(str.substring(4)) : "";
    }

    public g h(String str, String str2) {
        this.f137896d.t(str, str2);
        return this;
    }

    public int hashCode() {
        g gVar = this.f137894b;
        int iHashCode = (gVar != null ? gVar.hashCode() : 0) * 31;
        org.jsoup.nodes.b bVar = this.f137896d;
        return iHashCode + (bVar != null ? bVar.hashCode() : 0);
    }

    public org.jsoup.nodes.b i() {
        return this.f137896d;
    }

    public String j() {
        return this.f137897e;
    }

    public g k(String str) {
        d(U(), str);
        return this;
    }

    public g l(g gVar) {
        org.jsoup.helper.d.j(gVar);
        org.jsoup.helper.d.j(this.f137894b);
        this.f137894b.b(U(), gVar);
        return this;
    }

    public g m(int i10) {
        return this.f137895c.get(i10);
    }

    public final int n() {
        return this.f137895c.size();
    }

    public List<g> o() {
        return Collections.unmodifiableList(this.f137895c);
    }

    protected g[] p() {
        return (g[]) this.f137895c.toArray(new g[n()]);
    }

    public List<g> q() {
        ArrayList arrayList = new ArrayList(this.f137895c.size());
        Iterator<g> it = this.f137895c.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().v0());
        }
        return arrayList;
    }

    @Override // 
    /* JADX INFO: renamed from: r */
    public g v0() {
        return s(null);
    }

    protected g s(g gVar) {
        try {
            g gVar2 = (g) super.clone();
            gVar2.f137894b = gVar;
            gVar2.f137898f = gVar == null ? 0 : this.f137898f;
            org.jsoup.nodes.b bVar = this.f137896d;
            gVar2.f137896d = bVar != null ? bVar.clone() : null;
            gVar2.f137897e = this.f137897e;
            gVar2.f137895c = new ArrayList(this.f137895c.size());
            Iterator<g> it = this.f137895c.iterator();
            while (it.hasNext()) {
                gVar2.f137895c.add(it.next().s(gVar2));
            }
            return gVar2;
        } catch (CloneNotSupportedException e10) {
            throw new RuntimeException(e10);
        }
    }

    public String toString() {
        return z();
    }

    public boolean v(String str) {
        org.jsoup.helper.d.j(str);
        if (str.toLowerCase().startsWith("abs:")) {
            String strSubstring = str.substring(4);
            if (this.f137896d.o(strSubstring) && !a(strSubstring).equals("")) {
                return true;
            }
        }
        return this.f137896d.o(str);
    }

    protected void w(StringBuilder sb2, int i10, Document.a aVar) {
        sb2.append("\n");
        sb2.append(org.jsoup.helper.c.h(i10 * aVar.h()));
    }

    public g x() {
        g gVar = this.f137894b;
        if (gVar == null) {
            return null;
        }
        List<g> list = gVar.f137895c;
        Integer numValueOf = Integer.valueOf(U());
        org.jsoup.helper.d.j(numValueOf);
        if (list.size() > numValueOf.intValue() + 1) {
            return list.get(numValueOf.intValue() + 1);
        }
        return null;
    }

    public abstract String y();

    public String z() {
        StringBuilder sb2 = new StringBuilder(128);
        B(sb2);
        return sb2.toString();
    }
}
