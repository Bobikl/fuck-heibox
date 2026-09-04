package com.google.common.util.concurrent;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public final class TimeoutFuture<V> extends y.a<V> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @CheckForNull
    private p0<V> f59370j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @CheckForNull
    private ScheduledFuture<?> f59371k;

    public static final class TimeoutFutureException extends TimeoutException {
        private TimeoutFutureException(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }
    }

    public static final class b<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @CheckForNull
        TimeoutFuture<V> f59372b;

        b(TimeoutFuture<V> timeoutFuture) {
            this.f59372b = timeoutFuture;
        }

        @Override // java.lang.Runnable
        public void run() {
            p0<? extends V> p0Var;
            TimeoutFuture<V> timeoutFuture = this.f59372b;
            if (timeoutFuture == null || (p0Var = ((TimeoutFuture) timeoutFuture).f59370j) == null) {
                return;
            }
            this.f59372b = null;
            if (p0Var.isDone()) {
                timeoutFuture.D(p0Var);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = ((TimeoutFuture) timeoutFuture).f59371k;
                ((TimeoutFuture) timeoutFuture).f59371k = null;
                String string = "Timed out";
                if (scheduledFuture != null) {
                    try {
                        long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                        if (jAbs > 10) {
                            StringBuilder sb2 = new StringBuilder("Timed out".length() + 66);
                            sb2.append("Timed out");
                            sb2.append(" (timeout delayed by ");
                            sb2.append(jAbs);
                            sb2.append(" ms after scheduled time)");
                            string = sb2.toString();
                        }
                    } catch (Throwable th2) {
                        timeoutFuture.C(new TimeoutFutureException(string));
                        throw th2;
                    }
                }
                String strValueOf = String.valueOf(string);
                String strValueOf2 = String.valueOf(p0Var);
                StringBuilder sb3 = new StringBuilder(strValueOf.length() + 2 + strValueOf2.length());
                sb3.append(strValueOf);
                sb3.append(": ");
                sb3.append(strValueOf2);
                timeoutFuture.C(new TimeoutFutureException(sb3.toString()));
                p0Var.cancel(true);
            } catch (Throwable th3) {
                p0Var.cancel(true);
                throw th3;
            }
        }
    }

    private TimeoutFuture(p0<V> p0Var) {
        this.f59370j = (p0) com.google.common.base.w.E(p0Var);
    }

    static <V> p0<V> Q(p0<V> p0Var, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        TimeoutFuture timeoutFuture = new TimeoutFuture(p0Var);
        b bVar = new b(timeoutFuture);
        timeoutFuture.f59371k = scheduledExecutorService.schedule(bVar, j10, timeUnit);
        p0Var.V(bVar, y0.c());
        return timeoutFuture;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void m() {
        x(this.f59370j);
        ScheduledFuture<?> scheduledFuture = this.f59371k;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f59370j = null;
        this.f59371k = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    @CheckForNull
    protected String y() {
        p0<V> p0Var = this.f59370j;
        ScheduledFuture<?> scheduledFuture = this.f59371k;
        if (p0Var == null) {
            return null;
        }
        String strValueOf = String.valueOf(p0Var);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 14);
        sb2.append("inputFuture=[");
        sb2.append(strValueOf);
        sb2.append("]");
        String string = sb2.toString();
        if (scheduledFuture == null) {
            return string;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return string;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 43);
        sb3.append(strValueOf2);
        sb3.append(", remaining delay=[");
        sb3.append(delay);
        sb3.append(" ms]");
        return sb3.toString();
    }
}
