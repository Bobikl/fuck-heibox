package com.igexin.push.d;

/* JADX INFO: loaded from: classes.dex */
public class f implements i {
    @Override // com.igexin.push.d.i
    public long a() {
        long j10;
        long j11;
        boolean zA = com.igexin.push.util.a.a(System.currentTimeMillis());
        boolean zB = com.igexin.push.util.a.b();
        com.igexin.push.core.d.f63673g = com.igexin.push.util.a.h();
        com.igexin.a.a.c.b.a("NormalModel|isPushOn = " + com.igexin.push.core.d.f63675i + " checkIsSilentTime = " + zA + " isBlockEndTime = " + zB + " isNetworkAvailable = " + com.igexin.push.core.d.f63673g, new Object[0]);
        if (!com.igexin.push.core.d.f63673g || !com.igexin.push.core.d.f63675i || zA || !zB) {
            com.igexin.a.a.c.b.a("NormalModel|reconnect stop, interval= 20min ++++", new Object[0]);
            com.igexin.push.core.d.E = 1200000L;
            return 1200000L;
        }
        long j12 = com.igexin.push.core.d.D;
        if (j12 <= 0) {
            j11 = 100;
        } else {
            if (j12 <= 10000) {
                j10 = 500;
            } else {
                j10 = j12 <= 30000 ? 1500L : 120000L;
            }
            j11 = j12 + j10;
        }
        com.igexin.push.core.d.D = j11;
        if (com.igexin.push.core.d.D > 1200000) {
            com.igexin.push.core.d.D = 1200000L;
        }
        long j13 = com.igexin.push.core.d.D;
        com.igexin.a.a.c.b.a("NormalModel|after add auto reconnect delay time = " + j13, new Object[0]);
        com.igexin.push.core.d.E = j13;
        return j13;
    }
}
