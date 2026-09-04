package com.vivo.push.d;

import android.text.TextUtils;

/* JADX INFO: compiled from: OnBindAppReceiveTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class e implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f106539a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ com.vivo.push.b.i f106540b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ d f106541c;

    e(d dVar, String str, com.vivo.push.b.i iVar) {
        this.f106541c = dVar;
        this.f106539a = str;
        this.f106540b = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!TextUtils.isEmpty(this.f106539a)) {
            d dVar = this.f106541c;
            ((z) dVar).f106569b.onReceiveRegId(((com.vivo.push.l) dVar).f106610a, this.f106539a);
        }
        d dVar2 = this.f106541c;
        ((z) dVar2).f106569b.onBind(((com.vivo.push.l) dVar2).f106610a, this.f106540b.h(), this.f106540b.d());
    }
}
