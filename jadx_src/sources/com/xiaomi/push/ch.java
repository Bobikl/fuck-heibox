package com.xiaomi.push;

import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes4.dex */
public class ch extends ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ cf f106912a;

    ch(cf cfVar) {
        this.f106912a = cfVar;
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a */
    public String mo195a() {
        return "10054";
    }

    @Override // java.lang.Runnable
    public void run() {
        com.xiaomi.channel.commonutils.logger.b.c("exec== DbSizeControlJob");
        cr.a(this.f106912a.f231a).a(new ck(this.f106912a.c(), new WeakReference(this.f106912a.f231a)));
        this.f106912a.b("check_time");
    }
}
