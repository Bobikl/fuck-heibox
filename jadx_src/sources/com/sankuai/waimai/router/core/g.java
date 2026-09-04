package com.sankuai.waimai.router.core;

import androidx.annotation.n0;

/* JADX INFO: compiled from: UriHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected b f96496a;

    /* JADX INFO: compiled from: UriHandler.java */
    public class a implements f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i f96497g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f f96498h;

        a(i iVar, f fVar) {
            this.f96497g = iVar;
            this.f96498h = fVar;
        }

        @Override // com.sankuai.waimai.router.core.f
        public void a() {
            g.this.d(this.f96497g, this.f96498h);
        }

        @Override // com.sankuai.waimai.router.core.f
        public void onComplete(int i10) {
            this.f96498h.onComplete(i10);
        }
    }

    public g a(@n0 h hVar) {
        if (hVar != null) {
            if (this.f96496a == null) {
                this.f96496a = new b();
            }
            this.f96496a.c(hVar);
        }
        return this;
    }

    public g b(h... hVarArr) {
        if (hVarArr != null && hVarArr.length > 0) {
            if (this.f96496a == null) {
                this.f96496a = new b();
            }
            for (h hVar : hVarArr) {
                this.f96496a.c(hVar);
            }
        }
        return this;
    }

    public void c(@n0 i iVar, @n0 f fVar) {
        if (!e(iVar)) {
            c.f("%s: ignore request %s", this, iVar);
            fVar.a();
            return;
        }
        c.f("%s: handle request %s", this, iVar);
        if (this.f96496a == null || iVar.o()) {
            d(iVar, fVar);
        } else {
            this.f96496a.a(iVar, new a(iVar, fVar));
        }
    }

    protected abstract void d(@n0 i iVar, @n0 f fVar);

    protected abstract boolean e(@n0 i iVar);

    public String toString() {
        return getClass().getSimpleName();
    }
}
