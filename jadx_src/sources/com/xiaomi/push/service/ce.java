package com.xiaomi.push.service;

import android.annotation.TargetApi;
import android.app.Notification;
import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class ce extends com.xiaomi.push.ah.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f107987a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Notification f1075a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Context f1076a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f1077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f107988b;

    ce(int i10, String str, Context context, String str2, Notification notification) {
        this.f107987a = i10;
        this.f1077a = str;
        this.f1076a = context;
        this.f107988b = str2;
        this.f1075a = notification;
    }

    @Override // com.xiaomi.push.ah.a
    /* JADX INFO: renamed from: a */
    public String mo195a() {
        return cd.b(this.f107987a, this.f1077a);
    }

    @Override // java.lang.Runnable
    @TargetApi(19)
    public void run() {
        cd.c(this.f1076a, this.f107988b, this.f107987a, this.f1077a, this.f1075a);
    }
}
