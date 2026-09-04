package com.sankuai.waimai.router.common;

import androidx.annotation.n0;

/* JADX INFO: compiled from: SchemeHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class m extends l {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    private String f96441e;

    public m(String str, String str2) {
        this.f96441e = com.sankuai.waimai.router.utils.f.e(str, str2);
    }

    @Override // com.sankuai.waimai.router.common.l, com.sankuai.waimai.router.core.g
    public boolean e(@n0 com.sankuai.waimai.router.core.i iVar) {
        return n(iVar);
    }

    protected boolean n(@n0 com.sankuai.waimai.router.core.i iVar) {
        return this.f96441e.equals(iVar.v());
    }

    @Override // com.sankuai.waimai.router.core.g
    public String toString() {
        return "SchemeHandler(" + this.f96441e + ")";
    }
}
