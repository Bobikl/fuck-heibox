package org.android.agoo.control;

import android.content.Intent;

/* JADX INFO: compiled from: Taobao */
/* JADX INFO: loaded from: classes5.dex */
public class k implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Intent f132841a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ BaseIntentService f132842b;

    k(BaseIntentService baseIntentService, Intent intent) {
        this.f132842b = baseIntentService;
        this.f132841a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f132842b.onHandleIntent(this.f132841a);
    }
}
