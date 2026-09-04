package io.reactivex.exceptions;

import jh.e;

/* JADX INFO: loaded from: classes4.dex */
public final class OnErrorNotImplementedException extends RuntimeException {
    private static final long serialVersionUID = -6298857009889503852L;

    public OnErrorNotImplementedException(String str, @e Throwable th2) {
        super(str, th2 == null ? new NullPointerException() : th2);
    }

    public OnErrorNotImplementedException(@e Throwable th2) {
        this("The exception was not handled due to missing onError handler in the subscribe() method call. Further reading: https://github.com/ReactiveX/RxJava/wiki/Error-Handling | " + th2, th2);
    }
}
