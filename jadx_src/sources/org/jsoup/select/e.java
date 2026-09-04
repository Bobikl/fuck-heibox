package org.jsoup.select;

/* JADX INFO: compiled from: NodeTraversor.java */
/* JADX INFO: loaded from: classes5.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f138020a;

    public e(f fVar) {
        this.f138020a = fVar;
    }

    public void a(org.jsoup.nodes.g gVar) {
        org.jsoup.nodes.g gVarM = gVar;
        int i10 = 0;
        while (gVarM != null) {
            this.f138020a.b(gVarM, i10);
            if (gVarM.n() > 0) {
                gVarM = gVarM.m(0);
                i10++;
            } else {
                while (gVarM.x() == null && i10 > 0) {
                    this.f138020a.a(gVarM, i10);
                    gVarM = gVarM.F();
                    i10--;
                }
                this.f138020a.a(gVarM, i10);
                if (gVarM == gVar) {
                    return;
                } else {
                    gVarM = gVarM.x();
                }
            }
        }
    }
}
