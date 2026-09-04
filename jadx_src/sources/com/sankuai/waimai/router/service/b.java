package com.sankuai.waimai.router.service;

import androidx.annotation.n0;

/* JADX INFO: compiled from: DefaultFactory.java */
/* JADX INFO: loaded from: classes8.dex */
public class b implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f96544a = new b();

    private b() {
    }

    @Override // com.sankuai.waimai.router.service.d
    @n0
    public <T> T a(@n0 Class<T> cls) throws Exception {
        T t10 = (T) com.sankuai.waimai.router.utils.e.a(cls);
        return t10 != null ? t10 : cls.newInstance();
    }
}
