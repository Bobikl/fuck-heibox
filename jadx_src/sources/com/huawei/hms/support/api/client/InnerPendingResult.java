package com.huawei.hms.support.api.client;

import com.huawei.hms.support.api.client.Result;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes7.dex */
public abstract class InnerPendingResult<R extends Result> extends PendingResult<R> {
    public abstract R awaitOnAnyThread();

    public abstract R awaitOnAnyThread(long j10, TimeUnit timeUnit);
}
