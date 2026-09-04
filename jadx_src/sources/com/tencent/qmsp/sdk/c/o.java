package com.tencent.qmsp.sdk.c;

import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private AtomicInteger f101850a = new AtomicInteger(0);

    public boolean a() {
        int i10;
        do {
            i10 = this.f101850a.get();
            if ((i10 & 1) != 0) {
                return false;
            }
        } while (!this.f101850a.compareAndSet(i10, i10 + 2));
        return true;
    }

    public void b() {
        int i10;
        do {
            i10 = this.f101850a.get();
            if ((i10 & (-2)) == 0) {
                return;
            }
            if ((i10 & 1) != 0) {
                if ((this.f101850a.addAndGet(-2) & (-2)) == 0) {
                    synchronized (this.f101850a) {
                        this.f101850a.notifyAll();
                    }
                    return;
                }
                return;
            }
        } while (!this.f101850a.compareAndSet(i10, i10 - 2));
    }

    public void c() {
        int i10;
        if (this.f101850a.compareAndSet(0, 1) || this.f101850a.compareAndSet(1, 1)) {
            return;
        }
        do {
            i10 = this.f101850a.get();
        } while (!this.f101850a.compareAndSet(i10, i10 | 1));
        synchronized (this.f101850a) {
            try {
                this.f101850a.wait();
            } catch (InterruptedException e10) {
                e10.printStackTrace();
            }
        }
    }
}
