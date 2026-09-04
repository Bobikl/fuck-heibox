package com.huawei.hmf.tasks;

/* JADX INFO: loaded from: classes7.dex */
public interface Continuation<TResult, TContinuationResult> {
    TContinuationResult then(Task<TResult> task) throws Exception;
}
