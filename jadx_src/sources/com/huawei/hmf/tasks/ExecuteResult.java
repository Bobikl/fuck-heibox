package com.huawei.hmf.tasks;

/* JADX INFO: loaded from: classes7.dex */
public interface ExecuteResult<TResult> {
    void cancel();

    void onComplete(Task<TResult> task);
}
