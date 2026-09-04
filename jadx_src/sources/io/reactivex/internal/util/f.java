package io.reactivex.internal.util;

import androidx.compose.animation.core.s0;
import io.reactivex.exceptions.ProtocolViolationException;
import io.reactivex.internal.disposables.DisposableHelper;
import io.reactivex.internal.subscriptions.SubscriptionHelper;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: EndConsumerHelper.java */
/* JADX INFO: loaded from: classes5.dex */
public final class f {
    private f() {
        throw new IllegalStateException("No instances!");
    }

    public static String a(String str) {
        return "It is not allowed to subscribe with a(n) " + str + " multiple times. Please create a fresh instance of " + str + " and subscribe that to the target source instead.";
    }

    public static void b(Class<?> cls) {
        io.reactivex.plugins.a.Y(new ProtocolViolationException(a(cls.getName())));
    }

    public static boolean c(AtomicReference<io.reactivex.disposables.b> atomicReference, io.reactivex.disposables.b bVar, Class<?> cls) {
        io.reactivex.internal.functions.a.g(bVar, "next is null");
        if (s0.a(atomicReference, null, bVar)) {
            return true;
        }
        bVar.dispose();
        if (atomicReference.get() == DisposableHelper.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean d(AtomicReference<org.reactivestreams.e> atomicReference, org.reactivestreams.e eVar, Class<?> cls) {
        io.reactivex.internal.functions.a.g(eVar, "next is null");
        if (s0.a(atomicReference, null, eVar)) {
            return true;
        }
        eVar.cancel();
        if (atomicReference.get() == SubscriptionHelper.CANCELLED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean e(io.reactivex.disposables.b bVar, io.reactivex.disposables.b bVar2, Class<?> cls) {
        io.reactivex.internal.functions.a.g(bVar2, "next is null");
        if (bVar == null) {
            return true;
        }
        bVar2.dispose();
        if (bVar == DisposableHelper.DISPOSED) {
            return false;
        }
        b(cls);
        return false;
    }

    public static boolean f(org.reactivestreams.e eVar, org.reactivestreams.e eVar2, Class<?> cls) {
        io.reactivex.internal.functions.a.g(eVar2, "next is null");
        if (eVar == null) {
            return true;
        }
        eVar2.cancel();
        if (eVar == SubscriptionHelper.CANCELLED) {
            return false;
        }
        b(cls);
        return false;
    }
}
