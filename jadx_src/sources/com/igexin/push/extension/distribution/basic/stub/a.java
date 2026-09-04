package com.igexin.push.extension.distribution.basic.stub;

import com.igexin.push.core.d;
import com.igexin.push.extension.distribution.basic.c.c;

/* JADX INFO: loaded from: classes6.dex */
public class a implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ boolean f64005a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ PushExtension f64006b;

    a(PushExtension pushExtension, boolean z10) {
        this.f64006b = pushExtension;
        this.f64005a = z10;
    }

    @Override // java.lang.Runnable
    public void run() throws Throwable {
        if (this.f64005a) {
            c.a().e();
        }
        try {
            Thread.sleep(5000L);
        } catch (InterruptedException unused) {
        }
        if (d.f63678l) {
            com.igexin.push.extension.distribution.basic.a.d.a().a(d.f63678l);
        }
    }
}
