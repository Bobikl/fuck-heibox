package com.google.android.exoplayer2.util;

import java.io.IOException;
import java.util.Collections;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes7.dex */
public final class PriorityTaskManager {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f51364a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final PriorityQueue<Integer> f51365b = new PriorityQueue<>(10, Collections.reverseOrder());

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f51366c = Integer.MIN_VALUE;

    public static class PriorityTooLowException extends IOException {
        public PriorityTooLowException(int i10, int i11) {
            StringBuilder sb2 = new StringBuilder(60);
            sb2.append("Priority too low [priority=");
            sb2.append(i10);
            sb2.append(", highest=");
            sb2.append(i11);
            sb2.append("]");
            super(sb2.toString());
        }
    }

    public void a(int i10) {
        synchronized (this.f51364a) {
            this.f51365b.add(Integer.valueOf(i10));
            this.f51366c = Math.max(this.f51366c, i10);
        }
    }

    public void b(int i10) throws InterruptedException {
        synchronized (this.f51364a) {
            while (this.f51366c != i10) {
                this.f51364a.wait();
            }
        }
    }

    public boolean c(int i10) {
        boolean z10;
        synchronized (this.f51364a) {
            z10 = this.f51366c == i10;
        }
        return z10;
    }

    public void d(int i10) throws PriorityTooLowException {
        synchronized (this.f51364a) {
            if (this.f51366c != i10) {
                throw new PriorityTooLowException(i10, this.f51366c);
            }
        }
    }

    public void e(int i10) {
        synchronized (this.f51364a) {
            this.f51365b.remove(Integer.valueOf(i10));
            this.f51366c = this.f51365b.isEmpty() ? Integer.MIN_VALUE : ((Integer) u0.k(this.f51365b.peek())).intValue();
            this.f51364a.notifyAll();
        }
    }
}
