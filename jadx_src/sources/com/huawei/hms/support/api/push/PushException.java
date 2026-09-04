package com.huawei.hms.support.api.push;

/* JADX INFO: loaded from: classes7.dex */
public class PushException extends RuntimeException {
    public static final String EXCEPTION_SEND_FAILED = "send message failed";

    public PushException() {
    }

    public PushException(String str) {
        super(str);
    }

    public PushException(String str, Throwable th2) {
        super(str, th2);
    }

    public PushException(Throwable th2) {
        super(th2);
    }
}
