package com.alipay.mobile.android.verify.sdk;

import android.app.Activity;
import com.alibaba.fastjson.JSONObject;
import java.util.HashMap;

/* JADX INFO: compiled from: ServiceImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class f implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f39411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ JSONObject f39412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ l4.a f39413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f39414e;

    f(d dVar, Activity activity, JSONObject jSONObject, l4.a aVar) {
        this.f39414e = dVar;
        this.f39411b = activity;
        this.f39412c = jSONObject;
        this.f39413d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f39414e.f39406b = new c(this.f39411b, this.f39412c.getString("url"), this.f39413d);
            this.f39414e.f39406b.j(this.f39412c);
            this.f39414e.f39406b.show();
        } catch (Exception e10) {
            com.alipay.mobile.android.verify.logger.f.k("ServiceImpl").k(e10, "start container got error", new Object[0]);
            k4.a.c("zmCallback");
            k4.a.b(null);
            this.f39413d.a(new HashMap());
        }
    }
}
