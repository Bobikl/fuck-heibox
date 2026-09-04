package com.google.common.util.concurrent;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public final class SequentialExecutor implements Executor {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f59318g = Logger.getLogger(SequentialExecutor.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f59319b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @t9.a("queue")
    private final Deque<Runnable> f59320c = new ArrayDeque();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @t9.a("queue")
    private WorkerRunningState f59321d = WorkerRunningState.IDLE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @t9.a("queue")
    private long f59322e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @u9.f
    private final b f59323f = new b(this, null);

    public enum WorkerRunningState {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    public class a implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Runnable f59324b;

        a(SequentialExecutor sequentialExecutor, Runnable runnable) {
            this.f59324b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59324b.run();
        }

        public String toString() {
            return this.f59324b.toString();
        }
    }

    public final class b implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        Runnable f59325b;

        private b() {
        }

        /* synthetic */ b(SequentialExecutor sequentialExecutor, a aVar) {
            this();
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0043, code lost:
        
            if (r1 == false) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0045, code lost:
        
            java.lang.Thread.currentThread().interrupt();
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x004c, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0052, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        
            r9.f59325b.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        
            r0 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x005e, code lost:
        
            r3 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:29:0x005f, code lost:
        
            r4 = com.google.common.util.concurrent.SequentialExecutor.f59318g;
            r5 = java.util.logging.Level.SEVERE;
            r6 = java.lang.String.valueOf(r9.f59325b);
            r8 = new java.lang.StringBuilder(r6.length() + 35);
            r8.append("Exception while executing runnable ");
            r8.append(r6);
            r4.log(r5, r8.toString(), (java.lang.Throwable) r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0086, code lost:
        
            r9.f59325b = null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0088, code lost:
        
            throw r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:49:?, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void a() {
            /*
                r9 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.common.util.concurrent.SequentialExecutor r2 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L8c
                java.util.Deque r2 = com.google.common.util.concurrent.SequentialExecutor.a(r2)     // Catch: java.lang.Throwable -> L8c
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L8c
                if (r0 != 0) goto L2b
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r0 = com.google.common.util.concurrent.SequentialExecutor.b(r0)     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.RUNNING     // Catch: java.lang.Throwable -> L89
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor.d(r0)     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor.c(r0, r3)     // Catch: java.lang.Throwable -> L89
                r0 = 1
            L2b:
                com.google.common.util.concurrent.SequentialExecutor r3 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L89
                java.util.Deque r3 = com.google.common.util.concurrent.SequentialExecutor.a(r3)     // Catch: java.lang.Throwable -> L89
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L89
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L89
                r9.f59325b = r3     // Catch: java.lang.Throwable -> L89
                if (r3 != 0) goto L4d
                com.google.common.util.concurrent.SequentialExecutor r0 = com.google.common.util.concurrent.SequentialExecutor.this     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor$WorkerRunningState r3 = com.google.common.util.concurrent.SequentialExecutor.WorkerRunningState.IDLE     // Catch: java.lang.Throwable -> L89
                com.google.common.util.concurrent.SequentialExecutor.c(r0, r3)     // Catch: java.lang.Throwable -> L89
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
                if (r1 == 0) goto L4c
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4c:
                return
            L4d:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L8c
                r1 = r1 | r2
                r2 = 0
                java.lang.Runnable r3 = r9.f59325b     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
                r3.run()     // Catch: java.lang.Throwable -> L5c java.lang.RuntimeException -> L5e
            L59:
                r9.f59325b = r2     // Catch: java.lang.Throwable -> L8c
                goto L2
            L5c:
                r0 = move-exception
                goto L86
            L5e:
                r3 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.SequentialExecutor.e()     // Catch: java.lang.Throwable -> L5c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L5c
                java.lang.Runnable r6 = r9.f59325b     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L5c
                int r7 = r6.length()     // Catch: java.lang.Throwable -> L5c
                int r7 = r7 + 35
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5c
                r8.<init>(r7)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r7 = "Exception while executing runnable "
                r8.append(r7)     // Catch: java.lang.Throwable -> L5c
                r8.append(r6)     // Catch: java.lang.Throwable -> L5c
                java.lang.String r6 = r8.toString()     // Catch: java.lang.Throwable -> L5c
                r4.log(r5, r6, r3)     // Catch: java.lang.Throwable -> L5c
                goto L59
            L86:
                r9.f59325b = r2     // Catch: java.lang.Throwable -> L8c
                throw r0     // Catch: java.lang.Throwable -> L8c
            L89:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L89
                throw r0     // Catch: java.lang.Throwable -> L8c
            L8c:
                r0 = move-exception
                if (r1 == 0) goto L96
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L96:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.SequentialExecutor.b.a():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                a();
            } catch (Error e10) {
                synchronized (SequentialExecutor.this.f59320c) {
                    SequentialExecutor.this.f59321d = WorkerRunningState.IDLE;
                    throw e10;
                }
            }
        }

        public String toString() {
            Runnable runnable = this.f59325b;
            if (runnable != null) {
                String strValueOf = String.valueOf(runnable);
                StringBuilder sb2 = new StringBuilder(strValueOf.length() + 34);
                sb2.append("SequentialExecutorWorker{running=");
                sb2.append(strValueOf);
                sb2.append(z5.g.f141884d);
                return sb2.toString();
            }
            String strValueOf2 = String.valueOf(SequentialExecutor.this.f59321d);
            StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 32);
            sb3.append("SequentialExecutorWorker{state=");
            sb3.append(strValueOf2);
            sb3.append(z5.g.f141884d);
            return sb3.toString();
        }
    }

    SequentialExecutor(Executor executor) {
        this.f59319b = (Executor) com.google.common.base.w.E(executor);
    }

    static /* synthetic */ long d(SequentialExecutor sequentialExecutor) {
        long j10 = sequentialExecutor.f59322e;
        sequentialExecutor.f59322e = 1 + j10;
        return j10;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        WorkerRunningState workerRunningState;
        com.google.common.base.w.E(runnable);
        synchronized (this.f59320c) {
            WorkerRunningState workerRunningState2 = this.f59321d;
            if (workerRunningState2 != WorkerRunningState.RUNNING && workerRunningState2 != (workerRunningState = WorkerRunningState.QUEUED)) {
                long j10 = this.f59322e;
                a aVar = new a(this, runnable);
                this.f59320c.add(aVar);
                WorkerRunningState workerRunningState3 = WorkerRunningState.QUEUING;
                this.f59321d = workerRunningState3;
                boolean z10 = true;
                try {
                    this.f59319b.execute(this.f59323f);
                    if (this.f59321d != workerRunningState3) {
                        return;
                    }
                    synchronized (this.f59320c) {
                        if (this.f59322e == j10 && this.f59321d == workerRunningState3) {
                            this.f59321d = workerRunningState;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e10) {
                    synchronized (this.f59320c) {
                        WorkerRunningState workerRunningState4 = this.f59321d;
                        if ((workerRunningState4 != WorkerRunningState.IDLE && workerRunningState4 != WorkerRunningState.QUEUING) || !this.f59320c.removeLastOccurrence(aVar)) {
                            z10 = false;
                        }
                        if (!(e10 instanceof RejectedExecutionException) || z10) {
                            throw e10;
                        }
                    }
                    return;
                }
            }
            this.f59320c.add(runnable);
        }
    }

    public String toString() {
        int iIdentityHashCode = System.identityHashCode(this);
        String strValueOf = String.valueOf(this.f59319b);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 32);
        sb2.append("SequentialExecutor@");
        sb2.append(iIdentityHashCode);
        sb2.append("{");
        sb2.append(strValueOf);
        sb2.append(z5.g.f141884d);
        return sb2.toString();
    }
}
