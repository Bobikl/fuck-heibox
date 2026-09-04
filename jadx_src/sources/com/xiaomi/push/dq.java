package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class dq implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f106983a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ long f289a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Context f290a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f291a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ boolean f292a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ int f106984b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    final /* synthetic */ long f293b;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    final /* synthetic */ String f294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ int f106985c;

    dq(Context context, String str, boolean z10, long j10, int i10, long j11, int i11, String str2, int i12) {
        this.f290a = context;
        this.f291a = str;
        this.f292a = z10;
        this.f289a = j10;
        this.f106983a = i10;
        this.f293b = j11;
        this.f106984b = i11;
        this.f294b = str2;
        this.f106985c = i12;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            dp.c(this.f290a, this.f291a, this.f292a, this.f289a, this.f106983a, this.f293b, this.f106984b, this.f294b, this.f106985c);
        } catch (Exception e10) {
            com.xiaomi.channel.commonutils.logger.b.m62a("DisconnectStatsSP onDisconnection exception: " + e10.getMessage());
        }
    }
}
