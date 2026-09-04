package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: AutoDisposeBackpressureHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class d {
    private d() {
        throw new IllegalStateException("No instances!");
    }

    static long a(AtomicLong atomicLong, long j10) {
        long j11;
        do {
            j11 = atomicLong.get();
            if (j11 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j11, b(j11, j10)));
        return j11;
    }

    private static long b(long j10, long j11) {
        long j12 = j10 + j11;
        if (j12 < 0) {
            return Long.MAX_VALUE;
        }
        return j12;
    }
}
