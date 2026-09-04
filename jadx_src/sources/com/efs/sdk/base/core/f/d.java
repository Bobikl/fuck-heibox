package com.efs.sdk.base.core.f;

import com.efs.sdk.base.core.controller.ControllerCenter;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes6.dex */
public final class d extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private AtomicInteger f42543c = new AtomicInteger(0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private AtomicInteger f42544d = new AtomicInteger(0);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public AtomicInteger f42542b = new AtomicInteger(0);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private AtomicInteger f42545e = new AtomicInteger(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AtomicInteger f42546f = new AtomicInteger(0);

    @Override // com.efs.sdk.base.core.f.a
    public final void a() {
        if ((this.f42543c.get() == 0 && this.f42544d.get() == 0 && this.f42542b.get() == 0 && this.f42546f.get() == 0 && this.f42545e.get() == 0) || this.f42534a == null || !ControllerCenter.getGlobalEnvStruct().isEnableWaStat()) {
            return;
        }
        ControllerCenter controllerCenter = this.f42534a;
        int i10 = this.f42543c.get();
        int i11 = this.f42544d.get();
        int i12 = this.f42542b.get();
        int i13 = this.f42546f.get();
        int i14 = this.f42545e.get();
        b bVar = new b("efs_core", "lf_st", f.a.f42551a.f42547a.f42541c);
        bVar.put("create_cnt", Integer.valueOf(i10));
        bVar.put("cache_cnt", Integer.valueOf(i11));
        bVar.put("req_cnt", Integer.valueOf(i12));
        bVar.put("err_cnt", Integer.valueOf(i13));
        bVar.put("expire_cnt", Integer.valueOf(i14));
        this.f42543c.addAndGet(i10 * (-1));
        this.f42544d.addAndGet(i11 * (-1));
        this.f42542b.addAndGet(i12 * (-1));
        this.f42546f.addAndGet(i13 * (-1));
        this.f42545e.addAndGet(i14 * (-1));
        controllerCenter.send(bVar);
    }

    public final void b() {
        this.f42543c.incrementAndGet();
    }

    public final void c() {
        this.f42544d.incrementAndGet();
    }

    public final void d() {
        this.f42545e.incrementAndGet();
    }

    public final void e() {
        this.f42546f.incrementAndGet();
    }
}
