package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class ak {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f106815a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private Handler f172a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private a f173a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private volatile b f174a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private volatile boolean f175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f106816b;

    public class a extends Thread {

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private final LinkedBlockingQueue<b> f176a;

        public a() {
            super("PackageProcessor");
            this.f176a = new LinkedBlockingQueue<>();
        }

        private void a(int i10, b bVar) {
            try {
                ak.this.f172a.sendMessage(ak.this.f172a.obtainMessage(i10, bVar));
            } catch (Exception e10) {
                com.xiaomi.channel.commonutils.logger.b.a(e10);
            }
        }

        public void a(b bVar) {
            try {
                this.f176a.add(bVar);
            } catch (Exception e10) {
                e10.printStackTrace();
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long j10 = ak.this.f106815a > 0 ? ak.this.f106815a : Long.MAX_VALUE;
            while (!ak.this.f175a) {
                try {
                    b bVarPoll = this.f176a.poll(j10, TimeUnit.SECONDS);
                    ak.this.f174a = bVarPoll;
                    if (bVarPoll != null) {
                        a(0, bVarPoll);
                        bVarPoll.b();
                        a(1, bVarPoll);
                    } else if (ak.this.f106815a > 0) {
                        ak.this.a();
                    }
                } catch (InterruptedException e10) {
                    com.xiaomi.channel.commonutils.logger.b.a(e10);
                }
            }
        }
    }

    public static abstract class b {
        public void a() {
        }

        public abstract void b();

        /* JADX INFO: renamed from: c */
        public void mo279c() {
        }
    }

    public ak() {
        this(false);
    }

    public ak(boolean z10) {
        this(z10, 0);
    }

    public ak(boolean z10, int i10) {
        this.f172a = null;
        this.f175a = false;
        this.f106815a = 0;
        this.f172a = new al(this, Looper.getMainLooper());
        this.f106816b = z10;
        this.f106815a = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        this.f173a = null;
        this.f175a = true;
    }

    public synchronized void a(b bVar) {
        if (this.f173a == null) {
            a aVar = new a();
            this.f173a = aVar;
            aVar.setDaemon(this.f106816b);
            this.f175a = false;
            this.f173a.start();
        }
        this.f173a.a(bVar);
    }

    public void a(b bVar, long j10) {
        this.f172a.postDelayed(new am(this, bVar), j10);
    }
}
