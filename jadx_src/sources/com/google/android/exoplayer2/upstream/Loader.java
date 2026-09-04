package com.google.android.exoplayer2.upstream;

import android.annotation.SuppressLint;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes7.dex */
public final class Loader implements h0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f50878d = "ExoPlayer:Loader:";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f50879e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f50880f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f50881g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f50882h = 3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final c f50883i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final c f50884j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final c f50885k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final c f50886l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ExecutorService f50887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.p0
    private d<? extends e> f50888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.p0
    private IOException f50889c;

    public static final class UnexpectedLoaderException extends IOException {
        public UnexpectedLoaderException(Throwable th2) {
            String simpleName = th2.getClass().getSimpleName();
            String message = th2.getMessage();
            StringBuilder sb2 = new StringBuilder(simpleName.length() + 13 + String.valueOf(message).length());
            sb2.append("Unexpected ");
            sb2.append(simpleName);
            sb2.append(": ");
            sb2.append(message);
            super(sb2.toString(), th2);
        }
    }

    public interface b<T extends e> {
        void p(T t10, long j10, long j11, boolean z10);

        void q(T t10, long j10, long j11);

        c s(T t10, long j10, long j11, IOException iOException, int i10);
    }

    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f50890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f50891b;

        private c(int i10, long j10) {
            this.f50890a = i10;
            this.f50891b = j10;
        }

        public boolean c() {
            int i10 = this.f50890a;
            return i10 == 0 || i10 == 1;
        }
    }

    @SuppressLint({"HandlerLeak"})
    public final class d<T extends e> extends Handler implements Runnable {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final String f50892l = "LoadTask";

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final int f50893m = 0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final int f50894n = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final int f50895o = 2;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private static final int f50896p = 3;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f50897b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final T f50898c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f50899d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @androidx.annotation.p0
        private b<T> f50900e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @androidx.annotation.p0
        private IOException f50901f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f50902g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @androidx.annotation.p0
        private Thread f50903h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f50904i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private volatile boolean f50905j;

        public d(Looper looper, T t10, b<T> bVar, int i10, long j10) {
            super(looper);
            this.f50898c = t10;
            this.f50900e = bVar;
            this.f50897b = i10;
            this.f50899d = j10;
        }

        private void b() {
            this.f50901f = null;
            Loader.this.f50887a.execute((Runnable) com.google.android.exoplayer2.util.a.g(Loader.this.f50888b));
        }

        private void c() {
            Loader.this.f50888b = null;
        }

        private long d() {
            return Math.min((this.f50902g - 1) * 1000, 5000);
        }

        public void a(boolean z10) {
            this.f50905j = z10;
            this.f50901f = null;
            if (hasMessages(0)) {
                this.f50904i = true;
                removeMessages(0);
                if (!z10) {
                    sendEmptyMessage(1);
                }
            } else {
                synchronized (this) {
                    this.f50904i = true;
                    this.f50898c.c();
                    Thread thread = this.f50903h;
                    if (thread != null) {
                        thread.interrupt();
                    }
                }
            }
            if (z10) {
                c();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                ((b) com.google.android.exoplayer2.util.a.g(this.f50900e)).p(this.f50898c, jElapsedRealtime, jElapsedRealtime - this.f50899d, true);
                this.f50900e = null;
            }
        }

        public void e(int i10) throws IOException {
            IOException iOException = this.f50901f;
            if (iOException != null && this.f50902g > i10) {
                throw iOException;
            }
        }

        public void f(long j10) {
            com.google.android.exoplayer2.util.a.i(Loader.this.f50888b == null);
            Loader.this.f50888b = this;
            if (j10 > 0) {
                sendEmptyMessageDelayed(0, j10);
            } else {
                b();
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (this.f50905j) {
                return;
            }
            int i10 = message.what;
            if (i10 == 0) {
                b();
                return;
            }
            if (i10 == 3) {
                throw ((Error) message.obj);
            }
            c();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j10 = jElapsedRealtime - this.f50899d;
            b bVar = (b) com.google.android.exoplayer2.util.a.g(this.f50900e);
            if (this.f50904i) {
                bVar.p(this.f50898c, jElapsedRealtime, j10, false);
                return;
            }
            int i11 = message.what;
            if (i11 == 1) {
                try {
                    bVar.q(this.f50898c, jElapsedRealtime, j10);
                    return;
                } catch (RuntimeException e10) {
                    com.google.android.exoplayer2.util.u.e(f50892l, "Unexpected exception handling load completed", e10);
                    Loader.this.f50889c = new UnexpectedLoaderException(e10);
                    return;
                }
            }
            if (i11 != 2) {
                return;
            }
            IOException iOException = (IOException) message.obj;
            this.f50901f = iOException;
            int i12 = this.f50902g + 1;
            this.f50902g = i12;
            c cVarS = bVar.s(this.f50898c, jElapsedRealtime, j10, iOException, i12);
            if (cVarS.f50890a == 3) {
                Loader.this.f50889c = this.f50901f;
            } else if (cVarS.f50890a != 2) {
                if (cVarS.f50890a == 1) {
                    this.f50902g = 1;
                }
                f(cVarS.f50891b != com.google.android.exoplayer2.j.f46377b ? cVarS.f50891b : d());
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z10;
            try {
                synchronized (this) {
                    z10 = !this.f50904i;
                    this.f50903h = Thread.currentThread();
                }
                if (z10) {
                    String simpleName = this.f50898c.getClass().getSimpleName();
                    com.google.android.exoplayer2.util.o0.a(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                    try {
                        this.f50898c.a();
                        com.google.android.exoplayer2.util.o0.c();
                    } catch (Throwable th2) {
                        com.google.android.exoplayer2.util.o0.c();
                        throw th2;
                    }
                }
                synchronized (this) {
                    this.f50903h = null;
                    Thread.interrupted();
                }
                if (this.f50905j) {
                    return;
                }
                sendEmptyMessage(1);
            } catch (IOException e10) {
                if (this.f50905j) {
                    return;
                }
                obtainMessage(2, e10).sendToTarget();
            } catch (Error e11) {
                if (!this.f50905j) {
                    com.google.android.exoplayer2.util.u.e(f50892l, "Unexpected error loading stream", e11);
                    obtainMessage(3, e11).sendToTarget();
                }
                throw e11;
            } catch (Exception e12) {
                if (this.f50905j) {
                    return;
                }
                com.google.android.exoplayer2.util.u.e(f50892l, "Unexpected exception loading stream", e12);
                obtainMessage(2, new UnexpectedLoaderException(e12)).sendToTarget();
            } catch (OutOfMemoryError e13) {
                if (this.f50905j) {
                    return;
                }
                com.google.android.exoplayer2.util.u.e(f50892l, "OutOfMemory error loading stream", e13);
                obtainMessage(2, new UnexpectedLoaderException(e13)).sendToTarget();
            }
        }
    }

    public interface e {
        void a() throws IOException;

        void c();
    }

    public interface f {
        void m();
    }

    public static final class g implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final f f50907b;

        public g(f fVar) {
            this.f50907b = fVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f50907b.m();
        }
    }

    static {
        long j10 = com.google.android.exoplayer2.j.f46377b;
        f50883i = i(false, com.google.android.exoplayer2.j.f46377b);
        f50884j = i(true, com.google.android.exoplayer2.j.f46377b);
        f50885k = new c(2, j10);
        f50886l = new c(3, j10);
    }

    public Loader(String str) {
        String strValueOf = String.valueOf(str);
        this.f50887a = com.google.android.exoplayer2.util.u0.V0(strValueOf.length() != 0 ? f50878d.concat(strValueOf) : new String(f50878d));
    }

    public static c i(boolean z10, long j10) {
        return new c(z10 ? 1 : 0, j10);
    }

    @Override // com.google.android.exoplayer2.upstream.h0
    public void a(int i10) throws IOException {
        IOException iOException = this.f50889c;
        if (iOException != null) {
            throw iOException;
        }
        d<? extends e> dVar = this.f50888b;
        if (dVar != null) {
            if (i10 == Integer.MIN_VALUE) {
                i10 = dVar.f50897b;
            }
            dVar.e(i10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.h0
    public void b() throws IOException {
        a(Integer.MIN_VALUE);
    }

    public void g() {
        ((d) com.google.android.exoplayer2.util.a.k(this.f50888b)).a(false);
    }

    public void h() {
        this.f50889c = null;
    }

    public boolean j() {
        return this.f50889c != null;
    }

    public boolean k() {
        return this.f50888b != null;
    }

    public void l() {
        m(null);
    }

    public void m(@androidx.annotation.p0 f fVar) {
        d<? extends e> dVar = this.f50888b;
        if (dVar != null) {
            dVar.a(true);
        }
        if (fVar != null) {
            this.f50887a.execute(new g(fVar));
        }
        this.f50887a.shutdown();
    }

    public <T extends e> long n(T t10, b<T> bVar, int i10) {
        Looper looper = (Looper) com.google.android.exoplayer2.util.a.k(Looper.myLooper());
        this.f50889c = null;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        new d(looper, t10, bVar, i10, jElapsedRealtime).f(0L);
        return jElapsedRealtime;
    }
}
