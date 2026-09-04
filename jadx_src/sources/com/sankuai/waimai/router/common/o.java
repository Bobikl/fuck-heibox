package com.sankuai.waimai.router.common;

import android.text.TextUtils;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: UriAnnotationHandler.java */
/* JADX INFO: loaded from: classes8.dex */
public class o extends com.sankuai.waimai.router.core.g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f96443f = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f96445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f96446d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, l> f96444b = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.sankuai.waimai.router.utils.b f96447e = new a("UriAnnotationHandler");

    /* JADX INFO: compiled from: UriAnnotationHandler.java */
    public class a extends com.sankuai.waimai.router.utils.b {
        a(String str) {
            super(str);
        }

        @Override // com.sankuai.waimai.router.utils.b
        protected void a() {
            o.this.i();
        }
    }

    public o(@p0 String str, @p0 String str2) {
        this.f96445c = com.sankuai.waimai.router.utils.f.g(str);
        this.f96446d = com.sankuai.waimai.router.utils.f.g(str2);
    }

    private l g(@n0 com.sankuai.waimai.router.core.i iVar) {
        return this.f96444b.get(iVar.v());
    }

    public static void l(boolean z10) {
        f96443f = z10;
    }

    @Override // com.sankuai.waimai.router.core.g
    public void c(@n0 com.sankuai.waimai.router.core.i iVar, @n0 com.sankuai.waimai.router.core.f fVar) {
        this.f96447e.b();
        super.c(iVar, fVar);
    }

    @Override // com.sankuai.waimai.router.core.g
    protected void d(@n0 com.sankuai.waimai.router.core.i iVar, @n0 com.sankuai.waimai.router.core.f fVar) {
        l lVarG = g(iVar);
        if (lVarG != null) {
            lVarG.c(iVar, fVar);
        } else {
            fVar.a();
        }
    }

    @Override // com.sankuai.waimai.router.core.g
    protected boolean e(@n0 com.sankuai.waimai.router.core.i iVar) {
        return g(iVar) != null;
    }

    @n0
    protected l f() {
        l lVar = new l();
        if (f96443f) {
            lVar.l(j.f96429b);
        }
        return lVar;
    }

    public l h(String str, String str2) {
        return this.f96444b.get(com.sankuai.waimai.router.utils.f.e(str, str2));
    }

    protected void i() {
        com.sankuai.waimai.router.components.h.b(this, h.class);
    }

    public void j() {
        this.f96447e.c();
    }

    public void k(String str, String str2, String str3, Object obj, boolean z10, com.sankuai.waimai.router.core.h... hVarArr) {
        if (TextUtils.isEmpty(str)) {
            str = this.f96445c;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = this.f96446d;
        }
        String strE = com.sankuai.waimai.router.utils.f.e(str, str2);
        l lVarF = this.f96444b.get(strE);
        if (lVarF == null) {
            lVarF = f();
            this.f96444b.put(strE, lVarF);
        }
        lVarF.i(str3, obj, z10, hVarArr);
    }

    public void m(String str) {
        Iterator<l> it = this.f96444b.values().iterator();
        while (it.hasNext()) {
            it.next().m(str);
        }
    }

    public void n(String str, String str2, String str3) {
        l lVarH = h(str, str2);
        if (lVarH != null) {
            lVarH.m(str3);
        }
    }

    @Override // com.sankuai.waimai.router.core.g
    public String toString() {
        return "UriAnnotationHandler";
    }
}
