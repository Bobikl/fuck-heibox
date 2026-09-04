package io.reactivex.internal.util;

import io.reactivex.exceptions.MissingBackpressureException;
import io.reactivex.g0;
import io.reactivex.internal.queue.SpscArrayQueue;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: QueueDrainHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final long f123883a = Long.MIN_VALUE;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final long f123884b = Long.MAX_VALUE;

    private n() {
        throw new IllegalStateException("No instances!");
    }

    public static <T, U> boolean a(boolean z10, boolean z11, g0<?> g0Var, boolean z12, lh.o<?> oVar, io.reactivex.disposables.b bVar, j<T, U> jVar) {
        if (jVar.d()) {
            oVar.clear();
            bVar.dispose();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            if (bVar != null) {
                bVar.dispose();
            }
            Throwable thH = jVar.h();
            if (thH != null) {
                g0Var.onError(thH);
            } else {
                g0Var.onComplete();
            }
            return true;
        }
        Throwable thH2 = jVar.h();
        if (thH2 != null) {
            oVar.clear();
            if (bVar != null) {
                bVar.dispose();
            }
            g0Var.onError(thH2);
            return true;
        }
        if (!z11) {
            return false;
        }
        if (bVar != null) {
            bVar.dispose();
        }
        g0Var.onComplete();
        return true;
    }

    public static <T, U> boolean b(boolean z10, boolean z11, org.reactivestreams.d<?> dVar, boolean z12, lh.o<?> oVar, m<T, U> mVar) {
        if (mVar.d()) {
            oVar.clear();
            return true;
        }
        if (!z10) {
            return false;
        }
        if (z12) {
            if (!z11) {
                return false;
            }
            Throwable thH = mVar.h();
            if (thH != null) {
                dVar.onError(thH);
            } else {
                dVar.onComplete();
            }
            return true;
        }
        Throwable thH2 = mVar.h();
        if (thH2 != null) {
            oVar.clear();
            dVar.onError(thH2);
            return true;
        }
        if (!z11) {
            return false;
        }
        dVar.onComplete();
        return true;
    }

    public static <T> lh.o<T> c(int i10) {
        return i10 < 0 ? new io.reactivex.internal.queue.a(-i10) : new SpscArrayQueue(i10);
    }

    public static <T, U> void d(lh.n<T> nVar, g0<? super U> g0Var, boolean z10, io.reactivex.disposables.b bVar, j<T, U> jVar) {
        int iA = 1;
        while (!a(jVar.c(), nVar.isEmpty(), g0Var, z10, nVar, bVar, jVar)) {
            while (true) {
                boolean zC = jVar.c();
                T tPoll = nVar.poll();
                boolean z11 = tPoll == null;
                if (a(zC, z11, g0Var, z10, nVar, bVar, jVar)) {
                    return;
                }
                if (z11) {
                    break;
                } else {
                    jVar.f(g0Var, tPoll);
                }
            }
            iA = jVar.a(-iA);
            if (iA == 0) {
                return;
            }
        }
    }

    public static <T, U> void e(lh.n<T> nVar, org.reactivestreams.d<? super U> dVar, boolean z10, io.reactivex.disposables.b bVar, m<T, U> mVar) {
        int iA = 1;
        while (true) {
            boolean zC = mVar.c();
            T tPoll = nVar.poll();
            boolean z11 = tPoll == null;
            if (b(zC, z11, dVar, z10, nVar, mVar)) {
                if (bVar != null) {
                    bVar.dispose();
                    return;
                }
                return;
            } else if (z11) {
                iA = mVar.a(-iA);
                if (iA == 0) {
                    return;
                }
            } else {
                long jF = mVar.f();
                if (jF == 0) {
                    nVar.clear();
                    if (bVar != null) {
                        bVar.dispose();
                    }
                    dVar.onError(new MissingBackpressureException("Could not emit value due to lack of requests."));
                    return;
                }
                if (mVar.j(dVar, tPoll) && jF != Long.MAX_VALUE) {
                    mVar.g(1L);
                }
            }
        }
    }

    static boolean f(kh.e eVar) {
        try {
            return eVar.a();
        } catch (Throwable th2) {
            io.reactivex.exceptions.a.b(th2);
            return true;
        }
    }

    public static <T> void g(org.reactivestreams.d<? super T> dVar, Queue<T> queue, AtomicLong atomicLong, kh.e eVar) {
        long j10;
        long j11;
        if (queue.isEmpty()) {
            dVar.onComplete();
            return;
        }
        if (h(atomicLong.get(), dVar, queue, atomicLong, eVar)) {
            return;
        }
        do {
            j10 = atomicLong.get();
            if ((j10 & Long.MIN_VALUE) != 0) {
                return;
            } else {
                j11 = j10 | Long.MIN_VALUE;
            }
        } while (!atomicLong.compareAndSet(j10, j11));
        if (j10 != 0) {
            h(j11, dVar, queue, atomicLong, eVar);
        }
    }

    static <T> boolean h(long j10, org.reactivestreams.d<? super T> dVar, Queue<T> queue, AtomicLong atomicLong, kh.e eVar) {
        long j11 = j10 & Long.MIN_VALUE;
        while (true) {
            if (j11 != j10) {
                if (f(eVar)) {
                    return true;
                }
                T tPoll = queue.poll();
                if (tPoll == null) {
                    dVar.onComplete();
                    return true;
                }
                dVar.onNext(tPoll);
                j11++;
            } else {
                if (f(eVar)) {
                    return true;
                }
                if (queue.isEmpty()) {
                    dVar.onComplete();
                    return true;
                }
                j10 = atomicLong.get();
                if (j10 == j11) {
                    long jAddAndGet = atomicLong.addAndGet(-(j11 & Long.MAX_VALUE));
                    if ((Long.MAX_VALUE & jAddAndGet) == 0) {
                        return false;
                    }
                    j10 = jAddAndGet;
                    j11 = jAddAndGet & Long.MIN_VALUE;
                } else {
                    continue;
                }
            }
        }
    }

    public static <T> boolean i(long j10, org.reactivestreams.d<? super T> dVar, Queue<T> queue, AtomicLong atomicLong, kh.e eVar) {
        long j11;
        do {
            j11 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j11, b.c(Long.MAX_VALUE & j11, j10) | (j11 & Long.MIN_VALUE)));
        if (j11 != Long.MIN_VALUE) {
            return false;
        }
        h(j10 | Long.MIN_VALUE, dVar, queue, atomicLong, eVar);
        return true;
    }

    public static void j(org.reactivestreams.e eVar, int i10) {
        eVar.request(i10 < 0 ? Long.MAX_VALUE : i10);
    }
}
