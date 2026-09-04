package com.sankuai.waimai.router.components;

import java.util.Iterator;

/* JADX INFO: compiled from: DefaultAnnotationLoader.java */
/* JADX INFO: loaded from: classes8.dex */
public class e implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f96464a = new e();

    @Override // com.sankuai.waimai.router.components.c
    public <T extends com.sankuai.waimai.router.core.g> void a(T t10, Class<? extends b<T>> cls) {
        Iterator it = hg.b.c(cls).iterator();
        while (it.hasNext()) {
            ((b) it.next()).a(t10);
        }
    }
}
