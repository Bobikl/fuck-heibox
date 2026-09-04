package com.google.common.util.concurrent;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@u
@o9.c
public class UncheckedTimeoutException extends RuntimeException {
    private static final long serialVersionUID = 0;

    public UncheckedTimeoutException() {
    }

    public UncheckedTimeoutException(@CheckForNull String str) {
        super(str);
    }

    public UncheckedTimeoutException(@CheckForNull String str, @CheckForNull Throwable th2) {
        super(str, th2);
    }

    public UncheckedTimeoutException(@CheckForNull Throwable th2) {
        super(th2);
    }
}
