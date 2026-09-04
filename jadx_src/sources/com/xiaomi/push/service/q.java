package com.xiaomi.push.service;

import android.os.SystemClock;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes4.dex */
public class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f108018a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static long f108019b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static long f108020c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final a f1101a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final c f1102a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final c f108021a;

        a(c cVar) {
            this.f108021a = cVar;
        }

        protected void finalize() throws Throwable {
            try {
                synchronized (this.f108021a) {
                    this.f108021a.f108025c = true;
                    this.f108021a.notify();
                }
                super.finalize();
            } catch (Throwable th2) {
                super.finalize();
                throw th2;
            }
        }
    }

    public static abstract class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f108022a;

        public b(int i10) {
            this.f108022a = i10;
        }
    }

    public static final class c extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with other field name */
        private boolean f1105b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f108025c;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private volatile long f108023a = 0;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private volatile boolean f1104a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f108024b = 50;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        private a f1103a = new a();

        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f108026a;

            /* JADX INFO: renamed from: a, reason: collision with other field name */
            private d[] f1106a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private int f108027b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private int f108028c;

            private a() {
                this.f108026a = 256;
                this.f1106a = new d[256];
                this.f108027b = 0;
                this.f108028c = 0;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public int a(d dVar) {
                int i10 = 0;
                while (true) {
                    d[] dVarArr = this.f1106a;
                    if (i10 >= dVarArr.length) {
                        return -1;
                    }
                    if (dVarArr[i10] == dVar) {
                        return i10;
                    }
                    i10++;
                }
            }

            private void c() {
                int i10 = this.f108027b - 1;
                int i11 = (i10 - 1) / 2;
                while (true) {
                    d[] dVarArr = this.f1106a;
                    d dVar = dVarArr[i10];
                    long j10 = dVar.f1107a;
                    d dVar2 = dVarArr[i11];
                    if (j10 >= dVar2.f1107a) {
                        return;
                    }
                    dVarArr[i10] = dVar2;
                    dVarArr[i11] = dVar;
                    int i12 = i11;
                    i11 = (i11 - 1) / 2;
                    i10 = i12;
                }
            }

            private void c(int i10) {
                int i11 = (i10 * 2) + 1;
                while (true) {
                    int i12 = this.f108027b;
                    if (i11 >= i12 || i12 <= 0) {
                        return;
                    }
                    int i13 = i11 + 1;
                    if (i13 < i12) {
                        d[] dVarArr = this.f1106a;
                        if (dVarArr[i13].f1107a < dVarArr[i11].f1107a) {
                            i11 = i13;
                        }
                    }
                    d[] dVarArr2 = this.f1106a;
                    d dVar = dVarArr2[i10];
                    long j10 = dVar.f1107a;
                    d dVar2 = dVarArr2[i11];
                    if (j10 < dVar2.f1107a) {
                        return;
                    }
                    dVarArr2[i10] = dVar2;
                    dVarArr2[i11] = dVar;
                    int i14 = i11;
                    i11 = (i11 * 2) + 1;
                    i10 = i14;
                }
            }

            public d a() {
                return this.f1106a[0];
            }

            /* JADX INFO: renamed from: a, reason: collision with other method in class */
            public void m768a() {
                this.f1106a = new d[this.f108026a];
                this.f108027b = 0;
            }

            public void a(int i10) {
                for (int i11 = 0; i11 < this.f108027b; i11++) {
                    d dVar = this.f1106a[i11];
                    if (dVar.f108029a == i10) {
                        dVar.a();
                    }
                }
                b();
            }

            public void a(int i10, b bVar) {
                for (int i11 = 0; i11 < this.f108027b; i11++) {
                    d dVar = this.f1106a[i11];
                    if (dVar.f1108a == bVar) {
                        dVar.a();
                    }
                }
                b();
            }

            /* JADX INFO: renamed from: a, reason: collision with other method in class */
            public void m769a(d dVar) {
                d[] dVarArr = this.f1106a;
                int length = dVarArr.length;
                int i10 = this.f108027b;
                if (length == i10) {
                    d[] dVarArr2 = new d[i10 * 2];
                    System.arraycopy(dVarArr, 0, dVarArr2, 0, i10);
                    this.f1106a = dVarArr2;
                }
                d[] dVarArr3 = this.f1106a;
                int i11 = this.f108027b;
                this.f108027b = i11 + 1;
                dVarArr3[i11] = dVar;
                c();
            }

            /* JADX INFO: renamed from: a, reason: collision with other method in class */
            public boolean m770a() {
                return this.f108027b == 0;
            }

            /* JADX INFO: renamed from: a, reason: collision with other method in class */
            public boolean m771a(int i10) {
                for (int i11 = 0; i11 < this.f108027b; i11++) {
                    if (this.f1106a[i11].f108029a == i10) {
                        return true;
                    }
                }
                return false;
            }

            public void b() {
                int i10 = 0;
                while (i10 < this.f108027b) {
                    if (this.f1106a[i10].f1110a) {
                        this.f108028c++;
                        b(i10);
                        i10--;
                    }
                    i10++;
                }
            }

            public void b(int i10) {
                int i11;
                if (i10 < 0 || i10 >= (i11 = this.f108027b)) {
                    return;
                }
                d[] dVarArr = this.f1106a;
                int i12 = i11 - 1;
                this.f108027b = i12;
                dVarArr[i10] = dVarArr[i12];
                dVarArr[i12] = null;
                c(i10);
            }
        }

        c(String str, boolean z10) {
            setName(str);
            setDaemon(z10);
            start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(d dVar) {
            this.f1103a.m769a(dVar);
            notify();
        }

        public synchronized void a() {
            this.f1105b = true;
            this.f1103a.m768a();
            notify();
        }

        /* JADX INFO: renamed from: a, reason: collision with other method in class */
        public boolean m767a() {
            return this.f1104a && SystemClock.uptimeMillis() - this.f108023a > 600000;
        }

        /* JADX WARN: Code restructure failed: missing block: B:53:0x0092, code lost:
        
            r10.f108023a = android.os.SystemClock.uptimeMillis();
            r10.f1104a = true;
            r2.f1108a.run();
            r10.f1104a = false;
         */
        /* JADX WARN: Code restructure failed: missing block: B:55:0x00a3, code lost:
        
            r1 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:56:0x00a4, code lost:
        
            monitor-enter(r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:57:0x00a5, code lost:
        
            r10.f1105b = true;
         */
        /* JADX WARN: Code restructure failed: missing block: B:59:0x00a8, code lost:
        
            throw r1;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                r10 = this;
            L0:
                monitor-enter(r10)
                boolean r0 = r10.f1105b     // Catch: java.lang.Throwable -> Lb2
                if (r0 == 0) goto L7
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                return
            L7:
                com.xiaomi.push.service.q$c$a r0 = r10.f1103a     // Catch: java.lang.Throwable -> Lb2
                boolean r0 = r0.m770a()     // Catch: java.lang.Throwable -> Lb2
                if (r0 == 0) goto L1a
                boolean r0 = r10.f108025c     // Catch: java.lang.Throwable -> Lb2
                if (r0 == 0) goto L15
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                return
            L15:
                r10.wait()     // Catch: java.lang.InterruptedException -> L18 java.lang.Throwable -> Lb2
            L18:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                goto L0
            L1a:
                long r0 = com.xiaomi.push.service.q.a()     // Catch: java.lang.Throwable -> Lb2
                com.xiaomi.push.service.q$c$a r2 = r10.f1103a     // Catch: java.lang.Throwable -> Lb2
                com.xiaomi.push.service.q$d r2 = r2.a()     // Catch: java.lang.Throwable -> Lb2
                java.lang.Object r3 = r2.f1109a     // Catch: java.lang.Throwable -> Lb2
                monitor-enter(r3)     // Catch: java.lang.Throwable -> Lb2
                boolean r4 = r2.f1110a     // Catch: java.lang.Throwable -> Laf
                r5 = 0
                if (r4 == 0) goto L34
                com.xiaomi.push.service.q$c$a r0 = r10.f1103a     // Catch: java.lang.Throwable -> Laf
                r0.b(r5)     // Catch: java.lang.Throwable -> Laf
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Laf
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                goto L0
            L34:
                long r6 = r2.f1107a     // Catch: java.lang.Throwable -> Laf
                long r6 = r6 - r0
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Laf
                r0 = 0
                int r3 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                r8 = 50
                if (r3 <= 0) goto L57
                long r0 = r10.f108024b     // Catch: java.lang.Throwable -> Lb2
                int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
                if (r2 <= 0) goto L47
                r6 = r0
            L47:
                long r0 = r0 + r8
                r10.f108024b = r0     // Catch: java.lang.Throwable -> Lb2
                r2 = 500(0x1f4, double:2.47E-321)
                int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r0 <= 0) goto L52
                r10.f108024b = r2     // Catch: java.lang.Throwable -> Lb2
            L52:
                r10.wait(r6)     // Catch: java.lang.InterruptedException -> L55 java.lang.Throwable -> Lb2
            L55:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                goto L0
            L57:
                r10.f108024b = r8     // Catch: java.lang.Throwable -> Lb2
                java.lang.Object r3 = r2.f1109a     // Catch: java.lang.Throwable -> Lb2
                monitor-enter(r3)     // Catch: java.lang.Throwable -> Lb2
                com.xiaomi.push.service.q$c$a r4 = r10.f1103a     // Catch: java.lang.Throwable -> Lac
                com.xiaomi.push.service.q$d r4 = r4.a()     // Catch: java.lang.Throwable -> Lac
                long r6 = r4.f1107a     // Catch: java.lang.Throwable -> Lac
                long r8 = r2.f1107a     // Catch: java.lang.Throwable -> Lac
                int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
                if (r4 == 0) goto L71
                com.xiaomi.push.service.q$c$a r4 = r10.f1103a     // Catch: java.lang.Throwable -> Lac
                int r4 = com.xiaomi.push.service.q.c.a.a(r4, r2)     // Catch: java.lang.Throwable -> Lac
                goto L72
            L71:
                r4 = r5
            L72:
                boolean r6 = r2.f1110a     // Catch: java.lang.Throwable -> Lac
                if (r6 == 0) goto L83
                com.xiaomi.push.service.q$c$a r0 = r10.f1103a     // Catch: java.lang.Throwable -> Lac
                int r1 = com.xiaomi.push.service.q.c.a.a(r0, r2)     // Catch: java.lang.Throwable -> Lac
                r0.b(r1)     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                goto L0
            L83:
                long r6 = r2.f1107a     // Catch: java.lang.Throwable -> Lac
                r2.a(r6)     // Catch: java.lang.Throwable -> Lac
                com.xiaomi.push.service.q$c$a r6 = r10.f1103a     // Catch: java.lang.Throwable -> Lac
                r6.b(r4)     // Catch: java.lang.Throwable -> Lac
                r2.f1107a = r0     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                r0 = 1
                long r3 = android.os.SystemClock.uptimeMillis()     // Catch: java.lang.Throwable -> La3
                r10.f108023a = r3     // Catch: java.lang.Throwable -> La3
                r10.f1104a = r0     // Catch: java.lang.Throwable -> La3
                com.xiaomi.push.service.q$b r1 = r2.f1108a     // Catch: java.lang.Throwable -> La3
                r1.run()     // Catch: java.lang.Throwable -> La3
                r10.f1104a = r5     // Catch: java.lang.Throwable -> La3
                goto L0
            La3:
                r1 = move-exception
                monitor-enter(r10)
                r10.f1105b = r0     // Catch: java.lang.Throwable -> La9
                monitor-exit(r10)     // Catch: java.lang.Throwable -> La9
                throw r1
            La9:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> La9
                throw r0
            Lac:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lac
                throw r0     // Catch: java.lang.Throwable -> Lb2
            Laf:
                r0 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Laf
                throw r0     // Catch: java.lang.Throwable -> Lb2
            Lb2:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.service.q.c.run():void");
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f108029a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        long f1107a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        b f1108a;

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        final Object f1109a = new Object();

        /* JADX INFO: renamed from: a, reason: collision with other field name */
        boolean f1110a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private long f108030b;

        d() {
        }

        void a(long j10) {
            synchronized (this.f1109a) {
                this.f108030b = j10;
            }
        }

        public boolean a() {
            boolean z10;
            synchronized (this.f1109a) {
                z10 = !this.f1110a && this.f1107a > 0;
                this.f1110a = true;
            }
            return z10;
        }
    }

    static {
        long jElapsedRealtime = SystemClock.elapsedRealtime() > 0 ? SystemClock.elapsedRealtime() : 0L;
        f108018a = jElapsedRealtime;
        f108019b = jElapsedRealtime;
    }

    public q() {
        this(false);
    }

    public q(String str) {
        this(str, false);
    }

    public q(String str, boolean z10) {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        c cVar = new c(str, z10);
        this.f1102a = cVar;
        this.f1101a = new a(cVar);
    }

    public q(boolean z10) {
        this("Timer-" + b(), z10);
    }

    static synchronized long a() {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j10 = f108019b;
        if (jElapsedRealtime > j10) {
            f108018a += jElapsedRealtime - j10;
        }
        f108019b = jElapsedRealtime;
        return f108018a;
    }

    private static synchronized long b() {
        long j10;
        j10 = f108020c;
        f108020c = 1 + j10;
        return j10;
    }

    private void b(b bVar, long j10) {
        synchronized (this.f1102a) {
            if (this.f1102a.f1105b) {
                throw new IllegalStateException("Timer was canceled");
            }
            long jA = j10 + a();
            if (jA < 0) {
                throw new IllegalArgumentException("Illegal delay to start the TimerTask: " + jA);
            }
            d dVar = new d();
            dVar.f108029a = bVar.f108022a;
            dVar.f1108a = bVar;
            dVar.f1107a = jA;
            this.f1102a.a(dVar);
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public void m762a() {
        com.xiaomi.channel.commonutils.logger.b.m62a("quit. finalizer:" + this.f1101a);
        this.f1102a.a();
    }

    public void a(int i10) {
        synchronized (this.f1102a) {
            this.f1102a.f1103a.a(i10);
        }
    }

    public void a(int i10, b bVar) {
        synchronized (this.f1102a) {
            this.f1102a.f1103a.a(i10, bVar);
        }
    }

    public void a(b bVar) {
        if (com.xiaomi.channel.commonutils.logger.b.a() >= 1 || Thread.currentThread() == this.f1102a) {
            bVar.run();
        } else {
            com.xiaomi.channel.commonutils.logger.b.d("run job outside job job thread");
            throw new RejectedExecutionException("Run job outside job thread");
        }
    }

    public void a(b bVar, long j10) {
        if (j10 >= 0) {
            b(bVar, j10);
            return;
        }
        throw new IllegalArgumentException("delay < 0: " + j10);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m763a() {
        return this.f1102a.m767a();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public boolean m764a(int i10) {
        boolean zM771a;
        synchronized (this.f1102a) {
            zM771a = this.f1102a.f1103a.m771a(i10);
        }
        return zM771a;
    }

    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public void m765b() {
        synchronized (this.f1102a) {
            this.f1102a.f1103a.m768a();
        }
    }
}
