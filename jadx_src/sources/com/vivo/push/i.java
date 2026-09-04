package com.vivo.push;

/* JADX INFO: compiled from: PushClientManager.java */
/* JADX INFO: loaded from: classes4.dex */
public final class i implements IPushActionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ e f106604a;

    i(e eVar) {
        this.f106604a = eVar;
    }

    @Override // com.vivo.push.IPushActionListener
    public final void onStateChanged(int i10) {
        if (i10 != 0) {
            this.f106604a.f106580k = null;
            this.f106604a.f106579j.b("APP_TOKEN");
        } else {
            this.f106604a.f106580k = "";
            this.f106604a.f106579j.a("APP_TOKEN", "");
            this.f106604a.m();
            this.f106604a.f106579j.b("APP_TAGS");
        }
    }
}
