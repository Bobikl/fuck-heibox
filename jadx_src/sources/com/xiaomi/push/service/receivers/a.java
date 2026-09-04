package com.xiaomi.push.service.receivers;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f108033a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ NetworkStatusReceiver f1111a;

    a(NetworkStatusReceiver networkStatusReceiver, Context context) {
        this.f1111a = networkStatusReceiver;
        this.f108033a = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f1111a.a(this.f108033a);
    }
}
