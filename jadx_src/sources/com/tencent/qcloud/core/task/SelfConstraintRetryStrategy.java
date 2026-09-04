package com.tencent.qcloud.core.task;

import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SelfConstraintRetryStrategy extends RetryStrategy {
    private AtomicLong nextDelay;

    public SelfConstraintRetryStrategy(int i10, int i11, int i12) {
        super(i10, i11, i12);
        this.nextDelay = new AtomicLong(0L);
    }

    @Override // com.tencent.qcloud.core.task.RetryStrategy
    public long getNextDelay(int i10) {
        return this.nextDelay.get();
    }

    @Override // com.tencent.qcloud.core.task.RetryStrategy
    public void onTaskEnd(boolean z10, Exception exc) {
        if (z10) {
            this.nextDelay.set(0L);
        } else if (shouldIncreaseDelay(exc)) {
            AtomicLong atomicLong = this.nextDelay;
            atomicLong.set(Math.max(Math.min(this.maxBackoff, atomicLong.get() * 2), this.initBackoff));
        }
    }

    protected abstract boolean shouldIncreaseDelay(Exception exc);
}
