package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class dr implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f106986a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Context f295a;

    dr(Context context, long j10) {
        this.f295a = context;
        this.f106986a = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dp.c(this.f295a, this.f106986a);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("DisconnectStatsSP onReconnection exception: " + e10.getMessage());
        }
    }
}
