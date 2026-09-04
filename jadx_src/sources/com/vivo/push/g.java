package com.vivo.push;

/* JADX INFO: compiled from: PushClientManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g implements IPushActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e.a f106599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ e f106600b;

    g(e eVar, e.a aVar) {
        this.f106600b = eVar;
        this.f106599a = aVar;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i10) {
        if (i10 != 0) {
            this.f106600b.f106580k = null;
            this.f106600b.f106579j.b("APP_TOKEN");
            return;
        }
        Object[] objArrB = this.f106599a.b();
        if (objArrB == null || objArrB.length == 0) {
            com.vivo.push.util.p.a("PushClientManager", "bind app result is null");
        } else {
            this.f106600b.a((String) this.f106599a.b()[0]);
        }
    }
}
