package com.sankuai.waimai.router.components;

import android.content.Intent;
import androidx.annotation.n0;

/* JADX INFO: compiled from: RouterComponents.java */
/* JADX INFO: loaded from: classes8.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private static c f96467a = e.f96464a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    private static a f96468b = d.f96462m;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    private static com.sankuai.waimai.router.service.d f96469c = com.sankuai.waimai.router.service.b.f96544a;

    @n0
    public static com.sankuai.waimai.router.service.d a() {
        return f96469c;
    }

    public static <T extends com.sankuai.waimai.router.core.g> void b(T t10, Class<? extends b<T>> cls) {
        f96467a.a(t10, cls);
    }

    public static void c(a aVar) {
        if (aVar == null) {
            aVar = d.f96462m;
        }
        f96468b = aVar;
    }

    public static void d(c cVar) {
        if (cVar == null) {
            cVar = e.f96464a;
        }
        f96467a = cVar;
    }

    public static void e(com.sankuai.waimai.router.service.d dVar) {
        if (dVar == null) {
            dVar = com.sankuai.waimai.router.service.b.f96544a;
        }
        f96469c = dVar;
    }

    public static int f(@n0 com.sankuai.waimai.router.core.i iVar, @n0 Intent intent) {
        return f96468b.a(iVar, intent);
    }
}
