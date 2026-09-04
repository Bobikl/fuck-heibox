package com.sankuai.waimai.router.common;

import androidx.annotation.n0;
import java.util.Map;

/* JADX INFO: compiled from: UriParamInterceptor.java */
/* JADX INFO: loaded from: classes8.dex */
public class p implements com.sankuai.waimai.router.core.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f96449a = "com.sankuai.waimai.router.UriParamInterceptor.uri_append_params";

    @Override // com.sankuai.waimai.router.core.h
    public void a(@n0 com.sankuai.waimai.router.core.i iVar, @n0 com.sankuai.waimai.router.core.f fVar) {
        b(iVar);
        fVar.a();
    }

    protected void b(@n0 com.sankuai.waimai.router.core.i iVar) {
        Map map = (Map) iVar.d(Map.class, f96449a);
        if (map != null) {
            iVar.y(com.sankuai.waimai.router.utils.f.a(iVar.m(), map));
        }
    }
}
