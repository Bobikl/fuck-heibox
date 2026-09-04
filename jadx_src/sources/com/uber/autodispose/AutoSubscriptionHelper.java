package com.uber.autodispose;

import androidx.compose.animation.core.s0;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public enum AutoSubscriptionHelper implements org.reactivestreams.e {
    CANCELLED;

    static boolean cancel(AtomicReference<org.reactivestreams.e> atomicReference) {
        org.reactivestreams.e andSet;
        org.reactivestreams.e eVar = atomicReference.get();
        AutoSubscriptionHelper autoSubscriptionHelper = CANCELLED;
        if (eVar == autoSubscriptionHelper || (andSet = atomicReference.getAndSet(autoSubscriptionHelper)) == autoSubscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    static void deferredRequest(AtomicReference<org.reactivestreams.e> atomicReference, AtomicLong atomicLong, long j10) {
        org.reactivestreams.e eVar = atomicReference.get();
        if (eVar != null) {
            eVar.request(j10);
            return;
        }
        if (validate(j10)) {
            d.a(atomicLong, j10);
            org.reactivestreams.e eVar2 = atomicReference.get();
            if (eVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    eVar2.request(andSet);
                }
            }
        }
    }

    static boolean deferredSetOnce(AtomicReference<org.reactivestreams.e> atomicReference, AtomicLong atomicLong, org.reactivestreams.e eVar) {
        if (!setOnce(atomicReference, eVar)) {
            return false;
        }
        long andSet = atomicLong.getAndSet(0L);
        if (andSet == 0) {
            return true;
        }
        eVar.request(andSet);
        return true;
    }

    static boolean isCancelled(org.reactivestreams.e eVar) {
        return eVar == CANCELLED;
    }

    static boolean replace(AtomicReference<org.reactivestreams.e> atomicReference, @jh.f org.reactivestreams.e eVar) {
        org.reactivestreams.e eVar2;
        do {
            eVar2 = atomicReference.get();
            if (eVar2 == CANCELLED) {
                if (eVar == null) {
                    return false;
                }
                eVar.cancel();
                return false;
            }
        } while (!s0.a(atomicReference, eVar2, eVar));
        return true;
    }

    static void reportMoreProduced(long j10) {
        io.reactivex.plugins.a.Y(new IllegalStateException("More produced than requested: " + j10));
    }

    static void reportSubscriptionSet() {
        io.reactivex.plugins.a.Y(new IllegalStateException("Subscription already set!"));
    }

    static boolean set(AtomicReference<org.reactivestreams.e> atomicReference, @jh.f org.reactivestreams.e eVar) {
        org.reactivestreams.e eVar2;
        do {
            eVar2 = atomicReference.get();
            if (eVar2 == CANCELLED) {
                if (eVar == null) {
                    return false;
                }
                eVar.cancel();
                return false;
            }
        } while (!s0.a(atomicReference, eVar2, eVar));
        if (eVar2 == null) {
            return true;
        }
        eVar2.cancel();
        return true;
    }

    static boolean setIfNotSet(AtomicReference<org.reactivestreams.e> atomicReference, org.reactivestreams.e eVar) {
        n.a(eVar, "s is null");
        return s0.a(atomicReference, null, eVar);
    }

    static boolean setOnce(AtomicReference<org.reactivestreams.e> atomicReference, org.reactivestreams.e eVar) {
        n.a(eVar, "s is null");
        if (s0.a(atomicReference, null, eVar)) {
            return true;
        }
        eVar.cancel();
        if (atomicReference.get() == CANCELLED) {
            return false;
        }
        reportSubscriptionSet();
        return false;
    }

    static boolean validate(long j10) {
        if (j10 > 0) {
            return true;
        }
        io.reactivex.plugins.a.Y(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    static boolean validate(@jh.f org.reactivestreams.e eVar, org.reactivestreams.e eVar2) {
        if (eVar2 == null) {
            io.reactivex.plugins.a.Y(new NullPointerException("next is null"));
            return false;
        }
        if (eVar == null) {
            return true;
        }
        eVar2.cancel();
        reportSubscriptionSet();
        return false;
    }

    @Override // org.reactivestreams.e
    public void cancel() {
    }

    @Override // org.reactivestreams.e
    public void request(long j10) {
    }
}
