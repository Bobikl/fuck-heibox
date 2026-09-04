package com.google.common.base;

import javax.annotation.CheckForNull;

/* JADX INFO: loaded from: classes7.dex */
@o9.b
@g
public class VerifyException extends RuntimeException {
    public VerifyException() {
    }

    public VerifyException(@CheckForNull String str) {
        super(str);
    }

    public VerifyException(@CheckForNull String str, @CheckForNull Throwable th2) {
        super(str, th2);
    }

    public VerifyException(@CheckForNull Throwable th2) {
        super(th2);
    }
}
