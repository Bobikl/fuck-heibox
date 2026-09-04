package com.sankuai.waimai.router.common;

import androidx.annotation.n0;

/* JADX INFO: compiled from: NotFoundHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class j extends com.sankuai.waimai.router.core.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j f96429b = new j();

    @Override // com.sankuai.waimai.router.core.g
    protected void d(@n0 com.sankuai.waimai.router.core.i iVar, @n0 com.sankuai.waimai.router.core.f fVar) {
        fVar.onComplete(404);
    }

    @Override // com.sankuai.waimai.router.core.g
    public boolean e(@n0 com.sankuai.waimai.router.core.i iVar) {
        return true;
    }

    @Override // com.sankuai.waimai.router.core.g
    public String toString() {
        return "NotFoundHandler";
    }
}
