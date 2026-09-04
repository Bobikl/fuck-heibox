package com.google.common.util.concurrent;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@u
@o9.b
public class UncheckedExecutionException extends RuntimeException {
    private static final long serialVersionUID = 0;

    protected UncheckedExecutionException() {
    }

    protected UncheckedExecutionException(@CheckForNull String str) {
        super(str);
    }

    public UncheckedExecutionException(@CheckForNull String str, @CheckForNull Throwable th2) {
        super(str, th2);
    }

    public UncheckedExecutionException(@CheckForNull Throwable th2) {
        super(th2);
    }
}
