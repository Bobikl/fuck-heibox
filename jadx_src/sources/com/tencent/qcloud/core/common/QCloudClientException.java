package com.tencent.qcloud.core.common;

/* JADX INFO: loaded from: classes4.dex */
public class QCloudClientException extends Exception {
    private static final long serialVersionUID = 1;

    public QCloudClientException(String str) {
        super(str);
    }

    public QCloudClientException(String str, Throwable th2) {
        super(str, th2);
    }

    public QCloudClientException(Throwable th2) {
        super(th2);
    }

    public boolean isRetryable() {
        return true;
    }
}
