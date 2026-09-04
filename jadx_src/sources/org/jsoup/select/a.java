package org.jsoup.select;

/* JADX INFO: compiled from: Collector.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: org.jsoup.select.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: Collector.java */
    public static class C1248a implements f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final org.jsoup.nodes.f f137999a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final c f138000b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final d f138001c;

        C1248a(org.jsoup.nodes.f fVar, c cVar, d dVar) {
            this.f137999a = fVar;
            this.f138000b = cVar;
            this.f138001c = dVar;
        }

        @Override // org.jsoup.select.f
        public void a(org.jsoup.nodes.g gVar, int i10) {
        }

        @Override // org.jsoup.select.f
        public void b(org.jsoup.nodes.g gVar, int i10) {
            if (gVar instanceof org.jsoup.nodes.f) {
                org.jsoup.nodes.f fVar = (org.jsoup.nodes.f) gVar;
                if (this.f138001c.a(this.f137999a, fVar)) {
                    this.f138000b.add(fVar);
                }
            }
        }
    }

    private a() {
    }

    public static c a(d dVar, org.jsoup.nodes.f fVar) {
        c cVar = new c();
        new e(new C1248a(fVar, cVar, dVar)).a(fVar);
        return cVar;
    }
}
