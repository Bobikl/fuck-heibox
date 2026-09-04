package com.tencent.qcloud.core.http;

import com.tencent.qcloud.core.task.SelfConstraintRetryStrategy;

/* JADX INFO: loaded from: classes4.dex */
public class HttpSelConstraintRetryStrategy extends SelfConstraintRetryStrategy {
    public HttpSelConstraintRetryStrategy(int i10, int i11, int i12) {
        super(i10, i11, i12);
    }

    @Override // com.tencent.qcloud.core.task.SelfConstraintRetryStrategy
    protected boolean shouldIncreaseDelay(Exception exc) {
        return HttpUtil.isNetworkTimeoutError(exc);
    }
}
