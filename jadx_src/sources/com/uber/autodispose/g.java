package com.uber.autodispose;

import androidx.compose.animation.core.s0;
import io.reactivex.exceptions.ProtocolViolationException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: AutoDisposeEndConsumerHelper.java */
/* JADX INFO: loaded from: classes4.dex */
public final class g {
    private g() {
        throw new IllegalStateException("No instances!");
    }

    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        io.reactivex.plugins.a.Y(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference<io.reactivex.disposables.b> atomicReference, io.reactivex.disposables.b bVar, Class<?> cls) {
        n.a(bVar, "next is null");
        if (s0.a(atomicReference, null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == AutoDisposableHelper.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean d(AtomicReference<org.reactivestreams.e> atomicReference, org.reactivestreams.e eVar, Class<?> cls) {
        n.a(eVar, "next is null");
        if (s0.a(atomicReference, null, eVar)) {
            return true;
        }
        eVar.cancel();
        if (atomicReference.get() == AutoSubscriptionHelper.CANCELLED) {
            return false;
        }
        b(cls);
        return false;
    }
}
