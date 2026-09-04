package com.sankuai.waimai.router.core;

import androidx.annotation.n0;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ChainedHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class a extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.sankuai.waimai.router.utils.c<g> f96478b = new com.sankuai.waimai.router.utils.c<>();

    /* JADX INFO: renamed from: com.sankuai.waimai.router.core.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ChainedHandler.java */
    public class C0917a implements f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Iterator f96479g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ i f96480h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ f f96481i;

        C0917a(Iterator it, i iVar, f fVar) {
            this.f96479g = it;
            this.f96480h = iVar;
            this.f96481i = fVar;
        }

        @Override // com.sankuai.waimai.router.core.f
        public void a() {
            a.this.j(this.f96479g, this.f96480h, this.f96481i);
        }

        @Override // com.sankuai.waimai.router.core.f
        public void onComplete(int i10) {
            this.f96481i.onComplete(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j(@n0 Iterator<g> it, @n0 i iVar, @n0 f fVar) {
        if (it.hasNext()) {
            it.next().c(iVar, new C0917a(it, iVar, fVar));
        } else {
            fVar.a();
        }
    }

    @Override // com.sankuai.waimai.router.core.g
    protected void d(@n0 i iVar, @n0 f fVar) {
        j(this.f96478b.iterator(), iVar, fVar);
    }

    @Override // com.sankuai.waimai.router.core.g
    protected boolean e(@n0 i iVar) {
        return !this.f96478b.isEmpty();
    }

    public a g(@n0 g gVar) {
        return h(gVar, 0);
    }

    public a h(@n0 g gVar, int i10) {
        this.f96478b.e(gVar, i10);
        return this;
    }

    @n0
    protected List<g> i() {
        return this.f96478b;
    }
}
