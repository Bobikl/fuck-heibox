package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class ea implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f107018a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Context f304a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ boolean f305a;

    ea(Context context, long j10, boolean z10) {
        this.f304a = context;
        this.f107018a = j10;
        this.f305a = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dy.j(this.f304a, this.f107018a, this.f305a);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("PowerStatsSP onReceiveMsg exception: " + e10.getMessage());
        }
    }
}
