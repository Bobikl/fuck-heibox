package com.google.common.util.concurrent;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: ImmediateFuture.java */
/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b
public class m0<V> implements p0<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final p0<?> f59509c = new m0(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Logger f59510d = Logger.getLogger(m0.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @b1
    private final V f59511b;

    /* JADX INFO: compiled from: ImmediateFuture.java */
    public static final class a<V> extends AbstractFuture.i<V> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final a<Object> f59512j;

        static {
            f59512j = AbstractFuture.f59162e ? null : new a<>();
        }

        a() {
            cancel(false);
        }
    }

    /* JADX INFO: compiled from: ImmediateFuture.java */
    public static final class b<V> extends AbstractFuture.i<V> {
        b(Throwable th2) {
            C(th2);
        }
    }

    m0(@b1 V v10) {
        this.f59511b = v10;
    }

    @Override // com.google.common.util.concurrent.p0
    public void V(Runnable runnable, Executor executor) {
        com.google.common.base.w.F(runnable, "Runnable was null.");
        com.google.common.base.w.F(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e10) {
            Logger logger = f59510d;
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

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @b1
    public V get() {
        return this.f59511b;
    }

    @Override // java.util.concurrent.Future
    @b1
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException {
        com.google.common.base.w.E(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f59511b);
        StringBuilder sb2 = new StringBuilder(String.valueOf(string).length() + 27 + strValueOf.length());
        sb2.append(string);
        sb2.append("[status=SUCCESS, result=[");
        sb2.append(strValueOf);
        sb2.append("]]");
        return sb2.toString();
    }
}
