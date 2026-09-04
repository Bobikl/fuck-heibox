package com.uber.autodispose;

import androidx.compose.animation.core.s0;
import io.reactivex.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class ExceptionHelper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Throwable f104056a = new Termination();

    public static final class Termination extends Throwable {
        Termination() {
            super("No further exceptions");
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    private ExceptionHelper() {
        throw new IllegalStateException("No instances!");
    }

    static boolean a(AtomicReference<Throwable> atomicReference, Throwable th2) {
        Throwable th3;
        do {
            th3 = atomicReference.get();
            if (th3 == f104056a) {
                return false;
            }
        } while (!s0.a(atomicReference, th3, th3 == null ? th2 : new CompositeException(th3, th2)));
        return true;
    }

    @jh.f
    static Throwable b(AtomicReference<Throwable> atomicReference) {
        Throwable th2 = atomicReference.get();
        Throwable th3 = f104056a;
        return th2 != th3 ? atomicReference.getAndSet(th3) : th2;
    }
}
