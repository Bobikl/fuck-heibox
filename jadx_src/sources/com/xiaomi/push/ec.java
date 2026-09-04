package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class ec implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f107020a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Context f308a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ boolean f309a;

    ec(Context context, long j10, boolean z10) {
        this.f308a = context;
        this.f107020a = j10;
        this.f309a = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dy.l(this.f308a, this.f107020a, this.f309a);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("PowerStatsSP onPong exception: " + e10.getMessage());
        }
    }
}
