package org.jsoup.nodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.jsoup.select.Selector;

/* JADX INFO: compiled from: Element.java */
/* JADX INFO: loaded from: classes5.dex */
public class f extends g {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.jsoup.parser.e f137890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Set<String> f137891h;

    /* JADX INFO: compiled from: Element.java */
    public class a implements org.jsoup.select.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ StringBuilder f137892a;

        a(StringBuilder sb2) {
            this.f137892a = sb2;
        }

        @Override // org.jsoup.select.f
        public void a(g gVar, int i10) {
        }

        @Override // org.jsoup.select.f
        public void b(g gVar, int i10) {
            if (gVar instanceof h) {
                f.k0(this.f137892a, (h) gVar);
            } else if (gVar instanceof f) {
                f fVar = (f) gVar;
                if (this.f137892a.length() > 0) {
                    if ((fVar.n1() || fVar.f137890g.c().equals(com.google.android.exoplayer2.text.ttml.d.f49807t)) && !h.f0(this.f137892a)) {
                        this.f137892a.append(" ");
                    }
                }
            }
        }
    }

    public f(org.jsoup.parser.e eVar, String str) {
        this(eVar, str, new b());
    }

    public f(org.jsoup.parser.e eVar, String str, b bVar) {
        super(str, bVar);
        org.jsoup.helper.d.j(eVar);
        this.f137890g = eVar;
    }

    private static void d0(f fVar, org.jsoup.select.c cVar) {
        f fVarF = fVar.F();
        if (fVarF == null || fVarF.F1().equals("#root")) {
            return;
        }
        cVar.add(fVarF);
        d0(fVarF, cVar);
    }

    private void j1(StringBuilder sb2) {
        Iterator<g> it = this.f137895c.iterator();
        while (it.hasNext()) {
            it.next().B(sb2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void k0(StringBuilder sb2, h hVar) {
        String strD0 = hVar.d0();
        if (!z1(hVar.F())) {
            strD0 = h.g0(strD0);
            if (h.f0(sb2)) {
                strD0 = h.i0(strD0);
            }
        }
        sb2.append(strD0);
    }

    private static <E extends f> Integer l1(f fVar, List<E> list) {
        org.jsoup.helper.d.j(fVar);
        org.jsoup.helper.d.j(list);
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (list.get(i10).equals(fVar)) {
                return Integer.valueOf(i10);
            }
        }
        return null;
    }

    private static void m0(f fVar, StringBuilder sb2) {
        if (!fVar.f137890g.c().equals(com.google.android.exoplayer2.text.ttml.d.f49807t) || h.f0(sb2)) {
            return;
        }
        sb2.append(" ");
    }

    private void r1(StringBuilder sb2) {
        for (g gVar : this.f137895c) {
            if (gVar instanceof h) {
                k0(sb2, (h) gVar);
            } else if (gVar instanceof f) {
                m0((f) gVar, sb2);
            }
        }
    }

    static boolean z1(g gVar) {
        if (gVar == null || !(gVar instanceof f)) {
            return false;
        }
        f fVar = (f) gVar;
        return fVar.f137890g.k() || (fVar.F() != null && fVar.F().f137890g.k());
    }

    public f A0() {
        this.f137895c.clear();
        return this;
    }

    public f A1() {
        if (this.f137894b == null) {
            return null;
        }
        org.jsoup.select.c cVarR0 = F().r0();
        Integer numL1 = l1(this, cVarR0);
        org.jsoup.helper.d.j(numL1);
        if (numL1.intValue() > 0) {
            return cVarR0.get(numL1.intValue() - 1);
        }
        return null;
    }

    public f B0() {
        org.jsoup.select.c cVarR0 = F().r0();
        if (cVarR0.size() > 1) {
            return cVarR0.get(0);
        }
        return null;
    }

    public f B1(String str) {
        org.jsoup.helper.d.j(str);
        Set<String> setT0 = t0();
        setT0.remove(str);
        u0(setT0);
        return this;
    }

    @Override // org.jsoup.nodes.g
    void C(StringBuilder sb2, int i10, Document.a aVar) {
        if (sb2.length() > 0 && aVar.m() && (this.f137890g.b() || ((F() != null && F().E1().b()) || aVar.k()))) {
            w(sb2, i10, aVar);
        }
        sb2.append("<");
        sb2.append(F1());
        this.f137896d.s(sb2, aVar);
        if (this.f137895c.isEmpty() && this.f137890g.j()) {
            sb2.append(" />");
        } else {
            sb2.append(">");
        }
    }

    public org.jsoup.select.c C1(String str) {
        return Selector.d(str, this);
    }

    @Override // org.jsoup.nodes.g
    void D(StringBuilder sb2, int i10, Document.a aVar) {
        if (this.f137895c.isEmpty() && this.f137890g.j()) {
            return;
        }
        if (aVar.m() && !this.f137895c.isEmpty() && (this.f137890g.b() || (aVar.k() && (this.f137895c.size() > 1 || (this.f137895c.size() == 1 && !(this.f137895c.get(0) instanceof h)))))) {
            w(sb2, i10, aVar);
        }
        sb2.append("</");
        sb2.append(F1());
        sb2.append(">");
    }

    public org.jsoup.select.c D1() {
        if (this.f137894b == null) {
            return new org.jsoup.select.c(0);
        }
        org.jsoup.select.c cVarR0 = F().r0();
        org.jsoup.select.c cVar = new org.jsoup.select.c(cVarR0.size() - 1);
        for (f fVar : cVarR0) {
            if (fVar != this) {
                cVar.add(fVar);
            }
        }
        return cVar;
    }

    public org.jsoup.select.c E0() {
        return org.jsoup.select.a.a(new org.jsoup.select.d.a(), this);
    }

    public org.jsoup.parser.e E1() {
        return this.f137890g;
    }

    public f F0(String str) {
        org.jsoup.helper.d.h(str);
        org.jsoup.select.c cVarA = org.jsoup.select.a.a(new org.jsoup.select.d.o(str), this);
        if (cVarA.size() > 0) {
            return cVarA.get(0);
        }
        return null;
    }

    public String F1() {
        return this.f137890g.c();
    }

    public f G1(String str) {
        org.jsoup.helper.d.i(str, "Tag name must not be empty.");
        this.f137890g = org.jsoup.parser.e.n(str);
        return this;
    }

    public org.jsoup.select.c H0(String str) {
        org.jsoup.helper.d.h(str);
        return org.jsoup.select.a.a(new org.jsoup.select.d.b(str.trim().toLowerCase()), this);
    }

    public String H1() {
        StringBuilder sb2 = new StringBuilder();
        new org.jsoup.select.e(new a(sb2)).a(this);
        return sb2.toString().trim();
    }

    public org.jsoup.select.c I0(String str) {
        org.jsoup.helper.d.h(str);
        return org.jsoup.select.a.a(new org.jsoup.select.d.C1250d(str.trim().toLowerCase()), this);
    }

    public f I1(String str) {
        org.jsoup.helper.d.j(str);
        A0();
        i0(new h(str, this.f137897e));
        return this;
    }

    public org.jsoup.select.c J0(String str, String str2) {
        return org.jsoup.select.a.a(new org.jsoup.select.d.e(str, str2), this);
    }

    public List<h> J1() {
        ArrayList arrayList = new ArrayList();
        for (g gVar : this.f137895c) {
            if (gVar instanceof h) {
                arrayList.add((h) gVar);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public org.jsoup.select.c K0(String str, String str2) {
        return org.jsoup.select.a.a(new org.jsoup.select.d.f(str, str2), this);
    }

    public f K1(String str) {
        org.jsoup.helper.d.j(str);
        Set<String> setT0 = t0();
        if (setT0.contains(str)) {
            setT0.remove(str);
        } else {
            setT0.add(str);
        }
        u0(setT0);
        return this;
    }

    public org.jsoup.select.c L0(String str, String str2) {
        return org.jsoup.select.a.a(new org.jsoup.select.d.g(str, str2), this);
    }

    public String L1() {
        return F1().equals("textarea") ? H1() : g("value");
    }

    public org.jsoup.select.c M0(String str, String str2) {
        try {
            return N0(str, Pattern.compile(str2));
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException("Pattern syntax error: " + str2, e10);
        }
    }

    public org.jsoup.select.c N0(String str, Pattern pattern) {
        return org.jsoup.select.a.a(new org.jsoup.select.d.h(str, pattern), this);
    }

    public f N1(String str) {
        if (F1().equals("textarea")) {
            I1(str);
        } else {
            h("value", str);
        }
        return this;
    }

    public org.jsoup.select.c O0(String str, String str2) {
        return org.jsoup.select.a.a(new org.jsoup.select.d.i(str, str2), this);
    }

    @Override // org.jsoup.nodes.g
    /* JADX INFO: renamed from: O1, reason: merged with bridge method [inline-methods] */
    public f Z(String str) {
        return (f) super.Z(str);
    }

    public org.jsoup.select.c P0(String str, String str2) {
        return org.jsoup.select.a.a(new org.jsoup.select.d.j(str, str2), this);
    }

    public org.jsoup.select.c Q0(String str) {
        org.jsoup.helper.d.h(str);
        return org.jsoup.select.a.a(new org.jsoup.select.d.k(str), this);
    }

    public org.jsoup.select.c R0(int i10) {
        return org.jsoup.select.a.a(new org.jsoup.select.d.p(i10), this);
    }

    public org.jsoup.select.c S0(int i10) {
        return org.jsoup.select.a.a(new org.jsoup.select.d.r(i10), this);
    }

    public org.jsoup.select.c T0(int i10) {
        return org.jsoup.select.a.a(new org.jsoup.select.d.s(i10), this);
    }

    public org.jsoup.select.c U0(String str) {
        org.jsoup.helper.d.h(str);
        return org.jsoup.select.a.a(new org.jsoup.select.d.h0(str.toLowerCase().trim()), this);
    }

    public org.jsoup.select.c V0(String str) {
        return org.jsoup.select.a.a(new org.jsoup.select.d.l(str), this);
    }

    public org.jsoup.select.c W0(String str) {
        return org.jsoup.select.a.a(new org.jsoup.select.d.m(str), this);
    }

    public org.jsoup.select.c X0(String str) {
        try {
            return Y0(Pattern.compile(str));
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e10);
        }
    }

    public org.jsoup.select.c Y0(Pattern pattern) {
        return org.jsoup.select.a.a(new org.jsoup.select.d.g0(pattern), this);
    }

    public org.jsoup.select.c Z0(String str) {
        try {
            return c1(Pattern.compile(str));
        } catch (PatternSyntaxException e10) {
            throw new IllegalArgumentException("Pattern syntax error: " + str, e10);
        }
    }

    public org.jsoup.select.c c1(Pattern pattern) {
        return org.jsoup.select.a.a(new org.jsoup.select.d.f0(pattern), this);
    }

    public boolean d1(String str) {
        Iterator<String> it = t0().iterator();
        while (it.hasNext()) {
            if (str.equalsIgnoreCase(it.next())) {
                return true;
            }
        }
        return false;
    }

    public f e0(String str) {
        org.jsoup.helper.d.j(str);
        Set<String> setT0 = t0();
        setT0.add(str);
        u0(setT0);
        return this;
    }

    public boolean e1() {
        for (g gVar : this.f137895c) {
            if (gVar instanceof h) {
                if (!((h) gVar).e0()) {
                    return true;
                }
            } else if ((gVar instanceof f) && ((f) gVar).e1()) {
                return true;
            }
        }
        return false;
    }

    @Override // org.jsoup.nodes.g
    public boolean equals(Object obj) {
        return this == obj;
    }

    @Override // org.jsoup.nodes.g
    /* JADX INFO: renamed from: f0, reason: merged with bridge method [inline-methods] */
    public f e(String str) {
        return (f) super.e(str);
    }

    @Override // org.jsoup.nodes.g
    /* JADX INFO: renamed from: g0, reason: merged with bridge method [inline-methods] */
    public f f(g gVar) {
        return (f) super.f(gVar);
    }

    public String g1() {
        StringBuilder sb2 = new StringBuilder();
        j1(sb2);
        return sb2.toString().trim();
    }

    public f h0(String str) {
        org.jsoup.helper.d.j(str);
        List<g> listH = org.jsoup.parser.d.h(str, this, j());
        c((g[]) listH.toArray(new g[listH.size()]));
        return this;
    }

    @Override // org.jsoup.nodes.g
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        org.jsoup.parser.e eVar = this.f137890g;
        return iHashCode + (eVar != null ? eVar.hashCode() : 0);
    }

    public f i0(g gVar) {
        org.jsoup.helper.d.j(gVar);
        c(gVar);
        return this;
    }

    public f i1(String str) {
        A0();
        h0(str);
        return this;
    }

    public f j0(String str) {
        f fVar = new f(org.jsoup.parser.e.n(str), j());
        i0(fVar);
        return fVar;
    }

    public String k1() {
        String strG = g("id");
        return strG == null ? "" : strG;
    }

    public f l0(String str) {
        i0(new h(str, j()));
        return this;
    }

    public f m1(int i10, Collection<? extends g> collection) {
        org.jsoup.helper.d.k(collection, "Children collection to be inserted must not be null.");
        int iN = n();
        if (i10 < 0) {
            i10 += iN + 1;
        }
        org.jsoup.helper.d.e(i10 >= 0 && i10 <= iN, "Insert position out of bounds.");
        ArrayList arrayList = new ArrayList(collection);
        b(i10, (g[]) arrayList.toArray(new g[arrayList.size()]));
        return this;
    }

    @Override // org.jsoup.nodes.g
    /* JADX INFO: renamed from: n0, reason: merged with bridge method [inline-methods] */
    public f h(String str, String str2) {
        super.h(str, str2);
        return this;
    }

    public boolean n1() {
        return this.f137890g.d();
    }

    @Override // org.jsoup.nodes.g
    /* JADX INFO: renamed from: o0, reason: merged with bridge method [inline-methods] */
    public f k(String str) {
        return (f) super.k(str);
    }

    public f o1() {
        org.jsoup.select.c cVarR0 = F().r0();
        if (cVarR0.size() > 1) {
            return cVarR0.get(cVarR0.size() - 1);
        }
        return null;
    }

    @Override // org.jsoup.nodes.g
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public f l(g gVar) {
        return (f) super.l(gVar);
    }

    public f p1() {
        if (this.f137894b == null) {
            return null;
        }
        org.jsoup.select.c cVarR0 = F().r0();
        Integer numL1 = l1(this, cVarR0);
        org.jsoup.helper.d.j(numL1);
        if (cVarR0.size() > numL1.intValue() + 1) {
            return cVarR0.get(numL1.intValue() + 1);
        }
        return null;
    }

    public f q0(int i10) {
        return r0().get(i10);
    }

    public String q1() {
        StringBuilder sb2 = new StringBuilder();
        r1(sb2);
        return sb2.toString().trim();
    }

    public org.jsoup.select.c r0() {
        ArrayList arrayList = new ArrayList();
        for (g gVar : this.f137895c) {
            if (gVar instanceof f) {
                arrayList.add((f) gVar);
            }
        }
        return new org.jsoup.select.c((List<f>) arrayList);
    }

    public String s0() {
        return g("class");
    }

    @Override // org.jsoup.nodes.g
    /* JADX INFO: renamed from: s1, reason: merged with bridge method [inline-methods] */
    public final f F() {
        return (f) this.f137894b;
    }

    public Set<String> t0() {
        if (this.f137891h == null) {
            this.f137891h = new LinkedHashSet(Arrays.asList(s0().split("\\s+")));
        }
        return this.f137891h;
    }

    public org.jsoup.select.c t1() {
        org.jsoup.select.c cVar = new org.jsoup.select.c();
        d0(this, cVar);
        return cVar;
    }

    @Override // org.jsoup.nodes.g
    public String toString() {
        return z();
    }

    public f u0(Set<String> set) {
        org.jsoup.helper.d.j(set);
        this.f137896d.t("class", org.jsoup.helper.c.e(set, " "));
        return this;
    }

    public f u1(String str) {
        org.jsoup.helper.d.j(str);
        List<g> listH = org.jsoup.parser.d.h(str, this, j());
        b(0, (g[]) listH.toArray(new g[listH.size()]));
        return this;
    }

    @Override // org.jsoup.nodes.g
    public f v0() {
        f fVar = (f) super.v0();
        fVar.f137891h = null;
        return fVar;
    }

    public String w0() {
        StringBuilder sb2 = new StringBuilder();
        for (g gVar : this.f137895c) {
            if (gVar instanceof d) {
                sb2.append(((d) gVar).c0());
            } else if (gVar instanceof f) {
                sb2.append(((f) gVar).w0());
            }
        }
        return sb2.toString();
    }

    public f w1(g gVar) {
        org.jsoup.helper.d.j(gVar);
        b(0, gVar);
        return this;
    }

    public List<d> x0() {
        ArrayList arrayList = new ArrayList();
        for (g gVar : this.f137895c) {
            if (gVar instanceof d) {
                arrayList.add((d) gVar);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    public f x1(String str) {
        f fVar = new f(org.jsoup.parser.e.n(str), j());
        w1(fVar);
        return fVar;
    }

    @Override // org.jsoup.nodes.g
    public String y() {
        return this.f137890g.c();
    }

    public Map<String, String> y0() {
        return this.f137896d.l();
    }

    public f y1(String str) {
        w1(new h(str, j()));
        return this;
    }

    public Integer z0() {
        if (F() == null) {
            return 0;
        }
        return l1(this, F().r0());
    }
}
