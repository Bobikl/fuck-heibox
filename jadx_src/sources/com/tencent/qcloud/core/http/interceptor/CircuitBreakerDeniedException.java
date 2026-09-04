package com.tencent.qcloud.core.http.interceptor;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class CircuitBreakerDeniedException extends IOException {
    CircuitBreakerDeniedException(String str) {
        super(str);
    }
}
