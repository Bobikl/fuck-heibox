package com.vivo.push;

/* JADX INFO: compiled from: PushClientManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class j implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.b f106605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f106606b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ e f106607c;

    j(e eVar, com.vivo.push.b.b bVar, String str) {
        this.f106607c = eVar;
        this.f106605a = bVar;
        this.f106606b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f106607c.a(this.f106605a);
        this.f106607c.e(this.f106606b);
    }
}
