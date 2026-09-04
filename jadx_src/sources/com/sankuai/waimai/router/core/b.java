package com.sankuai.waimai.router.core;

import androidx.annotation.n0;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: compiled from: ChainedInterceptor.java */
/* JADX INFO: loaded from: classes8.dex */
public class b implements h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<h> f96483a = new LinkedList();

    /* JADX INFO: compiled from: ChainedInterceptor.java */
    public class a implements f {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Iterator f96484g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ i f96485h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ f f96486i;

        a(Iterator it, i iVar, f fVar) {
            this.f96484g = it;
            this.f96485h = iVar;
            this.f96486i = fVar;
        }

        @Override // com.sankuai.waimai.router.core.f
        public void a() {
            b.this.d(this.f96484g, this.f96485h, this.f96486i);
        }

        @Override // com.sankuai.waimai.router.core.f
        public void onComplete(int i10) {
            this.f96486i.onComplete(i10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(@n0 Iterator<h> it, @n0 i iVar, @n0 f fVar) {
        if (!it.hasNext()) {
            fVar.a();
            return;
        }
        h next = it.next();
        if (c.h()) {
            c.f("    %s: intercept, request = %s", next.getClass().getSimpleName(), iVar);
        }
        next.a(iVar, new a(it, iVar, fVar));
    }

    @Override // com.sankuai.waimai.router.core.h
    public void a(@n0 i iVar, @n0 f fVar) {
        d(this.f96483a.iterator(), iVar, fVar);
    }

    public void c(@n0 h hVar) {
        if (hVar != null) {
            this.f96483a.add(hVar);
        }
    }
}
