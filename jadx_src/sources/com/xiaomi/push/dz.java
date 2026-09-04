package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class dz implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f107017a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Context f302a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ boolean f303a;

    dz(Context context, long j10, boolean z10) {
        this.f302a = context;
        this.f107017a = j10;
        this.f303a = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dy.i(this.f302a, this.f107017a, this.f303a);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("PowerStatsSP onSendMsg exception: " + e10.getMessage());
        }
    }
}
