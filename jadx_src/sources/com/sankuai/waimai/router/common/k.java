package com.sankuai.waimai.router.common;

import android.content.Intent;
import androidx.annotation.n0;

/* JADX INFO: compiled from: PageAnnotationHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class k extends l {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f96431g = "page";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.sankuai.waimai.router.utils.b f96433e = new a("PageAnnotationHandler");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f96430f = "h_router";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f96432h = com.sankuai.waimai.router.utils.f.e(f96430f, "page");

    /* JADX INFO: compiled from: PageAnnotationHandler.java */
    public class a extends com.sankuai.waimai.router.utils.b {
        a(String str) {
            super(str);
        }

        @Override // com.sankuai.waimai.router.utils.b
        protected void a() {
            k.this.n();
        }
    }

    public k() {
        a(i.f96428a);
        l(j.f96429b);
    }

    public static boolean o(Intent intent) {
        return intent != null && f96432h.equals(com.sankuai.waimai.router.utils.f.d(intent.getData()));
    }

    @Override // com.sankuai.waimai.router.core.g
    public void c(@n0 com.sankuai.waimai.router.core.i iVar, @n0 com.sankuai.waimai.router.core.f fVar) {
        this.f96433e.b();
        super.c(iVar, fVar);
    }

    @Override // com.sankuai.waimai.router.common.l, com.sankuai.waimai.router.core.g
    protected boolean e(@n0 com.sankuai.waimai.router.core.i iVar) {
        return f96432h.matches(iVar.v());
    }

    protected void n() {
        com.sankuai.waimai.router.components.h.b(this, f.class);
    }

    public void p() {
        this.f96433e.c();
    }

    @Override // com.sankuai.waimai.router.core.g
    public String toString() {
        return "PageAnnotationHandler";
    }
}
