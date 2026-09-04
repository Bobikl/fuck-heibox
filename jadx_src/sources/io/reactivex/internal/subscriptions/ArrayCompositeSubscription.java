package io.reactivex.internal.subscriptions;

import io.reactivex.disposables.b;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.reactivestreams.e;

/* JADX INFO: loaded from: classes5.dex */
public final class ArrayCompositeSubscription extends AtomicReferenceArray<e> implements b {
    private static final long serialVersionUID = 2746389416410565408L;

    public ArrayCompositeSubscription(int i10) {
        super(i10);
    }

    public e a(int i10, e eVar) {
        e eVar2;
        do {
            eVar2 = get(i10);
            if (eVar2 == SubscriptionHelper.CANCELLED) {
                if (eVar == null) {
                    return null;
                }
                eVar.cancel();
                return null;
            }
        } while (!compareAndSet(i10, eVar2, eVar));
        return eVar2;
    }

    public boolean b(int i10, e eVar) {
        e eVar2;
        do {
            eVar2 = get(i10);
            if (eVar2 == SubscriptionHelper.CANCELLED) {
                if (eVar == null) {
                    return false;
                }
                eVar.cancel();
                return false;
            }
        } while (!compareAndSet(i10, eVar2, eVar));
        if (eVar2 == null) {
            return true;
        }
        eVar2.cancel();
        return true;
    }

    @Override // io.reactivex.disposables.b
    public void dispose() {
        e andSet;
        if (get(0) != SubscriptionHelper.CANCELLED) {
            int length = length();
            for (int i10 = 0; i10 < length; i10++) {
                e eVar = get(i10);
                SubscriptionHelper subscriptionHelper = SubscriptionHelper.CANCELLED;
                if (eVar != subscriptionHelper && (andSet = getAndSet(i10, subscriptionHelper)) != subscriptionHelper && andSet != null) {
                    andSet.cancel();
                }
            }
        }
    }

    @Override // io.reactivex.disposables.b
    public boolean isDisposed() {
        return get(0) == SubscriptionHelper.CANCELLED;
    }
}
