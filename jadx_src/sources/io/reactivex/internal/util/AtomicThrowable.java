package io.reactivex.internal.util;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes5.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    public boolean a(Throwable th2) {
        return ExceptionHelper.a(this, th2);
    }

    public boolean b() {
        return get() == ExceptionHelper.f123860a;
    }

    public Throwable c() {
        return ExceptionHelper.c(this);
    }
}
