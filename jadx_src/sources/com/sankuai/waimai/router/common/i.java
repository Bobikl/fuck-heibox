package com.sankuai.waimai.router.common;

import androidx.annotation.n0;

/* JADX INFO: compiled from: NotExportedInterceptor.java */
/* JADX INFO: loaded from: classes8.dex */
public class i implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f96428a = new i();

    private i() {
    }

    @Override // com.sankuai.waimai.router.core.h
    public void a(@n0 com.sankuai.waimai.router.core.i iVar, @n0 com.sankuai.waimai.router.core.f fVar) {
        if (com.sankuai.waimai.router.components.i.j(iVar, false)) {
            fVar.a();
        } else {
            fVar.onComplete(403);
        }
    }
}
