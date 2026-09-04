package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class eb implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f107019a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Context f306a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ boolean f307a;

    eb(Context context, long j10, boolean z10) {
        this.f306a = context;
        this.f107019a = j10;
        this.f307a = z10;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dy.k(this.f306a, this.f107019a, this.f307a);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("PowerStatsSP onPing exception: " + e10.getMessage());
        }
    }
}
