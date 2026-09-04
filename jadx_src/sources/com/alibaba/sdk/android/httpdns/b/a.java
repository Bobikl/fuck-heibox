package com.alibaba.sdk.android.httpdns.b;

import android.content.Context;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f37899a;

    a(Context context) {
        this.f37899a = new d(context);
    }

    @Override // com.alibaba.sdk.android.httpdns.b.f
    public List<e> a() {
        return this.f37899a.b();
    }

    @Override // com.alibaba.sdk.android.httpdns.b.f
    public void a(e eVar) {
        this.f37899a.m13a(eVar);
    }

    @Override // com.alibaba.sdk.android.httpdns.b.f
    public void b(e eVar) {
        this.f37899a.b(eVar.f37907m, eVar.host);
    }
}
