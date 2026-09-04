package com.sankuai.waimai.router.service;

import androidx.annotation.n0;

/* JADX INFO: compiled from: EmptyArgsFactory.java */
/* JADX INFO: loaded from: classes8.dex */
public class c implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f96545a = new c();

    private c() {
    }

    @Override // com.sankuai.waimai.router.service.d
    @n0
    public <T> T a(@n0 Class<T> cls) throws Exception {
        return cls.newInstance();
    }
}
