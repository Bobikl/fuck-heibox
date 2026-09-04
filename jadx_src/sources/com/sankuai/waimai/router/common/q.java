package com.sankuai.waimai.router.common;

import androidx.annotation.n0;

/* JADX INFO: compiled from: WrapperHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class q extends com.sankuai.waimai.router.core.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.sankuai.waimai.router.core.g f96450b;

    public q(com.sankuai.waimai.router.core.g gVar) {
        this.f96450b = gVar;
    }

    @Override // com.sankuai.waimai.router.core.g
    protected void d(@n0 com.sankuai.waimai.router.core.i iVar, @n0 com.sankuai.waimai.router.core.f fVar) {
        this.f96450b.c(iVar, fVar);
    }

    @Override // com.sankuai.waimai.router.core.g
    protected boolean e(@n0 com.sankuai.waimai.router.core.i iVar) {
        return true;
    }

    public com.sankuai.waimai.router.core.g f() {
        return this.f96450b;
    }

    @Override // com.sankuai.waimai.router.core.g
    public String toString() {
        return "Delegate(" + this.f96450b.toString() + ")";
    }
}
