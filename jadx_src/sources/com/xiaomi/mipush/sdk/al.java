package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public class al implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f106755a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Intent f121a;

    al(Context context, Intent intent) {
        this.f106755a = context;
        this.f121a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        PushMessageHandler.b(this.f106755a, this.f121a);
    }
}
