package com.bumptech.glide.load.engine;

/* JADX INFO: loaded from: classes6.dex */
public final class CallbackException extends RuntimeException {
    private static final long serialVersionUID = -7530898992688511851L;

    CallbackException(Throwable th2) {
        super("Unexpected exception thrown by non-Glide code", th2);
    }
}
