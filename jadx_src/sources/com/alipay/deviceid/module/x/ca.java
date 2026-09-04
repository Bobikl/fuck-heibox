package com.alipay.deviceid.module.x;

import android.os.Process;
import java.util.LinkedList;

/* JADX INFO: compiled from: SingleThreadPool.java */
/* JADX INFO: loaded from: classes6.dex */
public final class ca {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static ca f38335a = new ca();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Thread f38336b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinkedList<Runnable> f38337c = new LinkedList<>();

    public static ca a() {
        return f38335a;
    }

    static /* synthetic */ Thread b(ca caVar) {
        caVar.f38336b = null;
        return null;
    }

    public final synchronized void a(Runnable runnable) {
        this.f38337c.add(runnable);
        if (this.f38336b == null) {
            Thread thread = new Thread(new Runnable() { // from class: com.alipay.deviceid.module.x.ca.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Process.setThreadPriority(0);
                        while (!ca.this.f38337c.isEmpty()) {
                            Runnable runnable2 = (Runnable) ca.this.f38337c.pollFirst();
                            if (runnable2 != null) {
                                runnable2.run();
                            }
                        }
                    } catch (Exception unused) {
                    } catch (Throwable th2) {
                        ca.b(ca.this);
                        throw th2;
                    }
                    ca.b(ca.this);
                }
            });
            this.f38336b = thread;
            thread.start();
        }
    }
}
