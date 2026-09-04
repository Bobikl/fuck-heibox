package com.xiaomi.push;

import android.app.NotificationChannel;
import android.content.Context;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes4.dex */
public class bx implements Callable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ NotificationChannel f106898a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Context f224a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ bv f225a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f226a;

    bx(bv bvVar, Context context, String str, NotificationChannel notificationChannel) {
        this.f225a = bvVar;
        this.f224a = context;
        this.f226a = str;
        this.f106898a = notificationChannel;
    }

    @Override // java.util.concurrent.Callable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public String call() {
        return String.valueOf(jx.a(this.f224a, this.f226a, this.f106898a));
    }
}
