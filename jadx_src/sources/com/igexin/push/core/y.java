package com.igexin.push.core;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes.dex */
public class y implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f63795a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ Intent f63796b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ x f63797c;

    y(x xVar, Context context, Intent intent) {
        this.f63797c = xVar;
        this.f63795a = context;
        this.f63796b = intent;
    }

    private void a() {
        com.igexin.a.a.c.b.a("ServiceManager|startPService by bind", new Object[0]);
        this.f63796b.setType("PB-" + System.nanoTime());
        Intent intent = this.f63796b;
        Context context = this.f63795a;
        intent.setClass(context, this.f63797c.b(context));
        this.f63795a.getApplicationContext().bindService(this.f63796b, this.f63797c.f63794g, 1);
    }

    @Override // java.lang.Runnable
    public void run() {
        if (TextUtils.isEmpty(this.f63797c.f63793f)) {
            this.f63797c.f63793f = d.f63670d;
            if (TextUtils.isEmpty(this.f63797c.f63793f)) {
                this.f63797c.f63793f = com.igexin.push.util.d.c(this.f63795a);
            }
        }
        this.f63796b.putExtra("sc", this.f63797c.f63793f);
        try {
            if (Build.VERSION.SDK_INT < 26 || !com.igexin.push.util.a.j()) {
                this.f63795a.getApplicationContext().startService(this.f63796b);
            } else {
                a();
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a("ServiceManager|startPService err：" + th2.toString(), new Object[0]);
            if (th2 instanceof IllegalStateException) {
                a();
            }
        }
    }
}
