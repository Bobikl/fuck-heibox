package com.tencent.qcloud.core.http;

import okhttp3.a0;
import okhttp3.c0;

/* JADX INFO: loaded from: classes4.dex */
public abstract class QCloudHttpRetryHandler {
    public static QCloudHttpRetryHandler DEFAULT = new QCloudHttpRetryHandler() { // from class: com.tencent.qcloud.core.http.QCloudHttpRetryHandler.1
        @Override // com.tencent.qcloud.core.http.QCloudHttpRetryHandler
        public boolean shouldRetry(a0 a0Var, c0 c0Var, Exception exc) {
            return true;
        }
    };

    public abstract boolean shouldRetry(a0 a0Var, c0 c0Var, Exception exc);
}
