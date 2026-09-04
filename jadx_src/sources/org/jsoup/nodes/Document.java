package org.jsoup.nodes;

import com.max.xiaoheihe.bean.bbs.LinkDraftObj;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public class Document extends f {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private a f137863i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private QuirksMode f137864j;

    public enum QuirksMode {
        noQuirks,
        quirks,
        limitedQuirks
    }

    public static class a implements Cloneable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Entities.EscapeMode f137865b = Entities.EscapeMode.base;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Charset f137866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private CharsetEncoder f137867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f137868e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f137869f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f137870g;

        public a() {
            Charset charsetForName = Charset.forName("UTF-8");
            this.f137866c = charsetForName;
            this.f137867d = charsetForName.newEncoder();
            this.f137868e = true;
            this.f137869f = false;
            this.f137870g = 1;
        }

        public Charset a() {
            return this.f137866c;
        }

        public a b(String str) {
            c(Charset.forName(str));
            return this;
        }

        public a c(Charset charset) {
            this.f137866c = charset;
            this.f137867d = charset.newEncoder();
            return this;
        }

        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public a clone() {
            try {
                a aVar = (a) super.clone();
                aVar.b(this.f137866c.name());
                aVar.f137865b = Entities.EscapeMode.valueOf(this.f137865b.name());
                return aVar;
            } catch (CloneNotSupportedException e10) {
                throw new RuntimeException(e10);
            }
        }

        CharsetEncoder e() {
            return this.f137867d;
        }

        public a f(Entities.EscapeMode escapeMode) {
            this.f137865b = escapeMode;
            return this;
        }

        public Entities.EscapeMode g() {
            return this.f137865b;
        }

        public int h() {
            return this.f137870g;
        }

        public a i(int i10) {
            org.jsoup.helper.d.d(i10 >= 0);
            this.f137870g = i10;
            return this;
        }

        public a j(boolean z10) {
            this.f137869f = z10;
            return this;
        }

        public boolean k() {
            return this.f137869f;
        }

        public a l(boolean z10) {
            this.f137868e = z10;
            return this;
        }

        public boolean m() {
            return this.f137868e;
        }
    }

    public Document(String str) {
        super(org.jsoup.parser.e.n("#root"), str);
        this.f137863i = new a();
        this.f137864j = QuirksMode.noQuirks;
    }

    public static Document T1(String str) {
        org.jsoup.helper.d.j(str);
        Document document = new Document(str);
        f fVarJ0 = document.j0(LinkDraftObj.DRAFT_TYPE_HTML);
        fVarJ0.j0("head");
        fVarJ0.j0("body");
        return document;
    }

    private f U1(String str, g gVar) {
        if (gVar.y().equals(str)) {
            return (f) gVar;
        }
        Iterator<g> it = gVar.f137895c.iterator();
        while (it.hasNext()) {
            f fVarU1 = U1(str, it.next());
            if (fVarU1 != null) {
                return fVarU1;
            }
        }
        return null;
    }

    private void X1(String str, f fVar) {
        org.jsoup.select.c cVarU0 = U0(str);
        f fVarS = cVarU0.s();
        if (cVarU0.size() > 1) {
            ArrayList arrayList = new ArrayList();
            for (int i10 = 1; i10 < cVarU0.size(); i10++) {
                f fVarT = cVarU0.get(i10);
                Iterator<g> it = fVarT.f137895c.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                fVarT.J();
            }
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                fVarS.i0((g) it2.next());
            }
        }
        if (fVarS.F().equals(fVar)) {
            return;
        }
        fVar.i0(fVarS);
    }

    private void Y1(f fVar) {
        ArrayList arrayList = new ArrayList();
        for (g gVar : fVar.f137895c) {
            if (gVar instanceof h) {
                h hVar = (h) gVar;
                if (!hVar.e0()) {
                    arrayList.add(hVar);
                }
            }
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g gVar2 = (g) arrayList.get(size);
            fVar.M(gVar2);
            Q1().w1(new h(" ", ""));
            Q1().w1(gVar2);
        }
    }

    @Override // org.jsoup.nodes.f
    public f I1(String str) {
        Q1().I1(str);
        return this;
    }

    public f Q1() {
        return U1("body", this);
    }

    @Override // org.jsoup.nodes.f
    /* JADX INFO: renamed from: R1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public Document r() {
        Document document = (Document) super.r();
        document.f137863i = this.f137863i.clone();
        return document;
    }

    public f S1(String str) {
        return new f(org.jsoup.parser.e.n(str), j());
    }

    public f V1() {
        return U1("head", this);
    }

    public Document W1() {
        f fVarU1 = U1(LinkDraftObj.DRAFT_TYPE_HTML, this);
        if (fVarU1 == null) {
            fVarU1 = j0(LinkDraftObj.DRAFT_TYPE_HTML);
        }
        if (V1() == null) {
            fVarU1.x1("head");
        }
        if (Q1() == null) {
            fVarU1.j0("body");
        }
        Y1(V1());
        Y1(fVarU1);
        Y1(this);
        X1("head", fVarU1);
        X1("body", fVarU1);
        return this;
    }

    public a Z1() {
        return this.f137863i;
    }

    public Document a2(a aVar) {
        org.jsoup.helper.d.j(aVar);
        this.f137863i = aVar;
        return this;
    }

    public QuirksMode b2() {
        return this.f137864j;
    }

    public Document c2(QuirksMode quirksMode) {
        this.f137864j = quirksMode;
        return this;
    }

    public String d2() {
        f fVarS = U0("title").s();
        return fVarS != null ? org.jsoup.helper.c.g(fVarS.H1()).trim() : "";
    }

    public void e2(String str) {
        org.jsoup.helper.d.j(str);
        f fVarS = U0("title").s();
        if (fVarS == null) {
            V1().j0("title").I1(str);
        } else {
            fVarS.I1(str);
        }
    }

    @Override // org.jsoup.nodes.f, org.jsoup.nodes.g
    public String y() {
        return "#document";
    }

    @Override // org.jsoup.nodes.g
    public String z() {
        return super.g1();
    }
}
