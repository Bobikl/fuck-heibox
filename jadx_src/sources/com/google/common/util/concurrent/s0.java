package com.google.common.util.concurrent;

import com.google.common.collect.a2;
import com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: ListenerCallQueue.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public final class s0<L> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Logger f59529b = Logger.getLogger(s0.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b<L>> f59530a = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: compiled from: ListenerCallQueue.java */
    public interface a<L> {
        void a(L l10);
    }

    /* JADX INFO: compiled from: ListenerCallQueue.java */
    public static final class b<L> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final L f59531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Executor f59532c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @t9.a("this")
        final Queue<a<L>> f59533d = a2.d();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @t9.a("this")
        final Queue<Object> f59534e = a2.d();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @t9.a("this")
        boolean f59535f;

        b(L l10, Executor executor) {
            this.f59531b = (L) com.google.common.base.w.E(l10);
            this.f59532c = (Executor) com.google.common.base.w.E(executor);
        }

        synchronized void a(a<L> aVar, Object obj) {
            this.f59533d.add(aVar);
            this.f59534e.add(obj);
        }

        void b() {
            boolean z10;
            synchronized (this) {
                z10 = true;
                if (this.f59535f) {
                    z10 = false;
                } else {
                    this.f59535f = true;
                }
            }
            if (z10) {
                try {
                    this.f59532c.execute(this);
                } catch (RuntimeException e10) {
                    synchronized (this) {
                        this.f59535f = false;
                        Logger logger = s0.f59529b;
                        Level level = Level.SEVERE;
                        String strValueOf = String.valueOf(this.f59531b);
                        String strValueOf2 = String.valueOf(this.f59532c);
                        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 42 + strValueOf2.length());
                        sb2.append("Exception while running callbacks for ");
                        sb2.append(strValueOf);
                        sb2.append(" on ");
                        sb2.append(strValueOf2);
                        logger.log(level, sb2.toString(), (Throwable) e10);
                        throw e10;
                    }
                }
            }
        }

        /* JADX WARN: Bottom block not found for handler: all -> 0x006a */
        /* JADX WARN: Code duplicated, block: B:27:0x006f  */
        /* JADX WARN: Code duplicated, block: B:37:0x0070 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        
            r2.a(r10.f59531b);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            r4 = com.google.common.util.concurrent.s0.f59529b;
            r5 = java.util.logging.Level.SEVERE;
            r6 = java.lang.String.valueOf(r10.f59531b);
            r3 = java.lang.String.valueOf(r3);
            r8 = new java.lang.StringBuilder((r6.length() + 37) + r3.length());
            r8.append("Exception while executing callback: ");
            r8.append(r6);
            r8.append(" ");
            r8.append(r3);
            r4.log(r5, r8.toString(), (java.lang.Throwable) r2);
         */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                r10 = this;
            L0:
                r0 = 0
                r1 = 1
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L6c
                boolean r2 = r10.f59535f     // Catch: java.lang.Throwable -> L5f
                com.google.common.base.w.g0(r2)     // Catch: java.lang.Throwable -> L5f
                java.util.Queue<com.google.common.util.concurrent.s0$a<L>> r2 = r10.f59533d     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L5f
                com.google.common.util.concurrent.s0$a r2 = (com.google.common.util.concurrent.s0.a) r2     // Catch: java.lang.Throwable -> L5f
                java.util.Queue<java.lang.Object> r3 = r10.f59534e     // Catch: java.lang.Throwable -> L5f
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L5f
                if (r2 != 0) goto L1f
                r10.f59535f = r0     // Catch: java.lang.Throwable -> L5f
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r1 = move-exception
                r2 = r0
                goto L63
            L1f:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L5f
                L r4 = r10.f59531b     // Catch: java.lang.RuntimeException -> L26 java.lang.Throwable -> L6c
                r2.a(r4)     // Catch: java.lang.RuntimeException -> L26 java.lang.Throwable -> L6c
                goto L0
            L26:
                r2 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.s0.a()     // Catch: java.lang.Throwable -> L6c
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L6c
                L r6 = r10.f59531b     // Catch: java.lang.Throwable -> L6c
                java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch: java.lang.Throwable -> L6c
                java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch: java.lang.Throwable -> L6c
                int r7 = r6.length()     // Catch: java.lang.Throwable -> L6c
                int r7 = r7 + 37
                int r8 = r3.length()     // Catch: java.lang.Throwable -> L6c
                int r7 = r7 + r8
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
                r8.<init>(r7)     // Catch: java.lang.Throwable -> L6c
                java.lang.String r7 = "Exception while executing callback: "
                r8.append(r7)     // Catch: java.lang.Throwable -> L6c
                r8.append(r6)     // Catch: java.lang.Throwable -> L6c
                java.lang.String r6 = " "
                r8.append(r6)     // Catch: java.lang.Throwable -> L6c
                r8.append(r3)     // Catch: java.lang.Throwable -> L6c
                java.lang.String r3 = r8.toString()     // Catch: java.lang.Throwable -> L6c
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L6c
                goto L0
            L5f:
                r2 = move-exception
                r9 = r2
                r2 = r1
                r1 = r9
            L63:
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L6a
                throw r1     // Catch: java.lang.Throwable -> L65
            L65:
                r1 = move-exception
                r9 = r2
                r2 = r1
                r1 = r9
                goto L6d
            L6a:
                r1 = move-exception
                goto L63
            L6c:
                r2 = move-exception
            L6d:
                if (r1 == 0) goto L77
                monitor-enter(r10)
                r10.f59535f = r0     // Catch: java.lang.Throwable -> L74
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L74
                goto L77
            L74:
                r0 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L74
                throw r0
            L77:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.s0.b.run():void");
        }
    }

    s0() {
    }

    private void f(a<L> aVar, Object obj) {
        com.google.common.base.w.F(aVar, androidx.core.app.o0.I0);
        com.google.common.base.w.F(obj, BasePuzzleInfo.PUZZLE_TYPE_LABEL);
        synchronized (this.f59530a) {
            Iterator<b<L>> it = this.f59530a.iterator();
            while (it.hasNext()) {
                it.next().a(aVar, obj);
            }
        }
    }

    public void b(L l10, Executor executor) {
        com.google.common.base.w.F(l10, com.google.android.gms.common.internal.s.a.f52543a);
        com.google.common.base.w.F(executor, "executor");
        this.f59530a.add(new b<>(l10, executor));
    }

    public void c() {
        for (int i10 = 0; i10 < this.f59530a.size(); i10++) {
            this.f59530a.get(i10).b();
        }
    }

    public void d(a<L> aVar) {
        f(aVar, aVar);
    }

    public void e(a<L> aVar, String str) {
        f(aVar, str);
    }
}
