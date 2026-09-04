package io.reactivex.internal.schedulers;

import io.reactivex.h0;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: ImmediateThinScheduler.java */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends h0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final h0 f123682c = new c();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final h0.c f123683d = new a();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    static final io.reactivex.disposables.b f123684e;

    /* JADX INFO: compiled from: ImmediateThinScheduler.java */
    public static final class a extends h0.c {
        a() {
        }

        @Override // io.reactivex.h0.c
        @jh.e
        public io.reactivex.disposables.b b(@jh.e Runnable runnable) {
            runnable.run();
            return c.f123684e;
        }

        @Override // io.reactivex.h0.c
        @jh.e
        public io.reactivex.disposables.b c(@jh.e Runnable runnable, long j10, @jh.e TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
        }

        @Override // io.reactivex.h0.c
        @jh.e
        public io.reactivex.disposables.b d(@jh.e Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
            throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
        }

        @Override // io.reactivex.disposables.b
        public void dispose() {
        }

        @Override // io.reactivex.disposables.b
        public boolean isDisposed() {
            return false;
        }
    }

    static {
        io.reactivex.disposables.b bVarB = io.reactivex.disposables.c.b();
        f123684e = bVarB;
        bVarB.dispose();
    }

    private c() {
    }

    @Override // io.reactivex.h0
    @jh.e
    public h0.c c() {
        return f123683d;
    }

    @Override // io.reactivex.h0
    @jh.e
    public io.reactivex.disposables.b f(@jh.e Runnable runnable) {
        runnable.run();
        return f123684e;
    }

    @Override // io.reactivex.h0
    @jh.e
    public io.reactivex.disposables.b g(@jh.e Runnable runnable, long j10, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support delayed execution");
    }

    @Override // io.reactivex.h0
    @jh.e
    public io.reactivex.disposables.b h(@jh.e Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        throw new UnsupportedOperationException("This scheduler doesn't support periodic execution");
    }
}
