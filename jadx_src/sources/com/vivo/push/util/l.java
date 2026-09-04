package com.vivo.push.util;

import java.util.List;

/* JADX INFO: compiled from: ImageDownTask.java */
/* JADX INFO: loaded from: classes4.dex */
public final class l implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ List f106685a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ k f106686b;

    l(k kVar, List list) {
        this.f106686b = kVar;
        this.f106685a = list;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f106686b.f106680b != null) {
            w.b().a("com.vivo.push.notify_key", this.f106686b.f106681c);
            NotifyAdapterUtil.pushNotification(this.f106686b.f106679a, this.f106685a, this.f106686b.f106680b, this.f106686b.f106681c, this.f106686b.f106683e, this.f106686b.f106684f);
        }
    }
}
