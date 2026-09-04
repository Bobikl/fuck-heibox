package com.taobao.aranger.exception;

/* JADX INFO: loaded from: classes4.dex */
public class IPCException extends Exception {
    private final int mErrorCode;

    public IPCException(int i10, String str) {
        super(str);
        this.mErrorCode = i10;
    }

    public IPCException(int i10, Throwable th2) {
        super(th2.getMessage(), th2);
        this.mErrorCode = i10;
    }

    public int getErrorCode() {
        return this.mErrorCode;
    }
}
