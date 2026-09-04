package org.apache.tools.ant.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;

/* JADX INFO: compiled from: Watchdog.java */
/* JADX INFO: loaded from: classes5.dex */
public class u2 implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final String f136956e = "timeout less than 1.";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f136958c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<o2> f136957b = Collections.synchronizedList(new ArrayList(1));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile boolean f136959d = false;

    public u2(long j10) {
        this.f136958c = -1L;
        if (j10 < 1) {
            throw new IllegalArgumentException(f136956e);
        }
        this.f136958c = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(o2 o2Var) {
        o2Var.a(this);
    }

    public void b(o2 o2Var) {
        this.f136957b.add(o2Var);
    }

    protected final void c() {
        this.f136957b.forEach(new Consumer() { // from class: org.apache.tools.ant.util.t2
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                this.f136948b.d((o2) obj);
            }
        });
    }

    public void e(o2 o2Var) {
        this.f136957b.remove(o2Var);
    }

    public synchronized void f() {
        this.f136959d = false;
        Thread thread = new Thread(this, "WATCHDOG");
        thread.setDaemon(true);
        thread.start();
    }

    public synchronized void g() {
        this.f136959d = true;
        notifyAll();
    }

    @Override // java.lang.Runnable
    public synchronized void run() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j10 = this.f136958c + jCurrentTimeMillis;
        while (!this.f136959d && j10 > jCurrentTimeMillis) {
            try {
                wait(j10 - jCurrentTimeMillis);
                jCurrentTimeMillis = System.currentTimeMillis();
            } catch (InterruptedException unused) {
            }
        }
        if (!this.f136959d) {
            c();
        }
    }
}
