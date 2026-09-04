package com.uber.autodispose;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes4.dex */
public final class AtomicThrowable extends AtomicReference<Throwable> {
    private static final long serialVersionUID = 3949248817947090603L;

    AtomicThrowable() {
    }

    public boolean a(Throwable th2) {
        return ExceptionHelper.a(this, th2);
    }

    @jh.f
    public Throwable b() {
        return ExceptionHelper.b(this);
    }
}
