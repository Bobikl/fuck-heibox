package io.reactivex.exceptions;

import io.reactivex.internal.util.ExceptionHelper;
import jh.e;

/* JADX INFO: compiled from: Exceptions.java */
/* JADX INFO: loaded from: classes4.dex */
public final class a {
    private a() {
        throw new IllegalStateException("No instances!");
    }

    @e
    public static RuntimeException a(@e Throwable th2) {
        throw ExceptionHelper.f(th2);
    }

    public static void b(@e Throwable th2) {
        if (th2 instanceof VirtualMachineError) {
            throw ((VirtualMachineError) th2);
        }
        if (th2 instanceof ThreadDeath) {
            throw ((ThreadDeath) th2);
        }
        if (th2 instanceof LinkageError) {
            throw ((LinkageError) th2);
        }
    }
}
