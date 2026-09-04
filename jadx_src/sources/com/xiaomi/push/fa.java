package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public class fa implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f107119a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ Context f413a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f414a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f107120b;

    fa(Context context, String str, int i10, String str2) {
        this.f413a = context;
        this.f414a = str;
        this.f107119a = i10;
        this.f107120b = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        ez.c(this.f413a, this.f414a, this.f107119a, this.f107120b);
    }
}
