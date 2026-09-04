package com.igexin.push.util;

import android.content.Context;

/* JADX INFO: loaded from: classes6.dex */
public final class g implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f64046a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f64047b;

    g(Context context, long j10) {
        this.f64046a = context;
        this.f64047b = j10;
    }

    @Override // java.lang.Runnable
    public void run() {
        d.b(this.f64046a, String.valueOf(this.f64047b));
    }
}
