package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes4.dex */
public class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f106805a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Intent f161a;

    y(Context context, Intent intent) {
        this.f106805a = context;
        this.f161a = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f106805a.startService(this.f161a);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a(e10.getMessage());
        }
    }
}
