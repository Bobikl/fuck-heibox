package org.jsoup.safety;

import org.jsoup.helper.d;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.g;
import org.jsoup.nodes.h;
import org.jsoup.select.e;
import org.jsoup.select.f;

/* JADX INFO: compiled from: Cleaner.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.jsoup.safety.b f137984a;

    /* JADX INFO: compiled from: Cleaner.java */
    public final class b implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f137985a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final org.jsoup.nodes.f f137986b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private org.jsoup.nodes.f f137987c;

        private b(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
            this.f137985a = 0;
            this.f137986b = fVar;
            this.f137987c = fVar2;
        }

        @Override // org.jsoup.select.f
        public void a(g gVar, int i10) {
            if ((gVar instanceof org.jsoup.nodes.f) && a.this.f137984a.i(gVar.y())) {
                this.f137987c = this.f137987c.F();
            }
        }

        @Override // org.jsoup.select.f
        public void b(g gVar, int i10) {
            if (!(gVar instanceof org.jsoup.nodes.f)) {
                if (!(gVar instanceof h)) {
                    this.f137985a++;
                    return;
                } else {
                    this.f137987c.i0(new h(((h) gVar).d0(), gVar.j()));
                    return;
                }
            }
            org.jsoup.nodes.f fVar = (org.jsoup.nodes.f) gVar;
            if (!a.this.f137984a.i(fVar.F1())) {
                if (gVar != this.f137986b) {
                    this.f137985a++;
                }
            } else {
                c cVarE = a.this.e(fVar);
                org.jsoup.nodes.f fVar2 = cVarE.f137989a;
                this.f137987c.i0(fVar2);
                this.f137985a += cVarE.f137990b;
                this.f137987c = fVar2;
            }
        }
    }

    /* JADX INFO: compiled from: Cleaner.java */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        org.jsoup.nodes.f f137989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f137990b;

        c(org.jsoup.nodes.f fVar, int i10) {
            this.f137989a = fVar;
            this.f137990b = i10;
        }
    }

    public a(org.jsoup.safety.b bVar) {
        d.j(bVar);
        this.f137984a = bVar;
    }

    private int d(org.jsoup.nodes.f fVar, org.jsoup.nodes.f fVar2) {
        b bVar = new b(fVar, fVar2);
        new e(bVar).a(fVar);
        return bVar.f137985a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public c e(org.jsoup.nodes.f fVar) {
        String strF1 = fVar.F1();
        org.jsoup.nodes.b bVar = new org.jsoup.nodes.b();
        org.jsoup.nodes.f fVar2 = new org.jsoup.nodes.f(org.jsoup.parser.e.n(strF1), fVar.j(), bVar);
        int i10 = 0;
        for (org.jsoup.nodes.a aVar : fVar.i()) {
            if (this.f137984a.h(strF1, fVar, aVar)) {
                bVar.u(aVar);
            } else {
                i10++;
            }
        }
        bVar.g(this.f137984a.g(strF1));
        return new c(fVar2, i10);
    }

    public Document c(Document document) {
        d.j(document);
        Document documentT1 = Document.T1(document.j());
        if (document.Q1() != null) {
            d(document.Q1(), documentT1.Q1());
        }
        return documentT1;
    }

    public boolean f(Document document) {
        d.j(document);
        return d(document.Q1(), Document.T1(document.j()).Q1()) == 0;
    }
}
