package com.sankuai.waimai.router.service;

import android.content.Context;
import androidx.annotation.n0;

/* JADX INFO: compiled from: ContextFactory.java */
/* JADX INFO: loaded from: classes8.dex */
public class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f96543a;

    public a(Context context) {
        this.f96543a = context;
    }

    @Override // com.sankuai.waimai.router.service.d
    @n0
    public <T> T a(@n0 Class<T> cls) throws Exception {
        return cls.getConstructor(Context.class).newInstance(this.f96543a);
    }
}
