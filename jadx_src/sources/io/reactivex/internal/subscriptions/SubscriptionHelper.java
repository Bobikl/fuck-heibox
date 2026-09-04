package io.reactivex.internal.subscriptions;

import androidx.compose.animation.core.s0;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.util.b;
import io.reactivex.plugins.a;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes5.dex */
public enum SubscriptionHelper implements e {
    CANCELLED;

    public static boolean cancel(AtomicReference<e> atomicReference) {
        e andSet;
        e eVar = atomicReference.get();
        SubscriptionHelper subscriptionHelper = CANCELLED;
        if (eVar == subscriptionHelper || (andSet = atomicReference.getAndSet(subscriptionHelper)) == subscriptionHelper) {
            return false;
        }
        if (andSet == null) {
            return true;
        }
        andSet.cancel();
        return true;
    }

    public static void deferredRequest(AtomicReference<e> atomicReference, AtomicLong atomicLong, long j10) {
        e eVar = atomicReference.get();
        if (eVar != null) {
            eVar.request(j10);
            return;
        }
        if (validate(j10)) {
            b.a(atomicLong, j10);
            e eVar2 = atomicReference.get();
            if (eVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    eVar2.request(andSet);
                }
            }
        }
    }

    public static boolean deferredSetOnce(AtomicReference<e> atomicReference, AtomicLong atomicLong, e eVar) {
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

    public static boolean replace(AtomicReference<e> atomicReference, e eVar) {
        e eVar2;
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

    public static void reportMoreProduced(long j10) {
        a.Y(new ProtocolViolationException("More produced than requested: " + j10));
    }

    public static void reportSubscriptionSet() {
        a.Y(new ProtocolViolationException("Subscription already set!"));
    }

    public static boolean set(AtomicReference<e> atomicReference, e eVar) {
        e eVar2;
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

    public static boolean setOnce(AtomicReference<e> atomicReference, e eVar) {
        io.reactivex.internal.functions.a.g(eVar, "s is null");
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

    public static boolean setOnce(AtomicReference<e> atomicReference, e eVar, long j10) {
        if (!setOnce(atomicReference, eVar)) {
            return false;
        }
        eVar.request(j10);
        return true;
    }

    public static boolean validate(long j10) {
        if (j10 > 0) {
            return true;
        }
        a.Y(new IllegalArgumentException("n > 0 required but it was " + j10));
        return false;
    }

    public static boolean validate(e eVar, e eVar2) {
        if (eVar2 == null) {
            a.Y(new NullPointerException("next is null"));
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
