package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.CheckForNull;

/* JADX INFO: compiled from: ExecutionList.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public final class v {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Logger f59551c = Logger.getLogger(v.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @CheckForNull
    @t9.a("this")
    private a f59552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @t9.a("this")
    private boolean f59553b;

    /* JADX INFO: compiled from: ExecutionList.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Runnable f59554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Executor f59555b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @CheckForNull
        a f59556c;

        a(Runnable runnable, Executor executor, @CheckForNull a aVar) {
            this.f59554a = runnable;
            this.f59555b = executor;
            this.f59556c = aVar;
        }
    }

    private static void c(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f59551c;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(strValueOf);
            sb2.append(" with executor ");
            sb2.append(strValueOf2);
            logger.log(level, sb2.toString(), (Throwable) e10);
        }
    }

    public void a(Runnable runnable, Executor executor) {
        com.google.common.base.w.F(runnable, "Runnable was null.");
        com.google.common.base.w.F(executor, "Executor was null.");
        synchronized (this) {
            if (this.f59553b) {
                c(runnable, executor);
            } else {
                this.f59552a = new a(runnable, executor, this.f59552a);
            }
        }
    }

    public void b() {
        synchronized (this) {
            if (this.f59553b) {
                return;
            }
            this.f59553b = true;
            a aVar = this.f59552a;
            a aVar2 = null;
            this.f59552a = null;
            while (aVar != null) {
                a aVar3 = aVar.f59556c;
                aVar.f59556c = aVar2;
                aVar2 = aVar;
                aVar = aVar3;
            }
            while (aVar2 != null) {
                c(aVar2.f59554a, aVar2.f59555b);
                aVar2 = aVar2.f59556c;
            }
        }
    }
}
