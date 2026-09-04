package com.alipay.apmobilesecuritysdk.f;

import android.os.Process;

/* JADX INFO: loaded from: classes6.dex */
public final class c implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f38195a;

    public c(b bVar) {
        this.f38195a = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Process.setThreadPriority(0);
            while (!this.f38195a.f38194c.isEmpty()) {
                Runnable runnable = (Runnable) this.f38195a.f38194c.get(0);
                this.f38195a.f38194c.remove(0);
                if (runnable != null) {
                    runnable.run();
                }
            }
        } catch (Exception unused) {
        } catch (Throwable th2) {
            b.b(this.f38195a);
            throw th2;
        }
        b.b(this.f38195a);
    }
}
