package com.vivo.push;

/* JADX INFO: compiled from: PushClientManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class h implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.b f106601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f106602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f106603c;

    h(e eVar, com.vivo.push.b.b bVar, String str) {
        this.f106603c = eVar;
        this.f106601a = bVar;
        this.f106602b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f106603c.a(this.f106601a);
        this.f106603c.e(this.f106602b);
    }
}
