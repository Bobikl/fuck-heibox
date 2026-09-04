package com.alipay.mobile.android.verify.sdk;

import android.app.Activity;
import java.util.HashMap;

/* JADX INFO: compiled from: ServiceImpl.java */
/* JADX INFO: loaded from: classes6.dex */
public class e implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f39407b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f39408c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ l4.a f39409d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ d f39410e;

    e(d dVar, Activity activity, String str, l4.a aVar) {
        this.f39410e = dVar;
        this.f39407b = activity;
        this.f39408c = str;
        this.f39409d = aVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f39410e.f39406b = new c(this.f39407b, this.f39408c, this.f39409d);
            this.f39410e.f39406b.show();
        } catch (Exception e10) {
            com.alipay.mobile.android.verify.logger.f.k("ServiceImpl").k(e10, "start container got error", new Object[0]);
            k4.a.c("zmCallback");
            k4.a.b(null);
            this.f39409d.a(new HashMap());
        }
    }
}
