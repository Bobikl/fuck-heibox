package com.sankuai.waimai.router.common;

import android.content.Intent;
import androidx.annotation.n0;

/* JADX INFO: compiled from: StartUriHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class n extends com.sankuai.waimai.router.core.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f96442b = "com.sankuai.waimai.router.common.try_start_uri";

    @Override // com.sankuai.waimai.router.core.g
    protected void d(@n0 com.sankuai.waimai.router.core.i iVar, @n0 com.sankuai.waimai.router.core.f fVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        intent.setData(iVar.m());
        com.sankuai.waimai.router.components.i.g(intent, iVar);
        iVar.t(com.sankuai.waimai.router.components.a.f96457g, Boolean.valueOf(g()));
        f(fVar, com.sankuai.waimai.router.components.h.f(iVar, intent));
    }

    @Override // com.sankuai.waimai.router.core.g
    protected boolean e(@n0 com.sankuai.waimai.router.core.i iVar) {
        return iVar.a(f96442b, true);
    }

    protected void f(@n0 com.sankuai.waimai.router.core.f fVar, int i10) {
        if (i10 == 200) {
            fVar.onComplete(i10);
        } else {
            fVar.a();
        }
    }

    protected boolean g() {
        return false;
    }

    @Override // com.sankuai.waimai.router.core.g
    public String toString() {
        return "StartUriHandler";
    }
}
