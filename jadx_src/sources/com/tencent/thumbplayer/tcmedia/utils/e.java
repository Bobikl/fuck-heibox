package com.tencent.thumbplayer.tcmedia.utils;

/* JADX INFO: loaded from: classes4.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f103144a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f103145b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Throwable f103146c = null;

    private void b(long j10) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = false;
        while (j10 > 0) {
            try {
                wait(j10);
                break;
            } catch (InterruptedException unused) {
                z10 = true;
                j10 -= System.currentTimeMillis() - jCurrentTimeMillis;
                TPLogUtil.i("TPFutureResult", "getResult wait has InterruptedException, remainTime:".concat(String.valueOf(j10)));
            }
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized Object a(long j10) {
        if (!this.f103145b) {
            b(j10);
        }
        Throwable th2 = this.f103146c;
        if (th2 != null) {
            throw th2;
        }
        return this.f103144a;
    }

    public synchronized void a(Object obj) {
        if (this.f103145b) {
            return;
        }
        this.f103144a = obj;
        this.f103145b = true;
        notifyAll();
    }

    public synchronized void a(Throwable th2) {
        if (th2 != null) {
            this.f103146c = th2;
            this.f103145b = true;
            notifyAll();
        }
    }
}
