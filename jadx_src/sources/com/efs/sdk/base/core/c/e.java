package com.efs.sdk.base.core.c;

import com.efs.sdk.base.http.HttpResponse;

/* JADX INFO: loaded from: classes6.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.efs.sdk.base.core.d.b f42455a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f42456b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42457c;

    public e(com.efs.sdk.base.core.d.b bVar, c cVar, String str) {
        this.f42455a = bVar;
        this.f42456b = cVar;
        this.f42457c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        c cVar;
        com.efs.sdk.base.core.d.b bVar = this.f42455a;
        HttpResponse httpResponse = (bVar == null || (cVar = this.f42456b) == null) ? new HttpResponse() : cVar.a(bVar, true);
        d.a().a(this.f42457c, httpResponse.succ ? 0 : httpResponse.getHttpCode());
        this.f42457c = null;
        this.f42456b = null;
    }
}
